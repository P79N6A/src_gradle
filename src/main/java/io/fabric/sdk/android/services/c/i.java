package io.fabric.sdk.android.services.c;

import android.content.Context;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83231a;

    /* renamed from: b  reason: collision with root package name */
    private final e f83232b;

    public final void run() {
        try {
            io.fabric.sdk.android.services.b.i.a(this.f83231a, "Performing time based file roll over.");
            if (!this.f83232b.rollFileOver()) {
                this.f83232b.cancelTimeBasedFileRollOver();
            }
        } catch (Exception unused) {
            io.fabric.sdk.android.services.b.i.b(this.f83231a, "Failed to roll over file");
        }
    }

    public i(Context context, e eVar) {
        this.f83231a = context;
        this.f83232b = eVar;
    }
}
