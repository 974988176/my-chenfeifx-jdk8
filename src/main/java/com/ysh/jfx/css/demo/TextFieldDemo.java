package com.ysh.jfx.css.demo;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月7日
 * <p>
 * 原生TextFie样式美化案例
 */
public class TextFieldDemo extends StackPane {

    private VBox vBox = new VBox();
    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();
    private HBox hBox3 = new HBox();

    {
        this.getChildren().add(vBox);
        vBox.setMaxHeight(Double.NEGATIVE_INFINITY);
        vBox.setMaxWidth(Double.NEGATIVE_INFINITY);
        vBox.getChildren().addAll(hBox1, hBox2, hBox3);
        vBox.setSpacing(20);
        hBox1.setSpacing(20);
        hBox2.setSpacing(20);
        hBox3.setSpacing(20);
    }

    public TextFieldDemo() {
        addContent();
    }

    private void addContent() {
        int length = 3;
        //文本框
        for (int i = 0; i < length; i++) {
            TextField textField = new TextField();
            textField.setPromptText("文本框");
            textField.getStyleClass().add("cf-text-field");
            hBox1.getChildren().add(textField);
        }
        //密码框
        for (int i = 0; i < length; i++) {
            PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("密码框");
            passwordField.getStyleClass().add("cf-password-field");
            hBox2.getChildren().add(passwordField);
        }
        //文本区域
        for (int i = 0; i < 1; i++) {
            TextArea textArea = new TextArea();
            textArea.setPromptText("请输入");
            textArea.getStyleClass().add("cf-text-area");
            hBox3.getChildren().add(textArea);
        }

    }

}
