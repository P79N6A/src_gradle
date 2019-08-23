package com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a;
import com.ss.android.ugc.aweme.feed.ui.seekbar.c;
import com.ss.android.ugc.aweme.feed.ui.seekbar.d;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.longvideonew.g;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0012H\u0017J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0014H\u0017J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0016H\u0017J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001bH\u0017¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DetailVideoSeekBarControl;", "Lcom/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl;", "videoSeekBar", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "videoSeekDuration", "Landroid/widget/LinearLayout;", "baseListFragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;Landroid/widget/LinearLayout;Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onDestroy", "onFullFeedVideoChangeEvent", "event", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/BaseListFragmentPanelVideoChangeEvent;", "onPlayerControllerRenderFirstFrameEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerRenderFirstFrameEvent;", "onPlayerControllerVideoPlayProgressChange", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoPlayProgressEvent;", "onPlayerControllerVideoStatusEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoStatusEvent;", "onStopTrackingTouch", "seekBar", "Landroid/widget/SeekBar;", "onVideoProgressVolumeKeyEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoProgressVolumeKeyEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3218a;

    @Subscribe
    public final void onVideoProgressVolumeKeyEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar) {
        com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3218a, false, 43507, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3218a, false, 43507, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        super.onVideoProgressVolumeKeyEvent(gVar);
    }

    public final void a(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f3218a, false, 43513, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f3218a, false, 43513, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        super.a(motionEvent);
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            bg.a(new a(true, this.f3501c, this.k));
        }
    }

    public final void b(@Nullable SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3218a, false, 43512, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3218a, false, 43512, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        super.b(seekBar);
        bg.a(new a(false, this.f3501c, this.k));
    }

    @Subscribe
    public final void onFullFeedVideoChangeEvent(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3218a, false, 43509, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3218a, false, 43509, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if (Intrinsics.areEqual((Object) this.k, (Object) aVar.f46852d)) {
            super.onFullFeedVideoChangeEvent(aVar);
            a();
        } else {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        }
        this.u.removeCallbacks(this.t);
    }

    @Subscribe
    public final void onPlayerControllerRenderFirstFrameEvent(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3218a, false, 43508, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3218a, false, 43508, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        if (Intrinsics.areEqual((Object) this.k, (Object) cVar2.f46866e)) {
            super.onPlayerControllerRenderFirstFrameEvent(cVar);
        }
    }

    @Subscribe
    public final void onPlayerControllerVideoPlayProgressChange(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3218a, false, 43511, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3218a, false, 43511, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        if (Intrinsics.areEqual((Object) this.k, (Object) dVar2.f46871e)) {
            super.onPlayerControllerVideoPlayProgressChange(dVar);
        }
    }

    @Subscribe
    public final void onPlayerControllerVideoStatusEvent(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3218a, false, 43510, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3218a, false, 43510, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "event");
        if (Intrinsics.areEqual((Object) this.k, (Object) eVar2.f46892e)) {
            super.onPlayerControllerVideoStatusEvent(eVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull VideoSeekBar videoSeekBar, @NotNull LinearLayout linearLayout, @Nullable BaseListFragmentPanel baseListFragmentPanel) {
        super(videoSeekBar, linearLayout);
        Intrinsics.checkParameterIsNotNull(videoSeekBar, "videoSeekBar");
        Intrinsics.checkParameterIsNotNull(linearLayout, "videoSeekDuration");
        bg.c(this);
        this.k = baseListFragmentPanel;
    }
}
