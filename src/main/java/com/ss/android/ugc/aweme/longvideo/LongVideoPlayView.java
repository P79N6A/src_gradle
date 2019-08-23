package com.ss.android.ugc.aweme.longvideo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.u.aq;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020+J\u0010\u0010M\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020?H\u0016J\b\u0010R\u001a\u00020KH\u0002J\b\u0010S\u001a\u00020KH\u0002J\b\u0010T\u001a\u00020KH\u0016J\u0012\u0010U\u001a\u00020K2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010V\u001a\u00020K2\b\u0010W\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010X\u001a\u00020K2\u0006\u0010Y\u001a\u00020PH\u0016J\u0010\u0010Z\u001a\u00020K2\u0006\u0010Y\u001a\u00020PH\u0016J\b\u0010[\u001a\u00020KH\u0007J\"\u0010\\\u001a\u00020K2\b\u0010]\u001a\u0004\u0018\u00010\u00132\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_H\u0016J\b\u0010a\u001a\u00020KH\u0007J\u0012\u0010b\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010d\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010e\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010f\u001a\u00020K2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0010\u0010i\u001a\u00020K2\u0006\u0010j\u001a\u00020kH\u0016J\u0012\u0010l\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010m\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010nH\u0016J\u0012\u0010o\u001a\u00020K2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\b\u0010r\u001a\u00020KH\u0007J\u0012\u0010s\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010t\u001a\u00020K2\b\u0010u\u001a\u0004\u0018\u00010hH\u0016J\b\u0010v\u001a\u00020KH\u0002J\u000e\u0010w\u001a\u00020K2\u0006\u0010L\u001a\u00020+J\u0010\u0010x\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010\u0002J\b\u0010y\u001a\u00020KH\u0016J\b\u0010z\u001a\u00020KH\u0002J\u0010\u0010{\u001a\u00020K2\u0006\u0010j\u001a\u00020kH\u0016J\u000e\u0010|\u001a\u00020K2\u0006\u0010}\u001a\u00020(J\b\u0010~\u001a\u00020KH\u0002J\b\u0010\u001a\u00020KH\u0016J\t\u0010\u0001\u001a\u00020KH\u0002J\u0012\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020?H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00020*j\b\u0012\u0004\u0012\u00020\u0002`,X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView;", "Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/video/preload/IDownloadProgressListener;", "activity", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity;", "videoProvider", "Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "mVideoView", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "cover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "mIvReplay", "Landroid/widget/ImageView;", "mPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity;Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;Landroid/widget/ImageView;Lcom/ss/android/ugc/aweme/video/PlayerManager;)V", "TAG", "", "getActivity", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity;", "getCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "enterFrom", "getEnterFrom", "()Ljava/lang/String;", "setEnterFrom", "(Ljava/lang/String;)V", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMIvReplay", "()Landroid/widget/ImageView;", "mMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "mOnClickListener", "Landroid/view/View$OnClickListener;", "getMOnClickListener", "()Landroid/view/View$OnClickListener;", "mPausePlayView", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView$IPausePlayView;", "mPlayInterceptors", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/longvideo/IVideoPlayInterceptor;", "Lkotlin/collections/ArrayList;", "mPlayListeners", "mPlayState", "Lcom/ss/android/ugc/aweme/feed/bl/PlayStatusHelper;", "getMPlayState", "()Lcom/ss/android/ugc/aweme/feed/bl/PlayStatusHelper;", "mPlayVideoHelper", "Lcom/ss/android/ugc/aweme/newfollow/util/PlayVideoHelper;", "getMPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "mProgressView", "Lcom/ss/android/ugc/aweme/longvideo/IProgressView;", "getMProgressView", "()Lcom/ss/android/ugc/aweme/longvideo/IProgressView;", "setMProgressView", "(Lcom/ss/android/ugc/aweme/longvideo/IProgressView;)V", "getMVideoView", "()Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "pageType", "", "getPageType", "()I", "setPageType", "(I)V", "getVideoProvider", "()Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "videoSurfaceListener", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "getVideoSurfaceListener", "()Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "addInterceptor", "", "interceptor", "addOnUIPlayListener", "listener", "checkPlayCondition", "", "getPlayState", "handlePlay", "hideCover", "hideIvPlay", "init", "initTextureView", "aweme", "onBuffering", "start", "onDecoderBuffering", "onDestroy", "onDownloadProgress", "key", "totalBytes", "", "downloadedBytes", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "pauseVideoInternal", "removeInterceptor", "removeOnUIPlayListener", "resumePlay", "resumeVideoInternal", "seek", "setPausePlayView", "view", "showCover", "showIvPlay", "startVideoInternal", "initialStartTimeMs", "IPausePlayView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LongVideoPlayView implements LifecycleObserver, b, com.ss.android.ugc.aweme.video.a.a, com.ss.android.ugc.aweme.video.preload.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3452a;

    /* renamed from: b  reason: collision with root package name */
    i f3453b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.b.a f3454c = new com.ss.android.ugc.aweme.feed.b.a();

    /* renamed from: d  reason: collision with root package name */
    a f3455d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public c f3456e;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<d> f3457f = new ArrayList<>();
    public Aweme g;
    @NotNull
    public String h = "";
    public int i;
    @NotNull
    public final com.ss.android.ugc.playerkit.videoview.i j;
    @NotNull
    public final View.OnClickListener k;
    @NotNull
    public final LongVideoPlayActivity l;
    @Nullable
    public final j m;
    @NotNull
    public final VideoViewComponent n;
    @Nullable
    public final AnimatedImageView o;
    @NotNull
    public final ImageView p;
    @NotNull
    public final o q;
    private final String r = "LongVideoPlayView";
    private final ArrayList<com.ss.android.ugc.aweme.video.a.a> s = new ArrayList<>();
    private LongVideoMobViewModel t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView$IPausePlayView;", "", "getView", "Landroid/view/View;", "onPause", "", "onPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        @NotNull
        View a();

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayView f53869b;

        b(LongVideoPlayView longVideoPlayView) {
            this.f53869b = longVideoPlayView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f53868a, false, 56651, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f53868a, false, 56651, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
            LongVideoPlayView longVideoPlayView = this.f53869b;
            if (PatchProxy.isSupport(new Object[0], longVideoPlayView, LongVideoPlayView.f3452a, false, 56644, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], longVideoPlayView, LongVideoPlayView.f3452a, false, 56644, new Class[0], Void.TYPE);
            } else if (longVideoPlayView.f3454c.f45077a == 3) {
                longVideoPlayView.p.setVisibility(8);
                longVideoPlayView.d();
            } else {
                new aq().b(longVideoPlayView.g, longVideoPlayView.i).a(longVideoPlayView.h).a(1).e();
                longVideoPlayView.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayView$videoSurfaceListener$1", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "onSurfaceAvailable", "", "width", "", "height", "onSurfaceDestroyed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.playerkit.videoview.i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayView f53871b;

        public final void a() {
        }

        public final void b(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53870a, false, 56653, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53870a, false, 56653, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            }
        }

        c(LongVideoPlayView longVideoPlayView) {
            this.f53871b = longVideoPlayView;
        }

        public final void a(int i, int i2) {
            int i3;
            String str;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53870a, false, 56652, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53870a, false, 56652, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (this.f53871b.f3454c.f45077a == 0) {
                LongVideo a2 = g.f53947b.a(this.f53871b.g);
                if (a2 != null) {
                    i3 = a2.getTrailerStartTime();
                } else {
                    i3 = -1;
                }
                if (i3 == 0) {
                    Aweme aweme = this.f53871b.g;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.video.a a3 = o.a(str);
                    int i5 = a3.f76007b;
                    int i6 = (int) a3.f76006a;
                    if (i5 > 0) {
                        Aweme aweme2 = this.f53871b.g;
                        if (aweme2 != null) {
                            Video video = aweme2.getVideo();
                            if (video != null) {
                                i4 = video.getDuration();
                            }
                        }
                        if (i4 > 1950) {
                            this.f53871b.a(i4 - 1950);
                            return;
                        }
                        this.f53871b.a();
                    } else if (i6 > 1950) {
                        this.f53871b.a(i6 - 1950);
                    } else {
                        this.f53871b.a();
                    }
                } else {
                    this.f53871b.a();
                }
            } else {
                this.f53871b.d();
            }
        }
    }

    public final void a(@Nullable String str, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), new Long(j5)}, this, f3452a, false, 56620, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j4), new Long(j5)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3452a, false, 56620, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (j4 != 0) {
            i2 = (int) (((float) j5) / ((float) j4));
        }
        c cVar = this.f3456e;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public final void a(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3452a, false, 56625, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3452a, false, 56625, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.s) {
            a2.a(eVar2);
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3452a, false, 56626, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3452a, false, 56626, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.f().a((com.ss.android.ugc.aweme.video.preload.a) this);
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.s) {
            a2.a(str);
        }
    }

    public final int c() {
        return this.f3454c.f45077a;
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56635, new Class[0], Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.o;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56638, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56648, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f3455d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56649, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f3455d;
        if (aVar != null) {
            aVar.c();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56617, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56616, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3454c.f45077a != 0) {
            d();
        }
    }

    private final boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56641, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56641, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Iterator<d> it2 = this.f3457f.iterator();
        while (it2.hasNext()) {
            if (!it2.next().a()) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56639, new Class[0], Void.TYPE);
        } else if (i()) {
            a aVar = this.f3455d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar = this.f3453b;
            if (iVar != null) {
                iVar.f();
            }
            i iVar2 = this.f3453b;
            if (iVar2 != null) {
                iVar2.n();
            }
            this.f3454c.f45077a = 2;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56642, new Class[0], Void.TYPE);
        } else if (i()) {
            i iVar = this.f3453b;
            if (iVar != null) {
                iVar.n();
            }
            a aVar = this.f3455d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar2 = this.f3453b;
            if (iVar2 != null) {
                iVar2.i();
            }
            this.f3454c.f45077a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56643, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f3455d;
        if (aVar != null) {
            aVar.b();
        }
        i iVar = this.f3453b;
        if (iVar != null) {
            iVar.e();
        }
        this.f3454c.f45077a = 3;
        if (!o.v()) {
            this.q.u();
            return;
        }
        i iVar2 = this.f3453b;
        if (iVar2 != null) {
            iVar2.o();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56618, new Class[0], Void.TYPE);
            return;
        }
        this.n.b(this.j);
        if (this.q.b((com.ss.android.ugc.aweme.video.a.a) this)) {
            i iVar = this.f3453b;
            if (iVar != null) {
                iVar.a();
            }
        }
        this.f3457f.clear();
        this.s.clear();
        g.f().b((com.ss.android.ugc.aweme.video.preload.a) this);
        try {
            this.q.n();
            this.q.j();
        } catch (Throwable unused) {
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3452a, false, 56619, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3452a, false, 56619, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        f();
        if (f2 > 0.0f) {
            this.p.setVisibility(8);
        }
        if (!o.v()) {
            this.q.a(f2);
            return;
        }
        i iVar = this.f3453b;
        if (iVar != null) {
            iVar.a(f2);
        }
    }

    public final void c(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3452a, false, 56628, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3452a, false, 56628, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.s) {
            c2.c(str2);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f3452a, false, 56623, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f3452a, false, 56623, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f && this.p.getVisibility() == 0) {
            this.p.setVisibility(8);
        }
        c cVar = this.f3456e;
        if (cVar != null) {
            cVar.a(f2);
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.s) {
            a2.a(f2);
        }
    }

    public final void b(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3452a, false, 56636, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3452a, false, 56636, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.s) {
            b2.b(eVar2);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3452a, false, 56632, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3452a, false, 56632, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.s) {
            c2.c(z);
        }
    }

    public final void d(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3452a, false, 56629, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3452a, false, 56629, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a d2 : this.s) {
            d2.d(str2);
        }
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3452a, false, 56630, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3452a, false, 56630, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e();
        c cVar = this.f3456e;
        if (cVar != null) {
            cVar.a(0.0f);
        }
        b(0.0f);
        if (PatchProxy.isSupport(new Object[0], this, f3452a, false, 56634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3452a, false, 56634, new Class[0], Void.TYPE);
        } else {
            AnimatedImageView animatedImageView = this.o;
            if (animatedImageView != null) {
                animatedImageView.setVisibility(0);
            }
        }
        this.p.setVisibility(0);
        for (com.ss.android.ugc.aweme.video.a.a e2 : this.s) {
            e2.e(str);
        }
        this.l.o();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3452a, false, 56640, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3452a, false, 56640, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i()) {
            a aVar = this.f3455d;
            if (aVar != null) {
                aVar.c();
            }
            i iVar = this.f3453b;
            if (iVar != null) {
                iVar.a(i2);
            }
            i iVar2 = this.f3453b;
            if (iVar2 != null) {
                iVar2.n();
            }
            this.f3454c.f45077a = 2;
        }
    }

    public final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3452a, false, 56627, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3452a, false, 56627, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f();
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.s) {
            b2.b(str2);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3452a, false, 56621, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3452a, false, 56621, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && !this.s.contains(aVar)) {
            this.s.add(aVar);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3452a, false, 56631, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3452a, false, 56631, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.s) {
            b2.b(z);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3452a, false, 56624, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3452a, false, 56624, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.s) {
            a2.a(aVar2);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3452a, false, 56633, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3452a, false, 56633, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        f();
        this.p.setVisibility(8);
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.s) {
            a2.a(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0062, code lost:
        if (r2 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayView(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.longvideo.j r3, @org.jetbrains.annotations.NotNull com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.base.ui.AnimatedImageView r5, @org.jetbrains.annotations.NotNull android.widget.ImageView r6, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.video.o r7) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "mIvReplay"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "mPlayerManager"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            r1.<init>()
            r1.l = r2
            r1.m = r3
            r1.n = r4
            r1.o = r5
            r1.p = r6
            r1.q = r7
            java.lang.String r2 = "LongVideoPlayView"
            r1.r = r2
            com.ss.android.ugc.aweme.feed.b.a r2 = new com.ss.android.ugc.aweme.feed.b.a
            r2.<init>()
            r1.f3454c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.s = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3457f = r2
            java.lang.String r2 = ""
            r1.h = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2 = r1.l
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.LifecycleObserver r3 = (android.arch.lifecycle.LifecycleObserver) r3
            r2.addObserver(r3)
            com.ss.android.ugc.aweme.longvideo.b.a$a r2 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r3 = r1.l
            android.support.v4.app.FragmentActivity r3 = (android.support.v4.app.FragmentActivity) r3
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r2.a((android.support.v4.app.FragmentActivity) r3)
            r1.t = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.t
            if (r2 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = r2.f53913a
            if (r2 != 0) goto L_0x0066
        L_0x0064:
            java.lang.String r2 = ""
        L_0x0066:
            r1.h = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.t
            if (r2 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0073
            int r2 = r2.f53914b
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            r1.i = r2
            android.widget.ImageView r2 = r1.p
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1 r3 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.ImageView r2 = r1.p
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c
            r2.<init>(r1)
            com.ss.android.ugc.playerkit.videoview.i r2 = (com.ss.android.ugc.playerkit.videoview.i) r2
            r1.j = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView.<init>(com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity, com.ss.android.ugc.aweme.longvideo.j, com.ss.android.ugc.playerkit.videoview.VideoViewComponent, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, android.widget.ImageView, com.ss.android.ugc.aweme.video.o):void");
    }
}
