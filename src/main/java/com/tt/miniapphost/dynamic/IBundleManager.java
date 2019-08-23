package com.tt.miniapphost.dynamic;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;

public interface IBundleManager {
    @Nullable
    @AnyProcess
    DisableStateEntity checkMiniAppDisableState(Context context, int i);

    @AnyProcess
    void checkUpdateBaseBundle(@NonNull Context context, boolean z);

    IBaseBundleManager getBaseBundleManager();

    boolean handleTmaTest(Context context, Uri uri);

    @AnyProcess
    boolean isMiniAppReady();

    @AnyProcess
    boolean isSDKSupport(Context context, int i);

    @AnyThread
    @AnyProcess
    void updateDeviceSupportability(Context context);
}
