package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7765a;
    @SerializedName("level_str")

    /* renamed from: b  reason: collision with root package name */
    public String f7766b;
    @SerializedName("icon_diamond")

    /* renamed from: c  reason: collision with root package name */
    public int f7767c;
    @SerializedName("icon")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f7768d;
    @SerializedName("level")

    /* renamed from: e  reason: collision with root package name */
    public int f7769e;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f7765a, false, 96, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7765a, false, 96, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f7766b != null) {
            i = this.f7766b.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.f7767c) * 31;
        if (this.f7768d != null) {
            i2 = this.f7768d.hashCode();
        }
        return ((i3 + i2) * 31) + this.f7769e;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7765a, false, 95, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7765a, false, 95, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            h hVar = (h) obj;
            if (this.f7767c != hVar.f7767c || this.f7769e != hVar.f7769e) {
                return false;
            }
            if (this.f7766b == null ? hVar.f7766b != null : !this.f7766b.equals(hVar.f7766b)) {
                return false;
            }
            if (this.f7768d != null) {
                return this.f7768d.equals(hVar.f7768d);
            }
            if (hVar.f7768d == null) {
                return true;
            }
            return false;
        }
    }
}
