package com.huawei.android.pushagent.a.b;

import com.huawei.android.pushagent.utils.a;
import java.io.Serializable;

public class g implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private long f24962a;

    /* renamed from: b  reason: collision with root package name */
    private byte f24963b;

    /* renamed from: c  reason: collision with root package name */
    private byte f24964c;

    public long a() {
        return this.f24962a;
    }

    public void a(byte b2) {
        this.f24963b = b2;
    }

    public void a(long j) {
        this.f24962a = j;
    }

    public byte b() {
        return this.f24963b;
    }

    public void b(byte b2) {
        this.f24964c = b2;
    }

    public byte c() {
        return this.f24964c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getSimpleName());
        stringBuffer.append(" netEventTime:");
        stringBuffer.append(a.a(this.f24962a, "yyyy-MM-dd HH:mm:ss SSS"));
        stringBuffer.append(" netType:");
        stringBuffer.append(this.f24963b);
        stringBuffer.append(" netEvent:");
        stringBuffer.append(this.f24964c);
        return stringBuffer.toString();
    }
}
