package com.facebook.c.b.a;

import android.graphics.Color;
import com.facebook.c.b.e;
import com.facebook.c.b.j;
import java.util.List;

public final class c extends e<e, a> {

    /* renamed from: a  reason: collision with root package name */
    private final b f23316a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23317a;

        /* renamed from: b  reason: collision with root package name */
        public int f23318b;
    }

    public enum b {
        START,
        END
    }

    public static c a(j jVar, b bVar) {
        return new c(jVar.f23375a, jVar.f23376b, bVar);
    }

    private c(List<e> list, float[][][] fArr, b bVar) {
        super(list, fArr);
        this.f23316a = bVar;
    }

    private static int a(float f2, int i, int i2) {
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return ((alpha + ((int) (((float) (Color.alpha(i2) - alpha)) * f2))) << 24) | ((red + ((int) (((float) (Color.red(i2) - red)) * f2))) << 16) | ((green + ((int) (((float) (Color.green(i2) - green)) * f2))) << 8) | (blue + ((int) (f2 * ((float) (Color.blue(i2) - blue)))));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(com.facebook.c.b.a aVar, com.facebook.c.b.a aVar2, float f2, Object obj) {
        e eVar = (e) aVar;
        e eVar2 = (e) aVar2;
        a aVar3 = (a) obj;
        if (eVar2 == null) {
            if (this.f23316a == b.START) {
                aVar3.f23317a = eVar.f23348a;
            } else {
                aVar3.f23318b = eVar.f23348a;
            }
        } else if (this.f23316a == b.START) {
            aVar3.f23317a = a(f2, eVar.f23348a, eVar2.f23348a);
        } else {
            aVar3.f23318b = a(f2, eVar.f23348a, eVar2.f23348a);
        }
    }
}
