package com.alipay.sdk.auth;

import android.webkit.SslErrorHandler;
import com.alipay.sdk.auth.AuthActivity;
import com.alipay.sdk.k.d;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SslErrorHandler f5464a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthActivity.b f5465b;

    public final void run() {
        d.a(AuthActivity.this, "安全警告", "由于您的设备缺少根证书，将无法校验该访问站点的安全性，可能存在风险，请选择是否继续？", "继续", new h(this), "退出", new i(this));
    }

    g(AuthActivity.b bVar, SslErrorHandler sslErrorHandler) {
        this.f5465b = bVar;
        this.f5464a = sslErrorHandler;
    }
}
