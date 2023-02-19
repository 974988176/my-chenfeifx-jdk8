package com.ysh.jfx.css.demo;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
// import org.kordamp.ikonli.antdesignicons.AntDesignIconsFilled;
// import org.kordamp.ikonli.antdesignicons.AntDesignIconsOutlined;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;
import org.kordamp.ikonli.materialdesign.MaterialDesign.*;

import java.util.Random;

/**
 * @author ChenFei
 * @date 2022年6月7日
 * <p>
 * 原生Button样式美化案例
 */
public class ButtonDemo extends StackPane {
    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();
    private HBox hBox3 = new HBox();
    private HBox hBox4 = new HBox();
    private HBox hBox5 = new HBox();
    private HBox hBox6 = new HBox();
    private HBox butGroupH = new HBox();
    private VBox butGroupV = new VBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox3.setSpacing(20);
        hBox4.setSpacing(20);
        hBox5.setSpacing(20);
        hBox6.setSpacing(20);
        hBox6.getChildren().addAll(butGroupH, butGroupV);
    }

    public ButtonDemo() {
        addContent();
    }

    private void addContent() {
        String[] styleClass = {"cf-but", "cf-primary-but", "cf-success-but", "cf-info-but", "cf-warn-but", "cf-danger-but"};
        int length = styleClass.length;
        //普通按钮
        for (int i = 0; i < length; i++) {
            Button button = new Button("." + styleClass[i]);
            button.getStyleClass().add(styleClass[i]);
            hBox1.getChildren().add(button);
        }
        //禁用按钮
        for (int i = 0; i < length; i++) {
            Button button = new Button("." + styleClass[i]);
            button.getStyleClass().add(styleClass[i]);
            button.setDisable(true);
            hBox2.getChildren().add(button);
        }
        //圆角按钮
        String roundClass = "round";
        for (int i = 0; i < length; i++) {
            Button button = new Button("." + roundClass);
            button.getStyleClass().addAll(styleClass[i], roundClass);
            hBox3.getChildren().add(button);
        }
        //图标按钮
        MaterialDesign[] values = MaterialDesign.values();
        // AntDesignIconsFilled[] values = AntDesignIconsFilled.values();
        for (int i = 0; i < length; i++) {
            Button button = new Button("图标按钮");
            button.setGraphic(new FontIcon(values[new Random().nextInt(values.length)]));
            button.getStyleClass().addAll(styleClass[i]);
            hBox4.getChildren().add(button);
        }
        //空图标按钮
        String iconClass = "icon";
        for (int i = 0; i < length; i++) {
            Button button = new Button();
            button.setGraphic(new FontIcon(values[new Random().nextInt(values.length)]));
            button.getStyleClass().addAll(styleClass[i], iconClass);
            hBox5.getChildren().add(button);
        }
        //按钮组,水平,使用HBox实现
        Button previousBut = new Button("上一页");
        Button nowBut = new Button("刷新");
        nowBut.setGraphic(new FontIcon(MaterialDesign.MDI_RELOAD));
        Button nextBut = new Button("下一页");
        //设置class属性
        butGroupH.getStyleClass().add("but-group-h");
        previousBut.getStyleClass().addAll("cf-primary-but", "first");
        nowBut.getStyleClass().add("cf-success-but");
        nextBut.getStyleClass().addAll("cf-info-but", "last");
        butGroupH.getChildren().addAll(previousBut, nowBut, nextBut);

        //按钮组，垂直，使用VBox实现
        Button upBut = new Button("上");
        upBut.setGraphic(new FontIcon(MaterialDesign.MDI_THUMB_UP));
        Button downBut = new Button("下");
        downBut.setGraphic(new FontIcon(MaterialDesign.MDI_THUMB_UP_OUTLINE));
        //设置class属性
        butGroupV.getStyleClass().add("but-group-v");
        upBut.getStyleClass().addAll("cf-primary-but", "first");
        downBut.getStyleClass().addAll("cf-primary-but", "last");
        //设置class属性
        butGroupV.getChildren().addAll(upBut, downBut);

    }

}
