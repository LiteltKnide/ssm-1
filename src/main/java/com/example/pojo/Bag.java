package com.example.pojo;

import java.util.List;

public class Bag {
    private Integer id;

    private String bagName;

    private String bagSeq;

    private Integer surveyId;

    private List<Questions> questions;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName == null ? null : bagName.trim();
    }

    public String getBagSeq() {
        return bagSeq;
    }

    public void setBagSeq(String bagSeq) {
        this.bagSeq = bagSeq == null ? null : bagSeq.trim();
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Bag [id=" + id + ", bagName=" + bagName + ", bagSeq=" + bagSeq
				+ ", surveyId=" + surveyId + "]";
	}
    
}