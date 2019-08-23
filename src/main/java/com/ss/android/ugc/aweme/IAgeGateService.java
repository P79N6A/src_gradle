package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

@Keep
public interface IAgeGateService {
    boolean disableFtcAgeGate();

    IAgeGateService keepCallback();

    boolean showFTCAgeGateForCurrentUser(@NonNull Activity activity, @Nullable l lVar);

    void syncAgeGateInfo();
}
