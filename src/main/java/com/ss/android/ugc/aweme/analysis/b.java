package com.ss.android.ugc.aweme.analysis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.b.a.a;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f33319c;

    public final void f(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33319c, false, 21584, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33319c, false, 21584, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.v(str, str2);
    }

    public final void g(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33319c, false, 21585, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33319c, false, 21585, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.d(str, str2);
    }

    public final void h(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33319c, false, 21586, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33319c, false, 21586, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.i(str, str2);
    }

    public final void i(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33319c, false, 21587, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33319c, false, 21587, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.w(str, str2);
    }

    public final void j(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f33319c, false, 21590, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f33319c, false, 21590, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.e(str, str2);
    }

    public final void c(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f33319c, false, 21589, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f33319c, false, 21589, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ALog.w(str, th);
    }

    public final void d(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f33319c, false, 21592, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f33319c, false, 21592, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ALog.e(str, th);
    }

    public final void b(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f33319c, false, 21594, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f33319c, false, 21594, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ALog.json(i, str, str2);
    }

    public final void c(String str, String str2, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, str2, th}, this, f33319c, false, 21588, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, th}, this, f33319c, false, 21588, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ALog.w(str, str2, th);
    }

    public final void d(String str, String str2, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, str2, th}, this, f33319c, false, 21591, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, th}, this, f33319c, false, 21591, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ALog.e(str, str2, th);
    }

    public final void b(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, stackTraceElementArr}, this, f33319c, false, 21599, new Class[]{Integer.TYPE, String.class, StackTraceElement[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, stackTraceElementArr}, this, f33319c, false, 21599, new Class[]{Integer.TYPE, String.class, StackTraceElement[].class}, Void.TYPE);
            return;
        }
        ALog.statcktrace(i, str, stackTraceElementArr);
    }
}
