package com.bytedance.android.livesdk.feed.i;

import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdkapi.g.f;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14193a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.feed.dislike.a f14194b;

    /* renamed from: c  reason: collision with root package name */
    private final g f14195c;

    /* renamed from: d  reason: collision with root package name */
    private final k f14196d;

    /* renamed from: e  reason: collision with root package name */
    private final f f14197e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.depend.d.g f14198f;

    public c(com.bytedance.android.livesdk.feed.dislike.a aVar, g gVar, k kVar, f fVar, com.bytedance.android.livesdkapi.depend.d.g gVar2) {
        this.f14194b = aVar;
        this.f14195c = gVar;
        this.f14196d = kVar;
        this.f14197e = fVar;
        this.f14198f = gVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.core.viewholder.BaseViewHolder a(android.view.ViewGroup r21, java.lang.Object[] r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f14193a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r12] = r1
            java.lang.Class<com.bytedance.android.live.core.viewholder.BaseViewHolder> r6 = com.bytedance.android.live.core.viewholder.BaseViewHolder.class
            r3 = 0
            r4 = 8815(0x226f, float:1.2352E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0048
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f14193a
            r3 = 0
            r4 = 8815(0x226f, float:1.2352E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r12] = r1
            java.lang.Class<com.bytedance.android.live.core.viewholder.BaseViewHolder> r6 = com.bytedance.android.live.core.viewholder.BaseViewHolder.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.android.live.core.viewholder.BaseViewHolder r0 = (com.bytedance.android.live.core.viewholder.BaseViewHolder) r0
            return r0
        L_0x0048:
            com.bytedance.android.livesdk.feed.dislike.a r0 = r7.f14194b
            com.bytedance.android.livesdk.feed.g r1 = r7.f14195c
            com.bytedance.android.livesdk.feed.k r13 = r7.f14196d
            com.bytedance.android.livesdkapi.g.f r14 = r7.f14197e
            com.bytedance.android.livesdkapi.depend.d.g r2 = r7.f14198f
            android.content.Context r3 = r21.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131691229(0x7f0f06dd, float:1.9011524E38)
            android.view.View r3 = r3.inflate(r4, r8, r11)
            int r4 = r9.length
            r5 = 0
            if (r4 <= 0) goto L_0x0074
            r4 = r9[r11]
            boolean r4 = r4 instanceof com.bytedance.android.livesdk.feed.adapter.n
            if (r4 == 0) goto L_0x0074
            r4 = r9[r11]
            com.bytedance.android.livesdk.feed.adapter.n r4 = (com.bytedance.android.livesdk.feed.adapter.n) r4
            com.bytedance.android.livesdk.feed.d.c r4 = r4.a()
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            int r6 = r9.length
            if (r6 <= r12) goto L_0x0084
            r6 = r9[r12]
            boolean r6 = r6 instanceof io.reactivex.subjects.PublishSubject
            if (r6 == 0) goto L_0x0084
            r6 = r9[r12]
            io.reactivex.subjects.PublishSubject r6 = (io.reactivex.subjects.PublishSubject) r6
            r15 = r6
            goto L_0x0085
        L_0x0084:
            r15 = r5
        L_0x0085:
            int r6 = r9.length
            if (r6 <= r10) goto L_0x0095
            r6 = r9[r10]
            boolean r6 = r6 instanceof io.reactivex.subjects.PublishSubject
            if (r6 == 0) goto L_0x0095
            r6 = r9[r10]
            io.reactivex.subjects.PublishSubject r6 = (io.reactivex.subjects.PublishSubject) r6
            r17 = r6
            goto L_0x0097
        L_0x0095:
            r17 = r5
        L_0x0097:
            int r6 = r9.length
            r8 = 3
            if (r6 <= r8) goto L_0x00a8
            r6 = r9[r8]
            boolean r6 = r6 instanceof io.reactivex.subjects.PublishSubject
            if (r6 == 0) goto L_0x00a8
            r6 = r9[r8]
            io.reactivex.subjects.PublishSubject r6 = (io.reactivex.subjects.PublishSubject) r6
            r18 = r6
            goto L_0x00aa
        L_0x00a8:
            r18 = r5
        L_0x00aa:
            int r6 = r9.length
            r8 = 4
            if (r6 <= r8) goto L_0x00b8
            r6 = r9[r8]
            boolean r6 = r6 instanceof io.reactivex.subjects.PublishSubject
            if (r6 == 0) goto L_0x00b8
            r5 = r9[r8]
            io.reactivex.subjects.PublishSubject r5 = (io.reactivex.subjects.PublishSubject) r5
        L_0x00b8:
            r16 = r5
            com.bytedance.android.livesdk.feed.live.SmallLiveViewHolder r5 = new com.bytedance.android.livesdk.feed.live.SmallLiveViewHolder
            r8 = r5
            r9 = r3
            r10 = r0
            r11 = r1
            r12 = r4
            r19 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.i.c.a(android.view.ViewGroup, java.lang.Object[]):com.bytedance.android.live.core.viewholder.BaseViewHolder");
    }
}
