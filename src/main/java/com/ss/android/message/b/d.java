package com.ss.android.message.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29968a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f29969b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29970a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{alarmManager, Integer.valueOf(i), new Long(j2), pendingIntent}, this, f29970a, false, 18139, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE)) {
                Object[] objArr = {alarmManager, Integer.valueOf(i), new Long(j2), pendingIntent};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f29970a, false, 18139, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE);
                return;
            }
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

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f29971b;

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{alarmManager, Integer.valueOf(i), new Long(j2), pendingIntent}, this, f29971b, false, 18141, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE)) {
                Object[] objArr = {alarmManager, Integer.valueOf(i), new Long(j2), pendingIntent};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f29971b, false, 18141, new Class[]{AlarmManager.class, Integer.TYPE, Long.TYPE, PendingIntent.class}, Void.TYPE);
                return;
            }
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
            f29969b = new b((byte) 0);
        } else {
            f29969b = new a((byte) 0);
        }
    }
}
