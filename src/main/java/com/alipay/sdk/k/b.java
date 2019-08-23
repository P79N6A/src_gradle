package com.alipay.sdk.k;

import com.alipay.sdk.k.a;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5543a;

    public final void run() {
        if (this.f5543a.f5539a == null) {
            this.f5543a.f5539a = new a.C0042a(this.f5543a.f5541d);
        }
        try {
            if (!this.f5543a.f5539a.isShowing()) {
                this.f5543a.f5539a.show();
            }
        } catch (Exception unused) {
        }
    }

    b(a aVar) {
        this.f5543a = aVar;
    }
}
