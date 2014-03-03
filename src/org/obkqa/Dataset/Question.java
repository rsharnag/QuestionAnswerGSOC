/**
 * 
 */
package org.obkqa.Dataset;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author swapnil
 *
 */

public class Question {
	
	@XmlElement(name="string")
	List<QuestionInstance> questionList = new ArrayList<QuestionInstance>();
	@XmlElement(name="keywords")
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

	@Override
	public String toString() {
		String out= "";
		
		if(questionList==null || questionList.size()==0) {
			out="no elements loaded";
		}else {
			for (QuestionInstance q : questionList) {
				out+=" "+q.lang+"-"+q.val;
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
