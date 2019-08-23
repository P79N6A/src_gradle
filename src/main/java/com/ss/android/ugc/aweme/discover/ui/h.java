package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43168a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43169b;

    h(DiscoverFragment discoverFragment) {
        this.f43169b = discoverFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r4 != null) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f43168a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37542(0x92a6, float:5.2608E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f43168a
            r13 = 0
            r14 = 37542(0x92a6, float:5.2608E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.ss.android.ugc.aweme.discover.ui.DiscoverFragment r3 = r2.f43169b
            r0 = r18
            java.util.List r0 = (java.util.List) r0
            com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView r3 = r3.mListView
            android.support.v7.widget.RecyclerView$Adapter r3 = r3.getAdapter()
            com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper r3 = (com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper) r3
            android.support.v7.widget.RecyclerView$Adapter<android.support.v7.widget.RecyclerView$ViewHolder> r3 = r3.f42115f
            com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter r3 = (com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter) r3
            if (r3 == 0) goto L_0x00f1
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.f41553a
            r13 = 0
            r14 = 35512(0x8ab8, float:4.9763E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x007a
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.f41553a
            r13 = 0
            r14 = 35512(0x8ab8, float:4.9763E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x007a:
            if (r0 == 0) goto L_0x00f1
            java.util.List<T> r4 = r3.n
            r4.clear()
            java.util.List<T> r4 = r3.n
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            r4.addAll(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x008d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00bb
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.discover.model.DiscoverItemData r4 = (com.ss.android.ugc.aweme.discover.model.DiscoverItemData) r4
            int r5 = r4.getType()
            r6 = 2
            if (r5 != r6) goto L_0x008d
            com.ss.android.ugc.aweme.discover.model.RankingListCover r0 = r4.getRankingListCover()
            r4 = 0
            if (r0 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.commerce.service.models.i r5 = r0.getTopGoods()
            goto L_0x00ad
        L_0x00ac:
            r5 = r4
        L_0x00ad:
            if (r5 != 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.music.model.BrandBillboard r4 = r0.getTopBrand()
        L_0x00b5:
            if (r4 == 0) goto L_0x00bb
        L_0x00b7:
            com.ss.android.ugc.aweme.discover.delegate.g r0 = r3.f41557d
            r0.f42279b = r1
        L_0x00bb:
            r3.notifyDataSetChanged()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.f41553a
            r13 = 0
            r14 = 35508(0x8ab4, float:4.9757E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x00e2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.f41553a
            r13 = 0
            r14 = 35508(0x8ab4, float:4.9757E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00e2:
            android.support.v7.widget.RecyclerView r0 = r3.f41555b
            if (r0 != 0) goto L_0x00e7
            return
        L_0x00e7:
            com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter$c r1 = new com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter$c
            r1.<init>(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.h.onChanged(java.lang.Object):void");
    }
}
