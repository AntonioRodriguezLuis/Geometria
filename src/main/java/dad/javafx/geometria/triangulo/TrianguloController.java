package dad.javafx.geometria.triangulo;

import javafx.util.converter.NumberStringConverter;

public class TrianguloController {
	private TrianguloModel model = new TrianguloModel();
	private TrianguloView view = new TrianguloView();
	
	public TrianguloController() {
		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
	}
	
	public TrianguloView getRoot() {
		return view;
	}
}
