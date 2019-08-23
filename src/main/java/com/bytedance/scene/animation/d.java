package com.bytedance.scene.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.bytedance.scene.b.a;
import com.bytedance.scene.b.b;
import com.bytedance.scene.b.e;

public abstract class d extends c {
    /* access modifiers changed from: protected */
    @NonNull
    public abstract Animator a(a aVar, a aVar2);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract Animator b(a aVar, a aVar2);

    public final void a(@NonNull a aVar, @NonNull a aVar2, @NonNull Runnable runnable, @NonNull b bVar) {
        final a.C0228a aVar3;
        final a.C0228a aVar4;
        a aVar5 = aVar;
        a aVar6 = aVar2;
        View view = aVar5.f21987b;
        View view2 = aVar6.f21987b;
        if (aVar5.f21989d) {
            aVar3 = a.b(view);
        } else {
            a.a(view);
            aVar3 = null;
        }
        if (aVar6.f21989d) {
            aVar4 = a.b(view2);
        } else {
            a.a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        final float elevation = ViewCompat.getElevation(view);
        if (elevation > 0.0f) {
            ViewCompat.setElevation(view, 0.0f);
        }
        final Animator a2 = a(aVar, aVar2);
        if (!a()) {
            a2.setDuration(300);
        }
        final a aVar7 = aVar2;
        final View view3 = view;
        final a aVar8 = aVar;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        AnonymousClass1 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!aVar7.f21989d) {
                    view3.setVisibility(8);
                }
                if (elevation > 0.0f) {
                    ViewCompat.setElevation(view3, elevation);
                }
                if (aVar8.f21989d) {
                    a.a(view3, aVar3);
                } else {
                    a.a(view3);
                }
                if (aVar7.f21989d) {
                    a.a(view4, aVar4);
                } else {
                    a.a(view4);
                }
                runnable2.run();
            }
        };
        a2.addListener(r0);
        a2.addListener(new e(view));
        a2.addListener(new e(view2));
        a2.start();
        bVar.a(new b.a() {
            public final void a() {
                a2.end();
            }
        });
    }

    public final void b(@NonNull a aVar, @NonNull a aVar2, @NonNull Runnable runnable, @NonNull b bVar) {
        final a.C0228a aVar3;
        final a.C0228a aVar4;
        a aVar5 = aVar;
        a aVar6 = aVar2;
        View view = aVar5.f21987b;
        View view2 = aVar6.f21987b;
        if (aVar5.f21989d) {
            aVar3 = a.b(view);
        } else {
            a.a(view);
            aVar3 = null;
        }
        if (aVar6.f21989d) {
            aVar4 = a.b(view2);
        } else {
            a.a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f21995a.getOverlay().add(view);
        } else {
            this.f21995a.addView(view);
        }
        final Animator b2 = b(aVar, aVar2);
        if (!a()) {
            b2.setDuration(300);
        }
        final a aVar7 = aVar;
        final View view3 = view;
        final a aVar8 = aVar2;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        AnonymousClass3 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (aVar7.f21989d) {
                    a.a(view3, aVar3);
                } else {
                    a.a(view3);
                }
                if (aVar8.f21989d) {
                    a.a(view4, aVar4);
                } else {
                    a.a(view4);
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    d.this.f21995a.getOverlay().remove(view3);
                } else {
                    d.this.f21995a.removeView(view3);
                }
                runnable2.run();
            }
        };
        b2.addListener(r0);
        b2.addListener(new e(view));
        b2.addListener(new e(view2));
        b2.start();
        bVar.a(new b.a() {
            public final void a() {
                b2.end();
            }
        });
    }
}
