package com.ss.android.ad.splash.c;

import android.net.Uri;
import com.ss.android.ad.splash.utils.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f27515a;

    /* renamed from: b  reason: collision with root package name */
    private String f27516b;

    /* renamed from: c  reason: collision with root package name */
    private String f27517c;

    /* renamed from: d  reason: collision with root package name */
    private String f27518d;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!g.a(this.f27516b)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f27516b));
        }
        if (!g.a(this.f27515a)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f27515a));
        }
        if (!g.a(this.f27518d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f27518d));
        }
        if (!g.a(this.f27517c)) {
            sb.append("&uuid=");
            sb.append(Uri.encode(this.f27517c));
        }
        return sb.toString();
    }
}
