package com.ss.android.ugc.aweme.story.base.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71896a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b<Object>> f71897b;

    /* renamed from: com.ss.android.ugc.aweme.story.base.a.a$a  reason: collision with other inner class name */
    static class C0749a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71898a = new a((byte) 0);
    }

    public static a a() {
        return C0749a.f71898a;
    }

    private a() {
        this.f71897b = new HashMap();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final b<Object> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71896a, false, 82217, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f71896a, false, 82217, new Class[]{String.class}, b.class);
        }
        return a(str2, Object.class);
    }

    public final synchronized <T> b<T> a(String str, Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{str, cls}, this, f71896a, false, 82216, new Class[]{String.class, Class.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str, cls}, this, f71896a, false, 82216, new Class[]{String.class, Class.class}, b.class);
        }
        if (!this.f71897b.containsKey(str)) {
            this.f71897b.put(str, new b());
        }
        return this.f71897b.get(str);
    }
}
