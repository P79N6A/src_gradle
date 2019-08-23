package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.HollowTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commerce.service.logs.ak;
import com.ss.android.ugc.aweme.commerce.service.logs.al;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.commercialize.log.aa;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagLayout2;
import com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.util.f;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.util.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.MentionTextView;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseFollowViewHolder extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, WeakHandler.IHandler, w {
    private static final d T = new d() {
        public final void a() {
        }

        public final void a(@NonNull c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        }

        public final void a(e eVar) {
        }

        public final void a(e eVar, int i) {
        }

        public final void b(e eVar) {
        }

        public final void b(e eVar, int i) {
        }

        public final void c(e eVar) {
        }
    };
    public static ChangeQuickRedirect h;
    protected com.ss.android.ugc.aweme.forward.f.a A;
    protected com.ss.android.ugc.aweme.forward.a.a B;
    public boolean C;
    public boolean D = true;
    public boolean E = true;
    public String F;
    public String G;
    protected boolean H = false;
    public String I;
    protected b J;
    protected h K;
    protected WidgetManager L;
    protected m M = new m() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57454a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62078, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62078, new Class[0], Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.P();
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62079, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62079, new Class[0], Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.Q();
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62075, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62075, new Class[0], Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.N();
        }

        public final void g() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62076, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62076, new Class[0], Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.O();
        }

        public final void h() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62077, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62077, new Class[0], Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.Y();
        }

        public final Rect a() {
            if (PatchProxy.isSupport(new Object[0], this, f57454a, false, 62080, new Class[0], Rect.class)) {
                return (Rect) PatchProxy.accessDispatch(new Object[0], this, f57454a, false, 62080, new Class[0], Rect.class);
            }
            BaseFollowViewHolder baseFollowViewHolder = BaseFollowViewHolder.this;
            if (PatchProxy.isSupport(new Object[0], baseFollowViewHolder, BaseFollowViewHolder.h, false, 62040, new Class[0], Rect.class)) {
                return (Rect) PatchProxy.accessDispatch(new Object[0], baseFollowViewHolder, BaseFollowViewHolder.h, false, 62040, new Class[0], Rect.class);
            }
            baseFollowViewHolder.itemView.getLocationOnScreen(baseFollowViewHolder.z);
            baseFollowViewHolder.y.set(baseFollowViewHolder.z[0], baseFollowViewHolder.z[1], baseFollowViewHolder.z[0] + baseFollowViewHolder.itemView.getWidth(), baseFollowViewHolder.z[1] + baseFollowViewHolder.itemView.getHeight());
            return baseFollowViewHolder.y;
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57454a, false, 62073, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57454a, false, 62073, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.a(i);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57454a, false, 62074, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57454a, false, 62074, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            BaseFollowViewHolder.this.b(i);
        }
    };
    protected Runnable N = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57464a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f57464a, false, 62087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57464a, false, 62087, new Class[0], Void.TYPE);
                return;
            }
            if (BaseFollowViewHolder.this.D) {
                BaseFollowViewHolder.this.mCommentLayout.a();
            }
        }
    };
    public boolean O = false;
    public MotionEvent P;
    public MotionEvent Q;
    protected View.OnTouchListener R = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57466a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f57466a, false, 62088, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f57466a, false, 62088, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            switch (motionEvent.getAction()) {
                case 0:
                    if (BaseFollowViewHolder.this.x.hasMessages(0)) {
                        BaseFollowViewHolder.this.x.removeMessages(0);
                    }
                    if (f.a(BaseFollowViewHolder.this.P, BaseFollowViewHolder.this.Q, motionEvent, BaseFollowViewHolder.this.X())) {
                        BaseFollowViewHolder.this.O = true;
                        BaseFollowViewHolder.this.b(BaseFollowViewHolder.this.j);
                    } else {
                        BaseFollowViewHolder.this.O = false;
                    }
                    if (BaseFollowViewHolder.this.P != null) {
                        BaseFollowViewHolder.this.P.recycle();
                    }
                    BaseFollowViewHolder.this.P = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!BaseFollowViewHolder.this.O && BaseFollowViewHolder.this.P != null && !f.a(0, BaseFollowViewHolder.this.P, motionEvent, BaseFollowViewHolder.this.X())) {
                        BaseFollowViewHolder.this.x.sendMessageDelayed(BaseFollowViewHolder.this.x.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + BaseFollowViewHolder.this.P.getEventTime());
                    }
                    if (BaseFollowViewHolder.this.Q != null) {
                        BaseFollowViewHolder.this.Q.recycle();
                    }
                    BaseFollowViewHolder.this.Q = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (f.a(0, BaseFollowViewHolder.this.P, motionEvent, BaseFollowViewHolder.this.X())) {
                        BaseFollowViewHolder.this.x.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };
    private boolean S = false;
    private String U = null;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> V;

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.newfollow.b.a f3670a;
    @BindDimen(2131231022)
    protected int avatarSize;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3671b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.follow.widet.a f3672c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3673d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3674e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3675f = false;
    private boolean g = false;
    protected Aweme i;
    public Aweme j;
    protected List<Comment> k;
    protected List<User> l;
    protected com.ss.android.ugc.aweme.feed.ui.a m;
    @BindView(2131498380)
    protected LiveCircleView mAvatarBorderView;
    @BindView(2131495235)
    protected FrameLayout mAvatarLayout;
    @BindView(2131498352)
    protected AvatarImageView mAvatarLiveView;
    @Nullable
    @BindView(2131493191)
    protected AnimationImageView mAvatarLoadingView;
    @BindView(2131498345)
    protected AvatarImageView mAvatarView;
    @Nullable
    @BindView(2131493327)
    View mBottomDivider;
    @Nullable
    @BindView(2131497849)
    TextView mCommentCountView;
    @Nullable
    @BindView(2131495251)
    protected FollowFeedCommentLayout mCommentLayout;
    @Nullable
    @BindView(2131494991)
    ImageView mCommentView;
    @Nullable
    @BindView(2131493811)
    LinearLayout mCouponContainer;
    @BindView(2131494996)
    protected RemoteImageView mCoverView;
    @BindView(2131497877)
    protected TextView mCreateTimeView;
    @BindView(2131497886)
    protected MentionTextView mDescView;
    @Nullable
    @BindView(2131497894)
    TextView mDiggCountView;
    @Nullable
    @BindView(2131493960)
    DiggLayout mDiggLayout;
    @Nullable
    @BindView(2131493955)
    ImageView mDiggView;
    @Nullable
    @BindView(2131494352)
    protected FollowFeedTagLayout2 mFeedTagLayout2;
    @Nullable
    @BindView(2131494347)
    FollowUserBtn mFollow;
    @Nullable
    @BindView(2131497920)
    TextView mForwardCountView;
    @Nullable
    @BindView(2131495254)
    protected ViewGroup mForwardLayout;
    @Nullable
    @BindView(2131498181)
    TextView mFriendTagView;
    @BindView(2131498222)
    protected TextView mHeadUserNameView;
    @BindView(2131495255)
    protected View mHeaderLayout;
    @Nullable
    @BindView(2131495033)
    ImageView mIvForward;
    @Nullable
    @BindView(2131495367)
    protected View mLineDivider;
    @Nullable
    @BindView(2131495690)
    View mLookMoreView;
    @Nullable
    @BindView(2131495688)
    LongPressLayout mPressLayout;
    @Nullable
    @BindView(2131495253)
    View mRecommendFeedLayout;
    @Nullable
    @BindView(2131498082)
    TextView mRecommendReasonView;
    @Nullable
    @BindView(2131498137)
    protected TextView mShareCountView;
    @Nullable
    @BindView(2131497101)
    protected ImageView mShareView;
    @Nullable
    @BindView(2131498141)
    protected TextView mShoppingView;
    @Nullable
    @BindView(2131497359)
    StoryCircleView mStoryRing;
    @Nullable
    @BindView(2131497656)
    View mTopDivider;
    public a n;
    protected aa.a o;
    HollowTextView p;
    protected ImageView q;
    public String r;
    public int s;
    public String t;
    public String u;
    boolean v;
    protected l w;
    protected WeakHandler x;
    Rect y = new Rect();
    int[] z = new int[2];

    public interface a extends FollowFeedCommentLayout.a {
        void a(View view, View view2, Aweme aweme, User user);

        void a(View view, View view2, User user);

        void a(View view, View view2, User user, String str, String str2);

        void a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme);

        void a(Aweme aweme);

        void a(Aweme aweme, List<String> list);

        void a(User user, List<String> list, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener);

        void b(View view, View view2, Aweme aweme, User user);

        void b(Aweme aweme);

        void c(View view, View view2, Aweme aweme);

        void d(View view, View view2, Aweme aweme);

        com.ss.android.ugc.aweme.common.f.a e();
    }

    public void H() {
    }

    public void K() {
    }

    public void O() {
    }

    public void T() {
    }

    public void U() {
    }

    public void V() {
        this.v = false;
    }

    public void W() {
    }

    public void a(int i2) {
    }

    public void a(View view) {
    }

    public void b(View view) {
    }

    public void i() {
    }

    public boolean j() {
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public String d() {
        return this.r;
    }

    public void a(final com.ss.android.ugc.aweme.newfollow.e.b bVar, com.ss.android.ugc.aweme.newfollow.e.b bVar2) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, h, false, 61978, new Class[]{com.ss.android.ugc.aweme.newfollow.e.b.class, com.ss.android.ugc.aweme.newfollow.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, h, false, 61978, new Class[]{com.ss.android.ugc.aweme.newfollow.e.b.class, com.ss.android.ugc.aweme.newfollow.e.b.class}, Void.TYPE);
            return;
        }
        boolean z3 = bVar instanceof FollowFeed;
        if (z3) {
            FollowFeed followFeed = (FollowFeed) bVar;
            String recommendReason = followFeed.getRecommendReason();
            int hasMoreRecommendFeed = followFeed.getHasMoreRecommendFeed();
            int hasMoreRecommendFeed2 = bVar2 instanceof FollowFeed ? ((FollowFeed) bVar2).getHasMoreRecommendFeed() : 0;
            this.H = !TextUtils.isEmpty(recommendReason);
            int i2 = 8;
            if (this.H) {
                this.mFollow.setVisibility(0);
                this.mRecommendReasonView.setVisibility(0);
                this.mRecommendReasonView.setText(recommendReason);
            } else {
                this.mFollow.setVisibility(8);
                this.mRecommendReasonView.setVisibility(8);
            }
            if (!z3 || !followFeed.isFirstEmptyRecFollowFeed()) {
                if (hasMoreRecommendFeed > 0) {
                    this.mRecommendFeedLayout.setVisibility(0);
                    this.mLookMoreView.setVisibility(0);
                    this.mRecommendFeedLayout.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f57451a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f57451a, false, 62072, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f57451a, false, 62072, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (BaseFollowViewHolder.this.X() != null) {
                                RecommendFollowFeedActivity.a(BaseFollowViewHolder.this.X());
                                com.ss.android.ugc.aweme.newfollow.g.a.b(bVar.getAweme());
                            }
                        }
                    });
                    this.mTopDivider.setVisibility(0);
                    View view = this.mBottomDivider;
                    if (hasMoreRecommendFeed2 <= 0) {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                } else {
                    this.mRecommendFeedLayout.setVisibility(8);
                    this.mTopDivider.setVisibility(8);
                    this.mBottomDivider.setVisibility(8);
                    if (hasMoreRecommendFeed2 <= 0) {
                        z2 = true;
                    }
                }
                this.E = z2;
                return;
            }
            this.mRecommendFeedLayout.setVisibility(0);
            this.mLookMoreView.setVisibility(8);
            this.mTopDivider.setVisibility(0);
            this.mBottomDivider.setVisibility(8);
            if (hasMoreRecommendFeed2 <= 0) {
                z2 = true;
            }
            this.E = z2;
        }
    }

    public void a(FollowFeedLayout followFeedLayout) {
        if (PatchProxy.isSupport(new Object[]{followFeedLayout}, this, h, false, 61984, new Class[]{FollowFeedLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeedLayout}, this, h, false, 61984, new Class[]{FollowFeedLayout.class}, Void.TYPE);
            return;
        }
        this.q = (ImageView) followFeedLayout.findViewById(C0906R.id.b11);
        if (this.q != null) {
            this.q.setOnClickListener(new b(this));
        }
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 61985, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 61985, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.i = aweme;
        this.j.setRepostFromGroupId(this.i.getAid());
        this.j.setRepostFromUserId(this.i.getAuthorUid());
    }

    public void a(Aweme aweme, List<Comment> list, List<User> list2, a aVar) {
        Aweme aweme2 = aweme;
        List<Comment> list3 = list;
        List<User> list4 = list2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aweme2, list3, list4, aVar2}, this, h, false, 61986, new Class[]{Aweme.class, List.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list3, list4, aVar2}, this, h, false, 61986, new Class[]{Aweme.class, List.class, List.class, a.class}, Void.TYPE);
            return;
        }
        this.j = aweme2;
        this.f3673d = com.ss.android.ugc.aweme.commercialize.utils.c.t(aweme);
        this.itemView.setTag(aweme2);
        this.k = list3;
        this.n = aVar2;
        this.l = list4;
        if (this.j != null) {
            l();
            n();
        }
        M();
        this.f3671b = false;
    }

    public final void a(AwemeStatus awemeStatus, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{awemeStatus, urlModel}, this, h, false, 62005, new Class[]{AwemeStatus.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeStatus, urlModel}, this, h, false, 62005, new Class[]{AwemeStatus.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (this.j.getStatus() != null) {
            this.j.getStatus().setPrivateStatus(awemeStatus.getPrivateStatus());
        }
        this.j.setLabelPrivate(urlModel);
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, h, false, 62006, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, h, false, 62006, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        AwemeLabelModel awemeLabelModel = null;
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(1);
            awemeLabelModel.setUrlModels(urlModel);
        }
        if (!(this.j == null || this.j.videoLabels == null)) {
            if (this.j.videoLabels.size() == 0) {
                this.j.videoLabels.add(0, awemeLabelModel);
                return;
            }
            this.j.videoLabels.set(0, awemeLabelModel);
        }
    }

    public void a(View view, int i2, int i3) {
        float f2;
        View view2 = view;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 62030, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 62030, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int screenWidth = UIUtils.getScreenWidth(X());
        int screenHeight = UIUtils.getScreenHeight(X());
        float dip2Px = UIUtils.dip2Px(X(), 16.0f);
        float f3 = ((float) i5) / ((float) i4);
        if (AbTestManager.a().z() == 1) {
            if (i4 * 4 > i5 * 3) {
                iArr[0] = (int) (((float) screenWidth) - (dip2Px * 2.0f));
                iArr[1] = (int) (((float) iArr[0]) * f3);
            } else {
                iArr[0] = (int) (((float) screenWidth) * 0.72f);
                iArr[1] = (int) (((float) iArr[0]) * f3);
            }
            float f4 = ((float) screenHeight) * 0.72f;
            if (((float) iArr[1]) > f4) {
                iArr[1] = (int) f4;
                iArr[0] = (int) (((float) iArr[1]) / f3);
            }
        } else {
            Object[] objArr = {Integer.valueOf(screenWidth), Integer.valueOf(screenHeight), Float.valueOf(dip2Px), Float.valueOf(f3), iArr};
            if (PatchProxy.isSupport(objArr, this, h, false, 62031, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, int[].class}, Void.TYPE)) {
                Object[] objArr2 = {Integer.valueOf(screenWidth), Integer.valueOf(screenHeight), Float.valueOf(dip2Px), Float.valueOf(f3), iArr};
                Object[] objArr3 = objArr2;
                PatchProxy.accessDispatch(objArr3, this, h, false, 62031, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, int[].class}, Void.TYPE);
            } else {
                float f5 = 1.3333334f;
                switch (AbTestManager.a().z()) {
                    case 2:
                        f2 = ((float) screenHeight) * 0.6f;
                        break;
                    case 3:
                        f2 = ((float) screenHeight) * 0.56f;
                        break;
                    case 4:
                        f5 = 1.25f;
                        f2 = ((float) screenHeight) * 0.52f;
                        break;
                    default:
                        f5 = 1.0f;
                        f2 = UIUtils.dip2Px(X(), 400.0f);
                        break;
                }
                if (f3 > f5) {
                    iArr[1] = (int) f2;
                    iArr[0] = (int) (((float) iArr[1]) / f5);
                    int i6 = (int) ((((float) screenWidth) * 0.85f) - dip2Px);
                    if (iArr[0] > i6) {
                        iArr[0] = i6;
                    }
                } else {
                    iArr[0] = (int) (((float) screenWidth) - (dip2Px * 2.0f));
                    iArr[1] = (int) (((float) iArr[0]) * f3);
                    if (((float) iArr[1]) > f2) {
                        iArr[1] = (int) f2;
                        iArr[0] = (int) (((float) iArr[1]) / f3);
                    }
                }
            }
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view2.setLayoutParams(layoutParams);
    }

    public final void a(aa.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, h, false, 62052, new Class[]{aa.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, h, false, 62052, new Class[]{aa.a.class}, Void.TYPE);
        } else if (aVar == null) {
            this.o = null;
        } else if (aVar != this.o) {
            this.o = aVar;
            this.f3674e = false;
            ad();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void aa() {
        this.x.sendMessage(this.x.obtainMessage(0));
    }

    private void ab() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62035, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d M2 = M();
        if (M2 != null) {
            M2.b(d());
        }
    }

    private boolean ac() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62053, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 62053, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.S) {
            this.g = ao.b(this.itemView);
            this.S = true;
        }
        return this.g;
    }

    private void af() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62060, new Class[0], Void.TYPE);
            return;
        }
        if (this.U != null) {
            com.ss.android.ugc.aweme.app.c.a.c.a().a(this.U, hashCode());
            this.U = null;
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62034, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d M2 = M();
        if (M2 != null) {
            M2.a(d());
        }
    }

    public void C() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62025, new Class[0], Void.TYPE);
            return;
        }
        List<String> B2 = B();
        if (this.n != null) {
            this.n.a(this.j, B2);
        }
    }

    public void D() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62026, new Class[0], Void.TYPE);
            return;
        }
        this.mCoverView.setVisibility(0);
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62027, new Class[0], Void.TYPE);
            return;
        }
        this.mCoverView.setVisibility(8);
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62011, new Class[0], Void.TYPE);
            return;
        }
        if (j() && this.mCommentLayout != null) {
            this.mCommentLayout.d();
        }
        w();
    }

    public void I() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62028, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.e();
        }
    }

    public void J() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62029, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.f();
        }
    }

    public void N() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62036, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62036, new Class[0], Void.TYPE);
            return;
        }
        if (this.mFeedTagLayout2 != null) {
            this.mFeedTagLayout2.d();
        }
    }

    public void P() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62037, new Class[0], Void.TYPE);
            return;
        }
        this.x.removeCallbacks(this.N);
    }

    public void Q() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62039, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    public final boolean R() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62041, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 62041, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.newfollow.util.d M2 = M();
        if (M2 != null && M2.f57413d.c(16777216)) {
            z2 = true;
        }
        return z2;
    }

    public void S() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62042, new Class[0], Void.TYPE);
            return;
        }
        this.v = true;
        if (!R()) {
            ab();
        }
    }

    public final Context X() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 62047, new Class[0], Context.class)) {
            return this.B.d();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, h, false, 62047, new Class[0], Context.class);
    }

    public final void Y() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62054, new Class[0], Void.TYPE);
            return;
        }
        this.g = false;
        this.S = false;
        ae();
        ad();
    }

    public final boolean h() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61980, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 61980, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.C && this.B.b()) {
            z2 = true;
        }
        return z2;
    }

    public void v() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62007, new Class[0], Void.TYPE);
            return;
        }
        w();
        if (!j()) {
            F();
            y();
        }
        x();
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62008, new Class[0], Void.TYPE);
            return;
        }
        this.mDiggLayout.removeAllViews();
        this.A.a(this.j);
    }

    private void ad() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62055, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            if (!ac()) {
                this.f3674e = false;
            } else if (!this.f3674e) {
                this.f3674e = true;
                aa.a(X(), this.o);
            }
        }
    }

    private void ae() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62056, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3673d) {
            if (!ac()) {
                this.f3675f = false;
            } else if (!this.f3675f) {
                this.f3675f = true;
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("show").b(this.j).d("video").a(X());
            }
        }
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61995, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 61995, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.r, "homepage_follow") || TextUtils.equals(this.r, "homepage_friends")) {
            return true;
        } else {
            return false;
        }
    }

    @CallSuper
    public void A() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62015, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAvatarView != null) {
            this.mAvatarView.setOnClickListener(new d(this));
        }
        if (this.mAvatarLiveView != null) {
            this.mAvatarLiveView.setOnClickListener(new e(this));
        }
        if (this.mHeadUserNameView != null) {
            this.mHeadUserNameView.setOnClickListener(new f(this));
        }
    }

    public List<String> B() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62024, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 62024, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (j()) {
            arrayList.add(X().getString(C0906R.string.c65));
        }
        if (!ex.a(this.j) && ex.b(this.j)) {
            arrayList.add(X().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public void E_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62000, new Class[0], Void.TYPE);
            return;
        }
        String b2 = eo.b(X(), this.j.getCreateTime() * 1000);
        if (!TextUtils.isEmpty(this.j.getOpenPlatformName()) && this.j.getOpenPlatformStruct() == null) {
            b2 = b2 + "  " + this.j.getOpenPlatformName();
        }
        this.mCreateTimeView.setText(b2);
    }

    public final void F() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62010, new Class[0], Void.TYPE);
            return;
        }
        if (!j()) {
            String d2 = com.ss.android.ugc.aweme.newfollow.a.b.d(this.j);
            if (!TextUtils.isEmpty(d2)) {
                this.mCommentCountView.setText(d2);
            }
        } else if (this.mCommentLayout != null) {
            this.mCommentLayout.c();
        }
    }

    public final com.ss.android.ugc.aweme.newfollow.util.d M() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62033, new Class[0], com.ss.android.ugc.aweme.newfollow.util.d.class)) {
            return (com.ss.android.ugc.aweme.newfollow.util.d) PatchProxy.accessDispatch(new Object[0], this, h, false, 62033, new Class[0], com.ss.android.ugc.aweme.newfollow.util.d.class);
        }
        com.ss.android.ugc.aweme.newfollow.util.d dVar = null;
        if (this.j != null) {
            dVar = com.ss.android.ugc.aweme.newfollow.util.e.a().c(com.ss.android.ugc.aweme.newfollow.util.d.a(this.B.e(), this.j.getAid()));
        }
        if (dVar == null) {
            dVar = c();
        }
        return dVar;
    }

    @OnClick({2131495231})
    @Optional
    public void addComment() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62023, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c(X(), X().getString(C0906R.string.chv)).a();
                return;
            }
            this.n.a(this.itemView, this.j);
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61993, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            if (this.H || com.ss.android.g.a.a()) {
                this.q.setVisibility(8);
            } else if (((this.B.a() instanceof FollowFeedAdapter) || (this.B.a() instanceof UserStateFeedAdapter)) && !com.ss.android.ugc.aweme.newfollow.a.b.c(this.j)) {
                this.q.setVisibility(0);
            } else {
                this.q.setVisibility(8);
            }
        }
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62002, new Class[0], Void.TYPE);
            return;
        }
        if (!this.D || !this.E) {
            this.mLineDivider.setVisibility(8);
        } else {
            this.mLineDivider.setVisibility(0);
        }
        if ("poi_page".equalsIgnoreCase(d())) {
            if (this.E) {
                this.mLineDivider.setVisibility(0);
                return;
            }
            this.mLineDivider.setVisibility(8);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61988, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            com.ss.android.ugc.aweme.newfollow.util.e.a().b(com.ss.android.ugc.aweme.newfollow.util.d.a(this.B.e(), this.j.getAid()));
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61990, new Class[0], Void.TYPE);
        } else if (this.j == null || this.j.getAuthor() == null || TextUtils.isEmpty(this.j.getAuthor().getRelationLabel())) {
            this.mFriendTagView.setVisibility(8);
        } else {
            this.mFriendTagView.setVisibility(0);
            this.mFriendTagView.setText(this.j.getAuthor().getRelationLabel());
        }
    }

    public void p() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61991, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.newfollow.a.b.b(this.j)) {
            this.mShareView.setAlpha(0.5f);
            this.mShareView.setEnabled(false);
        } else {
            this.mShareView.setAlpha(1.0f);
            this.mShareView.setEnabled(true);
        }
    }

    public void r() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61996, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.j)) {
            this.mShareView.setImageResource(2130839644);
        } else {
            this.mShareView.setImageResource(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getShareIconResource());
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61997, new Class[0], Void.TYPE);
            return;
        }
        if (this.D) {
            this.mCommentLayout.setVisibility(0);
            this.mCommentLayout.a(this.j, this.k, this.l, this.n);
            this.mCommentLayout.setEventType(this.r);
            this.mCommentLayout.setPageType(this.s);
        } else {
            this.mCommentLayout.setVisibility(8);
        }
        if (this.A != null) {
            this.A.f48294c = this.mCommentLayout.getLayoutLikes();
        }
    }

    public void u() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61999, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", this.j.getRequestId());
        } catch (JSONException unused) {
        }
        this.mFeedTagLayout2.setVisibility(0);
        this.mFeedTagLayout2.setPageType(this.s);
        this.mFeedTagLayout2.setFollowPageType(this.t);
        this.mFeedTagLayout2.a(this.j, (Activity) X(), this.r, jSONObject);
        if ("poi_page".equalsIgnoreCase(this.r)) {
            this.mFeedTagLayout2.b();
        }
    }

    public void x() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62009, new Class[0], Void.TYPE);
        } else if (!j()) {
            if (!AbTestManager.a().M() || (!com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j) && !this.j.isShowForwardEntrance())) {
                this.mForwardLayout.setVisibility(8);
                return;
            }
            this.mForwardLayout.setVisibility(0);
            this.mForwardCountView.setText(com.ss.android.ugc.aweme.newfollow.a.b.f(this.j));
        }
    }

    public void y() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62012, new Class[0], Void.TYPE);
            return;
        }
        switch (com.ss.android.ugc.aweme.newfollow.a.b.g(this.j)) {
            case 2:
                this.mShareCountView.setVisibility(0);
                this.mShareCountView.setTextSize(1, 10.0f);
                this.mShareCountView.setText(C0906R.string.drp);
                return;
            case 3:
                this.mShareCountView.setVisibility(0);
                this.mShareCountView.setTextSize(1, 12.0f);
                this.mShareCountView.setText(com.ss.android.ugc.aweme.newfollow.a.b.e(this.j));
                return;
            default:
                this.mShareCountView.setVisibility(8);
                return;
        }
    }

    private void ag() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62063, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j)) {
            boolean z3 = true;
            if (!com.ss.android.ugc.aweme.commercialize.utils.c.y(this.j) || ToolUtils.isInstalledApp(X(), com.ss.android.ugc.aweme.commercialize.utils.c.e(this.j))) {
                z2 = true;
            } else {
                z2 = false;
            }
            String openUrl = this.j.getAwemeRawAd().getOpenUrl();
            boolean b2 = g.b(openUrl);
            if (com.ss.android.ugc.aweme.commercialize.utils.c.b(openUrl)) {
                openUrl = com.ss.android.ugc.aweme.commercialize.utils.c.a(openUrl, Uri.parse("snssdk1128://adx").buildUpon().appendQueryParameter("tag", "result_ad").toString());
            } else {
                z3 = false;
            }
            if (!z2 || !b2 || !g.a(X(), openUrl, this.j, false, false)) {
                if (g.a(X(), this.j, com.ss.android.ugc.aweme.commercialize.utils.c.c(this.j), com.ss.android.ugc.aweme.commercialize.utils.c.d(this.j), this.j.getAwemeRawAd().isUseOrdinaryWeb(), false, 5)) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("open_url_h5").a(X());
                }
                return;
            }
            if (z3) {
                com.ss.android.ugc.aweme.commercialize.h.a().f38876a = this.j;
            }
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("open_url_app").a(X());
            g.a((g.a) new g(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.ss.android.ugc.aweme.newfollow.util.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.ss.android.ugc.aweme.forward.f.b} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.newfollow.util.d c() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = h
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.util.d> r7 = com.ss.android.ugc.aweme.newfollow.util.d.class
            r4 = 0
            r5 = 61987(0xf223, float:8.6862E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = h
            r5 = 0
            r6 = 61987(0xf223, float:8.6862E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.util.d> r8 = com.ss.android.ugc.aweme.newfollow.util.d.class
            r3 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.newfollow.util.d r0 = (com.ss.android.ugc.aweme.newfollow.util.d) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.forward.a.a r1 = r14.B
            java.lang.String r1 = r1.e()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.j
            java.lang.String r2 = r2.getAid()
            java.lang.String r1 = com.ss.android.ugc.aweme.newfollow.util.d.a(r1, r2)
            boolean r2 = r14.D
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.j
            if (r0 == 0) goto L_0x00c0
            com.ss.android.ugc.aweme.newfollow.util.d r0 = new com.ss.android.ugc.aweme.newfollow.util.d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.j
            com.ss.android.ugc.aweme.utils.bo r3 = new com.ss.android.ugc.aweme.utils.bo
            r3.<init>(r4)
            r0.<init>(r2, r3, r1)
            r3 = r0
            goto L_0x00b9
        L_0x0050:
            com.ss.android.ugc.aweme.newfollow.util.d r2 = new com.ss.android.ugc.aweme.newfollow.util.d
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.j
            com.ss.android.ugc.aweme.utils.bo r6 = new com.ss.android.ugc.aweme.utils.bo
            r7 = 256(0x100, float:3.59E-43)
            r6.<init>(r7)
            r2.<init>(r5, r6, r1)
            java.lang.String r5 = r14.F
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00b8
            com.ss.android.ugc.aweme.forward.f.c r5 = com.ss.android.ugc.aweme.forward.f.c.a()
            java.lang.String r13 = r14.F
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r13
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.forward.f.c.f48311a
            r9 = 0
            r10 = 45536(0xb1e0, float:6.381E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r0] = r7
            java.lang.Class<com.ss.android.ugc.aweme.forward.f.b> r12 = com.ss.android.ugc.aweme.forward.f.b.class
            r7 = r5
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x00a0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r0] = r13
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.forward.f.c.f48311a
            r9 = 0
            r10 = 45536(0xb1e0, float:6.381E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r11[r0] = r3
            java.lang.Class<com.ss.android.ugc.aweme.forward.f.b> r12 = com.ss.android.ugc.aweme.forward.f.b.class
            r7 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            r3 = r0
            com.ss.android.ugc.aweme.forward.f.b r3 = (com.ss.android.ugc.aweme.forward.f.b) r3
            goto L_0x00b2
        L_0x00a0:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.forward.f.b> r0 = r5.f48312b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a9
            goto L_0x00b2
        L_0x00a9:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.forward.f.b> r0 = r5.f48312b
            java.lang.Object r0 = r0.get(r13)
            r3 = r0
            com.ss.android.ugc.aweme.forward.f.b r3 = (com.ss.android.ugc.aweme.forward.f.b) r3
        L_0x00b2:
            if (r3 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.video.o r0 = r3.f48310d
            r2.i = r0
        L_0x00b8:
            r3 = r2
        L_0x00b9:
            com.ss.android.ugc.aweme.newfollow.util.e r0 = com.ss.android.ugc.aweme.newfollow.util.e.a()
            r0.a(r1, r3)
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder.c():com.ss.android.ugc.aweme.newfollow.util.d");
    }

    public final void Z() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62061, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.y(this.j)) {
            if (com.ss.android.g.a.a()) {
                if (!ToolUtils.isInstalledApp(X(), com.ss.android.ugc.aweme.commercialize.utils.c.e(this.j)) && g.a(X())) {
                    g.b(X(), com.ss.android.ugc.aweme.commercialize.utils.c.e(this.j));
                }
            } else if (!com.ss.android.ugc.aweme.app.c.a.c.a().b(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.j))) {
                com.ss.android.ugc.aweme.app.c.a.c.a().a(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.j), 2, com.ss.android.ugc.aweme.app.c.d.c.a("result_ad", this.j.getAwemeRawAd(), false), (com.ss.android.download.api.b.a) com.ss.android.ugc.aweme.app.c.d.b.a(this.j.getAwemeRawAd()));
            }
        }
        ag();
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.y(this.j) || ToolUtils.isInstalledApp(X(), com.ss.android.ugc.aweme.commercialize.utils.c.e(this.j)) || com.ss.android.ugc.aweme.app.c.a.c.a().b(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.j))) {
            d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("click");
            if (com.ss.android.ugc.aweme.commercialize.utils.c.y(this.j)) {
                str = "download_button";
            } else {
                str = "more_button";
            }
            b2.d(str).a(X());
        }
    }

    public void t() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61998, new Class[0], Void.TYPE);
            return;
        }
        if (this.j.getStatus() == null || !this.j.getStatus().isWithGoods() || this.j.getPromotion() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.mShoppingView.setVisibility(0);
            this.mShoppingView.setText(this.j.getPromotion().getShortTitle());
            if (this.j.getPromotion() != null) {
                x promotion = this.j.getPromotion();
                new ak().e(this.j.getAuthorUid()).a("video_cart_tag").b(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).d(this.r).c(this.j.getAid()).b();
                new al().f(this.j.getAuthorUid()).b("video_cart_tag").c(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).g(this.r).d(this.j.getAid()).e("video_play").h(null).a(this.r).b();
            }
        } else {
            this.mShoppingView.setVisibility(8);
        }
    }

    public void z() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62013, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() && !this.j.isHashTag()) {
            com.ss.android.ugc.aweme.newfollow.a.b.h(this.j);
        }
        this.mDescView.setMaxSize(PulishTitle.MAX_WORDS);
        String desc = this.j.getDesc();
        if (!TextUtils.isEmpty(desc)) {
            this.mDescView.setText(f(desc));
            this.mDescView.setVisibility(0);
            this.mDescView.setSpanSize(UIUtils.sp2px(X(), 15.0f));
            this.mDescView.setSpanStyle(1);
            this.mDescView.setOnSpanClickListener(new c(this));
            MentionTextView mentionTextView = this.mDescView;
            List<TextExtraStruct> textExtra = this.j.getTextExtra();
            AbTestManager.a();
            mentionTextView.a(textExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            this.mDescView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mDescView.setHighlightColor(this.mDescView.getResources().getColor(C0906R.color.a7l));
            return;
        }
        this.mDescView.setVisibility(8);
    }

    public void L() {
        HollowTextView hollowTextView;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62004, new Class[0], Void.TYPE);
            return;
        }
        if (this.p == null) {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 62003, new Class[0], HollowTextView.class)) {
                hollowTextView = (HollowTextView) PatchProxy.accessDispatch(new Object[0], this, h, false, 62003, new Class[0], HollowTextView.class);
            } else {
                HollowTextView.a aVar = new HollowTextView.a();
                aVar.f34948b = u.a(12.0d);
                aVar.f34949c = o.a(C0906R.color.hb);
                aVar.f34950d = u.a(4.0d);
                aVar.g = true;
                aVar.f34952f = true;
                aVar.h = true;
                aVar.f34951e = true;
                HollowTextView hollowTextView2 = new HollowTextView(X(), aVar);
                hollowTextView2.setPadding(u.a(5.0d), u.a(3.5d), u.a(5.0d), u.a(3.5d));
                hollowTextView = hollowTextView2;
            }
            this.p = hollowTextView;
        }
        this.mCouponContainer.removeAllViews();
        this.mCouponContainer.addView(this.p);
        if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.j)) {
            if (am.b(this.j)) {
                this.mCouponContainer.setVisibility(0);
                this.p.setVisibility(0);
                this.p.setText(X().getString(C0906R.string.cix));
            } else if (am.a(this.j)) {
                this.mCouponContainer.setVisibility(0);
                this.p.setVisibility(0);
                this.p.setText(X().getString(C0906R.string.aih));
            } else {
                this.mCouponContainer.setVisibility(8);
                this.mCouponContainer.removeAllViews();
            }
        } else if (am.a(this.j)) {
            this.mCouponContainer.setVisibility(0);
            this.p.setVisibility(0);
            this.p.setText(X().getString(C0906R.string.aih));
        } else {
            this.p.setVisibility(8);
            this.mCouponContainer.removeAllViews();
        }
    }

    public void n() {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61989, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            m();
            q();
            o();
            p();
            u();
            E_();
            z();
            v();
            A();
            L();
            s();
            t();
            f();
            if (PatchProxy.isSupport(new Object[0], this, h, false, 62001, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 62001, new Class[0], Void.TYPE);
            } else if (!(this.mFollow.getVisibility() != 0 || this.j == null || this.j.getAuthor() == null)) {
                this.f3672c.a(this.j.getAuthor());
            }
            if (PatchProxy.isSupport(new Object[0], this, h, false, 62057, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 62057, new Class[0], Void.TYPE);
                return;
            }
            Aweme aweme = this.j;
            boolean t2 = com.ss.android.ugc.aweme.commercialize.utils.c.t(aweme);
            if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(t2 ? (byte) 1 : 0)}, this, h, false, 62058, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(t2)}, this, h, false, 62058, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            TextView textView = (TextView) this.itemView.findViewById(C0906R.id.d1);
            if (textView != null) {
                if (t2) {
                    AwemeTextLabelModel label = aweme.getAwemeRawAd().getLabel();
                    if (label != null) {
                        textView.setVisibility(0);
                        if (TextUtils.isEmpty(label.getTextColor())) {
                            i2 = -1;
                        } else {
                            i2 = Color.parseColor(label.getTextColor());
                        }
                        textView.setTextColor(i2);
                        if (TextUtils.isEmpty(label.getBgColor())) {
                            i3 = ContextCompat.getColor(X(), C0906R.color.ry);
                        } else {
                            i3 = Color.parseColor(label.getBgColor());
                        }
                        textView.setBackgroundDrawable(v.a(i3, (float) u.a(2.0d)));
                        textView.setText(label.getLabelName());
                        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 62059, new Class[]{Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 62059, new Class[]{Aweme.class}, Void.TYPE);
                        } else {
                            af();
                            this.U = com.ss.android.ugc.aweme.commercialize.utils.c.a(aweme);
                            if (this.U != null) {
                                com.ss.android.ugc.aweme.app.c.a.c.a().a(hashCode(), T, (c) com.ss.android.ugc.aweme.app.c.d.d.a(X(), this.j, true, "result_ad"));
                            }
                            return;
                        }
                    }
                }
                textView.setVisibility(8);
            }
        }
    }

    public void q() {
        UrlModel urlModel;
        UrlModel urlModel2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61992, new Class[0], Void.TYPE);
            return;
        }
        b();
        String str = null;
        if (this.j.getAuthor() != null) {
            r();
            if (this.D) {
                this.mHeaderLayout.setVisibility(0);
                if (this.m == null) {
                    if (this.j.getAuthor() == null || !this.j.getAuthor().isLive()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.m = new com.ss.android.ugc.aweme.feed.ui.a(z2, this.mAvatarLiveView, this.mAvatarView, this.mAvatarBorderView);
                }
                if (this.V == null) {
                    this.V = new Consumer<com.ss.android.ugc.aweme.live.feedpage.b>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f57458a;

                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
                            if (PatchProxy.isSupport(new Object[]{bVar}, this, f57458a, false, 62084, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bVar}, this, f57458a, false, 62084, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                                return;
                            }
                            if (TextUtils.equals(BaseFollowViewHolder.this.j.getAuthor().getUid(), String.valueOf(bVar.f53380a))) {
                                BaseFollowViewHolder.this.j.getAuthor().roomId = bVar.f53381b;
                                if (!BaseFollowViewHolder.this.j.getAuthor().isLive()) {
                                    BaseFollowViewHolder.this.q();
                                }
                            }
                        }
                    };
                }
                if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.j)) {
                    a(this.j.getAuthor(), false, this.j.getAid());
                    AvatarImageView avatarImageView = this.mAvatarLiveView;
                    if (this.j.getAuthor() == null) {
                        urlModel2 = null;
                    } else {
                        urlModel2 = this.j.getAuthor().getAvatarThumb();
                    }
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) avatarImageView, urlModel2, this.avatarSize, this.avatarSize);
                    com.ss.android.ugc.aweme.newfollow.g.a.c(this.j);
                } else {
                    a(this.j.getAuthor(), false, this.j.getAid());
                    AvatarImageView avatarImageView2 = this.mAvatarView;
                    if (this.j.getAuthor() == null) {
                        urlModel = null;
                    } else {
                        urlModel = this.j.getAuthor().getAvatarThumb();
                    }
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) avatarImageView2, urlModel, this.avatarSize, this.avatarSize);
                }
                this.m.a(this.j.getAuthor(), getClass(), this.V);
            } else {
                this.mHeaderLayout.setVisibility(8);
            }
        }
        if (this.j.getAuthor() != null) {
            if (this.j.getAuthor() != null) {
                str = this.j.getAuthor().getRemarkName();
            }
            if (!TextUtils.isEmpty(str)) {
                this.mHeadUserNameView.setText(this.j.getAuthor().getRemarkName());
            } else {
                this.mHeadUserNameView.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), this.j.getAuthor().getNickname(), this.j.getNicknamePosition()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(View view) {
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j) || !a("name")) {
            if (this.n != null) {
                this.n.b(view, this.itemView, this.j, this.j.getAuthor());
            }
            aa.b(X(), this.o);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(boolean z2) {
        String str;
        d.b a2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad");
        if (z2) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a2.b(str).a(X());
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, h, false, 62046, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, h, false, 62046, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 0) {
            W();
        }
    }

    public final void c(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, h, false, 62022, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, h, false, 62022, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.A.b(aweme2);
    }

    @OnClick({2131495247})
    @Optional
    public void clickLike(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62020, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62020, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!this.A.g) {
            aa.c(X(), this.o);
        }
        this.A.a(d());
    }

    @OnClick({2131498141})
    @Optional
    public void clickShopping(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62021, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62021, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.a.a(this.mShoppingView);
        if (this.n != null) {
            this.n.d(view, this.itemView, this.j);
        }
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, h, false, 62049, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, h, false, 62049, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.a(0);
        this.f3671b = true;
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62043, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62043, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.C = true;
        this.w.a(this.M);
        M();
        this.f3674e = false;
        this.f3675f = false;
        ad();
        ae();
        bg.c(this);
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62044, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62044, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.C = false;
        ab();
        this.w.b(this.M);
        this.x.removeCallbacksAndMessages(null);
        if (this.mDiggLayout != null) {
            this.mDiggLayout.removeAllViews();
        }
        af();
        bg.d(this);
    }

    private boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 62062, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 62062, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j)) {
            return false;
        } else {
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("click_source").a(X());
            if (com.ss.android.ugc.aweme.commercialize.utils.c.H(this.j)) {
                ag();
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("click").a(X());
                return true;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.c.x(this.j)) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("click").a(X());
            }
            return false;
        }
    }

    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 62032, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 62032, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 62048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 62048, new Class[0], Void.TYPE);
        } else if (!(this.j == null || this.j.getAuthor() == null || !this.j.getAuthor().isLive())) {
            User author = this.j.getAuthor();
            com.ss.android.ugc.aweme.story.live.b.b(X(), 0, author.getRequestId(), author.getUid(), author.roomId, d());
            com.ss.android.ugc.aweme.story.live.b.a(author.getUid(), author.roomId, d(), "video_head", author.getRequestId(), -1, com.ss.android.g.a.b(), this.j.getAid());
        }
        g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(View view) {
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j) && a("photo")) {
                return;
            }
            if (!e() || this.J == null || !this.J.b()) {
                if (this.n != null) {
                    this.n.a(view, this.itemView, this.j, this.j.getAuthor());
                }
                aa.b(X(), this.o);
            }
        }
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 62050, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 62050, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.b(i2);
        this.f3671b = true;
    }

    @OnClick({2131495239})
    @Optional
    public void expandComment(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62018, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62018, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.a.a(this.mCommentView);
        if (this.n != null) {
            this.n.a(this.itemView, this.j, this.f3671b, "click_comment_icon");
        }
        Context X = X();
        aa.a aVar = this.o;
        if (PatchProxy.isSupport(new Object[]{X, aVar}, null, aa.f39286a, true, 31859, new Class[]{Context.class, aa.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{X, aVar}, null, aa.f39286a, true, 31859, new Class[]{Context.class, aa.a.class}, Void.TYPE);
            return;
        }
        aa.a(X, aVar, "safety_video_comment");
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 62051, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 62051, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.c(i2);
        this.f3671b = true;
    }

    @Subscribe
    public void onForwardResultEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        com.ss.android.ugc.aweme.forward.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, h, false, 62064, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, h, false, 62064, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar2.f48270d == this.j && com.ss.android.ugc.aweme.commercialize.utils.c.t(aVar2.f48270d)) {
            Context X = X();
            aa.a aVar3 = this.o;
            if (PatchProxy.isSupport(new Object[]{X, aVar3}, null, aa.f39286a, true, 31861, new Class[]{Context.class, aa.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{X, aVar3}, null, aa.f39286a, true, 31861, new Class[]{Context.class, aa.a.class}, Void.TYPE);
            } else {
                aa.a(X, aVar3, "safety_video_repost");
            }
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("repost").a(X());
        }
    }

    @OnClick({2131495254})
    @Optional
    public void showCreateForward(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 62017, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 62017, new Class[]{View.class}, Void.TYPE);
        } else if (!TimeLockRuler.isEnableShowTeenageTip(C0906R.string.ci1)) {
            if (this.j == null || !this.j.getAwemeControl().canForward()) {
                com.bytedance.ies.dmt.ui.d.a.c(X(), (int) C0906R.string.a21).a();
            } else if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j)) {
                com.bytedance.ies.dmt.ui.d.a.c(X(), (int) C0906R.string.c_).a();
            } else {
                com.ss.android.ugc.aweme.newfollow.util.a.a(this.mIvForward);
                if (this.n != null) {
                    this.n.a(this.j);
                }
            }
        }
    }

    @OnClick({2131495300})
    @Optional
    public void showShare(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, h, false, 62019, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, h, false, 62019, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.a.a(this.mShareView);
        if (this.n != null) {
            this.n.c(view2, this.itemView, this.j);
        }
        Context X = X();
        aa.a aVar = this.o;
        if (PatchProxy.isSupport(new Object[]{X, aVar}, null, aa.f39286a, true, 31860, new Class[]{Context.class, aa.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{X, aVar}, null, aa.f39286a, true, 31860, new Class[]{Context.class, aa.a.class}, Void.TYPE);
            return;
        }
        aa.a(X, aVar, "safety_video_share");
    }

    public void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, h, false, 62038, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, h, false, 62038, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().Q()) {
            this.x.postDelayed(this.N, j2);
        }
    }

    public final void b(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 62045, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 62045, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null && aweme.getStatus() != null) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                if (this.j != null) {
                    str = this.j.getAid();
                } else {
                    str = "";
                }
                com.ss.android.ugc.aweme.login.e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), this.r, "click_like", ad.a().a("group_id", str).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(str)).f75487b);
                return;
            }
            com.ss.android.ugc.aweme.forward.f.a aVar = this.A;
            if (PatchProxy.isSupport(new Object[]{aweme}, aVar, com.ss.android.ugc.aweme.forward.f.a.f48292a, false, 45524, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, aVar, com.ss.android.ugc.aweme.forward.f.a.f48292a, false, 45524, new Class[]{Aweme.class}, Void.TYPE);
            } else if (aweme != null && aweme.getStatus() != null && NetworkUtils.isNetworkAvailable(aVar.h) && aweme.getUserDigg() == 0 && aweme.isCanPlay() && !aweme.getStatus().isDelete() && aweme.getStatus().getPrivateStatus() != 1 && !aVar.g) {
                aVar.f48295d++;
                aVar.a(true);
                if (aVar.f48297f != null) {
                    aVar.f48297f.a(aVar.i, 1);
                }
                if (!com.ss.android.ugc.aweme.theme.a.a(aVar.h)) {
                    aVar.a();
                }
            }
            if (!this.A.g) {
                aa.c(X(), this.o);
            }
            if (aweme.getStatus().getPrivateStatus() != 1) {
                this.mDiggLayout.a(this.P.getX(), this.P.getY());
            }
        }
    }

    public final SpannableString f(String str) {
        SpannableString spannableString;
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4}, this, h, false, 62014, new Class[]{String.class}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{str4}, this, h, false, 62014, new Class[]{String.class}, SpannableString.class);
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.j) && !TextUtils.isEmpty(this.j.getAwemeRawAd().getButtonText())) {
            if (str.length() > PulishTitle.MAX_WORDS) {
                String substring = str4.substring(0, PulishTitle.MAX_WORDS - 3);
                str3 = substring + "...";
            } else {
                str3 = str4;
            }
            com.ss.android.ugc.aweme.feed.widget.f fVar = new com.ss.android.ugc.aweme.feed.widget.f(X(), C0906R.color.bz, this.j.getAwemeRawAd().getButtonText(), 2130839479, 20);
            spannableString = com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), str3 + " [t]", this.j.getPosition());
            h.a(spannableString, new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57460a;

                public final void onClick(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57460a, false, 62085, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57460a, false, 62085, new Class[]{View.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        BaseFollowViewHolder.this.Z();
                    }
                }
            }, str3.length() + 1, str3.length() + 4, 17);
            h.a(spannableString, fVar, str3.length() + 1, str3.length() + 4, 17);
            this.mDescView.setMaxSize(spannableString.length());
        } else if (com.ss.android.ugc.aweme.longvideo.b.b.a(this.j)) {
            if (str.length() > PulishTitle.MAX_WORDS) {
                String substring2 = str4.substring(0, PulishTitle.MAX_WORDS - 3);
                str2 = substring2 + "...";
            } else {
                str2 = str4;
            }
            spannableString = com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), str2 + " [r]", this.j.getPosition());
            com.ss.android.ugc.aweme.feed.widget.e eVar = new com.ss.android.ugc.aweme.feed.widget.e(this.itemView.getContext(), C0906R.color.bz, String.format(this.itemView.getContext().getString(C0906R.string.aik), new Object[]{com.ss.android.ugc.aweme.longvideo.b.b.b(this.j)}), 2130839649);
            h.a(spannableString, new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57462a;

                public final void onClick(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57462a, false, 62086, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57462a, false, 62086, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        com.ss.android.ugc.aweme.longvideo.e.a(BaseFollowViewHolder.this.itemView.getContext(), BaseFollowViewHolder.this.j, BaseFollowViewHolder.this.r, BaseFollowViewHolder.this.s);
                    }
                }
            }, str2.length() + 1, str2.length() + 4, 17);
            h.a(spannableString, eVar, str2.length() + 1, str2.length() + 4, 17);
            this.mDescView.setMaxSize(spannableString.length());
            r.a("show_complete_video_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("log_pb", ai.a().a(this.j.getAid())).a("local_time_ms", System.currentTimeMillis()).a("enter_from", this.r).a("group_id", this.j.getAid()).f34114b);
        } else {
            spannableString = com.ss.android.ugc.aweme.base.utils.a.a(this.itemView.getContext(), str4, this.j.getPosition());
        }
        return spannableString;
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, h, false, 61981, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, h, false, 61981, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        a(view2, f2, 0.0f);
    }

    private void a(User user, boolean z2, String str) {
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{user2, (byte) 0, str2}, this, h, false, 61994, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, (byte) 0, str2}, this, h, false, 61994, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (!e() || this.J == null) {
            if (this.mStoryRing != null) {
                this.mStoryRing.setVisibility(8);
            }
        } else {
            this.J.a(user, false, str2);
        }
    }

    public final void a(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, h, false, 61982, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, h, false, 61982, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) UIUtils.dip2Px(X(), f2);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(X(), f3);
    }

    public BaseFollowViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout);
        this.B = aVar;
        this.w = lVar;
        this.x = new WeakHandler(Looper.getMainLooper(), this);
        b((View) followFeedLayout);
        a((View) followFeedLayout);
        ButterKnife.bind((Object) this, (View) followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        H();
        a(followFeedLayout);
        this.f3672c = new com.ss.android.ugc.aweme.follow.widet.a(this.mFollow, new a.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57456a;

            public final String a() {
                if (!PatchProxy.isSupport(new Object[0], this, f57456a, false, 62082, new Class[0], String.class)) {
                    return BaseFollowViewHolder.this.d();
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f57456a, false, 62082, new Class[0], String.class);
            }

            public final void a(int i, User user) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f57456a, false, 62083, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f57456a, false, 62083, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                    return;
                }
                if (BaseFollowViewHolder.this.n != null) {
                    BaseFollowViewHolder.this.n.b(BaseFollowViewHolder.this.j);
                }
            }
        });
        this.f3670a = aVar2;
        if (this.mPressLayout != null) {
            this.mPressLayout.setTapListener(this.R);
            this.mPressLayout.setDisabilityOnClickListener(new a(this));
        }
        if (this.mDiggView != null) {
            com.ss.android.ugc.aweme.forward.f.a aVar3 = new com.ss.android.ugc.aweme.forward.f.a(aVar.d(), this.mDiggView, this.mDiggCountView, aVar2, j());
            this.A = aVar3;
        }
        if (!(com.ss.android.g.a.a() || this.mStoryRing == null || this.mAvatarLoadingView == null)) {
            this.K = (h) ServiceManager.get().getService(h.class);
            this.J = this.K.a(this.mAvatarView, this.mStoryRing, this.mAvatarLoadingView);
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 61979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 61979, new Class[0], Void.TYPE);
        } else {
            this.L = WidgetManager.a((FragmentActivity) X(), this.itemView);
        }
        i();
    }

    public final void a(View view, float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, h, false, 61983, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, h, false, 61983, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) UIUtils.dip2Px(X(), f2);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(X(), f3);
        layoutParams.leftMargin = (int) UIUtils.dip2Px(X(), f4);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(X(), f5);
    }
}
