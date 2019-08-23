package com.ss.android.ugc.aweme.profile.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.festival.christmas.FestivalHomePageView;
import com.ss.android.ugc.aweme.festival.christmas.c.i;
import com.ss.android.ugc.aweme.festival.christmas.view.a;
import com.ss.android.ugc.aweme.festival.common.FestivalResHandler;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.profile.SocialMediaTypes;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ag;
import com.ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.ss.android.ugc.aweme.setting.model.VerifyTypeAction;
import com.ss.android.ugc.aweme.setting.ui.af;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.u.ap;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public abstract class MusAbsProfileFragment extends BaseProfileFragment implements a, MusProfileNavigator.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3797a;
    protected View M;
    protected View N;
    protected View O;
    protected TextView P;
    protected TextView Q;
    protected TextView R;
    protected ProfileFragmentAdapter S;
    protected IUserService T;
    protected int U = -1;
    protected AnalysisStayTimeFragmentComponent V;
    protected TextView W;
    protected boolean X = false;
    protected TextView Y;
    protected AwemeListFragment.a Z = new AwemeListFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61944a;

        public final void b(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f61944a, false, 68235, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f61944a, false, 68235, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0 && MusAbsProfileFragment.this.G == 0) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                if (z) {
                    MusAbsProfileFragment.this.s(8);
                }
            } else if (i == 1 && MusAbsProfileFragment.this.G == 1) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
        }

        public final void a(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f61944a, false, 68234, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f61944a, false, 68234, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0 && MusAbsProfileFragment.this.G == 0) {
                if (MusAbsProfileFragment.this.mScrollableLayout != null) {
                    MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                }
                if (!ex.b() && z && "from_main".equals(MusAbsProfileFragment.this.F) && MusAbsProfileFragment.this.J.getAwemeCount() == 0 && MusAbsProfileFragment.this.F()) {
                    MusAbsProfileFragment.this.s(0);
                }
            } else if (i == 1 && MusAbsProfileFragment.this.G == 1 && MusAbsProfileFragment.this.mScrollableLayout != null) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            }
            if (ex.a(MusAbsProfileFragment.this.J, MusAbsProfileFragment.this.s()) && MusAbsProfileFragment.this.mScrollableLayout != null) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
        }
    };
    int aa;
    int ab = u.a(44.0d);
    float ac = 0.0f;
    boolean ad;
    protected long ae = -1;
    private ViewTreeObserver.OnGlobalLayoutListener af;
    private Animation ag;
    private String ah;
    private ArrayList<Integer> ai = new ArrayList<>();
    private i aj;
    private View ak;
    private View al;
    private int am;
    private com.ss.android.ugc.aweme.festival.christmas.c.a an;

    /* renamed from: b  reason: collision with root package name */
    TextView f3798b;

    /* renamed from: c  reason: collision with root package name */
    TextView f3799c;

    /* renamed from: d  reason: collision with root package name */
    TextView f3800d;

    /* renamed from: e  reason: collision with root package name */
    MusAvatarWithBorderView f3801e;

    /* renamed from: f  reason: collision with root package name */
    ViewStub f3802f;
    FestivalHomePageView g;
    SwipableViewPager h;
    MusProfileNavigator i;
    public View j;
    PopupWindow k;
    TextView l;
    ImageView m;
    View n;
    View o;
    ImageView p;
    EnterpriseTransformLayout q;
    ViewGroup r;
    public c s;

    public static String q(@SocialMediaTypes int i2) {
        switch (i2) {
            case 1:
                return "instagram";
            case 2:
                return "youtube";
            case 3:
                return "twitter";
            default:
                return "";
        }
    }

    public boolean F() {
        return true;
    }

    public final void b(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(boolean z) {
    }

    public void f(int i2) {
    }

    public final void g(User user) {
    }

    public final void i(int i2) {
    }

    public abstract void l();

    private boolean K() {
        return this instanceof MusMyProfileFragment;
    }

    public final List<Integer> k() {
        return this.w;
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3797a, false, 68156, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3797a, false, 68156, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.h = (SwipableViewPager) view.findViewById(C0906R.id.ckc);
        this.h.setOffscreenPageLimit(2);
        this.q = (EnterpriseTransformLayout) view.findViewById(C0906R.id.c7j);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusView.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
        }
        this.N = view.findViewById(C0906R.id.bni);
        this.M = view.findViewById(C0906R.id.bno);
        this.p = (ImageView) view.findViewById(C0906R.id.b17);
        this.r = (ViewGroup) view.findViewById(C0906R.id.y9);
        this.V = new AnalysisStayTimeFragmentComponent(this, true);
        this.V.f2737c = new AnalysisStayTimeFragmentComponent.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61934a;

            public final ao a(ao aoVar) {
                ao aoVar2 = aoVar;
                if (!PatchProxy.isSupport(new Object[]{aoVar2}, this, f61934a, false, 68233, new Class[]{ao.class}, ao.class)) {
                    return aoVar2.f(AwemeChangeCallBack.a(MusAbsProfileFragment.this.getActivity()));
                }
                return (ao) PatchProxy.accessDispatch(new Object[]{aoVar2}, this, f61934a, false, 68233, new Class[]{ao.class}, ao.class);
            }
        };
        if (PatchProxy.isSupport(new Object[]{view}, this, f3797a, false, 68165, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3797a, false, 68165, new Class[]{View.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            this.f3802f = (ViewStub) view.findViewById(C0906R.id.dw2);
            if (this.f3802f != null && this.g == null) {
                this.g = (FestivalHomePageView) this.f3802f.inflate();
                this.g.setVisibility(0);
                this.g.setOnClickListener(new am(this));
                this.f3802f = null;
            }
        }
        this.am = getContext().getResources().getDimensionPixelOffset(C0906R.dimen.lw);
    }

    public final void a(String str, int i2, BlueVBrandInfo blueVBrandInfo, User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), blueVBrandInfo, user}, this, f3797a, false, 68183, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), blueVBrandInfo, user}, this, f3797a, false, 68183, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mTitle.setText(str);
            this.ah = str2;
        }
    }

    public void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68184, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68184, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.a(user);
        this.J = user;
        if (ex.a(this.J, s())) {
            this.h.f62361b = false;
            this.i.a(0).setSelected(false);
        }
        i(this.J);
    }

    public void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f3797a, false, 68188, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, f3797a, false, 68188, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f3797a, false, 68189, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, f3797a, false, 68189, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        if (!(!isActive() || urlModel == null || this.J == null)) {
            UrlModel avatarVideoUri = this.J.getAvatarVideoUri();
            if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                com.ss.android.ugc.aweme.base.c.b(this.f3801e, urlModel);
            } else {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f3801e, avatarVideoUri, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61940a;

                    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                        ImageInfo imageInfo = (ImageInfo) obj;
                        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f61940a, false, 68245, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f61940a, false, 68245, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                            return;
                        }
                        MusAbsProfileFragment.this.p();
                    }
                }, false);
            }
        }
    }

    public final int m() {
        if (this.an == null) {
            return 0;
        }
        return this.an.f47233a;
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68225, new Class[0], Void.TYPE);
            return;
        }
        this.ae = System.currentTimeMillis();
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68167, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f3801e.setOnClickListener(this);
        u();
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3797a, false, 68162, new Class[0], Boolean.TYPE)) {
            return ex.a(this.J, s());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68162, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68227, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.s != null) {
            this.s.d();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68204, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68166, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        D();
    }

    public final boolean r() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68214, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68214, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.J != null && this.J.getVerificationType() == 2) {
            z = true;
        }
        return z;
    }

    private void H() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68198, new Class[0], Void.TYPE);
        } else if (this.j == null || this.k == null) {
            this.j = LayoutInflater.from(getContext()).inflate(C0906R.layout.aax, (ViewGroup) getView(), false);
            this.k = new PopupWindow(this.j, -2, -2, false);
            this.k.setBackgroundDrawable(null);
        }
    }

    public final void E() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68226, new Class[0], Void.TYPE);
            return;
        }
        if (this.ae > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.ae;
            if (currentTimeMillis > 0) {
                if (K()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                ((ap) new ap().b(str).a(String.valueOf(currentTimeMillis)).j(eg.a(this.G))).e();
            }
            this.ae = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void G() {
        Uri uri;
        com.ss.android.ugc.aweme.festival.common.a e2 = com.ss.android.ugc.aweme.festival.christmas.a.e();
        if (e2 != null && !TextUtils.isEmpty(e2.f47289c)) {
            String str = "";
            boolean z = this instanceof MusUserProfileFragment;
            if (z) {
                str = "others_homepage";
            } else if (this instanceof MusMyProfileFragment) {
                str = "personal_homepage";
            }
            r.a("enter_activity_page", (Map) new d().a("enter_from", str).f34114b);
            String str2 = null;
            if (z && this.J != null && !this.J.isMe()) {
                str2 = this.J.getUid();
            }
            if (!TextUtils.isEmpty(str2)) {
                uri = Uri.parse(e2.f47289c).buildUpon().appendQueryParameter("uid", str2).build();
            } else {
                uri = Uri.parse(e2.f47289c);
            }
            com.ss.android.ugc.aweme.festival.christmas.a.a(getContext(), uri.toString());
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68181, new Class[0], Void.TYPE);
            return;
        }
        if (this.J == null) {
            e(getUserId());
        } else {
            l(this.J);
        }
        this.S = new ProfileFragmentAdapter(getChildFragmentManager(), this.v, k());
        this.h.setAdapter(this.S);
        this.i.a(this.h, r(), this instanceof MusMyProfileFragment, this);
        onPageSelected(this.G);
        this.h.setCurrentItem(this.G);
        this.h.addOnPageChangeListener(this);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68159, new Class[0], Void.TYPE);
            return;
        }
        String bioSecureUrl = this.J.getBioSecureUrl();
        if (!TextUtils.isEmpty(bioSecureUrl)) {
            Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(bioSecureUrl));
            getActivity().startActivity(intent);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68160, new Class[0], Void.TYPE);
            return;
        }
        String charSequence = this.R.getText().toString();
        if (!TextUtils.isEmpty(charSequence)) {
            getActivity().startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + charSequence)));
        }
    }

    public void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68180, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            d(0);
            e(0);
            a(0, "");
            b((User) null);
            b((String) null);
            this.m.setVisibility(8);
            this.mScrollableLayout.a();
            this.h.setCurrentItem(0, false);
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68191, new Class[0], Void.TYPE);
        } else if (this.f3801e != null && this.f3801e.getController() != null) {
            Animatable animatable = this.f3801e.getController().getAnimatable();
            if (animatable != null) {
                if (getUserVisibleHint() && !animatable.isRunning()) {
                    animatable.start();
                } else if (!getUserVisibleHint() && animatable.isRunning()) {
                    animatable.stop();
                }
            }
        }
    }

    public final boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68215, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68215, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.J == null) {
            return false;
        } else {
            if (this.T == null) {
                this.T = (IUserService) ServiceManager.get().getService(IUserService.class);
            }
            return TextUtils.equals(this.T.getCurrentUserID(), this.J.getUid());
        }
    }

    public final void u() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68219, new Class[0], Void.TYPE);
            return;
        }
        if (this.i.getTabCount() >= 2 && (this.i.a(this.w.indexOf(1)) instanceof MusProfileTabImageView)) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) this.i.a(this.w.indexOf(1));
            if (((Integer) x.a().g().c()).intValue() == 0 || !ex.g(this.J)) {
                i2 = 2130839350;
            } else {
                i2 = 2130840592;
            }
            musProfileTabImageView.setImageResource(i2);
        }
    }

    private void I() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68200, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            H();
            if (this.j != null && this.k != null) {
                View view = getView();
                if (view != null) {
                    this.aa = view.getMeasuredHeight();
                    if (this.ag == null) {
                        this.ag = AnimationUtils.loadAnimation(context, C0906R.anim.f4405cn);
                        this.ag.setRepeatMode(2);
                        this.ag.setRepeatCount(-1);
                        this.ag.setAnimationListener(new Animation.AnimationListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f61946a;

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                if (PatchProxy.isSupport(new Object[]{animation}, this, f61946a, false, 68236, new Class[]{Animation.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animation}, this, f61946a, false, 68236, new Class[]{Animation.class}, Void.TYPE);
                                    return;
                                }
                                MusAbsProfileFragment.this.j.setLayerType(0, null);
                            }
                        });
                    }
                    this.k.showAtLocation(view, 80, 0, this.ab + a(context));
                    this.j.setLayerType(2, null);
                    this.j.startAnimation(this.ag);
                    if (this.af == null) {
                        this.af = new an(this, view, context);
                    }
                    view.getViewTreeObserver().addOnGlobalLayoutListener(this.af);
                }
            }
        }
    }

    private float J() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68220, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68220, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.U == -1) {
            TextView textView = new TextView(getContext());
            textView.setTextSize(21.0f);
            Rect rect = new Rect();
            TextPaint paint = textView.getPaint();
            paint.getTextBounds(getContext().getString(C0906R.string.cjf), 0, getContext().getString(C0906R.string.cjf).length(), rect);
            int height = rect.height();
            textView.setTextSize(13.0f);
            paint.getTextBounds(getContext().getString(C0906R.string.br3), 0, getContext().getString(C0906R.string.br3).length(), rect);
            int height2 = rect.height();
            this.U = ((int) (((UIUtils.dip2Px(getContext(), 100.0f) * 2.0f) + ((float) height)) + ((float) height2))) - (((UIUtils.getScreenHeight(getContext()) - this.h.getTop()) - this.i.getHeight()) - this.mStatusView.getHeight());
        }
        if (this.U < 0) {
            return 0.0f;
        }
        return (float) this.U;
    }

    public final void j() {
        VerifyTypeAction verifyTypeAction;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68163, new Class[0], Void.TYPE);
        } else if (this.J != null && getContext() != null && isViewValid()) {
            if (ex.e(this.J)) {
                verifyTypeAction = VerifyActionManager.Companion.getVerifyActionByType("commerce_user");
            } else {
                verifyTypeAction = VerifyActionManager.Companion.getVerifyActionByType(String.valueOf(this.J.getVerificationType()));
            }
            if (verifyTypeAction != null) {
                String str2 = "";
                switch (this.J.getVerificationType()) {
                    case 1:
                        str2 = "认证号";
                        break;
                    case 2:
                        str2 = "音乐人";
                        break;
                    case 3:
                        str2 = "特效师";
                        break;
                }
                switch (verifyTypeAction.actionType) {
                    case 1:
                        str = "toast";
                        com.bytedance.ies.dmt.ui.d.a.c(getContext(), getContext().getString(C0906R.string.cmp)).a();
                        break;
                    case 2:
                        str = "link";
                        if (!TextUtils.isEmpty(verifyTypeAction.link)) {
                            h.a().a(verifyTypeAction.link);
                            break;
                        }
                        break;
                    default:
                        str = "toast";
                        com.bytedance.ies.dmt.ui.d.a.c(getContext(), getContext().getString(C0906R.string.cmp)).a();
                        break;
                }
                r.a("click_varified_badge", (Map) d.a().a("enter_from", this.F).a("landing_page", str).a("user_type", str2).f34114b);
            }
        }
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68179, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            c(0);
            a(0);
            b(0);
            d(0);
            e(0);
            a(null, 0, null, null);
            if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68182, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68182, new Class[0], Void.TYPE);
            } else if (isActive()) {
                this.f3801e.setImageURI("");
            }
            a(0, "");
            b((User) null);
            b((String) null);
            c("");
            this.mScrollableLayout.a();
            this.h.setCurrentItem(0, false);
        }
    }

    public final void q() {
        ArrayList<Aweme> arrayList;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68212, new Class[0], Void.TYPE);
            return;
        }
        r.a("enter_setting_page", (Map) d.a().a("previous_page", "personal_homepage").a("enter_method", "click_button").f34114b);
        com.ss.android.common.lib.a.a(getActivity(), "set", "personal_homepage");
        if (this.v != null && this.v.size() > 0) {
            if (this.S.e(0) instanceof AwemeListFragment) {
                arrayList = ((AwemeListFragment) this.S.e(0)).D();
            } else {
                arrayList = null;
            }
            com.ss.android.ugc.aweme.feed.k.a.a((List<Aweme>) arrayList);
        }
        h.a().a((Activity) getActivity(), j.a("aweme://setting").a());
    }

    @SuppressLint({"SSRawDialog"})
    public final void t() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3797a, false, 68216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3797a, false, 68216, new Class[0], Void.TYPE);
            return;
        }
        int size = this.ai.size();
        if (size == 1) {
            int intValue = this.ai.get(0).intValue();
            r(intValue);
            d a2 = d.a();
            if (this.J.isMe()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            r.a("click_social_account", (Map) a2.a("enter_from", str).a("platform", q(intValue)).f34114b);
        } else if (size > 1 && getContext() != null && this.J != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(this.J.getInsId())) {
                arrayList.add(1);
                arrayList2.add(getContext().getString(C0906R.string.bds, new Object[]{this.J.getInsId()}));
            }
            if (!TextUtils.isEmpty(this.J.getYoutubeChannelId())) {
                arrayList.add(2);
                arrayList2.add(getContext().getString(C0906R.string.bdt, new Object[]{this.J.getYoutubeChannelTitle()}));
            }
            builder.setItems((CharSequence[]) arrayList2.toArray(new String[0]), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61951a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61951a, false, 68238, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61951a, false, 68238, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    } else if (i < arrayList.size()) {
                        int intValue = ((Integer) arrayList.get(i)).intValue();
                        MusAbsProfileFragment.this.r(intValue);
                        d a2 = d.a();
                        if (MusAbsProfileFragment.this.J.isMe()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        r.a("click_social_account", (Map) a2.a("enter_from", str).a("platform", MusAbsProfileFragment.q(intValue)).f34114b);
                    }
                }
            });
            bc.a(builder.create());
        }
    }

    public final void a(com.ss.android.ugc.aweme.festival.christmas.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3797a, false, 68171, new Class[]{com.ss.android.ugc.aweme.festival.christmas.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3797a, false, 68171, new Class[]{com.ss.android.ugc.aweme.festival.christmas.c.a.class}, Void.TYPE);
            return;
        }
        this.an = aVar;
        o(aVar.f47233a);
        p(aVar.f47233a);
    }

    private void i(User user) {
        TextView textView;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68209, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68209, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            int i2 = 8;
            if (!s() || this.X) {
                textView = this.P;
            } else {
                String customVerify = user.getCustomVerify();
                if (TextUtils.isEmpty(customVerify) || TextUtils.equals("verified", customVerify)) {
                    z = false;
                }
                textView = this.P;
                if (!z) {
                    i2 = 0;
                }
            }
            textView.setVisibility(i2);
        }
    }

    private int t(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68175, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68175, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (!ex.g(this.J) || !ex.b()) {
            return i2;
        } else {
            return 0;
        }
    }

    public final void b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68173, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68173, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 < 0) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        super.b(t(i3));
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68169, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68169, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            int t = t(i2);
            if (t < 0) {
                t = 0;
            }
            if (t > 1) {
                this.f3800d.setText(C0906R.string.bdi);
            } else {
                this.f3800d.setText(C0906R.string.bdh);
            }
            this.I = b.a((long) t);
            this.z.setText(this.I);
        }
    }

    public void d(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3797a, false, 68229, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3797a, false, 68229, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ey.a("user_id", view.getContext(), this.D.getText().toString());
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68193, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68193, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.i.getTabCount() >= 2) {
            com.ss.android.ugc.aweme.profile.tab.c cVar = (com.ss.android.ugc.aweme.profile.tab.c) this.i.a(this.w.indexOf(1));
            if (ex.a(this.J, s())) {
                cVar.setClickable(false);
            }
        }
    }

    public final void j(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68223, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68223, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = eg.a(i2);
        if (this.ad) {
            this.ad = false;
            return;
        }
        if (K()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        r.a("change_profile_tab", (Map) new d().a("enter_from", str).a("enter_method", "slide").a("tab_name", a2).f34114b);
    }

    public final void k(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68224, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68224, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = eg.a(i2);
        if (K()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        r.a("change_profile_tab", (Map) new d().a("enter_from", str).a("enter_method", "click").a("tab_name", a2).f34114b);
        this.ad = true;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3797a, false, 68155, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3797a, false, 68155, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.T = (IUserService) ServiceManager.get().getService(IUserService.class);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(af afVar) {
        if (PatchProxy.isSupport(new Object[]{afVar}, this, f3797a, false, 68218, new Class[]{af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, f3797a, false, 68218, new Class[]{af.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.J.getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            u();
        }
    }

    public final void r(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68217, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68217, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.J != null) {
            switch (i2) {
                case 1:
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).followOnInstagram(getContext(), this.J.getInsId());
                    return;
                case 2:
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).followOnYoutube(getContext(), this.J.getYoutubeChannelId());
                    break;
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3797a, false, 68190, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3797a, false, 68190, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        p();
    }

    /* access modifiers changed from: package-private */
    public int a(Context context) {
        boolean z;
        boolean z2 = true;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context}, this, f3797a, false, 68199, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f3797a, false, 68199, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        if (!ToolUtils.isMiui() || !com.ss.android.ugc.aweme.profile.a.a(context)) {
            z = false;
        } else {
            z = true;
        }
        if (!ToolUtils.isMiui() || Build.VERSION.SDK_INT < 28 || com.ss.android.ugc.aweme.profile.a.a(context)) {
            z2 = false;
        }
        if (!z) {
            i2 = com.ss.android.ugc.aweme.profile.a.c();
        }
        boolean b2 = com.ss.android.ugc.aweme.profile.a.b(context);
        int c2 = com.ss.android.ugc.aweme.profile.a.c(context);
        int c3 = p.c();
        if ((b2 && c2 > 0) || z2) {
            i2 -= c3;
        }
        return i2;
    }

    public void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3797a, false, 68205, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3797a, false, 68205, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.D != null) {
            this.D.setText("@" + str);
        }
    }

    public void d(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68192, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68192, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.i.getTabCount() > 0) {
            com.ss.android.ugc.aweme.profile.tab.c cVar = (com.ss.android.ugc.aweme.profile.tab.c) this.i.a(this.w.indexOf(0));
            if (ex.a(this.J, s())) {
                cVar.setClickable(false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(" ");
            if (i2 > 1) {
                i3 = C0906R.string.be8;
            } else {
                i3 = C0906R.string.be7;
            }
            sb.append(getString(i3));
            this.P.setText(sb.toString());
        }
    }

    public final void f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3797a, false, 68170, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3797a, false, 68170, new Class[]{String.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            if (this.aj == null) {
                this.aj = new i();
                this.aj.a(this);
            }
            l();
            this.aj.a(str);
        }
    }

    public final void h(@NonNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68185, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68185, new Class[]{User.class}, Void.TYPE);
            return;
        }
        int indexOf = this.w.indexOf(Integer.valueOf(n(ex.a(user))));
        if (indexOf < 0) {
            indexOf = 0;
        }
        int min = Math.min(this.S.getCount() - 1, indexOf);
        if (this.h.getCurrentItem() != min) {
            this.h.setCurrentItem(min, false);
        }
        onPageSelected(min);
    }

    public final void o(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68186, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68186, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a() && this.p != null) {
            if (i2 >= 3) {
                Drawable d2 = FestivalResHandler.d();
                if (d2 != null) {
                    this.p.setVisibility(0);
                    this.p.setImageDrawable(d2);
                } else {
                    this.p.setVisibility(8);
                }
            } else {
                this.p.setVisibility(8);
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3797a, false, 68221, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3797a, false, 68221, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (this.V != null) {
            this.V.a(z);
        }
        int i2 = 8;
        if (z) {
            E();
            s(8);
            return;
        }
        D();
        if (this.k != null) {
            if (ex.b() || !(this.v.get(this.G) instanceof AwemeListFragment) || !((AwemeListFragment) this.v.get(this.G)).B() || !F() || !"from_main".equals(this.F) || this.J.getAwemeCount() != 0) {
                z2 = false;
            }
            if (z2) {
                i2 = 0;
            }
            s(i2);
        }
        if (this.q != null) {
            this.q.a();
        }
    }

    @OnClick({2131495791})
    public void onMore(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3797a, false, 68211, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3797a, false, 68211, new Class[]{View.class}, Void.TYPE);
            return;
        }
        final boolean z = !com.ss.android.ugc.aweme.story.live.c.a().b();
        com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ag.a(getResources().getString(C0906R.string.a_o), true ^ com.ss.android.ugc.aweme.aj.b.b().b((Context) getActivity(), "is_show_profile_yellow_point", false)));
        if (z) {
            arrayList.add(new ag.a(getResources().getString(C0906R.string.bdo), false));
        }
        arrayList.add(new ag.a(getResources().getString(C0906R.string.c4x), false));
        aVar.a((ListAdapter) new ag(getActivity(), arrayList), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61948a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61948a, false, 68237, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61948a, false, 68237, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    e.a((Fragment) MusAbsProfileFragment.this, "personal_homepage", "click_more_setting");
                } else {
                    if (i2 == 0) {
                        if (!com.ss.android.ugc.aweme.aj.b.b().b((Context) MusAbsProfileFragment.this.getActivity(), "is_show_profile_yellow_point", false)) {
                            MusAbsProfileFragment.this.M.setVisibility(8);
                            com.ss.android.ugc.aweme.aj.b.b().a((Context) MusAbsProfileFragment.this.getActivity(), "is_show_profile_yellow_point", true);
                        }
                        MusAbsProfileFragment.this.a((Bundle) null);
                    } else if (z) {
                        if (i2 == 1) {
                            MusAbsProfileFragment musAbsProfileFragment = MusAbsProfileFragment.this;
                            if (PatchProxy.isSupport(new Object[0], musAbsProfileFragment, MusAbsProfileFragment.f3797a, false, 68213, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], musAbsProfileFragment, MusAbsProfileFragment.f3797a, false, 68213, new Class[0], Void.TYPE);
                            } else {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openWallet(musAbsProfileFragment.getActivity());
                                r.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
                            }
                        } else if (i2 == 2) {
                            MusAbsProfileFragment.this.q();
                        }
                    } else if (i2 == 1) {
                        MusAbsProfileFragment.this.q();
                    }
                    dialogInterface.dismiss();
                }
            }
        });
        try {
            aVar.b();
        } catch (Resources.NotFoundException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    public final void p(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68187, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68187, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a() && this.g != null) {
            Object obj = null;
            Map<String, Object> f2 = com.ss.android.ugc.aweme.festival.christmas.a.f();
            if (f2 != null) {
                if (!ex.a(this.J, ex.g(this.J))) {
                    i3 = i2;
                }
                if (i3 == 0) {
                    if (f2.containsKey("christmas_tree_0")) {
                        obj = f2.get("christmas_tree_0");
                    } else {
                        return;
                    }
                } else if (i3 == 1) {
                    if (f2.containsKey("christmas_tree_1")) {
                        obj = f2.get("christmas_tree_1");
                    } else {
                        return;
                    }
                } else if (i3 <= 1 || i3 > 3) {
                    if (i3 > 3) {
                        if (f2.containsKey("christmas_tree_3")) {
                            obj = f2.get("christmas_tree_3");
                        } else {
                            return;
                        }
                    }
                } else if (f2.containsKey("christmas_tree_2")) {
                    obj = f2.get("christmas_tree_2");
                } else {
                    return;
                }
                if (obj != null && (obj instanceof Map)) {
                    Map map = (Map) obj;
                    if (map.containsKey("uri") || map.containsKey("url_list")) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri((String) map.get("uri"));
                        urlModel.setUrlList((List) map.get("url_list"));
                        com.ss.android.ugc.aweme.base.c.b(this.g.getHomePageIconView(), urlModel);
                    }
                }
            }
        }
    }

    public final void s(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68228, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68228, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            if (this.k == null || !this.k.isShowing()) {
                H();
                if (this.j != null) {
                    this.j.setScaleX(0.8f);
                    this.j.setScaleY(0.8f);
                    I();
                }
            }
        } else if (!(this.j == null || this.k == null)) {
            this.j.clearAnimation();
            ao.a(this.k);
            View view = getView();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.af);
            }
        }
    }

    public void d(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68206, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68206, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            this.X = true;
            this.l.setVisibility(8);
            this.Y.setVisibility(8);
            this.W.setVisibility(8);
            this.P.setVisibility(8);
            if (user.getVerificationType() == 2) {
                this.X = true;
                this.Y.setVisibility(0);
                this.Y.setText(user.getCustomVerify());
            } else if (!TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
                this.W.setVisibility(0);
            } else if (!TextUtils.isEmpty(user.getCustomVerify())) {
                this.l.setVisibility(0);
                this.l.setText(user.getCustomVerify());
            } else {
                this.X = false;
            }
            i(user);
            if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68207, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68207, new Class[]{User.class}, Void.TYPE);
            } else if (user != null && isViewValid()) {
                if (TextUtils.isEmpty(user.getBioEmail())) {
                    this.R.setVisibility(8);
                } else {
                    this.R.setVisibility(0);
                    this.R.setText(user.getBioEmail());
                }
                if (TextUtils.isEmpty(user.getBioUrl())) {
                    this.Q.setVisibility(8);
                    return;
                }
                this.Q.setVisibility(0);
                this.Q.setText(user.getBioUrl());
            }
        }
    }

    public final void e(User user) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68194, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68194, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid() && user != null) {
            boolean s2 = s();
            if (PatchProxy.isSupport(new Object[]{user, Byte.valueOf(s2 ? (byte) 1 : 0)}, null, ex.f75854a, true, 88661, new Class[]{User.class, Boolean.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{user, Byte.valueOf(s2)}, null, ex.f75854a, true, 88661, new Class[]{User.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (user != null && !user.isBlock() && (s2 || !user.isSecret() || !(user.getFollowStatus() == 0 || user.getFollowStatus() == 4))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.m.setVisibility(8);
                return;
            }
            this.ai.clear();
            if (!TextUtils.isEmpty(user.getInsId())) {
                this.ai.add(1);
                this.m.setVisibility(0);
                this.m.setImageResource(2130839777);
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                this.ai.add(2);
                this.m.setVisibility(0);
                this.m.setImageResource(2130839783);
            }
            if (this.ai.size() == 0) {
                this.m.setVisibility(8);
                return;
            }
            this.m.setVisibility(0);
            this.m.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61942a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f61942a, false, 68246, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f61942a, false, 68246, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusAbsProfileFragment.this.t();
                }
            });
        }
    }

    public final void j(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3797a, false, 68168, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3797a, false, 68168, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.j(user);
        this.B.setLoadingDrawable(2130839406);
        this.B.setTextColor(C0906R.color.zt);
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3797a, false, 68195, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3797a, false, 68195, new Class[]{View.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.bgf);
        } else {
            int id = view.getId();
            if (id == C0906R.id.ank) {
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    A();
                }
            } else if (id == C0906R.id.ahd) {
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        e.a((Fragment) this, "personal_homepage", "follower_list");
                    } else if (ex.m(this.J) || !ex.a(this.J, s()) || this.y <= 0) {
                        z();
                    }
                }
            } else if (id != C0906R.id.ahh) {
                if (id == C0906R.id.a7x) {
                    String str2 = this.I;
                    String str3 = this.ah;
                    if (PatchProxy.isSupport(new Object[]{str2, str3}, this, f3797a, false, 68196, new Class[]{String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, str3}, this, f3797a, false, 68196, new Class[]{String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (com.ss.android.g.a.a()) {
                        str = "\"" + str3 + "\" " + getContext().getResources().getString(C0906R.string.ag8) + " " + str2 + " " + getContext().getResources().getString(C0906R.string.ag9);
                    } else {
                        str = "\"" + str3 + "\"" + getContext().getResources().getString(C0906R.string.ag8) + str2 + getContext().getResources().getString(C0906R.string.ag9);
                    }
                    a.C0185a c2 = new a.C0185a(getActivity()).b(str).a((int) C0906R.string.dtn).a((int) C0906R.string.bdg, (DialogInterface.OnClickListener) null).d(-3476230).c(2130840179);
                    c2.n = true;
                    c2.a().b();
                    MobClick eventName = MobClick.obtain().setEventName("click_like_count");
                    eventName.setLabelName("others_homepage");
                    r.onEvent(eventName);
                }
            } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    e.a((Fragment) this, "personal_homepage", "following_list");
                } else if (ex.m(this.J) || !ex.a(this.J, s()) || this.x <= 0) {
                    y();
                }
            }
        }
    }

    public final void a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68172, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68172, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 < 0) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        super.a(t(i3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.view.View r13) {
        /*
            r12 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 68157(0x10a3d, float:9.5508E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68157(0x10a3d, float:9.5508E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.b((android.view.View) r13)
            r0 = 2131166861(0x7f07068d, float:1.794798E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f3798b = r0
            r0 = 2131166857(0x7f070689, float:1.7947971E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f3799c = r0
            r0 = 2131166342(0x7f070486, float:1.7946927E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.f3800d = r0
            r0 = 2131167086(0x7f07076e, float:1.7948436E38)
            android.view.View r0 = r13.findViewById(r0)
            com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView r0 = (com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView) r0
            r12.f3801e = r0
            com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView r0 = r12.f3801e
            r1 = 2131624939(0x7f0e03eb, float:1.8877072E38)
            r0.setBorderColor(r1)
            com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView r0 = r12.f3801e
            r0.a(r7, r8)
            r0 = 2131169180(0x7f070f9c, float:1.7952683E38)
            android.view.View r0 = r13.findViewById(r0)
            com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator r0 = (com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator) r0
            r12.i = r0
            r0 = 2131168517(0x7f070d05, float:1.7951338E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.O = r0
            android.widget.TextView r0 = r12.D
            com.ss.android.ugc.aweme.profile.ui.al r1 = new com.ss.android.ugc.aweme.profile.ui.al
            r1.<init>(r12)
            r0.setOnClickListener(r1)
            r0 = 2131165563(0x7f07017b, float:1.7945347E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.l = r0
            r0 = 2131165632(0x7f0701c0, float:1.7945487E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.m = r0
            r0 = 2131168508(0x7f070cfc, float:1.795132E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.P = r0
            r0 = 2131166576(0x7f070570, float:1.7947401E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.W = r0
            r0 = 2131168509(0x7f070cfd, float:1.7951322E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.Y = r0
            r0 = 2131171300(0x7f0717e4, float:1.7956983E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.ak = r0
            r0 = 2131169432(0x7f071098, float:1.7953194E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.al = r0
            r9 = 3
            android.view.View[] r10 = new android.view.View[r9]
            android.widget.TextView r0 = r12.l
            r10[r8] = r0
            android.widget.TextView r0 = r12.W
            r10[r7] = r0
            android.widget.TextView r0 = r12.Y
            r11 = 2
            r10[r11] = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68161(0x10a41, float:9.5514E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68161(0x10a41, float:9.5514E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0125
        L_0x0115:
            r0 = 0
        L_0x0116:
            if (r0 >= r9) goto L_0x0125
            r1 = r10[r0]
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$9 r2 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$9
            r2.<init>()
            r1.setOnTouchListener(r2)
            int r0 = r0 + 1
            goto L_0x0116
        L_0x0125:
            android.view.View r0 = r12.O
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$6 r1 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$6
            r1.<init>()
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68164(0x10a44, float:9.5518E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0153
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68164(0x10a44, float:9.5518E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0178
        L_0x0153:
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 == 0) goto L_0x0178
            r0 = 4
            android.view.View[] r0 = new android.view.View[r0]
            android.widget.TextView r1 = r12.A
            r0[r8] = r1
            android.view.View r1 = r12.O
            r0[r7] = r1
            android.view.View r1 = r12.ak
            r0[r11] = r1
            android.view.View r1 = r12.al
            r0[r9] = r1
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r8, (android.view.View[]) r0)
            android.view.View r0 = r12.C
            if (r0 == 0) goto L_0x0178
            android.view.View r0 = r12.C
            r0.setPadding(r8, r8, r8, r8)
        L_0x0178:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68176(0x10a50, float:9.5535E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01a9
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68176(0x10a50, float:9.5535E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x025e
        L_0x01a9:
            r0 = 2131168516(0x7f070d04, float:1.7951336E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.n = r0
            r0 = 2131166686(0x7f0705de, float:1.7947624E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.o = r0
            android.view.View r0 = r12.n
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$10 r1 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$10
            r1.<init>()
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68178(0x10a52, float:9.5538E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68178(0x10a52, float:9.5538E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0227
        L_0x01e9:
            boolean r0 = r12.s()
            if (r0 == 0) goto L_0x0227
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 != 0) goto L_0x0227
            boolean r0 = com.ss.android.ugc.aweme.favorites.d.b.a()
            if (r0 == 0) goto L_0x0227
            android.view.View r0 = r12.o
            if (r0 == 0) goto L_0x0204
            android.view.View r0 = r12.o
            r0.setVisibility(r8)
        L_0x0204:
            android.view.View r0 = r12.n
            if (r0 == 0) goto L_0x0227
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getIsShowFavouritePopup()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x021d
            goto L_0x0227
        L_0x021d:
            android.view.View r0 = r12.n
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$11 r1 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$11
            r1.<init>()
            r0.post(r1)
        L_0x0227:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68177(0x10a51, float:9.5536E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x024b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3797a
            r3 = 0
            r4 = 68177(0x10a51, float:9.5536E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x025e
        L_0x024b:
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 == 0) goto L_0x025e
            android.view.View[] r0 = new android.view.View[r11]
            android.view.View r1 = r12.n
            r0[r8] = r1
            android.view.View r1 = r12.o
            r0[r7] = r1
            com.ss.android.ugc.aweme.base.utils.v.a((boolean) r8, (android.view.View[]) r0)
        L_0x025e:
            r0 = 2131171302(0x7f0717e6, float:1.7956987E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.Q = r0
            android.widget.TextView r0 = r12.Q
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$7 r1 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$7
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131171259(0x7f0717bb, float:1.79569E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.R = r0
            android.widget.TextView r0 = r12.R
            com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$8 r1 = new com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment$8
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment.b(android.view.View):void");
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3797a, false, 68208, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3797a, false, 68208, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.W != null) {
            this.W.setText(str);
        }
    }

    public void onPageSelected(int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68197, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3797a, false, 68197, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.v != null && i4 >= 0 && i4 < this.v.size()) {
            if (!(i4 == this.G || this.v.get(this.G) == null)) {
                ((ProfileListFragment) this.v.get(this.G)).setUserVisibleHint(false);
            }
            E();
            this.G = i4;
            D();
            this.mScrollableLayout.getHelper().f40577c = (b.a) this.v.get(i4);
            boolean k2 = ((ProfileListFragment) this.v.get(i4)).k();
            DampScrollableLayout dampScrollableLayout = this.mScrollableLayout;
            if (!k2 || ex.a(this.J, s())) {
                z = true;
            } else {
                z = false;
            }
            dampScrollableLayout.setCanScrollUp(z);
            if (ex.b() || !(this.v.get(i4) instanceof AwemeListFragment) || !((AwemeListFragment) this.v.get(i4)).B() || !F() || !"from_main".equals(this.F) || this.J.getAwemeCount() != 0 || !w() || !isVisible()) {
                z2 = false;
            } else {
                z2 = true;
            }
            bg.a(new com.ss.android.ugc.aweme.profile.a.e(i4, 0, ((ProfileListFragment) this.v.get(i4)).hashCode()));
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            s(i3);
            if (i4 == 0) {
                if (w()) {
                    r.a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
                }
            } else if (i4 == 1) {
                if (w()) {
                    r.a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
                }
            } else if (i4 == 2 && w()) {
                r.a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
            }
            if (!(this.S == null || this.h == null)) {
                int count = this.S.getCount();
                for (int i5 = 0; i5 < count; i5++) {
                    ProfileListFragment profileListFragment = (ProfileListFragment) this.S.getItem(i5);
                    if (!(profileListFragment == null || profileListFragment.getFragmentManager() == null)) {
                        if (i5 == i4) {
                            profileListFragment.setUserVisibleHint(true);
                        } else {
                            profileListFragment.setUserVisibleHint(false);
                        }
                        profileListFragment.l();
                    }
                }
            }
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.v.get(this.G)).f();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || ex.a(this.J, s())) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        int bottom = (childAt.getBottom() + this.h.getTop()) - this.mScrollableLayout.getCurScrollY();
                        int screenHeight = UIUtils.getScreenHeight(getContext());
                        if (bottom + B() + UIUtils.getStatusBarHeight(getContext()) <= screenHeight) {
                            this.mScrollableLayout.a();
                            ((ProfileListFragment) this.v.get((this.G + 1) % this.v.size())).J_();
                        }
                        this.mScrollableLayout.setMaxScrollHeight(((childAt.getBottom() + this.h.getTop()) + B()) - screenHeight);
                    }
                } else {
                    this.mScrollableLayout.a();
                    ((ProfileListFragment) this.v.get((this.G + 1) % this.v.size())).J_();
                }
            }
        }
    }

    public final void a(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3797a, false, 68210, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3797a, false, 68210, new Class[]{Bundle.class}, Void.TYPE);
        } else if (ex.b()) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), getString(C0906R.string.sk)).a();
        } else {
            com.ss.android.common.lib.a.a(getActivity(), "edit_data", "personal_homepage");
            ProfileEditActivity.a(getActivity(), bundle2);
            SharePrefCache.inst().getIsProfileBubbleShown().a(Boolean.FALSE);
        }
    }

    static /* synthetic */ void a(MusAbsProfileFragment musAbsProfileFragment, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, musAbsProfileFragment, f3797a, false, 68158, new Class[]{String.class}, Void.TYPE)) {
            MusAbsProfileFragment musAbsProfileFragment2 = musAbsProfileFragment;
            PatchProxy.accessDispatch(new Object[]{str}, musAbsProfileFragment2, f3797a, false, 68158, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (ex.g(musAbsProfileFragment.J)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        r.a("click_link", (Map) d.a().a("enter_from", str2).a("link_type", str).a("author_id", musAbsProfileFragment.J.getUid()).f34114b);
    }

    public void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3797a, false, 68203, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3797a, false, 68203, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.v != null && !this.v.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.v.get(this.G)).f();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || ex.a(this.J, s())) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        int screenHeight = UIUtils.getScreenHeight(getContext());
                        this.mScrollableLayout.setMaxScrollHeight((int) (((float) ((childAt.getBottom() + this.h.getTop()) + B())) - (((float) screenHeight) - getResources().getDimension(C0906R.dimen.r7))));
                    } else if (ex.a(this.J, s())) {
                        this.mScrollableLayout.setMaxScrollHeight((int) J());
                    }
                } else {
                    this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }
    }

    public final void b(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3797a, false, 68202, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3797a, false, 68202, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.ac == 0.0f) {
            this.ac = (float) (this.C.getBottom() - this.mScrollableLayout.getTabsMarginTop());
        }
        if (this.v != null && !this.v.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.v.get(this.G)).f();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || ex.a(this.J, s())) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        if (((float) (((childAt.getBottom() + this.h.getTop()) - i2) + B())) <= ((float) UIUtils.getScreenHeight(getContext())) - getResources().getDimension(C0906R.dimen.r7)) {
                            this.mScrollableLayout.setMaxScrollHeight(i2);
                        }
                    } else if (ex.a(this.J, s())) {
                        this.mScrollableLayout.setMaxScrollHeight((int) J());
                    }
                } else {
                    int s2 = ((ProfileListFragment) this.v.get(this.G)).s();
                    int measuredHeight = this.r.getMeasuredHeight() - this.h.getTop();
                    if (s()) {
                        i4 = this.am;
                    } else {
                        i4 = 0;
                    }
                    int i5 = measuredHeight - i4;
                    if (s2 <= 0 || this.r == null || this.h == null || i5 >= s2) {
                        this.mScrollableLayout.setMaxScrollHeight(0);
                        this.mScrollableLayout.setCanScrollUp(false);
                        return;
                    }
                    this.mScrollableLayout.setMaxScrollHeight(s2);
                }
            }
        }
    }

    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f3797a, false, 68174, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f3797a, false, 68174, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            this.A.setVisibility(8);
        } else {
            this.A.setVisibility(0);
            if (!ex.g(this.J) || !ex.b()) {
                super.a(i2, str);
            } else {
                this.A.setText(C0906R.string.c8g);
            }
        }
    }
}
