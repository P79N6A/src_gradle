package com.bytedance.android.live.base.model.user;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7761a;
    @SerializedName("following_count")

    /* renamed from: b  reason: collision with root package name */
    public long f7762b;
    @SerializedName("follower_count")

    /* renamed from: c  reason: collision with root package name */
    public long f7763c;
    @SerializedName("follow_status")

    /* renamed from: d  reason: collision with root package name */
    public long f7764d;

    public final int hashCode() {
        return (((((int) (this.f7762b ^ (this.f7762b >>> 32))) * 31) + ((int) (this.f7763c ^ (this.f7763c >>> 32)))) * 31) + ((int) (this.f7764d ^ (this.f7764d >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7761a, false, 94, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7761a, false, 94, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f7762b == gVar.f7762b && this.f7763c == gVar.f7763c && this.f7764d == gVar.f7764d) {
                return true;
            }
            return false;
        }
    }
}
