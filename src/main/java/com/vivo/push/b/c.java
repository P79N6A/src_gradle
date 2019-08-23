package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.a;
import com.vivo.push.y;

public class c extends y {

    /* renamed from: a  reason: collision with root package name */
    private String f81497a;

    /* renamed from: b  reason: collision with root package name */
    private String f81498b;

    /* renamed from: c  reason: collision with root package name */
    private long f81499c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f81500d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f81501e;

    /* renamed from: f  reason: collision with root package name */
    private String f81502f;

    public final void g() {
        this.f81502f = null;
    }

    public String toString() {
        return "BaseAppCommand";
    }

    public final int f() {
        return this.f81501e;
    }

    public final String h() {
        return this.f81497a;
    }

    public final void a(int i) {
        this.f81501e = i;
    }

    public final void b(String str) {
        this.f81497a = str;
    }

    public void c(a aVar) {
        aVar.a("req_id", this.f81497a);
        aVar.a("package_name", this.f81498b);
        aVar.a("sdk_version", 270);
        aVar.a("PUSH_APP_STATUS", this.f81500d);
        if (!TextUtils.isEmpty(this.f81502f)) {
            aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f81502f);
        }
    }

    public void d(a aVar) {
        this.f81497a = aVar.a("req_id");
        this.f81498b = aVar.a("package_name");
        this.f81499c = aVar.b("sdk_version", 0);
        this.f81500d = aVar.b("PUSH_APP_STATUS", 0);
        this.f81502f = aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    public c(int i, String str, String str2) {
        super(i);
        this.f81497a = str;
        this.f81498b = str2;
    }
}
