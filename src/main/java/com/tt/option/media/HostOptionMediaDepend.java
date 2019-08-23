package com.tt.option.media;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.entity.ChooseImageResultEntity;
import com.tt.miniapphost.entity.ChooseVideoResultEntity;
import com.tt.miniapphost.entity.ScanResultEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface HostOptionMediaDepend {

    @AnyProcess
    public interface ExtendScanCodeCallBack {
        @AnyProcess
        void onScanResult(@Nullable String str, @Nullable String str2);
    }

    @AnyProcess
    void chooseImage(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str);

    @AnyProcess
    void chooseVideo(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str);

    @Nullable
    @AnyProcess
    IFileChooseHandler createChooseFileHandler(Activity activity);

    @AnyProcess
    @NonNull
    ChooseImageResultEntity handleActivityImageResult(int i, int i2, Intent intent);

    @AnyProcess
    @NonNull
    ScanResultEntity handleActivityScanResult(int i, int i2, Intent intent);

    @AnyProcess
    @NonNull
    ChooseVideoResultEntity handleActivityVideoResult(int i, int i2, Intent intent);

    @AnyProcess
    boolean scanCode(@NonNull Activity activity, @NonNull ExtendScanCodeCallBack extendScanCodeCallBack);
}
