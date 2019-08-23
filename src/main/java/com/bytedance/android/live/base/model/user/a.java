package com.bytedance.android.live.base.model.user;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7737a;
    @SerializedName("level")

    /* renamed from: b  reason: collision with root package name */
    public long f7738b;
    @SerializedName("type")

    /* renamed from: c  reason: collision with root package name */
    public long f7739c;

    public final int hashCode() {
        return (((int) (this.f7738b ^ (this.f7738b >>> 32))) * 31) + ((int) (this.f7739c ^ (this.f7739c >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7737a, false, 71, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7737a, false, 71, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7738b == aVar.f7738b && this.f7739c == aVar.f7739c) {
                return true;
            }
            return false;
        }
    }
}
