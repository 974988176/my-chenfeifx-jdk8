package com.ysh.jfx.css.demo;

import javafx.scene.control.Hyperlink;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月8日
 * <p>
 * 原生Hyperlink样式美化案例
 */
public class HyperlinkDemo extends StackPane {

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
    }

    public HyperlinkDemo() {
        addContent();
    }

    private void addContent() {
        String[] styleClass = {"cf-link", "cf-primary-link", "cf-success-link", "cf-info-link", "cf-warn-link", "cf-danger-link"};
        int length = styleClass.length;
        //普通超链接
        for (int i = 0; i < length; i++) {
            Hyperlink hyperlink = new Hyperlink("." + styleClass[i]);
            hyperlink.getStyleClass().add(styleClass[i]);
            hBox1.getChildren().add(hyperlink);
        }
        //禁用
        for (int i = 0; i < length; i++) {
            Hyperlink hyperlink = new Hyperlink("." + styleClass[i]);
            hyperlink.getStyleClass().add(styleClass[i]);
            hyperlink.setDisable(true);
            hBox2.getChildren().add(hyperlink);
        }
    }

}
