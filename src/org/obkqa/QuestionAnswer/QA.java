package org.obkqa.QuestionAnswer;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.obkqa.Dataset.Dataset;

public class QA {
	public static void main(String[] args) throws Exception {
		File file = new File("/home/cfilt/GSOC/dataset/qald-4_multilingual_train.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Dataset.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Dataset customer = (Dataset) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
	}
}
