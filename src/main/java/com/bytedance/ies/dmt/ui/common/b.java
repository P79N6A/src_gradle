package com.bytedance.ies.dmt.ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f20312a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static b f20313a = new b((byte) 0);
    }

    public static boolean a(int i) {
        return i == 1;
    }

    public static b a() {
        return a.f20313a;
    }

    private b() {
        this.f20312a = 1;
    }

    @Deprecated
    public static boolean c() {
        return a((Context) null);
    }

    @Deprecated
    public static boolean b() {
        if (a().f20312a == 1) {
            return true;
        }
        return false;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static boolean a(Context context) {
        if (a().f20312a == 0 || b(context)) {
            return true;
        }
        return false;
    }

    private static boolean b(Context context) {
        Activity activity;
        Context context2 = context;
        while (true) {
            activity = null;
            if (context2 != null) {
                if (!(context2 instanceof Activity)) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    activity = (Activity) context2;
                    break;
                }
            } else {
                break;
            }
        }
        if (!(activity instanceof com.bytedance.ies.dmt.ui.base.a) || ((com.bytedance.ies.dmt.ui.base.a) context).a() != 0) {
            return false;
        }
        return true;
    }
}
