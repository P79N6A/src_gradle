package com.ss.android.ugc.aweme.antiaddic.lock.entity;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import java.io.Serializable;

@Keep
public class TimeLockUserSetting implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isContentFilterOn;
    private boolean isContentFilterOnV2;
    private transient boolean isNotifyParentModeOnly;
    private boolean isTimeLockOn;
    private long lastSetTime;
    private int lockTimeInMin = 120;
    private String password;
    private String userId;

    public long getLastSetTime() {
        return this.lastSetTime;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isNotifyParentModeOnly() {
        return this.isNotifyParentModeOnly;
    }

    public boolean isTimeLockOn() {
        return this.isTimeLockOn;
    }

    public int getLockTimeInMin() {
        if (this.lockTimeInMin <= 30) {
            return 40;
        }
        return this.lockTimeInMin;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21846, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21846, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.userId != null) {
            i = this.userId.hashCode();
        }
        return i;
    }

    public boolean isContentFilterOn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21843, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21843, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.a()) {
            return this.isContentFilterOn;
        } else {
            return this.isContentFilterOnV2;
        }
    }

    public String toString() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21847, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21847, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder("TimeLockUserSetting{userId='");
        sb.append(this.userId);
        sb.append('\'');
        sb.append(", lastSetTime=");
        sb.append(this.lastSetTime);
        sb.append(", password='");
        sb.append(this.password);
        sb.append('\'');
        sb.append(", isTimeLockOn=");
        sb.append(this.isTimeLockOn);
        sb.append(", isContentFilterOn=");
        if (a.a()) {
            z = this.isContentFilterOn;
        } else {
            z = this.isContentFilterOnV2;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public void setLastSetTime(long j) {
        this.lastSetTime = j;
    }

    public void setLockTimeInMin(int i) {
        this.lockTimeInMin = i;
    }

    public void setNotifyParentModeOnly(boolean z) {
        this.isNotifyParentModeOnly = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setTimeLockOn(boolean z) {
        this.isTimeLockOn = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 21845, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 21845, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TimeLockUserSetting timeLockUserSetting = (TimeLockUserSetting) obj;
            if (this.userId != null) {
                return this.userId.equals(timeLockUserSetting.userId);
            }
            if (timeLockUserSetting.userId == null) {
                return true;
            }
            return false;
        }
    }

    public void setContentFilterOn(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 21844, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 21844, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (a.a()) {
            this.isContentFilterOn = z;
        } else {
            this.isContentFilterOnV2 = z;
        }
    }
}
