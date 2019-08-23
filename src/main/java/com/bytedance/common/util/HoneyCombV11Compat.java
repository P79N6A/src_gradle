package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

public class HoneyCombV11Compat {
    static Method sMethodWebViewOnPause;
    static Method sMethodWebViewOnResume;
    static boolean sWebViewPauseResumeGot;

    @TargetApi(11)
    static class HoneyCombImpl {
        HoneyCombImpl() {
        }

        public static void pauseWebView(WebView webView) {
            webView.onPause();
        }

        public static void resumeWebView(WebView webView) {
            webView.onResume();
        }

        public static Context getContext(AlertDialog.Builder builder) {
            return builder.getContext();
        }

        public static int getLargeMemoryClass(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }

        public static void setDisplayZoomControl(WebSettings webSettings, boolean z) {
            webSettings.setDisplayZoomControls(z);
        }
    }

    private static void tryGetWebViewPauseResumeMethod() {
        if (!sWebViewPauseResumeGot) {
            sWebViewPauseResumeGot = true;
            try {
                sMethodWebViewOnPause = WebView.class.getMethod("onPause", null);
                sMethodWebViewOnResume = WebView.class.getMethod("onResume", null);
            } catch (Exception unused) {
            }
        }
    }

    public static int getLargeMemoryClass(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT < 11) {
            return -1;
        }
        try {
            return HoneyCombImpl.getLargeMemoryClass(activityManager);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void pauseWebView(WebView webView) {
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                HoneyCombImpl.pauseWebView(webView);
                return;
            }
            tryGetWebViewPauseResumeMethod();
            if (sMethodWebViewOnPause != null) {
                try {
                    sMethodWebViewOnPause.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void resumeWebView(WebView webView) {
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                HoneyCombImpl.resumeWebView(webView);
                return;
            }
            tryGetWebViewPauseResumeMethod();
            if (sMethodWebViewOnResume != null) {
                try {
                    sMethodWebViewOnResume.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static Context getContext(Context context, AlertDialog.Builder builder) {
        if (Build.VERSION.SDK_INT >= 11) {
            return HoneyCombImpl.getContext(builder);
        }
        return context;
    }

    public static void setDisplayZoomControl(WebSettings webSettings, boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            HoneyCombImpl.setDisplayZoomControl(webSettings, z);
        }
    }
}
