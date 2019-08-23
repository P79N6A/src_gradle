package com.ss.android.ugc.aweme.account.bean;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/account/bean/AgeGateResponse;", "Ljava/io/Serializable;", "status_code", "", "status_msg", "", "is_eligible", "", "is_prompt", "(ILjava/lang/String;ZZ)V", "()Z", "getStatus_code", "()I", "getStatus_msg", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public final class AgeGateResponse implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean is_eligible;
    private final boolean is_prompt;
    private final int status_code;
    @NotNull
    private final String status_msg;

    @SuppressLint({"SerializableImplementsRule"})
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/account/bean/AgeGateResponse$Companion;", "", "()V", "DISABLE_AGE_GATE_TRUE", "", "accountapi_release"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, int i, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ageGateResponse.status_code;
        }
        if ((i2 & 2) != 0) {
            str = ageGateResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            z = ageGateResponse.is_eligible;
        }
        if ((i2 & 8) != 0) {
            z2 = ageGateResponse.is_prompt;
        }
        return ageGateResponse.copy(i, str, z, z2);
    }

    public final int component1() {
        return this.status_code;
    }

    @NotNull
    public final String component2() {
        return this.status_msg;
    }

    public final boolean component3() {
        return this.is_eligible;
    }

    public final boolean component4() {
        return this.is_prompt;
    }

    @NotNull
    public final AgeGateResponse copy(int i, @NotNull String str, boolean z, boolean z2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19826, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, AgeGateResponse.class)) {
            return (AgeGateResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 19826, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, AgeGateResponse.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "status_msg");
        return new AgeGateResponse(i, str2, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 19829, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 19829, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof AgeGateResponse) {
                AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
                if ((this.status_code == ageGateResponse.status_code) && Intrinsics.areEqual((Object) this.status_msg, (Object) ageGateResponse.status_msg)) {
                    if (this.is_eligible == ageGateResponse.is_eligible) {
                        if (this.is_prompt == ageGateResponse.is_prompt) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19828, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19828, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.status_code * 31;
        String str = this.status_msg;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.is_eligible;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.is_prompt;
        if (z2) {
            z2 = true;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19827, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19827, new Class[0], String.class);
        }
        return "AgeGateResponse(status_code=" + this.status_code + ", status_msg=" + this.status_msg + ", is_eligible=" + this.is_eligible + ", is_prompt=" + this.is_prompt + ")";
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @NotNull
    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final boolean is_eligible() {
        return this.is_eligible;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public AgeGateResponse(int i, @NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "status_msg");
        this.status_code = i;
        this.status_msg = str;
        this.is_eligible = z;
        this.is_prompt = z2;
    }
}
