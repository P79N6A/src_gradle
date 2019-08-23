package com.ss.android.ugc.aweme.feed.share.command;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.share.a.f;
import java.util.ArrayList;

public class CommandObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45861a;

    /* renamed from: b  reason: collision with root package name */
    private static CommandObserver f45862b;

    /* renamed from: c  reason: collision with root package name */
    private static String f45863c;

    @UiThread
    public static CommandObserver b() {
        return f45862b;
    }

    @UiThread
    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f45861a, true, 42143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f45861a, true, 42143, new Class[0], Void.TYPE);
            return;
        }
        if (f45862b == null) {
            f45862b = new CommandObserver();
            ProcessLifecycleOwner.get().getLifecycle().addObserver(f45862b);
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f45861a, true, 42144, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f45861a, true, 42144, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return str2.startsWith("tt090_");
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45861a, false, 42147, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45861a, false, 42147, new Class[]{String.class}, Void.TYPE);
        } else if (a(str)) {
            f.b((Context) k.a());
            a.a(new c(this, str2));
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f45861a, false, 42153, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f45861a, false, 42153, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        switch (event) {
            case ON_RESUME:
                if (PatchProxy.isSupport(new Object[0], this, f45861a, false, 42145, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45861a, false, 42145, new Class[0], Void.TYPE);
                    break;
                } else {
                    k a2 = k.a();
                    if (PatchProxy.isSupport(new Object[]{a2}, this, f45861a, false, 42146, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{a2}, this, f45861a, false, 42146, new Class[]{Context.class}, Void.TYPE);
                        break;
                    } else if (f.f64583b && !TimeLockRuler.isTeenModeON()) {
                        String str = f45863c;
                        f45863c = null;
                        b.b().post(new b(this, a2, str));
                        return;
                    }
                }
            case ON_STOP:
                if (!PatchProxy.isSupport(new Object[0], this, f45861a, false, 42151, new Class[0], Void.TYPE)) {
                    f.a(true);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f45861a, false, 42151, new Class[0], Void.TYPE);
                    return;
                }
        }
    }

    public final boolean a(String str, String str2, int i) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, 0}, this, f45861a, false, 42150, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str5, 0}, this, f45861a, false, 42150, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            k a2 = k.a();
            if (PatchProxy.isSupport(new Object[]{a2}, null, f.f64582a, true, 73454, new Class[]{Context.class}, String.class)) {
                str3 = (String) PatchProxy.accessDispatch(new Object[]{a2}, null, f.f64582a, true, 73454, new Class[]{Context.class}, String.class);
            } else if (a2 == null || a2.getApplicationContext() == null) {
                str3 = "";
            } else {
                SharedPreferences a3 = c.a(a2.getApplicationContext(), "share_command", 0);
                if (a3 != null) {
                    str3 = a3.getString("command", "");
                } else {
                    str3 = "";
                }
            }
            if (!TextUtils.equals(str4, str3)) {
                b(str4, str5, 0);
                f.a((Context) k.a());
                return true;
            }
            f.a((Context) k.a(), "");
            f.a((Context) k.a());
            return false;
        }
    }

    public final void b(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f45861a, false, 42152, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f45861a, false, 42152, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h());
        arrayList.add(new n());
        arrayList.add(new f());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((com.ss.android.ugc.aweme.share.a.a) arrayList.get(i2)).a(str3, str4, i);
        }
    }
}
