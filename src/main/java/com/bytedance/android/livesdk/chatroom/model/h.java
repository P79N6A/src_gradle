package com.bytedance.android.livesdk.chatroom.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11119a;
    @SerializedName("enable_live_audio")

    /* renamed from: b  reason: collision with root package name */
    public boolean f11120b;
    @SerializedName("enable_live_third_party")

    /* renamed from: c  reason: collision with root package name */
    public boolean f11121c;
    @SerializedName("enable_live_screenshot")

    /* renamed from: d  reason: collision with root package name */
    public boolean f11122d;
    @SerializedName("toast")

    /* renamed from: e  reason: collision with root package name */
    public a f11123e;

    public static class a {
        @SerializedName("new_anchor")

        /* renamed from: a  reason: collision with root package name */
        public boolean f11124a;
    }

    public h() {
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f11119a, false, 5114, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11119a, false, 5114, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f11120b == hVar.f11120b && this.f11121c == hVar.f11121c && this.f11122d == hVar.f11122d) {
            return true;
        }
        return false;
    }

    public h(boolean z, boolean z2, boolean z3) {
        this.f11120b = z;
        this.f11121c = z2;
        this.f11122d = z3;
    }
}
