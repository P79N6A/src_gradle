package com.meizu.cloud.pushsdk.b.g;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static i f27024a;

    /* renamed from: b  reason: collision with root package name */
    static long f27025b;

    private j() {
    }

    static i a() {
        synchronized (j.class) {
            if (f27024a == null) {
                return new i();
            }
            i iVar = f27024a;
            f27024a = iVar.f27023f;
            iVar.f27023f = null;
            f27025b -= 2048;
            return iVar;
        }
    }

    static void a(i iVar) {
        if (iVar.f27023f != null || iVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!iVar.f27021d) {
            synchronized (j.class) {
                if (f27025b + 2048 <= 65536) {
                    f27025b += 2048;
                    iVar.f27023f = f27024a;
                    iVar.f27020c = 0;
                    iVar.f27019b = 0;
                    f27024a = iVar;
                }
            }
        }
    }
}
