package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.PowerManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.awemepushlib.interaction.a;
import com.ss.android.ugc.awemepushlib.os.receiver.ScreenOnPushActionReceiver;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77088a;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f77089d = {"official", "admin", "like_merge", "follow", "comment", "watch"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f77090e = {"click_push_recommend"};

    /* renamed from: f  reason: collision with root package name */
    private static f f77091f;

    /* renamed from: b  reason: collision with root package name */
    private ScreenOnPushActionReceiver f77092b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f77093c;

    public static synchronized f a() {
        synchronized (f.class) {
            if (PatchProxy.isSupport(new Object[0], null, f77088a, true, 90338, new Class[0], f.class)) {
                f fVar = (f) PatchProxy.accessDispatch(new Object[0], null, f77088a, true, 90338, new Class[0], f.class);
                return fVar;
            }
            if (f77091f == null) {
                f77091f = new f();
            }
            f fVar2 = f77091f;
            return fVar2;
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f77088a, false, 90342, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f77088a, false, 90342, new Class[0], Integer.TYPE)).intValue();
        } else if (c.a()) {
            return 3;
        } else {
            return a.a();
        }
    }

    public SharedPreferences a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77088a, false, 90339, new Class[]{Context.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context}, this, f77088a, false, 90339, new Class[]{Context.class}, SharedPreferences.class);
        }
        if (this.f77093c == null) {
            this.f77093c = com.ss.android.ugc.aweme.q.c.a(context, "screen_push", 0);
        }
        return this.f77093c;
    }

    public final int b(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, f77088a, false, 90344, new Class[]{Context.class}, Integer.TYPE)) {
            return a(context).getInt("screen_on_push_type", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f77088a, false, 90344, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public final boolean c(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f77088a, false, 90349, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((PowerManager) context2.getSystemService("power")).isScreenOn();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f77088a, false, 90349, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public final int d(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, f77088a, false, 90350, new Class[]{Context.class}, Integer.TYPE)) {
            return a(context).getInt("push_have_stored", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f77088a, false, 90350, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public final void e(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f77088a, false, 90356, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f77088a, false, 90356, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f77092b == null) {
            this.f77092b = new ScreenOnPushActionReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        context.registerReceiver(this.f77092b, intentFilter);
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f77088a, false, 90348, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f77088a, false, 90348, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("gd_label");
        if (!TextUtils.isEmpty(queryParameter)) {
            for (String equals : f77090e) {
                if (equals.equals(queryParameter)) {
                    return true;
                }
            }
        }
        String queryParameter2 = parse.getQueryParameter("label");
        if (!TextUtils.isEmpty(queryParameter2)) {
            for (String equals2 : f77089d) {
                if (equals2.equals(queryParameter2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
