package dad.javafx.geometria.circulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends VBox {
	
	private Circle circulo;
	private Label areaLabel, perimetroLabel;
	private Label area, perimetro;
	private Label radioLabel;
	private TextField radioText;
	
	public CirculoView() {
		super();
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perimetro:");
		
		area = new Label();
		perimetro = new Label();
		
		circulo = new Circle();
		circulo.setRadius(80);
		circulo.setFill(Color.YELLOW);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);
		
		radioLabel = new Label("Radio:");
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		radioText.setPrefColumnCount(5);
		
		HBox radioHbox = new HBox(5, radioLabel, radioText);
		radioHbox.setAlignment(Pos.CENTER);
		
		HBox areaHbox = new HBox(5,areaLabel, area);
		areaHbox.setAlignment(Pos.CENTER);
		HBox perimetroHbox = new HBox(5, perimetroLabel, perimetro);
		perimetroHbox.setAlignment(Pos.CENTER);

		this.getChildren().addAll(radioHbox, circulo, areaHbox, perimetroHbox);
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
	}
	public Circle getCirculo() {
		return circulo;
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
