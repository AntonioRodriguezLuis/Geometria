package dad.javafx.geometria.circulo;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;


public class CirculoModel {

	private FloatProperty  radio = new SimpleFloatProperty();

	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimetro = new ReadOnlyFloatWrapper();

	public CirculoModel() {

		area.bind(radio.multiply(Math.PI).multiply(radioProperty())); // PI * r^2
		perimetro.bind(radio.multiply(Math.PI * 2)); // 2*PI*r
	}

	public final FloatProperty radioProperty() {
		return this.radio;
	}

	public final javafx.beans.property.ReadOnlyFloatProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final float getArea() {
		return this.areaProperty().get();
	}

	public final javafx.beans.property.ReadOnlyFloatProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final float getPerimetro() {
		return this.perimetroProperty().get();
	}

}
