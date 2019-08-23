package com.ss.android.ugc.aweme.d.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.an;

public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41072c;

    /* renamed from: a  reason: collision with root package name */
    private long f41073a;

    /* renamed from: b  reason: collision with root package name */
    private int f41074b;

    public abstract an<Long> a();

    public abstract an<Integer> b();

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f41072c, false, 25665, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f41072c, false, 25665, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        a().a(Long.valueOf(j));
        b().a(Integer.valueOf(((Integer) b().c()).intValue() + 1));
    }

    public final boolean b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f41072c, false, 25666, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f41072c, false, 25666, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (j - ((Long) a().c()).longValue() <= this.f41073a * 1000 || ((Integer) b().c()).intValue() >= this.f41074b) {
            return false;
        } else {
            return true;
        }
    }

    public a(long j, int i) {
        this.f41073a = j;
        this.f41074b = i;
    }
}
