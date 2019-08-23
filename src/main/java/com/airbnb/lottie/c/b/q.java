package com.airbnb.lottie.c.b;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.r;
import com.airbnb.lottie.c.a.b;

public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4761a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4762b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4763c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4764d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4765e;

    public enum a {
        Simultaneously,
        Individually;

        public static a forId(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    throw new IllegalArgumentException("Unknown trim path type " + i);
            }
        }
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f4763c + ", end: " + this.f4764d + ", offset: " + this.f4765e + "}";
    }

    public final com.airbnb.lottie.a.a.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        return new r(aVar, this);
    }

    public q(String str, a aVar, b bVar, b bVar2, b bVar3) {
        this.f4761a = str;
        this.f4762b = aVar;
        this.f4763c = bVar;
        this.f4764d = bVar2;
        this.f4765e = bVar3;
    }
}
