package com.ss.android.ugc.aweme.services;

import android.app.Application;
import android.support.annotation.Keep;

@Keep
public interface IAVInitializer {
    void initialize(Application application);
}
