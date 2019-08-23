package com.ss.android.ugc.aweme.feed.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.cl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46046a;

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, e> f46047d;

    /* renamed from: e  reason: collision with root package name */
    private static f f46048e = new f();

    /* renamed from: b  reason: collision with root package name */
    public List<cl> f46049b;

    /* renamed from: c  reason: collision with root package name */
    public List<Object> f46050c;

    private f() {
    }

    public static f a() {
        return f46048e;
    }

    static {
        HashMap hashMap = new HashMap();
        f46047d = hashMap;
        hashMap.put("weixin", new l());
        f46047d.put("weixin_moments", new k());
        f46047d.put("toutiao", new h());
        f46047d.put("rocket", new c());
        f46047d.put("rocket_space", new d());
        f46047d.put("qq", new a());
        f46047d.put("qzone", new b());
        f46047d.put("weibo", new j());
    }

    public final e a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f46046a, false, 42104, new Class[]{String.class}, e.class)) {
            return f46047d.get(str2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{str2}, this, f46046a, false, 42104, new Class[]{String.class}, e.class);
    }
}
