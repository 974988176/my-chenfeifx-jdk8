package com.ysh.jfx.css.demo;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022/6/12
 * <p>
 * 原生ScrollBar样式美化案例
 */
public class ScrollBarDemo extends StackPane {

    ScrollPane scrollPane = new ScrollPane();

    {
        this.getChildren().add(scrollPane);
        //设置滚动条样式，可以给TableView,ListView,TreeView 等组件使用，只要包含ScrollBar该组件的都可使用，设置cf-scroll-bar-style属性即可
        scrollPane.getStyleClass().add("cf-scroll-bar-style");
        //设置内容
        VBox vBox = new VBox();
        vBox.setPrefHeight(1000);
        vBox.setPrefWidth(1500);
        scrollPane.setContent(vBox);
    }

}
