package com.bytedance.android.livesdk.chatroom.model.a;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11048a;

    /* renamed from: b  reason: collision with root package name */
    public int f11049b;
    @SerializedName("fan_ticket")

    /* renamed from: c  reason: collision with root package name */
    public long f11050c;
    @SerializedName("linkmic_id")

    /* renamed from: d  reason: collision with root package name */
    public int f11051d;
    @SerializedName("user")

    /* renamed from: e  reason: collision with root package name */
    public User f11052e;
    @SerializedName("modify_time")

    /* renamed from: f  reason: collision with root package name */
    public long f11053f;
    @SerializedName("link_status")
    public int g;
    @SerializedName("link_type")
    public int h;
    @SerializedName("role_type")
    public int i;
    @SerializedName("payed_money")
    public int j;
    @SerializedName("link_duration")
    public int k;
    @SerializedName("user_position")
    public int l;
    @SerializedName("silence_status")
    public int m;
    @IgnoreStyleCheck
    public boolean n;
    @IgnoreStyleCheck
    public boolean o;

    public final void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f11048a, false, 5125, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f11048a, false, 5125, new Class[]{j.class}, Void.TYPE);
        } else if (jVar != null && this.f11052e.getId() == jVar.f11052e.getId()) {
            if (jVar.f11050c > this.f11050c) {
                this.f11050c = jVar.f11050c;
            }
            this.f11051d = jVar.f11051d;
            this.f11052e = jVar.f11052e;
            if (jVar.f11053f > this.f11053f) {
                this.f11053f = jVar.f11053f;
            }
            this.g = jVar.g;
            this.h = jVar.h;
            this.i = jVar.i;
            this.j = jVar.j;
        }
    }
}
