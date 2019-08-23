package com.bytedance.crash.b;

import com.bytedance.crash.runtime.f;
import com.bytedance.crash.runtime.g;
import java.io.File;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f19358a;

    /* renamed from: b  reason: collision with root package name */
    private long f19359b;

    /* renamed from: c  reason: collision with root package name */
    private final b f19360c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f19361d = new Runnable() {
        public final void run() {
            c.this.f19358a = false;
        }
    };

    public final void run() {
        boolean z;
        String str;
        int i;
        if (!this.f19358a) {
            File file = new File("/data/anr/traces.txt");
            if (!file.exists() || !file.canRead()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 200;
                str = "/data/anr/traces.txt";
            } else {
                str = null;
                i = 100;
            }
            if (this.f19360c.a(i, str, 25)) {
                this.f19358a = true;
            }
        }
    }

    public c(b bVar) {
        long j;
        this.f19360c = bVar;
        File file = new File("/data/anr/traces.txt");
        if (file.exists()) {
            j = file.lastModified();
        } else {
            j = 0;
        }
        this.f19359b = j;
        g.a(2);
        f.a().a(4500, this.f19361d);
        f.a().a(5000, this, 40, 5000);
    }
}
