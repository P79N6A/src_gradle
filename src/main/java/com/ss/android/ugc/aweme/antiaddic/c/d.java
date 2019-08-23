package com.ss.android.ugc.aweme.antiaddic.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.a;
import com.ss.android.ugc.aweme.antiaddic.e;
import com.ss.android.ugc.aweme.app.x;
import java.util.Calendar;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33383a;

    public final boolean a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f33383a, false, 22106, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f33383a, false, 22106, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin() || j4 < 0) {
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f33383a, false, 22107, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33383a, false, 22107, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance.setTimeInMillis(((Long) x.a().af().c()).longValue());
                instance2.setTimeInMillis(System.currentTimeMillis());
                int i = instance.get(1);
                int i2 = instance2.get(1);
                if (i2 <= i && (i2 != i || instance2.get(6) - instance.get(6) <= 0)) {
                    z = false;
                }
            }
            if (z) {
                x.a().ag().a(0L);
                x.a().ah().a(0L);
                x.a().ai().a(Boolean.FALSE);
            }
            x.a().ag().a(Long.valueOf(((Long) x.a().ag().c()).longValue() + ((long) e.d())));
            x.a().af().a(Long.valueOf(System.currentTimeMillis()));
            return false;
        }
    }
}
