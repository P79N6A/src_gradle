package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.y;

public final class p extends y {

    /* renamed from: a  reason: collision with root package name */
    private String f81515a;

    /* renamed from: b  reason: collision with root package name */
    private long f81516b;

    /* renamed from: c  reason: collision with root package name */
    private InsideNotificationItem f81517c;

    public final String toString() {
        return "OnNotificationClickCommand";
    }

    public final String d() {
        return this.f81515a;
    }

    public final long e() {
        return this.f81516b;
    }

    public final InsideNotificationItem f() {
        return this.f81517c;
    }

    public p() {
        super(5);
    }

    public final void c(a aVar) {
        aVar.a("package_name", this.f81515a);
        aVar.a("notify_id", this.f81516b);
        aVar.a("notification_v1", com.vivo.push.util.p.b(this.f81517c));
    }

    public final void d(a aVar) {
        this.f81515a = aVar.a("package_name");
        this.f81516b = aVar.b("notify_id", -1);
        String a2 = aVar.a("notification_v1");
        if (!TextUtils.isEmpty(a2)) {
            this.f81517c = com.vivo.push.util.p.a(a2);
        }
        if (this.f81517c != null) {
            this.f81517c.setMsgId(this.f81516b);
        }
    }

    public p(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f81515a = str;
        this.f81516b = j;
        this.f81517c = insideNotificationItem;
    }
}
