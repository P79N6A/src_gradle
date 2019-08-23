package com.bytedance.common.util;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import android.webkit.WebView;

public class KitKatV19Compat {
    static final BaseImpl IMPL;

    static class BaseImpl {
        public void setWebContentsDebuggingEnabled(boolean z) {
        }

        private BaseImpl() {
        }

        public void setAlarmTime(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @TargetApi(19)
    static class KitKatImpl extends BaseImpl {
        private KitKatImpl() {
            super();
        }

        public void setWebContentsDebuggingEnabled(boolean z) {
            try {
                WebView.setWebContentsDebuggingEnabled(z);
            } catch (Exception unused) {
            }
        }

        public void setAlarmTime(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.setExact(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new KitKatImpl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z) {
        IMPL.setWebContentsDebuggingEnabled(z);
    }

    public static void setAlarmTime(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        IMPL.setAlarmTime(alarmManager, i, j, pendingIntent);
    }
}
