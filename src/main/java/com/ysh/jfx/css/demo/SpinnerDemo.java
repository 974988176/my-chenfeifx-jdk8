package com.ysh.jfx.css.demo;

import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * @author ChenFei
 * @date 2022年6月10日
 * <p>
 * 原生Spinner样式美化案例
 */
public class SpinnerDemo extends StackPane {

    public HBox hBox = new HBox();

    {
        this.getChildren().add(hBox);
        hBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        hBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        hBox.setSpacing(20);
    }

    public SpinnerDemo() {
        addContent();
    }

    private void addContent() {
        String[] classArr = {"arrows-on-right-horizontal", "arrows-on-left-vertical", "arrows-on-left-horizontal",
                "split-arrows-vertical", "split-arrows-horizontal"};

        for (int i = 0; i < classArr.length; i++) {
            Spinner<Integer> spinner = new Spinner(0, 100, 20, 5);
            spinner.getStyleClass().addAll(classArr[i], "cf-spinner");
            hBox.getChildren().add(spinner);
        }
    }

}
