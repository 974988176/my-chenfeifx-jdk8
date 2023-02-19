package com.ysh.jfx.css.demo;

import com.ysh.jfx.css.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenFei
 * @date 2022年6月7日
 * <p>
 * 原生TableView样式美化案例
 */
public class TableViewDemo extends StackPane {

    private TableView tableView = new TableView();

    private TableColumn nameCol = new TableColumn("Name");
    private TableColumn ageCol = new TableColumn("Age");
    private TableColumn addressCol = new TableColumn("Address");
    private TableColumn birthdayCol = new TableColumn("Birthday");

    {
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        this.getChildren().add(tableView);
        this.setPadding(new Insets(40, 40, 40, 40));
        //绑定TableColumn，TableView
        tableView.getColumns().addAll(nameCol, ageCol, addressCol, birthdayCol);
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
        addressCol.setCellValueFactory(new PropertyValueFactory<User, String>("address"));
        birthdayCol.setCellValueFactory(new PropertyValueFactory<User, LocalDate>("birthday"));
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
        //设置class
        tableView.getStyleClass().addAll("cf-table-view", "cf-scroll-bar-style");//.cf-scroll-bar-style为滚动条样式

    }

}
