package com.ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.DiggView;
import com.ss.android.ugc.aweme.longvideo.b.g;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.u.as;
import com.ss.android.ugc.aweme.u.at;
import com.ss.android.ugc.aweme.u.v;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.h;
import com.ss.android.ugc.aweme.video.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001eH\u0016J\u0010\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001eH\u0016J\b\u0010D\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020AH\u0007J\u0012\u0010F\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010H\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010I\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010J\u001a\u00020A2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010Q\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010N\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u001eH\u0016J\u0012\u0010U\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010VH\u0016J\u0012\u0010W\u001a\u00020A2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u00020AH\u0007J\u0012\u0010[\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\\\u001a\u00020A2\b\u0010]\u001a\u0004\u0018\u00010LH\u0016J\u0012\u0010^\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010_\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010`\u001a\u00020AH\u0016J\b\u0010a\u001a\u00020AH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001a\u00104\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001a\u00107\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001a\u0010:\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001a\u0010=\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001c¨\u0006b"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/longvideo/DiggView$IDiggCallback;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "activity", "Landroid/support/v4/app/FragmentActivity;", "mPlayManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/video/PlayerManager;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "enterFrom", "", "getEnterFrom", "()Ljava/lang/String;", "setEnterFrom", "(Ljava/lang/String;)V", "isLongItem", "", "()I", "setLongItem", "(I)V", "mIsBuffering", "", "getMIsBuffering", "()Z", "setMIsBuffering", "(Z)V", "mMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "getMMobViewModel", "()Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "setMMobViewModel", "(Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;)V", "getMPlayManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "mStartPlayTime", "", "getMStartPlayTime", "()J", "setMStartPlayTime", "(J)V", "mStartPrepareTime", "getMStartPrepareTime", "setMStartPrepareTime", "mStayTime", "getMStayTime", "setMStayTime", "mVideoBufferTime", "getMVideoBufferTime", "setMVideoBufferTime", "pageType", "getPageType", "setPageType", "seekBarStartTouch", "getSeekBarStartTouch", "setSeekBarStartTouch", "onBuffering", "", "start", "onDecoderBuffering", "onDigg", "onPause", "onPausePlay", "sourceId", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "fromUser", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResume", "onResumePlay", "onRetryOnError", "obj", "onStartTrackingTouch", "onStopTrackingTouch", "onUndigg", "recordFirstFrameTime", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LongVideoPlayMob implements LifecycleObserver, SeekBar.OnSeekBarChangeListener, DiggView.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3461a;

    /* renamed from: b  reason: collision with root package name */
    public long f3462b;

    /* renamed from: c  reason: collision with root package name */
    public long f3463c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f3464d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public LongVideoMobViewModel f3465e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Aweme f3466f;
    @NotNull
    public String g = "";
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    @NotNull
    public final FragmentActivity m;
    @NotNull
    public final o n;

    public final void a(float f2) {
    }

    public final void b(@Nullable e eVar) {
    }

    public final void c(boolean z) {
    }

    public final void d(@Nullable String str) {
    }

    public final void onProgressChanged(@Nullable SeekBar seekBar, int i2, boolean z) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3461a, false, 56678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3461a, false, 56678, new Class[0], Void.TYPE);
            return;
        }
        this.f3464d = System.currentTimeMillis();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3461a, false, 56680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3461a, false, 56680, new Class[0], Void.TYPE);
            return;
        }
        new v().e(this.g).f(this.g).a(this.h).f(this.f3466f).b(this.j).e();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3461a, false, 56679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3461a, false, 56679, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3464d;
        if (!TextUtils.equals(this.g, "discovery_second_floor")) {
            new ao("long_video_stay_time").a(String.valueOf(currentTimeMillis)).b(this.g).f(this.f3466f).e();
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3461a, false, 56684, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3461a, false, 56684, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f3462b = System.currentTimeMillis();
        this.f3463c = System.currentTimeMillis();
    }

    public final void b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3461a, false, 56685, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3461a, false, 56685, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f3462b = System.currentTimeMillis();
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3461a, false, 56687, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3461a, false, 56687, new Class[]{String.class}, Void.TYPE);
            return;
        }
        new as().a(this.g).b(this.g).b(this.f3466f, this.h).a(this.j).e();
    }

    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3461a, false, 56690, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3461a, false, 56690, new Class[]{SeekBar.class}, Void.TYPE);
        } else if (seekBar != null) {
            this.i = seekBar.getProgress();
        }
    }

    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3461a, false, 56691, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3461a, false, 56691, new Class[]{SeekBar.class}, Void.TYPE);
        } else if (seekBar != null) {
            if (this.i < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            d a2 = d.a().a("enter_from", this.g).a("action_type", str);
            Aweme aweme = this.f3466f;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            r.a("click_progress_bar", (Map) a2.a("group_id", str2).f34114b);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        Video video;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3461a, false, 56681, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3461a, false, 56681, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3461a, false, 56682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3461a, false, 56682, new Class[0], Void.TYPE);
        } else if (this.f3463c != -1) {
            g.f53900b.a(System.currentTimeMillis() - this.f3463c, "long_video_first_frame_time");
            this.f3463c = -1;
        }
        g.a aVar2 = g.f53900b;
        Aweme aweme = this.f3466f;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        aVar2.a(video, "aweme_long_video_error_rate");
    }

    public final void b(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3461a, false, 56688, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3461a, false, 56688, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l = z2;
        if (z2) {
            if (this.k == -1) {
                this.k = SystemClock.elapsedRealtime();
            }
        } else if (this.k != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
            this.k = -1;
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.f3466f;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String str2 = a2.d(Intrinsics.stringPlus(str, Integer.valueOf(this.h))).f44615a;
            g.a aVar = g.f53900b;
            Aweme aweme2 = this.f3466f;
            if (aweme2 != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            String m2 = aa.m(this.f3466f);
            Intrinsics.checkExpressionValueIsNotNull(m2, "MobUtils.getAid(aweme)");
            aVar.a(video, m2, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.n);
        }
    }

    public final void c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3461a, false, 56686, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3461a, false, 56686, new Class[]{String.class}, Void.TYPE);
            return;
        }
        new at().a(this.g).f(this.f3466f).a(System.currentTimeMillis() - this.f3462b).e(this.n.m().toString()).f(aa.a(this.f3466f, this.h)).a(this.n.o()).a(this.j).e();
        if (this.l) {
            b(false);
        }
    }

    public final void a(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3461a, false, 56689, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3461a, false, 56689, new Class[]{b.class}, Void.TYPE);
            return;
        }
        new ar().a(this.g).c(this.g).b(this.f3466f, this.h).e(h.b().name()).a(this.j).e();
    }

    public final void a(@Nullable e eVar) {
        Video video;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3461a, false, 56683, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3461a, false, 56683, new Class[]{e.class}, Void.TYPE);
            return;
        }
        g.a aVar = g.f53900b;
        Aweme aweme = this.f3466f;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        aVar.a(eVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r2 == null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayMob(@org.jetbrains.annotations.NotNull android.support.v4.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.video.o r3) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "mPlayManager"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            r1.<init>()
            r1.m = r2
            r1.n = r3
            r2 = -1
            r1.f3463c = r2
            java.lang.String r0 = ""
            r1.g = r0
            r0 = 1
            r1.j = r0
            r1.k = r2
            android.support.v4.app.FragmentActivity r2 = r1.m
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.LifecycleObserver r3 = (android.arch.lifecycle.LifecycleObserver) r3
            r2.addObserver(r3)
            com.ss.android.ugc.aweme.longvideo.b.a$a r2 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            android.support.v4.app.FragmentActivity r3 = r1.m
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r2.a((android.support.v4.app.FragmentActivity) r3)
            r1.f3465e = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f3465e
            if (r2 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f53992b
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r1.f3466f = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f3465e
            if (r2 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r2.f53913a
            if (r2 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r2 = ""
        L_0x004c:
            r1.g = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f3465e
            if (r2 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0059
            int r2 = r2.f53914b
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            r1.h = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f3465e
            if (r2 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f53991a
            if (r2 == 0) goto L_0x0066
            int r0 = r2.f53915c
        L_0x0066:
            r1.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob.<init>(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.video.o):void");
    }
}
