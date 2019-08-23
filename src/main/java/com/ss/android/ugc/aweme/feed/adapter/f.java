package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.newfollow.vh.x;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\u001a\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0012H\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u000200H\u0007J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020!H\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\u0010\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020!H\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\b\u00108\u001a\u00020\u001fH\u0016J\u0012\u00109\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010:\u001a\u00020\u001fH\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew;", "Lcom/ss/android/ugc/aweme/feed/adapter/BaseFeedLiveViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;)V", "livePlayHelper", "Lcom/ss/android/ugc/aweme/newfollow/live/LivePlayHelper;", "getLivePlayHelper", "()Lcom/ss/android/ugc/aweme/newfollow/live/LivePlayHelper;", "mBottomContainer", "Landroid/widget/FrameLayout;", "mCoverView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mGradualBottomView", "mIsFirstLog", "", "mLiveAlive", "mLiveContainer", "mLiveIconTxt", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mLivePlayingAnimView", "Lcom/airbnb/lottie/LottieAnimationView;", "mLiveTips", "mNameTxt", "mStartShowTime", "", "mTitleTxt", "adjustLiveContainerSize", "", "width", "", "height", "bind", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "loadDirectly", "bindView", "checkLiveAlive", "doAdaptation", "logLiveDuration", "logLivePlay", "logLiveStreamPlay", "onDestroyView", "onFollowLiveStatusChange", "event", "Lcom/bytedance/android/live/base/event/RoomStatusEvent;", "onHolderPause", "mode", "onPause", "onResume", "onViewHolderSelected", "position", "onViewHolderUnSelected", "playLive", "resumeFeedPlay", "tryDoAdaptation", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends a {
    public static ChangeQuickRedirect h;
    public boolean i = true;
    public boolean j = true;
    public final RemoteImageView k;
    final FrameLayout l;
    @NotNull
    public final com.ss.android.ugc.aweme.newfollow.live.b m;
    private long n;
    private final DmtTextView o;
    private final DmtTextView p;
    private final FrameLayout q;
    private final View r;
    private final DmtTextView s;
    private final DmtTextView t;
    private final LottieAnimationView u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew$bind$1", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;", "onLivePause", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f44914b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f44913a, false, 40445, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44913a, false, 40445, new Class[0], Void.TYPE);
                return;
            }
            this.f44914b.m.a();
        }

        a(f fVar) {
            this.f44914b = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew$bindView$1$2"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f44917c;

        b(RoomStruct roomStruct, f fVar) {
            this.f44916b = roomStruct;
            this.f44917c = fVar;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f44915a, false, 40446, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44915a, false, 40446, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.story.live.c a2 = com.ss.android.ugc.aweme.story.live.c.a();
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            a2.a(new c.a(view.getContext(), this.f44916b.owner).b("homepage_follow").c("live_cell"));
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("room_id", this.f44916b.id);
            User user = this.f44916b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
            r.a("livesdk_click_enter_room", (Map) a3.a("anchor_id", user.getUid()).a("enter_from_merge", "homepage_follow").a("enter_method", "live_cell_cover").a("scene_id", "1001").f34114b);
            com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("room_id", this.f44916b.id);
            User user2 = this.f44916b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("anchor_id", user2.getUid()).a("enter_from_merge", "homepage_follow").a("enter_method", "live_cell").a("action_type", "click");
            Aweme aweme = this.f44917c.f3137c;
            if (aweme != null) {
                str = aweme.getRequestId();
            } else {
                str = null;
            }
            r.a("livesdk_live_show", (Map) a5.a("request_id", str).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew$bindView$1$3"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UrlModel f44919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f44920c;

        c(UrlModel urlModel, f fVar) {
            this.f44919b = urlModel;
            this.f44920c = fVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44918a, false, 40447, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44918a, false, 40447, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.c.a(this.f44920c.k, this.f44919b, this.f44920c.k.getWidth(), this.f44920c.k.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, (((float) this.f44919b.getWidth()) * 1.0f) / ((float) this.f44920c.k.getWidth()), null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomStruct f44922b;

        d(RoomStruct roomStruct) {
            this.f44922b = roomStruct;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44921a, false, 40448, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44921a, false, 40448, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            UserProfileActivity.b(view.getContext(), this.f44922b.owner, "homepage_follow");
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            User user = this.f44922b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("room_id", this.f44922b.id);
            User user2 = this.f44922b.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
            r.a("enter_personal_detail", (Map) a3.a("anchor_id", user2.getUid()).a("enter_method", "click_name").a("scene_id", "1045").f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew$checkLiveAlive$1$1", "Lcom/bytedance/android/livesdkapi/service/ICheckRoomStatusCallback;", "onFailed", "", "onSuccess", "alive", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.android.livesdkapi.service.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f44924b;

        e(f fVar) {
            this.f44924b = fVar;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44923a, false, 40449, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44923a, false, 40449, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z != this.f44924b.i) {
                this.f44924b.i = z;
                this.f44924b.b();
            }
            if (!z) {
                this.f44924b.m.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.f$f  reason: collision with other inner class name */
    static final class C0559f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f44926b;

        C0559f(f fVar) {
            this.f44926b = fVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f44925a, false, 40450, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44925a, false, 40450, new Class[0], Void.TYPE);
                return;
            }
            if (this.f44926b.j) {
                this.f44926b.j = false;
                f fVar = this.f44926b;
                if (PatchProxy.isSupport(new Object[0], fVar, f.h, false, 40442, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], fVar, f.h, false, 40442, new Class[0], Void.TYPE);
                    return;
                }
                RoomStruct roomStruct = fVar.f3138d;
                if (roomStruct != null) {
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1007").a("enter_from_merge", "homepage_follow").a("action_type", "click");
                    User user = roomStruct.owner;
                    Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
                    com.ss.android.ugc.aweme.app.d.d a3 = a2.a("anchor_id", user.getUid()).a("room_id", roomStruct.id);
                    Aweme aweme = fVar.f3137c;
                    if (aweme == null) {
                        Intrinsics.throwNpe();
                    }
                    r.a("livesdk_live_play", (Map) a3.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/feed/adapter/FeedLiveViewHolderNew$livePlayHelper$2", "Lcom/ss/android/ugc/aweme/newfollow/vh/ILiveCallback;", "onVideoSizeChange", "", "textureView", "Landroid/view/TextureView;", "width", "", "height", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements x {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f44928b;

        g(f fVar) {
            this.f44928b = fVar;
        }

        public final void a(@NotNull g.b bVar) {
            g.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f44927a, false, 40452, new Class[]{g.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f44927a, false, 40452, new Class[]{g.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "message");
            x.a.a(this, bVar);
        }

        public final void a(@Nullable TextureView textureView, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44927a, false, 40451, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44927a, false, 40451, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            f fVar = this.f44928b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, fVar, f.h, false, 40429, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, fVar, f.h, false, 40429, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams = fVar.l.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i3 > i4) {
                    marginLayoutParams.width = p.b(fVar.f3136b);
                    marginLayoutParams.height = (int) (((float) marginLayoutParams.width) * (((float) i4) / ((float) i3)));
                    marginLayoutParams.topMargin = (int) UIUtils.dip2Px(fVar.f3136b, 136.0f);
                } else {
                    marginLayoutParams.width = p.b(fVar.f3136b);
                    marginLayoutParams.height = p.a(fVar.f3136b);
                    marginLayoutParams.topMargin = 0;
                }
                fVar.l.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final void D() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40433, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            com.bytedance.android.livesdkapi.service.c d2 = com.ss.android.ugc.aweme.live.a.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            d2.a(roomStruct.id, (com.bytedance.android.livesdkapi.service.a) new e(this));
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40430, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.u.pauseAnimation();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40431, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        this.u.resumeAnimation();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40444, new Class[0], Void.TYPE);
            return;
        }
        F();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40435, new Class[0], Void.TYPE);
            return;
        }
        E();
    }

    public final void t_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40436, new Class[0], Void.TYPE);
            return;
        }
        super.t_();
        this.m.c();
        bg.d(this);
    }

    private final void F() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40443, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.profile.a.a().l) {
            i2 = this.f3136b.getResources().getDimensionPixelSize(C0906R.dimen.lv);
        }
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i2;
            this.q.setLayoutParams(marginLayoutParams);
            bg.a(new com.ss.android.ugc.aweme.feed.f.c(!com.ss.android.ugc.aweme.profile.a.a().l));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void E() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40440, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.n <= 0 || this.f3137c == null || this.f3138d == null)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1003").a("duration", System.currentTimeMillis() - this.n).a("enter_from_merge", "homepage_follow").a("action_type", "click");
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
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40428, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            if (TextUtils.isEmpty(roomStruct.title)) {
                this.p.setVisibility(8);
            } else {
                this.p.setText(roomStruct.title);
                this.p.setVisibility(0);
            }
            this.o.setText(ex.b(roomStruct.owner, true));
            this.o.setOnClickListener(new d(roomStruct));
            User user = roomStruct.owner;
            if (user != null) {
                user.roomId = roomStruct.id;
            }
            UrlModel urlModel = null;
            if (this.i) {
                this.s.setVisibility(0);
                this.t.setText(n().getString(C0906R.string.tl));
                this.u.setVisibility(0);
                this.q.setOnClickListener(new b(roomStruct, this));
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
                this.s.setVisibility(8);
                this.t.setText(n().getString(C0906R.string.b66));
                this.u.setVisibility(8);
                User user3 = roomStruct.owner;
                if (user3 != null) {
                    urlModel = user3.getAvatarLarger();
                }
            }
            if (urlModel != null) {
                this.k.post(new c(urlModel, this));
            }
            F();
            D();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40432, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null) {
            if (this.i) {
                this.m.a(false, roomStruct, this.l);
            } else {
                return;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 40441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 40441, new Class[0], Void.TYPE);
            return;
        }
        RoomStruct roomStruct2 = this.f3138d;
        if (roomStruct2 != null) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1007").a("enter_from_merge", "homepage_follow").a("action_type", "click");
            User user = roomStruct2.owner;
            Intrinsics.checkExpressionValueIsNotNull(user, "it.owner");
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("anchor_id", user.getUid()).a("room_id", roomStruct2.id);
            Aweme aweme = this.f3137c;
            if (aweme == null) {
                Intrinsics.throwNpe();
            }
            r.a("livesdk_rec_live_play", (Map) a3.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
            com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1007").a("enter_from_merge", "homepage_follow").a("action_type", "click");
            User user2 = roomStruct2.owner;
            Intrinsics.checkExpressionValueIsNotNull(user2, "it.owner");
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("anchor_id", user2.getUid()).a("room_id", roomStruct2.id);
            Aweme aweme2 = this.f3137c;
            if (aweme2 == null) {
                Intrinsics.throwNpe();
            }
            r.a("livesdk_live_show", (Map) a5.a("request_id", aweme2.getRequestId()).a("enter_method", "live_cell_cover").f34114b);
        }
    }

    public final void a_(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, h, false, 40438, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, h, false, 40438, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.j = true;
        this.n = System.currentTimeMillis();
        l();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 40437, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 40437, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        E();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 40434, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 40434, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = System.currentTimeMillis();
        this.j = true;
        D();
    }

    @Subscribe
    public final void onFollowLiveStatusChange(@NotNull com.bytedance.android.live.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, h, false, 40439, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, h, false, 40439, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        RoomStruct roomStruct = this.f3138d;
        if (roomStruct != null && roomStruct.id == aVar.f7685b && aVar.f7687d) {
            this.i = false;
            b();
            this.m.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(@NotNull View view, @Nullable aa<ar> aaVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View findViewById = view.findViewById(C0906R.id.cf8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.riv_cover)");
        this.k = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.ddz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.tv_live_nickname)");
        this.o = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.de2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.tv_live_title)");
        this.p = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.afv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.fl_live_container)");
        this.l = (FrameLayout) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.af9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.fl_bottom_container)");
        this.q = (FrameLayout) findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.alf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.gradual_bottom)");
        this.r = findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.ddy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.tv_live_icon)");
        this.s = (DmtTextView) findViewById7;
        View findViewById8 = view.findViewById(C0906R.id.de1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "view.findViewById(R.id.tv_live_tips)");
        this.t = (DmtTextView) findViewById8;
        View findViewById9 = view.findViewById(C0906R.id.b7j);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "view.findViewById(R.id.lav_live_playing)");
        this.u = (LottieAnimationView) findViewById9;
        this.m = new com.ss.android.ugc.aweme.newfollow.live.b(new C0559f(this), new g(this));
        bg.c(this);
        this.r.getLayoutParams().height = (UIUtils.getScreenHeight(this.f3136b) * 3) / 4;
    }

    public final void a(@Nullable Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 40427, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, h, false, 40427, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, z);
        this.f3139e = new a(this);
    }
}
