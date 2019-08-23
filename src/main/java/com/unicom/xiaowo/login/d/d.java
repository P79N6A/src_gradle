package com.unicom.xiaowo.login.d;

import android.net.ConnectivityManager;
import android.net.Network;

public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ f f81457a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ a f81458b;

    public d(a aVar, f fVar) {
        this.f81458b = aVar;
        this.f81457a = fVar;
    }

    public final void onAvailable(Network network) {
        super.onAvailable(network);
        try {
            if (this.f81458b.f81451c != null) {
                this.f81458b.f81451c.cancel();
                e unused = this.f81458b.f81451c = null;
                if (this.f81457a != null) {
                    this.f81457a.a(true, network);
                }
            }
        } catch (Exception unused2) {
            if (this.f81457a != null) {
                this.f81457a.a(false, null);
            }
        }
    }
}
