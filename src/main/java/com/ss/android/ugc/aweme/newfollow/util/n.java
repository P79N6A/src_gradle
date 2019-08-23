package com.ss.android.ugc.aweme.newfollow.util;

import android.graphics.Matrix;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.a.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57450a;

    public static void a(int i, int i2, TextureView textureView, float f2) {
        TextureView textureView2 = textureView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), textureView2, Float.valueOf(f2)}, null, f57450a, true, 61976, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), textureView2, Float.valueOf(f2)}, null, f57450a, true, 61976, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Float.TYPE}, Void.TYPE);
            return;
        }
        a(i, i2, textureView2, f2, (b.a) null);
    }

    private static void a(int i, int i2, TextureView textureView, float f2, b.a aVar) {
        float f3;
        int i3 = i;
        int i4 = i2;
        TextureView textureView2 = textureView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), textureView2, Float.valueOf(f2), null}, null, f57450a, true, 61977, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Float.TYPE, b.a.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), textureView2, Float.valueOf(f2), null};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57450a, true, 61977, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Float.TYPE, b.a.class}, Void.TYPE);
        } else if (i4 > 0 && i3 > 0 && f2 > 0.0f) {
            float f4 = ((float) i4) / ((float) i3);
            float f5 = 1.0f;
            if (f4 > f2) {
                f3 = f4 / f2;
            } else {
                f5 = f2 / f4;
                f3 = 1.0f;
            }
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            if (textureView2 != null) {
                Matrix matrix = new Matrix();
                matrix.setScale(f3, f5, (float) i5, (float) i6);
                textureView2.setTransform(matrix);
            }
        }
    }

    public static void a(int i, int i2, TextureView textureView, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        TextureView textureView2 = textureView;
        int i7 = i3;
        int i8 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), textureView2, Integer.valueOf(i3), Integer.valueOf(i4)}, null, f57450a, true, 61975, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), textureView2, Integer.valueOf(i3), Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57450a, true, 61975, new Class[]{Integer.TYPE, Integer.TYPE, TextureView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i6 > 0 && i5 > 0 && i7 > 0 && i8 > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
            float f2 = (((float) i8) * 1.0f) / ((float) i7);
            float f3 = (float) i5;
            if (f2 >= (((float) i6) * 1.0f) / f3) {
                layoutParams.width = i5;
                layoutParams.height = i6;
            } else {
                layoutParams.width = i5;
                layoutParams.height = (int) (f3 * f2);
            }
            layoutParams.gravity = 17;
            textureView2.setLayoutParams(layoutParams);
        }
    }
}
