package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class JellyBeanMR1V17Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public String getWebViewDefaultUserAgent(Context context) {
            return null;
        }

        public void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z) {
        }

        private BaseImpl() {
        }

        public long getTime(Location location) {
            return location.getTime();
        }

        public float getWebViewScale(WebView webView) {
            if (webView == null) {
                return 1.0f;
            }
            try {
                return webView.getScale();
            } catch (Exception unused) {
                return 1.0f;
            }
        }
    }

    @TargetApi(17)
    static class V17Impl extends BaseImpl {
        private V17Impl() {
            super();
        }

        public long getTime(Location location) {
            return location.getTime();
        }

        public String getWebViewDefaultUserAgent(Context context) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                return null;
            }
        }

        public float getWebViewScale(WebView webView) {
            if (webView == null) {
                return 1.0f;
            }
            try {
                return webView.getScale();
            } catch (Exception unused) {
                return 1.0f;
            }
        }

        public void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z) {
            try {
                webSettings.setMediaPlaybackRequiresUserGesture(z);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new V17Impl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static long getTime(Location location) {
        return IMPL.getTime(location);
    }

    public static String getWebViewDefaultUserAgent(Context context) {
        return IMPL.getWebViewDefaultUserAgent(context);
    }

    public static float getWebViewScale(WebView webView) {
        return IMPL.getWebViewScale(webView);
    }

    public static void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z) {
        IMPL.setMediaPlaybackRequiresUserGesture(webSettings, z);
    }
}
