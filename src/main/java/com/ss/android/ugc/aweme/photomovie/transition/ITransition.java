package com.ss.android.ugc.aweme.photomovie.transition;

import android.support.annotation.FloatRange;

public interface ITransition {

    public @interface State {
    }

    void a();

    void a(@FloatRange(from = 0.0d, to = 1.0d) float f2, int i, int i2);

    void b();

    void b(@FloatRange(from = 0.0d, to = 1.0d) float f2, int i, int i2);

    void c();

    void d();
}
