package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.application.Application;

public class MyColorPicker extends Aplication{
    ColorPicker colorPicker = new ColorPicker();

    public void colorPicker(){
        colorPicker.valueProperty().addListener(new ChangeListener<Color>() {
            @Override public void changed(ObservableValue<? extends Color> observable, Color oldValue, Color newValue) {
                colorPicker.setValue(newValue);
            }
        });
    }

    public ColorPicker getColorPicker(){
        return colorPicker;
    }
    @Override
    public void start(Stage primaryStage) {
    }
}
