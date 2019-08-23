package com.ss.android.ugc.aweme.profile.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.ao;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.b.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.ss.android.ugc.aweme.profile.d.h;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.presenter.u;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.MChooseAccountWidget;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.survey.d;
import com.ss.android.ugc.aweme.survey.f;
import com.ss.android.ugc.aweme.survey.i;
import com.ss.android.ugc.aweme.u.o;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.t;
import com.ss.android.ugc.aweme.utils.y;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;

public class MusMyProfileFragment extends MusAbsProfileFragment implements Observer<com.ss.android.ugc.aweme.ap.a<NewUserCount>>, aa, l, r, com.ss.android.ugc.aweme.profile.ui.a.a, com.ss.android.ugc.aweme.setting.serverpush.b.a, com.ss.android.ugc.aweme.setting.serverpush.b.b {
    public static ChangeQuickRedirect af;
    public static final boolean ag = com.ss.android.ugc.aweme.g.a.a();
    public View aA;
    int aB;
    protected at aC;
    private u aD;
    private ad aE;
    private com.ss.android.ugc.aweme.profile.presenter.a aF;
    private View aG;
    private boolean aH;
    private com.ss.android.ugc.aweme.profile.ui.widget.b aI;
    private int aJ;
    private MyProfileViewModel aK;
    private View aL;
    private boolean aM = true;
    private e aN;
    private boolean aO;
    private FrameLayout aP;
    private RemoteImageView aQ;
    private boolean aR;
    private WidgetManager aS;
    private MChooseAccountWidget aT;
    private ImageView aU;
    private boolean aV;
    AnimationImageView ah;
    RecommendPointView ai;
    public NoticeView aj;
    public NoticeView ak;
    View al;
    TextView am;
    View an;
    public NoticeView ao;
    public boolean ap;
    AwemeListFragment aq;
    public int ar;
    protected c as;
    protected String at;
    public boolean au;
    public DmtTextView av;
    public ImageView aw;
    public boolean ax;
    public Handler ay = new Handler(Looper.getMainLooper());
    public i az;

    static class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62001a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<MusMyProfileFragment> f62002b;

        private a(MusMyProfileFragment musMyProfileFragment) {
            this.f62002b = new WeakReference<>(musMyProfileFragment);
        }

        public final void a(com.ss.android.ugc.aweme.survey.e eVar) {
            boolean z;
            com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f62001a, false, 68349, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f62001a, false, 68349, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f62001a, false, 68348, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62001a, false, 68348, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f62002b == null || this.f62002b.get() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                MusMyProfileFragment musMyProfileFragment = (MusMyProfileFragment) this.f62002b.get();
                if (musMyProfileFragment.az == null && musMyProfileFragment.aA != null) {
                    ViewStub viewStub = (ViewStub) musMyProfileFragment.aA.findViewById(C0906R.id.bpa);
                    if (PatchProxy.isSupport(new Object[]{viewStub}, musMyProfileFragment, MusMyProfileFragment.af, false, 68315, new Class[]{ViewStub.class}, Void.TYPE)) {
                        MusMyProfileFragment musMyProfileFragment2 = musMyProfileFragment;
                        PatchProxy.accessDispatch(new Object[]{viewStub}, musMyProfileFragment2, MusMyProfileFragment.af, false, 68315, new Class[]{ViewStub.class}, Void.TYPE);
                    } else {
                        musMyProfileFragment.az = new com.ss.android.ugc.aweme.survey.b(viewStub);
                        musMyProfileFragment.az.h = new d() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f61986a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f61986a, false, 68334, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f61986a, false, 68334, new Class[0], Void.TYPE);
                                    return;
                                }
                                MusMyProfileFragment.this.az.d();
                            }

