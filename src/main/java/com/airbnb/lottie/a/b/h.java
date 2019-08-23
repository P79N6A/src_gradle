package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.g.a;

public final class h extends a<PointF> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Path f4654a;

    public h(LottieComposition lottieComposition, a<PointF> aVar) {
        super(lottieComposition, aVar.f4860b, aVar.f4861c, aVar.f4862d, aVar.f4863e, aVar.f4864f);
        boolean z;
        if (this.f4861c == null || this.f4860b == null || !((PointF) this.f4860b).equals(((PointF) this.f4861c).x, ((PointF) this.f4861c).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f4861c != null && !z) {
            PointF pointF = (PointF) this.f4860b;
            PointF pointF2 = (PointF) this.f4861c;
            PointF pointF3 = aVar.g;
            PointF pointF4 = aVar.h;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                Path path2 = path;
                path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            }
            this.f4654a = path;
        }
    }
}
