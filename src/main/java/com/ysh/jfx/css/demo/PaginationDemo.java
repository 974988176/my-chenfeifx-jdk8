package com.ysh.jfx.css.demo;

import javafx.scene.control.Pagination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月8日
 * <p>
 * 原生Pagination样式美化案例
 */
public class PaginationDemo extends StackPane {

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

    public PaginationDemo() {
        addContent();
    }


    private void addContent() {
        //
        Pagination pagination1 = new Pagination();
        pagination1.getStyleClass().add("cf-pagination");
        hBox1.getChildren().add(pagination1);
        //有背景的分页组件
        Pagination pagination2 = new Pagination();
        pagination2.getStyleClass().add("cf-pagination-b");
        hBox2.getChildren().add(pagination2);

    }

}
