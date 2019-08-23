package com.ss.android.ugc.aweme.newfollow.vh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.tencent.bugly.CrashModule;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010+\u001a\u00020,H\u0015J\b\u0010-\u001a\u00020,H\u0014J\u0018\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010!2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020,H\u0014J\b\u00103\u001a\u00020,H\u0014J\b\u00104\u001a\u00020,H\u0016J\b\u00105\u001a\u00020,H\u0014J\b\u00106\u001a\u00020,H\u0014J \u00107\u001a\u00020,2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020,H\u0016J\b\u0010?\u001a\u00020\u0019H\u0002J\b\u0010@\u001a\u00020,H\u0002J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u001bH\u0002J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190DH\u0014J\u0006\u0010E\u001a\u00020;J\u0006\u0010F\u001a\u00020;J\u0012\u0010G\u001a\u00020,2\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010I\u001a\u00020,H\u0016J\u0012\u0010J\u001a\u00020,2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010K\u001a\u00020\u001bJ\b\u0010L\u001a\u00020\u001bH\u0014J\b\u0010M\u001a\u00020,H\u0002J\b\u0010N\u001a\u00020,H\u0002J\b\u0010O\u001a\u00020,H\u0016J\u0010\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020RH\u0007J\b\u0010S\u001a\u00020,H\u0016J\b\u0010T\u001a\u00020,H\u0016J\b\u0010U\u001a\u00020,H\u0016J\b\u0010V\u001a\u00020,H\u0016J\b\u0010W\u001a\u00020,H\u0016J\b\u0010X\u001a\u00020,H\u0016J\u0010\u0010Y\u001a\u00020,2\u0006\u0010Z\u001a\u000209H\u0016J\b\u0010[\u001a\u00020,H\u0016J\u0010\u0010\\\u001a\u00020,2\u0006\u0010Q\u001a\u00020]H\u0007J\u0012\u0010^\u001a\u00020,2\b\u0010_\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010`\u001a\u00020,2\b\u0010_\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010a\u001a\u00020,H\u0016J\b\u0010b\u001a\u00020,H\u0016J\b\u0010c\u001a\u00020,H\u0014J\u0010\u0010d\u001a\u00020,2\u0006\u0010/\u001a\u00020!H\u0016J\u0012\u0010e\u001a\u00020,2\b\u0010f\u001a\u0004\u0018\u00010gH\u0014J\b\u0010h\u001a\u000209H\u0002J\u000e\u0010i\u001a\u00020,2\u0006\u0010j\u001a\u00020\u0019J\b\u0010k\u001a\u00020,H\u0014J\b\u0010l\u001a\u00020,H\u0014J\b\u0010m\u001a\u00020,H\u0014J\b\u0010n\u001a\u00020,H\u0014J\b\u0010o\u001a\u00020,H\u0014J\u0017\u0010p\u001a\u00020,2\b\u0010q\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0002\u0010rJ\u0017\u0010s\u001a\u00020,2\b\u0010t\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0002\u0010rJ\"\u0010u\u001a\u00020,2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000e2\u0006\u0010v\u001a\u0002092\u0006\u0010w\u001a\u000209H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u000e\u0010*\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderA;", "Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFlowItemVideoViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "bottomContainer", "Landroid/view/View;", "cover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "enterLiveTipView", "Landroid/widget/TextView;", "followLiveViewModel", "Lcom/ss/android/ugc/aweme/newfollow/live/FollowLiveViewModel;", "liveContentLayout", "getLiveContentLayout", "()Landroid/view/View;", "mEnterFrom", "", "mLiveFinished", "", "getMLiveFinished", "()Z", "setMLiveFinished", "(Z)V", "mRoom", "Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "getMRoom", "()Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "setMRoom", "(Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;)V", "onlineCount", "shouldCoverBlur", "getShouldCoverBlur", "setShouldCoverBlur", "tagContainer", "addClickListeners", "", "adjustMediaItemLayout", "bind", "room", "interactListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "bindDescView", "bindExtraView", "bindForwardView", "bindHeaderView", "bindViews", "calNewMediaItemSize", "screenWidth", "", "ratioHW", "", "dstSize", "", "clickExtra", "enterFromMerge", "enterLiveDetail", "enterLiveRoom", "clickHead", "getExtraDialogString", "", "getHorizontalMargin", "getVerticalMargin", "inflateStub", "root", "initLiveView", "initVideoView", "isInsDisplayType", "isMomentStyle", "mobShowLiveCard", "observeFollowLiveStatus", "onDestroy", "onFollowLiveStatusChange", "event", "Lcom/bytedance/android/live/base/event/RoomStatusEvent;", "onPause", "onResume", "onRollOutPlayRegion", "onRollToDisappear", "onRollToDisplay", "onRollToHalfShow", "onRollToPlayRegion", "scrollState", "onStop", "onUnFollowUser", "Lcom/ss/android/ugc/aweme/newfollow/event/UnFollowUserEvent;", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "pauseLive", "pauseVideo", "performSingleTap", "playLive", "playVideo", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "sceneId", "setEnterFrom", "enterFrom", "setRoundCorner", "showCover", "startAnimation", "stopAnimation", "updateDividerLine", "updateLiveTipText", "roomStatus", "(Ljava/lang/Integer;)V", "updateLiveWatchCount", "liveWatchCount", "updateMediaItemLayoutParams", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsFollowLiveViewHolderA extends FollowFlowItemVideoViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3681b;
    private final RemoteImageView Y;
    private final View Z;
    private final TextView aa;
    private final View ab;
    private final TextView ac;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3682c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public RoomStruct f3683d;

    /* renamed from: e  reason: collision with root package name */
    public String f3684e = "";

    /* renamed from: f  reason: collision with root package name */
    public boolean f3685f;
    @NotNull
    public final View g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57609b;

        a(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57609b = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57608a, false, 62482, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57608a, false, 62482, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f57609b.e(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57611b;

        b(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57611b = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57610a, false, 62483, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57610a, false, 62483, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f57611b.n.a(this.f57611b.mHeadUserNameView, this.f57611b.itemView, this.f57611b.ag().owner);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57613b;

        c(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57613b = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57612a, false, 62484, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57612a, false, 62484, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            BaseFollowViewHolder.a aVar = this.f57613b.n;
            if (aVar != null) {
                aVar.a(this.f57613b.mAvatarView, this.f57613b.itemView, this.f57613b.ag().owner);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "liveState", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveState;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Consumer<com.ss.android.ugc.aweme.live.feedpage.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57615b;

        d(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57615b = insFollowLiveViewHolderA;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f57614a, false, 62485, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f57614a, false, 62485, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                return;
            }
            if (TextUtils.equals(this.f57615b.ag().owner.getUid(), String.valueOf(bVar.f53380a))) {
                if (bVar.f53381b == 0) {
                    this.f57615b.ag().status = 4;
                    this.f57615b.m.d();
                    this.f57615b.a((Integer) 4);
                    User user = this.f57615b.ag().owner;
                    Intrinsics.checkExpressionValueIsNotNull(user, "mRoom.owner");
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f57615b.mAvatarView, user.getAvatarThumb(), this.f57615b.avatarSize, this.f57615b.avatarSize);
                    return;
                }
                this.f57615b.ag().status = 2;
                this.f57615b.ag().id = bVar.f53381b;
                this.f57615b.ag().owner.roomId = bVar.f53381b;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class e implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57617b;

        e(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57617b = insFollowLiveViewHolderA;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f57616a, false, 62486, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f57616a, false, 62486, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f57617b.ai();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class f implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderA f57619b;

        f(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f57619b = insFollowLiveViewHolderA;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f57618a, false, 62487, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f57618a, false, 62487, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f57619b.a(this.f57619b.ag());
        }
    }

    public final void P() {
    }

    public final void Q() {
    }

    public void a(@NotNull RoomStruct roomStruct) {
        RoomStruct roomStruct2 = roomStruct;
        if (PatchProxy.isSupport(new Object[]{roomStruct2}, this, f3681b, false, 62445, new Class[]{RoomStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct2}, this, f3681b, false, 62445, new Class[]{RoomStruct.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(roomStruct2, "room");
    }

    public void ah() {
    }

    public void ai() {
    }

    public final boolean j() {
        return true;
    }

    private boolean aj() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62438, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62438, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.aB() == 3) {
            z = true;
        }
        return z;
    }

    private float ak() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62439, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62439, new Class[0], Float.TYPE)).floatValue();
        } else if (aj()) {
            return 0.0f;
        } else {
            return 16.0f;
        }
    }

    private float al() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62440, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62440, new Class[0], Float.TYPE)).floatValue();
        } else if (aj()) {
            return 16.0f;
        } else {
            return 20.0f;
        }
    }

    public final void J() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62474, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.f();
        }
    }

    public final void N() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62478, new Class[0], Void.TYPE);
            return;
        }
        I();
    }

    public final void O() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62479, new Class[0], Void.TYPE);
            return;
        }
        ae();
        J();
    }

    public final void S() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62447, new Class[0], Void.TYPE);
            return;
        }
        ai();
    }

    public void T() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62449, new Class[0], Void.TYPE);
            return;
        }
        super.T();
    }

    public void U() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62450, new Class[0], Void.TYPE);
            return;
        }
        super.U();
        bg.d(this);
    }

    public final void V() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62448, new Class[0], Void.TYPE);
            return;
        }
        I();
    }

    public final void ae() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62446, new Class[0], Void.TYPE);
            return;
        }
        ai();
    }

    @NotNull
    public final RoomStruct ag() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62434, new Class[0], RoomStruct.class)) {
            return (RoomStruct) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62434, new Class[0], RoomStruct.class);
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        return roomStruct;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62461, new Class[0], Void.TYPE);
            return;
        }
        View view = this.mLineDivider;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62469, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            a(this.g, 0, 0);
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62460, new Class[0], Void.TYPE);
            return;
        }
        v.a((View) this.mForwardLayout, 8);
    }

    @SuppressLint({"MissingSuperCall"})
    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62454, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (roomStruct2.owner != null) {
                if (this.mAvatarLiveView != null) {
                    this.mAvatarLiveView.setOnClickListener(new a(this));
                }
                if (this.mHeadUserNameView != null) {
                    this.mHeadUserNameView.setOnClickListener(new b(this));
                }
                AvatarImageView avatarImageView = this.mAvatarView;
                if (avatarImageView != null) {
                    avatarImageView.setOnClickListener(new c(this));
                }
            }
        }
    }

    @NotNull
    public final List<String> B() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62463, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62463, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (!com.ss.android.ugc.aweme.newfollow.a.b.b(roomStruct.owner)) {
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (ex.f(roomStruct2.owner)) {
                arrayList.add(X().getString(C0906R.string.dpt));
            }
        }
        return arrayList;
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62464, new Class[0], Void.TYPE);
            return;
        }
        List<String> B = B();
        if (this.n != null) {
            BaseFollowViewHolder.a aVar = this.n;
            RoomStruct roomStruct = this.f3683d;
            if (roomStruct == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            aVar.a(roomStruct.owner, B, (DialogInterface.OnShowListener) new e(this), (DialogInterface.OnDismissListener) new f(this));
        }
    }

    public void D() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62459, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct.roomCover != null) {
            RemoteImageView remoteImageView = this.mCoverView;
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            UrlModel urlModel = roomStruct2.roomCover;
            RemoteImageView remoteImageView2 = this.mCoverView;
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView2, "mCoverView");
            int width = remoteImageView2.getWidth();
            RemoteImageView remoteImageView3 = this.mCoverView;
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView3, "mCoverView");
            com.ss.android.ugc.aweme.base.c.a(remoteImageView, urlModel, width, remoteImageView3.getHeight());
        }
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62466, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && !y.b() && Build.VERSION.SDK_INT >= 21) {
            View view = this.g;
            Context X = X();
            Intrinsics.checkExpressionValueIsNotNull(X, "context");
            view.setOutlineProvider(new dp(X.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.g.setClipToOutline(true);
        }
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62473, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            RoomStruct roomStruct = this.f3683d;
            if (roomStruct == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user = roomStruct.owner;
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            user.roomId = roomStruct2.id;
            this.m.e();
        }
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62442, new Class[0], Void.TYPE);
            return;
        }
        q();
        D();
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        a(Integer.valueOf(roomStruct.status));
        RoomStruct roomStruct2 = this.f3683d;
        if (roomStruct2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        b(Integer.valueOf(roomStruct2.user_count));
        z();
        A();
        f();
        H();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62462, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            RoomStruct roomStruct = this.f3683d;
            if (roomStruct == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (com.ss.android.ugc.aweme.newfollow.a.b.b(roomStruct.owner)) {
                ImageView imageView = this.q;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mIvExtraBtn");
                imageView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.q;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mIvExtraBtn");
            imageView2.setVisibility(0);
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62465, new Class[0], Void.TYPE);
            return;
        }
        this.mDescView.setMaxSize(PulishTitle.MAX_WORDS);
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (!TextUtils.isEmpty(roomStruct.title)) {
            MentionTextView mentionTextView = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView, "mDescView");
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            mentionTextView.setText(roomStruct2.title);
            MentionTextView mentionTextView2 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView2, "mDescView");
            mentionTextView2.setVisibility(0);
            MentionTextView mentionTextView3 = this.mDescView;
            Intrinsics.checkExpressionValueIsNotNull(mentionTextView3, "mDescView");
            mentionTextView3.setSpanSize(UIUtils.sp2px(X(), 15.0f));
            return;
        }
        MentionTextView mentionTextView4 = this.mDescView;
        Intrinsics.checkExpressionValueIsNotNull(mentionTextView4, "mDescView");
        mentionTextView4.setVisibility(8);
    }

    public final void W() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62451, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(this.g)) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.aD()) {
                AbTestManager a3 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                if (a3.bL()) {
                    if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62453, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62453, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.feed.a a4 = com.ss.android.ugc.aweme.feed.a.a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "AwemeManager.inst()");
                        BaseFollowViewHolder.a aVar = this.n;
                        Intrinsics.checkExpressionValueIsNotNull(aVar, "mInteractListener");
                        a4.f44610c = aVar.e();
                        AbTestManager a5 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a5, "AbTestManager.getInstance()");
                        if (a5.bL()) {
                            Context X = X();
                            RoomStruct roomStruct = this.f3683d;
                            if (roomStruct == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                            }
                            String valueOf = String.valueOf(roomStruct.id);
                            String d2 = d();
                            String D_ = D_();
                            RoomStruct roomStruct2 = this.f3683d;
                            if (roomStruct2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                            }
                            User user = roomStruct2.owner;
                            if (user != null) {
                                i2 = user.getCommerceUserLevel();
                            } else {
                                i2 = 0;
                            }
                            LiveDetailActivity.b(X, valueOf, d2, D_, i2, e(), g(), this.g);
                        } else {
                            Context X2 = X();
                            RoomStruct roomStruct3 = this.f3683d;
                            if (roomStruct3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                            }
                            String valueOf2 = String.valueOf(roomStruct3.id);
                            String d3 = d();
                            String D_2 = D_();
                            RoomStruct roomStruct4 = this.f3683d;
                            if (roomStruct4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                            }
                            User user2 = roomStruct4.owner;
                            if (user2 != null) {
                                i = user2.getCommerceUserLevel();
                            } else {
                                i = 0;
                            }
                            DetailActivity.a(X2, valueOf2, d3, D_2, i, e(), g(), this.g);
                            return;
                        }
                    }
                }
            }
            e(false);
        }
    }

    public final void q() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62458, new Class[0], Void.TYPE);
            return;
        }
        b();
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct.owner != null) {
            View view = this.mHeaderLayout;
            Intrinsics.checkExpressionValueIsNotNull(view, "mHeaderLayout");
            view.setVisibility(0);
            if (this.m == null) {
                RoomStruct roomStruct2 = this.f3683d;
                if (roomStruct2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                if (roomStruct2.id > 0) {
                    z = true;
                }
                this.m = new com.ss.android.ugc.aweme.feed.ui.a(z, this.mAvatarLiveView, this.mAvatarView, this.mAvatarBorderView);
            }
            AvatarImageView avatarImageView = this.mAvatarView;
            Intrinsics.checkExpressionValueIsNotNull(avatarImageView, "mAvatarView");
            avatarImageView.setVisibility(4);
            RemoteImageView remoteImageView = this.mAvatarLiveView;
            RoomStruct roomStruct3 = this.f3683d;
            if (roomStruct3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user = roomStruct3.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "mRoom.owner");
            com.ss.android.ugc.aweme.base.c.a(remoteImageView, user.getAvatarThumb(), this.avatarSize, this.avatarSize);
            RoomStruct roomStruct4 = this.f3683d;
            if (roomStruct4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user2 = roomStruct4.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "mRoom.owner");
            if (!TextUtils.isEmpty(user2.getRemarkName())) {
                TextView textView = this.mHeadUserNameView;
                Intrinsics.checkExpressionValueIsNotNull(textView, "mHeadUserNameView");
                RoomStruct roomStruct5 = this.f3683d;
                if (roomStruct5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User user3 = roomStruct5.owner;
                Intrinsics.checkExpressionValueIsNotNull(user3, "mRoom.owner");
                textView.setText(user3.getRemarkName());
            } else {
                TextView textView2 = this.mHeadUserNameView;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "mHeadUserNameView");
                RoomStruct roomStruct6 = this.f3683d;
                if (roomStruct6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User user4 = roomStruct6.owner;
                Intrinsics.checkExpressionValueIsNotNull(user4, "mRoom.owner");
                textView2.setText(user4.getNickname());
            }
            RoomStruct roomStruct7 = this.f3683d;
            if (roomStruct7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user5 = roomStruct7.owner;
            RoomStruct roomStruct8 = this.f3683d;
            if (roomStruct8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            user5.roomId = roomStruct8.id;
            com.ss.android.ugc.aweme.feed.ui.a aVar = this.m;
            RoomStruct roomStruct9 = this.f3683d;
            if (roomStruct9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            aVar.a(roomStruct9.owner, getClass(), new d(this));
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.feed.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3681b, false, 62443, new Class[]{com.ss.android.ugc.aweme.feed.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3681b, false, 62443, new Class[]{com.ss.android.ugc.aweme.feed.d.class}, Void.TYPE);
            return;
        }
        ah();
    }

    public void onViewAttachedToWindow(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3681b, false, 62480, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3681b, false, 62480, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.C = true;
        this.w.a(this.M);
    }

    private final void b(Integer num) {
        String str;
        if (PatchProxy.isSupport(new Object[]{num}, this, f3681b, false, 62468, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f3681b, false, 62468, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        TextView textView = this.aa;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        textView.setText(str);
    }

    public final void d(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3681b, false, 62444, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3681b, false, 62444, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            a(roomStruct2);
        }
    }

    @Subscribe
    public final void onUnFollowUser(@NotNull com.ss.android.ugc.aweme.newfollow.c.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3681b, false, 62457, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3681b, false, 62457, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (roomStruct2.owner != null) {
                CharSequence charSequence = eVar.f57087a;
                RoomStruct roomStruct3 = this.f3683d;
                if (roomStruct3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                User user = roomStruct3.owner;
                Intrinsics.checkExpressionValueIsNotNull(user, "mRoom.owner");
                if (TextUtils.equals(charSequence, user.getUid())) {
                    ai();
                }
            }
        }
    }

    public void onViewDetachedFromWindow(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3681b, false, 62481, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3681b, false, 62481, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.C = false;
        ae();
        this.w.b(this.M);
        this.x.removeCallbacksAndMessages(null);
        J();
    }

    public void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3681b, false, 62437, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3681b, false, 62437, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(C0906R.layout.a5b);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(C0906R.layout.a4g);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(C0906R.layout.a46);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        a(view4, al(), al(), ak(), ak());
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3681b, false, 62452, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3681b, false, 62452, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            RoomStruct roomStruct = this.f3683d;
            if (roomStruct == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user = roomStruct.owner;
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            user.roomId = roomStruct2.id;
            RoomStruct roomStruct3 = this.f3683d;
            if (roomStruct3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (roomStruct3.isFinish()) {
                BaseFollowViewHolder.a aVar = this.n;
                View view = this.mHeadUserNameView;
                View view2 = this.itemView;
                RoomStruct roomStruct4 = this.f3683d;
                if (roomStruct4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                }
                aVar.a(view, view2, roomStruct4.owner);
                return;
            }
            String str = "homepage_follow";
            String str2 = "live_cell";
            if (TextUtils.equals(this.f3684e, "extra_follow_type_friend")) {
                str = "homepage_friends";
            }
            String str3 = str;
            if (z) {
                str2 = "video_head";
            }
            String str4 = str2;
            RoomStruct roomStruct5 = this.f3683d;
            if (roomStruct5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user2 = roomStruct5.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "mRoom.owner");
            RoomStruct roomStruct6 = this.f3683d;
            if (roomStruct6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            user2.setRequestId(roomStruct6.getRequestId());
            BaseFollowViewHolder.a aVar2 = this.n;
            View view3 = this.g;
            View view4 = this.itemView;
            RoomStruct roomStruct7 = this.f3683d;
            if (roomStruct7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            aVar2.a(view3, view4, roomStruct7.owner, str3, str4);
        }
    }

    @Subscribe
    public final void onFollowLiveStatusChange(@NotNull com.bytedance.android.live.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3681b, false, 62456, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3681b, false, 62456, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            long j = aVar.f7685b;
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (j == roomStruct2.id) {
                if (aVar.f7687d) {
                    this.f3685f = true;
                    a((Integer) 4);
                    RoomStruct roomStruct3 = this.f3683d;
                    if (roomStruct3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                    }
                    roomStruct3.status = 4;
                    return;
                }
                this.f3685f = false;
                a((Integer) 2);
                b(Integer.valueOf(aVar.f7688e));
            }
        }
    }

    public final void b(int i) {
        int i2;
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3681b, false, 62472, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3681b, false, 62472, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3683d;
        if (roomStruct == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            if (roomStruct2.owner != null) {
                if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62475, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62475, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                    if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62477, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62477, new Class[0], Integer.TYPE)).intValue();
                    } else if (y.b()) {
                        i2 = CrashModule.MODULE_ID;
                    } else {
                        i2 = 1008;
                    }
                    com.ss.android.ugc.aweme.app.d.d a3 = a2.a("scene_id", i2).a("enter_method", "live_cell").a("action_type", "click");
                    RoomStruct roomStruct3 = this.f3683d;
                    if (roomStruct3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                    }
                    User user = roomStruct3.owner;
                    Intrinsics.checkExpressionValueIsNotNull(user, "mRoom.owner");
                    com.ss.android.ugc.aweme.app.d.d a4 = a3.a("anchor_id", user.getUid());
                    RoomStruct roomStruct4 = this.f3683d;
                    if (roomStruct4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                    }
                    com.ss.android.ugc.aweme.app.d.d a5 = a4.a("room_id", roomStruct4.id);
                    if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62476, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62476, new Class[0], String.class);
                    } else {
                        str = "homepage_follow";
                        if (TextUtils.equals(this.f3684e, "extra_follow_type_friend")) {
                            str = "homepage_friends";
                        }
                    }
                    com.ss.android.ugc.aweme.app.d.d a6 = a5.a("enter_from_merge", str);
                    RoomStruct roomStruct5 = this.f3683d;
                    if (roomStruct5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRoom");
                    }
                    r.a("livesdk_live_show", (Map) a6.a("request_id", roomStruct5.getRequestId()).f34114b);
                }
            }
        }
        switch (i) {
            case 0:
            case 1:
                ad();
                break;
        }
    }

    public final void a(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f3681b, false, 62467, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f3681b, false, 62467, new Class[]{Integer.class}, Void.TYPE);
        } else if (num != null && num.intValue() == 4) {
            TextView textView = this.mCreateTimeView;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mCreateTimeView");
            textView.setText(X().getString(C0906R.string.agi));
        } else {
            TextView textView2 = this.mCreateTimeView;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mCreateTimeView");
            textView2.setText(X().getString(C0906R.string.agb));
        }
    }

    public final void a(@Nullable RoomStruct roomStruct, @NotNull BaseFollowViewHolder.a aVar) {
        if (PatchProxy.isSupport(new Object[]{roomStruct, aVar}, this, f3681b, false, 62441, new Class[]{RoomStruct.class, BaseFollowViewHolder.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct, aVar}, this, f3681b, false, 62441, new Class[]{RoomStruct.class, BaseFollowViewHolder.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "interactListener");
        if (roomStruct != null) {
            this.n = aVar;
            this.f3683d = roomStruct;
            RoomStruct roomStruct2 = this.f3683d;
            if (roomStruct2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            User user = roomStruct2.owner;
            RoomStruct roomStruct3 = this.f3683d;
            if (roomStruct3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRoom");
            }
            user.roomId = roomStruct3.id;
            l();
            n();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r20, float r21, @org.jetbrains.annotations.NotNull int[] r22) {
        /*
            r19 = this;
            r0 = r22
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r9 = 0
            r2[r9] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r21)
            r10 = 1
            r2[r10] = r3
            r11 = 2
            r2[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f3681b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Float.TYPE
            r7[r10] = r3
            java.lang.Class<int[]> r3 = int[].class
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 62471(0xf407, float:8.754E-41)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0062
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r12[r9] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r21)
            r12[r10] = r2
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = f3681b
            r15 = 0
            r16 = 62471(0xf407, float:8.754E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0062:
            java.lang.String r1 = "dstSize"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r0[r9] = r20
            r1 = r0[r9]
            r0[r10] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA.a(int, float, int[]):void");
    }

    public void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f3681b, false, 62470, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f3681b, false, 62470, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            a((int) (((float) UIUtils.getScreenWidth(X())) - (UIUtils.dip2Px(X(), ak()) * 2.0f)), 0.0f, iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowLiveViewHolderA(@NotNull FollowFeedLayout followFeedLayout, @NotNull com.ss.android.ugc.aweme.forward.a.a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull com.ss.android.ugc.aweme.feed.d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        View findViewById = this.itemView.findViewById(C0906R.id.b8n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…follow_feed_live_content)");
        this.g = findViewById;
        View findViewById2 = this.itemView.findViewById(C0906R.id.b08);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_cover)");
        this.Y = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(C0906R.id.bh1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.ll_live_tag_container)");
        this.Z = findViewById3;
        View findViewById4 = this.itemView.findViewById(C0906R.id.dfq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.tv_online_count)");
        this.aa = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(C0906R.id.afh);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.….fl_enter_live_container)");
        this.ab = findViewById5;
        View findViewById6 = this.itemView.findViewById(C0906R.id.dbg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tv_enter_live)");
        this.ac = (TextView) findViewById6;
        if (PatchProxy.isSupport(new Object[0], this, f3681b, false, 62455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3681b, false, 62455, new Class[0], Void.TYPE);
            return;
        }
        bg.c(this);
    }
}
