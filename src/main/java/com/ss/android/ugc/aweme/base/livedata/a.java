package com.ss.android.ugc.aweme.base.livedata;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34757a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b<Object>> f34758b;

    /* renamed from: com.ss.android.ugc.aweme.base.livedata.a$a  reason: collision with other inner class name */
    static class C0447a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34759a = new a((byte) 0);
    }

    public static a a() {
        return C0447a.f34759a;
    }

    private a() {
        this.f34758b = new HashMap();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final b<Object> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34757a, false, 24656, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f34757a, false, 24656, new Class[]{String.class}, b.class);
        }
        return a(str2, Object.class);
    }

    public final synchronized <T> b<T> a(String str, Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{str, cls}, this, f34757a, false, 24655, new Class[]{String.class, Class.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str, cls}, this, f34757a, false, 24655, new Class[]{String.class, Class.class}, b.class);
        }
        if (!this.f34758b.containsKey(str)) {
            this.f34758b.put(str, new b());
        }
        return this.f34758b.get(str);
    }
}
