package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12942a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioWidget f12943b;

    a(AudioWidget audioWidget) {
        this.f12943b = audioWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f12942a, false, 6555, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f12942a, false, 6555, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        AudioWidget audioWidget = this.f12943b;
        if (audioWidget.f12351d != null) {
            audioWidget.f12351d.unlockCanvasAndPost(audioWidget.f12351d.lockCanvas(null));
        }
    }
}
