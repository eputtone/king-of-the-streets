package fi.fullerine.kingofthestreets.domain.commutereval;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

import fi.fullerine.kingofthestreets.web.AppContext;

public enum SideOfStreetEnum {

	SIDE_RIGHT("SIDE_RIGHT"), SIDE_LEFT("SIDE_LEFT"), SIDE_NO_MATTER(
			"SIDE_NO_MATTER");

	private String label;

	SideOfStreetEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		Locale locale = LocaleContextHolder.getLocale();
		return AppContext.getApplicationContext().getMessage(label, null,
				locale);
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
					+ ". Väärin!! Valittu tien reuna on viestitettävä kanssasiirtyjille selkeästi.";
		case 1:
			return "Pisteet: " + getGradeNumber()
					+ ". Sentäs kuljet tien reunassa etkä missä sattuu.";
		default:
			return "Pisteet: "
					+ getGradeNumber()
					+ ". Oikein. Sinulla on sentäs joku peruste hallussa.";
		}

	}

	public int getGradeNumber() {
		if (SIDE_NO_MATTER.equals(valueOf(label))) {
			return 0;
		} else if (SIDE_LEFT.equals(valueOf(label))) {
			return 1;
		} else {
			return 2;
		}
	}

}
