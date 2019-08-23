package com.ss.android.ugc.aweme.profile.ui.header;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.service.logs.ac;
import com.ss.android.ugc.aweme.commerce.service.logs.aw;
import com.ss.android.ugc.aweme.commerce.service.models.m;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.s;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.d.h;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.a;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.MyProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileTabView;
import com.ss.android.ugc.aweme.profile.ui.RecommendPointView;
import com.ss.android.ugc.aweme.profile.ui.widget.b;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.permission.f;
import com.ss.android.ugc.aweme.utils.t;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

public abstract class AbsMyCommonHeaderLayout extends a implements l, r {
    public static ChangeQuickRedirect ai;
    public boolean aA;
    private int aB;
    private RemoteImageView aC;
    private View aD;
    private BaseProfileFragment aE;
    private boolean aF = ((Boolean) SharePrefCache.inst().getShowFansCard().c()).booleanValue();
    private a aG;
    private ad aH;
    private int aI = 0;
    private int aJ = 0;
    TextView aj;
    RecommendPointView ak;
    DmtTextView al;
    AnimationImageView am;
    View an;
    @Nullable
    View ao;
    protected View ap;
    TextView aq;
    ImageView ar;
    View as;
    FrameLayout at;
    public bm au;
    public b av;
    public FrameLayout aw;
    public DmtTextView ax;
    public ImageView ay;
    public ImageView az;

    public final void a(String str, boolean z) {
    }

    public final void a(boolean z) {
    }

