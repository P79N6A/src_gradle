package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.h;
import java.util.ArrayList;
import java.util.List;

public final class f implements com.google.common.a.f<SearchChallenge, h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68806a;

    public static ArrayList<h> a(List<SearchChallenge> list) {
        List<SearchChallenge> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f68806a, true, 80105, new Class[]{List.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{list2}, null, f68806a, true, 80105, new Class[]{List.class}, ArrayList.class);
        } else if (list2 == null) {
            return null;
        } else {
            return az.a((Iterable<? extends E>) az.a(list2, new f()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.ArrayList<T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object apply(@javax.annotation.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            com.ss.android.ugc.aweme.challenge.model.SearchChallenge r0 = (com.ss.android.ugc.aweme.challenge.model.SearchChallenge) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f68806a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.challenge.model.SearchChallenge> r3 = com.ss.android.ugc.aweme.challenge.model.SearchChallenge.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.h> r8 = com.ss.android.ugc.aweme.shortvideo.h.class
            r5 = 0
            r6 = 80104(0x138e8, float:1.1225E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f68806a
            r13 = 0
            r14 = 80104(0x138e8, float:1.1225E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.challenge.model.SearchChallenge> r0 = com.ss.android.ugc.aweme.challenge.model.SearchChallenge.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.h> r16 = com.ss.android.ugc.aweme.shortvideo.h.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.shortvideo.h r0 = (com.ss.android.ugc.aweme.shortvideo.h) r0
            return r0
        L_0x003b:
            r2 = 0
            if (r0 != 0) goto L_0x003f
            return r2
        L_0x003f:
            com.ss.android.ugc.aweme.shortvideo.h r3 = new com.ss.android.ugc.aweme.shortvideo.h
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.o.a r4 = new com.ss.android.ugc.aweme.shortvideo.o.a
            r4.<init>()
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r0.challenge
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.apply((com.ss.android.ugc.aweme.discover.model.Challenge) r5)
            r3.f68037a = r4
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r4 = r0.segments
            if (r4 == 0) goto L_0x009b
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r4 = r0.segments
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r4
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.o.g.f68807a
            r13 = 1
            r14 = 80107(0x138eb, float:1.12254E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r15[r9] = r5
            java.lang.Class<java.util.ArrayList> r16 = java.util.ArrayList.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x008b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r4
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.o.g.f68807a
            r13 = 1
            r14 = 80107(0x138eb, float:1.12254E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r15[r9] = r1
            java.lang.Class<java.util.ArrayList> r16 = java.util.ArrayList.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L_0x009b
        L_0x008b:
            if (r4 != 0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.o.g r1 = new com.ss.android.ugc.aweme.shortvideo.o.g
            r1.<init>()
            java.util.List r1 = com.google.common.collect.az.a(r4, r1)
            java.util.ArrayList r2 = com.google.common.collect.az.a((java.lang.Iterable<? extends E>) r1)
        L_0x009b:
            r3.f68038b = r2
            boolean r0 = r0.isFake
            r3.f68039c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.o.f.apply(java.lang.Object):java.lang.Object");
    }
}
