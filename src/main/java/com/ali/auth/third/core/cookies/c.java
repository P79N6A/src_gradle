package com.ali.auth.third.core.cookies;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f4919a;

    /* renamed from: b  reason: collision with root package name */
    public String f4920b;

    /* renamed from: c  reason: collision with root package name */
    public String f4921c;

    /* renamed from: d  reason: collision with root package name */
    public String f4922d;

    /* renamed from: e  reason: collision with root package name */
    public long f4923e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4924f;
    public boolean g;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4921c);
        sb.append("=");
        sb.append(this.f4922d);
        sb.append("; ");
        sb.append("Domain=");
        sb.append(this.f4919a);
        if (this.f4923e > 0) {
            sb.append("; ");
            sb.append("Expires=");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            sb.append(simpleDateFormat.format(Long.valueOf(this.f4923e)));
        }
        sb.append("; ");
        sb.append("Path=");
        sb.append(this.f4920b);
        if (this.f4924f) {
            sb.append("; ");
            sb.append("Secure");
        }
        if (this.g) {
            sb.append("; ");
            sb.append("HttpOnly");
        }
        return sb.toString();
    }
}
