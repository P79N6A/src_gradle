package com.alipay.sdk.k;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5544a;

    public final void run() {
        if (this.f5544a.f5539a != null) {
            try {
                this.f5544a.f5539a.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    c(a aVar) {
        this.f5544a = aVar;
    }
}
