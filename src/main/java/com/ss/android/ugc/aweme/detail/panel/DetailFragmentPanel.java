package com.ss.android.ugc.aweme.detail.panel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.comment.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.ss.android.ugc.aweme.detail.e.j;
import com.ss.android.ugc.aweme.detail.e.k;
import com.ss.android.ugc.aweme.detail.ui.i;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.r;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.f.an;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.f;
import com.ss.android.ugc.aweme.feed.f.q;
import com.ss.android.ugc.aweme.feed.g.e;
import com.ss.android.ugc.aweme.feed.guide.g;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.listener.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.aa;
import com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DetailVideoSeekBarFragment;
import com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.poi.model.h;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.u.ab;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.Nullable;

public class DetailFragmentPanel extends BaseListFragmentPanel implements CommentInputFragment.a, c<Aweme>, j, k, x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2998a;
    protected com.ss.android.ugc.aweme.feed.listener.a a_;
    private boolean at = false;
    private boolean au = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2999b;

    /* renamed from: c  reason: collision with root package name */
    public i f3000c;

    /* renamed from: d  reason: collision with root package name */
    protected CommentInputFragment f3001d;

    /* renamed from: e  reason: collision with root package name */
    protected DetailVideoSeekBarFragment f3002e;

    /* renamed from: f  reason: collision with root package name */
    aa f3003f;
    g g;
    protected bt h = new bt();
    public r j;
    public boolean k = true;
    public com.ss.android.ugc.aweme.detail.b.a l;
    boolean m = false;
    @BindView(2131496852)
    protected View mLayout;
    protected int n;
    public o o;
    public bu.b p = new bu.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41302a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f41302a, false, 34978, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41302a, false, 34978, new Class[0], Void.TYPE);
                return;
            }
            if (DetailFragmentPanel.this.g != null) {
                DetailFragmentPanel.this.g.b();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f41302a, false, 34979, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41302a, false, 34979, new Class[0], Void.TYPE);
                return;
            }
            DetailFragmentPanel.this.i();
        }
    };
    public a q;
    private boolean r;
    private boolean s;
    private String t;
    private boolean u;

    public interface a {
        void g();
    }

    public final boolean w() {
        return true;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2998a, false, 34897, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2998a, false, 34897, new Class[]{String.class}, Void.TYPE);
        } else if (bc()) {
            e.a(this.t, str, aF());
            this.t = str;
        }
    }

    public void a(List list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34914, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f2998a, false, 34914, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            if (this.f3001d != null) {
                this.f3001d.e();
            }
            DmtStatusView q2 = q(false);
            if (!this.at) {
                if (Lists.isEmpty(list)) {
                    DmtStatusView q3 = q(true);
                    if (q3 != null) {
                        q3.e();
                    }
                } else {
                    this.at = true;
                    if (q2 != null) {
                        q2.b();
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f41317a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f41317a, false, 34969, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f41317a, false, 34969, new Class[0], Void.TYPE);
                                return;
                            }
                            if (DetailFragmentPanel.this.T.isShowShareAfterOpen()) {
                                DetailFragmentPanel.this.f(DetailFragmentPanel.this.s());
                            }
                            if (DetailFragmentPanel.this.T.isShowCommentAfterOpen()) {
                                DetailFragmentPanel.this.g(DetailFragmentPanel.this.r());
                            }
                        }
                    });
                }
            } else if (q2 != null) {
                q2.b();
            }
            List list2 = null;
            if (list != null && !list.isEmpty() && (list.get(0) instanceof Aweme)) {
                list2 = list;
            }
            if (ba()) {
                list2 = e(list2);
            }
            List list3 = list2;
            this.Q.setRefreshing(false);
            this.A.i = z;
            c(list3);
            if (PatchProxy.isSupport(new Object[]{list3}, this, f2998a, false, 34915, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list3}, this, f2998a, false, 34915, new Class[]{List.class}, Void.TYPE);
            } else {
                int a2 = a(list3);
                if (a2 != -1 && a2 < this.A.getCount()) {
                    if (!(this.A == null || this.mViewPager.getExpectedAdapterCount() == this.A.getCount())) {
                        this.A.notifyDataSetChanged();
                    }
                    this.mViewPager.a(a2, false);
                }
            }
            a("", true);
            bg.a(new com.ss.android.ugc.aweme.feed.f.k());
            M();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34925, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34925, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.b6v);
            DmtStatusView q2 = q(false);
            if (q2 != null) {
                q2.setVisibility(8);
            }
        }
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f2998a, false, 34926, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f2998a, false, 34926, new Class[]{Aweme.class}, Void.TYPE);
        } else if (bc()) {
            DmtStatusView q2 = q(false);
            if (q2 != null) {
                q2.setVisibility(8);
            }
            if (aweme == null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.dr_).a();
            } else if (!e(bg()) || !aweme.isForwardAweme() || aweme.getForwardItem() != null) {
                if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                    this.mLayout.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f41292a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f41292a, false, 34972, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f41292a, false, 34972, new Class[0], Void.TYPE);
                                return;
                            }
                            if (DetailFragmentPanel.this.ar != null && !DetailFragmentPanel.this.ar.isFinishing()) {
                                DetailFragmentPanel.this.ar.finish();
                            }
                        }
                    }, 600);
                }
                if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needCheckPrivateAccountBeforePlay(aweme.getAuthor())) {
                    if (this.f3001d != null) {
                        this.f3001d.f(false);
                    }
                    if (this.q != null) {
                        this.q.g();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(com.ss.android.ugc.aweme.feed.a.a().a(aweme));
                    c((List<Aweme>) arrayList);
                    if (this.f3001d != null) {
                        this.f3001d.b();
                    }
                }
                if (("message".equals(f()) || "chat".equals(f()) || "push".equals(f())) && !TextUtils.isEmpty(bv())) {
                    c(s(), bv());
                }
            } else {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.ahg).a();
            }
        }
    }

    public final void a(ar arVar) {
        boolean z;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f2998a, false, 34937, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f2998a, false, 34937, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        switch (arVar2.f45292b) {
            case 8:
                if (bc()) {
                    this.mViewPager.setCanTouch(false);
                    this.mRefreshLayout.setCanTouch(false);
                    IFeedViewHolder aE = aE();
                    if (aE != null) {
                        CommerceVideoDelegate r2 = aE.r();
                        if (r2 != null) {
                            r2.a(false);
                        }
                        aE.a(true);
                    }
                    IFeedViewHolder k2 = k(this.E);
                    if (k2 != null) {
                        CommerceVideoDelegate r3 = k2.r();
                        if (r3 != null) {
                            r3.a(br(), false, aE);
                            r3.e();
                        }
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 9:
                if (af() == null || !af().C()) {
                    this.mViewPager.setCanTouch(true);
                    this.mRefreshLayout.setCanTouch(true);
                    IFeedViewHolder aE2 = aE();
                    if (aE2 != null) {
                        if (this.au) {
                            aE2.a(true);
                            return;
                        } else {
                            aE2.a(false);
                            return;
                        }
                    }
                }
                break;
            case 10:
                Activity activity = this.ar;
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                break;
            case 11:
                if (!NetworkUtils.isNetworkAvailable(this.ar)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
                    return;
                }
                IFeedViewHolder aH = aH();
                if (PatchProxy.isSupport(new Object[]{aH}, this, f2998a, false, 34938, new Class[]{IFeedViewHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aH}, this, f2998a, false, 34938, new Class[]{IFeedViewHolder.class}, Void.TYPE);
                    break;
                } else {
                    if (com.ss.android.g.a.a()) {
                        if (!(aH == null || aH.d() == null)) {
                            if (f().equals("opus")) {
                                if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34952, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34952, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    z = this.T.isMyProfile();
                                }
                                if (z) {
                                    com.ss.android.ugc.aweme.common.r.a((Context) this.ar, "comment", "personal_homepage", bu(), 0);
                                } else {
                                    com.ss.android.ugc.aweme.common.r.a((Context) this.ar, "comment", "others_homepage", bu(), 0);
                                }
                            } else {
                                com.ss.android.ugc.aweme.common.r.a((Context) this.ar, "comment", f(), bu(), 0);
                            }
                            a(aH, a(true));
                            break;
                        }
                    } else if (!(aH == null || aH.d() == null)) {
                        t tVar = new t();
                        tVar.a("enter_from", f());
                        tVar.a("author_id", aH.d().getAuthorUid());
                        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(aH.d()))) {
                            tVar.a("poi_id", com.ss.android.ugc.aweme.u.aa.e(aH.d()));
                        }
                        if (com.ss.android.ugc.aweme.u.aa.c(f())) {
                            tVar.a("city_info", com.ss.android.ugc.aweme.u.aa.a());
                            tVar.a("distance_info", com.ss.android.ugc.aweme.u.aa.i(aH.d()));
                            tVar.a("poi_type", com.ss.android.ugc.aweme.u.aa.h(aH.d()));
                            tVar.a("poi_channel", com.ss.android.ugc.aweme.u.aa.b());
                        }
                        com.ss.android.ugc.aweme.common.r.a((Context) this.ar, "comment", f(), com.ss.android.ugc.aweme.u.aa.m(aH.d()), 0, tVar.a());
                        com.ss.android.ugc.aweme.common.r.a("comment", (Map) d.a().a("enter_from", f()).a("group_id", com.ss.android.ugc.aweme.u.aa.m(aH.d())).f34114b);
                        a(aH, f());
                    }
                    return;
                }
            default:
                super.a(arVar);
                break;
        }
    }

    public final long z() {
        if (this.U != null) {
            return this.U.f45110e;
        }
        return -1;
    }

    public DetailFragmentPanel() {
        super("");
    }

    private void G() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34895, new Class[0], Void.TYPE);
            return;
        }
        if (this.mViewPager != null) {
            this.mViewPager.a((ViewPager.OnPageChangeListener) new ViewPager.SimpleOnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41315a;

                public void onPageScrolled(int i, float f2, int i2) {
                    int i3 = i2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41315a, false, 34985, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41315a, false, 34985, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == DetailFragmentPanel.this.B) {
                        if (DetailFragmentPanel.this.f3003f != null) {
                            DetailFragmentPanel.this.f3003f.a((float) (-i3));
                        }
                    } else if (DetailFragmentPanel.this.f3003f != null) {
                        DetailFragmentPanel.this.f3003f.a((float) (UIUtils.getScreenHeight(DetailFragmentPanel.this.ar) - i3));
                    }
                }
            });
        }
    }

    private boolean I() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34898, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34898, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().v() == 0) {
            z = true;
        }
        return z;
    }

    private void M() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34920, new Class[0], Void.TYPE);
            return;
        }
        if (ao()) {
            FeedImpressionReporter.a(this.ak).d();
        }
    }

    private String bu() {
        if (!PatchProxy.isSupport(new Object[0], this, f2998a, false, 34954, new Class[0], String.class)) {
            return this.T.getAid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34954, new Class[0], String.class);
    }

    private String bv() {
        if (!PatchProxy.isSupport(new Object[0], this, f2998a, false, 34955, new Class[0], String.class)) {
            return this.T.getCid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34955, new Class[0], String.class);
    }

    public final String B() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34966, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34966, new Class[0], String.class);
        } else if (this.T != null) {
            return this.T.getTabName();
        } else {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C() {
        if (bc()) {
            IFeedViewHolder aE = aE();
            if (b.f(aE)) {
                if (bm()) {
                    aE.p();
                    aE.o();
                    return;
                }
                aE.a(aE.d(), true);
                b(aE.d());
            }
        }
    }

    public final Aweme b() {
        if (!PatchProxy.isSupport(new Object[0], this, f2998a, false, 34934, new Class[0], Aweme.class)) {
            return s();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34934, new Class[0], Aweme.class);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34891, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3003f != null) {
            this.f3003f.b();
            this.f3003f = null;
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34908, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        if (this.g != null) {
            this.g.b();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34909, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.ar;
        if (activity != null) {
            activity.finish();
        }
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34910, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        g();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34917, new Class[0], Void.TYPE);
            return;
        }
        if (bc() && !this.u) {
            this.mLoadMoreLayout.a();
        }
    }

    public final boolean t() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34935, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34935, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean t2 = super.t();
        if (this.f3001d != null) {
            this.f3001d.f(!t2);
        }
        return t2;
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34936, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        if (this.f3001d != null) {
            this.f3001d.f(true);
        }
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34943, new Class[0], Void.TYPE);
        } else if (bq() && this.k) {
            super.v();
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34950, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3001d != null) {
            this.f3001d.c();
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34951, new Class[0], Void.TYPE);
            return;
        }
        super.y();
        this.U.a();
        if (this.o != null) {
            x();
            aE();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34913, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3001d != null) {
            this.f3001d.d();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34921, new Class[0], Void.TYPE);
        } else if (bc() && !this.u) {
            this.Q.setRefreshing(true);
        }
    }

    public final void A() {
        float f2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34965, new Class[0], Void.TYPE);
            return;
        }
        Aweme c2 = this.A.c(this.B);
        if (c2 != null) {
            if (c2.getAwemeType() == 101) {
                z = true;
            }
            float f3 = 1.0f;
            if (this.f3001d != null) {
                this.f3001d.a(z);
                CommentInputFragment commentInputFragment = this.f3001d;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                commentInputFragment.a(f2);
            }
            if (this.l != null) {
                com.ss.android.ugc.aweme.detail.b.a aVar = this.l;
                if (z) {
                    f3 = 0.0f;
                }
                aVar.a(f3);
            }
            if (this.f3002e != null) {
                this.f3002e.a(z);
            }
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34911, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (this.f3001d != null) {
                this.f3001d.d();
            }
            DmtStatusView q2 = q(true);
            if (q2 != null) {
                q2.setVisibility(0);
                q2.d();
            }
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34924, new Class[0], Void.TYPE);
        } else if (bc()) {
            super.o();
            if (!this.A.i) {
                this.mLoadMoreLayout.c();
                return;
            }
            if (this.B == this.A.getCount() - 3 && this.a_ != null) {
                this.a_.m();
            }
        }
    }

    public final Aweme r() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34932, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34932, new Class[0], Aweme.class);
        }
        IFeedViewHolder aH = aH();
        if (aH != null) {
            return aH.B();
        }
        if (this.A == null || this.mViewPager == null) {
            return null;
        }
        return this.A.d(this.mViewPager.getCurrentItem());
    }

    public final Aweme s() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34933, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34933, new Class[0], Aweme.class);
        }
        IFeedViewHolder aH = aH();
        if (aH != null) {
            return aH.d();
        }
        if (this.A == null || this.mViewPager == null) {
            return null;
        }
        return this.A.c(this.mViewPager.getCurrentItem());
    }

    private boolean H() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34896, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34896, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m) {
            return false;
        } else {
            int a2 = this.h.a();
            try {
                i = com.ss.android.ugc.aweme.global.config.settings.g.b().bT().intValue();
            } catch (com.bytedance.ies.a unused) {
                i = 0;
            }
            if (i == 0) {
                i = 3;
            }
            if (a2 >= i || !this.T.isHotSpot()) {
                return false;
            }
            bt btVar = this.h;
            int i2 = a2 + 1;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, btVar, bt.f54646a, false, 57639, new Class[]{Integer.TYPE}, Void.TYPE)) {
                bt btVar2 = btVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, btVar2, bt.f54646a, false, 57639, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                try {
                    btVar.f54647b.b(i2);
                } catch (Throwable th) {
                    ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
                }
            }
            G();
            this.m = true;
            return true;
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34907, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (this.aq && this.A != null && this.A.getCount() > 0) {
            if (!ap().b((com.ss.android.ugc.aweme.video.a.a) this.U)) {
                IFeedViewHolder aE = aE();
                if (!com.ss.android.ugc.aweme.video.o.v()) {
                    ap().a((com.ss.android.ugc.aweme.video.a.a) this.U);
                } else if (aE != null) {
                    com.ss.android.ugc.playerkit.videoview.g m2 = aE.m();
                    if (m2 != null) {
                        m2.a((com.ss.android.ugc.aweme.video.a.a) this.U);
                    }
                }
                if (b.f(aE) && aE.k().v()) {
                    b(aE.d());
                }
            } else if (this.k) {
                v();
            }
        }
        i();
    }

    public void p() {
        CommentInputFragment commentInputFragment;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34930, new Class[0], Void.TYPE);
        } else if (this.ar != null && !this.ar.isFinishing()) {
            Fragment findFragmentByTag = br().findFragmentByTag("detail");
            if (findFragmentByTag == null) {
                if (PatchProxy.isSupport(new Object[0], null, CommentInputFragment.f2849a, true, 27426, new Class[0], CommentInputFragment.class)) {
                    commentInputFragment = (CommentInputFragment) PatchProxy.accessDispatch(new Object[0], null, CommentInputFragment.f2849a, true, 27426, new Class[0], CommentInputFragment.class);
                } else {
                    commentInputFragment = new CommentInputFragment();
                }
                this.f3001d = commentInputFragment;
                this.f3001d.f2853e = a(true);
                this.f3001d.f2851c = this;
                this.f3001d.f2852d = new CommentInputFragment.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41294a;

                    public final void a(boolean z) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41294a, false, 34973, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41294a, false, 34973, new Class[]{Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        if (DetailFragmentPanel.this.f3002e != null) {
                            DetailVideoSeekBarFragment detailVideoSeekBarFragment = DetailFragmentPanel.this.f3002e;
                            if (PatchProxy.isSupport(new Object[0], detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43527, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43527, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.b bVar = detailVideoSeekBarFragment.f46876e;
                            if (bVar != null) {
                                bVar.c();
                            }
                        }
                    }
                };
                try {
                    this.f3001d.show(br(), "detail");
                } catch (IllegalStateException unused) {
                    br().beginTransaction().add((Fragment) this.f3001d, "detail").commitAllowingStateLoss();
                }
            } else {
                this.f3001d = (CommentInputFragment) findFragmentByTag;
                this.f3001d.f2851c = this;
            }
        }
    }

    public void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34931, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && this.ar != null && !this.ar.isFinishing()) {
            Fragment findFragmentByTag = br().findFragmentByTag("detail_seek_bar");
            if (findFragmentByTag == null) {
                this.f3002e = new DetailVideoSeekBarFragment();
                this.f3002e.f46875d = new DispatchTouchEventLinearLayout.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41296a;

                    public final boolean a(@Nullable KeyEvent keyEvent) {
                        if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f41296a, false, 34975, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f41296a, false, 34975, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (DetailFragmentPanel.this.f3001d == null || DetailFragmentPanel.this.f3001d.getDialog() == null || keyEvent == null) {
                            return false;
                        } else {
                            return DetailFragmentPanel.this.f3001d.getDialog().dispatchKeyEvent(keyEvent);
                        }
                    }

                    public final boolean a(@Nullable MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f41296a, false, 34974, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f41296a, false, 34974, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (DetailFragmentPanel.this.f3001d == null || DetailFragmentPanel.this.f3001d.getDialog() == null || motionEvent == null) {
                            return false;
                        } else {
                            return DetailFragmentPanel.this.f3001d.getDialog().dispatchTouchEvent(motionEvent);
                        }
                    }
                };
                DetailVideoSeekBarFragment detailVideoSeekBarFragment = this.f3002e;
                if (PatchProxy.isSupport(new Object[]{this}, detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43518, new Class[]{BaseListFragmentPanel.class}, Void.TYPE)) {
                    DetailVideoSeekBarFragment detailVideoSeekBarFragment2 = detailVideoSeekBarFragment;
                    PatchProxy.accessDispatch(new Object[]{this}, detailVideoSeekBarFragment2, DetailVideoSeekBarFragment.f46872a, false, 43518, new Class[]{BaseListFragmentPanel.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(this, "baseListFragmentPanel");
                    detailVideoSeekBarFragment.f46877f = this;
                }
                try {
                    this.f3002e.show(br(), "detail_seek_bar");
                } catch (IllegalStateException unused) {
                    br().beginTransaction().add((Fragment) this.f3002e, "detail_seek_bar").commitAllowingStateLoss();
                }
            } else {
                this.f3002e = (DetailVideoSeekBarFragment) findFragmentByTag;
            }
        }
    }

    public final boolean i() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34899, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34899, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!I() && aZ()) {
            if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34901, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34901, new Class[0], Boolean.TYPE)).booleanValue();
            } else if ((!com.ss.android.g.a.a() || AbTestManager.a().bI()) && com.ss.android.ugc.aweme.feed.panel.i.f45730a > 0 && ((Integer) SharePrefCache.inst().getScrollToProfileGuideState().c()).intValue() == 1) {
                bg.a(new com.ss.android.ugc.aweme.detail.c.b(true));
                if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34902, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34902, new Class[0], Void.TYPE);
                } else if ((!com.ss.android.g.a.a() || AbTestManager.a().bI()) && bc() && this.g == null) {
                    this.g = new g((ViewStub) this.mLayout.findViewById(C0906R.id.cx3));
                    this.g.a();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34900, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34900, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.ar == null || !this.h.b(true) || this.r) {
                    z2 = false;
                } else {
                    this.r = true;
                    View inflate = ((ViewStub) this.mLayout.findViewById(C0906R.id.cwv)).inflate();
                    AnimationImageView animationImageView = (AnimationImageView) inflate.findViewById(C0906R.id.ama);
                    animationImageView.loop(true);
                    animationImageView.setAnimation("home_swipe_up_guide.json");
                    animationImageView.playAnimation();
                    inflate.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f41304a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f41304a, false, 34986, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f41304a, false, 34986, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            DetailFragmentPanel.this.h.c(false);
                            DetailFragmentPanel.this.v();
                        }
                    });
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void j() {
        boolean z;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34906, new Class[0], Void.TYPE);
            return;
        }
        this.B = 0;
        com.ss.android.ugc.aweme.common.f.a aVar = com.ss.android.ugc.aweme.feed.a.a().f44610c;
        List<Aweme> list = null;
        if (aVar instanceof com.ss.android.ugc.aweme.follow.presenter.b) {
            list = com.ss.android.ugc.aweme.follow.presenter.b.a(((com.ss.android.ugc.aweme.follow.presenter.b) aVar).getItems());
        } else if (aVar instanceof com.ss.android.ugc.aweme.newfollow.userstate.a) {
            list = com.ss.android.ugc.aweme.follow.presenter.b.a(((com.ss.android.ugc.aweme.newfollow.userstate.a) aVar).getItems());
        } else if (aVar instanceof com.ss.android.ugc.aweme.discover.mixfeed.c) {
            list = com.ss.android.ugc.aweme.discover.mixfeed.c.a(((com.ss.android.ugc.aweme.discover.mixfeed.c) aVar).getItems());
        } else if (aVar instanceof h) {
            list = h.a(((h) aVar).getItems());
        } else if ("homepage_fresh".equalsIgnoreCase(f())) {
            if (aVar != null) {
                list = d(aVar.getItems());
            }
        } else if (aVar != null) {
            list = aVar.getItems();
        }
        if (aVar == null || !aVar.isHasMore()) {
            z = false;
        } else {
            z = true;
        }
        if (!CollectionUtils.isEmpty(list)) {
            if (ba()) {
                list = e(list);
            }
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                Aweme aweme = list.get(i);
                if (aweme != null && StringUtils.equal(aweme.getAid(), bu())) {
                    this.B = i;
                    break;
                }
                i++;
            }
            c(list);
            this.A.i = z;
            this.mViewPager.setCurrentItem(this.B);
            A();
        }
        if (z || bh() != -1) {
            this.mLoadMoreLayout.d();
        } else {
            this.mLoadMoreLayout.c();
        }
        this.mViewPager.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41306a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f41306a, false, 34989, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f41306a, false, 34989, new Class[0], Void.TYPE);
                    return;
                }
                if (DetailFragmentPanel.this.f3001d != null) {
                    DetailFragmentPanel.this.f3001d.b();
                }
            }
        }, 150);
        this.mLoadMoreLayout.a(this.mViewPager, this.mRefreshLayout);
        this.mLoadMoreLayout.setLoadMoreListener(new r() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41308a;

            public final void w_() {
                if (PatchProxy.isSupport(new Object[0], this, f41308a, false, 34990, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f41308a, false, 34990, new Class[0], Void.TYPE);
                } else if (DetailFragmentPanel.this.A.i || DetailFragmentPanel.this.mLoadMoreLayout == null) {
                    if (DetailFragmentPanel.this.j != null) {
                        DetailFragmentPanel.this.f2999b = true;
                        DetailFragmentPanel.this.j.w_();
                    }
                } else {
                    DetailFragmentPanel.this.mLoadMoreLayout.c();
                }
            }
        });
    }

    public final void u_() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34892, new Class[0], Void.TYPE);
            return;
        }
        if (I() || !aZ() || this.h.b(true)) {
            if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34893, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34893, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                boolean f2 = this.h.f(true);
                if (!"discovery".equals(f()) || !com.ss.android.ugc.aweme.discover.helper.b.a() || !f2) {
                    z = false;
                } else {
                    this.h.g(false);
                    G();
                    z = true;
                }
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34894, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34894, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!this.h.d(true) || this.mViewPager.getCurrentItem() == this.A.getCount() - 1 || (!TextUtils.equals("hot_search_video_board", f()) && !TextUtils.equals("discovery_hot_search_video", f()))) {
                    z2 = false;
                } else {
                    G();
                    z2 = true;
                }
                if (z2) {
                    ViewStub viewStub = (ViewStub) this.mLayout.findViewById(C0906R.id.cwt);
                    if (this.f3003f == null || viewStub != null) {
                        this.f3003f = new aa(this.mViewPager, viewStub);
                    }
                    aa aaVar = this.f3003f;
                    if (PatchProxy.isSupport(new Object[0], aaVar, aa.f45701a, false, 41939, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aaVar, aa.f45701a, false, 41939, new Class[0], Void.TYPE);
                    } else {
                        aaVar.g = System.currentTimeMillis();
                        aaVar.f45704d.postDelayed(aaVar.j, 500);
                        return;
                    }
                } else if (H()) {
                    ViewStub viewStub2 = (ViewStub) this.mLayout.findViewById(C0906R.id.cwt);
                    if (this.f3003f == null || viewStub2 != null) {
                        this.f3003f = new aa(this.mViewPager, viewStub2);
                    }
                    this.f3003f.l /= 2.0f;
                    aa aaVar2 = this.f3003f;
                    if (PatchProxy.isSupport(new Object[0], aaVar2, aa.f45701a, false, 41937, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aaVar2, aa.f45701a, false, 41937, new Class[0], Void.TYPE);
                        return;
                    }
                    aaVar2.g = System.currentTimeMillis();
                    aaVar2.f45704d.postDelayed(aaVar2.k, 5000);
                }
            }
        }
        if (this.f3003f == null) {
            ViewStub viewStub3 = (ViewStub) this.mLayout.findViewById(C0906R.id.cwt);
            if (viewStub3 != null) {
                this.f3003f = new aa(this.mViewPager, viewStub3);
                aa aaVar3 = this.f3003f;
                if (PatchProxy.isSupport(new Object[]{500L}, aaVar3, aa.f45701a, false, 41938, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{500L}, aaVar3, aa.f45701a, false, 41938, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    aaVar3.f45704d.postDelayed(aaVar3.i, 500);
                }
            }
        }
    }

    public final void a(int i) {
        this.n = i;
    }

    public final void d(boolean z) {
        this.u = z;
    }

    public final void a(long j2) {
        this.U.f45110e = j2;
    }

    public final void b(boolean z) {
        this.s = z;
        this.U.x = z;
    }

    public final void a(com.ss.android.ugc.aweme.feed.listener.a aVar) {
        this.a_ = aVar;
    }

    public void c(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2998a, false, 34941, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2998a, false, 34941, new Class[]{List.class}, Void.TYPE);
        } else if (this.A != null) {
            this.A.a(list);
        }
    }

    private List<Aweme> e(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2998a, false, 34956, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f2998a, false, 34956, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        for (Aweme next : list) {
            if (!next.isLive()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int a(List<Aweme> list) {
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f2998a, false, 34916, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2}, this, f2998a, false, 34916, new Class[]{List.class}, Integer.TYPE)).intValue();
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme = list2.get(i);
                if (aweme != null && TextUtils.equals(aweme.getAid(), bu())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f2998a, false, 34947, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f2998a, false, 34947, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (this.k) {
            super.b(aweme);
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34918, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34918, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.mLoadMoreLayout.b();
            this.u = false;
            this.f2999b = false;
            com.ss.android.ugc.aweme.app.api.a.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (Throwable) exc);
        }
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34922, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34922, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.Q.setRefreshing(false);
            if (this.A.getCount() == 0) {
                DmtStatusView q2 = q(true);
                if (q2 != null) {
                    q2.setVisibility(0);
                    q2.f();
                }
            } else {
                com.ss.android.ugc.aweme.app.api.a.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), exc, C0906R.string.b6v);
            }
            this.u = false;
        }
    }

    public final void f(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34942, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34942, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.b6v);
            DmtStatusView q2 = q(false);
            if (q2 != null) {
                q2.setVisibility(8);
            }
        }
    }

    public final void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34964, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2998a, false, 34964, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        IFeedViewHolder aH = aH();
        if (aH != null) {
            aH.a(z);
        }
    }

    @Subscribe
    public void onCommentDialogEvent(f fVar) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2998a, false, 34958, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f2998a, false, 34958, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Activity activity = this.ar;
        if (activity != null && fVar.f45305d == activity.hashCode()) {
            if (fVar.f45302a == 1) {
                z = true;
            } else {
                z = false;
            }
            l(z);
            if (fVar.f45302a == 1) {
                z2 = true;
            }
            i(z2);
            if (fVar.f45302a == 1) {
                if (this.f3002e != null) {
                    this.f3002e.dismissAllowingStateLoss();
                }
                this.f3001d.dismissAllowingStateLoss();
                return;
            }
            Fragment fragment = this.as;
            if (fragment != null && fragment.getUserVisibleHint()) {
                p();
                q();
            }
        }
    }

    @Subscribe
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.b.a aVar) {
        com.ss.android.ugc.aweme.comment.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2998a, false, 34960, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2998a, false, 34960, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            Aweme aweme = aVar2.f36373d;
            if (aweme != null) {
                for (Aweme next : this.A.h) {
                    if (next.getAid().equals(aweme.getAid())) {
                        next.setCommentSetting(aweme.getCommentSetting());
                    }
                }
            }
        }
    }

    @Subscribe
    public void onCommerceDialogEvent(an anVar) {
        if (PatchProxy.isSupport(new Object[]{anVar}, this, f2998a, false, 34962, new Class[]{an.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{anVar}, this, f2998a, false, 34962, new Class[]{an.class}, Void.TYPE);
            return;
        }
        this.au = anVar.f45289a;
        if (anVar.f45289a) {
            if (this.f3001d != null) {
                this.f3001d.d();
            }
        } else if (this.f3001d != null) {
            this.f3001d.e();
        }
    }

    @Subscribe
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f2998a, false, 34889, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f2998a, false, 34889, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE);
        } else if (iVar.f45311e == this.ar.hashCode()) {
            j(iVar.f45307a);
        }
    }

    @Subscribe
    public void onDuetSettingEvent(com.ss.android.ugc.aweme.shortvideo.f.c cVar) {
        com.ss.android.ugc.aweme.shortvideo.f.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f2998a, false, 34961, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f2998a, false, 34961, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.c.class}, Void.TYPE);
        } else if (cVar2 != null) {
            Aweme aweme = cVar2.f67638a;
            if (aweme != null) {
                for (Aweme next : this.A.h) {
                    if (next.getAid().equals(aweme.getAid())) {
                        next.setDuetSetting(aweme.getDuetSetting());
                        next.setReactSetting(aweme.getReactSetting());
                    }
                }
            }
        }
    }

    @Subscribe
    public void onHideCommentInputFragmentEvent(com.ss.android.ugc.aweme.commercialize.b.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2998a, false, 34957, new Class[]{com.ss.android.ugc.aweme.commercialize.b.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f2998a, false, 34957, new Class[]{com.ss.android.ugc.aweme.commercialize.b.f.class}, Void.TYPE);
            return;
        }
        Activity activity = this.ar;
        if (activity == null || fVar.f38514b != activity.hashCode()) {
            return;
        }
        if (fVar.f38513a) {
            if (this.f3002e != null) {
                this.f3002e.dismissAllowingStateLoss();
            }
            this.f3001d.dismissAllowingStateLoss();
            return;
        }
        Fragment fragment = this.as;
        if (fragment != null && fragment.getUserVisibleHint()) {
            p();
            q();
        }
    }

    @Subscribe
    public void onVideoCleanModeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.a aVar) {
        com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2998a, false, 34963, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2998a, false, 34963, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.a.class}, Void.TYPE);
        } else if (this == aVar2.f46886c) {
            IFeedViewHolder aH = aH();
            if (aH != null && aVar2.f46885b != null && aH.d() != null && aVar2.f46885b.getAid().equals(aH.d().getAid())) {
                aH.a(aVar2.f46884a);
            }
        }
    }

    private List<Aweme> d(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2998a, false, 34905, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f2998a, false, 34905, new Class[]{List.class}, List.class);
        } else if (!com.ss.android.ugc.aweme.poi.e.e.e()) {
            return list;
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (Aweme next : list) {
                    if (next.isLive()) {
                        StreamUrlModel streamUrlModel = next.getStreamUrlModel();
                        if (!(next.getRoom() == null || streamUrlModel == null || TextUtils.isEmpty(streamUrlModel.id))) {
                            com.ss.android.ugc.aweme.video.d.b().f76039c.put(streamUrlModel.id, RoomStruct.fromAweme(next));
                        }
                    }
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public final void a_(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34927, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34927, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                if (aVar.getErrorCode() == 2130) {
                    com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.dr7);
                    return;
                }
                if (aVar.getErrorCode() == 2752) {
                    com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.ba3, C0906R.string.ba2);
                    z.a("promote_layer_show").a("enter_from", f()).a(PushConstants.CONTENT, "delete_fail").a("group_id", bu()).e();
                }
                return;
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.a4p);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2998a, false, 34946, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2998a, false, 34946, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3002e != null) {
            DetailVideoSeekBarFragment detailVideoSeekBarFragment = this.f3002e;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, detailVideoSeekBarFragment, DetailVideoSeekBarFragment.f46872a, false, 43526, new Class[]{Integer.TYPE}, Void.TYPE)) {
                DetailVideoSeekBarFragment detailVideoSeekBarFragment2 = detailVideoSeekBarFragment;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, detailVideoSeekBarFragment2, DetailVideoSeekBarFragment.f46872a, false, 43526, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i == 0) {
                View view = detailVideoSeekBarFragment.g;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                View view2 = detailVideoSeekBarFragment.g;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34953, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2998a, false, 34953, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.T.setMyProfile(z);
        this.V.a(z);
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34959, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2998a, false, 34959, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.f(z);
        if (z) {
            p();
        }
    }

    @Subscribe
    public void onDeleteAwemeEvent(com.ss.android.ugc.aweme.feed.f.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f2998a, false, 34948, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f2998a, false, 34948, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(f(), "homepage_hot")) {
            String str = gVar.f45306a;
            if (PatchProxy.isSupport(new Object[]{str}, this, f2998a, false, 34949, new Class[]{String.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2998a, false, 34949, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (this.H != null && this.H.a(str)) {
                bg.a(new ar(22, str));
                ax();
                if (this.A.getCount() == 3) {
                    bg.a(new q("from_cell_recommend"));
                } else {
                    this.mViewPager.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f41300a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f41300a, false, 34977, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f41300a, false, 34977, new Class[0], Void.TYPE);
                            } else if (DetailFragmentPanel.this.bc()) {
                                IFeedViewHolder aH = DetailFragmentPanel.this.aH();
                                if (aH != null) {
                                    aH.a(aH.d(), true);
                                    if (DetailFragmentPanel.this.ar instanceof MainActivity) {
                                        bg.a(new ac(aH.d()));
                                        AwemeChangeCallBack.a((FragmentActivity) DetailFragmentPanel.this.ar, aH.d());
                                    }
                                }
                                DetailFragmentPanel.this.aI();
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a_(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2998a, false, 34928, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2998a, false, 34928, new Class[]{String.class}, Void.TYPE);
        } else if (bc()) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f2998a, false, 34929, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f2998a, false, 34929, new Class[]{String.class}, Void.TYPE);
            } else if (bc()) {
                if (b.f(aE())) {
                    aK();
                }
                if (this.H != null && this.H.a(str)) {
                    if (this.A.getCount() == 0) {
                        m();
                    } else {
                        this.mViewPager.post(new a(this));
                    }
                }
            }
            super.a_(str);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2998a, false, 34912, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2998a, false, 34912, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f3001d != null) {
            this.f3001d.d();
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (Throwable) exc);
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34944, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2998a, false, 34944, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3001d != null) {
            this.f3001d.f(z);
            if (z) {
                u();
            }
        }
    }

    public final void b(List<Aweme> list) {
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f2998a, false, 34940, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2998a, false, 34940, new Class[]{List.class}, Void.TYPE);
        } else if (bc()) {
            this.B = 0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(list.get(i3));
                list.set(i3, a2);
                if (a2 != null && StringUtils.equal(a2.getAid(), bu())) {
                    i2 = i3;
                }
            }
            c(list);
            this.B = i2;
            this.mViewPager.setCurrentItem(this.B);
            this.mViewPager.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41298a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f41298a, false, 34976, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f41298a, false, 34976, new Class[0], Void.TYPE);
                        return;
                    }
                    if (DetailFragmentPanel.this.f3001d != null) {
                        DetailFragmentPanel.this.f3001d.b();
                    }
                }
            });
        }
    }

    public final void c(List list, boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34923, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f2998a, false, 34923, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.Q.setRefreshing(false);
            if (z || this.u) {
                if (!this.u || CollectionUtils.isEmpty(list) || this.A.getCount() == list.size()) {
                    z2 = false;
                }
                this.N = z2;
                c(list);
                if (!this.u) {
                    this.mViewPager.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f41326a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f41326a, false, 34971, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f41326a, false, 34971, new Class[0], Void.TYPE);
                                return;
                            }
                            if (DetailFragmentPanel.this.mViewPager != null) {
                                DetailFragmentPanel.this.B = 0;
                                DetailFragmentPanel.this.D = true;
                                DetailFragmentPanel.this.mViewPager.a(0, false);
                            }
                        }
                    });
                }
            } else if (this.aq) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, (int) C0906R.string.a3f).a();
                if (this.mViewPager.getCurrentItem() > 1) {
                    this.mViewPager.a(0, false);
                } else {
                    this.mViewPager.setCurrentItemWithDefaultVelocity(0);
                }
            }
            this.u = false;
            M();
        }
    }

    public final void a(int i, float f2) {
        Aweme aweme;
        float f3;
        float f4;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f2998a, false, 34890, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f2998a, false, 34890, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
        } else if (f2 != 0.0f && this.A.getCount() > this.B + 1) {
            if (this.B == i) {
                z = true;
            }
            Aweme c2 = this.A.c(this.B);
            if (z) {
                aweme = this.A.c(this.B + 1);
            } else {
                aweme = this.A.c(i);
            }
            if (c2.getAwemeType() != aweme.getAwemeType() && (c2.getAwemeType() == 101 || aweme.getAwemeType() == 101)) {
                if (c2.getAwemeType() == 101) {
                    if (z) {
                        f4 = Math.max(f2 - 0.5f, 0.0f);
                    } else {
                        f4 = Math.max(0.5f - f2, 0.0f);
                    }
                    if (this.l != null) {
                        this.l.a(f4 * 2.0f);
                    }
                    if (this.f3001d != null) {
                        this.f3001d.a(f4 * 2.0f);
                    }
                } else if (aweme.getAwemeType() == 101) {
                    if (z) {
                        f3 = Math.max(0.5f - f2, 0.0f);
                    } else {
                        f3 = Math.max(f2 - 0.5f, 0.0f);
                    }
                    if (this.l != null) {
                        this.l.a(f3 * 2.0f);
                    }
                    if (this.f3001d != null) {
                        this.f3001d.a(f3 * 2.0f);
                    }
                }
            }
        }
    }

    public void a(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2998a, false, 34904, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2998a, false, 34904, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34903, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34903, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals("from_follow_page", bg()) || TextUtils.equals("from_user_state_tab", bg())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71849, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71849, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (a2.p == null) {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        a2.p = Boolean.TRUE;
                    } else {
                        a2.p = Boolean.valueOf(d2.enableSlideInFollowFeedDetail);
                    }
                }
                z2 = a2.p.booleanValue();
            }
            if (!z2) {
                this.mViewPager.setDisableScroll(true);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f2998a, false, 34888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2998a, false, 34888, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this.ar)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
        } else {
            q(true).setBuilder(DmtStatusView.a.a((Context) this.ar).b((int) C0906R.string.dmm).a((int) C0906R.string.b5r));
            this.mLayout.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41290a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41290a, false, 34968, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41290a, false, 34968, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    DetailFragmentPanel.this.x();
                }
            });
            p();
            q();
            this.Q = this.mRefreshLayout;
            if (!I() && aZ() && this.h.b(true)) {
                this.mViewPager.a((ViewPager.OnPageChangeListener) new ViewPager.SimpleOnPageChangeListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41310a;

                    /* renamed from: b  reason: collision with root package name */
                    int f41311b = -2;

                    public void onPageSelected(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41310a, false, 34980, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41310a, false, 34980, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (Math.abs(this.f41311b - i) == 1) {
                            if (DetailFragmentPanel.this.h.b(true)) {
                                DetailFragmentPanel.this.h.c(false);
                                DetailFragmentPanel.this.g();
                            }
                            if (DetailFragmentPanel.this.h.d(true)) {
                                DetailFragmentPanel.this.h.e(false);
                                DetailFragmentPanel.this.g();
                            }
                        }
                        this.f41311b = i;
                    }

                    public void onPageScrolled(int i, float f2, int i2) {
                        int i3 = i2;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41310a, false, 34981, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41310a, false, 34981, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == DetailFragmentPanel.this.B) {
                            if (DetailFragmentPanel.this.f3003f != null) {
                                DetailFragmentPanel.this.f3003f.a((float) (-i3));
                            }
                        } else if (DetailFragmentPanel.this.f3003f != null) {
                            DetailFragmentPanel.this.f3003f.a((float) (UIUtils.getScreenHeight(DetailFragmentPanel.this.ar) - i3));
                        }
                    }
                });
            }
            this.mViewPager.a((ViewPager.OnPageChangeListener) new ViewPager.SimpleOnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41313a;

                public void onPageScrollStateChanged(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41313a, false, 34984, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41313a, false, 34984, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 0) {
                        DetailFragmentPanel.this.A();
                    }
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41313a, false, 34983, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41313a, false, 34983, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.shortvideo.f.f fVar = new com.ss.android.ugc.aweme.shortvideo.f.f(10);
                    fVar.f67651f = DetailFragmentPanel.this;
                    fVar.f67650e = 2;
                    bg.a(fVar);
                    if (!DetailFragmentPanel.this.W && DetailFragmentPanel.this.T != null && TextUtils.equals("from_follow_page", DetailFragmentPanel.this.T.getFrom())) {
                        com.ss.android.ugc.aweme.detail.d.a aVar = com.ss.android.ugc.aweme.detail.d.a.f41172b;
                        Aweme r = DetailFragmentPanel.this.r();
                        String from = DetailFragmentPanel.this.T.getFrom();
                        int videoType = DetailFragmentPanel.this.T.getVideoType();
                        String eventType = DetailFragmentPanel.this.T.getEventType();
                        long z = DetailFragmentPanel.this.z();
                        long j = z;
                        if (PatchProxy.isSupport(new Object[]{r, from, Integer.valueOf(videoType), eventType, new Long(z)}, aVar, com.ss.android.ugc.aweme.detail.d.a.f41171a, false, 34737, new Class[]{Aweme.class, String.class, Integer.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.detail.d.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{r, from, Integer.valueOf(videoType), eventType, new Long(j)}, aVar2, com.ss.android.ugc.aweme.detail.d.a.f41171a, false, 34737, new Class[]{Aweme.class, String.class, Integer.TYPE, String.class, Long.TYPE}, Void.TYPE);
                            return;
                        }
                        aVar.a(r, from, videoType, eventType, j, true);
                    }
                }

                public void onPageScrolled(int i, float f2, int i2) {
                    int i3 = i;
                    float f3 = f2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41313a, false, 34982, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41313a, false, 34982, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    bg.a(new com.ss.android.ugc.aweme.detail.c.a(Math.abs(0.5f - f3)));
                    DetailFragmentPanel.this.a(i, f3);
                    if (DetailFragmentPanel.this.f3002e != null) {
                        DetailFragmentPanel.this.f3002e.a(i, f3, i2);
                    }
                }
            });
        }
        this.mViewPager.a((ViewPager.OnPageChangeListener) new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41319a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41319a, false, 34987, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41319a, false, 34987, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (DetailFragmentPanel.this.f3001d != null) {
                    DetailFragmentPanel.this.f3001d.a();
                }
                if (DetailFragmentPanel.this.A != null) {
                    new com.ss.android.ugc.aweme.u.an().a(DetailFragmentPanel.this.T.getEventType()).b(DetailFragmentPanel.this.A.c(i), DetailFragmentPanel.this.bh()).c("full").e();
                }
            }
        });
        com.ss.android.ugc.aweme.main.e a3 = com.ss.android.ugc.aweme.main.base.d.a((FragmentActivity) this.ar);
        if (a3 != null) {
            a3.a((ViewPager.OnPageChangeListener) new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41321a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41321a, false, 34988, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41321a, false, 34988, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 0) {
                        AwemeChangeCallBack.a((FragmentActivity) DetailFragmentPanel.this.ar, DetailFragmentPanel.this.A.c(DetailFragmentPanel.this.mViewPager.getCurrentItem()));
                    }
                }
            });
        }
    }

    public final void b(List list, boolean z) {
        List list2;
        List list3 = list;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{list3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2998a, false, 34919, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Byte.valueOf(z)}, this, f2998a, false, 34919, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc() && !CollectionUtils.isEmpty(list)) {
            LoadMoreFrameLayout loadMoreFrameLayout = this.mLoadMoreLayout;
            if (PatchProxy.isSupport(new Object[0], loadMoreFrameLayout, LoadMoreFrameLayout.f46990a, false, 43705, new Class[0], Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[0], loadMoreFrameLayout, LoadMoreFrameLayout.f46990a, false, 43705, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                DmtStatusView a2 = loadMoreFrameLayout.a(false);
                if (a2 != null) {
                    boolean c2 = a2.c();
                }
            }
            if (!z2) {
                this.mLoadMoreLayout.c();
            } else {
                this.mLoadMoreLayout.d();
            }
            if (list3.get(0) instanceof FollowFeed) {
                list2 = com.ss.android.ugc.aweme.follow.presenter.b.a(list);
            } else if ("homepage_fresh".equalsIgnoreCase(f())) {
                list2 = d(list);
            } else {
                list2 = list3;
            }
            if (ba()) {
                list2 = e(list2);
            }
            this.A.i = z2;
            c(list2);
            final int indexOf = list2.indexOf(this.A.c(this.mViewPager.getCurrentItem()));
            if (!this.u && this.f2999b) {
                this.mViewPager.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41323a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f41323a, false, 34970, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f41323a, false, 34970, new Class[0], Void.TYPE);
                            return;
                        }
                        if (indexOf < DetailFragmentPanel.this.A.getCount() - 1 && DetailFragmentPanel.this.mViewPager != null) {
                            DetailFragmentPanel.this.B = indexOf + 1;
                            DetailFragmentPanel.this.D = true;
                            DetailFragmentPanel.this.mViewPager.setCurrentItemWithDefaultVelocity(DetailFragmentPanel.this.B);
                        }
                    }
                });
            }
            this.u = false;
            this.f2999b = false;
            M();
        }
    }

    public void a(IFeedViewHolder iFeedViewHolder, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, str2}, this, f2998a, false, 34939, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, str2}, this, f2998a, false, 34939, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE);
            return;
        }
        new ab().a(str2).b(str2).f(iFeedViewHolder.d()).f(String.valueOf(this.n)).e();
    }

    public final void a(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f2998a, false, 34945, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f2998a, false, 34945, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3002e != null) {
            this.f3002e.a(i, f2, i2);
        }
    }

    public FeedPagerAdapter a(Context context, LayoutInflater layoutInflater, int i, com.ss.android.ugc.aweme.feed.f.aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, f2998a, false, 34887, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, com.ss.android.ugc.aweme.feed.f.aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class)) {
            return (FeedPagerAdapter) PatchProxy.accessDispatch(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, f2998a, false, 34887, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, com.ss.android.ugc.aweme.feed.f.aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class);
        }
        DetailFeedPagerAdapter detailFeedPagerAdapter = new DetailFeedPagerAdapter(this.f3000c, context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams);
        return detailFeedPagerAdapter;
    }
}
