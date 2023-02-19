package com.ysh.jfx.css.demo;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月10日
 * <p>
 * 原生RadioButton样式美化案例
 */
public class RadioButtonDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1, hBox2);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
    }

    public RadioButtonDemo() {
        addContent();
    }

    private void addContent() {
        //单选框
        ToggleGroup group = new ToggleGroup();
        for (int i = 0; i < 5; i++) {
            RadioButton radioButton = new RadioButton("单选框");
            radioButton.getStyleClass().add("cf-radio-button");
            radioButton.setToggleGroup(group);
            hBox1.getChildren().add(radioButton);
        }

        //带边框
        ToggleGroup groupb = new ToggleGroup();
        for (int i = 0; i < 5; i++) {
            RadioButton radioButton = new RadioButton("单选框");
            radioButton.getStyleClass().add("cf-radio-button-b");
            radioButton.setToggleGroup(groupb);
            hBox2.getChildren().add(radioButton);
        }

    }
}
