package com.ysh.jfx.css.demo;

import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import org.kordamp.ikonli.javafx.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;

/**
 * @author ChenFei
 * @date 2022年6月28日
 * <p>
 * 原生ContextMenu样式美化案例
 */
public class ContextMenuDemo extends StackPane {
    
    public ContextMenuDemo() {
        Label label = new Label("右击试试");
        label.setFont(new Font(100));
        label.setTextFill(Color.rgb(0, 0, 0, 0.1));
        this.getChildren().add(label);
        /**
         * 主要内容
         */
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.getStyleClass().add("cf-context-menu");// 设置class
        //
        MenuItem removeItem = new MenuItem("删除");
        removeItem.setGraphic(new FontIcon(MaterialDesign.MDI_DELTA));
        //
        MenuItem editItem = new MenuItem("编辑");
        editItem.setGraphic(new FontIcon(MaterialDesign.MDI_TABLE_EDIT));
        // 详情
        MenuItem detailItem = new MenuItem("详情");
        detailItem.setGraphic(new FontIcon(MaterialDesign.MDI_UNFOLD_MORE));
        //
        MenuItem inItem = new MenuItem("导入");
        MenuItem outItem = new MenuItem("导出");
        // 更多
        Menu menu = new Menu("更多...");
        menu.getItems().addAll(new MenuItem("主题1"), new MenuItem("主题2"), new MenuItem("油泼面加蒜。。。"));
        
        contextMenu.getItems().addAll(removeItem,
            editItem,
            detailItem,
            menu,
            new SeparatorMenuItem(),
            inItem,
            outItem);
        // 右击事件
        this.setOnMouseClicked(event -> {
            if (MouseButton.SECONDARY.equals(event.getButton())) {
                if (!contextMenu.isShowing()) {
                    contextMenu.show(this, event.getScreenX(), event.getScreenY());
                } else {
                    contextMenu.hide();
                }
            }
        });
        
    }
    
}
