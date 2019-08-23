package com.ss.android.ugc.aweme.antiaddic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.a.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33396a;

    /* renamed from: b  reason: collision with root package name */
    private b f33397b = new b();

    public final boolean a(long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f33396a, false, 21715, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f33396a, false, 21715, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], null, c.f33371a, true, 21695, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, c.f33371a, true, 21695, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!c.b()) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71780, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71780, new Class[0], Integer.TYPE)).intValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        i = 0;
                    } else {
                        i = d2.useRelieveToast;
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
        b bVar = this.f33397b;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, bVar, b.f33367a, false, 21720, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, bVar, b.f33367a, false, 21720, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            long a3 = bVar.a();
            if (a3 < 0 || j3 - bVar.f33368b <= a3) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2 && j4 > this.f33397b.a() && this.f33397b.a() > 0) {
            b bVar2 = this.f33397b;
            bVar2.f33368b = j3;
            bVar2.f33369c++;
            c.a().g = String.valueOf(((j4 / this.f33397b.a()) * this.f33397b.a()) / 60000);
        }
        return false;
    }
}
