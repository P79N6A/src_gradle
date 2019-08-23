package com.bytedance.scene.a;

import android.support.annotation.NonNull;
import com.bytedance.scene.b.g;
import com.bytedance.scene.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.scene.animation.c f21978a;

    /* renamed from: b  reason: collision with root package name */
    public final d f21979b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21980c;

    /* renamed from: d  reason: collision with root package name */
    public final g<e> f21981d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d f21982a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21983b;

        /* renamed from: c  reason: collision with root package name */
        private com.bytedance.scene.animation.c f21984c;

        /* renamed from: d  reason: collision with root package name */
        private g<e> f21985d;

        @NonNull
        public final c a() {
            c cVar = new c(this.f21985d, this.f21983b, this.f21982a, this.f21984c, (byte) 0);
            return cVar;
        }

        @NonNull
        public final a a(@NonNull com.bytedance.scene.animation.c cVar) {
            this.f21984c = cVar;
            return this;
        }

        @NonNull
        public final a a(boolean z) {
            this.f21983b = true;
            return this;
        }
    }

    private c(g<e> gVar, boolean z, d dVar, com.bytedance.scene.animation.c cVar) {
        this.f21981d = gVar;
        this.f21980c = z;
        this.f21979b = dVar;
        this.f21978a = cVar;
    }

    /* synthetic */ c(g gVar, boolean z, d dVar, com.bytedance.scene.animation.c cVar, byte b2) {
        this(gVar, z, dVar, cVar);
    }
}
