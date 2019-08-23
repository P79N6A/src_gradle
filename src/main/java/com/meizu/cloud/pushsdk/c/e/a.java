package com.meizu.cloud.pushsdk.c.e;

import android.content.Context;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.f.c;
import com.meizu.cloud.pushsdk.c.f.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f27155a = "a";

    /* renamed from: b  reason: collision with root package name */
    private String f27156b;

    /* renamed from: c  reason: collision with root package name */
    private String f27157c;

    /* renamed from: d  reason: collision with root package name */
    private String f27158d;

    /* renamed from: e  reason: collision with root package name */
    private int f27159e;

    /* renamed from: f  reason: collision with root package name */
    private String f27160f = "SQLITE";
    private AtomicBoolean g = new AtomicBoolean(false);
    private long h;
    private long i;
    private long j;
    private Context k;

    public a(long j2, long j3, TimeUnit timeUnit, Context context) {
        this.i = timeUnit.toMillis(j2);
        this.j = timeUnit.toMillis(j3);
        this.k = context;
        Map f2 = f();
        if (f2 != null) {
            try {
                String obj = f2.get("userId").toString();
                String obj2 = f2.get("sessionId").toString();
                int intValue = ((Integer) f2.get("sessionIndex")).intValue();
                this.f27156b = obj;
                this.f27159e = intValue;
                this.f27157c = obj2;
            } catch (Exception e2) {
                c.a(f27155a, "Exception occurred retrieving session info from file: %s", e2.getMessage());
            }
            d();
            g();
            c.c(f27155a, "Tracker Session Object created.", new Object[0]);
        }
        this.f27156b = e.b();
        d();
        g();
        c.c(f27155a, "Tracker Session Object created.", new Object[0]);
    }

    private void d() {
        this.f27158d = this.f27157c;
        this.f27157c = e.b();
        this.f27159e++;
        c.b(f27155a, "Session information is updated:", new Object[0]);
        c.b(f27155a, " + Session ID: %s", this.f27157c);
        c.b(f27155a, " + Previous Session ID: %s", this.f27158d);
        c.b(f27155a, " + Session Index: %s", Integer.valueOf(this.f27159e));
        e();
    }

    private boolean e() {
        return com.meizu.cloud.pushsdk.c.f.a.a("snowplow_session_vars", c(), this.k);
    }

    private Map f() {
        return com.meizu.cloud.pushsdk.c.f.a.a("snowplow_session_vars", this.k);
    }

    private void g() {
        this.h = System.currentTimeMillis();
    }

    public b a() {
        c.c(f27155a, "Getting session context...", new Object[0]);
        g();
        return new b("client_session", c());
    }

    public void b() {
        c.b(f27155a, "Checking and updating session information.", new Object[0]);
        if (!e.a(this.h, System.currentTimeMillis(), this.g.get() ? this.j : this.i)) {
            d();
            g();
        }
    }

    public Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("userId", this.f27156b);
        hashMap.put("sessionId", this.f27157c);
        hashMap.put("previousSessionId", this.f27158d);
        hashMap.put("sessionIndex", Integer.valueOf(this.f27159e));
        hashMap.put("storageMechanism", this.f27160f);
        return hashMap;
    }
}
