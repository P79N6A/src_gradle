package com.ss.android.ugc.aweme.im.sdk.resources;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.e;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52289a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, e> f52290b = new HashMap<>();

    public static e a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f52289a, true, 53102, new Class[]{String.class}, e.class)) {
            return f52290b.get(str2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{str2}, null, f52289a, true, 53102, new Class[]{String.class}, e.class);
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52289a, true, 53104, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52289a, true, 53104, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f52290b.remove(str2);
    }

    public static void a(String str, e eVar) {
        String str2 = str;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{str2, eVar2}, null, f52289a, true, 53103, new Class[]{String.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, eVar2}, null, f52289a, true, 53103, new Class[]{String.class, e.class}, Void.TYPE);
            return;
        }
        f52290b.put(str2, eVar2);
    }
}
