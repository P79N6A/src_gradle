package com.ss.android.ugc.aweme.antiaddic.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.an;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f33364c = null;

    /* renamed from: e  reason: collision with root package name */
    protected static int f33365e = 12;

    /* renamed from: d  reason: collision with root package name */
    protected int f33366d;

    public abstract an<Long> a();

    public a() {
        this(5);
    }

    public a(int i) {
        this.f33366d = i;
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f33364c, false, 21718, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f33364c, false, 21718, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        a().a(Long.valueOf(j));
    }

    public final boolean b(long j) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f33364c, false, 21719, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f33364c, false, 21719, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= 0 && i < this.f33366d) {
            instance.add(5, -1);
        }
        instance.set(11, this.f33366d);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance.getTime());
        if (((Long) a().c()).longValue() >= timeInMillis) {
            z = false;
        }
        return z;
    }
}
