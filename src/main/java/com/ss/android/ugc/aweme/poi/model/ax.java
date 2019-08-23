package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiUploadImageResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "isSuc", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ax extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59901a;
    @SerializedName("is_suc")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f59902b;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ax) {
                if (this.f59902b == ((ax) obj).f59902b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59902b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f59901a, false, 65176, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59901a, false, 65176, new Class[0], String.class);
        }
        return "PoiUploadImageResponse(isSuc=" + this.f59902b + ")";
    }
}
