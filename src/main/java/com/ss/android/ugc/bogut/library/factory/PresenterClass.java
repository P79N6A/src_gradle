package com.ss.android.ugc.bogut.library.factory;

import com.ss.android.ugc.bogut.library.a.a;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface PresenterClass {
    Class<? extends a> a();
}
