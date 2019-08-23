package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.d;
import com.ss.android.ugc.aweme.video.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u001a\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020 H\u0016J\n\u00101\u001a\u0004\u0018\u00010\nH\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020 H\u0016J\n\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u000203H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\n\u00109\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010:\u001a\u00020\u0002H\u0016J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\n\u0010A\u001a\u0004\u0018\u00010BH\u0016J\n\u0010C\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010D\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010E\u001a\u00020 H\u0016J\b\u0010F\u001a\u00020*H\u0016J\u0010\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020 H\u0016J\u0010\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020 H\u0016J\u001c\u0010K\u001a\u00020*2\b\u0010L\u001a\u0004\u0018\u00010\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010N\u001a\u00020*2\u0006\u0010J\u001a\u00020 H\u0016J\b\u0010O\u001a\u00020*H\u0016J\u0010\u0010P\u001a\u00020*2\u0006\u0010Q\u001a\u000203H\u0016J\b\u0010R\u001a\u00020*H\u0016J\b\u0010S\u001a\u00020*H\u0016J\u0010\u0010T\u001a\u00020*2\u0006\u0010U\u001a\u000203H\u0016J\u0010\u0010V\u001a\u00020*2\u0006\u0010U\u001a\u000203H\u0016J\b\u0010W\u001a\u00020*H\u0016J\b\u0010X\u001a\u00020*H\u0016J\b\u0010Y\u001a\u00020*H\u0016J\b\u0010Z\u001a\u00020*H\u0016J\u0012\u0010[\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010]\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010^\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010_\u001a\u00020*2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0010\u0010b\u001a\u00020*2\u0006\u0010c\u001a\u00020dH\u0016J\u0012\u0010e\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010f\u001a\u00020*2\u0006\u0010g\u001a\u00020 H\u0016J\u0012\u0010h\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010iH\u0016J\u0012\u0010j\u001a\u00020*2\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\b\u0010m\u001a\u00020*H\u0016J\u0012\u0010n\u001a\u00020*2\b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010o\u001a\u00020*2\b\u0010p\u001a\u0004\u0018\u00010aH\u0016J\u0010\u0010q\u001a\u00020*2\u0006\u0010r\u001a\u000203H\u0016J\b\u0010s\u001a\u00020*H\u0016J\u0010\u0010t\u001a\u00020*2\u0006\u00100\u001a\u00020 H\u0016J\b\u0010u\u001a\u00020*H\u0016J\u0012\u0010v\u001a\u00020*2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\u0012\u0010y\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010z\u001a\u00020*2\u0006\u0010{\u001a\u00020\u0014H\u0016J\u0012\u0010|\u001a\u00020*2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\b\u0010\u001a\u00020*H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/BaseFeedLiveViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedPlayerView;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;)V", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mEnterMethodValue", "", "getMEnterMethodValue", "()Ljava/lang/String;", "setMEnterMethodValue", "(Ljava/lang/String;)V", "mLiveCallBack", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;", "getMLiveCallBack", "()Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;", "setMLiveCallBack", "(Lcom/ss/android/ugc/aweme/feed/adapter/IFeedLiveCallBack;)V", "mLoadDirectly", "", "mRoomStruct", "Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "getMRoomStruct", "()Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "setMRoomStruct", "(Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;)V", "getView", "()Landroid/view/View;", "bind", "", "aweme", "loadDirectly", "bindView", "doAdaptation", "enterDislikeMode", "clean", "getAweme", "getAwemeType", "", "getCleanMode", "getCommerceDelegate", "Lcom/ss/android/ugc/aweme/commercialize/feed/CommerceVideoDelegate;", "getContentType", "getContext", "getFeedLiveCallback", "getFeedPlayerView", "getFeedUGView", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedUGView;", "getInfoHudViewHolder", "Lcom/ss/android/ugc/aweme/video/widget/InfoHudViewHolder;", "getSurface", "Landroid/view/Surface;", "getVideoPlayerView", "Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;", "getVideoView", "handleDoubleClick", "isTextureAvailable", "lazyBindView", "makeTexturePaused", "pause", "onBuffering", "start", "onCommentOrForwardSuccess", "labelInfo", "awemeId", "onDecoderBuffering", "onDestroyView", "onFeedPlayCompleted", "playTime", "onFeedRenderReady", "onFeedResumePlay", "onHolderPause", "mode", "onHolderResume", "onInstantiateItem", "onPageScrolled", "onPageSelected", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onProgressBarStateChanged", "startOrStop", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "onViewHolderSelected", "position", "onViewHolderUnSelected", "openCleanMode", "playLive", "privateFeedSuccess", "privateModelEvent", "Lcom/ss/android/ugc/aweme/feed/event/PrivateModelEvent;", "resumeFeedPlay", "setEnterMethodValue", "enterMethodValue", "shareComplete", "event", "Lcom/ss/android/ugc/aweme/im/service/model/ShareCompleteEvent;", "unBind", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class a implements IFeedPlayerView, IFeedViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3135a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Context f3136b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Aweme f3137c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public RoomStruct f3138d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public o f3139e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public String f3140f = "click";
    @NotNull
    public final View g;
    private boolean h;

    public final void A() {
    }

    public final Aweme B() {
        if (!PatchProxy.isSupport(new Object[0], this, f3135a, false, 40284, new Class[0], Aweme.class)) {
            return q.a(this);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40284, new Class[0], Aweme.class);
    }

    public final boolean C() {
        if (!PatchProxy.isSupport(new Object[0], this, f3135a, false, 40286, new Class[0], Boolean.TYPE)) {
            return false;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40286, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(float f2) {
    }

    public void a(int i) {
    }

    public final void a(@Nullable ad adVar) {
    }

    public final void a(Aweme aweme, boolean z, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, (byte) 1, Integer.valueOf(i)}, this, f3135a, false, 40285, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, (byte) 1, Integer.valueOf(i)}, this, f3135a, false, 40285, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(this, aweme2, true, i);
    }

    public final void a(@Nullable g gVar) {
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
    }

    public final void a(@Nullable b bVar) {
    }

    public final void a(@Nullable e eVar) {
    }

    public final void a(@Nullable String str) {
    }

    public final void a(@Nullable String str, @Nullable String str2) {
    }

    public final void a(boolean z) {
    }

    public void a_(@Nullable Aweme aweme) {
    }

    public void b() {
    }

    public void b(int i) {
    }

    public final void b(@Nullable Aweme aweme) {
    }

    public final void b(@Nullable e eVar) {
    }

    public final void b(@Nullable String str) {
    }

    public final void b(boolean z) {
    }

    public final int c() {
        return BaseLoginOrRegisterActivity.o;
    }

    public final void c(int i) {
    }

    public final void c(@Nullable String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(int i) {
    }

    public final void d(@Nullable String str) {
    }

    public final void d(boolean z) {
    }

    public void e() {
    }

    public final void e(@Nullable String str) {
    }

    public final void e(boolean z) {
    }

    public final void f(boolean z) {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    @NotNull
    public final IFeedPlayerView k() {
        return this;
    }

    @Nullable
    public final com.ss.android.ugc.playerkit.videoview.g m() {
        return null;
    }

    public final int q() {
        return 2;
    }

    @Nullable
    public final CommerceVideoDelegate r() {
        return null;
    }

    public final void s() {
    }

    @Nullable
    public final p t() {
        return null;
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return true;
    }

    @Nullable
    public final Surface w() {
        return null;
    }

    @Nullable
    public final View x() {
        return null;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.video.f.a y() {
        return null;
    }

    public final void z() {
    }

    @Nullable
    public final Aweme d() {
        return this.f3137c;
    }

    @NotNull
    public final Context n() {
        return this.f3136b;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40277, new Class[0], Void.TYPE);
            return;
        }
        if (!this.h) {
            b();
            this.h = true;
        }
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40280, new Class[0], Void.TYPE);
            return;
        }
        d b2 = d.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "LivePlayerManager.inst()");
        b2.f76038b = this.f3139e;
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40281, new Class[0], Void.TYPE);
            return;
        }
        l();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40282, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder.a(this.f3136b);
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40278, new Class[0], Void.TYPE);
            return;
        }
        o oVar = this.f3139e;
        d b2 = d.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "LivePlayerManager.inst()");
        if (Intrinsics.areEqual((Object) oVar, (Object) b2.f76038b)) {
            d b3 = d.b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "LivePlayerManager.inst()");
            b3.f76038b = null;
        }
    }

    public void t_() {
        if (PatchProxy.isSupport(new Object[0], this, f3135a, false, 40279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3135a, false, 40279, new Class[0], Void.TYPE);
            return;
        }
        o oVar = this.f3139e;
        d b2 = d.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "LivePlayerManager.inst()");
        if (Intrinsics.areEqual((Object) oVar, (Object) b2.f76038b)) {
            d b3 = d.b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "LivePlayerManager.inst()");
            b3.f76038b = null;
        }
    }

    public a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.g = view;
        Context context = this.g.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.f3136b = context;
    }

    public final void f(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3135a, false, 40283, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3135a, false, 40283, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "enterMethodValue");
        this.f3140f = str2;
    }

    public void a(@Nullable Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3135a, false, 40276, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, f3135a, false, 40276, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3137c = aweme;
        this.h = z;
        Aweme aweme2 = this.f3137c;
        if (aweme2 != null) {
            this.f3138d = d.b().f76039c.get(aweme2.getStreamUrlModel().id);
        }
        if (this.h) {
            b();
        }
    }
}
