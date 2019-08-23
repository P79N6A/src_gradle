package com.ss.android.ugc.aweme.commercialize.feed;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.downloadlib.h;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.c.a.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CommerceTag;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commerce.service.logs.ak;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.commercialize.ad.AdRatingView;
import com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup;
import com.ss.android.ugc.aweme.commercialize.ad.DescTextView;
import com.ss.android.ugc.aweme.commercialize.adapter.BaseVideoHolderDelegate;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.symphony.f;
import com.ss.android.ugc.aweme.commercialize.utils.AutoPlayUtils;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.al;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.cards.a;
import com.ss.android.ugc.aweme.commercialize.views.cards.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.s;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.shortvideo.util.aq;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.web.jsbridge.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class CommerceVideoDelegate extends BaseVideoHolderDelegate implements AutoPlayUtils.a {
    private static final int C = 2131165281;

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f38685b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final String f38686c = "CommerceVideoDelegate";
    private TextView A;
    private TagLayout B;
    private boolean D;
    private Runnable E;
    private aa<ar> F;
    @BindView(2131492950)
    DmtTextView adAppUseNumber;
    @BindView(2131492959)
    CircleWaveLayout adCircleWaveLayout;
    @BindView(2131492966)
    DescTextView adGuideDesc;
    @BindView(2131492981)
    RemoteImageView adGuideIcon;
    @BindView(2131492984)
    RemoteImageView adGuideImage;
    @BindView(2131492989)
    DmtTextView adGuideLabel;
    @BindView(2131492993)
    DmtTextView adGuideName;
    @BindView(2131493001)
    DmtTextView adGuidePrice;
    @BindView(2131493006)
    DmtTextView adGuideService;
    @BindView(2131493020)
    DmtTextView adGuideTitle;
    @BindView(2131493024)
    RemoteImageView adGuideWebImage;
    @BindView(2131492976)
    public AdHalfWebPageContainer adHalfWebPageContainer;
    @BindView(2131492990)
    View adLikeDivide;
    @BindView(2131492991)
    LinearLayout adLikeLayout;
    @BindView(2131493002)
    LinearLayout adPriceLayout;
    @BindView(2131493003)
    AdRatingView adRatingView;
    @BindView(2131493004)
    RemoteImageView adRedPacketIv;
    @BindView(2131493019)
    AdTagGroup adTagGroup;
    @BindView(2131493301)
    BlackMaskLayer blackMaskLayer;
    @BindView(2131493690)
    public CommerceGoodHalfCardContainer commerceGoodHalfCardContainer;

    /* renamed from: d  reason: collision with root package name */
    public int f38687d;
    @BindView(2131492967)
    public CommerceLikeLayout diggLayout;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f38688e;

    /* renamed from: f  reason: collision with root package name */
    public RelativeLayout f38689f;
    @BindView(2131494236)
    TextView feedAdDownloadBtn;
    @BindView(2131494237)
    public LinearLayout feedAdLayout;
    @BindView(2131494238)
    View feedAdReplay;
    @BindView(2131494246)
    LinearLayout feedStarAtlasCheckLL;
    @BindView(2131492975)
    FrameLayout flAdGuideRoot;
    public MicroAppVideoCardView g;
    public final IFeedViewHolder h;
    public DataCenter i;
    @BindView(2131493203)
    public LinearLayout introContainer;
    public String j;
    public Context k;
    public Runnable l;
    public long m = -1;
    @BindView(2131493320)
    View mAdBackgroundLayout;
    @BindView(2131493317)
    public FrameLayout mBottomView;
    @BindView(2131493711)
    CommerceTag mCommerceTagView;
    @Nullable
    @BindView(2131494020)
    DouPlusTagLayout mDouPlusLinkTag;
    @BindView(2131498468)
    AnimationImageView mIvRelieveTag;
    @Nullable
    @BindView(2131495394)
    public CommerceTagLayout mLinkTag;
    @Nullable
    @BindView(2131495775)
    CommerceMicroTagLayout mMicroTag;
    public long n = -1;
    @BindView(2131495877)
    public ButtonAdBottomLabelView newAdBottomLabelView;
    public e o = new e();
    @BindView(2131496031)
    public StripAdBottomLabelView oldAdBottomLabelView;
    public JSONObject p;
    public Fragment q;
    public boolean r = false;
    public final a s = new a(this, (byte) 0);
    @BindView(2131497300)
    DmtTextView starAtlasCheckHintTv;
    public b t = null;
    public com.ss.android.ugc.aweme.commercialize.feed.a.a u;
    public com.ss.android.ugc.aweme.commercialize.c.b v = new com.ss.android.ugc.aweme.commercialize.c.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38694a;

        public final void a() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f38694a, false, 30718, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38694a, false, 30718, new Class[0], Void.TYPE);
                return;
            }
            if (!(CommerceVideoDelegate.this.f38688e == null || CommerceVideoDelegate.this.f38688e.getAwemeRawAd() == null)) {
                h a2 = c.a();
                String a3 = com.ss.android.ugc.aweme.commercialize.utils.c.a(CommerceVideoDelegate.this.f38688e);
                if (CommerceVideoDelegate.this.feedAdLayout.getVisibility() == 0) {
                    str = "background_ad";
                } else {
                    str = "feed_download_ad";
                }
                a2.a(a3, 2, com.ss.android.ugc.aweme.app.c.d.c.a(str, CommerceVideoDelegate.this.f38688e.getAwemeRawAd()), (com.ss.android.download.api.b.a) com.ss.android.ugc.aweme.app.c.d.b.a(CommerceVideoDelegate.this.f38688e.getAwemeRawAd()));
            }
        }
    };
    @Nullable
    @BindView(2131498416)
    ViewGroup vastAdTag;
    @Nullable
    @BindView(2131498417)
    RemoteImageView vastAdTagAdChoice;
    @Nullable
    @BindView(2131498418)
    DmtTextView vastAdTagText;
    public com.ss.android.ugc.aweme.commercialize.views.cards.a w;
    public boolean x = false;
    public boolean y = false;
    private int z;

    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38709a;

        /* renamed from: b  reason: collision with root package name */
        boolean f38710b;

        private boolean c() {
            if (!PatchProxy.isSupport(new Object[0], this, f38709a, false, 30737, new Class[0], Boolean.TYPE)) {
                return com.ss.android.ugc.aweme.feed.k.b.a(CommerceVideoDelegate.this.f38688e);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38709a, false, 30737, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f38709a, false, 30735, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38709a, false, 30735, new Class[0], Void.TYPE);
            } else if (!this.f38710b) {
                this.f38710b = true;
                if (PatchProxy.isSupport(new Object[0], this, f38709a, false, 30738, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f38709a, false, 30738, new Class[0], Void.TYPE);
                    return;
                }
                if (!CommerceVideoDelegate.this.r && c()) {
                    com.ss.android.ugc.aweme.commerce.b.a.a();
                    CommerceVideoDelegate.this.h.k().x();
                }
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f38709a, false, 30736, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38709a, false, 30736, new Class[0], Void.TYPE);
            } else if (this.f38710b) {
                this.f38710b = false;
                if (PatchProxy.isSupport(new Object[0], this, f38709a, false, 30739, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f38709a, false, 30739, new Class[0], Void.TYPE);
                    return;
                }
                if (!CommerceVideoDelegate.this.r && c()) {
                    com.ss.android.ugc.aweme.commerce.b.a.a();
                    CommerceVideoDelegate.this.h.k().x();
                }
            }
        }

        private a() {
        }

        /* synthetic */ a(CommerceVideoDelegate commerceVideoDelegate, byte b2) {
            this();
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38712a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f38713b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<CommerceVideoDelegate> f38714c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f38712a, false, 30741, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38712a, false, 30741, new Class[0], Void.TYPE);
                return;
            }
            this.f38713b.removeCallbacks(this);
            this.f38713b.postDelayed(this, 200);
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f38712a, false, 30740, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38712a, false, 30740, new Class[0], Void.TYPE);
                return;
            }
            CommerceVideoDelegate commerceVideoDelegate = (CommerceVideoDelegate) this.f38714c.get();
            if (commerceVideoDelegate != null) {
                Aweme aweme = commerceVideoDelegate.f38688e;
                long c2 = o.b().c();
                if (PatchProxy.isSupport(new Object[]{aweme, new Long(c2)}, null, al.f39702a, true, 32589, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, new Long(c2)}, null, al.f39702a, true, 32589, new Class[]{Aweme.class, Long.TYPE}, Void.TYPE);
                } else if (aweme != null && al.e(aweme) && c2 >= al.f(aweme) && !al.f39704c.c(aweme)) {
                    g.a(GlobalContext.getContext(), aweme, "play");
                    al.f39704c.a(aweme, true);
                }
                a();
            }
        }

        b(CommerceVideoDelegate commerceVideoDelegate) {
            this.f38714c = new WeakReference<>(commerceVideoDelegate);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f38685b, false, 30615, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f38685b, false, 30615, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z2, true);
    }

    public boolean a(final FragmentManager fragmentManager, final IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, iFeedViewHolder}, this, f38685b, false, 30628, new Class[]{FragmentManager.class, IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentManager, iFeedViewHolder}, this, f38685b, false, 30628, new Class[]{FragmentManager.class, IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (q() || l()) {
            return false;
        } else {
            this.r = true;
            this.flAdGuideRoot.setAlpha(0.0f);
            CardStruct q2 = com.ss.android.ugc.aweme.commercialize.utils.c.q(this.f38688e);
            if (q2 != null) {
                a.C0800a.a(q2);
                a.C0800a.a(this.f38688e);
            }
            p.a(this.f38688e, new com.ss.android.ugc.aweme.commercialize.views.form.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f38690a;

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f38690a, false, 30716, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38690a, false, 30716, new Class[0], Void.TYPE);
                        return;
                    }
                    CommerceVideoDelegate.this.a(fragmentManager, true, iFeedViewHolder);
                    CommerceVideoDelegate.this.b(false);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f38690a, false, 30714, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38690a, false, 30714, new Class[0], Void.TYPE);
                        return;
                    }
                    CommerceVideoDelegate.this.flAdGuideRoot.animate().alpha(1.0f).setDuration(200).start();
                    CommerceVideoDelegate.this.b(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("background_type", "-1");
                    g.a(CommerceVideoDelegate.this.k, CommerceVideoDelegate.this.f38688e, (Map<String, String>) hashMap);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f38690a, false, 30715, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38690a, false, 30715, new Class[0], Void.TYPE);
                        return;
                    }
                    CommerceVideoDelegate.this.a(fragmentManager, false, iFeedViewHolder);
                    CommerceVideoDelegate.this.b(iFeedViewHolder);
                    g.L(CommerceVideoDelegate.this.k, CommerceVideoDelegate.this.f38688e);
                    CommerceVideoDelegate.this.flAdGuideRoot.setAlpha(1.0f);
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38690a, false, 30717, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38690a, false, 30717, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!z) {
                        g.K(CommerceVideoDelegate.this.k, CommerceVideoDelegate.this.f38688e);
                    }
                }
            }, fragmentManager, this.flAdGuideRoot, C);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x034d, code lost:
        if (r0 != false) goto L_0x034f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r20 = this;
            r7 = r20
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30633(0x77a9, float:4.2926E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30633(0x77a9, float:4.2926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a r0 = r7.s
            r9 = 1
            r0.f38710b = r9
            r7.r = r8
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a r0 = r7.s
            com.ss.android.ugc.aweme.commercialize.symphony.g.a(r0)
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r0 = r7.diggLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            r0.setCommerceDigg(r1)
            r20.o()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30645(0x77b5, float:4.2943E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30645(0x77b5, float:4.2943E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0074
        L_0x0061:
            com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer r0 = r7.adHalfWebPageContainer
            java.lang.Runnable r1 = r7.l
            r0.removeCallbacks(r1)
            com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer r0 = r7.adHalfWebPageContainer
            java.lang.Runnable r1 = r7.E
            r0.removeCallbacks(r1)
            r0 = 0
            r7.l = r0
            r7.E = r0
        L_0x0074:
            r7.D = r8
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r7.h
            if (r0 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r7.h
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r0.k()
            if (r0 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r7.h
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r0.k()
            android.view.View r0 = r0.x()
            if (r0 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.commerce.b.a.a()
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r7.h
            com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView r0 = r0.k()
            r0.x()
        L_0x009a:
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r0 = r7.mLinkTag
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            boolean r0 = r7.a((com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            if (r0 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r0 = r7.mLinkTag
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout.f38982a
            r13 = 0
            r14 = 30910(0x78be, float:4.3314E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x00c8
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout.f38982a
            r13 = 0
            r14 = 30910(0x78be, float:4.3314E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00d1
        L_0x00c8:
            com.ss.android.ugc.aweme.commercialize.link.video.n r1 = r0.f38983b
            if (r1 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.commercialize.link.video.n r0 = r0.f38983b
            r0.a()
        L_0x00d1:
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r0 = r7.mMicroTag
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = "iron_man"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.link.f.a(r0, r1)
            if (r0 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r0 = r7.mMicroTag
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout.f38974a
            r13 = 0
            r14 = 30896(0x78b0, float:4.3295E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0103
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout.f38974a
            r13 = 0
            r14 = 30896(0x78b0, float:4.3295E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0134
        L_0x0103:
            com.ss.android.ugc.aweme.commercialize.link.micro.a r1 = r0.f38975b
            if (r1 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.commercialize.link.micro.a r0 = r0.f38975b
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.micro.a.f38976a
            r13 = 0
            r14 = 30898(0x78b2, float:4.3297E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x012b
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.link.micro.a.f38976a
            r13 = 0
            r14 = 30898(0x78b2, float:4.3297E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0134
        L_0x012b:
            com.ss.android.ugc.aweme.commercialize.link.video.a r1 = r0.f38977b
            if (r1 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.commercialize.link.video.a r0 = r0.f38977b
            r0.a()
        L_0x0134:
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r7.o
            if (r0 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r7.o
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.feed.e.f38827a
            r13 = 0
            r14 = 30580(0x7774, float:4.2852E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x015c
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.feed.e.f38827a
            r13 = 0
            r14 = 30580(0x7774, float:4.2852E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0169
        L_0x015c:
            com.ss.android.ugc.aweme.commercialize.feed.am r1 = r0.f38830d
            if (r1 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.commercialize.feed.am r1 = r0.f38830d
            android.content.Context r2 = r0.f38829c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f38828b
            r1.onPageSelected(r2, r0)
        L_0x0169:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30659(0x77c3, float:4.2962E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x018d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30659(0x77c3, float:4.2962E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0197
        L_0x018d:
            com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView r0 = r7.oldAdBottomLabelView
            r0.r()
            com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView r0 = r7.newAdBottomLabelView
            r0.r()
        L_0x0197:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30674(0x77d2, float:4.2983E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01bd
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30674(0x77d2, float:4.2983E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d1
        L_0x01bd:
            android.widget.TextView r0 = r7.A
            if (r0 == 0) goto L_0x01d1
            android.widget.LinearLayout r0 = r7.introContainer
            r1 = 0
            r0.setTranslationX(r1)
            android.widget.LinearLayout r0 = r7.introContainer
            r0.setTranslationY(r1)
            android.widget.LinearLayout r0 = r7.introContainer
            r0.setAlpha(r10)
        L_0x01d1:
            r20.e()
            r20.h()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            r11 = 2
            if (r0 == 0) goto L_0x0274
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0274
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "ad_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "request_id"
            com.ss.android.ugc.aweme.feed.a r3 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f38688e
            int r5 = r7.z
            java.lang.String r3 = r3.c((com.ss.android.ugc.aweme.feed.model.Aweme) r4, (int) r5)
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.longvideo.b.b.a(r0)
            if (r0 == 0) goto L_0x0274
            android.content.Context r0 = r7.k
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r0
            r12[r9] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r15 = 1
            r16 = 31778(0x7c22, float:4.453E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r8] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r9] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0263
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r0
            r12[r9] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r15 = 1
            r16 = 31778(0x7c22, float:4.453E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0274
        L_0x0263:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 != 0) goto L_0x0274
            java.lang.String r2 = "show_complete"
            java.lang.String r3 = "long video raw ad label show"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
        L_0x0274:
            r7.d(r9)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30617(0x7799, float:4.2904E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x029c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30617(0x7799, float:4.2904E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x070a
        L_0x029c:
            com.ss.android.ugc.aweme.commercialize.symphony.c r0 = com.ss.android.ugc.aweme.commercialize.symphony.c.a()
            android.content.Context r1 = r7.k
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f38688e
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            r12[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r15 = 0
            r16 = 32106(0x7d6a, float:4.499E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r8] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r9] = r4
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x02e9
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            r12[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r15 = 0
            r16 = 32106(0x7d6a, float:4.499E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r9] = r2
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x02f2
        L_0x02e9:
            int r0 = r0.a(r1, r2)
            if (r0 != r9) goto L_0x02f1
            r0 = 1
            goto L_0x02f2
        L_0x02f1:
            r0 = 0
        L_0x02f2:
            r12 = 3
            if (r0 != 0) goto L_0x034f
            com.ss.android.ugc.aweme.commercialize.symphony.c r0 = com.ss.android.ugc.aweme.commercialize.symphony.c.a()
            android.content.Context r1 = r7.k
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f38688e
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r8] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r16 = 0
            r17 = 32107(0x7d6b, float:4.4991E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r8] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r9] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0344
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r8] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r16 = 0
            r17 = 32107(0x7d6b, float:4.4991E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r9] = r2
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x034d
        L_0x0344:
            int r0 = r0.a(r1, r2)
            if (r0 != r12) goto L_0x034c
            r0 = 1
            goto L_0x034d
        L_0x034c:
            r0 = 0
        L_0x034d:
            if (r0 == 0) goto L_0x070a
        L_0x034f:
            android.widget.LinearLayout r0 = r7.feedAdLayout
            r13 = 8
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r0)
            if (r0 != 0) goto L_0x0388
            android.widget.RelativeLayout r0 = r7.f38689f
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.widget.RelativeLayout r0 = r7.f38689f
            r0.setAlpha(r10)
            android.content.Context r0 = r7.k
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 == 0) goto L_0x0383
            android.widget.RelativeLayout r0 = r7.f38689f
            com.ss.android.ugc.aweme.main.a r1 = com.ss.android.ugc.aweme.main.a.a()
            boolean r1 = r1.f54286b
            if (r1 == 0) goto L_0x037e
            r1 = 4
            goto L_0x037f
        L_0x037e:
            r1 = 0
        L_0x037f:
            r0.setVisibility(r1)
            goto L_0x0388
        L_0x0383:
            android.widget.RelativeLayout r0 = r7.f38689f
            r0.setVisibility(r8)
        L_0x0388:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x039b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            int r0 = r0.getNativeCardType()
            goto L_0x039c
        L_0x039b:
            r0 = 0
        L_0x039c:
            switch(r0) {
                case 0: goto L_0x0674;
                case 1: goto L_0x066f;
                case 2: goto L_0x0569;
                case 3: goto L_0x041f;
                case 4: goto L_0x03a4;
                default: goto L_0x039f;
            }
        L_0x039f:
            r20.r()
            goto L_0x070a
        L_0x03a4:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30622(0x779e, float:4.291E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03c9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30622(0x779e, float:4.291E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x070a
        L_0x03c9:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideTitle
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideLabel
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adPriceLayout
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideIcon
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideName
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adLikeLayout
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r7.adGuideDesc
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideImage
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x070a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.k r0 = r0.getNativeCardInfo()
            if (r0 != 0) goto L_0x0407
            goto L_0x070a
        L_0x0407:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.k r0 = r0.getNativeCardInfo()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideWebImage
            r1.setVisibility(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideWebImage
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.image
            com.ss.android.ugc.aweme.base.c.b(r1, r0)
            goto L_0x070a
        L_0x041f:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30621(0x779d, float:4.2909E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0444
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30621(0x779d, float:4.2909E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x070a
        L_0x0444:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideIcon
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideName
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r7.adGuideDesc
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup r0 = r7.adTagGroup
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x070a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.k r0 = r0.getNativeCardInfo()
            if (r0 != 0) goto L_0x046e
            goto L_0x070a
        L_0x046e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.k r0 = r0.getNativeCardInfo()
            java.lang.String r1 = r0.imageUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x049a
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideImage
            com.facebook.drawee.interfaces.DraweeHierarchy r1 = r1.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r1 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r1
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r2 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.CENTER
            r1.setActualImageScaleType(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideImage
            r2 = 2130839323(0x7f02071b, float:1.7283653E38)
            com.ss.android.ugc.aweme.base.model.a r2 = com.ss.android.ugc.aweme.base.model.a.a(r2)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (com.ss.android.ugc.aweme.base.model.a) r2)
            goto L_0x04ae
        L_0x049a:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideImage
            com.facebook.drawee.interfaces.DraweeHierarchy r1 = r1.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r1 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r1
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r2 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.FIT_XY
            r1.setActualImageScaleType(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.adGuideImage
            java.lang.String r2 = r0.imageUrl
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
        L_0x04ae:
            java.lang.String r1 = r0.title
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x04bc
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuideTitle
            r1.setVisibility(r13)
            goto L_0x04c3
        L_0x04bc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuideTitle
            java.lang.String r2 = r0.title
            r1.setText(r2)
        L_0x04c3:
            java.lang.String r1 = r0.featureLabel
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x04d1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuideLabel
            r1.setVisibility(r13)
            goto L_0x04d8
        L_0x04d1:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuideLabel
            java.lang.String r2 = r0.featureLabel
            r1.setText(r2)
        L_0x04d8:
            int r1 = r0.feedbackRate
            r2 = 80
            if (r1 >= r2) goto L_0x04e4
            android.widget.LinearLayout r1 = r7.adLikeLayout
            r1.setVisibility(r13)
            goto L_0x0559
        L_0x04e4:
            int r1 = r0.feedbackRate
            r2 = 90
            r3 = 2131560203(0x7f0d070b, float:1.8745772E38)
            if (r1 >= r2) goto L_0x0511
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = r7.adRatingView
            r2 = 1082130432(0x40800000, float:4.0)
            r1.setRatingProgress(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adAppUseNumber
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r0.feedbackRate
            r2.append(r4)
            android.content.Context r4 = r7.k
            java.lang.String r3 = r4.getString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            goto L_0x0559
        L_0x0511:
            int r1 = r0.feedbackRate
            r2 = 100
            r4 = 1084227584(0x40a00000, float:5.0)
            if (r1 > r2) goto L_0x053b
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = r7.adRatingView
            r1.setRatingProgress(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adAppUseNumber
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r0.feedbackRate
            r2.append(r4)
            android.content.Context r4 = r7.k
            java.lang.String r3 = r4.getString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            goto L_0x0559
        L_0x053b:
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = r7.adRatingView
            r1.setRatingProgress(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adAppUseNumber
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "100"
            r2.<init>(r4)
            android.content.Context r4 = r7.k
            java.lang.String r3 = r4.getString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
        L_0x0559:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuidePrice
            java.lang.String r2 = r0.originPrice
            r1.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.adGuideService
            java.lang.String r0 = r0.service
            r1.setText(r0)
            goto L_0x070a
        L_0x0569:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30619(0x779b, float:4.2906E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x058e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30619(0x779b, float:4.2906E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x070a
        L_0x058e:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideImage
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideTitle
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideLabel
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adPriceLayout
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adLikeLayout
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup r0 = r7.adTagGroup
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            java.lang.String r0 = r0.getDesc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05ea
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r7.adGuideDesc
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            java.lang.String r1 = r1.getDesc()
            r0.setText(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x05ea
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r0 = r0.getAdMoreTextual()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05ea
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r7.adGuideDesc
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            java.lang.String r1 = r1.getAdMoreTextual()
            r0.setMoreString(r1)
        L_0x05ea:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x060f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarMedium()
            if (r0 != 0) goto L_0x05ff
            goto L_0x060f
        L_0x05ff:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideIcon
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            goto L_0x061b
        L_0x060f:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideIcon
            r1 = 2130839027(0x7f0205f3, float:1.7283053E38)
            com.ss.android.ugc.aweme.base.model.a r1 = com.ss.android.ugc.aweme.base.model.a.a(r1)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.a) r1)
        L_0x061b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x070a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (int) r12)
            if (r0 == 0) goto L_0x0653
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideName
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            com.bytedance.g.b.f r1 = r1.vast
            java.lang.String r1 = r1.adTitle
            if (r1 != 0) goto L_0x0640
            java.lang.String r1 = ""
            goto L_0x064e
        L_0x0640:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            com.bytedance.g.b.f r1 = r1.vast
            java.lang.String r1 = r1.adTitle
        L_0x064e:
            r0.setText(r1)
            goto L_0x070a
        L_0x0653:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideName
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 != 0) goto L_0x0660
            java.lang.String r1 = ""
            goto L_0x066a
        L_0x0660:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r1 = r1.getNickname()
        L_0x066a:
            r0.setText(r1)
            goto L_0x070a
        L_0x066f:
            r20.r()
            goto L_0x070a
        L_0x0674:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30620(0x779c, float:4.2908E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0698
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30620(0x779c, float:4.2908E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x070a
        L_0x0698:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideImage
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideTitle
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideLabel
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adPriceLayout
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.adGuideIcon
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.adGuideName
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.adLikeLayout
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r7.adGuideDesc
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x070a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String[] r0 = r0.getAppCategory()
            int r0 = r0.length
            if (r0 == 0) goto L_0x0705
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            java.lang.String[] r1 = r1.getAppCategory()
            int r2 = r1.length
            r3 = 0
        L_0x06e6:
            if (r3 >= r2) goto L_0x06f7
            r4 = r1[r3]
            int r5 = r4.length()
            r6 = 6
            if (r5 >= r6) goto L_0x06f4
            r0.add(r4)
        L_0x06f4:
            int r3 = r3 + 1
            goto L_0x06e6
        L_0x06f7:
            com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup r1 = r7.adTagGroup
            java.lang.String[] r2 = new java.lang.String[r8]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.setTagList(r0)
            goto L_0x070a
        L_0x0705:
            com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup r0 = r7.adTagGroup
            r0.setVisibility(r13)
        L_0x070a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30629(0x77a5, float:4.292E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x072f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30629(0x77a5, float:4.292E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07b0
        L_0x072f:
            com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout r0 = r7.adCircleWaveLayout
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.f39883a
            r15 = 0
            r16 = 32839(0x8047, float:4.6017E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0759
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout.f39883a
            r15 = 0
            r16 = 32839(0x8047, float:4.6017E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x07b0
        L_0x0759:
            boolean r1 = r0.f39888f
            if (r1 == 0) goto L_0x07b0
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x07b0
            android.content.Context r1 = r0.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f39887e
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            r12[r9] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r15 = 1
            r16 = 31533(0x7b2d, float:4.4187E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r8] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r9] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x07a5
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            r12[r9] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r15 = 1
            r16 = 31533(0x7b2d, float:4.4187E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x07b0
        L_0x07a5:
            java.lang.String r2 = "logo_show"
            java.lang.String r3 = "raw ad logo show"
            org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r1, r0, r3)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r0, (org.json.JSONObject) r3)
        L_0x07b0:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30634(0x77aa, float:4.2927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x07d4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38685b
            r3 = 0
            r4 = 30634(0x77aa, float:4.2927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07e3
        L_0x07d4:
            boolean r0 = r7.D
            if (r0 != 0) goto L_0x07e3
            r7.D = r9
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.base.ui.CommerceTag r1 = r7.mCommerceTagView
            java.lang.String r2 = r7.j
            com.ss.android.ugc.aweme.commercialize.utils.s.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (android.view.View) r1, (java.lang.String) r2)
        L_0x07e3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            if (r0 == 0) goto L_0x080a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = r0.isAppAd()
            if (r0 == 0) goto L_0x080a
            com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView r0 = r7.oldAdBottomLabelView
            r0.e()
            com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView r0 = r7.newAdBottomLabelView
            r0.e()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x080a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            r0.setCardOnceClick(r8)
        L_0x080a:
            r7.c(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.al.e(r0)
            if (r0 == 0) goto L_0x0825
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r0 = r7.t
            if (r0 != 0) goto L_0x0820
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r0 = new com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b
            r0.<init>(r7)
            r7.t = r0
        L_0x0820:
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r0 = r7.t
            r0.a()
        L_0x0825:
            com.ss.android.ugc.aweme.commercialize.utils.b.b r0 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            r0.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.X(r0)
            if (r0 == 0) goto L_0x092c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r1 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f38688e
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.l.b.f55817a
            r15 = 1
            r16 = 59531(0xe88b, float:8.342E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r8] = r3
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0877
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.l.b.f55817a
            r15 = 1
            r16 = 59531(0xe88b, float:8.342E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r8] = r2
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x08b3
        L_0x0877:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r3 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r2
            if (r1 == 0) goto L_0x08b1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r1.getAwemeRawAd()
            if (r3 == 0) goto L_0x08b1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r1.getAwemeRawAd()
            java.lang.String r3 = r3.getOpenUrl()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            java.lang.String r1 = r1.getMicroAppUrl()
            boolean r4 = r2.isAppBrandSchema(r3)
            if (r4 == 0) goto L_0x08a6
            java.lang.String r1 = r2.getAppId(r3)
            goto L_0x08b3
        L_0x08a6:
            boolean r3 = r2.isAppBrandSchema(r1)
            if (r3 == 0) goto L_0x08b1
            java.lang.String r1 = r2.getAppId(r1)
            goto L_0x08b3
        L_0x08b1:
            java.lang.String r1 = ""
        L_0x08b3:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f38688e
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.l.b.f55817a
            r15 = 1
            r16 = 59532(0xe88c, float:8.3422E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r8] = r4
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x08f0
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.l.b.f55817a
            r15 = 1
            r16 = 59532(0xe88c, float:8.3422E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r8] = r3
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r8 = r2.intValue()
            goto L_0x0929
        L_0x08f0:
            if (r2 == 0) goto L_0x0929
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r2.getAwemeRawAd()
            if (r3 == 0) goto L_0x0929
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r4 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r3 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r2.getAwemeRawAd()
            java.lang.String r4 = r4.getOpenUrl()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            java.lang.String r2 = r2.getMicroAppUrl()
            boolean r5 = r3.isAppBrandSchema(r4)
            if (r5 == 0) goto L_0x091f
            int r8 = com.ss.android.ugc.aweme.miniapp.l.b.a(r4)
            goto L_0x0929
        L_0x091f:
            boolean r3 = r3.isAppBrandSchema(r2)
            if (r3 == 0) goto L_0x0929
            int r8 = com.ss.android.ugc.aweme.miniapp.l.b.a(r2)
        L_0x0929:
            r0.preloadMiniApp(r1, r8)
        L_0x092c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (int) r11)
            if (r0 == 0) goto L_0x0939
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f38688e
            com.ss.android.ugc.aweme.commercialize.utils.am.h(r0)
        L_0x0939:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.c():void");
    }

    public final void a(FragmentManager fragmentManager) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager}, this, f38685b, false, 30643, new Class[]{FragmentManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager}, this, f38685b, false, 30643, new Class[]{FragmentManager.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.k(this.f38688e) && this.w == null) {
            a.C0519a a2 = new a.C0519a().a(this.k).a(this.f38688e).a(this.adHalfWebPageContainer).a(this.blackMaskLayer);
            a2.f40045a.h = this.j;
            this.w = a2.a(fragmentManager).a((com.ss.android.ugc.aweme.commercialize.c.f) new com.ss.android.ugc.aweme.commercialize.c.f() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f38696a;

                public final void k() {
                }

                public final void j() {
                    if (PatchProxy.isSupport(new Object[0], this, f38696a, false, 30719, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38696a, false, 30719, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!CommerceVideoDelegate.this.x) {
                        CommerceVideoDelegate.this.adHalfWebPageContainer.a();
                    }
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38696a, false, 30720, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38696a, false, 30720, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (CommerceVideoDelegate.this.f38688e.isShowCommerceCard()) {
                        x promotion = CommerceVideoDelegate.this.f38688e.getPromotion();
                        com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(promotion.getPromotionId(), promotion.getProductId(), CommerceVideoDelegate.this.f38688e.getAuthorUid(), new ai(this), aj.f38802b);
                    }
                    com.ss.android.ugc.aweme.commercialize.views.cards.a aVar = CommerceVideoDelegate.this.w;
                    if (aVar != null) {
                        try {
                            if (aVar.c()) {
                                aVar.a(new ak(this), CommerceVideoDelegate.this.h, z);
                                return;
                            }
                        } catch (Exception e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a(e2);
                            return;
                        }
                    }
                    CommerceVideoDelegate.this.g();
                }
            }).f40045a;
            this.w.a();
            this.x = false;
        }
    }

    public final void a(FragmentManager fragmentManager, boolean z2, IFeedViewHolder iFeedViewHolder) {
        FragmentManager fragmentManager2 = fragmentManager;
        boolean z3 = z2;
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, Byte.valueOf(z2 ? (byte) 1 : 0), iFeedViewHolder2}, this, f38685b, false, 30677, new Class[]{FragmentManager.class, Boolean.TYPE, IFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, Byte.valueOf(z2), iFeedViewHolder2}, this, f38685b, false, 30677, new Class[]{FragmentManager.class, Boolean.TYPE, IFeedViewHolder.class}, Void.TYPE);
        } else if (this.r) {
            this.r = false;
            p.a(fragmentManager2, (ViewGroup) this.flAdGuideRoot, C, z3);
            if (o.v()) {
                com.ss.android.ugc.playerkit.videoview.g a2 = a(iFeedViewHolder2);
                if (a2 != null && z3) {
                    a2.S();
                }
            }
        }
    }

    public boolean a(CommerceTagLayout commerceTagLayout, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{commerceTagLayout, aweme2}, this, f38685b, false, 30689, new Class[]{CommerceTagLayout.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{commerceTagLayout, aweme2}, this, f38685b, false, 30689, new Class[]{CommerceTagLayout.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (commerceTagLayout == null) {
            return false;
        } else {
            return com.ss.android.ugc.aweme.commercialize.link.f.a("company_link", aweme2) || com.ss.android.ugc.aweme.commercialize.link.f.a("link", aweme2);
        }
    }

    private String t() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30684, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30684, new Class[0], String.class);
        }
        if (this.h != null) {
            Aweme d2 = this.h.d();
            if (d2 != null) {
                String aid = d2.getAid();
                if (aid != null) {
                    return aid;
                }
            }
        }
        return "";
    }

    private String u() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30685, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30685, new Class[0], String.class);
        }
        if (this.h != null) {
            Aweme d2 = this.h.d();
            if (d2 != null) {
                return d2.getAuthorUid();
            }
        }
        return "";
    }

    private String v() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30686, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30686, new Class[0], String.class);
        }
        if (this.h != null) {
            Aweme d2 = this.h.d();
            if (d2 != null) {
                return com.ss.android.ugc.aweme.u.aa.c(d2);
            }
        }
        return "";
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30642, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.w.b();
        }
        this.w = null;
        this.adHalfWebPageContainer.a();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30657, new Class[0], Void.TYPE);
            return;
        }
        this.u.b();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30663, new Class[0], Void.TYPE);
            return;
        }
        this.oldAdBottomLabelView.o();
        this.newAdBottomLabelView.o();
    }

    public final boolean l() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30667, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30667, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Fragment fragment = this.q;
        if (fragment != null && (fragment instanceof s)) {
            z2 = ((s) fragment).p();
        }
        return z2;
    }

    private int s() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30641, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30641, new Class[0], Integer.TYPE)).intValue();
        }
        if (com.ss.android.ugc.aweme.profile.a.a().l && (!com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.f38688e) || com.ss.android.ugc.aweme.commercialize.utils.c.S(this.f38688e))) {
            i2 = -com.ss.android.ugc.aweme.profile.a.a().b();
        }
        int a2 = i2 + v.a(this.k, (int) C0906R.dimen.bj);
        if (com.ss.android.ugc.aweme.profile.a.d()) {
            a2 += com.ss.android.ugc.aweme.profile.a.f61216b;
        }
        return a2;
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30640, new Class[0], Void.TYPE);
            return;
        }
        int s2 = s();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.adHalfWebPageContainer.getLayoutParams();
        if (com.ss.android.ugc.aweme.commercialize.utils.c.A(this.f38688e)) {
            marginLayoutParams.bottomMargin = s2 + v.a(this.k, (int) C0906R.dimen.bh) + ((ViewGroup.MarginLayoutParams) this.oldAdBottomLabelView.getLayoutParams()).bottomMargin;
        } else {
            marginLayoutParams.bottomMargin = s2;
        }
        this.adHalfWebPageContainer.setLayoutParams(marginLayoutParams);
    }

    public void f() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30650, new Class[0], Void.TYPE);
        } else if (this.commerceGoodHalfCardContainer != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.commerceGoodHalfCardContainer.getLayoutParams();
            if (com.ss.android.ugc.aweme.profile.a.a().l) {
                i2 = com.ss.android.ugc.aweme.profile.a.a().b();
            }
            int a2 = com.ss.android.ugc.aweme.framework.e.b.a(this.k, 40.0f) - i2;
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                a2 += com.ss.android.ugc.aweme.profile.a.f61216b;
            }
            marginLayoutParams.bottomMargin = a2;
            this.commerceGoodHalfCardContainer.setLayoutParams(marginLayoutParams);
        }
    }

    public final void g() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30653, new Class[0], Void.TYPE);
            return;
        }
        if (AdHalfWebPageContainer.a(this.f38688e)) {
            j2 = 240;
        } else {
            j2 = 200;
        }
        this.adHalfWebPageContainer.a(AdHalfWebPageContainer.a(this.f38688e));
        this.adHalfWebPageContainer.postDelayed(new o(this), j2);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30661, new Class[0], Void.TYPE);
            return;
        }
        if (this.f38688e != null && this.f38688e.isAppAd()) {
            this.oldAdBottomLabelView.e();
            this.newAdBottomLabelView.e();
        }
        if (this.l != null && this.m > 0 && this.n > 0) {
            this.n = System.currentTimeMillis();
            this.adHalfWebPageContainer.postDelayed(this.l, this.m);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30675, new Class[0], Void.TYPE);
            return;
        }
        if (this.A != null) {
            if (AdHalfWebPageContainer.a(this.f38688e)) {
                this.introContainer.setTranslationY((float) u.a(17.0d));
                this.introContainer.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
                return;
            }
            an.a(this.introContainer, this.introContainer.getAlpha(), 1.0f);
            aq.a(this.introContainer, this.introContainer.getTranslationX(), 0.0f, 200);
        }
    }

    public final boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30688, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30688, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(this.k instanceof FragmentActivity) || !n.a(((FragmentActivity) this.k).getSupportFragmentManager())) {
            return false;
        } else {
            return true;
        }
    }

    public final void k() {
        BlackMaskLayer blackMaskLayer2;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30665, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null) {
            com.ss.android.ugc.aweme.commercialize.views.cards.a aVar = this.w;
            IFeedViewHolder iFeedViewHolder = this.h;
            if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, aVar, com.ss.android.ugc.aweme.commercialize.views.cards.a.f40034a, false, 33042, new Class[]{IFeedViewHolder.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commercialize.views.cards.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, aVar2, com.ss.android.ugc.aweme.commercialize.views.cards.a.f40034a, false, 33042, new Class[]{IFeedViewHolder.class}, Void.TYPE);
            } else {
                if (com.ss.android.ugc.aweme.commercialize.utils.c.o(aVar.f40036c)) {
                    blackMaskLayer2 = aVar.k;
                } else {
                    blackMaskLayer2 = aVar.f40038e;
                }
                if (blackMaskLayer2 != null) {
                    blackMaskLayer2.postDelayed(new e(aVar, blackMaskLayer2, iFeedViewHolder), 500);
                }
            }
        }
        a(this.q.getChildFragmentManager(), false, this.h);
        this.feedAdLayout.setAlpha(1.0f);
        this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new p(this)).start();
    }

    public void o() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30683, new Class[0], Void.TYPE);
        } else if (this.f38688e != null) {
            if (this.mLinkTag != null) {
                if (a(this.mLinkTag, this.f38688e)) {
                    final j linkAdData = this.f38688e.getLinkAdData();
                    this.mLinkTag.a(linkAdData, new com.ss.android.ugc.aweme.commercialize.link.video.o() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38698a;

                        /* renamed from: b  reason: collision with root package name */
                        long f38699b;

                        /* renamed from: e  reason: collision with root package name */
                        private Runnable f38702e = new al(this);

                        /* access modifiers changed from: package-private */
                        public a.C0509a e() {
                            if (!PatchProxy.isSupport(new Object[0], this, f38698a, false, 30729, new Class[0], a.C0509a.class)) {
                                return new a.C0509a().a(linkAdData).a(CommerceVideoDelegate.this.f38688e).a(false);
                            }
                            return (a.C0509a) PatchProxy.accessDispatch(new Object[0], this, f38698a, false, 30729, new Class[0], a.C0509a.class);
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f38698a, false, 30724, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38698a, false, 30724, new Class[0], Void.TYPE);
                                return;
                            }
                            g.a(CommerceVideoDelegate.this.k, e().a("show").a(100).a());
                            com.ss.android.ugc.aweme.commercialize.log.f.a(linkAdData, CommerceVideoDelegate.this.f38688e, "show", false, CommerceVideoDelegate.this.j);
                            this.f38699b = System.currentTimeMillis();
                            if (CommerceVideoDelegate.this.mLinkTag != null) {
                                CommerceVideoDelegate.this.mLinkTag.postDelayed(this.f38702e, 1000);
                            }
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f38698a, false, 30725, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38698a, false, 30725, new Class[0], Void.TYPE);
                                return;
                            }
                            g.a(CommerceVideoDelegate.this.k, e().a("click").a(100).a());
                            com.ss.android.ugc.aweme.commercialize.log.f.a(linkAdData, CommerceVideoDelegate.this.f38688e, "click", false, CommerceVideoDelegate.this.j);
                            com.ss.android.ugc.aweme.commercialize.utils.g.a(CommerceVideoDelegate.this.k, linkAdData, CommerceVideoDelegate.this.f38688e, false);
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.u(CommerceVideoDelegate.this.f38688e)) {
                                g.a(CommerceVideoDelegate.this.k, linkAdData, CommerceVideoDelegate.this.f38688e, false);
                            }
                        }

                        public final void c() {
                            if (PatchProxy.isSupport(new Object[0], this, f38698a, false, 30726, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38698a, false, 30726, new Class[0], Void.TYPE);
                                return;
                            }
                            g.a(CommerceVideoDelegate.this.k, e().a("close").a(0).a());
                            com.ss.android.ugc.aweme.commercialize.log.f.a(linkAdData, CommerceVideoDelegate.this.f38688e, "close", false, CommerceVideoDelegate.this.j);
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.u(CommerceVideoDelegate.this.f38688e)) {
                                g.a(CommerceVideoDelegate.this.k, linkAdData, CommerceVideoDelegate.this.f38688e, false);
                            }
                            d();
                        }

                        public final void d() {
                            if (PatchProxy.isSupport(new Object[0], this, f38698a, false, 30727, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38698a, false, 30727, new Class[0], Void.TYPE);
                            } else if (this.f38699b != 0) {
                                g.a(CommerceVideoDelegate.this.k, e().a("show_over").a(0).a(System.currentTimeMillis() - this.f38699b).a());
                                this.f38699b = 0;
                                if (CommerceVideoDelegate.this.mLinkTag != null) {
                                    CommerceVideoDelegate.this.mLinkTag.removeCallbacks(this.f38702e);
                                }
                            }
                        }
                    });
                    this.mLinkTag.setVisibility(0);
                } else {
                    this.mLinkTag.a();
                    this.mLinkTag.setVisibility(8);
                }
            }
            if (this.mMicroTag != null) {
                if (com.ss.android.ugc.aweme.commercialize.link.f.a("iron_man", this.f38688e)) {
                    final com.ss.android.ugc.aweme.miniapp_api.model.f microAppInfo = this.f38688e.getMicroAppInfo();
                    ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).preloadMiniApp(microAppInfo.getAppId(), microAppInfo.getType());
                    this.mMicroTag.a(microAppInfo, new com.ss.android.ugc.aweme.commercialize.link.video.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38703a;

                        public final void c() {
                        }

                        public final void a() {
                            String str;
                            if (PatchProxy.isSupport(new Object[0], this, f38703a, false, 30732, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38703a, false, 30732, new Class[0], Void.TYPE);
                                return;
                            }
                            d a2 = d.a().a("group_id", CommerceVideoDelegate.this.f38688e.getAid()).a("mp_id", microAppInfo.getAppId()).a("author_id", CommerceVideoDelegate.this.f38688e.getAuthorUid()).a("enter_from", CommerceVideoDelegate.this.j).a("position", "in_video_tag");
                            if (microAppInfo.getType() == 1) {
                                str = "micro_app";
                            } else {
                                str = "micro_game";
                            }
                            r.a("mp_show", (Map) a2.a("_param_for_special", str).f34114b);
                        }

                        public final void b() {
                            String str;
                            String str2;
                            if (PatchProxy.isSupport(new Object[0], this, f38703a, false, 30733, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38703a, false, 30733, new Class[0], Void.TYPE);
                                return;
                            }
                            b.a d2 = new b.a().b(CommerceVideoDelegate.this.j).a("in_video_tag").d(CommerceVideoDelegate.this.f38688e.getAid());
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.t(CommerceVideoDelegate.this.f38688e)) {
                                str = "025002";
                            } else {
                                str = "023001";
                            }
                            com.ss.android.ugc.aweme.miniapp_api.model.b a2 = d2.c(str).a();
                            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                            iMiniAppService.openMiniApp(CommerceVideoDelegate.this.k, iMiniAppService.buildSchema(microAppInfo), a2);
                            d a3 = d.a().a("group_id", CommerceVideoDelegate.this.f38688e.getAid()).a("mp_id", microAppInfo.getAppId()).a("author_id", CommerceVideoDelegate.this.f38688e.getAuthorUid()).a("enter_from", CommerceVideoDelegate.this.j).a("position", "in_video_tag");
                            if (microAppInfo.getType() == 1) {
                                str2 = "micro_app";
                            } else {
                                str2 = "micro_game";
                            }
                            r.a("mp_click", (Map) a3.a("_param_for_special", str2).f34114b);
                        }
                    });
                    this.mMicroTag.setVisibility(0);
                } else {
                    this.mMicroTag.a();
                    this.mMicroTag.setVisibility(8);
                }
            }
            if (this.mDouPlusLinkTag != null) {
                if (com.ss.android.ugc.aweme.commercialize.link.f.a("dou+", this.f38688e)) {
                    final com.ss.android.ugc.aweme.commercialize.model.h w2 = com.ss.android.ugc.aweme.commercialize.utils.c.w(this.f38688e);
                    this.mDouPlusLinkTag.a(w2, new com.ss.android.ugc.aweme.commercialize.link.video.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38706a;

                        public final void a() {
                        }

                        public final void c() {
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f38706a, false, 30734, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f38706a, false, 30734, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.commercialize.utils.g.a(CommerceVideoDelegate.this.k, CommerceVideoDelegate.this.f38688e, CommerceVideoDelegate.this.o, 18, CommerceVideoDelegate.this.v);
                            Context context = CommerceVideoDelegate.this.k;
                            com.ss.android.ugc.aweme.commercialize.model.h hVar = w2;
                            Aweme aweme = CommerceVideoDelegate.this.f38688e;
                            if (PatchProxy.isSupport(new Object[]{context, "click", hVar, aweme}, null, g.f39316a, true, 31748, new Class[]{Context.class, String.class, com.ss.android.ugc.aweme.commercialize.model.h.class, Aweme.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, "click", hVar, aweme}, null, g.f39316a, true, 31748, new Class[]{Context.class, String.class, com.ss.android.ugc.aweme.commercialize.model.h.class, Aweme.class}, Void.TYPE);
                            } else if (!(context == null || hVar == null || aweme == null || aweme.getAwemeRawAd() == null)) {
                                g.a(context, "draw_ad", "click", g.b(context, aweme, "douplus link", "link"), g.b(aweme.getAwemeRawAd()), g.a(aweme));
                                g.c(aweme.getAwemeRawAd());
                            }
                            a.C0800a.a(CommerceVideoDelegate.this.f38688e);
                        }
                    });
                    this.mDouPlusLinkTag.setVisibility(0);
                    return;
                }
                this.mDouPlusLinkTag.a();
                this.mDouPlusLinkTag.setVisibility(8);
            }
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30687, new Class[0], Void.TYPE);
            return;
        }
        if (AutoPlayUtils.a(this.h) != 0) {
            AutoPlayUtils.a(this.k);
            AutoPlayUtils.a(this.h, 0);
            com.bytedance.ies.dmt.ui.d.a.c(this.k, (int) C0906R.string.ep).a();
            r.a("exit_auto_play", (Map) new d().a("group_id", t()).a("enter_from", this.j).a("enter_method", "click_long_press_button").a("author_id", u()).a("log_pb", ai.a().a(v())).f34114b);
        }
    }

    private void r() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30618, new Class[0], Void.TYPE);
            return;
        }
        this.adGuideImage.setVisibility(8);
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        if (!TextUtils.isEmpty(this.f38688e.getDesc())) {
            this.adGuideDesc.setText(this.f38688e.getDesc());
            if (this.f38688e.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f38688e.getAwemeRawAd().getAdMoreTextual())) {
                this.adGuideDesc.setMoreString(this.f38688e.getAwemeRawAd().getAdMoreTextual());
            }
        }
        if (this.f38688e.getAuthor() == null || this.f38688e.getAuthor().getAvatarMedium() == null) {
            com.ss.android.ugc.aweme.base.c.a(this.adGuideIcon, com.ss.android.ugc.aweme.base.model.a.a(2130839027));
        } else {
            com.ss.android.ugc.aweme.base.c.b(this.adGuideIcon, this.f38688e.getAuthor().getAvatarMedium());
        }
        if (this.f38688e.getAwemeRawAd() != null) {
            if (am.a(this.f38688e, 3)) {
                DmtTextView dmtTextView = this.adGuideName;
                if (this.f38688e.getAwemeRawAd().getOmVast().vast.adTitle == null) {
                    str2 = "";
                } else {
                    str2 = this.f38688e.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                dmtTextView.setText(str2);
            } else {
                DmtTextView dmtTextView2 = this.adGuideName;
                if (this.f38688e.getAuthor() == null) {
                    str = "";
                } else {
                    str = this.f38688e.getAuthor().getNickname();
                }
                dmtTextView2.setText(str);
            }
            if (TextUtils.isEmpty(this.f38688e.getAwemeRawAd().getAppInstall()) && this.f38688e.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adLikeLayout.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f38688e.getAwemeRawAd().getAppInstall())) {
                this.adAppUseNumber.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            } else {
                this.adAppUseNumber.setText(this.f38688e.getAwemeRawAd().getAppInstall());
            }
            this.adRatingView.setRatingProgress(this.f38688e.getAwemeRawAd().getAppLike());
            if (this.f38688e.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adRatingView.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            }
            if (this.f38688e.getAwemeRawAd().getAppCategory().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : this.f38688e.getAwemeRawAd().getAppCategory()) {
                    if (str3.length() < 6) {
                        arrayList.add(str3);
                    }
                }
                this.adTagGroup.setTagList((String[]) arrayList.toArray(new String[0]));
                return;
            }
            this.adTagGroup.setVisibility(8);
        }
    }

    public final boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30627, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30627, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean H = com.ss.android.ugc.aweme.commercialize.utils.c.H(this.f38688e);
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.t(this.f38688e) && H) {
            z2 = true;
        }
        if (z2) {
            com.bytedance.ies.dmt.ui.d.a.b(this.k, (int) C0906R.string.c_).a();
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30669, new Class[0], Void.TYPE);
        } else if (this.f38688e != null) {
            if (!this.f38688e.isShowCommerceCard()) {
                Context context = this.k;
                Aweme aweme = this.f38688e;
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31511, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31511, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                } else if (com.ss.android.ugc.aweme.commercialize.utils.c.p(aweme)) {
                    switch (com.ss.android.ugc.aweme.commercialize.utils.c.m(aweme).getCardType()) {
                        case 1:
                            g.a("form_card_show", context, aweme);
                            break;
                        case 2:
                        case 3:
                        case 10:
                            g.a("othershow", context, aweme, "card");
                            break;
                        case 4:
                            g.a("banner_card_show", context, aweme);
                            break;
                        case 5:
                            g.a("first_interaction_card_show", context, aweme);
                            break;
                        case 6:
                            g.a("poll_card_show", context, aweme);
                            break;
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                            g.a("first_survey_card_show", context, aweme);
                            break;
                        case 8:
                        case 9:
                            g.a("coupon_card_show", context, aweme);
                            break;
                    }
                } else {
                    if (aweme.getAwemeRawAd() != null && !aweme.getAwemeRawAd().getDisableAutoTrackClick()) {
                        g.d(context, aweme);
                    }
                    g.a("landing_page_card_show", context, aweme);
                }
            } else if (this.f38688e.getPromotion() != null) {
                x promotion = this.f38688e.getPromotion();
                new ak().e(this.f38688e.getAuthorUid()).a("transform_card").b(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).d(this.j).c(this.f38688e.getAid()).b();
                new com.ss.android.ugc.aweme.commerce.service.logs.al().f(this.f38688e.getAuthorUid()).b("transform_card").c(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).g(this.j).d(this.f38688e.getAid()).e("video_play").h(null).a(this.j).b();
            }
            if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30672, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30672, new Class[0], Void.TYPE);
                return;
            }
            if (this.f38688e != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("card_type", a(this.f38688e));
                    if (this.f38688e.isAd()) {
                        jSONObject.put("creative_id", b(this.f38688e));
                    }
                } catch (Exception unused) {
                }
                com.ss.android.ugc.aweme.base.n.a("aweme_ad_card_show_error_rate", 0, jSONObject);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30606, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30613, new Class[0], Void.TYPE);
        } else {
            this.mCommerceTagView.setVisibility(8);
            if (com.ss.android.ugc.aweme.commercialize.link.f.a("shopping_cart", this.f38688e, false, this.z)) {
                if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30614, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30614, new Class[0], Void.TYPE);
                } else {
                    this.mCommerceTagView.setVisibility(0);
                    if (!(this.f38688e.getPromotion() == null || this.f38688e.getPromotion().getShortTitle() == null)) {
                        this.mCommerceTagView.a(this.f38688e.getPromotion().getShortTitle());
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30612, new Class[0], Void.TYPE);
        } else if (this.f38688e != null) {
            com.ss.android.ugc.aweme.utils.c.a((View) this.feedAdDownloadBtn, 0.75f);
            com.ss.android.ugc.aweme.utils.c.a(this.feedAdReplay);
            com.ss.android.ugc.aweme.utils.c.a(this.mBottomView);
            com.ss.android.ugc.aweme.utils.c.a((View) this.adGuideDesc, 0.75f);
            com.ss.android.ugc.aweme.utils.c.a((View) this.adGuideIcon, 0.75f);
            com.ss.android.ugc.aweme.utils.c.a((View) this.adLikeLayout, 0.75f);
            com.ss.android.ugc.aweme.utils.c.a((View) this.adGuideName, 0.75f);
            com.ss.android.ugc.aweme.utils.c.a((View) this.adTagGroup, 0.75f);
            if (this.o.a() && this.i != null) {
                this.i.a("update_ad_user_follow_ui", (Object) Boolean.TRUE);
            }
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.f38688e)) {
            this.feedAdDownloadBtn.setText(n.a(this.k, this.f38688e, true));
            Drawable cVar = new com.ss.android.ugc.aweme.commercialize.ad.c((float) u.a(2.0d), this.k.getResources().getColor(C0906R.color.ry));
            if (com.ss.android.ugc.aweme.commercialize.utils.c.E(this.f38688e)) {
                cVar = com.ss.android.ugc.aweme.utils.c.a(cVar.mutate(), ContextCompat.getColor(this.k, C0906R.color.a0k));
            }
            this.feedAdDownloadBtn.setBackground(cVar);
        }
        StripAdBottomLabelView stripAdBottomLabelView = this.oldAdBottomLabelView;
        Aweme aweme = this.f38688e;
        e eVar = this.o;
        View view = this.mAdBackgroundLayout;
        if (PatchProxy.isSupport(new Object[]{aweme, eVar, view}, stripAdBottomLabelView, StripAdBottomLabelView.l, false, 32996, new Class[]{Aweme.class, e.class, View.class}, Void.TYPE)) {
            StripAdBottomLabelView stripAdBottomLabelView2 = stripAdBottomLabelView;
            PatchProxy.accessDispatch(new Object[]{aweme, eVar, view}, stripAdBottomLabelView2, StripAdBottomLabelView.l, false, 32996, new Class[]{Aweme.class, e.class, View.class}, Void.TYPE);
        } else {
            stripAdBottomLabelView.m = view;
            stripAdBottomLabelView.a(aweme, eVar);
        }
        this.newAdBottomLabelView.a(this.f38688e, this.o);
        this.adHalfWebPageContainer.a();
        this.blackMaskLayer.setVisibility(8);
        c(false);
        d(false);
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30610, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.feedStarAtlasCheckLL.setVisibility(8);
            if (com.ss.android.ugc.aweme.u.aa.p(this.f38688e)) {
                AwemeStarAtlas starAtlasInfo = this.f38688e.getStarAtlasInfo();
                if (starAtlasInfo != null) {
                    String str = "";
                    int reviewStatus = starAtlasInfo.getReviewStatus();
                    switch (reviewStatus) {
                        case 1:
                            str = this.k.getString(C0906R.string.ccw);
                            break;
                        case 2:
                            str = this.k.getString(C0906R.string.cd3);
                            break;
                        case 3:
                            str = this.k.getString(C0906R.string.cd1);
                            break;
                        case 4:
                            str = this.k.getString(C0906R.string.ccr);
                            break;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.starAtlasCheckHintTv.setText(str);
                        this.feedStarAtlasCheckLL.setVisibility(0);
                        r.a("starmap_bar_review_show", (Map) d.a().a("group_id", this.f38688e.getAid()).a("tag_label", com.ss.android.ugc.aweme.commercialize.utils.c.a(reviewStatus)).f34114b);
                        this.feedStarAtlasCheckLL.setOnClickListener(new l(this, reviewStatus));
                    }
                }
            }
        }
        if (am.a(this.f38688e, 3)) {
            am.h(this.f38688e);
        }
        if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30607, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.miniapp.l.c.a(this.f38688e)) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
        }
    }

    public com.ss.android.ugc.playerkit.videoview.g a(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, f38685b, false, 30624, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.playerkit.videoview.g.class)) {
            return (com.ss.android.ugc.playerkit.videoview.g) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, f38685b, false, 30624, new Class[]{IFeedViewHolder.class}, com.ss.android.ugc.playerkit.videoview.g.class);
        } else if (iFeedViewHolder == null) {
            return null;
        } else {
            return iFeedViewHolder.m();
        }
    }

    /* access modifiers changed from: package-private */
    public int a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f38685b, false, 30670, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, f38685b, false, 30670, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme.isShowCommerceCard()) {
            return 0;
        } else {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.p(aweme)) {
                return com.ss.android.ugc.aweme.commercialize.utils.c.m(aweme).getCardType();
            }
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public long b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f38685b, false, 30671, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme}, this, f38685b, false, 30671, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        } else if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd().getCreativeId().longValue();
        } else {
            return 0;
        }
    }

    private void c(boolean z2) {
        AwemeTextLabelModel awemeTextLabelModel;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f38685b, false, 30608, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f38685b, false, 30608, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (am.d(this.f38688e)) {
            v.a((View) this.vastAdTag, 0);
            com.bytedance.g.b.c b2 = am.b(this.f38688e);
            if (b2 == null || TextUtils.isEmpty(b2.staticResource)) {
                v.a((View) this.vastAdTagAdChoice, 8);
            } else {
                v.a((View) this.vastAdTagAdChoice, 0);
                com.ss.android.ugc.aweme.base.c.a(this.vastAdTagAdChoice, b2.staticResource);
            }
            if (z2 && b2 != null && !TextUtils.isEmpty(b2.viewTracking) && am.e(this.f38688e)) {
                am.a(b2.viewTracking, this.f38688e);
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("draw_ad").b("ad_choice_view").d("video").b(this.f38688e).a(this.k);
            }
            if (this.vastAdTagText != null) {
                if (this.f38688e.getAwemeRawAd() != null) {
                    awemeTextLabelModel = this.f38688e.getAwemeRawAd().getLabel();
                } else {
                    awemeTextLabelModel = null;
                }
                if (awemeTextLabelModel == null || TextUtils.isEmpty(this.f38688e.getAwemeRawAd().getLabel().getLabelName())) {
                    this.vastAdTagText.setText(C0906R.string.ck);
                } else {
                    this.vastAdTagText.setText(this.f38688e.getAwemeRawAd().getLabel().getLabelName());
                }
            }
            v.a((View) this.B, 8);
        } else {
            v.a((View) this.vastAdTag, 8);
        }
    }

    public final void b(boolean z2) {
        boolean z3 = z2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f38685b, false, 30631, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f38685b, false, 30631, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.mBottomView;
        if (PatchProxy.isSupport(new Object[]{frameLayout, Byte.valueOf(z2)}, null, f38685b, true, 30632, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout, Byte.valueOf(z2)}, null, f38685b, true, 30632, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else {
            if (z3) {
                i2 = 4;
            }
            frameLayout.setVisibility(i2);
            if (!z3) {
                frameLayout.setAlpha(1.0f);
            }
        }
        this.adHalfWebPageContainer.setInCleanMode(z3);
        this.commerceGoodHalfCardContainer.setInCleanMode(z3);
        this.g.a(z3, this.f38688e);
    }

    private void d(boolean z2) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f38685b, false, 30609, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f38685b, false, 30609, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f38688e != null) {
            UrlModel urlModel = null;
            if (com.ss.android.ugc.aweme.commercialize.utils.c.g(this.f38688e)) {
                this.adRedPacketIv.setVisibility(0);
                AwemeRawAd awemeRawAd = this.f38688e.getAwemeRawAd();
                if (awemeRawAd != null) {
                    urlModel = awemeRawAd.getRedImageUrl();
                }
                com.ss.android.ugc.aweme.commercialize.utils.e.a(this.adRedPacketIv, urlModel);
                if (z2) {
                    g.M(this.k, this.f38688e);
                }
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.h(this.f38688e)) {
                this.adRedPacketIv.setVisibility(0);
                com.ss.android.ugc.aweme.commercialize.utils.e.a(this.adRedPacketIv, this.f38688e.getActivityPendant().getImage());
                User author = this.f38688e.getAuthor();
                if (z2) {
                    d a2 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = "";
                    }
                    r.a("show_brand_sticker", (Map) a2.a("author_id", str3).f34114b);
                    g.a((g.a) null, this.f38688e.getActivityPendant().getTrackUrlList(), true);
                }
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.i(this.f38688e)) {
                this.adRedPacketIv.setVisibility(0);
                SpecialSticker specialSticker = this.f38688e.getSpecialSticker();
                if (specialSticker != null) {
                    com.ss.android.ugc.aweme.commercialize.utils.e.a(this.adRedPacketIv, specialSticker.getIconUrl());
                }
                User author2 = this.f38688e.getAuthor();
                if (z2) {
                    d a3 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                    if (author2 != null) {
                        str2 = author2.getUid();
                    } else {
                        str2 = "";
                    }
                    r.a("show_brand_sticker", (Map) a3.a("author_id", str2).a("sticker_id", this.f38688e.getSpecialSticker().getStickerId()).f34114b);
                }
            } else if (com.ss.android.ugc.aweme.j.a.a.b(this.f38688e)) {
                this.adRedPacketIv.setVisibility(0);
                com.ss.android.ugc.aweme.commercialize.utils.e.a(this.adRedPacketIv, com.ss.android.ugc.aweme.j.a.a.c(this.f38688e));
                User author3 = this.f38688e.getAuthor();
                if (z2) {
                    d a4 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                    if (author3 != null) {
                        str = author3.getUid();
                    } else {
                        str = "";
                    }
                    r.a("show_mission_icon", (Map) a4.a("author_id", str).a("entrance_location", "redpacket").f34114b);
                }
            } else {
                this.adRedPacketIv.setVisibility(8);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38685b, false, 30644, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38685b, false, 30644, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.k(this.f38688e)) {
            if ((!com.ss.android.ugc.aweme.commercialize.utils.c.p(this.f38688e) || (!this.oldAdBottomLabelView.j() && !this.newAdBottomLabelView.j() && !this.oldAdBottomLabelView.l() && !this.newAdBottomLabelView.l() && !this.oldAdBottomLabelView.k() && !this.newAdBottomLabelView.k())) && !this.adHalfWebPageContainer.b() && !this.x) {
                this.E = new ac(this);
                this.adHalfWebPageContainer.postDelayed(this.E, (long) i2);
            }
        }
    }

    public final boolean b(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, this, f38685b, false, 30625, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, this, f38685b, false, 30625, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (q() || l()) {
            return false;
        } else {
            if (this.o.e() && c.a().b(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.f38688e))) {
                return false;
            }
            this.r = true;
            if (!(this.f38688e == null || this.f38688e.getAwemeRawAd() == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", String.valueOf(this.f38688e.getAwemeRawAd().getNativeCardType()));
                g.a(this.k, this.f38688e, (Map<String, String>) hashMap);
            }
            g.n(this.k, this.f38688e);
            this.feedAdLayout.setAlpha(0.0f);
            this.f38689f.setAlpha(1.0f);
            this.f38689f.animate().alpha(0.0f).setDuration(150).withEndAction(new ab(this, iFeedViewHolder)).start();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f38685b, false, 30649, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f38685b, false, 30649, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer2 = this.commerceGoodHalfCardContainer;
        if (PatchProxy.isSupport(new Object[0], commerceGoodHalfCardContainer2, CommerceGoodHalfCardContainer.f36809a, false, 28031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceGoodHalfCardContainer2, CommerceGoodHalfCardContainer.f36809a, false, 28031, new Class[0], Void.TYPE);
        } else {
            commerceGoodHalfCardContainer2.h = false;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(commerceGoodHalfCardContainer2.f36811c, "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(commerceGoodHalfCardContainer2.f36811c, "translationY", new float[]{0.0f, 36.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.setStartDelay(40);
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
            if (commerceGoodHalfCardContainer2.f36812d.getVisibility() == 0) {
                commerceGoodHalfCardContainer2.f36812d.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(160).start();
            }
        }
        this.commerceGoodHalfCardContainer.postDelayed(new m(this), j3);
    }

    @OnClick({2131493317, 2131494236, 2131494237, 2131494238, 2131496031, 2131495877, 2131493004, 2131493711, 2131492981, 2131492966, 2131492993, 2131492991, 2131493019, 2131492984, 2131493024, 2131493021, 2131493002})
    public void onClick(View view) {
        String str;
        String str2;
        boolean z2;
        String str3;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{view}, this, f38685b, false, 30626, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38685b, false, 30626, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bug) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 2, this.v);
                if (this.f38688e.getAwemeRawAd() != null && this.f38688e != null && this.f38688e.isAd() && TextUtils.equals(this.f38688e.getAwemeRawAd().getType(), PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
                    p();
                }
            }
        } else if (id == C0906R.id.bq8) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 2, this.v);
                if (this.f38688e.getAwemeRawAd() != null && this.f38688e != null && this.f38688e.isAd() && TextUtils.equals(this.f38688e.getAwemeRawAd().getType(), PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
                    p();
                }
            }
        } else if (id == C0906R.id.acq) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 3, this.v);
                a(com.ss.android.ugc.aweme.commercialize.utils.c.y(this.f38688e));
            }
        } else if (id == C0906R.id.c6) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 11, this.v);
            }
        } else if (id == C0906R.id.cf) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 14, this.v);
            }
        } else if (id == C0906R.id.br) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 12, this.v);
            }
        } else if (id == C0906R.id.cd) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 13, this.v);
            }
        } else if (id == C0906R.id.d5) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 15, this.v);
            }
        } else if (id == C0906R.id.c9 || id == C0906R.id.d_) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 19, this.v);
            }
        } else if (id == C0906R.id.d7) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 20, this.v);
            }
        } else if (id == C0906R.id.co) {
            if (!b()) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 21, this.v);
            }
        } else if (id == C0906R.id.acr || id == C0906R.id.acs) {
            if (!b()) {
                if (this.o.a()) {
                    g.o(this.k, this.f38688e);
                }
                a(true, false);
            }
        } else if (id == C0906R.id.cq) {
            User author = this.f38688e.getAuthor();
            if (com.ss.android.ugc.aweme.commercialize.utils.c.g(this.f38688e)) {
                com.ss.android.ugc.aweme.commercialize.utils.g.a(this.k, this.f38688e, this.o, 9, this.v);
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.h(this.f38688e)) {
                Context context = this.k;
                Aweme aweme = this.f38688e;
                if (PatchProxy.isSupport(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32370, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32370, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
                } else if (aweme.getActivityPendant() != null) {
                    com.ss.android.ugc.aweme.commerce.service.models.e activityPendant = aweme.getActivityPendant();
                    if ((TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) || !com.ss.android.ugc.aweme.commercialize.utils.g.a(context, activityPendant.getJumpOpenUrl(), false)) && !TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            com.ss.android.ugc.aweme.commercialize.utils.g.a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, (Map<String, String>) null, awemeRawAd.isUseOrdinaryWeb(), new a.C0516a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getType()));
                        } else {
                            com.ss.android.ugc.aweme.commercialize.utils.g.a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, (Map<String, String>) null, false);
                        }
                    }
                }
                d a2 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                if (author != null) {
                    str3 = author.getUid();
                } else {
                    str3 = "";
                }
                r.a("click_brand_sticker", (Map) a2.a("author_id", str3).f34114b);
                g.a((g.a) null, this.f38688e.getActivityPendant().getClickTrackUrlList(), true);
            } else {
                if (com.ss.android.ugc.aweme.commercialize.utils.c.i(this.f38688e)) {
                    Context context2 = this.k;
                    Aweme aweme2 = this.f38688e;
                    if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32367, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32367, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else if (!(context2 == null || aweme2 == null || aweme2.getSpecialSticker() == null)) {
                        String openUrl = aweme2.getSpecialSticker().getOpenUrl();
                        if (!TextUtils.isEmpty(openUrl)) {
                            z3 = com.ss.android.ugc.aweme.commercialize.utils.g.a(context2, openUrl, false);
                        } else {
                            String linkUrl = aweme2.getSpecialSticker().getLinkUrl();
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.t(aweme2)) {
                                z2 = aweme2.getAwemeRawAd().isUseOrdinaryWeb();
                            } else {
                                z2 = true;
                            }
                            z3 = com.ss.android.ugc.aweme.commercialize.utils.g.a(context2, linkUrl, aweme2.getSpecialSticker().getTitle(), false, (Map<String, String>) null, z2);
                        }
                    }
                    if (z3) {
                        d a3 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                        if (author != null) {
                            str2 = author.getUid();
                        } else {
                            str2 = "";
                        }
                        r.a("click_brand_sticker", (Map) a3.a("author_id", str2).a("sticker_id", this.f38688e.getSpecialSticker().getStickerId()).f34114b);
                    }
                } else if (com.ss.android.ugc.aweme.j.a.a.b(this.f38688e)) {
                    com.ss.android.ugc.aweme.j.a.a.a(this.k, this.f38688e);
                    d a4 = d.a().a("enter_from", this.j).a("group_id", this.f38688e.getAid());
                    if (author != null) {
                        str = author.getUid();
                    } else {
                        str = "";
                    }
                    r.a("click_mission_icon", (Map) a4.a("author_id", str).a("entrance_location", "redpacket").f34114b);
                }
            }
        } else if (id == C0906R.id.xl) {
            if (PatchProxy.isSupport(new Object[0], this, f38685b, false, 30678, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38685b, false, 30678, new Class[0], Void.TYPE);
            } else {
                if (this.p != null) {
                    String str4 = "";
                    try {
                        str4 = this.p.getString("request_id");
                    } catch (JSONException unused) {
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        this.f38688e.setRequestId(str4);
                    }
                }
                if (!(this.F == null || this.f38688e == null)) {
                    this.F.a(new ar(30, this.f38688e));
                }
            }
            com.ss.android.ugc.aweme.commercialize.utils.s.a(this.k, this.f38688e, this.j);
        }
    }

    private void a(boolean z2, boolean z3) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f38685b, false, 30616, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f38685b, false, 30616, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.feedAdLayout.setAlpha(1.0f);
        this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new w(this, z2, z3)).start();
        if (!(this.k instanceof MainActivity) || !com.ss.android.ugc.aweme.main.a.a().f54286b) {
            this.f38689f.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.f38689f;
            if (TimeLockRuler.isTeenModeON()) {
                i2 = 8;
            }
            relativeLayout.setVisibility(i2);
            this.f38689f.animate().alpha(1.0f).setDuration(150).start();
            return;
        }
        this.f38689f.setVisibility(4);
    }

    public CommerceVideoDelegate(IFeedViewHolder iFeedViewHolder, View view, int i2, String str, aa<ar> aaVar, Fragment fragment) {
        this.h = iFeedViewHolder;
        this.z = i2;
        this.j = str;
        this.k = view.getContext();
        this.F = aaVar;
        this.q = fragment;
        this.u = new com.ss.android.ugc.aweme.miniapp.card.j(view, str);
        ButterKnife.bind((Object) this, view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f38685b, false, 30604, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38685b, false, 30604, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f38689f = (RelativeLayout) view.findViewById(C0906R.id.dxn);
            this.A = (TextView) view.findViewById(C0906R.id.title);
            this.mIvRelieveTag = (AnimationImageView) view.findViewById(C0906R.id.dss);
            this.B = (TagLayout) view.findViewById(C0906R.id.dt0);
            this.g = (MicroAppVideoCardView) view.findViewById(C0906R.id.bn0);
        }
        if (this.oldAdBottomLabelView != null) {
            this.oldAdBottomLabelView.setExitAutoPlay(this);
        }
        if (this.newAdBottomLabelView != null) {
            this.newAdBottomLabelView.setExitAutoPlay(this);
        }
        if (this.vastAdTag != null) {
            this.vastAdTag.setOnClickListener(new k(this));
        }
    }
}
