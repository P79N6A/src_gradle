package com.ss.android.account.token;

import android.webkit.URLUtil;
import java.util.HashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f22676a = "https://security.snssdk.com";

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f22677b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public f f22678c;

    /* renamed from: d  reason: collision with root package name */
    public String f22679d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22680e = false;

    /* renamed from: f  reason: collision with root package name */
    public long f22681f = 600000;
    public long g = 300000;
    public a h;

    public interface a {
        boolean a();
    }

    public b() {
        String a2 = e.a(this.f22676a);
        if (a2 != null) {
            this.f22677b.add(a2);
        }
    }

    public final b b(String str) {
        this.f22677b.add(str);
        return this;
    }

    public final b a(String str) {
        if (URLUtil.isNetworkUrl(str)) {
            this.f22676a = str;
            String a2 = e.a(str);
            if (a2 != null) {
                this.f22677b.add(a2);
            }
        }
        return this;
    }
}
