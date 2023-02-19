package com.ysh.jfx.css.model;


import com.ysh.jfx.css.util.TooltipUtils;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;

import java.time.LocalDate;

public class User {
    
    private String name;
    private Integer age;
    private String address;
    private LocalDate birthday;
    // 操作
    private HBox operateBox;
    
    {
        operateBox = new HBox();
        //
        Button editBut = new Button();
        editBut.getStyleClass().addAll("cf-info-but", "icon");
        editBut.setTooltip(TooltipUtils.dark("编辑"));
        Button removeBut = new Button();
        removeBut.getStyleClass().addAll("cf-danger-but", "icon");
        removeBut.setTooltip(TooltipUtils.dark("删除"));
        operateBox.getChildren().addAll(editBut, removeBut);
        operateBox.setAlignment(Pos.CENTER);
        operateBox.setSpacing(10);
        //
        editBut.setGraphic(new FontIcon(MaterialDesign.MDI_TABLE_EDIT));
        removeBut.setGraphic(new FontIcon(MaterialDesign.MDI_DELETE));
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public void setOperateBox(HBox operateBox) {
        this.operateBox = operateBox;
    }
    
    public HBox getOperateBox() {
        return operateBox;
    }
}
