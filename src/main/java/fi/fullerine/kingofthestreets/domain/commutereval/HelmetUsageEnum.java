package fi.fullerine.kingofthestreets.domain.commutereval;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

import fi.fullerine.kingofthestreets.web.AppContext;


public enum HelmetUsageEnum {

    USAGE_YES("USAGE_YES"), USAGE_NO("USAGE_NO"), USAGE_BY_FEELING("USAGE_BY_FEELING");
    
    private String label;
    
    HelmetUsageEnum(String label) {
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
			return "Pisteet: " + getGradeNumber()
					+ ". Väärin. Olet todennäköisesti patterin ja seinän välissä elävä jännittäjä-tyyppi.";
		case 1:
			return "Pisteet: " + getGradeNumber()
					+ ". Aivan, kypärä sotkee jakauksen.";
		default:
			return "Pisteet: " + getGradeNumber() + ". Oikea vastaus! Voittajat valitsevat itse oman tiensä.";
		}

	}

	public int getGradeNumber() {
		if (USAGE_YES.equals(valueOf(label))) {
			return 0;
		} else if (USAGE_BY_FEELING.equals(valueOf(label))) {
			return 2;
		} else {
			return 1;
		}
    		
    }
    
    
}
