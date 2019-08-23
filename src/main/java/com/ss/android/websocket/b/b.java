package com.ss.android.websocket.b;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f78201a;

    /* renamed from: b  reason: collision with root package name */
    public long f78202b;

    public enum a {
        OPENING,
        CONNECTED,
        CLOSING,
        RETRY_WAITING,
        CLOSED
    }

    public final b a(a aVar) {
        this.f78201a = aVar;
        return this;
    }

    public b(a aVar, long j) {
        this.f78201a = aVar;
        this.f78202b = j;
    }
}
