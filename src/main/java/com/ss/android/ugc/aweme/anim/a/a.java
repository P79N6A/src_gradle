package com.ss.android.ugc.aweme.anim.a;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33325a;

    public final void applyTransformation(float f2, Transformation transformation) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f33325a, false, 21638, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f33325a, false, 21638, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
            return;
        }
        float f3 = this.f33327c;
        float f4 = this.f33329e;
        float f5 = this.f33330f;
        Camera camera = this.i;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        camera.translate(0.0f, 0.0f, this.g);
        camera.rotateY(f3 + ((this.f33328d - f3) * f2));
        camera.getMatrix(matrix);
        camera.restore();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        fArr[6] = fArr[6] / this.h;
        fArr[7] = fArr[7] / this.h;
        matrix.setValues(fArr);
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    public a(Context context, float f2, float f3, float f4, float f5, float f6) {
        super(context, f2, f3, f4, f5, 0.0f);
    }
}
