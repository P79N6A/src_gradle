package com.ss.android.ugc.aweme.im.sdk.videofileplay;

import a.g;
import a.i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.c;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.ss.android.ugc.aweme.im.sdk.widget.DragView;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0016J\u0012\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020$H\u0014J\b\u00102\u001a\u00020$H\u0014J\"\u00103\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0016J\u0012\u00108\u001a\u0002092\b\u00104\u001a\u0004\u0018\u000105H\u0016J\"\u0010:\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0016J\u0012\u0010;\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u0010<\u001a\u00020$H\u0002J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\nH\u0002J\u0018\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nH\u0002J\u0012\u0010B\u001a\u00020$2\b\u0010C\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020F2\u0006\u0010A\u001a\u00020\nH\u0002J\u0018\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nH\u0002J\b\u0010I\u001a\u00020$H\u0002J\b\u0010J\u001a\u00020$H\u0002J\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/VideoFilePlayerActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/view/View$OnClickListener;", "()V", "mBackBtn", "Landroid/widget/FrameLayout;", "mCenterPlayBtn", "Landroid/widget/ImageView;", "mCurVideoUrl", "", "mDragContentView", "Landroid/view/View;", "mDragView", "Lcom/ss/android/ugc/aweme/im/sdk/widget/DragView;", "mDraggingState", "", "mLoadingStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "mLocalPoster", "mPlayVideoLayout", "mPoster", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "mTTVideoPlayer", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager;", "mVideo", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/EncryptedVideoContent;", "mVideoCoverImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mVideoHeight", "mVideoTextureView", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/widget/KeepSurfaceTextureView;", "mVideoWidth", "mViewInfo", "Lcom/ss/android/ugc/aweme/im/sdk/widget/DragView$IViewInfo;", "finish", "", "hideCenterPlayBtn", "initDragViewListener", "initEvents", "initParams", "initVideoPlayListener", "initViews", "onBackPressed", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "performOutAnimation", "playLocalVideo", "localVideoUrl", "playVideo", "videoUrl", "secretKey", "playVideoControl", "video", "playVideoWithResponse", "videoUrlResponse", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/model/VideoUrlResponse;", "playVideoWithVideoUrl", "tosKey", "setStatusBarTransparent", "showCenterPlayBtn", "videoFilePlayError", "errorMsg", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoFilePlayerActivity extends AmeActivity implements TextureView.SurfaceTextureListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52671a;
    public static final a i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f52672b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f52673c;

    /* renamed from: d  reason: collision with root package name */
    public DmtStatusView f52674d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteImageView f52675e;

    /* renamed from: f  reason: collision with root package name */
    public c f52676f;
    String g;
    public int h = -1;
    private DragView j;
    private View k;
    private KeepSurfaceTextureView l;
    private FrameLayout m;
    private DragView.b n;
    private EncryptedVideoContent o;
    private String p;
    private UrlModel q;
    private int r;
    private int s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/VideoFilePlayerActivity$Companion;", "", "()V", "KEY_DRAG_VIEW_INFO", "", "KEY_LOCAL_POSTER", "KEY_LOCAL_VIDEO", "KEY_VIDEO_CONTENT", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoFilePlayerActivity f52678b;

        b(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f52678b = videoFilePlayerActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f52677a, false, 53971, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52677a, false, 53971, new Class[0], Void.TYPE);
                return;
            }
            VideoFilePlayerActivity.d(this.f52678b).setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/videofileplay/VideoFilePlayerActivity$initDragViewListener$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/DragView$DragStateListener;", "onDragStart", "", "onDragging", "onEnterStart", "onExit", "onExitStart", "onExitUpdate", "valueAnimator", "Landroid/animation/ValueAnimator;", "onIdle", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements DragView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoFilePlayerActivity f52680b;

        public final void d() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f52679a, false, 53972, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52679a, false, 53972, new Class[0], Void.TYPE);
                return;
            }
            VideoFilePlayerActivity.a(this.f52680b).setVisibility(8);
            this.f52680b.h = -1;
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f52679a, false, 53973, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52679a, false, 53973, new Class[0], Void.TYPE);
                return;
            }
            VideoFilePlayerActivity.a(this.f52680b).setVisibility(8);
        }

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f52679a, false, 53976, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52679a, false, 53976, new Class[0], Void.TYPE);
                return;
            }
            VideoFilePlayerActivity.d(this.f52680b).setVisibility(8);
            VideoFilePlayerActivity.a(this.f52680b).setVisibility(8);
            this.f52680b.h = 1;
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f52679a, false, 53977, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52679a, false, 53977, new Class[0], Void.TYPE);
                return;
            }
            this.f52680b.h = 0;
            this.f52680b.finish();
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f52679a, false, 53975, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52679a, false, 53975, new Class[0], Void.TYPE);
                return;
            }
            if (VideoFilePlayerActivity.c(this.f52680b).getVisibility() != 0) {
                c cVar = this.f52680b.f52676f;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
                }
                if (!cVar.c()) {
                    VideoFilePlayerActivity.d(this.f52680b).setVisibility(0);
                    VideoFilePlayerActivity.d(this.f52680b).setAlpha(1.0f);
                }
            }
            VideoFilePlayerActivity.a(this.f52680b).setVisibility(0);
            this.f52680b.h = 0;
        }

        c(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f52680b = videoFilePlayerActivity;
        }

        public final void a(@Nullable ValueAnimator valueAnimator) {
            Object obj;
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52679a, false, 53974, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52679a, false, 53974, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                VideoFilePlayerActivity.b(this.f52680b).setAlpha(1.0f - ((Float) obj).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/videofileplay/VideoFilePlayerActivity$initVideoPlayListener$1", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager$OnPlayListener;", "onError", "", "errorMessage", "", "onPlayStateSwitch", "isPlaying", "", "onPrepared", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoFilePlayerActivity f52682b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f52681a, false, 53981, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52681a, false, 53981, new Class[0], Void.TYPE);
            }
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52681a, false, 53984, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52681a, false, 53984, new Class[]{Boolean.TYPE}, Void.TYPE);
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f52681a, false, 53982, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52681a, false, 53982, new Class[0], Void.TYPE);
            }
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f52681a, false, 53983, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52681a, false, 53983, new Class[0], Void.TYPE);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f52681a, false, 53978, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52681a, false, 53978, new Class[0], Void.TYPE);
                return;
            }
            VideoFilePlayerActivity.c(this.f52682b).setVisibility(8);
        }

        d(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f52682b = videoFilePlayerActivity;
        }

        public final void a(@Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f52681a, false, 53980, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f52681a, false, 53980, new Class[]{String.class}, Void.TYPE);
                return;
            }
            VideoFilePlayerActivity videoFilePlayerActivity = this.f52682b;
            String string = this.f52682b.getString(C0906R.string.azm);
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.im_video_file_play_error)");
            videoFilePlayerActivity.a(string);
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52681a, false, 53979, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52681a, false, 53979, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                this.f52682b.b();
                VideoFilePlayerActivity.b(this.f52682b).setAlpha(0.0f);
            } else {
                this.f52682b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/videofileplay/VideoFilePlayerActivity$playVideoWithVideoUrl$1", "Lbolts/Continuation;", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/model/VideoUrlResponse;", "Ljava/lang/Void;", "then", "task", "Lbolts/Task;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements g<com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoFilePlayerActivity f52684b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52685c;

        public final /* synthetic */ Object then(i iVar) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f52683a, false, 53985, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52683a, false, 53985, new Class[]{i.class}, Void.class);
            }
            if (iVar == null || (iVar.d() && iVar.e() == null)) {
                VideoFilePlayerActivity videoFilePlayerActivity = this.f52684b;
                String string = this.f52684b.getString(C0906R.string.ave);
                Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.im_network_error)");
                videoFilePlayerActivity.a(string);
            } else {
                VideoFilePlayerActivity videoFilePlayerActivity2 = this.f52684b;
                Object e2 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
                com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b) e2;
                String str3 = this.f52685c;
                if (PatchProxy.isSupport(new Object[]{bVar, str3}, videoFilePlayerActivity2, VideoFilePlayerActivity.f52671a, false, 53957, new Class[]{com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar, str3}, videoFilePlayerActivity2, VideoFilePlayerActivity.f52671a, false, 53957, new Class[]{com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b.class, String.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.im.sdk.videofileplay.a.a aVar = bVar.f52692a;
                    if (aVar != null) {
                        str = aVar.f52690a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        videoFilePlayerActivity2.g = aVar.f52690a;
                        videoFilePlayerActivity2.a(aVar.f52690a, str3);
                    } else {
                        if (aVar != null) {
                            str2 = aVar.f52691b;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            videoFilePlayerActivity2.g = aVar.f52691b;
                            videoFilePlayerActivity2.a(aVar.f52691b, str3);
                        } else {
                            String string2 = videoFilePlayerActivity2.getString(C0906R.string.azm);
                            Intrinsics.checkExpressionValueIsNotNull(string2, "getString(R.string.im_video_file_play_error)");
                            videoFilePlayerActivity2.a(string2);
                        }
                    }
                }
            }
            return null;
        }

        e(VideoFilePlayerActivity videoFilePlayerActivity, String str) {
            this.f52684b = videoFilePlayerActivity;
            this.f52685c = str;
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53969, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", false);
    }

    public final boolean onSurfaceTextureDestroyed(@Nullable SurfaceTexture surfaceTexture) {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(@Nullable SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public final void onSurfaceTextureUpdated(@Nullable SurfaceTexture surfaceTexture) {
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52671a, false, 53970, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52671a, false, 53970, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53966, new Class[0], Void.TYPE);
            return;
        }
        DragView dragView = this.j;
        if (dragView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragView");
        }
        dragView.a();
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53962, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53964, new Class[0], Void.TYPE);
            return;
        }
        c();
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53953, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        c cVar = this.f52676f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar.b();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53963, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c cVar = this.f52676f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        if (PatchProxy.isSupport(new Object[0], cVar, c.f52699a, false, 53906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f52699a, false, 53906, new Class[0], Void.TYPE);
        } else if (cVar.f52704e) {
            cVar.f52701b.c();
        } else {
            cVar.a((Function0<Unit>) new c.m<Unit>(cVar));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53960, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.h == -1 || this.h == 1)) {
            c cVar = this.f52676f;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
            }
            if (!cVar.c()) {
                DmtStatusView dmtStatusView = this.f52674d;
                if (dmtStatusView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
                }
                if (dmtStatusView.getVisibility() != 0) {
                    ImageView imageView = this.f52673c;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
                    }
                    imageView.setScaleX(2.5f);
                    ImageView imageView2 = this.f52673c;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
                    }
                    imageView2.setScaleY(2.5f);
                    ImageView imageView3 = this.f52673c;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
                    }
                    imageView3.setVisibility(0);
                    ImageView imageView4 = this.f52673c;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
                    }
                    imageView4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53961, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f52673c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
        }
        if (imageView.getVisibility() == 0) {
            ImageView imageView2 = this.f52673c;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
            }
            imageView2.animate().alpha(0.0f).setDuration(100).withEndAction(new b(this)).start();
        }
    }

    public static final /* synthetic */ FrameLayout a(VideoFilePlayerActivity videoFilePlayerActivity) {
        FrameLayout frameLayout = videoFilePlayerActivity.f52672b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackBtn");
        }
        return frameLayout;
    }

    public static final /* synthetic */ RemoteImageView b(VideoFilePlayerActivity videoFilePlayerActivity) {
        RemoteImageView remoteImageView = videoFilePlayerActivity.f52675e;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCoverImage");
        }
        return remoteImageView;
    }

    public static final /* synthetic */ DmtStatusView c(VideoFilePlayerActivity videoFilePlayerActivity) {
        DmtStatusView dmtStatusView = videoFilePlayerActivity.f52674d;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
        }
        return dmtStatusView;
    }

    public static final /* synthetic */ ImageView d(VideoFilePlayerActivity videoFilePlayerActivity) {
        ImageView imageView = videoFilePlayerActivity.f52673c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCenterPlayBtn");
        }
        return imageView;
    }

    private final void a(EncryptedVideoContent encryptedVideoContent) {
        String str;
        if (PatchProxy.isSupport(new Object[]{encryptedVideoContent}, this, f52671a, false, 53955, new Class[]{EncryptedVideoContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{encryptedVideoContent}, this, f52671a, false, 53955, new Class[]{EncryptedVideoContent.class}, Void.TYPE);
            return;
        }
        if (encryptedVideoContent != null) {
            str = encryptedVideoContent.getTosKey();
        } else {
            str = null;
        }
        if (str != null && encryptedVideoContent.getSecretKey() != null) {
            String tosKey = encryptedVideoContent.getTosKey();
            if (tosKey == null) {
                Intrinsics.throwNpe();
            }
            String secretKey = encryptedVideoContent.getSecretKey();
            if (secretKey == null) {
                Intrinsics.throwNpe();
            }
            b(tosKey, secretKey);
        } else if (!TextUtils.isEmpty(this.g)) {
            String str2 = this.g;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            b(str2);
        } else {
            String string = getString(C0906R.string.azm);
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.im_video_file_play_error)");
            a(string);
        }
    }

    private final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52671a, false, 53959, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52671a, false, 53959, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c cVar = this.f52676f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar.d(str);
        c cVar2 = this.f52676f;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar2.a();
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f52671a, false, 53965, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f52671a, false, 53965, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view == null || view.getId() != C0906R.id.b9s) {
            DmtStatusView dmtStatusView = this.f52674d;
            if (dmtStatusView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
            }
            if (dmtStatusView.getVisibility() == 8) {
                c cVar = this.f52676f;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
                }
                if (cVar.c()) {
                    c cVar2 = this.f52676f;
                    if (cVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
                    }
                    cVar2.b();
                    return;
                } else if (this.g != null) {
                    c cVar3 = this.f52676f;
                    if (cVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
                    }
                    cVar3.a();
                    return;
                } else {
                    b();
                    DmtStatusView dmtStatusView2 = this.f52674d;
                    if (dmtStatusView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
                    }
                    dmtStatusView2.setVisibility(0);
                    a(this.o);
                }
            }
            return;
        }
        c();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52671a, false, 53952, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52671a, false, 53952, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, str, 0).a();
        DmtStatusView dmtStatusView = this.f52674d;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
        }
        dmtStatusView.setVisibility(8);
        a();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        DragView.b bVar;
        String str;
        String str2;
        UrlModel urlModel;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f52671a, false, 53945, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f52671a, false, 53945, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", true);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53946, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(67108864);
            }
        }
        setContentView((int) C0906R.layout.c0);
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53947, new Class[0], Void.TYPE);
        } else {
            this.f52676f = new c(this, false, 2);
            Intent intent = getIntent();
            EncryptedVideoContent encryptedVideoContent = null;
            if (intent != null) {
                serializable = intent.getSerializableExtra("videoContent");
            } else {
                serializable = null;
            }
            StoryVideoContent storyVideoContent = (StoryVideoContent) serializable;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                bVar = (DragView.b) intent2.getParcelableExtra("dragViewInfo");
            } else {
                bVar = null;
            }
            this.n = bVar;
            Intent intent3 = getIntent();
            if (intent3 != null) {
                str = intent3.getStringExtra("localPoster");
            } else {
                str = null;
            }
            this.p = str;
            Intent intent4 = getIntent();
            if (intent4 != null) {
                str2 = intent4.getStringExtra("localVideo");
            } else {
                str2 = null;
            }
            this.g = str2;
            if (storyVideoContent != null) {
                urlModel = storyVideoContent.getDisplayPoster();
            } else {
                urlModel = null;
            }
            this.q = urlModel;
            if (storyVideoContent != null) {
                i2 = storyVideoContent.getHeight();
            } else {
                i2 = 0;
            }
            this.r = i2;
            if (storyVideoContent != null) {
                i3 = storyVideoContent.getWidth();
            } else {
                i3 = 0;
            }
            this.s = i3;
            if (storyVideoContent != null) {
                encryptedVideoContent = storyVideoContent.getVideo();
            }
            this.o = encryptedVideoContent;
        }
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53948, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.bag);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.layout_video_drag_container)");
            this.j = (DragView) findViewById;
            if (Build.VERSION.SDK_INT >= 19) {
                DragView dragView = this.j;
                if (dragView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragView");
                }
                dragView.setFullScreenWindow(true);
            }
            View findViewById2 = findViewById(C0906R.id.b9u);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.layout_play_video)");
            this.m = (FrameLayout) findViewById2;
            View findViewById3 = findViewById(C0906R.id.b9s);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.layout_play_back)");
            this.f52672b = (FrameLayout) findViewById3;
            FrameLayout frameLayout = this.f52672b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackBtn");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                Context context = this;
                ((FrameLayout.LayoutParams) layoutParams).topMargin = StatusBarUtils.getStatusBarHeight(context);
                LayoutInflater from = LayoutInflater.from(context);
                DragView dragView2 = this.j;
                if (dragView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragView");
                }
                View inflate = from.inflate(C0906R.layout.vu, dragView2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(this…detail, mDragView, false)");
                this.k = inflate;
                View view = this.k;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                }
                View findViewById4 = view.findViewById(C0906R.id.a81);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mDragContentView.findVie…Id(R.id.dsv_play_loading)");
                this.f52674d = (DmtStatusView) findViewById4;
                View view2 = this.k;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                }
                View findViewById5 = view2.findViewById(C0906R.id.cx5);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mDragContentView.findViewById(R.id.stv_play_video)");
                this.l = (KeepSurfaceTextureView) findViewById5;
                View view3 = this.k;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                }
                View findViewById6 = view3.findViewById(C0906R.id.cf9);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mDragContentView.findVie…yId(R.id.riv_video_cover)");
                this.f52675e = (RemoteImageView) findViewById6;
                View view4 = this.k;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                }
                View findViewById7 = view4.findViewById(C0906R.id.b44);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mDragContentView.findViewById(R.id.iv_play_center)");
                this.f52673c = (ImageView) findViewById7;
                if (this.n != null) {
                    View view5 = this.k;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                    }
                    View findViewById8 = view5.findViewById(C0906R.id.b9u);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mDragContentView.findVie…d(R.id.layout_play_video)");
                    DragView dragView3 = this.j;
                    if (dragView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDragView");
                    }
                    View view6 = this.k;
                    if (view6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
                    }
                    dragView3.a(view6, findViewById8, this.n);
                }
                UrlModel a2 = com.ss.android.ugc.aweme.im.sdk.chat.c.a.a(this.q, this.p);
                RemoteImageView remoteImageView = this.f52675e;
                if (remoteImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoCoverImage");
                }
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, a2);
                DmtStatusView dmtStatusView = this.f52674d;
                if (dmtStatusView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
                }
                dmtStatusView.setBuilder(DmtStatusView.a.a(context));
                DmtStatusView dmtStatusView2 = this.f52674d;
                if (dmtStatusView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingStatusView");
                }
                dmtStatusView2.d();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53949, new Class[0], Void.TYPE);
        } else {
            KeepSurfaceTextureView keepSurfaceTextureView = this.l;
            if (keepSurfaceTextureView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoTextureView");
            }
            keepSurfaceTextureView.setSurfaceTextureListener(this);
            View view7 = this.k;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDragContentView");
            }
            View.OnClickListener onClickListener = this;
            view7.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayVideoLayout");
            }
            frameLayout2.setOnClickListener(onClickListener);
            FrameLayout frameLayout3 = this.f52672b;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackBtn");
            }
            frameLayout3.setOnClickListener(onClickListener);
            if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53951, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53951, new Class[0], Void.TYPE);
            } else {
                c cVar = this.f52676f;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
                }
                c.b dVar = new d(this);
                if (PatchProxy.isSupport(new Object[]{dVar}, cVar, c.f52699a, false, 53898, new Class[]{c.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, cVar, c.f52699a, false, 53898, new Class[]{c.b.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(dVar, "listener");
                    cVar.f52702c = dVar;
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f52671a, false, 53950, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52671a, false, 53950, new Class[0], Void.TYPE);
            } else {
                DragView dragView4 = this.j;
                if (dragView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDragView");
                }
                dragView4.setDragStateListener(new c(this));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", false);
    }

    private final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52671a, false, 53956, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52671a, false, 53956, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a.f52687b.a(str3).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this, str4), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f52671a, false, 53958, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f52671a, false, 53958, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        c cVar = this.f52676f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar.b(str2);
        c cVar2 = this.f52676f;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar2.c(str);
        c cVar3 = this.f52676f;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
        }
        cVar3.a();
    }

    public final void onSurfaceTextureAvailable(@Nullable SurfaceTexture surfaceTexture, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52671a, false, 53954, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52671a, false, 53954, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        KeepSurfaceTextureView keepSurfaceTextureView = this.l;
        if (keepSurfaceTextureView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoTextureView");
        }
        if (keepSurfaceTextureView.f52711d) {
            c cVar = this.f52676f;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTTVideoPlayer");
            }
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.l;
            if (keepSurfaceTextureView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoTextureView");
            }
            Surface surface = keepSurfaceTextureView2.getSurface();
            if (PatchProxy.isSupport(new Object[]{surface}, cVar, c.f52699a, false, 53907, new Class[]{Surface.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{surface}, cVar2, c.f52699a, false, 53907, new Class[]{Surface.class}, Void.TYPE);
            } else if (cVar.f52704e) {
                cVar.f52701b.a(surface);
            } else {
                cVar.a((Function0<Unit>) new c.q<Unit>(cVar, surface));
            }
            a(this.o);
            return;
        }
        String string = getString(C0906R.string.azm);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.im_video_file_play_error)");
        a(string);
    }
}
