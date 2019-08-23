package com.ss.android.ugc.aweme.base.ui;

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
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import javax.annotation.Nullable;

public class CircleImageView extends AnimatedImageView {
    public static ChangeQuickRedirect h;

    /* renamed from: f  reason: collision with root package name */
    private Paint f34933f = new Paint();
    private Bitmap g;
    public volatile boolean i = true;
    private Drawable j;
    private BitmapShader k;
    private Canvas l;
    private int m;
    private boolean n = false;
    private ControllerListener<ImageInfo> o = new BaseControllerListener<ImageInfo>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            CircleImageView.this.i = true;
        }
    };

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24995, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.setRoundAsCircle(true);
        ((GenericDraweeHierarchy) getHierarchy()).setRoundingParams(roundingParams);
        ((GenericDraweeHierarchy) getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
        d();
    }

    private void d() {
        Bitmap.Config config;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 25000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 25000, new Class[0], Void.TYPE);
        } else if (this.n) {
            this.j = getDrawable();
            if (this.j != null && getWidth() > 0 && getHeight() > 0) {
                if (this.j.getOpacity() != -1) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                int intrinsicWidth = this.j.getIntrinsicWidth();
                int intrinsicHeight = this.j.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.g != null) {
                    if (intrinsicWidth == this.g.getWidth() && intrinsicHeight == this.g.getHeight()) {
                        if (this.l != null) {
                            this.l.drawColor(0, PorterDuff.Mode.CLEAR);
                        }
                        return;
                    } else if (!this.g.isRecycled()) {
                        this.g.recycle();
                    }
                }
                this.m = intrinsicWidth / 2;
                this.g = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.l = new Canvas(this.g);
                this.j.setBounds(0, 0, this.l.getWidth(), this.l.getHeight());
                Bitmap bitmap = this.g;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.k = new BitmapShader(bitmap, tileMode, tileMode);
                this.f34933f.setAntiAlias(true);
                this.f34933f.setShader(this.k);
            }
        }
    }

    public CircleImageView(Context context) {
        super(context);
    }

    public void setController(@Nullable DraweeController draweeController) {
        if (PatchProxy.isSupport(new Object[]{draweeController}, this, h, false, 24999, new Class[]{DraweeController.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draweeController}, this, h, false, 24999, new Class[]{DraweeController.class}, Void.TYPE);
            return;
        }
        if (this.n) {
            this.i = true;
            setImageDrawable(null);
        }
        super.setController(draweeController);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, h, false, 24998, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, h, false, 24998, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.n) {
            if (this.i) {
                d();
                this.i = false;
            }
            if (!(this.j == null || this.l == null)) {
                this.j.draw(this.l);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.m, this.f34933f);
        } else {
            super.onDraw(canvas);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 24996, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, h, false, 24996, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = z;
        if (z2) {
            post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34934a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34934a, false, 25002, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34934a, false, 25002, new Class[0], Void.TYPE);
                        return;
                    }
                    CircleImageView.this.invalidate();
                }
            });
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public final void a(UrlModel urlModel, int i2, int i3, Postprocessor postprocessor) {
        ResizeOptions resizeOptions;
        Context context;
        UrlModel urlModel2 = urlModel;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{urlModel2, Integer.valueOf(i2), Integer.valueOf(i3), null}, this, h, false, 25001, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, Postprocessor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2, Integer.valueOf(i2), Integer.valueOf(i3), null}, this, h, false, 25001, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, Postprocessor.class}, Void.TYPE);
        } else if (urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (i4 <= 0 || i5 <= 0) {
                resizeOptions = null;
            } else {
                resizeOptions = new ResizeOptions(i4, i5);
            }
            if (getContext() != null) {
                context = getContext().getApplicationContext();
            } else {
                context = null;
            }
            ImageRequest[] a2 = c.a(urlModel2, resizeOptions, (Postprocessor) null);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(c.a(this.o, a2[0].getSourceUri(), context, urlModel2));
                setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, h, false, 24997, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, h, false, 24997, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        d();
    }
}
