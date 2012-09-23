package fi.fullerine.kingofthestreets.domain.commutereval;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

import fi.fullerine.kingofthestreets.web.AppContext;


public enum GenderEnum {

    MALE("MALE"), FEMALE("FEMALE");
    
    private String label;
    
    GenderEnum(String label) {
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
        	return "Pisteet: " + getGradeNumber() + ". Naisten siirtymätaidot ovat keskimäärin puutteelliset.";    		
    	default:
        	return "Pisteet: " + getGradeNumber() + ". Miehillä parempi spatiaalinen hahmotuskyky.";    		
    	}    	
    }
    
    public int getGradeNumber() {
    	if (MALE.equals(valueOf(label))) {
    		return 1;
    	} else {
    		return 0;
    	}
    		
    }
    
}
