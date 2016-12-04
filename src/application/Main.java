package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



// 자동으로 크기 조절
public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			/*Button btn1 = new Button("버튼 1");
			
			StackPane pane= new StackPane();
			pane.getChildren().add(btn1);
			
			btn1.prefWidthProperty().bind(pane.widthProperty());
			btn1.prefHeightProperty().bind(pane.heightProperty());*/
			
			
			Button btn1 = new Button("버튼 1"); //node 생성
			Button btn2 = new Button("버튼 2"); // node 생성
			GridPane grid = new GridPane(); // Container 생성
			grid.addRow(0, btn1, btn2); // Container에 node 넣음
			StackPane pane= new StackPane(); // Container 생성
			pane.getChildren().add(grid); // Container pane에 Container grid 넣음
			btn1.prefWidthProperty().bind(pane.widthProperty()); 
			// btn1.prefWidthProperty() --> btn1의 폭이 무엇을 참조하겠다.
			// .bind(pane.widthProperty()) --> Container pane의 폭에 따라
			
			btn1.prefHeightProperty().bind(pane.heightProperty());
			btn2.setMinHeight(100); //btn2의 최소 높이 값은 100
			btn2.setMinWidth(100);
			//btn2.setMinSize(100, 100);
			btn2.setMaxHeight(200);  // btn2의 최대 높이 값은 200
			
			Scene scene = new Scene(pane, 200, 200);
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
