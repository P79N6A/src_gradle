package com.tencent.wxop.stat.b;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import com.tencent.wxop.stat.a.s;
import com.tencent.wxop.stat.h;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private String f79868a;

    /* renamed from: b  reason: collision with root package name */
    private int f79869b;
    private int o = 100;
    private Thread p;

    public d(Context context, int i, int i2, Throwable th, h hVar) {
        super(context, i, hVar);
        a(99, th);
    }

    public d(Context context, int i, int i2, Throwable th, Thread thread, h hVar) {
        super(context, i, null);
        a(2, th);
        this.p = thread;
    }

    private void a(int i, Throwable th) {
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a.a(th, printWriter);
            this.f79868a = stringWriter.toString();
            this.f79869b = i;
            printWriter.close();
        }
    }

    public final a a() {
        return a.ERROR;
    }

    public final boolean a(JSONObject jSONObject) {
        s.a(jSONObject, "er", this.f79868a);
        jSONObject.put("ea", this.f79869b);
        if (this.f79869b == 2 || this.f79869b == 3) {
            new com.tencent.wxop.stat.a.d(this.m).a(jSONObject, this.p);
        }
        return true;
    }
}
