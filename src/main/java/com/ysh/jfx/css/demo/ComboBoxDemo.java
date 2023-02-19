package com.ysh.jfx.css.demo;

import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.Arrays;

/**
 * @author ChenFei
 * @date 2022年6月12日
 * <p>
 * 原生ComboBox样式美化案例
 */
public class ComboBoxDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox1.setAlignment(Pos.CENTER);
    }

    public ComboBoxDemo() {
        addContent();
    }

    private void addContent() {

        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.setItems(FXCollections.observableList(Arrays.asList("包子", "豆浆", "胡辣汤", "豆腐脑", "油条")));
        comboBox1.getStyleClass().add("cf-combo-box");

        ComboBox<String> comboBox2 = new ComboBox<>();
        comboBox2.setItems(FXCollections.observableList(Arrays.asList("香蕉", "苹果", "杏", "桃子", "老八秘制")));
        comboBox2.getStyleClass().add("cf-combo-box");

        hBox1.getChildren().addAll(comboBox1, comboBox2);
    }
}
