package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;

public class cw extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ cv f81920a;

    cw(cv cvVar) {
        this.f81920a = cvVar;
    }

    public int a() {
        return 10052;
    }

    public void run() {
        b.c("exec== mUploadJob");
        if (cv.a(this.f81920a) != null) {
            cv.a(this.f81920a).a(cv.a(this.f81920a));
            this.f81920a.b("upload_time");
        }
    }
}
