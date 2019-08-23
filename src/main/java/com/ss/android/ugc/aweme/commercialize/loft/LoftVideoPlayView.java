package com.ss.android.ugc.aweme.commercialize.loft;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.d;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.u.aq;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u000204J\u0010\u0010T\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010\u0002J\b\u0010V\u001a\u00020\u001dH\u0002J\b\u0010W\u001a\u00020HH\u0016J\b\u0010X\u001a\u00020RH\u0002J\b\u0010Y\u001a\u00020RH\u0002J\b\u0010Z\u001a\u00020RH\u0016J\u0012\u0010[\u001a\u00020R2\b\u0010#\u001a\u0004\u0018\u00010$H\u0017J\u001a\u0010[\u001a\u00020R2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\\\u001a\u0004\u0018\u00010]J\u001c\u0010^\u001a\u00020R2\b\u0010_\u001a\u0004\u0018\u00010$2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\u0010\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\u001dH\u0016J\u0010\u0010b\u001a\u00020R2\u0006\u0010a\u001a\u00020\u001dH\u0016J\b\u0010c\u001a\u00020RH\u0007J\"\u0010d\u001a\u00020R2\b\u0010e\u001a\u0004\u0018\u00010\u00172\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020gH\u0016J\u0006\u0010i\u001a\u00020RJ\u0012\u0010j\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010l\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010m\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010n\u001a\u00020R2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u0010\u0010q\u001a\u00020R2\u0006\u0010r\u001a\u00020sH\u0016J\u0012\u0010t\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010u\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010vH\u0016J\u0012\u0010w\u001a\u00020R2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J\b\u0010z\u001a\u00020RH\u0007J\u0012\u0010{\u001a\u00020R2\b\u0010k\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010|\u001a\u00020R2\b\u0010}\u001a\u0004\u0018\u00010pH\u0016J\b\u0010~\u001a\u00020RH\u0002J\u000e\u0010\u001a\u00020R2\u0006\u0010S\u001a\u000204J\u0011\u0010\u0001\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010\u0002J\t\u0010\u0001\u001a\u00020RH\u0016J\t\u0010\u0001\u001a\u00020RH\u0002J\u0011\u0010\u0001\u001a\u00020R2\u0006\u0010r\u001a\u00020sH\u0016J\u0010\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020.J\t\u0010\u0001\u001a\u00020RH\u0002J\t\u0010\u0001\u001a\u00020RH\u0016J\u0007\u0010\u0001\u001a\u00020RJ\t\u0010\u0001\u001a\u00020RH\u0002J\u0012\u0010\u0001\u001a\u00020R2\u0007\u0010\u0001\u001a\u00020HH\u0002J\u0007\u0010\u0001\u001a\u00020RR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0017XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001e\u00102\u001a\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`5X\u0004¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000203j\b\u0012\u0004\u0012\u00020\u0002`5X\u0004¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView;", "Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/video/preload/IDownloadProgressListener;", "activity", "Landroid/support/v4/app/FragmentActivity;", "mVideoView", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "cover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "mIvReplay", "Landroid/widget/ImageView;", "mPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "longPlayControl", "Lcom/ss/android/ugc/aweme/longvideo/ILongPlayControll;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;Landroid/widget/ImageView;Lcom/ss/android/ugc/aweme/video/PlayerManager;Lcom/ss/android/ugc/aweme/longvideo/ILongPlayControll;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "getCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "enterFrom", "", "getEnterFrom", "()Ljava/lang/String;", "setEnterFrom", "(Ljava/lang/String;)V", "firstComplete", "", "getFirstComplete", "()Z", "setFirstComplete", "(Z)V", "logTag", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMIvReplay", "()Landroid/widget/ImageView;", "mMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "mOnClickListener", "Landroid/view/View$OnClickListener;", "getMOnClickListener", "()Landroid/view/View$OnClickListener;", "mPausePlayView", "Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView$IPausePlayView;", "mPendingStart", "getMPendingStart", "setMPendingStart", "mPlayInterceptors", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/longvideo/IVideoPlayInterceptor;", "Lkotlin/collections/ArrayList;", "mPlayListeners", "mPlayState", "Lcom/ss/android/ugc/aweme/feed/bl/PlayStatusHelper;", "getMPlayState", "()Lcom/ss/android/ugc/aweme/feed/bl/PlayStatusHelper;", "mPlayVideoHelper", "Lcom/ss/android/ugc/aweme/newfollow/util/PlayVideoHelper;", "getMPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "mProgressView", "Lcom/ss/android/ugc/aweme/longvideo/IProgressView;", "getMProgressView", "()Lcom/ss/android/ugc/aweme/longvideo/IProgressView;", "setMProgressView", "(Lcom/ss/android/ugc/aweme/longvideo/IProgressView;)V", "getMVideoView", "()Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "pageType", "", "getPageType", "()I", "setPageType", "(I)V", "videoSurfaceListener", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "getVideoSurfaceListener", "()Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "addInterceptor", "", "interceptor", "addOnUIPlayListener", "listener", "checkPlayCondition", "getPlayState", "handlePlay", "hideCover", "hideIvPlay", "init", "videoProvider", "Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "initTextureView", "aweme", "onBuffering", "start", "onDecoderBuffering", "onDestroy", "onDownloadProgress", "key", "totalBytes", "", "downloadedBytes", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "pauseVideoInternal", "removeInterceptor", "removeOnUIPlayListener", "resumePlay", "resumeVideoInternal", "seek", "setPausePlayView", "view", "showCover", "showIvPlay", "startPlay", "startVideoInternal", "initialStartTimeMs", "stopPlay", "IPausePlayView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftVideoPlayView implements LifecycleObserver, com.ss.android.ugc.aweme.longvideo.b, com.ss.android.ugc.aweme.video.a.a, com.ss.android.ugc.aweme.video.preload.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2908a;

    /* renamed from: b  reason: collision with root package name */
    public i f2909b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.b.a f2910c = new com.ss.android.ugc.aweme.feed.b.a();

    /* renamed from: d  reason: collision with root package name */
    public a f2911d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.longvideo.c f2912e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<com.ss.android.ugc.aweme.video.a.a> f2913f = new ArrayList<>();
    public final ArrayList<d> g = new ArrayList<>();
    public Aweme h;
    @NotNull
    public String i = "";
    public int j;
    public boolean k;
    public boolean l;
    @NotNull
    public final com.ss.android.ugc.playerkit.videoview.i m;
    @NotNull
    public final View.OnClickListener n;
    @NotNull
    public final FragmentActivity o;
    @NotNull
    public final VideoViewComponent p;
    @Nullable
    public final AnimatedImageView q;
    @NotNull
    public final ImageView r;
    @NotNull
    public final o s;
    private final String t = "LongVideoPlayView";
    private LongVideoMobViewModel u;
    private com.ss.android.ugc.aweme.longvideo.a v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView$IPausePlayView;", "", "getView", "Landroid/view/View;", "onPause", "", "onPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        @NotNull
        View a();

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftVideoPlayView f39118b;

        b(LoftVideoPlayView loftVideoPlayView) {
            this.f39118b = loftVideoPlayView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39117a, false, 31126, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39117a, false, 31126, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
            LoftVideoPlayView loftVideoPlayView = this.f39118b;
            if (PatchProxy.isSupport(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31119, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31119, new Class[0], Void.TYPE);
            } else if (loftVideoPlayView.f2910c.f45077a == 3) {
                loftVideoPlayView.r.setVisibility(8);
                loftVideoPlayView.e();
            } else {
                new aq().b(loftVideoPlayView.h, loftVideoPlayView.j).a(loftVideoPlayView.i).a(1).e();
                loftVideoPlayView.f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView$videoSurfaceListener$1", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "onSurfaceAvailable", "", "width", "", "height", "onSurfaceDestroyed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.playerkit.videoview.i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftVideoPlayView f39120b;

        public final void a() {
        }

        public final void b(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39119a, false, 31128, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39119a, false, 31128, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            }
        }

        c(LoftVideoPlayView loftVideoPlayView) {
            this.f39120b = loftVideoPlayView;
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39119a, false, 31127, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39119a, false, 31127, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f39120b.k) {
                this.f39120b.k = false;
                this.f39120b.d();
            }
        }
    }

    public final void a(@Nullable String str, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), new Long(j5)}, this, f2908a, false, 31093, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j4), new Long(j5)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f2908a, false, 31093, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (j4 != 0) {
            i2 = (int) (((float) j5) / ((float) j4));
        }
        com.ss.android.ugc.aweme.longvideo.c cVar = this.f2912e;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2908a, false, 31099, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2908a, false, 31099, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.f().a((com.ss.android.ugc.aweme.video.preload.a) this);
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f2913f) {
            a2.a(str);
        }
    }

    public final int c() {
        return this.f2910c.f45077a;
    }

    private final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31108, new Class[0], Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.q;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31107, new Class[0], Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.q;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31111, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31123, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f2911d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31124, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f2911d;
        if (aVar != null) {
            aVar.c();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31089, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31114, new Class[0], Void.TYPE);
        } else if (k()) {
            a aVar = this.f2911d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar = this.f2909b;
            if (iVar != null) {
                iVar.f();
            }
            i iVar2 = this.f2909b;
            if (iVar2 != null) {
                iVar2.n();
            }
            this.f2910c.f45077a = 2;
        }
    }

    private final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31116, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31116, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Iterator<d> it2 = this.g.iterator();
        while (it2.hasNext()) {
            if (!it2.next().a()) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31117, new Class[0], Void.TYPE);
        } else if (k()) {
            i iVar = this.f2909b;
            if (iVar != null) {
                iVar.n();
            }
            a aVar = this.f2911d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar2 = this.f2909b;
            if (iVar2 != null) {
                iVar2.i();
            }
            this.f2910c.f45077a = 4;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31118, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f2911d;
        if (aVar != null) {
            aVar.b();
        }
        i iVar = this.f2909b;
        if (iVar != null) {
            iVar.e();
        }
        this.f2910c.f45077a = 3;
        if (!o.v()) {
            this.s.u();
            return;
        }
        i iVar2 = this.f2909b;
        if (iVar2 != null) {
            iVar2.o();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31091, new Class[0], Void.TYPE);
            return;
        }
        this.p.b(this.m);
        if (this.s.b((com.ss.android.ugc.aweme.video.a.a) this)) {
            i iVar = this.f2909b;
            if (iVar != null) {
                iVar.a();
            }
        }
        this.g.clear();
        this.f2913f.clear();
        g.f().b((com.ss.android.ugc.aweme.video.preload.a) this);
        try {
            this.s.n();
            this.s.j();
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        int i2;
        String str;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f2908a, false, 31112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2908a, false, 31112, new Class[0], Void.TYPE);
            return;
        }
        h hVar = this.p.f4334b;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mVideoView.surfaceHolder");
        if (!hVar.c()) {
            this.k = true;
        } else if (this.f2910c.f45077a == 0) {
            LongVideo a2 = com.ss.android.ugc.aweme.longvideo.g.f53947b.a(this.h);
            if (a2 != null) {
                i2 = a2.getTrailerStartTime();
            } else {
                i2 = -1;
            }
            if (i2 == 0) {
                Aweme aweme = this.h;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.video.a a3 = o.a(str);
                int i4 = a3.f76007b;
                int i5 = (int) a3.f76006a;
                if (i4 > 0) {
                    Aweme aweme2 = this.h;
                    if (aweme2 != null) {
                        Video video = aweme2.getVideo();
                        if (video != null) {
                            i3 = video.getDuration();
                        }
                    }
                    if (i3 > 1950) {
                        a(i3 - 1950);
                    } else {
                        j();
                    }
                } else if (i5 > 1950) {
                    a(i5 - 1950);
                } else {
                    j();
                }
            } else {
                j();
            }
        } else {
            e();
        }
    }

    private final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2908a, false, 31115, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2908a, false, 31115, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (k()) {
            a aVar = this.f2911d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar = this.f2909b;
            if (iVar != null) {
                iVar.a(i2);
            }
            i iVar2 = this.f2909b;
            if (iVar2 != null) {
                iVar2.n();
            }
            this.f2910c.f45077a = 2;
        }
    }

    public final void b(float f2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f2908a, false, 31092, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f2908a, false, 31092, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        i();
        if (f2 > 0.0f) {
            this.r.setVisibility(8);
        }
        if (f2 == 100.0f) {
            String str2 = null;
            if (!this.l) {
                Aweme aweme = this.h;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                d(str);
            }
            Aweme aweme2 = this.h;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            e(str2);
        }
        if (!o.v()) {
            this.s.a(f2);
            return;
        }
        i iVar = this.f2909b;
        if (iVar != null) {
            iVar.a(f2);
        }
    }

    public final void c(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2908a, false, 31101, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2908a, false, 31101, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.f2913f) {
            c2.c(str2);
        }
    }

    public final void d(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2908a, false, 31102, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2908a, false, 31102, new Class[]{String.class}, Void.TYPE);
        } else if (!this.l) {
            this.l = true;
            for (com.ss.android.ugc.aweme.video.a.a d2 : this.f2913f) {
                d2.d(str);
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f2908a, false, 31096, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f2908a, false, 31096, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f && this.r.getVisibility() == 0) {
            this.r.setVisibility(8);
        }
        com.ss.android.ugc.aweme.longvideo.c cVar = this.f2912e;
        if (cVar != null) {
            cVar.a(f2);
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f2913f) {
            a2.a(f2);
        }
    }

    public final void b(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f2908a, false, 31109, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f2908a, false, 31109, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f2913f) {
            b2.b(eVar2);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2908a, false, 31105, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2908a, false, 31105, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.f2913f) {
            c2.c(z);
        }
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2908a, false, 31103, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2908a, false, 31103, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f();
        com.ss.android.ugc.aweme.longvideo.c cVar = this.f2912e;
        if (cVar != null) {
            cVar.a(0.0f);
        }
        b(0.0f);
        a();
        this.r.setVisibility(0);
        for (com.ss.android.ugc.aweme.video.a.a e2 : this.f2913f) {
            e2.e(str);
        }
        if (this.o instanceof com.ss.android.ugc.aweme.longvideo.a) {
            ((com.ss.android.ugc.aweme.longvideo.a) this.o).o();
            return;
        }
        com.ss.android.ugc.aweme.longvideo.a aVar = this.v;
        if (aVar != null) {
            aVar.o();
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2908a, false, 31094, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2908a, false, 31094, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && !this.f2913f.contains(aVar)) {
            this.f2913f.add(aVar);
        }
    }

    public final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2908a, false, 31100, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2908a, false, 31100, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i();
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f2913f) {
            b2.b(str2);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2908a, false, 31097, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2908a, false, 31097, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f2913f) {
            a2.a(aVar2);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2908a, false, 31104, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2908a, false, 31104, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f2913f) {
            b2.b(z);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2908a, false, 31106, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2908a, false, 31106, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        i();
        this.r.setVisibility(8);
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f2913f) {
            a2.a(bVar);
        }
    }

    public final void a(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f2908a, false, 31098, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f2908a, false, 31098, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f2913f) {
            a2.a(eVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LoftVideoPlayView(@org.jetbrains.annotations.NotNull android.support.v4.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull com.ss.android.ugc.playerkit.videoview.VideoViewComponent r3, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.base.ui.AnimatedImageView r4, @org.jetbrains.annotations.NotNull android.widget.ImageView r5, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.video.o r6, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.longvideo.a r7) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "mIvReplay"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "mPlayerManager"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            r1.<init>()
            r1.o = r2
            r1.p = r3
            r1.q = r4
            r1.r = r5
            r1.s = r6
            r1.v = r7
            java.lang.String r2 = "LongVideoPlayView"
            r1.t = r2
            com.ss.android.ugc.aweme.feed.b.a r2 = new com.ss.android.ugc.aweme.feed.b.a
            r2.<init>()
            r1.f2910c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2913f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.g = r2
            java.lang.String r2 = ""
            r1.i = r2
            android.support.v4.app.FragmentActivity r2 = r1.o
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.LifecycleObserver r3 = (android.arch.lifecycle.LifecycleObserver) r3
            r2.addObserver(r3)
            com.ss.android.ugc.aweme.longvideo.b.a$a r2 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            android.support.v4.app.FragmentActivity r3 = r1.o
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r2.a((android.support.v4.app.FragmentActivity) r3)
            r1.u = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.u
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r2.f53913a
            if (r2 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r2 = ""
        L_0x0064:
            r1.i = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.u
            if (r2 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0071
            int r2 = r2.f53914b
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r1.j = r2
            android.widget.ImageView r2 = r1.r
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$1 r3 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$1
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.ImageView r2 = r1.r
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$c r2 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$c
            r2.<init>(r1)
            com.ss.android.ugc.playerkit.videoview.i r2 = (com.ss.android.ugc.playerkit.videoview.i) r2
            r1.m = r2
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$b r2 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$b
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.<init>(android.support.v4.app.FragmentActivity, com.ss.android.ugc.playerkit.videoview.VideoViewComponent, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, android.widget.ImageView, com.ss.android.ugc.aweme.video.o, com.ss.android.ugc.aweme.longvideo.a):void");
    }
}
