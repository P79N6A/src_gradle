package com.bytedance.android.live.core.utils.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.android.live.core.utils.a.a.b;
import com.bytedance.android.live.core.utils.a.a.c;
import com.bytedance.android.live.core.utils.a.a.d;
import com.bytedance.android.live.core.utils.a.a.e;
import com.bytedance.android.live.core.utils.a.a.f;
import com.bytedance.android.live.core.utils.a.a.g;
import com.bytedance.android.live.core.utils.a.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8214a;

    /* renamed from: c  reason: collision with root package name */
    static Map<String, c> f8215c = new HashMap<String, c>() {
        {
            put("OPPO", new e());
            put("VIVO", new g());
            put("HISENSE", new b());
            put("HUAWEI", new d());
            put("XIAOMI", new h());
            put("ASUS", new com.bytedance.android.live.core.utils.a.a.a());
            put("ONEPLUS", new f());
        }
    };

    /* renamed from: d  reason: collision with root package name */
    static Map<String, c> f8216d = new HashMap<String, c>() {
        {
            put("HONOR", new c());
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public boolean f8217b;

    public a(Context context) {
        boolean z;
        if (b(context) || a(context)) {
            z = true;
        } else {
            z = false;
        }
        this.f8217b = z;
    }

    private boolean a(Context context) {
        boolean z;
        boolean z2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f8214a, false, 1402, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f8214a, false, 1402, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String trim = Build.MANUFACTURER.toUpperCase().trim();
            String trim2 = Build.BRAND.toUpperCase().trim();
            c cVar = f8215c.get(trim);
            c cVar2 = f8216d.get(trim2);
            if (cVar == null || !cVar.a(context2)) {
                z = false;
            } else {
                z = true;
            }
            if (cVar2 == null || cVar == cVar2 || !cVar2.a(context2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f8214a, false, 1403, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f8214a, false, 1403, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!(context2 instanceof Activity) || Build.VERSION.SDK_INT < 28) {
            return false;
        } else {
            View decorView = ((Activity) context2).getWindow().getDecorView();
            try {
                Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
                Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
                List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
                if (list == null || list.size() <= 0) {
                    return false;
                }
                return true;
            } catch (Exception e2) {
                com.ss.b.a.a.b("DigHoleCheck", Log.getStackTraceString(e2));
                return false;
            }
        }
    }
}
