package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.fo;
import com.xiaomi.push.ip;
import com.xiaomi.push.service.ag;

public final class r extends ag.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81806a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(int i, String str, Context context) {
        super(i, str);
        this.f81806a = context;
    }

    public final void a() {
        fo.a(this.f81806a).a(ag.a(this.f81806a).a(ip.AwakeInfoUploadWaySwitch.a(), 0));
    }
}
