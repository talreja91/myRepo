package com.intbit;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "quiz")
public class Quiz implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String answer;
	
	public Quiz()
	{
		
	}
	public Quiz(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5)
	{
		question = arg0;
		option1 = arg1;
		option2 = arg2;
		option3 = arg3;
		option4 = arg4;
		answer = arg5;
	}
	public String getQuestion() {
		return question;
	}
	
	@XmlElement
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	
	@XmlElement
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	
	@XmlElement
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	
	@XmlElement
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	
	@XmlElement
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getAnswer() {
		return answer;
	}
	
	@XmlElement
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
