package fi.fullerine.kingofthestreets.domain.commutereval;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

import fi.fullerine.kingofthestreets.web.AppContext;


public enum MovingSpeedEnum {

    SLOW("SLOW"), NORMAL("NORMAL"), FAST("FAST");

    private String label;    
    
    MovingSpeedEnum(String label) {
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
			return "Pisteet: " + getGradeNumber() + ". Olet tien tukko.";
		case 1:
			return "Pisteet: " + getGradeNumber()
					+ ". Jaksaisit varmasti sotkea nopeamminkin.";
		default:
			return "Pisteet: " + getGradeNumber() + ". Kiitettävää ripeyttä!";
		}

	}

	public int getGradeNumber() {
		if (SLOW.equals(valueOf(label))) {
			return 0;
		} else if (NORMAL.equals(valueOf(label))) {
			return 1;
		} else {
			return 2;
		}
	}

}
