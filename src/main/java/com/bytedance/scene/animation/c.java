package com.bytedance.scene.animation;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.scene.b.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f21995a;

    public abstract void a(@NonNull a aVar, @NonNull a aVar2, @NonNull Runnable runnable, @NonNull b bVar);

    public abstract void b(@NonNull a aVar, @NonNull a aVar2, @NonNull Runnable runnable, @NonNull b bVar);

    public static void a(@NonNull final View view, @NonNull b bVar, @NonNull final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
            AnonymousClass8 r7 = new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            };
            final ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
            final AnonymousClass8 r3 = r7;
            final View view2 = view;
            final Runnable runnable2 = runnable;
            AnonymousClass9 r1 = new b.a() {
                public final void a() {
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(r3);
                    } else {
                        view2.getViewTreeObserver().removeGlobalOnLayoutListener(r3);
                    }
                    atomicBoolean.set(false);
                    runnable2.run();
                }
            };
            bVar.a(r1);
            viewTreeObserver.addOnGlobalLayoutListener(r7);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }
}
