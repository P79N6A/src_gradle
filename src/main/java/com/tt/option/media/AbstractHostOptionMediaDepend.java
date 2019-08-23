package com.tt.option.media;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.entity.ChooseImageResultEntity;
import com.tt.miniapphost.entity.ChooseVideoResultEntity;
import com.tt.miniapphost.entity.ScanResultEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.media.HostOptionMediaDepend;

@AnyProcess
public class AbstractHostOptionMediaDepend extends BaseAbstractHostDepend<HostOptionMediaDepend> implements HostOptionMediaDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionMediaDependImpl";
    }

    @Nullable
    @AnyProcess
    public IFileChooseHandler createChooseFileHandler(Activity activity) {
        if (inject()) {
            return ((HostOptionMediaDepend) this.defaultOptionDepend).createChooseFileHandler(activity);
        }
        return null;
    }

    public boolean scanCode(@NonNull Activity activity, @NonNull HostOptionMediaDepend.ExtendScanCodeCallBack extendScanCodeCallBack) {
        if (inject()) {
            return ((HostOptionMediaDepend) this.defaultOptionDepend).scanCode(activity, extendScanCodeCallBack);
        }
        return false;
    }

    @AnyProcess
    @NonNull
    public ChooseImageResultEntity handleActivityImageResult(int i, int i2, Intent intent) {
        if (inject()) {
            return ((HostOptionMediaDepend) this.defaultOptionDepend).handleActivityImageResult(i, i2, intent);
        }
        return new ChooseImageResultEntity();
    }

    @NonNull
    public ScanResultEntity handleActivityScanResult(int i, int i2, Intent intent) {
        if (inject()) {
            return ((HostOptionMediaDepend) this.defaultOptionDepend).handleActivityScanResult(i, i2, intent);
        }
        return new ScanResultEntity();
    }

    @AnyProcess
    @NonNull
    public ChooseVideoResultEntity handleActivityVideoResult(int i, int i2, Intent intent) {
        if (inject()) {
            return ((HostOptionMediaDepend) this.defaultOptionDepend).handleActivityVideoResult(i, i2, intent);
        }
        return new ChooseVideoResultEntity();
    }

    @AnyProcess
    public void chooseImage(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str) {
        if (inject()) {
            ((HostOptionMediaDepend) this.defaultOptionDepend).chooseImage(activity, i, z, z2, str);
        }
    }

    @AnyProcess
    public void chooseVideo(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str) {
        if (inject()) {
            ((HostOptionMediaDepend) this.defaultOptionDepend).chooseVideo(activity, i, z, z2, str);
        }
    }
}
