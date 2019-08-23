package com.ss.android.ugc.lib.video.bitrate.regulator.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.e;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.f;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.a;
import com.ss.android.ugc.lib.video.bitrate.regulator.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f77697f;
    c[] g;

    public static class a extends a.C0823a {

        /* renamed from: e  reason: collision with root package name */
        public static ChangeQuickRedirect f77698e;

        public final e a() {
            if (PatchProxy.isSupport(new Object[0], this, f77698e, false, 90528, new Class[0], e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[0], this, f77698e, false, 90528, new Class[0], e.class);
            }
            d dVar = new d(this.f77687a, (byte) 0);
            dVar.a(this.f77688b);
            dVar.b(this.f77689c);
            dVar.a(this.f77690d);
            List list = this.f77688b;
            if (PatchProxy.isSupport(new Object[]{list}, dVar, d.f77697f, false, 90523, new Class[]{List.class}, Void.TYPE)) {
                Object[] objArr = {list};
                d dVar2 = dVar;
                PatchProxy.accessDispatch(objArr, dVar2, d.f77697f, false, 90523, new Class[]{List.class}, Void.TYPE);
            } else if (list != null && !list.isEmpty()) {
                dVar.g = new c[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    e eVar = (e) list.get(i);
                    double bitRate = (double) eVar.getBitRate();
                    double networkLower = (double) eVar.getNetworkLower();
                    Double.isNaN(networkLower);
                    double networkUpper = (double) eVar.getNetworkUpper();
                    Double.isNaN(networkUpper);
                    c cVar = new c(bitRate, networkLower * 8000.0d, networkUpper * 8000.0d);
                    dVar.g[i] = cVar;
                }
            }
            return dVar;
        }

        public a(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar) {
            super(dVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77699a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Object> f77700b = new HashMap();

        private b() {
        }

        public static b a() {
            if (PatchProxy.isSupport(new Object[0], null, f77699a, true, 90529, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], null, f77699a, true, 90529, new Class[0], b.class);
            }
            return new b();
        }

        public final b a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77699a, false, 90530, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77699a, false, 90530, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77700b.put("internet_speed", Integer.valueOf(i));
            return this;
        }
    }

    private d(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar) {
        super(dVar);
    }

    private int a(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f77697f, false, 90524, new Class[]{Map.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{map2}, this, f77697f, false, 90524, new Class[]{Map.class}, Integer.TYPE)).intValue();
        }
        Object obj = map2.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    private com.ss.android.ugc.lib.video.bitrate.regulator.a a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f77697f, false, 90525, new Class[]{Double.TYPE}, com.ss.android.ugc.lib.video.bitrate.regulator.a.class)) {
            return (com.ss.android.ugc.lib.video.bitrate.regulator.a) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f77697f, false, 90525, new Class[]{Double.TYPE}, com.ss.android.ugc.lib.video.bitrate.regulator.a.class);
        } else if (d2 <= 0.0d || this.g == null) {
            return null;
        } else {
            double d3 = Double.MAX_VALUE;
            c cVar = null;
            for (c cVar2 : this.g) {
                double abs = Math.abs(cVar2.getMedianThreshold() - d2);
                if (abs < d3) {
                    cVar = cVar2;
                    d3 = abs;
                }
            }
            if (cVar != null) {
                return new com.ss.android.ugc.lib.video.bitrate.regulator.a(cVar.mRate, false);
            }
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.ss.android.ugc.lib.video.bitrate.regulator.a.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.lib.video.bitrate.regulator.a b(double r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Double r1 = java.lang.Double.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f77697f
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Double.TYPE
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a> r6 = com.ss.android.ugc.lib.video.bitrate.regulator.a.class
            r3 = 0
            r4 = 90526(0x1619e, float:1.26854E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Double r1 = java.lang.Double.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f77697f
            r3 = 0
            r4 = 90526(0x1619e, float:1.26854E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Double.TYPE
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a> r6 = com.ss.android.ugc.lib.video.bitrate.regulator.a.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.lib.video.bitrate.regulator.a r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a) r0
            return r0
        L_0x003d:
            r0 = 0
            r2 = 0
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x008e
            java.util.List r0 = r9.f77685d
            if (r0 == 0) goto L_0x008e
            java.util.List r0 = r9.f77685d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0051
            goto L_0x008e
        L_0x0051:
            java.util.List r0 = r9.f77685d
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.lib.video.bitrate.regulator.a.b r1 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.b) r1
            if (r1 == 0) goto L_0x0057
            double r3 = r1.getSpeed()
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0057
            goto L_0x006f
        L_0x006e:
            r1 = r2
        L_0x006f:
            if (r1 != 0) goto L_0x0081
            java.util.List r0 = r9.f77685d
            java.util.List r1 = r9.f77685d
            int r1 = r1.size()
            int r1 = r1 - r7
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            com.ss.android.ugc.lib.video.bitrate.regulator.a.b r1 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.b) r1
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            return r2
        L_0x0084:
            com.ss.android.ugc.lib.video.bitrate.regulator.a r0 = new com.ss.android.ugc.lib.video.bitrate.regulator.a
            double r1 = r1.getBitrate()
            r0.<init>(r1, r7)
            return r0
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.lib.video.bitrate.regulator.b.d.b(double):com.ss.android.ugc.lib.video.bitrate.regulator.a");
    }

    /* synthetic */ d(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar, byte b2) {
        this(dVar);
    }

    private <T extends com.ss.android.ugc.lib.video.bitrate.regulator.a.c> T a(double d2, List<T> list) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), list}, this, f77697f, false, 90521, new Class[]{Double.TYPE, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class)) {
            return (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), list}, this, f77697f, false, 90521, new Class[]{Double.TYPE, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class);
        }
        r1 = null;
        if (list != null) {
            for (T t : list) {
                if (d2 >= ((double) t.getBitRate())) {
                    break;
                }
            }
        }
        return t;
    }

    private <T extends com.ss.android.ugc.lib.video.bitrate.regulator.a.c> T b(double d2, List<T> list) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), list}, this, f77697f, false, 90522, new Class[]{Double.TYPE, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class)) {
            return (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), list}, this, f77697f, false, 90522, new Class[]{Double.TYPE, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class);
        }
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    double bitRate = (double) t2.getBitRate();
                    Double.isNaN(bitRate);
                    double abs = Math.abs(bitRate - d2);
                    double bitRate2 = (double) t.getBitRate();
                    Double.isNaN(bitRate2);
                    if (abs >= Math.abs(bitRate2 - d2)) {
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    public final f a(List<? extends com.ss.android.ugc.lib.video.bitrate.regulator.a.c> list, Map<String, Object> map) {
        boolean z;
        com.ss.android.ugc.lib.video.bitrate.regulator.a aVar;
        com.ss.android.ugc.lib.video.bitrate.regulator.a.c cVar;
        List<? extends com.ss.android.ugc.lib.video.bitrate.regulator.a.c> list2 = list;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{list2, map2}, this, f77697f, false, 90519, new Class[]{List.class, Map.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{list2, map2}, this, f77697f, false, 90519, new Class[]{List.class, Map.class}, f.class);
        }
        f fVar = new f();
        if (list2 == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            fVar.f77679c = new com.ss.android.ugc.lib.video.bitrate.regulator.b(0, "bitrate list is empty...");
            return fVar;
        }
        if (this.f77686e != null) {
            double a2 = (double) a(map2);
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(a2)}, this, f77697f, false, 90527, new Class[]{Double.TYPE}, com.ss.android.ugc.lib.video.bitrate.regulator.a.class)) {
                aVar = (com.ss.android.ugc.lib.video.bitrate.regulator.a) PatchProxy.accessDispatch(new Object[]{Double.valueOf(a2)}, this, f77697f, false, 90527, new Class[]{Double.TYPE}, com.ss.android.ugc.lib.video.bitrate.regulator.a.class);
            } else if (a2 <= 0.0d || this.f77686e == null) {
                aVar = null;
            } else {
                double a3 = this.f77686e.a();
                Double.isNaN(a2);
                Double.isNaN(a2);
                Double.isNaN(a2);
                double b2 = this.f77686e.b();
                Double.isNaN(a2);
                Double.isNaN(a2);
                double d2 = (a3 * a2 * a2 * a2) + (b2 * a2 * a2);
                double c2 = this.f77686e.c();
                Double.isNaN(a2);
                aVar = new com.ss.android.ugc.lib.video.bitrate.regulator.a(Math.max(d2 + (c2 * a2) + this.f77686e.d(), this.f77686e.e()), true);
            }
        } else if (this.f77685d != null) {
            aVar = b((double) a(map2));
        } else {
            aVar = a((double) a(map2));
        }
        if (aVar != null) {
            fVar.f77681e = aVar.f77675a;
        }
        try {
            if (PatchProxy.isSupport(new Object[]{aVar, list2}, this, f77697f, false, 90520, new Class[]{com.ss.android.ugc.lib.video.bitrate.regulator.a.class, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class)) {
                cVar = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) PatchProxy.accessDispatch(new Object[]{aVar, list2}, this, f77697f, false, 90520, new Class[]{com.ss.android.ugc.lib.video.bitrate.regulator.a.class, List.class}, com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class);
            } else if (aVar != null) {
                List c3 = c(list);
                if (c3 == null || c3.isEmpty()) {
                    throw new com.ss.android.ugc.lib.video.bitrate.regulator.b(5, "Intersection bitrate list is empty.");
                } else if (aVar.f77676b) {
                    cVar = a(aVar.f77675a, c3);
                } else {
                    cVar = b(aVar.f77675a, c3);
                }
            } else if (this.f77683b != null) {
                cVar = d(list);
            } else {
                throw new com.ss.android.ugc.lib.video.bitrate.regulator.b(6, "gear config is null");
            }
            fVar.f77678b = cVar;
        } catch (com.ss.android.ugc.lib.video.bitrate.regulator.b e2) {
            fVar.f77679c = e2;
        }
        if (fVar.f77678b == null) {
            fVar.f77678b = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) list2.get(0);
        }
        return fVar;
    }
}
