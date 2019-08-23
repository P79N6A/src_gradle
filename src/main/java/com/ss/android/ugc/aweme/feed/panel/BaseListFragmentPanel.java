package com.ss.android.ugc.aweme.feed.panel;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.p;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.c.j;
import com.ss.android.ugc.aweme.feed.c.k;
import com.ss.android.ugc.aweme.feed.c.l;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.c.n;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.f.aq;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.x;
import com.ss.android.ugc.aweme.feed.guide.a.a;
import com.ss.android.ugc.aweme.feed.guide.e;
import com.ss.android.ugc.aweme.feed.h.t;
import com.ss.android.ugc.aweme.feed.h.z;
import com.ss.android.ugc.aweme.feed.listener.b;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.bb;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bj;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.share.w;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.utils.u;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.g;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseListFragmentPanel extends k implements WeakHandler.IHandler, d, j, k, l, m, aa<ar>, a, t, c, com.ss.android.ugc.aweme.profile.presenter.m, AbTestManager.a, com.ss.android.ugc.aweme.video.preload.a {
    private static boolean p = false;
    public static ChangeQuickRedirect v = null;
    protected static final String w = "BaseListFragmentPanel";
    public FeedPagerAdapter A;
    public int B;
    protected WeakHandler C;
    public boolean D;
    public boolean E;
    public boolean F;
    protected com.ss.android.ugc.aweme.feed.listener.a G;
    public b H;
    public com.ss.android.ugc.aweme.feed.listener.d I;
    ImageView J;
    protected i K;
    protected com.bytedance.ies.dmt.ui.a.b L;
    protected com.ss.android.ugc.aweme.feed.guide.a M;
    protected boolean N;
    bt O;
    protected String P;
    protected com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a Q;
    public boolean R;
    protected final com.ss.android.ugc.aweme.feed.d S;
    public com.ss.android.ugc.aweme.feed.param.b T;
    protected n U;
    protected final com.ss.android.ugc.aweme.feed.c.b V;
    public boolean W;
    protected boolean X;
    public int Y;
    protected com.ss.android.ugc.aweme.feed.guide.a.b Z;

    /* renamed from: a  reason: collision with root package name */
    private final float f3163a;
    protected e aa;
    protected boolean ab;
    protected boolean ac;
    protected boolean ad;
    protected boolean ae;
    protected boolean af;
    protected boolean ag;
    public boolean ah;
    public com.ss.android.ugc.aweme.share.viewmodel.a ai;
    protected boolean aj;
    @FeedImpressionReporter.Keys
    public String ak;
    public boolean al;
    int am;
    public boolean an;
    public boolean ao;
    private boolean at;
    private boolean au;
    private com.ss.android.ugc.aweme.feed.preload.b av;

    /* renamed from: b  reason: collision with root package name */
    private z f3164b;
    @Nullable
    @BindView(2131493328)
    View bottomFakeAdaptation;
    @Nullable
    @BindView(2131493329)
    ViewGroup bottomFakeAdaptationContainer;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.b f3165c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.b.a f3166d;

    /* renamed from: e  reason: collision with root package name */
    private bm f3167e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f3168f;
    private Runnable g;
    private View.OnTouchListener h;
    private final com.ss.android.ugc.aweme.commercialize.a i;
    private boolean j;
    private IFeedViewHolder k;
    private int l;
    private boolean m;
    @BindView(2131493340)
    protected View mBottomSpace;
    @BindView(2131493960)
    protected DiggLayout mDiggLayout;
    @BindView(2131495647)
    public LoadMoreFrameLayout mLoadMoreLayout;
    @BindView(2131496683)
    protected FeedSwipeRefreshLayout mRefreshLayout;
    @BindView(2131497676)
    protected View mTopSpace;
    @BindView(2131498537)
    public VerticalViewPager mViewPager;
    private bb n;
    private boolean o;
    private boolean q;
    private boolean r;
    private o s;
    private long t;
    @Nullable
    @BindView(2131497657)
    View topFakeAdaptation;
    @Nullable
    @BindView(2131497658)
    ViewGroup topFakeAdaptationContainer;
    private Aweme u;
    public long x;
    protected boolean y;
    public LineProgressBar z;

    class DelayedUiInitTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$run$0$BaseListFragmentPanel$DelayedUiInitTask() {
            if (BaseListFragmentPanel.this.bq() && BaseListFragmentPanel.this.mLoadMoreLayout != null) {
                BaseListFragmentPanel.this.mLoadMoreLayout.setBackgroundColor(BaseListFragmentPanel.this.mLoadMoreLayout.getContext().getResources().getColor(C0906R.color.h7));
            }
        }

        private DelayedUiInitTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 41760, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 41760, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a("DelayedUiInitTask");
            if (BaseListFragmentPanel.this.mLoadMoreLayout != null) {
                BaseListFragmentPanel.this.mLoadMoreLayout.post(new g(this));
            }
        }
    }

    public void E() {
    }

    public void G_() {
    }

    public String J() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41728, new Class[0], String.class)) {
            return "";
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41728, new Class[0], String.class);
    }

    public String K() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41729, new Class[0], String.class)) {
            return "";
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41729, new Class[0], String.class);
    }

    public String L() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41730, new Class[0], String.class)) {
            return "";
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41730, new Class[0], String.class);
    }

    public void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, v, false, 41731, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, v, false, 41731, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        }
    }

    public void a_(Exception exc) {
    }

    public void ak() {
    }

    public void al() {
    }

    public void am() {
    }

    public void an() {
    }

    public void bd() {
    }

    public void bj() {
    }

    public final boolean h() {
        return true;
    }

    public void j() {
    }

    public void o() {
    }

    @Subscribe
    public void onAutoPlayEvent(com.ss.android.ugc.aweme.feed.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41555, new Class[]{com.ss.android.ugc.aweme.feed.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41555, new Class[]{com.ss.android.ugc.aweme.feed.f.a.class}, Void.TYPE);
        }
    }

    public void onChanged() {
        p = true;
    }

    public abstract boolean w();

    public String B() {
        return this.P;
    }

    public final FeedPagerAdapter be() {
        return this.A;
    }

    public final BaseListFragmentPanel a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, v, false, 41524, new Class[]{com.ss.android.ugc.aweme.feed.param.b.class}, BaseListFragmentPanel.class)) {
            return (BaseListFragmentPanel) PatchProxy.accessDispatch(new Object[]{bVar2}, this, v, false, 41524, new Class[]{com.ss.android.ugc.aweme.feed.param.b.class}, BaseListFragmentPanel.class);
        }
        this.T = bVar2;
        com.ss.android.ugc.aweme.feed.c.b bVar3 = this.V;
        String from = bVar.getFrom();
        if (PatchProxy.isSupport(new Object[]{from}, bVar3, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40953, new Class[]{String.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.feed.c.b bVar4 = bVar3;
            PatchProxy.accessDispatch(new Object[]{from}, bVar4, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40953, new Class[]{String.class}, Void.TYPE);
        } else {
            for (com.ss.android.ugc.aweme.feed.c.a c_ : bVar3.f45084b) {
                c_.c_(from);
            }
        }
        com.ss.android.ugc.aweme.feed.c.b bVar5 = this.V;
        String eventType = bVar.getEventType();
        if (PatchProxy.isSupport(new Object[]{eventType}, bVar5, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40955, new Class[]{String.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.feed.c.b bVar6 = bVar5;
            PatchProxy.accessDispatch(new Object[]{eventType}, bVar6, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40955, new Class[]{String.class}, Void.TYPE);
        } else {
            for (com.ss.android.ugc.aweme.feed.c.a b_ : bVar5.f45084b) {
                b_.b_(eventType);
            }
        }
        com.ss.android.ugc.aweme.feed.c.b bVar7 = this.V;
        int pageType = bVar.getPageType();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(pageType)}, bVar7, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40950, new Class[]{Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.feed.c.b bVar8 = bVar7;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(pageType)}, bVar8, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40950, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            for (com.ss.android.ugc.aweme.feed.c.a aVar : bVar7.f45084b) {
                aVar.s = pageType;
            }
        }
        return this;
    }

    public final void a(Activity activity, Fragment fragment) {
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{activity2, fragment2}, this, v, false, 41546, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, fragment2}, this, v, false, 41546, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
            return;
        }
        super.a(activity, fragment);
        com.ss.android.ugc.aweme.feed.c.b bVar = this.V;
        if (PatchProxy.isSupport(new Object[]{activity2, fragment2}, bVar, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40951, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            Object[] objArr = {activity2, fragment2};
            com.ss.android.ugc.aweme.feed.c.b bVar2 = bVar;
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.feed.c.b.f45083a;
            PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 40951, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
        } else {
            for (com.ss.android.ugc.aweme.feed.c.a a2 : bVar.f45084b) {
                a2.a(activity2, fragment2);
            }
        }
        this.ai = com.ss.android.ugc.aweme.share.viewmodel.a.a((Context) this.ar);
    }

    public final void a(String str, boolean z2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 1}, this, v, false, 41552, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 1}, this, v, false, 41552, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.U.a(str2, true, null);
    }

    public FeedPagerAdapter a(Context context, LayoutInflater layoutInflater, int i2, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, v, false, 41556, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class)) {
            return (FeedPagerAdapter) PatchProxy.accessDispatch(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, v, false, 41556, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class);
        }
        FeedPagerAdapter feedPagerAdapter = new FeedPagerAdapter(this.ar, LayoutInflater.from(this.ar), 4, this, this.as, this.h, baseFeedPageParams);
        return feedPagerAdapter;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r9
            r12 = 1
            r0[r12] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = v
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41558(0xa256, float:5.8235E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            r0[r12] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41558(0xa256, float:5.8235E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            super.a(r21, r22)
            r8.y = r12
            com.ss.android.ugc.aweme.utils.bg.c(r20)
            boolean r0 = com.ss.android.g.a.b()
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout r0 = r8.mLoadMoreLayout
            android.app.Activity r1 = r8.ar
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131625139(0x7f0e04b3, float:1.8877478E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
        L_0x0065:
            com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a()
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$DelayedUiInitTask r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$DelayedUiInitTask
            r2 = 0
            r1.<init>()
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a(r1)
            r0.a()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41617(0xa291, float:5.8318E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41617(0xa291, float:5.8318E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00b6
        L_0x009e:
            android.support.v4.app.FragmentManager r0 = r20.br()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = "comment"
            android.support.v4.app.Fragment r1 = r0.findFragmentByTag(r1)     // Catch:{ Exception -> 0x00b5 }
            if (r1 == 0) goto L_0x00b6
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch:{ Exception -> 0x00b5 }
            r0.remove(r1)     // Catch:{ Exception -> 0x00b5 }
            r0.commit()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
        L_0x00b6:
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r0 = r8.mRefreshLayout
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r8.mViewPager
            r0.setViewPager(r1)
            com.bytedance.common.utility.collection.WeakHandler r0 = new com.bytedance.common.utility.collection.WeakHandler
            r0.<init>(r8)
            r8.C = r0
            android.app.Activity r0 = r8.ar
            com.bytedance.common.utility.collection.WeakHandler r1 = r8.C
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$10 r2 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$10
            r2.<init>()
            r3 = 3
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            r13[r12] = r1
            r13[r10] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.k.g.f45586a
            r16 = 1
            r17 = 43613(0xaa5d, float:6.1115E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r4[r11] = r5
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r4[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.k.g$a> r5 = com.ss.android.ugc.aweme.feed.k.g.a.class
            r4[r10] = r5
            java.lang.Class<android.view.View$OnTouchListener> r19 = android.view.View.OnTouchListener.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x011f
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            r13[r12] = r1
            r13[r10] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.k.g.f45586a
            r16 = 1
            r17 = 43613(0xaa5d, float:6.1115E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.k.g$a> r1 = com.ss.android.ugc.aweme.feed.k.g.a.class
            r0[r10] = r1
            java.lang.Class<android.view.View$OnTouchListener> r19 = android.view.View.OnTouchListener.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            android.view.View$OnTouchListener r0 = (android.view.View.OnTouchListener) r0
            goto L_0x0125
        L_0x011f:
            com.ss.android.ugc.aweme.feed.k.g$1 r3 = new com.ss.android.ugc.aweme.feed.k.g$1
            r3.<init>(r0, r2, r1)
            r0 = r3
        L_0x0125:
            r8.h = r0
            java.lang.String r0 = r20.bg()
            boolean r0 = e((java.lang.String) r0)
            if (r0 == 0) goto L_0x014b
            com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter r10 = new com.ss.android.ugc.aweme.feed.adapter.ForwardFeedPagerAdapter
            android.app.Activity r1 = r8.ar
            android.app.Activity r0 = r8.ar
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r3 = 4
            android.support.v4.app.Fragment r5 = r8.as
            android.view.View$OnTouchListener r6 = r8.h
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r7 = r20.a()
            r0 = r10
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0164
        L_0x014b:
            android.app.Activity r1 = r8.ar
            android.app.Activity r0 = r8.ar
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r3 = 4
            android.support.v4.app.Fragment r5 = r8.as
            android.view.View$OnTouchListener r6 = r8.h
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r7 = r20.a()
            r0 = r20
            r4 = r20
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r10 = r0.a(r1, r2, r3, r4, r5, r6, r7)
        L_0x0164:
            r8.A = r10
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r8.A
            r0.j = r8
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r8.A
            long r1 = r20.at()
            r0.k = r1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r8.mViewPager
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r8.A
            r0.setAdapter(r1)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r8.mViewPager
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$4 r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$4
            r1.<init>()
            r0.a((android.support.v4.view.ViewPager.OnPageChangeListener) r1)
            com.ss.android.ugc.aweme.feed.h.z r0 = new com.ss.android.ugc.aweme.feed.h.z
            r0.<init>()
            r8.f3164b = r0
            com.ss.android.ugc.aweme.feed.h.z r0 = r8.f3164b
            com.ss.android.ugc.aweme.feed.h.y r1 = new com.ss.android.ugc.aweme.feed.h.y
            r1.<init>()
            r0.a(r1)
            com.ss.android.ugc.aweme.feed.h.z r0 = r8.f3164b
            r0.a(r8)
            com.ss.android.ugc.aweme.common.b r0 = new com.ss.android.ugc.aweme.common.b
            r0.<init>()
            r8.f3165c = r0
            com.ss.android.ugc.aweme.common.b r0 = r8.f3165c
            com.ss.android.ugc.aweme.report.model.a r1 = new com.ss.android.ugc.aweme.report.model.a
            r1.<init>()
            r0.a(r1)
            com.ss.android.ugc.aweme.profile.presenter.i r0 = new com.ss.android.ugc.aweme.profile.presenter.i
            r0.<init>()
            r8.K = r0
            com.ss.android.ugc.aweme.profile.presenter.i r0 = r8.K
            r0.a(r8)
            com.ss.android.ugc.aweme.feed.d r0 = r8.S
            r0.a()
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout r0 = r8.mLoadMoreLayout
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$11 r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$11
            r1.<init>()
            r0.setOnScrolledListener(r1)
            r8.E = r12
            com.ss.android.ugc.aweme.feed.b.a r0 = new com.ss.android.ugc.aweme.feed.b.a
            r0.<init>()
            r8.f3166d = r0
            com.ss.android.ugc.aweme.feed.c.n r0 = r8.U
            com.ss.android.ugc.aweme.feed.b.a r1 = r8.f3166d
            r0.j = r1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41647(0xa2af, float:5.836E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0206
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41647(0xa2af, float:5.836E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0245
        L_0x0206:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getFollowGuideShown()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0245
            com.bytedance.ies.dmt.ui.a.b$a r0 = new com.bytedance.ies.dmt.ui.a.b$a
            android.app.Activity r1 = r8.ar
            r0.<init>(r1)
            r1 = 2131560053(0x7f0d0675, float:1.8745467E38)
            com.bytedance.ies.dmt.ui.a.b$a r0 = r0.b((int) r1)
            com.bytedance.ies.dmt.ui.a.b$a r0 = r0.c((boolean) r11)
            com.bytedance.ies.dmt.ui.a.b$a r0 = r0.a((boolean) r11)
            r1 = 5000(0x1388, double:2.4703E-320)
            com.bytedance.ies.dmt.ui.a.b$a r0 = r0.a((long) r1)
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$5 r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$5
            r1.<init>()
            com.bytedance.ies.dmt.ui.a.b$a r0 = r0.a((com.bytedance.ies.dmt.ui.a.b.d) r1)
            com.bytedance.ies.dmt.ui.a.b r0 = r0.a()
            r8.L = r0
        L_0x0245:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41650(0xa2b2, float:5.8364E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0277
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41650(0xa2b2, float:5.8364E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x027e
        L_0x0277:
            com.ss.android.ugc.aweme.feed.guide.a r0 = new com.ss.android.ugc.aweme.feed.guide.a
            r0.<init>(r9)
            r8.M = r0
        L_0x027e:
            r20.a((android.view.View) r21)
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r0 = r8.mRefreshLayout
            r8.Q = r0
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r8.mViewPager
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$12 r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$12
            r1.<init>()
            r0.addOnLayoutChangeListener(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x02a1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r8.mViewPager
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$13 r1 = new com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel$13
            r1.<init>()
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel.a(android.view.View, android.os.Bundle):void");
    }

    public void a(int i2, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aweme}, this, v, false, 41567, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aweme}, this, v, false, 41567, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        this.A.e(i2);
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, v, false, 41569, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, v, false, 41569, new Class[]{View.class}, Void.TYPE);
        } else if (s()) {
            e eVar = new e(this, this.ar);
            this.Z = eVar;
            this.aa = eVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        if (r0 == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0178, code lost:
        if (r0 != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a().cg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0182, code lost:
        if (r0 != 0) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0184, code lost:
        r1 = !com.ss.android.ugc.aweme.account.d.a().isLogin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018e, code lost:
        if (r0 <= 0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0198, code lost:
        if (com.ss.android.ugc.aweme.account.d.a().isLogin() != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a0, code lost:
        if (r7.O.b() < r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a2, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a4, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a5, code lost:
        if (r1 == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a7, code lost:
        if (r0 == 0) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b3, code lost:
        if (android.text.TextUtils.equals(f(), "homepage_hot") == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        r1 = com.ss.android.ugc.aweme.C0906R.string.b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b9, code lost:
        r1 = com.ss.android.ugc.aweme.C0906R.string.b5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bc, code lost:
        com.ss.android.ugc.aweme.login.e.a(r7.ar, f(), "click_double_like", com.ss.android.ugc.aweme.utils.ad.a().a("login_title", r7.ar.getString(r1)).a("group_id", r11.getAid()).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(r11.getAid())).f75487b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f1, code lost:
        aU();
        r1 = new com.ss.android.ugc.aweme.u.w().a(f()).a(bh()).b(r11.getAid()).f(r11).c("click_double_like").b(r7.O.d() ^ true ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0226, code lost:
        if (r0 == 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0228, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022a, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022b, code lost:
        r1.c(r0).e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0238, code lost:
        if (r7.O.d() != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023a, code lost:
        r7.O.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0248, code lost:
        if (com.ss.android.ugc.aweme.base.utils.m.a().c() == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x024a, code lost:
        r10.b(r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = v
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41570(0xa262, float:5.8252E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41570(0xa262, float:5.8252E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r10 = r17.aH()
            com.ss.android.ugc.aweme.feed.guide.a.b r0 = r7.Z
            r0.M()
            if (r10 == 0) goto L_0x02c6
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.d()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41571(0xa263, float:5.8253E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41571(0xa263, float:5.8253E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x00b4
        L_0x007d:
            if (r11 == 0) goto L_0x00b4
            int r0 = r11.getUserDigg()
            if (r0 != 0) goto L_0x00b4
            boolean r0 = com.ss.android.ugc.aweme.feed.k.b.b((com.ss.android.ugc.aweme.feed.model.Aweme) r11)
            if (r0 == 0) goto L_0x009a
            boolean r0 = com.ss.android.ugc.aweme.feed.k.b.c((com.ss.android.ugc.aweme.feed.model.Aweme) r11)
            if (r0 == 0) goto L_0x009a
            android.app.Activity r0 = r7.ar
            r1 = 2131561829(0x7f0d0d65, float:1.874907E38)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (int) r1)
            goto L_0x00b4
        L_0x009a:
            boolean r0 = com.ss.android.ugc.aweme.feed.k.b.b((com.ss.android.ugc.aweme.feed.model.Aweme) r11)
            if (r0 != 0) goto L_0x00b4
            boolean r0 = com.ss.android.ugc.aweme.feed.am.a(r11)
            if (r0 == 0) goto L_0x00b4
            boolean r0 = com.ss.android.ugc.aweme.feed.am.c(r11)
            if (r0 != 0) goto L_0x00b4
            android.app.Activity r0 = r7.ar
            r1 = 2131560133(0x7f0d06c5, float:1.874563E38)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (int) r1)
        L_0x00b4:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r11)
            if (r0 == 0) goto L_0x0106
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41575(0xa267, float:5.8259E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41575(0xa267, float:5.8259E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0104
        L_0x00f3:
            if (r11 == 0) goto L_0x0103
            int r0 = r11.getUserDigg()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r11.isCanPlay()
            if (r0 == 0) goto L_0x0103
            r0 = 1
            goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            if (r0 != 0) goto L_0x017a
        L_0x0106:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r11)
            if (r0 != 0) goto L_0x024d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41574(0xa266, float:5.8258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0145
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41574(0xa266, float:5.8258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0178
        L_0x0145:
            if (r11 == 0) goto L_0x0177
            int r0 = r11.getUserDigg()
            if (r0 != 0) goto L_0x0177
            boolean r0 = r11.isCanPlay()
            if (r0 == 0) goto L_0x0177
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r11.getStatus()
            if (r0 == 0) goto L_0x0177
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r11.getStatus()
            boolean r0 = r0.isDelete()
            if (r0 != 0) goto L_0x0177
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r11.getStatus()
            int r0 = r0.getPrivateStatus()
            if (r0 == r8) goto L_0x0177
            com.ss.android.ugc.aweme.utils.u r0 = com.ss.android.ugc.aweme.utils.u.f75965b
            boolean r0 = r0.a(r11)
            if (r0 != 0) goto L_0x0177
            r0 = 1
            goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            if (r0 == 0) goto L_0x024d
        L_0x017a:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.cg()
            if (r0 != 0) goto L_0x018e
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            r1 = r1 ^ r8
            goto L_0x01a5
        L_0x018e:
            if (r0 <= 0) goto L_0x01a4
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L_0x01a4
            com.ss.android.ugc.aweme.main.bt r1 = r7.O
            int r1 = r1.b()
            if (r1 < r0) goto L_0x01a4
            r1 = 1
            goto L_0x01a5
        L_0x01a4:
            r1 = 0
        L_0x01a5:
            if (r1 == 0) goto L_0x0240
            if (r0 == 0) goto L_0x01f1
            java.lang.String r1 = r17.f()
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x01b9
            r1 = 2131561120(0x7f0d0aa0, float:1.8747632E38)
            goto L_0x01bc
        L_0x01b9:
            r1 = 2131560986(0x7f0d0a1a, float:1.874736E38)
        L_0x01bc:
            android.app.Activity r2 = r7.ar
            java.lang.String r3 = r17.f()
            java.lang.String r4 = "click_double_like"
            com.ss.android.ugc.aweme.utils.ad r5 = com.ss.android.ugc.aweme.utils.ad.a()
            java.lang.String r6 = "login_title"
            android.app.Activity r10 = r7.ar
            java.lang.String r1 = r10.getString(r1)
            com.ss.android.ugc.aweme.utils.ad r1 = r5.a((java.lang.String) r6, (java.lang.String) r1)
            java.lang.String r5 = "group_id"
            java.lang.String r6 = r11.getAid()
            com.ss.android.ugc.aweme.utils.ad r1 = r1.a((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = "log_pb"
            java.lang.String r6 = r11.getAid()
            java.lang.String r6 = com.ss.android.ugc.aweme.u.aa.g((java.lang.String) r6)
            com.ss.android.ugc.aweme.utils.ad r1 = r1.a((java.lang.String) r5, (java.lang.String) r6)
            android.os.Bundle r1 = r1.f75487b
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r2, (java.lang.String) r3, (java.lang.String) r4, (android.os.Bundle) r1)
        L_0x01f1:
            r17.aU()
            com.ss.android.ugc.aweme.u.w r1 = new com.ss.android.ugc.aweme.u.w
            r1.<init>()
            java.lang.String r2 = r17.f()
            com.ss.android.ugc.aweme.u.w r1 = r1.a((java.lang.String) r2)
            int r2 = r17.bh()
            com.ss.android.ugc.aweme.u.w r1 = r1.a((int) r2)
            java.lang.String r2 = r11.getAid()
            com.ss.android.ugc.aweme.u.w r1 = r1.b((java.lang.String) r2)
            com.ss.android.ugc.aweme.u.w r1 = r1.f(r11)
            java.lang.String r2 = "click_double_like"
            com.ss.android.ugc.aweme.u.w r1 = r1.c((java.lang.String) r2)
            com.ss.android.ugc.aweme.main.bt r2 = r7.O
            boolean r2 = r2.d()
            r2 = r2 ^ r8
            com.ss.android.ugc.aweme.u.w r1 = r1.b((int) r2)
            if (r0 == 0) goto L_0x022a
            r0 = 1
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            com.ss.android.ugc.aweme.u.w r0 = r1.c((int) r0)
            r0.e()
            com.ss.android.ugc.aweme.main.bt r0 = r7.O
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x024d
            com.ss.android.ugc.aweme.main.bt r0 = r7.O
            r0.c()
            goto L_0x024d
        L_0x0240:
            com.ss.android.ugc.aweme.base.utils.m r0 = com.ss.android.ugc.aweme.base.utils.m.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x024d
            r10.b((com.ss.android.ugc.aweme.feed.model.Aweme) r11)
        L_0x024d:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x0254
            return
        L_0x0254:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r11)
            if (r0 == 0) goto L_0x0260
            boolean r0 = r11.isCanPlay()
            if (r0 != 0) goto L_0x027e
        L_0x0260:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r11)
            if (r0 != 0) goto L_0x02c6
            if (r11 == 0) goto L_0x02c6
            boolean r0 = r11.isCanPlay()
            if (r0 == 0) goto L_0x02c6
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r11.getStatus()
            if (r0 == 0) goto L_0x02c6
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r11.getStatus()
            int r0 = r0.getPrivateStatus()
            if (r0 == r8) goto L_0x02c6
        L_0x027e:
            com.ss.android.ugc.aweme.common.widget.DiggLayout r0 = r7.mDiggLayout
            float r1 = r18.getX()
            float r2 = r18.getY()
            r0.a(r1, r2)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r17.aE()
            if (r0 == 0) goto L_0x02c6
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r1 = r0.r()
            if (r1 == 0) goto L_0x02c6
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r0 = r0.r()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r13 = 0
            r14 = 30639(0x77af, float:4.2934E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r15 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x02bf
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r13 = 0
            r14 = 30639(0x77af, float:4.2934E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r15 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x02bf:
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r1 = r0.diggLayout
            java.lang.String r0 = r0.j
            r1.a((java.lang.String) r0)
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel.a(android.view.MotionEvent):void");
    }

    public void a(boolean z2, Aweme aweme, Aweme aweme2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), aweme, aweme2}, this, v, false, 41576, new Class[]{Boolean.TYPE, Aweme.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), aweme, aweme2}, this, v, false, 41576, new Class[]{Boolean.TYPE, Aweme.class, Aweme.class}, Void.TYPE);
        } else if (aweme == null || aweme2 == null) {
        } else {
            com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
            boolean z3 = !z2;
            boolean s2 = s();
            String g2 = g();
            if (PatchProxy.isSupport(new Object[]{aweme, aweme2, bVar, Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(s2 ? (byte) 1 : 0), g2}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43607, new Class[]{Aweme.class, Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class, Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, aweme2, bVar, Byte.valueOf(z3), Byte.valueOf(s2), g2}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43607, new Class[]{Aweme.class, Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class, Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            } else if (s2) {
                com.ss.android.ugc.aweme.feed.k.e eVar = new com.ss.android.ugc.aweme.feed.k.e(z3, g2, aweme.getAuthorUid(), aweme.getAid(), aweme2.getAid(), bVar);
                a.i.a((Callable<TResult>) eVar, (Executor) h.e());
            } else {
                if (TextUtils.equals(bVar.getEventType(), "preference_pop_up")) {
                    com.ss.android.ugc.aweme.feed.k.f fVar = new com.ss.android.ugc.aweme.feed.k.f(g2, aweme.getAuthorUid(), aweme.getAid(), aweme2.getAid(), z3);
                    a.i.a((Callable<TResult>) fVar, (Executor) h.e());
                }
            }
        }
    }

    public final void a(@Nullable IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, v, false, 41606, new Class[]{IFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, v, false, 41606, new Class[]{IFeedViewHolder.class}, Void.TYPE);
            return;
        }
        if (!(iFeedViewHolder == null || iFeedViewHolder.m() == null)) {
            iFeedViewHolder.m().T();
        }
    }

    public void a(ar arVar) {
        int i2;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, v, false, 41607, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, v, false, 41607, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        String str = w;
        com.ss.android.ugc.playerkit.b.b.a(str, "handleVideoEvent() called with: event = [" + arVar2 + "]");
        int i3 = 18;
        switch (arVar2.f45292b) {
            case 0:
                Aweme aweme = (Aweme) arVar2.f45293c;
                if (aweme != null && !u.f75965b.a(aweme)) {
                    this.U.a(aweme, (int) this.T.getVideoCurrentPosition());
                    return;
                }
                return;
            case 1:
                if (!com.ss.android.ugc.aweme.base.utils.m.a().c()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
                    return;
                }
                Aweme aweme2 = (Aweme) arVar2.f45293c;
                if (aweme2 != null) {
                    this.S.h(aweme2);
                    return;
                }
                return;
            case 2:
                if (!com.ss.android.ugc.aweme.base.utils.m.a().c()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
                    return;
                }
                Aweme aweme3 = (Aweme) arVar2.f45293c;
                if (aweme3 != null && !TextUtils.isEmpty(aweme3.getAid())) {
                    this.f3164b.a(aweme3.getAid());
                    return;
                }
                return;
            case 3:
                this.ag = false;
                c(true);
                aU();
                Aweme aweme4 = (Aweme) arVar2.f45293c;
                if (aweme4 != null && bc()) {
                    f(aweme4);
                    return;
                }
            case 4:
                return;
            case 5:
                if (!PatchProxy.isSupport(new Object[0], this, v, false, 41723, new Class[0], Void.TYPE)) {
                    if (AbTestManager.a().cg() != 0 && !com.ss.android.ugc.aweme.account.d.a().isLogin() && !this.O.e() && !bn()) {
                        if (this.n == null) {
                            this.n = new bb(this.ar);
                        }
                        this.mDiggLayout.postDelayed(new f(this), 800);
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, v, false, 41723, new Class[0], Void.TYPE);
                    return;
                }
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                aU();
                Aweme aweme5 = (Aweme) arVar2.f45293c;
                if (aweme5 != null) {
                    this.ab = true;
                    g(aweme5);
                    return;
                }
                return;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                p();
                aU();
                Aweme aweme6 = (Aweme) arVar2.f45293c;
                if (aweme6 != null && aweme6.getAuthor() != null) {
                    String uid = aweme6.getAuthor().getUid();
                    String secUid = aweme6.getAuthor().getSecUid();
                    if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        a(aweme6, uid, false);
                        String string = this.ar.getString(C0906R.string.afr);
                        Activity activity = this.ar;
                        String f2 = f();
                        Bundle bundle = ad.a().a("login_title", string).a("group_id", aweme6.getAid()).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(aweme6.getAid())).f75487b;
                        c cVar = new c(this, aweme6, uid, secUid, arVar);
                        com.ss.android.ugc.aweme.login.e.a(activity, f2, "click_follow", bundle, (com.ss.android.ugc.aweme.base.component.f) cVar);
                        return;
                    }
                    a(aweme6, uid, true);
                    i iVar = this.K;
                    i.a e2 = new i.a().a(uid).b(secUid).a(1).c(f()).d(com.ss.android.ugc.aweme.feed.k.b.g(ag())).a(aweme6).e(arVar2.f45295e);
                    if (TextUtils.equals(f(), "homepage_hot")) {
                        i2 = -1;
                    } else {
                        i2 = bp.a(this.T.getEventType());
                    }
                    i.a c2 = e2.c(i2);
                    if (TextUtils.equals(f(), "homepage_hot")) {
                        i3 = 13;
                    }
                    iVar.a(c2.b(i3).a());
                    User author = aweme6.getAuthor();
                    if (PatchProxy.isSupport(new Object[]{author}, this, v, false, 41609, new Class[]{User.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{author}, this, v, false, 41609, new Class[]{User.class}, Void.TYPE);
                        break;
                    } else {
                        if (TextUtils.equals(f(), "homepage_hot")) {
                            com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54811c = author;
                            bg.a(new com.ss.android.ugc.aweme.feed.f.t(f()));
                        }
                        return;
                    }
                } else {
                    return;
                }
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                ab();
                aK();
                return;
            case 18:
            case 19:
                e();
                com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
                String g2 = g();
                if (PatchProxy.isSupport(new Object[]{arVar2, bVar, g2}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43605, new Class[]{ar.class, com.ss.android.ugc.aweme.feed.param.b.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{arVar2, bVar, g2}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43605, new Class[]{ar.class, com.ss.android.ugc.aweme.feed.param.b.class, String.class}, Void.TYPE);
                    break;
                } else {
                    String str2 = "";
                    String str3 = "";
                    int i4 = arVar2.f45292b;
                    if (i4 == 19) {
                        str2 = "head";
                        str3 = "click_head";
                    } else if (i4 == 18) {
                        str2 = "name";
                        str3 = "click_name";
                    }
                    com.ss.android.ugc.aweme.common.t tVar = new com.ss.android.ugc.aweme.common.t();
                    try {
                        tVar.a("group_id", ((Aweme) arVar2.f45293c).getAid());
                        tVar.a("request_id", g2);
                        if (com.ss.android.ugc.aweme.feed.k.b.e((Aweme) arVar2.f45293c)) {
                            tVar.a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        }
                        tVar.a("to_user_id", ((Aweme) arVar2.f45293c).getAuthorUid());
                        tVar.a("author_id", ((Aweme) arVar2.f45293c).getAuthorUid());
                        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e((Aweme) arVar2.f45293c))) {
                            tVar.a("poi_id", com.ss.android.ugc.aweme.u.aa.e((Aweme) arVar2.f45293c));
                        }
                        if (com.ss.android.ugc.aweme.u.aa.c(bVar.getEventType())) {
                            tVar.a("poi_type", com.ss.android.ugc.aweme.u.aa.h((Aweme) arVar2.f45293c));
                            tVar.a("poi_channel", com.ss.android.ugc.aweme.u.aa.b());
                            tVar.a("city_info", com.ss.android.ugc.aweme.u.aa.a());
                            tVar.a("distance_info", com.ss.android.ugc.aweme.u.aa.i((Aweme) arVar2.f45293c));
                        }
                        r.onEvent(MobClick.obtain().setEventName(str2).setLabelName(bVar.getEventType()).setValue(((Aweme) arVar2.f45293c).getAuthor().getUid()).setJsonObject(tVar.a()));
                        tVar.a("enter_from", bVar.getEventType());
                        tVar.a("enter_method", str3);
                        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(((Aweme) arVar2.f45293c).getAuthor().getUid()).setJsonObject(tVar.a()));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            case 24:
                this.i.a(arVar2, "click_shopping_cart", "shopping_cart", f());
                return;
            case 25:
                Aweme aweme7 = (Aweme) arVar2.f45293c;
                if (aweme7 != null) {
                    this.f3165c.a(aweme7.getAid(), 1);
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, String.format(this.ar.getString(C0906R.string.t5), new Object[]{this.ar.getString(C0906R.string.ei)})).a();
                    VerticalViewPager verticalViewPager = this.mViewPager;
                    int i5 = this.B + 1;
                    this.B = i5;
                    verticalViewPager.setCurrentItem(i5);
                    r.onEvent(MobClick.obtain().setEventName("click_review_pass").setLabelName("homepage_hot").setValue(aweme7.getAid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("is_user_review", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).b()));
                    return;
                }
                return;
            case 26:
                Aweme aweme8 = (Aweme) arVar2.f45293c;
                if (aweme8 != null) {
                    this.f3165c.a(aweme8.getAid(), 2);
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, String.format(this.ar.getString(C0906R.string.t5), new Object[]{this.ar.getString(C0906R.string.a5w)})).a();
                    VerticalViewPager verticalViewPager2 = this.mViewPager;
                    int i6 = this.B + 1;
                    this.B = i6;
                    verticalViewPager2.setCurrentItem(i6);
                    r.onEvent(MobClick.obtain().setEventName("click_review_notpass").setLabelName("homepage_hot").setValue(aweme8.getAid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("is_user_review", PushConstants.PUSH_TYPE_NOTIFY).b()));
                    return;
                }
                return;
            case 27:
                return;
            case 28:
                c(false);
                bj();
                IFeedViewHolder aE = aE();
                Aweme aweme9 = (Aweme) arVar2.f45293c;
                if (!(aE == null || aweme9 == null)) {
                    aweme9.isShowCommerceCard();
                    if (com.ss.android.ugc.aweme.commercialize.utils.c.s(aweme9) && aE.r() != null) {
                        aE.r().a(com.ss.android.ugc.aweme.commercialize.utils.c.r(aweme9) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                        return;
                    }
                }
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69366e /*30*/:
                this.i.a(arVar2, "click_video_tag", "video_cart_tag", f());
                return;
            case 33:
            case 34:
            case 35:
                e();
                return;
            case 37:
                this.ag = true;
                c(true);
                aU();
                Aweme aweme10 = (Aweme) arVar2.f45293c;
                if (aweme10 != null && bc()) {
                    f(aweme10);
                    return;
                }
            case 38:
                b((Aweme) arVar2.f45293c, "head_icon");
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, String str, String str2, ar arVar) {
        if (this.K != null && this.K.l()) {
            a(aweme, str, true);
            this.K.a(new i.a().a(str).b(str2).a(1).c(f()).d(com.ss.android.ugc.aweme.feed.k.b.g(ag())).a(aweme).e(arVar.f45295e).c(bp.a(this.T.getEventType())).b(TextUtils.equals(f(), "homepage_hot") ? 13 : 18).a());
        }
    }

    public void a(Aweme aweme, String str) {
        String str2;
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3}, this, v, false, 41611, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3}, this, v, false, 41611, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        s f2 = new s().b(a(true)).f(TextUtils.isEmpty(O()) ? f() : O());
        if (TextUtils.isEmpty(O())) {
            str2 = "follow_button";
        } else {
            str2 = bf();
        }
        f2.g(str2).c("follow_button").h(str3).b(aweme2, bh()).e();
    }

    public final void a(Aweme aweme, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41653, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z2)}, this, v, false, 41653, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
        } else if (u.f75965b.a(aweme)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.du6).a();
        } else if (this.ao && bc()) {
            this.U.b(aweme, z2);
        }
    }

    public void a(List list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, v, false, 41670, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, v, false, 41670, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && list.size() >= i2 && com.ss.android.ugc.aweme.commercialize.utils.c.Q((Aweme) list.get(i2))) {
            if (this.A.getCount() == 0) {
                this.A.a(list);
                return;
            }
            this.A.a(list, i2);
        }
    }

    public final String a(boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41691, new Class[]{Boolean.TYPE}, String.class)) {
            return com.ss.android.ugc.aweme.feed.g.c.a(bh(), f(), z2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41691, new Class[]{Boolean.TYPE}, String.class);
    }

    public final boolean a(Runnable runnable, long j2) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2, 400L}, this, v, false, 41700, new Class[]{Runnable.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, 400L}, this, v, false, 41700, new Class[]{Runnable.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mViewPager != null) {
            return this.mViewPager.postDelayed(runnable, 400);
        } else {
            return false;
        }
    }

    public final void a(String str, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), new Long(j5)}, this, v, false, 41706, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j4), new Long(j5)}, this, v, false, 41706, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.av == null) {
            this.av = new com.ss.android.ugc.aweme.feed.preload.b();
        }
        this.av.a(str, j2, j3, this.A, ah(), this.E);
    }

    private boolean s() {
        return this.as instanceof FeedRecommendFragment;
    }

    public final String T() throws JSONException {
        return V().optString("request_id");
    }

    public final boolean ar() {
        if (this.Y == this.B) {
            return true;
        }
        return false;
    }

    public final boolean bk() {
        if (this.am != 1 && this.am != 2) {
            return false;
        }
        this.r = true;
        return true;
    }

    private boolean c() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41593, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41593, new Class[0], Boolean.TYPE)).booleanValue();
        }
        p aF = aF();
        if (aF != null && aF.D()) {
            z2 = true;
        }
        return z2;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41605, new Class[0], Void.TYPE);
            return;
        }
        ap().c((com.ss.android.ugc.aweme.video.a.a) this.U);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41612, new Class[0], Void.TYPE);
            return;
        }
        this.U.i();
    }

    private String g() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41620, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.a(this.A.c(this.mViewPager.getCurrentItem()), bh());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41620, new Class[0], String.class);
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41645, new Class[0], Void.TYPE);
            return;
        }
        this.S.a((a.C0575a) new a.C0575a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45658a;

            public final void b(Dialog dialog) {
                if (PatchProxy.isSupport(new Object[]{dialog}, this, f45658a, false, 41741, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialog}, this, f45658a, false, 41741, new Class[]{Dialog.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.freeflowcard.b.a().i = false;
            }

            public final void a(Dialog dialog) {
                if (PatchProxy.isSupport(new Object[]{dialog}, this, f45658a, false, 41740, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialog}, this, f45658a, false, 41740, new Class[]{Dialog.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.freeflowcard.b.a().i = true;
                BaseListFragmentPanel.this.aI();
            }
        });
    }

    public final String N() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41681, new Class[0], String.class)) {
            return this.T.getEnterFromRequestId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41681, new Class[0], String.class);
    }

    public final String O() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41683, new Class[0], String.class)) {
            return this.T.getPreviousPage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41683, new Class[0], String.class);
    }

    public final String P() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41684, new Class[0], String.class)) {
            return this.T.getShareUserId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41684, new Class[0], String.class);
    }

    public final String Q() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41685, new Class[0], String.class)) {
            return this.T.getSearchKeyword();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41685, new Class[0], String.class);
    }

    public final String R() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41686, new Class[0], String.class)) {
            return this.T.getContentSource();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41686, new Class[0], String.class);
    }

    public final String S() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41687, new Class[0], String.class)) {
            return this.T.getLikeEnterMethod();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41687, new Class[0], String.class);
    }

    public final void U() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41554, new Class[0], Void.TYPE);
            return;
        }
        JSONObject V2 = V();
        if (V2 != null) {
            try {
                bg.a(new x(V2.getString("request_id")));
            } catch (Exception unused) {
            }
        }
    }

    public final String X() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41690, new Class[0], String.class)) {
            return this.T.getPoiId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41690, new Class[0], String.class);
    }

    public final void Y() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41693, new Class[0], Void.TYPE);
            return;
        }
        IFeedViewHolder aE = aE();
        if (aE != null) {
            aE.e(false);
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29092f, com.ss.android.experiencekit.c.d.END);
    }

    public final void aA() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41559, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.feed.g.f.b(this.ar) || this.an) {
            ap().e();
        }
    }

    public final void aB() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41561, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.j();
            this.k = null;
        }
    }

    public final boolean aD() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41568, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(f(), "homepage_hot");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41568, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final p aF() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41583, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], this, v, false, 41583, new Class[0], p.class);
        }
        IFeedViewHolder aE = aE();
        if (aE == null) {
            return null;
        }
        return aE.t();
    }

    @Nullable
    public final g aG() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41584, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, v, false, 41584, new Class[0], g.class);
        }
        IFeedViewHolder aE = aE();
        if (aE == null) {
            return null;
        }
        return aE.m();
    }

    @Nullable
    public final IFeedViewHolder aH() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41586, new Class[0], IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, v, false, 41586, new Class[0], IFeedViewHolder.class);
        }
        IFeedViewHolder aE = aE();
        if (aE != null && !b(aE)) {
            return aE;
        }
        return null;
    }

    public void aI() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41596, new Class[0], Void.TYPE);
            return;
        }
        b(this.A.c(this.mViewPager.getCurrentItem()), true);
    }

    public final void aK() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41603, new Class[0], Void.TYPE);
        } else if (!o.v()) {
            d();
        } else {
            a(aE());
        }
    }

    public final void aL() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41604, new Class[0], Void.TYPE);
            return;
        }
        ap().h();
    }

    public final boolean aM() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41615, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41615, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.S != null && this.S.i()) {
            z2 = true;
        }
        return z2;
    }

    public final void aP() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41644, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (com.ss.android.g.a.a()) {
                i();
            } else {
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void aS() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41652, new Class[0], Void.TYPE);
            return;
        }
        p aF = aF();
        if (aF != null) {
            aF.K();
        }
        h(this.A.c(this.mViewPager.getCurrentItem()));
    }

    public void aV() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41662, new Class[0], Void.TYPE);
            return;
        }
        Z();
        this.ao = true;
    }

    public final void aW() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41664, new Class[0], Void.TYPE);
            return;
        }
        if (this.L != null) {
            aX();
            if (this.mViewPager != null) {
                this.mViewPager.removeCallbacks(this.f3168f);
            }
        }
    }

    public final void aX() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41665, new Class[0], Void.TYPE);
            return;
        }
        if (this.L != null) {
            this.L.f();
            this.ah = false;
            this.ai.b(this.ah);
        }
    }

    public final void aY() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41666, new Class[0], Void.TYPE);
            return;
        }
        if (this.M != null) {
            this.M.a();
            if (this.mViewPager != null) {
                this.mViewPager.removeCallbacks(this.g);
            }
        }
    }

    public final boolean ac() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41695, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41695, new Class[0], Boolean.TYPE)).booleanValue();
        }
        View o2 = o(false);
        if (o2 != null && o2.getVisibility() == 0) {
            z2 = true;
        }
        return z2;
    }

    public final void ae() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41699, new Class[0], Void.TYPE);
            return;
        }
        bd();
    }

    @Nullable
    public final IFeedViewHolder af() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41692, new Class[0], IFeedViewHolder.class)) {
            return aE();
        }
        return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, v, false, 41692, new Class[0], IFeedViewHolder.class);
    }

    public final Aweme ag() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41705, new Class[0], Aweme.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.c(aE());
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, v, false, 41705, new Class[0], Aweme.class);
    }

    public final int ah() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41701, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, v, false, 41701, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mViewPager == null) {
            return this.B;
        } else {
            return this.mViewPager.getCurrentItem();
        }
    }

    public final int ai() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41703, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, v, false, 41703, new Class[0], Integer.TYPE)).intValue();
        } else if (this.A == null) {
            return 0;
        } else {
            return this.A.getCount();
        }
    }

    public final String aj() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41654, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.g(this.A.c(this.mViewPager.getCurrentItem()));
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41654, new Class[0], String.class);
    }

    public final boolean ao() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41523, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41523, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.ak)) {
            z2 = true;
        }
        return z2;
    }

    @NonNull
    public final o ap() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41529, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, v, false, 41529, new Class[0], o.class);
        } else if (this.s != null) {
            return this.s;
        } else {
            return o.b();
        }
    }

    public final boolean aq() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41530, new Class[0], Boolean.TYPE)) {
            return super.aq();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41530, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void as() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41533, new Class[0], Void.TYPE);
            return;
        }
        super.as();
        if (this.C != null) {
            this.C.removeCallbacksAndMessages(null);
        }
        this.U = null;
    }

    public final long at() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41534, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, v, false, 41534, new Class[0], Long.TYPE)).longValue();
        }
        if (this.t == 0) {
            this.t = System.currentTimeMillis();
        }
        return this.t;
    }

    public final void av() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41544, new Class[0], Void.TYPE);
            return;
        }
        if (this.M != null) {
            this.M.b();
        }
        aX();
    }

    public final void ax() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41548, new Class[0], Void.TYPE);
        } else if (!o.v()) {
            ap().g();
        } else {
            g aG = aG();
            if (aG != null) {
                aG.U();
            }
        }
    }

    public final void ay() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41550, new Class[0], Void.TYPE);
            return;
        }
        super.ay();
    }

    public final void bb() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41675, new Class[0], Void.TYPE);
            return;
        }
        p aF = aF();
        if (aF != null) {
            aF.G();
        }
    }

    public final boolean bc() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41677, new Class[0], Boolean.TYPE)) {
            return super.bc();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41677, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String bf() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41707, new Class[0], String.class)) {
            return this.T.getPreviousPagePosition();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41707, new Class[0], String.class);
    }

    public final String bg() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41708, new Class[0], String.class)) {
            return this.T.getFrom();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41708, new Class[0], String.class);
    }

    public final int bh() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41709, new Class[0], Integer.TYPE)) {
            return this.T.getPageType();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, v, false, 41709, new Class[0], Integer.TYPE)).intValue();
    }

    public final String bi() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41710, new Class[0], String.class)) {
            return this.T.getEnterMethodValue();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41710, new Class[0], String.class);
    }

    public final boolean bl() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41721, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41721, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return com.ss.android.ugc.aweme.global.config.settings.g.b().ay().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    public final boolean bm() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41722, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.video.j.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41722, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void bo() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41727, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null && this.n.isShowing()) {
            this.n.a();
        }
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41531, new Class[0], String.class)) {
            return this.T.getEventType();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 41531, new Class[0], String.class);
    }

    public void u() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41624, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            IFeedViewHolder aE = aE();
            if (aE != null && aE.c() == 2) {
                aE.a(false);
            }
        }
    }

    public void v() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41594, new Class[0], Void.TYPE);
            return;
        }
        e(this.A.c(this.mViewPager.getCurrentItem()));
    }

    public void y() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41572, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41572, new Class[0], Void.TYPE);
            return;
        }
        if (this.mBottomSpace != null && this.mBottomSpace.getVisibility() == 8) {
            F();
        }
    }

    private com.ss.android.ugc.aweme.commercialize.symphony.e b() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41578, new Class[0], com.ss.android.ugc.aweme.commercialize.symphony.e.class)) {
            return (com.ss.android.ugc.aweme.commercialize.symphony.e) PatchProxy.accessDispatch(new Object[0], this, v, false, 41578, new Class[0], com.ss.android.ugc.aweme.commercialize.symphony.e.class);
        } else if (this.mViewPager == null) {
            return null;
        } else {
            int childCount = this.mViewPager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) this.mViewPager.getChildAt(i2).getTag(C0906R.id.acv);
                if (iFeedViewHolder != null && this.A.c(this.mViewPager.getCurrentItem()) == iFeedViewHolder.d()) {
                    com.ss.android.ugc.aweme.commercialize.symphony.c.a();
                    if (iFeedViewHolder instanceof com.ss.android.ugc.aweme.commercialize.symphony.e) {
                        return (com.ss.android.ugc.aweme.commercialize.symphony.e) iFeedViewHolder;
                    }
                }
            }
            return null;
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41646, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.base.utils.m.a().b() || !TextUtils.isEmpty(com.ss.android.ugc.aweme.freeflowcard.b.a().c())) {
            if (this.f3166d.f45077a == 2) {
                if (!o.v()) {
                    aL();
                } else {
                    a(aE());
                }
                ab();
            }
            this.S.a((a.C0575a) new a.C0575a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45660a;

                public final void a(Dialog dialog) {
                    if (PatchProxy.isSupport(new Object[]{dialog}, this, f45660a, false, 41742, new Class[]{Dialog.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialog}, this, f45660a, false, 41742, new Class[]{Dialog.class}, Void.TYPE);
                        return;
                    }
                    BaseListFragmentPanel.this.al = false;
                    if (BaseListFragmentPanel.this.ac()) {
                        BaseListFragmentPanel.this.Z();
                    }
                    BaseListFragmentPanel.this.aI();
                }

                public final void b(Dialog dialog) {
                    if (PatchProxy.isSupport(new Object[]{dialog}, this, f45660a, false, 41743, new Class[]{Dialog.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialog}, this, f45660a, false, 41743, new Class[]{Dialog.class}, Void.TYPE);
                        return;
                    }
                    BaseListFragmentPanel.this.al = false;
                    BaseListFragmentPanel.this.ab();
                    ag.i().h();
                }
            });
            this.al = true;
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41659, new Class[0], Void.TYPE);
            return;
        }
        if (this.L != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().c()).booleanValue()) {
            aX();
        }
    }

    private boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41697, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41697, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IFeedViewHolder aE = aE();
        if (aE == null || aE.d() == null || !aE.d().isAd()) {
            return false;
        }
        return true;
    }

    private bm r() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41713, new Class[0], bm.class)) {
            return (bm) PatchProxy.accessDispatch(new Object[0], this, v, false, 41713, new Class[0], bm.class);
        }
        if (this.f3167e == null) {
            this.f3167e = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.app.i.a().getContext(), bm.class);
        }
        return this.f3167e;
    }

    public final JSONObject V() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 41621, new Class[0], JSONObject.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.a(this.A.c(this.mViewPager.getCurrentItem()), bh(), bi(), f());
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, v, false, 41621, new Class[0], JSONObject.class);
    }

    public final void W() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41668, new Class[0], Void.TYPE);
        } else if (this.aq) {
            IFeedViewHolder aE = aE();
            if (com.ss.android.ugc.aweme.feed.k.b.f(aE)) {
                Aweme d2 = aE.d();
                if (d2 != null && d2 != this.u) {
                    this.u = d2;
                    com.ss.android.ugc.aweme.feed.k.c.a((Context) this.ar, d2, V(), this.T, a(true));
                }
            }
        }
    }

    public final void Z() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41658, new Class[0], Void.TYPE);
            return;
        }
        final View o2 = o(false);
        if (o2 != null) {
            o2.setVisibility(0);
            o2.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45672a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45672a, false, 41746, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45672a, false, 41746, new Class[0], Void.TYPE);
                        return;
                    }
                    if (o2 != null) {
                        o2.setVisibility(8);
                    }
                }
            }).start();
        }
    }

    public final void aC() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41563, new Class[0], Void.TYPE);
        } else if (this.A != null) {
            int i2 = this.l;
            if (i2 >= 0) {
                int i3 = i2 - 1;
                if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.A.c(i3)) && !com.ss.android.ugc.aweme.commercialize.utils.c.Y(this.A.c(i3))) {
                    b(i3);
                }
                if (i2 == 0 && this.A.c(1) != null) {
                    b(i2);
                }
            }
        }
    }

    @Nullable
    public final IFeedViewHolder aE() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41581, new Class[0], IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, v, false, 41581, new Class[0], IFeedViewHolder.class);
        } else if (this.mViewPager == null) {
            return null;
        } else {
            int childCount = this.mViewPager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) this.mViewPager.getChildAt(i2).getTag(C0906R.id.acv);
                if (a(this.mViewPager.getCurrentItem(), iFeedViewHolder)) {
                    return iFeedViewHolder;
                }
            }
            return null;
        }
    }

    public final void aN() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41616, new Class[0], Void.TYPE);
            return;
        }
        if (aM()) {
            com.ss.android.ugc.aweme.feed.d dVar = this.S;
            if (PatchProxy.isSupport(new Object[0], dVar, com.ss.android.ugc.aweme.feed.d.f45158a, false, 40016, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, com.ss.android.ugc.aweme.feed.d.f45158a, false, 40016, new Class[0], Void.TYPE);
            } else if (dVar.i()) {
                dVar.k.dismiss();
            }
        }
    }

    public final void aO() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41626, new Class[0], Void.TYPE);
            return;
        }
        if (this.A.getCount() == 0) {
            DmtStatusView q2 = q(true);
            if (q2 != null) {
                q2.setVisibility(0);
                q2.e();
            }
            aK();
            if (this.ar instanceof MainActivity) {
                bg.a(new ac(null));
            }
        }
    }

    public final void aT() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41660, new Class[0], Void.TYPE);
            return;
        }
        if (this.L != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().c()).booleanValue()) {
            aX();
        }
    }

    public final void aU() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41661, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (this.M != null && ((Boolean) SharePrefCache.inst().getClickGuideShown().c()).booleanValue()) {
                this.M.dismiss();
            }
        } else if (this.M != null && r().i(false)) {
            this.M.dismiss();
        }
    }

    public final boolean aZ() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41671, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41671, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ("from_hot".equals(bg()) || "from_nearby".equals(bg()) || "from_time_line".equals(bg())) {
            return true;
        } else {
            return false;
        }
    }

    public final void aa() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41694, new Class[0], Void.TYPE);
        } else if (!c()) {
            IFeedViewHolder aE = aE();
            if (aE != null) {
                aE.e(true);
            }
            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29092f, com.ss.android.experiencekit.c.d.BEGIN);
        }
    }

    public final void ab() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41657, new Class[0], Void.TYPE);
            return;
        }
        View o2 = o(true);
        if (o2 != null) {
            o2.setVisibility(0);
            o2.setScaleX(2.5f);
            o2.setScaleY(2.5f);
            o2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            o2.setSelected(false);
        }
    }

    public void au() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41538, new Class[0], Void.TYPE);
        } else if (this.am != 4) {
            this.mTopSpace.setVisibility(8);
            this.mBottomSpace.setVisibility(8);
        } else {
            this.mTopSpace.setVisibility(0);
            this.mBottomSpace.setVisibility(0);
        }
    }

    public final void aw() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41547, new Class[0], Void.TYPE);
            return;
        }
        super.aw();
        com.ss.android.ugc.aweme.feed.c.b bVar = this.V;
        if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.feed.c.b.f45083a, false, 40952, new Class[0], Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.feed.c.a b2 : bVar.f45084b) {
            b2.b();
        }
    }

    public final long az() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41553, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, v, false, 41553, new Class[0], Long.TYPE)).longValue();
        }
        n nVar = this.U;
        if (PatchProxy.isSupport(new Object[0], nVar, n.f45106a, false, 41037, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], nVar, n.f45106a, false, 41037, new Class[0], Long.TYPE)).longValue();
        }
        if (nVar.g == -1) {
            j2 = System.currentTimeMillis() - nVar.f45111f;
        } else {
            j2 = (System.currentTimeMillis() - nVar.f45111f) - nVar.g;
        }
        return j2;
    }

    public final boolean ba() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41672, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41672, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.poi.e.e.e()) {
            return "from_poi_categorized".equals(bg());
        } else {
            if ("from_nearby".equals(bg()) || "from_poi_categorized".equals(bg())) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean bn() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41726, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41726, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.M == null || !this.M.f45371f) && (this.L == null || !this.L.isShowing())) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bp() {
        if (this.ar != null && !this.ar.isFinishing() && bc()) {
            try {
                this.n.showAtLocation(this.mDiggLayout, 17, 0, 0);
                bt btVar = this.O;
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, btVar, bt.f54646a, false, 57651, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    bt btVar2 = btVar;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, btVar2, bt.f54646a, false, 57651, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    try {
                        btVar.f54647b.D(true);
                    } catch (Throwable th) {
                        ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
                    }
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    public boolean t() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41623, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41623, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.g.a.a()) {
            IFeedViewHolder aE = aE();
            if (aE != null) {
                aE.a(!aE.u());
                return aE.u();
            }
        }
        return false;
    }

    private BaseFeedPageParams a() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41557, new Class[0], BaseFeedPageParams.class)) {
            return (BaseFeedPageParams) PatchProxy.accessDispatch(new Object[0], this, v, false, 41557, new Class[0], BaseFeedPageParams.class);
        }
        BaseFeedPageParams newBuilder = BaseFeedPageParams.newBuilder();
        Activity activity = this.ar;
        if (activity != null) {
            if (activity instanceof MainActivity) {
                i2 = 1;
            } else if (activity instanceof DetailActivity) {
                i2 = 2;
            }
            return newBuilder.setAwemeFromPage(i2).setEventType(f()).setParam(this.T).setMyProfile(TextUtils.equals("from_profile_self", bg())).setFromPostList(this.T.isFromPostList()).setPageType(bh()).setShowVote(this.T.isShowVote()).setCid(this.T.getCid());
        }
        i2 = -1;
        return newBuilder.setAwemeFromPage(i2).setEventType(f()).setParam(this.T).setMyProfile(TextUtils.equals("from_profile_self", bg())).setFromPostList(this.T.isFromPostList()).setPageType(bh()).setShowVote(this.T.isShowVote()).setCid(this.T.getCid());
    }

    public final boolean aJ() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41599, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, v, false, 41599, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IFeedViewHolder aE = aE();
        if (!com.ss.android.ugc.aweme.feed.k.b.f(aE)) {
            if (PatchProxy.isSupport(new Object[]{aE}, null, com.ss.android.ugc.aweme.feed.k.b.f45566a, true, 43599, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aE}, null, com.ss.android.ugc.aweme.feed.k.b.f45566a, true, 43599, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
            } else if (aE == null || aE.k() == null || aE.k().q() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41535, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        com.ss.android.ugc.aweme.video.d.a(at());
        n nVar = this.U;
        if (PatchProxy.isSupport(new Object[0], nVar, n.f45106a, false, 41024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], nVar, n.f45106a, false, 41024, new Class[0], Void.TYPE);
        } else {
            nVar.f45108c = true;
            if (com.ss.android.g.a.a() && nVar.h() != null) {
                a.b.f33267c = nVar.h();
                a.b.f33268d = nVar.r;
                a.C0419a.f33262a = nVar.h().getAid();
                a.C0419a.f33263b = nVar.h().getAuthorUid();
            }
        }
        if (AbTestManager.a().aY() != 0) {
            com.ss.android.ugc.aweme.video.f a2 = com.ss.android.ugc.aweme.video.f.a(this.ar);
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.video.f.f76061a, false, 88921, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.video.f.f76061a, false, 88921, new Class[0], Void.TYPE);
            } else if (a2.f76065c != null) {
                if (a2.f76066d == null) {
                    a2.f76066d = new PhoneStateListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76067a;

                        public final void onCellLocationChanged(CellLocation cellLocation) {
                        }

                        public final void onServiceStateChanged(ServiceState serviceState) {
                        }

                        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                            if (PatchProxy.isSupport(new Object[]{signalStrength}, this, f76067a, false, 88923, new Class[]{SignalStrength.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{signalStrength}, this, f76067a, false, 88923, new Class[]{SignalStrength.class}, Void.TYPE);
                                return;
                            }
                            try {
                                int parseInt = Integer.parseInt(signalStrength.toString().split(" ")[9]);
                                int gsmSignalStrength = (signalStrength.getGsmSignalStrength() * 2) - 113;
                                if (f.this.f76065c.getNetworkType() == 13) {
                                    f.this.f76064b = parseInt;
                                } else {
                                    f.this.f76064b = gsmSignalStrength;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    };
                }
                a2.f76065c.listen(a2.f76066d, 256);
            }
        }
        View o2 = o(false);
        if (o2 != null) {
            o2.setAlpha(0.0f);
        }
        IFeedViewHolder aE = aE();
        if (this.al) {
            if (aE != null) {
                aE.e();
                a(aE, 3);
            }
            return;
        }
        if (aE != null) {
            aE.h();
            aE.c(2);
        }
        bj();
    }

    public void F() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41537, new Class[0], Void.TYPE);
            return;
        }
        au();
        VerticalViewPager verticalViewPager = this.mViewPager;
        View view = this.mTopSpace;
        View view2 = this.mBottomSpace;
        Activity activity = this.ar;
        a aVar = new a(this);
        if (PatchProxy.isSupport(new Object[]{verticalViewPager, view, view2, activity, aVar}, null, com.ss.android.ugc.aweme.profile.a.f61215a, true, 67216, new Class[]{VerticalViewPager.class, View.class, View.class, Activity.class, a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{verticalViewPager, view, view2, activity, aVar}, null, com.ss.android.ugc.aweme.profile.a.f61215a, true, 67216, new Class[]{VerticalViewPager.class, View.class, View.class, Activity.class, a.b.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.profile.a.d()) {
            if (PatchProxy.isSupport(new Object[]{verticalViewPager, view, view2, activity, 58, aVar}, null, com.ss.android.ugc.aweme.profile.a.f61215a, true, 67224, new Class[]{VerticalViewPager.class, View.class, View.class, Activity.class, Integer.TYPE, a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{verticalViewPager, view, view2, activity, 58, aVar}, null, com.ss.android.ugc.aweme.profile.a.f61215a, true, 67224, new Class[]{VerticalViewPager.class, View.class, View.class, Activity.class, Integer.TYPE, a.b.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.profile.c cVar = new com.ss.android.ugc.aweme.profile.c(activity, 58, verticalViewPager, view2, view, aVar);
                com.ss.android.b.a.a.a.a(cVar);
            }
        } else {
            com.ss.android.ugc.aweme.profile.a.a(verticalViewPager, view2, activity, 47, aVar);
        }
    }

    public final void aR() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41651, new Class[0], Void.TYPE);
        } else if (!q()) {
            IFeedViewHolder aE = aE();
            if ((aE == null || !b(aE)) && !c() && !com.ss.android.ugc.aweme.feed.guide.g.f45416b && this.M != null && !((Boolean) SharePrefCache.inst().getClickGuideShown().c()).booleanValue()) {
                if (this.ar instanceof MainActivity) {
                    ((MainActivity) this.ar).setGuideShown(true);
                }
                r.a("new_user_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("guide_type", "double_tap_to_like").f34114b);
                com.ss.android.ugc.aweme.feed.guide.a aVar = this.M;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.feed.guide.a.f45366a, false, 41162, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.feed.guide.a.f45366a, false, 41162, new Class[0], Void.TYPE);
                    return;
                }
                aVar.f45370e = false;
                aVar.f45371f = true;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.feed.guide.a.f45366a, false, 41160, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.feed.guide.a.f45366a, false, 41160, new Class[0], Void.TYPE);
                } else if (!aVar.g) {
                    aVar.g = true;
                    aVar.f45369d = aVar.h.inflate();
                    aVar.f45367b = (AnimationImageView) aVar.f45369d.findViewById(C0906R.id.b1s);
                    aVar.f45368c = (TextView) aVar.f45369d.findViewById(C0906R.id.text);
                    aVar.f45369d.setVisibility(8);
                    aVar.f45369d.setOnTouchListener(new View.OnTouchListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45372a;

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f45372a, false, 41166, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f45372a, false, 41166, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                            }
                            bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(a.this.f45367b.getContext(), bm.class);
                            if (bmVar != null && bmVar.i(true)) {
                                a.this.b();
                            }
                            return false;
                        }
                    });
                    if (com.ss.android.ugc.aweme.feed.guide.d.e()) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        aVar.f45369d.setLayoutParams(layoutParams);
                    }
                    if (aVar.i != null) {
                        aVar.f45369d.setTranslationY(aVar.i.floatValue());
                        aVar.i = null;
                    }
                }
                aVar.f45367b.loop(false);
                aVar.f45367b.setAnimation("home_doublelikes_warning.json");
                aVar.f45367b.playAnimation();
                aVar.f45367b.addAnimatorListener(new Animator.AnimatorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45374a;

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f45374a, false, 41169, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f45374a, false, 41169, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(a.this.f45367b.getContext(), bm.class);
                        if (bmVar != null) {
                            bmVar.j(true);
                        }
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f45374a, false, 41168, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f45374a, false, 41168, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        a.this.dismiss();
                        bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(a.this.f45367b.getContext(), bm.class);
                        if (bmVar != null) {
                            bmVar.j(true);
                        }
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f45374a, false, 41167, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f45374a, false, 41167, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        a.this.f45369d.setVisibility(0);
                        a.this.f45368c.setAlpha(0.0f);
                        a.this.f45368c.animate().alpha(1.0f).setDuration(300).start();
                    }
                });
            }
        }
    }

    public final void ad() {
        boolean z2;
        boolean z3;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41696, new Class[0], Void.TYPE);
        } else if (p && (!(!com.ss.android.ugc.aweme.feed.guide.d.b()) || !(!com.ss.android.ugc.aweme.feed.guide.d.e())) && !TimeLockRuler.isTeenModeON() && !this.ai.a()) {
            com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.ai;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73837, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73837, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (!(aVar.f65318b == null || aVar.f65318b.h.getValue() == null)) {
                    Object value = aVar.f65318b.h.getValue();
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    if (((Boolean) value).booleanValue()) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (!z2) {
                com.ss.android.ugc.aweme.share.viewmodel.a aVar2 = this.ai;
                if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73838, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73838, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    if (!(aVar2.f65318b == null || aVar2.f65318b.i.getValue() == null)) {
                        Object value2 = aVar2.f65318b.i.getValue();
                        if (value2 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (((Boolean) value2).booleanValue()) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                if (!z3 && !this.ac && !this.ad && !this.ad && !this.o && !this.ah && !TextUtils.equals("hot_search_video_board", f()) && !TextUtils.equals("discovery_hot_search_video", f()) && !c() && !com.ss.android.ugc.aweme.feed.guide.g.f45416b && this.M != null && !this.O.b(true) && !r().i(false)) {
                    this.mViewPager.removeCallbacks(this.g);
                    if (!com.ss.android.ugc.aweme.feed.guide.d.e()) {
                        i2 = 6000;
                    }
                    this.mViewPager.postDelayed(this.g, (long) i2);
                }
            }
        }
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41549, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        this.X = false;
        n nVar = this.U;
        if (PatchProxy.isSupport(new Object[0], nVar, n.f45106a, false, 41025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], nVar, n.f45106a, false, 41025, new Class[0], Void.TYPE);
        } else {
            nVar.f45108c = false;
            nVar.i = SystemClock.elapsedRealtime();
            nVar.h = System.currentTimeMillis();
        }
        if (AbTestManager.a().aY() != 0) {
            com.ss.android.ugc.aweme.video.f a2 = com.ss.android.ugc.aweme.video.f.a(this.ar);
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.video.f.f76061a, false, 88922, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.video.f.f76061a, false, 88922, new Class[0], Void.TYPE);
            } else if (a2.f76065c != null) {
                a2.f76065c.listen(a2.f76066d, 0);
            }
        }
        if (be() == null || !be().a()) {
            com.ss.android.ugc.aweme.video.d.b().a((com.ss.android.ugc.aweme.video.a.a) this.U);
        }
        IFeedViewHolder aE = aE();
        if (com.ss.android.ugc.aweme.feed.k.b.f(aE)) {
            if (!o.v()) {
                d();
            } else {
                a(aE);
            }
            if (this.aq) {
                aE.k().f(true);
            }
        }
        if (aE != null) {
            aE.e();
            a(aE, 2);
        }
        if (this.aq) {
            com.ss.android.ugc.aweme.video.preload.g.f().b();
        }
        if (this.M != null && this.M.f45371f) {
            this.M.dismiss();
        }
        d((String) null);
        aU();
        p();
        if (ao()) {
            FeedImpressionReporter.a(this.ak).e();
        }
    }

    public void n() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41532, new Class[0], Void.TYPE);
            return;
        }
        n nVar = this.U;
        if (PatchProxy.isSupport(new Object[0], nVar, n.f45106a, false, 41035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], nVar, n.f45106a, false, 41035, new Class[0], Void.TYPE);
        } else if (nVar.D) {
            nVar.D = false;
            IFeedViewHolder af2 = nVar.m.af();
            if (com.ss.android.ugc.aweme.feed.k.b.f(af2)) {
                Aweme d2 = af2.d();
                com.ss.android.ugc.aweme.commercialize.feed.e a2 = n.a(af2);
                if (!(d2 == null || a2 == null || nVar.z)) {
                    nVar.g();
                    if (nVar.g == -1) {
                        j2 = System.currentTimeMillis() - nVar.f45111f;
                    } else {
                        j2 = (System.currentTimeMillis() - nVar.f45111f) - nVar.g;
                    }
                    String aid = d2.getAid();
                    int i2 = nVar.k + 1;
                    if (PatchProxy.isSupport(new Object[]{aid, new Long(j2), Integer.valueOf(i2)}, a2, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30582, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.commercialize.feed.e eVar = a2;
                        PatchProxy.accessDispatch(new Object[]{aid, new Long(j2), Integer.valueOf(i2)}, eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30582, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (a2.f38830d != null) {
                        a2.f38830d.destroyBreak(a2.f38829c, a2.f38828b, aid, j2, i2);
                    }
                }
                bg.a(new com.ss.android.ugc.aweme.feed.f.h());
            }
        }
        IFeedViewHolder aE = aE();
        if (aE != null) {
            aE.t_();
        }
        if (this.mViewPager != null) {
            VerticalViewPager verticalViewPager = this.mViewPager;
            if (PatchProxy.isSupport(new Object[0], verticalViewPager, VerticalViewPager.f40481a, false, 33795, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], verticalViewPager, VerticalViewPager.f40481a, false, 33795, new Class[0], Void.TYPE);
            } else if (verticalViewPager.o != null) {
                verticalViewPager.o.clear();
            }
        }
        super.n();
        if (this.f3164b != null) {
            this.f3164b.k();
        }
        if (this.K != null) {
            this.K.k();
        }
        if (ap().b((com.ss.android.ugc.aweme.video.a.a) this.U)) {
            ap().a((com.ss.android.ugc.aweme.video.a.a) null);
        }
        com.ss.android.ugc.aweme.video.d.b();
        if (this.n != null) {
            this.n.a();
            this.n = null;
        }
        this.f3167e = null;
        com.ss.android.ugc.aweme.commercialize.utils.ad a3 = com.ss.android.ugc.aweme.commercialize.utils.ad.a();
        if (PatchProxy.isSupport(new Object[0], a3, com.ss.android.ugc.aweme.commercialize.utils.ad.f39667a, false, 32539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a3, com.ss.android.ugc.aweme.commercialize.utils.ad.f39667a, false, 32539, new Class[0], Void.TYPE);
            return;
        }
        a3.f39672f = null;
        a3.f39669c = null;
        a3.f39668b.removeCallbacks(a3.g);
    }

    public final void aQ() {
        boolean z2;
        int[] iArr;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 41648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 41648, new Class[0], Void.TYPE);
        } else if (bc() && !TimeLockRuler.isTeenModeON() && !c() && this.q) {
            com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.ai;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73839, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73839, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (!(aVar.f65318b == null || aVar.f65318b.f65315f.getValue() == null)) {
                    Object value = aVar.f65318b.f65315f.getValue();
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    if (((Boolean) value).booleanValue()) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (!z2) {
                if ((!com.ss.android.g.a.a() || (!(!AbTestManager.a().bJ()) || !(!com.ss.android.ugc.aweme.feed.guide.d.e()))) && !bj.f54591b && this.L != null && !((Boolean) SharePrefCache.inst().getFollowGuideShown().c()).booleanValue()) {
                    if (PatchProxy.isSupport(new Object[0], this, v, false, 41649, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, v, false, 41649, new Class[0], Void.TYPE);
                        return;
                    }
                    IFeedViewHolder aE = aE();
                    if (aE != null && !com.ss.android.ugc.aweme.feed.k.b.b(aE.d())) {
                        p aF = aF();
                        if (aF == null) {
                            iArr = null;
                        } else {
                            iArr = aF.F();
                        }
                        if (iArr != null) {
                            if (this.ar instanceof MainActivity) {
                                ((MainActivity) this.ar).setGuideShown(true);
                            }
                            if (!com.ss.android.g.a.a()) {
                                this.L.a(this.mDiggLayout, 3, (iArr[0] - this.L.d()) - ((int) UIUtils.dip2Px(this.ar, 15.0f)), (iArr[1] - (this.L.c() / 2)) - ((int) UIUtils.dip2Px(this.ar, 12.0f)), (float) ((this.L.c() / 2) + ((int) UIUtils.dip2Px(this.ar, 4.0f))));
                            } else if (ey.a((Context) this.ar)) {
                                this.L.a(this.mDiggLayout, 5, iArr[0] + ((int) UIUtils.dip2Px(this.ar, 40.0f)), iArr[1] - ((int) UIUtils.dip2Px(this.ar, 45.0f)), (float) ((this.L.c() / 2) + ((int) UIUtils.dip2Px(this.ar, 4.0f))));
                            } else {
                                this.L.a(this.mDiggLayout, 3, (iArr[0] - this.L.d()) - ((int) UIUtils.dip2Px(this.ar, 10.0f)), (iArr[1] - (this.L.c() / 2)) - ((int) UIUtils.dip2Px(this.ar, 12.0f)), (float) ((this.L.c() / 2) + ((int) UIUtils.dip2Px(this.ar, 4.0f))));
                            }
                            this.L.setOnDismissListener(new PopupWindow.OnDismissListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45670a;

                                public final void onDismiss() {
                                    if (PatchProxy.isSupport(new Object[0], this, f45670a, false, 41745, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f45670a, false, 41745, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    BaseListFragmentPanel.this.ah = false;
                                    BaseListFragmentPanel.this.ai.b(BaseListFragmentPanel.this.ah);
                                }
                            });
                            this.ah = true;
                            this.ai.b(this.ah);
                            r.a("follow_hint_guide_show ", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                            r.a("new_user_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("guide_type", "follow").f34114b);
                        }
                    }
                }
            }
        }
    }

    public void a(com.ss.android.ugc.aweme.feed.listener.a aVar) {
        this.G = aVar;
    }

    public BaseListFragmentPanel(String str) {
        this(str, 0);
    }

    public final void a(o oVar) {
        this.s = oVar;
        this.U.E = oVar;
    }

    @Subscribe
    public void onReceiveDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i iVar) {
        this.o = iVar.f45307a;
    }

    public final /* synthetic */ void a(Object obj) {
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, v, false, 41613, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, v, false, 41613, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        a(arVar);
    }

    public void b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, v, false, 41597, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, v, false, 41597, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        b(aweme2, true);
    }

    public final void h(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, v, false, 41655, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, v, false, 41655, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        a(aweme2, true);
    }

    @Subscribe
    public void onBottomTabClicked(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, v, false, 41635, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, v, false, 41635, new Class[]{w.class}, Void.TYPE);
            return;
        }
        aY();
    }

    @Subscribe
    public void onDeleteAwemeEventOnBase(com.ss.android.ugc.aweme.feed.f.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, v, false, 41573, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, v, false, 41573, new Class[]{com.ss.android.ugc.aweme.feed.f.g.class}, Void.TYPE);
            return;
        }
        this.mViewPager.post(new b(this));
    }

    @Subscribe
    public void onDismissEnterMusicGuideEvent(com.ss.android.ugc.aweme.feed.f.j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, v, false, 41673, new Class[]{com.ss.android.ugc.aweme.feed.f.j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, v, false, 41673, new Class[]{com.ss.android.ugc.aweme.feed.f.j.class}, Void.TYPE);
            return;
        }
        bb();
    }

    @Subscribe
    public void onEveningEvent(com.ss.android.ugc.aweme.feed.f.p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, v, false, 41539, new Class[]{com.ss.android.ugc.aweme.feed.f.p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, v, false, 41539, new Class[]{com.ss.android.ugc.aweme.feed.f.p.class}, Void.TYPE);
            return;
        }
        p aF = aF();
        if (aF != null) {
            aF.l();
        }
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41643, new Class[]{AbsAdCardAction.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41643, new Class[]{AbsAdCardAction.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            aE();
        }
    }

    @Subscribe
    public void onEvnet(com.ss.android.ugc.aweme.feed.f.n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, v, false, 41641, new Class[]{com.ss.android.ugc.aweme.feed.f.n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, v, false, 41641, new Class[]{com.ss.android.ugc.aweme.feed.f.n.class}, Void.TYPE);
            return;
        }
        aU();
    }

    @Subscribe
    public void onLoginPageCloseEvent(com.ss.android.ugc.aweme.login.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, v, false, 41628, new Class[]{com.ss.android.ugc.aweme.login.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, v, false, 41628, new Class[]{com.ss.android.ugc.aweme.login.a.b.class}, Void.TYPE);
            return;
        }
        b(false);
        bj();
    }

    @Subscribe
    public void onLoginPageShowEvent(com.ss.android.ugc.aweme.login.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, v, false, 41627, new Class[]{com.ss.android.ugc.aweme.login.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, v, false, 41627, new Class[]{com.ss.android.ugc.aweme.login.a.c.class}, Void.TYPE);
            return;
        }
        b(true);
        al();
    }

    @Subscribe
    public void onPrivateModelEvent(com.ss.android.ugc.aweme.feed.f.ad adVar) {
        com.ss.android.ugc.aweme.feed.f.ad adVar2 = adVar;
        if (PatchProxy.isSupport(new Object[]{adVar2}, this, v, false, 41540, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar2}, this, v, false, 41540, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder aE = aE();
        if (aE != null) {
            aE.a(adVar2);
        }
    }

    @Subscribe
    public void onRestrictEvent(com.ss.android.ugc.aweme.setting.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, v, false, 41634, new Class[]{com.ss.android.ugc.aweme.setting.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, v, false, 41634, new Class[]{com.ss.android.ugc.aweme.setting.a.c.class}, Void.TYPE);
            return;
        }
        p aF = aF();
        if (aF != null) {
            aF.v_();
        }
    }

    @Subscribe
    public void onScroll2StoryPublishPage(com.ss.android.ugc.aweme.main.c.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, v, false, 41590, new Class[]{com.ss.android.ugc.aweme.main.c.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, v, false, 41590, new Class[]{com.ss.android.ugc.aweme.main.c.d.class}, Void.TYPE);
            return;
        }
        bb();
    }

    @Subscribe
    public void onScrolledToHomePageTab(com.ss.android.ugc.aweme.share.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41725, new Class[]{com.ss.android.ugc.aweme.share.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41725, new Class[]{com.ss.android.ugc.aweme.share.model.a.class}, Void.TYPE);
            return;
        }
        this.q = true;
        if (com.ss.android.ugc.aweme.feed.guide.d.e()) {
            c(0);
        }
    }

    @Subscribe
    public void tryResumePlayEvent(aq aqVar) {
        if (PatchProxy.isSupport(new Object[]{aqVar}, this, v, false, 41589, new Class[]{aq.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aqVar}, this, v, false, 41589, new Class[]{aq.class}, Void.TYPE);
            return;
        }
        v();
    }

    public static boolean e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, v, true, 41560, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, v, true, 41560, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals("from_follow_page", str2) || TextUtils.equals("from_user_state_tab", str2) || TextUtils.equals("from_launch_forward", str2) || TextUtils.equals("from_forward_push", str2)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a_(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41669, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41669, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        aB();
        this.A.e(i2);
        aO();
        e(this.mViewPager.getCurrentItem());
    }

    public final IFeedViewHolder c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, v, false, 41704, new Class[]{String.class}, IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[]{str}, this, v, false, 41704, new Class[]{String.class}, IFeedViewHolder.class);
        } else if (this.mViewPager == null) {
            return null;
        } else {
            int childCount = this.mViewPager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) this.mViewPager.getChildAt(i2).getTag(C0906R.id.acv);
                if (iFeedViewHolder != null && iFeedViewHolder.B() != null && StringUtils.equal(iFeedViewHolder.B().getAid(), str)) {
                    return iFeedViewHolder;
                }
            }
            return null;
        }
    }

    public final Aweme d(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41702, new Class[]{Integer.TYPE}, Aweme.class)) {
            return this.A.c(i2);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41702, new Class[]{Integer.TYPE}, Aweme.class);
    }

    public final void f(Aweme aweme) {
        final Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, v, false, 41614, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, v, false, 41614, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45652a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45652a, false, 41757, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45652a, false, 41757, new Class[0], Void.TYPE);
                } else if (BaseListFragmentPanel.this.ar != null && !BaseListFragmentPanel.this.ar.isFinishing()) {
                    BaseListFragmentPanel.this.S.m = BaseListFragmentPanel.this.ag;
                    BaseListFragmentPanel.this.S.a(BaseListFragmentPanel.this.ar, aweme2);
                }
            }
        });
    }

    public final IFeedViewHolder g(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41582, new Class[]{Integer.TYPE}, IFeedViewHolder.class)) {
            return (IFeedViewHolder) this.mViewPager.getChildAt(i2).getTag(C0906R.id.acv);
        }
        return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41582, new Class[]{Integer.TYPE}, IFeedViewHolder.class);
    }

    public final void i(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, v, false, 41667, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, v, false, 41667, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme != null && aweme.isAd()) {
            this.R = false;
        }
        this.j = false;
    }

    public final Aweme j(Aweme aweme) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, v, false, 41716, new Class[]{Aweme.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme}, this, v, false, 41716, new Class[]{Aweme.class}, Aweme.class);
        }
        if (this.mViewPager == null) {
            i2 = this.B;
        } else {
            i2 = this.mViewPager.getCurrentItem();
        }
        if (this.A == null) {
            return null;
        }
        Aweme c2 = this.A.c(i2);
        if (c2 == aweme) {
            return this.A.c(i2 + 1);
        }
        return c2;
    }

    @Nullable
    public final IFeedViewHolder k(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41579, new Class[]{Boolean.TYPE}, IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41579, new Class[]{Boolean.TYPE}, IFeedViewHolder.class);
        } else if (this.mViewPager == null) {
            return null;
        } else {
            int childCount = this.mViewPager.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                IFeedViewHolder g2 = g(i3);
                if (z2) {
                    i2 = this.mViewPager.getCurrentItem() - 1;
                } else {
                    i2 = this.mViewPager.getCurrentItem() + 1;
                }
                if (i2 < 0) {
                    return null;
                }
                if (a(i2, g2)) {
                    return g2;
                }
            }
            return null;
        }
    }

    @Subscribe
    public void onAdFeedRefreshEvent(com.ss.android.ugc.aweme.commercialize.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41678, new Class[]{com.ss.android.ugc.aweme.commercialize.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41678, new Class[]{com.ss.android.ugc.aweme.commercialize.b.a.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder aE = aE();
        if (com.ss.android.ugc.aweme.feed.k.b.f(aE)) {
            Aweme d2 = aE.d();
            if (d2 != null && d2.isAd()) {
                this.R = true;
            }
        }
    }

    @Subscribe
    public void onCleanModeChangedEvent(com.ss.android.ugc.aweme.main.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41577, new Class[]{com.ss.android.ugc.aweme.main.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41577, new Class[]{com.ss.android.ugc.aweme.main.b.a.class}, Void.TYPE);
            return;
        }
        boolean z2 = com.ss.android.ugc.aweme.main.a.a().f54286b;
        for (int i2 = 0; i2 < this.mViewPager.getChildCount(); i2++) {
            IFeedViewHolder g2 = g(i2);
            if (g2 != null) {
                g2.a(z2);
            }
        }
    }

    @Subscribe
    public void onDismissEnterMusicGuideEvent(com.ss.android.ugc.aweme.main.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41674, new Class[]{com.ss.android.ugc.aweme.main.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41674, new Class[]{com.ss.android.ugc.aweme.main.a.a.class}, Void.TYPE);
            return;
        }
        bb();
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, v, false, 41543, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, v, false, 41543, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder aE = aE();
        if (aE != null) {
            aE.a(gVar2);
        }
    }

    @Subscribe
    public void onFakeLabelEvent(com.ss.android.ugc.aweme.comment.b.c cVar) {
        com.ss.android.ugc.aweme.comment.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, v, false, 41541, new Class[]{com.ss.android.ugc.aweme.comment.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, v, false, 41541, new Class[]{com.ss.android.ugc.aweme.comment.b.c.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder aE = aE();
        if (aE != null) {
            aE.a(cVar2.f36375a, cVar2.f36376b);
        }
    }

    @Subscribe
    public void onFeedAdClickCouponEvent(com.ss.android.ugc.aweme.commercialize.b.d dVar) {
        com.ss.android.ugc.aweme.commercialize.b.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, v, false, 41640, new Class[]{com.ss.android.ugc.aweme.commercialize.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, v, false, 41640, new Class[]{com.ss.android.ugc.aweme.commercialize.b.d.class}, Void.TYPE);
            return;
        }
        Aweme aweme = dVar2.f38509a;
        int i2 = dVar2.f38510b;
        if (com.ss.android.ugc.aweme.commercialize.utils.c.n(aweme) != null) {
            if (i2 == 2 || i2 == 6 || i2 == 3 || i2 == 17) {
                IFeedViewHolder aE = aE();
                if (!(aE == null || aE.r() == null || aE.r().w == null)) {
                    aE.r().w.a(i2);
                }
            }
        }
    }

    @Subscribe
    public void onFeedAdClickFormEvent(com.ss.android.ugc.aweme.commercialize.b.e eVar) {
        com.ss.android.ugc.aweme.commercialize.b.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, v, false, 41639, new Class[]{com.ss.android.ugc.aweme.commercialize.b.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, v, false, 41639, new Class[]{com.ss.android.ugc.aweme.commercialize.b.e.class}, Void.TYPE);
            return;
        }
        Aweme aweme = eVar2.f38511a;
        int i2 = eVar2.f38512b;
        CardStruct m2 = com.ss.android.ugc.aweme.commercialize.utils.c.m(aweme);
        if (m2 == null || m2.getCardType() != 1) {
            com.ss.android.ugc.aweme.commercialize.utils.g.a(this.ar, aweme, br(), i2);
        } else if (i2 == 2) {
            IFeedViewHolder aE = aE();
            if (!(aE == null || aE.r() == null || aE.r().w == null)) {
                aE.r().w.e();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, v, false, 41630, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, v, false, 41630, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(br(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45655a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f45655a, false, 41758, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45655a, false, 41758, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseListFragmentPanel.this.K.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f45655a, false, 41759, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45655a, false, 41759, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.app.api.a.a.a(BaseListFragmentPanel.this.ar, exc, C0906R.string.afx);
                    }
                });
            } else {
                com.ss.android.ugc.aweme.app.api.a.a.a(this.ar, exc, C0906R.string.afx);
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, v, false, 41629, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, v, false, 41629, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        Aweme ag2 = ag();
        if (ag2 != null) {
            User author = ag2.getAuthor();
            if (author != null) {
                author.setFollowStatus(followStatus2.followStatus);
                bg.a(new com.ss.android.ugc.aweme.challenge.a.d(followStatus2.followStatus, author));
            }
        }
    }

    @Subscribe
    public void onNetStateChangeEvent(com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41542, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41542, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.base.utils.m.a().c()) {
            v();
        }
    }

    @Subscribe
    public void onPauseVideoEvent(com.ss.android.ugc.aweme.commerce.service.f.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, v, false, 41633, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, v, false, 41633, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.d.class}, Void.TYPE);
            return;
        }
        if (this.f3166d.f45077a != 3) {
            aS();
        }
    }

    @Subscribe
    public void onScrollToProfileGuideEvent(com.ss.android.ugc.aweme.detail.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, v, false, 41638, new Class[]{com.ss.android.ugc.aweme.detail.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, v, false, 41638, new Class[]{com.ss.android.ugc.aweme.detail.c.b.class}, Void.TYPE);
            return;
        }
        if (this.M != null && this.M.f45371f) {
            this.M.a();
            SharePrefCache.inst().getClickGuideShown().a(Boolean.FALSE);
        }
        boolean z2 = bVar.f41164a;
        com.ss.android.ugc.aweme.feed.guide.g.f45416b = z2;
        if (z2) {
            aX();
        }
    }

    @Subscribe
    public void onVideoPlayerEvent(com.ss.android.ugc.aweme.shortvideo.f.f fVar) {
        com.ss.android.ugc.aweme.shortvideo.f.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, v, false, 41636, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, v, false, 41636, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE);
            return;
        }
        int i2 = fVar2.f67648c;
        if (i2 == 2) {
            this.Z.G();
        } else if (i2 == 7) {
        }
    }

    private void b(boolean z2) {
        MutableLiveData<Boolean> mutableLiveData;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41526, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41526, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ae = z3;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.ai;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73844, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.share.viewmodel.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr2, aVar2, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73844, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            FeedPanelStateViewModel feedPanelStateViewModel = aVar.f65318b;
            if (feedPanelStateViewModel != null) {
                mutableLiveData = feedPanelStateViewModel.f65310a;
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                aVar.f65318b.f65310a.setValue(Boolean.valueOf(z2));
            }
        }
        if (z3) {
            p();
        }
    }

    private void c(boolean z2) {
        MutableLiveData<Boolean> mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41527, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41527, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ad = z2;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.ai;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73843, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73843, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FeedPanelStateViewModel feedPanelStateViewModel = aVar.f65318b;
        if (feedPanelStateViewModel != null) {
            mutableLiveData = feedPanelStateViewModel.f65312c;
        } else {
            mutableLiveData = null;
        }
        if (mutableLiveData != null) {
            aVar.f65318b.f65312c.setValue(Boolean.valueOf(z2));
        }
    }

    public void a_(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, v, false, 41625, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, v, false, 41625, new Class[]{String.class}, Void.TYPE);
            return;
        }
        bg.a(new ar(2, str2));
        if (ac()) {
            Z();
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{null}, this, v, false, 41551, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, v, false, 41551, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.U.f((String) null);
    }

    public final void e(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41562, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41562, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        IFeedViewHolder iFeedViewHolder = null;
        if (this.mViewPager != null) {
            int childCount = this.mViewPager.getChildCount();
            IFeedViewHolder iFeedViewHolder2 = null;
            for (int i4 = 0; i4 < childCount; i4++) {
                IFeedViewHolder iFeedViewHolder3 = (IFeedViewHolder) this.mViewPager.getChildAt(i4).getTag(C0906R.id.acv);
                if (a(i3, iFeedViewHolder3)) {
                    iFeedViewHolder2 = iFeedViewHolder3;
                }
            }
            iFeedViewHolder = iFeedViewHolder2;
        }
        if (iFeedViewHolder != this.k) {
            aB();
            if (iFeedViewHolder != null) {
                iFeedViewHolder.a(i3);
            }
            this.k = iFeedViewHolder;
            if (this.A != null) {
                Aweme c2 = this.A.c(i3);
                if (PatchProxy.isSupport(new Object[]{c2, (byte) 0}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32313, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{c2, (byte) 0}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32313, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
                } else if (com.ss.android.ugc.aweme.commercialize.utils.c.t(c2)) {
                    c2.getAwemeRawAd().setContextTrackSent(false);
                }
            }
        }
        this.l = i3;
        aC();
    }

    public final void f(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, v, false, 41680, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, v, false, 41680, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.C != null) {
            Message obtain = Message.obtain(this.C, new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45675a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45675a, false, 41747, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45675a, false, 41747, new Class[0], Void.TYPE);
                        return;
                    }
                    if (BaseListFragmentPanel.this.C != null) {
                        BaseListFragmentPanel.this.C.removeMessages(10);
                    }
                    IFeedViewHolder af = BaseListFragmentPanel.this.af();
                    if (af != null && af.d() != null && TextUtils.equals(af.d().getAid(), str) && af.d().isLive() && BaseListFragmentPanel.this.bc()) {
                        Aweme d2 = af.d();
                        Activity activity = BaseListFragmentPanel.this.ar;
                        String optString = BaseListFragmentPanel.this.V().optString("request_id");
                        String uid = d2.getAuthor().getUid();
                        long j = d2.getAuthor().roomId;
                        if (PatchProxy.isSupport(new Object[]{activity, optString, uid, new Long(j), (byte) 0}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84676, new Class[]{Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity, optString, uid, new Long(j), (byte) 0}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84676, new Class[]{Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.story.live.b.a((Context) activity, 1, uid, j, com.ss.android.ugc.aweme.story.live.b.a("homepage_follow", "live", optString));
                    }
                }
            });
            obtain.what = 10;
            this.C.sendMessageDelayed(obtain, 60000);
        }
    }

    public final void g(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, v, false, 41619, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, v, false, 41619, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.a.b("AWEME == NULL");
        } else {
            if (this.S.c() == null) {
                com.ss.android.ugc.aweme.comment.a.a.b("ACTIVITY == NULL");
            }
            this.S.a(new a.C0457a(com.ss.android.ugc.aweme.feed.k.b.d(aweme)).a(aweme.getOriginCommentIds()).b(X()).b(this.j).d(O()).a());
            this.j = false;
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, v, false, 41622, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, v, false, 41622, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message2.what) {
            case 0:
                if (!(this.A == null || this.mViewPager == null)) {
                    Aweme c2 = this.A.c(this.mViewPager.getCurrentItem());
                    if (com.ss.android.ugc.aweme.feed.k.b.e(c2)) {
                        t();
                    } else if (c2 != null && !TextUtils.isEmpty(c2.getAid())) {
                        r.a((Context) this.ar, "click", "video", c2.getAid(), 0);
                        h(c2);
                    }
                    p aF = aF();
                    if (aF != null) {
                        aF.K();
                    }
                }
                this.C.removeMessages(1);
                return;
            case 1:
                this.C.removeMessages(1);
                break;
        }
    }

    public final void i(boolean z2) {
        MutableLiveData<Boolean> mutableLiveData;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41525, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41525, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ac = z3;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.ai;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73842, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.share.viewmodel.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr2, aVar2, com.ss.android.ugc.aweme.share.viewmodel.a.f65316a, false, 73842, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            FeedPanelStateViewModel feedPanelStateViewModel = aVar.f65318b;
            if (feedPanelStateViewModel != null) {
                mutableLiveData = feedPanelStateViewModel.f65311b;
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                aVar.f65318b.f65311b.setValue(Boolean.valueOf(z2));
            }
        }
        if (z3) {
            p();
        }
    }

    public final void j(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41536, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41536, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.feed.ui.masklayer.a.f46697d.a(f())) {
            IFeedViewHolder aH = aH();
            if (aH != null) {
                aH.d(z2);
            }
            SharePrefCache.inst().getHasLongPressDislike().a(Boolean.TRUE);
            boolean z3 = !z2;
            this.mRefreshLayout.setCanTouch(z3);
            this.mViewPager.setCanTouch(z3);
        }
    }

    public final void l(boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41591, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41591, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71773, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71773, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                z3 = false;
            } else {
                z3 = d2.pauseVideoWhenCommenting;
            }
        }
        if (z3 && this.ab) {
            if (z2) {
                if (this.U.j.f45077a != 3) {
                    z4 = false;
                }
                this.m = z4;
                aK();
            } else if (!this.m) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, w, "resume play by comment dialog dismiss");
                v();
            }
        }
        if (!z2) {
            this.ab = false;
        }
    }

    public void m(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41595, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41595, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme c2 = this.A.c(this.mViewPager.getCurrentItem());
        if (PatchProxy.isSupport(new Object[]{c2, Byte.valueOf(z2)}, this, v, false, 41588, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{c2, Byte.valueOf(z2)}, this, v, false, 41588, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            W();
        }
        a(c2);
    }

    public final View o(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41656, new Class[]{Boolean.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41656, new Class[]{Boolean.TYPE}, View.class);
        }
        if (this.J == null && z2 && this.y) {
            this.J = new ImageView(this.ar);
            this.J.setImageResource(2130839189);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mLoadMoreLayout.addView(this.J, layoutParams);
            this.J.setScaleX(2.5f);
            this.J.setScaleY(2.5f);
            this.J.setVisibility(8);
            this.J.setAlpha(0.0f);
            this.J.setOnClickListener(new d(this));
        }
        return this.J;
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent}, this, v, false, 41718, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent}, this, v, false, 41718, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        this.am = awesomeSplashEvent.f39420b;
        if (!(this.am == 1 || this.am == 2 || !this.r)) {
            aP();
            this.r = false;
        }
        if (this.am == 2) {
            if (PatchProxy.isSupport(new Object[0], this, v, false, 41719, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, v, false, 41719, new Class[0], Void.TYPE);
            } else {
                IFeedViewHolder aE = aE();
                if (aE != null) {
                    p t2 = aE.t();
                    if (t2 != null) {
                        Aweme d2 = aE.d();
                        if (d2 != null) {
                            a.i.a((Callable<TResult>) new e<TResult>(d2, t2));
                        }
                    }
                }
            }
        }
        if (this.am < 4) {
            DmtStatusView q2 = q(false);
            if (q2 != null && q2.g()) {
                q2.b();
            }
        }
        com.ss.android.ugc.aweme.commercialize.splash.d.a(awesomeSplashEvent.f39420b, this.topFakeAdaptationContainer, this.bottomFakeAdaptationContainer);
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.c cVar) {
        AbsAdCardAction.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, v, false, 41642, new Class[]{AbsAdCardAction.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, v, false, 41642, new Class[]{AbsAdCardAction.c.class}, Void.TYPE);
            return;
        }
        if (cVar2 != null) {
            IFeedViewHolder aE = aE();
            if (!(aE == null || aE.r() == null || aE.r().w == null)) {
                com.ss.android.ugc.aweme.commercialize.views.cards.a aVar = aE.r().w;
                int i2 = cVar2.f40017b;
                int i3 = cVar2.f40016a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, com.ss.android.ugc.aweme.commercialize.views.cards.a.f40034a, false, 33021, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commercialize.views.cards.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVar2, com.ss.android.ugc.aweme.commercialize.views.cards.a.f40034a, false, 33021, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (!(i2 == 0 && i3 == 0)) {
                    ViewGroup.LayoutParams layoutParams = aVar.f40037d.getLayoutParams();
                    if (i2 != 0) {
                        layoutParams.width = com.ss.android.ugc.aweme.base.utils.u.a(aVar.f40035b, i2);
                    }
                    if (i3 != 0) {
                        layoutParams.height = com.ss.android.ugc.aweme.base.utils.u.a(aVar.f40035b, i3);
                    }
                    aVar.f40037d.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Subscribe
    public void onScrolledToProfileTab(com.ss.android.ugc.aweme.share.model.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, v, false, 41724, new Class[]{com.ss.android.ugc.aweme.share.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, v, false, 41724, new Class[]{com.ss.android.ugc.aweme.share.model.b.class}, Void.TYPE);
            return;
        }
        this.q = false;
        p();
        bt btVar = this.O;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, btVar, bt.f54646a, false, 57633, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {(byte) 1};
            bt btVar2 = btVar;
            PatchProxy.accessDispatch(objArr, btVar2, bt.f54646a, false, 57633, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            btVar.f54647b.G(true);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
        }
    }

    @Subscribe
    public void onVoteEvent(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, v, false, 41545, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, v, false, 41545, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class}, Void.TYPE);
        } else if (this.A != null && !CollectionUtils.isEmpty(this.A.h)) {
            IFeedViewHolder aE = aE();
            if (!(aE == null || aE.d() == null || !TextUtils.equals(aE.d().getAid(), aVar.f69865a) || aE.d().getInteractStickerStructs() == null)) {
                for (InteractStickerStruct voteStruct : aE.d().getInteractStickerStructs()) {
                    VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                    if (!(voteStruct2 == null || voteStruct2.getOptions() == null)) {
                        for (VoteStruct.OptionsBean optionId : voteStruct2.getOptions()) {
                            if (optionId.getOptionId() == aVar.f69866b) {
                                voteStruct2.setSelectOptionId(aVar.f69866b);
                            }
                        }
                    }
                }
            }
        }
    }

    public void p(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41663, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41663, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.ao = false;
        IFeedViewHolder aE = aE();
        if (aE != null) {
            if (z2) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            aE.b(i2);
            if (com.ss.android.ugc.aweme.feed.k.b.f(aE) && (this.ar instanceof MainActivity)) {
                MainActivity mainActivity = (MainActivity) this.ar;
                if (mainActivity != null) {
                    mainActivity.hideAutoPlayTab();
                }
            }
        }
    }

    public final DmtStatusView q(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41712, new Class[]{Boolean.TYPE}, DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41712, new Class[]{Boolean.TYPE}, DmtStatusView.class);
        }
        if (this.as != null) {
            Fragment fragment = this.as;
            if (fragment instanceof BaseFeedListFragment) {
                return ((BaseFeedListFragment) fragment).b(z2);
            }
            if (fragment instanceof DetailPageFragment) {
                return ((DetailPageFragment) fragment).f3011b;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                throw new RuntimeException("wrong fragment type host BaseListFragmentPanel : " + fragment.getClass().getSimpleName());
            }
        }
        return null;
    }

    public final void r(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41715, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, v, false, 41715, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Activity activity = this.ar;
        if (activity instanceof MainActivity) {
            ((MainActivity) activity).setCanScroll(z2);
        }
    }

    private void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, v, false, 41592, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, v, false, 41592, new Class[]{Aweme.class}, Void.TYPE);
        } else if (!this.al && !u.f75965b.a(aweme) && this.ar != null) {
            p aF = aF();
            if (aF == null || !aF.D()) {
                com.ss.android.ugc.aweme.commercialize.symphony.e b2 = b();
                if (b2 != null) {
                    b2.h();
                }
                IFeedViewHolder aE = aE();
                if (this.X || !bm() || aE == null) {
                    this.U.a(aweme);
                    return;
                }
                aE.p();
                this.X = true;
                return;
            }
            aF.E();
        }
    }

    private void b(int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41564, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41564, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.A != null) {
            Aweme c2 = this.A.c(i2);
            if (com.ss.android.ugc.aweme.commercialize.utils.c.t(c2) && c2.getAwemeRawAd().getContextTrack() != null && !CollectionUtils.isEmpty(c2.getAwemeRawAd().getContextTrack().getUrlList())) {
                c2.getAwemeRawAd().setContextTrackSent(true);
                Aweme c3 = this.A.c(i2 - 1);
                Aweme c4 = this.A.c(i2 + 1);
                if (c3 == null) {
                    str = "";
                } else {
                    str = c3.getShareUrl();
                }
                if (c4 == null) {
                    str2 = "";
                } else {
                    str2 = c4.getShareUrl();
                }
                if (TextUtils.isEmpty(str)) {
                    str3 = "";
                } else {
                    str3 = URLEncoder.encode(str);
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = "";
                } else {
                    str4 = URLEncoder.encode(str2);
                }
                LinkedList linkedList = new LinkedList();
                for (String next : c2.getAwemeRawAd().getContextTrack().getUrlList()) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("__PCONTENT__", str3).replace("__NCONTENT__", str4);
                        String str5 = "";
                        try {
                            str5 = T();
                        } catch (JSONException unused) {
                        }
                        linkedList.add(Uri.parse(replace).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("req_id", str5).toString());
                    }
                }
                com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) null, (Collection<String>) linkedList, false);
            }
        }
    }

    public final com.ss.android.ugc.aweme.app.d.c c(Aweme aweme) {
        int i2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, v, false, 41682, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{aweme2}, this, v, false, 41682, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        if (this.mViewPager == null) {
            i2 = 0;
        } else {
            i2 = this.mViewPager.getCurrentItem();
        }
        com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
        boolean w2 = w();
        if (PatchProxy.isSupport(new Object[]{aweme2, bVar, Byte.valueOf(w2 ? (byte) 1 : 0), Integer.valueOf(i2)}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43608, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class, Boolean.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{aweme2, bVar, Byte.valueOf(w2), Integer.valueOf(i2)}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43608, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class, Boolean.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = new com.ss.android.ugc.aweme.app.d.c().a("author_id", com.ss.android.ugc.aweme.u.aa.a(aweme)).a("request_id", com.ss.android.ugc.aweme.u.aa.a(aweme2, bVar.getPageType())).a("detail", Integer.valueOf(w2 ? 1 : 0)).a("order", Integer.valueOf(i2)).a("is_photo", com.ss.android.ugc.aweme.u.aa.n(aweme)).a("enter_method", bVar.getEnterMethodValue()).a("enter_from", bVar.getEventType());
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(aweme))) {
            a2.a("poi_id", com.ss.android.ugc.aweme.u.aa.e(aweme));
        }
        if (com.ss.android.ugc.aweme.u.aa.c(bVar.getEventType())) {
            a2.a("poi_type", com.ss.android.ugc.aweme.u.aa.h(aweme)).a("poi_channel", com.ss.android.ugc.aweme.u.aa.b()).a("city_info", com.ss.android.ugc.aweme.u.aa.a()).a("distance_info", com.ss.android.ugc.aweme.u.aa.i(aweme));
        }
        if (!TextUtils.isEmpty(bVar.getShareUserId())) {
            a2.a("share_mode", "token").a("uid", bVar.getShareUserId());
        }
        return a2;
    }

    public final com.ss.android.ugc.aweme.app.d.c d(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, v, false, 41689, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{aweme2}, this, v, false, 41689, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        com.ss.android.ugc.aweme.feed.param.b bVar = this.T;
        if (PatchProxy.isSupport(new Object[]{aweme2, bVar}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43609, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{aweme2, bVar}, null, com.ss.android.ugc.aweme.feed.k.c.f45567a, true, 43609, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.param.b.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = new com.ss.android.ugc.aweme.app.d.c().a("author_id", com.ss.android.ugc.aweme.u.aa.a(aweme)).a("request_id", com.ss.android.ugc.aweme.u.aa.a(aweme2, bVar.getPageType())).a("enter_from", bVar.getEventType()).a("content_source", bVar.getContentSource());
        if (!TextUtils.isEmpty(bVar.getLikeEnterMethod())) {
            a2.a("enter_method", bVar.getLikeEnterMethod());
        }
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(aweme))) {
            a2.a("poi_id", com.ss.android.ugc.aweme.u.aa.e(aweme));
        }
        if (com.ss.android.ugc.aweme.u.aa.c(bVar.getEventType())) {
            a2.a("poi_type", com.ss.android.ugc.aweme.u.aa.h(aweme)).a("poi_channel", com.ss.android.ugc.aweme.u.aa.b()).a("city_info", com.ss.android.ugc.aweme.u.aa.a()).a("distance_info", com.ss.android.ugc.aweme.u.aa.i(aweme));
        }
        return a2;
    }

    public void e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, v, false, 41587, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, v, false, 41587, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        a(aweme);
        W();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r10 = 0
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = v
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 41565(0xa25d, float:5.8245E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = v
            r3 = 0
            r4 = 41565(0xa25d, float:5.8245E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0040:
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r7.A
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.c((int) r8)
            android.app.Activity r1 = r7.ar
            boolean r1 = a((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r1 != 0) goto L_0x0161
            r7.a((int) r8, (com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.am.f39706a
            r14 = 1
            r15 = 32631(0x7f77, float:4.5726E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0083
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.am.f39706a
            r14 = 1
            r15 = 32631(0x7f77, float:4.5726E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0083:
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.am.e(r0)
            if (r1 != 0) goto L_0x008f
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.am.f(r0)
            if (r1 == 0) goto L_0x0161
        L_0x008f:
            if (r0 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r0.getAwemeRawAd()
            if (r1 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x00cb
            boolean r1 = r1.loading
            if (r1 != r9) goto L_0x00cb
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.String) r1)
            java.lang.String r1 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.b((java.lang.String) r1)
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "error_message"
            java.lang.String r3 = "vast_wrapper_late_response"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.Object) r1)
            r0.b()
            return
        L_0x00cb:
            r1 = 0
            if (r0 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            if (r2 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x00e1
            com.bytedance.g.b.f r2 = r2.vast
            if (r2 == 0) goto L_0x00e1
            java.lang.String r2 = r2.adTitle
            goto L_0x00e2
        L_0x00e1:
            r2 = r1
        L_0x00e2:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00ef
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r2 = 0
            goto L_0x00f0
        L_0x00ef:
            r2 = 1
        L_0x00f0:
            if (r2 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.String) r1)
            java.lang.String r1 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.b((java.lang.String) r1)
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_title_missing"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.Object) r1)
            r0.b()
            return
        L_0x011a:
            if (r0 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.Video r2 = r0.getVideo()
            if (r2 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
            if (r2 == 0) goto L_0x012c
            java.util.List r1 = r2.getUrlList()
        L_0x012c:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0138
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r9 = 0
        L_0x0138:
            if (r9 == 0) goto L_0x0161
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.String) r1)
            java.lang.String r1 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.b((java.lang.String) r1)
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_mediafile_missing"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.Object) r1)
            r0.b()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel.f(int):void");
    }

    @Subscribe
    public void onEvent(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, v, false, 41631, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, v, false, 41631, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, v, false, 41632, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, v, false, 41632, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (bc()) {
            FeedPagerAdapter feedPagerAdapter = this.A;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, feedPagerAdapter, FeedPagerAdapter.g, false, 40500, new Class[]{FollowStatus.class}, Void.TYPE)) {
                FeedPagerAdapter feedPagerAdapter2 = feedPagerAdapter;
                PatchProxy.accessDispatch(new Object[]{followStatus2}, feedPagerAdapter2, FeedPagerAdapter.g, false, 40500, new Class[]{FollowStatus.class}, Void.TYPE);
            } else if (feedPagerAdapter.getCount() != 0) {
                for (Aweme next : feedPagerAdapter.h) {
                    if (!(next == null || next.getAuthor() == null || !StringUtils.equal(next.getAuthor().getUid(), followStatus2.userId))) {
                        next.getAuthor().setFollowStatus(followStatus2.followStatus);
                    }
                }
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        boolean z2;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, v, false, 41637, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, v, false, 41637, new Class[]{ar.class}, Void.TYPE);
        } else if (bc() && arVar2 != null) {
            if (arVar2.f45292b == 36) {
                e();
            } else if (arVar2.f45292b == 14 || arVar2.f45292b == 13 || arVar2.f45292b == 2) {
                String str = (String) arVar2.f45293c;
                if (arVar2.f45292b == 2 && this.H != null) {
                    this.H.a(str);
                }
                int childCount = this.mViewPager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) this.mViewPager.getChildAt(i2).getTag(C0906R.id.acv);
                    if (iFeedViewHolder != null && !b(iFeedViewHolder) && iFeedViewHolder.d() != null && StringUtils.equal(iFeedViewHolder.d().getAid(), str) && arVar2.f45292b == 13) {
                        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str);
                        if (b2 != null) {
                            if (b2.getUserDigg() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                this.Z.I();
                            }
                            if (b2.isAd()) {
                                Aweme aweme = new Aweme();
                                aweme.update(b2);
                                aweme.setAd(false);
                                com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                            }
                            bg.a(new com.ss.android.ugc.aweme.feed.f.z(z2, b2.getAid()));
                            if (iFeedViewHolder.r() != null) {
                                CommerceVideoDelegate r2 = iFeedViewHolder.r();
                                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, r2, CommerceVideoDelegate.f38685b, false, 30638, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                    CommerceVideoDelegate commerceVideoDelegate = r2;
                                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30638, new Class[]{Boolean.TYPE}, Void.TYPE);
                                } else {
                                    if (z2) {
                                        r2.diggLayout.a(r2.j);
                                    }
                                    com.ss.android.ugc.aweme.commercialize.feed.e eVar = r2.o;
                                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30572, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                        com.ss.android.ugc.aweme.commercialize.feed.e eVar2 = eVar;
                                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, eVar2, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30572, new Class[]{Boolean.TYPE}, Void.TYPE);
                                    } else if (eVar.f38830d != null) {
                                        eVar.f38830d.clickDiggContainer(eVar.f38829c, eVar.f38828b, z2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean b(@NonNull IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, v, true, 41585, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, v, true, 41585, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder.c() == 101) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i2) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, v, false, 41698, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, v, false, 41698, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.feed.guide.d.a() && !c() && !this.ae && !this.ac && !this.ah && !q()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                User currentUser = iUserService.getCurrentUser();
                if (currentUser != null && currentUser.getFollowingCount() > 0) {
                    return;
                }
            }
            if (!this.ai.a()) {
                if (!com.ss.android.g.a.a() || (!(!AbTestManager.a().bJ()) || !(!com.ss.android.ugc.aweme.feed.guide.d.e()))) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.au = true;
                        } else if (i2 == 2) {
                            this.at = true;
                        }
                        if (!this.au || !this.at || !this.O.a(false)) {
                            return;
                        }
                    }
                    if (ex.b() || !com.ss.android.ugc.aweme.feed.guide.d.e() || ex.b() || this.O.b(true)) {
                        if (!ex.b() && !com.ss.android.ugc.aweme.feed.guide.g.f45416b && this.L != null) {
                            if (r().i(false) || !com.ss.android.ugc.aweme.feed.guide.d.b()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!this.O.b(true) && z2 && !r().k(false)) {
                                bo();
                                this.mViewPager.removeCallbacks(this.f3168f);
                                this.mViewPager.post(this.f3168f);
                            }
                        }
                        return;
                    }
                    bo();
                    this.mViewPager.removeCallbacks(this.f3168f);
                    this.mViewPager.postDelayed(this.f3168f, 500);
                }
            }
        }
    }

    public final boolean n(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, v, false, 41600, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, v, false, 41600, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, v, false, 41602, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, v, false, 41602, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (AbTestManager.a().d().isOpenFlowWindow != 1 || NetworkUtils.isWifi(this.ar) || !com.ss.android.ugc.aweme.framework.d.a.b(this.ar) || com.ss.android.ugc.aweme.freeflowcard.b.a().i) {
                return true;
            } else {
                return false;
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, v, false, 41601, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, v, false, 41601, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
            String str = "";
            if (this.S != null) {
                str = this.S.l();
            }
            if (com.ss.android.ugc.aweme.freeflowcard.a.a.a().a(str)) {
                return true;
            }
            return false;
        }
    }

    static final /* synthetic */ Object a(Aweme aweme, p pVar) throws Exception {
        try {
            Aweme a2 = DetailApi.a(aweme.getAid(), "");
            if (a2 == null) {
                return null;
            }
            pVar.c(a2);
            return null;
        } catch (Exception unused) {
        }
    }

    private void a(@NonNull IFeedViewHolder iFeedViewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, Integer.valueOf(i2)}, this, v, false, 41679, new Class[]{IFeedViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, Integer.valueOf(i2)}, this, v, false, 41679, new Class[]{IFeedViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.aq) {
            iFeedViewHolder.b(i2);
        }
    }

    public BaseListFragmentPanel(String str, int i2) {
        this.f3163a = 1.0E-10f;
        this.O = new bt();
        this.P = "";
        this.f3168f = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45642a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45642a, false, 41739, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45642a, false, 41739, new Class[0], Void.TYPE);
                    return;
                }
                BaseListFragmentPanel.this.aQ();
            }
        };
        this.g = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45678a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45678a, false, 41748, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45678a, false, 41748, new Class[0], Void.TYPE);
                    return;
                }
                BaseListFragmentPanel.this.aR();
            }
        };
        this.R = false;
        this.T = new com.ss.android.ugc.aweme.feed.param.b();
        this.W = true;
        this.X = false;
        this.Z = com.ss.android.ugc.aweme.feed.guide.a.b.i;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.aj = false;
        this.ak = null;
        this.k = null;
        this.l = -1;
        this.m = false;
        this.o = false;
        this.q = true;
        this.al = false;
        this.am = 4;
        this.r = false;
        this.an = false;
        this.t = 0;
        this.ao = true;
        this.at = false;
        this.au = false;
        this.av = null;
        this.T.setEventType(str);
        this.T.setPageType(i2);
        this.S = new com.ss.android.ugc.aweme.feed.d(str, i2, this, this);
        this.i = new com.ss.android.ugc.aweme.commercialize.a(str, i2);
        this.U = new n(str, i2, this);
        this.U.l = this;
        this.U.m = this;
        this.U.n = this;
        this.V = new com.ss.android.ugc.aweme.feed.c.b();
        this.V.a((com.ss.android.ugc.aweme.feed.c.a) this.S);
        this.V.a((com.ss.android.ugc.aweme.feed.c.a) this.i);
        this.V.a((com.ss.android.ugc.aweme.feed.c.a) this.U);
        com.ss.android.ugc.aweme.video.d.a(at());
        AbTestManager.a().a((AbTestManager.a) this);
    }

    private boolean a(int i2, IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), iFeedViewHolder}, this, v, false, 41580, new Class[]{Integer.TYPE, IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), iFeedViewHolder}, this, v, false, 41580, new Class[]{Integer.TYPE, IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (iFeedViewHolder != null) {
            if (this.A.d(i2) == iFeedViewHolder.B()) {
                return true;
            }
        }
        return false;
    }

    public final void b(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, v, false, 41608, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, v, false, 41608, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.base.utils.m.a().c()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
        } else if (aweme != null && aweme.getAuthor() != null) {
            String uid = aweme.getAuthor().getUid();
            this.K.a(new i.a().a(uid).b(aweme.getAuthor().getSecUid()).a(0).c(f()).d(com.ss.android.ugc.aweme.feed.k.b.g(ag())).a(aweme).e(str).a());
        }
    }

    public final void c(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, v, false, 41618, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, v, false, 41618, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.a.b("AWEME == NULL");
        } else {
            if (this.S.c() == null) {
                com.ss.android.ugc.aweme.comment.a.a.b("ACTIVITY == NULL");
            }
            this.S.a(new a.C0457a(aweme).a(str).a(true).d(O()).a());
        }
    }

    public static boolean a(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, v, true, 41566, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, v, true, 41566, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || com.ss.android.ugc.aweme.commercialize.symphony.c.a().c(context2, aweme2) || am.g(aweme)) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(Aweme aweme, boolean z2) {
        Aweme aweme2 = aweme;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41598, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z2)}, this, v, false, 41598, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        String str = w;
        com.ss.android.ugc.playerkit.b.b.a(str, "tryPlay() called with: aweme = [" + aweme2 + "], isRenderReady = [" + z3 + "]");
        p aF = aF();
        if (aF == null || !aF.D()) {
            this.U.a(aweme2, z3);
        } else {
            aF.E();
        }
    }

    private void a(Aweme aweme, String str, boolean z2) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Aweme aweme2 = aweme;
        String str8 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str8, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, v, false, 41610, new Class[]{Aweme.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str8, Byte.valueOf(z2)}, this, v, false, 41610, new Class[]{Aweme.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", f());
            jSONObject.put("impr_type", com.ss.android.ugc.aweme.u.aa.s(aweme));
            jSONObject.put("request_id", V().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            if (!"homepage_hot".equals(f())) {
                jSONObject.put("previous_page", bi());
            }
            jSONObject.put("request_id", com.ss.android.ugc.aweme.u.aa.a(aweme, bh()));
            if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(aweme))) {
                jSONObject.put("poi_id", com.ss.android.ugc.aweme.u.aa.e(aweme));
            }
            if (com.ss.android.ugc.aweme.u.aa.c(f())) {
                jSONObject.put("poi_type", com.ss.android.ugc.aweme.u.aa.h(aweme));
                jSONObject.put("poi_channel", com.ss.android.ugc.aweme.u.aa.b());
                jSONObject.put("city_info", com.ss.android.ugc.aweme.u.aa.a());
                jSONObject.put("distance_info", com.ss.android.ugc.aweme.u.aa.i(aweme));
            }
            jSONObject.put("is_photo", com.ss.android.ugc.aweme.u.aa.n(aweme));
        } catch (JSONException unused) {
        }
        r.a((Context) this.ar, "follow", f(), str, com.ss.android.ugc.aweme.u.aa.m(aweme), jSONObject);
        if (com.ss.android.g.a.a()) {
            if (z2) {
                a(aweme, str);
            } else {
                com.ss.android.ugc.aweme.u.t a2 = new com.ss.android.ugc.aweme.u.t().a(a(true));
                if (TextUtils.isEmpty(O())) {
                    str6 = f();
                } else {
                    str6 = O();
                }
                com.ss.android.ugc.aweme.u.t c2 = a2.c(str6);
                if (TextUtils.isEmpty(O())) {
                    str7 = "follow_button";
                } else {
                    str7 = bf();
                }
                c2.e(str7).b("follow_button").f(str8).b(aweme, bh()).e();
            }
        } else if (z2) {
            s b2 = new s().b(f());
            if (TextUtils.isEmpty(O())) {
                str4 = f();
            } else {
                str4 = O();
            }
            s f2 = b2.f(str4);
            if (TextUtils.isEmpty(O())) {
                str5 = "follow_button";
            } else {
                str5 = bf();
            }
            f2.g(str5).c("follow_button").b(aweme, bh()).e();
        } else {
            com.ss.android.ugc.aweme.u.t a3 = new com.ss.android.ugc.aweme.u.t().a(f());
            if (TextUtils.isEmpty(O())) {
                str2 = f();
            } else {
                str2 = O();
            }
            com.ss.android.ugc.aweme.u.t c3 = a3.c(str2);
            if (TextUtils.isEmpty(O())) {
                str3 = "follow_button";
            } else {
                str3 = bf();
            }
            c3.e(str3).b("follow_button").b(aweme, bh()).e();
        }
        if (z2 && TextUtils.equals(f(), "search_result")) {
            com.ss.android.ugc.aweme.discover.mob.j.f42669b.a("search_follow", str8, "search_video", true);
        }
    }
}
