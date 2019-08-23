package com.ss.android.ugc.aweme.common.g;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.apt.sharedpref.ad;
import com.ss.android.ugc.aweme.base.apt.sharedpref.ai;
import com.ss.android.ugc.aweme.base.apt.sharedpref.aj;
import com.ss.android.ugc.aweme.base.apt.sharedpref.ak;
import com.ss.android.ugc.aweme.base.apt.sharedpref.p;
import com.ss.android.ugc.aweme.effect.b;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d;
import com.ss.android.ugc.aweme.shortvideo.ho;
import com.ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40217a;

    public static <T> T a(Context context, Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context, cls2}, null, f40217a, true, 33472, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context, cls2}, null, f40217a, true, 33472, new Class[]{Context.class, Class.class}, Object.class);
        }
        if (PatchProxy.isSupport(new Object[]{context, cls2}, null, com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34528a, true, 24146, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context, cls2}, null, com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34528a, true, 24146, new Class[]{Context.class, Class.class}, Object.class);
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null || cls2 == null || !cls.isInterface()) {
                return null;
            }
            if (b.class.equals(cls2)) {
                T t = com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.get(cls2);
                if (t == null || !(t instanceof p)) {
                    t = new p(applicationContext);
                    com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.put(cls2, t);
                }
                return t;
            } else if (d.class.equals(cls2)) {
                T t2 = com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.get(cls2);
                if (t2 == null || !(t2 instanceof aj)) {
                    t2 = new aj(applicationContext);
                    com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.put(cls2, t2);
                }
                return t2;
            } else if (IPublishPermissionCache.class.equals(cls2)) {
                T t3 = com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.get(cls2);
                if (t3 == null || !(t3 instanceof ak)) {
                    t3 = new ak(applicationContext);
                    com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.put(cls2, t3);
                }
                return t3;
            } else if (ho.class.equals(cls2)) {
                T t4 = com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.get(cls2);
                if (t4 == null || !(t4 instanceof ai)) {
                    t4 = new ai(applicationContext);
                    com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.put(cls2, t4);
                }
                return t4;
            } else if (m.class.equals(cls2)) {
                T t5 = com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.get(cls2);
                if (t5 == null || !(t5 instanceof ad)) {
                    t5 = new ad(applicationContext);
                    com.ss.android.ugc.aweme.base.apt.sharedpref.a.f34529b.put(cls2, t5);
                }
                return t5;
            }
        }
        return null;
    }
}
