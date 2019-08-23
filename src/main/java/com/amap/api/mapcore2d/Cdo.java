package com.amap.api.mapcore2d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.amap.api.mapcore2d.do  reason: invalid class name */
public @interface Cdo {
    String a();

    int b();
}
