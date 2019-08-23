package com.ss.android.ugc.aweme.feed.panel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.TimeLineDecoration;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class CellFeedFragmentPanel extends AbsCellFeedFragmentPanel implements b<AbsCellViewHolder>, c<Aweme>, d, x {
    public static ChangeQuickRedirect h;
    protected a i;
    public n j;
    public boolean k = true;
    protected String l;
    protected boolean m;
    @BindView(2131496683)
    protected SwipeRefreshLayout mRefreshLayout;
    public int n;
    protected boolean o;

    public final void a(List list, int i2) {
    }

    public final com.ss.android.ugc.aweme.newfollow.b.b p() {
        if (this.f3161e != null) {
            return this.f3161e;
        }
        return null;
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41782, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3160d != null) {
            this.f3160d.a();
        }
    }

    public void ay() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41768, new Class[0], Void.TYPE);
            return;
        }
        super.ay();
        if (this.aq) {
            this.k = false;
            r();
        }
    }

    public RecyclerView.LayoutManager b() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 41764, new Class[0], RecyclerView.LayoutManager.class)) {
            return new WrapGridLayoutManager((Context) this.ar, 2, 1, false);
        }
        return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(new Object[0], this, h, false, 41764, new Class[0], RecyclerView.LayoutManager.class);
    }

    public RecyclerView.ItemDecoration f() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 41765, new Class[0], RecyclerView.ItemDecoration.class)) {
            return new TimeLineDecoration((int) UIUtils.dip2Px(this.ar, 1.0f));
        }
        return (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, h, false, 41765, new Class[0], RecyclerView.ItemDecoration.class);
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41789, new Class[0], Void.TYPE);
            return;
        }
        this.k = false;
        r();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41774, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.f3161e.showLoadMoreLoading();
        }
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41772, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.i.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.e();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41777, new Class[0], Void.TYPE);
            return;
        }
        if (bc() && !this.m) {
            this.i.setRefreshing(true);
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41781, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3161e == null || this.k || this.mListView == null)) {
            int childCount = this.mListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                if (childViewHolder.getItemViewType() == 0) {
                    a((AbsCellViewHolder) childViewHolder);
                }
            }
        }
    }

    @NonNull
    public CellFeedAdapter g() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41766, new Class[0], CellFeedAdapter.class)) {
            return (CellFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, h, false, 41766, new Class[0], CellFeedAdapter.class);
        } else if (this.f3161e != null) {
            return this.f3161e;
        } else {
            Bundle bs = bs();
            if (bs != null && bs.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0) == 0) {
                int v = AbTestManager.a().v();
                if (v == 1) {
                    i2 = 1;
                } else if (v == 2) {
                    i2 = 2;
                }
            }
            if (this.n == 7) {
                i2 = AbTestManager.a().E();
            }
            CellFeedAdapter cellFeedAdapter = new CellFeedAdapter(this, this.l, this.f3158b, this, i2, this.n);
            return cellFeedAdapter;
        }
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41793, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 41793, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3161e == null || this.f3161e.mItems == null || this.f3161e.mItems.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void k() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41767, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (this.aq) {
            if ((!(this.ar instanceof MainActivity) || (!((MainActivity) this.ar).isUnderMainTab() && !((MainActivity) this.ar).isUnderNearbyTab())) && !(this.ar instanceof HotSearchAndDiscoveryActivity)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.k = false;
                q();
                b(true);
            }
        }
    }

    public void n_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41770, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (this.f3161e.getItemCount() == 0) {
                this.i.setRefreshing(false);
                if (this.mStatusView != null) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.d();
                }
            } else {
                this.i.setRefreshing(true);
            }
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41788, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41788, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 41780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 41780, new Class[0], Void.TYPE);
        } else if (bc()) {
            int childCount = this.mListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                if (childViewHolder.getItemViewType() == 0) {
                    AbsCellViewHolder absCellViewHolder = (AbsCellViewHolder) childViewHolder;
                    if (absCellViewHolder != null && !absCellViewHolder.k()) {
                        absCellViewHolder.b();
                        absCellViewHolder.d(true);
                    }
                }
            }
        }
        b(false);
        q();
    }

    public final void d(boolean z) {
        this.m = z;
    }

    public final void a_(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 41791, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 41791, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (bc()) {
            this.f3161e.notifyItemRemoved(i2);
        }
    }

    public void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, h, false, 41771, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, h, false, 41771, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.i.setRefreshing(false);
            if (!this.o) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.f();
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, h, false, 41775, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, h, false, 41775, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.f3161e.showLoadMoreError();
        }
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, h, false, 41778, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, h, false, 41778, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.i.setRefreshing(false);
            if (!this.m) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.b6v).a();
            }
        }
    }

    @Subscribe
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.a.c cVar) {
        com.ss.android.ugc.aweme.challenge.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, h, false, 41794, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, h, false, 41794, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE);
        } else if (cVar2.f35317a == 0) {
            b(true);
        } else {
            r();
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 41792, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 41792, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mListView != null && (this.mListView instanceof FpsRecyclerView)) {
            ((FpsRecyclerView) this.mListView).setLabel(str);
        }
        if (this.f3161e != null && (this.f3161e instanceof LoadMoreRecyclerViewAdapter)) {
            this.f3161e.mLabel = str;
        }
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 41783, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 41783, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f3161e.resetLoadMoreState();
        } else if (com.ss.android.g.a.a()) {
            this.f3161e.setShowFooter(false);
        } else {
            this.f3161e.showLoadMoreEmpty();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0110 A[Catch:{ JSONException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123 A[Catch:{ JSONException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = h
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41790(0xa33e, float:5.856E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 41790(0xa33e, float:5.856E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            if (r19 == 0) goto L_0x0253
            boolean r0 = r18.bc()
            if (r0 != 0) goto L_0x0040
            goto L_0x0253
        L_0x0040:
            int r0 = r7.n
            r1 = 9
            if (r0 == r1) goto L_0x0252
            int r0 = r7.n
            r1 = 15
            if (r0 != r1) goto L_0x004e
            goto L_0x0252
        L_0x004e:
            r7.k = r8
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.feed.a r1 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()
            int r3 = r7.n
            org.json.JSONObject r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2, (int) r3)
            java.lang.String r2 = "display"
            java.lang.String r3 = "dual"
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = r7.l     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = "homepage_fresh"
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x007c
            java.lang.String r2 = "homepage_fresh"
            java.lang.String r0 = "style"
            java.lang.String r3 = "text"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x015e }
        L_0x007a:
            r0 = r2
            goto L_0x00c5
        L_0x007c:
            java.lang.String r2 = r7.l     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = "homepage_hot"
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = "homepage_hot"
            java.lang.String r0 = "style"
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ JSONException -> 0x015e }
            int r3 = r3.v()     // Catch:{ JSONException -> 0x015e }
            if (r3 != r8) goto L_0x0097
            java.lang.String r3 = "icon"
            goto L_0x0099
        L_0x0097:
            java.lang.String r3 = "text"
        L_0x0099:
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x015e }
            goto L_0x007a
        L_0x009d:
            java.lang.String r2 = r7.l     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = "homepage_follow"
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x00b1
            java.lang.String r2 = "homepage_follow"
            java.lang.String r0 = "style"
            java.lang.String r3 = "text"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x015e }
            goto L_0x007a
        L_0x00b1:
            java.lang.String r2 = r7.l     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = "categorized_city_poi"
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x00c5
            java.lang.String r2 = "categorized_city_poi"
            java.lang.String r0 = "style"
            java.lang.String r3 = "text"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x015e }
            goto L_0x007a
        L_0x00c5:
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            int r4 = r7.n     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3, (int) r4)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "music_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.Long r3 = com.ss.android.ugc.aweme.u.aa.j(r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "content"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.l(r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "display"
            java.lang.String r3 = "dual"
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.e((com.ss.android.ugc.aweme.feed.model.Aweme) r2)     // Catch:{ JSONException -> 0x015d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x015d }
            if (r2 != 0) goto L_0x011d
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.e((com.ss.android.ugc.aweme.feed.model.Aweme) r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
        L_0x011d:
            boolean r2 = com.ss.android.ugc.aweme.u.aa.c((java.lang.String) r0)     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x014f
            java.lang.String r2 = "poi_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.h(r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "poi_channel"
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.b()     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "city_info"
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a()     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.i(r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
        L_0x014f:
            java.lang.String r2 = "is_photo"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r19.c()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.n(r3)     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            goto L_0x015f
        L_0x015d:
            r2 = r0
        L_0x015e:
            r0 = r2
        L_0x015f:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()
            boolean r2 = r2.isLive()
            if (r2 == 0) goto L_0x0226
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "impression"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "live"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 != 0) goto L_0x0192
            java.lang.String r2 = ""
            goto L_0x01a0
        L_0x0192:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.c()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            long r2 = r2.roomId
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x01a0:
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setExtValueString(r2)
            com.ss.android.ugc.aweme.app.d.c r2 = new com.ss.android.ugc.aweme.app.d.c
            r2.<init>()
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r19.c()
            java.lang.String r4 = r4.getAuthorUid()
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "page_name"
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r3 = "position"
            java.lang.String r4 = "homepage_fresh"
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "city_info"
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.a()
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "distance_info"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r19.c()
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.i(r4)
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r19.c()
            int r5 = r7.n
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r4, (int) r5)
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            org.json.JSONObject r2 = r2.b()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r2)
            com.ss.android.ugc.aweme.common.r.onEvent(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r19.c()
            java.lang.String r8 = r1.getAuthorUid()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r19.c()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            long r9 = r1.roomId
            java.lang.String r11 = "homepage_fresh"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r19.c()
            java.lang.String r12 = r1.getRequestId()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r19.c()
            int r13 = r1.getAwemePosition()
            r14 = -1
            r15 = 0
            r16 = 0
            java.lang.String r17 = "live_cover"
            com.ss.android.ugc.aweme.story.live.b.a((java.lang.String) r8, (long) r9, (java.lang.String) r11, (java.lang.String) r12, (int) r13, (int) r14, (boolean) r15, (java.lang.String) r16, (java.lang.String) r17)
            goto L_0x0235
        L_0x0226:
            android.app.Activity r9 = r7.ar
            java.lang.String r10 = "show"
            java.lang.String r12 = r19.j()
            r13 = 0
            r11 = r0
            r15 = r1
            com.ss.android.ugc.aweme.common.r.a((android.content.Context) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (long) r13, (org.json.JSONObject) r15)
        L_0x0235:
            com.ss.android.ugc.aweme.u.an r1 = new com.ss.android.ugc.aweme.u.an
            r1.<init>()
            com.ss.android.ugc.aweme.u.an r0 = r1.a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r19.c()
            int r2 = r7.n
            com.ss.android.ugc.aweme.u.an r0 = r0.b(r1, r2)
            java.lang.String r1 = "dual"
            com.ss.android.ugc.aweme.u.an r0 = r0.c(r1)
            r0.e()
            return
        L_0x0252:
            return
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel.a(com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder):void");
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 41784, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 41784, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3160d != null) {
            this.f3160d.a(false, z);
        }
    }

    public void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, h, false, 41763, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, h, false, 41763, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.i = new bk(this.mRefreshLayout);
    }

    public void a(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 41773, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, h, false, 41773, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.mStatusView.b();
            this.mStatusView.setVisibility(8);
            this.i.setRefreshing(false);
            this.o = true;
            this.f3161e.setShowFooter(true);
            this.f3161e.setData(list);
            a(z);
            if (this.j != null) {
                this.j.p();
            }
            b(true);
        }
    }

    public final void c(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 41779, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, h, false, 41779, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            if (z || this.m) {
                this.f3161e.setDataAfterLoadLatest(list);
                if (!this.m && bq()) {
                    b(0);
                    b(true);
                }
            } else if (this.aq && this.ar != null && ((MainActivity) this.ar).isUnderMainTab()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, (int) C0906R.string.a3f).a();
                b(0);
            }
            this.i.setRefreshing(false);
        }
    }

    public void b(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 41776, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, h, false, 41776, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.i.setRefreshing(false);
            this.f3161e.setDataAfterLoadMore(list);
            b(true);
            a(z);
        }
    }

    public CellFeedFragmentPanel(String str, com.ss.android.ugc.aweme.challenge.d dVar, m mVar, int i2) {
        super(dVar, mVar);
        this.l = str;
        this.n = i2;
    }
}
