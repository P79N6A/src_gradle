package com.alipay.sdk.app;

import android.webkit.SslErrorHandler;
import com.alipay.sdk.k.d;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SslErrorHandler f5438a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f5439b;

    public final void run() {
        d.a(this.f5439b.f5433b, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，可能存在风险，请选择是否继续？", "继续", new f(this), "退出", new g(this));
    }

    e(d dVar, SslErrorHandler sslErrorHandler) {
        this.f5439b = dVar;
        this.f5438a = sslErrorHandler;
    }
}
