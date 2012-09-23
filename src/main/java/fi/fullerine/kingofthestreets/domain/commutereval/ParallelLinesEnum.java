package fi.fullerine.kingofthestreets.domain.commutereval;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

import fi.fullerine.kingofthestreets.web.AppContext;


public enum ParallelLinesEnum {

    TWO("TWO"), THREE("THREE"), FOUR_OR_MORE("FOUR_OR_MORE");

    private String label;

   ParallelLinesEnum(String label) {
    	this.label = label;
    }

   public String getLabel() { 
   	Locale locale = LocaleContextHolder.getLocale();
   	return AppContext.getApplicationContext().getMessage(label, null, locale);
   }

   public String toString() {
   	return getLabel();
   }    

	public String getGrading() {
		int grade = getGradeNumber();
		switch (grade) {
		case 0:
			return "Pisteet: "
					+ getGradeNumber()
					+ ". Väärin. Siirtymäväylällä on hyvin tilaa useammalle kuin kahdelle rinnakkaiselle siirtyjälle.";
		case 1:
			return "Pisteet: " + getGradeNumber()
					+ ". Aiheutat vaaratilanteita sipaisutaktiikallasi.";
		default:
			return "Pisteet: "
					+ getGradeNumber()
					+ ". Oikein. Yksi ohittaja mahtuu hyvin pujahtamaan kahden siirtyjän välistä.";
		}

	}

	public int getGradeNumber() {
		if (TWO.equals(valueOf(label))) {
			return 0;
		} else if (FOUR_OR_MORE.equals(valueOf(label))) {
			return 1;
		} else {
			return 2;
		}
	}   
   
    
}
