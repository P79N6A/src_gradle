package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.clientreport.processor.c;

public class bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f81857a;

    /* renamed from: a  reason: collision with other field name */
    private c f171a;

    public void a(Context context) {
        this.f81857a = context;
    }

    public void a(c cVar) {
        this.f171a = cVar;
    }

    public void run() {
        try {
            if (this.f171a != null) {
                this.f171a.a();
            }
            b.c("begin read and send perf / event");
            if (this.f171a instanceof IEventProcessor) {
                bi.a(this.f81857a).a("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (this.f171a instanceof IPerfProcessor) {
                bi.a(this.f81857a).a("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }
}
