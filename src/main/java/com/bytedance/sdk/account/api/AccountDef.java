package com.bytedance.sdk.account.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface AccountDef {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SendCodeCheckRegisterDef {
    }
}
