package com.bytedance.android.livesdk.j.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public abstract class a<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15647a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f15648b = new HashMap();

    public final Map<String, String> a() {
        return this.f15648b;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15647a, false, 10934, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f15647a, false, 10934, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f15648b.remove(str2);
    }

    public void a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f15647a, false, 10930, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f15647a, false, 10930, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        map2.putAll(this.f15648b);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f15647a, false, 10932, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f15647a, false, 10932, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f15648b.put(str3, str4);
    }

    public void a(Map<String, String> map, T t) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2, t}, this, f15647a, false, 10931, new Class[]{Map.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, t}, this, f15647a, false, 10931, new Class[]{Map.class, Object.class}, Void.TYPE);
            return;
        }
        map2.putAll(this.f15648b);
    }
}
