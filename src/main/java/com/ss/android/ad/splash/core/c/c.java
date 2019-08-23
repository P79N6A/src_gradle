package com.ss.android.ad.splash.core.c;

import android.graphics.Point;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f27615a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27616b;

    /* renamed from: c  reason: collision with root package name */
    public Point f27617c;

    /* renamed from: d  reason: collision with root package name */
    public String f27618d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27619e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f27620a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f27621b;

        /* renamed from: c  reason: collision with root package name */
        public String f27622c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27623d;

        /* renamed from: e  reason: collision with root package name */
        public Point f27624e;

        public final c a() {
            return new c(this);
        }

        public final a a(int i) {
            this.f27620a = i;
            return this;
        }

        public final a b(boolean z) {
            this.f27623d = z;
            return this;
        }

        public final a a(String str) {
            this.f27622c = str;
            return this;
        }

        public final a a(boolean z) {
            this.f27621b = z;
            return this;
        }

        public final a a(int i, int i2) {
            this.f27624e = new Point(i, i2);
            return this;
        }
    }

    public c(a aVar) {
        this.f27615a = aVar.f27620a;
        this.f27616b = aVar.f27621b;
        this.f27617c = aVar.f27624e;
        this.f27618d = aVar.f27622c;
        this.f27619e = aVar.f27623d;
    }
}
