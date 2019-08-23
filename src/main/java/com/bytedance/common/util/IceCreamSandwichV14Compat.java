package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class IceCreamSandwichV14Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public void setUiOptions(Window window, int i) {
        }

        public void setUiOptions(Window window, int i, int i2) {
        }

        private BaseImpl() {
        }

        public void setWebViewTextSize(WebView webView, int i) {
            WebSettings.TextSize textSize = WebSettings.TextSize.NORMAL;
            if (i == 3) {
                textSize = WebSettings.TextSize.LARGER;
            } else if (i == 1) {
                textSize = WebSettings.TextSize.SMALLER;
            } else if (i == 4) {
                textSize = WebSettings.TextSize.LARGEST;
            }
            webView.getSettings().setTextSize(textSize);
        }
    }

    @TargetApi(14)
    static class IceCreamSandwichImpl extends BaseImpl {
        private IceCreamSandwichImpl() {
            super();
        }

        public void setUiOptions(Window window, int i) {
            window.setUiOptions(i);
        }

        public void setWebViewTextSize(WebView webView, int i) {
            int i2;
            if (i == 1) {
                i2 = 75;
            } else {
                i2 = 100;
            }
            if (i == 3) {
                i2 = 125;
            }
            if (i == 4) {
                i2 = 150;
            }
            webView.getSettings().setTextZoom(i2);
        }

        public void setUiOptions(Window window, int i, int i2) {
            window.setUiOptions(i, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new IceCreamSandwichImpl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static void setUiOptions(Window window, int i) {
        IMPL.setUiOptions(window, i);
    }

    public static void setWebViewTextSize(WebView webView, int i) {
        IMPL.setWebViewTextSize(webView, i);
    }

    public static void setUiOptions(Window window, int i, int i2) {
        IMPL.setUiOptions(window, i, i2);
    }
}
