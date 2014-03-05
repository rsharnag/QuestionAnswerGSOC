/**
 * 
 */
package com.google_melange.Dataset;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rahul Sharnagat
 *
 */
@XmlRootElement(name="dataset")
public class Dataset {

	
	List<Question> questions = new ArrayList<Question>();
	@XmlAttribute
	String id;
	@Override
	public String toString() {
		String out = "";
		if(questions==null||questions.size()==0) {
			return "No data loaded";
		}else {
			for (Question q : questions) {
				out+=q.toString();
				out+="\n\n";
			}
		}
		
		return out;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	@XmlElement(name = "question")
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
}
