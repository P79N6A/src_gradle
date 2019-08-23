package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34858a = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f34859d = "b";

    /* renamed from: b  reason: collision with root package name */
    public SwipeRefreshLayout f34860b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34861c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34862e = true;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f34863f;

    public abstract void a(boolean z);

    public void a(boolean z, boolean z2) {
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34858a, false, 24767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34858a, false, 24767, new Class[0], Void.TYPE);
            return;
        }
        if (this.f34863f != null) {
            c(this.f34863f.booleanValue());
            this.f34863f = null;
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34858a, false, 24761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34858a, false, 24761, new Class[0], Void.TYPE);
            return;
        }
        b(false);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34858a, false, 24760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34858a, false, 24760, new Class[0], Void.TYPE);
            return;
        }
        b(true);
    }

    public final Animation.AnimationListener a(Animation.AnimationListener animationListener) {
        final Animation.AnimationListener animationListener2 = animationListener;
        if (!PatchProxy.isSupport(new Object[]{animationListener2}, this, f34858a, false, 24768, new Class[]{Animation.AnimationListener.class}, Animation.AnimationListener.class)) {
            return new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34864a;

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f34864a, false, 24770, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f34864a, false, 24770, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationEnd(animation);
                    }
                    b.this.b(true);
                }

                public final void onAnimationRepeat(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f34864a, false, 24771, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f34864a, false, 24771, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationRepeat(animation);
                    }
                }

                public final void onAnimationStart(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f34864a, false, 24769, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f34864a, false, 24769, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationStart(animation);
                    }
                }
            };
        }
        return (Animation.AnimationListener) PatchProxy.accessDispatch(new Object[]{animationListener2}, this, f34858a, false, 24768, new Class[]{Animation.AnimationListener.class}, Animation.AnimationListener.class);
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34858a, false, 24765, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34858a, false, 24765, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f34861c != z) {
            if (!this.f34862e) {
                this.f34863f = Boolean.valueOf(z);
                return;
            }
            this.f34861c = z;
            a(z);
        }
    }

    public void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34858a, false, 24764, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34858a, false, 24764, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        b(false);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34858a, false, 24766, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34858a, false, 24766, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f34862e != z) {
            this.f34862e = z;
            if (z) {
                c();
            }
        }
    }

    public void b(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), animationListener}, this, f34858a, false, 24763, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), animationListener}, this, f34858a, false, 24763, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        b(false);
    }

    public void a(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), animationListener}, this, f34858a, false, 24762, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), animationListener}, this, f34858a, false, 24762, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        b(false);
    }
}
