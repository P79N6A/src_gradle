package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\u0012\u00100\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u00101\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FeedLiveCoverViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/BaseFeedLiveViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;)V", "mBottomContainer", "Landroid/widget/FrameLayout;", "mCoverView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mIsFirstLog", "", "mLiveAlive", "mLiveIconTxt", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mLivePlayingAnimView", "Lcom/airbnb/lottie/LottieAnimationView;", "mLiveTips", "mNameTxt", "mStartShowTime", "", "mTitleTxt", "bind", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "loadDirectly", "bindView", "checkLiveAlive", "doAdaptation", "logLiveDuration", "logLivePlay", "logLiveStreamPlay", "onDestroyView", "onFollowLiveStatusChange", "event", "Lcom/bytedance/android/live/base/event/RoomStatusEvent;", "onHolderPause", "mode", "", "onPause", "onResume", "onViewHolderSelected", "position", "onViewHolderUnSelected", "playLive", "resumeFeedPlay", "tryDoAdaptation", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a {
    public static ChangeQuickRedirect h;
    public boolean i = true;
    public final RemoteImageView j;
    private long k;
    private boolean l = true;
    private final DmtTextView m;
    private final DmtTextView n;
    private final FrameLayout o;
    private final DmtTextView p;
    private final DmtTextView q;
    private final LottieAnimationView r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/FeedLiveCoverViewHolder$bind$1", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;", "onLivePause", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements o {
        public final void a() {
        }

        a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/feed/adapter/FeedLiveCoverViewHolder$bindView$1$3"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UrlModel f44903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44904c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f44905d;

        b(UrlModel urlModel, RoomStruct roomStruct, e eVar) {
            this.f44903b = urlModel;
            this.f44904c = roomStruct;
            this.f44905d = eVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44902a, false, 40423, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44902a, false, 40423, new Class[0], Void.TYPE);
            } else if (this.f44905d.i) {
                com.ss.android.ugc.aweme.base.c.a(this.f44905d.j, this.f44903b, this.f44905d.j.getHeight(), this.f44905d.j.getHeight());
            } else {
                User user = this.f44904c.owner;
                Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
                UrlModel avatarLarger = user.getAvatarLarger();
                Intrinsics.checkExpressionValueIsNotNull(avatarLarger, "it.owner.avatarLarger");
                com.ss.android.ugc.aweme.base.c.a(this.f44905d.j, this.f44903b, this.f44905d.j.getHeight(), this.f44905d.j.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, (((float) avatarLarger.getWidth()) * 1.0f) / ((float) this.f44905d.j.getWidth()), null));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44907b;

        c(RoomStruct roomStruct) {
            this.f44907b = roomStruct;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44906a, false, 40424, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44906a, false, 40424, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            UserProfileActivity.b(view.getContext(), this.f44907b.owner, "homepage_follow");
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            User user = this.f44907b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("room_id", this.f44907b.id);
            User user2 = this.f44907b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
            r.a("enter_personal_detail", (Map) a3.a("anchor_id", user2.getUid()).a("enter_method", "click_name").a("scene_id", "1045").f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44909b;

        d(RoomStruct roomStruct) {
            this.f44909b = roomStruct;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44908a, false, 40425, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44908a, false, 40425, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.story.live.c a2 = com.ss.android.ugc.aweme.story.live.c.a();
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            a2.a(new c.a(view.getContext(), this.f44909b.owner).b("homepage_follow").c("live_cell"));
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("room_id", this.f44909b.id);
            User user = this.f44909b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
            r.a("livesdk_click_enter_room", (Map) a3.a("anchor_id", user.getUid()).a("enter_from_merge", "homepage_follow").a("enter_method", "live_cell_cover").a("scene_id", "1001").f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/FeedLiveCoverViewHolder$checkLiveAlive$1$1", "Lcom/bytedance/android/livesdkapi/service/ICheckRoomStatusCallback;", "onFailed", "", "onSuccess", "alive", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.e$e  reason: collision with other inner class name */
    public static final class C0558e implements com.bytedance.android.livesdkapi.service.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44911b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f44912c;

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44910a, false, 40426, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44910a, false, 40426, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z != this.f44912c.i) {
                this.f44912c.i = z;
                this.f44912c.b();
            }
            if (!z) {
                User user = this.f44911b.owner;
                Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
                UrlModel avatarLarger = user.getAvatarLarger();
                Intrinsics.checkExpressionValueIsNotNull(avatarLarger, "it.owner.avatarLarger");
                float width = (((float) avatarLarger.getWidth()) * 1.0f) / ((float) this.f44912c.j.getWidth());
                RemoteImageView remoteImageView = this.f44912c.j;
                User user2 = this.f44911b.owner;
                Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
                com.ss.android.ugc.aweme.base.c.a(remoteImageView, user2.getAvatarLarger(), this.f44912c.j.getWidth() * 2, this.f44912c.j.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, width, null));
                return;
            }
            com.ss.android.ugc.aweme.base.c.a(this.f44912c.j, this.f44911b.roomCover, this.f44912c.j.getWidth() * 2, this.f44912c.j.getHeight());
        }

        C0558e(RoomStruct roomStruct, e eVar) {
            this.f44911b = roomStruct;
            this.f44912c = eVar;
        }
    }

    private final void D() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40411, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            com.bytedance.android.livesdkapi.service.c d2 = com.ss.android.ugc.aweme.live.a.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            d2.a(roomStruct.id, (com.bytedance.android.livesdkapi.service.a) new C0558e(roomStruct, this));
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40408, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.r.pauseAnimation();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40409, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        this.r.resumeAnimation();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40422, new Class[0], Void.TYPE);
            return;
        }
        F();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40413, new Class[0], Void.TYPE);
            return;
        }
        E();
    }

    public final void t_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40414, new Class[0], Void.TYPE);
            return;
        }
        super.t_();
        bg.d(this);
    }

    private final void F() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40421, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.profile.a.a().l) {
            i2 = this.f3136b.getResources().getDimensionPixelSize(C0906R.dimen.lv);
        }
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i2;
            this.o.setLayoutParams(marginLayoutParams);
            bg.a(new com.ss.android.ugc.aweme.feed.f.c(!com.ss.android.ugc.aweme.profile.a.a().l));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void E() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40418, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.k <= 0 || this.f3137c == null || this.f3138d == null)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1003").a("duration", System.currentTimeMillis() - this.k).a("enter_from_merge", "homepage_follow").a("action_type", "click");
            RoomStruct roomStruct = this.f3138d;
            if (roomStruct == null) {
                Intrinsics.throwNpe();
            }
            User user = roomStruct.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "mRoomStruct!!.owner");
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("anchor_id", user.getUid());
            RoomStruct roomStruct2 = this.f3138d;
            if (roomStruct2 == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("room_id", roomStruct2.id);
            Aweme aweme = this.f3137c;
            if (aweme == null) {
                Intrinsics.throwNpe();
            }
            r.a("livesdk_live_duration", (Map) a4.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40407, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            if (TextUtils.isEmpty(roomStruct.title)) {
                this.n.setVisibility(8);
            } else {
                this.n.setText(roomStruct.title);
                this.n.setVisibility(0);
            }
            this.m.setText(ex.b(roomStruct.owner, true));
            this.m.setOnClickListener(new c(roomStruct));
            User user = roomStruct.owner;
            if (user != null) {
                user.roomId = roomStruct.id;
            }
            UrlModel urlModel = null;
            if (this.i) {
                this.p.setVisibility(0);
                this.q.setText(n().getString(C0906R.string.tl));
                this.r.setVisibility(0);
                this.o.setOnClickListener(new d(roomStruct));
                UrlModel urlModel2 = roomStruct.roomCover;
                if (urlModel2 == null) {
                    User user2 = roomStruct.owner;
                    if (user2 != null) {
                        urlModel = user2.getAvatarLarger();
                    }
                } else {
                    urlModel = urlModel2;
                }
            } else {
                this.p.setVisibility(8);
                this.q.setText(n().getString(C0906R.string.b66));
                this.r.setVisibility(8);
                User user3 = roomStruct.owner;
                if (user3 != null) {
                    urlModel = user3.getAvatarLarger();
                }
            }
            if (urlModel != null) {
                this.j.post(new b(urlModel, roomStruct, this));
            }
            F();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40410, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        if (this.f3138d == null || this.i) {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 40419, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 40419, new Class[0], Void.TYPE);
                return;
            }
            RoomStruct roomStruct = this.f3138d;
            if (roomStruct != null) {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1007").a("enter_from_merge", "homepage_follow").a("action_type", "click");
                User user = roomStruct.owner;
                Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("anchor_id", user.getUid()).a("room_id", roomStruct.id);
                Aweme aweme = this.f3137c;
                if (aweme == null) {
                    Intrinsics.throwNpe();
                }
                r.a("livesdk_rec_live_play", (Map) a3.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
                com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1007").a("enter_from_merge", "homepage_follow").a("action_type", "click");
                User user2 = roomStruct.owner;
                Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
                com.ss.android.ugc.aweme.app.d.d a5 = a4.a("anchor_id", user2.getUid()).a("room_id", roomStruct.id);
                Aweme aweme2 = this.f3137c;
                if (aweme2 == null) {
                    Intrinsics.throwNpe();
                }
                r.a("livesdk_live_show", (Map) a5.a("request_id", aweme2.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
            }
        }
    }

    public final void a_(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 40416, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 40416, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.l = true;
        this.k = System.currentTimeMillis();
        l();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 40415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 40415, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        E();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 40412, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 40412, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k = System.currentTimeMillis();
        this.l = true;
        D();
    }

    @Subscribe
    public final void onFollowLiveStatusChange(@NotNull com.bytedance.android.live.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, h, false, 40417, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, h, false, 40417, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null && roomStruct.id == aVar.f7685b && aVar.f7687d) {
            this.i = false;
            b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull View view, @Nullable aa<ar> aaVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View findViewById = view.findViewById(C0906R.id.cf8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.riv_cover)");
        this.j = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.ddz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.tv_live_nickname)");
        this.m = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.de2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.tv_live_title)");
        this.n = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.af9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.fl_bottom_container)");
        this.o = (FrameLayout) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.ddy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.tv_live_icon)");
        this.p = (DmtTextView) findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.de1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.tv_live_tips)");
        this.q = (DmtTextView) findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.b7j);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.lav_live_playing)");
        this.r = (LottieAnimationView) findViewById7;
        bg.c(this);
    }

    public final void a(@Nullable Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 40406, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, h, false, 40406, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, z);
        this.f3139e = new a();
        D();
    }
}
