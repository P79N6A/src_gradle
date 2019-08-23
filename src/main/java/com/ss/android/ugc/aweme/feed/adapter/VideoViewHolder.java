package com.ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.transition.ChangeBounds;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer;
import com.ss.android.ugc.aweme.base.ui.PoiCardWebPageFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commercialize.adapter.BaseVideoHolderDelegate;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.log.x;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.aj;
import com.ss.android.ugc.aweme.feed.api.UserPreferApi;
import com.ss.android.ugc.aweme.feed.c.h;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoBanWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoHotSearchBarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoPlayCountWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoPostTimeWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.DebugInfoView;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.ak;
import com.ss.android.ugc.aweme.feed.ui.bd;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.legoImp.inflate.l;
import com.ss.android.ugc.aweme.main.CleanModeManager2;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.ui.RestrictTextView;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.seconditem.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.aw;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ed;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.u;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.j;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.VideoSurfaceHolder;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.g;
import com.ss.android.ugc.playerkit.videoview.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoViewHolder extends BaseFeedViewHolder implements IFeedPlayerView, p, ak, f, g, i {
    private static WeakHashMap<Context, WeakContainer<SurfaceView>> V = new WeakHashMap<>();
    private static WeakHashMap<Context, WeakContainer<VideoViewHolder>> W = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private static final String f44816a = "VideoViewHolder";

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44817b;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private boolean E;
    private boolean F;
    private long G;
    private long H;
    private com.ss.android.ugc.aweme.poi.widget.c I;
    private final aa<ar> J;
    private boolean K;
    private boolean L;
    private int M;
    private Runnable N;
    private boolean O;
    private final CommerceVideoDelegate P;
    private com.ss.android.ugc.aweme.feed.g.b Q = new com.ss.android.ugc.aweme.feed.g.b();
    private boolean R = false;
    private a S;
    private int T = 4;
    private InteractStickerWidget U;
    private final BaseFeedPageParams X;
    private VideoMusicTitleWidget Y;
    private VideoMusicCoverWidget Z;
    private final VideoItemParams aa;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.ies.dmt.ui.a.b f44818c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f44819d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f44820e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f44821f;
    @BindView(2131494243)
    LinearLayout feedReportVotell;
    @BindView(2131494244)
    LinearLayout feedReportWarnll;
    @BindView(2131494836)
    FrameLayout flInteractLayout;
    boolean g;
    boolean h;
    @BindView(2131493203)
    ViewGroup llAwemeIntro;
    @BindView(2131496748)
    LinearLayout llRightMenu;
    public JSONObject m;
    @BindView(2131493064)
    DmtTextView mAllowDisplayBtn;
    @BindView(2131493188)
    View mAvatarLayout;
    @BindView(2131493202)
    ViewGroup mAwemeInCheckLayout;
    @BindView(2131493317)
    FrameLayout mBottomView;
    @BindView(2131493785)
    ImageView mCornerBL;
    @BindView(2131493786)
    ImageView mCornerBR;
    @BindView(2131493787)
    ImageView mCornerTL;
    @BindView(2131493788)
    ImageView mCornerTR;
    @BindView(2131493827)
    RemoteImageView mCoverView;
    @BindView(2131493877)
    DebugInfoView mDebugInfoView;
    @BindView(2131493972)
    DmtTextView mDisallowDisplayBtn;
    @BindView(2131494519)
    View mGradualBottomView;
    @BindView(2131494654)
    FrameLayout mHudView;
    @BindView(2131498468)
    AnimationImageView mIvRelieveTag;
    @BindView(2131495688)
    LongPressLayout mLongPressLayout;
    @Nullable
    @BindView(2131496274)
    DmtTextView mPoiDistance;
    @Nullable
    @BindView(2131496275)
    View mPoiDistanceLayout;
    @BindView(2131498092)
    RestrictTextView mRestrictTextView;
    @BindView(2131498527)
    FrameLayout mRootView;
    @BindView(2131495026)
    ImageView mShareTipImageView;
    @BindView(2131497590)
    TextView mTitleView;
    @BindView(2131498286)
    DmtTextView mTxtProhibited;
    @BindView(2131498475)
    ViewGroup mVideoTagContainer;
    @BindView(2131498227)
    DmtTextView mVoteStatusTextView;
    @BindView(2131498632)
    RelativeLayout mWidgetContainer;
    @BindView(2131498649)
    RemoteImageView mXiguaTaskEveningIv;
    protected final Fragment n;
    public final com.ss.android.ugc.aweme.feed.c.c o;
    public com.ss.android.ugc.aweme.video.f.a p;
    @BindView(2131496198)
    PoiCardWebPageContainer poiCardWebPageContainer;
    public SparseArray<Integer> q;
    public boolean r;
    public AnimatorSet s;
    @BindView(2131497086)
    View shareTipsRl;
    @BindView(2131497087)
    DmtTextView shareTipsTv;
    public m t;
    @BindView(2131498476)
    TagLayout tagLayout;
    @BindView(2131498294)
    DmtTextView txtTTFeedback;
    protected WidgetManager u;
    public boolean v = false;
    private VideoSurfaceHolder w;
    private VideoViewComponent x;
    private com.ss.android.ugc.aweme.feed.hw.a y;
    private bd z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44833a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f44834b;

        /* renamed from: d  reason: collision with root package name */
        private final Aweme f44836d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44833a, false, 40861, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44833a, false, 40861, new Class[0], Void.TYPE);
                return;
            }
            Aweme aweme = this.f44836d;
            if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32291, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32291, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                AwemeSplashInfo V = com.ss.android.ugc.aweme.commercialize.utils.c.V(aweme);
                if (V != null) {
                    V.setShown(true);
                }
            }
            if (!this.f44834b && TextUtils.equals(this.f44836d.getAid(), VideoViewHolder.this.f44821f.getAid()) && VideoViewHolder.this.r) {
                VideoViewHolder.this.h(3);
                VideoViewHolder.this.a(false);
                VideoViewHolder.this.mWidgetContainer.setAlpha(0.0f);
                VideoViewHolder.this.s.start();
            }
        }

        a(Aweme aweme) {
            this.f44836d = aweme;
        }
    }

    static class b implements ControllerListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44837a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<RemoteImageView> f44838b;

        public final void onFailure(String str, Throwable th) {
        }

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final void onIntermediateImageSet(String str, @javax.annotation.Nullable Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final void onSubmit(String str, Object obj) {
        }

        b(WeakReference<RemoteImageView> weakReference) {
            this.f44838b = weakReference;
        }

        public final void onFinalImageSet(String str, @javax.annotation.Nullable Object obj, @javax.annotation.Nullable Animatable animatable) {
            if (PatchProxy.isSupport(new Object[]{str, obj, animatable}, this, f44837a, false, 40862, new Class[]{String.class, Object.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, obj, animatable}, this, f44837a, false, 40862, new Class[]{String.class, Object.class, Animatable.class}, Void.TYPE);
                return;
            }
            ag.i().d();
            if (!com.ss.android.g.a.b() && this.f44838b.get() != null) {
                VideoViewHolder.a((RemoteImageView) this.f44838b.get(), 2130839429);
            }
        }
    }

    class c implements com.ss.android.ugc.aweme.sticker.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44839a;

        public final void a() {
        }

        public final void a(int i, boolean z) {
        }

        private c() {
        }

        /* synthetic */ c(VideoViewHolder videoViewHolder, byte b2) {
            this();
        }

        public final void a(int i, View view, float f2, float f3, InteractStickerStruct interactStickerStruct, boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44839a, false, 40863, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z)}, this, f44839a, false, 40863, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if ((!z || VideoViewHolder.this.M()) && VideoViewHolder.this.t != null) {
                VideoViewHolder.this.t.a(VideoViewHolder.this.f44821f, false);
            }
        }
    }

    class d implements com.ss.android.ugc.aweme.sticker.a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44841a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f44843c;

        public final void a(boolean z) {
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f44841a, false, 40866, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44841a, false, 40866, new Class[0], Void.TYPE);
                return;
            }
            if (this.f44843c && VideoViewHolder.this.t != null) {
                VideoViewHolder.this.t.a(VideoViewHolder.this.f44821f, false);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f44841a, false, 40864, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44841a, false, 40864, new Class[0], Void.TYPE);
                return;
            }
            if (!VideoViewHolder.this.M() && VideoViewHolder.this.t != null) {
                VideoViewHolder.this.t.a(VideoViewHolder.this.f44821f, true);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f44841a, false, 40865, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44841a, false, 40865, new Class[0], Void.TYPE);
                return;
            }
            this.f44843c = false;
            if (VideoViewHolder.this.M() && VideoViewHolder.this.t != null) {
                this.f44843c = true;
                VideoViewHolder.this.t.a(VideoViewHolder.this.f44821f, false);
            }
        }

        private d() {
        }

        /* synthetic */ d(VideoViewHolder videoViewHolder, byte b2) {
            this();
        }
    }

    public final void a(float f2) {
    }

    public boolean a(Aweme aweme) {
        return true;
    }

    public final void b(int i, int i2) {
    }

    public final void b(e eVar) {
    }

    public final void c(boolean z2) {
    }

    public final void d(String str) {
    }

    public final IFeedPlayerView k() {
        return this;
    }

    public final g m() {
        return this;
    }

    public final int q() {
        return 1;
    }

    public final p t() {
        return this;
    }

    public final boolean C() {
        return this.L;
    }

    public final boolean D() {
        return this.B;
    }

    public final Context N() {
        return this.f44820e;
    }

    public final Aweme d() {
        return this.f44821f;
    }

    public final CommerceVideoDelegate r() {
        return this.P;
    }

    public final com.ss.android.ugc.aweme.video.f.a y() {
        return this.p;
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f44817b, false, 40699, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f44817b, false, 40699, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.j.a("playlist_id", (Object) str6);
        this.j.a("playlist_type", (Object) str4);
        this.j.a("playlist_id_key", (Object) str5);
    }

    public final void a(Aweme aweme, boolean z2, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, (byte) 1, Integer.valueOf(i)}, this, f44817b, false, 40710, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, (byte) 1, Integer.valueOf(i)}, this, f44817b, false, 40710, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.M = i;
        a(aweme, true);
    }

    public void a(Aweme aweme, boolean z2) {
        long j;
        o oVar;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40711, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z2)}, this, f44817b, false, 40711, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
        } else if (aweme2 != null) {
            StringBuilder sb = new StringBuilder("VideoViewHolder.bind() called with: aweme id = ");
            sb.append(aweme.getAid());
            sb.append(", position = ");
            sb.append(this.M);
            sb.append(", is ad = ");
            sb.append(aweme.isAd());
            sb.append(", adId = ");
            if (PatchProxy.isSupport(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.feed.k.b.f45566a, true, 43601, new Class[]{Aweme.class}, Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.feed.k.b.f45566a, true, 43601, new Class[]{Aweme.class}, Long.TYPE)).longValue();
            } else {
                j = (aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdId() == null) ? -1 : aweme.getAwemeRawAd().getAdId().longValue();
            }
            sb.append(j);
            com.ss.android.ugc.aweme.framework.a.a.a(sb.toString());
            if (!ab()) {
                this.w.a((i) this);
            }
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f44817b, false, 40727, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, this, f44817b, false, 40727, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                this.f44821f = aweme2;
                this.aa.setAweme(aweme2);
                ad();
            }
            this.K = z2;
            CommerceVideoDelegate commerceVideoDelegate = this.P;
            if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z2)}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30605, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z2)}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30605, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            } else if (aweme2 != null) {
                commerceVideoDelegate.f38688e = aweme2;
                commerceVideoDelegate.o.a(commerceVideoDelegate.k, aweme2, commerceVideoDelegate.j);
                commerceVideoDelegate.o();
                if (!(commerceVideoDelegate.h == null || commerceVideoDelegate.h.k() == null || commerceVideoDelegate.h.k().x() == null)) {
                    com.ss.android.ugc.aweme.commerce.b.a.a();
                }
            }
            com.ss.android.ugc.aweme.feed.c.c cVar = this.o;
            if (PatchProxy.isSupport(new Object[]{aweme2}, cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40956, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40956, new Class[]{Aweme.class}, Void.TYPE);
            } else if (aweme2 != null) {
                cVar.f45089e = aweme2;
                if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40958, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40958, new Class[0], Void.TYPE);
                } else {
                    cVar.f45088d.setTranslationX(0.0f);
                    cVar.f45088d.setAlpha(1.0f);
                    cVar.f45086b.setVisibility(8);
                    cVar.f45087c.setVisibility(8);
                    cVar.f45087c.setTranslationX(0.0f);
                }
                FloatingCardInfo floatingCardInfo = aweme.getFloatingCardInfo();
                if (floatingCardInfo != null && !aweme.isAd()) {
                    cVar.f45086b.setVisibility(0);
                    cVar.f45086b.setText(floatingCardInfo.getButtonDesc());
                    cVar.f45086b.setOnClickListener(new com.ss.android.ugc.aweme.feed.c.d(cVar, floatingCardInfo));
                    cVar.f45086b.setButtonBackground(floatingCardInfo.getButtonBackground());
                    cVar.f45087c.setVisibility(4);
                    cVar.f45087c.post(new com.ss.android.ugc.aweme.feed.c.e(cVar));
                    if (floatingCardInfo.getIcons() != null && floatingCardInfo.getIcons().size() > 0) {
                        cVar.f45087c.setIcon(floatingCardInfo.getIcons().get(0));
                    }
                    cVar.f45087c.setTitle(floatingCardInfo.getTitle());
                    cVar.f45087c.setDesc(floatingCardInfo.getDescription());
                    cVar.f45087c.setButtonText(floatingCardInfo.getSchemaDesc());
                    cVar.f45087c.setOnClickListener(new com.ss.android.ugc.aweme.feed.c.f(cVar, floatingCardInfo));
                    cVar.f45087c.setButtonBackground(floatingCardInfo.getButtonBackground());
                    cVar.f45087c.getCloseView().setOnClickListener(new com.ss.android.ugc.aweme.feed.c.g(cVar));
                }
            }
            if (this.K) {
                b();
                this.P.a();
            }
            if (this.K && this.y != null) {
                com.ss.android.ugc.aweme.feed.hw.a aVar = this.y;
                if (PatchProxy.isSupport(new Object[]{aweme2, Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.feed.hw.a.f45548a, false, 41345, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme2, Byte.valueOf(z2)}, aVar, com.ss.android.ugc.aweme.feed.hw.a.f45548a, false, 41345, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
                }
            }
            a((com.ss.android.ugc.aweme.commercialize.utils.c.Q(aweme) && !com.ss.android.ugc.aweme.commercialize.utils.c.R(aweme)) || ((this.n instanceof FeedRecommendFragment) && com.ss.android.ugc.aweme.main.a.a().f54286b) || CleanModeManager2.b(N()) || ((this.n instanceof FeedFollowFragment) && com.ss.android.ugc.aweme.main.a.a().f54287c));
            this.C = 0;
            this.E = false;
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40714, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40714, new Class[0], Void.TYPE);
            } else {
                new a.C0734a().a(this.U.e()).a().d();
            }
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40718, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40718, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.sticker.c cVar2 = new com.ss.android.ugc.aweme.sticker.c();
                cVar2.b(this.f44821f.getAuthorUid()).a(O()).c(this.f44821f.getAid()).d(ai.a().a(this.f44821f.getRequestId()));
                VideoViewHolder videoViewHolder = null;
                if (!o.v()) {
                    oVar = o.b();
                } else {
                    oVar = null;
                    videoViewHolder = this;
                }
                a.C0734a a2 = new a.C0734a().a(this.f44821f).a((com.ss.android.ugc.aweme.sticker.a.a) new c(this, (byte) 0)).a((com.ss.android.ugc.aweme.sticker.a.b) new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(this.f44820e, this.f44821f.getVideo(), this.Q)).a(cVar2).a(oVar).a((g) videoViewHolder).a((com.ss.android.ugc.aweme.sticker.a.c) new d(this, (byte) 0));
                a2.l = this.X.showVote && TextUtils.equals(this.f44821f.getAid(), this.t.aj());
                a2.a(this.U.e()).a().a();
                if (this.U != null) {
                    this.U.n = this.f44821f;
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40715, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40715, new Class[0], Void.TYPE);
            } else {
                new a.C0734a().a(this.f44821f).a(this.U.e()).a().b();
            }
            aq();
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40838, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40838, new Class[0], Void.TYPE);
                return;
            }
            if (this.X.param.isHotSpot()) {
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.discover.hotspot.b.a.f42442a, true, 36581, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.discover.hotspot.b.a.f42442a, true, 36581, new Class[0], Boolean.TYPE)).booleanValue() : com.ss.android.ugc.aweme.discover.hotspot.b.a.f42443b.a()) {
                    RelativeLayout relativeLayout = this.mWidgetContainer;
                    if (PatchProxy.isSupport(new Object[]{relativeLayout}, null, com.ss.android.ugc.aweme.discover.hotspot.b.b.f42445a, true, 36588, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{relativeLayout}, null, com.ss.android.ugc.aweme.discover.hotspot.b.b.f42445a, true, 36588, new Class[]{View.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(relativeLayout, "$this$transForSpot");
                        relativeLayout.setTranslationY(UIUtils.dip2Px(relativeLayout.getContext(), -13.0f));
                    }
                }
            }
        }
    }

    public final void a(ad adVar) {
        AwemeLabelModel awemeLabelModel;
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f44817b, false, 40721, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f44817b, false, 40721, new Class[]{ad.class}, Void.TYPE);
        } else if (this.f44821f.getAid().equals(adVar.f45279b.getAid())) {
            UrlModel urlModel = adVar.f45278a.labelPrivate;
            this.f44821f.setLabelPrivate(urlModel);
            if (PatchProxy.isSupport(new Object[]{urlModel}, this, f44817b, false, 40779, new Class[]{UrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{urlModel}, this, f44817b, false, 40779, new Class[]{UrlModel.class}, Void.TYPE);
            } else {
                if (urlModel != null) {
                    awemeLabelModel = new AwemeLabelModel();
                    awemeLabelModel.setLabelType(1);
                    awemeLabelModel.setUrlModels(urlModel);
                } else {
                    awemeLabelModel = null;
                }
                if (!(this.f44821f == null || this.f44821f.videoLabels == null)) {
                    if (this.f44821f.videoLabels.size() == 0) {
                        this.f44821f.videoLabels.add(0, awemeLabelModel);
                    } else {
                        this.f44821f.videoLabels.set(0, awemeLabelModel);
                    }
                }
            }
            if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().c()).booleanValue() || urlModel == null || CollectionUtils.isEmpty(urlModel.getUrlList())) {
                this.tagLayout.b();
            } else {
                this.tagLayout.b(this.f44821f, this.f44821f.getVideoLabels(), new TagLayout.a(7, 20));
            }
            this.j.a("private_feed_success", (Object) null);
        }
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f44817b, false, 40723, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f44817b, false, 40723, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.f44821f != null && TextUtils.equals(this.f44821f.getAid(), str4) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((TextUtils.equals(O(), "homepage_hot") || TextUtils.equals(O(), "personal_homepage") || TextUtils.equals(O(), "others_homepage")) && this.tagLayout != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = this.f44821f;
                TagLayout.a aVar = new TagLayout.a(7, 20);
                if (PatchProxy.isSupport(new Object[]{aweme, str3, aVar}, tagLayout2, TagLayout.f34981a, false, 25135, new Class[]{Aweme.class, String.class, TagLayout.a.class}, Void.TYPE)) {
                    TagLayout tagLayout3 = tagLayout2;
                    PatchProxy.accessDispatch(new Object[]{aweme, str3, aVar}, tagLayout3, TagLayout.f34981a, false, 25135, new Class[]{Aweme.class, String.class, TagLayout.a.class}, Void.TYPE);
                    return;
                }
                tagLayout2.f34982b = aweme;
                tagLayout2.a();
                tagLayout2.a((List<AwemeLabelModel>) null, aVar);
                RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
                relationDynamicLabel.setLabelInfo(str3);
                tagLayout2.a(relationDynamicLabel);
                tagLayout2.setVisibility(0);
            }
        }
    }

    public final void a(final com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f44817b, false, 40724, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f44817b, false, 40724, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
        } else if (this.f44821f != null && gVar.aid.equals(this.f44821f.getAid())) {
            if (af()) {
                com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.axi, 1, 1).a();
            } else {
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44824a;

                    public final void run() {
                        String str;
                        if (PatchProxy.isSupport(new Object[0], this, f44824a, false, 40857, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f44824a, false, 40857, new Class[0], Void.TYPE);
                            return;
                        }
                        int childCount = VideoViewHolder.this.mBottomView.getChildCount();
                        VideoViewHolder.this.q = new SparseArray<>();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = VideoViewHolder.this.mBottomView.getChildAt(i);
                            VideoViewHolder.this.q.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                            childAt.setVisibility(8);
                        }
                        com.ss.android.ugc.aweme.im.service.model.g gVar = gVar;
                        View view = VideoViewHolder.this.shareTipsRl;
                        DmtTextView dmtTextView = VideoViewHolder.this.shareTipsTv;
                        FrameLayout frameLayout = VideoViewHolder.this.mBottomView;
                        SparseArray<Integer> sparseArray = VideoViewHolder.this.q;
                        if (PatchProxy.isSupport(new Object[]{gVar, view, dmtTextView, frameLayout, sparseArray}, null, aj.f45001a, true, 40222, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class, View.class, DmtTextView.class, ViewGroup.class, SparseArray.class}, Void.TYPE)) {
                            Object[] objArr = {gVar, view, dmtTextView, frameLayout, sparseArray};
                            Object[] objArr2 = objArr;
                            PatchProxy.accessDispatch(objArr2, null, aj.f45001a, true, 40222, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class, View.class, DmtTextView.class, ViewGroup.class, SparseArray.class}, Void.TYPE);
                        } else {
                            view.getLayoutParams().height = 0;
                            view.requestLayout();
                            view.setVisibility(0);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) ((int) UIUtils.dip2Px(GlobalContext.getContext(), 32.0f))});
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45024a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ View f45025b;

                                {
                                    this.f45025b = r1;
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f45024a, false, 40234, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f45024a, false, 40234, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    this.f45025b.getLayoutParams().height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    this.f45025b.requestLayout();
                                }
                            });
                            ofFloat.setDuration(300);
                            ofFloat.start();
                            if (gVar.isMulti) {
                                str = view.getContext().getResources().getString(C0906R.string.alt);
                            } else {
                                str = view.getContext().getResources().getString(C0906R.string.als);
                            }
                            dmtTextView.setText(String.format(str, new Object[]{gVar.contact.getDisplayName()}));
                            view.setOnClickListener(new View.OnClickListener(gVar, view, frameLayout, sparseArray) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45026a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.g f45027b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ View f45028c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ ViewGroup f45029d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ SparseArray f45030e;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f45026a, false, 40235, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f45026a, false, 40235, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    if (this.f45027b.isMulti) {
                                        Intent mainActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getMainActivityIntent(this.f45028c.getContext());
                                        mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                                        this.f45028c.getContext().startActivity(mainActivityIntent);
                                    } else {
                                        IIMService a2 = b.a(false);
                                        if (a2 != null) {
                                            a2.startChat(this.f45028c.getContext(), this.f45027b.contact);
                                        }
                                    }
                                    aj.a(this.f45029d, this.f45030e);
                                }

                                {
                                    this.f45027b = r1;
                                    this.f45028c = r2;
                                    this.f45029d = r3;
                                    this.f45030e = r4;
                                }
                            });
                        }
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f44827a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f44827a, false, 40858, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f44827a, false, 40858, new Class[0], Void.TYPE);
                                    return;
                                }
                                View view = VideoViewHolder.this.shareTipsRl;
                                FrameLayout frameLayout = VideoViewHolder.this.mBottomView;
                                SparseArray<Integer> sparseArray = VideoViewHolder.this.q;
                                if (PatchProxy.isSupport(new Object[]{view, frameLayout, sparseArray}, null, aj.f45001a, true, 40223, new Class[]{View.class, ViewGroup.class, SparseArray.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view, frameLayout, sparseArray}, null, aj.f45001a, true, 40223, new Class[]{View.class, ViewGroup.class, SparseArray.class}, Void.TYPE);
                                    return;
                                }
                                if (view.getVisibility() != 8) {
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) view.getHeight(), 0.0f});
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f45009a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ View f45010b;

                                        {
                                            this.f45010b = r1;
                                        }

                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f45009a, false, 40236, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f45009a, false, 40236, new Class[]{ValueAnimator.class}, Void.TYPE);
                                                return;
                                            }
                                            this.f45010b.getLayoutParams().height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            this.f45010b.requestLayout();
                                        }
                                    });
                                    ofFloat.addListener(new AnimatorListenerAdapter(frameLayout, sparseArray) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f45011a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ ViewGroup f45012b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ SparseArray f45013c;

                                        public final void onAnimationEnd(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f45011a, false, 40227, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f45011a, false, 40227, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            super.onAnimationEnd(animator);
                                            aj.a(this.f45012b, this.f45013c);
                                        }

                                        {
                                            this.f45012b = r1;
                                            this.f45013c = r2;
                                        }
                                    });
                                    ofFloat.setDuration(300);
                                    ofFloat.start();
                                }
                            }
                        }, 5000);
                    }
                }, 500);
            }
        }
    }

    public void a(View view, boolean z2) {
        View view2 = view;
        boolean z3 = z2;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40775, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2)}, this, f44817b, false, 40775, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (CleanModeManager2.a(N())) {
            if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.discover.hotspot.b.b.f42445a, true, 36586, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.discover.hotspot.b.b.f42445a, true, 36586, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.discover.hotspot.b.b.a(view2, z3, 400);
        } else {
            if (TimeLockRuler.isTeenModeON() || z3) {
                i = 4;
            }
            view2.setVisibility(i);
            if (!z3) {
                view2.setAlpha(1.0f);
            }
        }
    }

    public void a(boolean z2) {
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40776, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40776, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!CleanModeManager2.b(N())) {
            z3 = z2;
        }
        super.a(z3);
        a((View) this.mWidgetContainer, z3);
        this.P.b(z3);
        this.poiCardWebPageContainer.a(z3);
        if (z3) {
            if (this.j != null) {
                this.j.a("dismiss_dou_pop", (Object) Boolean.TRUE);
            }
            if (this.j != null) {
                this.j.a("tryDismissEnterMusicGuide", (Object) Boolean.TRUE);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r9 = 0
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40785(0x9f51, float:5.7152E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40785(0x9f51, float:5.7152E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003e:
            r7.r = r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r0)
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.R(r0)
            if (r0 != 0) goto L_0x0057
            r7.a((boolean) r8)
            r7.h((int) r8)
            goto L_0x0074
        L_0x0057:
            android.content.Context r0 = r7.f44820e
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 != 0) goto L_0x0067
            android.content.Context r0 = r19.N()
            boolean r0 = com.ss.android.ugc.aweme.main.CleanModeManager2.a(r0)
            if (r0 == 0) goto L_0x0070
        L_0x0067:
            android.widget.RelativeLayout r0 = r7.mWidgetContainer
            boolean r1 = r19.as()
            r7.a((android.view.View) r0, (boolean) r1)
        L_0x0070:
            r0 = 4
            r7.h((int) r0)
        L_0x0074:
            r19.am()
            r19.ah()
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.mXiguaTaskEveningIv
            java.lang.String r2 = r19.O()
            android.content.Context r3 = r7.f44820e
            com.ss.android.ugc.aweme.j.a.a.a(r0, r1, r2, r3)
        L_0x008d:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.j
            if (r0 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.j
            java.lang.String r1 = "on_page_selected"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
        L_0x009a:
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r7.tagLayout
            if (r0 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.base.ui.TagLayout r0 = r7.tagLayout
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.base.ui.TagLayout.f34981a
            r13 = 0
            r14 = 25129(0x6229, float:3.5213E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x00c2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.base.ui.TagLayout.f34981a
            r13 = 0
            r14 = 25129(0x6229, float:3.5213E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0108
        L_0x00c2:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f34982b
            if (r1 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f34982b
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r1.getRelationLabel()
            if (r1 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f34982b
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r1.getRelationLabel()
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.base.ui.HollowTextView r1 = r0.f34983c
            if (r1 != 0) goto L_0x00df
            goto L_0x0108
        L_0x00df:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "show"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "like_banner"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f34982b
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setValue(r0)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x0108:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.feed.k.b.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r0 == 0) goto L_0x0116
            com.ss.android.ugc.aweme.commerce.b.a.a()
            r19.x()
        L_0x0116:
            android.support.v4.app.Fragment r0 = r7.n
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r0 == 0) goto L_0x0127
            boolean r0 = r7.O
            if (r0 == 0) goto L_0x0125
            com.ss.android.ugc.playerkit.videoview.VideoSurfaceHolder r0 = r7.w
            r0.d()
        L_0x0125:
            r7.O = r9
        L_0x0127:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40792(0x9f58, float:5.7162E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            if (r0 == 0) goto L_0x014e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40792(0x9f58, float:5.7162E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0155
        L_0x014e:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.j
            java.lang.String r1 = "hide_poi_info"
            r0.a((java.lang.String) r1, (java.lang.Object) r10)
        L_0x0155:
            r19.aq()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40793(0x9f59, float:5.7163E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x017e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40793(0x9f59, float:5.7163E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ac
        L_0x017e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            boolean r0 = r0.isAdPoiControl()
            if (r0 != 0) goto L_0x0193
            goto L_0x01ac
        L_0x0193:
            android.widget.RelativeLayout r0 = r7.mWidgetContainer
            if (r0 == 0) goto L_0x01ac
            android.widget.RelativeLayout r0 = r7.mWidgetContainer
            com.ss.android.ugc.aweme.feed.adapter.ae r1 = new com.ss.android.ugc.aweme.feed.adapter.ae
            r1.<init>(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f44821f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            int r2 = r2.getShowPoiMillisecond()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L_0x01ac:
            android.content.Context r0 = r7.f44820e
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 == 0) goto L_0x01bc
            com.ss.android.ugc.aweme.feed.f.ac r0 = new com.ss.android.ugc.aweme.feed.f.ac
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            r0.<init>(r1)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
        L_0x01bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            if (r0 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "ad_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "request_id"
            com.ss.android.ugc.aweme.feed.a r3 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f44821f
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r5 = r7.X
            int r5 = r5.pageType
            java.lang.String r3 = r3.c((com.ss.android.ugc.aweme.feed.model.Aweme) r4, (int) r5)
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x01ff:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.j
            java.lang.String r1 = "video_page_change"
            r0.a((java.lang.String) r1, (java.lang.Object) r10)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40738(0x9f22, float:5.7086E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x022c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40738(0x9f22, float:5.7086E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0242
        L_0x022c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.report.b.b(r0)
            if (r0 == 0) goto L_0x0242
            android.widget.LinearLayout r0 = r7.feedReportVotell
            android.content.Context r1 = r7.f44820e
            r2 = -1029308416(0xffffffffc2a60000, float:-83.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r1 = (int) r1
            com.ss.android.ugc.aweme.report.b.a(r0, r1, r9, r9)
        L_0x0242:
            boolean r0 = com.ss.android.ugc.aweme.main.bj.f54591b
            if (r0 != 0) goto L_0x02ba
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40739(0x9f23, float:5.7087E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x026c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40739(0x9f23, float:5.7087E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02ba
        L_0x026c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.report.b.b(r0)
            if (r0 == 0) goto L_0x02ba
            java.lang.Runnable r0 = r7.N
            if (r0 != 0) goto L_0x027f
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$3 r0 = new com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$3
            r0.<init>()
            r7.N = r0
        L_0x027f:
            android.widget.LinearLayout r0 = r7.feedReportVotell
            java.lang.Runnable r1 = r7.N
            r2 = 100
            r0.postDelayed(r1, r2)
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "show_review_ban"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "homepage_hot"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.app.d.c r1 = new com.ss.android.ugc.aweme.app.d.c
            r1.<init>()
            java.lang.String r2 = "is_user_review"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x02ba:
            com.ss.android.ugc.aweme.feed.hw.a r0 = r7.y
            if (r0 == 0) goto L_0x02e7
            com.ss.android.ugc.aweme.feed.hw.a r0 = r7.y
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.hw.a.f45548a
            r14 = 0
            r15 = 41346(0xa182, float:5.7938E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x02e7
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.hw.a.f45548a
            r14 = 0
            r15 = 41346(0xa182, float:5.7938E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
        L_0x02e7:
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r0 = r7.P
            r0.c()
            java.lang.String r0 = r19.O()
            java.lang.String r1 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 3
            if (r0 == 0) goto L_0x03bf
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r14 = 1
            r15 = 40264(0x9d48, float:5.6422E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0328
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r14 = 1
            r15 = 40264(0x9d48, float:5.6422E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0345
        L_0x0328:
            boolean r0 = com.ss.android.ugc.aweme.feed.ar.a()
            if (r0 == 0) goto L_0x0344
            com.ss.android.ugc.aweme.setting.model.UserPreferSettings r0 = com.ss.android.ugc.aweme.feed.ar.f45069c
            if (r0 == 0) goto L_0x0344
            int r0 = com.ss.android.ugc.aweme.feed.ar.f45070d
            com.ss.android.ugc.aweme.setting.model.UserPreferSettings r2 = com.ss.android.ugc.aweme.feed.ar.f45069c
            int r2 = r2.n
            if (r0 > r2) goto L_0x0344
            int r0 = com.ss.android.ugc.aweme.feed.ar.f45071e
            com.ss.android.ugc.aweme.setting.model.UserPreferSettings r2 = com.ss.android.ugc.aweme.feed.ar.f45069c
            int r2 = r2.v
            if (r0 < r2) goto L_0x0344
            r0 = 1
            goto L_0x0345
        L_0x0344:
            r0 = 0
        L_0x0345:
            if (r0 == 0) goto L_0x03bf
            android.content.Context r0 = r7.f44820e
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f44821f
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.feed.ui.bd r0 = com.ss.android.ugc.aweme.feed.ar.a(r0, r2)
            r7.z = r0
            com.ss.android.ugc.aweme.feed.ui.bd r0 = r7.z
            if (r0 == 0) goto L_0x04ae
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r13 = 1
            r14 = 40268(0x9d4c, float:5.6427E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x037d
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r13 = 1
            r14 = 40268(0x9d4c, float:5.6427E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x038e
        L_0x037d:
            com.ss.android.ugc.aweme.feed.ar.f45068b = r8
            com.ss.android.ugc.aweme.feed.ar.g = r9
            com.ss.android.ugc.aweme.aj.b r0 = com.ss.android.ugc.aweme.aj.b.b()
            com.ss.android.ugc.aweme.app.k r2 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r3 = "user_prefer_has_show"
            r0.a((android.content.Context) r2, (java.lang.String) r3, (boolean) r8)
        L_0x038e:
            android.widget.FrameLayout r0 = r7.mRootView
            com.ss.android.ugc.aweme.feed.ui.bd r2 = r7.z
            r0.addView(r2)
            r7.B = r8
            com.ss.android.ugc.aweme.feed.ar.c()
            com.ss.android.ugc.aweme.video.o r0 = com.ss.android.ugc.aweme.video.o.b()
            r0.h()
            android.content.Context r0 = r7.f44820e
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 == 0) goto L_0x03ae
            android.content.Context r0 = r7.f44820e
            com.ss.android.ugc.aweme.main.MainActivity r0 = (com.ss.android.ugc.aweme.main.MainActivity) r0
            r0.setCanScroll(r9)
        L_0x03ae:
            android.support.v4.app.Fragment r0 = r7.n
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r0 == 0) goto L_0x04ae
            android.support.v4.app.Fragment r0 = r7.n
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = (com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment) r0
            com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel r0 = r0.g
            r0.Y()
            goto L_0x04ae
        L_0x03bf:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.String r0 = r0.getAid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0450
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.String r0 = r0.getAid()
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.ar.h
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0450
            boolean r0 = com.ss.android.ugc.aweme.feed.ar.g
            if (r0 != 0) goto L_0x0450
            com.ss.android.ugc.aweme.feed.ui.bd r0 = r7.z
            if (r0 != 0) goto L_0x03fa
            android.content.Context r0 = r7.f44820e
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f44821f
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.feed.ui.bd r0 = com.ss.android.ugc.aweme.feed.ar.a(r0, r2)
            r7.z = r0
            com.ss.android.ugc.aweme.feed.ui.bd r0 = r7.z
            if (r0 == 0) goto L_0x03fa
            android.widget.FrameLayout r0 = r7.mRootView
            com.ss.android.ugc.aweme.feed.ui.bd r2 = r7.z
            r0.addView(r2)
        L_0x03fa:
            r7.B = r8
            com.ss.android.ugc.aweme.video.o r0 = com.ss.android.ugc.aweme.video.o.b()
            r0.h()
            com.ss.android.ugc.aweme.feed.ar.c()
            android.support.v4.app.Fragment r0 = r7.n
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r0 == 0) goto L_0x0415
            android.support.v4.app.Fragment r0 = r7.n
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = (com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment) r0
            com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel r0 = r0.g
            r0.Y()
        L_0x0415:
            android.content.Context r0 = r7.f44820e
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 == 0) goto L_0x0422
            android.content.Context r0 = r7.f44820e
            com.ss.android.ugc.aweme.main.MainActivity r0 = (com.ss.android.ugc.aweme.main.MainActivity) r0
            r0.setCanScroll(r9)
        L_0x0422:
            com.ss.android.ugc.aweme.feed.ui.bd r0 = r7.z
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.ui.bd.f46566a
            r13 = 0
            r14 = 43104(0xa860, float:6.0402E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0448
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.feed.ui.bd.f46566a
            r13 = 0
            r14 = 43104(0xa860, float:6.0402E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x04ae
        L_0x0448:
            com.bytedance.common.utility.collection.WeakHandler r0 = r0.i
            r2 = 20
            r0.sendEmptyMessageDelayed(r1, r2)
            goto L_0x04ae
        L_0x0450:
            r7.B = r9
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.String r0 = r0.getAid()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r14 = 1
            r15 = 40262(0x9d46, float:5.6419E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x048c
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ar.f45067a
            r14 = 1
            r15 = 40262(0x9d46, float:5.6419E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x04a1
        L_0x048c:
            boolean r2 = com.ss.android.ugc.aweme.feed.ar.b()
            if (r2 == 0) goto L_0x049c
            java.util.List<java.lang.String> r2 = com.ss.android.ugc.aweme.feed.ar.i
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x049c
            com.ss.android.ugc.aweme.feed.ar.f45071e = r9
        L_0x049c:
            int r0 = com.ss.android.ugc.aweme.feed.ar.f45070d
            int r0 = r0 - r8
            com.ss.android.ugc.aweme.feed.ar.f45070d = r0
        L_0x04a1:
            com.ss.android.ugc.aweme.feed.ui.bd r0 = r7.z
            if (r0 == 0) goto L_0x04ae
            android.widget.FrameLayout r0 = r7.mRootView
            com.ss.android.ugc.aweme.feed.ui.bd r2 = r7.z
            r0.removeView(r2)
            r7.z = r10
        L_0x04ae:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.am.d(r0)
            if (r0 != 0) goto L_0x04bd
            android.widget.RelativeLayout r0 = r7.mWidgetContainer
            com.ss.android.ugc.aweme.base.ui.TagLayout r2 = r7.tagLayout
            com.ss.android.ugc.aweme.commercialize.utils.o.a((android.view.ViewGroup) r0, (com.ss.android.ugc.aweme.base.ui.TagLayout) r2)
        L_0x04bd:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r0)
            if (r0 == 0) goto L_0x04c8
            r19.at()
        L_0x04c8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.String r0 = r0.getExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04dc
            com.ss.android.ugc.aweme.feed.ui.DebugInfoView r0 = r7.mDebugInfoView
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x04ec
        L_0x04dc:
            com.ss.android.ugc.aweme.feed.ui.DebugInfoView r0 = r7.mDebugInfoView
            r0.setVisibility(r9)
            com.ss.android.ugc.aweme.feed.ui.DebugInfoView r0 = r7.mDebugInfoView
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f44821f
            java.lang.String r2 = r2.getExtra()
            r0.setContent(r2)
        L_0x04ec:
            java.lang.String r0 = r19.O()
            java.lang.String r2 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x06fc
            com.ss.android.ugc.aweme.commercialize.splash.h r0 = com.ss.android.ugc.aweme.commercialize.splash.h.i
            android.content.Context r2 = r19.N()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f44821f
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.splash.h.f2931a
            r13 = 0
            r14 = 32020(0x7d14, float:4.487E-41)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r17 = 0
            r6 = 9
            if (r5 == 0) goto L_0x0540
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.splash.h.f2931a
            r13 = 0
            r14 = 32020(0x7d14, float:4.487E-41)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r2
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x05fd
        L_0x0540:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.splash.h.f2934d
            if (r0 != 0) goto L_0x05fd
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.t(r3)
            if (r0 == 0) goto L_0x05ec
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r3)
            if (r0 == 0) goto L_0x055a
            com.ss.android.ugc.aweme.commercialize.splash.h.f2935e = r8
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.commercialize.splash.h.f2936f = r2
            goto L_0x05fd
        L_0x055a:
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.f2935e
            if (r8 <= r0) goto L_0x0560
            goto L_0x05e9
        L_0x0560:
            if (r6 < r0) goto L_0x05e9
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = "adsgap"
            int r10 = com.ss.android.ugc.aweme.commercialize.splash.h.f2935e
            int r10 = r10 - r8
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.put(r5, r10)
            java.lang.String r5 = "gaptime"
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = com.ss.android.ugc.aweme.commercialize.splash.h.f2936f
            long r10 = r10 - r12
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.put(r5, r10)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            r10[r8] = r3
            r10[r4] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r13 = 1
            r14 = 31674(0x7bba, float:4.4385E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r5
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r15[r4] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x05cb
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            r10[r8] = r3
            r10[r4] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r13 = 1
            r14 = 31674(0x7bba, float:4.4385E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r0
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r15[r4] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x05e9
        L_0x05cb:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r10 = "ad_extra_data"
            com.google.gson.Gson r11 = new com.google.gson.Gson
            r11.<init>()
            java.lang.String r0 = r11.toJson((java.lang.Object) r0)
            r5.put(r10, r0)
            java.lang.String r0 = "feed_firstshow"
            java.lang.String r10 = ""
            org.json.JSONObject r5 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r10, (boolean) r9, (java.util.Map<java.lang.String, java.lang.String>) r5)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r2, (java.lang.String) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (org.json.JSONObject) r5)
        L_0x05e9:
            com.ss.android.ugc.aweme.commercialize.splash.h.f2935e = r9
            goto L_0x05fd
        L_0x05ec:
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.f2935e
            if (r8 <= r0) goto L_0x05f1
            goto L_0x05f9
        L_0x05f1:
            if (r6 < r0) goto L_0x05f9
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.f2935e
            int r0 = r0 + r8
            com.ss.android.ugc.aweme.commercialize.splash.h.f2935e = r0
            goto L_0x05fd
        L_0x05f9:
            com.ss.android.ugc.aweme.commercialize.splash.h.f2935e = r9
            com.ss.android.ugc.aweme.commercialize.splash.h.f2936f = r17
        L_0x05fd:
            com.ss.android.ugc.aweme.commercialize.splash.h r0 = com.ss.android.ugc.aweme.commercialize.splash.h.i
            android.content.Context r2 = r19.N()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f44821f
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.splash.h.f2931a
            r13 = 0
            r14 = 32021(0x7d15, float:4.4871E-41)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x063f
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.splash.h.f2931a
            r13 = 0
            r14 = 32021(0x7d15, float:4.4871E-41)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r15[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x063f:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.t(r3)
            if (r0 == 0) goto L_0x0654
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r3)
            if (r0 != 0) goto L_0x0654
            com.ss.android.ugc.aweme.commercialize.splash.h.g = r8
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.commercialize.splash.h.h = r0
            return
        L_0x0654:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.Q(r3)
            if (r0 == 0) goto L_0x06eb
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.g
            if (r8 <= r0) goto L_0x065f
            return
        L_0x065f:
            if (r6 < r0) goto L_0x06fc
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = "adsgap"
            int r6 = com.ss.android.ugc.aweme.commercialize.splash.h.g
            int r6 = r6 - r8
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.put(r5, r6)
            java.lang.String r5 = "gaptime"
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = com.ss.android.ugc.aweme.commercialize.splash.h.h
            long r10 = r10 - r12
            java.lang.String r6 = java.lang.String.valueOf(r10)
            r0.put(r5, r6)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            r10[r8] = r3
            r10[r4] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r13 = 1
            r14 = 31675(0x7bbb, float:4.4386E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r5
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r15[r4] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x06ca
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r2
            r10[r8] = r3
            r10[r4] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
            r13 = 1
            r14 = 31675(0x7bbb, float:4.4386E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r8] = r0
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r15[r4] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x06e8
        L_0x06ca:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r4 = "ad_extra_data"
            com.google.gson.Gson r5 = new com.google.gson.Gson
            r5.<init>()
            java.lang.String r0 = r5.toJson((java.lang.Object) r0)
            r1.put(r4, r0)
            java.lang.String r0 = "feed_lastshow"
            java.lang.String r4 = ""
            org.json.JSONObject r1 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r4, (boolean) r9, (java.util.Map<java.lang.String, java.lang.String>) r1)
            com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r2, (java.lang.String) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (org.json.JSONObject) r1)
        L_0x06e8:
            com.ss.android.ugc.aweme.commercialize.splash.h.g = r9
            return
        L_0x06eb:
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.g
            if (r8 <= r0) goto L_0x06f0
            goto L_0x06f8
        L_0x06f0:
            if (r6 < r0) goto L_0x06f8
            int r0 = com.ss.android.ugc.aweme.commercialize.splash.h.g
            int r0 = r0 + r8
            com.ss.android.ugc.aweme.commercialize.splash.h.g = r0
            return
        L_0x06f8:
            com.ss.android.ugc.aweme.commercialize.splash.h.g = r9
            com.ss.android.ugc.aweme.commercialize.splash.h.h = r17
        L_0x06fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder.a(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.video.b.a r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.video.b.a> r1 = com.ss.android.ugc.aweme.video.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40800(0x9f60, float:5.7173E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40800(0x9f60, float:5.7173E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.video.b.a> r1 = com.ss.android.ugc.aweme.video.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r7.mIvRelieveTag
            boolean r0 = com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0)
            if (r0 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.antiaddic.b.f33370a
            r14 = 1
            r15 = 21684(0x54b4, float:3.0386E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0072
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.antiaddic.b.f33370a
            r14 = 1
            r15 = 21684(0x54b4, float:3.0386E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00ba
        L_0x0072:
            com.ss.android.ugc.aweme.antiaddic.c r1 = com.ss.android.ugc.aweme.antiaddic.c.a()
            long r2 = java.lang.System.currentTimeMillis()
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "night"
            goto L_0x0085
        L_0x0083:
            java.lang.String r1 = "day"
        L_0x0085:
            com.ss.android.ugc.aweme.common.MobClick r2 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r3 = "video_play"
            com.ss.android.ugc.aweme.common.MobClick r2 = r2.setEventName(r3)
            java.lang.String r3 = "homepage_hot"
            com.ss.android.ugc.aweme.common.MobClick r2 = r2.setLabelName(r3)
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r2.setValue(r0)
            com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r3 = "is_addicted"
            java.lang.String r4 = "1"
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "appear_time"
            com.ss.android.ugc.aweme.app.d.c r1 = r2.a((java.lang.String) r3, (java.lang.String) r1)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x00ba:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.j
            java.lang.String r1 = "on_render_ready"
            r8 = 0
            r0.a((java.lang.String) r1, (java.lang.Object) r8)
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r0 = r7.P
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30679(0x77d7, float:4.299E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00eb
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30679(0x77d7, float:4.299E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e5
        L_0x00eb:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30680(0x77d8, float:4.2992E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0112
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30680(0x77d8, float:4.2992E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e5
        L_0x0112:
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r1 = r0.h
            com.ss.android.ugc.playerkit.videoview.g r1 = r0.a((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f38688e
            r3 = 2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r2
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a
            r14 = 1
            r15 = 32727(0x7fd7, float:4.586E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r10] = r5
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r5 = com.ss.android.ugc.playerkit.videoview.g.class
            r4[r9] = r5
            java.lang.Class r17 = java.lang.Long.TYPE
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0160
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r2
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a
            r14 = 1
            r15 = 32727(0x7fd7, float:4.586E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r2 = com.ss.android.ugc.playerkit.videoview.g.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Long.TYPE
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x01b6
        L_0x0160:
            boolean r3 = com.ss.android.ugc.aweme.video.o.v()
            if (r3 == 0) goto L_0x016d
            if (r1 == 0) goto L_0x016d
            long r3 = r1.V()
            goto L_0x017a
        L_0x016d:
            com.ss.android.ugc.aweme.video.o r1 = com.ss.android.ugc.aweme.video.o.b()
            java.lang.String r3 = "PlayerManager.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            long r3 = r1.d()
        L_0x017a:
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0182
            r1 = r3
            goto L_0x01b6
        L_0x0182:
            if (r2 == 0) goto L_0x0193
            com.ss.android.ugc.aweme.feed.model.Video r1 = r2.getVideo()
            if (r1 == 0) goto L_0x0193
            int r1 = r1.getDuration()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0194
        L_0x0193:
            r1 = r8
        L_0x0194:
            if (r1 == 0) goto L_0x01b4
            com.ss.android.ugc.aweme.feed.model.Video r1 = r2.getVideo()
            java.lang.String r3 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            int r1 = r1.getDuration()
            if (r1 <= 0) goto L_0x01b4
            com.ss.android.ugc.aweme.feed.model.Video r1 = r2.getVideo()
            java.lang.String r2 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r1 = r1.getDuration()
            long r1 = (long) r1
            goto L_0x01b6
        L_0x01b4:
            r1 = 1
        L_0x01b6:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30681(0x77d9, float:4.2993E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r4 = java.lang.Long.TYPE
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x01f3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30681(0x77d9, float:4.2993E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Long.TYPE
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0382
        L_0x01f3:
            boolean r3 = com.ss.android.g.a.a()
            if (r3 == 0) goto L_0x0382
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f38688e
            if (r3 == 0) goto L_0x0382
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f38688e
            boolean r3 = r3.isAd()
            if (r3 != 0) goto L_0x0207
            goto L_0x0382
        L_0x0207:
            r3 = 6000(0x1770, double:2.9644E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0232
            com.ss.android.ugc.aweme.commercialize.utils.b.b r3 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r4 = new com.ss.android.ugc.aweme.commercialize.utils.b.a$a
            r4.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r4 = r4.a((long) r1)
            r5 = 6000(0x1770, float:8.408E-42)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r4 = r4.a((int) r5)
            com.ss.android.ugc.aweme.commercialize.feed.q r5 = new com.ss.android.ugc.aweme.commercialize.feed.q
            r5.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r4 = r4.a((java.lang.Runnable) r5)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r4 = r4.a((boolean) r9)
            com.ss.android.ugc.aweme.commercialize.utils.b.a r4 = r4.a()
            r3.a(r4)
        L_0x0232:
            r3 = 15000(0x3a98, double:7.411E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x025d
            com.ss.android.ugc.aweme.commercialize.utils.b.b r5 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = new com.ss.android.ugc.aweme.commercialize.utils.b.a$a
            r6.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r6.a((long) r1)
            r11 = 15000(0x3a98, float:2.102E-41)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r6.a((int) r11)
            com.ss.android.ugc.aweme.commercialize.feed.r r11 = new com.ss.android.ugc.aweme.commercialize.feed.r
            r11.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r6.a((java.lang.Runnable) r11)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r6.a((boolean) r9)
            com.ss.android.ugc.aweme.commercialize.utils.b.a r6 = r6.a()
            r5.a(r6)
        L_0x025d:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f38688e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r14 = 1
            r15 = 32309(0x7e35, float:4.5275E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r16 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r6[r10] = r16
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x0298
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r14 = 1
            r15 = 32309(0x7e35, float:4.5275E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r6
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x02b7
        L_0x0298:
            boolean r6 = com.ss.android.g.a.a()
            if (r6 == 0) goto L_0x02b6
            if (r5 == 0) goto L_0x02b6
            boolean r6 = r5.isAd()
            if (r6 == 0) goto L_0x02b6
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            java.util.List r5 = r5.getPlaybackSecondsTrackList()
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02b6
            r5 = 1
            goto L_0x02b7
        L_0x02b6:
            r5 = 0
        L_0x02b7:
            if (r5 == 0) goto L_0x0300
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f38688e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            java.util.List r5 = r5.getPlaybackSecondsTrackList()
            java.util.Iterator r5 = r5.iterator()
        L_0x02c7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0300
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.aweme.commercialize.model.m r6 = (com.ss.android.ugc.aweme.commercialize.model.m) r6
            int r11 = r6.f39395b
            int r11 = r11 * 1000
            long r12 = (long) r11
            int r14 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02c7
            com.ss.android.ugc.aweme.commercialize.utils.b.b r12 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r13 = new com.ss.android.ugc.aweme.commercialize.utils.b.a$a
            r13.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r13 = r13.a((long) r1)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r11 = r13.a((int) r11)
            com.ss.android.ugc.aweme.commercialize.feed.s r13 = new com.ss.android.ugc.aweme.commercialize.feed.s
            r13.<init>(r0, r6)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r11.a((java.lang.Runnable) r13)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r6 = r6.a((boolean) r9)
            com.ss.android.ugc.aweme.commercialize.utils.b.a r6 = r6.a()
            r12.a(r6)
            goto L_0x02c7
        L_0x0300:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f38688e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r14 = 1
            r15 = 32310(0x7e36, float:4.5276E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r16 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r6[r10] = r16
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x033b
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r5
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r14 = 1
            r15 = 32310(0x7e36, float:4.5276E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r6
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0358
        L_0x033b:
            boolean r6 = com.ss.android.g.a.a()
            if (r6 == 0) goto L_0x0357
            if (r5 == 0) goto L_0x0357
            boolean r6 = r5.isAd()
            if (r6 == 0) goto L_0x0357
            r6 = 100
            java.util.List r5 = r5.getRawAdPlayNodeTrackUrlList(r6)
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0357
            r5 = 1
            goto L_0x0358
        L_0x0357:
            r5 = 0
        L_0x0358:
            if (r5 == 0) goto L_0x0382
            long r3 = java.lang.Math.min(r3, r1)
            int r3 = (int) r3
            com.ss.android.ugc.aweme.commercialize.utils.b.b r4 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r5 = new com.ss.android.ugc.aweme.commercialize.utils.b.a$a
            r5.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r1 = r5.a((long) r1)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r1 = r1.a((int) r3)
            com.ss.android.ugc.aweme.commercialize.feed.t r2 = new com.ss.android.ugc.aweme.commercialize.feed.t
            r2.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r0 = r1.a((java.lang.Runnable) r2)
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r0 = r0.a((boolean) r9)
            com.ss.android.ugc.aweme.commercialize.utils.b.a r0 = r0.a()
            r4.a(r0)
        L_0x0382:
            com.ss.android.ugc.aweme.commercialize.utils.b.b r0 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a
            r14 = 0
            r15 = 32723(0x7fd3, float:4.5855E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x03aa
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a
            r14 = 0
            r15 = 32723(0x7fd3, float:4.5855E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e5
        L_0x03aa:
            com.ss.android.ugc.aweme.commercialize.utils.b.b.f39769c = r10
            java.util.List<com.ss.android.ugc.aweme.commercialize.utils.b.a> r0 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39768b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03e5
            com.ss.android.ugc.aweme.commercialize.utils.b.b$a r0 = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39770d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.a.f39772a
            r14 = 0
            r15 = 32728(0x7fd8, float:4.5862E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x03dc
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.utils.b.b.a.f39772a
            r14 = 0
            r15 = 32728(0x7fd8, float:4.5862E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e5
        L_0x03dc:
            boolean r1 = r0.hasMessages(r9)
            if (r1 != 0) goto L_0x03e5
            r0.sendEmptyMessage(r9)
        L_0x03e5:
            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.audio.g.f34417a
            r14 = 0
            r15 = 23909(0x5d65, float:3.3504E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x040f
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.audio.g.f34417a
            r14 = 0
            r15 = 23909(0x5d65, float:3.3504E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0418
        L_0x040f:
            com.ss.android.ugc.aweme.audio.g$a r1 = r0.h
            if (r1 == 0) goto L_0x0418
            com.ss.android.ugc.aweme.audio.g$a r0 = r0.h
            r0.a()
        L_0x0418:
            r18.ac()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40717(0x9f0d, float:5.7057E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0441
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40717(0x9f0d, float:5.7057E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0441:
            boolean r0 = com.ss.android.ugc.aweme.video.o.v()
            if (r0 != 0) goto L_0x044c
            com.ss.android.ugc.aweme.video.o r0 = com.ss.android.ugc.aweme.video.o.b()
            goto L_0x044e
        L_0x044c:
            r0 = r8
            r8 = r7
        L_0x044e:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f44821f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a r1 = r1.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a r0 = r1.a((com.ss.android.ugc.aweme.video.o) r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a r0 = r0.a((com.ss.android.ugc.playerkit.videoview.g) r8)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r1 = r7.U
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r1.e()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a r0 = r0.a((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel) r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a r0 = r0.a()
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder.a(com.ss.android.ugc.aweme.video.b.a):void");
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f44817b, false, 40802, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f44817b, false, 40802, new Class[]{e.class}, Void.TYPE);
            return;
        }
        al();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40803, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40803, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ah();
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40807, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40807, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.E = z2;
        if (z2) {
            this.C = System.currentTimeMillis();
            return;
        }
        if (this.C > 0) {
            this.D += System.currentTimeMillis() - this.C;
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        String str;
        double d2;
        double d3;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f44817b, false, 40808, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f44817b, false, 40808, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40833, new Class[0], Void.TYPE);
        } else if (ar()) {
            PoiStruct poiStruct = this.f44821f.getPoiStruct();
            com.ss.android.ugc.aweme.poi.model.m poiCard = poiStruct.getPoiCard();
            StringBuilder sb = new StringBuilder();
            if (!poiCard.getUrl().endsWith("?")) {
                sb.append("?");
            }
            sb.append("poiId=" + Uri.encode(this.f44821f.getPoiStruct().poiId));
            sb.append("&theme=1");
            StringBuilder sb2 = new StringBuilder("&distance=");
            Context N2 = N();
            if (PatchProxy.isSupport(new Object[]{N2, poiStruct}, null, p.f59828a, true, 66891, new Class[]{Context.class, PoiStruct.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{N2, poiStruct}, null, p.f59828a, true, 66891, new Class[]{Context.class, PoiStruct.class}, String.class);
            } else {
                com.ss.android.ugc.aweme.poi.a f2 = af.a((Context) k.a()).f();
                if (f2 != null) {
                    double doubleValue = Double.valueOf(poiStruct.poiLatitude).doubleValue();
                    double doubleValue2 = Double.valueOf(poiStruct.poiLongitude).doubleValue();
                    double d4 = f2.latitude;
                    double d5 = f2.longitude;
                    if (!f2.isGaode) {
                        double[] b2 = com.ss.android.ugc.aweme.poi.e.a.b(d5, d4);
                        d2 = b2[0];
                        d3 = b2[1];
                    } else {
                        d3 = d4;
                        d2 = d5;
                    }
                    str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDistanceBetweenLocations(N2, doubleValue, doubleValue2, d3, d2);
                } else {
                    str = "";
                }
            }
            sb2.append(Uri.encode(str));
            sb.append(sb2.toString());
            String str2 = poiCard.getUrl() + sb.toString();
            PoiCardWebPageContainer poiCardWebPageContainer2 = this.poiCardWebPageContainer;
            Aweme aweme = this.f44821f;
            FragmentManager fragmentManager = this.n.getFragmentManager();
            if (PatchProxy.isSupport(new Object[]{str2, aweme, fragmentManager}, poiCardWebPageContainer2, PoiCardWebPageContainer.f2781a, false, 25087, new Class[]{String.class, Aweme.class, FragmentManager.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, aweme, fragmentManager}, poiCardWebPageContainer2, PoiCardWebPageContainer.f2781a, false, 25087, new Class[]{String.class, Aweme.class, FragmentManager.class}, Void.TYPE);
            } else {
                poiCardWebPageContainer2.f2783c = aweme;
                poiCardWebPageContainer2.f2784d = fragmentManager;
                bg.c(poiCardWebPageContainer2);
                Bundle bundle = new Bundle();
                bundle.putString(PushConstants.WEB_URL, str2);
                bundle.putBoolean("show_load_dialog", false);
                bundle.putBoolean("bundle_forbidden_jump", true);
                bundle.putBoolean("need_use_black_background", true);
                if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
                    bundle.putBoolean("bundle_fix_webview", false);
                }
                poiCardWebPageContainer2.f2785e = PoiCardWebPageFragment.a(bundle);
                poiCardWebPageContainer2.f2785e.a((com.ss.android.ugc.aweme.commercialize.views.cards.k) new com.ss.android.ugc.aweme.commercialize.views.cards.k() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f34975a;

                    public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.1.b():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.1.b():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.1.a():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.1.a():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                });
                FrameLayout frameLayout = new FrameLayout(poiCardWebPageContainer2.getContext());
                frameLayout.setId(PoiCardWebPageContainer.bzf);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                poiCardWebPageContainer2.addView(frameLayout);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(PoiCardWebPageContainer.bzf, (Fragment) poiCardWebPageContainer2.f2785e);
                beginTransaction.commitNowAllowingStateLoss();
            }
            ap();
        }
        this.A = System.currentTimeMillis();
        this.F = false;
        this.G = 0;
        this.D = 0;
        ag();
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40750, new Class[0], Void.TYPE);
        } else {
            g.a aVar = com.ss.android.ugc.aweme.share.seconditem.g.h;
            Aweme d6 = d();
            if (PatchProxy.isSupport(new Object[]{d6}, aVar, g.a.f65284a, false, 73718, new Class[]{Aweme.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{d6}, aVar, g.a.f65284a, false, 73718, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else {
                Intrinsics.checkParameterIsNotNull(d6, "aweme");
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                if (com.ss.android.g.a.a()) {
                    SharePrefCache inst = SharePrefCache.inst();
                    Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                    an<Boolean> canCreateInsights = inst.getCanCreateInsights();
                    Intrinsics.checkExpressionValueIsNotNull(canCreateInsights, "SharePrefCache.inst().canCreateInsights");
                    Object c2 = canCreateInsights.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().canCreateInsights.cache");
                    if (((Boolean) c2).booleanValue() && curUser != null && curUser.getIsCreater() && cg.a(d6.getAuthorUid())) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z2) {
                if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40063, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40063, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    com.ss.android.ugc.aweme.base.sharedpref.f d7 = com.ss.android.ugc.aweme.base.sharedpref.e.d();
                    StringBuilder sb3 = new StringBuilder("enter_insights_");
                    sb3.append(com.ss.android.ugc.aweme.account.d.a().getCurUserId());
                    z3 = d7.a(sb3.toString(), true) && com.ss.android.g.a.a();
                }
                if (z3 && ((!"message".equals(O()) && !"chat".equals(O()) && !"push".equals(O())) || this.X.cid == null)) {
                    View findViewById = this.mRootView.findViewById(C0906R.id.cpf);
                    if (findViewById != null) {
                        if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40064, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40064, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.base.sharedpref.e.d().b("enter_insights_" + com.ss.android.ugc.aweme.account.d.a().getCurUserId(), false);
                        }
                        if (this.I == null) {
                            this.I = new com.ss.android.ugc.aweme.poi.widget.c((Activity) this.f44820e);
                        }
                        this.I.a(false);
                        this.I.o = 4500;
                        this.I.c(C0906R.string.s9);
                        this.I.a(findViewById, 3, true, 0.0f);
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40767, new Class[0], Void.TYPE);
        } else if ((this.M == 4 || !com.ss.android.g.a.a()) && !com.ss.android.ugc.aweme.feed.guide.d.a() && this.j != null) {
            this.j.a("tryShowEnterMusicGuide", (Object) Boolean.TRUE);
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40751, new Class[0], Void.TYPE);
        } else {
            if (!com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40756, new Class[0], Boolean.TYPE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40756, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z4 = com.ss.android.ugc.aweme.account.d.a().isLogin() && aa();
                }
                if (z4) {
                    if (L()) {
                        User curUser2 = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                        if (curUser2.getDouplusToastStruct() != null) {
                            if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40071, new Class[0], Integer.TYPE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40071, new Class[0], Integer.TYPE)).intValue();
                            } else {
                                i2 = com.ss.android.ugc.aweme.base.sharedpref.e.d().a(String.format("dou_self_active_id_%s", new Object[]{com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid()}), 0);
                            }
                            int id = curUser2.getDouplusToastStruct().getId();
                            String toast = curUser2.getDouplusToastStruct().getToast();
                            if (id == i2 || TextUtils.isEmpty(toast)) {
                                ai();
                            } else {
                                h(toast);
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(id)}, null, y.f47065a, true, 40069, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(id)}, null, y.f47065a, true, 40069, new Class[]{Integer.TYPE}, Void.TYPE);
                                    i3 = 0;
                                } else {
                                    i3 = 0;
                                    com.ss.android.ugc.aweme.base.sharedpref.e.d().b(String.format("dou_self_active_id_%s", new Object[]{com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid()}), id);
                                }
                                if (PatchProxy.isSupport(new Object[i3], null, y.f47065a, true, 40070, new Class[i3], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[i3], null, y.f47065a, true, 40070, new Class[i3], Void.TYPE);
                                } else {
                                    com.ss.android.ugc.aweme.base.sharedpref.e.d().b("dou_self_show_active_toast_time", System.currentTimeMillis());
                                }
                            }
                        } else {
                            ai();
                        }
                    } else {
                        User user = com.ss.android.ugc.aweme.profile.i.f61546a;
                        if (user != null && user.isStar()) {
                            if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40072, new Class[0], Boolean.TYPE)) {
                                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40072, new Class[0], Boolean.TYPE)).booleanValue();
                            } else {
                                com.ss.android.ugc.aweme.base.sharedpref.f d8 = com.ss.android.ugc.aweme.base.sharedpref.e.d();
                                z5 = d8.a(String.format("dou_other_profile_show_pop_count_%s", new Object[]{com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid()}), 0) < 3 && !aw.a(d8.a("dou_other_profile_show_pop_time", 0));
                            }
                            if (z5) {
                                h(this.f44820e.getString(C0906R.string.c87));
                                if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40073, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40073, new Class[0], Void.TYPE);
                                    i = 0;
                                } else {
                                    com.ss.android.ugc.aweme.base.sharedpref.f d9 = com.ss.android.ugc.aweme.base.sharedpref.e.d();
                                    i = 0;
                                    String format = String.format("dou_other_profile_show_pop_count_%s", new Object[]{com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid()});
                                    d9.b(format, d9.a(format, 0) + 1);
                                }
                                if (PatchProxy.isSupport(new Object[i], null, y.f47065a, true, 40074, new Class[i], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[i], null, y.f47065a, true, 40074, new Class[i], Void.TYPE);
                                } else {
                                    com.ss.android.ugc.aweme.base.sharedpref.e.d().b("dou_other_profile_show_pop_time", System.currentTimeMillis());
                                }
                            }
                        }
                    }
                }
            }
            this.h = false;
        }
        g(true);
        if (this.j != null) {
            this.j.a("in_video_view_holder", (Object) Boolean.TRUE);
        }
        if (this.n.getActivity() != null && this.M == 0 && MainPageExperimentHelper.d() && TextUtils.equals(O(), "homepage_follow")) {
            FollowPageFirstFrameViewModel.a(this.n.getActivity()).d();
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40809, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (com.ss.android.ugc.aweme.global.config.settings.g.b().bK().intValue() == 1 && !o.v()) {
                int q2 = o.b().q();
                int r2 = o.b().r();
                if (q2 > 0 && r2 > 0 && this.f44821f != null && this.f44821f.getVideo() != null && this.f44821f.getVideo().getWidth() > 0 && this.f44821f.getVideo().getHeight() > 0 && com.ss.android.ugc.aweme.feed.g.b.a(this.f44821f.getVideo().getWidth(), this.f44821f.getVideo().getHeight(), q2, r2)) {
                    this.f44821f.getVideo().setWidth(q2);
                    this.f44821f.getVideo().setHeight(r2);
                    UrlModel originCover = this.f44821f.getVideo().getOriginCover();
                    if (originCover != null) {
                        originCover.setWidth(q2);
                        originCover.setHeight(r2);
                    }
                    this.Q.a(this.f44820e, this.f44821f.getVideo(), x(), (View) this.mCoverView);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44817b, false, 40810, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44817b, false, 40810, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.R = true;
        if (!(N() instanceof com.ss.android.ugc.aweme.splash.a) || !((com.ss.android.ugc.aweme.splash.a) N()).isSplashShowing()) {
            g(0);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40811, new Class[0], Void.TYPE);
            return;
        }
        this.R = false;
        if (ab() && !o.v()) {
            o b2 = o.b();
            if (PatchProxy.isSupport(new Object[]{null}, b2, o.f76178a, false, 88995, new Class[]{Surface.class}, Void.TYPE)) {
                o oVar = b2;
                PatchProxy.accessDispatch(new Object[]{null}, oVar, o.f76178a, false, 88995, new Class[]{Surface.class}, Void.TYPE);
                return;
            }
            b2.f76182e.b((Surface) null);
        }
    }

    public final void a(Video video, boolean z2, int i) {
        Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{video2, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i)}, this, f44817b, false, 40812, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, Byte.valueOf(z2), Integer.valueOf(i)}, this, f44817b, false, 40812, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.x != null) {
            boolean z3 = z2;
            this.x.a(video, z2, i);
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f44817b, false, 40824, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f44817b, false, 40824, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.a(aVar);
        }
    }

    private boolean aa() {
        return this.X.isFromPostList;
    }

    private boolean ao() {
        return this.f44820e instanceof MainActivity;
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        return this.X.isMyProfile;
    }

    public final String O() {
        if (this.X.eventType == null) {
            return "";
        }
        return this.X.eventType;
    }

    private boolean ab() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40703, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40703, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.w.g() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private void ad() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40729, new Class[0], Void.TYPE);
            return;
        }
        this.m = a(this.f44821f, this.X, this.l);
        this.P.p = this.m;
        this.aa.setRequestId(this.m);
    }

    private void ae() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40735, new Class[0], Void.TYPE);
            return;
        }
        if (x().getVisibility() == 0) {
            v.a(x(), 8);
        }
        v.a(x(), 0);
    }

    private boolean af() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40736, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40736, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f44821f != null && this.f44821f.isAd()) {
            z2 = true;
        }
        return z2;
    }

    private void ag() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40743, new Class[0], Void.TYPE);
            return;
        }
        this.mCoverView.setVisibility(8);
    }

    private void ah() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40744, new Class[0], Void.TYPE);
            return;
        }
        this.mCoverView.setVisibility(0);
    }

    private void al() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40768, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("pausePlayAnimation", (Object) Boolean.TRUE);
        }
    }

    private void am() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40771, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("stopPlayAnimation", (Object) Boolean.TRUE);
        }
        this.P.j();
    }

    private void an() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40797, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("tryDismissEnterMusicGuide", (Object) Boolean.TRUE);
        }
    }

    private void aq() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40836, new Class[0], Void.TYPE);
            return;
        }
        if (this.poiCardWebPageContainer.getChildCount() > 0) {
            this.poiCardWebPageContainer.a(0);
        }
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40801, new Class[0], Void.TYPE);
            return;
        }
        ak();
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40840, new Class[0], Void.TYPE);
            return;
        }
        if (this.z != null) {
            this.z.b();
        }
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40781, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("video_show_flip_share_drawable", (Object) null);
        }
    }

    public final void J() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40839, new Class[0], Void.TYPE);
            return;
        }
        if (this.R) {
            g(0);
        }
    }

    public final void K() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40752, new Class[0], Void.TYPE);
            return;
        }
        if (this.U != null) {
            this.U.f();
        }
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40813, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.P();
        }
    }

    public final void Q() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40814, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.Q();
        }
    }

    public final void R() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40815, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.R();
        }
    }

    public final void S() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40816, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.S();
        }
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40818, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.T();
        }
    }

    public final void U() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40819, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.U();
        }
    }

    public final long V() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40823, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40823, new Class[0], Long.TYPE)).longValue();
        } else if (this.x != null) {
            return this.x.V();
        } else {
            return 0;
        }
    }

    public final void W() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40827, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.W();
        }
    }

    public final IPlayer.e X() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40828, new Class[0], IPlayer.e.class)) {
            return (IPlayer.e) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40828, new Class[0], IPlayer.e.class);
        } else if (this.x != null) {
            return this.x.X();
        } else {
            return null;
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40788, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40788, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f44821f != null) {
            return this.f44821f.getAwemeType();
        } else {
            return 0;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40784, new Class[0], Void.TYPE);
            return;
        }
        K();
        this.j.a("video_on_pause", (Object) null);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40719, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("stopPlayAnimation", (Object) Boolean.TRUE);
        }
        f(false);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40712, new Class[0], Void.TYPE);
            return;
        }
        if (!this.K) {
            b();
            this.K = true;
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40720, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.j.a.a.a(this.f44821f, this.mXiguaTaskEveningIv, O(), this.f44820e);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40780, new Class[0], Void.TYPE);
            return;
        }
        this.j.a("video_show_share_guide_animation", (Object) null);
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40700, new Class[0], Void.TYPE);
            return;
        }
        this.w.a((i) this);
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40702, new Class[0], Void.TYPE);
            return;
        }
        if (ab()) {
            this.w.a().setVisibility(8);
        }
    }

    public final boolean v() {
        if (!PatchProxy.isSupport(new Object[0], this, f44817b, false, 40773, new Class[0], Boolean.TYPE)) {
            return this.w.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40773, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void v_() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40787, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44821f != null) {
            this.mRestrictTextView.a(this.f44821f.getAid());
        }
    }

    public final Surface w() {
        if (!PatchProxy.isSupport(new Object[0], this, f44817b, false, 40772, new Class[0], Surface.class)) {
            return this.w.b();
        }
        return (Surface) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40772, new Class[0], Surface.class);
    }

    public final View x() {
        if (!PatchProxy.isSupport(new Object[0], this, f44817b, false, 40796, new Class[0], View.class)) {
            return this.w.a();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40796, new Class[0], View.class);
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40762, new Class[0], Void.TYPE);
            return;
        }
        ak();
        this.P.k();
    }

    private void ac() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40716, new Class[0], Void.TYPE);
            return;
        }
        new a.C0734a().a(this.f44821f).a(this.U.e()).a().a(N());
    }

    private boolean aj() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40753, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40753, new Class[0], Boolean.TYPE)).booleanValue();
        }
        K();
        if (this.f44819d != null) {
            com.ss.android.b.a.a.a.c(this.f44819d);
            this.f44819d = null;
            return true;
        } else if (this.f44818c == null) {
            return false;
        } else {
            this.f44818c.dismiss();
            this.f44818c = null;
            return true;
        }
    }

    private void ap() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40834, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.poiCardWebPageContainer.getLayoutParams();
        if (marginLayoutParams.bottomMargin != n.a(this.f44820e)) {
            marginLayoutParams.bottomMargin = n.a(this.f44820e);
            this.poiCardWebPageContainer.setLayoutParams(marginLayoutParams);
        }
    }

    private boolean ar() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40837, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40837, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f44821f == null || this.f44821f.getPoiStruct() == null || this.f44821f.getPoiStruct().getPoiCard() == null || "poi_page".equalsIgnoreCase(O()) || !com.ss.android.ugc.aweme.commercialize.link.f.a("poi", this.f44821f)) {
            return false;
        } else {
            PoiStruct poiStruct = this.f44821f.getPoiStruct();
            com.ss.android.ugc.aweme.poi.model.m poiCard = poiStruct.getPoiCard();
            if (!com.ss.android.ugc.aweme.poi.e.e.a(O(), poiStruct)) {
                return false;
            }
            if (!TextUtils.isEmpty(poiCard.getUrl())) {
                z2 = true;
            }
            return z2;
        }
    }

    private boolean as() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40842, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40842, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.main.a.a().f54286b || (((this.n instanceof FeedFollowFragment) && com.ss.android.ugc.aweme.main.a.a().f54287c) || CleanModeManager2.b(N()))) {
            return true;
        } else {
            return false;
        }
    }

    public final int[] F() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40777, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40777, new Class[0], int[].class);
        } else if (this.f44821f == null || this.f44821f.getAuthor() == null || this.f44821f.getAuthor().getFollowStatus() != 0) {
            return null;
        } else {
            int[] iArr = new int[2];
            View findViewById = this.mAvatarLayout.findViewById(C0906R.id.agq);
            if (findViewById == null) {
                return null;
            }
            findViewById.getLocationOnScreen(iArr);
            return iArr;
        }
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40845, new Class[0], Void.TYPE);
            return;
        }
        an();
        aj();
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40754, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.dismiss();
            this.I = null;
        }
    }

    public final boolean M() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40713, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40713, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!o.v()) {
            return o.b().a();
        } else {
            return com.ss.android.ugc.playerkit.videoview.a.a().b();
        }
    }

    public final long Y() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40848, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40848, new Class[0], Long.TYPE)).longValue();
        } else if (!o.v()) {
            return o.b().c();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40822, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40822, new Class[0], Long.TYPE)).longValue();
            } else if (this.x != null) {
                return this.x.b();
            } else {
                return 0;
            }
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40783, new Class[0], Void.TYPE);
            return;
        }
        E();
    }

    private void ak() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40763, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("startPlayAnimation", (Object) Boolean.TRUE);
        }
        if (this.z != null) {
            this.z.b();
            return;
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.f44821f) && !com.ss.android.ugc.aweme.commercialize.utils.c.R(this.f44821f)) {
            h(2);
            if (this.s == null || !this.s.isRunning()) {
                this.s = new AnimatorSet();
                this.s.play(ObjectAnimator.ofFloat(this.mGradualBottomView, "alpha", new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.mWidgetContainer, "alpha", new float[]{0.0f, 1.0f}));
                this.s.setStartDelay(260);
                this.s.setDuration(430);
                this.s.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44831a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f44831a, false, 40860, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f44831a, false, 40860, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        if (VideoViewHolder.this.r) {
                            VideoViewHolder.this.h(4);
                        }
                    }
                });
            }
            if (this.S == null || this.S.f44834b) {
                this.S = new a(this.f44821f);
                this.mRootView.postDelayed(this.S, (long) com.ss.android.ugc.aweme.commercialize.utils.c.T(this.f44821f));
            }
        } else if ((this.f44820e instanceof MainActivity) && !this.L) {
            a((View) this.mWidgetContainer, as());
        }
    }

    private void at() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40847, new Class[0], Void.TYPE);
            return;
        }
        if (!this.v) {
            if (com.ss.android.ugc.aweme.profile.a.a().l && (!com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.f44821f) || com.ss.android.ugc.aweme.commercialize.utils.c.R(this.f44821f) || com.ss.android.ugc.aweme.commercialize.splash.a.a().l)) {
                i = -com.ss.android.ugc.aweme.profile.a.a().b();
            }
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                i += com.ss.android.ugc.aweme.profile.a.f61216b;
            }
            bg.a(new com.ss.android.ugc.aweme.feed.f.c(!com.ss.android.ugc.aweme.profile.a.a().l));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWidgetContainer.getLayoutParams();
            layoutParams.bottomMargin = i;
            this.mWidgetContainer.setLayoutParams(layoutParams);
            a(com.ss.android.ugc.aweme.profile.a.a().n, com.ss.android.ugc.aweme.profile.a.a().o);
            ap();
        }
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40846, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.c.c cVar = this.o;
        if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40959, new Class[0], Void.TYPE);
            return;
        }
        if (!(cVar.f45089e == null || cVar.f45089e.getFloatingCardInfo() == null || cVar.f45089e.isAd())) {
            if (PatchProxy.isSupport(new Object[]{200L}, cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40960, new Class[]{Long.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.feed.c.c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{200L}, cVar2, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40960, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if (cVar.f45087c.getVisibility() != 0) {
                cVar.f45087c.setVisibility(0);
            }
            cVar.f45088d.animate().translationX((float) (-v.b((View) cVar.f45088d).right)).alpha(0.0f).setDuration(200).withEndAction(new h(cVar, 200)).start();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40758, new Class[0], Void.TYPE);
            return;
        }
        if (this.mWidgetContainer != null) {
            at();
            this.Q.a(this.f44820e, this.f44821f.getVideo(), x(), (View) this.mCoverView);
            if (this.f44821f.getVideo() != null) {
                this.Q.a(this.f44820e, this.f44821f.getVideo(), (View) this.flInteractLayout);
            }
            CommerceVideoDelegate commerceVideoDelegate = this.P;
            if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30636, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30636, new Class[0], Void.TYPE);
            } else if (commerceVideoDelegate.f38689f != null) {
                commerceVideoDelegate.d();
                commerceVideoDelegate.f();
                if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30656, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30656, new Class[0], Void.TYPE);
                    return;
                }
                commerceVideoDelegate.u.a();
            }
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40701, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40764, new Class[0], Void.TYPE);
            return;
        }
        if (ab()) {
            ae();
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40765, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40765, new Class[0], Void.TYPE);
                return;
            }
            WeakContainer weakContainer = V.get(this.f44820e);
            if (weakContainer != null) {
                View x2 = x();
                Iterator it2 = weakContainer.iterator();
                while (it2.hasNext()) {
                    SurfaceView surfaceView = (SurfaceView) it2.next();
                    if (surfaceView != x2) {
                        v.a((View) surfaceView, 8);
                    }
                }
            }
            WeakContainer weakContainer2 = W.get(this.f44820e);
            if (weakContainer2 != null) {
                Iterator it3 = weakContainer2.iterator();
                while (it3.hasNext()) {
                    VideoViewHolder videoViewHolder = (VideoViewHolder) it3.next();
                    if (videoViewHolder != this && ((videoViewHolder.M == this.M - 1 || videoViewHolder.M == this.M + 1) && videoViewHolder.f44821f != null)) {
                        videoViewHolder.b(videoViewHolder.f44821f.getVideo());
                    }
                }
            }
        }
    }

    private void ai() {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40748, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.feed.guide.d.a()) {
            this.h = false;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40757, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40757, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (aa() && L() && this.f44821f.getAuthor() != null && TextUtils.equals(this.f44821f.getAuthor().getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId()) && com.ss.android.ugc.aweme.commercialize.utils.c.f(this.f44821f)) {
                    if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40068, new Class[0], Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40068, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        com.ss.android.ugc.aweme.base.sharedpref.f d2 = com.ss.android.ugc.aweme.base.sharedpref.e.d();
                        int a2 = d2.a("show_dou_pop_count", 0);
                        long a3 = d2.a("last_show_dou_pop_time", 0);
                        long a4 = d2.a("dou_self_show_active_toast_time", 0);
                        if (a2 >= 3 || aw.a(a3) || aw.a(a4)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                    if (z3 && !TimeLockRuler.isContentFilterOn()) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (!z2) {
                this.h = false;
                return;
            }
            h(this.f44820e.getString(C0906R.string.c88));
            if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40067, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40067, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.base.sharedpref.f d3 = com.ss.android.ugc.aweme.base.sharedpref.e.d();
                d3.b("show_dou_pop_count", d3.a("show_dou_pop_count", 0) + 1);
            }
            if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40066, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40066, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.base.sharedpref.e.d().b("last_show_dou_pop_time", System.currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Z() {
        PoiCardWebPageContainer poiCardWebPageContainer2 = this.poiCardWebPageContainer;
        if (PatchProxy.isSupport(new Object[]{400L}, poiCardWebPageContainer2, PoiCardWebPageContainer.f2781a, false, 25089, new Class[]{Long.TYPE}, Void.TYPE)) {
            PoiCardWebPageContainer poiCardWebPageContainer3 = poiCardWebPageContainer2;
            PatchProxy.accessDispatch(new Object[]{400L}, poiCardWebPageContainer3, PoiCardWebPageContainer.f2781a, false, 25089, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (poiCardWebPageContainer2.f2782b) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) poiCardWebPageContainer2.getLayoutParams();
            layoutParams.height = (int) UIUtils.dip2Px(poiCardWebPageContainer2.getContext(), 130.0f);
            poiCardWebPageContainer2.setLayoutParams(layoutParams);
            if (com.ss.android.ugc.aweme.main.a.a().f54286b) {
                poiCardWebPageContainer2.setAlpha(0.0f);
                poiCardWebPageContainer2.setTranslationX(0.0f);
            } else {
                poiCardWebPageContainer2.a(400, UIUtils.dip2Px(poiCardWebPageContainer2.getContext(), (float) (-(poiCardWebPageContainer2.getWidth() + ((ViewGroup.MarginLayoutParams) poiCardWebPageContainer2.getLayoutParams()).leftMargin))), 0.0f, 0.0f, 0.0f, new AnimatorListenerAdapter() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f34979a;

                    public final void onAnimationStart(
/*
Method generation error in method: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.3.onAnimationStart(android.animation.Animator):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer.3.onAnimationStart(android.animation.Animator):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                });
                poiCardWebPageContainer2.animate().alpha(1.0f).setDuration(400).start();
            }
            if (PatchProxy.isSupport(new Object[0], poiCardWebPageContainer2, PoiCardWebPageContainer.f2781a, false, 25094, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiCardWebPageContainer2, PoiCardWebPageContainer.f2781a, false, 25094, new Class[0], Void.TYPE);
                return;
            }
            r.a("poi_ad_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_hot").a("group_id", poiCardWebPageContainer2.f2783c.getAid()).a("author_id", poiCardWebPageContainer2.f2783c.getAuthorUid()).a("poi_id", poiCardWebPageContainer2.f2783c.getPoiStruct().poiId).a("poi_label_type", poiCardWebPageContainer2.f2783c.getPoiStruct().getPoiSubTitleType()).f34114b);
        }
    }

    public final void t_() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40844, new Class[0], Void.TYPE);
            return;
        }
        super.t_();
        if (com.ss.android.ugc.aweme.feed.k.b.a(this.f44821f)) {
            com.ss.android.ugc.aweme.commerce.b.a.a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40798, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            this.j.a("tryDestroyEnterMusicGuide", (Object) Boolean.TRUE);
        }
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40755, new Class[0], Void.TYPE);
        } else {
            if (this.f44819d != null) {
                com.ss.android.b.a.a.a.c(this.f44819d);
                this.f44819d = null;
            }
            if (this.f44818c != null) {
                this.f44818c.b();
                this.f44818c = null;
            }
        }
        CommerceVideoDelegate commerceVideoDelegate = this.P;
        if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30660, new Class[0], Void.TYPE);
        } else {
            commerceVideoDelegate.oldAdBottomLabelView.o();
            commerceVideoDelegate.newAdBottomLabelView.o();
        }
        if (this.U != null) {
            InteractStickerWidget interactStickerWidget = this.U;
            if (PatchProxy.isSupport(new Object[0], interactStickerWidget, InteractStickerWidget.k, false, 79769, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], interactStickerWidget, InteractStickerWidget.k, false, 79769, new Class[0], Void.TYPE);
                return;
            }
            for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b bVar : interactStickerWidget.m) {
                bVar.f69893d.b(bVar.f69893d.c());
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40786, new Class[0], Void.TYPE);
            return;
        }
        this.r = false;
        com.ss.android.ugc.aweme.commercialize.splash.a.a().l = true;
        CommerceVideoDelegate commerceVideoDelegate = this.P;
        if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30635, new Class[0], Void.TYPE);
        } else {
            if (com.ss.android.ugc.aweme.commercialize.symphony.g.c() == commerceVideoDelegate.s) {
                com.ss.android.ugc.aweme.commercialize.symphony.g.a(null);
            }
            commerceVideoDelegate.e();
            if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30647, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30647, new Class[0], Void.TYPE);
            } else {
                commerceVideoDelegate.introContainer.setVisibility(0);
                CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = commerceVideoDelegate.commerceGoodHalfCardContainer;
                if (PatchProxy.isSupport(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28026, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28026, new Class[0], Void.TYPE);
                } else {
                    if (commerceGoodHalfCardContainer.f36813e != null && !commerceGoodHalfCardContainer.f36813e.isDisposed()) {
                        commerceGoodHalfCardContainer.f36813e.dispose();
                    }
                    if (commerceGoodHalfCardContainer.getChildCount() != 0) {
                        commerceGoodHalfCardContainer.removeAllViews();
                    }
                    if (commerceGoodHalfCardContainer.k) {
                        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30271, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30271, new Class[0], Void.TYPE);
                        } else {
                            ICommerceService a2 = com.ss.android.ugc.aweme.commercialize.g.a();
                            if (a2 != null) {
                                a2.onCommerceCardRelease();
                            }
                        }
                    }
                }
            }
            commerceVideoDelegate.h();
            commerceVideoDelegate.a(commerceVideoDelegate.q.getChildFragmentManager(), false, commerceVideoDelegate.h);
            commerceVideoDelegate.a(false);
            commerceVideoDelegate.diggLayout.a();
            if (commerceVideoDelegate.t != null) {
                CommerceVideoDelegate.b bVar = commerceVideoDelegate.t;
                if (PatchProxy.isSupport(new Object[0], bVar, CommerceVideoDelegate.b.f38712a, false, 30742, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, CommerceVideoDelegate.b.f38712a, false, 30742, new Class[0], Void.TYPE);
                } else {
                    bVar.f38713b.removeCallbacks(bVar);
                }
            }
            if (commerceVideoDelegate.a(commerceVideoDelegate.mLinkTag, commerceVideoDelegate.f38688e)) {
                CommerceTagLayout commerceTagLayout = commerceVideoDelegate.mLinkTag;
                if (PatchProxy.isSupport(new Object[0], commerceTagLayout, CommerceTagLayout.f38982a, false, 30911, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], commerceTagLayout, CommerceTagLayout.f38982a, false, 30911, new Class[0], Void.TYPE);
                } else if (commerceTagLayout.f38983b != null) {
                    commerceTagLayout.f38983b.b();
                }
            }
            com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e.a();
            x.c();
        }
        com.ss.android.ugc.aweme.feed.c.c cVar = this.o;
        long j = 0;
        if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.feed.c.c.f45085a, false, 40962, new Class[0], Void.TYPE);
        } else if (!(cVar.f45089e == null || cVar.f45089e.getFloatingCardInfo() == null)) {
            cVar.a(0);
        }
        this.B = false;
        if (TextUtils.equals(O(), "homepage_hot")) {
            if (this.E) {
                this.D += System.currentTimeMillis() - this.C;
                this.E = false;
            }
            if (this.F && this.H > 0) {
                this.G += System.currentTimeMillis() - this.H;
                this.F = false;
            }
            if (this.A > 0) {
                j = ((System.currentTimeMillis() - this.A) - this.D) - this.G;
            }
            String aid = this.f44821f.getAid();
            if (PatchProxy.isSupport(new Object[]{aid, new Long(j)}, null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40263, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aid, new Long(j)}, null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40263, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.feed.ar.b()) {
                if (((long) com.ss.android.ugc.aweme.feed.ar.f45069c.t) <= j) {
                    if (com.ss.android.ugc.aweme.feed.ar.i.contains(aid)) {
                        com.ss.android.ugc.aweme.feed.ar.f45070d--;
                    } else {
                        com.ss.android.ugc.aweme.feed.ar.i.add(aid);
                    }
                    com.ss.android.ugc.aweme.feed.ar.f45071e = 0;
                } else if (com.ss.android.ugc.aweme.feed.ar.i.contains(aid)) {
                    com.ss.android.ugc.aweme.feed.ar.f45071e = 0;
                    com.ss.android.ugc.aweme.feed.ar.f45070d--;
                } else {
                    com.ss.android.ugc.aweme.feed.ar.i.add(aid);
                    com.ss.android.ugc.aweme.feed.ar.f45071e++;
                }
                if (com.ss.android.ugc.aweme.feed.ar.f45071e == 1) {
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40265, new Class[0], Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40265, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (!com.ss.android.ugc.aweme.feed.ar.f45072f || com.ss.android.ugc.aweme.feed.ar.j == null || com.ss.android.ugc.aweme.feed.ar.j.d()) {
                        com.ss.android.ugc.aweme.feed.ar.f45072f = true;
                        com.ss.android.ugc.aweme.feed.ar.j = UserPreferApi.a(0);
                    } else {
                        com.ss.android.ugc.aweme.feed.ar.f45072f = false;
                    }
                }
            }
        }
        if (this.z != null) {
            bd bdVar = this.z;
            if (PatchProxy.isSupport(new Object[0], bdVar, bd.f46566a, false, 43103, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bdVar, bd.f46566a, false, 43103, new Class[0], Void.TYPE);
            } else {
                bdVar.i.removeMessages(3);
                if (bdVar.k != null) {
                    bdVar.k.cancel();
                    bdVar.k = null;
                }
            }
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40270, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.feed.ar.f45067a, true, 40270, new Class[0], Void.TYPE);
            } else {
                r.a("preference_exit", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            }
            if (this.f44820e instanceof MainActivity) {
                ((MainActivity) this.f44820e).setCanScroll(true);
            }
        }
        if (com.ss.android.ugc.aweme.feed.k.b.a(this.f44821f)) {
            com.ss.android.ugc.aweme.commerce.b.a.a();
            x();
        }
        this.j.a("on_page_unselected", (Object) Boolean.TRUE);
        am();
        if (this.f44821f != null && this.f44821f.isAppAd()) {
            com.ss.android.ugc.aweme.app.c.a.c.a().a(this.f44821f.getAwemeRawAd().getDownloadUrl());
        }
        aq();
        bg.a(new com.ss.android.ugc.aweme.comment.b.b(this.f44821f.getAid()));
        g(false);
        if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.f44821f)) {
            h(4);
        }
        if (this.S != null) {
            this.S.f44834b = true;
            this.S = null;
        }
        if (this.s != null) {
            this.s.cancel();
            this.s = null;
        }
        com.ss.android.ugc.aweme.commercialize.utils.o.a(this.tagLayout);
        W();
        com.ss.android.ugc.aweme.commercialize.splash.h.f2934d = false;
    }

    @SuppressLint({"SetTextI18n"})
    public void b() {
        int i;
        int i2;
        boolean z2;
        Object[] objArr;
        Context context;
        TextView textView;
        String str;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40725, new Class[0], Void.TYPE);
            return;
        }
        boolean a2 = com.ss.android.g.a.a();
        Video video = this.f44821f.getVideo();
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40737, new Class[0], Void.TYPE);
        } else {
            this.mShareTipImageView.setVisibility(8);
        }
        if (this.j != null) {
            this.j.a("video_params", (Object) this.aa);
        }
        b(video);
        User author = this.f44821f.getAuthor();
        if (a2 && am.a(this.f44821f, true) && am.a(this.f44821f, 3) && this.f44821f.getAwemeRawAd().getOmVast().vast != null && !TextUtils.isEmpty(this.f44821f.getAwemeRawAd().getOmVast().vast.adTitle)) {
            this.mTitleView.setText(this.f44820e.getString(C0906R.string.ae_, new Object[]{this.f44821f.getAwemeRawAd().getOmVast().vast.adTitle}));
        } else if (author != null) {
            if (author.isMe()) {
                author.roomId = com.ss.android.ugc.aweme.account.d.a().getCurUser().roomId;
            }
            if (!a2) {
                textView = this.mTitleView;
                context = this.f44820e;
                objArr = new Object[1];
                if (!TextUtils.isEmpty(author.getRemarkName())) {
                    str = author.getRemarkName();
                    objArr[0] = str;
                    textView.setText(context.getString(C0906R.string.ae_, objArr));
                    this.mTitleView.getPaint().setFakeBoldText(true);
                }
            } else if (this.f44821f == null || this.f44821f.isCanPlay() || com.ss.android.ugc.aweme.login.utils.a.a(this.f44821f)) {
                this.mTitleView.setVisibility(0);
                if (com.ss.android.g.a.b()) {
                    textView = this.mTitleView;
                    context = this.f44820e;
                    objArr = new Object[1];
                    str = ex.b(author);
                } else if (AbTestManager.a().m() == 1 || AbTestManager.a().m() == 5) {
                    textView = this.mTitleView;
                    context = this.f44820e;
                    objArr = new Object[1];
                    str = ex.b(author);
                } else {
                    textView = this.mTitleView;
                    context = this.f44820e;
                    objArr = new Object[1];
                }
                objArr[0] = str;
                textView.setText(context.getString(C0906R.string.ae_, objArr));
                this.mTitleView.getPaint().setFakeBoldText(true);
            } else {
                this.mTitleView.setVisibility(4);
                this.mTitleView.getPaint().setFakeBoldText(true);
            }
            str = author.getNickname();
            objArr[0] = str;
            textView.setText(context.getString(C0906R.string.ae_, objArr));
            this.mTitleView.getPaint().setFakeBoldText(true);
        } else {
            this.mTitleView.setText("");
        }
        if (this.f44821f == null || this.f44821f.isCanPlay() || com.ss.android.ugc.aweme.login.utils.a.a(this.f44821f)) {
            this.mTitleView.setVisibility(0);
        } else {
            this.mTitleView.setVisibility(4);
        }
        at();
        this.tagLayout.setEventType(O());
        List<AwemeLabelModel> videoLabels = this.f44821f.getVideoLabels();
        if (PatchProxy.isSupport(new Object[]{videoLabels}, this, f44817b, false, 40742, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoLabels}, this, f44817b, false, 40742, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(videoLabels)) {
            for (int i4 = 0; i4 < videoLabels.size(); i4++) {
                AwemeLabelModel awemeLabelModel = videoLabels.get(i4);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !com.ss.android.ugc.aweme.feed.k.b.b(this.f44821f) && this.f44821f.getStatus() != null && this.f44821f.isPrivate()) {
                    videoLabels.remove(awemeLabelModel);
                }
            }
        }
        if (this.f44821f.isAd() && !this.f44821f.getAwemeRawAd().isRightStyle()) {
            AwemeTextLabelModel label = this.f44821f.getAwemeRawAd().getLabel();
            if (label != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(label);
                this.f44821f.setTextVideoLabels(arrayList);
            }
        }
        if (!StringUtils.equal(O(), "homepage_hot") || af()) {
            if (af()) {
                Aweme aweme = this.f44821f;
                if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32262, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32262, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdTagPosition() != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    this.tagLayout.setVisibility(8);
                }
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.c.u(this.f44821f)) {
                this.tagLayout.a(this.f44821f, videoLabels, new TagLayout.a(7, 20));
            } else {
                this.tagLayout.b(this.f44821f, videoLabels, new TagLayout.a(7, 20));
            }
        } else {
            this.tagLayout.a(this.f44821f, videoLabels, new TagLayout.a(7, 20));
        }
        com.ss.android.ugc.aweme.commercialize.utils.o.a(this.tagLayout);
        if (this.f44821f.isRelieve()) {
            this.mIvRelieveTag.setAnimation("anti_addiction_tag.json");
            this.mIvRelieveTag.playAnimation();
            this.mIvRelieveTag.loop(true);
            this.mIvRelieveTag.setVisibility(0);
        } else if (this.mIvRelieveTag != null) {
            try {
                this.mIvRelieveTag.cancelAnimation();
            } catch (NullPointerException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
            this.mIvRelieveTag.setVisibility(8);
        }
        if (TextUtils.isEmpty(this.f44821f.getExtra())) {
            this.mDebugInfoView.setVisibility(8);
        } else {
            this.mDebugInfoView.setVisibility(0);
            this.mDebugInfoView.setContent(this.f44821f.getExtra());
        }
        if (((Boolean) SharePrefCache.inst().isOb().c()).booleanValue()) {
            this.mRestrictTextView.setVisibility(0);
            this.mRestrictTextView.a(this.f44821f.getAid());
        } else {
            this.mRestrictTextView.setVisibility(8);
        }
        if ((this.f44820e instanceof MainActivity) && !com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.f44821f)) {
            a(as());
        }
        if (af()) {
            this.feedReportVotell.setVisibility(8);
            this.feedReportWarnll.setVisibility(8);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40746, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40746, new Class[0], Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.report.b.b(this.f44821f) || this.f44821f.isHotSearchAweme()) {
                this.feedReportVotell.setVisibility(8);
            } else {
                this.feedReportVotell.setVisibility(0);
                int voteStatus = this.f44821f.getAwemeRiskModel().getVoteStatus();
                if (voteStatus == 1) {
                    i2 = C0906R.string.dsn;
                    this.mAllowDisplayBtn.setSelected(true);
                    this.mDisallowDisplayBtn.setSelected(false);
                } else if (voteStatus == 0) {
                    i2 = C0906R.string.dsp;
                    this.mDisallowDisplayBtn.setSelected(true);
                    this.mAllowDisplayBtn.setSelected(false);
                } else {
                    i2 = C0906R.string.dso;
                    this.mAllowDisplayBtn.setSelected(false);
                    this.mDisallowDisplayBtn.setSelected(false);
                }
                this.mVoteStatusTextView.setText(i2);
            }
            LinearLayout linearLayout = this.feedReportWarnll;
            if (!com.ss.android.ugc.aweme.report.b.a(this.f44821f) || com.ss.android.ugc.aweme.report.b.b(this.f44821f) || this.f44821f.isHotSearchAweme()) {
                i = 8;
            } else {
                i = 0;
            }
            linearLayout.setVisibility(i);
            Aweme aweme2 = this.f44821f;
            LinearLayout linearLayout2 = this.feedReportWarnll;
            if (PatchProxy.isSupport(new Object[]{aweme2, linearLayout2}, null, com.ss.android.ugc.aweme.report.b.f63553a, true, 70692, new Class[]{Aweme.class, LinearLayout.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2, linearLayout2}, null, com.ss.android.ugc.aweme.report.b.f63553a, true, 70692, new Class[]{Aweme.class, LinearLayout.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.report.b.a(aweme2)) {
                if (aweme2.getAwemeRiskModel().getType() == 1) {
                    linearLayout2.setBackground(com.ss.android.ugc.bytex.a.a.a.a(linearLayout2.getResources(), (int) C0906R.color.a2m));
                } else {
                    linearLayout2.setBackground(com.ss.android.ugc.bytex.a.a.a.a(linearLayout2.getResources(), (int) C0906R.color.a23));
                }
                TextView textView2 = (TextView) linearLayout2.findViewById(C0906R.id.dhq);
                textView2.setText(aweme2.getAwemeRiskModel().getContent());
                ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                if (textView2.getLineCount() > 1) {
                    layoutParams.height = (int) UIUtils.dip2Px(linearLayout2.getContext(), 64.0f);
                } else {
                    layoutParams.height = (int) UIUtils.dip2Px(linearLayout2.getContext(), 32.0f);
                }
                linearLayout2.setLayoutParams(layoutParams);
            }
        }
        AwemeStatus status = this.f44821f.getStatus();
        if (status == null) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else if (a2 || !status.isInReviewing()) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else {
            this.mAwemeInCheckLayout.setVisibility(0);
            this.mAwemeInCheckLayout.setOnTouchListener(ed.a(0.5f, 1.0f));
        }
        if (a2) {
            DmtTextView dmtTextView = this.mTxtProhibited;
            if (!com.ss.android.ugc.aweme.u.aa.p(this.f44821f) || !this.f44821f.isProhibited()) {
                i3 = 8;
            }
            dmtTextView.setVisibility(i3);
        }
    }

    public Aweme f(int i) {
        return this.f44821f;
    }

    private void h(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40749, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40749, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mRootView.post(new ad(this, str));
    }

    public final void a(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f44817b, false, 40817, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f44817b, false, 40817, new Class[]{Video.class}, Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.a(video);
        }
    }

    public final void a_(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44817b, false, 40761, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f44817b, false, 40761, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("video_resume_play", (Object) aweme);
        }
    }

    public final void b(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f44817b, false, 40825, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f44817b, false, 40825, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.b(aVar);
        }
    }

    private void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40799, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40799, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.p != null) {
            if (z2) {
                this.mHudView.setVisibility(0);
            } else {
                this.mHudView.setVisibility(8);
            }
            this.p.a(z2);
        }
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44817b, false, 40760, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f44817b, false, 40760, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (!(this.f44820e == null || aweme == null || this.j == null)) {
            this.j.a("handle_double_click", (Object) aweme);
        }
    }

    public final void c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44817b, false, 40843, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f44817b, false, 40843, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.f44821f != null && aweme != null && TextUtils.equals(this.f44821f.getAid(), aweme.getAid()) && this.j != null) {
            this.f44821f.setStatistics(aweme.getStatistics());
            this.j.a("awesome_update_data", (Object) this.aa);
        }
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40759, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40759, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = true;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWidgetContainer.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.mWidgetContainer.setLayoutParams(layoutParams);
        ((ViewGroup.MarginLayoutParams) this.mBottomView.getLayoutParams()).bottomMargin = i;
        this.mBottomView.requestLayout();
    }

    public final void f(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44817b, false, 40728, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f44817b, false, 40728, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.f(str);
        this.aa.setEnterMethodValue(str2);
        ad();
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f44817b, true, 40766, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f44817b, true, 40766, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        WeakContainer weakContainer = V.get(context2);
        if (weakContainer != null) {
            Iterator it2 = weakContainer.iterator();
            while (it2.hasNext()) {
                v.a((View) (SurfaceView) it2.next(), 8);
            }
        }
        WeakContainer weakContainer2 = W.get(context2);
        if (weakContainer2 != null) {
            Iterator it3 = weakContainer2.iterator();
            while (it3.hasNext()) {
                VideoViewHolder videoViewHolder = (VideoViewHolder) it3.next();
                if (videoViewHolder.f44821f != null) {
                    videoViewHolder.b(videoViewHolder.f44821f.getVideo());
                }
            }
        }
    }

    private void c(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f44817b, false, 40734, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f44817b, false, 40734, new Class[]{Video.class}, Void.TYPE);
        } else if (this.n.getActivity() == null || !com.ss.android.ugc.aweme.feed.g.f.b(this.n.getActivity()) || B() == null || !TextUtils.equals(B().getAid(), com.ss.android.ugc.aweme.feed.g.d.a().f45350c) || FeedSharePlayerViewModel.getViewModel(this.n.getActivity()).hasBindCover) {
            com.ss.android.ugc.aweme.base.c.a(this.mCoverView, video.getOriginCover(), (ControllerListener<ImageInfo>) new b<ImageInfo>(new WeakReference(this.mCoverView)));
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a("VideoViewHolder.bind", "show transparent cover for continue play aweme, original aweme id = " + B().getAid());
            RemoteImageView remoteImageView = this.mCoverView;
            remoteImageView.setImageURI(Uri.parse("res://" + this.f44820e.getPackageName() + "/2130840612"));
            FeedSharePlayerViewModel.getViewModel(this.n.getActivity()).hasBindCover = true;
        }
    }

    private void g(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40747, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40747, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a("tryDismissEnterMusicGuide", (Object) Boolean.TRUE);
        }
        if (this.j != null) {
            this.j.a("dismiss_dou_pop", (Object) Boolean.TRUE);
        }
        com.ss.android.ugc.aweme.feed.f.aj ajVar = new com.ss.android.ugc.aweme.feed.f.aj(this.f44820e.hashCode());
        if (!TextUtils.isEmpty(str)) {
            ajVar.f45287b = str;
        }
        bg.a(ajVar);
        bg.a(new ah(O(), ao()));
        if (((Integer) SharePrefCache.inst().getScrollToProfileGuideState().c()).intValue() == 0) {
            SharePrefCache.inst().getScrollToProfileGuideState().a(1);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40804, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40804, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.P.k();
        this.F = false;
        if (this.H > 0) {
            this.G += System.currentTimeMillis() - this.H;
            this.H = 0;
        }
        ag();
        if (this.j != null) {
            this.j.a("in_video_view_holder", (Object) Boolean.TRUE);
        }
    }

    public final void d(boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40778, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40778, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.P;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30637, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            CommerceVideoDelegate commerceVideoDelegate2 = commerceVideoDelegate;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, commerceVideoDelegate2, CommerceVideoDelegate.f38685b, false, 30637, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            if (z3) {
                com.ss.android.ugc.aweme.shortvideo.util.an.a(commerceVideoDelegate.mBottomView, commerceVideoDelegate.mBottomView.getAlpha(), 0.0f);
            } else {
                com.ss.android.ugc.aweme.shortvideo.util.an.a(commerceVideoDelegate.mBottomView, commerceVideoDelegate.mBottomView.getAlpha(), 1.0f);
            }
            commerceVideoDelegate.adHalfWebPageContainer.setInCleanMode(z3);
            commerceVideoDelegate.commerceGoodHalfCardContainer.setInCleanMode(z3);
            commerceVideoDelegate.g.a(z3, commerceVideoDelegate.f38688e);
        }
        this.poiCardWebPageContainer.a(z3);
        if (z3) {
            this.mWidgetContainer.animate().alpha(0.0f).setDuration(200).start();
            this.L = true;
            return;
        }
        this.mWidgetContainer.animate().alpha(1.0f).setDuration(200).start();
        if (this.L) {
            this.L = false;
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40806, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40806, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.n instanceof FeedRecommendFragment) {
            bg.a(new com.ss.android.ugc.aweme.feed.f.a(0));
        }
        CommerceVideoDelegate commerceVideoDelegate = this.P;
        if (PatchProxy.isSupport(new Object[]{str}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30682, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30682, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.utils.b.b bVar = com.ss.android.ugc.aweme.commercialize.utils.b.b.f39771e;
        if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a, false, 32725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.commercialize.utils.b.b.f39767a, false, 32725, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.utils.b.b.f39769c++;
        if (com.ss.android.ugc.aweme.commercialize.utils.b.b.f39768b.isEmpty()) {
            com.ss.android.ugc.aweme.commercialize.utils.b.b.f39770d.a();
        }
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40789, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40789, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.O = z2;
        if (this.O) {
            this.w.e();
        } else {
            this.w.f();
        }
    }

    public final void h(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40841, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40841, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.T == 4 || this.T <= i) {
            AwesomeSplashEvent.a(i, this.f44821f);
            com.ss.android.ugc.aweme.commercialize.splash.d.a(i, this.mGradualBottomView, this.flInteractLayout);
        }
    }

    private void b(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f44817b, false, 40732, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f44817b, false, 40732, new Class[]{Video.class}, Void.TYPE);
        } else if (am.a(this.f44821f, 3)) {
            this.Q.a(this.f44820e, this.f44821f, x(), (View) this.mCoverView);
            if (this.f44821f.getVideo() != null) {
                this.Q.a(this.f44820e, this.f44821f.getVideo(), (View) this.flInteractLayout);
            }
            ah();
            RemoteImageView remoteImageView = this.mCoverView;
            remoteImageView.setImageURI(Uri.parse("res://" + this.f44820e.getPackageName() + "/2131624964"));
        } else if (video == null || video.getPlayAddr() == null || CollectionUtils.isEmpty(video.getPlayAddr().getUrlList()) || !a(video.getOriginCover())) {
            RemoteImageView remoteImageView2 = this.mCoverView;
            remoteImageView2.setImageURI(Uri.parse("res://" + this.f44820e.getPackageName() + "/2130840612"));
        } else {
            this.Q.a(this.f44820e, this.f44821f, x(), (View) this.mCoverView);
            this.Q.a(this.f44820e, this.f44821f.getVideo(), (View) this.flInteractLayout);
            ah();
            if (!com.ss.android.g.a.b()) {
                if (((float) video.getHeight()) < UIUtils.dip2Px(N(), 300.0f)) {
                    a(this.mCoverView, 2130839429);
                } else {
                    a(this.mCoverView, 2130839430);
                }
            }
            if (com.ss.android.ugc.aweme.feed.k.b.e((IFeedViewHolder) this)) {
                com.ss.android.ugc.aweme.base.c.a(this.mCoverView, video.getOriginCover(), (ControllerListener<ImageInfo>) new com.ss.android.ugc.aweme.commercialize.c.c<ImageInfo>(d()));
            } else if (com.ss.android.g.a.a()) {
                com.ss.android.ugc.aweme.base.c.a(this.mCoverView, video.getOriginCover(), Priority.HIGH, (ControllerListener<ImageInfo>) new com.ss.android.ugc.aweme.feed.listener.f<ImageInfo>(this));
            } else {
                c(video);
            }
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40740, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40740, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 2) {
            this.P.i();
        } else {
            if (!com.ss.android.g.a.a()) {
                if (this.f44821f != null && this.f44821f.isAppAd()) {
                    this.P.i();
                }
                E();
            }
            if (AbTestManager.a().an()) {
                if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40770, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40770, new Class[0], Void.TYPE);
                } else if (this.j != null) {
                    this.j.a("recover_share_guide_animation", (Object) Boolean.TRUE);
                }
            }
            if (ab()) {
                ae();
            }
            if (this.z != null) {
                this.z.b();
            }
        }
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40794, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40794, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40791, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40791, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f44821f.getAwemeRawAd() == null || !this.f44821f.getAwemeRawAd().isAdPoiControl()) {
            try {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                TransitionManager.beginDelayedTransition(this.mWidgetContainer, transitionSet);
                this.j.a("show_poi_info", (Object) Integer.valueOf(i));
            } catch (NullPointerException e2) {
                com.ss.android.ugc.aweme.app.n.a("log_transition_empty", null, com.ss.android.ugc.aweme.app.d.c.a().a("errMsg", e2.getMessage()).b());
            }
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40795, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40795, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.g && i == 2 && ao() && (this.n instanceof FeedRecommendFragment)) {
            an();
            ((MainActivity) this.f44820e).tryShowLongClickGuideView();
        }
        if (i == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40835, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40835, new Class[0], Void.TYPE);
            } else if (ar()) {
                this.poiCardWebPageContainer.a(true, this.llAwemeIntro, this.mBottomView);
                this.poiCardWebPageContainer.post(new af(this));
            }
        }
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44817b, false, 40722, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44817b, false, 40722, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.a("load_progress_bar", (Object) Boolean.valueOf(z2));
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40774, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40774, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != null) {
            String str = "";
            try {
                str = this.m.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f44821f.setRequestId(str);
            }
        }
        if (!(this.J == null || this.f44821f == null)) {
            this.J.a(new ar(i, f(i)));
        }
    }

    public final void b(int i) {
        Object obj;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40741, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44817b, false, 40741, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 1) {
            if (AbTestManager.a().an()) {
                if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40769, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40769, new Class[0], Void.TYPE);
                } else if (this.j != null) {
                    this.j.a("pause_share_guide_animation", (Object) Boolean.TRUE);
                }
            }
            if (com.ss.android.g.a.a()) {
                return;
            }
        }
        if (ab()) {
            v.a(x(), 8);
        }
        if (this.z != null) {
            bd bdVar = this.z;
            if (PatchProxy.isSupport(new Object[0], bdVar, bd.f46566a, false, 43105, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bdVar, bd.f46566a, false, 43105, new Class[0], Void.TYPE);
            } else if (bdVar.i != null) {
                bdVar.i.removeMessages(3);
            }
        }
        if (i2 == 5) {
            am();
        } else {
            al();
        }
        if (!(i2 == 4 || i2 == 5)) {
            CommerceVideoDelegate commerceVideoDelegate = this.P;
            if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30662, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30662, new Class[0], Void.TYPE);
            } else {
                if (!(commerceVideoDelegate.f38688e == null || !commerceVideoDelegate.f38688e.isAppAd() || commerceVideoDelegate.f38688e.getAwemeRawAd() == null)) {
                    com.ss.android.downloadlib.h a2 = com.ss.android.ugc.aweme.app.c.a.c.a();
                    String downloadUrl = commerceVideoDelegate.f38688e.getAwemeRawAd().getDownloadUrl();
                    if (com.ss.android.ugc.aweme.commercialize.utils.c.z(commerceVideoDelegate.f38688e)) {
                        obj = commerceVideoDelegate.newAdBottomLabelView;
                    } else {
                        obj = commerceVideoDelegate.oldAdBottomLabelView;
                    }
                    a2.a(downloadUrl, obj.hashCode());
                }
                if (commerceVideoDelegate.l != null && commerceVideoDelegate.n > 0 && commerceVideoDelegate.m > 0) {
                    commerceVideoDelegate.m -= System.currentTimeMillis() - commerceVideoDelegate.n;
                    commerceVideoDelegate.adHalfWebPageContainer.removeCallbacks(commerceVideoDelegate.l);
                }
            }
        }
        if (this.j != null) {
            this.j.a("in_video_view_holder", (Object) Boolean.FALSE);
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44817b, false, 40805, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44817b, false, 40805, new Class[]{String.class}, Void.TYPE);
            return;
        }
        al();
        this.F = true;
        this.H = System.currentTimeMillis();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 40831(0x9f7f, float:5.7216E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40831(0x9f7f, float:5.7216E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r8 == 0) goto L_0x0249
            java.lang.String r0 = r8.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 3
            r11 = 8
            switch(r2) {
                case -1945890740: goto L_0x009a;
                case -1925455577: goto L_0x0090;
                case -1618328215: goto L_0x0086;
                case -777668341: goto L_0x007c;
                case -492284990: goto L_0x0072;
                case -162745511: goto L_0x0068;
                case 1181771620: goto L_0x005e;
                case 1949192341: goto L_0x0054;
                case 1964086245: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x00a5
        L_0x004a:
            java.lang.String r2 = "to_profile"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 6
            goto L_0x00a6
        L_0x0054:
            java.lang.String r2 = "is_show_music_guide"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x005e:
            java.lang.String r2 = "video_share_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 7
            goto L_0x00a6
        L_0x0068:
            java.lang.String r2 = "feed_internal_event"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 0
            goto L_0x00a6
        L_0x0072:
            java.lang.String r2 = "video_comment_list"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 4
            goto L_0x00a6
        L_0x007c:
            java.lang.String r2 = "update_diig_view"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 2
            goto L_0x00a6
        L_0x0086:
            java.lang.String r2 = "video_digg"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 3
            goto L_0x00a6
        L_0x0090:
            java.lang.String r2 = "dismiss_dou_pop"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 5
            goto L_0x00a6
        L_0x009a:
            java.lang.String r2 = "show_poi_distance"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 8
            goto L_0x00a6
        L_0x00a5:
            r0 = -1
        L_0x00a6:
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x022e;
                case 2: goto L_0x01d5;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01b9;
                case 5: goto L_0x01b5;
                case 6: goto L_0x01ab;
                case 7: goto L_0x017c;
                case 8: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x0249
        L_0x00ab:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40832(0x9f80, float:5.7218E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ef
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f44817b
            r3 = 0
            r4 = 40832(0x9f80, float:5.7218E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00ef:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "homepage_fresh"
            java.lang.String r1 = r19.O()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x017b
            android.widget.FrameLayout r0 = r7.mRootView
            if (r0 != 0) goto L_0x0107
            goto L_0x017b
        L_0x0107:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mPoiDistance
            if (r0 == 0) goto L_0x017a
            android.view.View r0 = r7.mPoiDistanceLayout
            if (r0 != 0) goto L_0x0110
            goto L_0x017a
        L_0x0110:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.e.e.f59784a
            r15 = 1
            r16 = 66806(0x104f6, float:9.3615E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x013f
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.e.e.f59784a
            r15 = 1
            r16 = 66806(0x104f6, float:9.3615E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x0151
        L_0x013f:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 == 0) goto L_0x014c
            int r0 = r0.poiNearbyShowDistance
            goto L_0x014d
        L_0x014c:
            r0 = 1
        L_0x014d:
            if (r0 != r9) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r9 = 0
        L_0x0151:
            if (r9 == 0) goto L_0x0249
            if (r8 != 0) goto L_0x0174
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            java.lang.String r0 = r0.getDistance()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0162
            goto L_0x0174
        L_0x0162:
            android.view.View r0 = r7.mPoiDistanceLayout
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mPoiDistance
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            java.lang.String r1 = r1.getDistance()
            r0.setText(r1)
            goto L_0x0249
        L_0x0174:
            android.view.View r0 = r7.mPoiDistanceLayout
            r0.setVisibility(r11)
            return
        L_0x017a:
            return
        L_0x017b:
            return
        L_0x017c:
            r19.aj()
            com.ss.android.ugc.aweme.utils.u r0 = com.ss.android.ugc.aweme.utils.u.f75965b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x01a1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = r0.isCollected()
            if (r0 == 0) goto L_0x0192
            goto L_0x01a1
        L_0x0192:
            android.content.Context r0 = r19.N()
            r1 = 2131564674(0x7f0d1882, float:1.875484E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x01a1:
            boolean r0 = r7.h
            if (r0 == 0) goto L_0x01a7
            r3 = 37
        L_0x01a7:
            r7.g((int) r3)
            return
        L_0x01ab:
            java.lang.Object r0 = r8.a()
            java.lang.String r0 = (java.lang.String) r0
            r7.g((java.lang.String) r0)
            return
        L_0x01b5:
            r19.aj()
            return
        L_0x01b9:
            java.lang.Object r0 = r8.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.g((int) r0)
            return
        L_0x01c7:
            java.lang.Object r0 = r8.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.g((int) r0)
            return
        L_0x01d5:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0249
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r0 = r7.P
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30666(0x77ca, float:4.2972E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0209
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.f38685b
            r14 = 0
            r15 = 30666(0x77ca, float:4.2972E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0213
        L_0x0209:
            com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView r1 = r0.oldAdBottomLabelView
            r1.f()
            com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView r0 = r0.newAdBottomLabelView
            r0.f()
        L_0x0213:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            r0.isShowCommerceCard()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f44821f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.s(r0)
            if (r0 == 0) goto L_0x0249
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate r0 = r7.P
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f44821f
            int r1 = com.ss.android.ugc.aweme.commercialize.utils.c.r(r1)
            int r1 = r1 * 1000
            r0.a((int) r1)
            return
        L_0x022e:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.g = r0
            return
        L_0x023b:
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r0 = r7.J
            if (r0 == 0) goto L_0x0249
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r0 = r7.J
            java.lang.Object r1 = r8.a()
            r0.a(r1)
            return
        L_0x0249:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder.onChanged(java.lang.Object):void");
    }

    @OnClick({2131497590, 2131493972, 2131493064, 2131493202, 2131498649})
    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f44817b, false, 40745, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44817b, false, 40745, new Class[]{View.class}, Void.TYPE);
        } else if (this.f44821f != null) {
            int id = view.getId();
            if (id == C0906R.id.title) {
                if (!this.P.b() && !ex.b() && !com.ss.android.ugc.aweme.login.utils.a.a(this.f44821f)) {
                    if (this.f44821f != null && (!this.f44821f.isCanPlay() || this.f44821f.isDelete())) {
                        com.bytedance.ies.dmt.ui.d.a.b(this.f44820e, (int) C0906R.string.drx).a();
                    } else if (this.f44821f.getAuthor() != null || am.a(this.f44821f, 3)) {
                        g(18);
                        CommerceVideoDelegate commerceVideoDelegate = this.P;
                        if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30630, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30630, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.commercialize.feed.e eVar = commerceVideoDelegate.o;
                            if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30574, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.commercialize.feed.e.f38827a, false, 30574, new Class[0], Void.TYPE);
                            } else if (eVar.f38830d != null) {
                                eVar.f38830d.clickUserName(eVar.f38829c, eVar.f38828b);
                            }
                        }
                        ((q) new q().b(this.f44821f, this.X.pageType).b(O()).a("click_name")).e();
                        new com.ss.android.ugc.aweme.u.p().e(this.f44821f).c(O()).b(this.f44821f.getAuthorUid()).e();
                        z.a(z.c.PROFILE);
                        if (a(this.f44821f)) {
                            g("");
                        }
                    }
                }
            } else if (id == C0906R.id.ej) {
                this.f44821f.getAwemeRiskModel().setVoteStatus(1);
                this.mAllowDisplayBtn.setSelected(true);
                this.mDisallowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(C0906R.string.dsn);
                g(25);
            } else if (id == C0906R.id.a5c) {
                this.f44821f.getAwemeRiskModel().setVoteStatus(0);
                this.mDisallowDisplayBtn.setSelected(true);
                this.mAllowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(C0906R.string.dsp);
                g(26);
            } else if (id == C0906R.id.il) {
                if (!TextUtils.isEmpty(this.f44821f.getAid())) {
                    Intent intent = new Intent(N(), CrossPlatformActivity.class);
                    intent.setData(Uri.parse(String.format("https://aweme.snssdk.com/falcon/douyin_falcon/reviewing/?itemId=%s", new Object[]{this.f44821f.getAid()})));
                    intent.putExtra("hide_nav_bar", true);
                    N().startActivity(intent);
                }
            } else if (id == C0906R.id.dy4) {
                com.ss.android.ugc.aweme.j.a.a.a(this.f44820e, this.f44821f);
                User author = this.f44821f.getAuthor();
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", O()).a("group_id", this.f44821f.getAid());
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = "";
                }
                r.a("click_mission_icon", (Map) a2.a("author_id", str).a("entrance_location", "activity_entrance").f34114b);
            }
        }
    }

    private boolean a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f44817b, false, 40731, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f44817b, false, 40731, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(@NonNull RemoteImageView remoteImageView, @DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, Integer.valueOf(i)}, null, f44817b, true, 40733, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, Integer.valueOf(i)}, null, f44817b, true, 40733, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            remoteImageView.setBackgroundResource(i);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f44817b, false, 40726, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f44817b, false, 40726, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        v.b(z2, this.mCornerTL, this.mCornerTR);
        v.b(z3, this.mCornerBL, this.mCornerBR);
    }

    private static JSONObject a(Aweme aweme, BaseFeedPageParams baseFeedPageParams, String str) {
        Aweme aweme2 = aweme;
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{aweme2, baseFeedPageParams2, str2}, null, f44817b, true, 40730, new Class[]{Aweme.class, BaseFeedPageParams.class, String.class}, JSONObject.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.a(aweme2, baseFeedPageParams2.pageType, str2, baseFeedPageParams2.eventType);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{aweme2, baseFeedPageParams2, str2}, null, f44817b, true, 40730, new Class[]{Aweme.class, BaseFeedPageParams.class, String.class}, JSONObject.class);
    }

    public VideoViewHolder(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, @NonNull BaseFeedPageParams baseFeedPageParams, m mVar) {
        int i;
        CommerceVideoDelegate commerceVideoDelegate;
        View view2 = view;
        aa<ar> aaVar2 = aaVar;
        Fragment fragment2 = fragment;
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        this.f44820e = view.getContext();
        this.X = baseFeedPageParams2;
        this.t = mVar;
        if (Build.VERSION.SDK_INT >= 17) {
            this.Q.a(this.f44820e);
        }
        try {
            ButterKnife.bind((Object) this, view);
        } catch (IllegalStateException unused) {
            l.a(getClass().getName(), view2, this.f44820e, 0);
        }
        int i2 = this.X.pageType;
        String O2 = O();
        if (PatchProxy.isSupport(new Object[]{1, this, view2, Integer.valueOf(i2), O2, aaVar2, fragment2}, null, BaseVideoHolderDelegate.f38482a, true, 30405, new Class[]{Integer.TYPE, IFeedViewHolder.class, View.class, Integer.TYPE, String.class, aa.class, Fragment.class}, CommerceVideoDelegate.class)) {
            Object[] objArr = {1, this, view2, Integer.valueOf(i2), O2, aaVar2, fragment2};
            Object[] objArr2 = objArr;
            commerceVideoDelegate = (CommerceVideoDelegate) PatchProxy.accessDispatch(objArr2, null, BaseVideoHolderDelegate.f38482a, true, 30405, new Class[]{Integer.TYPE, IFeedViewHolder.class, View.class, Integer.TYPE, String.class, aa.class, Fragment.class}, CommerceVideoDelegate.class);
            i = 2;
        } else {
            i = 2;
            commerceVideoDelegate = new CommerceVideoDelegate(this, view, i2, O2, aaVar, fragment);
        }
        this.P = commerceVideoDelegate;
        if (o.v()) {
            this.x = new VideoViewComponent();
            this.x.a((ViewGroup) this.mRootView);
            this.w = this.x.f4334b;
        } else {
            this.w = com.ss.android.ugc.playerkit.videoview.h.a((ViewGroup) this.mRootView);
            if (j.b() && (this.w.a() instanceof SurfaceView)) {
                WeakContainer weakContainer = V.get(this.f44820e);
                if (weakContainer == null) {
                    weakContainer = new WeakContainer();
                    V.put(this.f44820e, weakContainer);
                }
                this.w.a().setVisibility(8);
                weakContainer.add((SurfaceView) this.w.a());
            }
        }
        this.mGradualBottomView.getLayoutParams().height = (UIUtils.getScreenHeight(this.f44820e) * 3) / 4;
        this.n = fragment2;
        if (((Boolean) SharePrefCache.inst().getShowPlayerInfoUI().c()).booleanValue()) {
            this.p = new com.ss.android.ugc.aweme.video.f.a(N(), this.mHudView);
        }
        this.J = aaVar2;
        if (com.ss.android.g.a.b()) {
            this.mCoverView.setBackgroundColor(this.f44820e.getResources().getColor(C0906R.color.h7));
            this.mRootView.setBackgroundColor(this.f44820e.getResources().getColor(C0906R.color.h7));
        }
        if (TextUtils.equals("upload", O())) {
            this.X.setEventType(null);
        }
        this.mTitleView.setOnTouchListener(ed.a(0.5f, 1.0f));
        this.mLongPressLayout.setListener(new ac(this, baseFeedPageParams2));
        this.mLongPressLayout.setTapListener(onTouchListener);
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40705, new Class[0], Void.TYPE);
        } else {
            this.j = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a(this.n, this), (LifecycleOwner) this.n);
            this.j.a("feed_internal_event", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("to_profile", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("dismiss_dou_pop", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("is_show_music_guide", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("update_diig_view", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_comment_list", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_share_click", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_digg", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("show_poi_distance", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
            this.k = WidgetManager.a(this.n, (View) this.mRootView);
            this.k.a(this.j);
            this.k.b(C0906R.id.dta, new VideoDescWidget()).b(C0906R.id.ad1, new VideoFeedTagWidget()).b(C0906R.id.a51, new VideoDiggWidget(O())).a((View) this.mBottomView, (Widget) new VideoProgressBarWidget()).b(C0906R.id.vd, new VideoCommentWidget()).b(C0906R.id.cpx, new VideoShareWidget()).b(C0906R.id.i5, new FeedAvatarWidget(this)).a((View) this.mBottomView, (Widget) new VideoBanWidget()).a((View) this.mBottomView, (Widget) new VideoAntiAddictionWidget()).a((View) this.mBottomView, (Widget) new VideoHotSearchBarWidget());
            if (u.a()) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).videoViewHolderBindDownloadWidget(this.k);
            }
            this.P.i = this.j;
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40709, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40709, new Class[0], Void.TYPE);
            } else {
                if (this.Y == null) {
                    this.Y = new VideoMusicTitleWidget();
                    this.k.b(C0906R.id.dtd, this.Y);
                }
                if (this.Z == null) {
                    this.Z = new VideoMusicCoverWidget();
                    this.k.b(C0906R.id.dtc, this.Z);
                }
            }
            this.u = WidgetManager.a(this.n, (View) this.mRootView);
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40708, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40708, new Class[0], Void.TYPE);
            } else {
                this.U = new InteractStickerWidget();
                this.U.a((f) this);
                this.u.a((int) C0906R.id.av6, (Widget) this.U);
            }
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40706, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40706, new Class[0], Void.TYPE);
            } else if (!com.ss.android.g.a.a()) {
                this.k.b(C0906R.id.dsp, new VideoPostTimeWidget());
            }
            if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40707, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40707, new Class[0], Void.TYPE);
            } else if (AbTestManager.a().cj() == i) {
                this.k.b(C0906R.id.dsl, new VideoPlayCountWidget());
            }
        }
        if (W.get(this.f44820e) == null) {
            W.put(this.f44820e, new WeakContainer());
        }
        W.get(this.f44820e).add(this);
        if (!com.ss.android.g.a.a()) {
            this.y = new com.ss.android.ugc.aweme.feed.hw.a(this);
        }
        this.o = new com.ss.android.ugc.aweme.feed.c.c(view2);
        if (PatchProxy.isSupport(new Object[0], this, f44817b, false, 40704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44817b, false, 40704, new Class[0], Void.TYPE);
        } else if (TextUtils.equals("tiktok_inhouse", com.ss.android.ugc.aweme.app.i.a().getChannel())) {
            this.txtTTFeedback.setVisibility(0);
            this.txtTTFeedback.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44822a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f44822a, false, 40856, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f44822a, false, 40856, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    VideoViewHolder.this.f44820e.startActivity(new Intent(VideoViewHolder.this.f44820e, FeedbackActivity.class));
                }
            });
        } else {
            this.txtTTFeedback.setVisibility(8);
            this.txtTTFeedback.setOnClickListener(null);
        }
        this.aa = VideoItemParams.newBuilder(baseFeedPageParams2, this.P, fragment2, this.l);
    }
}
