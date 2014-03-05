/**
 * 
 */
package com.google_melange.Dataset;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Rahul Sharnagat
 *
 */

public class Question {
	
	
	List<QuestionInstance> questionList = new ArrayList<QuestionInstance>();
	
	List<KeyWords> keywords = new ArrayList<KeyWords>();
	
	private int id;
	
	private boolean onlydbo;
	
	String answerType;
	
	boolean aggregation;
	
	@XmlElement
	String query;
	public String getId() {
		return id+"";
	}
	@XmlAttribute
	public void setId(String id) {
		this.id = Integer.parseInt(id.trim());
	}

	public String isOnlydbo() {
		return onlydbo+"";
	}
	
	@XmlAttribute
	public void setOnlydbo(String onlydbo) {
		this.onlydbo = Boolean.parseBoolean(onlydbo.trim());
	}
	public String getAnswerType() {
		return answerType+"";
	}
	@XmlAttribute(name="answertype")
	public void setAnswerType(String answerType) {
		this.answerType = answerType.trim();
	}

	public String getAggregation() {
		return aggregation+"";
	}
	@XmlAttribute
	public void setAggregation(String aggregation) {
		this.aggregation = Boolean.parseBoolean(aggregation.trim());
	}
	
	public List<QuestionInstance> getQuestionList() {
		return questionList;
	}
	@XmlElement(name="string")
	public void setQuestionList(List<QuestionInstance> questionList) {
		this.questionList = questionList;
	}
	public List<KeyWords> getKeywords() {
		return keywords;
	}
	@XmlElement(name="keywords")
	public void setKeywords(List<KeyWords> keywords) {
		this.keywords = keywords;
	}
	@Override
	public String toString() {
		String out= "";
		
		if(questionList==null || questionList.size()==0) {
			out="no elements loaded";
		}else {
			for (QuestionInstance q : questionList) {
				out+=" "+q.lang+"-"+q.question;
			}
		}
		out+="\n";
		if(keywords==null || keywords.size()==0) {
			out="no elements loaded";
		}else {
			for (KeyWords q : keywords) {
				out+=" "+q.lang+"-"+q.keyword;
			}
		}
		out+="\n";
		out+=id+"-"+onlydbo+"-"+answerType+"-"+aggregation+"\n";
		out+="\n";
		out+=query;
		return out;
	}
	
}