    public final void j() {
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69416, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69416, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        ButterKnife.bind(view);
        this.aj = (TextView) view.findViewById(C0906R.id.bvg);
        this.ak = (RecommendPointView) view.findViewById(C0906R.id.cb6);
        this.al = (DmtTextView) view.findViewById(C0906R.id.cb7);
        this.am = (AnimationImageView) view.findViewById(C0906R.id.dx);
        this.an = view.findViewById(C0906R.id.bpj);
        this.ao = view.findViewById(C0906R.id.bqe);
        this.ap = view.findViewById(C0906R.id.csu);
        this.aq = (TextView) view.findViewById(C0906R.id.c7f);
        this.ar = (ImageView) view.findViewById(C0906R.id.c7e);
        this.at = (FrameLayout) view.findViewById(C0906R.id.c72);
        this.aD = view.findViewById(C0906R.id.brc);
        if (AbTestManager.a().K()) {
            this.at.setAlpha(1.0f);
        } else {
            this.at.setAlpha(0.96f);
        }
        this.as = view.findViewById(C0906R.id.c6v);
        if (TimeLockRuler.isTeenModeON()) {
            view.findViewById(C0906R.id.dj).setVisibility(8);
            this.l.setVisibility(8);
            this.k.setVisibility(8);
        }
        t tVar = new t(this);
        this.R.a((View.OnClickListener) tVar);
        this.R.b(tVar);
        this.R.c(tVar);
        this.R.d(tVar);
        this.R.f(tVar);
        this.R.e(tVar);
        User curUser = d.a().getCurUser();
        if (ex.k(curUser)) {
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("show_link").setLabelName(curUser.isMe() ? "personal_homepage" : "others_homepage").setValue(curUser.getUid()).setJsonObject(c.a().a("link_type", "news_article").b()));
        }
        if (this.w != null) {
            this.w.setOnClickListener(new u(this));
        }
        this.P.setIsMyProfile(true);
        this.aw = (FrameLayout) view.findViewById(C0906R.id.b9y);
        this.aC = (RemoteImageView) view.findViewById(C0906R.id.atc);
        this.ax = (DmtTextView) view.findViewById(C0906R.id.dgn);
        this.ay = (ImageView) view.findViewById(C0906R.id.atb);
        this.az = (ImageView) view.findViewById(C0906R.id.atd);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, ai, false, 69435, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, ai, false, 69435, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!TimeLockRuler.isTeenModeON()) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
                this.an.setVisibility(0);
                this.aq.setText(this.f3817c.getQuickShopInfo().getQuickShopName());
                this.ar.setBackgroundResource(2130839814);
                if (this.ao != null) {
                    this.ao.setVisibility(8);
                }
                if (this.an.getTag(C0906R.id.bpj) == null) {
                    g.a("othershow", getContext(), (Aweme) null, this.f3817c);
                    this.an.setTag(C0906R.id.bpj, 1);
                }
                return;
            }
            boolean z4 = z3 && ((Boolean) x.a().N().c()).booleanValue();
            View view = this.an;
            if (!z4) {
                i = 8;
            }
            view.setVisibility(i);
            if (this.ao != null) {
                this.ao.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f3817c.getShopMicroApp())) {
                this.aq.setText(C0906R.string.bs1);
                if (z4 && this.an.getTag(C0906R.id.bpj) == null && s.a(getActivity(), this.an)) {
                    new aw().b(d.a().getCurUserId()).a("personal_homepage").c("normal").b();
                    this.an.setTag(C0906R.id.bpj, 1);
                }
            } else {
                TextView textView = this.aq;
                if (ex.g(this.f3817c)) {
                    str = getContext().getString(C0906R.string.bfn);
                } else {
                    str = getContext().getString(C0906R.string.ama);
                }
                textView.setText(str);
                if (z4 && this.an.getTag(C0906R.id.bpj) == null && s.a(getActivity(), this.an)) {
                    new aw().b(d.a().getCurUserId()).a("personal_homepage").c("mini_program").b();
                    this.an.setTag(C0906R.id.bpj, 1);
                }
            }
        }
    }

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, ai, false, 69439, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, ai, false, 69439, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        super.a(i, str);
        this.n.setVisibility(0);
        if (!TextUtils.isEmpty(str)) {
            this.n.setText(str);
        } else if (AbTestManager.a().L()) {
            this.n.setText(C0906R.string.bm_);
        } else {
            this.n.setText(C0906R.string.c8f);
        }
    }

    public final void a(final UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, ai, false, 69440, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, ai, false, 69440, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        super.a(urlModel);
        if (urlModel != null && this.T.isActive()) {
            com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.y, urlModel, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62774a;

                public final /* synthetic */ void onFinalImageSet(String str, @javax.annotation.Nullable Object obj, @javax.annotation.Nullable Animatable animatable) {
                    String str2 = str;
                    Animatable animatable2 = animatable;
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f62774a, false, 69491, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f62774a, false, 69491, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    super.onFinalImageSet(str2, imageInfo, animatable2);
                    if (imageInfo != null && (AbsMyCommonHeaderLayout.this.T instanceof MyProfileFragment)) {
                        ((MyProfileFragment) AbsMyCommonHeaderLayout.this.T).a(urlModel.getUrlList(), imageInfo.getHeight(), imageInfo.getWidth());
                    }
                }
            });
            com.ss.android.ugc.aweme.base.c.b(this.E, urlModel);
            if (this.aD != null && this.f3817c.avatarUpdateReminder()) {
                this.aD.setVisibility(0);
            } else if (this.aD != null) {
                this.aD.setVisibility(8);
            }
        }
    }

    public final void a(final ActivityLinkResponse.LinkInfo linkInfo) {
        if (PatchProxy.isSupport(new Object[]{linkInfo}, this, ai, false, 69463, new Class[]{ActivityLinkResponse.LinkInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkInfo}, this, ai, false, 69463, new Class[]{ActivityLinkResponse.LinkInfo.class}, Void.TYPE);
        } else if (linkInfo != null) {
            this.aw.setVisibility(0);
            final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ax.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 21) {
                this.aC.setOutlineProvider(new dp(u.a(2.0d)));
                this.aC.setClipToOutline(true);
            }
            if (b(linkInfo) && this.az != null) {
                this.az.setVisibility(0);
                this.az.setOnClickListener(new z(this));
            }
            final boolean z = !TextUtils.equals(this.au.a(""), "true");
            if (com.ss.android.g.a.a() || z || !linkInfo.disappearAfterClicked) {
                this.aC.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(this.aC.getController())).setControllerListener(new BaseControllerListener<ImageInfo>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62757a;

                    public final /* synthetic */ void onFinalImageSet(String str, @javax.annotation.Nullable Object obj, @javax.annotation.Nullable Animatable animatable) {
                        String str2 = str;
                        Animatable animatable2 = animatable;
                        ImageInfo imageInfo = (ImageInfo) obj;
                        if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f62757a, false, 69485, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f62757a, false, 69485, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                            return;
                        }
                        super.onFinalImageSet(str2, imageInfo, animatable2);
                        AbsMyCommonHeaderLayout.this.ay.setVisibility(8);
                        layoutParams.gravity = 17;
                        AbsMyCommonHeaderLayout.this.ax.setLayoutParams(layoutParams);
                        AbsMyCommonHeaderLayout.this.ax.setTextColor(Color.parseColor(linkInfo.fontColor));
                    }
                })).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(linkInfo.backgroundUrl)).build())).build());
            } else {
                this.ay.setVisibility(0);
                layoutParams.gravity = 16;
                this.aC.setImageURI(new Uri.Builder().scheme("res").path("2131624901").build());
                this.ax.setLayoutParams(layoutParams);
            }
            this.ax.setText(linkInfo.text);
            final com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            a2.a("enter_from", "personal_homepage");
            com.ss.android.ugc.aweme.common.r.a("h5_show_detail", (Map) a2.f34114b);
            this.aw.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62761a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62761a, false, 69486, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62761a, false, 69486, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (AbsMyCommonHeaderLayout.this.az != null) {
                        AbsMyCommonHeaderLayout.this.az.setVisibility(8);
                    }
                    Intent intent = new Intent(AbsMyCommonHeaderLayout.this.getContext(), CrossPlatformActivity.class);
                    intent.putExtra(PushConstants.TITLE, " ");
                    intent.putExtra("bundle_user_webview_title", true);
                    intent.setData(Uri.parse(linkInfo.url));
                    AbsMyCommonHeaderLayout.this.getContext().startActivity(intent);
                    if (z) {
                        AbsMyCommonHeaderLayout.this.au.b("true");
                        if (!com.ss.android.g.a.a()) {
                            AbsMyCommonHeaderLayout.this.aA = linkInfo.disappearAfterClicked;
                        }
                    }
                    com.ss.android.ugc.aweme.common.r.a("h5_enter_detail", (Map) a2.f34114b);
                }
            });
        } else {
            this.aw.setVisibility(8);
        }
    }

    public final void a(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, ai, false, 69467, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, ai, false, 69467, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.r.a("edit_profile", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_method", "click_navigation").a("scene_id", "1001").f34114b);
        ProfileEditActivity.a(getActivity(), bundle2);
        getActivity().overridePendingTransition(C0906R.anim.cz, C0906R.anim.d8);
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, ai, false, 69471, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, ai, false, 69471, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        if (this.aG != null) {
            this.aG.c();
        }
        if (avatarUri == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bv).a();
        } else {
            getUserPresenter().c(avatarUri.uri);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, ai, false, 69472, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, ai, false, 69472, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.aG != null) {
            this.aG.c();
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bv);
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, ai, false, 69474, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, ai, false, 69474, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 4) {
            if (this.aG != null) {
                this.aG.c();
            }
            a(t.b(this.f3817c));
        }
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, ai, false, 69475, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, ai, false, 69475, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 4) {
            if (this.aG != null) {
                this.aG.c();
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bsd);
        }
    }

    private ad getUserPresenter() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69476, new Class[0], ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69476, new Class[0], ad.class);
        }
        if (this.aH == null) {
            this.aH = new ad();
            this.aH.h = this;
        }
        return this.aH;
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69458, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
            g.a("othershow", getContext(), (Aweme) null, this.f3817c);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69417, new Class[0], Void.TYPE);
            return;
        }
        super.b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69422, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        setRecommendCount(this.aB);
        i();
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69469, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69469, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.aE != null && this.aE.e()) {
            z = true;
        }
        return z;
    }

    public String getUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, ai, false, 69459, new Class[0], String.class)) {
            return aa.b(this.f3817c);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, ai, false, 69459, new Class[0], String.class);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69464, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69424, new Class[0], Void.TYPE);
            return;
        }
        h.a().a(getActivity(), "aweme://profile_edit");
        SharePrefCache.inst().getIsProfileBubbleShown().a(Boolean.FALSE);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69423, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        if (this.aA) {
            this.ay.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ax.getLayoutParams();
            layoutParams.gravity = 16;
            this.aC.setImageURI(new Uri.Builder().scheme("res").path("2131624901").build());
            this.ax.setLayoutParams(layoutParams);
            this.aA = false;
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69421, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        if (this.aI != this.aJ) {
            this.aI = this.aJ;
            switch (this.aI) {
                case 0:
                    this.F.setTextColor(getResources().getColor(C0906R.color.a08));
                    this.F.setTypeface(null, 1);
                    return;
                case 1:
                    this.F.setTextColor(getResources().getColor(C0906R.color.a0t));
                    this.F.setTypeface(null, 0);
                    break;
            }
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69452, new Class[0], Void.TYPE);
        } else if (getContext() != null && !com.ss.android.g.a.a()) {
            try {
                if (!f.a()) {
                    h(false);
                } else if (!this.au.b()) {
                    if (com.ss.android.ugc.aweme.utils.permission.a.a((Context) getActivity(), af.f2626c)) {
                        h(false);
                    } else if (!com.ss.android.g.a.a()) {
                        a(this.au, af.f2626c);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69444, new Class[0], Void.TYPE);
        } else if (this.T.isViewValid()) {
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("personal_homepage"));
            com.ss.android.ugc.aweme.common.r.a("click_follow_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").f34114b);
            if (com.ss.android.g.a.c() || (!com.ss.android.g.a.a() && AbTestManager.a().bQ() == 1)) {
                FollowRelationTabActivity.a(getActivity(), this.f3817c, "following_relation");
                com.ss.android.ugc.aweme.common.r.a("enter_relation_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").a("enter_method", "click_follow_count").f34114b);
                return;
            }
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getActivity(), this.T, d.a().getCurUserId(), true, SimpleUserFragment.b.following, this.f3818d);
            aVar.a(this.f3817c).a();
        }
    }

    public final void r() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69445, new Class[0], Void.TYPE);
        } else if (this.T.isViewValid()) {
            User curUser = d.a().getCurUser();
            MobClick labelName = MobClick.obtain().setEventName("click_fans_count").setLabelName("personal_homepage");
            c cVar = new c();
            if (!y.a(curUser)) {
                str = "null";
            } else if (this.aF) {
                str = "show";
            } else {
                str = "hide";
            }
            com.ss.android.ugc.aweme.common.r.onEvent(labelName.setJsonObject(cVar.a("to_status", str).b()));
            com.ss.android.ugc.aweme.common.r.a("click_fans_count", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").f34114b);
            if (com.ss.android.g.a.c() || (!com.ss.android.g.a.a() && AbTestManager.a().bQ() == 1)) {
                FollowRelationTabActivity.a(getActivity(), this.f3817c, "follower_relation");
                com.ss.android.ugc.aweme.common.r.a("enter_relation_tab", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "personal_homepage").a("enter_method", "click_fans_count").f34114b);
                return;
            }
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(getContext(), this.T, d.a().getCurUserId(), true, SimpleUserFragment.b.follower, this.f3819e);
            aVar.a(curUser).a();
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69470, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69470, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        if (this.H != null) {
            if (getPublishPosi() > 0) {
                a((ProfileTabView) this.H.a(getPublishPosi()), "", getContext().getString(C0906R.string.du_));
            }
            if (getFavoritePosi() > 0) {
                a((ProfileTabView) this.H.a(getFavoritePosi()), "", getContext().getString(C0906R.string.b5j));
            }
            if (getDynamicPosi() > 0) {
                a((ProfileTabView) this.H.a(getDynamicPosi()), "", getContext().getString(C0906R.string.aej));
            }
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 69441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ai, false, 69441, new Class[0], Void.TYPE);
            return;
        }
        if (this.T.isViewValid() && this.f3817c != null && !this.f3817c.isLive()) {
            if (this.aD != null && this.aD.getVisibility() == 0) {
                if (this.aG == null) {
                    this.aG = new a();
                    this.aG.f61562c = this;
                    this.aG.a(getActivity(), (Fragment) this.T);
                }
                this.aG.a(0, getActivity(), this.y, this.f3817c);
            } else if (TimeLockRuler.isTeenModeON() || !(getHeadStatus() == 3 || getHeadStatus() == 2 || getHeadStatus() == 4)) {
                com.ss.android.ugc.aweme.common.r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("enter_method", "click_head").f34114b);
                HeaderDetailActivity.a(getActivity(), com.ss.android.ugc.aweme.utils.ad.a().a("uri", ex.a(ex.c(this.f3817c))).a("extra_zoom_info", (Parcelable) fe.a(this.y)).a("share_info", (Serializable) this.f3817c).f75487b);
            } else {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                a2.a("enter_from", "personal_homepage").a("enter_method", "click_head").a("relation_type", 1).a("is_read", StoryUnreadUtils.hasUnreadStory(this.f3817c) ^ true ? 1 : 0).a("author_id", this.f3817c.getUid()).a("to_user_id", this.f3817c.getUid());
                a2.a("log_pb", ai.a().b(this.f3817c.getUid()));
                if (getContext() instanceof Activity) {
                    Intent intent = ((Activity) getContext()).getIntent();
                    if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                        String stringExtra = intent.getStringExtra("rule_id");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            a2.a("rule_id", stringExtra);
                        }
                    }
                }
                com.ss.android.ugc.aweme.common.r.a("enter_story_detail", aa.a(a2.f34114b));
                com.ss.android.ugc.aweme.story.api.model.f fVar = new com.ss.android.ugc.aweme.story.api.model.f();
                fVar.detailType = 3;
                fVar.uid = this.f3817c.getUid();
                fVar.isSelf = true;
                fVar.eventType = "personal_homepage";
                a(fVar);
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, ai, false, 69473, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, ai, false, 69473, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.aG != null) {
            this.aG.b();
        }
    }

    private boolean b(ActivityLinkResponse.LinkInfo linkInfo) {
        if (PatchProxy.isSupport(new Object[]{linkInfo}, this, ai, false, 69462, new Class[]{ActivityLinkResponse.LinkInfo.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{linkInfo}, this, ai, false, 69462, new Class[]{ActivityLinkResponse.LinkInfo.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return false;
        } else {
            String c2 = this.au.c("");
            if (TextUtils.equals("true", this.au.a(""))) {
                return false;
            }
            try {
                int i = linkInfo.closeAfter;
                if (i < 0) {
                    return false;
                }
                if (System.currentTimeMillis() - Long.valueOf(c2).longValue() > ((long) i) * 86400000) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69427, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69427, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (getPublishPosi() >= 0) {
            a((ProfileTabView) this.H.a(getPublishPosi()), String.valueOf(i), a(i, (int) C0906R.string.du9, (int) C0906R.string.du_));
        }
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69431, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69431, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        d.a().getCurUser().setFavoritingCount(i);
        if (getFavoritePosi() >= 0) {
            a((ProfileTabView) this.H.a(getFavoritePosi()), String.valueOf(i), a(i, (int) C0906R.string.b5g, (int) C0906R.string.b5j));
        }
    }

    public final void f(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69434, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69434, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (getStoryPosi() >= 0) {
            a((ProfileTabView) this.H.a(getStoryPosi()), String.valueOf(i), a(i, (int) C0906R.string.ceb, (int) C0906R.string.cg5));
        }
    }

    public final void h(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69426, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69426, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.h(i);
        if (!o() || TimeLockRuler.isTeenModeON()) {
        } else if (getOriginMusicsionPosi() >= 0) {
            ((ProfileTabView) this.H.a(getOriginMusicsionPosi())).setDescription(String.valueOf(i));
        }
    }

    public final void i(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69428, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69428, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (s() && getToolPosi() >= 0) {
            a((ProfileTabView) this.H.a(getToolPosi()), String.valueOf(i), a(i, (int) C0906R.string.bsb, (int) C0906R.string.cnk));
        }
    }

    public void setRecommendCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69461, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69461, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.aB = i;
        if (this.ak != null && this.al != null) {
            if (i <= 0 || TimeLockRuler.isTeenModeON()) {
                this.ak.a();
                this.al.setVisibility(8);
            } else if (AbTestManager.a().n() == 1) {
                this.ak.a();
                this.al.setVisibility(0);
                this.al.setText(String.valueOf(i));
            } else {
                this.ak.b();
            }
        }
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69418, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69418, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.b(view);
        view.findViewById(C0906R.id.dj).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62753a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62753a, false, 69484, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62753a, false, 69484, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    AbsMyCommonHeaderLayout.this.g(view2);
                }
            }
        });
        view.findViewById(C0906R.id.cb6).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62766a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62766a, false, 69487, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62766a, false, 69487, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    AbsMyCommonHeaderLayout.this.g(view2);
                }
            }
        });
        if (AbTestManager.a().n() == 1) {
            this.al.setOnClickListener(new v(this));
        }
        this.an.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62768a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62768a, false, 69488, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62768a, false, 69488, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    AbsMyCommonHeaderLayout.this.h(view2);
                }
            }
        });
        this.as.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62770a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62770a, false, 69489, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62770a, false, 69489, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (com.ss.android.g.a.c()) {
                    AbsMyCommonHeaderLayout.this.a((Bundle) null);
                    return;
                }
                AbsMyCommonHeaderLayout absMyCommonHeaderLayout = AbsMyCommonHeaderLayout.this;
                if (PatchProxy.isSupport(new Object[]{view}, absMyCommonHeaderLayout, AbsMyCommonHeaderLayout.ai, false, 69468, new Class[]{View.class}, Void.TYPE)) {
                    Object[] objArr = {view};
                    AbsMyCommonHeaderLayout absMyCommonHeaderLayout2 = absMyCommonHeaderLayout;
                    ChangeQuickRedirect changeQuickRedirect = AbsMyCommonHeaderLayout.ai;
                    PatchProxy.accessDispatch(objArr, absMyCommonHeaderLayout2, changeQuickRedirect, false, 69468, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    Activity activity = absMyCommonHeaderLayout.getActivity();
                    if (PatchProxy.isSupport(new Object[]{activity}, null, ProfileEditActivity.f62135b, true, 68662, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, null, ProfileEditActivity.f62135b, true, 68662, new Class[]{Activity.class}, Void.TYPE);
                    } else {
                        ProfileEditActivity.a(activity, null);
                    }
                    absMyCommonHeaderLayout.getActivity().overridePendingTransition(C0906R.anim.cz, C0906R.anim.d8);
                    com.ss.android.ugc.aweme.common.r.a("edit_profile", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_method", "click_button").a("enter_from", "personal_homepage").f34114b);
                }
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62772a;

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62772a, false, 69490, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62772a, false, 69490, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                AbsMyCommonHeaderLayout.this.f(view2);
            }
        });
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, ai, false, 69443, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, ai, false, 69443, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            this.aa = str;
            this.q.setText(getResources().getString(C0906R.string.ao6) + str);
            if (!this.f3817c.nicknameUpdateReminder() || !com.ss.android.g.a.a()) {
                this.q.setTextColor(getResources().getColor(C0906R.color.a08));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r0 + " T");
                spannableStringBuilder.setSpan(new h.a(getContext(), 2130838900, 1), (spannableStringBuilder.length() - " T".length()) + 1, spannableStringBuilder.length(), 17);
                this.q.setText(spannableStringBuilder);
                this.q.setTextColor(getResources().getColor(C0906R.color.a0t));
            }
        }
    }

    public final void e(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69442, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69442, new Class[]{View.class}, Void.TYPE);
        } else if (!this.f3817c.nicknameUpdateReminder() || !com.ss.android.g.a.a()) {
            super.e(view);
        } else {
            a(com.ss.android.ugc.aweme.utils.ad.a().a("need_focus_id_input", true).f75487b);
        }
    }

    public final void f(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69419, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69419, new Class[]{View.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(this.f3817c.getSignature()) && AbTestManager.a().L() && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            com.ss.android.ugc.aweme.common.r.a("add_profile_introduction", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_method", "").f34114b);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).switchToSignature(getActivity());
            getActivity().overridePendingTransition(C0906R.anim.cz, C0906R.anim.d8);
        }
    }

    public final void g(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69433, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69433, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (SharePrefCache.inst().isOpenForward() && getDynamicPosi() >= 0) {
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getDynamicPosi());
            if (!AbTestManager.a().aV() || com.ss.android.g.a.a()) {
                a(profileTabView, String.valueOf(i), a(i, (int) C0906R.string.aei, (int) C0906R.string.aej));
            } else {
                a(profileTabView, String.valueOf(i), a(i, (int) C0906R.string.brp, (int) C0906R.string.brr));
            }
        }
    }

    public final void h(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69454, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69454, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        af.a(getContext()).d();
        AnonymousClass10 r0 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62755a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f62755a, false, 69495, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f62755a, false, 69495, new Class[0], Void.TYPE);
                    return;
                }
                if (AbsMyCommonHeaderLayout.this.T.isAdded() && AbsMyCommonHeaderLayout.this.T.isActive()) {
                    if (!(AbsMyCommonHeaderLayout.this.f3817c == null || !TextUtils.isEmpty(AbsMyCommonHeaderLayout.this.f3817c.getCity()) || af.a(AbsMyCommonHeaderLayout.this.getContext()).f() == null)) {
                        af.a(AbsMyCommonHeaderLayout.this.getContext()).a();
                    }
                    SharePrefCache.inst().getIsGrantedLocationPermission().a(Boolean.TRUE);
                }
            }
        };
        if (z) {
            i = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
        } else {
            i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        com.ss.android.b.a.a.a.a(r0, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(View view) {
        if (!com.ss.android.ugc.aweme.c.a.a.a(this.w)) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.c(this.f3817c)) {
                com.ss.android.ugc.aweme.commercialize.b.h hVar = new com.ss.android.ugc.aweme.commercialize.b.h(1, 0, 0);
                bg.a(hVar);
                return;
            }
            if (this.af != null) {
                this.af.b();
            }
            if (this.f3817c.getDefaultAdCoverUrl() != null) {
                AdCoverTitle adCoverTitle = this.f3817c.getAdCoverTitle();
                if (adCoverTitle != null) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().a("starpage_ad").b("click").d("top_bar").g("{}").c(this.f3817c.getAdOrderId()).a(getContext());
                    com.ss.android.ugc.aweme.commercialize.utils.g.a(view.getContext(), adCoverTitle.getWebUrl(), "");
                }
                return;
            }
            if (!CollectionUtils.isEmpty(this.f3817c.getCoverUrls())) {
                com.ss.android.ugc.aweme.common.r.a("click_profile_icon", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("enter_method", "click_cover").f34114b);
                ProfileCoverPreviewActivity.a(getContext(), this.f3817c.getCoverUrls().get(0), true);
            }
        }
    }

    @OnClick({2131495847})
    @Optional
    public void onQrCodeClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69466, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69466, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69465, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69465, new Class[]{View.class}, Void.TYPE);
                return;
            }
            User curUser = d.a().getCurUser();
            QRCodeActivityV2.a(getContext(), new d.a().a(4, ex.h(curUser), "personal_homepage").a(ex.i(curUser), ex.j(curUser), ex.e(curUser)).f63387b);
        }
    }

    public final void g(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69449, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69449, new Class[]{View.class}, Void.TYPE);
            return;
        }
        getActivity().startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), this.aB, 1, "", "personal_homepage"));
        if (this.aB > 0) {
            com.ss.android.ugc.aweme.common.r.a("add_friends_notice", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").f34114b);
        }
        setRecommendCount(0);
        if (view.getId() == C0906R.id.dj) {
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("personal_homepage").setJsonObject(c.a().a("event_type", "normal_way").b()));
            z.a("click_add_friends").a("enter_from", "personal_homepage").e();
        }
    }

    public final void h(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 69450, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 69450, new Class[]{View.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f3817c)) {
            String quickShopUrl = this.f3817c.getQuickShopInfo().getQuickShopUrl();
            if (!com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), quickShopUrl, true)) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), quickShopUrl, "");
            }
            g.a("click", getContext(), (Aweme) null, this.f3817c);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, ai, false, 69451, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, ai, false, 69451, new Class[0], Void.TYPE);
            } else if (TextUtils.isEmpty(this.f3817c.getShopMicroApp())) {
                m mVar = new m(getActivity(), com.ss.android.ugc.aweme.account.d.a().getVerifyStatus(), com.ss.android.ugc.aweme.commerce.service.l.d.a(this.f3817c), "personal_homepage", true, null);
                com.ss.android.ugc.aweme.commercialize.g.a(mVar, "my_store", "personal_homepage", "click_personal_store");
            } else {
                new ac().a("personal_homepage").c("mini_program").b(com.ss.android.ugc.aweme.account.d.a().getCurUserId()).b();
                ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(getActivity(), this.f3817c.getShopMicroApp(), new b.a().b("personal_homepage").a());
            }
        }
    }

    public final void g(boolean z) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 69432, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 69432, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getFavoritePosi() < 0 || TimeLockRuler.isTeenModeON()) {
        } else {
            ProfileTabView profileTabView = (ProfileTabView) this.H.a(getFavoritePosi());
            if (((Integer) x.a().g().c()).intValue() == 0) {
                drawable = null;
            } else if (z) {
                drawable = com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130840243);
            } else {
                drawable = com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130840244);
            }
            profileTabView.setDrawableLeft(drawable);
        }
    }

    public AbsMyCommonHeaderLayout(@NonNull Context context, BaseProfileFragment baseProfileFragment) {
        super(context, baseProfileFragment, null);
        this.aE = baseProfileFragment;
        this.au = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getContext(), bm.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.aweme.main.bm r20, java.lang.String[] r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = ai
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.main.bm> r4 = com.ss.android.ugc.aweme.main.bm.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 69453(0x10f4d, float:9.7324E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = ai
            r15 = 0
            r16 = 69453(0x10f4d, float:9.7324E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.main.bm> r1 = com.ss.android.ugc.aweme.main.bm.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            com.bytedance.ies.dmt.ui.b.a$a r2 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r3 = r19.getContext()
            r2.<init>(r3)
            r3 = 2130840183(0x7f020a77, float:1.7285398E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.c(r3)
            r3 = 2131561064(0x7f0d0a68, float:1.8747518E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.a((int) r3)
            r3 = 2131561062(0x7f0d0a66, float:1.8747514E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.b((int) r3)
            r3 = 2131561059(0x7f0d0a63, float:1.8747508E38)
            com.ss.android.ugc.aweme.profile.ui.header.x r4 = new com.ss.android.ugc.aweme.profile.ui.header.x
            r5 = r19
            r4.<init>(r5, r1, r0)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r2.a((int) r3, (android.content.DialogInterface.OnClickListener) r4)
            r2 = 2131561058(0x7f0d0a62, float:1.8747506E38)
            com.ss.android.ugc.aweme.profile.ui.header.y r3 = new com.ss.android.ugc.aweme.profile.ui.header.y
            r3.<init>(r0)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r1.b((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout.a(com.ss.android.ugc.aweme.main.bm, java.lang.String[]):void");
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69437, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, ai, false, 69437, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, ai, false, 69436, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, ai, false, 69436, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.G.getLayoutParams().width = (int) (((((((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), 94.0f)) - (UIUtils.dip2Px(getContext(), 16.0f) * 2.0f)) - UIUtils.dip2Px(getContext(), 40.0f)) - UIUtils.dip2Px(getContext(), 4.0f)) - UIUtils.dip2Px(getContext(), 20.0f));
            this.G.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837983));
            this.G.setVisibility(0);
            this.G.requestLayout();
        } else {
            if (com.ss.android.g.a.c()) {
                this.G.getLayoutParams().width = (int) (((((((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), 94.0f)) - (UIUtils.dip2Px(getContext(), 16.0f) * 2.0f)) - (UIUtils.dip2Px(getContext(), 40.0f) * 2.0f)) - UIUtils.dip2Px(getContext(), 4.0f)) - UIUtils.dip2Px(getContext(), 20.0f));
                this.G.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837983));
                this.G.setVisibility(0);
                this.G.requestLayout();
            }
        }
    }

    private void a(ProfileTabView profileTabView, String str, String str2) {
        ProfileTabView profileTabView2 = profileTabView;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{profileTabView2, str, str3}, this, ai, false, 69429, new Class[]{ProfileTabView.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileTabView2, str, str3}, this, ai, false, 69429, new Class[]{ProfileTabView.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (profileTabView2 != null && getTabCount() < 4) {
            profileTabView2.setText(str3);
        }
    }

    private String a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, ai, false, 69430, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, ai, false, 69430, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, String.class);
        } else if (TimeLockRuler.isTeenModeON()) {
            return getContext().getResources().getString(i3);
        } else {
            if (com.ss.android.g.a.a()) {
                Locale locale = Locale.getDefault();
                String string = getContext().getString(i6);
                Object[] objArr = new Object[1];
                if (i < 0) {
                    i5 = 0;
                } else {
                    i5 = i;
                }
                objArr[0] = Integer.valueOf(i5);
                return String.format(locale, string, objArr);
            }
            Context context = getContext();
            Object[] objArr2 = new Object[1];
            if (i < 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            objArr2[0] = Integer.valueOf(i4);
            return context.getString(i6, objArr2);
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z3;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, ai, false, 69438, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, ai, false, 69438, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!TimeLockRuler.isTeenModeON()) {
            if (TextUtils.equals(this.f3817c.getUid(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (!z4 || !com.ss.android.ugc.aweme.story.a.a()) {
                if (getHeadStatus() != 4) {
                    a(z5, z6);
                    if (!z5) {
                        i = 0;
                    } else if (!z6) {
                        i = 3;
                    }
                    setHeadStatus(i);
                    this.am.cancelAnimation();
                    this.am.setVisibility(8);
                    this.y.setBorderWidthPx(0);
                }
            } else if (this.am != null) {
                com.ss.android.ugc.aweme.story.live.b.a(getContext(), true, 0, this.f3817c.getRequestId(), this.f3817c.getUid(), this.f3817c.roomId);
                this.am.setVisibility(0);
                this.am.setAnimation("tag_profile_live.json");
                this.am.playAnimation();
                a(false, z6);
                setHeadStatus(1);
                this.y.setBorderColor(C0906R.color.a1z);
                this.y.setBorderWidth(2);
            }
        }
    }

    public void a(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, ai, false, 69457, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, ai, false, 69457, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i3 == 20001) {
            if (i4 == -1) {
                int intExtra = intent2.getIntExtra("recommend_count", -1);
                if (intExtra == -1) {
                    intExtra = this.aB;
                }
                this.aB = intExtra;
                setRecommendCount(this.aB);
            }
        } else if (this.aG != null) {
            this.aG.a(i3, i4, intent2);
        }
    }

    public final boolean b(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), blueVBrandInfo, user}, this, ai, false, 69420, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), blueVBrandInfo, user}, this, ai, false, 69420, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Boolean.TYPE)).booleanValue();
        }
        boolean b2 = super.b(str, i, blueVBrandInfo, user);
        if (b2 || !this.f3817c.nicknameUpdateReminder() || com.ss.android.g.a.a()) {
            this.aJ = 0;
            return b2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + " T");
        h.a aVar = new h.a(getContext(), 2130838900, 1);
        aVar.f61421b = -4;
        spannableStringBuilder.setSpan(aVar, (spannableStringBuilder.length() - " T".length()) + 1, spannableStringBuilder.length(), 17);
        this.F.setText(spannableStringBuilder);
        this.F.setOnClickListener(new w(this));
        this.aJ = 1;
        return true;
    }
}
