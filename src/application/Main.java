package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



// �ڵ����� ũ�� ����
public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			/*Button btn1 = new Button("��ư 1");
			
			StackPane pane= new StackPane();
			pane.getChildren().add(btn1);
			
			btn1.prefWidthProperty().bind(pane.widthProperty());
			btn1.prefHeightProperty().bind(pane.heightProperty());*/
			
			
			Button btn1 = new Button("��ư 1"); //node ����
			Button btn2 = new Button("��ư 2"); // node ����
			GridPane grid = new GridPane(); // Container ����
			grid.addRow(0, btn1, btn2); // Container�� node ����
			StackPane pane= new StackPane(); // Container ����
			pane.getChildren().add(grid); // Container pane�� Container grid ����
			btn1.prefWidthProperty().bind(pane.widthProperty()); 
			// btn1.prefWidthProperty() --> btn1�� ���� ������ �����ϰڴ�.
			// .bind(pane.widthProperty()) --> Container pane�� ���� ����
			
			btn1.prefHeightProperty().bind(pane.heightProperty());
			btn2.setMinHeight(100); //btn2�� �ּ� ���� ���� 100
			btn2.setMinWidth(100);
			//btn2.setMinSize(100, 100);
			btn2.setMaxHeight(200);  // btn2�� �ִ� ���� ���� 200
			
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
