package com.ss.android.ugc.aweme.story.base.view;

import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72022a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f72023c = "e";

    /* renamed from: b  reason: collision with root package name */
    public boolean f72024b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72025d = true;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f72026e;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72022a, false, 82533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72022a, false, 82533, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72026e != null) {
            b(this.f72026e.booleanValue());
            this.f72026e = null;
        }
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72022a, false, 82531, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72022a, false, 82531, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f72024b != z) {
            if (!this.f72025d) {
                this.f72026e = Boolean.valueOf(z);
            } else {
                this.f72024b = z;
            }
        }
    }

    public final Animation.AnimationListener a(Animation.AnimationListener animationListener) {
        final Animation.AnimationListener animationListener2 = animationListener;
        if (!PatchProxy.isSupport(new Object[]{animationListener2}, this, f72022a, false, 82534, new Class[]{Animation.AnimationListener.class}, Animation.AnimationListener.class)) {
            return new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72027a;

                public final void onAnimationRepeat(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f72027a, false, 82537, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f72027a, false, 82537, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationRepeat(animation);
                    }
                }

                public final void onAnimationStart(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f72027a, false, 82535, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f72027a, false, 82535, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationStart(animation);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f72027a, false, 82536, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f72027a, false, 82536, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    if (animationListener2 != null) {
                        animationListener2.onAnimationEnd(animation);
                    }
                    e.this.a(true);
                }
            };
        }
        return (Animation.AnimationListener) PatchProxy.accessDispatch(new Object[]{animationListener2}, this, f72022a, false, 82534, new Class[]{Animation.AnimationListener.class}, Animation.AnimationListener.class);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72022a, false, 82530, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72022a, false, 82530, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        a(false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72022a, false, 82532, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72022a, false, 82532, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f72025d != z) {
            this.f72025d = z;
            if (z) {
                a();
            }
        }
    }

    public final void b(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), animationListener}, this, f72022a, false, 82529, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), animationListener}, this, f72022a, false, 82529, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        a(false);
    }

    public final void a(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), animationListener}, this, f72022a, false, 82528, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), animationListener}, this, f72022a, false, 82528, new Class[]{Integer.TYPE, Animation.AnimationListener.class}, Void.TYPE);
            return;
        }
        a(false);
    }
}
