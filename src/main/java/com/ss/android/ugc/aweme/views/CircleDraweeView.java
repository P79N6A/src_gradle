package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nullable;

public class CircleDraweeView extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76302b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f76303c = true;

    /* renamed from: d  reason: collision with root package name */
    private Paint f76304d = new Paint();

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f76305e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f76306f;
    private BitmapShader g;
    private Canvas h;
    private int i;
    private boolean j = false;
    private ControllerListener<ImageInfo> k = new BaseControllerListener<ImageInfo>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            CircleDraweeView.this.f76303c = true;
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76302b, false, 89409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76302b, false, 89409, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.setRoundAsCircle(true);
        ((GenericDraweeHierarchy) getHierarchy()).setRoundingParams(roundingParams);
        ((GenericDraweeHierarchy) getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
        b();
    }

    private void b() {
        Bitmap.Config config;
        if (PatchProxy.isSupport(new Object[0], this, f76302b, false, 89414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76302b, false, 89414, new Class[0], Void.TYPE);
        } else if (this.j) {
            this.f76306f = getDrawable();
            if (this.f76306f != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f76306f.getOpacity() != -1) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                int intrinsicWidth = this.f76306f.getIntrinsicWidth();
                int intrinsicHeight = this.f76306f.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f76305e != null) {
                    if (intrinsicWidth == this.f76305e.getWidth() && intrinsicHeight == this.f76305e.getHeight()) {
                        if (this.h != null) {
                            this.h.drawColor(0, PorterDuff.Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f76305e.isRecycled()) {
                        this.f76305e.recycle();
                    }
                }
                this.i = intrinsicWidth / 2;
                this.f76305e = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.h = new Canvas(this.f76305e);
                this.f76306f.setBounds(0, 0, this.h.getWidth(), this.h.getHeight());
                Bitmap bitmap = this.f76305e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.g = new BitmapShader(bitmap, tileMode, tileMode);
                this.f76304d.setAntiAlias(true);
                this.f76304d.setShader(this.g);
            }
        }
    }

    public CircleDraweeView(Context context) {
        super(context);
    }

    public void setController(@Nullable DraweeController draweeController) {
        if (PatchProxy.isSupport(new Object[]{draweeController}, this, f76302b, false, 89413, new Class[]{DraweeController.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draweeController}, this, f76302b, false, 89413, new Class[]{DraweeController.class}, Void.TYPE);
            return;
        }
        if (this.j) {
            this.f76303c = true;
            setImageDrawable(null);
        }
        super.setController(draweeController);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76302b, false, 89412, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76302b, false, 89412, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.j) {
            if (this.f76303c) {
                b();
                this.f76303c = false;
            }
            if (!(this.f76306f == null || this.h == null)) {
                this.f76306f.draw(this.h);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.i, this.f76304d);
        } else {
            super.onDraw(canvas);
        }
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f76302b, false, 89410, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f76302b, false, 89410, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z;
        if (z2) {
            post(new c(this));
        }
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f76302b, false, 89411, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f76302b, false, 89411, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        b();
    }
}
