package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7749a;
    @SerializedName("icon")

    /* renamed from: b  reason: collision with root package name */
    public ImageModel f7750b;
    @SerializedName("level")

    /* renamed from: c  reason: collision with root package name */
    public long f7751c;

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f7749a, false, 77, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7749a, false, 77, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f7750b != null) {
            i = this.f7750b.hashCode();
        }
        return (i * 31) + ((int) (this.f7751c ^ (this.f7751c >>> 32)));
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7749a, false, 76, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7749a, false, 76, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f7751c != dVar.f7751c) {
                return false;
            }
            if (this.f7750b != null) {
                return this.f7750b.equals(dVar.f7750b);
            }
            if (dVar.f7750b == null) {
                return true;
            }
            return false;
        }
    }
}
