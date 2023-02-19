package com.ysh.jfx.css.demo;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;

import java.util.Random;

/**
 * @author ChenFei
 * @date 2022年6月8日
 * <p>
 * 原生Label样式美化案例
 */
public class LabelDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();
    private HBox hBox3 = new HBox();
    private HBox hBox4 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox3.setSpacing(20);
        hBox4.setSpacing(20);
    }

    public LabelDemo() {
        addContent();
    }

    private void addContent() {
        String[] styleClass = {"cf-primary-label", "cf-success-label", "cf-info-label", "cf-warn-label", "cf-danger-label"};
        int length = styleClass.length;
        //普通Label
        for (int i = 0; i < length; i++) {
            Label label = new Label("." + styleClass[i]);
            label.getStyleClass().add(styleClass[i]);
            hBox1.getChildren().add(label);
        }
        //图标Label
        MaterialDesign[] values = MaterialDesign.values();
        // AntDesignIconsFilled[] values = AntDesignIconsFilled.values();
        for (int i = 0; i < length; i++) {
            Label label = new Label("图标标签");
            label.getStyleClass().add(styleClass[i]);
            label.setGraphic(new FontIcon(values[new Random().nextInt(values.length)]));
            hBox2.getChildren().add(label);
        }
        //带背景
        String[] styleClassB = {"cf-primary-label-b", "cf-success-label-b", "cf-info-label-b", "cf-warn-label-b", "cf-danger-label-b"};
        int lengthB = styleClassB.length;
        for (int i = 0; i < lengthB; i++) {
            Label label = new Label("." + styleClassB[i]);
            label.getStyleClass().add(styleClassB[i]);
            hBox3.getChildren().add(label);
        }

        //带背景-图标
        for (int i = 0; i < lengthB; i++) {
            Label label = new Label("." + styleClassB[i]);
            label.getStyleClass().add(styleClassB[i]);
            label.setGraphic(new FontIcon(values[new Random().nextInt(values.length)]));
            hBox4.getChildren().add(label);
        }

    }
}
