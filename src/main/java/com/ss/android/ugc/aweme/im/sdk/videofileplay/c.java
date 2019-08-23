package com.ss.android.ugc.aweme.im.sdk.videofileplay;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.b;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002LMB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0005J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\fH\u0016J\u001a\u0010$\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020\fH\u0016J\u0012\u0010&\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010'\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010(\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0005H\u0016J\"\u0010+\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\fH\u0016J\u0006\u00100\u001a\u00020\u001bJ\u0006\u00101\u001a\u00020\u001bJ\u0016\u00102\u001a\u00020\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b04H\u0002J\u0006\u00105\u001a\u00020\u001bJ\u0006\u00106\u001a\u00020\u001bJ\u0010\u00107\u001a\u00020\u001b2\b\u00108\u001a\u0004\u0018\u00010!J\u0010\u00109\u001a\u00020\u001b2\b\u0010:\u001a\u0004\u0018\u00010!J\u000e\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u0005J\u0015\u0010=\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020\u001b2\b\u0010:\u001a\u0004\u0018\u00010!J\u000e\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u0005J\u000e\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u0010J\u0010\u0010E\u001a\u00020\u001b2\b\u0010F\u001a\u0004\u0018\u00010GJ\u0010\u0010H\u001a\u00020\u001b2\b\u0010I\u001a\u0004\u0018\u00010!J\u0006\u0010J\u001a\u00020\u001bJ\u0016\u0010K\u001a\u00020\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b04H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager;", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayer$IMYMediaPlayerListener;", "context", "Landroid/content/Context;", "sync", "", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "mIsLooping", "mIsMute", "mLayoutAspect", "", "Ljava/lang/Integer;", "mPendingPause", "mPlayListener", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager$OnPlayListener;", "mPlayer", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayer;", "mPlayerThread", "Landroid/os/HandlerThread;", "getCurrentPlaybackTime", "getDuration", "getLoadState", "getProgress", "isPlaying", "onBufferingUpdate", "", "player", "percent", "onCompletion", "onError", "errorMessage", "", "onLoadStateChanged", "loadState", "onPlaybackStateChanged", "playbackState", "onPrepare", "onPrepared", "onRenderStart", "onSeekCompletion", "success", "onVideoSizeChanged", "width", "height", "onVideoStatusException", "status", "pause", "play", "playerThread", "f", "Lkotlin/Function0;", "release", "resetPlayer", "setDecryptionKey", "decryptionKey", "setDirectURL", "url", "setIsMute", "isMute", "setLayoutAspect", "layoutAspect", "(Ljava/lang/Integer;)V", "setLocalUrl", "setLooping", "looping", "setPlayListener", "listener", "setSurface", "surface", "Landroid/view/Surface;", "setVideoId", "vid", "stop", "uiThread", "Companion", "OnPlayListener", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52699a;

    /* renamed from: f  reason: collision with root package name */
    public static int f52700f;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public b f52701b;

    /* renamed from: c  reason: collision with root package name */
    public b f52702c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f52703d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f52704e;
    private HandlerThread h;
    private boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager$Companion;", "", "()V", "PLAYER_THREAD_NUM", "", "getPLAYER_THREAD_NUM", "()I", "setPLAYER_THREAD_NUM", "(I)V", "TAG", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager$OnPlayListener;", "", "onError", "", "errorMessage", "", "onLoadingSwitch", "isLoading", "", "onPlayComplete", "onPlayStateSwitch", "isPlaying", "onPrepare", "onPrepared", "onRenderStart", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@Nullable String str);

        void a(boolean z);

        void b();

        void b(boolean z);

        void c();

        void d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$c  reason: collision with other inner class name */
    static final class C0610c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0610c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53923, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53923, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$errorMessage = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53924, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53924, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.a(this.$errorMessage);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $loadState;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, int i) {
            super(0);
            this.this$0 = cVar;
            this.$loadState = i;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53925, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53925, new Class[0], Void.TYPE);
                return;
            }
            switch (this.$loadState) {
                case 1:
                    b bVar = this.this$0.f52702c;
                    if (bVar != null) {
                        bVar.b(false);
                        break;
                    } else {
                        return;
                    }
                case 2:
                    b bVar2 = this.this$0.f52702c;
                    if (bVar2 != null) {
                        bVar2.b(true);
                        return;
                    }
                    break;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53926, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53926, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53927, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53927, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53928, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53928, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53929, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53929, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53930, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53930, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.this$0.f52702c;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53931, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53931, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53932, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53932, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53933, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53933, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $decryptionKey;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$decryptionKey = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53935, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53935, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.a(this.$decryptionKey);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $url;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$url = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53936, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53936, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.b(this.$url);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $url;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$url = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53939, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53939, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.c(this.$url);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar, Surface surface) {
            super(0);
            this.this$0 = cVar;
            this.$surface = surface;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53941, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53941, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52701b.a(this.$surface);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class r<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f52706b;

        r(Function0 function0) {
            this.f52706b = function0;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f52705a, false, 53944, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52705a, false, 53944, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                this.f52706b.invoke();
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52699a, false, 53903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52699a, false, 53903, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        if (this.f52704e) {
            this.f52701b.a();
        } else {
            a((Function0<Unit>) new l<Unit>(this));
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52699a, false, 53904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52699a, false, 53904, new Class[0], Void.TYPE);
        } else if (c()) {
            this.i = false;
            if (this.f52704e) {
                this.f52701b.b();
            } else {
                a((Function0<Unit>) new k<Unit>(this));
            }
        } else {
            this.i = true;
        }
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f52699a, false, 53913, new Class[0], Boolean.TYPE)) {
            return this.f52701b.d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52699a, false, 53913, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52699a, false, 53917, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52699a, false, 53917, new Class[]{b.class}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new i<Unit>(this));
    }

    public final void c(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52699a, false, 53918, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52699a, false, 53918, new Class[]{b.class}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new j<Unit>(this));
    }

    public final void d(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52699a, false, 53919, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52699a, false, 53919, new Class[]{b.class}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new C0610c<Unit>(this));
    }

    private final void b(Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f52699a, false, 53922, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f52699a, false, 53922, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new r<TResult>(function02), a.i.f1052b);
    }

    public final void a(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f52699a, false, 53916, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f52699a, false, 53916, new Class[]{b.class}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new h<Unit>(this));
    }

    public final void c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52699a, false, 53901, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52699a, false, 53901, new Class[]{String.class}, Void.TYPE);
        } else if (this.f52704e) {
            this.f52701b.b(str);
        } else {
            a((Function0<Unit>) new o<Unit>(this, str));
        }
    }

    public final void d(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52699a, false, 53902, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52699a, false, 53902, new Class[]{String.class}, Void.TYPE);
        } else if (this.f52704e) {
            this.f52701b.c(str);
        } else {
            a((Function0<Unit>) new p<Unit>(this, str));
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52699a, false, 53920, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52699a, false, 53920, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new d<Unit>(this, str));
    }

    /* access modifiers changed from: package-private */
    public final void a(Function0<Unit> function0) {
        Looper looper;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f52699a, false, 53921, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f52699a, false, 53921, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        HandlerThread handlerThread = this.h;
        if (handlerThread != null) {
            looper = handlerThread.getLooper();
        } else {
            looper = null;
        }
        if (looper != null) {
            a.i.b((Callable<TResult>) new d<TResult>(function02));
        } else {
            b(function0);
        }
    }

    public final void b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52699a, false, 53900, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52699a, false, 53900, new Class[]{String.class}, Void.TYPE);
        } else if (this.f52704e) {
            this.f52701b.a(str);
        } else {
            a((Function0<Unit>) new n<Unit>(this, str));
        }
    }

    private c(@NotNull Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f52703d = context;
        this.f52704e = z;
        StringBuilder sb = new StringBuilder("video_player_thread");
        int i2 = f52700f;
        f52700f = i2 + 1;
        sb.append(i2);
        this.h = new HandlerThread(sb.toString(), 0);
        HandlerThread handlerThread = this.h;
        if (handlerThread != null) {
            handlerThread.start();
        }
        this.f52701b = new b(this.f52703d);
        this.f52701b.a((b.a) this);
    }

    public final void a(@Nullable b bVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i2)}, this, f52699a, false, 53914, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i2)}, this, f52699a, false, 53914, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 1) {
            b((Function0<Unit>) new g<Unit>(this));
        } else if (this.i) {
            b();
        } else {
            b((Function0<Unit>) new f<Unit>(this));
        }
    }

    public final void b(@Nullable b bVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i2)}, this, f52699a, false, 53915, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i2)}, this, f52699a, false, 53915, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b((Function0<Unit>) new e<Unit>(this, i2));
    }

    public /* synthetic */ c(Context context, boolean z, int i2) {
        this(context, false);
    }
}
