package com.ali.auth.third.ui.context;

import android.text.TextUtils;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f5058b;

    c(a aVar, String str) {
        this.f5058b = aVar;
        this.f5057a = str;
    }

    public void run() {
        String str;
        if (TextUtils.isEmpty(this.f5057a)) {
            str = String.format("javascript:window.HavanaBridge.onFailure(%s,'');", new Object[]{Integer.valueOf(this.f5058b.f5054b)});
        } else {
            str = String.format("javascript:window.HavanaBridge.onFailure(%s,'%s');", new Object[]{Integer.valueOf(this.f5058b.f5054b), a.e(this.f5057a)});
        }
        this.f5058b.d(str);
    }
}
