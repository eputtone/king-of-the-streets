package fi.fullerine.kingofthestreets.domain.commutereval;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "EVALUATION_SEQ")
public class Evaluation {

    @Size(min = 1, max = 30)
    private String userName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MovingSpeedEnum movingSpeed;

    @NotNull
    @Enumerated(EnumType.STRING)
    private HelmetUsageEnum helmetUsage;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ParallelLinesEnum parallelLines;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SideOfStreetEnum sideOfStreet; 
    
    public int getTotalGrade() {
    	int result = 0;
    	result += gender.getGradeNumber();
    	result += movingSpeed.getGradeNumber();
    	result += helmetUsage.getGradeNumber();
    	result += parallelLines.getGradeNumber();
    	result += sideOfStreet.getGradeNumber();
    	return result;
    }
    
    public String getFinalResult() {
    	int grade = getTotalGrade();
    	switch(grade) {
    	case 0:
    	case 1:
    	case 2:
    		return "Olet aloitteleva amatöörisiirtyjä. Kaikkien osapuolten näkökulmasta olisi parempi, jos välttäisit kevyen liikenteen väyliä.";    		
    	case 3:
    	case 4:
    		return "Olet amatöörisiirtyjä. Yritä välttää kevyen liikenteen väyliä ruuhka-aikana.";    		
    	case 5:
    	case 6:
    	case 7:
    		return "Olet tavissiirtyjä. Et ole täysin toivoton tapaus, mutta älä kuvittele itsestäsi liikoja.";    		    		
    	default:
    		return "Olet ammattilaissiirtyjä! Onneksi olkoon! Kuulut siirtyjien valioluokkaan.";    		    		    		
    	}
    }
    
}
