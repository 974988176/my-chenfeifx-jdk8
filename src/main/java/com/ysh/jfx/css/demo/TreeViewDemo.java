package com.ysh.jfx.css.demo;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;

/**
 * @author ChenFei
 * @date 2022年6月11日
 * <p>
 * 原生TreeView样式美化案例
 */
public class TreeViewDemo extends StackPane {

    private TreeView treeView = new TreeView();

    {
        this.getChildren().add(treeView);
        this.setPadding(new Insets(40, 40, 40, 40));
    }

    public TreeViewDemo() {
        //设置class
        treeView.getStyleClass().add("cf-tree-view");
        //添加tree数据
        TreeItem<Label> rootItem = new TreeItem<>(new Label("root"));
        rootItem.setGraphic(new FontIcon(MaterialDesign.MDI_HOME));
        treeView.setRoot(rootItem);
        for (int i = 0; i < 3; i++) {
            TreeItem<Label> iTreeItem = new TreeItem<>(new Label("tree-item-" + i));
            iTreeItem.setGraphic(new FontIcon(MaterialDesign.MDI_FOLDER));
            rootItem.getChildren().add(iTreeItem);
            for (int j = 0; j < 3; j++) {
                TreeItem<Label> jTreeItem = new TreeItem<>(new Label("tree-item-" + i + " - " + j));
                jTreeItem.setGraphic(new FontIcon(MaterialDesign.MDI_FOLDER));
                iTreeItem.getChildren().add(jTreeItem);
                for (int k = 0; k < 3; k++) {
                    TreeItem<Label> kTreeItem = new TreeItem<>(new Label("tree-item-" + i + " - " + j + " - " + k));
                    kTreeItem.setGraphic(new FontIcon(MaterialDesign.MDI_FILE));
                    jTreeItem.getChildren().add(kTreeItem);
                }
            }
        }
    }


}
