package com.loc;

import java.io.File;

public final class bf extends bj {

    /* renamed from: b  reason: collision with root package name */
    private int f25519b;

    /* renamed from: c  reason: collision with root package name */
    private String f25520c;

    public bf(int i, String str, bj bjVar) {
        super(bjVar);
        this.f25519b = i;
        this.f25520c = str;
    }

    private static int a(String str) {
        int i;
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            i = file.list().length;
            return i;
        } catch (Throwable th) {
            i.b(th, "fus", "gfn");
            i = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return a(this.f25520c) >= this.f25519b;
    }
}
