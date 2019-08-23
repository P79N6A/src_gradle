package com.aweme.storage;

import android.text.TextUtils;
import java.io.File;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f7415a;

    /* renamed from: b  reason: collision with root package name */
    public String f7416b;

    /* renamed from: c  reason: collision with root package name */
    public long f7417c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f7418d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f7419a;

        /* renamed from: b  reason: collision with root package name */
        public String f7420b;

        /* renamed from: c  reason: collision with root package name */
        public long f7421c;

        public final void a(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f7419a)) {
                String str2 = str + File.separator + this.f7419a;
                if (new File(str2).exists()) {
                    this.f7421c = e.a(str2);
                }
            }
        }

        public a(String str, String str2) {
            this.f7420b = str2;
            this.f7419a = str;
        }
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.f7415a) && this.f7418d != null && !this.f7418d.isEmpty()) {
            for (a next : this.f7418d) {
                if (next != null) {
                    next.a(this.f7415a);
                }
            }
            this.f7417c = e.a(this.f7415a);
        }
    }

    public n(String str, String str2, List<a> list) {
        this.f7416b = str;
        this.f7415a = str2;
        this.f7418d = list;
    }
}
