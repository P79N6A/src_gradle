package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.b.g;
import com.ss.android.ugc.aweme.commercialize.b.h;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bl;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.u;
import com.ss.android.ugc.aweme.profile.ui.EffectListFragment;
import com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout;
import com.ss.android.ugc.aweme.profile.ui.header.a;
import com.ss.android.ugc.aweme.profile.ui.header.as;
import com.ss.android.ugc.aweme.profile.ui.header.au;
import com.ss.android.ugc.aweme.profile.ui.header.av;
import com.ss.android.ugc.aweme.profile.ui.widget.e;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.ui.af;
import com.ss.android.ugc.aweme.survey.d;
import com.ss.android.ugc.aweme.survey.f;
import com.ss.android.ugc.aweme.survey.i;
import com.ss.android.ugc.aweme.u.ap;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.views.ProfileTabFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MyProfileFragment extends AbsProfileFragment implements Observer<com.ss.android.ugc.aweme.ap.a<NewUserCount>>, WeakHandler.IHandler, aa, com.ss.android.ugc.aweme.profile.ui.a.a, as {
    public static ChangeQuickRedirect M;
    public static final boolean N = com.ss.android.ugc.aweme.g.a.a();
    public static String O;
    public NoticeView P;
    protected at Q;
    protected long R = -1;
    protected String S;
    protected ProfileListFragment T;
    protected ProfileCollectionFragmentForJedi U;
    public boolean V = true;
    public Handler W = new Handler(Looper.getMainLooper());
    public i X;
    public View Y;
    ProfileQuickShopContainer Z;
    private b aA;
    private c aB;
    DmtTextView aa;
    View ab;
    public boolean ac;
    boolean ad;
    private u ae;
    private com.ss.android.ugc.aweme.profile.presenter.a af;
    private boolean ag;
    private com.ss.android.ugc.aweme.profile.ui.widget.c ah;
    private e ai;
    private c aj;
    private c ak;
    private com.ss.android.ugc.aweme.main.e al;
    private String am;
    private boolean an;
    private AwemeListFragment ao;
    private AnalysisStayTimeFragmentComponent ap;
    private MyProfileViewModel aq;
    private boolean ar;
    private boolean as = true;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    @BindView(2131496130)
    public NoticeView enterBindView;
    @BindView(2131494988)
    ImageView ivBindPhone;
    @BindView(2131495791)
    RelativeLayout mMoreView;
    @BindView(2131494500)
    public NoticeView mTempEnablePrivateAccountGuide;
    @BindView(2131498654)
    public View mYellowPoint;

    static class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62070a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<MyProfileFragment> f62071b;

        private a(MyProfileFragment myProfileFragment) {
            this.f62071b = new WeakReference<>(myProfileFragment);
        }

        public final void a(com.ss.android.ugc.aweme.survey.e eVar) {
            boolean z;
            com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f62070a, false, 68583, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f62070a, false, 68583, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f62070a, false, 68582, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62070a, false, 68582, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f62071b == null || this.f62071b.get() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                MyProfileFragment myProfileFragment = (MyProfileFragment) this.f62071b.get();
                if (myProfileFragment.X == null && myProfileFragment.Y != null) {
                    ViewStub viewStub = (ViewStub) myProfileFragment.Y.findViewById(C0906R.id.bpb);
                    if (PatchProxy.isSupport(new Object[]{viewStub}, myProfileFragment, MyProfileFragment.M, false, 68558, new Class[]{ViewStub.class}, Void.TYPE)) {
                        MyProfileFragment myProfileFragment2 = myProfileFragment;
                        PatchProxy.accessDispatch(new Object[]{viewStub}, myProfileFragment2, MyProfileFragment.M, false, 68558, new Class[]{ViewStub.class}, Void.TYPE);
                    } else {
                        myProfileFragment.X = new com.ss.android.ugc.aweme.survey.a(viewStub);
                        myProfileFragment.X.h = new d() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f62068a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f62068a, false, 68581, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f62068a, false, 68581, new Class[0], Void.TYPE);
                                    return;
                                }
                                MyProfileFragment.this.X.d();
                            }

                            public final void a(com.ss.android.ugc.aweme.survey.e eVar) {
                                com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
                                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f62068a, false, 68579, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f62068a, false, 68579, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE);
                                    return;
                                }
                                r.a("pop_survey_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("pop_survey_id", String.valueOf(eVar2.f74503b)).a("pop_survey_question", eVar2.i).a("original_id", eVar2.j).f34114b);
                            }

                            public final void a(com.ss.android.ugc.aweme.survey.e eVar, int i, String str) {
                                com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
                                int i2 = i;
                                String str2 = str;
                                if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i), str2}, this, f62068a, false, 68580, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i), str2}, this, f62068a, false, 68580, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                switch (i2) {
                                    case 1:
                                        MyProfileFragment.this.X.e();
                                        break;
                                    case 2:
                                        MyProfileFragment.this.X.e();
                                        break;
                                    case 3:
                                        MyProfileFragment.this.X.d();
                                        break;
                                }
                                f.a().a(new com.ss.android.ugc.aweme.survey.c(i2, eVar2.f74503b, eVar2.j));
                                MyProfileFragment myProfileFragment = MyProfileFragment.this;
                                if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i), str2}, myProfileFragment, MyProfileFragment.M, false, 68559, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE)) {
                                    MyProfileFragment myProfileFragment2 = myProfileFragment;
                                    PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i), str2}, myProfileFragment2, MyProfileFragment.M, false, 68559, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                y.a(new bp(i2, eVar2, str2), "MyProfileFragment");
                            }
                        };
                    }
                }
                if (!(myProfileFragment.X == null || eVar2 == null)) {
                    myProfileFragment.X.i = eVar2;
                    myProfileFragment.W.postDelayed(new bq(myProfileFragment), 1000);
                }
            }
        }

        /* synthetic */ a(MyProfileFragment myProfileFragment, byte b2) {
            this(myProfileFragment);
        }
    }

    public final void A() {
    }

    public final void a(float f2) {
    }

    public final void a(int i, String str) {
    }

    public final void a(UrlModel urlModel) {
    }

    public final void a(Object obj) {
    }

    public final void a(boolean z, boolean z2, boolean z3) {
    }

    public final void b(@Nullable User user) {
    }

    public final void b(boolean z, boolean z2, boolean z3) {
    }

    public final void d(User user) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void l(int i) {
    }

    public void onClick(View view) {
    }

    public final int x() {
        return C0906R.layout.ox;
    }

    public final void y() {
    }

    public final void z() {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68494, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68494, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.ay) {
            this.Z.c(z);
        }
    }

    public final void a(List<String> list, int i, int i2) {
        com.ss.android.ugc.aweme.d.a.c a2;
        boolean z;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68546, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68546, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && !TimeLockRuler.isTeenModeON() && !this.an && !P()) {
            this.an = true;
            this.enterBindView.setVisibility(8);
            if ("from_main".equals(this.F)) {
                com.ss.android.ugc.aweme.d.a.a a3 = com.ss.android.ugc.aweme.d.a.a.a();
                if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, a3, com.ss.android.ugc.aweme.d.a.a.f41045a, false, 25653, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.d.a.c.class)) {
                    a2 = (com.ss.android.ugc.aweme.d.a.c) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, a3, com.ss.android.ugc.aweme.d.a.a.f41045a, false, 25653, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.d.a.c.class);
                } else if (a3.f()) {
                    a2 = new com.ss.android.ugc.aweme.d.a.c(false);
                } else if (a3.d()) {
                    a2 = new com.ss.android.ugc.aweme.d.a.c(false);
                } else if (a3.e()) {
                    a2 = new com.ss.android.ugc.aweme.d.a.c(false);
                } else {
                    a2 = a3.a(list2, i, i2);
                }
                com.ss.android.ugc.aweme.d.a.c cVar = a2;
                if (!com.ss.android.ugc.aweme.d.a.a.a().a(true) || Q() || P()) {
                    if (!com.ss.android.g.a.a()) {
                        if (PatchProxy.isSupport(new Object[0], this, M, false, 68531, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68531, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            z = this.aA != null && this.aA.isShowing();
                        }
                        if (!z && !Q() && cVar.f41063a && !P()) {
                            this.ai = new e(this.completeProfileGuide, getContext(), cVar, new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f62066a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f62066a, false, 68578, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f62066a, false, 68578, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    if (MyProfileFragment.this.E instanceof AbsMyCommonHeaderLayout) {
                                        ((AbsMyCommonHeaderLayout) MyProfileFragment.this.E).y();
                                    }
                                }
                            });
                            r.a("profile_alert_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                        }
                    }
                    if (!com.ss.android.ugc.aweme.d.a.a.a().f41048c && (this.E instanceof AbsMyCommonHeaderLayout)) {
                        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
                        NoticeView noticeView = this.enterBindView;
                        if (PatchProxy.isSupport(new Object[]{noticeView}, absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69460, new Class[]{NoticeView.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{noticeView}, absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69460, new Class[]{NoticeView.class}, Void.TYPE);
                        } else {
                            absMyCommonHeaderLayout.av = new com.ss.android.ugc.aweme.profile.ui.widget.b(noticeView);
                            if (absMyCommonHeaderLayout.av.c() && absMyCommonHeaderLayout.av.f63118d) {
                                com.ss.android.ugc.aweme.profile.ui.widget.b bVar = absMyCommonHeaderLayout.av;
                                if (PatchProxy.isSupport(new Object[]{"personal_homepage"}, bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69693, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{"personal_homepage"}, bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69693, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    if (PatchProxy.isSupport(new Object[]{"personal_homepage", (byte) 0}, bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69694, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{"personal_homepage", (byte) 0}, bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69694, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                                    } else {
                                        bVar.a("personal_homepage", false, 0);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.ah = new com.ss.android.ugc.aweme.profile.ui.widget.c(this.bindPhoneGuide, getContext());
                    I();
                }
            }
            if (com.ss.android.ugc.aweme.i18n.c.a()) {
                this.enterBindView.setVisibility(8);
            }
        }
    }

    private void M() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68539, new Class[0], Void.TYPE);
            return;
        }
        SharePrefCache.inst().getShowMiniAppFreshGuideBubble().a(Boolean.FALSE);
    }

    private boolean P() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68548, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68548, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.P != null && this.P.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    private void R() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68552, new Class[0], Void.TYPE);
            return;
        }
        this.R = System.currentTimeMillis();
    }

    public final int B() {
        if (!PatchProxy.isSupport(new Object[0], this, M, false, 68504, new Class[0], Integer.TYPE)) {
            return (int) getResources().getDimension(C0906R.dimen.lv);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, M, false, 68504, new Class[0], Integer.TYPE)).intValue();
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68509, new Class[0], Void.TYPE);
            return;
        }
        if (this.ak != null && this.ak.isShowing()) {
            this.ak.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68511, new Class[0], Void.TYPE);
            return;
        }
        if (this.aB != null && this.aB.isShowing()) {
            this.aB.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68541, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.link.a.f();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, M, false, 68547, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("personal_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, M, false, 68547, new Class[0], Analysis.class);
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68544, new Class[0], Void.TYPE);
            return;
        }
        if (this.P != null) {
            this.P.setVisibility(8);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68561, new Class[0], Void.TYPE);
            return;
        }
        if (this.E != null) {
            this.E.u();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68485, new Class[0], Void.TYPE);
            return;
        }
        if (J()) {
            this.f3781d.setVisibility(8);
            if (this.f3782e != null) {
                this.f3782e.cancelAnimation();
            }
        }
    }

    public final boolean q_() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68493, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68493, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (super.q_()) {
            return true;
        } else {
            if (this.ay) {
                this.Z.a();
            }
            return false;
        }
    }

    public final boolean w() {
        if (!PatchProxy.isSupport(new Object[0], this, M, false, 68527, new Class[0], Boolean.TYPE)) {
            return super.w();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68527, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void I() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68480, new Class[0], Void.TYPE);
            return;
        }
        if (this.ah != null) {
            com.ss.android.ugc.aweme.profile.ui.widget.c cVar = this.ah;
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.profile.ui.widget.c.f63131a, false, 69773, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.profile.ui.widget.c.f63131a, false, 69773, new Class[0], Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.profile.ui.widget.c.f63132b) {
                com.ss.android.ugc.aweme.d.a.a.a().b(true);
                com.ss.android.ugc.aweme.profile.ui.widget.c.f63132b = true;
            }
            com.ss.android.ugc.aweme.d.c.a("personal_home");
        }
    }

    private boolean J() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68484, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68484, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3781d == null || (((Integer) x.a().w().c()).intValue() <= 3 && ((this.J == null || this.J.getCoverUrls() == null || this.J.getCoverUrls().size() <= 1) && !this.s))) {
            return false;
        } else {
            return true;
        }
    }

    private void K() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68488, new Class[0], Void.TYPE);
            return;
        }
        if (this.X != null && this.X.k) {
            this.X.d();
            f.a().a(new com.ss.android.ugc.aweme.survey.c(3, this.X.f(), this.X.g()));
        }
    }

    private boolean L() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68538, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68538, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Boolean) SharePrefCache.inst().getShowMiniAppFreshGuideBubble().c()).booleanValue() && !TimeLockRuler.isTeenModeON()) {
            z = true;
        }
        return z;
    }

    private boolean N() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68540, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68540, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.ugc.aweme.commercialize.link.a.c() && com.ss.android.ugc.aweme.commercialize.link.a.a() && !L() && !TimeLockRuler.isTeenModeON()) {
            z = true;
        }
        return z;
    }

    private boolean Q() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68549, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68549, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((this.f3780c != null && this.f3780c.getVisibility() == 0) || this.J.getAwemeCount() == 0) {
            z = true;
        }
        return z;
    }

    private void S() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68553, new Class[0], Void.TYPE);
            return;
        }
        if (this.R > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.R;
            if (currentTimeMillis > 0) {
                ap apVar = (ap) new ap().b("personal_homepage").a(String.valueOf(currentTimeMillis)).j(p(this.G));
                if ("trends".equals(p(this.G))) {
                    apVar.c("list");
                }
                apVar.e();
            }
            this.R = -1;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68557, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68560, new Class[0], Void.TYPE);
            return;
        }
        if (!this.ax) {
            this.ax = true;
            f.a().f74511c = new a(this, (byte) 0);
            f.a().b();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68468, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68468, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (!this.av) {
            this.al = com.ss.android.ugc.aweme.main.base.d.a(getActivity());
            this.al.a((ViewPager.OnPageChangeListener) new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62053a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62053a, false, 68572, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62053a, false, 68572, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    MyProfileFragment.this.D();
                }

                public void onPageScrolled(int i, float f2, int i2) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f62053a, false, 68571, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f62053a, false, 68571, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    MyProfileFragment myProfileFragment = MyProfileFragment.this;
                    if (PatchProxy.isSupport(new Object[0], myProfileFragment, MyProfileFragment.M, false, 68512, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], myProfileFragment, MyProfileFragment.M, false, 68512, new Class[0], Void.TYPE);
                        return;
                    }
                    myProfileFragment.E();
                    if (myProfileFragment.mYellowPoint != null) {
                        myProfileFragment.mYellowPoint.setVisibility(8);
                    }
                    com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(myProfileFragment.getContext());
                    User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                    if (!(a2 == null || curUser == null || TextUtils.isEmpty(curUser.getUid()))) {
                        com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(a2, curUser.getUid(), false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68543, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && ((Integer) x.a().y().c()).intValue() != 0) {
            if (this.P == null) {
                O();
            }
            if (this.P != null && !com.ss.android.ugc.aweme.account.d.a().getCurUser().isSecret() && ((Boolean) x.a().c().c()).booleanValue()) {
                this.P.setVisibility(0);
            }
        }
    }

    public String getUserId() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68529, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, M, false, 68529, new Class[0], String.class);
        } else if (TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.b(this.J))) {
            return com.ss.android.ugc.aweme.account.d.a().getCurUserId();
        } else {
            return com.ss.android.ugc.aweme.u.aa.b(this.J);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68502, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onDestroyView();
            if (this.ae != null) {
                this.ae.k();
            }
            if (this.aA != null) {
                this.aA.b();
            }
            if (this.aj != null) {
                this.aj.d();
            }
            if (this.ak != null) {
                this.ak.d();
            }
            if (this.aB != null) {
                this.aB.d();
            }
            if (this.W != null) {
                this.W.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
        if (this.E != null) {
            this.E.f();
        }
        f.a().c();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68487, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.ap != null) {
            this.ap.onPause();
        }
        if (this.f3782e != null) {
            this.f3782e.pauseAnimation();
        }
        S();
        if (this.aq != null) {
            this.aq.f63182d.setValue(Boolean.FALSE);
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68489, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.E != null) {
            this.E.g();
        }
        com.ss.android.ugc.aweme.account.d.a().updateLeaveTime(System.currentTimeMillis());
        if (this.V && !p.a().b()) {
            K();
        }
        this.V = true;
    }

    private void O() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68545, new Class[0], Void.TYPE);
        } else if ((com.ss.android.g.a.a() || ((Integer) x.a().y().c()).intValue() != 0) && ((Boolean) x.a().c().c()).booleanValue() && !((Boolean) x.a().b().c()).booleanValue() && !TimeLockRuler.isTeenModeON() && !com.ss.android.ugc.aweme.account.d.a().getCurUser().isSecret() && (!(this.v.get(this.G) instanceof AwemeListFragment) || !((AwemeListFragment) this.v.get(this.G)).B())) {
            this.P = this.mTempEnablePrivateAccountGuide;
            x.a().b().a(Boolean.TRUE);
            SpannableString spannableString = new SpannableString(getString(C0906R.string.ajp).replaceAll("(.)", "$1⁠"));
            br.a(spannableString, new ForegroundColorSpan(getResources().getColor(C0906R.color.zm)), 0, spannableString.length(), 18);
            this.P.setTitleText((CharSequence) new SpannableStringBuilder(getString(C0906R.string.al9)).append(spannableString));
            this.P.setOnInternalClickListener(new NoticeView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62064a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f62064a, false, 68577, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62064a, false, 68577, new Class[0], Void.TYPE);
                        return;
                    }
                    MyProfileFragment.this.P.setVisibility(8);
                    x.a().c().a(Boolean.FALSE);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f62064a, false, 68576, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62064a, false, 68576, new Class[0], Void.TYPE);
                        return;
                    }
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).goToPrivacyActivity(MyProfileFragment.this.getActivity());
                    MyProfileFragment.this.P.setVisibility(8);
                }
            });
        }
    }

    public final void F() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68514, new Class[0], Void.TYPE);
            return;
        }
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            AwemeListFragment awemeListFragment = (AwemeListFragment) childFragmentManager.findFragmentByTag(u + p());
            if (awemeListFragment != null && awemeListFragment.p != null && awemeListFragment.p.i() != null && ((com.ss.android.ugc.aweme.common.f.a) awemeListFragment.p.i()).getItems() != null) {
                int size = ((com.ss.android.ugc.aweme.common.f.a) awemeListFragment.p.i()).getItems().size();
                if (!(curUser == null || curUser.getAwemeCount() == size || curUser.getAwemeCount() >= 20)) {
                    n.a("aweme_post_display_unnormal_log", new com.ss.android.ugc.aweme.app.d.c().a("post_list_size", String.valueOf(size)).a("user_aweme_count", String.valueOf(curUser.getAwemeCount())).b());
                }
            }
        }
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68530, new Class[0], Void.TYPE);
            return;
        }
        I();
        if (this.E instanceof AbsMyCommonHeaderLayout) {
            AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
            if (PatchProxy.isSupport(new Object[0], absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69455, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69455, new Class[0], Void.TYPE);
            } else {
                if (absMyCommonHeaderLayout.av != null && absMyCommonHeaderLayout.av.f63119e) {
                    com.ss.android.ugc.aweme.profile.ui.widget.b bVar = absMyCommonHeaderLayout.av;
                    if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69696, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.profile.ui.widget.b.f63115a, false, 69696, new Class[0], Void.TYPE);
                    } else {
                        bVar.a();
                    }
                }
                if (absMyCommonHeaderLayout.aw != null && absMyCommonHeaderLayout.aw.getVisibility() == 0) {
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                    a2.a("enter_from", "personal_homepage");
                    r.a("h5_show_detail", (Map) a2.f34114b);
                }
            }
        }
        User user = this.J;
        if (user == null) {
            user = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        }
        if (a_(user)) {
            com.ss.android.ugc.aweme.commercialize.model.b.a(user, "personal_homepage");
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, M, false, 68472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, M, false, 68472, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.S = arguments.getString("enter_from");
        }
        this.J = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        super.d();
        this.E.setUser(this.J);
        if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().c()).booleanValue()) {
            com.ss.android.ugc.aweme.account.d.a().queryUser();
        }
        this.ae = new u();
        this.ae.a(this);
        this.ae.a(new Object[0]);
        this.an = false;
        this.E.j();
        this.aq = (MyProfileViewModel) ViewModelProviders.of((Fragment) this).get(MyProfileViewModel.class);
        this.aq.f63180b.observe(this, this);
        this.aq.f63182d.observe(this, new bh(this));
        this.aq.a();
        if (((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().c()).booleanValue()) {
            this.aq.f63181c.observe(this, new bi(this));
        } else {
            this.E.a((ActivityLinkResponse.LinkInfo) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = M
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 68483(0x10b83, float:9.5965E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = M
            r5 = 0
            r6 = 68483(0x10b83, float:9.5965E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r1 = r1.getHasEnterBindPhone()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.a(r2)
        L_0x0038:
            super.onResume()
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r11.f3782e
            if (r1 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r11.f3782e
            r1.resumeAnimation()
        L_0x0044:
            com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent r1 = r11.ap
            if (r1 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent r1 = r11.ap
            r1.onResume()
        L_0x004d:
            boolean r1 = r11.at
            if (r1 == 0) goto L_0x0054
            r11.R()
        L_0x0054:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            r11.J = r1
            com.ss.android.ugc.aweme.profile.presenter.u r1 = r11.ae
            com.ss.android.ugc.aweme.profile.model.User r2 = r11.J
            r1.a((com.ss.android.ugc.aweme.profile.model.User) r2)
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r11.E
            com.ss.android.ugc.aweme.profile.model.User r2 = r11.J
            r1.h((com.ss.android.ugc.aweme.profile.model.User) r2)
            boolean r1 = r11.au
            r2 = 1
            if (r1 != 0) goto L_0x0075
            boolean r1 = r11.ag
            if (r1 == 0) goto L_0x00c1
        L_0x0075:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = M
            r6 = 0
            r7 = 68515(0x10ba3, float:9.601E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0099
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = M
            r6 = 0
            r7 = 68515(0x10ba3, float:9.601E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00c1
        L_0x0099:
            boolean r1 = r11.isActive()
            if (r1 == 0) goto L_0x00c1
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            boolean r1 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r1)
            if (r1 != 0) goto L_0x00b8
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            r3 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (int) r3)
            r1.a()
            goto L_0x00c1
        L_0x00b8:
            r11.aw = r2
            com.ss.android.ugc.aweme.profile.presenter.u r1 = r11.ae
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1.a((java.lang.Object[]) r3)
        L_0x00c1:
            r11.au = r0
            r11.ag = r0
            r11.m()
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r11.E
            r1.d()
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x00dc
            com.ss.android.ugc.aweme.profile.model.User r1 = r11.J
            boolean r1 = r1.isBindedWeibo()
            r11.c((boolean) r1)
        L_0x00dc:
            boolean r1 = r11.ar
            if (r1 == 0) goto L_0x00fe
            r11.ar = r0
            java.util.List r1 = r11.v
            java.util.Iterator r1 = r1.iterator()
        L_0x00e8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r1.next()
            android.support.v4.app.Fragment r3 = (android.support.v4.app.Fragment) r3
            boolean r4 = r3 instanceof com.ss.android.ugc.aweme.profile.ui.z
            if (r4 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.profile.ui.z r3 = (com.ss.android.ugc.aweme.profile.ui.z) r3
            r3.x()
            goto L_0x00e8
        L_0x00fe:
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragment r1 = r11.ao
            if (r1 == 0) goto L_0x010b
            boolean r1 = r11.as
            if (r1 != 0) goto L_0x010b
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragment r1 = r11.ao
            r1.r()
        L_0x010b:
            com.ss.android.ugc.aweme.profile.ui.widget.e r1 = r11.ai
            if (r1 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = com.ss.android.ugc.aweme.utils.t.b(r1)
            if (r1 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.profile.ui.widget.e r3 = r11.ai
            com.ss.android.ugc.aweme.d.a.a r4 = com.ss.android.ugc.aweme.d.a.a.a()
            java.util.List r1 = r1.getUrlList()
            r5 = 100
            com.ss.android.ugc.aweme.d.a.c r1 = r4.a(r1, r5, r5)
            r3.a(r1)
        L_0x0130:
            boolean r1 = r11.as
            if (r1 == 0) goto L_0x01a6
            com.ss.android.experiencekit.c.d r1 = com.ss.android.experiencekit.c.d.END
            java.lang.String r3 = "tag"
            java.lang.String r4 = r11.getTag()
            com.ss.android.ugc.aweme.main.bl.a(r1, r3, r4)
            boolean r1 = r11.at
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r1)
            r3[r0] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = M
            r6 = 0
            r7 = 68533(0x10bb5, float:9.6035E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r0] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0179
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = M
            r7 = 0
            r8 = 68533(0x10bb5, float:9.6035E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01a6
        L_0x0179:
            if (r1 == 0) goto L_0x01a6
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            if (r1 == 0) goto L_0x01a6
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto L_0x018c
            goto L_0x01a6
        L_0x018c:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x01a6
            com.ss.android.ugc.aweme.profile.presenter.a r1 = r11.af
            if (r1 != 0) goto L_0x019d
            com.ss.android.ugc.aweme.profile.presenter.a r1 = new com.ss.android.ugc.aweme.profile.presenter.a
            r1.<init>()
            r11.af = r1
        L_0x019d:
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            com.ss.android.ugc.aweme.profile.presenter.a r3 = r11.af
            com.ss.android.ugc.aweme.profile.d.ac.a(r1, r3, r11, r2)
        L_0x01a6:
            r11.as = r0
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.al()
            r2 = 8
            if (r1 == 0) goto L_0x01ed
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63174a
            r6 = 1
            r7 = 70081(0x111c1, float:9.8204E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x01df
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63174a
            r6 = 1
            r7 = 70081(0x111c1, float:9.8204E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x01e5
        L_0x01df:
            com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel$a r1 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63177d
            boolean r1 = r1.a()
        L_0x01e5:
            if (r1 == 0) goto L_0x01ed
            android.view.View r1 = r11.mYellowPoint
            r1.setVisibility(r0)
            goto L_0x01f2
        L_0x01ed:
            android.view.View r0 = r11.mYellowPoint
            r0.setVisibility(r2)
        L_0x01f2:
            boolean r0 = r11.at
            r11.h(r0)
            boolean r0 = r11.at
            r11.g(r0)
            boolean r0 = r11.at
            r11.i(r0)
            boolean r0 = r11.at
            r11.f(r0)
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel r0 = r11.aq
            if (r0 == 0) goto L_0x0217
            boolean r0 = r11.at
            if (r0 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel r0 = r11.aq
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f63182d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L_0x0217:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r0 = r0.c()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0239
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0242
        L_0x0239:
            com.ss.android.ugc.aweme.discover.ui.NoticeView r0 = r11.P
            if (r0 == 0) goto L_0x0242
            com.ss.android.ugc.aweme.discover.ui.NoticeView r0 = r11.P
            r0.setVisibility(r2)
        L_0x0242:
            int r0 = r11.G
            java.lang.String r0 = r11.p(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0265
            java.lang.String r0 = "enter_personal_homepage"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "tab_name"
            int r3 = r11.G
            java.lang.String r3 = r11.p(r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.onResume():void");
    }

    @Subscribe
    public void onLinkAuthSettingsFinishEvent(com.ss.android.ugc.aweme.commercialize.link.e eVar) {
        this.au = true;
    }

    @Subscribe
    public void onSaveUserDataEvent(com.ss.android.ugc.aweme.profile.a.d dVar) {
        this.ag = true;
    }

    @Subscribe
    public void onMyEnterpriseProfileEvent(g gVar) {
        if (gVar.f38515a == 1) {
            this.ar = true;
        }
    }

    public final void a(at atVar) {
        this.Q = atVar;
    }

    @Subscribe
    public void onAuthRefreshEvent(com.ss.android.ugc.aweme.commerce.service.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, M, false, 68520, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, M, false, 68520, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.a.class}, Void.TYPE);
            return;
        }
        if (this.ae != null) {
            this.ae.a(new Object[0]);
        }
    }

    @Subscribe
    public void onUpdateUserSuccessEvent(com.ss.android.ugc.aweme.base.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, M, false, 68523, new Class[]{com.ss.android.ugc.aweme.base.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, M, false, 68523, new Class[]{com.ss.android.ugc.aweme.base.a.c.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.d.a().queryUser();
    }

    private int o(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, M, false, 68471, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, M, false, 68471, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i) {
            case 0:
                return 3;
            case 1:
                return 0;
            case 2:
                if (!SharePrefCache.inst().isOpenForward()) {
                    return 1;
                }
                if (AbTestManager.a().aV()) {
                    return 8;
                }
                return 5;
            case 3:
                return 1;
            case 4:
                return 7;
            default:
                return 3;
        }
    }

    private String p(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, M, false, 68478, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, M, false, 68478, new Class[]{Integer.TYPE}, String.class);
        } else if (this.w == null || this.w.size() == 0 || i >= this.w.size()) {
            return "";
        } else {
            return eg.a(((Integer) this.w.get(i)).intValue());
        }
    }

    public final void e(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, M, false, 68469, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, M, false, 68469, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.J = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        this.E.setUser(this.J);
        super.e(str);
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, M, false, 68542, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, M, false, 68542, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (!(message.obj instanceof Exception) && (message.obj instanceof User)) {
            com.ss.android.ugc.aweme.account.d.a().setCurUser((User) message.obj);
            if (this.ae != null) {
                this.ae.a((User) message.obj);
                this.E.h((User) message.obj);
            }
        }
    }

    @Subscribe
    public void onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, M, false, 68521, new Class[]{com.ss.android.ugc.aweme.account.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, M, false, 68521, new Class[]{com.ss.android.ugc.aweme.account.e.a.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(aVar.f31839a) && this.ah != null) {
            this.ah.a();
        }
    }

    @Subscribe
    public void onCloseWebViewLoadingJsEvent(com.ss.android.ugc.aweme.commercialize.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, M, false, 68496, new Class[]{com.ss.android.ugc.aweme.commercialize.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, M, false, 68496, new Class[]{com.ss.android.ugc.aweme.commercialize.b.c.class}, Void.TYPE);
            return;
        }
        if (isActive() && this.ay) {
            this.Z.b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, M, false, 68498, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, M, false, 68498, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.L != configuration.screenWidthDp) {
            if (PatchProxy.isSupport(new Object[0], this, M, false, 68499, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, M, false, 68499, new Class[0], Void.TYPE);
            } else {
                ProfileTabFactory profileTabFactory = new ProfileTabFactory();
                profileTabFactory.f76390b = 0;
                this.E.H.a(this.l, profileTabFactory, this, this.G, true);
            }
            this.L = configuration.screenWidthDp;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, M, false, 68467, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, M, false, 68467, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        int intValue = ((Integer) x.a().w().c()).intValue();
        if (intValue <= 3) {
            x.a().w().a(Integer.valueOf(intValue + 1));
        }
        this.av = !"from_main".equals(this.F);
        if (getActivity() instanceof UserProfileActivity) {
            this.az = true;
        }
    }

    @Subscribe
    public void onDeleteAllStory(com.ss.android.ugc.aweme.story.api.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, M, false, 68516, new Class[]{com.ss.android.ugc.aweme.story.api.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, M, false, 68516, new Class[]{com.ss.android.ugc.aweme.story.api.a.a.class}, Void.TYPE);
            return;
        }
        if (this.E != null) {
            if (this.J == null) {
                this.J = com.ss.android.ugc.aweme.account.d.a().getCurUser();
            }
            this.J.setHasStory(false);
            this.J.setHasUnreadStory(false);
            this.E.b(this.J.isLive(), false, false);
        }
    }

    @Subscribe
    public void onUpdateUserEvent(com.ss.android.ugc.aweme.base.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, M, false, 68522, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, M, false, 68522, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE);
            return;
        }
        this.ag = false;
        this.J = bVar.f34476a;
        if (this.ae != null) {
            this.ae.a(this.J);
            this.E.h(this.J);
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(af afVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{afVar}, this, M, false, 68524, new Class[]{af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, M, false, 68524, new Class[]{af.class}, Void.TYPE);
            return;
        }
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
        if (this.am != "like") {
            z = false;
        }
        absMyCommonHeaderLayout.g(z);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, M, false, 68490, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, M, false, 68490, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        View findViewById = view.findViewById(C0906R.id.ix);
        if (TextUtils.equals("from_main", this.F)) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62060a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62060a, false, 68574, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62060a, false, 68574, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MyProfileFragment.this.Q != null) {
                        MyProfileFragment.this.Q.a();
                        return;
                    }
                    if (MyProfileFragment.this.getActivity() != null && !MyProfileFragment.this.getActivity().isFinishing()) {
                        MyProfileFragment.this.getActivity().finish();
                    }
                }
            });
        }
        if (J()) {
            this.f3781d.setVisibility(8);
            if (this.f3782e != null) {
                this.f3782e.cancelAnimation();
            }
        } else {
            this.f3781d.setVisibility(0);
        }
        if (this.av) {
            this.mMoreView.setVisibility(8);
        }
        this.Y = view;
        if (PatchProxy.isSupport(new Object[]{view}, this, M, false, 68491, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, M, false, 68491, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.Z = (ProfileQuickShopContainer) view.findViewById(C0906R.id.c7a);
        this.aa = (DmtTextView) view.findViewById(C0906R.id.c7b);
        this.ab = view.findViewById(C0906R.id.c7i);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        com.ss.android.ugc.aweme.ap.a aVar = (com.ss.android.ugc.aweme.ap.a) obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, M, false, 68550, new Class[]{com.ss.android.ugc.aweme.ap.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, M, false, 68550, new Class[]{com.ss.android.ugc.aweme.ap.a.class}, Void.TYPE);
            return;
        }
        if (!(aVar == null || aVar.f33640c == null || aVar.f33639b != a.C0431a.SUCCESS)) {
            int i = ((NewUserCount) aVar.f33640c).count;
            if (i <= 0) {
                if (this.E instanceof AbsMyCommonHeaderLayout) {
                    ((AbsMyCommonHeaderLayout) this.E).setRecommendCount(0);
                }
                return;
            }
            r.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("recommend_friends"));
            r.a("add_friends_notice", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show").f34114b);
            if (this.E instanceof AbsMyCommonHeaderLayout) {
                if (PatchProxy.isSupport(new Object[0], this, M, false, 68551, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, M, false, 68551, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity == null || !(activity instanceof MainActivity) || !activity.getIntent().getBooleanExtra("is_have_intents", false) || !(this.E instanceof AbsMyCommonHeaderLayout)) {
                        z = false;
                    }
                }
                if (!z) {
                    ((AbsMyCommonHeaderLayout) this.E).setRecommendCount(i);
                }
            }
        }
    }

    @Subscribe
    public void onFakeCoverAction(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, M, false, 68495, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, M, false, 68495, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (isActive() && this.ay && hVar2.f38517b == 1 && (this.E instanceof au)) {
            au auVar = (au) this.E;
            if (PatchProxy.isSupport(new Object[0], auVar, au.aB, false, 69629, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], auVar, au.aB, false, 69629, new Class[0], Void.TYPE);
            } else if (auVar.aC != null) {
                auVar.aC.performClick();
            }
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, M, false, 68517, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, M, false, 68517, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin() || !TextUtils.equals(followStatus.userId, com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            if (followStatus.followStatus == 0) {
                com.ss.android.ugc.aweme.account.d.a().updateCurFollowingCount(-1);
                if (PatchProxy.isSupport(new Object[0], this, M, false, 68486, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, M, false, 68486, new Class[0], Void.TYPE);
                } else if (com.ss.android.g.a.c() && this.ao != null) {
                    this.ao.x();
                }
            } else {
                com.ss.android.ugc.aweme.account.d.a().updateCurFollowingCount(1);
            }
            b(com.ss.android.ugc.aweme.account.d.a().getCurUser().getFollowingCount());
        }
    }

    @Subscribe
    public void onHidePerfectInfoGuideEvent(com.ss.android.ugc.aweme.profile.a.c cVar) {
        com.ss.android.ugc.aweme.profile.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, M, false, 68519, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, M, false, 68519, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE);
            return;
        }
        if (this.E instanceof AbsMyCommonHeaderLayout) {
            AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
            if (!PatchProxy.isSupport(new Object[]{cVar2}, absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69456, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE)) {
                if (absMyCommonHeaderLayout.av != null) {
                    switch (cVar2.f61228a) {
                        case 0:
                            absMyCommonHeaderLayout.av.a(false);
                            return;
                        case 1:
                            if (!absMyCommonHeaderLayout.av.f63118d) {
                                absMyCommonHeaderLayout.av.a(false);
                                break;
                            }
                            break;
                        case 2:
                            if (absMyCommonHeaderLayout.av.f63118d) {
                                absMyCommonHeaderLayout.av.a(false);
                                return;
                            }
                            break;
                    }
                }
            } else {
                AbsMyCommonHeaderLayout absMyCommonHeaderLayout2 = absMyCommonHeaderLayout;
                PatchProxy.accessDispatch(new Object[]{cVar2}, absMyCommonHeaderLayout2, AbsMyCommonHeaderLayout.ai, false, 69456, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE);
            }
        }
    }

    @OnClick({2131495791})
    public void onMore(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, M, false, 68508, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, M, false, 68508, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            r.onEvent(MobClick.obtain().setEventName("click_more_setting").setLabelName("personal_homepage"));
            if (PatchProxy.isSupport(new Object[0], this, M, false, 68505, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, M, false, 68505, new Class[0], Void.TYPE);
            } else {
                if (this.al != null) {
                    this.al.d();
                }
                if (N()) {
                    H();
                }
            }
            i(false);
            D();
            if (PatchProxy.isSupport(new Object[0], this, M, false, 68510, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, M, false, 68510, new Class[0], Void.TYPE);
                return;
            }
            if (this.aA != null && this.aA.isShowing()) {
                this.aA.f();
            }
        }
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, M, false, 68475, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, M, false, 68475, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onPageSelected(i);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, M, false, 68479, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, M, false, 68479, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.v != null && i >= 0 && i < this.v.size()) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.v.get(i);
            if (profileListFragment != null && profileListFragment.j()) {
                profileListFragment.H_();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68532, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68532, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.at = z;
        super.setUserVisibleHint(z);
        if (!z) {
            if (this.aA != null && this.aA.isShowing()) {
                this.aA.dismiss();
            }
            if (this.n != null && this.n.isShowing()) {
                this.n.dismiss();
            }
        }
        if (this.v != null && !this.v.isEmpty()) {
            if (this.G >= 0 && this.G < this.v.size()) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.v.get(this.G);
                if (profileListFragment != null) {
                    profileListFragment.setUserVisibleHint(z);
                }
            } else {
                return;
            }
        }
        if (z) {
            if (this.T != null && (this.T instanceof UserStateFragment)) {
                ((UserStateFragment) this.T).a();
            }
            if (!TextUtils.isEmpty(p(this.G))) {
                r.a("enter_personal_homepage", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", p(this.G)).f34114b);
            }
        }
        h(z);
        g(z);
        i(z);
        f(z);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68534, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68534, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.W.postDelayed(new bj(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
            if (!z) {
                if (this.ak != null && this.ak.isShowing()) {
                    this.ak.b();
                }
            } else if (com.ss.android.ugc.aweme.feed.y.b() && !com.ss.android.ugc.aweme.feed.y.c()) {
                if ((this.aB == null || !this.aB.isShowing()) && ((this.aA == null || !this.aA.isShowing()) && ((this.aj == null || !this.aj.isShowing()) && (this.ak == null || !this.ak.isShowing())))) {
                    r.a("show_coupon_bubble", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").f34114b);
                    com.ss.android.ugc.aweme.feed.y.b(true);
                    this.ak = new c(getActivity());
                    this.ak.c(C0906R.string.alh);
                    this.ak.o = 0;
                    this.ak.a(false);
                    this.ak.e();
                    this.ak.u = new bk(this);
                    this.ak.j = -20;
                    float c2 = (float) ((this.ak.c() - this.mMoreView.getWidth()) / 2);
                    this.ak.a(this.mMoreView, (int) c2, (int) (-c2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68535, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68535, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!AbTestManager.a().aV()) {
            if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
                this.W.postDelayed(new bl(this, z), 500);
            } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
                if (z) {
                    if (com.ss.android.ugc.aweme.favorites.d.b.a() && ((Boolean) SharePrefCache.inst().getIsShowFavouritePopup().c()).booleanValue()) {
                        if (this.aB != null && this.aB.isShowing()) {
                            return;
                        }
                        if (this.aA == null || !this.aA.isShowing()) {
                            this.aA = new b.a(getActivity()).b((int) C0906R.string.bfl).a(5000).a(false).e((int) UIUtils.dip2Px(getActivity(), -5.0f)).c(false).a();
                            this.aA.a();
                            if (ey.a((Context) getActivity())) {
                                this.aA.a(this.mMoreView, 80, UIUtils.dip2Px(getActivity(), 8.0f), ((int) UIUtils.dip2Px(getActivity(), 13.0f)) - (this.aA.d() - this.mMoreView.getWidth()));
                            } else {
                                this.aA.a(this.mMoreView, 80, (float) ((this.aA.e() - (this.mMoreView.getWidth() / 2)) - com.ss.android.ugc.aweme.base.utils.u.a(20.0d)), (-((int) UIUtils.dip2Px(getActivity(), 3.0f))) - (this.aA.e() - this.mMoreView.getWidth()));
                            }
                            SharePrefCache.inst().getIsShowFavouritePopup().a(Boolean.FALSE);
                        }
                    }
                } else if (this.aA != null && this.aA.isShowing()) {
                    this.aA.f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68536, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68536, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.W.postDelayed(new bm(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON() && !com.ss.android.g.a.a()) {
            try {
                z2 = com.ss.android.ugc.aweme.global.config.settings.g.b().bf().booleanValue();
            } catch (com.bytedance.ies.a unused) {
                z2 = true;
            }
            if (z2) {
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(getContext());
                if (a2 != null) {
                    User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                    if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
                        long latestOrderTime = curUser.getLatestOrderTime();
                        if (latestOrderTime > com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(a2, curUser.getUid())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(a2, curUser.getUid(), latestOrderTime);
                            com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(a2, curUser.getUid(), true);
                            com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.b(a2, curUser.getUid(), true);
                        }
                        if (!z3 && !com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.b(a2, curUser.getUid())) {
                            return;
                        }
                        if (!z) {
                            E();
                        } else if (this.aB == null || !this.aB.isShowing()) {
                            if (a2.q(true)) {
                                this.aB = new c(getActivity());
                                this.aB.c(C0906R.string.bkl);
                                this.aB.b(1, 13);
                                this.aB.o = 5000;
                                this.aB.a(false);
                                this.aB.e();
                                float c2 = ((float) (this.aB.c() - this.mMoreView.getWidth())) / 2.0f;
                                this.aB.a(this.mMoreView, (int) c2, (int) (-c2));
                                a2.r(false);
                            }
                            this.mYellowPoint.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68537, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68537, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() == null || this.mMoreView == null || this.mMoreView.getWidth() == 0) {
            this.W.postDelayed(new bn(this, z), 500);
        } else if (getView() != null && !TimeLockRuler.isTeenModeON()) {
            View findViewById = getView().findViewById(C0906R.id.bc7);
            if (!z) {
                if (this.aj != null && this.aj.isShowing()) {
                    this.aj.b();
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else if (this.aB != null && this.aB.isShowing()) {
            } else {
                if (this.aA != null && this.aA.isShowing()) {
                    return;
                }
                if (this.aj != null && this.aj.isShowing()) {
                    return;
                }
                if (!this.av && L()) {
                    M();
                    this.aj = new c(getActivity());
                    this.aj.c(C0906R.string.bw9);
                    this.aj.o = 5000;
                    this.aj.a(false);
                    this.aj.e();
                    float c2 = (float) ((this.aj.c() - this.mMoreView.getWidth()) / 2);
                    this.aj.a(this.mMoreView, (int) c2, (int) (-c2));
                    r.a("show_mp_bubble", (Map) null);
                } else if (N()) {
                    com.ss.android.ugc.aweme.commercialize.link.c.a();
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    this.aj = new c(getActivity());
                    this.aj.c(C0906R.string.b5q);
                    this.aj.o = 0;
                    this.aj.a(false);
                    this.aj.getContentView().setOnClickListener(new bo(this));
                    this.aj.e();
                    float c3 = (float) ((this.aj.c() - this.mMoreView.getWidth()) / 2);
                    this.aj.a(this.mMoreView, (int) c3, (int) (-c3));
                }
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68513, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, M, false, 68513, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (z2) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) childFragmentManager.findFragmentByTag(u + o(0));
            if (originMusicListFragment != null) {
                originMusicListFragment.m();
            }
        }
        if (this.ap != null) {
            this.ap.a(z2);
        }
        if (this.aq != null) {
            this.aq.f63182d.setValue(Boolean.valueOf(!z2));
        }
        if (z2) {
            S();
        } else {
            R();
        }
        if (!z2) {
            if (this.aq != null) {
                this.aq.a();
            }
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62062a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f62062a, false, 68575, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62062a, false, 68575, new Class[0], Void.TYPE);
                        return;
                    }
                    MyProfileFragment.this.F();
                }
            }, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
        if (this.E instanceof au) {
            au auVar = (au) this.E;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, auVar, au.aB, false, 69623, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                au auVar2 = auVar;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, auVar2, au.aB, false, 69623, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (!z2) {
                if (auVar.aD != null) {
                    auVar.aD.a();
                }
                if (auVar.aE != null) {
                    auVar.aE.a();
                }
            }
        }
        if (z2) {
            K();
        }
        if ((!((Boolean) x.a().c().c()).booleanValue() || com.ss.android.ugc.aweme.account.d.a().getCurUser().isSecret()) && this.P != null) {
            this.P.setVisibility(8);
        }
        if (!z2) {
            bl.a(com.ss.android.experiencekit.c.d.END, "tag", getTag());
            if (this.U != null) {
                ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi = this.U;
                if (PatchProxy.isSupport(new Object[0], profileCollectionFragmentForJedi, ProfileCollectionFragmentForJedi.f44326a, false, 39600, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], profileCollectionFragmentForJedi, ProfileCollectionFragmentForJedi.f44326a, false, 39600, new Class[0], Void.TYPE);
                } else if (profileCollectionFragmentForJedi.isViewValid() && profileCollectionFragmentForJedi.getUserVisibleHint()) {
                    if (((DmtStatusView) profileCollectionFragmentForJedi.a(C0906R.id.cvd)) == null || (!profileCollectionFragmentForJedi.g && !TimeLockRuler.isTeenModeON())) {
                        profileCollectionFragmentForJedi.g().f44286e.refresh();
                    } else {
                        DmtStatusView dmtStatusView = (DmtStatusView) profileCollectionFragmentForJedi.a(C0906R.id.cvd);
                        if (dmtStatusView == null) {
                            Intrinsics.throwNpe();
                        }
                        dmtStatusView.setVisibility(4);
                        View view = profileCollectionFragmentForJedi.f44331f;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
                        }
                        view.setVisibility(0);
                    }
                }
            }
        }
        this.E.f(z2);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onVideoEvent(ar arVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, M, false, 68518, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, M, false, 68518, new Class[]{ar.class}, Void.TYPE);
        } else if ("USER".equals(getTag())) {
            int i2 = arVar.f45292b;
            if (i2 != 2) {
                if (i2 != 13) {
                    if (i2 == 15) {
                        if (arVar.f45294d == 0 && (getActivity() instanceof MainActivity)) {
                            com.ss.android.ugc.aweme.account.d.a().updateCurAwemeCount(1);
                            com.ss.android.ugc.aweme.account.d.a().updateCurDongtaiCount(1);
                        }
                        if (com.ss.android.ugc.aweme.account.d.a().getCurUser().getAwemeCount() > 0) {
                            g();
                        }
                    } else if (i2 != 39) {
                        switch (i2) {
                            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69367f /*31*/:
                                com.ss.android.ugc.aweme.account.d.a().updateCurDongtaiCount(1);
                                break;
                            case 32:
                                com.ss.android.ugc.aweme.account.d.a().updateCurDongtaiCount(-1);
                                break;
                        }
                    } else {
                        com.ss.android.ugc.aweme.account.d.a().getCurUser().setCollectCount(((Integer) arVar.f45293c).intValue());
                    }
                } else if (com.ss.android.ugc.aweme.feed.a.a().b((String) arVar.f45293c).getUserDigg() == 1) {
                    com.ss.android.ugc.aweme.account.d.a().updateCurFavoritingCount(1);
                } else {
                    com.ss.android.ugc.aweme.account.d.a().updateCurFavoritingCount(-1);
                }
            } else if (arVar.f45294d == 0 && (arVar.f45293c instanceof String) && (getActivity() instanceof MainActivity)) {
                com.ss.android.ugc.aweme.account.d.a().updateCurAwemeCount(-1);
                if (com.ss.android.ugc.aweme.account.d.a().getCurUser().getAwemeCount() == 0) {
                    h();
                }
            }
            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
            if (this.E != null) {
                this.E.d(curUser.getAwemeCount());
                this.E.e(curUser.getFavoritingCount());
                if (AbTestManager.a().aV()) {
                    i = curUser.getCollectCount();
                } else {
                    i = curUser.getDongtaiCount();
                }
                this.E.g(i);
            }
        }
    }

    public final void m(int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, M, false, 68470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, M, false, 68470, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 5) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            EnterpriseTabFragment enterpriseTabFragment = (EnterpriseTabFragment) childFragmentManager.findFragmentByTag(u + o(4));
            if (enterpriseTabFragment == null) {
                enterpriseTabFragment = new EnterpriseTabFragment();
                enterpriseTabFragment.f2927b = true;
            }
            a((ProfileListFragment) enterpriseTabFragment, (Integer) 7);
            enterpriseTabFragment.k = eg.a(7);
            enterpriseTabFragment.a(this.J.getUid(), this.J.getSecUid());
            if (this.G != this.w.indexOf(7)) {
                z3 = false;
            }
            enterpriseTabFragment.j = z3;
        } else if (i == 4) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            EffectListFragment effectListFragment = (EffectListFragment) childFragmentManager2.findFragmentByTag(u + o(0));
            if (effectListFragment == null) {
                EffectListFragment.a aVar = EffectListFragment.f61796d;
                int B = B();
                if (this.J == null) {
                    str2 = "";
                } else {
                    str2 = this.J.getUid();
                }
                if (this.J == null) {
                    str3 = "";
                } else {
                    str3 = this.J.getSecUid();
                }
                effectListFragment = aVar.a(B, str2, str3, true);
            }
            a((ProfileListFragment) effectListFragment, (Integer) 6);
            effectListFragment.k = eg.a(6);
            effectListFragment.a(this.J.getUid(), this.J.getSecUid());
            if (this.G != this.w.indexOf(6)) {
                z3 = false;
            }
            effectListFragment.j = z3;
        } else if (i == 3) {
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) childFragmentManager3.findFragmentByTag(u + o(0));
            if (originMusicListFragment == null) {
                if (this.J == null) {
                    str = "";
                } else {
                    str = this.J.getUid();
                }
                originMusicListFragment = OriginMusicListFragment.a(str, true);
            }
            a((ProfileListFragment) originMusicListFragment, (Integer) 3);
            originMusicListFragment.a(this.J.getUid());
            if (this.G != this.w.indexOf(3)) {
                z3 = false;
            }
            originMusicListFragment.j = z3;
            originMusicListFragment.k = eg.a(3);
        } else if (i == 0) {
            FragmentManager childFragmentManager4 = getChildFragmentManager();
            AwemeListFragment awemeListFragment = (AwemeListFragment) childFragmentManager4.findFragmentByTag(u + o(1));
            if (awemeListFragment == null) {
                awemeListFragment = AwemeListFragment.a((int) getResources().getDimension(C0906R.dimen.lv), 0, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid(), true, false);
            }
            a((ProfileListFragment) awemeListFragment, (Integer) 0);
            awemeListFragment.r = this.h;
            awemeListFragment.k = eg.a(0);
            if (this.G == this.w.indexOf(0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            awemeListFragment.j = z2;
            if (this.G != p()) {
                z3 = false;
            }
            awemeListFragment.f3789f = z3;
        } else if (i != 1) {
            if (i == 2) {
                FragmentManager childFragmentManager5 = getChildFragmentManager();
                AwemeListFragment awemeListFragment2 = (AwemeListFragment) childFragmentManager5.findFragmentByTag(u + o(3));
                if (awemeListFragment2 == null) {
                    awemeListFragment2 = AwemeListFragment.a((int) getResources().getDimension(C0906R.dimen.lv), 1, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid(), true, false);
                }
                a((ProfileListFragment) awemeListFragment2, (Integer) 1);
                awemeListFragment2.G = this.S;
                awemeListFragment2.r = this.h;
                if (this.G == q()) {
                    z = true;
                } else {
                    z = false;
                }
                awemeListFragment2.f3789f = z;
                awemeListFragment2.k = eg.a(1);
                if (this.G != this.w.indexOf(1)) {
                    z3 = false;
                }
                awemeListFragment2.j = z3;
                this.ao = awemeListFragment2;
            }
        } else if (AbTestManager.a().aV()) {
            FragmentManager childFragmentManager6 = getChildFragmentManager();
            this.U = (ProfileCollectionFragmentForJedi) childFragmentManager6.findFragmentByTag(u + o(2));
            if (this.U == null) {
                this.U = new ProfileCollectionFragmentForJedi();
            }
            a((ProfileListFragment) this.U, (Integer) 8);
        } else {
            FragmentManager childFragmentManager7 = getChildFragmentManager();
            this.T = (ProfileListFragment) childFragmentManager7.findFragmentByTag(u + o(2));
            if (this.T == null) {
                this.T = UserStateFragment.a("personal_homepage", com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid());
            }
            a(this.T, (Integer) 5);
        }
    }

    public final void a(User user) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, M, false, 68497, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, M, false, 68497, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.a(user);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!(this.Z == null || this.aa == null || this.ab == null || this.ac)) {
                this.ay = this.Z.a(user, this.mUserCover, this.ab, this.aa, this.az);
                if (this.ay) {
                    v();
                } else {
                    k(user);
                }
            }
            if (ex.e(this.J)) {
                if (this.E == null || (this.E instanceof av)) {
                    if (this.E != null) {
                        this.mScrollableLayout.removeView(this.E);
                    }
                    this.E = new au(activity, this);
                    ((au) this.E).i(this.ay);
                    this.mScrollableLayout.addView(this.E, 0);
                    j();
                }
            } else if (this.E == null || (this.E instanceof au)) {
                if (this.E != null) {
                    this.mScrollableLayout.removeView(this.E);
                }
                this.mScrollableLayout.removeView(this.E);
                this.E = new av(activity, this);
                this.mScrollableLayout.addView(this.E, 0);
                j();
            }
            ProfileTabFactory profileTabFactory = new ProfileTabFactory();
            profileTabFactory.f76390b = 0;
            this.E.H.a(this.l, profileTabFactory, this, this.G);
            this.E.h(user);
            if (PatchProxy.isSupport(new Object[0], this, M, false, 68474, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, M, false, 68474, new Class[0], Void.TYPE);
            } else {
                final an<Boolean> isLike2DynamicBubbleHasShowed = SharePrefCache.inst().getIsLike2DynamicBubbleHasShowed();
                if (!((Boolean) isLike2DynamicBubbleHasShowed.c()).booleanValue() && AbTestManager.a().aU()) {
                    int indexOf = this.w.indexOf(5);
                    if (indexOf != -1) {
                        ProfileListFragment profileListFragment = (ProfileListFragment) this.v.get(indexOf);
                        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                            final View a2 = this.E.H.a(indexOf);
                            a2.post(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f62055a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f62055a, false, 68573, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f62055a, false, 68573, new Class[0], Void.TYPE);
                                    } else if (MyProfileFragment.this.getActivity() != null && !MyProfileFragment.this.getActivity().isFinishing() && !MyProfileFragment.this.n.isShowing()) {
                                        MyProfileFragment.this.n.a(a2, 48, true, 0.0f);
                                        isLike2DynamicBubbleHasShowed.a(Boolean.TRUE);
                                    }
                                }
                            });
                        }
                    }
                }
            }
            if (!this.aw) {
                h(this.J);
            }
            AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
            if (this.am != "like") {
                z = false;
            }
            absMyCommonHeaderLayout.g(z);
            this.aw = false;
            this.aq.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (AbTestManager.a().an()) {
            if (this.ao != null) {
                this.ao.a(bool);
            }
            boolean booleanValue = bool.booleanValue();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, this, M, false, 68473, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, this, M, false, 68473, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                ProfileListFragment profileListFragment = (ProfileListFragment) j(this.G);
                if (profileListFragment instanceof AwemeListFragment) {
                    AwemeListFragment awemeListFragment = (AwemeListFragment) profileListFragment;
                    if (booleanValue) {
                        if (AbTestManager.a().an()) {
                            awemeListFragment.z();
                        }
                        awemeListFragment.a(false, false);
                    } else {
                        if (AbTestManager.a().an()) {
                            awemeListFragment.A();
                        }
                        awemeListFragment.y();
                    }
                }
            }
            if (!bool.booleanValue()) {
                if (PatchProxy.isSupport(new Object[0], this, AbsProfileFragment.f3778a, false, 67709, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, AbsProfileFragment.f3778a, false, 67709, new Class[0], Void.TYPE);
                } else {
                    if (this.f3780c != null) {
                        this.f3780c.clearAnimation();
                    }
                }
            } else {
                onPageSelected(this.G);
            }
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68503, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68503, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        l(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, M, false, 68482, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, M, false, 68482, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.ap = new AnalysisStayTimeFragmentComponent(this, true);
        this.mScrollableLayout.addView(this.E, 0);
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68492, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, M, false, 68492, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i, i2);
        if (this.ay) {
            this.Z.a(i);
        }
    }

    public final void a(View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, M, false, 68477, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, M, false, 68477, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("change_profile_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").a("enter_method", "click").a("tab_name", p(i)).f34114b);
        this.ad = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, M, false, 68554, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, M, false, 68554, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.E instanceof AbsMyCommonHeaderLayout) {
            ((AbsMyCommonHeaderLayout) this.E).a(i3, i4, intent2);
        }
        if (this.af != null) {
            this.af.a(i3, i4, intent2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, M, false, 68481, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, M, false, 68481, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Context activity = getActivity();
        if (activity == null) {
            activity = viewGroup.getContext();
        }
        this.E = new av(activity, this);
        this.E.setClickEventListener(new a.C0679a() {
            public final void a() {
                MyProfileFragment.this.V = false;
            }

            public final void b() {
                MyProfileFragment.this.V = false;
            }
        });
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r21, java.lang.String[] r22, int[] r23) {
        /*
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r0
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = M
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 68526(0x10bae, float:9.6025E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = M
            r16 = 0
            r17 = 68526(0x10bae, float:9.6025E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            android.support.v4.app.FragmentActivity r2 = r20.getActivity()
            r3 = r21
            com.ss.android.ugc.aweme.utils.permission.a.a((android.app.Activity) r2, (int) r3, (java.lang.String[]) r0, (int[]) r1)
            super.onRequestPermissionsResult(r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public final void a(View view, int i, boolean z) {
        int i2 = i;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, M, false, 68476, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Byte.valueOf(z)}, this, M, false, 68476, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.am = p(i);
        AbsMyCommonHeaderLayout absMyCommonHeaderLayout = (AbsMyCommonHeaderLayout) this.E;
        if (this.am != "like") {
            z2 = false;
        }
        absMyCommonHeaderLayout.g(z2);
        if (i2 == t()) {
            if (PatchProxy.isSupport(new Object[0], this, M, false, 68501, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, M, false, 68501, new Class[0], Void.TYPE);
            } else {
                ProfileListFragment profileListFragment = (ProfileListFragment) j(t());
                if (profileListFragment != null && (profileListFragment instanceof EffectListFragment)) {
                    ((EffectListFragment) profileListFragment).x();
                }
            }
        }
        if (this.ad) {
            this.ad = false;
        } else if (!z) {
            r.a("change_profile_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").a("enter_method", "slide").a("tab_name", this.am).f34114b);
        }
        if (!z) {
            S();
            R();
        }
    }
}
