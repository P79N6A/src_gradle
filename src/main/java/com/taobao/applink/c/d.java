package com.taobao.applink.c;

import android.os.AsyncTask;

public class d extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f79170a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f79171b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f79172c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f79173d;

    d(b bVar, String str, String str2, String str3) {
        this.f79173d = bVar;
        this.f79170a = str;
        this.f79171b = str2;
        this.f79172c = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.f79173d.b(this.f79170a, this.f79171b, this.f79172c);
        return null;
    }
}
