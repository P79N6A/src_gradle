package com.unicom.xiaowo.login.c;

import android.text.TextUtils;
import com.unicom.xiaowo.login.d.a;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ k f81441a;

    g(k kVar) {
        this.f81441a = kVar;
    }

    public final void a(String str) {
        "precheck:".concat(String.valueOf(str));
        a.a().b();
        if (TextUtils.isEmpty(str)) {
            this.f81441a.a(2, "");
        } else {
            this.f81441a.a(1, str);
        }
    }
}
