package com.ss.android.ugc.aweme.property;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.g;

public abstract /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63293a;

    public static Object a(g.a aVar, g.b bVar, Object obj) {
        g.b bVar2 = bVar;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{aVar, bVar2, obj2}, null, f63293a, true, 70262, new Class[]{g.a.class, g.b.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar, bVar2, obj2}, null, f63293a, true, 70262, new Class[]{g.a.class, g.b.class, Object.class}, Object.class);
        } else if (bVar2 == null) {
            throw new NullPointerException();
        } else if (bVar2 == g.b.Boolean && !(obj2 instanceof Boolean)) {
            throw new IllegalArgumentException();
        } else if (bVar2 == g.b.Float && !(obj2 instanceof Float)) {
            throw new IllegalArgumentException();
        } else if (bVar2 == g.b.Integer && !(obj2 instanceof Integer)) {
            throw new IllegalArgumentException();
        } else if (bVar2 != g.b.Long || (obj2 instanceof Long)) {
            if (bVar2 != g.b.String || (obj2 instanceof String)) {
                return obj2;
            }
            throw new IllegalArgumentException();
        } else if (obj2 instanceof Integer) {
            return Long.valueOf(((Integer) obj2).longValue());
        } else {
            throw new IllegalArgumentException();
        }
    }
}
