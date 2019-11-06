package dad.javafx.geometria;


import dad.javafx.geometria.shapes.Hexagono;
import dad.javafx.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FigurasApp extends Application {

	private Rectangle rectangleShape ;
	private Circle circleShape;
	private Triangle triangleShapes;
	private Hexagono hexagonoShapes;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		rectangleShape = new Rectangle();
		rectangleShape.setWidth(80);
		rectangleShape.setHeight(60);
		rectangleShape.setFill(Color.BLUE);
		rectangleShape.setStrokeWidth(2);
		rectangleShape.setStroke(Color.BLACK);

		circleShape = new Circle();
		circleShape.setRadius(40);
		circleShape.setFill(Color.RED);
		circleShape.setStrokeWidth(2);
		circleShape.setStroke(Color.BLACK);

		triangleShapes = new Triangle(80, 60);
		triangleShapes.setBase(80);
		triangleShapes.setAltura(60);
		triangleShapes.setFill(Color.GREEN);
		triangleShapes.setStrokeWidth(2);
		triangleShapes.setStroke(Color.BLACK);
		
		hexagonoShapes = new Hexagono();
		hexagonoShapes.setRadius(40);
		hexagonoShapes.setFill(Color.PURPLE);
		hexagonoShapes.setStrokeWidth(2);
		hexagonoShapes.setStroke(Color.BLACK);

		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.setAlignment(Pos.CENTER);
		root.add(rectangleShape, 0, 0);
		root.add(circleShape, 1, 0);
		root.add(triangleShapes, 0, 1);
		root.add(hexagonoShapes, 1, 1);
		Scene scene = new Scene(root,320,200);

		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
