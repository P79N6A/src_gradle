package com.mapbox.android.telemetry;

import android.os.Bundle;

public final class h implements q {

    /* renamed from: a  reason: collision with root package name */
    private q f26112a;

    h() {
    }

    public final void a(q qVar) {
        this.f26112a = qVar;
    }

    public final bd a(Bundle bundle) {
        if (bundle.getBoolean("com.mapbox.CnEventsServer")) {
            return new bd(o.CHINA);
        }
        return this.f26112a.a(bundle);
    }
}
