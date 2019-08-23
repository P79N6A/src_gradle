package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.awemepushapi.f;
import com.ss.android.ugc.awemepushlib.manager.a;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77008a;

    /* renamed from: b  reason: collision with root package name */
    Context f77009b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f77008a, false, 90204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77008a, false, 90204, new Class[0], Void.TYPE);
            return;
        }
        PushInitializer.a(1);
    }

    b(Context context) {
        this.f77009b = context;
    }

    public final void b(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f77008a, false, 90200, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f77008a, false, 90200, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        PushInitializer.a((Runnable) new f(activity2));
    }

    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f77008a, false, 90199, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f77008a, false, 90199, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        PushInitializer.a((Runnable) new e(activity2));
    }

    public final void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f77008a, false, 90202, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f77008a, false, 90202, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        PushInitializer.a((Runnable) new h(context2));
    }

    static final /* synthetic */ void c(Context context) {
        Context context2 = context;
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{context2}, a2, a.f77064a, false, 90296, new Class[]{Context.class}, Void.TYPE)) {
            Object[] objArr = {context2};
            a aVar = a2;
            PatchProxy.accessDispatch(objArr, aVar, a.f77064a, false, 90296, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.newmedia.redbadge.b.a(context);
        SharedPreferences a3 = c.a(context2, "push_setting", 0);
        a2.b(context2);
        a2.b();
        com.ss.android.push.window.oppo.c.a(context).a(a3);
        com.ss.android.newmedia.message.localpush.b a4 = com.ss.android.newmedia.message.localpush.b.a(context);
        if (PatchProxy.isSupport(new Object[]{a3}, a4, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18711, new Class[]{SharedPreferences.class}, Void.TYPE)) {
            com.ss.android.newmedia.message.localpush.b bVar = a4;
            PatchProxy.accessDispatch(new Object[]{a3}, bVar, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18711, new Class[]{SharedPreferences.class}, Void.TYPE);
            return;
        }
        a4.f30246e = a3.getInt("ies_main_local_push_enable", 1);
        a4.f30247f = a3.getLong("local_push_get_interval", 14400000);
    }

    static final /* synthetic */ void d(Context context) {
        Context context2 = context;
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{context2}, a2, a.f77064a, false, 90295, new Class[]{Context.class}, Void.TYPE)) {
            Object[] objArr = {context2};
            a aVar = a2;
            PatchProxy.accessDispatch(objArr, aVar, a.f77064a, false, 90295, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a2.e();
        SharedPreferences.Editor c2 = a2.c(context2);
        if (c2 != null) {
            com.ss.android.push.window.oppo.c.a(context).a(c2);
            com.ss.android.newmedia.message.localpush.b a3 = com.ss.android.newmedia.message.localpush.b.a(context);
            if (PatchProxy.isSupport(new Object[]{c2}, a3, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18712, new Class[]{SharedPreferences.Editor.class}, Void.TYPE)) {
                com.ss.android.newmedia.message.localpush.b bVar = a3;
                PatchProxy.accessDispatch(new Object[]{c2}, bVar, com.ss.android.newmedia.message.localpush.b.f30242a, false, 18712, new Class[]{SharedPreferences.Editor.class}, Void.TYPE);
            } else {
                c2.putInt("ies_main_local_push_enable", a3.f30246e);
                c2.putLong("local_push_get_interval", a3.f30247f);
            }
            SharedPrefsEditorCompat.apply(c2);
        }
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f77008a, false, 90201, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f77008a, false, 90201, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        PushInitializer.a((Runnable) new g(context2));
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f77008a, false, 90198, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f77008a, false, 90198, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i = message.what;
        if (i != 102) {
            if (i == 10008) {
                PushInitializer.a((Runnable) new d(this));
            }
            return;
        }
        PushInitializer.a((Runnable) new c(this));
    }

    public final void a(boolean z, int i, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), context2}, this, f77008a, false, 90203, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), context2}, this, f77008a, false, 90203, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE);
            return;
        }
        PushInitializer.a((Runnable) new i(context2));
    }
}
