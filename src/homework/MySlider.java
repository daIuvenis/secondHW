package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class MySlider {
    Slider slider = new Slider(1.0, 10.0, 5.0);
    Label lbl = new Label("Size");
    Button btn = new Button("Choose");

    public Slider slider(){
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.valueProperty().addListener(new ChangeListener<Number>(){
            public void changed(ObservableValue<? extends Number> changed, Number oldValue, Number newValue){
                lbl.setText("Slider Value: " + newValue);
            }
        });

        btn.setOnAction(event -> lbl.setText("Slider Size: " + slider.getValue()));
        return slider;
    }
    @Override
    public void start(Stage stage) {
    }

    public Label getLabel(){
        return lbl;
    }

    public Button getButton(){
        return btn;
    }
}
