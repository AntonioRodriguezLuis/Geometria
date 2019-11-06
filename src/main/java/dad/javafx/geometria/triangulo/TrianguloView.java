package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class TrianguloView extends VBox{
	private Triangle triangulo;
	private Label areaLabel, perimetroLabel;
	private Label area, perimetro;
	private Label baseLabel, alturaLabel;
	private TextField baseText, alturaText;
	
	public TrianguloView() {
		super();
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perimetro:");
		
		area = new Label();
		perimetro = new Label();
		
		triangulo = new Triangle(90,60);
		triangulo.setFill(Color.RED);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);
		
		baseLabel = new Label("Base:");
		
		baseText = new TextField();
		baseText.setPromptText("Base");
		baseText.setPrefColumnCount(5);
		
		alturaLabel = new Label("Altura:");
		alturaText = new TextField();
		alturaText.setPromptText("Altura");
		alturaText.setPrefColumnCount(5);
		
		
		HBox baseHbox = new HBox(5, baseLabel, baseText);
		baseHbox.setAlignment(Pos.CENTER);
		HBox alturaHbox = new HBox(5, alturaLabel, alturaText);
		alturaHbox.setAlignment(Pos.CENTER);
		
		HBox areaHbox = new HBox(5,areaLabel, area);
		areaHbox.setAlignment(Pos.CENTER);
		HBox perimetroHbox = new HBox(5, perimetroLabel, perimetro);
		perimetroHbox.setAlignment(Pos.CENTER);

		this.getChildren().addAll(baseHbox,alturaHbox, triangulo, areaHbox, perimetroHbox);
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
	
	}

	public Triangle getTriangulo() {
		return triangulo;
	}

	public Label getArea() {
		return area;
	}

	public Label getPerimetro() {
		return perimetro;
	}

	public TextField getBaseText() {
		return baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

}
