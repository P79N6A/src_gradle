package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.g;
import a.i;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.e;
import com.ss.android.ugc.aweme.choosemusic.d.h;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;

public class DiscoverMusicFragment extends AmeBaseFragment implements Observer<a>, LoadMoreRecyclerViewAdapter.a, b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35928a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f35929b;

    /* renamed from: c  reason: collision with root package name */
    public WidgetManager f35930c;

    /* renamed from: d  reason: collision with root package name */
    public DiscoverWidgetAdapter f35931d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.b.b f35932e;

    /* renamed from: f  reason: collision with root package name */
    e f35933f;
    f<com.ss.android.ugc.aweme.choosemusic.a.b> g;
    public com.ss.android.ugc.aweme.choosemusic.d.a h;
    private int i;
    private int j;
    @BindView(2131495399)
    RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public final View f() {
        return this.mListView;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f35928a, false, 26582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35928a, false, 26582, new Class[0], Void.TYPE);
            return;
        }
        int i2 = this.j - 2;
        if (i2 < 0) {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.choosemusic.d.a aVar = this.h;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), 10}, aVar, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26728, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.choosemusic.d.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), 10}, aVar2, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26728, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!aVar.f35806d) {
            aVar.f35806d = true;
            aVar.f35804b.musicCollectionFeed(Integer.valueOf(i2), 10).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(aVar), i.f1052b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f35928a, false, 26583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35928a, false, 26583, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f35931d != null) {
            this.f35931d.showLoadMoreLoading();
        }
    }

    public void onCreate(Bundle bundle) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35928a, false, 26576, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35928a, false, 26576, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        }
        this.i = i2;
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35928a, false, 26584, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35928a, false, 26584, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!(this.mListView == null || !z || this.f35931d == null)) {
            this.f35931d.a(true);
        }
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f35928a, false, 26580, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f35928a, false, 26580, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f35931d != null) {
            DiscoverWidgetAdapter discoverWidgetAdapter = this.f35931d;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, discoverWidgetAdapter, DiscoverWidgetAdapter.f35759e, false, 26460, new Class[]{Integer.TYPE}, Void.TYPE)) {
                DiscoverWidgetAdapter discoverWidgetAdapter2 = discoverWidgetAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, discoverWidgetAdapter2, DiscoverWidgetAdapter.f35759e, false, 26460, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (discoverWidgetAdapter.i != i3) {
                discoverWidgetAdapter.i = i3;
                discoverWidgetAdapter.a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f35928a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26581(0x67d5, float:3.7248E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f35928a
            r3 = 0
            r4 = 26581(0x67d5, float:3.7248E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            java.lang.String r0 = r7.f34376a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = -1
            if (r1 == r2) goto L_0x005e
            r2 = 3322014(0x32b09e, float:4.655133E-39)
            if (r1 == r2) goto L_0x0054
            r2 = 510590654(0x1e6efebe, float:1.26522945E-20)
            if (r1 == r2) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r1 = "should_load_more_pick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x005e:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 2
            goto L_0x0069
        L_0x0068:
            r0 = -1
        L_0x0069:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x00c8;
                case 2: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0178
        L_0x006f:
            java.lang.Object r0 = r7.a()
            com.ss.android.ugc.aweme.choosemusic.a.a r0 = (com.ss.android.ugc.aweme.choosemusic.a.a) r0
            boolean r1 = r10.getUserVisibleHint()
            if (r1 == 0) goto L_0x00c7
            int r1 = r0.f35739c
            if (r1 != r3) goto L_0x0080
            goto L_0x00c7
        L_0x0080:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x008e
            int r1 = r0.f35740d
            if (r1 != r8) goto L_0x008e
            int r1 = r0.f35737a
            if (r1 == 0) goto L_0x0178
        L_0x008e:
            int r1 = r0.f35737a
            if (r1 != r8) goto L_0x00a9
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            int r0 = r0.f35740d
            if (r0 != r8) goto L_0x009e
            r0 = 2131559203(0x7f0d0323, float:1.8743743E38)
            goto L_0x00a1
        L_0x009e:
            r0 = 2131559039(0x7f0d027f, float:1.874341E38)
        L_0x00a1:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (int) r0)
            r0.a()
            return
        L_0x00a9:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x0178
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            int r0 = r0.f35740d
            if (r0 != r8) goto L_0x00bb
            r0 = 2131559207(0x7f0d0327, float:1.8743752E38)
            goto L_0x00be
        L_0x00bb:
            r0 = 2131559040(0x7f0d0280, float:1.8743413E38)
        L_0x00be:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r1, (int) r0)
            r0.a()
            goto L_0x0178
        L_0x00c7:
            return
        L_0x00c8:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f35929b
            java.lang.String r2 = "list"
            java.lang.Object r0 = r0.a((java.lang.String) r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0171
            int r2 = r0.size()
            if (r2 > 0) goto L_0x00dc
            goto L_0x0171
        L_0x00dc:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r2 = r10.f35931d
            int r2 = r2.getItemCount()
            int r0 = r0.size()
            r10.j = r0
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f35929b
            java.lang.String r3 = "data_sticker"
            java.lang.Object r0 = r0.b((java.lang.String) r3, r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0101
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0101
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r1 = 4
            r0.a(r8, r1)
            goto L_0x0111
        L_0x0101:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f35929b
            java.lang.String r1 = "data_challenge"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r1 = 5
            r0.a(r8, r1)
        L_0x0111:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r10.f35929b
            java.lang.String r3 = "show_music_radio"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.b((java.lang.String) r3, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.j = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            int r1 = r10.j
            r0.h = r1
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            int r0 = r0.getItemCount()
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x013a
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r1 = r10.f35931d
            r1.notifyItemRangeInserted(r2, r0)
            goto L_0x013f
        L_0x013a:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r0.notifyDataSetChanged()
        L_0x013f:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f35929b
            java.lang.String r1 = "collection_feed_has_more"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f35929b
            java.lang.String r1 = "collection_feed_has_more"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x015f
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r0.resetLoadMoreState()
            goto L_0x0178
        L_0x015f:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r0.setShowFooter(r9)
            goto L_0x0178
        L_0x016b:
            com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter r0 = r10.f35931d
            r0.showLoadMoreEmpty()
            return
        L_0x0171:
            return
        L_0x0172:
            com.ss.android.ugc.aweme.choosemusic.d.a r0 = r10.h
            r0.a((boolean) r8, (java.lang.String) r1, (com.ss.android.ugc.aweme.music.model.Music) r1)
            return
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment.onChanged(java.lang.Object):void");
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35928a, false, 26577, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35928a, false, 26577, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.or, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        if (PatchProxy.isSupport(new Object[0], this, f35928a, false, 26579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35928a, false, 26579, new Class[0], Void.TYPE);
        } else {
            DiscoverWidgetAdapter discoverWidgetAdapter = new DiscoverWidgetAdapter(this.f35930c, this.f35929b, this.f35932e, this.f35933f, this.g, this.i);
            this.f35931d = discoverWidgetAdapter;
            this.f35931d.setLoadMoreListener(this);
            this.f35931d.mTextColor = getResources().getColor(C0906R.color.i3);
        }
        this.mListView.setOverScrollMode(2);
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListView.setAdapter(this.f35931d);
        new PreloadRecyclerViewConverter(new e(this), 5).a(this.mListView);
        this.f35929b.a("list", (Observer<a>) this).a("should_load_more_pick", (Observer<a>) this).a("music_collect_status", (Observer<a>) this);
        return inflate;
    }
}
