package com.xiaomi.push;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f82452a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f887a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82453b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f82454c;

    r(q qVar, String str, String str2, String str3) {
        this.f82452a = qVar;
        this.f887a = str;
        this.f82453b = str2;
        this.f82454c = str3;
    }

    public void run() {
        SharedPreferences.Editor edit = c.a(this.f82452a.f884a, this.f887a, 4).edit();
        edit.putString(this.f82453b, this.f82454c);
        edit.commit();
    }
}
