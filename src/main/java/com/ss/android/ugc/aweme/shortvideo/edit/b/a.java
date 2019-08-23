package com.ss.android.ugc.aweme.shortvideo.edit.b;

import android.graphics.PointF;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67090a;

    public static void a(RectF rectF, float f2) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2, Float.valueOf(f2)}, null, f67090a, true, 76717, new Class[]{RectF.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rectF2, Float.valueOf(f2)}, null, f67090a, true, 76717, new Class[]{RectF.class, Float.TYPE}, Void.TYPE);
            return;
        }
        float width = rectF.width();
        float height = rectF.height();
        float f3 = ((f2 * width) - width) / 2.0f;
        float f4 = ((f2 * height) - height) / 2.0f;
        rectF2.left -= f3;
        rectF2.top -= f4;
        rectF2.right += f3;
        rectF2.bottom += f4;
    }

    public static PointF a(PointF pointF, float f2, float f3, float f4) {
        PointF pointF2 = pointF;
        float f5 = f2;
        float f6 = f3;
        if (PatchProxy.isSupport(new Object[]{pointF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76720, new Class[]{PointF.class, Float.TYPE, Float.TYPE, Float.TYPE}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{pointF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76720, new Class[]{PointF.class, Float.TYPE, Float.TYPE, Float.TYPE}, PointF.class);
        } else if (Math.abs(f4) <= 0.0f) {
            return pointF2;
        } else {
            double d2 = (double) (pointF2.x - f5);
            double d3 = (double) f4;
            double cos = Math.cos(d3);
            Double.isNaN(d2);
            double d4 = d2 * cos;
            double d5 = (double) (pointF2.y - f6);
            double sin = Math.sin(d3);
            Double.isNaN(d5);
            double d6 = d4 - (d5 * sin);
            double d7 = (double) f5;
            Double.isNaN(d7);
            double d8 = d6 + d7;
            double d9 = (double) (pointF2.x - f5);
            double sin2 = Math.sin(d3);
            Double.isNaN(d9);
            double d10 = d9 * sin2;
            double d11 = (double) (pointF2.y - f6);
            double cos2 = Math.cos(d3);
            Double.isNaN(d11);
            double d12 = (double) f6;
            Double.isNaN(d12);
            double d13 = d10 + (d11 * cos2) + d12;
            float f7 = (float) d8;
            float f8 = (float) d13;
            pointF2.set(f7, f8);
            return new PointF(f7, f8);
        }
    }

    public static boolean b(RectF rectF, float f2, float f3, float f4) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76723, new Class[]{RectF.class, Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76723, new Class[]{RectF.class, Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (Math.abs(f4) <= 0.0f) {
            return rectF.contains(f2, f3);
        } else {
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            double d2 = (double) (-f4);
            float sin = (float) Math.sin(Math.toRadians(d2));
            float cos = (float) Math.cos(Math.toRadians(d2));
            float f5 = f2 - centerX;
            float f6 = f3 - centerY;
            return rectF2.contains((centerX + (f5 * cos)) - (f6 * sin), centerY + (f6 * cos) + (f5 * sin));
        }
    }

    public static void a(RectF rectF, float f2, float f3, float f4) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76718, new Class[]{RectF.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, f67090a, true, 76718, new Class[]{RectF.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d2 = (double) f4;
        float sin = (float) Math.sin(Math.toRadians(d2));
        float cos = (float) Math.cos(Math.toRadians(d2));
        float f5 = centerX - f2;
        float f6 = centerY - f3;
        rectF2.offset(((f2 + (f5 * cos)) - (f6 * sin)) - centerX, ((f3 + (f6 * cos)) + (f5 * sin)) - centerY);
    }
}
