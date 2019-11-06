package dad.javafx.geometria.hexagono;

import javafx.util.converter.NumberStringConverter;

public class HexagonoController {
	
	private HexagonoModel model = new HexagonoModel();
	private HexagonoView view = new HexagonoView();
	
	public HexagonoController() {

		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
	}
	
	public HexagonoView getRoot() {
		return view;
	}
}
