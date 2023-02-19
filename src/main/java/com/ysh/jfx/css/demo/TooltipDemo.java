package com.ysh.jfx.css.demo;

import com.ysh.jfx.css.util.TooltipUtils;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月12日
 * <p>
 * 原生Tooltip样式美化案例
 */
public class TooltipDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
    }

    public TooltipDemo() {
        addContent();
    }

    private void addContent() {

        Button button1 = new Button("dark");
        button1.getStyleClass().add("cf-primary-but");
        button1.setTooltip(TooltipUtils.dark("文本提示"));

        Button button2 = new Button("light");
        button2.getStyleClass().add("cf-primary-but");
        button2.setTooltip(TooltipUtils.light("文本提示"));

        hBox1.getChildren().addAll(button1, button2);


    }
}
