package dad.javafx.geometria.circulo;

import javafx.util.converter.NumberStringConverter;

public class CirculoController {
	private CirculoModel model = new CirculoModel();
	private CirculoView view = new CirculoView();
	
	public CirculoController() {
		
		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString()); 	
		
	}
	
	public CirculoView getRoot() {
		return view;
	}
}
