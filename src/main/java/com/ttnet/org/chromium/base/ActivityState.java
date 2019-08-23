package com.ttnet.org.chromium.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ActivityState {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityStateEnum {
    }
}
