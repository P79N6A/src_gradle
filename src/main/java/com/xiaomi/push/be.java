package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.processor.d;

public class be implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f81858a;

    /* renamed from: a  reason: collision with other field name */
    private d f172a;

    public be(Context context, d dVar) {
        this.f81858a = context;
        this.f172a = dVar;
    }

    public void run() {
        try {
            if (this.f172a != null) {
                this.f172a.b();
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }
}
