package com.bytedance.scene.animation.interaction.scenetransition.visiblity;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TargetApi(21)
public final class Slide extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final TimeInterpolator f22060c = new DecelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    private static final TimeInterpolator f22061d = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    private static final a f22062e = new b() {
    };

    /* renamed from: f  reason: collision with root package name */
    private static final a f22063f = new b() {
    };
    private static final a g = new c() {
    };
    private static final a h = new b() {
    };
    private static final a i = new b() {
    };
    private static final a j = new c() {
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    interface a {
    }

    static abstract class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    static abstract class c implements a {
        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }
}
