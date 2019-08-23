package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TopCropImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63111a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63111a, false, 69878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63111a, false, 69878, new Class[0], Void.TYPE);
            return;
        }
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void b() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f63111a, false, 69879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63111a, false, 69879, new Class[0], Void.TYPE);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth * height > intrinsicHeight * width) {
                f2 = ((float) height) / ((float) intrinsicHeight);
            } else {
                f2 = ((float) width) / ((float) intrinsicWidth);
            }
            imageMatrix.setScale(f2, f2);
            setImageMatrix(imageMatrix);
        }
    }

    public TopCropImageView(Context context) {
        super(context);
        a();
    }

    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public TopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f63111a, false, 69877, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f63111a, false, 69877, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        b();
        return super.setFrame(i, i2, i3, i4);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f63111a, false, 69876, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f63111a, false, 69876, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        b();
    }
}
