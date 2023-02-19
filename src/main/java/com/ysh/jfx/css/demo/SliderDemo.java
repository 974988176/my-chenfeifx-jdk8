package com.ysh.jfx.css.demo;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.Random;

/**
 * @author ChenFei
 * @date 2022年6月9日
 * <p>
 * 原生Slider样式美化案例
 */
public class SliderDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();
    private HBox hBox3 = new HBox();
    private Label label = new Label();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox2.setAlignment(Pos.CENTER);
        hBox3.getChildren().add(label);
        label.setFont(new Font(20));
        hBox3.setAlignment(Pos.CENTER);
    }

    public SliderDemo() {
        addContent();
    }

    private void addContent() {
        String[] styleClass = {"cf-slider", "cf-primary-slider", "cf-success-slider", "cf-info-slider", "cf-warn-slider", "cf-danger-slider"};
        int length = styleClass.length;
        //横向滑动器
        for (int i = 0; i < length; i++) {
            Slider slider = new Slider(0, 100, new Random().nextInt(100));
            slider.getStyleClass().add(styleClass[i]);
            setSliderValueChange(slider);//监听变化
            hBox1.getChildren().add(slider);
        }
        //纵向滑动器
        for (int i = 0; i < length; i++) {
            Slider slider = new Slider(0, 100, new Random().nextInt(100));
            slider.getStyleClass().add(styleClass[i]);
            slider.setOrientation(Orientation.VERTICAL);
            setSliderValueChange(slider);//监听变化
            hBox2.getChildren().add(slider);
        }
    }

    /**
     * 监听滑块值变化
     *
     * @param slider
     */
    private void setSliderValueChange(Slider slider) {
        slider.valueProperty()
                .addListener((observable, oldValue, newValue) -> label.setText(newValue.toString()));
    }

}
