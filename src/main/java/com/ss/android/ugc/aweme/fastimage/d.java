package com.ss.android.ugc.aweme.fastimage;

import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.f.f;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.b;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.c;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.fastimage.a;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import java.util.List;
import javax.annotation.Nullable;

public class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44178a;

    /* renamed from: b  reason: collision with root package name */
    public static float[] f44179b = new float[4];

    /* renamed from: c  reason: collision with root package name */
    public static final Matrix f44180c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public static final Matrix f44181d = new Matrix();
    private Priority A;
    private ImageRequest.a B;

    /* renamed from: e  reason: collision with root package name */
    public ScalingUtils.ScaleType f44182e;

    /* renamed from: f  reason: collision with root package name */
    private ImageResizeMethod f44183f;
    private final List<ImageSource> g;
    @Nullable
    private ImageSource h;
    @Nullable
    private ImageSource i;
    @Nullable
    private Drawable j;
    private int k;
    private int l;
    private float m;
    private float n;
    @Nullable
    private float[] o;
    private boolean p;
    private final AbstractDraweeControllerBuilder q;
    private final a r;
    @Nullable
    private com.facebook.imagepipeline.d.a s;
    @Nullable
    private ControllerListener t;
    @Nullable
    private ControllerListener u;
    @Nullable
    private GlobalImageLoadListener v;
    @Nullable
    private final Object w;
    private int x;
    private boolean y;
    private ReadableMap z;

    class a extends BasePostprocessor {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44187a;

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
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
                com.meituan.robust.ChangeQuickRedirect r2 = f44187a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 39379(0x99d3, float:5.5182E-41)
                r1 = r26
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0047
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f44187a
                r3 = 0
                r4 = 39379(0x99d3, float:5.5182E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r11] = r1
                java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r26
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0047:
                com.ss.android.ugc.aweme.fastimage.d r0 = com.ss.android.ugc.aweme.fastimage.d.this
                float[] r1 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                r0.a((float[]) r1)
                r8.setHasAlpha(r12)
                float[] r0 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                r0 = r0[r11]
                r13 = 0
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                r14 = 3
                if (r0 == 0) goto L_0x007f
                float[] r0 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                r0 = r0[r12]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007f
                float[] r0 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                r0 = r0[r10]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007f
                float[] r0 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                r0 = r0[r14]
                boolean r0 = com.facebook.react.uimanager.FloatUtil.floatsEqual(r0, r13)
                if (r0 == 0) goto L_0x007f
                super.process((android.graphics.Bitmap) r27, (android.graphics.Bitmap) r28)
                return
            L_0x007f:
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
                float[] r16 = com.ss.android.ugc.aweme.fastimage.d.f44179b
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r11] = r9
                r0[r12] = r16
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f44187a
                r3 = 0
                r4 = 39378(0x99d2, float:5.518E-41)
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
                if (r0 == 0) goto L_0x00ea
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r11] = r9
                r0[r12] = r16
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f44187a
                r3 = 0
                r4 = 39378(0x99d2, float:5.518E-41)
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
                goto L_0x0153
            L_0x00ea:
                com.ss.android.ugc.aweme.fastimage.d r0 = com.ss.android.ugc.aweme.fastimage.d.this
                com.facebook.drawee.drawable.ScalingUtils$ScaleType r0 = r0.f44182e
                android.graphics.Matrix r20 = com.ss.android.ugc.aweme.fastimage.d.f44180c
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
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.fastimage.d.f44180c
                android.graphics.Matrix r1 = com.ss.android.ugc.aweme.fastimage.d.f44181d
                r0.invert(r1)
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.fastimage.d.f44181d
                r1 = r16[r11]
                float r0 = r0.mapRadius(r1)
                r8[r11] = r0
                r0 = r8[r11]
                r8[r12] = r0
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.fastimage.d.f44181d
                r1 = r16[r12]
                float r0 = r0.mapRadius(r1)
                r8[r10] = r0
                r0 = r8[r10]
                r8[r14] = r0
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.fastimage.d.f44181d
                r1 = r16[r10]
                float r0 = r0.mapRadius(r1)
                r1 = 4
                r8[r1] = r0
                r0 = 5
                r1 = r8[r1]
                r8[r0] = r1
                android.graphics.Matrix r0 = com.ss.android.ugc.aweme.fastimage.d.f44181d
                r1 = r16[r14]
                float r0 = r0.mapRadius(r1)
                r1 = 6
                r8[r1] = r0
                r0 = 7
                r1 = r8[r1]
                r8[r0] = r1
            L_0x0153:
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fastimage.d.a.process(android.graphics.Bitmap, android.graphics.Bitmap):void");
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f44178a, false, 39372, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44178a, false, 39372, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g.size() > 1) {
            return true;
        } else {
            return false;
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f44178a, false, 39373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44178a, false, 39373, new Class[0], Void.TYPE);
            return;
        }
        this.h = null;
        if (!this.g.isEmpty()) {
            if (b()) {
                MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.g);
                this.h = bestSourceForSize.getBestResult();
                this.i = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.h = this.g.get(0);
        }
    }

    public final void a() {
        boolean z2;
        int i2;
        Postprocessor postprocessor;
        if (PatchProxy.isSupport(new Object[0], this, f44178a, false, 39369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44178a, false, 39369, new Class[0], Void.TYPE);
        } else if (this.p) {
            if (!b() || (getWidth() > 0 && getHeight() > 0)) {
                c();
                if (this.h != null) {
                    boolean a2 = a(this.h);
                    if (!a2 || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) getHierarchy();
                        genericDraweeHierarchy.setActualImageScaleType(this.f44182e);
                        if (this.j != null) {
                            genericDraweeHierarchy.setPlaceholderImage(this.j, ScalingUtils.ScaleType.CENTER);
                        }
                        if (this.f44182e == ScalingUtils.ScaleType.CENTER_CROP || this.f44182e == ScalingUtils.ScaleType.FOCUS_CROP) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        RoundingParams roundingParams = genericDraweeHierarchy.getRoundingParams();
                        if (z2) {
                            roundingParams.setCornersRadius(0.0f);
                        } else {
                            a(f44179b);
                            roundingParams.setCornersRadii(f44179b[0], f44179b[1], f44179b[2], f44179b[3]);
                        }
                        roundingParams.setBorder(this.k, this.m);
                        if (this.l != 0) {
                            roundingParams.setOverlayColor(this.l);
                        } else {
                            roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
                        }
                        genericDraweeHierarchy.setRoundingParams(roundingParams);
                        if (this.x >= 0) {
                            i2 = this.x;
                        } else if (this.h.isResource()) {
                            i2 = 0;
                        } else {
                            i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                        }
                        genericDraweeHierarchy.setFadeDuration(i2);
                        ResizeOptions resizeOptions = null;
                        if (z2) {
                            postprocessor = this.r;
                        } else if (this.s != null) {
                            postprocessor = this.s;
                        } else {
                            postprocessor = null;
                        }
                        if (a2) {
                            resizeOptions = new ResizeOptions(getWidth(), getHeight());
                        }
                        ImageRequestBuilder progressiveRenderingEnabled = ImageRequestBuilder.newBuilderWithSource(this.h.getUri()).setPostprocessor(postprocessor).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.y);
                        if (!(ReactInstance.getConfig() == null || ReactInstance.getConfig().e() == null)) {
                            progressiveRenderingEnabled.setImageDecodeOptions(ReactInstance.getConfig().e());
                        }
                        if (this.A != null) {
                            progressiveRenderingEnabled.setRequestPriority(this.A);
                        }
                        if (this.B != null) {
                            progressiveRenderingEnabled.setLowestPermittedRequestLevel(this.B);
                        }
                        new c().a(progressiveRenderingEnabled);
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(progressiveRenderingEnabled, this.z);
                        if (this.v != null) {
                            this.v.onLoadAttempt(this.h.getUri());
                        }
                        this.q.reset();
                        this.q.setAutoPlayAnimations(true).setCallerContext(this.w).setOldController(getController()).setImageRequest(fromBuilderWithHeaders);
                        if (this.i != null) {
                            this.q.setLowResImageRequest(ImageRequestBuilder.newBuilderWithSource(this.i.getUri()).setPostprocessor(postprocessor).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.y).build());
                        }
                        if (this.t != null && this.u != null) {
                            com.facebook.drawee.controller.c cVar = new com.facebook.drawee.controller.c();
                            cVar.a(this.t);
                            cVar.a(this.u);
                            this.q.setControllerListener(cVar);
                        } else if (this.u != null) {
                            this.q.setControllerListener(this.u);
                        } else if (this.t != null) {
                            this.q.setControllerListener(this.t);
                        }
                        setController(this.q.build());
                        this.p = false;
                        this.q.reset();
                    }
                }
            }
        }
    }

    public void setFadeDuration(int i2) {
        this.x = i2;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.z = readableMap;
    }

    public void setProgressiveRenderingEnabled(boolean z2) {
        this.y = z2;
    }

    public void setBorderColor(int i2) {
        this.k = i2;
        this.p = true;
    }

    public void setOverlayColor(int i2) {
        this.l = i2;
        this.p = true;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.f44183f = imageResizeMethod;
        this.p = true;
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.f44182e = scaleType;
        this.p = true;
    }

    public void setControllerListener(ControllerListener controllerListener) {
        if (PatchProxy.isSupport(new Object[]{controllerListener}, this, f44178a, false, 39370, new Class[]{ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{controllerListener}, this, f44178a, false, 39370, new Class[]{ControllerListener.class}, Void.TYPE);
            return;
        }
        this.u = controllerListener;
        this.p = true;
        a();
    }

    private boolean a(ImageSource imageSource) {
        if (PatchProxy.isSupport(new Object[]{imageSource}, this, f44178a, false, 39374, new Class[]{ImageSource.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageSource}, this, f44178a, false, 39374, new Class[]{ImageSource.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f44183f == ImageResizeMethod.AUTO) {
            if (f.d(imageSource.getUri()) || f.c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.f44183f == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void setBlurRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39361, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39361, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(f2);
        if (pixelFromDIP == 0) {
            this.s = null;
        } else {
            this.s = new com.facebook.imagepipeline.d.a(pixelFromDIP);
        }
        this.p = true;
    }

    public void setBorderRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39363, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39363, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (!FloatUtil.floatsEqual(this.n, f2)) {
            this.n = f2;
            this.p = true;
        }
    }

    public void setBorderWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39362, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44178a, false, 39362, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.m = PixelUtil.toPixelFromDIP(f2);
        this.p = true;
    }

    public void setLoadingIndicatorSource(@Nullable String str) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{str}, this, f44178a, false, 39367, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f44178a, false, 39367, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new b(resourceDrawable, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        } else {
            bVar = null;
        }
        this.j = bVar;
        this.p = true;
    }

    public void setShouldNotifyLoadEvents(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f44178a, false, 39360, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f44178a, false, 39360, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            this.t = null;
        } else {
            final RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class);
            this.t = new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44184a;

                public final void onFailure(String str, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{str, th}, this, f44184a, false, 39377, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th}, this, f44184a, false, 39377, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    rCTEventEmitter.receiveEvent(d.this.getId(), "onFastImageError", new WritableNativeMap());
                    rCTEventEmitter.receiveEvent(d.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                }

                public final void onSubmit(String str, Object obj) {
                    if (PatchProxy.isSupport(new Object[]{str, obj}, this, f44184a, false, 39375, new Class[]{String.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, obj}, this, f44184a, false, 39375, new Class[]{String.class, Object.class}, Void.TYPE);
                        return;
                    }
                    rCTEventEmitter.receiveEvent(d.this.getId(), "onFastImageLoadStart", new WritableNativeMap());
                }

                public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                    WritableMap writableMap;
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f44184a, false, 39376, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f44184a, false, 39376, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    if (imageInfo != null) {
                        RCTEventEmitter rCTEventEmitter = rCTEventEmitter;
                        int id = d.this.getId();
                        if (PatchProxy.isSupport(new Object[]{imageInfo}, null, d.f44178a, true, 39359, new Class[]{ImageInfo.class}, WritableMap.class)) {
                            writableMap = (WritableMap) PatchProxy.accessDispatch(new Object[]{imageInfo}, null, d.f44178a, true, 39359, new Class[]{ImageInfo.class}, WritableMap.class);
                        } else {
                            writableMap = new WritableNativeMap();
                            writableMap.putInt("width", imageInfo.getWidth());
                            writableMap.putInt("height", imageInfo.getHeight());
                        }
                        rCTEventEmitter.receiveEvent(id, "onFastImageLoad", writableMap);
                        rCTEventEmitter.receiveEvent(d.this.getId(), "onFastImageLoadEnd", new WritableNativeMap());
                    }
                }
            };
        }
        this.p = true;
    }

    public final void a(float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{fArr}, this, f44178a, false, 39368, new Class[]{float[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fArr}, this, f44178a, false, 39368, new Class[]{float[].class}, Void.TYPE);
            return;
        }
        if (!com.facebook.yoga.a.a(this.n)) {
            f2 = this.n;
        } else {
            f2 = 0.0f;
        }
        if (this.o == null || com.facebook.yoga.a.a(this.o[0])) {
            f3 = f2;
        } else {
            f3 = this.o[0];
        }
        fArr[0] = f3;
        if (this.o == null || com.facebook.yoga.a.a(this.o[1])) {
            f4 = f2;
        } else {
            f4 = this.o[1];
        }
        fArr[1] = f4;
        if (this.o == null || com.facebook.yoga.a.a(this.o[2])) {
            f5 = f2;
        } else {
            f5 = this.o[2];
        }
        fArr[2] = f5;
        if (this.o != null && !com.facebook.yoga.a.a(this.o[3])) {
            f2 = this.o[3];
        }
        fArr[3] = f2;
    }

    public void setSource(@Nullable ReadableMap readableMap) {
        boolean z2;
        Priority priority;
        ImageRequest.a aVar;
        ReadableMap readableMap2 = readableMap;
        if (PatchProxy.isSupport(new Object[]{readableMap2}, this, f44178a, false, 39366, new Class[]{ReadableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableMap2}, this, f44178a, false, 39366, new Class[]{ReadableMap.class}, Void.TYPE);
            return;
        }
        this.g.clear();
        if (readableMap2 != null && readableMap2.hasKey("uri")) {
            String string = readableMap2.getString("uri");
            if (PatchProxy.isSupport(new Object[]{string}, this, f44178a, false, 39365, new Class[]{String.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{string}, this, f44178a, false, 39365, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (string == null || string.trim().isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ImageSource imageSource = new ImageSource(getContext(), readableMap2.getString("uri"));
                this.g.add(imageSource);
                Uri.EMPTY.equals(imageSource.getUri());
                if (readableMap2.hasKey("headers")) {
                    ReadableMap map = readableMap2.getMap("headers");
                    if (map != null) {
                        setHeaders(map);
                    }
                }
                if (PatchProxy.isSupport(new Object[]{readableMap2}, null, a.f44166a, true, 39328, new Class[]{ReadableMap.class}, Priority.class)) {
                    priority = (Priority) PatchProxy.accessDispatch(new Object[]{readableMap2}, null, a.f44166a, true, 39328, new Class[]{ReadableMap.class}, Priority.class);
                } else {
                    priority = (Priority) a.a("priority", "normal", a.f44168c, readableMap2);
                }
                this.A = priority;
                if (PatchProxy.isSupport(new Object[]{readableMap2}, null, a.f44166a, true, 39329, new Class[]{ReadableMap.class}, ImageRequest.a.class)) {
                    aVar = (ImageRequest.a) PatchProxy.accessDispatch(new Object[]{readableMap2}, null, a.f44166a, true, 39329, new Class[]{ReadableMap.class}, ImageRequest.a.class);
                } else {
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.FALSE;
                    switch (a.AnonymousClass4.f44171a[((a.C0552a) a.a("cache", "immutable", a.f44167b, readableMap2)).ordinal()]) {
                        case 1:
                            bool2 = Boolean.TRUE;
                            break;
                        case 2:
                            bool = Boolean.TRUE;
                            break;
                    }
                    if (bool2.booleanValue()) {
                        aVar = ImageRequest.a.FULL_FETCH;
                    } else if (bool.booleanValue()) {
                        aVar = ImageRequest.a.DISK_CACHE;
                    } else {
                        aVar = null;
                    }
                }
                this.B = aVar;
                setShouldNotifyLoadEvents(true);
            }
        }
        this.p = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r19, com.facebook.drawee.controller.AbstractDraweeControllerBuilder r20, @javax.annotation.Nullable com.facebook.react.views.image.GlobalImageLoadListener r21, @javax.annotation.Nullable java.lang.Object r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f44178a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<com.facebook.drawee.generic.GenericDraweeHierarchy> r9 = com.facebook.drawee.generic.GenericDraweeHierarchy.class
            r4 = 0
            r6 = 1
            r7 = 39358(0x99be, float:5.5152E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x003b
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f44178a
            r14 = 1
            r15 = 39358(0x99be, float:5.5152E-41)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class<com.facebook.drawee.generic.GenericDraweeHierarchy> r17 = com.facebook.drawee.generic.GenericDraweeHierarchy.class
            r16 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            goto L_0x0051
        L_0x003b:
            com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r2 = new com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
            android.content.res.Resources r3 = r19.getResources()
            r2.<init>(r3)
            r3 = 0
            com.facebook.drawee.generic.RoundingParams r3 = com.facebook.drawee.generic.RoundingParams.fromCornersRadius(r3)
            com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r2 = r2.setRoundingParams(r3)
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = r2.build()
        L_0x0051:
            r0.<init>((android.content.Context) r1, (com.facebook.drawee.generic.GenericDraweeHierarchy) r2)
            com.facebook.react.views.image.ImageResizeMethod r1 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r0.f44183f = r1
            r1 = 1649989415(0x6258d727, float:1.0E21)
            r0.n = r1
            r1 = -1
            r0.x = r1
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r1 = com.facebook.react.views.image.ImageResizeMode.defaultValue()
            r0.f44182e = r1
            r1 = r20
            r0.q = r1
            com.ss.android.ugc.aweme.fastimage.d$a r1 = new com.ss.android.ugc.aweme.fastimage.d$a
            r1.<init>(r0, r10)
            r0.r = r1
            r1 = r21
            r0.v = r1
            r1 = r22
            r0.w = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fastimage.d.<init>(android.content.Context, com.facebook.drawee.controller.AbstractDraweeControllerBuilder, com.facebook.react.views.image.GlobalImageLoadListener, java.lang.Object):void");
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f44178a, false, 39371, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f44178a, false, 39371, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i3 > 0) {
            if (this.p || b()) {
                z2 = true;
            }
            this.p = z2;
            a();
        }
    }
}
