package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.at;
import com.xiaomi.push.service.as;

public class ba extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ay f81772a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ba(ay ayVar, Handler handler) {
        super(handler);
        this.f81772a = ayVar;
    }

    public void onChange(boolean z) {
        Integer unused = this.f81772a.f108a = Integer.valueOf(as.a(ay.a(this.f81772a)).a());
        if (ay.a(this.f81772a).intValue() != 0) {
            ay.a(this.f81772a).getContentResolver().unregisterContentObserver(this);
            if (at.b(ay.a(this.f81772a))) {
                this.f81772a.c();
            }
        }
    }
}
