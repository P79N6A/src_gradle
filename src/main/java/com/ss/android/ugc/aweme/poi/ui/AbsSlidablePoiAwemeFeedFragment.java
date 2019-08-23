package com.ss.android.ugc.aweme.poi.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.adapter.PoiBannerAdapter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.ss.android.ugc.aweme.poi.b.b;
import com.ss.android.ugc.aweme.poi.e.c;
import com.ss.android.ugc.aweme.poi.e.d;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.map.h;
import com.ss.android.ugc.aweme.poi.map.i;
import com.ss.android.ugc.aweme.poi.map.k;
import com.ss.android.ugc.aweme.poi.map.l;
import com.ss.android.ugc.aweme.poi.map.m;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.al;
import com.ss.android.ugc.aweme.poi.preview.a;
import com.ss.android.ugc.aweme.poi.ui.accelerate.AcceleratedPoiAwemeFeedViewHolder;
import com.ss.android.ugc.aweme.poi.ui.h;
import com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cf;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.utils.q;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.Subscribe;

public abstract class AbsSlidablePoiAwemeFeedFragment extends AbsPoiAwemeFeedFragment implements WeakHandler.IHandler, PoiDetailHeaderInfoPresenter.a, PoiDetailHeaderInfoPresenter.b, h, i, k, l, m, h.a {
    public static ChangeQuickRedirect t;
    private PoiBannerAdapter A;
    private com.ss.android.ugc.aweme.discover.helper.i B;
    private a C;
    private double D;
    private double E;
    private com.ss.android.ugc.aweme.poi.a F;
    private j G;
    private String H;
    private b I;
    private boolean J;
    @BindView(2131493213)
    AutoRTLImageView mBackBtn;
    @BindView(2131498537)
    protected BannerViewPager mBannerVPer;
    @BindView(2131496227)
    protected View mBottomToolbar;
    @BindView(2131496232)
    protected View mBottomToolbarCollect;
    @BindView(2131496231)
    protected CheckableImageView mBottomToolbarCollectImg;
    @BindView(2131496228)
    protected View mBottomToolbarDivider;
    @BindView(2131496273)
    protected View mBottomToolbarShare;
    @BindView(2131493597)
    ViewGroup mCollectContainer;
    @BindView(2131496236)
    protected View mHeader;
    @BindView(2131498277)
    protected DmtTextView mIndicatorView;
    @Nullable
    @BindView(2131496289)
    protected PoiHeaderLayout mPoiHeaderLayout;
    @BindView(2131496332)
    protected MapLayout mPoiMap;
    @BindView(2131496258)
    protected View mPoiMore;
    @BindView(2131496334)
    protected View mRouteStatus;
    @BindView(2131497081)
    ImageView mShareBtn;
    @BindView(2131497328)
    protected View mStatusBar;
    @BindView(2131496352)
    View mTitleBarBg;
    @BindView(2131496339)
    View mTitleBarTools;
    @BindView(2131494990)
    protected CheckableImageView mTopCollectImg;
    @BindView(2131497613)
    protected View mTopbar;
    @BindView(2131496336)
    protected View mTopbarBg;
    @BindView(2131496338)
    public View mTopbarStatus;
    @BindView(2131496371)
    protected ImageView mUploadImage;
    public PoiOptimizedRoutePresenter u;
    public List<al> v;
    public WeakHandler w;
    protected boolean x = true;
    protected Float y;
    public d z;

    public boolean M() {
        return true;
    }

    public abstract void P();

    public abstract void Q();

