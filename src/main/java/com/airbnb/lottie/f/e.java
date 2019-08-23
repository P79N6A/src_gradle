package com.airbnb.lottie.f;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.FloatRange;
import com.airbnb.lottie.a.a.j;
import com.airbnb.lottie.c.a;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.c.f;
import java.util.List;

public final class e {
    public static float a(float f2, float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    static int a(float f2, float f3) {
        boolean z;
        int i = (int) f2;
        int i2 = (int) f3;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(l lVar, Path path) {
        path.reset();
        PointF pointF = lVar.f4741b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        for (int i = 0; i < lVar.f4740a.size(); i++) {
            a aVar = lVar.f4740a.get(i);
            PointF pointF3 = aVar.f4680a;
            PointF pointF4 = aVar.f4681b;
            PointF pointF5 = aVar.f4682c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        if (lVar.f4742c) {
            path.close();
        }
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(0, Math.min(255, i));
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static void a(com.airbnb.lottie.c.e eVar, int i, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e eVar2, j jVar) {
        if (eVar.c(jVar.b(), i)) {
            list.add(eVar2.a(jVar.b()).a((f) jVar));
        }
    }
}
