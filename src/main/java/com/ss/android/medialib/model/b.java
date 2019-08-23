package com.ss.android.medialib.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29706a;

    /* renamed from: b  reason: collision with root package name */
    public long f29707b;

    /* renamed from: c  reason: collision with root package name */
    public double f29708c;

    public static int a(List<? extends b> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, null, f29706a, true, 17472, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, null, f29706a, true, 17472, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (list == null || list.size() <= 0) {
            return 0;
        } else {
            for (b bVar : list) {
                long j = bVar.f29707b;
                double d2 = bVar.f29708c;
                double d3 = (double) j;
                Double.isNaN(d3);
                i = (int) (((long) i) + ((long) ((d3 * 1.0d) / d2)));
            }
            return i;
        }
    }

    public b(long j, double d2) {
        this.f29707b = j;
        this.f29708c = d2;
    }
}
