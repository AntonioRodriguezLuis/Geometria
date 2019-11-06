package dad.javafx.geometria;

import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp extends Application {
	
	private RectanguloController rectanguloController;
	private CirculoController circuloController;
	private TrianguloController trianguloController;
	private HexagonoController hexagonoController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rectanguloController = new RectanguloController();
		circuloController = new CirculoController();
		trianguloController = new TrianguloController();
		hexagonoController = new HexagonoController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		Tab tabA = new Tab("Rectangulo");
		tabA.setContent(rectanguloController.getRoot());
		
		Tab tabB = new Tab("Circulo");
		tabB.setContent(circuloController.getRoot());
		
		Tab tabC = new Tab("Triángulo");
		tabC.setContent(trianguloController.getRoot());
		
		Tab tabD = new Tab("Hexágono");
		tabD.setContent(hexagonoController.getRoot());
		
		root.getTabs().addAll(tabA,tabB,tabC,tabD);
	
		Scene scene = new Scene(root, 500, 400);

		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
