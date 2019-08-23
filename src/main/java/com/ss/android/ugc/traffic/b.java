package com.ss.android.ugc.traffic;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/traffic/UsageConfig;", "", "size", "", "isOn", "", "(IZ)V", "()Z", "setOn", "(Z)V", "getSize", "()I", "setSize", "(I)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "traffic_release"}, k = 1, mv = {1, 1, 15})
public final class b {
    @SerializedName("size")

    /* renamed from: a  reason: collision with root package name */
    public int f77815a;
    @SerializedName("isOn")

    /* renamed from: b  reason: collision with root package name */
    public boolean f77816b;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f77815a == bVar.f77815a) {
                    if (this.f77816b == bVar.f77816b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f77815a * 31;
        boolean z = this.f77816b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        return "UsageConfig(size=" + this.f77815a + ", isOn=" + this.f77816b + ")";
    }
}
