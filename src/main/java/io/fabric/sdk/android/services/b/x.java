package io.fabric.sdk.android.services.b;

import android.os.SystemClock;
import android.util.Log;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public long f83217a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83218b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83219c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f83220d;

    /* renamed from: e  reason: collision with root package name */
    private long f83221e;

    public final synchronized void a() {
        if (!this.f83220d) {
            this.f83221e = SystemClock.elapsedRealtime();
            this.f83217a = 0;
        }
    }

    public final synchronized void b() {
        if (!this.f83220d) {
            if (this.f83217a == 0) {
                this.f83217a = SystemClock.elapsedRealtime() - this.f83221e;
            }
        }
    }

    public x(String str, String str2) {
        this.f83218b = str;
        this.f83219c = str2;
        this.f83220d = !Log.isLoggable(str2, 2);
    }
}
