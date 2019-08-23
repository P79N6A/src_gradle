package com.bytedance.android.livesdk.feed.i;

import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.n;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14201a;

    /* renamed from: b  reason: collision with root package name */
    private final n f14202b;

    public e(n nVar) {
        this.f14202b = nVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.core.viewholder.BaseViewHolder a(android.view.ViewGroup r20, java.lang.Object[] r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f14201a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class<com.bytedance.android.live.core.viewholder.BaseViewHolder> r9 = com.bytedance.android.live.core.viewholder.BaseViewHolder.class
            r6 = 0
            r7 = 8817(0x2271, float:1.2355E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f14201a
            r15 = 0
            r16 = 8817(0x2271, float:1.2355E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class<com.bytedance.android.live.core.viewholder.BaseViewHolder> r18 = com.bytedance.android.live.core.viewholder.BaseViewHolder.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.android.live.core.viewholder.BaseViewHolder r0 = (com.bytedance.android.live.core.viewholder.BaseViewHolder) r0
            return r0
        L_0x0048:
            r3 = r19
            com.bytedance.android.livesdk.feed.n r4 = r3.f14202b
            android.content.Context r5 = r20.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131691345(0x7f0f0751, float:1.901176E38)
            android.view.View r12 = r5.inflate(r6, r0, r10)
            int r0 = r1.length
            r5 = 0
            if (r0 <= 0) goto L_0x0074
            r0 = r1[r10]
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.feed.adapter.n
            if (r0 == 0) goto L_0x0074
            r0 = r1[r10]
            com.bytedance.android.livesdk.feed.adapter.n r0 = (com.bytedance.android.livesdk.feed.adapter.n) r0
            com.bytedance.android.livesdk.feed.d.c r6 = r0.a()
            com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a r0 = r0.b()
            r13 = r0
            r14 = r6
            goto L_0x0076
        L_0x0074:
            r13 = r5
            r14 = r13
        L_0x0076:
            int r0 = r1.length
            if (r0 <= r2) goto L_0x0085
            r0 = r1[r2]
            boolean r0 = r0 instanceof io.reactivex.subjects.PublishSubject
            if (r0 == 0) goto L_0x0085
            r0 = r1[r2]
            io.reactivex.subjects.PublishSubject r0 = (io.reactivex.subjects.PublishSubject) r0
            r15 = r0
            goto L_0x0086
        L_0x0085:
            r15 = r5
        L_0x0086:
            int r0 = r1.length
            r2 = 3
            if (r0 <= r2) goto L_0x0097
            r0 = r1[r2]
            boolean r0 = r0 instanceof io.reactivex.subjects.PublishSubject
            if (r0 == 0) goto L_0x0097
            r0 = r1[r2]
            io.reactivex.subjects.PublishSubject r0 = (io.reactivex.subjects.PublishSubject) r0
            r16 = r0
            goto L_0x0099
        L_0x0097:
            r16 = r5
        L_0x0099:
            int r0 = r1.length
            r2 = 4
            if (r0 <= r2) goto L_0x00aa
            r0 = r1[r2]
            boolean r0 = r0 instanceof io.reactivex.subjects.PublishSubject
            if (r0 == 0) goto L_0x00aa
            r0 = r1[r2]
            io.reactivex.subjects.PublishSubject r0 = (io.reactivex.subjects.PublishSubject) r0
            r17 = r0
            goto L_0x00ac
        L_0x00aa:
            r17 = r5
        L_0x00ac:
            com.bytedance.android.livesdk.feed.live.LiveBannerViewHolder r0 = new com.bytedance.android.livesdk.feed.live.LiveBannerViewHolder
            r11 = r0
            r18 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.i.e.a(android.view.ViewGroup, java.lang.Object[]):com.bytedance.android.live.core.viewholder.BaseViewHolder");
    }
}
