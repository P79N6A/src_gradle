package com.ss.ugc.live.a;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    Context f78601a;

    /* renamed from: b  reason: collision with root package name */
    int f78602b;

    /* renamed from: c  reason: collision with root package name */
    int f78603c;

    /* renamed from: d  reason: collision with root package name */
    String f78604d;

    /* renamed from: e  reason: collision with root package name */
    AssetManager f78605e;

    /* renamed from: f  reason: collision with root package name */
    b f78606f;
    int g;
    int h;
    j i;
    boolean j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f78607a;

        /* renamed from: b  reason: collision with root package name */
        public int f78608b;

        /* renamed from: c  reason: collision with root package name */
        public int f78609c;

        /* renamed from: d  reason: collision with root package name */
        public String f78610d;

        /* renamed from: e  reason: collision with root package name */
        public int f78611e;

        /* renamed from: f  reason: collision with root package name */
        public j f78612f;
        public int g;
        boolean h;
        public AssetManager i;
        public b j;

        public final d a() {
            int i2;
            int i3;
            if (this.f78607a != null) {
                if (this.f78608b == 0) {
                    i2 = 720;
                } else {
                    i2 = this.f78608b;
                }
                this.f78608b = i2;
                if (this.f78609c == 0) {
                    i3 = 1280;
                } else {
                    i3 = this.f78609c;
                }
                this.f78609c = i3;
                return new d(this, (byte) 0);
            }
            throw new NullPointerException("context is null");
        }

        public final a a(int i2) {
            this.f78611e = i2;
            return this;
        }

        public final a b(int i2) {
            this.g = i2;
            return this;
        }

        public a(Context context) {
            this.f78607a = context;
        }

        public final a a(b bVar) {
            this.j = bVar;
            return this;
        }

        public final a a(String str) {
            this.f78610d = str;
            return this;
        }

        public final a a(boolean z) {
            this.h = z;
            return this;
        }

        public final a a(int i2, int i3) {
            this.f78608b = i2;
            this.f78609c = i3;
            return this;
        }
    }

    private d(a aVar) {
        this.h = 1;
        this.f78601a = aVar.f78607a;
        this.f78603c = aVar.f78609c;
        this.f78602b = aVar.f78608b;
        this.g = aVar.f78611e;
        this.f78604d = aVar.f78610d;
        this.f78605e = aVar.i;
        this.i = aVar.f78612f;
        this.h = aVar.g;
        this.j = aVar.h;
        this.f78606f = aVar.j;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
