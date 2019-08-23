package com.ss.android.common.applog.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.aa;
import com.ss.android.common.applog.s;
import com.ss.android.common.applog.t;
import com.ss.android.common.applog.y;
import com.ss.android.d.a.a;
import com.ss.android.ugc.aweme.q.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28061a;

    /* renamed from: b  reason: collision with root package name */
    Context f28062b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28061a, false, 15694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28061a, false, 15694, new Class[0], Void.TYPE);
            return;
        }
        a("");
    }

    b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f28061a, false, 15689, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f28061a, false, 15689, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f28062b = context.getApplicationContext();
        y.a(context);
        aa.a().a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28063a;

            public final void run() {
                d dVar;
                if (PatchProxy.isSupport(new Object[0], this, f28063a, false, 15695, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28063a, false, 15695, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = b.this;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f28061a, false, 15690, new Class[0], d.class)) {
                    dVar = (d) PatchProxy.accessDispatch(new Object[0], bVar, b.f28061a, false, 15690, new Class[0], d.class);
                } else {
                    dVar = d.a(c.a(bVar.f28062b, a.a(), 0).getString("key_task_session", ""));
                }
                if (dVar != null) {
                    b.this.a(dVar);
                }
                b.this.a();
            }
        });
    }

    private void a(String str) {
        String str2;
        b bVar;
        if (PatchProxy.isSupport(new Object[]{str}, this, f28061a, false, 15693, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f28061a, false, 15693, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str == null) {
            str2 = "";
            bVar = this;
        } else {
            bVar = this;
            str2 = str;
        }
        try {
            SharedPreferences.Editor edit = c.a(bVar.f28062b, a.a(), 0).edit();
            edit.putString("key_task_session", str2);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public final void b(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f28061a, false, 15692, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f28061a, false, 15692, new Class[]{d.class}, Void.TYPE);
        } else if (dVar2 != null) {
            new StringBuilder("saveTaskSessionToSp : ").append(dVar2);
            a(dVar.a());
        }
    }

    public final void a(d dVar) {
        d dVar2;
        d dVar3 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar3}, this, f28061a, false, 15691, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar3}, this, f28061a, false, 15691, new Class[]{d.class}, Void.TYPE);
            return;
        }
        y a2 = y.a(this.f28062b);
        if (PatchProxy.isSupport(new Object[]{dVar3}, a2, y.f28224a, false, 15603, new Class[]{d.class}, Void.TYPE)) {
            y yVar = a2;
            PatchProxy.accessDispatch(new Object[]{dVar3}, yVar, y.f28224a, false, 15603, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{dVar3}, null, d.f28091a, true, 15716, new Class[]{d.class}, d.class)) {
            dVar2 = (d) PatchProxy.accessDispatch(new Object[]{dVar3}, null, d.f28091a, true, 15716, new Class[]{d.class}, d.class);
        } else if (dVar3 == null) {
            dVar2 = null;
        } else {
            d dVar4 = new d();
            dVar4.f28092b = dVar3.f28092b;
            dVar4.f28093c = dVar3.f28093c;
            dVar4.f28094d = dVar3.f28094d;
            dVar4.f28095e = dVar3.f28095e;
            dVar4.f28096f = dVar3.f28096f;
            dVar4.g = dVar3.g;
            dVar4.h = dVar3.h;
            dVar4.i = dVar3.i;
            dVar4.j = dVar3.j;
            dVar2 = dVar4;
        }
        if (dVar2 != null) {
            t tVar = new t();
            tVar.f28203a = dVar2;
            AppLog instance = AppLog.getInstance(a2.f28226b);
            if (instance != null) {
                instance.enqueue((s) tVar);
            }
        }
    }
}
