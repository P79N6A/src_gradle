package com.ss.android.ugc.aweme.profile.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.apm.monitor.annotation.AddFragmentTrace;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.download.api.b.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.c.a.c;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.b.h;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.log.ab;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer;
import com.ss.android.ugc.aweme.commercialize.views.cards.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.RoundShadowLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper;
import com.ss.android.ugc.aweme.discover.hitrank.RankViewModel;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.i;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.RoomResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.ui.a.b;
import com.ss.android.ugc.aweme.profile.ui.header.ax;
import com.ss.android.ugc.aweme.profile.ui.header.ay;
import com.ss.android.ugc.aweme.profile.ui.header.az;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.u.ap;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.ProfileTabFactory;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

@AddFragmentTrace
public class UserProfileFragment extends UserAbsProfileFragment implements Observer<Boolean>, WeakHandler.IHandler, aa, m, n, o, b, com.ss.android.ugc.aweme.report.a.a, AwemeViewPagerNavigator.a {
    public static ChangeQuickRedirect i;
    ProfileQuickShopContainer M;
    DmtTextView N;
    View O;
    protected Aweme P;
    protected long Q = -1;
    protected long R = -1;
    ay S = new ay();
    public AwemeListFragment T;
    public Aweme U;
    com.ss.android.ugc.aweme.commercialize.c.b V = new com.ss.android.ugc.aweme.commercialize.c.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62400a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f62400a, false, 69258, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62400a, false, 69258, new Class[0], Void.TYPE);
                return;
            }
            if (UserProfileFragment.this.P != null && UserProfileFragment.this.P.isAppAd()) {
                c.a().a(com.ss.android.ugc.aweme.commercialize.utils.c.a(UserProfileFragment.this.P), 2, com.ss.android.ugc.aweme.app.c.d.c.a("homepage_ad", UserProfileFragment.this.P.getAwemeRawAd()), (com.ss.android.download.api.b.a) com.ss.android.ugc.aweme.app.c.d.b.a(UserProfileFragment.this.P.getAwemeRawAd()));
            }
        }
    };
    public com.ss.android.ugc.aweme.commercialize.views.cards.a W;
    boolean X;
    private boolean Y;
    private boolean Z;
    private String aA;
    private d aB;
    private String aC;
    private OriginMusicListFragment aD;
    private UserStateFragment aE;
    private AwemeListFragment aF;
    private EnterpriseTabFragment aG;
    private EffectListFragment aH;
    private WeakHandler aI;
    private MainAnimViewModel aJ;
    private AnalysisStayTimeFragmentComponent aK;
    private FollowViewModel aL;
    private String aM;
    private PoiStruct aN;
    private com.ss.android.ugc.aweme.profile.viewmodel.a aa;
    private Disposable ab;
    private ae ac;
    private String ad;
    @BindView(2131492952)
    AvatarImageView adBottomAvatar;
    @BindView(2131492953)
    View adBottomCloseBtn;
    @BindView(2131492954)
    View adBottomDescLL;
    @BindView(2131492955)
    View adBottomLayout;
    @BindView(2131492956)
    TextView adBottomMoreBtn;
    @BindView(2131492957)
    TextView adBottomTitle;
    @BindView(2131492977)
    AdHalfWebPageContainer adHalfLandpageContainer;
    private String ae;
    private String af;
    private String ag;
    private String ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private String al;
    private String am;
    private String an = "other_places";
    private String ao;
    private String ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private String au;
    private String av;
    private boolean aw;
    private e ax = new e();
    private at ay;
    private boolean az = false;
    @BindView(2131493302)
    BlackMaskLayer blackMaskLayer;
    @Nullable
    ProfileHitRankHelper j;
    @BindView(2131493213)
    ImageView mBackBtn;
    @BindView(2131498391)
    FrameLayout mHitRankTagContainer;
    @BindView(2131497606)
    ImageView mRightMoreBtn;
    @BindView(2131498276)
    TextView txtHomePageBottomTextual;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62410a;

        public final void a(@NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f62410a, false, 69263, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62410a, false, 69263, new Class[0], Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.b0z);
        }

        private a() {
        }

        public final void a(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f62410a, false, 69266, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f62410a, false, 69266, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.bvd);
        }

        public final void b(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f62410a, false, 69267, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f62410a, false, 69267, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.b11);
        }

        public final void c(com.ss.android.download.api.c.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f62410a, false, 69268, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f62410a, false, 69268, new Class[]{com.ss.android.download.api.c.e.class}, Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.tr);
        }

        /* synthetic */ a(UserProfileFragment userProfileFragment, byte b2) {
            this();
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i) {
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f62410a, false, 69264, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f62410a, false, 69264, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.ew);
        }

        public final void b(com.ss.android.download.api.c.e eVar, int i) {
            if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f62410a, false, 69265, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f62410a, false, 69265, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            UserProfileFragment.this.adBottomMoreBtn.setText(C0906R.string.blp);
        }
    }

    public final int B() {
        return 0;
    }

    public final void a(Object obj) {
    }

    public final void a(boolean z, boolean z2, boolean z3) {
    }

    public final void b(@Nullable User user) {
    }

    public final void b(boolean z) {
    }

    public final void b(boolean z, boolean z2, boolean z3) {
    }

    public final void f(int i2) {
    }

    public final void f(User user) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onClick(View view) {
    }

    public void onFollowFail(Exception exc) {
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
    }

    public void onRecommendFailed(Exception exc) {
    }

    public void onRefreshRecommendSuccess(RecommendList recommendList) {
    }

    public final int x() {
        return C0906R.layout.r0;
    }

    public final void y() {
    }

    public final void z() {
    }

    public String getUserId() {
        return this.ad;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 69156, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 69156, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.aA = str;
        this.S.setmMethodFrom(str);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69157, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69157, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setUserVisibleHint(z);
        if (z && a_(this.J)) {
            com.ss.android.ugc.aweme.commercialize.model.b.a(this.J, "others_homepage");
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.j(this.P) && isViewValid()) {
            if (z) {
                if (PatchProxy.isSupport(new Object[0], this, i, false, 69231, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, i, false, 69231, new Class[0], Void.TYPE);
                } else if (com.ss.android.ugc.aweme.commercialize.utils.c.j(this.P)) {
                    a.C0519a a2 = new a.C0519a().a(getContext()).a(this.P).a(this.adHalfLandpageContainer).a(this.blackMaskLayer).a(getChildFragmentManager()).a((f) new f() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f62408a;

                        public final void k() {
                        }

                        public final void j() {
                            if (PatchProxy.isSupport(new Object[0], this, f62408a, false, 69261, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f62408a, false, 69261, new Class[0], Void.TYPE);
                                return;
                            }
                            if (UserProfileFragment.this.W != null) {
                                UserProfileFragment.this.W.a(null, null, false);
                            }
                        }

                        public final void a(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62408a, false, 69262, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62408a, false, 69262, new Class[]{Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            if (UserProfileFragment.this.W != null) {
                                UserProfileFragment.this.W.a(null, null, false);
                            }
                        }
                    });
                    a2.f40045a.i = 1;
                    this.W = a2.f40045a;
                    this.W.a();
                }
            } else if (this.W != null) {
                this.W.a(new ef(this), null, false);
            }
        }
        this.ak = z;
        Fragment k = k(this.G);
        if (k instanceof UserStateFragment) {
            k.setUserVisibleHint(this.ak);
        }
        if (this.aJ != null) {
            this.aJ.f54177d.setValue(Boolean.valueOf(z));
        }
        if (this.E != null) {
            this.E.setVisible(z);
        }
        if (z) {
            onPageSelected(this.G);
            this.aq = false;
            if (this.as) {
                g(true);
            }
            this.Q = System.currentTimeMillis();
            O();
        } else {
            P();
        }
        if (!z) {
            ab.a().a(this.ad);
        }
        if (this.Y) {
            this.M.c(z);
        } else if (this.N != null) {
            this.N.setVisibility(8);
        }
        if (this.aK != null) {
            this.aK.b(z);
        }
    }

    public final void a(String str, String str2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, i, false, 69168, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, i, false, 69168, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(str, this.ad)) {
            if (PatchProxy.isSupport(new Object[0], this, i, false, 69208, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, i, false, 69208, new Class[0], Void.TYPE);
            } else if (!(this.v == null || this.w == null)) {
                this.v.remove(this.aG);
                if (this.w.contains(7)) {
                    this.w.remove(7);
                }
                this.f3810b.notifyDataSetChanged();
            }
        }
        this.ad = str;
        this.af = str2;
        if (!TextUtils.isEmpty(this.ad) && TextUtils.isEmpty(this.af)) {
            dr.a().b();
            this.af = dr.a().a(this.ad);
        }
        this.S.setmUserId(this.ad);
        this.S.setSecUserId(this.af);
        h(false);
        ProfileListFragment profileListFragment = (ProfileListFragment) k(t());
        if (profileListFragment instanceof EffectListFragment) {
            profileListFragment.a(str, str2);
        }
        AwemeListFragment a2 = a((ProfileListFragment) k(q()));
        if (a2 != null) {
            a2.a(str, str2);
            a2.d(this.J != null ? this.J.isBlocked() : false);
        }
        AwemeListFragment a3 = a((ProfileListFragment) k(p()));
        if (a3 != null) {
            a3.a(str, str2);
            a3.d(this.J != null ? this.J.isBlocked() : false);
        }
        ProfileListFragment profileListFragment2 = (ProfileListFragment) k(s());
        if (profileListFragment2 instanceof UserStateFragment) {
            profileListFragment2.a(str, str2);
            if (this.J != null) {
                z = this.J.isBlocked();
            }
            profileListFragment2.d(z);
        }
        EnterpriseTabFragment enterpriseTabFragment = (EnterpriseTabFragment) k(u());
        if (enterpriseTabFragment != null) {
            enterpriseTabFragment.a(str, str2);
        }
    }

    public final void a(Aweme aweme) {
        String str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, i, false, 69179, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, i, false, 69179, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            this.aN = aweme.getPoiStruct();
        }
        if (isViewValid()) {
            this.P = aweme2;
            this.S.setmAweme(this.P);
            if (this.P == null) {
                this.ax.k();
                return;
            }
            this.al = this.P.getAid();
            this.S.setmAwemeId(this.al);
            this.ax.a(getContext(), this.P);
            this.as = com.ss.android.ugc.aweme.commercialize.utils.n.a(aweme2, false);
            if (this.as) {
                com.ss.android.ugc.aweme.utils.c.a(this.adBottomMoreBtn);
                this.adBottomMoreBtn.setBackground(new com.ss.android.ugc.aweme.commercialize.ad.c((float) u.a(2.0d), Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(aweme))));
                this.adBottomMoreBtn.setText(com.ss.android.ugc.aweme.commercialize.utils.n.a(getContext(), aweme2, false));
                TextView textView = this.adBottomTitle;
                Context context = getContext();
                if (PatchProxy.isSupport(new Object[]{context, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.n.f39802a, true, 32387, new Class[]{Context.class, Aweme.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{context, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.n.f39802a, true, 32387, new Class[]{Context.class, Aweme.class}, String.class);
                } else if (aweme2 == null) {
                    str = "";
                } else if (!aweme.isAd()) {
                    str = "";
                } else {
                    User author = aweme.getAuthor();
                    if (author == null) {
                        str = "";
                    } else {
                        str = author.getNickname();
                        if (TextUtils.isEmpty(str)) {
                            str = "";
                        }
                    }
                }
                textView.setText(str);
                J();
            } else {
                p(0);
            }
            if (aweme.getAwemeRawAd() != null && !TextUtils.isEmpty(aweme.getAwemeRawAd().getHomepageBottomTextual())) {
                this.txtHomePageBottomTextual.setText(aweme.getAwemeRawAd().getHomepageBottomTextual());
            }
            if (this.W != null) {
                this.W.b();
                this.W = null;
            }
        }
    }

    public final void a(User user) {
        boolean z;
        com.ss.android.ugc.aweme.profile.viewmodel.a aVar;
        Observable observable;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, i, false, 69202, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, i, false, 69202, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            super.a(user);
            a(user.getUid(), user.getSecUid());
            this.az = true;
            if (TextUtils.equals(this.ad, user.getUid())) {
                this.J = user2;
                if (!TextUtils.equals(user.getUid(), this.ad)) {
                    this.ac.a(this.ad, this.af);
                    return;
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    if (!(this.M == null || this.N == null || this.O == null)) {
                        this.Y = this.M.a(user, this.mUserCover, this.O, this.N, this.Z);
                        if (this.Y) {
                            v();
                        } else {
                            k(user);
                        }
                    }
                    if (ex.e(this.J)) {
                        if (this.E == null || (this.E instanceof az)) {
                            if (this.E != null) {
                                this.mScrollableLayout.removeView(this.E);
                            }
                            ax axVar = new ax(activity, this, this.S, this.aI, this.f3813e);
                            this.E = axVar;
                            this.E.setFragment(this);
                            this.E.setSourceAweme(this.U);
                            F();
                            this.mScrollableLayout.addView(this.E, 0);
                            E();
                        }
                    } else if (this.E == null || (this.E instanceof ax)) {
                        if (this.E != null) {
                            this.mScrollableLayout.removeView(this.E);
                        }
                        az azVar = new az(activity, this, this.S, this.aI, this.f3813e);
                        this.E = azVar;
                        this.E.setFragment(this);
                        F();
                        this.mScrollableLayout.addView(this.E, 0);
                        E();
                    }
                    this.E.setSourceAweme(this.U);
                    if (ex.k(this.J)) {
                        r.onEvent(MobClick.obtain().setEventName("show_link").setLabelName(this.J.isMe() ? "personal_homepage" : "others_homepage").setValue(this.J.getUid()).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("link_type", "news_article").b()));
                    }
                    i(h());
                    if (PatchProxy.isSupport(new Object[0], this, i, false, 69209, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, i, false, 69209, new Class[0], Void.TYPE);
                    } else {
                        l(this.J);
                        this.f3810b.notifyDataSetChanged();
                    }
                    this.f3810b.a(this.ad);
                    i.f61546a = user2;
                    i.f61547b = user.getFavoritingCount();
                    h(this.J);
                    if (L()) {
                        if (this.ab != null) {
                            this.ab.dispose();
                        }
                        if (PatchProxy.isSupport(new Object[0], this, i, false, 69241, new Class[0], com.ss.android.ugc.aweme.profile.viewmodel.a.class)) {
                            aVar = (com.ss.android.ugc.aweme.profile.viewmodel.a) PatchProxy.accessDispatch(new Object[0], this, i, false, 69241, new Class[0], com.ss.android.ugc.aweme.profile.viewmodel.a.class);
                        } else {
                            if (this.aa == null) {
                                this.aa = new com.ss.android.ugc.aweme.profile.viewmodel.a();
                            }
                            aVar = this.aa;
                        }
                        long j2 = this.J.roomId;
                        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, aVar, com.ss.android.ugc.aweme.profile.viewmodel.a.f63183a, false, 70074, new Class[]{Long.TYPE}, Observable.class)) {
                            observable = (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, aVar, com.ss.android.ugc.aweme.profile.viewmodel.a.f63183a, false, 70074, new Class[]{Long.TYPE}, Observable.class);
                        } else {
                            observable = aVar.f63184b.roomInfo(j2, 3);
                        }
                        this.ab = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new eh(this), ei.f62737b);
                    } else {
                        a((RoomStruct) null);
                    }
                    ProfileTabFactory profileTabFactory = new ProfileTabFactory();
                    profileTabFactory.f76390b = 0;
                    this.E.H.a(this.l, profileTabFactory, this, this.l.getCurrentItem());
                    this.E.h(user2);
                    if (this.j != null) {
                        this.j.a(user2);
                    }
                    i();
                    if (PatchProxy.isSupport(new Object[0], this, i, false, 69182, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, i, false, 69182, new Class[0], Void.TYPE);
                    } else if (!this.aw) {
                        int p = p();
                        AwemeListFragment a2 = a((ProfileListFragment) k(p));
                        if (a2 != null) {
                            a2.r = this.f3814f;
                            a2.f3789f = this.G == p;
                            a2.g = this.ai;
                            a2.u = this.G == p;
                            a2.a(this.ad, this.af);
                            a2.a(this.aA);
                            a2.o();
                            a2.b(this.aC, this.am);
                            a2.F = this.al;
                            if (!this.ai) {
                                G();
                            }
                        }
                        ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
                        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                            ((UserStateFragment) profileListFragment).f57360b = this.f3814f;
                            profileListFragment.a(this.ad, this.af);
                            if (!this.ai) {
                                G();
                            }
                        }
                        int q = q();
                        AwemeListFragment a3 = a((ProfileListFragment) k(q));
                        if (a3 != null) {
                            a3.r = this.f3814f;
                            a3.f3789f = this.G == q;
                            a3.g = this.ai;
                            a3.u = this.G == q;
                            a3.a(this.ad, this.af);
                            a3.a(this.aA);
                            a3.b(this.aC, this.am);
                            a3.H = this.an;
                            a3.F = this.al;
                            if (!this.ai) {
                                G();
                            }
                        }
                        this.aw = true;
                    }
                    if (getActivity() != null && isAdded()) {
                        String uid = this.J.getUid();
                        String secUid = this.J.getSecUid();
                        if (PatchProxy.isSupport(new Object[]{uid, secUid}, this, i, false, 69207, new Class[]{String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{uid, secUid}, this, i, false, 69207, new Class[]{String.class, String.class}, Void.TYPE);
                        } else {
                            if (PatchProxy.isSupport(new Object[]{uid, secUid}, this, i, false, 69212, new Class[]{String.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{uid, secUid}, this, i, false, 69212, new Class[]{String.class, String.class}, Void.TYPE);
                            } else {
                                if (this.J.getGeneralPermission() == null || this.J.getGeneralPermission().getOriginalList() == 0) {
                                    ProfileListFragment profileListFragment2 = (ProfileListFragment) k(0);
                                    if (profileListFragment2 instanceof OriginMusicListFragment) {
                                        OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) profileListFragment2;
                                        originMusicListFragment.a(uid, secUid);
                                        if (o()) {
                                            originMusicListFragment.a(uid);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (PatchProxy.isSupport(new Object[0], this, i, false, 69210, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, i, false, 69210, new Class[0], Void.TYPE);
                    } else {
                        final an<Boolean> isLike2DynamicBubbleHasShowed = SharePrefCache.inst().getIsLike2DynamicBubbleHasShowed();
                        if (!((Boolean) isLike2DynamicBubbleHasShowed.c()).booleanValue() && AbTestManager.a().aU()) {
                            int s = s();
                            ProfileListFragment profileListFragment3 = (ProfileListFragment) k(s);
                            if (profileListFragment3 != null && (profileListFragment3 instanceof UserStateFragment)) {
                                final View a4 = this.E.H.a(s);
                                a4.post(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f62402a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f62402a, false, 69259, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f62402a, false, 69259, new Class[0], Void.TYPE);
                                        } else if (UserProfileFragment.this.getActivity() != null && !UserProfileFragment.this.getActivity().isFinishing() && !UserProfileFragment.this.n.isShowing()) {
                                            UserProfileFragment.this.n.a(a4, 48, true, 0.0f);
                                            isLike2DynamicBubbleHasShowed.a(Boolean.TRUE);
                                        }
                                    }
                                });
                            }
                        }
                    }
                    if (PatchProxy.isSupport(new Object[0], this, i, false, 69204, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, i, false, 69204, new Class[0], Void.TYPE);
                    } else if (this.J != null) {
                        ab a5 = ab.a();
                        String uid2 = this.J.getUid();
                        if (PatchProxy.isSupport(new Object[]{uid2}, a5, ab.f39287a, false, 31866, new Class[]{String.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{uid2}, a5, ab.f39287a, false, 31866, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            z = a5.f39289b.contains(uid2);
                        }
                        if (!z) {
                            ab a6 = ab.a();
                            String uid3 = this.J.getUid();
                            if (PatchProxy.isSupport(new Object[]{uid3}, a6, ab.f39287a, false, 31864, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{uid3}, a6, ab.f39287a, false, 31864, new Class[]{String.class}, Void.TYPE);
                            } else {
                                a6.f39289b.add(uid3);
                            }
                            if (this.J.getDefaultAdCoverUrl() != null) {
                                com.ss.android.ugc.aweme.commercialize.log.d.a().a("starpage_ad").b("show").d("top_bar").g("{}").c(this.J.getAdOrderId()).a(getContext());
                                if (this.J.getDefaultAdCoverUrl() != null) {
                                    com.ss.android.ugc.aweme.commercialize.log.d.a().a("starpage_ad").b("show").d("link").g("{}").c(this.J.getAdOrderId()).a(getContext());
                                }
                            }
                        }
                    }
                    if (this.at) {
                        com.ss.android.ugc.aweme.app.d.d a7 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.ap).a("rec_uid", this.ad).a("rec_from_type", this.av).a("rec_reason_previous", this.au).a("rec_reason_in_profile", user.getRecommendReasonRelation());
                        if (getArguments() != null && getArguments().getInt("is_cold_launch", 0) == 1) {
                            a7.a("is_cold_launch", getArguments().getInt("is_cold_launch", 0));
                        }
                        r.a("rec_reason_comparison", (Map) a7.f34114b);
                        return;
                    }
                    if (TextUtils.equals(this.am, "homepage_hot") && this.P != null && this.P.getRelationLabel() != null && this.P.getRelationLabel().isValid()) {
                        r.a("rec_reason_comparison", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.am).a("rec_uid", this.ad).a("rec_from_type", "video").a("rec_reason_previous", this.P.getRelationLabel().getLabelInfo()).a("rec_reason_in_profile", user.getRecommendReasonRelation()).f34114b);
                    }
                }
            }
        }
    }

    public final void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, i, false, 69221, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, i, false, 69221, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        if (urlModel != null && isViewValid() && this.as) {
            com.ss.android.ugc.aweme.base.c.b(this.adBottomAvatar, urlModel);
        }
    }

    public final void a(String str, int i2, BlueVBrandInfo blueVBrandInfo, User user) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), blueVBrandInfo, user}, this, i, false, 69222, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), blueVBrandInfo, user}, this, i, false, 69222, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE);
            return;
        }
        super.a(str, i2, blueVBrandInfo, user);
        if (this.mTitle != null) {
            this.mTitle.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62406a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f62406a, false, 69260, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62406a, false, 69260, new Class[0], Void.TYPE);
                        return;
                    }
                    if (UserProfileFragment.this.mTitle != null) {
                        int measuredWidth = UserProfileFragment.this.mTitle.getMeasuredWidth();
                        int screenWidth = UIUtils.getScreenWidth(GlobalContext.getContext());
                        if (measuredWidth > 0) {
                            int max = Math.max((screenWidth - measuredWidth) / 2, (int) UIUtils.dip2Px(GlobalContext.getContext(), 128.0f));
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) UserProfileFragment.this.mTitle.getLayoutParams();
                            layoutParams.rightMargin = max;
                            if (Build.VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginEnd(max);
                            }
                        }
                        UserProfileFragment.this.mTitle.requestLayout();
                    }
                }
            });
        }
    }

    public final void a(View view, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69232, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Byte.valueOf(z)}, this, i, false, 69232, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i2;
        String q = q(i2);
        if ("trends".equals(q)) {
            if (PatchProxy.isSupport(new Object[0], this, i, false, 69233, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, i, false, 69233, new Class[0], Void.TYPE);
            } else {
                ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
                if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                    ((UserStateFragment) profileListFragment).a();
                }
            }
        }
        if (this.X) {
            this.X = false;
        } else if (!TextUtils.isEmpty(q) && !z && this.ak) {
            r.a("change_profile_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").a("enter_method", "slide").a("tab_name", q).f34114b);
        }
        if (!z && this.ak) {
            P();
            O();
        }
    }

    private d N() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69227, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, i, false, 69227, new Class[0], d.class);
        }
        if (this.aB == null) {
            this.aB = new a(this, (byte) 0);
        }
        return this.aB;
    }

    private void O() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69236, new Class[0], Void.TYPE);
            return;
        }
        this.R = System.currentTimeMillis();
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69183, new Class[0], Void.TYPE);
            return;
        }
        r.a("click_profile_photo", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", this.ad).f34114b);
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69167, new Class[0], Void.TYPE);
            return;
        }
        b(this.ad, this.af);
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69174, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null && isAdded() && this.ai) {
            G();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69211, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        j(this.J);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69173, new Class[0], Void.TYPE);
            return;
        }
        e(this.ad);
        M();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 69240, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("others_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, i, false, 69240, new Class[0], Analysis.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() throws Exception {
        this.J.setFollowerStatus(0);
        if (this.J.getFollowStatus() == 2) {
            this.J.setFollowStatus(1);
        }
        this.E.a(this.J.getFollowStatus(), this.J.getFollowerStatus());
        a(this.J.getFollowStatus(), this.J.getFollowerStatus());
    }

    private void E() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69161, new Class[0], Void.TYPE);
            return;
        }
        if (this.mFastChatBtn != null && this.mFastChatBtn.getVisibility() == 0) {
            if (com.ss.android.g.a.a()) {
                com.ss.android.ugc.aweme.base.c.a(this.mFastChatBtn, 2130839295);
                return;
            }
            com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.mFastChatBtn, 2);
        }
    }

    private void F() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69163, new Class[0], Void.TYPE);
            return;
        }
        b(this.ad, this.af);
        if (k.a() && (TextUtils.isEmpty(this.ad) || TextUtils.equals(this.ad, com.ss.android.ugc.aweme.account.d.a().getCurUserId()))) {
            this.mRightMoreBtn.setVisibility(8);
        }
        if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
            ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).a((TextView) null, this.mRightMoreBtn);
        }
    }

    private void J() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69180, new Class[0], Void.TYPE);
            return;
        }
        if (this.P != null && this.P.isAppAd()) {
            c.a().a(com.ss.android.downloadlib.c.k.c(getContext()), this.adBottomMoreBtn.hashCode(), N(), (com.ss.android.download.api.b.c) com.ss.android.ugc.aweme.app.c.d.d.a(getContext(), this.P));
        }
    }

    private void M() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69213, new Class[0], Void.TYPE);
            return;
        }
        this.f3810b = new ProfileFragmentAdapter3(getChildFragmentManager(), this.v, this.w);
        this.l.setAdapter(this.f3810b);
        ProfileTabFactory profileTabFactory = new ProfileTabFactory();
        profileTabFactory.f76390b = 0;
        this.E.H.a(this.l, profileTabFactory);
        this.l.addOnPageChangeListener(this);
    }

    private void P() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69237, new Class[0], Void.TYPE);
            return;
        }
        if (this.R > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.R;
            if (currentTimeMillis > 0) {
                String q = q(this.G);
                if (!TextUtils.isEmpty(q)) {
                    ap apVar = (ap) new ap().b("others_homepage").a(String.valueOf(currentTimeMillis)).j(q);
                    if ("trends".equals(q)) {
                        apVar.c("list");
                    }
                    apVar.e();
                }
            }
            this.R = -1;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69170, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.E.j();
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69165, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.c.a(this.adBottomDescLL);
        com.ss.android.ugc.aweme.utils.c.a(this.adBottomCloseBtn);
        com.ss.android.ugc.aweme.utils.c.a(this.adBottomAvatar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        FollowViewModel followViewModel;
        r.a("remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69243, new Class[0], FollowViewModel.class)) {
            followViewModel = (FollowViewModel) PatchProxy.accessDispatch(new Object[0], this, i, false, 69243, new Class[0], FollowViewModel.class);
        } else {
            if (this.aL == null) {
                this.aL = new FollowViewModel(this);
            }
            followViewModel = this.aL;
        }
        followViewModel.a(this.J.getUid(), new ek(this), new el(this));
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69155, new Class[0], Void.TYPE);
            return;
        }
        if (this.W != null) {
            this.W.b();
            this.W = null;
        }
        super.onDestroyView();
        if (this.ac != null) {
            this.ac.k();
            this.ac = null;
        }
        this.E.f();
        if (this.J != null) {
            ab.a().a(this.J.getUid());
        }
        if (this.ab != null) {
            this.ab.dispose();
        }
    }

    public final boolean q_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69189, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 69189, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.ar = false;
        if (this.p != null && this.s) {
            return this.p.a();
        }
        if (this.Y) {
            this.M.a();
        }
        return false;
    }

    public final boolean w() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 69220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof MainActivity) {
                if (!((MainActivity) activity).isFeedPage()) {
                    return true;
                }
                return false;
            } else if (activity instanceof DetailActivity) {
                if (!((DetailActivity) activity).c()) {
                    return true;
                }
                return false;
            } else if (activity instanceof UserProfileActivity) {
                return true;
            }
        }
        return false;
    }

    private void G() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69177, new Class[0], Void.TYPE);
            return;
        }
        Fragment k = k(this.G);
        if (k == null && this.f3810b != null) {
            this.f3810b.f62238b = this.G;
        }
        if (this.J != null) {
            GeneralPermission generalPermission = this.J.getGeneralPermission();
            if (generalPermission != null && (((k instanceof OriginMusicListFragment) || (k instanceof EffectListFragment)) && generalPermission.getOriginalList() == 1)) {
                ((com.ss.android.ugc.aweme.common.f.c) k).y_();
                return;
            }
        }
        if (k instanceof ProfileListFragment) {
            if (this.J != null) {
                ProfileListFragment profileListFragment = (ProfileListFragment) k;
                profileListFragment.c(this.J.isBlock);
                profileListFragment.d(this.J.isBlocked());
            }
            ProfileListFragment profileListFragment2 = (ProfileListFragment) k;
            if (profileListFragment2.j()) {
                profileListFragment2.a(h());
                profileListFragment2.a(this.ad, this.af);
                profileListFragment2.H_();
            }
        }
    }

    private boolean L() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69203, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 69203, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.J == null || TextUtils.isEmpty(this.ad) || !TextUtils.equals(this.ad, this.J.getUid())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.J.isBlock() || this.J.isBlocked() || !this.J.isLive() || TextUtils.equals(this.ap, "live") || !b(this.J, 0) || (AbTestManager.a().g() != 1 && AbTestManager.a().g() != 2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void D() {
        if (!com.ss.android.ugc.aweme.c.a.a.a(this.mRightMoreBtn) && isViewValid() && getActivity() != null) {
            if (com.ss.android.g.a.a()) {
                if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
                    ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).z();
                }
            } else if (this.J != null) {
                Intent intent = new Intent(getActivity(), ProfileMoreActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(AllStoryActivity.f73306b, this.J);
                bundle.putString("enter_from", this.ap);
                bundle.putString("aweme_id", this.al);
                bundle.putString("request_id", this.ao);
                bundle.putString("from", this.F);
                bundle.putString("profile_from", this.ag);
                bundle.putInt("follow_status", this.S.getmFollowStatus());
                bundle.putSerializable("aweme_list", this.T.D());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
    }

    public final void n() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69171, new Class[0], Void.TYPE);
            return;
        }
        this.az = false;
        if (isViewValid()) {
            super.n();
            if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
                ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).y();
            }
            if (this.Y) {
                int screenWidth = UIUtils.getScreenWidth(com.ss.android.ugc.aweme.base.utils.d.a());
                if (getContext() != null) {
                    i2 = (int) UIUtils.dip2Px(getContext(), 100.0f);
                } else {
                    i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                }
                com.ss.android.ugc.aweme.base.c.a(this.mUserCover, com.ss.android.ugc.aweme.common.e.a.a(), screenWidth / 2, i2);
            }
            AwemeListFragment a2 = a((ProfileListFragment) k(q()));
            if (a2 != null) {
                a2.C();
            }
            AwemeListFragment a3 = a((ProfileListFragment) k(p()));
            if (a3 != null) {
                a3.C();
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
            if (profileListFragment instanceof UserStateFragment) {
                ((UserStateFragment) profileListFragment).c();
            }
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69154, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
            ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).E();
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69181, new Class[0], Void.TYPE);
        } else if (this.P != null && this.P.isAppAd()) {
            c.a().a(this.P.getAwemeRawAd().getDownloadUrl(), this.adBottomMoreBtn.hashCode());
        }
        P();
        if (this.aJ != null) {
            this.aJ.f54177d.setValue(Boolean.FALSE);
            this.aJ.f54177d.setValue(Boolean.FALSE);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69150, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.S.isFromLive()) {
            this.S.setFromLive(false);
            if (this.ac == null) {
                this.ac = new ae();
                this.ac.a(this);
            }
            this.ac.a(this.ad, this.af, this.ae);
            f();
        }
        J();
        if (this.ak) {
            this.Q = System.currentTimeMillis();
            O();
        }
        if (!com.ss.android.g.a.b() && !TextUtils.isEmpty(this.ad)) {
            com.ss.android.ugc.aweme.im.b.a().cleanFeedUpdateCount(this.ad);
        }
        if (this.aJ != null && this.aJ.a() && TextUtils.equals((CharSequence) this.aJ.f54178e.getValue(), "page_profile")) {
            this.aJ.f54177d.setValue(Boolean.TRUE);
        }
        if (this.aJ != null) {
            this.aJ.f54177d.setValue(Boolean.TRUE);
        }
        this.E.d();
        if (this.j != null) {
            this.j.a(this.J);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r1.equals("counsel") != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = i
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 69198(0x10e4e, float:9.6967E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = i
            r5 = 0
            r6 = 69198(0x10e4e, float:9.6967E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            boolean r1 = r1.isAd()
            if (r1 != 0) goto L_0x0033
            return
        L_0x0033:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.P
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            java.lang.String r2 = r2.getOpenUrl()
            java.lang.String r1 = r1.getType()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x004e
            return
        L_0x004e:
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1354573786: goto L_0x0092;
                case 96801: goto L_0x0088;
                case 117588: goto L_0x007e;
                case 3083120: goto L_0x0074;
                case 3148996: goto L_0x006a;
                case 957829685: goto L_0x0061;
                case 1893962841: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x009c
        L_0x0057:
            java.lang.String r0 = "redpacket"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 6
            goto L_0x009d
        L_0x0061:
            java.lang.String r4 = "counsel"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x009c
            goto L_0x009d
        L_0x006a:
            java.lang.String r0 = "form"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 5
            goto L_0x009d
        L_0x0074:
            java.lang.String r0 = "dial"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 4
            goto L_0x009d
        L_0x007e:
            java.lang.String r0 = "web"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 1
            goto L_0x009d
        L_0x0088:
            java.lang.String r0 = "app"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 3
            goto L_0x009d
        L_0x0092:
            java.lang.String r0 = "coupon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 2
            goto L_0x009d
        L_0x009c:
            r0 = -1
        L_0x009d:
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00da;
                case 3: goto L_0x010f;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x010f
        L_0x00a1:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.I(r0, r1)
            goto L_0x010f
        L_0x00b4:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.F(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            goto L_0x010f
        L_0x00c7:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.E(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            goto L_0x010f
        L_0x00da:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.B(r0, r1)
            goto L_0x010f
        L_0x00ed:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r2)
            if (r0 == 0) goto L_0x00fd
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.v(r0, r1)
            goto L_0x010f
        L_0x00fd:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.C(r0, r1)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.log.g.A(r0, r1)
        L_0x010f:
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.P
            com.ss.android.ugc.aweme.commercialize.feed.e r2 = r9.ax
            r3 = 8
            com.ss.android.ugc.aweme.commercialize.c.b r4 = r9.V
            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (com.ss.android.ugc.aweme.commercialize.feed.e) r2, (int) r3, (com.ss.android.ugc.aweme.commercialize.c.b) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.K():void");
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69172, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            super.g();
            this.az = false;
            if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
                com.ss.android.ugc.aweme.profile.ui.header.aa aaVar = (com.ss.android.ugc.aweme.profile.ui.header.aa) this.E;
                if (PatchProxy.isSupport(new Object[0], aaVar, com.ss.android.ugc.aweme.profile.ui.header.aa.ai, false, 69506, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aaVar, com.ss.android.ugc.aweme.profile.ui.header.aa.ai, false, 69506, new Class[0], Void.TYPE);
                } else {
                    aaVar.a(false);
                    aaVar.aO = null;
                    aaVar.setOpenRecommendCardButtonState(0);
                }
            }
            AwemeListFragment a2 = a((ProfileListFragment) k(q()));
            if (a2 != null) {
                a2.C();
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                ((UserStateFragment) profileListFragment).c();
            }
            AwemeListFragment a3 = a((ProfileListFragment) k(p()));
            if (a3 != null) {
                a3.C();
            }
        }
    }

    public final void a(at atVar) {
        this.ay = atVar;
    }

    public final void g(String str) {
        this.aM = str;
    }

    public final void j(String str) {
        this.an = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(RoomResponse roomResponse) throws Exception {
        a(roomResponse.data);
    }

    private static AwemeListFragment a(ProfileListFragment profileListFragment) {
        if (profileListFragment instanceof AwemeListFragment) {
            return (AwemeListFragment) profileListFragment;
        }
        return null;
    }

    public final void k(String str) {
        if (this.aF != null) {
            this.aF.F = this.al;
        }
        if (this.T != null) {
            this.T.F = this.al;
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void RefreshProfileAfterBlockEvent(com.ss.android.ugc.aweme.profile.a.f fVar) {
        com.ss.android.ugc.aweme.profile.a.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, i, false, 69238, new Class[]{com.ss.android.ugc.aweme.profile.a.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, i, false, 69238, new Class[]{com.ss.android.ugc.aweme.profile.a.f.class}, Void.TYPE);
            return;
        }
        r(fVar2.f61232a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ao a(ao aoVar) {
        String str;
        if (this.S != null) {
            str = this.S.getmPreviousPage();
        } else {
            str = "";
        }
        aoVar.c(str).f(this.P).k(this.ad).i(this.al).h(this.aM).a(this.aN);
        if ("poi_page".equalsIgnoreCase(str)) {
            aoVar.b("poi_page");
        }
        return aoVar;
    }

    public final void c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 69164, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 69164, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.c(view);
    }

    public final void i(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 69217, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 69217, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.S.setmPreviousPage(str2);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.profile.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, i, false, 69194, new Class[]{com.ss.android.ugc.aweme.profile.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, i, false, 69194, new Class[]{com.ss.android.ugc.aweme.profile.a.b.class}, Void.TYPE);
            return;
        }
        if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
            ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).E();
        }
    }

    @Subscribe
    public void onMobRequestIdEvent(x xVar) {
        if (PatchProxy.isSupport(new Object[]{xVar}, this, i, false, 69192, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar}, this, i, false, 69192, new Class[]{x.class}, Void.TYPE);
            return;
        }
        this.ao = xVar.f45320a;
        this.S.setmRequestId(this.ao);
    }

    private void a(@Nullable RoomStruct roomStruct) {
        if (PatchProxy.isSupport(new Object[]{roomStruct}, this, i, false, 69242, new Class[]{RoomStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct}, this, i, false, 69242, new Class[]{RoomStruct.class}, Void.TYPE);
            return;
        }
        if (!(roomStruct == null || roomStruct.owner == null)) {
            roomStruct.id = this.J.roomId;
            roomStruct.owner.setUid(this.ad);
            roomStruct.owner.setBroadcasterRoomId(this.J.roomId);
        }
        ProfileListFragment a2 = a((Integer) 0);
        if (a2 instanceof AwemeListFragment) {
            ((AwemeListFragment) a2).a(roomStruct);
        }
    }

    private void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69224, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69224, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AwemeListFragment a2 = a((ProfileListFragment) k(p()));
        AwemeListFragment a3 = a((ProfileListFragment) k(q()));
        ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
        if (a3 != null) {
            a3.c(z);
        }
        if (a2 != null) {
            a2.c(z);
        }
        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
            profileListFragment.c(z);
        }
    }

    private void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69225, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69225, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AwemeListFragment a2 = a((ProfileListFragment) k(p()));
        if (a2 != null) {
            a2.a(z);
        }
        AwemeListFragment a3 = a((ProfileListFragment) k(q()));
        if (a3 != null) {
            a3.a(z);
        }
        ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
            profileListFragment.a(z);
        }
    }

    private void p(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69199, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69199, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            int i3 = ((FrameLayout.LayoutParams) this.adBottomLayout.getLayoutParams()).bottomMargin;
            if (i3 >= 0) {
                com.ss.android.ugc.aweme.utils.c.a(this.adBottomLayout, i3, (this.adBottomLayout.getMeasuredHeight() + 1) * -1, i2).start();
            }
        }
    }

    private String q(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69235, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69235, new Class[]{Integer.TYPE}, String.class);
        } else if (this.f3810b == null || this.f3810b.getCount() == 0 || i2 >= this.f3810b.getCount() || i2 < 0) {
            return "";
        } else {
            return eg.a((int) this.f3810b.getItemId(i2));
        }
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69216, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ProfileListFragment profileListFragment = (ProfileListFragment) k(this.G);
        if (profileListFragment instanceof AwemeListFragment) {
            AwemeListFragment awemeListFragment = (AwemeListFragment) profileListFragment;
            if (z) {
                if (AbTestManager.a().an()) {
                    awemeListFragment.z();
                }
                awemeListFragment.a(false, false);
                return;
            }
            if (AbTestManager.a().an()) {
                awemeListFragment.A();
            }
            awemeListFragment.y();
        }
    }

    public final void l(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69185, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69185, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        o(i2);
    }

    @OnClick({2131493213})
    public void onBack(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 69193, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 69193, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(this.ag, "feed_detail")) {
            getActivity().finish();
        } else if (this.ay != null) {
            this.ay.a();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        Boolean bool = (Boolean) obj;
        if (PatchProxy.isSupport(new Object[]{bool}, this, i, false, 69218, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, i, false, 69218, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().an()) {
            if (this.T != null) {
                this.T.a(bool);
            }
            if (this.aF != null) {
                this.aF.a(bool);
            }
            f(bool.booleanValue());
        }
    }

    @Subscribe
    public void onCloseWebViewLoadingJsEvent(com.ss.android.ugc.aweme.commercialize.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, i, false, 69191, new Class[]{com.ss.android.ugc.aweme.commercialize.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, i, false, 69191, new Class[]{com.ss.android.ugc.aweme.commercialize.b.c.class}, Void.TYPE);
            return;
        }
        if (isActive() && this.Y) {
            this.M.b();
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.detail.ui.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, i, false, 69196, new Class[]{com.ss.android.ugc.aweme.detail.ui.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, i, false, 69196, new Class[]{com.ss.android.ugc.aweme.detail.ui.a.class}, Void.TYPE);
            return;
        }
        if (getActivity() != null && (getActivity() instanceof UserProfileActivity)) {
            getActivity().finish();
            getActivity().overridePendingTransition(0, 0);
        }
    }

    @Subscribe
    public void onFeedAdClickCouponEvent(com.ss.android.ugc.aweme.commercialize.b.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, i, false, 69230, new Class[]{com.ss.android.ugc.aweme.commercialize.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, i, false, 69230, new Class[]{com.ss.android.ugc.aweme.commercialize.b.d.class}, Void.TYPE);
            return;
        }
        Aweme aweme = dVar.f38509a;
        int i2 = dVar.f38510b;
        if (com.ss.android.ugc.aweme.commercialize.utils.c.a(com.ss.android.ugc.aweme.commercialize.utils.c.n(aweme)) && i2 == 8 && this.W != null) {
            this.W.a(i2);
        }
    }

    @Subscribe
    public void onFeedAdClickFormEvent(com.ss.android.ugc.aweme.commercialize.b.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, i, false, 69229, new Class[]{com.ss.android.ugc.aweme.commercialize.b.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, i, false, 69229, new Class[]{com.ss.android.ugc.aweme.commercialize.b.e.class}, Void.TYPE);
            return;
        }
        Aweme aweme = eVar.f38511a;
        int i2 = eVar.f38512b;
        CardStruct m = com.ss.android.ugc.aweme.commercialize.utils.c.m(aweme);
        if (m != null && m.getCardType() == 1 && i2 == 8 && this.W != null) {
            this.W.e();
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69228, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69228, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (this.aK != null) {
            this.aK.a(z);
        }
        this.E.f(z);
    }

    public void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69176, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69176, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onPageSelected(i2);
        G();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 69175, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 69175, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            bundle.putString("userId", this.ad);
            bundle.putString("sec_user_id", this.af);
        }
        super.onSaveInstanceState(bundle);
    }

    public void setUserVisibleHintCompat(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69178, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69178, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHintCompat(z);
        Fragment k = k(this.G);
        if (k != null) {
            k.setUserVisibleHint(z);
        }
    }

    private void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 69200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 69200, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && !this.aq && ((this.ax.b() || this.ax.e()) && this.ax.d())) {
            int i2 = ((FrameLayout.LayoutParams) this.adBottomLayout.getLayoutParams()).bottomMargin;
            if (i2 < 0) {
                com.ss.android.ugc.aweme.utils.c.a(this.adBottomLayout, i2, 0, (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).start();
            }
            if (z) {
                g.z(getContext(), this.P);
            }
        }
    }

    private void o(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69160, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69160, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mFastChatBtn != null && this.mFastFollowBtn != null) {
            if (i2 == 0) {
                this.mFastFollowBtn.setVisibility(0);
                this.mFastChatBtn.setVisibility(8);
                this.mFastFollowBtn.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62394a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f62394a, false, 69255, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f62394a, false, 69255, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (UserProfileFragment.this.E != null && (UserProfileFragment.this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa)) {
                            ((com.ss.android.ugc.aweme.profile.ui.header.aa) UserProfileFragment.this.E).setFollowFromTitleBar(true);
                            ((com.ss.android.ugc.aweme.profile.ui.header.aa) UserProfileFragment.this.E).m((View) null);
                        }
                    }
                });
            } else if (i2 == 1 || i2 == 2) {
                this.mFastFollowBtn.setVisibility(8);
                this.mFastChatBtn.setVisibility(0);
                this.mFastChatBtn.setEnabled(true);
                this.mFastChatBtn.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62396a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f62396a, false, 69256, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f62396a, false, 69256, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (!(UserProfileFragment.this.E == null || !(UserProfileFragment.this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) || UserProfileFragment.this.J == null)) {
                            if (TimeLockRuler.isTeenModeON()) {
                                com.bytedance.ies.dmt.ui.d.a.c(UserProfileFragment.this.getContext(), (int) C0906R.string.cif).a();
                                return;
                            }
                            IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
                            if (com.ss.android.ugc.aweme.im.b.b() && a2 != null) {
                                Aweme aweme = UserProfileFragment.this.S.getmAweme();
                                if (UserProfileFragment.this.b(aweme)) {
                                    JsonObject jsonObject = new JsonObject();
                                    jsonObject.addProperty("log_extra", aweme.getAwemeRawAd().getLogExtra());
                                    jsonObject.addProperty("creative_id", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
                                    a2.wrapperChatWithSyncXAlert(UserProfileFragment.this.getActivity(), com.ss.android.ugc.aweme.im.b.a(UserProfileFragment.this.J), 2, new com.ss.android.ugc.aweme.im.service.model.a(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
                                } else {
                                    a2.wrapperChatWithSyncXAlert(UserProfileFragment.this.getActivity(), com.ss.android.ugc.aweme.im.b.a(UserProfileFragment.this.J), 2);
                                }
                                com.ss.android.ugc.aweme.im.f.a(UserProfileFragment.this.J.getUid());
                                com.ss.android.ugc.aweme.im.f.a(UserProfileFragment.this.S.getmUserId(), UserProfileFragment.this.S.getmAwemeId(), UserProfileFragment.this.S.getmEventType(), UserProfileFragment.this.S.getmRequestId(), "top_bar_follow_button");
                                if (UserProfileFragment.this.b(aweme)) {
                                    g.u(UserProfileFragment.this.getContext(), aweme);
                                }
                            }
                        }
                    }
                });
                E();
            } else {
                if (i2 == 4) {
                    this.mFastFollowBtn.setVisibility(0);
                    this.mFastChatBtn.setVisibility(8);
                    this.mFastFollowBtn.setText(C0906R.string.agl);
                    this.mFastFollowBtn.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837909));
                    this.mFastFollowBtn.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f62398a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f62398a, false, 69257, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f62398a, false, 69257, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (UserProfileFragment.this.E != null && (UserProfileFragment.this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa)) {
                                ((com.ss.android.ugc.aweme.profile.ui.header.aa) UserProfileFragment.this.E).k(null);
                            }
                        }
                    });
                }
            }
        }
    }

    private void r(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69239, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69239, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AwemeListFragment a2 = a((ProfileListFragment) k(p()));
        AwemeListFragment a3 = a((ProfileListFragment) k(q()));
        ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
        if (i2 == 1) {
            g();
            h(true);
            this.J.setFollowStatus(0);
            if (a3 != null) {
                a3.y_();
            }
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                ((UserStateFragment) profileListFragment).d();
            }
            if (this.E != null) {
                this.E.d(0);
                this.E.e(0);
                this.E.g(0);
            }
            bg.a(new com.ss.android.ugc.aweme.feed.f.b());
            return;
        }
        if (this.ac != null) {
            this.ac.a(this.ad, this.af);
        }
        h(false);
        if (h()) {
            i(true);
            if (a2 != null) {
                a2.m();
            }
            if (a3 != null) {
                a3.m();
            }
        } else {
            if (a2 != null) {
                a2.x();
            }
            if (a3 != null) {
                a3.x();
            }
        }
    }

    public final void a(float f2) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, i, false, 69184, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, i, false, 69184, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (!k.a()) {
            this.mRightMoreBtn.setAlpha(f2);
            ImageView imageView = this.mRightMoreBtn;
            if (f2 != 1.0f) {
                z = false;
            }
            imageView.setClickable(z);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, i, false, 69219, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, i, false, 69219, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.b(exc);
        this.aj = true;
    }

    public final void h(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 69169, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 69169, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.am = str;
        this.S.setmEventType(this.am);
        this.S.setmPreviousPage(this.am);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(User user) {
        if (this.J != null && user != null && TextUtils.equals(this.J.getUid(), user.getUid())) {
            this.J.setBlock(user.isBlock());
            this.J.setStoryBlockInfo(user.getStoryBlockInfo());
            if (!TextUtils.equals(this.J.getRemarkName(), user.getRemarkName())) {
                this.J.setRemarkName(user.getRemarkName());
                this.ac.a(this.J);
                this.E.h(this.J);
            }
            if (this.J.isBlock()) {
                a((RoomStruct) null);
            }
            if (this.J.getFollowStatus() != user.getFollowStatus() || this.J.getFollowerStatus() != user.getFollowerStatus()) {
                this.J.setFollowStatus(user.getFollowStatus());
                this.J.setFollowerStatus(user.getFollowerStatus());
                this.E.a(this.J.getFollowStatus(), this.J.getFollowerStatus());
                a(this.J.getFollowStatus(), this.J.getFollowerStatus());
            }
        }
    }

    @OnClick({2131492953, 2131492955, 2131492956, 2131492954, 2131492952})
    public void onAdBottomClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 69197, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 69197, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bh) {
            this.aq = true;
            p(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        } else if (id != C0906R.id.bj && id != C0906R.id.bi && id != C0906R.id.bg) {
            if (id == C0906R.id.bk) {
                K();
            }
        } else if (com.ss.android.g.a.a()) {
            K();
        } else {
            String str = "";
            if (this.P != null && this.P.isAd()) {
                str = this.P.getAwemeRawAd().getOpenUrl();
            }
            if (com.ss.android.ugc.aweme.commercialize.im.f.b(str)) {
                g.v(getContext(), this.P);
            } else {
                g.C(getContext(), this.P);
                Context context = getContext();
                Aweme aweme = this.P;
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31592, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31592, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else {
                    g.d(context, "ad_click", aweme, g.f(context, aweme, "raw homepage ad ad click"));
                }
            }
            com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), this.P, this.ax, 7, this.V);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 69149, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 69149, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.profile.ui.UserProfileFragment");
        if (bundle != null) {
            this.ad = bundle.getString("userId");
            this.af = bundle.getString("sec_user_id");
        }
        if (getArguments() != null) {
            if (TextUtils.isEmpty(this.af)) {
                this.af = getArguments().getString("sec_user_id", "");
            }
            if (TextUtils.isEmpty(this.ad)) {
                this.ad = getArguments().getString("uid", "");
            }
        }
        if (getArguments() != null) {
            this.ae = getArguments().getString("unique_id", "");
        }
        super.onCreate(bundle);
        setUserVisibleHint(false);
        if (getActivity() instanceof UserProfileActivity) {
            this.ak = true;
            this.Z = true;
        }
        getChildFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62392a;

            public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment, bundle}, this, f62392a, false, 69254, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment, bundle}, this, f62392a, false, 69254, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                    return;
                }
                UserProfileFragment.this.j(UserProfileFragment.this.G);
            }
        }, false);
        this.aI = new WeakHandler(this);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, i, false, 69195, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, i, false, 69195, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(AllStoryActivity.f73306b, gVar2.itemType)) {
            dv.a(getActivity(), this.mBackBtn, gVar2);
        }
    }

    public void handleMsg(Message message) {
        String str;
        boolean z;
        int i2;
        if (PatchProxy.isSupport(new Object[]{message}, this, i, false, 69223, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, i, false, 69223, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid()) {
            int i3 = message.what;
            Object obj = message.obj;
            if (i3 == 30) {
                if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
                } else if (obj instanceof Exception) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bga).a();
                } else if (obj instanceof BlockStruct) {
                    int i4 = ((BlockStruct) obj).blockStatus;
                    User user = this.J;
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    user.setBlock(z);
                    FragmentActivity activity = getActivity();
                    Resources resources = getResources();
                    if (i4 == 1) {
                        i2 = C0906R.string.eo;
                    } else {
                        i2 = C0906R.string.dn6;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b((Context) activity, resources.getString(i2)).a();
                    if (i4 == 1) {
                        FollowStatus followStatus = new FollowStatus();
                        followStatus.userId = this.ad;
                        followStatus.followStatus = 0;
                        bg.a(followStatus);
                    }
                    if (com.ss.android.g.a.a()) {
                        r(i4);
                    }
                    com.ss.android.ugc.aweme.im.b.a().updateIMUser(com.ss.android.ugc.aweme.im.b.a(this.J));
                }
            } else if (i3 == 50) {
                ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).A();
            } else if (i3 == 53) {
                ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).C();
            } else if (i3 == 54 || i3 == 55) {
                ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).B();
            } else if (i3 == 56) {
                r.a("click_remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage").f34114b);
                a.C0185a a2 = new a.C0185a(getContext()).a((int) C0906R.string.bz3);
                if (com.ss.android.g.a.a()) {
                    str = String.format(getResources().getString(C0906R.string.bz2), new Object[]{ex.b(this.J)});
                } else {
                    str = getResources().getString(C0906R.string.bz2);
                }
                Dialog b2 = a2.b(str).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.bz1, (DialogInterface.OnClickListener) new ej(this)).a().b();
                if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                    ((TextView) b2.findViewById(C0906R.id.dhn)).setTextColor(getResources().getColor(C0906R.color.ho));
                }
            }
        }
    }

    public final void i(User user) {
        String str;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, i, false, 69226, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, i, false, 69226, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (user2 != null) {
                this.f3810b.a(this.ad);
                if (this.ac == null) {
                    this.ac = new ae();
                    this.ac.a(this);
                    this.ac.h = this.ap;
                }
                if (!TextUtils.isEmpty(user.getUid())) {
                    this.ad = user.getUid();
                }
                this.ac.a(user2, false);
                this.E.h(user2);
                if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
                    ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).setSimpleUserData(user2);
                }
                this.E.t();
                if (TextUtils.equals(user.getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                    if (this.mRightMoreBtn != null) {
                        this.mRightMoreBtn.setVisibility(8);
                    }
                } else if (k.a() && this.mRightMoreBtn != null) {
                    this.mRightMoreBtn.setVisibility(0);
                }
            }
            if (this.j != null) {
                ProfileHitRankHelper profileHitRankHelper = this.j;
                if (PatchProxy.isSupport(new Object[]{user2}, profileHitRankHelper, ProfileHitRankHelper.f42354a, false, 36383, new Class[]{User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user2}, profileHitRankHelper, ProfileHitRankHelper.f42354a, false, 36383, new Class[]{User.class}, Void.TYPE);
                } else {
                    String str2 = null;
                    if (user2 != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    CharSequence charSequence = str;
                    User user3 = profileHitRankHelper.j;
                    if (user3 != null) {
                        str2 = user3.getUid();
                    }
                    if (!TextUtils.equals(charSequence, str2)) {
                        View view = profileHitRankHelper.f42358e;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("view");
                        }
                        view.setVisibility(8);
                    }
                }
            }
            C();
        }
    }

    public final void m(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 69214, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 69214, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 == 5) {
            this.aG = (EnterpriseTabFragment) a(7);
            if (this.aG == null) {
                this.aG = new EnterpriseTabFragment();
                this.aG.f2927b = false;
            }
            a((ProfileListFragment) this.aG, (Integer) 7);
        } else if (i3 == 4) {
            this.aH = (EffectListFragment) a(6);
            if (this.aH == null) {
                this.aH = EffectListFragment.f61796d.a(B(), "", "", false);
                this.aH.k = eg.a(6);
            }
            a((ProfileListFragment) this.aH, (Integer) 6);
        } else if (i3 == 3) {
            this.aD = (OriginMusicListFragment) a(3);
            if (this.aD == null) {
                this.aD = OriginMusicListFragment.a("", false);
                this.aD.k = eg.a(3);
            }
            a((ProfileListFragment) this.aD, (Integer) 3);
        } else if (i3 == 0) {
            this.T = (AwemeListFragment) a(0);
            if (this.T == null) {
                this.T = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(-1, 0, this.ad, this.af, false, false);
                this.T.k = eg.a(0);
                if (AbTestManager.a().d().useRecyclerPartialUpdate) {
                    this.T.b(12);
                }
            }
            a((ProfileListFragment) this.T, (Integer) 0);
        } else if (i3 == 1) {
            this.aE = (UserStateFragment) a(5);
            if (this.aE == null) {
                this.aE = UserStateFragment.a("others_homepage", this.ad, this.af);
                this.aE.k = eg.a(5);
            }
            a((ProfileListFragment) this.aE, (Integer) 5);
        } else {
            if (i3 == 2) {
                this.aF = (AwemeListFragment) a(1);
                if (this.aF == null) {
                    this.aF = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(-1, 1, this.ad, this.af, false, false);
                    this.aF.k = eg.a(1);
                }
                a((ProfileListFragment) this.aF, (Integer) 1);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = i
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69205(0x10e55, float:9.6977E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 69205(0x10e55, float:9.6977E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            super.onConfigurationChanged(r19)
            int r0 = r7.L
            int r1 = r8.screenWidthDp
            if (r0 == r1) goto L_0x01e5
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 69206(0x10e56, float:9.6978E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0068
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 69206(0x10e56, float:9.6978E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00d6
        L_0x0068:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.J
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.J
            int r0 = r0.getTabType()
            switch(r0) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0090;
                case 2: goto L_0x0080;
                case 3: goto L_0x007b;
                case 4: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00a4
        L_0x0076:
            int r0 = r18.t()
            goto L_0x00a5
        L_0x007b:
            int r0 = r18.r()
            goto L_0x00a5
        L_0x0080:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aU()
            if (r0 == 0) goto L_0x008b
            goto L_0x00a4
        L_0x008b:
            int r0 = r18.q()
            goto L_0x00a5
        L_0x0090:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            boolean r0 = r0.isOpenForward()
            if (r0 == 0) goto L_0x00a4
            int r0 = r18.s()
            goto L_0x00a5
        L_0x009f:
            int r0 = r18.p()
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            if (r0 >= 0) goto L_0x00a8
            r0 = 0
        L_0x00a8:
            com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter3 r1 = r7.f3810b
            int r1 = r1.getCount()
            int r1 = r1 - r9
            int r4 = java.lang.Math.min(r1, r0)
            android.support.v4.view.ViewPager r0 = r7.l
            int r0 = r0.getCurrentItem()
            if (r0 == r4) goto L_0x00c0
            android.support.v4.view.ViewPager r0 = r7.l
            r0.setCurrentItem(r4, r10)
        L_0x00c0:
            r7.onPageSelected(r4)
            com.ss.android.ugc.aweme.views.ProfileTabFactory r2 = new com.ss.android.ugc.aweme.views.ProfileTabFactory
            r2.<init>()
            r2.f76390b = r10
            com.ss.android.ugc.aweme.profile.ui.header.a r0 = r7.E
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r0 = r0.H
            android.support.v4.view.ViewPager r1 = r7.l
            r5 = 1
            r3 = r18
            r0.a(r1, r2, r3, r4, r5)
        L_0x00d6:
            int r0 = r8.screenWidthDp
            r7.L = r0
            com.ss.android.ugc.aweme.profile.ui.header.a r0 = r7.E
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.profile.ui.header.aa
            if (r0 == 0) goto L_0x01e5
            com.ss.android.ugc.aweme.profile.ui.header.a r0 = r7.E
            com.ss.android.ugc.aweme.profile.ui.header.aa r0 = (com.ss.android.ugc.aweme.profile.ui.header.aa) r0
            int r1 = r7.L
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.header.aa.ai
            r14 = 0
            r15 = 69586(0x10fd2, float:9.7511E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0122
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.header.aa.ai
            r14 = 0
            r15 = 69586(0x10fd2, float:9.7511E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0122:
            com.ss.android.ugc.aweme.profile.d.h r2 = r0.aK
            if (r2 == 0) goto L_0x01e5
            com.ss.android.ugc.aweme.profile.d.h r2 = r0.aK
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.h.f61406a
            r14 = 0
            r15 = 69902(0x1110e, float:9.7954E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0164
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.h.f61406a
            r14 = 0
            r15 = 69902(0x1110e, float:9.7954E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0175
        L_0x0164:
            double r3 = (double) r1
            int r1 = com.ss.android.ugc.aweme.base.utils.u.a((double) r3)
            float r3 = r2.a(r1)
            r2.f61407b = r3
            float r1 = r2.b(r1)
            r2.f61408c = r1
        L_0x0175:
            com.ss.android.ugc.aweme.profile.d.h r1 = r0.aK
            int r0 = r0.aW
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.h.f61406a
            r14 = 0
            r15 = 69903(0x1110f, float:9.7955E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x01b5
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.h.f61406a
            r14 = 0
            r15 = 69903(0x1110f, float:9.7955E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x01b5:
            r1.f61409d = r0
            if (r0 != 0) goto L_0x01c0
            r1.b()
            r1.d()
            goto L_0x01e2
        L_0x01c0:
            if (r0 != r9) goto L_0x01cc
            r1.a()
            r1.e()
            r1.d()
            goto L_0x01e2
        L_0x01cc:
            r2 = 2
            if (r0 != r2) goto L_0x01d9
            r1.a()
            r1.e()
            r1.d()
            goto L_0x01e2
        L_0x01d9:
            r2 = 4
            if (r0 != r2) goto L_0x01e2
            r1.c()
            r1.d()
        L_0x01e2:
            r1.c(r0)
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Subscribe
    public void onFakeCoverAction(h hVar) {
        Integer num;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, i, false, 69190, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, i, false, 69190, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (isActive() && hVar2 != null && this.Y) {
            ProfileQuickShopContainer profileQuickShopContainer = this.M;
            DampScrollableLayout dampScrollableLayout = this.mScrollableLayout;
            if (PatchProxy.isSupport(new Object[]{hVar2, dampScrollableLayout}, profileQuickShopContainer, ProfileQuickShopContainer.f2946a, false, 32940, new Class[]{h.class, DampScrollableLayout.class}, Void.TYPE)) {
                ProfileQuickShopContainer profileQuickShopContainer2 = profileQuickShopContainer;
                PatchProxy.accessDispatch(new Object[]{hVar2, dampScrollableLayout}, profileQuickShopContainer2, ProfileQuickShopContainer.f2946a, false, 32940, new Class[]{h.class, DampScrollableLayout.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dampScrollableLayout, "scrollableLayout");
            if (!ex.g(profileQuickShopContainer.f2951f)) {
                AnimatorSet animatorSet = profileQuickShopContainer.g;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    if (hVar2 != null) {
                        num = Integer.valueOf(hVar2.f38517b);
                    } else {
                        num = null;
                    }
                    if (num != null && num.intValue() == 0) {
                        profileQuickShopContainer.d();
                        profileQuickShopContainer.h = profileQuickShopContainer.a(dampScrollableLayout, -120, 200, (Runnable) null);
                        ValueAnimator valueAnimator = profileQuickShopContainer.h;
                        if (valueAnimator != null) {
                            valueAnimator.start();
                        }
                    } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 3)) {
                        profileQuickShopContainer.d();
                        if (hVar2.f38519d - hVar2.f38518c < 200) {
                            profileQuickShopContainer.h = profileQuickShopContainer.a(dampScrollableLayout, -60, 200, (Runnable) new ProfileQuickShopContainer.h(profileQuickShopContainer, dampScrollableLayout));
                            ValueAnimator valueAnimator2 = profileQuickShopContainer.h;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        } else {
                            profileQuickShopContainer.i = profileQuickShopContainer.a(dampScrollableLayout, 0, 200, (Runnable) null);
                            ValueAnimator valueAnimator3 = profileQuickShopContainer.i;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        }
                    }
                }
            }
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, i, false, 69201, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, i, false, 69201, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid()) {
            if ((!ex.a(this.J, false) || followStatus.followStatus != 1) && TextUtils.equals(followStatus.userId, this.ad)) {
                l(followStatus.followStatus);
                if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
                    ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).a(followStatus);
                }
                if (this.J != null && followStatus.followStatus != this.J.getFollowStatus()) {
                    if (followStatus.followStatus == 0) {
                        if (this.J != null && !h()) {
                            this.J.setFollowerCount(this.J.getFollowerCount() - 1);
                            this.J.setFansCount(this.J.getFansCount() - 1);
                            if (y.a(this.J)) {
                                i3 = this.J.getFansCount();
                            } else {
                                i3 = this.J.getFollowerCount();
                            }
                            a(i3);
                            FollowerDetail b2 = y.b(this.J.getFollowerDetailList());
                            if (b2 != null) {
                                b2.setFansCount(b2.getFansCount() - 1);
                            }
                            this.J.setFollowStatus(followStatus.followStatus);
                        }
                    } else if (this.J != null && !h()) {
                        this.J.setFollowerCount(this.J.getFollowerCount() + 1);
                        this.J.setFansCount(this.J.getFansCount() + 1);
                        if (y.a(this.J)) {
                            i2 = this.J.getFansCount();
                        } else {
                            i2 = this.J.getFollowerCount();
                        }
                        a(i2);
                        FollowerDetail b3 = y.b(this.J.getFollowerDetailList());
                        if (b3 != null) {
                            b3.setFansCount(b3.getFansCount() + 1);
                        }
                        this.J.setFollowStatus(followStatus.followStatus);
                        if (this.J.isBlock()) {
                            if (this.ac != null) {
                                this.ac.a(this.ad, this.af);
                            }
                            AwemeListFragment a2 = a((ProfileListFragment) k(p()));
                            AwemeListFragment a3 = a((ProfileListFragment) k(q()));
                            if (a2 != null) {
                                a2.x();
                            }
                            if (a3 != null) {
                                a3.x();
                            }
                            ProfileListFragment profileListFragment = (ProfileListFragment) k(s());
                            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                                ((UserStateFragment) profileListFragment).a();
                            }
                        }
                    }
                    o(followStatus.followStatus);
                }
            }
        }
    }

    public final boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, i, false, 69162, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, i, false, 69162, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            return aweme.isAd();
        }
    }

    public final void a(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 69158, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 69158, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.mBackBtn.setVisibility(0);
        if (com.ss.android.g.a.c()) {
            this.mBackBtn.setImageResource(2130839370);
        }
        this.mRightMoreBtn.setVisibility(0);
        if (!k.a()) {
            this.mRightMoreBtn.setAlpha(0.0f);
        }
        if (AbTestManager.a().bK()) {
            if (com.ss.android.g.a.b()) {
                this.mRightMoreBtn.setImageResource(2130839380);
            } else if (com.ss.android.g.a.c()) {
                this.mRightMoreBtn.setImageResource(2130839381);
            }
        }
        this.mRightMoreBtn.setOnClickListener(new eg(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            String string2 = arguments.getString("sec_user_id", "");
            this.ag = arguments.getString("profile_from", "");
            this.ah = arguments.getString("previous_page", "");
            this.ap = arguments.getString("enter_from");
            this.ai = TextUtils.equals(this.ag, "feed_detail");
            this.aA = arguments.getString("enter_method");
            if (arguments.getInt("need_track_compare_recommend_reason", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.at = z;
            this.au = arguments.getString("previous_recommend_reason", "");
            this.av = arguments.getString("recommend_from_type", "");
            if (!StringUtils.isEmpty(arguments.getString("from_discover", ""))) {
                h(arguments.getString("from_discover", ""));
            }
            if (!TextUtils.isEmpty(this.ap)) {
                h(this.ap);
            }
            this.aC = arguments.getString("enter_from_request_id");
            this.an = arguments.getString("extra_previous_page_position", "other_places");
            b(string, string2);
            this.S.setmProfileFrom(this.ag);
            this.S.setmPoiId(arguments.getString("poi_id"));
            this.S.setmEnterFrom(this.ap);
            this.S.setmType(arguments.getString("type", ""));
            this.S.setmFromSearch(arguments.getString("enter_from", ""));
            this.S.setmMethodFrom(this.aA);
            this.S.setLivePreviousPage(this.ah);
            this.S.setmLiveRequestId(arguments.getString("request_id", ""));
            this.S.setmLiveRoomId(arguments.getString("room_id", ""));
            this.S.setmLiveRoomOwnerId(arguments.getString("room_owner_id", ""));
            this.S.setmLiveType(arguments.getString("user_type", ""));
            this.S.setFromFeed(arguments.getBoolean("isFromFeed", true));
            this.S.setmEnterFromRequestId(this.aC);
            this.S.setmPreviousPagePosition(this.an);
            this.S.setSceneId(arguments.getString("scene_id", ""));
        } else {
            r.a("profile_exception_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("type", "bundle == null").f34114b);
        }
        this.mTitleColorCtrl.setOnClickListener(this);
        o(this.S.getmFollowStatus());
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 69159, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 69159, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.M = (ProfileQuickShopContainer) view.findViewById(C0906R.id.c7a);
        this.N = (DmtTextView) view.findViewById(C0906R.id.c7b);
        this.O = view.findViewById(C0906R.id.c7i);
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, i, false, 69188, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, i, false, 69188, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2, i3);
        if (this.Y) {
            this.M.a(i2);
        }
    }

    private void b(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, i, false, 69166, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, i, false, 69166, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.E instanceof com.ss.android.ugc.aweme.profile.ui.header.aa) {
            ((com.ss.android.ugc.aweme.profile.ui.header.aa) this.E).a(this.ad, getFragmentManager());
        }
        if (this.az) {
            if (!L()) {
                a((RoomStruct) null);
            }
            r.a("profile_exception_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("type", "user info is loaded").a("detail", "user info is loaded, so don't request net again").a("uid", str).f34114b);
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.ae)) {
            this.ad = str;
            this.af = str2;
            this.S.setmUserId(this.ad);
            this.S.setSecUserId(this.af);
            if (!NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.app.k.a())) {
                if (!this.aj) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) com.ss.android.ugc.aweme.app.k.a(), (int) C0906R.string.bgf).a();
                }
                this.aj = true;
                return;
            }
            if (this.ac == null) {
                this.ac = new ae();
                this.ac.a(this);
                this.ac.h = this.ap;
            }
            this.ac.a(this.ad, this.af, this.ae);
            this.aj = false;
        } else {
            r.a("profile_exception_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("type", "uid == null").a("detail", "don't request user, because uid is null").a("uid", str).a(com.ss.android.ugc.aweme.app.c.f33976b, str2).a("unique_id", this.ae).f34114b);
        }
        this.aq = false;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, i, false, 69187, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, i, false, 69187, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(f2, f3);
        if (f3 > 5.0f) {
            if (!this.ar) {
                p(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            }
            this.ar = true;
            return;
        }
        if (f3 < -5.0f) {
            if (!this.ar && this.as) {
                g(false);
            }
            this.ar = true;
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, i, false, 69186, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, i, false, 69186, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        l(i2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 69152, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 69152, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!this.ai) {
            F();
        }
        this.mScrollableLayout.addView(this.E, 0);
        this.aJ = (MainAnimViewModel) ViewModelProviders.of(getActivity()).get(MainAnimViewModel.class);
        this.aJ.f54177d.observe(this, this);
        com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.more_page_user_info_change", User.class).observe(this, new ed(this));
        if (!com.ss.android.g.a.a()) {
            this.j = new ProfileHitRankHelper();
            ProfileHitRankHelper profileHitRankHelper = this.j;
            FragmentActivity activity = getActivity();
            FrameLayout frameLayout = this.mHitRankTagContainer;
            if (PatchProxy.isSupport(new Object[]{activity, this, frameLayout}, profileHitRankHelper, ProfileHitRankHelper.f42354a, false, 36381, new Class[]{FragmentActivity.class, BaseProfileFragment.class, FrameLayout.class}, Void.TYPE)) {
                ProfileHitRankHelper profileHitRankHelper2 = profileHitRankHelper;
                PatchProxy.accessDispatch(new Object[]{activity, this, frameLayout}, profileHitRankHelper2, ProfileHitRankHelper.f42354a, false, 36381, new Class[]{FragmentActivity.class, BaseProfileFragment.class, FrameLayout.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                Intrinsics.checkParameterIsNotNull(this, "fragment");
                Intrinsics.checkParameterIsNotNull(frameLayout, "parent");
                if (!com.ss.android.g.a.a()) {
                    profileHitRankHelper.f42356c = activity;
                    profileHitRankHelper.f42359f = frameLayout;
                    View inflate = LayoutInflater.from(activity).inflate(C0906R.layout.apn, frameLayout, false);
                    Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti…w_hitrank, parent, false)");
                    profileHitRankHelper.f42358e = inflate;
                    View view2 = profileHitRankHelper.f42358e;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    View findViewById = view2.findViewById(C0906R.id.coy);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.shadow_layout)");
                    profileHitRankHelper.i = (RoundShadowLayout) findViewById;
                    RoundShadowLayout roundShadowLayout = profileHitRankHelper.i;
                    if (roundShadowLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shadowLayout");
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388613;
                    layoutParams.rightMargin = (int) (-(roundShadowLayout.getShadowRadius() + ProfileHitRankHelper.k));
                    View view3 = profileHitRankHelper.f42358e;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    frameLayout.addView(view3, layoutParams);
                    profileHitRankHelper.g = this;
                    View view4 = profileHitRankHelper.f42358e;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    View findViewById2 = view4.findViewById(C0906R.id.dqb);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById<TextVi…profile_hitrank_textview)");
                    profileHitRankHelper.h = (TextView) findViewById2;
                    View view5 = profileHitRankHelper.f42358e;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    view5.setVisibility(8);
                    View view6 = profileHitRankHelper.f42358e;
                    if (view6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    view6.setOnTouchListener(new ProfileHitRankHelper.b());
                    View view7 = profileHitRankHelper.f42358e;
                    if (view7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    view7.getViewTreeObserver().addOnGlobalLayoutListener(new ProfileHitRankHelper.c(profileHitRankHelper, this, frameLayout));
                    ViewModel viewModel = ViewModelProviders.of(activity).get(RankViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ankViewModel::class.java)");
                    profileHitRankHelper.f42357d = (RankViewModel) viewModel;
                    RankViewModel rankViewModel = profileHitRankHelper.f42357d;
                    if (rankViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityViewModel");
                    }
                    MutableLiveData a2 = rankViewModel.a();
                    LifecycleOwner lifecycleOwner = profileHitRankHelper.g;
                    if (lifecycleOwner == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("owner");
                    }
                    a2.observe(lifecycleOwner, profileHitRankHelper);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 69153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 69153, new Class[0], Void.TYPE);
            return;
        }
        this.aK = new AnalysisStayTimeFragmentComponent(this, true);
        this.aK.f2737c = new ee(this);
    }

    public final void a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, i, false, 69234, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, i, false, 69234, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.X = true;
        String q = q(i2);
        if (!TextUtils.isEmpty(q)) {
            r.a("change_profile_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "others_homepage").a("enter_method", "click").a("tab_name", q).f34114b);
            this.X = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, i, false, 69151, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, i, false, 69151, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Context activity = getActivity();
        if (!TextUtils.isEmpty(this.ad)) {
            this.S.setmUserId(this.ad);
        }
        if (!TextUtils.isEmpty(this.af)) {
            this.S.setSecUserId(this.af);
        }
        if (activity == null) {
            activity = viewGroup.getContext();
        }
        az azVar = new az(activity, this, this.S, this.aI, this.f3813e);
        this.E = azVar;
        this.E.setFragment(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
