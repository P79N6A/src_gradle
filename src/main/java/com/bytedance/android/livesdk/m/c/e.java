package com.bytedance.android.livesdk.m.c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16351a;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, c> f16352c;

    /* renamed from: b  reason: collision with root package name */
    c f16353b;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16354a = new e();
    }

    public static c c() {
        return a.f16354a;
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f16351a, false, 12661, new Class[0], Boolean.TYPE)) {
            return d().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16351a, false, 12661, new Class[0], Boolean.TYPE)).booleanValue();
    }

    static {
        HashMap hashMap = new HashMap();
        f16352c = hashMap;
        hashMap.put("VIVO", new g());
        f16352c.put("MEIZU", new d());
        f16352c.put("HUAWEI", new b());
        f16352c.put("XIAOMI", new h());
        f16352c.put("OPPO", new f());
    }

    private c d() {
        if (PatchProxy.isSupport(new Object[0], this, f16351a, false, 12662, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f16351a, false, 12662, new Class[0], c.class);
        }
        if (this.f16353b == null) {
            this.f16353b = new a();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                if (f16352c.containsKey(upperCase)) {
                    this.f16353b = f16352c.get(upperCase);
                }
            }
        }
        return this.f16353b;
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f16351a, false, 12660, new Class[0], Boolean.TYPE)) {
            return d().a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16351a, false, 12660, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Intent a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f16351a, false, 12659, new Class[]{Context.class}, Intent.class)) {
            return d().a(context2);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, this, f16351a, false, 12659, new Class[]{Context.class}, Intent.class);
    }
}
