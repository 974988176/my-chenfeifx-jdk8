package com.ysh.jfx.css.view;

import com.ysh.jfx.css.demo.*;
import javafx.scene.Node;
import javafx.scene.control.Pagination;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ChenFei
 * @date 2022年6月9日
 * <p>
 * 首页视图
 */
public class HomeView extends StackPane {

    private VBox vBox = new VBox();
    private StackPane top = new StackPane();
    private Pagination pagination = new Pagination();
    private StackPane bottom = new StackPane();
    //案例
    private Node[] demoNodes = {
            new ButtonDemo(), new HyperlinkDemo(),
            new LabelDemo(), new PaginationDemo(),
            new TableViewDemo(), new TextFieldDemo(),
            new SliderDemo(), new SeparatorDemo(),
            new ProgressBarDemo(), new ProgressIndicatorDemo(),
            new SpinnerDemo(), new CheckBoxDemo(),
            new RadioButtonDemo(), new TreeViewDemo(),
            new ComboBoxDemo(), new TooltipDemo(),
            new ScrollBarDemo(), new ContextMenuDemo(),
            //案例
            new Example1(), new Example2()
    };

    {
        this.getChildren().add(vBox);
        vBox.getChildren().addAll(top, bottom);
        VBox.setVgrow(bottom, Priority.ALWAYS);
        top.getChildren().add(pagination);
        //默认加载第一个
        bottom.getChildren().add(demoNodes[0]);
        //初始化分页
        pagination.setStyle("-fx-page-information-visible:false;");
        pagination.getStyleClass().add("cf-pagination");
        pagination.setPageCount(demoNodes.length);
        pagination.currentPageIndexProperty()
                .addListener((observable, oldValue, newValue) -> bottom.getChildren().set(0, demoNodes[newValue.intValue()]));
    }
}
