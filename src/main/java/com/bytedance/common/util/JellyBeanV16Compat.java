package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public class JellyBeanV16Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private BaseImpl() {
        }

        public void setViewBackground(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }
    }

    @TargetApi(16)
    static class V16Impl extends BaseImpl {
        private V16Impl() {
            super();
        }

        public long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        public void setViewBackground(View view, Drawable drawable) {
            try {
                view.setBackground(drawable);
            } catch (Throwable unused) {
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new V16Impl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
        return IMPL.getTotalMem(memoryInfo);
    }

    public static void setViewBackground(View view, Drawable drawable) {
        IMPL.setViewBackground(view, drawable);
    }
}
