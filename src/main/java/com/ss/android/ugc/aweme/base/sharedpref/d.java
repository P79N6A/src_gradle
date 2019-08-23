package com.ss.android.ugc.aweme.base.sharedpref;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34882a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, f> f34883b = new HashMap<>();

    public static f a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f34882a, true, 24869, new Class[]{Context.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f34882a, true, 24869, new Class[]{Context.class, String.class}, f.class);
        }
        f fVar = f34883b.get(str2);
        if (fVar == null) {
            fVar = new f(context.getApplicationContext(), str2);
            f34883b.put(str2, fVar);
        }
        return fVar;
    }
}
