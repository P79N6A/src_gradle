package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    final ab f26687a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f26688b;

    /* renamed from: c  reason: collision with root package name */
    public final l f26689c;

    /* renamed from: d  reason: collision with root package name */
    public a f26690d;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f26692b;

        public final void a() {
            this.f26692b = true;
        }

        public final void run() {
            if (!this.f26692b) {
                m.this.f26689c.b(new PointF(m.this.f26688b.c() / 2.0f, m.this.f26688b.b() / 2.0f), true);
                m.this.f26690d = null;
            }
        }

        a() {
        }
    }

    m(ab abVar, ac acVar, l lVar) {
        this.f26687a = abVar;
        this.f26688b = acVar;
        this.f26689c = lVar;
    }
}
