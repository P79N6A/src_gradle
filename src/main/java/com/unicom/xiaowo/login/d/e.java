package com.unicom.xiaowo.login.d;

import android.os.CountDownTimer;

public final class e extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    private f f81459a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ a f81460b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(3000, 1000);
        this.f81460b = aVar;
        this.f81459a = fVar;
    }

    public final void onFinish() {
        if (!(this.f81459a == null || this.f81460b.f81451c == null)) {
            this.f81459a.a(false, null);
        }
        e unused = this.f81460b.f81451c = null;
    }

    public final void onTick(long j) {
    }
}
