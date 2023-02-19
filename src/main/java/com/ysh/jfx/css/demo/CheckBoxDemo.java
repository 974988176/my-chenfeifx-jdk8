package com.ysh.jfx.css.demo;

import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月10日
 * <p>
 * 原生CheckBox样式美化案例
 */
public class CheckBoxDemo extends StackPane {

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

    public CheckBoxDemo() {
        addContent();
    }

    private void addContent() {
        //复选框
        for (int i = 0; i < 5; i++) {
            CheckBox checkBox = new CheckBox("复选框");
            checkBox.getStyleClass().add("cf-check-box");
            hBox1.getChildren().add(checkBox);
        }

        //带边框
        for (int i = 0; i < 5; i++) {
            CheckBox checkBox = new CheckBox("复选框");
            checkBox.getStyleClass().add("cf-check-box-b");
            hBox2.getChildren().add(checkBox);
        }

    }
}
