package com.ysh.jfx.css.util;

import javafx.scene.control.Tooltip;
import javafx.util.Duration;

/**
 * @author ChenFei
 * @date 2022/6/24
 * <p>
 */
public class TooltipUtils {

    private static final Duration SHOW_DELAY = Duration.millis(100);
    private static final Duration SHOW_DURATION = Duration.millis(5000);

    public static Tooltip dark(String text) {
        Tooltip tooltip = getTooltip(text);
        tooltip.getStyleClass().add("cf-tooltip");
        return tooltip;
    }

    public static Tooltip light(String text) {
        Tooltip tooltip = getTooltip(text);
        tooltip.getStyleClass().add("cf-tooltip-light");
        return tooltip;
    }

    private static Tooltip getTooltip(String text) {
        Tooltip tooltip = new Tooltip(text);
        // tooltip.setShowDelay(SHOW_DELAY);
        // tooltip.setShowDuration(SHOW_DURATION);
        return tooltip;
    }

}
