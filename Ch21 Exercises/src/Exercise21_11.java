/*  Eloi Nshuti
 *  12/15/2022
 *  Programming Exercise 21-11
 */

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise21_11 extends Application {
  private Map<String, Integer>[] mapForBoy = new HashMap[10];
  
  private Map<String, Integer>[] mapForGirl = new HashMap[10];
  
  private Button btFindRanking = new Button("Find Ranking");
  private ComboBox<Integer> cboYear = new ComboBox<>();
  private ComboBox<String> cboGender = new ComboBox<>();
  private TextField tfName = new TextField();
  private Label lblResult = new Label();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    GridPane gridPane = new GridPane();
    BorderPane borderPane = new BorderPane();
    gridPane.add(new Label("Select a year:"), 0, 0);
    gridPane.add(new Label("Boy or girl?"), 0, 1);
    gridPane.add(new Label("Enter a name:"), 0, 2);
    gridPane.add(cboYear, 1, 0);
    gridPane.add(cboGender, 1, 1);
    gridPane.add(tfName, 1, 2);
    gridPane.add(btFindRanking, 1, 3);
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    borderPane.setCenter(gridPane);
    
    cboYear.setValue(2001);
        
    cboGender.getItems().addAll("Male", "Female");
    cboGender.setValue("Male");

    
    int i = 0;
    for (int year = 2001; year <= 2010; year++) {
      cboYear.getItems().add(year);
      
      Map<String, Integer> boyNames = new HashMap<>();
      Map<String, Integer> girlNames = new HashMap<>();
      try {
    	  java.net.URL url = new java.net.URL(
        		  "http://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");
  
    	  Scanner input = new Scanner(url.openStream());
    	  while (input.hasNext()) {
    		  Integer rank = input.nextInt();
    		  boyNames.put(input.next(), rank);
    		  input.next();
    		  girlNames.put(input.next(), rank);
    		  input.next();
           } 
         }

         catch (java.net.MalformedURLException ex) {
           System.out.println("Invalid URL");
         }
         catch (java.io.IOException ex) {
           System.out.println("I/O Errors: no such file");
         }
      mapForBoy[i] = boyNames;
      mapForGirl[i] = girlNames;
      i++;
    }
  
    btFindRanking.setOnAction(e -> {
    	
    	if(cboGender.getValue() == "Male") {
    		Map<String, Integer> linkedHashMap = mapForBoy[cboYear.getValue()-2001];
    		lblResult = new Label("Boy name " + tfName.getText() + " is ranked #" + linkedHashMap.get(tfName.getText()) + " in year " + cboYear.getValue());
    		
    	}
    	else if(cboGender.getValue() == "Female") {
    		Map<String, Integer> linkedHashMap = mapForGirl[cboYear.getValue()-2001];
    		lblResult = new Label("Girl name " + tfName.getText() + " is ranked #" + linkedHashMap.get(tfName.getText()) + " in year " + cboYear.getValue()); 
    	}
    	BorderPane.setAlignment(lblResult, Pos.CENTER);
    	borderPane.setBottom(lblResult);	
  });    

      // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 370, 160);
    primaryStage.setTitle("Exercise21_11"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
    
  }
  
}