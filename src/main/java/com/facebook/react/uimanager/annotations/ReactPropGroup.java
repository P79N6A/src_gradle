package com.facebook.react.uimanager.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nullable;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReactPropGroup {
    @Nullable
    String customType() default "__default_type__";

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String[] names();
}
