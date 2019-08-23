package com.ss.android.ugc.aweme.forward.vh;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
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
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.forward.b.c;
import com.ss.android.ugc.aweme.forward.d.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.b.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.util.f;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.w;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.MentionTextView;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseForwardViewHolder extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, WeakHandler.IHandler, c.b, b, w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48316a;
    private a A;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> B;
    @BindDimen(2131231022)
    int avatarSize;

    /* renamed from: b  reason: collision with root package name */
    protected bo f48317b = new bo(1);

    /* renamed from: c  reason: collision with root package name */
    public BaseFollowViewHolder.a f48318c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f48319d;

    /* renamed from: e  reason: collision with root package name */
    protected WeakHandler f48320e;

    /* renamed from: f  reason: collision with root package name */
    protected List<User> f48321f;
    public boolean g;
    protected com.ss.android.ugc.aweme.forward.f.a h;
    public String i;
    protected boolean j;
    protected com.ss.android.ugc.aweme.story.api.b.b k;
    protected h l;
    protected WidgetManager m;
    @BindView(2131498380)
    LiveCircleView mAuthorAvatarBorderView;
    @BindView(2131498345)
    protected AvatarImageView mAuthorAvatarImageView;
    @BindView(2131495235)
    ViewGroup mAuthorAvatarLayout;
    @BindView(2131498352)
    AvatarImageView mAuthorAvatarLiveView;
    @BindView(2131498222)
    TextView mAuthorNameView;
    @Nullable
    @BindView(2131493191)
    AnimationImageView mAvatarLoadingView;
    @Nullable
    @BindView(2131497802)
    TextView mAwemeStatusView;
    @BindView(2131493327)
    View mBottomDivider;
    @BindView(2131497849)
    TextView mCommentCountView;
    @Nullable
    @BindView(2131495251)
    public FollowFeedCommentLayout mCommentLayout;
    @BindView(2131494991)
    ImageView mCommentView;
    @BindView(2131497877)
    protected TextView mCreateTimeView;
    @BindView(2131497894)
    TextView mDiggCountView;
    @Nullable
    @BindView(2131493960)
    DiggLayout mDiggLayout;
    @BindView(2131493955)
    ImageView mDiggView;
    @BindView(2131494347)
    FollowUserBtn mFollow;
    @Nullable
    @BindView(2131497920)
    TextView mForwardCountView;
    @BindView(2131497886)
    MentionTextView mForwardDescView;
    @BindView(2131495255)
    protected ViewGroup mForwardHeaderLayout;
    @Nullable
    @BindView(2131495254)
    protected ViewGroup mForwardLayout;
    @Nullable
    @BindView(2131495033)
    ImageView mForwardView;
    @Nullable
    @BindView(2131498181)
    TextView mFriendTagView;
    @Nullable
    @BindView(2131495023)
    protected ImageView mIvExtraBtn;
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
    public ImageView mShareView;
    @Nullable
    @BindView(2131497359)
    StoryCircleView mStoryRing;
    @BindView(2131497656)
    View mTopDivider;
    public c.a n = new d();
    public boolean o = false;
    public MotionEvent p;
    public MotionEvent q;
    protected View.OnTouchListener r = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48329a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f48329a, false, 45605, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f48329a, false, 45605, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            switch (motionEvent.getAction()) {
                case 0:
                    if (BaseForwardViewHolder.this.f48320e.hasMessages(0)) {
                        BaseForwardViewHolder.this.f48320e.removeMessages(0);
                    }
                    if (f.a(BaseForwardViewHolder.this.p, BaseForwardViewHolder.this.q, motionEvent, BaseForwardViewHolder.this.c())) {
                        BaseForwardViewHolder.this.o = true;
                        BaseForwardViewHolder.this.b(BaseForwardViewHolder.this.f48319d);
                    } else {
                        BaseForwardViewHolder.this.o = false;
                    }
                    if (BaseForwardViewHolder.this.p != null) {
                        BaseForwardViewHolder.this.p.recycle();
                    }
                    BaseForwardViewHolder.this.p = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!BaseForwardViewHolder.this.o && BaseForwardViewHolder.this.p != null && !f.a(0, BaseForwardViewHolder.this.p, motionEvent, BaseForwardViewHolder.this.c())) {
                        BaseForwardViewHolder.this.f48320e.sendMessageDelayed(BaseForwardViewHolder.this.f48320e.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + BaseForwardViewHolder.this.p.getEventTime());
                    }
                    if (BaseForwardViewHolder.this.q != null) {
                        BaseForwardViewHolder.this.q.recycle();
                    }
                    BaseForwardViewHolder.this.q = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (f.a(0, BaseForwardViewHolder.this.p, motionEvent, BaseForwardViewHolder.this.c())) {
                        BaseForwardViewHolder.this.f48320e.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };
    private Context s;
    private Rect t = new Rect();
    private int[] u = new int[2];
    private com.ss.android.ugc.aweme.feed.ui.a v;
    private List<Comment> w;
    private boolean x;
    private com.ss.android.ugc.aweme.forward.a.a y;
    private boolean z = true;

    public void B() {
    }

    public abstract void I();

    public void J() {
    }

    public final void M_() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45596, new Class[0], Void.TYPE);
        }
    }

    public void a(View view) {
    }

    public void b(View view) {
    }

    public void l() {
    }

    public void r() {
    }

    public boolean s() {
        return false;
    }

    public void y() {
    }

    public final com.ss.android.ugc.aweme.forward.a.a b() {
        return this.y;
    }

    public final Context c() {
        return this.s;
    }

    public final bo n() {
        return this.f48317b;
    }

    public String t() {
        return this.i;
    }

    public final void a(final com.ss.android.ugc.aweme.newfollow.e.b bVar, com.ss.android.ugc.aweme.newfollow.e.b bVar2) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, f48316a, false, 45541, new Class[]{com.ss.android.ugc.aweme.newfollow.e.b.class, com.ss.android.ugc.aweme.newfollow.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, f48316a, false, 45541, new Class[]{com.ss.android.ugc.aweme.newfollow.e.b.class, com.ss.android.ugc.aweme.newfollow.e.b.class}, Void.TYPE);
            return;
        }
        boolean z3 = bVar instanceof FollowFeed;
        if (z3) {
            FollowFeed followFeed = (FollowFeed) bVar;
            String recommendReason = followFeed.getRecommendReason();
            int hasMoreRecommendFeed = followFeed.getHasMoreRecommendFeed();
            int hasMoreRecommendFeed2 = bVar2 instanceof FollowFeed ? ((FollowFeed) bVar2).getHasMoreRecommendFeed() : 0;
            this.j = !TextUtils.isEmpty(recommendReason);
            int i2 = 8;
            if (this.j) {
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
                    this.mRecommendFeedLayout.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f48324a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f48324a, false, 45603, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f48324a, false, 45603, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (BaseForwardViewHolder.this.c() != null) {
                                RecommendFollowFeedActivity.a(BaseForwardViewHolder.this.c());
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
                this.z = z2;
                return;
            }
            this.mRecommendFeedLayout.setVisibility(0);
            this.mLookMoreView.setVisibility(8);
            this.mTopDivider.setVisibility(0);
            this.mBottomDivider.setVisibility(8);
            if (hasMoreRecommendFeed2 <= 0) {
                z2 = true;
            }
            this.z = z2;
        }
    }

    public void a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        Aweme aweme2 = aweme;
        List<Comment> list3 = list;
        List<User> list4 = list2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, list3, list4, str3, str4}, this, f48316a, false, 45545, new Class[]{Aweme.class, List.class, List.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list3, list4, str3, str4}, this, f48316a, false, 45545, new Class[]{Aweme.class, List.class, List.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null && !TextUtils.isEmpty(str)) {
            this.i = str3;
            this.f48319d = aweme2;
            this.w = list3;
            this.f48321f = list4;
            this.n.a(aweme2, str3, str4);
            u();
            this.x = false;
        }
    }

    public void a(MentionTextView mentionTextView, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{mentionTextView, aweme}, this, f48316a, false, 45564, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView, aweme}, this, f48316a, false, 45564, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(aweme);
            }
            if (!TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView.setText(aweme.getDesc());
                mentionTextView.setVisibility(0);
                g.a((TextView) mentionTextView);
                mentionTextView.setSpanSize(UIUtils.sp2px(this.s, 15.0f));
                mentionTextView.setSpanStyle(1);
                mentionTextView.setHighlightColor(mentionTextView.getResources().getColor(C0906R.color.a7l));
                mentionTextView.setOnSpanClickListener(new c(this));
                List<TextExtraStruct> textExtra = aweme.getTextExtra();
                AbTestManager.a();
                mentionTextView.a(textExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
                mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            mentionTextView.setVisibility(8);
        }
    }

    public void a(View view, int i2, int i3) {
        View view2 = view;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48316a, false, 45575, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48316a, false, 45575, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        float f2 = ((float) i4) / ((float) i5);
        int screenWidth = UIUtils.getScreenWidth(this.s);
        float dip2Px = UIUtils.dip2Px(this.s, 16.0f);
        if (i4 > i5) {
            iArr[0] = (int) (((float) screenWidth) - (dip2Px * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) / f2);
        } else {
            iArr[0] = (int) (((float) screenWidth) - (dip2Px * 2.0f));
            iArr[1] = iArr[0];
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = iArr[0];
        marginLayoutParams.height = iArr[1];
        marginLayoutParams.setMargins(0, 0, 0, 0);
        view2.setLayoutParams(marginLayoutParams);
    }

    public final void a(AwemeStatus awemeStatus, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{awemeStatus, urlModel}, this, f48316a, false, 45594, new Class[]{AwemeStatus.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeStatus, urlModel}, this, f48316a, false, 45594, new Class[]{AwemeStatus.class, UrlModel.class}, Void.TYPE);
        } else if (this.f48319d.getAwemeType() == 13 && this.f48319d.getForwardItem() != null) {
            if (this.f48319d.getForwardItem().getStatus() != null) {
                this.f48319d.getForwardItem().getStatus().setPrivateStatus(awemeStatus.getPrivateStatus());
            }
            this.f48319d.getForwardItem().setLabelPrivate(urlModel);
            if (PatchProxy.isSupport(new Object[]{urlModel}, this, f48316a, false, 45595, new Class[]{UrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{urlModel}, this, f48316a, false, 45595, new Class[]{UrlModel.class}, Void.TYPE);
                return;
            }
            AwemeLabelModel awemeLabelModel = null;
            if (urlModel != null) {
                awemeLabelModel = new AwemeLabelModel();
                awemeLabelModel.setLabelType(1);
                awemeLabelModel.setUrlModels(urlModel);
            }
            Aweme forwardItem = this.f48319d.getForwardItem();
            if (!(forwardItem == null || forwardItem.videoLabels == null)) {
                if (forwardItem.videoLabels.size() == 0) {
                    forwardItem.videoLabels.add(0, awemeLabelModel);
                    return;
                }
                forwardItem.videoLabels.set(0, awemeLabelModel);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void M() {
        this.f48320e.sendMessage(this.f48320e.obtainMessage(0));
    }

    public void B_() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45574, new Class[0], Void.TYPE);
            return;
        }
        this.n.d();
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45559, new Class[0], Void.TYPE);
            return;
        }
        if (this.mDiggLayout != null) {
            this.mDiggLayout.removeAllViews();
        }
        this.h.a(this.f48319d);
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45563, new Class[0], Void.TYPE);
            return;
        }
        if (s() && this.mCommentLayout != null) {
            this.mCommentLayout.d();
        }
        C();
    }

    @OnClick({2131495023})
    @Optional
    public void clickExtra() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45578, new Class[0], Void.TYPE);
            return;
        }
        List<String> K = K();
        if (this.f48318c != null) {
            this.f48318c.a(this.f48319d, K);
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45573, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45573, new Class[0], Void.TYPE);
            return;
        }
        this.n.a();
    }

    public final boolean g() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45587, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45587, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.g && this.y.b()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f48316a, false, 45588, new Class[0], Boolean.TYPE)) {
            return this.y.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45588, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45568, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48317b.c(1)) {
            this.mCommentLayout.a();
        }
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45546, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.e();
        }
    }

    public void m() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45547, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.f();
        }
    }

    public void w() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45551, new Class[0], Void.TYPE);
            return;
        }
        this.mCreateTimeView.setText(eo.a(this.s, this.f48319d.getCreateTime() * 1000));
    }

    public void x() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45553, new Class[0], Void.TYPE);
            return;
        }
        C();
        if (!s()) {
            E();
            F();
        }
        D();
    }

    public void z() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45555, new Class[0], Void.TYPE);
        } else if (!this.f48317b.c(1) || !this.z) {
            this.mLineDivider.setVisibility(8);
        } else {
            this.mLineDivider.setVisibility(0);
        }
    }

    private boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45558, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45558, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.i, "homepage_follow") || TextUtils.equals(this.i, "homepage_friends")) {
            return true;
        } else {
            return false;
        }
    }

    public void D() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45560, new Class[0], Void.TYPE);
        } else if (!this.f48319d.isShowForwardEntrance() || !AbTestManager.a().M()) {
            this.mForwardLayout.setVisibility(8);
        } else {
            this.mForwardLayout.setVisibility(0);
            this.mForwardCountView.setText(com.ss.android.ugc.aweme.newfollow.a.b.f(this.f48319d));
        }
    }

    public final void F() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45562, new Class[0], Void.TYPE);
            return;
        }
        if (!s()) {
            String d2 = com.ss.android.ugc.aweme.newfollow.a.b.d(this.f48319d);
            if (!TextUtils.isEmpty(d2)) {
                this.mCommentCountView.setText(d2);
            }
        } else if (this.mCommentLayout != null) {
            this.mCommentLayout.c();
        }
    }

    public List<String> K() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45577, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45577, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (s()) {
            arrayList.add(c().getString(C0906R.string.c65));
        }
        if (!ex.a(this.f48319d) && ex.b(this.f48319d)) {
            arrayList.add(c().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    @OnClick({2131495231})
    public void addComment() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45584, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48318c != null) {
            if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c(c(), (int) C0906R.string.chv).a();
                return;
            }
            this.f48318c.a(this.itemView, this.f48319d);
        }
    }

    public final Rect i() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45576, new Class[0], Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45576, new Class[0], Rect.class);
        }
        this.itemView.getLocationOnScreen(this.u);
        this.t.set(this.u[0], this.u[1], this.u[0] + this.itemView.getWidth(), this.u[1] + this.itemView.getHeight());
        return this.t;
    }

    public void v() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45550, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIvExtraBtn != null) {
            if (this.j || com.ss.android.g.a.a()) {
                this.mIvExtraBtn.setVisibility(8);
            } else if (((b().a() instanceof FollowFeedAdapter) || (b().a() instanceof UserStateFeedAdapter)) && !com.ss.android.ugc.aweme.newfollow.a.b.c(this.f48319d)) {
                this.mIvExtraBtn.setVisibility(0);
            } else {
                this.mIvExtraBtn.setVisibility(8);
            }
        }
    }

    public void E() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45561, new Class[0], Void.TYPE);
        } else if (this.mShareView != null && this.f48319d.getAuthor() != null) {
            if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.f48319d)) {
                this.mShareView.setImageResource(2130839644);
            } else {
                this.mShareView.setImageResource(2130838974);
            }
            if (com.ss.android.ugc.aweme.newfollow.a.b.b(this.f48319d)) {
                this.mShareView.setAlpha(0.5f);
                this.mShareView.setEnabled(false);
            } else {
                this.mShareView.setAlpha(1.0f);
                this.mShareView.setEnabled(true);
            }
            switch (com.ss.android.ugc.aweme.newfollow.a.b.g(this.f48319d)) {
                case 2:
                    this.mShareCountView.setVisibility(0);
                    this.mShareCountView.setTextSize(1, 10.0f);
                    this.mShareCountView.setText(C0906R.string.drp);
                    return;
                case 3:
                    this.mShareCountView.setVisibility(0);
                    this.mShareCountView.setTextSize(1, 12.0f);
                    this.mShareCountView.setText(com.ss.android.ugc.aweme.newfollow.a.b.e(this.f48319d));
                    return;
                default:
                    this.mShareCountView.setVisibility(8);
                    return;
            }
        }
    }

    public String H() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45567, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45567, new Class[0], String.class);
        } else if (this.f48319d.getForwardItem() == null || this.f48319d.getForwardItem().getAuthor() == null) {
            return "";
        } else {
            if (!TextUtils.isEmpty(this.f48319d.getForwardItem().getAuthor().getRemarkName())) {
                str = "@" + this.f48319d.getForwardItem().getAuthor().getRemarkName() + ": ";
            } else {
                str = "@" + this.f48319d.getForwardItem().getAuthor().getNickname() + ": ";
            }
            return str;
        }
    }

    public void L() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45593, new Class[0], Void.TYPE);
        } else if (this.mAwemeStatusView != null) {
            if (this.f48319d.getAwemeType() != 13 || this.f48319d.getForwardItem() == null) {
                this.mAwemeStatusView.setVisibility(8);
            } else if (com.ss.android.ugc.aweme.newfollow.a.b.c(this.f48319d.getForwardItem())) {
                if (am.b(this.f48319d.getForwardItem())) {
                    this.mAwemeStatusView.setVisibility(0);
                    this.mAwemeStatusView.setText(c().getString(C0906R.string.cix));
                } else if (am.a(this.f48319d.getForwardItem())) {
                    this.mAwemeStatusView.setVisibility(0);
                    this.mAwemeStatusView.setText(c().getString(C0906R.string.aih));
                } else {
                    this.mAwemeStatusView.setVisibility(8);
                }
            } else if (!am.a(this.f48319d.getForwardItem()) || !am.c(this.f48319d.getForwardItem())) {
                this.mAwemeStatusView.setVisibility(8);
            } else {
                this.mAwemeStatusView.setVisibility(0);
                this.mAwemeStatusView.setText(c().getString(C0906R.string.aih));
            }
        }
    }

    @CallSuper
    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45556, new Class[0], Void.TYPE);
            return;
        }
        boolean z2 = true;
        if (this.f48317b.c(1)) {
            this.mAuthorAvatarLayout.setVisibility(0);
            if (this.v == null) {
                if (this.f48319d.getAuthor() == null || !this.f48319d.getAuthor().isLive()) {
                    z2 = false;
                }
                this.v = new com.ss.android.ugc.aweme.feed.ui.a(z2, this.mAuthorAvatarLiveView, this.mAuthorAvatarImageView, this.mAuthorAvatarBorderView);
            }
            if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.f48319d)) {
                a(this.f48319d.getAuthor(), false, this.f48319d.getAid());
                if (this.f48319d.getAuthor() != null) {
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mAuthorAvatarLiveView, this.f48319d.getAuthor().getAvatarThumb(), this.avatarSize, this.avatarSize);
                }
                com.ss.android.ugc.aweme.newfollow.g.a.c(this.f48319d);
            } else {
                a(this.f48319d.getAuthor(), false, this.f48319d.getAid());
                if (this.f48319d.getAuthor() != null) {
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mAuthorAvatarImageView, this.f48319d.getAuthor().getAvatarThumb(), this.avatarSize, this.avatarSize);
                }
            }
            if (this.B == null) {
                this.B = new Consumer<com.ss.android.ugc.aweme.live.feedpage.b>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48327a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48327a, false, 45604, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f48327a, false, 45604, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                            return;
                        }
                        if (TextUtils.equals(BaseForwardViewHolder.this.f48319d.getAuthor().getUid(), String.valueOf(bVar.f53380a))) {
                            BaseForwardViewHolder.this.f48319d.getAuthor().roomId = bVar.f53381b;
                            if (!BaseForwardViewHolder.this.f48319d.getAuthor().isLive()) {
                                BaseForwardViewHolder.this.A();
                            }
                        }
                    }
                };
            }
            this.v.a(this.f48319d.getAuthor(), getClass(), this.B);
            if (this.f48319d.getAuthor() != null) {
                if (TextUtils.isEmpty(this.f48319d.getAuthor().getRemarkName())) {
                    this.mAuthorNameView.setText(this.f48319d.getAuthor().getNickname());
                } else {
                    this.mAuthorNameView.setText(this.f48319d.getAuthor().getRemarkName());
                }
                if (TextUtils.equals(t(), "homepage_follow")) {
                    b bVar = new b(this);
                    if (this.f48319d.getAuthor() != null) {
                        com.ss.android.ugc.aweme.hotsearch.d.h.a(this.mAuthorNameView, this.f48319d.getAuthor().getStarBillboardRank(), 4, t(), bVar);
                    }
                }
            }
        } else {
            this.mForwardHeaderLayout.setVisibility(8);
        }
        a(this.mForwardDescView, this.f48319d);
    }

    public void u() {
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45548, new Class[0], Void.TYPE);
            return;
        }
        w();
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45554, new Class[0], Void.TYPE);
        } else {
            if (this.f48317b.c(1)) {
                this.mCommentLayout.setVisibility(0);
                this.mCommentLayout.a(this.f48319d, this.w, this.f48321f, this.f48318c);
            } else {
                this.mCommentLayout.setVisibility(8);
            }
            if (this.h != null) {
                this.h.f48294c = this.mCommentLayout.getLayoutLikes();
            }
        }
        A();
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45549, new Class[0], Void.TYPE);
        } else if (this.f48319d == null || this.f48319d.getAuthor() == null || TextUtils.isEmpty(this.f48319d.getAuthor().getRelationLabel())) {
            this.mFriendTagView.setVisibility(8);
        } else {
            this.mFriendTagView.setVisibility(0);
            this.mFriendTagView.setText(this.f48319d.getAuthor().getRelationLabel());
        }
        v();
        B();
        x();
        L();
        z();
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45552, new Class[0], Void.TYPE);
        } else if (!(this.mFollow == null || this.mFollow.getVisibility() != 0 || this.f48319d == null || this.f48319d.getAuthor() == null)) {
            this.A.a(this.f48319d.getAuthor());
        }
        y();
    }

    public final void c(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f48316a, false, 45586, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f48316a, false, 45586, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.h.b(aweme2);
    }

    @OnClick({2131495247})
    public void clickLike(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45585, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45585, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.h.a(t());
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f48316a, false, 45571, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f48316a, false, 45571, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 0) {
            J();
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45569, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45569, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g = true;
        this.n.e();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{2}, this, f48316a, false, 45538, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2}, this, f48316a, false, 45538, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f48317b.a(2);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f48316a, false, 45539, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f48316a, false, 45539, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f48317b.b(1);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f48316a, false, 45589, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f48316a, false, 45589, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.a(0);
        this.x = true;
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48316a, false, 45590, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48316a, false, 45590, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.b(i2);
        this.x = true;
    }

    @OnClick({2131495239})
    public void expandComment(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45582, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45582, new Class[]{View.class}, Void.TYPE);
        } else if (this.f48319d != null) {
            if (view.getId() == C0906R.id.b85) {
                com.ss.android.ugc.aweme.newfollow.util.a.a(this.mCommentView);
            }
            if (this.f48318c != null) {
                this.f48318c.a(this.itemView, this.f48319d, this.x, "click_comment_icon");
            }
        }
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48316a, false, 45591, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48316a, false, 45591, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mCommentLayout.c(i2);
        this.x = true;
    }

    @OnClick({2131495235})
    public void onClickAuthorAvatar(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45579, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45579, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!((o() && this.k != null && this.k.b()) || this.f48318c == null || this.f48319d == null)) {
            this.f48318c.a(view, this.itemView, this.f48319d, this.f48319d.getAuthor());
        }
    }

    @OnClick({2131498222})
    public void onClickAuthorName(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45580, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45580, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(this.f48318c == null || this.f48319d == null)) {
            this.f48318c.b(view, this.itemView, this.f48319d, this.f48319d.getAuthor());
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45570, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45570, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g = false;
        this.n.f();
        if (this.mDiggLayout != null) {
            this.mDiggLayout.removeAllViews();
        }
    }

    @OnClick({2131495254})
    @Optional
    public void showCreateForward(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45581, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45581, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.a.a(this.mForwardView);
        if (this.f48318c != null) {
            this.f48318c.a(this.f48319d);
        }
    }

    @OnClick({2131495300})
    @Optional
    public void showShare(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48316a, false, 45583, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48316a, false, 45583, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.a.a(this.mShareView);
        if (this.f48318c != null) {
            this.f48318c.c(view, this.itemView, this.f48319d);
        }
    }

    public final List<TextExtraStruct> a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f48316a, false, 45566, new Class[]{Aweme.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aweme}, this, f48316a, false, 45566, new Class[]{Aweme.class}, List.class);
        } else if (aweme == null) {
            return null;
        } else {
            int length = H().length();
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(aweme.getTextExtra())) {
                for (TextExtraStruct next : aweme.getTextExtra()) {
                    TextExtraStruct clone = next.clone();
                    clone.setStart(next.getStart() + length);
                    clone.setEnd(next.getEnd() + length);
                    arrayList.add(clone);
                }
            }
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setStart(0);
            textExtraStruct.setEnd(length);
            textExtraStruct.setType(2);
            textExtraStruct.setUserId(aweme.getAuthorUid());
            arrayList.add(0, textExtraStruct);
            return arrayList;
        }
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f48316a, false, 45572, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f48316a, false, 45572, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null && aweme.getStatus() != null) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), this.i, "click_like");
                return;
            }
            com.ss.android.ugc.aweme.forward.f.a aVar = this.h;
            if (PatchProxy.isSupport(new Object[]{aweme}, aVar, com.ss.android.ugc.aweme.forward.f.a.f48292a, false, 45525, new Class[]{Aweme.class}, Void.TYPE)) {
                Object[] objArr = {aweme};
                com.ss.android.ugc.aweme.forward.f.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, com.ss.android.ugc.aweme.forward.f.a.f48292a, false, 45525, new Class[]{Aweme.class}, Void.TYPE);
            } else if (!(aweme == null || aweme.getForwardItem() == null || aweme.getStatus() == null || !NetworkUtils.isNetworkAvailable(aVar.h) || ((aweme.getUserDigg() != 0 && aweme.getForwardItem().getUserDigg() != 0) || !aweme.isCanPlay() || aweme.getStatus().isDelete() || aweme.getStatus().getPrivateStatus() == 1))) {
                if (aVar.f48297f != null) {
                    aVar.f48297f.b(aVar.i, 1);
                }
                if (!aVar.g) {
                    aVar.a(true);
                    if (!com.ss.android.ugc.aweme.theme.a.a(aVar.h)) {
                        aVar.a();
                    }
                }
            }
            if (!(this.mDiggLayout == null || aweme.getStatus().getPrivateStatus() == 1)) {
                this.mDiggLayout.a(this.p.getX(), this.p.getY());
            }
        }
    }

    public void b(MentionTextView mentionTextView, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{mentionTextView, aweme}, this, f48316a, false, 45565, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView, aweme}, this, f48316a, false, 45565, new Class[]{MentionTextView.class, Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            if (!com.ss.android.g.a.a() && !aweme.isHashTag()) {
                com.ss.android.ugc.aweme.newfollow.a.b.h(aweme);
            }
            if (com.ss.android.ugc.aweme.longvideo.b.b.a(aweme)) {
                mentionTextView.setText(com.ss.android.ugc.aweme.longvideo.b.b.a(this.s, String.format("%s%s", new Object[]{H(), aweme.getDesc()}), aweme, this.i, 0));
            } else {
                mentionTextView.setText(String.format("%s%s", new Object[]{H(), aweme.getDesc()}));
            }
            mentionTextView.setVisibility(0);
            g.a((TextView) mentionTextView);
            mentionTextView.setSpanSize(UIUtils.sp2px(this.s, 15.0f));
            mentionTextView.setSpanStyle(1);
            mentionTextView.setOnSpanClickListener(new d(this));
            List<TextExtraStruct> a2 = a(aweme);
            AbTestManager.a();
            mentionTextView.a(a2, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f48316a, false, 45542, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f48316a, false, 45542, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        a(view2, f2, 0.0f);
    }

    private void a(User user, boolean z2, String str) {
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{user2, (byte) 0, str2}, this, f48316a, false, 45557, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, (byte) 0, str2}, this, f48316a, false, 45557, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (!o() || this.k == null) {
            if (this.mStoryRing != null) {
                this.mStoryRing.setVisibility(8);
            }
        } else {
            this.k.a(user, false, str2);
        }
    }

    public final void a(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f48316a, false, 45543, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f48316a, false, 45543, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) UIUtils.dip2Px(c(), f2);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(c(), f3);
    }

    public BaseForwardViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout);
        this.y = aVar;
        this.s = aVar.d();
        this.f48318c = aVar2;
        this.f48320e = new WeakHandler(Looper.getMainLooper(), this);
        a((View) followFeedLayout);
        b((View) followFeedLayout);
        ButterKnife.bind((Object) this, (View) followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        I();
        com.ss.android.ugc.aweme.forward.f.a aVar4 = new com.ss.android.ugc.aweme.forward.f.a(this.s, this.mDiggView, this.mDiggCountView, aVar3, s());
        this.h = aVar4;
        if (!com.ss.android.g.a.a()) {
            this.l = (h) ServiceManager.get().getService(h.class);
            this.k = this.l.a(this.mAuthorAvatarImageView, this.mStoryRing, this.mAvatarLoadingView);
        }
        if (this.mPressLayout != null) {
            this.mPressLayout.setTapListener(this.r);
            this.mPressLayout.setDisabilityOnClickListener(new a(this));
        }
        this.A = new a(this.mFollow, new a.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48322a;

            public final String a() {
                if (!PatchProxy.isSupport(new Object[0], this, f48322a, false, 45601, new Class[0], String.class)) {
                    return BaseForwardViewHolder.this.t();
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f48322a, false, 45601, new Class[0], String.class);
            }

            public final void a(int i, User user) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f48322a, false, 45602, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f48322a, false, 45602, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                    return;
                }
                if (BaseForwardViewHolder.this.f48318c != null) {
                    BaseForwardViewHolder.this.f48318c.b(BaseForwardViewHolder.this.f48319d);
                }
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f48316a, false, 45540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48316a, false, 45540, new Class[0], Void.TYPE);
        } else {
            this.m = WidgetManager.a((FragmentActivity) c(), this.itemView);
        }
        r();
    }

    public final void a(View view, float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(12.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f5)}, this, f48316a, false, 45544, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            Object[] objArr = {view, Float.valueOf(12.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f5)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f48316a, false, 45544, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) UIUtils.dip2Px(c(), 12.0f);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(c(), 0.0f);
        layoutParams.leftMargin = (int) UIUtils.dip2Px(c(), 0.0f);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(c(), f5);
    }
}
