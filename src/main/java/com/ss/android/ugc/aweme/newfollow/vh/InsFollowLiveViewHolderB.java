package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0016H\u0014R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderB;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderA;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "livePlayHelper", "Lcom/ss/android/ugc/aweme/newfollow/live/LivePlayHelper;", "liveStreamViewContainer", "Landroid/widget/FrameLayout;", "getLiveStreamViewContainer", "()Landroid/widget/FrameLayout;", "setLiveStreamViewContainer", "(Landroid/widget/FrameLayout;)V", "inflateStub", "", "root", "Landroid/view/View;", "initLiveView", "onDestroy", "onLiveSizeChanged", "width", "", "height", "onStop", "pauseLive", "playLive", "room", "Lcom/ss/android/ugc/aweme/follow/presenter/RoomStruct;", "showCover", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsFollowLiveViewHolderB extends InsFollowLiveViewHolderA {
    public static ChangeQuickRedirect Y;
    @NotNull
    public FrameLayout Z;
    private com.ss.android.ugc.aweme.newfollow.live.b aa;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57620a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderB f57621b;

        a(InsFollowLiveViewHolderB insFollowLiveViewHolderB) {
            this.f57621b = insFollowLiveViewHolderB;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f57620a, false, 62497, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57620a, false, 62497, new Class[0], Void.TYPE);
            } else if (!Intrinsics.areEqual((Object) this.f57621b.getClass(), (Object) InsFollowLiveViewHolderB.class) && !Intrinsics.areEqual((Object) this.f57621b.getClass(), (Object) InsFollowLiveViewHolderC.class)) {
                this.f57621b.f3682c = false;
                this.f57621b.D();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderB$initLiveView$2", "Lcom/ss/android/ugc/aweme/newfollow/vh/ILiveCallback;", "onVideoSizeChange", "", "textureView", "Landroid/view/TextureView;", "width", "", "height", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowLiveViewHolderB f57623b;

        b(InsFollowLiveViewHolderB insFollowLiveViewHolderB) {
            this.f57623b = insFollowLiveViewHolderB;
        }

        public final void a(@NotNull g.b bVar) {
            g.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f57622a, false, 62499, new Class[]{g.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f57622a, false, 62499, new Class[]{g.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "message");
            x.a.a(this, bVar);
        }

        public final void a(@Nullable TextureView textureView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57622a, false, 62498, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57622a, false, 62498, new Class[]{TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f57623b.a(i, i2);
        }
    }

    public void a(int i, int i2) {
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, Y, false, 62495, new Class[0], Void.TYPE);
            return;
        }
        super.T();
        com.ss.android.ugc.aweme.newfollow.live.b bVar = this.aa;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livePlayHelper");
        }
        bVar.b();
    }

    public final void U() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, Y, false, 62496, new Class[0], Void.TYPE);
            return;
        }
        super.U();
        com.ss.android.ugc.aweme.newfollow.live.b bVar = this.aa;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livePlayHelper");
        }
        bVar.c();
    }

    public final void ai() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, Y, false, 62494, new Class[0], Void.TYPE);
            return;
        }
        super.ai();
        com.ss.android.ugc.aweme.newfollow.live.b bVar = this.aa;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livePlayHelper");
        }
        bVar.a();
    }

    @NotNull
    public final FrameLayout aj() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62488, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, Y, false, 62488, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.Z;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveStreamViewContainer");
        }
        return frameLayout;
    }

    public final void ah() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, Y, false, 62491, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = this.itemView.findViewById(C0906R.id.bf6);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…ve_stream_view_container)");
        this.Z = (FrameLayout) findViewById;
        this.aa = new com.ss.android.ugc.aweme.newfollow.live.b(new a(this), new b(this));
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, Y, false, 62492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, Y, false, 62492, new Class[0], Void.TYPE);
            return;
        }
        if (ag().roomCover != null) {
            if (this.f3682c) {
                UrlModel urlModel = ag().roomCover;
                Intrinsics.checkExpressionValueIsNotNull(urlModel, "mRoom.roomCover");
                RemoteImageView remoteImageView = this.mCoverView;
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "mCoverView");
                float width = (((float) urlModel.getWidth()) * 1.0f) / ((float) remoteImageView.getWidth());
                RemoteImageView remoteImageView2 = this.mCoverView;
                UrlModel urlModel2 = ag().roomCover;
                RemoteImageView remoteImageView3 = this.mCoverView;
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView3, "mCoverView");
                int width2 = remoteImageView3.getWidth();
                RemoteImageView remoteImageView4 = this.mCoverView;
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView4, "mCoverView");
                c.a(remoteImageView2, urlModel2, width2, remoteImageView4.getHeight(), (Postprocessor) new com.ss.android.ugc.aweme.newfollow.live.a(5, width, null));
                return;
            }
            RemoteImageView remoteImageView5 = this.mCoverView;
            UrlModel urlModel3 = ag().roomCover;
            RemoteImageView remoteImageView6 = this.mCoverView;
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView6, "mCoverView");
            int width3 = remoteImageView6.getWidth();
            RemoteImageView remoteImageView7 = this.mCoverView;
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView7, "mCoverView");
            c.a(remoteImageView5, urlModel3, width3, remoteImageView7.getHeight());
        }
    }

    public final void a(@NotNull RoomStruct roomStruct) {
        if (PatchProxy.isSupport(new Object[]{roomStruct}, this, Y, false, 62493, new Class[]{RoomStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct}, this, Y, false, 62493, new Class[]{RoomStruct.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(roomStruct, "room");
        super.a(roomStruct);
        if (!this.f3685f) {
            boolean areEqual = Intrinsics.areEqual((Object) getClass(), (Object) InsFollowLiveViewHolderD.class);
            com.ss.android.ugc.aweme.newfollow.live.b bVar = this.aa;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("livePlayHelper");
            }
            FrameLayout frameLayout = this.Z;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveStreamViewContainer");
            }
            bVar.a(areEqual, roomStruct, frameLayout);
        }
    }

    public void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        if (PatchProxy.isSupport(new Object[]{view}, this, Y, false, 62490, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, Y, false, 62490, new Class[]{View.class}, Void.TYPE);
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
            viewStub3.setLayoutResource(C0906R.layout.a47);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowLiveViewHolderB(@NotNull FollowFeedLayout followFeedLayout, @NotNull com.ss.android.ugc.aweme.forward.a.a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        this.f3682c = true;
    }
}
