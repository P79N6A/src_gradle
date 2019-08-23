package com.bytedance.android.live.uikit.toast;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.Queue;

public class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8704a;

    /* renamed from: e  reason: collision with root package name */
    private static b f8705e;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<a> f8706b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f8707c;

    /* renamed from: d  reason: collision with root package name */
    public int f8708d = 5;

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f8704a, false, 2429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8704a, false, 2429, new Class[0], Void.TYPE);
            return;
        }
        a peek = this.f8706b.peek();
        if (peek != null) {
            peek.dismiss();
        }
    }

    public static synchronized b a() {
        synchronized (b.class) {
            if (PatchProxy.isSupport(new Object[0], null, f8704a, true, 2423, new Class[0], b.class)) {
                b bVar = (b) PatchProxy.accessDispatch(new Object[0], null, f8704a, true, 2423, new Class[0], b.class);
                return bVar;
            } else if (f8705e != null) {
                b bVar2 = f8705e;
                return bVar2;
            } else {
                b bVar3 = new b(Looper.getMainLooper());
                f8705e = bVar3;
                return bVar3;
            }
        }
    }

    public final void b() {
        while (true) {
            if (PatchProxy.isSupport(new Object[0], this, f8704a, false, 2430, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8704a, false, 2430, new Class[0], Void.TYPE);
                return;
            } else if (!this.f8706b.isEmpty()) {
                a peek = this.f8706b.peek();
                if (peek.d()) {
                    peek.dismiss();
                    this.f8706b.poll();
                } else {
                    if (!peek.b()) {
                        Message obtain = Message.obtain();
                        obtain.what = 291;
                        obtain.obj = peek;
                        sendMessage(obtain);
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    private b(Looper looper) {
        super(looper);
    }

    public final void a(final a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8704a, false, 2432, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8704a, false, 2432, new Class[]{a.class}, Void.TYPE);
        } else if (!aVar.b() || aVar.d()) {
            aVar.dismiss();
            this.f8707c = false;
            this.f8706b.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f8706b.contains(aVar)) {
            this.f8707c = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet a2 = aVar.a();
            a2.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8709a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.i = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f8709a, false, 2434, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f8709a, false, 2434, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    aVar.i = false;
                    aVar.dismiss();
                    b.this.f8707c = false;
                    b.this.removeMessages(1110);
                    b.this.sendEmptyMessage(1929);
                }
            });
            a2.start();
            this.f8706b.poll();
        }
    }

    public void handleMessage(Message message) {
        AnimatorSet animatorSet;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f8704a, false, 2431, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f8704a, false, 2431, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a aVar = (a) message2.obj;
        int i = message2.what;
        if (i == 291) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f8704a, false, 2433, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f8704a, false, 2433, new Class[]{a.class}, Void.TYPE);
            } else {
                if (!aVar.b()) {
                    aVar.c();
                    this.f8707c = true;
                    a aVar2 = aVar;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f8696a, false, 2415, new Class[0], AnimatorSet.class)) {
                        animatorSet = (AnimatorSet) PatchProxy.accessDispatch(new Object[0], aVar2, a.f8696a, false, 2415, new Class[0], AnimatorSet.class);
                    } else {
                        if (aVar2.f8700e == null) {
                            aVar2.f8700e = new AnimatorSet();
                            aVar2.f8700e.playTogether(new Animator[]{ObjectAnimator.ofFloat(aVar2.f8698c, "translationY", new float[]{(float) (-aVar2.o), 0.0f}), ObjectAnimator.ofFloat(aVar2.f8698c, "alpha", new float[]{0.0f, 1.0f})});
                            aVar2.f8700e.setInterpolator(new AccelerateDecelerateInterpolator());
                            aVar2.f8700e.setDuration(320);
                        }
                        animatorSet = aVar2.f8700e;
                    }
                    animatorSet.start();
                    Message obtain = Message.obtain();
                    obtain.what = 1110;
                    obtain.obj = aVar2;
                    sendMessageDelayed(obtain, aVar2.f8701f);
                }
            }
        } else if (i == 1110) {
            a(aVar);
        } else if (i == 1929) {
            b();
        }
    }
}
