package com.ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.d.a;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.utils.df;

public abstract class AbsCellFeedFragmentPanel extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3157a;
    private static int h;

    /* renamed from: b  reason: collision with root package name */
    protected d f3158b;

    /* renamed from: c  reason: collision with root package name */
    protected m f3159c;

    /* renamed from: d  reason: collision with root package name */
    protected a f3160d;

    /* renamed from: e  reason: collision with root package name */
    protected CellFeedAdapter f3161e;

    /* renamed from: f  reason: collision with root package name */
    public HeaderAndFooterWrapper f3162f;
    public boolean g;
    @BindView(2131495411)
    public RecyclerView mListView;
    @BindView(2131497340)
    protected DmtStatusView mStatusView;

    public abstract RecyclerView.LayoutManager b();

    public abstract RecyclerView.ItemDecoration f();

    @NonNull
    public abstract CellFeedAdapter g();

    public boolean h() {
        return true;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f3157a, false, 41518, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3157a, false, 41518, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3161e == null || this.f3161e.mItems == null || this.f3161e.mItems.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(RecyclerView.OnScrollListener onScrollListener) {
        if (PatchProxy.isSupport(new Object[]{onScrollListener}, this, f3157a, false, 41512, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScrollListener}, this, f3157a, false, 41512, new Class[]{RecyclerView.OnScrollListener.class}, Void.TYPE);
        } else if (this.mListView != null) {
            this.mListView.addOnScrollListener(onScrollListener);
        }
    }

    public final void a(LoadMoreRecyclerViewAdapter.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3157a, false, 41513, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3157a, false, 41513, new Class[]{LoadMoreRecyclerViewAdapter.a.class}, Void.TYPE);
        } else if (this.f3161e != null) {
            this.f3161e.setLoadMoreListener(aVar);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f3157a, false, 41514, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f3157a, false, 41514, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mListView.post(new Runnable(0) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45637a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45637a, false, 41521, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45637a, false, 41521, new Class[0], Void.TYPE);
                    return;
                }
                AbsCellFeedFragmentPanel.this.mListView.scrollToPosition(0);
            }
        });
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3157a, false, 41517, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3157a, false, 41517, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            int a2 = this.f3161e.a(str);
            if (a2 >= 0 && !CollectionUtils.isEmpty(this.f3161e.mItems)) {
                if (this.f3161e.f35105d != null) {
                    this.f3161e.mItems.remove(a2 - 1);
                } else {
                    this.f3161e.mItems.remove(a2);
                }
                this.f3161e.notifyItemRemoved(a2);
                if (this.f3161e.getItemCount() == 0) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.e();
                    this.f3161e.showLoadMoreEmpty();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        if (r0 > (r1 - r2)) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012c, code lost:
        if (r7 <= r0) goto L_0x013b;
     */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onVideoEvent(com.ss.android.ugc.aweme.feed.f.ar r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3157a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ar> r1 = com.ss.android.ugc.aweme.feed.f.ar.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41515(0xa22b, float:5.8175E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3157a
            r3 = 0
            r4 = 41515(0xa22b, float:5.8175E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ar> r1 = com.ss.android.ugc.aweme.feed.f.ar.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            boolean r0 = r10.bc()
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            int r0 = r11.f45292b
            switch(r0) {
                case 2: goto L_0x018c;
                case 13: goto L_0x0169;
                case 14: goto L_0x013c;
                case 21: goto L_0x005d;
                case 22: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0194
        L_0x0040:
            com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter r0 = r10.f3161e
            r0.notifyDataSetChanged()
            com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter r0 = r10.f3161e
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L_0x0194
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r10.mStatusView
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r10.mStatusView
            r0.e()
            com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter r0 = r10.f3161e
            r0.showLoadMoreEmpty()
            return
        L_0x005d:
            java.lang.Object r0 = r11.f45293c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 != 0) goto L_0x0064
            return
        L_0x0064:
            com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter r1 = r10.f3161e
            java.lang.String r0 = r0.getAid()
            int r7 = r1.a((java.lang.String) r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3157a
            r3 = 0
            r4 = 41516(0xa22c, float:5.8176E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3157a
            r3 = 0
            r4 = 41516(0xa22c, float:5.8176E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0194
        L_0x00a7:
            int r0 = h
            if (r0 != 0) goto L_0x00ba
            android.app.Activity r0 = r10.ar
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131427794(0x7f0b01d2, float:1.8477214E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            h = r0
        L_0x00ba:
            r0 = -1
            if (r7 == r0) goto L_0x013b
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.views.j
            if (r0 == 0) goto L_0x013b
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof android.support.v7.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x0110
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            android.support.v7.widget.StaggeredGridLayoutManager r0 = (android.support.v7.widget.StaggeredGridLayoutManager) r0
            r1 = 0
            int[] r2 = r0.findFirstVisibleItemPositions(r1)
            int[] r1 = r0.findLastVisibleItemPositions(r1)
            r3 = r2[r9]
            if (r7 >= r3) goto L_0x00ea
            r2 = r2[r8]
            if (r7 < r2) goto L_0x012e
        L_0x00ea:
            r2 = r1[r9]
            if (r7 <= r2) goto L_0x00f2
            r1 = r1[r8]
            if (r7 > r1) goto L_0x012e
        L_0x00f2:
            android.view.View r0 = r0.findViewByPosition(r7)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getGlobalVisibleRect(r1)
            int r0 = r1.top
            int r1 = r1.bottom
            boolean r2 = r10.i()
            if (r2 == 0) goto L_0x010b
            int r2 = h
            goto L_0x010c
        L_0x010b:
            r2 = 0
        L_0x010c:
            int r1 = r1 - r2
            if (r0 <= r1) goto L_0x013b
            goto L_0x012e
        L_0x0110:
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof android.support.v7.widget.GridLayoutManager
            if (r0 == 0) goto L_0x012e
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            android.support.v7.widget.GridLayoutManager r0 = (android.support.v7.widget.GridLayoutManager) r0
            int r1 = r0.findFirstVisibleItemPosition()
            int r0 = r0.findLastVisibleItemPosition()
            if (r7 < r1) goto L_0x012e
            if (r7 <= r0) goto L_0x013b
        L_0x012e:
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            com.ss.android.ugc.aweme.views.j r0 = (com.ss.android.ugc.aweme.views.j) r0
            r0.scrollToPositionWithOffset(r7, r9)
            r10.g = r8
        L_0x013b:
            return
        L_0x013c:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.v()
            r1 = 2
            if (r0 != r1) goto L_0x0194
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            int r0 = r0.getChildCount()
        L_0x014d:
            if (r9 >= r0) goto L_0x0194
            android.support.v7.widget.RecyclerView r1 = r10.mListView
            android.view.View r1 = r1.getChildAt(r9)
            android.support.v7.widget.RecyclerView r2 = r10.mListView
            android.support.v7.widget.RecyclerView$ViewHolder r1 = r2.getChildViewHolder(r1)
            int r2 = r1.getItemViewType()
            if (r2 != 0) goto L_0x0166
            com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder r1 = (com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder) r1
            r1.l()
        L_0x0166:
            int r9 = r9 + 1
            goto L_0x014d
        L_0x0169:
            android.support.v7.widget.RecyclerView r0 = r10.mListView
            int r0 = r0.getChildCount()
        L_0x016f:
            if (r9 >= r0) goto L_0x018b
            android.support.v7.widget.RecyclerView r1 = r10.mListView
            android.view.View r1 = r1.getChildAt(r9)
            android.support.v7.widget.RecyclerView r2 = r10.mListView
            android.support.v7.widget.RecyclerView$ViewHolder r1 = r2.getChildViewHolder(r1)
            int r2 = r1.getItemViewType()
            if (r2 != 0) goto L_0x0188
            com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder r1 = (com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder) r1
            r1.l()
        L_0x0188:
            int r9 = r9 + 1
            goto L_0x016f
        L_0x018b:
            return
        L_0x018c:
            java.lang.Object r0 = r11.f45293c
            java.lang.String r0 = (java.lang.String) r0
            r10.a((java.lang.String) r0)
            return
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel.onVideoEvent(com.ss.android.ugc.aweme.feed.f.ar):void");
    }

    public AbsCellFeedFragmentPanel(d dVar, m mVar) {
        this.f3158b = dVar;
        this.f3159c = mVar;
    }

    public void a(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3157a, false, 41511, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3157a, false, 41511, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.mListView.setLayoutManager(b());
        this.mListView.addItemDecoration(f());
        this.f3161e = g();
        this.f3162f = new HeaderAndFooterWrapper(this.f3161e);
        this.mListView.setAdapter(this.f3162f);
        OnAnimatedScrollListener onAnimatedScrollListener = null;
        if (!c.a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.mListView.addOnScrollListener(onAnimatedScrollListener);
        }
        this.mListView = df.a(this.mListView, this.f3159c);
        this.f3160d = new a(this.mListView, onAnimatedScrollListener);
        this.mListView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45635a;

            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45635a, false, 41520, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45635a, false, 41520, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 0 && AbsCellFeedFragmentPanel.this.f3161e.getItemCount() > 1 && AbsCellFeedFragmentPanel.this.g) {
                    AbsCellFeedFragmentPanel.this.f3161e.notifyItemChanged(1);
                    AbsCellFeedFragmentPanel.this.g = false;
                }
            }
        });
        this.mListView.getItemAnimator().setMoveDuration(0);
        this.mListView.getItemAnimator().setChangeDuration(0);
    }
}
