package com.ysh.jfx.css.demo;

import com.ysh.jfx.css.model.User;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenFei
 * @date 2022年6月27日
 * <p>
 * 案例1：
 */
public class Example1 extends VBox {

    private HBox top = new HBox();
    private ScrollPane main = new ScrollPane();
    private StackPane bottom = new StackPane();

    {
        this.getChildren().addAll(top, main, bottom);
        this.setPadding(new Insets(10, 10, 10, 10));
        VBox.setVgrow(main, Priority.ALWAYS);
        this.setSpacing(10);
        main.getStyleClass().add("cf-scroll-bar-style");
    }

    //查询容器
    private HBox selectBox = new HBox();
    private TextField searchField = new TextField();
    private Button searchBut = new Button("搜索");
    //添加
    private Button addBut = new Button("添加");

    {
        top.getChildren().addAll(selectBox, addBut);
        selectBox.getChildren().addAll(searchField, searchBut);
        selectBox.setSpacing(10);
        HBox.setHgrow(selectBox, Priority.ALWAYS);
        searchField.setPromptText("用户...");
        //icon
        searchBut.setGraphic(new FontIcon(MaterialDesign.MDI_ACCOUNT_SEARCH));
        addBut.setGraphic(new FontIcon(MaterialDesign.MDI_ALARM_PLUS));
        //class
        addBut.getStyleClass().add("cf-primary-but");
        searchBut.getStyleClass().add("cf-success-but");
        searchField.getStyleClass().add("cf-text-field");
    }

    //表格
    private TableView tableView = new TableView();

    private TableColumn nameCol = new TableColumn("用户名");
    private TableColumn ageCol = new TableColumn("年龄");
    private TableColumn addressCol = new TableColumn("地址");
    private TableColumn birthdayCol = new TableColumn("生日");
    private TableColumn operateCol = new TableColumn("操作");

    {
        main.setContent(tableView);
        main.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double v = t1.doubleValue();
                if (v <= 800) {
                    tableView.setMinWidth(800);
                } else {
                    tableView.setMinWidth(v);
                }
            }
        });
        tableView.getStyleClass().addAll("cf-table-view", "cf-scroll-bar-style");//class
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        //绑定TableColumn，TableView
        tableView.getColumns().addAll(nameCol, ageCol, addressCol, birthdayCol, operateCol);
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
        addressCol.setCellValueFactory(new PropertyValueFactory<User, String>("address"));
        birthdayCol.setCellValueFactory(new PropertyValueFactory<User, LocalDate>("birthday"));
        operateCol.setCellValueFactory(new PropertyValueFactory<User, Node>("operateBox"));
        operateCol.setMaxWidth(100);
        operateCol.setMinWidth(100);
    }

    //分页组件
    private Pagination pagination = new Pagination();

    {
        pagination.getStyleClass().add("cf-pagination");
        pagination.setStyle("-fx-page-information-visible:false;");
        pagination.setMaxWidth(Double.NEGATIVE_INFINITY);
        bottom.getChildren().add(pagination);
        StackPane.setAlignment(pagination, Pos.CENTER_RIGHT);
    }

    public Example1() {
        setTableViewInfo();
    }

    private void setTableViewInfo() {
        //模拟数据
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAddress("银河系 太阳系 地球 亚洲 。。。");
            user.setAge(18);
            user.setBirthday(LocalDate.now());
            user.setName("ChenFei");
            userList.add(user);
        }
        //给表格填充数据
        ObservableList<User> observableList = FXCollections.observableArrayList(userList);
        tableView.setItems(observableList);
    }

}
