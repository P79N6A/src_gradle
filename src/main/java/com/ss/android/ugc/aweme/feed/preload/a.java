package com.ss.android.ugc.aweme.feed.preload;

import a.i;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;

public abstract class a<Data> implements c<Data> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45766a;

    /* renamed from: b  reason: collision with root package name */
    public Data f45767b;

    /* renamed from: c  reason: collision with root package name */
    private i<Data> f45768c;

    public abstract void a(@Nullable Data data) throws Exception;

    public void b() {
        this.f45768c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|(2:10|11)|12|13|(1:15)|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (com.ss.android.ugc.aweme.g.a.a() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[Catch:{ Exception -> 0x0049 }] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Data a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f45766a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 41963(0xa3eb, float:5.8803E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f45766a
            r5 = 0
            r6 = 41963(0xa3eb, float:5.8803E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0028:
            a.i<Data> r0 = r9.f45768c
            if (r0 != 0) goto L_0x002e
            r0 = 0
            return r0
        L_0x002e:
            a.i<Data> r0 = r9.f45768c
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x003b
            a.i<Data> r0 = r9.f45768c     // Catch:{ InterruptedException -> 0x003b }
            r0.g()     // Catch:{ InterruptedException -> 0x003b }
        L_0x003b:
            a.i<Data> r0 = r9.f45768c     // Catch:{ Exception -> 0x0049 }
            boolean r0 = r0.d()     // Catch:{ Exception -> 0x0049 }
            if (r0 != 0) goto L_0x0050
            Data r0 = r9.f45767b     // Catch:{ Exception -> 0x0049 }
            r9.a(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()
            if (r1 != 0) goto L_0x0056
        L_0x0050:
            r9.b()
            Data r0 = r9.f45767b
            return r0
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.preload.a.a():java.lang.Object");
    }
}
