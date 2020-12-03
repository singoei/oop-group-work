import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rentals extends Application {
    @Override
    public void start(Stage stage) {

        //step 1: create label Customer
        Text text1 = new Text("Customer");
        ComboBox comboBox1 = new ComboBox();
        
        //Populate combobox2 options
        comboBox1.getItems().addAll(
            "Customer 1",
            "Customer 2",
            "Customer 3"  
        );
   
        //step 2: create label Genre
        Text text2 = new Text("Genre:");
        ComboBox comboBox2 = new ComboBox();
        //Populate combobox2 options
        comboBox2.getItems().addAll(
            "Action",
            "Comedy",
            "Animation"   
        );
        
        //step 3: create label movies
        Text text3 = new Text("Movies:");
        ComboBox comboBox3 = new ComboBox();
        //Populate combobox2 options
        comboBox3.getItems().addAll(
            "Movie 1",
            "Movie 2",
            "Movie 3"  
        );
        
       //step 4: create label borrowed
        Text text4 = new Text("Borrowed:");
        ComboBox comboBox4 = new ComboBox();
        comboBox4.getItems().addAll(
            "Movie 1",
            "Movie 2",
            "Movie 3"  
        );
        
        //step 5: create label Returned
        Text text5 = new Text("Returned:");
        ComboBox comboBox5 = new ComboBox();
        comboBox5.getItems().addAll(
            "Movie 1",
            "Movie 2",
            "Movie 3"  
        );
       
        //step 6: create buttons
        Button button1 = new Button("Save Rental");
        Button button2 = new Button("Return Movie");

        //step 7: creating a grid pane and import relevant classes
        GridPane gridPane = new GridPane();

        //step 8: set up size for the pane
        gridPane.setMinSize(600, 400);

        //step 9: Set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //step 10: Set the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //step 11: Set Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //step 12: Arrange all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(comboBox1, 1, 0);
        
        gridPane.add(text2, 0, 1);
        gridPane.add(comboBox2, 1, 1);

        gridPane.add(text3, 0, 2);
        gridPane.add(comboBox3, 1, 2);

        gridPane.add(button1, 1, 3);
        
        gridPane.add(text4, 0, 4);
        gridPane.add(comboBox4, 1, 4);
        
        gridPane.add(button2, 1, 5);
        
        gridPane.add(text5, 0, 6);
        gridPane.add(comboBox5, 1, 6);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        text5.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: Beige;");
        
        //setting the dimensions of the comboBox
        comboBox1.setMinSize(150,20);
        comboBox2.setMinSize(150,20);
        comboBox3.setMinSize(150,20);
        comboBox4.setMinSize(150,20);
        comboBox5.setMinSize(150,20);
        button1.setMinSize(150,20);
        button2.setMinSize(150,20);
        
        //creating a scene object
        Scene scene = new Scene(gridPane);
        
        //setting title for the stage
        stage.setTitle("RENTALS");
        
        //adding scene to the stage
        stage.setScene(scene);
       
        //displaying he contents of the stage
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}





