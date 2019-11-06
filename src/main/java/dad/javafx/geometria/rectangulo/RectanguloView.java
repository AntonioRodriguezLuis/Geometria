package dad.javafx.geometria.rectangulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends VBox{
	
	private Label area, perimetro;
	private Label anchoLabel, altoLabel;
	private Label areaLabel, perimetroLabel;
	private TextField anchoText, altoText;
	private Rectangle rectangulo;
	
	public RectanguloView() {
		super();
		
		anchoLabel = new Label("Ancho:");
		altoLabel = new Label("Alto:");
		
		anchoText = new TextField();
		anchoText.setPromptText("Ancho");
		anchoText.setPrefColumnCount(5);
		altoText = new TextField();
		altoText.setPromptText("Alto");
		altoText.setPrefColumnCount(5);
		
		rectangulo = new Rectangle();
		rectangulo.setWidth(90);
		rectangulo.setHeight(50);
		rectangulo.setFill(Color.GREEN);
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perimetro:");
		
		area = new Label();
		perimetro = new Label();
		
		
		HBox anchoHbox = new HBox(5, anchoLabel, anchoText);
		anchoHbox.setAlignment(Pos.CENTER);
		HBox altoHbox = new HBox(5, altoLabel, altoText);
		altoHbox.setAlignment(Pos.CENTER);
		
		HBox areaHbox = new HBox(5,areaLabel, area);
		areaHbox.setAlignment(Pos.CENTER);
		HBox perimetroHbox = new HBox(5, perimetroLabel, perimetro);
		perimetroHbox.setAlignment(Pos.CENTER);

		this.getChildren().addAll(anchoHbox, altoHbox, rectangulo, areaHbox, perimetroHbox);
		this.setAlignment(Pos.CENTER);
		this.setSpacing(5);
	}

	public Label getArea() {
		return area;
	}

	public Label getPerimetro() {
		return perimetro;
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Rectangle getRectangleShape() {
		return rectangulo;
	}

	
}
