package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;

class SwipeRefreshFullScreenUI$1 extends LottieAnimationView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34829a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f34830b;

    public final void setComposition(@NonNull LottieComposition lottieComposition) {
        if (PatchProxy.isSupport(new Object[]{lottieComposition}, this, f34829a, false, 24784, new Class[]{LottieComposition.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lottieComposition}, this, f34829a, false, 24784, new Class[]{LottieComposition.class}, Void.TYPE);
            return;
        }
        super.setComposition(lottieComposition);
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34831a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f34831a, false, 24785, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34831a, false, 24785, new Class[0], Void.TYPE);
                    return;
                }
                c.h = false;
                Context context = SwipeRefreshFullScreenUI$1.this.f34830b;
                if (PatchProxy.isSupport(new Object[]{context}, null, c.f34867d, true, 24773, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, null, c.f34867d, true, 24773, new Class[]{Context.class}, Void.TYPE);
                } else if (!c.h && c.g.peek() != null) {
                    SwipeRefreshFullScreenUI$1 swipeRefreshFullScreenUI$1 = new SwipeRefreshFullScreenUI$1(context, context);
                    String poll = c.g.poll();
                    if (poll != null) {
                        swipeRefreshFullScreenUI$1.setAnimation(poll, LottieAnimationView.a.Strong);
                    }
                }
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeRefreshFullScreenUI$1(Context context, Context context2) {
        super(context);
        this.f34830b = context2;
    }
}
