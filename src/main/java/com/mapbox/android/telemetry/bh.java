package com.mapbox.android.telemetry;

import android.os.Bundle;

public final class bh implements q {

    /* renamed from: a  reason: collision with root package name */
    private q f26063a;

    bh() {
    }

    public final void a(q qVar) {
        this.f26063a = qVar;
    }

    public final bd a(Bundle bundle) {
        String string = bundle.getString("com.mapbox.TestEventsServer");
        String string2 = bundle.getString("com.mapbox.TestEventsAccessToken");
        if (bp.a(string) || bp.a(string2)) {
            return this.f26063a.a(bundle);
        }
        bd bdVar = new bd(o.STAGING);
        bdVar.f26057b = string;
        bdVar.f26058c = string2;
        return bdVar;
    }
}
