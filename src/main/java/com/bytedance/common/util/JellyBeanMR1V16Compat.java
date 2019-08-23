package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public class JellyBeanMR1V16Compat {
    private static BaseImpl IMPL;

    static class BaseImpl {
        private BaseImpl() {
        }

        public void setBackground(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }
    }

    @TargetApi(16)
    static class V16Impl extends BaseImpl {
        private V16Impl() {
            super();
        }

        public void setBackground(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    public static void setBackgroundForView(View view, Drawable drawable) {
        if (view != null) {
            if (IMPL == null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    IMPL = new V16Impl();
                } else {
                    IMPL = new BaseImpl();
                }
            }
            IMPL.setBackground(view, drawable);
        }
    }
}
