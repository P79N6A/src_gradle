package com.huawei.android.pushagent.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f24940a;

    /* renamed from: b  reason: collision with root package name */
    public Object f24941b;

    /* renamed from: c  reason: collision with root package name */
    public Class f24942c;

    public a() {
    }

    public a(String str, Class cls, Object obj) {
        this.f24940a = str;
        this.f24942c = cls;
        this.f24941b = obj;
    }

    public a(String str, Class cls, String str2) {
        this.f24940a = str;
        this.f24942c = cls;
        a(str2);
    }

    public void a(String str) {
        if (String.class == this.f24942c) {
            this.f24941b = str;
        } else {
            this.f24941b = Integer.class == this.f24942c ? Integer.valueOf(Integer.parseInt(str)) : Long.class == this.f24942c ? Long.valueOf(Long.parseLong(str)) : Boolean.class == this.f24942c ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f24940a);
        stringBuffer.append(":");
        stringBuffer.append(this.f24941b);
        stringBuffer.append(":");
        stringBuffer.append(this.f24942c.getSimpleName());
        return stringBuffer.toString();
    }
}
