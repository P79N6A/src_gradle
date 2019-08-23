package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.m;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61334a;

    /* renamed from: c  reason: collision with root package name */
    private static e f61335c;

    /* renamed from: d  reason: collision with root package name */
    private static long f61336d;

    /* renamed from: b  reason: collision with root package name */
    public String f61337b;

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f61334a, true, 67453, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f61334a, true, 67453, new Class[0], e.class);
        }
        if (f61335c == null) {
            f61335c = new e();
        }
        return f61335c;
    }

    public final void a(Handler handler) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2}, this, f61334a, false, 67459, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2}, this, f61334a, false, 67459, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        a(handler2, d.a().getCurUserId(), null);
    }

    public void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61334a, false, 67462, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f61334a, false, 67462, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a.b() && (f61336d == 0 || currentTimeMillis - f61336d < 1000)) {
            Exception exc = new Exception("user request too fast");
            StringBuilder sb = new StringBuilder();
            int min = Math.min(15, exc.getStackTrace().length);
            for (int i = 0; i < min; i++) {
                StackTraceElement stackTraceElement = exc.getStackTrace()[i];
                if (stackTraceElement != null) {
                    sb.append("\n");
                    sb.append(stackTraceElement.getClassName());
                    sb.append(" ");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(" ");
                    sb.append(stackTraceElement.getLineNumber());
                }
            }
            n.a("request_user_too_fast", "get_user_info", c.a().a("message", sb.toString()).a("period_time", Long.valueOf(currentTimeMillis - f61336d)).a("isSelft", Boolean.valueOf(TextUtils.equals(str2, d.a().getCurUserId()))).a("enter_from", this.f61337b).b());
        }
        f61336d = currentTimeMillis;
    }

    private void c(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, f61334a, false, 67460, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, f61334a, false, 67460, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new f(str2), 0);
    }

    public final void a(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, f61334a, false, 67454, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, f61334a, false, 67454, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        b(handler2, str2, null);
    }

    public void b(Handler handler, String str) {
        Handler handler2 = handler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2}, this, f61334a, false, 67461, new Class[]{Handler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2}, this, f61334a, false, 67461, new Class[]{Handler.class, String.class}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new g(str2), 0);
    }

    private void b(Handler handler, String str, String str2) {
        Handler handler2 = handler;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, null}, this, f61334a, false, 67455, new Class[]{Handler.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, null}, this, f61334a, false, 67455, new Class[]{Handler.class, String.class, String.class}, Void.TYPE);
            return;
        }
        c(handler2, com.ss.android.ugc.aweme.app.api.a.a(str3, null));
    }

    public final void a(Handler handler, String str, String str2) {
        Handler handler2 = handler;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, str2}, this, f61334a, false, 67456, new Class[]{Handler.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, str2}, this, f61334a, false, 67456, new Class[]{Handler.class, String.class, String.class}, Void.TYPE);
            return;
        }
        b(handler, com.ss.android.ugc.aweme.app.api.a.a(str, str2));
        a(str3);
    }
}
