package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13079a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13080b;

    cj(LinkPKWidget linkPKWidget) {
        this.f13080b = linkPKWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13079a, false, 7157, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13079a, false, 7157, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LinkPKWidget linkPKWidget = this.f13080b;
        linkPKWidget.f12636f.setVisibility(8);
        linkPKWidget.h.setVisibility(8);
        if (linkPKWidget.m == null || linkPKWidget.l == null) {
            float x = (linkPKWidget.k.getX() + ((float) ac.a(-9.0f))) - linkPKWidget.i.getX();
            float y = (((linkPKWidget.k.getY() + ((float) linkPKWidget.k.getHeight())) - ((float) ac.a(5.0f))) - linkPKWidget.i.getY()) - ((float) linkPKWidget.i.getHeight());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linkPKWidget.g, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linkPKWidget.g, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linkPKWidget.g, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linkPKWidget.g, "translationY", new float[]{0.0f, y});
            linkPKWidget.l = new AnimatorSet();
            linkPKWidget.l.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
            linkPKWidget.l.setDuration(500);
            linkPKWidget.l.start();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(linkPKWidget.i, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(linkPKWidget.i, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(linkPKWidget.i, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(linkPKWidget.i, "translationY", new float[]{0.0f, y});
            linkPKWidget.m = new AnimatorSet();
            linkPKWidget.m.playTogether(new Animator[]{ofFloat5, ofFloat6, ofFloat7, ofFloat8});
            linkPKWidget.m.setDuration(500);
            linkPKWidget.m.start();
            return;
        }
        linkPKWidget.m.cancel();
        linkPKWidget.l.cancel();
        linkPKWidget.m.start();
        linkPKWidget.l.start();
    }
}