    public boolean R() {
        return true;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final int l() {
        return 65441;
    }

    public final Fragment m() {
        return this;
    }

    public final PoiDetailHeaderInfoPresenter.a z() {
        return this;
    }

    public final CheckableImageView d() {
        return this.mTopCollectImg;
    }

    public final void U_() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65946, new Class[0], Void.TYPE);
            return;
        }
        if (this.J) {
            this.u.a(this.j);
        }
    }

    public final void V_() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65948, new Class[0], Void.TYPE);
            return;
        }
        this.J = true;
        if (this.j != null && isViewValid()) {
            this.u.a(this.j);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65939, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.e.h.a("click_map", "zoom", this.f3753e);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65935, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.w != null) {
            this.w.removeCallbacksAndMessages(null);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65936, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPoiMap != null) {
            this.mPoiMap.e();
        }
        super.onDestroyView();
    }

    public void onLowMemory() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65937, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPoiMap != null) {
            this.mPoiMap.f();
        }
        super.onLowMemory();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65933, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mPoiMap.c();
        com.ss.android.ugc.aweme.poi.b.a.pageKey = this.H;
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65932, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.mPoiMap.a();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65934, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.mPoiMap.d();
    }

    public final h w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65921, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, t, false, 65921, new Class[0], h.class);
        }
        if (this.f3751c == null) {
            this.f3751c = new com.ss.android.ugc.aweme.poi.ui.accelerate.a(this);
        }
        return this.f3751c;
    }

    public final i x() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65920, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, t, false, 65920, new Class[0], i.class);
        }
        if (this.f3750b == null) {
            this.f3750b = new AcceleratedPoiAwemeFeedViewHolder();
        }
        return this.f3750b;
    }

    public final aa y() {
        if (!PatchProxy.isSupport(new Object[0], this, t, false, 65922, new Class[0], aa.class)) {
            return new com.ss.android.ugc.aweme.poi.model.h(l());
        }
        return (aa) PatchProxy.accessDispatch(new Object[0], this, t, false, 65922, new Class[0], aa.class);
    }

    private void S() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65927, new Class[0], Void.TYPE);
            return;
        }
        this.F = af.a(getContext()).a((f) null);
        if (this.F != null) {
            af.a(getContext()).d();
        }
    }

    public void O() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65924, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.a(this.i);
            PoiHeaderLayout poiHeaderLayout = this.mPoiHeaderLayout;
            View view = this.mPoiMore;
            if (PatchProxy.isSupport(new Object[]{view}, poiHeaderLayout, PoiHeaderLayout.f61041a, false, 67056, new Class[]{View.class}, Void.TYPE)) {
                PoiHeaderLayout poiHeaderLayout2 = poiHeaderLayout;
                PatchProxy.accessDispatch(new Object[]{view}, poiHeaderLayout2, PoiHeaderLayout.f61041a, false, 67056, new Class[]{View.class}, Void.TYPE);
                return;
            }
            PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = poiHeaderLayout.f61042b;
            if (poiDetailHeaderInfoPresenter != null) {
                poiDetailHeaderInfoPresenter.a(view);
            }
        }
    }

    public final void N() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65919, new Class[0], Void.TYPE);
        } else if (this.mBannerVPer.getVisibility() != 0) {
            g.c(getContext(), j.a().a(A()), "map", this.f3754f);
            P();
            a(this.D, this.E);
        } else {
            a.a("top_pic", this.f3750b.f60803d);
            int size = this.v.size();
            if (this.C == null) {
                this.C = a.a();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (al next : this.v) {
                    arrayList.add(next.getMedium());
                    arrayList2.add(next.getLarge());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from", "poi_page");
                hashMap.put("poi_id", this.f3754f);
                hashMap.put("page_type", "top_pic");
                hashMap.put("poi_type", this.h);
                hashMap.put("group_id", A());
                hashMap.put("previous_page", n());
                com.ss.android.ugc.aweme.poi.e.h.a(hashMap, this.f3753e);
                this.C.a(getContext(), arrayList, arrayList2, this.mBannerVPer, size, C0906R.id.ckd, this.f3754f, hashMap);
            }
            this.C.a("tag_poi_header", this.mBannerVPer.getCurrentItem() % size, size);
        }
    }

    public void onResume() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65931, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.mPoiMap.b();
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65943, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null && this.I.isSuccess()) {
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context}, null, s.f60891a, true, 66106, new Class[]{Context.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, s.f60891a, true, 66106, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                long d2 = com.ss.android.ugc.aweme.aj.b.b().d(context, "order_guide_displayed");
                long currentTimeMillis = System.currentTimeMillis();
                if (d2 <= 0 || (currentTimeMillis > d2 && currentTimeMillis - d2 > 604800000)) {
                    com.ss.android.ugc.aweme.aj.b.b().a(context, "order_guide_displayed", currentTimeMillis);
                    z2 = true;
                }
            }
            if (z2) {
                new s(getActivity(), this.I.isBookOrder(), this.f3753e).show();
            }
            this.I = null;
        }
    }

    @Subscribe
    public void onEvent(b bVar) {
        this.I = bVar;
    }

    public final void d_(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, t, false, 65947, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, t, false, 65947, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        P();
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, t, false, 65941, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, t, false, 65941, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid() && message != null) {
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, t, false, 65926, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, t, false, 65926, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mIndicatorView.setText(String.format(getString(C0906R.string.bou), new Object[]{Integer.valueOf(i), Integer.valueOf(this.v.size())}));
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, t, false, 65944, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, t, false, 65944, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("poi", gVar2.itemType) || TextUtils.equals("coupon", gVar2.itemType)) {
            dv.a(getActivity(), this.mStartRecordOutRing, gVar2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, t, false, 65938, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, t, false, 65938, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        this.mPoiMap.a(bundle2);
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, t, false, 65917, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, t, false, 65917, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        String str = this.f3754f;
        if (PatchProxy.isSupport(new Object[]{bitmap2, str}, null, com.ss.android.ugc.aweme.poi.e.m.f59812a, true, 66860, new Class[]{Bitmap.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, str}, null, com.ss.android.ugc.aweme.poi.e.m.f59812a, true, 66860, new Class[]{Bitmap.class, String.class}, Void.TYPE);
            return;
        }
        if (bitmap2 != null) {
            a.i.a((Callable<TResult>) new Callable<Void>(str, bitmap2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59813a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f59814b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Bitmap f59815c;

                /* access modifiers changed from: private */
                /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(2:31|32)|33|34) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a6 */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3 A[SYNTHETIC, Splitter:B:31:0x00a3] */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa A[Catch:{ FileNotFoundException -> 0x00a7, all -> 0x009e }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void call() throws java.lang.Exception {
                    /*
                        r9 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f59813a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                        r4 = 0
                        r5 = 66861(0x1052d, float:9.3692E-41)
                        r2 = r9
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0028
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f59813a
                        r5 = 0
                        r6 = 66861(0x1052d, float:9.3692E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
                        r3 = r9
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        java.lang.Void r0 = (java.lang.Void) r0
                        return r0
                    L_0x0028:
                        java.lang.String r0 = r9.f59814b
                        boolean r0 = com.ss.android.ugc.aweme.poi.e.m.c(r0)
                        r1 = 0
                        if (r0 == 0) goto L_0x0032
                        return r1
                    L_0x0032:
                        java.lang.Class<com.ss.android.ugc.aweme.poi.e.m> r0 = com.ss.android.ugc.aweme.poi.e.m.class
                        monitor-enter(r0)
                        java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00ad }
                        java.lang.String r3 = r9.f59814b     // Catch:{ all -> 0x00ad }
                        java.lang.String r3 = com.ss.android.ugc.aweme.poi.e.m.a(r3)     // Catch:{ all -> 0x00ad }
                        r2.<init>(r3)     // Catch:{ all -> 0x00ad }
                        java.io.File r3 = r2.getParentFile()     // Catch:{ all -> 0x00ad }
                        boolean r3 = r3.exists()     // Catch:{ all -> 0x00ad }
                        if (r3 != 0) goto L_0x0051
                        java.io.File r3 = r2.getParentFile()     // Catch:{ all -> 0x00ad }
                        r3.mkdirs()     // Catch:{ all -> 0x00ad }
                    L_0x0051:
                        java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00a7, all -> 0x009e }
                        r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00a7, all -> 0x009e }
                        android.graphics.Bitmap r2 = r9.f59815c     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r2 = r2.getWidth()     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        android.graphics.Bitmap r4 = r9.f59815c     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r4 = r4.getHeight()     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r2 = java.lang.Math.min(r2, r4)     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        r4 = 400(0x190, float:5.6E-43)
                        if (r2 <= r4) goto L_0x006c
                        int r2 = r2 + -60
                    L_0x006c:
                        android.graphics.Bitmap r4 = r9.f59815c     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        android.graphics.Bitmap r5 = r9.f59815c     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r5 = r5.getWidth()     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r5 = r5 - r2
                        int r5 = r5 / 2
                        android.graphics.Bitmap r6 = r9.f59815c     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r6 = r6.getHeight()     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        int r6 = r6 - r2
                        int r6 = r6 / 2
                        android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r2, r2)     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        r5 = 360(0x168, float:5.04E-43)
                        if (r2 <= r5) goto L_0x008f
                        if (r4 == 0) goto L_0x008f
                        r2 = 1
                        android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r5, r2)     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                    L_0x008f:
                        if (r4 == 0) goto L_0x0098
                        android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                        r5 = 70
                        r4.compress(r2, r5, r3)     // Catch:{ FileNotFoundException -> 0x00a8, all -> 0x009c }
                    L_0x0098:
                        r3.close()     // Catch:{ IOException -> 0x00ab }
                        goto L_0x00ab
                    L_0x009c:
                        r1 = move-exception
                        goto L_0x00a1
                    L_0x009e:
                        r2 = move-exception
                        r3 = r1
                        r1 = r2
                    L_0x00a1:
                        if (r3 == 0) goto L_0x00a6
                        r3.close()     // Catch:{ IOException -> 0x00a6 }
                    L_0x00a6:
                        throw r1     // Catch:{ all -> 0x00ad }
                    L_0x00a7:
                        r3 = r1
                    L_0x00a8:
                        if (r3 == 0) goto L_0x00ab
                        goto L_0x0098
                    L_0x00ab:
                        monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                        return r1
                    L_0x00ad:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.e.m.AnonymousClass1.call():java.lang.Void");
                }

                {
                    this.f59814b = r1;
                    this.f59815c = r2;
                }
            }, (Executor) a.i.f1051a);
        }
    }

    public final void b(com.ss.android.ugc.aweme.poi.a aVar) {
        float zoomSmall;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, t, false, 65928, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, t, false, 65928, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
            return;
        }
        super.b(aVar);
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65929, new Class[0], Void.TYPE);
            return;
        }
        S();
        if (this.i != null) {
            if (this.D <= 0.0d || this.E <= 0.0d) {
                z2 = false;
            }
            if (z2 && getContext() != null) {
                MapLayout mapLayout = this.mPoiMap;
                Bitmap a2 = com.ss.android.ugc.aweme.poi.e.h.a(getContext(), this.j, (p.a) this.u);
                double d2 = this.D;
                double d3 = this.E;
                if (PatchProxy.isSupport(new Object[0], this, t, false, 65930, new Class[0], Float.TYPE)) {
                    zoomSmall = ((Float) PatchProxy.accessDispatch(new Object[0], this, t, false, 65930, new Class[0], Float.TYPE)).floatValue();
                } else if (this.i == null || !p.a(this.i, this.F)) {
                    zoomSmall = this.mPoiMap.getZoomSmall();
                } else {
                    zoomSmall = this.mPoiMap.getZoomBig();
                }
                mapLayout.a(a2, d2, d3, zoomSmall, (com.ss.android.ugc.aweme.poi.map.g) null);
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.poi.b.a aVar) {
        com.ss.android.ugc.aweme.poi.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, t, false, 65942, new Class[]{com.ss.android.ugc.aweme.poi.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, t, false, 65942, new Class[]{com.ss.android.ugc.aweme.poi.b.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && aVar2.isSamePage(this.H)) {
            MapLayout mapLayout = this.mPoiMap;
            if (PatchProxy.isSupport(new Object[0], mapLayout, MapLayout.f59836b, false, 64958, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mapLayout, MapLayout.f59836b, false, 64958, new Class[0], Void.TYPE);
                return;
            }
            mapLayout.f59838d = true;
            if (mapLayout.f59839e) {
                mapLayout.g();
            }
        }
    }

    @OnClick({2131496236, 2131494990, 2131497081, 2131496232, 2131496273, 2131496258, 2131496371})
    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, t, false, 65918, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, t, false, 65918, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.c0f) {
            N();
        } else if (id == C0906R.id.b01) {
            if (this.f3750b != null) {
                i iVar = this.f3750b;
                ViewGroup viewGroup = this.mCollectContainer;
                if (PatchProxy.isSupport(new Object[]{viewGroup}, iVar, i.f60800a, false, 65997, new Class[]{View.class}, Void.TYPE)) {
                    i iVar2 = iVar;
                    PatchProxy.accessDispatch(new Object[]{viewGroup}, iVar2, i.f60800a, false, 65997, new Class[]{View.class}, Void.TYPE);
                } else if (iVar.isViewValid() && iVar.j != null) {
                    PoiAwemeFeedAdapter poiAwemeFeedAdapter = (PoiAwemeFeedAdapter) iVar.j;
                    if (PatchProxy.isSupport(new Object[]{viewGroup}, poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64749, new Class[]{View.class}, Void.TYPE)) {
                        PoiAwemeFeedAdapter poiAwemeFeedAdapter2 = poiAwemeFeedAdapter;
                        PatchProxy.accessDispatch(new Object[]{viewGroup}, poiAwemeFeedAdapter2, PoiAwemeFeedAdapter.f59416f, false, 64749, new Class[]{View.class}, Void.TYPE);
                    } else if (poiAwemeFeedAdapter.g != null) {
                        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = poiAwemeFeedAdapter.g;
                        if (PatchProxy.isSupport(new Object[]{viewGroup}, poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64872, new Class[]{View.class}, Void.TYPE)) {
                            PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder2 = poiOptimizedDetailViewHolder;
                            PatchProxy.accessDispatch(new Object[]{viewGroup}, poiOptimizedDetailViewHolder2, PoiOptimizedDetailViewHolder.f59577a, false, 64872, new Class[]{View.class}, Void.TYPE);
                        } else if (poiOptimizedDetailViewHolder.f59580d != null) {
                            poiOptimizedDetailViewHolder.f59580d.a((View) viewGroup, true);
                        }
                    }
                }
            }
        } else {
            if (id == C0906R.id.cp9) {
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    if (!com.ss.android.ugc.aweme.poi.e.m.c(this.f3754f)) {
                        this.mPoiMap.a((k) new e(this));
                    }
                } else {
                    return;
                }
            } else if (id == C0906R.id.c0b) {
                if (this.G != null) {
                    this.G.a(view2, false);
                }
                return;
            } else if (id == C0906R.id.c1f) {
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    if (!com.ss.android.ugc.aweme.poi.e.m.c(this.f3754f)) {
                        this.mPoiMap.a((k) new f(this));
                    }
                    t();
                    return;
                }
                return;
            } else if (id == C0906R.id.c11) {
                Q();
                return;
            } else if (id == C0906R.id.c43) {
                if (PatchProxy.isSupport(new Object[0], this, t, false, 65949, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, t, false, 65949, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.ac.b.a(getActivity(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new g(this));
                return;
            }
            super.onClick(view);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.music.a.h hVar) {
        com.ss.android.ugc.aweme.music.a.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, t, false, 65950, new Class[]{com.ss.android.ugc.aweme.music.a.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, t, false, 65950, new Class[]{com.ss.android.ugc.aweme.music.a.h.class}, Void.TYPE);
        } else if (hVar2.f56175b != null && TextUtils.equals(hVar2.f56175b.poiId, this.f3754f)) {
            if (this.G != null) {
                this.G.a(hVar2.f56174a);
            }
            if (this.f3750b != null) {
                i iVar = this.f3750b;
                int i = hVar2.f56174a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, iVar, i.f60800a, false, 65998, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    i iVar2 = iVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, iVar2, i.f60800a, false, 65998, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (iVar.isViewValid() && iVar.j != null) {
                    PoiAwemeFeedAdapter poiAwemeFeedAdapter = (PoiAwemeFeedAdapter) iVar.j;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64750, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PoiAwemeFeedAdapter poiAwemeFeedAdapter2 = poiAwemeFeedAdapter;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, poiAwemeFeedAdapter2, PoiAwemeFeedAdapter.f59416f, false, 64750, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (poiAwemeFeedAdapter.g != null) {
                        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = poiAwemeFeedAdapter.g;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64873, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder2 = poiOptimizedDetailViewHolder;
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, poiOptimizedDetailViewHolder2, PoiOptimizedDetailViewHolder.f59577a, false, 64873, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else if (poiOptimizedDetailViewHolder.f59580d != null) {
                            poiOptimizedDetailViewHolder.f59580d.a(i);
                        }
                    }
                }
            }
        }
    }

    public final boolean a(PoiDetail poiDetail) {
        PoiDetail poiDetail2 = poiDetail;
        if (PatchProxy.isSupport(new Object[]{poiDetail2}, this, t, false, 65923, new Class[]{PoiDetail.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiDetail2}, this, t, false, 65923, new Class[]{PoiDetail.class}, Boolean.TYPE)).booleanValue();
        } else if (super.a(poiDetail) || !isViewValid() || poiDetail2 == null || poiDetail.getPoiStruct() == null) {
            return true;
        } else {
            this.i = poiDetail2;
            if (this.J) {
                this.u.a(this.j);
            }
            if (this.G != null) {
                this.G.a(this.mBottomToolbarCollectImg, poiDetail2, false);
            }
            if (!poiDetail.isPoiValid()) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bov).a();
            }
            if (poiDetail2.poiExtension == null || !poiDetail2.poiExtension.hasUploadImagePermission) {
                this.mUploadImage.setVisibility(8);
            } else {
                this.mUploadImage.setVisibility(0);
            }
            if (!StringUtils.isEmpty(this.j.getPoiLatitude()) && !StringUtils.isEmpty(this.j.getPoiLongitude())) {
                try {
                    S();
                    this.D = Double.parseDouble(this.j.getPoiLatitude());
                    this.E = Double.parseDouble(this.j.getPoiLongitude());
                    double[] a2 = c.a(this.D, this.E);
                    this.D = a2[0];
                    this.E = a2[1];
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
            }
            List<al> poiTopPhoto = poiDetail.getPoiTopPhoto();
            if (PatchProxy.isSupport(new Object[]{poiTopPhoto}, this, t, false, 65925, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{poiTopPhoto}, this, t, false, 65925, new Class[]{List.class}, Void.TYPE);
            } else if (!(!isViewValid() || poiTopPhoto == null || poiTopPhoto.size() == 0)) {
                this.v = poiTopPhoto;
                this.B = new com.ss.android.ugc.aweme.discover.helper.i(this.mBannerVPer);
                if (Build.VERSION.SDK_INT >= 19) {
                    this.mStatusBar.getLayoutParams().height = UIUtils.getStatusBarHeight(getContext());
                }
                ViewCompat.setLayoutDirection(this.mIndicatorView, 0);
                if (poiTopPhoto.size() > 1) {
                    this.mIndicatorView.setVisibility(0);
                }
                this.mBannerVPer.setVisibility(0);
                if (this.A == null) {
                    this.A = new PoiBannerAdapter(getContext(), LayoutInflater.from(getContext()), this.f3754f, new PoiBannerViewHolder.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60407a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f60407a, false, 65954, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f60407a, false, 65954, new Class[0], Void.TYPE);
                                return;
                            }
                            AbsSlidablePoiAwemeFeedFragment.this.N();
                        }
                    });
                    this.mBannerVPer.setAdapter(new InfiniteLoopPoiBannerAdapter(this.A, this.v.size(), false));
                }
                boolean a3 = ey.a(getContext());
                if (a3) {
                    Collections.reverse(poiTopPhoto);
                }
                this.B.f42344c = poiTopPhoto.size();
                this.B.f42345d = false;
                PoiBannerAdapter poiBannerAdapter = this.A;
                if (PatchProxy.isSupport(new Object[]{poiTopPhoto}, poiBannerAdapter, PoiBannerAdapter.f59417a, false, 64757, new Class[]{List.class}, Void.TYPE)) {
                    PoiBannerAdapter poiBannerAdapter2 = poiBannerAdapter;
                    PatchProxy.accessDispatch(new Object[]{poiTopPhoto}, poiBannerAdapter2, PoiBannerAdapter.f59417a, false, 64757, new Class[]{List.class}, Void.TYPE);
                } else {
                    poiBannerAdapter.f59418b = poiTopPhoto;
                    poiBannerAdapter.notifyDataSetChanged();
                }
                this.mBannerVPer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60409a;

                    public void onPageScrolled(int i, float f2, int i2) {
                    }

                    public void onPageScrollStateChanged(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60409a, false, 65956, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60409a, false, 65956, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == 0) {
                            a.a(AbsSlidablePoiAwemeFeedFragment.this.f3753e, "top_pic");
                        }
                    }

                    public void onPageSelected(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60409a, false, 65955, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60409a, false, 65955, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        AbsSlidablePoiAwemeFeedFragment.this.b((i % AbsSlidablePoiAwemeFeedFragment.this.v.size()) + 1);
                    }
                });
                if (a3) {
                    this.mBannerVPer.setCurrentItem(poiTopPhoto.size() - 1);
                    b(poiTopPhoto.size() - 1);
                } else {
                    b(1);
                }
            }
            O();
            bg.a(new com.ss.android.ugc.aweme.poi.b.a());
            return false;
        }
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, t, false, 65940, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, t, false, 65940, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.e.h.a("click_map", "click", this.f3753e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, t, false, 65914, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, t, false, 65914, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mTopbarStatus.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
            this.mRouteStatus.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
        }
        this.u = new PoiOptimizedRoutePresenter();
        this.u.a(this, view, this.mPoiMap, R());
        this.z = new d();
        if (com.ss.android.g.a.c() || e.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mPoiMap.a(bundle, z2, q.b(), cf.b(), (com.ss.android.ugc.aweme.poi.map.h) this);
        this.mPoiMap.setOnMapClickListener(this);
        this.mPoiMap.setOnMapZoomGestureListener(this);
        this.mPoiMap.f59850a = this;
        this.w = new WeakHandler(this);
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65916, new Class[0], Void.TYPE);
        } else {
            this.x = !p.d();
            if (this.x) {
                this.mTopCollectImg.setVisibility(8);
            }
        }
        String str = null;
        if (M() && this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.a(this, this, null, this);
        }
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65915, new Class[0], Void.TYPE);
        } else {
            ((RelativeLayout.LayoutParams) this.mTitleBarBg.getLayoutParams()).height = (int) UIUtils.dip2Px(getContext(), 52.0f);
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 32.0f);
            int dip2Px2 = (int) UIUtils.dip2Px(getContext(), 12.0f);
            this.mBackBtn.setBackgroundResource(2130838253);
            this.mBackBtn.setImageResource(2130839863);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mBackBtn.getLayoutParams();
            layoutParams.width = dip2Px;
            layoutParams.height = dip2Px;
            layoutParams.leftMargin = dip2Px2;
            int dip2Px3 = (int) UIUtils.dip2Px(getContext(), 6.0f);
            this.mBackBtn.setPadding(dip2Px3, dip2Px3, dip2Px3, dip2Px3);
            ((RelativeLayout.LayoutParams) this.mTitleBarTools.getLayoutParams()).rightMargin = dip2Px2;
            this.mTopCollectImg.setBackgroundResource(2130838253);
            this.mTopCollectImg.setImageResource(2130839852);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mTopCollectImg.getLayoutParams();
            layoutParams2.width = dip2Px;
            layoutParams2.height = dip2Px;
            this.mTopCollectImg.setPadding(dip2Px3, dip2Px3, dip2Px3, dip2Px3);
            this.mTopCollectImg.setTag(C0906R.id.aqv, Boolean.TRUE);
            this.mShareBtn.setBackgroundResource(2130838253);
            this.mShareBtn.setImageResource(2130839857);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mShareBtn.getLayoutParams();
            layoutParams3.width = dip2Px;
            layoutParams3.height = dip2Px;
            layoutParams3.leftMargin = (int) UIUtils.dip2Px(getContext(), 8.0f);
            this.mShareBtn.setPadding(dip2Px3, dip2Px3, dip2Px3, dip2Px3);
        }
        if (PatchProxy.isSupport(new Object[0], this, t, false, 65945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 65945, new Class[0], Void.TYPE);
            return;
        }
        String str2 = this.f3754f + System.currentTimeMillis();
        if (str2 != null) {
            str = com.ss.android.ugc.effectmanager.common.f.e.a(str2.getBytes());
        }
        this.H = str;
    }
}
