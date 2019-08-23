package com.tt.miniapphost.entity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class ScanResultEntity {
    @Nullable
    private String result;
    @NonNull
    private String scanType;
    private boolean shouldHandle;

    @Nullable
    @AnyProcess
    public String getResult() {
        return this.result;
    }

    @AnyProcess
    @NonNull
    public String getScanType() {
        return this.scanType;
    }

    @AnyProcess
    public boolean isShouldHandle() {
        return this.shouldHandle;
    }

    @AnyProcess
    public void setResult(@Nullable String str) {
        this.result = str;
    }

    @AnyProcess
    public void setScanType(@NonNull String str) {
        this.scanType = str;
    }

    @AnyProcess
    public void setShouldHandle(boolean z) {
        this.shouldHandle = z;
    }
}
