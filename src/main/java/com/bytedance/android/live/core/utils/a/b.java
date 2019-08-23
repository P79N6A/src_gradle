package com.bytedance.android.live.core.utils.a;

import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.utils.a.a.d;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8227a;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, d> f8228b = new HashMap<String, d>() {
        {
            put("HUAWEI", new d());
        }
    };

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f8227a, true, 1406, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8227a, true, 1406, new Class[0], Boolean.TYPE)).booleanValue();
        }
        d dVar = f8228b.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return false;
        }
        return dVar.a();
    }

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f8227a, true, 1405, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f8227a, true, 1405, new Class[0], Integer.TYPE)).intValue();
        }
        Configuration configuration = ac.a().getConfiguration();
        if (PatchProxy.isSupport(new Object[]{configuration}, null, f8227a, true, 1404, new Class[]{Configuration.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{configuration}, null, f8227a, true, 1404, new Class[]{Configuration.class}, Integer.TYPE)).intValue();
        }
        d dVar = f8228b.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return -1;
        }
        return dVar.a(configuration);
    }
}
