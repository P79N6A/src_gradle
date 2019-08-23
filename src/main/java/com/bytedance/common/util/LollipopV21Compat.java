package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class LollipopV21Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        }

        public void setMixedContentMode(WebSettings webSettings, int i) {
        }

        private BaseImpl() {
        }
    }

    @TargetApi(21)
    static class LollipopImpl extends BaseImpl {
        private LollipopImpl() {
            super();
        }

        public void setMixedContentMode(WebSettings webSettings, int i) {
            if (webSettings != null) {
                try {
                    webSettings.setMixedContentMode(i);
                } catch (Exception unused) {
                }
            }
        }

        public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
            if (webView != null) {
                try {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            IMPL = new LollipopImpl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        IMPL.setAcceptThirdPartyCookies(webView, z);
    }

    public static void setMixedContentMode(WebSettings webSettings, int i) {
        IMPL.setMixedContentMode(webSettings, i);
    }
}
