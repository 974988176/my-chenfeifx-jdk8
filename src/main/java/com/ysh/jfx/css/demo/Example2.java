package com.ysh.jfx.css.demo;

import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * @author ChenFei
 * @date 2022年6月27日
 * <p>
 * 案例2：
 */
public class Example2 extends GridPane {

    {
        this.setMaxHeight(Double.NEGATIVE_INFINITY);
        this.setMaxWidth(Double.NEGATIVE_INFINITY);
        this.setHgap(20);
        this.setVgap(20);
        this.setStyle("-fx-font-size:14px;");
    }

    private Label nameLabel = new Label("用户名:");
    private TextField nameField = new TextField();

    {
        this.add(nameLabel, 0, 0);
        this.add(nameField, 1, 0);
        nameField.getStyleClass().add("cf-text-field");
    }

    private Label ageLabel = new Label("年龄:");
    private Spinner<Integer> spinner = new Spinner(5, 120, 18);

    {
        this.add(ageLabel, 0, 1);
        this.add(spinner, 1, 1);
        spinner.getStyleClass().addAll("split-arrows-horizontal", "cf-spinner");
    }

    private Label genderLabel = new Label("性别:");
    private FlowPane genderPane = new FlowPane();
    private RadioButton manRadio = new RadioButton("男");
    private RadioButton womanRadio = new RadioButton("女");
    private RadioButton unknownRadio = new RadioButton("未知");

    {
        ToggleGroup group = new ToggleGroup();
        this.add(genderLabel, 0, 2);
        this.add(genderPane, 1, 2);
        genderPane.getChildren().addAll(manRadio, womanRadio, unknownRadio);
        //组
        manRadio.setToggleGroup(group);
        womanRadio.setToggleGroup(group);
        unknownRadio.setToggleGroup(group);
        //class
        manRadio.getStyleClass().add("cf-radio-button");
        womanRadio.getStyleClass().add("cf-radio-button");
        unknownRadio.getStyleClass().add("cf-radio-button");
        //style
        genderPane.setHgap(20);
        genderPane.setVgap(20);
    }

    private Label likeLabel = new Label("喜好:");
    private FlowPane likePane = new FlowPane();
    private CheckBox musicCheckBox = new CheckBox("听听音乐");
    private CheckBox bookCheckBox = new CheckBox("看看书");
    private CheckBox playCheckBox = new CheckBox("完耍耍");
    private CheckBox sleepCheckBox = new CheckBox("睡觉觉");

    {
        this.add(likeLabel, 0, 3);
        this.add(likePane, 1, 3);
        likePane.getChildren().addAll(musicCheckBox, bookCheckBox, playCheckBox, sleepCheckBox);
        //class
        musicCheckBox.getStyleClass().add("cf-check-box");
        bookCheckBox.getStyleClass().add("cf-check-box");
        playCheckBox.getStyleClass().add("cf-check-box");
        sleepCheckBox.getStyleClass().add("cf-check-box");
        //style
        likePane.setHgap(20);
        likePane.setVgap(20);
    }

    private Label remarkLabel = new Label("备注:");
    private TextArea remark = new TextArea();

    {
        this.add(remarkLabel, 0, 4);
        this.add(remark, 1, 4);
        remark.getStyleClass().add("cf-text-area");
    }

    //操作按钮
    private HBox butBox = new HBox();
    private Button confirmBut = new Button("提交");
    private Button cancelBut = new Button("取消");

    {
        this.add(butBox, 1, 5);
        butBox.setSpacing(20);
        butBox.getChildren().addAll(confirmBut, cancelBut);
        confirmBut.getStyleClass().add("cf-success-but");
        cancelBut.getStyleClass().add("cf-but");
    }

    public Example2() {
        setRight(nameLabel, ageLabel, genderLabel, likeLabel, remarkLabel);
    }

    /**
     * 文章右对齐
     *
     * @param nodes
     */
    private void setRight(Node... nodes) {
        for (int i = 0; i < nodes.length; i++) {
            GridPane.setHalignment(nodes[i], HPos.RIGHT);
        }
    }

}
