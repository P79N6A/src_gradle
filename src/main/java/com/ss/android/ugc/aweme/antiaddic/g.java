package com.ss.android.ugc.aweme.antiaddic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.a.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33398a;

    /* renamed from: b  reason: collision with root package name */
    private a f33399b = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33400a;

        public final an<Long> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33400a, false, 21717, new Class[0], an.class)) {
                return SharePrefCache.inst().getLastGetRelieveAwemeTime();
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, f33400a, false, 21717, new Class[0], an.class);
        }
    };

    public final boolean a(long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f33398a, false, 21716, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f33398a, false, 21716, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], null, c.f33371a, true, 21694, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, c.f33371a, true, 21694, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!c.b()) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71779, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71779, new Class[0], Integer.TYPE)).intValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        i = 0;
                    } else {
                        i = d2.useRelieveAweme;
                    }
                }
                if (i != 1) {
                    z = false;
                }
            }
            z = true;
        }
        if (!z) {
            return false;
        }
        c a3 = c.a();
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, a3, c.f33371a, false, 21692, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            c cVar = a3;
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, cVar, c.f33371a, false, 21692, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            long b2 = a3.b(j3);
            if (b2 <= 0 || j4 <= b2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2 || !this.f33399b.b(j3)) {
            return false;
        }
        this.f33399b.a(j3);
        c.a().f33376f = true;
        return true;
    }
}
