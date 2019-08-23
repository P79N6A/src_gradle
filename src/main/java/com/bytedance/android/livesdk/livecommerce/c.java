package com.bytedance.android.livesdk.livecommerce;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16117a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f16117a, true, 10434, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f16117a, true, 10434, new Class[0], String.class);
        }
        long c2 = h.f().l().c();
        if (c2 > 0) {
            return String.valueOf(c2);
        }
        return null;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f16117a, true, 10435, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f16117a, true, 10435, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return h.f().l().b().isWithCommercePermission();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Context c() {
        if (PatchProxy.isSupport(new Object[0], null, f16117a, true, 10438, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f16117a, true, 10438, new Class[0], Context.class);
        }
        return h.f().a().a();
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f16117a, true, 10441, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f16117a, true, 10441, new Class[0], Boolean.TYPE)).booleanValue();
        }
        h.f().a();
        return false;
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f16117a, true, 10439, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f16117a, true, 10439, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        a j = h.f().j();
        if (!(context2 == null || j == null || TextUtils.isEmpty(str))) {
            j.a(context2, str2, new Bundle());
        }
    }

    public static void b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f16117a, true, 10440, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f16117a, true, 10440, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        IHostApp c2 = h.f().c();
        if (!(c2 == null || context2 == null)) {
            c2.a(context2, str2, 0);
        }
    }

    public static void a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f16117a, true, 10442, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f16117a, true, 10442, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        h.f().e().a(str2, map2);
    }
}
