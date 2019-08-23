package com.ss.android.downloadlib.c;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28888a;

    public static class a {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @TargetApi(19)
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
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
            f28888a = new b((byte) 0);
        } else {
            f28888a = new a((byte) 0);
        }
    }
}
