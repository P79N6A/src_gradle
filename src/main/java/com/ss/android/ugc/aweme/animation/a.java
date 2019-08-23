package com.ss.android.ugc.aweme.animation;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.common.f.f;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.b;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.c;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import javax.annotation.Nullable;

@SuppressLint({"ViewConstructor"})
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33352a;

    /* renamed from: b  reason: collision with root package name */
    public static float[] f33353b = new float[4];

    /* renamed from: c  reason: collision with root package name */
    public static final Matrix f33354c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public static final Matrix f33355d = new Matrix();
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public ImageSource f33356e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    float[] f33357f;
    public ScalingUtils.ScaleType g;
    boolean h;
    public Animatable i;
    private ImageResizeMethod j;
    private final List<ImageSource> k;
    @Nullable
    private ImageSource l;
    @Nullable
    private Drawable m;
    private int n;
    private int o;
    private float p;
    private float q;
    private final AbstractDraweeControllerBuilder r;
    private final C0425a s;
    @Nullable
    private ControllerListener t;
    @Nullable
    private ControllerListener u;
    @Nullable
    private final Object v;
    private int w;
    private boolean x;
    private boolean y;

    /* renamed from: com.ss.android.ugc.aweme.animation.a$a  reason: collision with other inner class name */
    class C0425a extends BasePostprocessor {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33361a;

        private C0425a() {
        }

        /* synthetic */ C0425a(a aVar, byte b2) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void process(android.graphics.Bitmap r27, android.graphics.Bitmap r28) {
            /*
                r26 = this;
                r7 = r26
                r8 = r27
                r9 = r28
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r8
                r12 = 1
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f33361a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 21680(0x54b0, float:3.038E-41)
                r1 = r26
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0045
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f33361a
                r3 = 0
                r4 = 21680(0x54b0, float:3.038E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r26
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0045:
                com.ss.android.ugc.aweme.animation.a r0 = com.ss.android.ugc.aweme.animation.a.this
                float[] r1 = com.ss.android.ugc.aweme.animation.a.f33353b
                r0.a((float[]) r1)
                r8.setHasAlpha(r12)
                float[] r0 = com.ss.android.ugc.aweme.animation.a.f33353b
                r0 = r0[r11]
                r13 = 0
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                r14 = 3
                if (r0 == 0) goto L_0x007d
                float[] r0 = com.ss.android.ugc.aweme.animation.a.f33353b
                r0 = r0[r12]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007d
                float[] r0 = com.ss.android.ugc.aweme.animation.a.f33353b
                r0 = r0[r10]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007d
                float[] r0 = com.ss.android.ugc.aweme.animation.a.f33353b
                r0 = r0[r14]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007d
                super.process((android.graphics.Bitmap) r27, (android.graphics.Bitmap) r28)
                return
            L_0x007d:
                android.graphics.Paint r15 = new android.graphics.Paint
                r15.<init>()
                r15.setAntiAlias(r12)
                android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
                r0.<init>(r9, r1, r1)
                r15.setShader(r0)
                android.graphics.Canvas r6 = new android.graphics.Canvas
                r6.<init>(r8)
                r0 = 8
                float[] r8 = new float[r0]
                float[] r16 = com.ss.android.ugc.aweme.animation.a.f33353b
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r11] = r9
                r0[r12] = r16
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f33361a
                r3 = 0
                r4 = 21679(0x54af, float:3.0379E-41)
                java.lang.Class[] r5 = new java.lang.Class[r14]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<float[]> r1 = float[].class
                r5[r12] = r1
                java.lang.Class<float[]> r1 = float[].class
                r5[r10] = r1
                java.lang.Class r17 = java.lang.Void.TYPE
                r1 = r26
                r18 = r6
                r6 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x00e6
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r11] = r9
                r0[r12] = r16
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f33361a
                r3 = 0
                r4 = 21679(0x54af, float:3.0379E-41)
                java.lang.Class[] r5 = new java.lang.Class[r14]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<float[]> r1 = float[].class
                r5[r12] = r1
                java.lang.Class<float[]> r1 = float[].class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r26
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x014f
            L_0x00e6:
                com.ss.android.ugc.aweme.animation.a r0 = com.ss.android.ugc.aweme.animation.a.this
                com.facebook.drawee.drawable.ScalingUtils$ScaleType r0 = r0.g
                android.graphics.Matrix r20 = com.ss.android.ugc.aweme.animation.a.f33354c
                android.graphics.Rect r1 = new android.graphics.Rect
                int r2 = r28.getWidth()
                int r3 = r28.getHeight()
                r1.<init>(r11, r11, r2, r3)
                int r22 = r28.getWidth()
                int r23 = r28.getHeight()
                r24 = 0
                r25 = 0
                r19 = r0
                r21 = r1
                r19.getTransform(r20, r21, r22, r23, r24, r25)
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.animation.a.f33354c
                android.graphics.Matrix r1 = com.ss.android.ugc.aweme.animation.a.f33355d
                r0.invert(r1)
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.animation.a.f33355d
                r1 = r16[r11]
                float r0 = r0.mapRadius(r1)
                r8[r11] = r0
                r0 = r8[r11]
                r8[r12] = r0
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.animation.a.f33355d
                r1 = r16[r12]
                float r0 = r0.mapRadius(r1)
                r8[r10] = r0
                r0 = r8[r10]
                r8[r14] = r0
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.animation.a.f33355d
                r1 = r16[r10]
                float r0 = r0.mapRadius(r1)
                r1 = 4
                r8[r1] = r0
                r0 = 5
                r1 = r8[r1]
                r8[r0] = r1
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.animation.a.f33355d
                r1 = r16[r14]
                float r0 = r0.mapRadius(r1)
                r1 = 6
                r8[r1] = r0
                r0 = 7
                r1 = r8[r1]
                r8[r0] = r1
            L_0x014f:
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                android.graphics.RectF r1 = new android.graphics.RectF
                int r2 = r28.getWidth()
                float r2 = (float) r2
                int r3 = r28.getHeight()
                float r3 = (float) r3
                r1.<init>(r13, r13, r2, r3)
                android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
                r0.addRoundRect(r1, r8, r2)
                r1 = r18
                r1.drawPath(r0, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.animation.a.C0425a.process(android.graphics.Bitmap, android.graphics.Bitmap):void");
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f33352a, false, 21672, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33352a, false, 21672, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k.size() > 1) {
            return true;
        } else {
            return false;
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f33352a, false, 21673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33352a, false, 21673, new Class[0], Void.TYPE);
            return;
        }
        this.f33356e = null;
        if (!this.k.isEmpty()) {
            if (c()) {
                MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.k);
                this.f33356e = bestSourceForSize.getBestResult();
                this.l = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.f33356e = this.k.get(0);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33352a, false, 21661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33352a, false, 21661, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            if (this.y && !this.i.isRunning()) {
                this.i.start();
            } else if (!this.y) {
                this.i.stop();
            }
        }
    }

    public final void b() {
        boolean z;
        int i2;
        C0425a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f33352a, false, 21669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33352a, false, 21669, new Class[0], Void.TYPE);
        } else if (this.h) {
            if (!c() || (getWidth() > 0 && getHeight() > 0)) {
                d();
                if (this.f33356e != null) {
                    boolean a2 = a(this.f33356e);
                    if (!a2 || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) getHierarchy();
                        genericDraweeHierarchy.setActualImageScaleType(this.g);
                        if (this.m != null) {
                            genericDraweeHierarchy.setPlaceholderImage(this.m, ScalingUtils.ScaleType.CENTER);
                        }
                        if (this.g == ScalingUtils.ScaleType.CENTER_CROP || this.g == ScalingUtils.ScaleType.FOCUS_CROP) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = genericDraweeHierarchy.getRoundingParams();
                        if (roundingParams != null) {
                            if (z) {
                                roundingParams.setCornersRadius(0.0f);
                            } else {
                                a(f33353b);
                                roundingParams.setCornersRadii(f33353b[0], f33353b[1], f33353b[2], f33353b[3]);
                            }
                            roundingParams.setBorder(this.n, this.p);
                            if (this.o != 0) {
                                roundingParams.setOverlayColor(this.o);
                            } else {
                                roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
                            }
                        }
                        genericDraweeHierarchy.setRoundingParams(roundingParams);
                        if (this.w >= 0) {
                            i2 = this.w;
                        } else if (this.f33356e.isResource()) {
                            i2 = 0;
                        } else {
                            i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                        }
                        genericDraweeHierarchy.setFadeDuration(i2);
                        ResizeOptions resizeOptions = null;
                        if (z) {
                            aVar = this.s;
                        } else {
                            aVar = null;
                        }
                        if (a2) {
                            resizeOptions = new ResizeOptions(getWidth(), getHeight());
                        }
                        ImageRequest build = ImageRequestBuilder.newBuilderWithSource(this.f33356e.getUri()).setPostprocessor(aVar).setResizeOptions(resizeOptions).setRotationOptions(RotationOptions.autoRotate()).setProgressiveRenderingEnabled(this.x).build();
                        this.r.reset();
                        this.r.setAutoPlayAnimations(true).setCallerContext(this.v).setOldController(getController()).setImageRequest(build);
                        if (this.l != null) {
                            this.r.setLowResImageRequest(ImageRequestBuilder.newBuilderWithSource(this.l.getUri()).setPostprocessor(aVar).setResizeOptions(resizeOptions).setRotationOptions(RotationOptions.autoRotate()).setProgressiveRenderingEnabled(this.x).build());
                        }
                        if (this.t != null && this.u != null) {
                            com.facebook.drawee.controller.c cVar = new com.facebook.drawee.controller.c();
                            cVar.a(this.t);
                            cVar.a(this.u);
                            this.r.setControllerListener(cVar);
                        } else if (this.u != null) {
                            this.r.setControllerListener(this.u);
                        } else if (this.t != null) {
                            this.r.setControllerListener(this.t);
                        }
                        setController(this.r.build());
                        this.h = false;
                    }
                }
            }
        }
    }

    public void setFadeDuration(int i2) {
        this.w = i2;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.x = z;
    }

    public void setBorderColor(int i2) {
        this.n = i2;
        this.h = true;
    }

    public void setOverlayColor(int i2) {
        this.o = i2;
        this.h = true;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.j = imageResizeMethod;
        this.h = true;
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.g = scaleType;
        this.h = true;
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f33352a, false, 21675, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f33352a, false, 21675, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        a();
        super.onDraw(canvas);
    }

    public void setControllerListener(ControllerListener controllerListener) {
        if (PatchProxy.isSupport(new Object[]{controllerListener}, this, f33352a, false, 21670, new Class[]{ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{controllerListener}, this, f33352a, false, 21670, new Class[]{ControllerListener.class}, Void.TYPE);
            return;
        }
        this.u = controllerListener;
        this.h = true;
        b();
    }

    private boolean a(ImageSource imageSource) {
        if (PatchProxy.isSupport(new Object[]{imageSource}, this, f33352a, false, 21674, new Class[]{ImageSource.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageSource}, this, f33352a, false, 21674, new Class[]{ImageSource.class}, Boolean.TYPE)).booleanValue();
        } else if (this.j == ImageResizeMethod.AUTO) {
            if (f.d(imageSource.getUri()) || f.c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.j == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void setBorderRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f33352a, false, 21664, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f33352a, false, 21664, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (!FloatUtil.floatsEqual(this.q, f2)) {
            this.q = f2;
            this.h = true;
        }
    }

    public void setBorderWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f33352a, false, 21663, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f33352a, false, 21663, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.p = PixelUtil.toPixelFromDIP(f2);
        this.h = true;
    }

    public void setLoadingIndicatorSource(@Nullable String str) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{str}, this, f33352a, false, 21667, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33352a, false, 21667, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new b(resourceDrawable, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        } else {
            bVar = null;
        }
        this.m = bVar;
        this.h = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33352a, false, 21660, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33352a, false, 21660, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            this.t = null;
        } else {
            final EventDispatcher eventDispatcher = ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.t = new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33358a;

                public final void onFailure(String str, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{str, th}, this, f33358a, false, 21678, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th}, this, f33358a, false, 21678, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(a.this.getId(), 1));
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(a.this.getId(), 3));
                }

                public final void onSubmit(String str, Object obj) {
                    if (PatchProxy.isSupport(new Object[]{str, obj}, this, f33358a, false, 21676, new Class[]{String.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, obj}, this, f33358a, false, 21676, new Class[]{String.class, Object.class}, Void.TYPE);
                        return;
                    }
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(a.this.getId(), 4));
                }

                public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                    Animatable animatable2 = animatable;
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable2}, this, f33358a, false, 21677, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable2}, this, f33358a, false, 21677, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    a.this.i = animatable2;
                    a.this.a();
                    if (!(imageInfo == null || a.this.f33356e == null)) {
                        EventDispatcher eventDispatcher = eventDispatcher;
                        ImageLoadEvent imageLoadEvent = new ImageLoadEvent(a.this.getId(), 2, a.this.f33356e.getSource(), imageInfo.getWidth(), imageInfo.getHeight());
                        eventDispatcher.dispatchEvent(imageLoadEvent);
                        eventDispatcher.dispatchEvent(new ImageLoadEvent(a.this.getId(), 3));
                    }
                }
            };
        }
        this.h = true;
    }

    public void setShouldPlay(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33352a, false, 21662, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33352a, false, 21662, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.y != z) {
            this.y = z;
            a();
            this.h = true;
        }
    }

    public void setSource(@Nullable ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f33352a, false, 21666, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f33352a, false, 21666, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        this.k.clear();
        if (!(readableArray2 == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                this.k.add(new ImageSource(getContext(), readableArray2.getMap(0).getString("uri")));
            } else {
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    ReadableMap map = readableArray2.getMap(i2);
                    List<ImageSource> list = this.k;
                    ImageSource imageSource = new ImageSource(getContext(), map.getString("uri"), map.getDouble("width"), map.getDouble("height"));
                    list.add(imageSource);
                }
            }
        }
        this.h = true;
    }

    public final void a(float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{fArr}, this, f33352a, false, 21668, new Class[]{float[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fArr}, this, f33352a, false, 21668, new Class[]{float[].class}, Void.TYPE);
            return;
        }
        if (!com.facebook.yoga.a.a(this.q)) {
            f2 = this.q;
        } else {
            f2 = 0.0f;
        }
        if (this.f33357f == null || com.facebook.yoga.a.a(this.f33357f[0])) {
            f3 = f2;
        } else {
            f3 = this.f33357f[0];
        }
        fArr[0] = f3;
        if (this.f33357f == null || com.facebook.yoga.a.a(this.f33357f[1])) {
            f4 = f2;
        } else {
            f4 = this.f33357f[1];
        }
        fArr[1] = f4;
        if (this.f33357f == null || com.facebook.yoga.a.a(this.f33357f[2])) {
            f5 = f2;
        } else {
            f5 = this.f33357f[2];
        }
        fArr[2] = f5;
        if (this.f33357f != null && !com.facebook.yoga.a.a(this.f33357f[3])) {
            f2 = this.f33357f[3];
        }
        fArr[3] = f2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r19, com.facebook.drawee.controller.AbstractDraweeControllerBuilder r20, @javax.annotation.Nullable java.lang.Object r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f33352a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<com.facebook.drawee.generic.GenericDraweeHierarchy> r9 = com.facebook.drawee.generic.GenericDraweeHierarchy.class
            r4 = 0
            r6 = 1
            r7 = 21659(0x549b, float:3.0351E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0039
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f33352a
            r14 = 1
            r15 = 21659(0x549b, float:3.0351E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class<com.facebook.drawee.generic.GenericDraweeHierarchy> r17 = com.facebook.drawee.generic.GenericDraweeHierarchy.class
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.facebook.drawee.generic.GenericDraweeHierarchy r3 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r3
            goto L_0x004f
        L_0x0039:
            com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r3 = new com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
            android.content.res.Resources r4 = r19.getResources()
            r3.<init>(r4)
            r4 = 0
            com.facebook.drawee.generic.RoundingParams r4 = com.facebook.drawee.generic.RoundingParams.fromCornersRadius(r4)
            com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r3 = r3.setRoundingParams(r4)
            com.facebook.drawee.generic.GenericDraweeHierarchy r3 = r3.build()
        L_0x004f:
            r0.<init>((android.content.Context) r1, (com.facebook.drawee.generic.GenericDraweeHierarchy) r3)
            com.facebook.react.views.image.ImageResizeMethod r1 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r0.j = r1
            r1 = 1649989415(0x6258d727, float:1.0E21)
            r0.q = r1
            r1 = -1
            r0.w = r1
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r1 = com.facebook.react.views.image.ImageResizeMode.defaultValue()
            r0.g = r1
            r1 = r20
            r0.r = r1
            com.ss.android.ugc.aweme.animation.a$a r1 = new com.ss.android.ugc.aweme.animation.a$a
            r1.<init>(r0, r10)
            r0.s = r1
            r1 = r21
            r0.v = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.k = r1
            r0.y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.animation.a.<init>(android.content.Context, com.facebook.drawee.controller.AbstractDraweeControllerBuilder, java.lang.Object):void");
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f33352a, false, 21671, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f33352a, false, 21671, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i3 > 0) {
            if (this.h || c()) {
                z = true;
            }
            this.h = z;
            b();
        }
    }
}
