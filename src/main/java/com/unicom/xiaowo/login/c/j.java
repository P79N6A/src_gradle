package com.unicom.xiaowo.login.c;

import android.text.TextUtils;

public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ k f81447a;

    j(k kVar) {
        this.f81447a = kVar;
    }

    public final void a(String str) {
        "getToken:".concat(String.valueOf(str));
        if (TextUtils.isEmpty(str)) {
            this.f81447a.a(2, "");
        } else {
            this.f81447a.a(1, str);
        }
    }
}
