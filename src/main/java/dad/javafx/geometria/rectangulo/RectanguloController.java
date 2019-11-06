package dad.javafx.geometria.rectangulo;


import javafx.util.converter.NumberStringConverter;

public class RectanguloController {
	
	private RectanguloModel model  = new RectanguloModel();
	private RectanguloView view = new RectanguloView();

	public RectanguloController() {
	
		view.getAnchoText().textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		view.getAltoText().textProperty().bindBidirectional(model.altoProperty(), new NumberStringConverter());
		
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
	}
	
	public RectanguloView getRoot() {
		return view;
	}
}
