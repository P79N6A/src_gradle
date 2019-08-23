package com.ss.android.ugc.lib.video.bitrate.regulator.b;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.b;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.c;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.d;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77682a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f77683b;

    /* renamed from: c  reason: collision with root package name */
    protected List<? extends e> f77684c;

    /* renamed from: d  reason: collision with root package name */
    protected List<? extends b> f77685d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.lib.video.bitrate.regulator.a.a f77686e;

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.a$a  reason: collision with other inner class name */
    public static abstract class C0823a {

        /* renamed from: a  reason: collision with root package name */
        protected d f77687a;

        /* renamed from: b  reason: collision with root package name */
        protected List<? extends e> f77688b;

        /* renamed from: c  reason: collision with root package name */
        protected List<? extends b> f77689c;

        /* renamed from: d  reason: collision with root package name */
        protected com.ss.android.ugc.lib.video.bitrate.regulator.a.a f77690d;

        public abstract e a();

        public final C0823a a(com.ss.android.ugc.lib.video.bitrate.regulator.a.a aVar) {
            this.f77690d = aVar;
            return this;
        }

        public final C0823a b(List<? extends b> list) {
            this.f77689c = list;
            return this;
        }

        public C0823a(d dVar) {
            this.f77687a = dVar;
        }

        public final C0823a a(List<? extends e> list) {
            this.f77688b = list;
            return this;
        }
    }

    public final void a(com.ss.android.ugc.lib.video.bitrate.regulator.a.a aVar) {
        this.f77686e = aVar;
    }

    public final void b(List<? extends b> list) {
        this.f77685d = list;
    }

    public a(d dVar) {
        this.f77683b = dVar;
    }

    public final void a(List<? extends e> list) {
        this.f77684c = list;
    }

    public final <T extends c> List<T> c(List<T> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, f77682a, false, 90495, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f77682a, false, 90495, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.f77683b == null || list.isEmpty()) {
            return arrayList;
        }
        Pair<Double, Double> d2 = this.f77683b.d();
        Set<String> b2 = this.f77683b.b();
        if (d2 == null || this.f77683b.c() <= 0.0d) {
            z = false;
        }
        for (T t : list) {
            if (z) {
                double bitRate = (double) t.getBitRate();
                if (bitRate >= ((Double) d2.first).doubleValue() && bitRate <= ((Double) d2.second).doubleValue()) {
                    arrayList.add(t);
                }
            } else if (b2 != null && b2.contains(t.getGearName())) {
                arrayList.add(t);
            }
        }
        if (arrayList.isEmpty()) {
            if (z) {
                c cVar = null;
                for (T t2 : list) {
                    if (cVar != null) {
                        double bitRate2 = (double) t2.getBitRate();
                        double c2 = this.f77683b.c();
                        Double.isNaN(bitRate2);
                        double abs = Math.abs(bitRate2 - c2);
                        double bitRate3 = (double) cVar.getBitRate();
                        double c3 = this.f77683b.c();
                        Double.isNaN(bitRate3);
                        if (abs >= Math.abs(bitRate3 - c3)) {
                        }
                    }
                    cVar = t2;
                }
                arrayList.add(cVar);
            } else {
                arrayList.add(list.get(0));
            }
        }
        return arrayList;
    }

    public final <T extends c> T d(List<T> list) throws com.ss.android.ugc.lib.video.bitrate.regulator.b {
        if (PatchProxy.isSupport(new Object[]{list}, this, f77682a, false, 90496, new Class[]{List.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{list}, this, f77682a, false, 90496, new Class[]{List.class}, c.class);
        }
        T t = null;
        String a2 = this.f77683b.a();
        double c2 = this.f77683b.c();
        if (c2 <= 0.0d) {
            for (T t2 : list) {
                if (TextUtils.equals(t2.getGearName(), a2)) {
                    return t2;
                }
            }
            throw new com.ss.android.ugc.lib.video.bitrate.regulator.b(4, "defaultGearName = " + a2 + " bitrates = " + list.toString());
        }
        double d2 = Double.MAX_VALUE;
        for (T t3 : list) {
            double bitRate = (double) t3.getBitRate();
            Double.isNaN(bitRate);
            double abs = Math.abs(bitRate - c2);
            if (d2 > abs) {
                t = t3;
                d2 = abs;
            }
        }
        return t;
    }
}
