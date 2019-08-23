package com.ss.android.ugc.aweme.antiaddic.lock.entity;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/entity/TeenageModeSetting;", "Ljava/io/Serializable;", "isMinor", "", "minorControlType", "", "isTeenageModeSelf", "timeLockSelfInMin", "(ZIZI)V", "()Z", "setMinor", "(Z)V", "setTeenageModeSelf", "getMinorControlType", "()I", "setMinorControlType", "(I)V", "getTimeLockSelfInMin", "setTimeLockSelfInMin", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TeenageModeSetting implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isMinor;
    private boolean isTeenageModeSelf;
    private int minorControlType;
    private int timeLockSelfInMin;

    public final int getMinorControlType() {
        return this.minorControlType;
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final boolean isMinor() {
        return this.isMinor;
    }

    public final boolean isTeenageModeSelf() {
        return this.isTeenageModeSelf;
    }

    public final void setMinor(boolean z) {
        this.isMinor = z;
    }

    public final void setMinorControlType(int i) {
        this.minorControlType = i;
    }

    public final void setTeenageModeSelf(boolean z) {
        this.isTeenageModeSelf = z;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.timeLockSelfInMin = i;
    }

    public TeenageModeSetting(boolean z, int i, boolean z2, int i2) {
        this.isMinor = z;
        this.minorControlType = i;
        this.isTeenageModeSelf = z2;
        this.timeLockSelfInMin = i2;
    }
}
