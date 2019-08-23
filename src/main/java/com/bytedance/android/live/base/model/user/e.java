package com.bytedance.android.live.base.model.user;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7752a;
    @SerializedName("filter_risk_content")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7753b;
    @SerializedName("time_lock")

    /* renamed from: c  reason: collision with root package name */
    public boolean f7754c;
    @SerializedName("forbid_create_room")

    /* renamed from: d  reason: collision with root package name */
    public boolean f7755d;
    @SerializedName("forbid_wallet_functions")

    /* renamed from: e  reason: collision with root package name */
    public boolean f7756e;
    @SerializedName("password_status")

    /* renamed from: f  reason: collision with root package name */
    public int f7757f;

    public final int hashCode() {
        return ((((((((this.f7753b ? 1 : 0) * true) + (this.f7754c ? 1 : 0)) * 31) + (this.f7755d ? 1 : 0)) * 31) + (this.f7756e ? 1 : 0)) * 31) + this.f7757f;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7752a, false, 78, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7752a, false, 78, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f7753b == eVar.f7753b && this.f7754c == eVar.f7754c && this.f7755d == eVar.f7755d && this.f7756e == eVar.f7756e && this.f7757f == eVar.f7757f) {
                return true;
            }
            return false;
        }
    }
}
