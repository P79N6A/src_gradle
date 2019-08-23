package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.p;

public final class q extends v {

    /* renamed from: a  reason: collision with root package name */
    protected InsideNotificationItem f81518a;

    /* renamed from: b  reason: collision with root package name */
    private String f81519b;

    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    public final InsideNotificationItem d() {
        return this.f81518a;
    }

    public q() {
        super(4);
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.f81519b)) {
            return this.f81519b;
        }
        if (this.f81518a == null) {
            return null;
        }
        return p.b(this.f81518a);
    }

    public final void c(a aVar) {
        super.c(aVar);
        this.f81519b = p.b(this.f81518a);
        aVar.a("notification_v1", this.f81519b);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81519b = aVar.a("notification_v1");
        if (!TextUtils.isEmpty(this.f81519b)) {
            this.f81518a = p.a(this.f81519b);
            if (this.f81518a != null) {
                this.f81518a.setMsgId(f());
            }
        }
    }
}
