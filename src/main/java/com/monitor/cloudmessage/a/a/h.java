package com.monitor.cloudmessage.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.monitor.cloudmessage.b.b.a.c;
import com.monitor.cloudmessage.callback.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

public final class h extends com.monitor.cloudmessage.a.a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    public f f27320a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentLinkedQueue<a> f27321b = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    public a f27322c = new a("error_data", "error_ids");

    /* renamed from: d  reason: collision with root package name */
    private File f27323d;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27325a;

        /* renamed from: b  reason: collision with root package name */
        public String f27326b;

        public a(String str, String str2) {
            this.f27325a = str;
            this.f27326b = str2;
        }
    }

    public final String a() {
        return "monitor_log";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList();
        if (this.f27323d != null) {
            arrayList.add(this.f27323d.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        int i;
        int i2;
        String[] strArr;
        String str;
        com.monitor.cloudmessage.entity.a aVar2 = aVar;
        JSONObject jSONObject = new JSONObject(aVar2.f27359a);
        if (this.f27320a == null) {
            return false;
        }
        if (a(jSONObject, aVar2)) {
            return true;
        }
        long optLong = jSONObject.optLong("fetch_start_time", (System.currentTimeMillis() / 1000) - 18000);
        long optLong2 = jSONObject.optLong("fetch_end_time", System.currentTimeMillis() / 1000);
        String[] b2 = this.f27320a.b(jSONObject);
        if (b2.length > 0) {
            int length = b2.length;
            boolean z = false;
            boolean z2 = false;
            int i3 = 0;
            while (i3 < length) {
                String str2 = b2[i3];
                boolean z3 = z;
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i5 <= 100) {
                        if (!this.f27321b.isEmpty()) {
                            a poll = this.f27321b.poll();
                            if (poll != this.f27322c) {
                                com.monitor.cloudmessage.a.a();
                                Context b3 = com.monitor.cloudmessage.a.b();
                                String str3 = poll.f27325a;
                                this.f27323d = c.a(b3, str3, "cloudMessage_" + str2);
                                if (this.f27323d == null) {
                                    i = i3;
                                    i2 = length;
                                    strArr = b2;
                                    this.f27321b.clear();
                                    z = false;
                                    break;
                                }
                                if ("block_monitor".equals(str2)) {
                                    str = "log_exception";
                                } else {
                                    str = "log_performance";
                                }
                                String str4 = str2;
                                com.monitor.cloudmessage.d.b.a aVar3 = new com.monitor.cloudmessage.d.b.a(str, 0, false, aVar2.f27362d, this, null);
                                aVar3.l = 1;
                                aVar3.g = true;
                                com.monitor.cloudmessage.d.a.a(aVar3);
                                this.f27320a.a(str4, poll.f27326b);
                                Thread.sleep(100);
                                str2 = str4;
                                i3 = i3;
                                length = length;
                                i4 = i5;
                                b2 = b2;
                                z2 = false;
                                z3 = true;
                            } else {
                                this.f27321b.clear();
                                z = z3;
                                i = i3;
                                i2 = length;
                                strArr = b2;
                                break;
                            }
                        } else if (!z2) {
                            this.f27320a.a(optLong, optLong2, str2, new com.bytedance.services.apm.api.f() {
                                public final void a(String str, String str2) {
                                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                                        h.this.f27321b.offer(h.this.f27322c);
                                    } else {
                                        h.this.f27321b.offer(new a(str, str2));
                                    }
                                }
                            });
                            i4 = i5;
                            z2 = true;
                        } else {
                            i4 = i5;
                        }
                    } else {
                        i = i3;
                        i2 = length;
                        strArr = b2;
                        z = z3;
                        break;
                    }
                }
                z2 = false;
                i3 = i + 1;
                length = i2;
                b2 = strArr;
            }
            if (z) {
                b(aVar);
            } else {
                a("Monitor日志查询为空", aVar2);
            }
        }
        return true;
    }
}
