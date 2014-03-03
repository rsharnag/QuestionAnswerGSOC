/**
 * 
 */
package org.obkqa.Dataset;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rahul Sharnagat
 *
 */
@XmlRootElement(name="dataset")
public class Dataset {

	@XmlElement(name = "question")
	List<Question> questions = new ArrayList<Question>();

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
	
	
}
