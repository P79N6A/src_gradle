package com.ss.android.pushmanager.client;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.setting.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30552a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f30553b;

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f30552a, true, 19081, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f30552a, true, 19081, new Class[0], e.class);
        }
        if (f30553b == null) {
            synchronized (e.class) {
                if (f30553b == null) {
                    f30553b = new e();
                }
            }
        }
        return f30553b;
    }

    public final void a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, f30552a, false, 19089, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, this, f30552a, false, 19089, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        b a2 = b.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, b.f2543a, false, 19193, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {str2};
            b bVar = a2;
            PatchProxy.accessDispatch(objArr, bVar, b.f2543a, false, 19193, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a2.f2546c.a().a("uninstall_question_url", str2).a();
    }

    public final void b(Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f30552a, false, 19087, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f30552a, false, 19087, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b a2 = b.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, b.f2543a, false, 19183, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            b bVar = a2;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar, b.f2543a, false, 19183, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.f2546c.a().a("shut_push_on_stop_service", z).a();
    }

    public final void a(Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f30552a, false, 19085, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f30552a, false, 19085, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b a2 = b.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, b.f2543a, false, 19191, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            b bVar = a2;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar, b.f2543a, false, 19191, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a2.f2546c.a().a("allow_network", z).a();
    }
}
