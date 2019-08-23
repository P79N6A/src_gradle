package com.ss.android.ugc.aweme.commercialize.log;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.b.b;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.e;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0006\u0010\u001b\u001a\u00020\u000eJ\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0006\u0010\u001d\u001a\u00020\u000eJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020!H\u0007J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010&\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010.\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u00104\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010)H\u0016J\u0010\u00106\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u000207H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/LongVideoRawAdLogger;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mDestroyed", "", "mLastPlayStamp", "", "mPaused", "mPlayCompleted", "logBreak", "", "logCancelLike", "logComment", "logLike", "logOver", "logPlay", "logReplay", "logSeekComplete", "onBuffering", "start", "onCommentEvent", "event", "Lcom/ss/android/ugc/aweme/comment/event/CommentEvent;", "onCreate", "onDecoderBuffering", "onDestroy", "onDestroyBreakEvent", "Lcom/ss/android/ugc/aweme/feed/event/DestroyBreakEvent;", "onOperateEvent", "Lcom/ss/android/ugc/aweme/longvideo/event/OperateEvent;", "onPausePlay", "sourceId", "", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResumePlay", "onRetryOnError", "obj", "onVideoEvent", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class x implements com.ss.android.ugc.aweme.video.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2920a;

    /* renamed from: c  reason: collision with root package name */
    public static long f2921c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2922d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f2923e = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f2924b;

    /* renamed from: f  reason: collision with root package name */
    private long f2925f;
    private boolean g = true;
    private boolean h;
    private boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/LongVideoRawAdLogger$Companion;", "", "()V", "TAG", "", "duration", "", "duration$annotations", "getDuration", "()J", "setDuration", "(J)V", "everPlayComplete", "", "everPlayComplete$annotations", "getEverPlayComplete", "()Z", "setEverPlayComplete", "(Z)V", "checkEnabled", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "isDouyinLongVideoRawAd", "resetData", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39354a;

        private a() {
        }

        @JvmStatic
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39354a, false, 31834, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39354a, false, 31834, new Class[0], Void.TYPE);
            } else if (!com.ss.android.g.a.a()) {
                a(0);
                a(false);
            }
        }

        private static void a(boolean z) {
            x.f2922d = false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(long j) {
            x.f2921c = 0;
        }

        @JvmStatic
        public final boolean a(@Nullable Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f39354a, false, 31832, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39354a, false, 31832, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else if (!com.ss.android.g.a.a() && aweme != null) {
                return aweme.isAd();
            } else {
                return false;
            }
        }

        @JvmStatic
        public final boolean b(@Nullable Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f39354a, false, 31833, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f39354a, false, 31833, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else if (!b.f53880b.b(aweme2) || !a(aweme2)) {
                return false;
            } else {
                return true;
            }
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, null, f2920a, true, 31830, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return f2923e.b(aweme2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f2920a, true, 31830, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public static final long b() {
        return f2921c;
    }

    @JvmStatic
    public static final void c() {
        if (PatchProxy.isSupport(new Object[0], null, f2920a, true, 31831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f2920a, true, 31831, new Class[0], Void.TYPE);
        } else {
            f2923e.a();
        }
    }

    public final void a(float f2) {
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
    }

    public final void a(@Nullable e eVar) {
    }

    public final void a(@Nullable String str) {
    }

    public final void b(@Nullable e eVar) {
    }

    public final void b(boolean z) {
    }

    public final void c(boolean z) {
    }

    public final void d(@Nullable String str) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31816, new Class[0], Void.TYPE);
        } else if (!this.i) {
            this.i = true;
            if (!this.h) {
                if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31823, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31823, new Class[0], Void.TYPE);
                } else {
                    g.W(GlobalContext.getContext(), this.f2924b);
                }
            }
            bg.d(this);
        }
    }

    public x(@Nullable Aweme aweme) {
        this.f2924b = aweme;
    }

    @Subscribe
    public final void onDestroyBreakEvent(@NotNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f2920a, false, 31820, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f2920a, false, 31820, new Class[]{h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar2, "event");
        a();
    }

    public final void b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2920a, false, 31813, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2920a, false, 31813, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f2925f = SystemClock.elapsedRealtime();
        if (this.h) {
            if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31822, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31822, new Class[0], Void.TYPE);
            } else {
                g.ae(GlobalContext.getContext(), this.f2924b);
            }
        }
        this.h = false;
        this.g = false;
    }

    public final void c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2920a, false, 31814, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2920a, false, 31814, new Class[]{String.class}, Void.TYPE);
        } else if (!this.g) {
            f2921c += SystemClock.elapsedRealtime() - this.f2925f;
            this.g = true;
        }
    }

    public final void e(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2920a, false, 31815, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2920a, false, 31815, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f2921c += SystemClock.elapsedRealtime() - this.f2925f;
        if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31824, new Class[0], Void.TYPE);
        } else {
            g.X(GlobalContext.getContext(), this.f2924b);
        }
        this.h = true;
        this.g = true;
        f2922d = true;
    }

    @Subscribe
    public final void onCommentEvent(@NotNull com.ss.android.ugc.aweme.comment.b.a aVar) {
        com.ss.android.ugc.aweme.comment.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2920a, false, 31819, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2920a, false, 31819, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        if (aVar2.f36370a == 3) {
            if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31826, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31826, new Class[0], Void.TYPE);
                return;
            }
            g.aa(GlobalContext.getContext(), this.f2924b);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2920a, false, 31812, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2920a, false, 31812, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        this.f2925f = SystemClock.elapsedRealtime();
        this.h = false;
        this.g = false;
        if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31821, new Class[0], Void.TYPE);
            return;
        }
        g.V(GlobalContext.getContext(), this.f2924b);
    }

    @Subscribe
    public final void onOperateEvent(@NotNull com.ss.android.ugc.aweme.longvideo.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2920a, false, 31817, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2920a, false, 31817, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if (aVar.f53874a) {
            if (!this.g) {
                f2921c += SystemClock.elapsedRealtime() - this.f2925f;
            }
        } else if (aVar.f53875b) {
            if (!this.g) {
                this.f2925f = SystemClock.elapsedRealtime();
            }
            if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31825, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31825, new Class[0], Void.TYPE);
                return;
            }
            g.ad(GlobalContext.getContext(), this.f2924b);
        }
    }

    @Subscribe
    public final void onVideoEvent(@NotNull ar arVar) {
        String str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f2920a, false, 31818, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f2920a, false, 31818, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arVar, "event");
        if (arVar.f45292b == 13 && (arVar.f45293c instanceof String)) {
            Object obj = arVar.f45293c;
            if (obj != null) {
                String str2 = (String) obj;
                Aweme aweme = this.f2924b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!(!Intrinsics.areEqual((Object) str2, (Object) str))) {
                    Aweme a2 = j.a().a(str2);
                    if (a2 != null) {
                        if (a2.getUserDigg() == 0) {
                            z = false;
                        }
                        if (z) {
                            if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31827, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31827, new Class[0], Void.TYPE);
                            } else {
                                g.Y(GlobalContext.getContext(), this.f2924b);
                            }
                        } else {
                            if (PatchProxy.isSupport(new Object[0], this, f2920a, false, 31828, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f2920a, false, 31828, new Class[0], Void.TYPE);
                                return;
                            }
                            g.Z(GlobalContext.getContext(), this.f2924b);
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }
}
