package f.a.a.a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import f.a.a.a.c;

public class b extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private final c f83101a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView.ScaleType f83102b;

    public Matrix getDisplayMatrix() {
        return this.f83101a.f();
    }

    public RectF getDisplayRect() {
        return this.f83101a.b();
    }

    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    public float getMaximumScale() {
        return this.f83101a.f83110e;
    }

    public float getMediumScale() {
        return this.f83101a.f83109d;
    }

    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    public float getMinimumScale() {
        return this.f83101a.f83108c;
    }

    public float getScale() {
        return this.f83101a.d();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f83101a.l;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f83101a.a();
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setMaxScale(float f2) {
        setMaximumScale(f2);
    }

    @Deprecated
    public void setMidScale(float f2) {
        setMediumScale(f2);
    }

    @Deprecated
    public void setMinScale(float f2) {
        setMinimumScale(f2);
    }

    public b(Context context) {
        this(context, null);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f83101a.f83111f = z;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f83101a.k = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c.C0880c cVar) {
        this.f83101a.h = cVar;
    }

    public void setOnPhotoTapListener(c.d dVar) {
        this.f83101a.i = dVar;
    }

    public void setOnViewTapListener(c.e eVar) {
        this.f83101a.j = eVar;
    }

    public void setZoomable(boolean z) {
        this.f83101a.a(z);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f83101a != null) {
            this.f83101a.e();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.f83101a != null) {
            this.f83101a.e();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f83101a != null) {
            this.f83101a.e();
        }
    }

    public void setMaximumScale(float f2) {
        c cVar = this.f83101a;
        c.a(cVar.f83108c, cVar.f83109d, f2);
        cVar.f83110e = f2;
    }

    public void setMediumScale(float f2) {
        c cVar = this.f83101a;
        c.a(cVar.f83108c, f2, cVar.f83110e);
        cVar.f83109d = f2;
    }

    public void setMinimumScale(float f2) {
        c cVar = this.f83101a;
        c.a(f2, cVar.f83109d, cVar.f83110e);
        cVar.f83108c = f2;
    }

    public void setPhotoViewRotation(float f2) {
        c cVar = this.f83101a;
        float f3 = f2 % 360.0f;
        cVar.g.postRotate(cVar.m - f3);
        cVar.m = f3;
        cVar.g();
    }

    public void setScale(float f2) {
        c cVar = this.f83101a;
        ImageView c2 = cVar.c();
        if (c2 != null) {
            cVar.a(f2, (float) (c2.getRight() / 2), (float) (c2.getBottom() / 2), false);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        if (this.f83101a != null) {
            c cVar = this.f83101a;
            if (scaleType == null) {
                z = false;
            } else if (c.h()[scaleType.ordinal()] != 8) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.valueOf(scaleType.name()) + " is not supported in PhotoView");
            }
            if (z && scaleType != cVar.l) {
                cVar.l = scaleType;
                cVar.e();
            }
            return;
        }
        this.f83102b = scaleType;
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.f83101a = new c(this);
        if (this.f83102b != null) {
            setScaleType(this.f83102b);
            this.f83102b = null;
        }
    }
}
