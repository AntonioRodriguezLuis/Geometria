package dad.javafx.geometria.hexagono;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class HexagonoModel {

	private FloatProperty radio = new SimpleFloatProperty();

	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimetro = new ReadOnlyFloatWrapper();
	
	private Double apotema = 2 * (Math.tan(Math.toRadians(30)));

	public HexagonoModel() {
		area.bind((this.radio.multiply(this.radio).multiply(3)).divide(apotema));
		perimetro.bind(radio.multiply(6));
	}

	public final FloatProperty radioProperty() {
		return this.radio;
	}

	public final float getRadio() {
		return this.radioProperty().get();
	}

	public final void setRadio(final float radio) {
		this.radioProperty().set(radio);
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
