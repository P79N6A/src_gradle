package com.bytedance.crash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Map<d, List<a>> f19340a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f19341b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f19342c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<g> f19343d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final List<g> f19344e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<g> f19345f = new CopyOnWriteArrayList();
    public h g = null;

    /* renamed from: com.bytedance.crash.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19346a = new int[d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.crash.d[] r0 = com.bytedance.crash.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19346a = r0
                int[] r0 = f19346a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.ALL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f19346a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.ANR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f19346a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.JAVA     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f19346a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f19346a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.NATIVE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar, a aVar) {
        List list;
        if (this.f19340a.get(dVar) == null) {
            list = new ArrayList();
            this.f19340a.put(dVar, list);
        } else {
            list = this.f19340a.get(dVar);
        }
        list.add(aVar);
    }
}