                            public final void a(com.ss.android.ugc.aweme.survey.e eVar) {
                                com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
                                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f61986a, false, 68332, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f61986a, false, 68332, new Class[]{com.ss.android.ugc.aweme.survey.e.class}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.common.r.a("pop_survey_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("pop_survey_id", String.valueOf(eVar2.f74503b)).a("pop_survey_question", eVar2.i).a("original_id", eVar2.j).f34114b);
                            }

                            public final void a(com.ss.android.ugc.aweme.survey.e eVar, int i, String str) {
                                com.ss.android.ugc.aweme.survey.e eVar2 = eVar;
                                int i2 = i;
                                String str2 = str;
                                if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i), str2}, this, f61986a, false, 68333, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i), str2}, this, f61986a, false, 68333, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                switch (i2) {
                                    case 1:
                                        MusMyProfileFragment.this.az.e();
                                        break;
                                    case 2:
                                        MusMyProfileFragment.this.az.e();
                                        break;
                                    case 3:
                                        MusMyProfileFragment.this.az.d();
                                        break;
                                }
                                f.a().a(new com.ss.android.ugc.aweme.survey.c(i2, eVar2.f74503b, eVar2.j));
                                MusMyProfileFragment musMyProfileFragment = MusMyProfileFragment.this;
                                if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i), str2}, musMyProfileFragment, MusMyProfileFragment.af, false, 68316, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE)) {
                                    MusMyProfileFragment musMyProfileFragment2 = musMyProfileFragment;
                                    PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i), str2}, musMyProfileFragment2, MusMyProfileFragment.af, false, 68316, new Class[]{com.ss.android.ugc.aweme.survey.e.class, Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                y.a(new at(i2, eVar2, str2), "MusMyProfileFragment");
                            }
                        };
                    }
                }
                if (!(musMyProfileFragment.az == null || eVar2 == null)) {
                    musMyProfileFragment.az.i = eVar2;
                    musMyProfileFragment.ay.postDelayed(new au(musMyProfileFragment), 1000);
                }
            }
        }

        /* synthetic */ a(MusMyProfileFragment musMyProfileFragment, byte b2) {
            this(musMyProfileFragment);
        }
    }

    class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62003a;

        private b() {
        }

        public final void updateDrawState(TextPaint textPaint) {
            if (PatchProxy.isSupport(new Object[]{textPaint}, this, f62003a, false, 68352, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint}, this, f62003a, false, 68352, new Class[]{TextPaint.class}, Void.TYPE);
            } else if (MusMyProfileFragment.this.isViewValid()) {
                super.updateDrawState(textPaint);
                textPaint.setColor(MusMyProfileFragment.this.getResources().getColor(C0906R.color.s_));
                textPaint.setUnderlineText(false);
                textPaint.clearShadowLayer();
            }
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f62003a, false, 68351, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f62003a, false, 68351, new Class[]{View.class}, Void.TYPE);
                return;
            }
            MusMyProfileFragment.this.H();
            FragmentActivity activity = MusMyProfileFragment.this.getActivity();
            int i = MusMyProfileFragment.this.ar;
            if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i)}, null, DownloadControlSettingActivity.f64162e, true, 72517, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i)}, null, DownloadControlSettingActivity.f64162e, true, 72517, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(activity, DownloadControlSettingActivity.class);
            intent.putExtra("currentSettingsValue", i);
            activity.startActivity(intent);
        }

        /* synthetic */ b(MusMyProfileFragment musMyProfileFragment, byte b2) {
            this();
        }
    }

    public final void X_() {
    }

    public final void a() {
    }

    public final void a(Object obj) {
    }

    public final void a(String str, boolean z) {
    }

    public final void a(boolean z) {
    }

    public final void a(boolean z, boolean z2, boolean z3) {
    }

    public final void c() {
    }

    public final void d_(Exception exc) {
    }

    public final void e(boolean z) {
    }

    public final void f(User user) {
    }

    public final void g(int i) {
    }

    public final void h(int i) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void l() {
    }

    public final void l(int i) {
    }

    public final boolean q_() {
        return false;
    }

    public final int x() {
        return C0906R.layout.oy;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (AbTestManager.a().an()) {
            if (this.aq != null && this.v.get(this.G) == this.aq) {
                this.aq.a(bool);
            }
            if (!bool.booleanValue()) {
                if (PatchProxy.isSupport(new Object[0], this, MusAbsProfileFragment.f3797a, false, 68201, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, MusAbsProfileFragment.f3797a, false, 68201, new Class[0], Void.TYPE);
                } else {
                    if (this.j != null) {
                        this.j.clearAnimation();
                    }
                }
            } else {
                onPageSelected(this.G);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
        boolean z;
        final int i;
        an<List<String>> anVar;
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, af, false, 68310, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, af, false, 68310, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
        } else if (cVar2 != null) {
            if (cVar2.m == 1) {
                if ((this.ao == null || this.ao.getVisibility() != 0) && this.ak != null && !ex.b()) {
                    this.ay.post(new as(this));
                }
                this.ar = cVar2.l;
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68270, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, af, false, 68270, new Class[0], Void.TYPE);
                return;
            }
            if (!ex.b()) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71817, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71817, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    z = d2 == null ? false : d2.isFtcBindEnable();
                }
                if (z) {
                    AbTestManager a3 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71818, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71818, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        AbTestModel d3 = a3.d();
                        i = d3 == null ? -1 : d3.bindFGGuideTextIndex;
                    }
                    if (i >= 0) {
                        if ((com.ss.android.ugc.aweme.account.d.a().getCurUser().isHasEmail() || com.ss.android.ugc.aweme.account.d.a().getCurUser().isPhoneBinded()) && !com.ss.android.sdk.b.b.a().b()) {
                            int intValue = ((Integer) x.a().Q().c()).intValue();
                            if (intValue < 2) {
                                long longValue = ((Long) x.a().R().c()).longValue();
                                if (longValue == 0 || System.currentTimeMillis() - longValue >= TimeUnit.DAYS.toMillis(3)) {
                                    x a4 = x.a();
                                    if (PatchProxy.isSupport(new Object[0], a4, x.f2698a, false, 22437, new Class[0], an.class)) {
                                        anVar = (an) PatchProxy.accessDispatch(new Object[0], a4, x.f2698a, false, 22437, new Class[0], an.class);
                                    } else {
                                        if (a4.j == null) {
                                            a4.j = new ao(String.class, "bind_fg_guide_texts", new ArrayList(0));
                                        }
                                        anVar = a4.j;
                                    }
                                    List list = (List) anVar.c();
                                    if (!CollectionUtils.isEmpty(list) && i > 0) {
                                        int i2 = i - 1;
                                        if (i2 < list.size()) {
                                            this.aj.setTitleText((String) list.get(i2));
                                            this.aj.setOnInternalClickListener(new NoticeView.a() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f61995a;

                                                public final void b() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f61995a, false, 68341, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f61995a, false, 68341, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    MusMyProfileFragment.this.aj.setVisibility(8);
                                                    MusMyProfileFragment.this.au = false;
                                                }

                                                public final void a() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f61995a, false, 68340, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f61995a, false, 68340, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    com.ss.android.ugc.aweme.common.r.a("link_account_banner_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("content_type", i).f34114b);
                                                    MusMyProfileFragment.this.aj.setVisibility(8);
                                                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showLinkAccountDialog(MusMyProfileFragment.this.getActivity().getSupportFragmentManager(), MusMyProfileFragment.this.at, null);
                                                    MusMyProfileFragment.this.au = false;
                                                }
                                            });
                                            this.au = true;
                                            this.aj.setVisibility(0);
                                            com.ss.android.ugc.aweme.common.r.a("link_account_banner_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("content_type", i).f34114b);
                                            s(8);
                                            x.a().Q().a(Integer.valueOf(intValue + 1));
                                            x.a().R().a(Long.valueOf(System.currentTimeMillis()));
                                        }
                                    }
                                    String string = getResources().getString(C0906R.string.bdq);
                                    String string2 = getResources().getString(C0906R.string.bdr);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(C0906R.color.s_)), string.length() - string2.length(), string.length(), 17);
                                    this.aj.setTitleText((CharSequence) spannableStringBuilder);
                                    this.aj.setOnInternalClickListener(new NoticeView.a() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f61995a;

                                        public final void b() {
                                            if (PatchProxy.isSupport(new Object[0], this, f61995a, false, 68341, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f61995a, false, 68341, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            MusMyProfileFragment.this.aj.setVisibility(8);
                                            MusMyProfileFragment.this.au = false;
                                        }

                                        public final void a() {
                                            if (PatchProxy.isSupport(new Object[0], this, f61995a, false, 68340, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f61995a, false, 68340, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            com.ss.android.ugc.aweme.common.r.a("link_account_banner_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("content_type", i).f34114b);
                                            MusMyProfileFragment.this.aj.setVisibility(8);
                                            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showLinkAccountDialog(MusMyProfileFragment.this.getActivity().getSupportFragmentManager(), MusMyProfileFragment.this.at, null);
                                            MusMyProfileFragment.this.au = false;
                                        }
                                    });
                                    this.au = true;
                                    this.aj.setVisibility(0);
                                    com.ss.android.ugc.aweme.common.r.a("link_account_banner_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("content_type", i).f34114b);
                                    s(8);
                                    x.a().Q().a(Integer.valueOf(intValue + 1));
                                    x.a().R().a(Long.valueOf(System.currentTimeMillis()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, af, false, 68319, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, af, false, 68319, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.aF != null) {
            this.aF.c();
        }
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
            q.a(getActivity(), "profile_image_setting", "review_failure");
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bv);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, af, false, 68320, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, af, false, 68320, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.aF != null) {
            this.aF.b();
        }
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, af, false, 68322, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, af, false, 68322, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 4) {
            if (this.aF != null) {
                this.aF.c();
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bsd);
        }
    }

    public final boolean F() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68312, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, af, false, 68312, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.au && this.ak.getVisibility() != 0) {
            z = true;
        }
        return z;
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, af, false, 68291, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("personal_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, af, false, 68291, new Class[0], Analysis.class);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68262, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        E();
        if (this.aK != null) {
            this.aK.f63182d.setValue(Boolean.FALSE);
        }
    }

    public final boolean w() {
        if (!PatchProxy.isSupport(new Object[0], this, af, false, 68301, new Class[0], Boolean.TYPE)) {
            return super.w();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, af, false, 68301, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void J() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68290, new Class[0], Void.TYPE);
            return;
        }
        if (this.az != null && this.az.k) {
            this.az.d();
            f.a().a(new com.ss.android.ugc.aweme.survey.c(3, this.az.f(), this.az.g()));
        }
    }

    public final int B() {
        if (!PatchProxy.isSupport(new Object[0], this, af, false, 68283, new Class[0], Integer.TYPE)) {
            return ((int) UIUtils.dip2Px(getContext(), 47.0f)) + this.aG.getHeight() + this.mStatusView.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, af, false, 68283, new Class[0], Integer.TYPE)).intValue();
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68275, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.al.getMeasuredHeight(), 0.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61973a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61973a, false, 68345, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61973a, false, 68345, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = (int) floatValue;
                MusMyProfileFragment.this.aB = i;
                MusMyProfileFragment.this.al.getLayoutParams().height = i;
                MusMyProfileFragment.this.al.setAlpha(floatValue / floatValue);
                MusMyProfileFragment.this.al.requestLayout();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61975a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61975a, false, 68347, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61975a, false, 68347, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                MusMyProfileFragment.this.al.setAlpha(0.0f);
                MusMyProfileFragment.this.al.getLayoutParams().height = 0;
                MusMyProfileFragment.this.aB = 0;
                MusMyProfileFragment.this.al.setVisibility(8);
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61975a, false, 68346, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61975a, false, 68346, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                MusMyProfileFragment.this.al.setAlpha(1.0f);
                MusMyProfileFragment.this.al.setVisibility(0);
            }
        });
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void I() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68274, new Class[0], Void.TYPE);
            return;
        }
        this.as.a("download_prompt", 1);
        final int height = this.al.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) height});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61998a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61998a, false, 68342, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61998a, false, 68342, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = (int) floatValue;
                MusMyProfileFragment.this.aB = i;
                MusMyProfileFragment.this.al.getLayoutParams().height = i;
                MusMyProfileFragment.this.al.setAlpha(floatValue / ((float) height));
                MusMyProfileFragment.this.al.requestLayout();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61970a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61970a, false, 68344, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61970a, false, 68344, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                MusMyProfileFragment.this.aB = height;
                MusMyProfileFragment.this.al.setAlpha(1.0f);
                MusMyProfileFragment.this.al.getLayoutParams().height = height;
                MusMyProfileFragment.this.al.requestLayout();
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61970a, false, 68343, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61970a, false, 68343, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                MusMyProfileFragment.this.al.setAlpha(0.0f);
                MusMyProfileFragment.this.al.setVisibility(0);
            }
        });
        ofFloat.start();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68314, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68317, new Class[0], Void.TYPE);
            return;
        }
        if (!this.aV) {
            this.aV = true;
            f.a().f74511c = new a(this, (byte) 0);
            f.a().b();
        }
    }

    public String getUserId() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68305, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, af, false, 68305, new Class[0], String.class);
        } else if (TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.b(this.J))) {
            return com.ss.android.ugc.aweme.account.d.a().getCurUserId();
        } else {
            return com.ss.android.ugc.aweme.u.aa.b(this.J);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68277, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.aD != null) {
            this.aD.k();
        }
        if (this.as != null) {
            this.as.k();
        }
        if (this.aN != null) {
            this.aN.k();
        }
        f.a().c();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68263, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        com.ss.android.ugc.aweme.account.d.a().updateLeaveTime(System.currentTimeMillis());
        if (!p.a().b()) {
            J();
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68280, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("personal_homepage"));
            com.ss.android.ugc.aweme.common.r.a("click_follow_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").f34114b);
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), true, SimpleUserFragment.b.following, this.x);
            aVar.a(this.J).a();
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68281, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("personal_homepage"));
            com.ss.android.ugc.aweme.common.r.a("click_fans_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").f34114b);
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), true, SimpleUserFragment.b.follower, this.y);
            aVar.a(com.ss.android.ugc.aweme.account.d.a().getCurUser()).a();
        }
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68282, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.J != null && !this.J.isLive()) {
            if (this.aL.getVisibility() == 0) {
                if (this.aF == null) {
                    this.aF = new com.ss.android.ugc.aweme.profile.presenter.a();
                    this.aF.f61562c = this;
                    this.aF.a((Activity) getActivity(), (Fragment) this);
                }
                this.aF.a(0, getActivity(), this.f3801e, this.J);
                return;
            }
            com.ss.android.ugc.aweme.common.r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("enter_method", "click_head").f34114b);
            HeaderDetailActivity.a(getActivity(), this.f3801e, this.J, false, m());
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68256, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.at = arguments.getString("enter_from");
        }
        super.d();
        this.J = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().c()).booleanValue()) {
            com.ss.android.ugc.aweme.account.d.a().queryUser();
        }
        this.aD = new u();
        this.aD.a(this);
        this.aD.a(new Object[0]);
        this.aD.f61651b = this.F;
        this.aK = (MyProfileViewModel) ViewModelProviders.of((Fragment) this).get(MyProfileViewModel.class);
        this.aK.f63180b.observe(this, this);
        this.aK.f63182d.observe(this, new ap(this));
        this.aK.a();
        if (((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().c()).booleanValue()) {
            this.aK.f63181c.observe(this, new aq(this));
            this.aK.b();
        } else {
            a((ActivityLinkResponse.LinkInfo) null);
        }
        this.as = new c();
        this.as.a(this);
        this.aN = new e();
        this.aN.a(this);
        this.aN.a(new Object[0]);
        u();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68258, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, af, false, 68260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, af, false, 68260, new Class[0], Void.TYPE);
        } else if (this.aD != null) {
            this.J = com.ss.android.ugc.aweme.account.d.a().getCurUser();
            i(this.J);
            f(this.J.getUid());
            if (com.ss.android.ugc.aweme.account.d.a().shouldRefresh() || this.aH) {
                if (PatchProxy.isSupport(new Object[0], this, af, false, 68292, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, af, false, 68292, new Class[0], Void.TYPE);
                } else if (isActive() && !this.aM) {
                    if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                    } else {
                        this.aD.a(new Object[0]);
                    }
                }
            }
            this.aH = false;
        }
        if (!isHidden() && au.a()) {
            new o().a("personal_homepage").e();
        }
        if (this.ai.f62331b) {
            this.ai.a();
        }
        if (!isHidden() && this.ap) {
            com.ss.android.ugc.aweme.common.r.a("privacy_floating_bar_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
        }
        this.aM = false;
        if (this.aK != null && this.aO) {
            this.aK.f63182d.setValue(Boolean.TRUE);
        }
        if (this.aR) {
            this.aR = false;
            for (Fragment fragment : this.v) {
                if (fragment instanceof z) {
                    ((z) fragment).x();
                }
            }
        }
        if (!TextUtils.isEmpty(this.J.getBioEmail())) {
            g("email");
        }
        if (!TextUtils.isEmpty(this.J.getBioUrl())) {
            g("weblink");
        }
    }

    @Subscribe
    public void onSaveUserDataEvent(com.ss.android.ugc.aweme.profile.a.d dVar) {
        this.aH = true;
    }

    public final void a(at atVar) {
        this.aC = atVar;
    }

    @Subscribe
    public void onMyEnterpriseProfileEvent(g gVar) {
        if (gVar.f38515a == 1) {
            this.aR = true;
        }
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, af, false, 68253, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, af, false, 68253, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.aA = view2;
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68307, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68307, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.d(i);
    }

    @Subscribe
    public void onAuthRefreshEvent(com.ss.android.ugc.aweme.commerce.service.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, af, false, 68299, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, af, false, 68299, new Class[]{com.ss.android.ugc.aweme.commerce.service.f.a.class}, Void.TYPE);
            return;
        }
        if (this.aD != null) {
            this.aD.a(new Object[0]);
        }
    }

    @OnClick({2131495791})
    public void onMore(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68285, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68285, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            q();
        }
    }

    @Subscribe
    public void onUpdateUserEvent(com.ss.android.ugc.aweme.base.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, af, false, 68294, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, af, false, 68294, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE);
            return;
        }
        this.aH = false;
        this.J = bVar.f34476a;
        i(this.J);
    }

    @Subscribe
    public void onUpdateUserSuccessEvent(com.ss.android.ugc.aweme.base.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, af, false, 68295, new Class[]{com.ss.android.ugc.aweme.base.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, af, false, 68295, new Class[]{com.ss.android.ugc.aweme.base.a.c.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.d.a().queryUser();
    }

    private void g(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, af, false, 68289, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, af, false, 68289, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.r.a("show_link", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("link_type", str2).a("scene_id", "1008").a("author_id", this.J.getUid()).f34114b);
    }

    private void i(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68261, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68261, new Class[]{User.class}, Void.TYPE);
        } else if (this.aD != null && user != null) {
            this.aD.a(user);
            this.M.setVisibility(8);
            this.aT.a(user);
        }
    }

    public final void d(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68264, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68264, new Class[]{View.class}, Void.TYPE);
        } else if (this.J.nicknameUpdateReminder()) {
            a(com.ss.android.ugc.aweme.utils.ad.a().a("need_focus_id_input", true).f75487b);
        } else {
            super.d(view);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, af, false, 68296, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, af, false, 68296, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(AllStoryActivity.f73306b, gVar2.itemType)) {
            dv.a(getActivity(), this.aG, gVar2);
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, af, false, 68293, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, af, false, 68293, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (TextUtils.equals(followStatus2.userId, com.ss.android.ugc.aweme.account.d.a().getCurUserId()) || !followStatus2.isFollowSucess) {
        } else {
            if (followStatus2.followStatus == 0) {
                com.ss.android.ugc.aweme.account.d.a().updateCurFollowingCount(-1);
            } else {
                com.ss.android.ugc.aweme.account.d.a().updateCurFollowingCount(1);
            }
        }
    }

    @Subscribe
    public void onHidePerfectInfoGuideEvent(com.ss.android.ugc.aweme.profile.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, af, false, 68298, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, af, false, 68298, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE);
        } else if (this.aI != null) {
            switch (cVar.f61228a) {
                case 0:
                    this.aI.a(false);
                    return;
                case 1:
                    if (!this.aI.f63118d) {
                        this.aI.a(false);
                        break;
                    }
                    break;
                case 2:
                    if (this.aI.f63118d) {
                        this.aI.a(false);
                        return;
                    }
                    break;
            }
        }
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68259, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68259, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onPageSelected(i);
        if (this.aq != null && this.aq == this.v.get(this.G) && !this.aM) {
            this.aq.r();
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68287, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68287, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.aO = z;
        super.setUserVisibleHint(z);
        if (z && this.ap) {
            com.ss.android.ugc.aweme.common.r.a("privacy_floating_bar_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
        }
    }

    public final void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, af, false, 68302, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, af, false, 68302, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        super.a(urlModel);
        if (this.J.avatarUpdateReminder()) {
            this.aL.setVisibility(0);
        } else {
            this.aL.setVisibility(8);
        }
    }

    @OnClick({2131493033})
    public void addFriends(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, af, false, 68284, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, af, false, 68284, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.ai.setShouldHide(true);
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), this.aJ, 1, "", "personal_homepage");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
        }
        z.a("click_add_friends").a("enter_from", "personal_homepage").e();
        if (this.aJ > 0) {
            com.ss.android.ugc.aweme.common.r.a("add_friends_notice", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").f34114b);
        }
        this.aJ = 0;
    }

    public final void b(@Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68278, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68278, new Class[]{User.class}, Void.TYPE);
        } else if (user == null || !user.isSecret()) {
            this.aU.setVisibility(8);
        } else {
            this.aU.setVisibility(0);
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, af, false, 68265, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, af, false, 68265, new Class[]{String.class}, Void.TYPE);
        } else if (isViewValid() || this.D != null) {
            super.c(str);
            if (this.J == null || this.J.isSecret() || !this.J.nicknameUpdateReminder()) {
                this.D.setTextColor(getResources().getColor(C0906R.color.a7m));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.D.getText() + " T");
            spannableStringBuilder.setSpan(new h.a(getContext(), 2130838900, 1), (spannableStringBuilder.length() - " T".length()) + 1, spannableStringBuilder.length(), 18);
            this.D.setText(spannableStringBuilder);
            this.D.setTextColor(getResources().getColor(C0906R.color.a7n));
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        com.ss.android.ugc.aweme.ap.a aVar = (com.ss.android.ugc.aweme.ap.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, af, false, 68309, new Class[]{com.ss.android.ugc.aweme.ap.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, af, false, 68309, new Class[]{com.ss.android.ugc.aweme.ap.a.class}, Void.TYPE);
            return;
        }
        if (!(aVar == null || aVar.f33640c == null || aVar.f33639b != a.C0431a.SUCCESS)) {
            int i = ((NewUserCount) aVar.f33640c).count;
            if (i <= 0) {
                this.ai.setVisibility(8);
                return;
            }
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("tip_show").setLabelName("recommend_friends"));
            com.ss.android.ugc.aweme.common.r.a("add_friends_notice", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show").f34114b);
            this.aJ = i;
            this.ai.b();
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, af, false, 68288, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, af, false, 68288, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            if (this.aK != null) {
                this.aK.a();
            }
            new o().a("personal_homepage").e();
        }
        if (z) {
            E();
        } else {
            D();
        }
        if (this.V != null) {
            this.V.a(z);
        }
        if (this.aK != null) {
            this.aK.f63182d.setValue(Boolean.valueOf(!z));
        }
        if (z) {
            J();
        }
        if (!z) {
            if (!TextUtils.isEmpty(this.J.getBioEmail())) {
                g("email");
            }
            if (!TextUtils.isEmpty(this.J.getBioUrl())) {
                g("weblink");
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, af, false, 68297, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, af, false, 68297, new Class[]{ar.class}, Void.TYPE);
        } else if ("USER".equals(getTag())) {
            int i = arVar.f45292b;
            if (i == 2) {
                if (arVar.f45294d == 0) {
                    com.ss.android.ugc.aweme.account.d.a().updateCurAwemeCount(-1);
                }
                int awemeCount = com.ss.android.ugc.aweme.account.d.a().getCurUser().getAwemeCount();
            } else if (i != 13) {
                if (i == 15) {
                    if (arVar.f45294d == 0) {
                        com.ss.android.ugc.aweme.account.d.a().updateCurAwemeCount(1);
                    }
                    int awemeCount2 = com.ss.android.ugc.aweme.account.d.a().getCurUser().getAwemeCount();
                } else {
                    return;
                }
            } else if (com.ss.android.ugc.aweme.feed.a.a().b((String) arVar.f45293c).getUserDigg() == 1) {
                com.ss.android.ugc.aweme.account.d.a().updateCurFavoritingCount(1);
            } else {
                com.ss.android.ugc.aweme.account.d.a().updateCurFavoritingCount(-1);
            }
            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
            d(curUser.getAwemeCount());
            e(curUser.getFavoritingCount());
        }
    }

    public final void a(final ActivityLinkResponse.LinkInfo linkInfo) {
        if (PatchProxy.isSupport(new Object[]{linkInfo}, this, af, false, 68308, new Class[]{ActivityLinkResponse.LinkInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkInfo}, this, af, false, 68308, new Class[]{ActivityLinkResponse.LinkInfo.class}, Void.TYPE);
        } else if (linkInfo != null) {
            this.aP.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21) {
                this.aQ.setOutlineProvider(new dp(com.ss.android.ugc.aweme.base.utils.u.a(2.0d)));
                this.aQ.setClipToOutline(true);
            }
            final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.av.getLayoutParams();
            final boolean z = !ActivityLinkManager.a(getContext());
            this.aQ.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(this.aQ.getController())).setControllerListener(new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61977a;

                public final /* synthetic */ void onFinalImageSet(String str, @javax.annotation.Nullable Object obj, @javax.annotation.Nullable Animatable animatable) {
                    String str2 = str;
                    Animatable animatable2 = animatable;
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f61977a, false, 68330, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f61977a, false, 68330, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    super.onFinalImageSet(str2, imageInfo, animatable2);
                    MusMyProfileFragment.this.aw.setVisibility(8);
                    layoutParams.gravity = 17;
                    MusMyProfileFragment.this.av.setLayoutParams(layoutParams);
                    MusMyProfileFragment.this.av.setTextColor(Color.parseColor(linkInfo.fontColor));
                }
            })).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(linkInfo.backgroundUrl)).build())).build());
            this.av.setText(linkInfo.text);
            final com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            a2.a("enter_from", "personal_homepage");
            com.ss.android.ugc.aweme.common.r.a("h5_show_detail", (Map) a2.f34114b);
            this.aP.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61981a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f61981a, false, 68331, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f61981a, false, 68331, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).jumpToH5(linkInfo.url, MusMyProfileFragment.this.getContext());
                    if (z) {
                        Context context = MusMyProfileFragment.this.getContext();
                        if (PatchProxy.isSupport(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67426, new Class[]{Context.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67426, new Class[]{Context.class}, Void.TYPE);
                        } else {
                            bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(context, bm.class);
                            if (bmVar != null) {
                                bmVar.b("true");
                            }
                        }
                        MusMyProfileFragment.this.ax = true;
                    }
                    com.ss.android.ugc.aweme.common.r.a("h5_enter_detail", (Map) a2.f34114b);
                }
            });
        } else {
            this.aP.setVisibility(8);
        }
    }

    public final void d(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68266, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68266, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.d(user);
        this.q.a(this.J, (Aweme) null);
    }

    public final void m(int i) {
        OriginMusicListFragment originMusicListFragment;
        int i2 = i;
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, af, false, 68255, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, af, false, 68255, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            AwemeListFragment awemeListFragment = (AwemeListFragment) childFragmentManager.findFragmentByTag(MusAbsProfileFragment.u + 1);
            if (awemeListFragment == null) {
                awemeListFragment = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment((int) getResources().getDimension(C0906R.dimen.lv), 0, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid(), true, false);
            }
            a((ProfileListFragment) awemeListFragment, (Integer) 0);
            awemeListFragment.r = this.Z;
            if (this.G != this.w.indexOf(0)) {
                z = false;
            }
            awemeListFragment.f3789f = z;
            awemeListFragment.k = eg.a(0);
        } else if (i2 == 2) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            this.aq = (AwemeListFragment) childFragmentManager2.findFragmentByTag(MusAbsProfileFragment.u + 2);
            if (this.aq == null) {
                this.aq = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment((int) getResources().getDimension(C0906R.dimen.lv), 1, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid(), true, false);
            }
            a((ProfileListFragment) this.aq, (Integer) 1);
            this.aq.G = this.at;
            this.aq.r = this.Z;
            AwemeListFragment awemeListFragment2 = this.aq;
            if (this.G == this.w.indexOf(1)) {
                z2 = true;
            }
            awemeListFragment2.f3789f = z2;
            this.aq.k = eg.a(1);
        } else {
            if (i2 == 3) {
                if (PatchProxy.isSupport(new Object[0], this, af, false, 68254, new Class[0], OriginMusicListFragment.class)) {
                    originMusicListFragment = (OriginMusicListFragment) PatchProxy.accessDispatch(new Object[0], this, af, false, 68254, new Class[0], OriginMusicListFragment.class);
                } else {
                    FragmentManager childFragmentManager3 = getChildFragmentManager();
                    Fragment findFragmentByTag = childFragmentManager3.findFragmentByTag(u + 0);
                    if (findFragmentByTag instanceof OriginMusicListFragment) {
                        originMusicListFragment = (OriginMusicListFragment) findFragmentByTag;
                    } else {
                        originMusicListFragment = OriginMusicListFragment.a(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), true);
                    }
                }
                a((ProfileListFragment) originMusicListFragment, (Integer) 3);
                originMusicListFragment.k = eg.a(3);
                originMusicListFragment.j = true;
                originMusicListFragment.a(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid());
            }
        }
    }

    public final void a(AvatarUri avatarUri) {
        ad adVar;
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, af, false, 68318, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, af, false, 68318, new Class[]{AvatarUri.class}, Void.TYPE);
        } else if (getActivity() != null) {
            if (this.aF != null) {
                this.aF.c();
            }
            if (avatarUri == null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bv).a();
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68323, new Class[0], ad.class)) {
                adVar = (ad) PatchProxy.accessDispatch(new Object[0], this, af, false, 68323, new Class[0], ad.class);
            } else {
                if (this.aE == null) {
                    this.aE = new ad();
                    this.aE.h = this;
                }
                adVar = this.aE;
            }
            adVar.c(avatarUri.uri);
        }
    }

    public final void b(View view) {
        int i;
        WidgetManager widgetManager;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, af, false, 68267, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, af, false, 68267, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.b(view);
        this.aL = view2.findViewById(C0906R.id.brc);
        View findViewById = view2.findViewById(C0906R.id.ix);
        View findViewById2 = view2.findViewById(C0906R.id.dj);
        View findViewById3 = view2.findViewById(C0906R.id.bpc);
        findViewById3.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61968a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61968a, false, 68329, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61968a, false, 68329, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    MusMyProfileFragment musMyProfileFragment = MusMyProfileFragment.this;
                    if (PatchProxy.isSupport(new Object[]{view}, musMyProfileFragment, MusMyProfileFragment.af, false, 68276, new Class[]{View.class}, Void.TYPE)) {
                        MusMyProfileFragment musMyProfileFragment2 = musMyProfileFragment;
                        PatchProxy.accessDispatch(new Object[]{view}, musMyProfileFragment2, MusMyProfileFragment.af, false, 68276, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                    QRCodeActivityV2.a(musMyProfileFragment.getContext(), new d.a().a(4, ex.h(curUser), "personal_homepage").a(ex.i(curUser), ex.j(curUser), ex.e(curUser)).f63387b);
                }
            }
        });
        this.ah = (AnimationImageView) view2.findViewById(C0906R.id.dx);
        this.aG = view2.findViewById(C0906R.id.d3m);
        this.ai = (RecommendPointView) view2.findViewById(C0906R.id.cb6);
        if ("from_main".equals(this.F)) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        } else {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61988a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f61988a, false, 68335, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f61988a, false, 68335, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MusMyProfileFragment.this.aC != null) {
                        MusMyProfileFragment.this.aC.a();
                        return;
                    }
                    if (MusMyProfileFragment.this.getActivity() != null && !MusMyProfileFragment.this.getActivity().isFinishing()) {
                        MusMyProfileFragment.this.getActivity().finish();
                    }
                }
            });
            findViewById2.setVisibility(8);
        }
        if (ex.b()) {
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        }
        if (getView() != null) {
            MChooseAccountWidget mChooseAccountWidget = new MChooseAccountWidget(findViewById3, this.aG, view2.findViewById(C0906R.id.title), view2.findViewById(C0906R.id.y), view2.findViewById(C0906R.id.ccp));
            this.aT = mChooseAccountWidget;
            i = 8;
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68313, new Class[0], WidgetManager.class)) {
                widgetManager = (WidgetManager) PatchProxy.accessDispatch(new Object[0], this, af, false, 68313, new Class[0], WidgetManager.class);
            } else {
                if (this.aS == null) {
                    this.aS = WidgetManager.a((Fragment) this, getView());
                }
                widgetManager = this.aS;
            }
            widgetManager.a(LayoutInflater.from(getContext()).inflate(C0906R.layout.z2, (ViewGroup) getView(), false), (Widget) this.aT);
        } else {
            i = 8;
        }
        this.f3801e.setBorderColor(C0906R.color.ud);
        this.aj = (NoticeView) view2.findViewById(C0906R.id.du1);
        if (PatchProxy.isSupport(new Object[]{view2}, this, af, false, 68269, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, af, false, 68269, new Class[]{View.class}, Void.TYPE);
        } else if (ex.b() && com.ss.android.ugc.aweme.account.d.a().getCurUser().getUserPeriod() == 1) {
            final long longValue = ((Long) x.a().aa().c()).longValue();
            if (longValue == 0 || System.currentTimeMillis() - longValue <= TimeUnit.DAYS.toMillis(30)) {
                this.ao = (NoticeView) view2.findViewById(C0906R.id.dty);
                this.ao.setOnInternalClickListener(new NoticeView.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61992a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f61992a, false, 68338, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f61992a, false, 68338, new Class[0], Void.TYPE);
                            return;
                        }
                        Intent intent = new Intent(MusMyProfileFragment.this.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse("https://m.tiktok.com/aweme/inapp/v2/c_feedback"));
                        intent.putExtra("hide_nav_bar", true);
                        MusMyProfileFragment.this.startActivity(intent);
                        MusMyProfileFragment.this.ao.setVisibility(8);
                        x.a().Z().a(Long.valueOf(System.currentTimeMillis()));
                        if (longValue == 0) {
                            x.a().aa().a(Long.valueOf(System.currentTimeMillis()));
                        }
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f61992a, false, 68339, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f61992a, false, 68339, new Class[0], Void.TYPE);
                            return;
                        }
                        MusMyProfileFragment.this.ao.setVisibility(8);
                        x.a().Z().a(Long.valueOf(System.currentTimeMillis()));
                        if (longValue == 0) {
                            x.a().aa().a(Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                });
                if (System.currentTimeMillis() - ((Long) x.a().Z().c()).longValue() > TimeUnit.DAYS.toMillis(1)) {
                    this.ao.setVisibility(0);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, af, false, 68271, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, af, false, 68271, new Class[]{View.class}, Void.TYPE);
        } else {
            this.al = view2.findViewById(C0906R.id.d39);
            this.am = (TextView) view2.findViewById(C0906R.id.dgl);
            this.an = view2.findViewById(C0906R.id.ar5);
            this.an.setOnClickListener(new ar(this));
            if (PatchProxy.isSupport(new Object[0], this, af, false, 68272, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, af, false, 68272, new Class[0], Void.TYPE);
            } else {
                String charSequence = this.am.getText().toString();
                int lastIndexOf = charSequence.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
                SpannableString spannableString = new SpannableString(charSequence);
                int i2 = lastIndexOf + 1;
                av.a(spannableString, new ForegroundColorSpan(getResources().getColor(C0906R.color.s_)), i2, charSequence.length(), 33);
                this.am.setMovementMethod(LinkMovementMethod.getInstance());
                av.a(spannableString, new b(this, (byte) 0), i2, charSequence.length(), 33);
                this.am.setText(spannableString);
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, af, false, 68268, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, af, false, 68268, new Class[]{View.class}, Void.TYPE);
        } else {
            this.ak = (NoticeView) view2.findViewById(C0906R.id.c6c);
            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
            if (curUser != null && curUser.isSecret() && ((Boolean) SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().c()).booleanValue()) {
                this.ap = true;
                this.ak.setVisibility(0);
                s(i);
            }
            this.ak.setOnInternalClickListener(new NoticeView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61990a;

                public final void a() {
                    boolean z;
                    boolean z2;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[0], this, f61990a, false, 68336, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61990a, false, 68336, new Class[0], Void.TYPE);
                        return;
                    }
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).goToPrivacyActivity(MusMyProfileFragment.this.getContext());
                    MusMyProfileFragment.this.ak.setVisibility(8);
                    MusMyProfileFragment.this.ap = false;
                    if (MusMyProfileFragment.this.v.get(MusMyProfileFragment.this.G) instanceof AwemeListFragment) {
                        z = ((AwemeListFragment) MusMyProfileFragment.this.v.get(MusMyProfileFragment.this.G)).B();
                    } else {
                        z = false;
                    }
                    if (ex.b() || !z || !"from_main".equals(MusMyProfileFragment.this.F) || MusMyProfileFragment.this.J.getAwemeCount() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    MusMyProfileFragment musMyProfileFragment = MusMyProfileFragment.this;
                    if (!z2) {
                        i = 8;
                    }
                    musMyProfileFragment.s(i);
                    SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().a(Boolean.FALSE);
                    com.ss.android.ugc.aweme.common.r.a("privacy_floating_bar_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                }

                public final void b() {
                    boolean z;
                    boolean z2;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[0], this, f61990a, false, 68337, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61990a, false, 68337, new Class[0], Void.TYPE);
                        return;
                    }
                    MusMyProfileFragment.this.ak.setVisibility(8);
                    MusMyProfileFragment.this.ap = false;
                    SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().a(Boolean.FALSE);
                    if (MusMyProfileFragment.this.v.get(MusMyProfileFragment.this.G) instanceof AwemeListFragment) {
                        z = ((AwemeListFragment) MusMyProfileFragment.this.v.get(MusMyProfileFragment.this.G)).B();
                    } else {
                        z = false;
                    }
                    if (ex.b() || !z || !"from_main".equals(MusMyProfileFragment.this.F) || MusMyProfileFragment.this.J.getAwemeCount() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    MusMyProfileFragment musMyProfileFragment = MusMyProfileFragment.this;
                    if (!z2) {
                        i = 8;
                    }
                    musMyProfileFragment.s(i);
                }
            });
        }
        this.aP = (FrameLayout) view2.findViewById(C0906R.id.b9y);
        this.aQ = (RemoteImageView) view2.findViewById(C0906R.id.atc);
        this.av = (DmtTextView) view2.findViewById(C0906R.id.dgn);
        this.aw = (ImageView) view2.findViewById(C0906R.id.atb);
        this.aU = (ImageView) view2.findViewById(C0906R.id.bk_);
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, af, false, 68303, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, af, false, 68303, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.a(user);
        if (user != null && user.isSecret() && ((Boolean) SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().c()).booleanValue() && !this.ap) {
            com.ss.android.ugc.aweme.common.r.a("privacy_floating_bar_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            this.ak.setVisibility(0);
            s(8);
            this.ap = true;
        }
        h(this.J);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, af, false, 68279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        l(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, af, false, 68257, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, af, false, 68257, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, af, false, 68321, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, af, false, 68321, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 4) {
            if (this.aF != null) {
                this.aF.c();
            }
            a(t.b(this.J));
        }
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
            com.meituan.robust.ChangeQuickRedirect r5 = af
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 68300(0x10acc, float:9.5709E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = af
            r16 = 0
            r17 = 68300(0x10acc, float:9.5709E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.MusMyProfileFragment.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, af, false, 68311, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, af, false, 68311, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i3 == 20001) {
            if (i4 == -1) {
                int intExtra = intent2.getIntExtra("recommend_count", -1);
                if (intExtra == -1) {
                    intExtra = this.aJ;
                }
                this.aJ = intExtra;
                if (this.aJ == 0) {
                    this.ai.setShouldHide(true);
                }
            }
        } else if (this.aF != null) {
            this.aF.a(i3, i4, intent2);
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, af, false, 68304, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, af, false, 68304, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.ah != null) {
            if (!z || !com.ss.android.ugc.aweme.story.a.a()) {
                this.f3801e.setBorderColor(C0906R.color.bc);
                this.ah.cancelAnimation();
                this.ah.setVisibility(8);
                return;
            }
            com.ss.android.ugc.aweme.story.live.b.a(getContext(), true, 0, this.J.getRequestId(), this.J.getUid(), this.J.roomId);
            this.f3801e.setBorderColor(C0906R.color.a1z);
            this.f3801e.setBorderWidth(2);
            this.ah.setVisibility(0);
            this.ah.setAnimation("tag_profile_live.json");
            this.ah.playAnimation();
        }
    }
}
