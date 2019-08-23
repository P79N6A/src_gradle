package com.alipay.d.a.a.e;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f5382a;

    /* renamed from: b  reason: collision with root package name */
    private String f5383b;

    /* renamed from: c  reason: collision with root package name */
    private String f5384c;

    /* renamed from: d  reason: collision with root package name */
    private String f5385d;

    /* renamed from: e  reason: collision with root package name */
    private String f5386e;

    /* renamed from: f  reason: collision with root package name */
    private String f5387f;
    private String g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5382a = str;
        this.f5383b = str2;
        this.f5384c = str3;
        this.f5385d = str4;
        this.f5386e = str5;
        this.f5387f = str6;
        this.g = str7;
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f5382a);
        stringBuffer.append("," + this.f5383b);
        stringBuffer.append("," + this.f5384c);
        stringBuffer.append("," + this.f5385d);
        if (com.alipay.d.a.a.a.a.a(this.f5386e) || this.f5386e.length() < 20) {
            sb = new StringBuilder(",");
            str = this.f5386e;
        } else {
            sb = new StringBuilder(",");
            str = this.f5386e.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (com.alipay.d.a.a.a.a.a(this.f5387f) || this.f5387f.length() < 20) {
            sb2 = new StringBuilder(",");
            str2 = this.f5387f;
        } else {
            sb2 = new StringBuilder(",");
            str2 = this.f5387f.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (com.alipay.d.a.a.a.a.a(this.g) || this.g.length() < 20) {
            sb3 = new StringBuilder(",");
            str3 = this.g;
        } else {
            sb3 = new StringBuilder(",");
            str3 = this.g.substring(0, 20);
        }
        sb3.append(str3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
