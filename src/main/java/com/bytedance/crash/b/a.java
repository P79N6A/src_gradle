package com.bytedance.crash.b;

import android.os.FileObserver;
import android.os.SystemClock;
import android.text.TextUtils;

public final class a extends FileObserver {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f19347a = true;

    /* renamed from: b  reason: collision with root package name */
    private final b f19348b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19349c = 5000;

    /* renamed from: com.bytedance.crash.b.a$a  reason: collision with other inner class name */
    final class C0150a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private int f19351b = 5000;

        public final void run() {
            SystemClock.sleep((long) this.f19351b);
            a.this.f19347a = true;
        }

        C0150a(int i) {
        }
    }

    public final void onEvent(int i, String str) {
        if (this.f19347a && i == 8 && !TextUtils.isEmpty(str) && str.contains("trace") && this.f19348b != null) {
            this.f19347a = false;
            b bVar = this.f19348b;
            bVar.a(200, "/data/anr/" + str, 80);
            getClass();
            new C0150a(5000).start();
        }
    }

    public a(b bVar, String str, int i) {
        super(str, 8);
        if (!TextUtils.isEmpty(str)) {
            this.f19348b = bVar;
            return;
        }
        throw new IllegalArgumentException("params is not right path is null or ANRManager is null");
    }
}
