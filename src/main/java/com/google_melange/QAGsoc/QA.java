package com.google_melange.QAGsoc;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.google_melange.Dataset.Dataset;
import com.google_melange.Dataset.Question;
import com.google_melange.Dataset.QuestionInstance;

public class QA {
	public static void main(String[] args) throws Exception {
		File file = new File("/home/cfilt/GSOC/dataset/qald-4_multilingual_train.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Dataset.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Dataset questionset = (Dataset) jaxbUnmarshaller.unmarshal(file);
		for(Question ques: questionset.getQuestions()){
			for(QuestionInstance q:ques.getQuestionList()){
				if(q.lang.equals("en")){
					System.out.println(q.question);
				}
			}
		}
	}
}
