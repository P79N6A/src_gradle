package com.ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0007J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/LoadingController;", "Lcom/ss/android/ugc/aweme/video/abs/OnUIPlayListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/support/v4/app/FragmentActivity;", "lineProgressBar", "Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "getLineProgressBar", "()Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "onBuffering", "", "start", "", "onDecoderBuffering", "onDestroy", "onPausePlay", "sourceId", "", "onPlayCompleted", "onPlayCompletedFirstTime", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderFirstFrame", "Lcom/ss/android/ugc/aweme/video/event/PlayerFirstFrameEvent;", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResumePlay", "onRetryOnError", "obj", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoadingController implements LifecycleObserver, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3458a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final FragmentActivity f3459b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final LineProgressBar f3460c;

    public final void a(float f2) {
    }

    public final void a(@Nullable b bVar) {
    }

    public final void b(@Nullable e eVar) {
    }

    public final void b(@Nullable String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(@Nullable String str) {
    }

    public final void e(@Nullable String str) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3458a, false, 56670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3458a, false, 56670, new Class[0], Void.TYPE);
            return;
        }
        LineProgressBar lineProgressBar = this.f3460c;
        if (lineProgressBar != null) {
            lineProgressBar.c();
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3458a, false, 56673, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3458a, false, 56673, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        LineProgressBar lineProgressBar = this.f3460c;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
    }

    public final void c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3458a, false, 56671, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3458a, false, 56671, new Class[]{String.class}, Void.TYPE);
            return;
        }
        LineProgressBar lineProgressBar = this.f3460c;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
    }

    public final void a(@Nullable e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3458a, false, 56674, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3458a, false, 56674, new Class[]{e.class}, Void.TYPE);
            return;
        }
        LineProgressBar lineProgressBar = this.f3460c;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3458a, false, 56675, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3458a, false, 56675, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            LineProgressBar lineProgressBar = this.f3460c;
            if (lineProgressBar != null) {
                lineProgressBar.a();
            }
        } else {
            LineProgressBar lineProgressBar2 = this.f3460c;
            if (lineProgressBar2 != null) {
                lineProgressBar2.b();
            }
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3458a, false, 56672, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3458a, false, 56672, new Class[]{String.class}, Void.TYPE);
            return;
        }
        LineProgressBar lineProgressBar = this.f3460c;
        if (lineProgressBar != null) {
            lineProgressBar.a();
        }
    }

    public LoadingController(@NotNull FragmentActivity fragmentActivity, @Nullable LineProgressBar lineProgressBar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f3459b = fragmentActivity;
        this.f3460c = lineProgressBar;
        this.f3459b.getLifecycle().addObserver(this);
        LineProgressBar lineProgressBar2 = this.f3460c;
        if (lineProgressBar2 != null) {
            lineProgressBar2.a();
        }
    }
}
