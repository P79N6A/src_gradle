package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a;
import com.ss.android.ugc.aweme.feed.ui.seekbar.b;
import com.ss.android.ugc.aweme.feed.ui.seekbar.d;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.longvideonew.g;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0012H\u0017J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0014H\u0017J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016H\u0017J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0018H\u0017J\u0012\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001dH\u0017¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/maintab/MainTabVideoSeekBarControl;", "Lcom/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl;", "videoSeekBar", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "videoSeekDuration", "Landroid/widget/LinearLayout;", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;Landroid/widget/LinearLayout;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onDestroy", "onFullFeedFragmentLifeCycleEvent", "event", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/maintab/FullFeedFragmentLifeCycleEvent;", "onFullFeedFragmentPanelOnPageScrollEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/FullFeedFragmentPanelOnPageScrollEvent;", "onFullFeedVideoChangeEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/BaseListFragmentPanelVideoChangeEvent;", "onPlayerControllerRenderFirstFrameEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerRenderFirstFrameEvent;", "onPlayerControllerVideoPlayProgressChange", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoPlayProgressEvent;", "onPlayerControllerVideoStatusEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoStatusEvent;", "onStopTrackingTouch", "seekBar", "Landroid/widget/SeekBar;", "onVideoProgressVolumeKeyEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoProgressVolumeKeyEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3217a;

    public final void a(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f3217a, false, 43547, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f3217a, false, 43547, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        super.a(motionEvent);
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                bg.a(new b(true, this.f3501c));
            }
        }
    }

    public final void b(@Nullable SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3217a, false, 43546, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3217a, false, 43546, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        super.b(seekBar);
        bg.a(new b(false, this.f3501c));
    }

    @Subscribe
    public final void onFullFeedFragmentLifeCycleEvent(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3217a, false, 43541, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3217a, false, 43541, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        this.f3501c = aVar.f46855b;
        switch (aVar.f46854a) {
            case 1:
                a();
                bg.a(new h(this.f3501c));
                return;
            case 2:
                this.u.setVisibility(8);
                this.v.setVisibility(8);
                bg.a(new h(this.f3501c));
                break;
        }
    }

    @Subscribe
    public final void onFullFeedFragmentPanelOnPageScrollEvent(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3217a, false, 43539, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3217a, false, 43539, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "event");
        if ("homepage_hot".equals(bVar2.f46859b)) {
            super.c();
        }
    }

    @Subscribe
    public final void onFullFeedVideoChangeEvent(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3217a, false, 43542, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3217a, false, 43542, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if ("homepage_hot".equals(aVar.f46850b)) {
            super.onFullFeedVideoChangeEvent(aVar);
            a();
        } else {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        }
        this.u.removeCallbacks(this.t);
    }

    @Subscribe
    public final void onPlayerControllerRenderFirstFrameEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar) {
        com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3217a, false, 43543, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3217a, false, 43543, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        if ("homepage_hot".equals(cVar2.f46863b)) {
            super.onPlayerControllerRenderFirstFrameEvent(cVar);
        }
    }

    @Subscribe
    public final void onPlayerControllerVideoPlayProgressChange(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3217a, false, 43545, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3217a, false, 43545, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        if ("homepage_hot".equals(dVar2.f46868b)) {
            super.onPlayerControllerVideoPlayProgressChange(dVar);
        }
    }

    @Subscribe
    public final void onPlayerControllerVideoStatusEvent(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3217a, false, 43544, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3217a, false, 43544, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "event");
        if ("homepage_hot".equals(eVar2.f46889b)) {
            super.onPlayerControllerVideoStatusEvent(eVar);
        }
    }

    @Subscribe
    public final void onVideoProgressVolumeKeyEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar) {
        com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3217a, false, 43540, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3217a, false, 43540, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        if ("homepage_hot".equals(gVar2.f46896b)) {
            super.onVideoProgressVolumeKeyEvent(gVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull VideoSeekBar videoSeekBar, @NotNull LinearLayout linearLayout) {
        super(videoSeekBar, linearLayout);
        Intrinsics.checkParameterIsNotNull(videoSeekBar, "videoSeekBar");
        Intrinsics.checkParameterIsNotNull(linearLayout, "videoSeekDuration");
        bg.c(this);
    }
}
