package com.ss.android.ugc.aweme.longvideonew.a;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.g;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0003VWXB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\b\u0010*\u001a\u00020\bH\u0002J\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020&J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020\bH\u0016J\u0006\u00100\u001a\u00020&J\"\u00101\u001a\u00020&2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0016J\u0006\u00107\u001a\u00020&J\u0012\u00108\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000103H\u0016J\u0012\u0010:\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000103H\u0016J\u0012\u0010;\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000103H\u0016J\u0012\u0010<\u001a\u00020&2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000103H\u0016J\u0012\u0010C\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u00020&2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0006\u0010H\u001a\u00020&J\u0012\u0010I\u001a\u00020&2\b\u00109\u001a\u0004\u0018\u000103H\u0016J\u0012\u0010J\u001a\u00020&2\b\u0010K\u001a\u0004\u0018\u00010>H\u0016J\u0006\u0010L\u001a\u00020&J\u000e\u0010M\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0012J\u0010\u0010N\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0006\u0010O\u001a\u00020&J\u000e\u0010P\u001a\u00020&2\u0006\u0010@\u001a\u00020AJ\u000e\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020\u000fJ\b\u0010S\u001a\u00020&H\u0002J\u0010\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020UH\u0002R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006Y"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "Lcom/ss/android/ugc/aweme/video/preload/IDownloadProgressListener;", "mRootView", "Landroid/view/ViewGroup;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "isLongVideoPlayerBusiness", "", "isConnectionPlay", "(Landroid/view/ViewGroup;Lcom/ss/android/ugc/aweme/feed/model/Aweme;ZZ)V", "()Z", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mIVideoPlayerCallBack", "Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayerCallBack;", "mPlayInterceptors", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayInterceptor;", "Lkotlin/collections/ArrayList;", "mPlayListeners", "mPlayState", "Lcom/ss/android/ugc/aweme/feed/bl/PlayStatusHelper;", "mPlayVideoHelper", "Lcom/ss/android/ugc/aweme/newfollow/util/PlayVideoHelper;", "mPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "getMRootView", "()Landroid/view/ViewGroup;", "mVideoView", "Landroid/view/View;", "mVideoViewComponent", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "videoSurfaceListener", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "getVideoSurfaceListener", "()Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "addInterceptor", "", "interceptor", "addOnUIPlayListener", "listener", "checkPlayCondition", "getPlayerManager", "handlePlay", "onBuffering", "start", "onDecoderBuffering", "onDestory", "onDownloadProgress", "key", "", "totalBytes", "", "downloadedBytes", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "pauseVideoInternal", "removeInterceptor", "removeOnUIPlayListener", "resumeVideoInternal", "seek", "setVideoPlayerCallBack", "videoPlayerViewCallBack", "startVideoInternal", "initialStartTimeMs", "", "Companion", "IVideoPlayInterceptor", "IVideoPlayerCallBack", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements com.ss.android.ugc.aweme.video.a.a, com.ss.android.ugc.aweme.video.preload.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54020a;
    public static final C0626a n = new C0626a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f54021b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<com.ss.android.ugc.aweme.video.a.a> f54022c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.b.a f54023d = new com.ss.android.ugc.aweme.feed.b.a();

    /* renamed from: e  reason: collision with root package name */
    public final VideoViewComponent f54024e = new VideoViewComponent();

    /* renamed from: f  reason: collision with root package name */
    public final i f54025f;
    public final o g = new o(true);
    public c h;
    @NotNull
    public final com.ss.android.ugc.playerkit.videoview.i i = new d(this);
    @NotNull
    public final ViewGroup j;
    @Nullable
    public final Aweme k;
    public final boolean l;
    public final boolean m;
    private View o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$Companion;", "", "()V", "TAG", "", "TIME_BUCKET", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$a  reason: collision with other inner class name */
    public static final class C0626a {
        private C0626a() {
        }

        public /* synthetic */ C0626a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayInterceptor;", "", "canPlay", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        boolean a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$IVideoPlayerCallBack;", "", "onSecondaryProgress", "", "progress", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/view/LongVideoPlayerView$videoSurfaceListener$1", "Lcom/ss/android/ugc/playerkit/videoview/VideoSurfaceLifecycleListener;", "onSurfaceAvailable", "", "width", "", "height", "onSurfaceDestroyed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.ss.android.ugc.playerkit.videoview.i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f54027b;

        public final void a() {
        }

        public final void b(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54026a, false, 56971, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54026a, false, 56971, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            }
        }

        d(a aVar) {
            this.f54027b = aVar;
        }

        public final void a(int i, int i2) {
            int i3;
            String str;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54026a, false, 56970, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54026a, false, 56970, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (this.f54027b.f54023d.f45077a != 0) {
                this.f54027b.b();
            } else if (!this.f54027b.l || !this.f54027b.m) {
                this.f54027b.a();
            } else {
                LongVideo a2 = g.f53947b.a(this.f54027b.k);
                if (a2 != null) {
                    i3 = a2.getTrailerStartTime();
                } else {
                    i3 = -1;
                }
                if (i3 == 0) {
                    Aweme aweme = this.f54027b.k;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.video.a a3 = o.a(str);
                    int i5 = a3.f76007b;
                    int i6 = (int) a3.f76006a;
                    if (i5 > 0) {
                        Aweme aweme2 = this.f54027b.k;
                        if (aweme2 != null) {
                            Video video = aweme2.getVideo();
                            if (video != null) {
                                i4 = video.getDuration();
                            }
                        }
                        if (i4 > 1950) {
                            this.f54027b.a(i4 - 1950);
                            return;
                        }
                        this.f54027b.a();
                    } else if (i6 > 1950) {
                        this.f54027b.a(i6 - 1950);
                    } else {
                        this.f54027b.a();
                    }
                } else {
                    this.f54027b.a();
                }
            }
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54020a, false, 56956, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54020a, false, 56956, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.video.preload.g.f().a((com.ss.android.ugc.aweme.video.preload.a) this);
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f54022c) {
            a2.a(str);
        }
    }

    public final void a(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f54020a, false, 56961, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f54020a, false, 56961, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f54022c) {
            a2.a(eVar2);
        }
    }

    public final void a(@Nullable String str, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), new Long(j5)}, this, f54020a, false, 56965, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j4), new Long(j5)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f54020a, false, 56965, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (j4 != 0) {
            i2 = (int) (((float) j5) / ((float) j4));
        }
        c cVar = this.h;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54020a, false, 56943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54020a, false, 56943, new Class[0], Void.TYPE);
        } else if (d()) {
            this.f54025f.f();
            this.f54025f.n();
            this.f54023d.f45077a = 2;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54020a, false, 56945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54020a, false, 56945, new Class[0], Void.TYPE);
        } else if (d()) {
            this.f54025f.n();
            this.f54025f.i();
            this.f54023d.f45077a = 4;
        }
    }

    private final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f54020a, false, 56967, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54020a, false, 56967, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Iterator<b> it2 = this.f54021b.iterator();
        while (it2.hasNext()) {
            if (!it2.next().a()) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54020a, false, 56946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54020a, false, 56946, new Class[0], Void.TYPE);
            return;
        }
        this.f54025f.e();
        this.f54023d.f45077a = 3;
        if (!o.v()) {
            this.g.u();
        } else {
            this.f54025f.o();
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f54020a, false, 56964, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f54020a, false, 56964, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f54022c) {
            a2.a(f2);
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f54020a, false, 56942, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f54020a, false, 56942, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!o.v()) {
            this.g.a(f2);
        } else {
            this.f54025f.a(f2);
        }
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54020a, false, 56963, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54020a, false, 56963, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c();
        b(0.0f);
        for (com.ss.android.ugc.aweme.video.a.a e2 : this.f54022c) {
            e2.e(str);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54020a, false, 56944, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54020a, false, 56944, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (d()) {
            this.f54025f.a(i2);
            this.f54025f.n();
            this.f54023d.f45077a = 2;
        }
    }

    public final void b(@Nullable e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f54020a, false, 56957, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f54020a, false, 56957, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f54022c) {
            b2.b(eVar2);
        }
    }

    public final void c(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54020a, false, 56954, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54020a, false, 56954, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.f54022c) {
            c2.c(str2);
        }
    }

    public final void d(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54020a, false, 56955, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54020a, false, 56955, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a d2 : this.f54022c) {
            d2.d(str2);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54020a, false, 56951, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54020a, false, 56951, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && !this.f54022c.contains(aVar)) {
            this.f54022c.add(aVar);
        }
    }

    public final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54020a, false, 56953, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54020a, false, 56953, new Class[]{String.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f54022c) {
            b2.b(str2);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54020a, false, 56959, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54020a, false, 56959, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a c2 : this.f54022c) {
            c2.c(z);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f54020a, false, 56960, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f54020a, false, 56960, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f54022c) {
            a2.a(aVar2);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54020a, false, 56962, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54020a, false, 56962, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a b2 : this.f54022c) {
            b2.b(z);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.b bVar) {
        com.ss.android.ugc.aweme.video.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f54020a, false, 56958, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f54020a, false, 56958, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.video.a.a a2 : this.f54022c) {
            a2.a(bVar2);
        }
    }

    public a(@NotNull ViewGroup viewGroup, @Nullable Aweme aweme, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "mRootView");
        this.j = viewGroup;
        this.k = aweme;
        this.l = z;
        this.m = z2;
        this.f54024e.a(this.j);
        h hVar = this.f54024e.f4334b;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mVideoViewComponent.surfaceHolder");
        View a2 = hVar.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "mVideoViewComponent.surfaceHolder.view");
        this.o = a2;
        this.f54025f = new i(this.f54024e, (com.ss.android.ugc.aweme.video.a.a) this, (com.ss.android.ugc.aweme.feed.d) null, j.f53966b.a(this.k) == null ? j.f53965a : j.f53966b);
        if (!o.v()) {
            this.f54025f.f57422c = this.g;
        }
        this.f54025f.a(this.k);
        this.f54024e.a(this.i);
    }
}
