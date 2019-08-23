package com.ss.android.ugc.aweme.arch;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34342a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<K, V> f34343b = new HashMap<>();

    public final <T> T a(K k) {
        K k2 = k;
        if (PatchProxy.isSupport(new Object[]{k2}, this, f34342a, false, 23762, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k2}, this, f34342a, false, 23762, new Class[]{Object.class}, Object.class);
        }
        T t = this.f34343b.get(k2);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final b<K, V> a(K k, V v) {
        if (PatchProxy.isSupport(new Object[]{k, v}, this, f34342a, false, 23763, new Class[]{Object.class, Object.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{k, v}, this, f34342a, false, 23763, new Class[]{Object.class, Object.class}, b.class);
        }
        this.f34343b.put(k, v);
        return this;
    }
}
