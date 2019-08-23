package com.ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import butterknife.BindView;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.p;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.d.b;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.f.ak;
import com.ss.android.ugc.aweme.feed.f.k;
import com.ss.android.ugc.aweme.feed.f.q;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.guide.i;
import com.ss.android.ugc.aweme.feed.guide.j;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.aq;
import com.ss.android.ugc.aweme.feed.ui.ar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a.b;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.bj;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.main.guide.e;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.store.TaskRecord;
import com.ss.android.ugc.aweme.store.d;
import com.ss.android.ugc.aweme.store.e;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.br;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.video.d;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class FullFeedFragmentPanel extends BaseListFragmentPanel implements c<Aweme>, x {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f3169e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3170f;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3171a;
    private boolean at = false;

    /* renamed from: b  reason: collision with root package name */
    private e f3172b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f3173c = null;

    /* renamed from: d  reason: collision with root package name */
    private ar f3174d;
    aa g;
    bt h = new bt();
    i i;
    j j;
    j k;
    j l;
    public int m = 0;
    @BindView(2131494245)
    ViewGroup mLayout;
    Dialog n = null;
    @BindView(2131497379)
    ViewStub newGuideStub;
    DataSetObserver o = new DataSetObserver() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45684a;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f45684a, false, 41893, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45684a, false, 41893, new Class[0], Void.TYPE);
                return;
            }
            FullFeedFragmentPanel.this.m++;
            if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getInterestSelectShowed() || FullFeedFragmentPanel.this.m != 2) {
                FullFeedFragmentPanel.this.i();
            }
        }
    };
    AbTestManager.a p = new l(this);
    String q = null;
    int r = 0;
    boolean s = false;
    private boolean t = false;
    private boolean u = false;

    class DelayedUiInitTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$run$0$FullFeedFragmentPanel$DelayedUiInitTask() {
            if (FullFeedFragmentPanel.this.bq() && FullFeedFragmentPanel.this.mLoadMoreLayout != null) {
                FullFeedFragmentPanel.this.mLoadMoreLayout.setBackgroundColor(FullFeedFragmentPanel.this.mLoadMoreLayout.getContext().getResources().getColor(C0906R.color.h7));
            }
        }

        private DelayedUiInitTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 41898, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 41898, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            a.a("DelayedUiInitTask");
            if (FullFeedFragmentPanel.this.mLoadMoreLayout != null && FullFeedFragmentPanel.this.mLoadMoreLayout != null) {
                FullFeedFragmentPanel.this.mLoadMoreLayout.post(new p(this));
            }
        }
    }

    @Subscribe
    public void onMainSwipeRefreshABChangedEvent(com.ss.android.ugc.aweme.main.c.c cVar) {
    }

    public final boolean w() {
        return false;
    }

    public void a(List<Aweme> list, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3169e, false, 41839, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3169e, false, 41839, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.aj = true;
            if (this.n != null) {
                q.a(this.n);
                this.n = null;
            }
            DmtStatusView q2 = q(false);
            if (q2 != null) {
                q2.setVisibility(8);
            }
            if (this.A == null || this.A.getCount() != 1 || !com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.A.c(0))) {
                z2 = false;
            } else {
                list.add(0, this.A.c(0));
                this.mLoadMoreLayout.d();
                z2 = true;
            }
            this.Q.setRefreshing(false);
            if (!(this.A == null || this.mViewPager == null || z2)) {
                this.A.c(this.mViewPager.getCurrentItem());
                com.ss.android.ugc.aweme.commerce.b.a.a();
            }
            if (!this.t) {
                if (Lists.isEmpty(list)) {
                    g();
                } else {
                    this.t = true;
                    if (q2 != null) {
                        q2.b();
                    }
                }
            } else if (q2 != null) {
                q2.b();
            }
            IFeedViewHolder af = af();
            if (af != null && !z2) {
                af.j();
            }
            if (!this.W && this.B == 0 && !z2) {
                this.W = true;
            }
            this.A.i = z;
            this.A.a(list);
            h.a().a(list);
            if (this.mViewPager != null) {
                if (this.B != 0) {
                    this.B = 0;
                    this.mViewPager.a(0, false);
                } else {
                    q();
                }
            }
            a("", true);
            bg.a(new k());
            s();
            aC();
            if (com.ss.android.g.a.a() && !z2) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkContentDialogNeedShow(this.ar);
            }
            bg.a(new com.ss.android.ugc.aweme.main.dialogmanager.a());
            this.aj = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, int r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f3169e
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 41859(0xa383, float:5.8657E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004f
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = f3169e
            r15 = 0
            r16 = 41859(0xa383, float:5.8657E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x004f:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r19.ag()
            r3 = r19
            java.lang.String r4 = r3.q
            boolean r4 = android.text.TextUtils.equals(r4, r0)
            if (r4 != 0) goto L_0x0158
            boolean r4 = com.ss.android.ugc.aweme.utils.u.g(r2)
            if (r4 != 0) goto L_0x0158
            boolean r2 = com.ss.android.ugc.aweme.utils.u.f(r2)
            if (r2 == 0) goto L_0x0158
            com.ss.android.ugc.aweme.feed.guide.h r2 = com.ss.android.ugc.aweme.feed.guide.h.a()
            boolean r2 = r2.a((java.lang.String) r0)
            if (r2 != 0) goto L_0x0158
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.f64967a
            r15 = 1
            r16 = 73347(0x11e83, float:1.02781E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x00a2
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.f64967a
            r15 = 1
            r16 = 73347(0x11e83, float:1.02781E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r2
        L_0x0097:
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x00dc
        L_0x00a2:
            com.ss.android.ugc.aweme.share.ci$a r2 = com.ss.android.ugc.aweme.share.ci.f64968b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r15 = 0
            r16 = 73357(0x11e8d, float:1.02795E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x00c9
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r15 = 0
            r16 = 73357(0x11e8d, float:1.02795E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r2
            r17 = r4
            goto L_0x0097
        L_0x00c9:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            int r2 = r2.aQ()
            r4 = 3
            if (r2 != r4) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            if (r2 == 0) goto L_0x00e5
            r2 = 10
            if (r1 != r2) goto L_0x00e5
            r19.g(r20)
        L_0x00e5:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.f64967a
            r15 = 1
            r16 = 73348(0x11e84, float:1.02782E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0114
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.f64967a
            r15 = 1
            r16 = 73348(0x11e84, float:1.02782E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
        L_0x010d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            goto L_0x0150
        L_0x0114:
            com.ss.android.ugc.aweme.share.ci$a r2 = com.ss.android.ugc.aweme.share.ci.f64968b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r15 = 0
            r16 = 73358(0x11e8e, float:1.02796E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x013f
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r14 = 0
            r15 = 73358(0x11e8e, float:1.02796E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r2
            r16 = r4
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x010d
        L_0x013f:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            int r2 = r2.aQ()
            r4 = 4
            if (r2 != r4) goto L_0x0150
            r10 = 1
        L_0x0150:
            if (r10 == 0) goto L_0x0158
            r2 = 5
            if (r1 != r2) goto L_0x0158
            r19.g(r20)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel.a(java.lang.String, int):void");
    }

    private void A() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41877, new Class[0], Void.TYPE);
            return;
        }
        if (this.newGuideStub != null) {
            this.newGuideStub.inflate();
            this.newGuideStub = null;
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41840, new Class[0], Void.TYPE);
            return;
        }
        if (ao()) {
            FeedImpressionReporter.a(this.ak).d();
        }
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41855, new Class[0], Void.TYPE);
            return;
        }
        MainActivity mainActivity = (MainActivity) this.ar;
        if (mainActivity != null) {
            mainActivity.tryShowGuideView();
        }
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41882, new Class[0], Void.TYPE);
            return;
        }
        this.af = false;
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
    }

    public final void aI() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41829, new Class[0], Void.TYPE);
        } else if (this.ar != null && b() && bq()) {
            super.aI();
        }
    }

    public final void al() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41883, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.b();
            this.j = null;
        }
    }

    public final void am() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41884, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.b();
            this.k = null;
        }
    }

    public final void an() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41885, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.b();
            this.l = null;
        }
    }

    public boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41827, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41827, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Activity activity = this.ar;
        if ((activity instanceof MainActivity) && ((MainActivity) activity).isUnderMainTab()) {
            z = true;
        }
        return z;
    }

    public final void bj() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41886, new Class[0], Void.TYPE);
            return;
        }
        if (this.af && !this.ac && !this.ae && !this.ad) {
            G_();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41838, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView q2 = q(true);
        if (q2 != null) {
            q2.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41854, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.b();
            this.g = null;
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41825, new Class[0], Void.TYPE);
            return;
        }
        this.mRefreshLayout.setViewPager(this.mViewPager);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41841, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.mLoadMoreLayout.a();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41846, new Class[0], Void.TYPE);
        } else if (bc() && !this.f3171a) {
        }
    }

    private MainFragment z() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41871, new Class[0], MainFragment.class)) {
            return (MainFragment) PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41871, new Class[0], MainFragment.class);
        }
        Fragment fragment = this.as;
        if (fragment == null || !(fragment.getParentFragment() instanceof MainFragment) || !(fragment.getParentFragment() instanceof MainFragment)) {
            return null;
        }
        return (MainFragment) fragment.getParentFragment();
    }

    public final void G_() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41878, new Class[0], Void.TYPE);
        } else if (this.ac || this.ae || this.ad) {
            this.af = true;
        } else {
            bo();
            A();
            View findViewById = this.mLayout.findViewById(C0906R.id.yn);
            if (findViewById != null) {
                this.i = new i(this.ar, findViewById, a(true));
            }
            this.i.a();
        }
    }

    public final void ak() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41879, new Class[0], Void.TYPE);
        } else if (!ex.b() && !TimeLockRuler.isTeenModeON()) {
            bo();
            A();
            View findViewById = this.mLayout.findViewById(C0906R.id.ye);
            if (findViewById != null) {
                this.j = new j.a(findViewById);
            }
            this.j.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean bn() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41887, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41887, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!super.bn() && (this.i == null || !this.i.f45436b)) {
            if (this.g != null) {
                aa aaVar = this.g;
                if (aaVar.f45703c.m || aaVar.h) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41865, new Class[0], Void.TYPE);
            return;
        }
        if (this.A.getCount() == 3) {
            bg.a(new q("from_full_recommend"));
        }
        this.mViewPager.post(new o(this));
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41872, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            MainFragment z = z();
            if (z != null && com.ss.android.ugc.aweme.bridgeservice.a.a().isFestivalWidgetVisible(z)) {
                com.ss.android.ugc.aweme.festival.christmas.a.d();
                if (com.ss.android.ugc.aweme.festival.christmas.a.c()) {
                    com.ss.android.ugc.aweme.bridgeservice.a.a().hideFestivalWidget(z);
                }
            }
        }
    }

    public final void u_() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41856, new Class[0], Void.TYPE);
            return;
        }
        if (this.A != null && this.A.getCount() > 0 && this.h.b(true) && this.g == null) {
            bo();
            ViewStub viewStub = (ViewStub) this.mLayout.findViewById(C0906R.id.cwt);
            if (viewStub != null) {
                this.g = new aa(this.mViewPager, viewStub);
                if (this.ar instanceof MainActivity) {
                    ((MainActivity) this.ar).setGuideShown(true);
                }
                aa aaVar = this.g;
                aaVar.g = System.currentTimeMillis();
                aaVar.f45704d.postDelayed(aaVar.i, 5000);
            }
        }
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41830, new Class[0], Void.TYPE);
        } else if (this.ar != null && b() && bq() && ((MainActivity) this.ar).isFeedPage()) {
            super.v();
        }
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41837, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (this.n != null) {
                q.a(this.n);
                this.n = null;
            }
            this.Q.setRefreshing(false);
            if (!this.t) {
                g();
            }
        }
    }

    public final void aV() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41852, new Class[0], Void.TYPE);
            return;
        }
        super.aV();
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41834, new Class[0], Void.TYPE);
        } else if (bc()) {
            int childCount = this.mViewPager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                IFeedViewHolder g2 = g(i2);
                if (g2 != null) {
                    g2.g();
                }
            }
        }
        if (this.aq) {
            if (!(this.A == null || this.mViewPager == null)) {
                this.A.a(this.B, false);
                if (!o.v()) {
                    ap().a((com.ss.android.ugc.aweme.video.a.a) this.U);
                    d.b();
                } else {
                    g aG = aG();
                    if (aG != null) {
                        aG.a((com.ss.android.ugc.aweme.video.a.a) this.U);
                    }
                }
                Aweme c2 = this.A.c(this.mViewPager.getCurrentItem());
                if (this.ar instanceof MainActivity) {
                    bg.a(new ac(c2));
                    AwemeChangeCallBack.a((FragmentActivity) this.ar, c2);
                }
                b(c2);
            }
            x();
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41826, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (this.aq) {
            if (com.ss.android.g.a.a()) {
                if (this.ar instanceof MainActivity) {
                    try {
                        MainActivity mainActivity = (MainActivity) this.ar;
                        if (mainActivity.getSupportFragmentManager() != null) {
                            MainFragment mainFragment = (MainFragment) TabChangeManager.a((FragmentActivity) mainActivity).b("HOME");
                            if (!(mainFragment == null || this.as == null || !this.as.equals(mainFragment.a()))) {
                                if (!o.v()) {
                                    ap().a((com.ss.android.ugc.aweme.video.a.a) this.U);
                                    d.b();
                                } else {
                                    g aG = aG();
                                    if (aG != null) {
                                        aG.a((com.ss.android.ugc.aweme.video.a.a) this.U);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (!o.v()) {
                ap().a((com.ss.android.ugc.aweme.video.a.a) this.U);
            } else {
                g aG2 = aG();
                if (aG2 != null) {
                    aG2.a((com.ss.android.ugc.aweme.video.a.a) this.U);
                }
            }
            if (b() && this.A != null && this.A.getCount() > 0 && ((MainActivity) this.ar).isFeedPage() && !f3170f) {
                m(false);
            }
            x();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41857, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            aa aaVar = this.g;
            if (PatchProxy.isSupport(new Object[0], aaVar, aa.f45701a, false, 41940, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aaVar, aa.f45701a, false, 41940, new Class[0], Void.TYPE);
            } else if (aaVar.g != -1 && !com.ss.android.ugc.aweme.feed.guide.d.d() && aaVar.a() && aaVar.f45703c != null && System.currentTimeMillis() - aaVar.g > 5000) {
                aaVar.f45704d.post(aaVar.i);
            }
        }
        if (this.aa != null) {
            com.ss.android.ugc.aweme.feed.guide.e eVar = this.aa;
            if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.feed.guide.e.f45400a, false, 41232, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.feed.guide.e.f45400a, false, 41232, new Class[0], Void.TYPE);
            } else if (eVar.g != -1 && !com.ss.android.ugc.aweme.feed.guide.d.c() && eVar.a() && System.currentTimeMillis() - eVar.g > com.ss.android.ugc.aweme.feed.guide.e.f45401b.longValue() && eVar.f45402c != null) {
                eVar.f45403d.post(eVar.h);
            }
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41867, new Class[0], Void.TYPE);
            return;
        }
        this.A.unregisterDataSetObserver(this.o);
        i();
        AbTestManager a2 = AbTestManager.a();
        AbTestManager.a aVar = this.p;
        if (PatchProxy.isSupport(new Object[]{aVar}, a2, AbTestManager.f63777a, false, 71748, new Class[]{AbTestManager.a.class}, Void.TYPE)) {
            AbTestManager abTestManager = a2;
            PatchProxy.accessDispatch(new Object[]{aVar}, abTestManager, AbTestManager.f63777a, false, 71748, new Class[]{AbTestManager.a.class}, Void.TYPE);
        } else {
            a2.w.remove(aVar);
        }
        if (this.f3174d != null) {
            ar arVar = this.f3174d;
            if (PatchProxy.isSupport(new Object[0], arVar, ar.f46513a, false, 42896, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], arVar, ar.f46513a, false, 42896, new Class[0], Void.TYPE);
            } else {
                aq aqVar = arVar.f46516d;
                if (aqVar != null) {
                    aqVar.dismiss();
                }
                arVar.f46516d = null;
            }
            this.f3174d = null;
        }
        super.n();
    }

    public final void n_() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41835, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isUserRetainRefresh() || this.n != null) {
                FeedPagerAdapter be = be();
                if (be == null || be.getCount() != 1 || !com.ss.android.ugc.aweme.commercialize.utils.c.Q(be.c(0))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z_();
                } else if (!this.t) {
                    this.Q.setRefreshing(false);
                    DmtStatusView q2 = q(true);
                    if (q2 != null) {
                        q2.setVisibility(0);
                        q2.d();
                    }
                } else {
                    this.Q.setRefreshing(true);
                }
            } else {
                this.n = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getUserRetainLoadingDialog(this.ar);
                if (this.n != null) {
                    this.n.show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        if (bc()) {
            IFeedViewHolder aH = aH();
            boolean z = true;
            if (aH != null) {
                aH.a(aH.d(), true);
                if (this.ar instanceof MainActivity) {
                    bg.a(new ac(aH.d()));
                    AwemeChangeCallBack.a((FragmentActivity) this.ar, aH.d());
                }
            }
            if (PatchProxy.isSupport(new Object[]{aH}, null, f3169e, true, 41866, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aH}, null, f3169e, true, 41866, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
            } else if (aH == null || aH.c() != 2) {
                z = false;
            }
            if (!z) {
                Z();
                if (!bm() || aH == null) {
                    aI();
                } else {
                    aH.p();
                    aH.o();
                }
            }
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41844, new Class[0], Void.TYPE);
            return;
        }
        int i2 = 3;
        if (com.ss.android.g.a.b()) {
            if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41845, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41845, new Class[0], Void.TYPE);
            } else {
                if (this.G != null) {
                    int count = this.A.getCount();
                    AbTestManager a2 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71813, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71813, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        AbTestModel d2 = a2.d();
                        if (d2 != null) {
                            i2 = d2.preloadIndex;
                        }
                    }
                    int i3 = count - 1;
                    if (this.B == i3 || count == 1) {
                        r.a("hit_bottom", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", f()).f34114b);
                    }
                    if ((count <= i2 && (this.B == 1 || this.B == i3)) || this.B == count - i2) {
                        this.G.m();
                    }
                }
            }
        } else if (com.ss.android.g.a.c()) {
            if ((this.B == this.A.getCount() - 3 || (this.B == this.A.getCount() - 1 && this.A.getCount() <= 3)) && this.G != null) {
                this.G.m();
            }
        } else if (this.B == this.A.getCount() - 3 && this.G != null) {
            this.G.m();
        }
    }

    public final void bd() {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41876, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, MainPageExperimentHelper.f54220a, true, 57397, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, MainPageExperimentHelper.f54220a, true, 57397, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (MainPageExperimentHelper.a()) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71700, new Class[0], Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71700, new Class[0], Integer.TYPE)).intValue();
                } else {
                    a2.u = 0;
                    AbTestModel d2 = a2.d();
                    if (d2 != null) {
                        a2.u = Integer.valueOf(d2.canShowScrollToFeedFollowGuide);
                    }
                    i2 = a2.u.intValue();
                }
                if (i2 == 1) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z || !aD()) {
            return;
        }
        if (this.M == null || !this.M.f45371f) {
            if ((!(this.ar instanceof MainActivity) || !((MainActivity) this.ar).isInMaskLayer()) && this.f3172b != null) {
                e eVar = this.f3172b;
                if (PatchProxy.isSupport(new Object[0], eVar, e.f54821a, false, 58084, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, e.f54821a, false, 58084, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    if (PatchProxy.isSupport(new Object[0], eVar, e.f54821a, false, 58080, new Class[0], Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, e.f54821a, false, 58080, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z3 = eVar.a().d(true);
                    }
                    if (!z3 || !eVar.f54823c || bj.f54591b || com.ss.android.ugc.aweme.feed.guide.g.f45416b) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (z2 && !this.ac && !this.ad) {
                    e eVar2 = this.f3172b;
                    ViewGroup viewGroup = this.mLayout;
                    if (PatchProxy.isSupport(new Object[]{viewGroup}, eVar2, e.f54821a, false, 58085, new Class[]{ViewGroup.class}, Void.TYPE)) {
                        e eVar3 = eVar2;
                        PatchProxy.accessDispatch(new Object[]{viewGroup}, eVar3, e.f54821a, false, 58085, new Class[]{ViewGroup.class}, Void.TYPE);
                        return;
                    }
                    ViewStub viewStub = (ViewStub) viewGroup.findViewById(C0906R.id.cx2);
                    if (viewStub != null) {
                        viewStub.setOnInflateListener(new com.ss.android.ugc.aweme.main.guide.f(eVar2));
                        if (!eVar2.f54824d) {
                            eVar2.f54825e = viewStub.inflate();
                            if (PatchProxy.isSupport(new Object[0], eVar2, e.f54821a, false, 58078, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], eVar2, e.f54821a, false, 58078, new Class[0], Void.TYPE);
                            } else if (eVar2.f54825e != null) {
                                eVar2.f54826f = (AnimationImageView) eVar2.f54825e.findViewById(C0906R.id.b1t);
                                if (eVar2.f54826f != null && !e.f54822b) {
                                    r.a("page_slide_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_hot").f34114b);
                                    eVar2.f54826f.setRepeatCount(3);
                                    eVar2.f54826f.setImageAssetsFolder("right_scroll/");
                                    eVar2.f54826f.setAnimation("right_pic.json");
                                    eVar2.f54826f.setProgress(0.0f);
                                    eVar2.f54826f.playAnimation();
                                    e.f54822b = true;
                                    if (PatchProxy.isSupport(new Object[0], eVar2, e.f54821a, false, 58081, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], eVar2, e.f54821a, false, 58081, new Class[0], Void.TYPE);
                                    } else {
                                        eVar2.a().e(false);
                                    }
                                }
                            }
                            bg.a(new com.ss.android.ugc.aweme.main.guide.d(true));
                            eVar2.f54825e.postDelayed(new com.ss.android.ugc.aweme.main.guide.g(eVar2), 5200);
                        }
                    }
                }
            }
        }
    }

    public final void y() {
        boolean z;
        int i2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41874, new Class[0], Void.TYPE);
            return;
        }
        super.y();
        if (this.f3172b != null) {
            e eVar = this.f3172b;
            Aweme ag = ag();
            if (PatchProxy.isSupport(new Object[]{ag}, eVar, e.f54821a, false, 58083, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ag}, eVar, e.f54821a, false, 58083, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                if (ag == null || ag.getAuthor() == null || !(ag.getAuthor().getFollowStatus() == 1 || ag.getAuthor().getFollowStatus() == 2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                eVar.f54823c = z2;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41875, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (this.f3174d == null) {
                this.f3174d = new ar(this.ar);
            }
            ar arVar = this.f3174d;
            String aj = aj();
            if (PatchProxy.isSupport(new Object[]{aj}, arVar, ar.f46513a, false, 42894, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aj}, arVar, ar.f46513a, false, 42894, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aj, "aid");
                if (com.ss.android.g.a.a() && Build.VERSION.SDK_INT >= 23 && !ex.b()) {
                    AbTestManager a2 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                    if (a2.ch() > 0 && !arVar.f46515c.f()) {
                        CharSequence g2 = arVar.f46515c.g();
                        if (!StringsKt.split$default(g2, new String[]{","}, false, 0, 6, (Object) null).contains(aj)) {
                            bt btVar = arVar.f46515c;
                            if (!TextUtils.isEmpty(g2)) {
                                aj = r5 + ',' + aj;
                            }
                            btVar.a(aj);
                        }
                    }
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41888, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41888, new Class[0], Boolean.TYPE)).booleanValue();
            } else if ((this.M == null || !this.M.f45371f) && (this.L == null || !this.L.isShowing())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                ar arVar2 = this.f3174d;
                if (PatchProxy.isSupport(new Object[0], arVar2, ar.f46513a, false, 42895, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], arVar2, ar.f46513a, false, 42895, new Class[0], Void.TYPE);
                } else if (com.ss.android.g.a.a() && Build.VERSION.SDK_INT >= 23 && !ex.b() && !arVar2.f46515c.f()) {
                    AbTestManager a3 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                    int ch = a3.ch();
                    if (ch > 0) {
                        if (ch == 2) {
                            i2 = arVar2.f46517e;
                        } else {
                            i2 = arVar2.f46518f;
                        }
                        if (StringsKt.split$default((CharSequence) arVar2.f46515c.g(), new String[]{","}, false, 0, 6, (Object) null).size() >= i2) {
                            a.i.a((Callable<TResult>) new ar.a<TResult>(arVar2), a.i.f1052b);
                        }
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        this.f3171a = z;
    }

    public final void a(com.ss.android.ugc.aweme.feed.adapter.r rVar) {
        if (PatchProxy.isSupport(new Object[]{rVar}, this, f3169e, false, 41819, new Class[]{com.ss.android.ugc.aweme.feed.adapter.r.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rVar}, this, f3169e, false, 41819, new Class[]{com.ss.android.ugc.aweme.feed.adapter.r.class}, Void.TYPE);
            return;
        }
        if (this.mLoadMoreLayout != null) {
            this.mLoadMoreLayout.setLoadMoreListener(rVar);
        }
    }

    private boolean h(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3169e, false, 41864, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f3169e, false, 41864, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.H == null || !this.H.a(str)) {
            return true;
        } else {
            ax();
            this.A.notifyDataSetChanged();
            p();
            return false;
        }
    }

    public final void a_(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3169e, false, 41850, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3169e, false, 41850, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc2, C0906R.string.a4p);
        }
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3169e, false, 41828, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3169e, false, 41828, new Class[]{Aweme.class}, Void.TYPE);
        } else if (b() && bq()) {
            super.b(aweme);
        }
    }

    public void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3169e, false, 41842, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3169e, false, 41842, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            FollowFeedTriggerViewModel.a(this.as.getActivity()).b(false, false);
            this.mLoadMoreLayout.b();
        }
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3169e, false, 41847, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3169e, false, 41847, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.Q.setRefreshing(false);
            if (this.A.getCount() == 0) {
                DmtStatusView q2 = q(true);
                if (q2 != null) {
                    q2.setVisibility(0);
                    q2.f();
                }
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.b6v).a();
        }
    }

    public final void e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3169e, false, 41832, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3169e, false, 41832, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.ar != null && b() && bq() && ((MainActivity) this.ar).isFeedPage()) {
            super.e(aweme);
        }
    }

    public final void m(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3169e, false, 41831, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3169e, false, 41831, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.ar != null && b() && bq() && ((MainActivity) this.ar).isFeedPage()) {
            super.m(z);
        }
    }

    @Subscribe
    public void onDeleteAwemeEvent(com.ss.android.ugc.aweme.feed.f.g gVar) {
        com.ss.android.ugc.aweme.feed.f.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3169e, false, 41868, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3169e, false, 41868, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(f(), "homepage_hot")) {
            h(gVar2.f45306a);
        }
    }

    @Subscribe
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f3169e, false, 41821, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f3169e, false, 41821, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE);
        } else if (iVar.f45311e == this.ar.hashCode()) {
            j(iVar.f45307a);
        }
    }

    @Subscribe
    public void onShareDialogEvent(ak akVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{akVar}, this, f3169e, false, 41862, new Class[]{ak.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar}, this, f3169e, false, 41862, new Class[]{ak.class}, Void.TYPE);
        } else if (aD()) {
            if (akVar.f45288a != 1) {
                z = false;
            }
            this.at = z;
            if (this.at) {
                this.r = 0;
                this.q = null;
            }
        }
    }

    @Subscribe
    public void onVideoCleanModeEvent(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3169e, false, 41822, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3169e, false, 41822, new Class[]{b.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder aH = aH();
        if (aH != null && bVar2.f46857b != null && aH.d() != null && bVar2.f46857b.getAid().equals(aH.d().getAid())) {
            aH.d(bVar2.f46856a);
        }
    }

    private void g(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f3169e, false, 41860, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f3169e, false, 41860, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            MobClick value = new MobClick().setEventName("share_highlight").setLabelName("homepage_hot").setValue(str3);
            JSONObject jSONObject = new JSONObject();
            if (AbTestManager.a().U() == 1) {
                str2 = "double";
            } else {
                str2 = "triple";
            }
            r.onEvent(value.setJsonObject(jSONObject.put("repeat", str2)));
        } catch (JSONException unused) {
        }
        h.a().b(str3);
        p aF = aF();
        if (aD() && aF != null) {
            aF.n();
            ao.a();
        }
    }

    public final void a_(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3169e, false, 41851, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3169e, false, 41851, new Class[]{String.class}, Void.TYPE);
        } else if (bc() && !h(str)) {
            super.a_(str);
        }
    }

    @Subscribe
    public void onCommentDialogEvent(com.ss.android.ugc.aweme.feed.f.f fVar) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f3169e, false, 41861, new Class[]{com.ss.android.ugc.aweme.feed.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f3169e, false, 41861, new Class[]{com.ss.android.ugc.aweme.feed.f.f.class}, Void.TYPE);
            return;
        }
        if (fVar.f45302a == 1) {
            z = true;
        } else {
            z = false;
        }
        l(z);
        if (aD()) {
            if (fVar.f45302a != 1) {
                z2 = false;
            }
            this.u = z2;
            i(this.u);
            if (!this.ac) {
                bj();
            }
            if (!this.u && this.s) {
                g(this.q);
                this.s = false;
            }
            if (!com.ss.android.g.a.a()) {
                Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(fVar.f45304c);
                IFeedViewHolder aE = aE();
                if (aE != null && fVar.f45302a == 0) {
                    CommerceVideoDelegate r2 = aE.r();
                    if (r2 != null) {
                        b2.isShowCommerceCard();
                    }
                    if (r2 != null && com.ss.android.ugc.aweme.commercialize.utils.c.s(b2)) {
                        r2.a(com.ss.android.ugc.aweme.commercialize.utils.c.r(b2) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    }
                }
            }
        }
    }

    public final void p(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3169e, false, 41853, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3169e, false, 41853, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.p(z);
        d((String) null);
        if (!o.v()) {
            aL();
        } else {
            g aG = aG();
            if (aG != null) {
                aG.T();
            }
        }
        d.b().c();
        aY();
        aW();
        i();
        this.Z.H();
    }

    public final void a(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3169e, false, 41820, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3169e, false, 41820, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        if (com.ss.android.g.a.a()) {
            AbTestManager.a().a(this.p);
        }
        if (this.f3172b == null) {
            this.f3172b = new e();
        }
    }

    public void b(Exception exc) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3169e, false, 41836, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3169e, false, 41836, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            if (this.n != null) {
                q.a(this.n);
                this.n = null;
            }
            FeedPagerAdapter be = be();
            if (be == null || be.getCount() != 1 || !com.ss.android.ugc.aweme.commercialize.utils.c.Q(be.c(0))) {
                z = false;
            } else {
                z = true;
            }
            this.Q.setRefreshing(false);
            if (this.t || z) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
                bg.a(new com.ss.android.ugc.aweme.main.dialogmanager.a());
            } else {
                DmtStatusView q2 = q(true);
                if (q2 != null) {
                    q2.f();
                }
            }
            if (PatchProxy.isSupport(new Object[0], null, z.f47066a, true, 40126, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, z.f47066a, true, 40126, new Class[0], Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(z.j)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("URL", z.j);
                    jSONObject.put("DNS", z.m.j);
                    jSONObject.put("Connect", z.m.k);
                    jSONObject.put("SSL", z.m.l);
                    jSONObject.put("Request", z.m.n);
                    jSONObject.put("Response", z.m.o);
                    jSONObject.put("ttfbMs", z.m.q);
                    jSONObject.put("total", z.m.r);
                    jSONObject.put(PushConstants.EXTRA, z.n);
                    jSONObject.put("exception", z.k);
                    jSONObject.put("requestInfo", z.m);
                    jSONObject.put("eTime", z.l);
                    jSONObject.put("network", NetworkUtils.getNetworkAccessType((Context) com.ss.android.ugc.aweme.app.k.a()));
                } catch (JSONException unused) {
                }
                n.a("feed_retry_e", jSONObject);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.feed.f.ar arVar) {
        com.ss.android.ugc.aweme.feed.f.ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f3169e, false, 41849, new Class[]{com.ss.android.ugc.aweme.feed.f.ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f3169e, false, 41849, new Class[]{com.ss.android.ugc.aweme.feed.f.ar.class}, Void.TYPE);
        } else if (arVar2.f45292b != 0 || (b() && bq())) {
            super.a(arVar);
            this.Z.H();
            if (aD()) {
                Aweme aweme = (Aweme) arVar2.f45293c;
                int i2 = arVar2.f45292b;
                if (i2 != 3) {
                    if (i2 != 35) {
                        switch (i2) {
                            case 5:
                                if (aweme != null) {
                                    com.ss.android.ugc.aweme.feed.d.b a2 = com.ss.android.ugc.aweme.feed.d.b.a();
                                    String aid = aweme.getAid();
                                    if (PatchProxy.isSupport(new Object[]{aid}, a2, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41094, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aid}, a2, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41094, new Class[]{String.class}, Void.TYPE);
                                        break;
                                    } else {
                                        if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                                            b.c cVar = (b.c) a2.h.a(aid);
                                            if (cVar == null) {
                                                cVar = new b.c((byte) 0);
                                                a2.h.a(aid, cVar);
                                            }
                                            cVar.f45252d = 1;
                                        }
                                        return;
                                    }
                                }
                                break;
                            case 6:
                                if (aweme != null) {
                                    com.ss.android.ugc.aweme.feed.d.b a3 = com.ss.android.ugc.aweme.feed.d.b.a();
                                    String aid2 = aweme.getAid();
                                    if (PatchProxy.isSupport(new Object[]{aid2}, a3, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41095, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aid2}, a3, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41095, new Class[]{String.class}, Void.TYPE);
                                        break;
                                    } else {
                                        if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                                            b.c cVar2 = (b.c) a3.h.a(aid2);
                                            if (cVar2 != null) {
                                                cVar2.f45252d = 0;
                                            }
                                        }
                                        return;
                                    }
                                }
                                break;
                            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                                if (aweme != null) {
                                    com.ss.android.ugc.aweme.feed.d.b a4 = com.ss.android.ugc.aweme.feed.d.b.a();
                                    String aid3 = aweme.getAid();
                                    if (PatchProxy.isSupport(new Object[]{aid3}, a4, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41089, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aid3}, a4, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41089, new Class[]{String.class}, Void.TYPE);
                                        break;
                                    } else {
                                        if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                                            a4.f45238c++;
                                            b.c cVar3 = (b.c) a4.h.a(aid3);
                                            if (cVar3 == null) {
                                                cVar3 = new b.c((byte) 0);
                                                a4.h.a(aid3, cVar3);
                                            }
                                            cVar3.f45250b = 1;
                                            com.ss.android.ugc.aweme.store.e a5 = com.ss.android.ugc.aweme.store.e.a();
                                            if (!PatchProxy.isSupport(new Object[]{aid3}, a5, com.ss.android.ugc.aweme.store.e.f71757a, false, 82130, new Class[]{String.class}, Void.TYPE)) {
                                                e.a a6 = a5.a(aid3, d.a.COMMENT);
                                                if (a6 != null) {
                                                    TaskRecord taskRecord = a6.f71762b;
                                                    if (!PatchProxy.isSupport(new Object[0], taskRecord, TaskRecord.f71737a, false, 82137, new Class[0], Void.TYPE)) {
                                                        switch (taskRecord.f71741e) {
                                                            case 0:
                                                            case 1:
                                                                taskRecord.a(2);
                                                                break;
                                                            case 3:
                                                                taskRecord.a(6);
                                                                break;
                                                            case 4:
                                                                taskRecord.a(5);
                                                                break;
                                                            case 5:
                                                                break;
                                                        }
                                                    } else {
                                                        PatchProxy.accessDispatch(new Object[0], taskRecord, TaskRecord.f71737a, false, 82137, new Class[0], Void.TYPE);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                PatchProxy.accessDispatch(new Object[]{aid3}, a5, com.ss.android.ugc.aweme.store.e.f71757a, false, 82130, new Class[]{String.class}, Void.TYPE);
                                                break;
                                            }
                                        }
                                        return;
                                    }
                                }
                                break;
                        }
                    } else if (aweme != null) {
                        com.ss.android.ugc.aweme.feed.d.b a7 = com.ss.android.ugc.aweme.feed.d.b.a();
                        String aid4 = aweme.getAid();
                        if (PatchProxy.isSupport(new Object[]{aid4}, a7, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41090, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aid4}, a7, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41090, new Class[]{String.class}, Void.TYPE);
                        } else if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                            b.c cVar4 = (b.c) a7.h.a(aid4);
                            if (cVar4 == null) {
                                cVar4 = new b.c((byte) 0);
                                a7.h.a(aid4, cVar4);
                            }
                            a7.g++;
                            cVar4.f45254f = 1;
                        }
                    }
                } else if (aweme != null) {
                    com.ss.android.ugc.aweme.feed.d.b a8 = com.ss.android.ugc.aweme.feed.d.b.a();
                    String aid5 = aweme.getAid();
                    if (PatchProxy.isSupport(new Object[]{aid5}, a8, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41093, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aid5}, a8, com.ss.android.ugc.aweme.feed.d.b.f45236a, false, 41093, new Class[]{String.class}, Void.TYPE);
                    } else {
                        if (com.ss.android.ugc.aweme.feed.d.b.c()) {
                            a8.f45241f++;
                            b.c cVar5 = (b.c) a8.h.a(aid5);
                            if (cVar5 == null) {
                                cVar5 = new b.c((byte) 0);
                                a8.h.a(aid5, cVar5);
                            }
                            cVar5.f45253e = 1;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3169e
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41858(0xa382, float:5.8656E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3169e
            r3 = 0
            r4 = 41858(0xa382, float:5.8656E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            boolean r0 = r18.bc()
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.String r0 = r7.q
            com.ss.android.ugc.aweme.feed.adapter.p r1 = r18.aF()
            com.ss.android.ugc.aweme.feed.g.e.a(r0, r8, r1)
            boolean r0 = r18.aD()
            if (r0 == 0) goto L_0x0292
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.U()
            if (r0 == 0) goto L_0x0292
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ao.f45046a
            r14 = 1
            r15 = 40249(0x9d39, float:5.6401E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x008a
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ao.f45046a
            r14 = 1
            r15 = 40249(0x9d39, float:5.6401E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00de
        L_0x008a:
            com.ss.android.ugc.aweme.feed.ao.c()
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = com.ss.android.ugc.aweme.base.sharedpref.e.d()
            java.lang.String r2 = "share_guide_show_times"
            int r0 = r0.a((java.lang.String) r2, (int) r10)
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71744(0x11840, float:1.00535E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00ca
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71744(0x11840, float:1.00535E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r2
            r16 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x00d9
        L_0x00ca:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r2 = r2.d()
            if (r2 != 0) goto L_0x00d2
            r2 = 0
            goto L_0x00d9
        L_0x00d2:
            int r2 = r2.shareGuideThreshold
            if (r2 >= 0) goto L_0x00d9
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d9:
            if (r0 >= r2) goto L_0x00dd
            r0 = 1
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = r7.q
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            r2 = 2
            if (r0 == 0) goto L_0x0203
            int r0 = r7.r
            int r0 = r0 + r9
            r7.r = r0
            boolean r0 = r7.at
            if (r0 != 0) goto L_0x01e9
            int r0 = r7.r
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71745(0x11841, float:1.00536E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r3
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0127
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71745(0x11841, float:1.00536E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r3
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0132
        L_0x0127:
            int r3 = r3.U()
            if (r3 != r9) goto L_0x012f
            r1 = 2
            goto L_0x0132
        L_0x012f:
            if (r3 != r2) goto L_0x0132
            r1 = 3
        L_0x0132:
            if (r0 < r1) goto L_0x01e9
            com.ss.android.ugc.aweme.feed.guide.h r0 = com.ss.android.ugc.aweme.feed.guide.h.a()
            boolean r0 = r0.a((java.lang.String) r8)
            if (r0 != 0) goto L_0x01e9
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.f64967a
            r14 = 1
            r15 = 73349(0x11e85, float:1.02784E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x016d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.f64967a
            r14 = 1
            r15 = 73349(0x11e85, float:1.02784E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
        L_0x0162:
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01aa
        L_0x016d:
            com.ss.android.ugc.aweme.share.ci$a r0 = com.ss.android.ugc.aweme.share.ci.f64968b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r14 = 0
            r15 = 73359(0x11e8f, float:1.02798E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0194
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r14 = 0
            r15 = 73359(0x11e8f, float:1.02798E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            goto L_0x0162
        L_0x0194:
            r0 = 4
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r3 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            int r1 = r1.aQ()
            if (r2 <= r1) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            if (r0 < r1) goto L_0x01a9
            r0 = 1
            goto L_0x01aa
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            if (r0 == 0) goto L_0x01c1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r18.ag()
            boolean r0 = com.ss.android.ugc.aweme.utils.u.f(r0)
            if (r0 == 0) goto L_0x01c1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r18.ag()
            boolean r0 = com.ss.android.ugc.aweme.utils.u.g(r0)
            if (r0 != 0) goto L_0x01c1
            r10 = 1
        L_0x01c1:
            if (r10 != 0) goto L_0x01cd
            boolean r0 = r7.u
            if (r0 == 0) goto L_0x01ca
            r7.s = r9
            goto L_0x01cd
        L_0x01ca:
            r18.g(r19)
        L_0x01cd:
            int r0 = r7.r
            if (r0 != r2) goto L_0x01e8
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.ao.b()
            java.lang.String r1 = "awe_share_guide_type_log"
            com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r3 = "awe_share_guide_type"
            com.ss.android.ugc.aweme.app.d.c r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            org.json.JSONObject r0 = r0.b()
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r1, (org.json.JSONObject) r0)
        L_0x01e8:
            return
        L_0x01e9:
            int r0 = r7.r
            if (r0 != r2) goto L_0x0292
            java.lang.String r0 = "awe_share_guide_type_log"
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "awe_share_guide_type"
            java.lang.String r3 = "none"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (org.json.JSONObject) r1)
            return
        L_0x0203:
            r7.r = r9
            r7.q = r8
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.f64967a
            r14 = 1
            r15 = 73346(0x11e82, float:1.0278E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0236
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.f64967a
            r14 = 1
            r15 = 73346(0x11e82, float:1.0278E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
        L_0x022f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x026f
        L_0x0236:
            com.ss.android.ugc.aweme.share.ci$a r1 = com.ss.android.ugc.aweme.share.ci.f64968b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r14 = 0
            r15 = 73356(0x11e8c, float:1.02794E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x025e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.share.ci.a.f64969a
            r3 = 0
            r4 = 73356(0x11e8c, float:1.02794E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x022f
        L_0x025e:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.aQ()
            if (r0 != r2) goto L_0x026e
            goto L_0x026f
        L_0x026e:
            r9 = 0
        L_0x026f:
            if (r9 == 0) goto L_0x0292
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r18.ag()
            boolean r0 = com.ss.android.ugc.aweme.utils.u.f(r0)
            if (r0 == 0) goto L_0x0292
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r18.ag()
            boolean r0 = com.ss.android.ugc.aweme.utils.u.g(r0)
            if (r0 != 0) goto L_0x0292
            com.ss.android.ugc.aweme.feed.guide.h r0 = com.ss.android.ugc.aweme.feed.guide.h.a()
            boolean r0 = r0.a((java.lang.String) r8)
            if (r0 != 0) goto L_0x0292
            r18.g(r19)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel.a(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public FullFeedFragmentPanel(String str, int i2) {
        super(str, i2);
    }

    public final void a(int i2, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aweme}, this, f3169e, false, 41863, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aweme}, this, f3169e, false, 41863, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        super.a(i2, aweme);
        if (!(this.H == null || aweme == null)) {
            this.H.a(aweme.getAid());
        }
    }

    public final void b(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3169e, false, 41843, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3169e, false, 41843, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            FollowFeedTriggerViewModel.a(this.as.getActivity()).b(true, z);
            this.A.i = z;
            if (z || this.f3171a) {
                this.mLoadMoreLayout.d();
            } else {
                this.mLoadMoreLayout.c();
            }
            final Aweme c2 = this.A.c(this.mViewPager.getCurrentItem());
            final int indexOf = list.indexOf(c2);
            this.A.a(list);
            if (!this.f3171a) {
                this.mViewPager.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45688a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f45688a, false, 41896, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45688a, false, 41896, new Class[0], Void.TYPE);
                            return;
                        }
                        if (indexOf < FullFeedFragmentPanel.this.A.getCount() - 1 && FullFeedFragmentPanel.this.mViewPager != null && !com.ss.android.ugc.aweme.commercialize.utils.c.Q(c2)) {
                            FullFeedFragmentPanel.this.B = indexOf + 1;
                            FullFeedFragmentPanel.this.D = true;
                            FullFeedFragmentPanel.this.mViewPager.setCurrentItemWithDefaultVelocity(FullFeedFragmentPanel.this.B);
                        }
                    }
                });
            }
            s();
        }
    }

    public final void c(List<Aweme> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3169e, false, 41848, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3169e, false, 41848, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.Q.setRefreshing(false);
            if (z || this.f3171a) {
                if (this.f3171a && !CollectionUtils.isEmpty(list) && this.A.getCount() != list.size()) {
                    z2 = true;
                }
                this.N = z2;
                this.A.a(list);
                if (!this.f3171a) {
                    this.mViewPager.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45692a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f45692a, false, 41897, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f45692a, false, 41897, new Class[0], Void.TYPE);
                                return;
                            }
                            if (FullFeedFragmentPanel.this.mViewPager != null) {
                                FullFeedFragmentPanel.this.B = 0;
                                FullFeedFragmentPanel.this.D = true;
                                FullFeedFragmentPanel.this.mViewPager.a(0, false);
                            }
                        }
                    });
                }
            } else if (this.aq && this.ar != null && b()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, (int) C0906R.string.a3f).a();
                if (this.mViewPager.getCurrentItem() > 1) {
                    this.mViewPager.a(0, false);
                } else {
                    this.mViewPager.setCurrentItemWithDefaultVelocity(0);
                }
            }
            s();
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3169e, false, 41824, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3169e, false, 41824, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.thermometer.a.f77802b.a(new n(this, view, bundle), "launch-profile", "FullFeedFragmentPanel-onViewCreated-super", null);
        if (PatchProxy.isSupport(new Object[0], this, f3169e, false, 41823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3169e, false, 41823, new Class[0], Void.TYPE);
            return;
        }
        this.mLayout.setOnClickListener(m.f45738b);
        this.Q = new bk(this.mRefreshLayout);
        this.mViewPager.a((ViewPager.OnPageChangeListener) new ViewPager.SimpleOnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45686a;

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f45686a, false, 41894, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f45686a, false, 41894, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1 && FullFeedFragmentPanel.this.h.b(true)) {
                    FullFeedFragmentPanel.this.h.c(false);
                    FullFeedFragmentPanel.this.i();
                }
                com.ss.android.ugc.aweme.shortvideo.f.f fVar = new com.ss.android.ugc.aweme.shortvideo.f.f(10);
                fVar.f67650e = 1;
                fVar.f67651f = FullFeedFragmentPanel.this;
                bg.a(fVar);
                FullFeedFragmentPanel.this.q();
            }

            public void onPageScrolled(int i, float f2, int i2) {
                int i3 = i2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f45686a, false, 41895, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f45686a, false, 41895, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == FullFeedFragmentPanel.this.B) {
                    if (FullFeedFragmentPanel.this.g != null) {
                        FullFeedFragmentPanel.this.g.a((float) (-i3));
                    }
                } else if (FullFeedFragmentPanel.this.g != null) {
                    FullFeedFragmentPanel.this.g.a((float) (UIUtils.getScreenHeight(FullFeedFragmentPanel.this.ar) - i3));
                }
                bg.a(new com.ss.android.ugc.aweme.detail.c.a(Math.abs(0.5f - f2)));
                bg.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.b(FullFeedFragmentPanel.this.ag(), FullFeedFragmentPanel.this.f(), FullFeedFragmentPanel.this.bh(), FullFeedFragmentPanel.this));
            }
        });
        br.a(this.T.getEventType()).a(this.mViewPager);
        this.A.registerDataSetObserver(this.o);
        this.mLoadMoreLayout.d();
        this.mLoadMoreLayout.a(this.mViewPager, this.mRefreshLayout);
        this.mLoadMoreLayout.setLabel("main_feed");
        com.ss.android.ugc.aweme.lego.a.i.a().a(new DelayedUiInitTask()).a();
        if (!com.ss.android.g.a.a()) {
            this.mViewPager.setContentDescription(this.ar.getString(C0906R.string.dr0));
        }
    }

    public final FeedPagerAdapter a(Context context, LayoutInflater layoutInflater, int i2, aa<com.ss.android.ugc.aweme.feed.f.ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, f3169e, false, 41818, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class)) {
            return (FeedPagerAdapter) PatchProxy.accessDispatch(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, f3169e, false, 41818, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class);
        }
        FullFeedPagerAdapter fullFeedPagerAdapter = new FullFeedPagerAdapter(context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams);
        return fullFeedPagerAdapter;
    }
}
