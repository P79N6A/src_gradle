package com.ss.android.ugc.aweme.longvideonew;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.b.g;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.u.as;
import com.ss.android.ugc.aweme.u.at;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.h;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010)\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u00010$H\u0016J\b\u00101\u001a\u00020\u001bH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/LongVideoPlayerMonitor;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILcom/ss/android/ugc/aweme/video/PlayerManager;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMEventType", "()Ljava/lang/String;", "mIsBuffering", "", "mIsLongItem", "getMPageType", "()I", "getMPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "mStartPlayTime", "", "mStartPrepareTime", "mVideoBufferTime", "onBuffering", "", "start", "onDecoderBuffering", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResumePlay", "onRetryOnError", "obj", "recordFirstFrameTime", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54030a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f54031b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f54032c;

    /* renamed from: d  reason: collision with root package name */
    public final int f54033d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final o f54034e;

    /* renamed from: f  reason: collision with root package name */
    private long f54035f = -1;
    private long g;
    private int h = 1;
    private boolean i;
    private long j = -1;

    public final void a(float f2) {
    }

    public final void b(@Nullable e eVar) {
    }

    public final void c(boolean z) {
    }

    public final void d(@Nullable String str) {
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54030a, false, 56867, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54030a, false, 56867, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g = SystemClock.elapsedRealtime();
        this.f54035f = SystemClock.elapsedRealtime();
    }

    public final void b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54030a, false, 56865, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54030a, false, 56865, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g = SystemClock.elapsedRealtime();
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        Video video;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54030a, false, 56869, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54030a, false, 56869, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f54030a, false, 56870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54030a, false, 56870, new Class[0], Void.TYPE);
        } else if (this.f54035f != -1) {
            g.f53900b.a(SystemClock.elapsedRealtime() - this.f54035f, "long_video_first_frame_time");
            this.f54035f = -1;
        }
        g.a aVar2 = g.f53900b;
        Aweme aweme = this.f54031b;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        aVar2.a(video, "aweme_long_video_error_rate");
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54030a, false, 56873, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54030a, false, 56873, new Class[]{String.class}, Void.TYPE);
            return;
        }
        new as().a(this.f54032c).b(this.f54032c).b(this.f54031b, this.f54033d).a(this.h).e();
    }

    public final void a(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f54030a, false, 56868, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f54030a, false, 56868, new Class[]{b.class}, Void.TYPE);
            return;
        }
        new ar().a(this.f54032c).c(this.f54032c).b(this.f54031b, this.f54033d).e(h.b().name()).a(this.h).e();
    }

    public final void b(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54030a, false, 56872, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54030a, false, 56872, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i = z2;
        if (z2) {
            if (this.j == -1) {
                this.j = SystemClock.elapsedRealtime();
            }
        } else if (this.j != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            this.j = -1;
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.f54031b;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String str2 = a2.d(Intrinsics.stringPlus(str, Integer.valueOf(this.f54033d))).f44615a;
            g.a aVar = g.f53900b;
            Aweme aweme2 = this.f54031b;
            if (aweme2 != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            String m = aa.m(this.f54031b);
            Intrinsics.checkExpressionValueIsNotNull(m, "MobUtils.getAid(mAweme)");
            aVar.a(video, m, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.f54034e);
        }
    }

    public final void c(@Nullable String str) {
        c.a aVar;
        float f2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f54030a, false, 56866, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54030a, false, 56866, new Class[]{String.class}, Void.TYPE);
            return;
        }
        at a2 = new at().a(this.f54032c).f(this.f54031b).a(SystemClock.elapsedRealtime() - this.g);
        o oVar = this.f54034e;
        if (oVar != null) {
            aVar = oVar.m();
        } else {
            aVar = null;
        }
        at f3 = a2.e(String.valueOf(aVar)).f(aa.a(this.f54031b, this.f54033d));
        o oVar2 = this.f54034e;
        if (oVar2 != null) {
            f2 = oVar2.o();
        } else {
            f2 = -1.0f;
        }
        f3.a(f2).a(this.h).e();
        if (this.i) {
            b(false);
        }
    }

    public final void a(@Nullable e eVar) {
        Video video;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f54030a, false, 56871, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f54030a, false, 56871, new Class[]{e.class}, Void.TYPE);
            return;
        }
        g.a aVar = g.f53900b;
        Aweme aweme = this.f54031b;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        aVar.a(eVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    public c(@Nullable Aweme aweme, @NotNull String str, int i2, @Nullable o oVar) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        this.f54031b = aweme;
        this.f54032c = str;
        this.f54033d = i2;
        this.f54034e = oVar;
    }
}
