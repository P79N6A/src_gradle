package com.ali.auth.third.core.task;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f4979a;

    d(a aVar) {
        this.f4979a = aVar;
    }

    public void run() {
        if (this.f4979a.f4969a != null) {
            this.f4979a.f4969a.onSuccess();
        }
    }
}
