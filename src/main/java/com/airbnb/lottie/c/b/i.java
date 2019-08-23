package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.m;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4726a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4727b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4728c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f4729d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4730e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4731f;
    public final b g;
    public final b h;
    public final b i;

    public enum a {
        Star(1),
        Polygon(2);
        
        private final int value;

        public static a forValue(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }

        private a(int i) {
            this.value = i;
        }
    }

    public final com.airbnb.lottie.a.a.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        return new com.airbnb.lottie.a.a.m(lottieDrawable, aVar, this);
    }

    public i(String str, a aVar, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6) {
        this.f4726a = str;
        this.f4727b = aVar;
        this.f4728c = bVar;
        this.f4729d = mVar;
        this.f4730e = bVar2;
        this.f4731f = bVar3;
        this.g = bVar4;
        this.h = bVar5;
        this.i = bVar6;
    }
}
