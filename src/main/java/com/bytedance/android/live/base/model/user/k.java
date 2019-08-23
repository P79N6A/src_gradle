package com.bytedance.android.live.base.model.user;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7772a;
    @SerializedName("is_muted")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7773b;
    @SerializedName("is_admin")

    /* renamed from: c  reason: collision with root package name */
    public boolean f7774c;
    @SerializedName("is_super_admin")

    /* renamed from: d  reason: collision with root package name */
    public boolean f7775d;

    public int hashCode() {
        return ((this.f7773b ? 1 : 0) * true) + (this.f7774c ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7772a, false, 121, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7772a, false, 121, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            if (this.f7773b == kVar.f7773b && this.f7774c == kVar.f7774c) {
                return true;
            }
            return false;
        }
    }
}
