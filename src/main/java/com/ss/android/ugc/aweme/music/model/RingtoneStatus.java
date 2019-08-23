package com.ss.android.ugc.aweme.music.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/music/model/RingtoneStatus;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "action", "", "(I)V", "getAction", "()I", "setAction", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RingtoneStatus extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    public int action;

    public RingtoneStatus() {
        this(0, 1, null);
    }

    public static /* synthetic */ RingtoneStatus copy$default(RingtoneStatus ringtoneStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ringtoneStatus.action;
        }
        return ringtoneStatus.copy(i);
    }

    @NotNull
    public final RingtoneStatus copy(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 60014, new Class[]{Integer.TYPE}, RingtoneStatus.class)) {
            return new RingtoneStatus(i);
        }
        return (RingtoneStatus) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 60014, new Class[]{Integer.TYPE}, RingtoneStatus.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof RingtoneStatus) {
                if (this.action == ((RingtoneStatus) obj).action) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.action;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60015, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60015, new Class[0], String.class);
        }
        return "RingtoneStatus(action=" + this.action + ")";
    }

    public RingtoneStatus(int i) {
        this.action = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RingtoneStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
