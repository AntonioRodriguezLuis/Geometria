package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shapes.Hexagono;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HexagonoView extends VBox {
	private Hexagono hexagono;
	private Label areaLabel, perimetroLabel;
	private Label area, perimetro;
	private Label radioLabel;
	private TextField radioText;

	public HexagonoView() {
		super();

		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perimetro:");

		area = new Label();
		perimetro = new Label();

		hexagono = new Hexagono(40);
		hexagono.setFill(Color.AQUA);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);

		radioLabel = new Label("Radio:");
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		radioText.setPrefColumnCount(5); 

		HBox radioHbox = new HBox(5, radioLabel, radioText);
		radioHbox.setAlignment(Pos.CENTER);

		HBox areaHbox = new HBox(5, areaLabel, area);
		areaHbox.setAlignment(Pos.CENTER);
		HBox perimetroHbox = new HBox(5, perimetroLabel, perimetro);
		perimetroHbox.setAlignment(Pos.CENTER);

		this.getChildren().addAll(radioHbox, hexagono, areaHbox, perimetroHbox);
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
	}

	public Hexagono getHexagono() {
		return hexagono;
	}

	public Label getArea() {
		return area;
	}

	public Label getPerimetro() {
		return perimetro;
	}

	public TextField getRadioText() {
		return radioText;
	}

}
