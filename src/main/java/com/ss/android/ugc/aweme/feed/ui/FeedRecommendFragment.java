package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.ap;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.ad;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.r;
import com.ss.android.ugc.aweme.feed.adapter.s;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.f.q;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.feed.listener.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.ae;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.guide.c;
import com.ss.android.ugc.aweme.main.guide.h;
import com.ss.android.ugc.aweme.main.guide.i;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedRecommendFragment extends BaseFeedListFragment<m> implements r, s, d {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f3200e = null;
    private static final String j = "FeedRecommendFragment";
    @BindView(2131493939)
    ConstraintLayout dialogContainer;

    /* renamed from: f  reason: collision with root package name */
    View f3201f;
    public FullFeedFragmentPanel g = new FullFeedFragmentPanel("homepage_hot", 0);
    public ad h;
    ae i = null;

    public boolean isRegisterEventBus() {
        return true;
    }

    public final /* synthetic */ b c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3200e, false, 42644, new Class[0], m.class)) {
            return new m(this);
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42644, new Class[0], m.class);
    }

    @Nullable
    public final IFeedViewHolder j() {
        if (!PatchProxy.isSupport(new Object[0], this, f3200e, false, 42655, new Class[0], IFeedViewHolder.class)) {
            return this.g.af();
        }
        return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42655, new Class[0], IFeedViewHolder.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42639, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42648, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.g.n();
        if (this.f3195c != null) {
            ((m) this.f3195c).k();
        }
    }

    public final boolean p() {
        if (!PatchProxy.isSupport(new Object[0], this, f3200e, false, 42656, new Class[0], Boolean.TYPE)) {
            return this.g.aM();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42656, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NonNull
    public SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42632, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42632, new Class[0], SparseArray.class);
        }
        SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34653c, this.g);
        return registerComponents;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42645, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42645, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ((m) this.f3195c).g = true;
        return ((m) this.f3195c).a(4, Integer.valueOf(this.o), 2);
    }

    public final void w_() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42651, new Class[0], Void.TYPE);
            return;
        }
        if (!AwemeAppData.p().ap) {
            i2 = 2;
        } else if (AwemeAppData.p().aq) {
            i2 = 5;
        } else {
            i2 = 7;
        }
        ((m) this.f3195c).a(4, 0, Integer.valueOf(i2));
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42642, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42642, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((m) this.f3195c).i() == null || ((g) ((m) this.f3195c).i()).getData() == null || !((FeedItemList) ((g) ((m) this.f3195c).i()).getData()).isRefreshClear()) {
            return false;
        } else {
            return true;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42638, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).hideAutoPlayTab();
        }
        h a2 = h.a();
        if (PatchProxy.isSupport(new Object[0], a2, h.f54831a, false, 58113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, h.f54831a, false, 58113, new Class[0], Void.TYPE);
            return;
        }
        a2.f54832b.clear();
        c a3 = i.a();
        if (a3 != null) {
            a3.a(a2.f54834d + "," + a2.f54835e);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42637, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ap a2 = ap.a(getActivity());
        if (PatchProxy.isSupport(new Object[0], a2, ap.f2634a, false, 22961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, ap.f2634a, false, 22961, new Class[0], Void.TYPE);
        } else if (a2.f2637b && a2.f2639d == 1) {
            n.a("aweme_app_performance", "feed_recommend_fragment_on_resumed", (float) a2.f2638c.a(TimeUnit.MILLISECONDS));
            a2.f2639d = 2;
        }
        h a3 = h.a();
        if (PatchProxy.isSupport(new Object[0], a3, h.f54831a, false, 58112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a3, h.f54831a, false, 58112, new Class[0], Void.TYPE);
            return;
        }
        c a4 = i.a();
        if (a4 != null) {
            a3.f54833c = a4.a();
            if (!TextUtils.isEmpty(a3.f54833c)) {
                String[] split = a3.f54833c.split(",");
                if (split.length == 2) {
                    a3.f54834d = Integer.valueOf(split[0].trim()).intValue();
                    a3.f54835e = Integer.valueOf(split[1].trim()).intValue();
                }
            }
        }
        int a5 = av.a(System.currentTimeMillis());
        if (a3.f54834d != a5) {
            a3.f54834d = a5;
            a3.f54835e = 0;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3200e, false, 42654, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3200e, false, 42654, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putBoolean("saveInstance_auto_refresh", true);
    }

    public final DmtStatusView a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f3200e, false, 42640, new Class[]{Context.class}, DmtStatusView.class)) {
            return ((com.ss.android.ugc.aweme.legoImp.inflate.b) a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.b.class)).a(context2, new o(this));
        }
        return (DmtStatusView) PatchProxy.accessDispatch(new Object[]{context2}, this, f3200e, false, 42640, new Class[]{Context.class}, DmtStatusView.class);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3200e, false, 42659, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3200e, false, 42659, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().bV()) {
            com.ss.android.ugc.aweme.common.r.a("homepage_hot_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", "refresh").a("refresh_mode", str2).a("last_play_cnt", this.h.f44640b).f34114b);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3200e, false, 42647, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3200e, false, 42647, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        bg.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.a.a(2, this.g.ag()));
        this.g.p(z);
    }

    @Subscribe
    public void onFeedFetchEvent(q qVar) {
        q qVar2 = qVar;
        if (PatchProxy.isSupport(new Object[]{qVar2}, this, f3200e, false, 42653, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar2}, this, f3200e, false, 42653, new Class[]{q.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(qVar2.f45314a, "from_full_recommend")) {
            d();
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3200e, false, 42635, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3200e, false, 42635, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.g.f(z2);
        if (!z2 && isResumed()) {
            ag.i().h();
        }
        if (z2) {
            bg.a(new com.ss.android.ugc.aweme.feed.f.m(true));
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3200e, false, 42646, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3200e, false, 42646, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getUserVisibleHint() && isViewValid()) {
            super.a(z);
            bg.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.a.a(1, this.g.ag()));
            if (MainPageExperimentHelper.b() || !z) {
                this.g.aV();
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42650, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42650, new Class[0], Void.TYPE);
                } else {
                    MainActivity mainActivity = (MainActivity) getActivity();
                    if (mainActivity != null && !mainActivity.tryShowGuideView()) {
                        this.g.v();
                    }
                }
            }
            e(false);
            g(true);
            IFeedViewHolder j2 = j();
            if (j2 != null) {
                CommerceVideoDelegate r = j2.r();
                if (r != null) {
                    r.a(false);
                    r.a(getChildFragmentManager(), false, j2);
                }
            }
        }
    }

    public final boolean d(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3200e, false, 42649, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3200e, false, 42649, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f3195c == null) {
            return false;
        } else {
            boolean z2 = ((m) this.f3195c).g;
            if (!super.d(z) && !z2) {
                return false;
            }
            ((m) this.f3195c).a(z);
            if (z2) {
                this.f3196d.setRefreshing(false);
                bg.a(new ae());
                return true;
            } else if (b()) {
                if (z) {
                    b("click");
                }
                m mVar = (m) this.f3195c;
                Object[] objArr = new Object[4];
                objArr[0] = 1;
                objArr[1] = 0;
                if (AwemeAppData.p().ap) {
                    i2 = 6;
                } else {
                    i2 = 1;
                }
                objArr[2] = Integer.valueOf(i2);
                objArr[3] = Boolean.valueOf(this.h.a());
                return mVar.a(1, objArr);
            } else {
                return ((m) this.f3195c).a(2, 0, 3);
            }
        }
    }

    @Subscribe(b = true)
    public void onSettingSyncDone(com.ss.android.ugc.aweme.setting.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3200e, false, 42634, new Class[]{com.ss.android.ugc.aweme.setting.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3200e, false, 42634, new Class[]{com.ss.android.ugc.aweme.setting.a.d.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3200e, false, 42633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3200e, false, 42633, new Class[0], Void.TYPE);
            return;
        }
        try {
            UgAwemeActivitySetting bs = com.ss.android.ugc.aweme.global.config.settings.g.b().bs();
            if (bs != null) {
                this.i = new ae(this.mLayout, this.g, bs);
                ae aeVar = this.i;
                FragmentActivity activity = getActivity();
                if (PatchProxy.isSupport(new Object[]{activity}, aeVar, ae.f46404a, false, 42756, new Class[]{Context.class}, Void.TYPE)) {
                    ae aeVar2 = aeVar;
                    PatchProxy.accessDispatch(new Object[]{activity}, aeVar2, ae.f46404a, false, 42756, new Class[]{Context.class}, Void.TYPE);
                } else if (activity != null) {
                    a.i.a((Callable<TResult>) new ae.a<TResult>(aeVar, activity)).a((a.g<TResult, TContinuationResult>) new ae.b<TResult,TContinuationResult>(aeVar, activity), a.i.f1052b);
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
    }

    public final boolean a(Aweme aweme, int i2) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i2)}, this, f3200e, false, 42658, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((m) this.f3195c).a((Object) aweme2, i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i2)}, this, f3200e, false, 42658, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f3200e, false, 42641, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f3200e, false, 42641, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.g.a(view2, bundle2);
        this.g.a((r) this);
        this.g.a((com.ss.android.ugc.aweme.feed.listener.a) this);
        this.g.H = this;
        this.g.I = this;
        this.mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46180a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f46180a, false, 42661, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46180a, false, 42661, new Class[0], Void.TYPE);
                } else if (!NetworkUtils.isNetworkAvailable(FeedRecommendFragment.this.getActivity())) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) FeedRecommendFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                    FeedRecommendFragment.this.f3196d.setRefreshing(false);
                } else {
                    int i = 1;
                    if (FeedRecommendFragment.this.b()) {
                        FeedRecommendFragment.this.b("slide_down");
                        m mVar = (m) FeedRecommendFragment.this.f3195c;
                        Object[] objArr = new Object[4];
                        objArr[0] = 1;
                        objArr[1] = 0;
                        if (AwemeAppData.p().ap) {
                            i = 6;
                        }
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = Boolean.valueOf(FeedRecommendFragment.this.h.a());
                        mVar.a(2, objArr);
                        return;
                    }
                    ((m) FeedRecommendFragment.this.f3195c).a(2, 0, 3);
                }
            }
        });
        FullFeedFragmentPanel fullFeedFragmentPanel = this.g;
        AnonymousClass2 r1 = new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46182a;

            /* renamed from: b  reason: collision with root package name */
            int f46183b = -1;

            /* renamed from: c  reason: collision with root package name */
            int f46184c;

            /* renamed from: d  reason: collision with root package name */
            int f46185d;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
                Animator animator;
                ValueAnimator valueAnimator;
                ValueAnimator valueAnimator2;
                Animator animator2;
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46182a, false, 42663, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46182a, false, 42663, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i2 == 5) {
                    org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.feed.f.r(i2));
                }
                if (FeedRecommendFragment.this.i != null) {
                    ae aeVar = FeedRecommendFragment.this.i;
                    int i3 = this.f46185d;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, aeVar, ae.f46404a, false, 42760, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, aeVar, ae.f46404a, false, 42760, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (!aeVar.a()) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, aeVar, ae.f46404a, false, 42759, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, aeVar, ae.f46404a, false, 42759, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            af afVar = aeVar.f46406c;
                            if (afVar != null && !afVar.getClosed()) {
                                afVar.a();
                            }
                            if (i2 > i3 && aeVar.f46406c != null) {
                                af afVar2 = aeVar.f46406c;
                                if (afVar2 != null && afVar2.getVisibility() == 0) {
                                    aeVar.f46409f++;
                                }
                            }
                            if (aeVar.f46409f >= aeVar.g && aeVar.f46406c != null) {
                                af afVar3 = aeVar.f46406c;
                                if (afVar3 != null) {
                                    if (PatchProxy.isSupport(new Object[0], afVar3, af.f46416a, false, 42773, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], afVar3, af.f46416a, false, 42773, new Class[0], Void.TYPE);
                                    } else if (afVar3.l && !afVar3.k) {
                                        afVar3.k = true;
                                        afVar3.n = new AnimatorSet();
                                        AnimatorSet animatorSet = afVar3.n;
                                        if (animatorSet != null) {
                                            Animator[] animatorArr = new Animator[4];
                                            if (PatchProxy.isSupport(new Object[0], afVar3, af.f46416a, false, 42767, new Class[0], Animator.class)) {
                                                animator = (Animator) PatchProxy.accessDispatch(new Object[0], afVar3, af.f46416a, false, 42767, new Class[0], Animator.class);
                                            } else {
                                                FrameLayout frameLayout = afVar3.f46417b;
                                                Intrinsics.checkExpressionValueIsNotNull(frameLayout, PushConstants.CONTENT);
                                                float translationX = frameLayout.getTranslationX();
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                                ofFloat.addUpdateListener(new af.k(afVar3, translationX));
                                                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
                                                ofFloat.setDuration(150);
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(afVar3.f46420e, "alpha", new float[]{1.0f, 0.0f});
                                                Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "closeBtnAnimator");
                                                ofFloat2.setDuration(150);
                                                animatorSet2.playTogether(new Animator[]{ofFloat2, ofFloat});
                                                animator = animatorSet2;
                                            }
                                            animatorArr[0] = animator;
                                            if (PatchProxy.isSupport(new Object[0], afVar3, af.f46416a, false, 42768, new Class[0], ValueAnimator.class)) {
                                                valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], afVar3, af.f46416a, false, 42768, new Class[0], ValueAnimator.class);
                                            } else {
                                                Ref.FloatRef floatRef = new Ref.FloatRef();
                                                FrameLayout frameLayout2 = afVar3.f46417b;
                                                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, PushConstants.CONTENT);
                                                floatRef.element = frameLayout2.getTranslationX();
                                                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                                floatRef2.element = floatRef.element + afVar3.g;
                                                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                                ofFloat3.addUpdateListener(new af.i(afVar3, floatRef, floatRef2));
                                                ofFloat3.addListener(new af.j(afVar3, floatRef, floatRef2));
                                                Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "valueAnimator");
                                                ofFloat3.setDuration(300);
                                                valueAnimator = ofFloat3;
                                            }
                                            animatorArr[1] = valueAnimator;
                                            if (PatchProxy.isSupport(new Object[0], afVar3, af.f46416a, false, 42769, new Class[0], ValueAnimator.class)) {
                                                valueAnimator2 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], afVar3, af.f46416a, false, 42769, new Class[0], ValueAnimator.class);
                                            } else {
                                                valueAnimator2 = ValueAnimator.ofInt(new int[]{1});
                                                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "valueAnimator");
                                                valueAnimator2.setDuration(3);
                                                valueAnimator2.addListener(new af.b(afVar3));
                                            }
                                            animatorArr[2] = valueAnimator2;
                                            if (PatchProxy.isSupport(new Object[0], afVar3, af.f46416a, false, 42770, new Class[0], Animator.class)) {
                                                animator2 = (Animator) PatchProxy.accessDispatch(new Object[0], afVar3, af.f46416a, false, 42770, new Class[0], Animator.class);
                                            } else {
                                                AnimatorSet animatorSet3 = new AnimatorSet();
                                                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                                                floatRef3.element = -afVar3.h;
                                                Ref.FloatRef floatRef4 = new Ref.FloatRef();
                                                floatRef4.element = 0.0f;
                                                ofFloat4.addListener(new af.h(afVar3, floatRef3, floatRef4));
                                                ofFloat4.addUpdateListener(new af.g(afVar3, floatRef3, floatRef4));
                                                Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "valueAnimator");
                                                ofFloat4.setDuration(200);
                                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(afVar3.f46420e, "alpha", new float[]{0.0f, 1.0f});
                                                Intrinsics.checkExpressionValueIsNotNull(ofFloat5, "closeBtnAnimator");
                                                ofFloat5.setDuration(150);
                                                animatorSet3.playSequentially(new Animator[]{ofFloat4, ofFloat5});
                                                animator2 = animatorSet3;
                                            }
                                            animatorArr[3] = animator2;
                                            animatorSet.playSequentially(animatorArr);
                                            animatorSet.start();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[0], aeVar, ae.f46404a, false, 42758, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aeVar, ae.f46404a, false, 42758, new Class[0], Void.TYPE);
                        } else if (aeVar.f46406c != null) {
                            af afVar4 = aeVar.f46406c;
                            if (afVar4 != null) {
                                afVar4.b();
                            }
                        }
                    }
                }
                this.f46183b = i2;
                this.f46184c = i2;
                this.f46185d = i2;
                AwemeAppData.p().ai = false;
                IFeedViewHolder j = FeedRecommendFragment.this.j();
                if (com.ss.android.ugc.aweme.feed.k.b.f(j) && j.d() != null) {
                    h a2 = h.a();
                    String aid = j.d().getAid();
                    if (PatchProxy.isSupport(new Object[]{aid}, a2, h.f54831a, false, 58109, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aid}, a2, h.f54831a, false, 58109, new Class[]{String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(aid) && !a2.f54832b.contains(aid)) {
                        a2.f54832b.add(aid);
                        a2.f54835e++;
                        a2.f54836f.postValue(new Pair(Integer.valueOf(a2.f54832b.size()), Integer.valueOf(a2.f54835e)));
                    }
                    a.C0419a.f33262a = j.d().getAid();
                    a.C0419a.f33263b = j.d().getAuthorUid();
                }
            }

            public void onPageScrolled(int i, float f2, int i2) {
                boolean z;
                int i3 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f46182a, false, 42662, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f46182a, false, 42662, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i3 == this.f46183b && f2 < 1.0E-10f) {
                    this.f46183b = -1;
                }
                if (!(FeedRecommendFragment.this.getParentFragment() instanceof MainFragment) || !((MainFragment) FeedRecommendFragment.this.getParentFragment()).l) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && FeedRecommendFragment.this.h != null && f2 > 0.0f) {
                    ad adVar = FeedRecommendFragment.this.h;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, adVar, ad.f44639a, false, 40143, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        ad adVar2 = adVar;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, adVar2, ad.f44639a, false, 40143, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    AbTestManager a2 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                    if (a2.bV()) {
                        int i4 = i3 + 1;
                        if (i4 > adVar.f44640b) {
                            adVar.f44640b = i4;
                        }
                    }
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{r1}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41528, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{r1}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41528, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
        } else if (fullFeedFragmentPanel.mViewPager != null) {
            fullFeedFragmentPanel.mViewPager.a((ViewPager.OnPageChangeListener) r1);
        }
        this.f3201f = getActivity().findViewById(C0906R.id.mt);
        ((m) this.f3195c).a(this.g);
        ((m) this.f3195c).f45510b = this.g;
        ((m) this.f3195c).a(new g(6));
        ((m) this.f3195c).a((com.ss.android.ugc.aweme.common.f.d) this.g);
        this.h = new ad((m) this.f3195c);
        String str3 = null;
        if (getActivity() instanceof MainActivity) {
            str3 = ((MainActivity) getActivity()).getPushAwemeId();
            str2 = ((MainActivity) getActivity()).getPushAwemeIds();
            str = ((MainActivity) getActivity()).getPushParams();
        } else {
            str2 = null;
            str = null;
        }
        if (bundle2 != null && bundle2.getBoolean("saveInstance_auto_refresh", false)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("saveInstance_auto_refresh", true);
            } catch (JSONException unused) {
            }
            n.a("feed_auto_refresh", jSONObject);
        }
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).onFeedRecommendFragmentReady();
        }
        ((m) this.f3195c).a(3, 1, 0, 0, str3, str2, str);
        e(false);
        g(true);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f3200e, false, 42636, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f3200e, false, 42636, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
