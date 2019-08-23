package com.ali.auth.third.ui.context;

import android.text.TextUtils;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5055a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f5056b;

    b(a aVar, String str) {
        this.f5056b = aVar;
        this.f5055a = str;
    }

    public void run() {
        String str;
        if (TextUtils.isEmpty(this.f5055a)) {
            str = String.format("javascript:window.HavanaBridge.onSuccess(%s);", new Object[]{Integer.valueOf(this.f5056b.f5054b)});
        } else {
            str = String.format("javascript:window.HavanaBridge.onSuccess(%s,'%s');", new Object[]{Integer.valueOf(this.f5056b.f5054b), a.e(this.f5055a)});
        }
        this.f5056b.d(str);
    }
}
