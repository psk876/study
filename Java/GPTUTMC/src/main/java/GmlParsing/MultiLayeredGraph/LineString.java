package GmlParsing.MultiLayeredGraph;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import GmlParsing.Pos;

public class LineString {
	private String id;
	private List<Pos> pos;

	public String getId() {
		return id;
	}

	@XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2")
	public void setId(String id) {
		this.id = id;
	}

	public List<Pos> getPos() {
		return pos;
	}

	@XmlElement(name = "pos", namespace = "http://www.opengis.net/gml/3.2")
	public void setPos(List<Pos> pos) {
		this.pos = pos;
	}

}
