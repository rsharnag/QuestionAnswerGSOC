package org.obkqa.Dataset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class QuestionInstance {
	@XmlAttribute(name="lang")
	public String lang;
	
	@XmlValue
	public String val;
}
