package com.ss.android.ugc.aweme.poi.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.e.c;
import java.util.ArrayList;
import java.util.List;

public final class h extends aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59918a;

    public h() {
        this(65441);
    }

    public h(int i) {
        super(i);
    }

    public static List<Aweme> a(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f59918a, true, 65009, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f59918a, true, 65009, new Class[]{List.class}, List.class);
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (b next : list) {
                if (next.getFeedType() == 65280) {
                    arrayList.add(next.getAweme());
                }
            }
            return arrayList;
        }
    }

    public final void setItems(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f59918a, false, 65008, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f59918a, false, 65008, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new c();
        }
        ((c) this.mData).f57102b = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadMoreList(java.lang.Object... r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59918a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65007(0xfdef, float:9.1094E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59918a
            r3 = 0
            r4 = 65007(0xfdef, float:9.1094E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r11 = 2
            boolean r0 = a(r11, r8)
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            r0 = r8[r9]
            com.ss.android.ugc.aweme.poi.b r0 = (com.ss.android.ugc.aweme.poi.b) r0
            java.lang.String r13 = r0.f59732a
            int r14 = r0.j
            java.lang.String r8 = r0.f59734c
            r12 = 3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r10] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59918a
            r3 = 0
            r4 = 65005(0xfded, float:9.1091E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r10] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59918a
            r3 = 0
            r4 = 65005(0xfded, float:9.1091E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x009d:
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r12 = f59857d
            r15 = 20
            java.util.List r0 = r19.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 0
        L_0x00ad:
            r16 = r0
            goto L_0x00b7
        L_0x00b0:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.newfollow.e.c r0 = (com.ss.android.ugc.aweme.newfollow.e.c) r0
            long r0 = r0.f57104d
            goto L_0x00ad
        L_0x00b7:
            r18 = r8
            a.i r0 = r12.getAwemeList(r13, r14, r15, r16, r18)
            com.ss.android.ugc.aweme.poi.model.g r1 = new com.ss.android.ugc.aweme.poi.model.g
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.mHandler
            r3 = 65282(0xff02, float:9.148E-41)
            r4 = 0
            r1.<init>(r2, r3, r4)
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.h.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshList(java.lang.Object... r21) {
        /*
            r20 = this;
            r0 = r21
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59918a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 65006(0xfdee, float:9.1093E-41)
            r3 = r20
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59918a
            r13 = 0
            r14 = 65006(0xfdee, float:9.1093E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r2 = 2
            boolean r3 = a(r2, r0)
            if (r3 != 0) goto L_0x003e
            return
        L_0x003e:
            r0 = r0[r1]
            com.ss.android.ugc.aweme.poi.b r0 = (com.ss.android.ugc.aweme.poi.b) r0
            java.lang.String r11 = r0.f59732a
            int r12 = r0.j
            java.lang.String r0 = r0.f59734c
            r3 = 3
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r9] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r13[r1] = r4
            r13[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = f59918a
            r16 = 0
            r17 = 65004(0xfdec, float:9.109E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r9] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r1] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x00a1
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r9] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r13[r1] = r4
            r13[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = f59918a
            r16 = 0
            r17 = 65004(0xfdec, float:9.109E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r0[r1] = r3
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r2] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00a1:
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r10 = f59857d
            r13 = 20
            r14 = 0
            r16 = r0
            a.i r0 = r10.getAwemeList(r11, r12, r13, r14, r16)
            com.ss.android.ugc.aweme.poi.model.g r1 = new com.ss.android.ugc.aweme.poi.model.g
            r2 = r20
            com.bytedance.common.utility.collection.WeakHandler r3 = r2.mHandler
            r4 = 65281(0xff01, float:9.1478E-41)
            r5 = 0
            r1.<init>(r3, r4, r5)
            java.util.concurrent.Executor r3 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.h.refreshList(java.lang.Object[]):void");
    }
}
