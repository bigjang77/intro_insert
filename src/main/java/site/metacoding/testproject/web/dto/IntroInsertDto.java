package site.metacoding.testproject.web.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.testproject.domain.intro.Intro;

@Setter
@Getter
public class IntroInsertDto {

	private String introTitle;
	private String introBirth;
	private String introTask;
	private String introSal;
	private String introWellfare;
	private String introContent;
	private String introLocation;
	private String introImage;
	private Integer jobId;

	public Intro toEntity() {
		Intro intro = new Intro();
		intro.setIntroTitle(introTitle);
		intro.setIntroBirth(introBirth);
		intro.setIntroTask(introTask);
		intro.setIntroSal(introSal);
		intro.setIntroWellfare(introWellfare);
		intro.setIntroContent(introContent);
		intro.setIntroLocation(introLocation);
		intro.setIntroImage(introImage);
		intro.setJobId(jobId);
		return intro;
	}
}
