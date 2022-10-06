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
		intro.setIntroTitle(this.introTitle);
		intro.setIntroBirth(this.introBirth);
		intro.setIntroTask(this.introTask);
		intro.setIntroSal(this.introSal);
		intro.setIntroWellfare(this.introWellfare);
		intro.setIntroContent(this.introContent);
		intro.setIntroLocation(this.introLocation);
		intro.setIntroImage(this.introImage);
		intro.setJobId(this.jobId);
		return intro;
	}
}
