
package java_2d;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Java_2D extends Application {


    public static void main(String[] args) {
        launch(args);
        
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //Sky is created with light sky blue color
        //setFill is used to fill the shape with that color.
        // setStroke is the outline color of that shape.
        Rectangle sky = new Rectangle(0.0, 0.0, 500, 200.0);
        sky.setFill(Color.LIGHTSKYBLUE);
        sky.setStroke(Color.LIGHTSKYBLUE);
        
          // A rectangle is created in the middle with Medium green color.
        Rectangle greenryBg = new Rectangle(0.0, 200.0, 500, 100.0);
        greenryBg.setFill(Color.MEDIUMSEAGREEN);
        greenryBg.setStroke(Color.MEDIUMSEAGREEN);
        
        // A rectangle is created in the bottom with forest green color.
        Rectangle greenry = new Rectangle(0.0, 250.0, 500, 500.0);
        greenry.setFill(Color.FORESTGREEN);
        greenry.setStroke(Color.FORESTGREEN);
        
        // Polygon is used to created a rectangular roof.
        Polygon roof = new Polygon();
        roof.getPoints().addAll(250.0, 5.0,  500.0, 150.0, 0.0, 150.0);
        roof.setFill(Color.SIENNA);
        roof.setStroke(Color.BLACK);
        
        //Square is created with the Rectangle constructor as house walls.
        Rectangle house = new Rectangle(50.0, 150.0, 400.0, 300.0);
        house.setFill(Color.BURLYWOOD);
        house.setStroke(Color.BLACK);

        //Circle constructor is initiated to make the sun window.
        Circle sunWindow = new Circle(250.0, 100, 40.0);
        sunWindow.setFill(Color.YELLOW);
        sunWindow.setStroke(Color.BLACK);
        
        // Rectangle constructor is used to make windows of the house.
        Rectangle window1 = new Rectangle(80.0, 220.0, 70.0, 90.0);
        window1.setFill(Color.YELLOW);
        window1.setStroke(Color.BLACK);
        
        // Line constructor is used to devive the window in four parts.
           Line VertWindLine1 = new Line(115.0, 220.0, 115.0, 310.0);
           Line HorizWindLine1 = new Line(80.0, 265.0, 150.0, 265.0);
        
        Rectangle window2 = new Rectangle(350.0, 220.0, 70.0, 90.0);
        window2.setFill(Color.YELLOW);
        window2.setStroke(Color.BLACK);
        
        Line VertWindLine2 = new Line(385.0, 220.0, 385.0, 310.0);
        Line HorizWindLine2 = new Line(350.0, 265.0, 420.0, 265.0);
        
        Rectangle door = new Rectangle(200.0, 250.0, 100.0, 200.0);
        door.setFill(Color.BURLYWOOD);
        door.setStroke(Color.BLACK);
        
        Circle doorKnob = new Circle(285.0, 360.0, 6.0);
        doorKnob.setFill(Color.BLACK);
        doorKnob.setStroke(Color.WHITE);
      
       Rectangle stair1 = new Rectangle(190.0, 450.0, 120.0, 20.0);
        stair1.setFill(Color.SEASHELL);
        stair1.setStroke(Color.BLACK);   

        Rectangle stair2 = new Rectangle(180.0, 462.0, 140.0, 25.0);
        stair1.setFill(Color.SLATEGRAY);
        stair1.setStroke(Color.BLACK);   
        
        Rectangle stair3 = new Rectangle(170.0, 472.0, 160.0, 30.0);
        stair1.setFill(Color.SEASHELL);
        stair1.setStroke(Color.BLACK);   
        
        Rectangle stair4 = new Rectangle(160.0, 482.0, 180.0, 35.0);
        stair4.setFill(Color.SEASHELL);
        stair4.setStroke(Color.BLACK);  
        
        // Group is used to initiate all the constructors at once.
        Group root = new Group(sky, greenry, greenryBg, roof, house, door, doorKnob, sunWindow, window1, 
                window2, VertWindLine1, VertWindLine2, HorizWindLine1, HorizWindLine2, stair1, stair2, stair3, stair4 );
        // Scene is used to declare the size of the stage where we print the data above.
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();

    }

} 

