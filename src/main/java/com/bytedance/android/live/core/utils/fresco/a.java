package com.bytedance.android.live.core.utils.fresco;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8257a;
    private ColorFilter A = null;
    private List<Drawable> B = null;
    private Drawable C = null;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;

    /* renamed from: b  reason: collision with root package name */
    public DraweeHolder<DraweeHierarchy> f8258b = null;

    /* renamed from: c  reason: collision with root package name */
    public RoundingParams f8259c = null;

    /* renamed from: d  reason: collision with root package name */
    private Context f8260d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8261e;

    /* renamed from: f  reason: collision with root package name */
    private C0063a f8262f = null;
    private Postprocessor g = null;
    private ControllerListener h = null;
    private Uri i;
    private Uri j;
    private ImageModel k;
    private ResizeOptions l;
    private float m = 0.0f;
    private boolean n = true;
    private int o = c.f69428f;
    private Drawable p = null;
    private Drawable q = null;
    private Drawable r = null;
    private Drawable s = null;
    private Drawable t = null;
    private ScalingUtils.ScaleType u = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    private ScalingUtils.ScaleType v = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    private ScalingUtils.ScaleType w = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    private ScalingUtils.ScaleType x = GenericDraweeHierarchyBuilder.DEFAULT_SCALE_TYPE;
    private ScalingUtils.ScaleType y = GenericDraweeHierarchyBuilder.DEFAULT_ACTUAL_IMAGE_SCALE_TYPE;
    private PointF z = null;

    /* renamed from: com.bytedance.android.live.core.utils.fresco.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8263a = new int[ImageView.ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8263a = r0
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f8263a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.fresco.a.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.live.core.utils.fresco.a$a  reason: collision with other inner class name */
    class C0063a implements View.OnAttachStateChangeListener, View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8264a;

        private C0063a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8264a, false, 1361, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8264a, false, 1361, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (a.this.f8258b != null) {
                a.this.f8258b.onAttach();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f8264a, false, 1362, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f8264a, false, 1362, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (a.this.f8258b != null) {
                a.this.f8258b.onDetach();
            }
        }

        /* synthetic */ C0063a(a aVar, byte b2) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f8264a, false, 1365, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f8264a, false, 1365, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (a.this.f8258b == null || !a.this.f8258b.onTouchEvent(motionEvent)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final a a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f8257a, false, 1323, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f8257a, false, 1323, new Class[]{String.class}, a.class);
        }
        return a(Uri.parse(str));
    }

    public final a a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8257a, false, 1329, new Class[]{Integer.TYPE}, a.class)) {
            return a(com.ss.android.ugc.bytex.a.a.a.a(this.f8260d.getResources(), i2));
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8257a, false, 1329, new Class[]{Integer.TYPE}, a.class);
    }

    public final a a(ImageView.ScaleType scaleType) {
        if (PatchProxy.isSupport(new Object[]{scaleType}, this, f8257a, false, 1338, new Class[]{ImageView.ScaleType.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{scaleType}, this, f8257a, false, 1338, new Class[]{ImageView.ScaleType.class}, a.class);
        }
        this.y = a(scaleType, GenericDraweeHierarchyBuilder.DEFAULT_ACTUAL_IMAGE_SCALE_TYPE);
        return this;
    }

    public final a a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8257a, false, 1355, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8257a, false, 1355, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
        }
        this.l = new ResizeOptions(i2, i3);
        return this;
    }

    public final void a(ImageView imageView) {
        if (PatchProxy.isSupport(new Object[]{imageView}, this, f8257a, false, 1356, new Class[]{ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView}, this, f8257a, false, 1356, new Class[]{ImageView.class}, Void.TYPE);
        } else if (imageView != null) {
            if (this.i != null || this.k != null) {
                if (this.f8258b == null) {
                    Object a2 = h.a(imageView);
                    if (a2 instanceof DraweeHolder) {
                        this.f8258b = (DraweeHolder) a2;
                    }
                }
                if (this.l == null && imageView.getMeasuredWidth() > 0 && imageView.getMeasuredHeight() > 0) {
                    a(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
                }
                if (this.f8258b == null) {
                    this.f8258b = DraweeHolder.create(null, imageView.getContext());
                    if (this.f8262f == null) {
                        this.f8262f = new C0063a(this, (byte) 0);
                    }
                    this.f8258b.setHierarchy(new GenericDraweeHierarchyBuilder(imageView.getResources()).setPlaceholderImage(this.p).setPlaceholderImageScaleType(this.u).setFailureImage(this.r).setFailureImageScaleType(this.w).setProgressBarImage(this.s).setProgressBarImageScaleType(this.x).setRetryImage(this.q).setRetryImageScaleType(this.v).setFadeDuration(this.o).setActualImageFocusPoint(this.z).setActualImageColorFilter(this.A).setActualImageScaleType(this.y).setBackground(this.t).setOverlays(this.B).setPressedStateOverlay(this.C).setRoundingParams(this.f8259c).build());
                    ImageRequest[] a3 = a(this.i, this.k, this.l, this.g);
                    if (a3 != null && a3.length != 0) {
                        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(this.E)).setControllerListener(this.h)).setOldController(this.f8258b.getController())).setFirstAvailableImageRequests(a3)).setRetainImageOnFailure(this.F)).setTapToRetryEnabled(this.D);
                        if (this.j != null) {
                            pipelineDraweeControllerBuilder.setLowResImageRequest(ImageRequest.fromUri(this.j));
                        }
                        this.f8258b.setController(pipelineDraweeControllerBuilder.build());
                        if (this.f8261e) {
                            b.a(imageView, this.f8262f);
                        } else {
                            if (a((View) imageView)) {
                                this.f8262f.onViewAttachedToWindow(imageView);
                            }
                            imageView.addOnAttachStateChangeListener(this.f8262f);
                        }
                        imageView.setOnTouchListener(this.f8262f);
                        h.a((View) imageView, (Object) this.f8258b);
                    } else {
                        return;
                    }
                } else {
                    this.f8258b.onDetach();
                    this.f8258b.setHierarchy(new GenericDraweeHierarchyBuilder(imageView.getResources()).setPlaceholderImage(this.p).setPlaceholderImageScaleType(this.u).setFailureImage(this.r).setFailureImageScaleType(this.w).setProgressBarImage(this.s).setProgressBarImageScaleType(this.x).setRetryImage(this.q).setRetryImageScaleType(this.v).setFadeDuration(this.o).setActualImageFocusPoint(this.z).setActualImageColorFilter(this.A).setActualImageScaleType(this.y).setBackground(this.t).setOverlays(this.B).setPressedStateOverlay(this.C).setRoundingParams(this.f8259c).build());
                    ImageRequest[] a4 = a(this.i, this.k, this.l, this.g);
                    if (a4 != null && a4.length != 0) {
                        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder2 = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(this.E)).setControllerListener(this.h)).setFirstAvailableImageRequests(a4)).setOldController(this.f8258b.getController())).setRetainImageOnFailure(this.F)).setTapToRetryEnabled(this.D);
                        if (this.j != null) {
                            pipelineDraweeControllerBuilder2.setLowResImageRequest(ImageRequest.fromUri(this.j));
                        }
                        this.f8258b.setController(pipelineDraweeControllerBuilder2.build());
                        this.f8258b.onAttach();
                    } else {
                        return;
                    }
                }
                if (this.m != 0.0f) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        int i2 = layoutParams.width;
                        int i3 = layoutParams.height;
                        if (this.n) {
                            if (i2 > 0 && i3 == 0) {
                                double d2 = (double) i2;
                                Double.isNaN(d2);
                                double d3 = (double) this.m;
                                Double.isNaN(d3);
                                i3 = (int) (((d2 * 1.0d) / d3) + 0.5d);
                                if (!(i2 == -1 || i3 == -1)) {
                                    layoutParams.width = i2;
                                    layoutParams.height = i3;
                                    imageView.requestLayout();
                                }
                            }
                        } else if (i3 > 0 && i2 == 0) {
                            i2 = (int) ((((float) i3) * this.m) + 0.5f);
                            layoutParams.width = i2;
                            layoutParams.height = i3;
                            imageView.requestLayout();
                        }
                        i2 = -1;
                        i3 = -1;
                        layoutParams.width = i2;
                        layoutParams.height = i3;
                        imageView.requestLayout();
                    }
                }
                imageView.setImageDrawable(this.f8258b.getTopLevelDrawable());
            }
        }
    }

    public final a a() {
        if (PatchProxy.isSupport(new Object[0], this, f8257a, false, 1347, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f8257a, false, 1347, new Class[0], a.class);
        }
        if (this.f8259c == null) {
            this.f8259c = new RoundingParams();
        }
        this.f8259c.setRoundAsCircle(true);
        return this;
    }

    private a a(Drawable drawable) {
        this.p = drawable;
        return this;
    }

    public final a a(Uri uri) {
        this.i = uri;
        return this;
    }

    public final a a(ImageModel imageModel) {
        this.k = imageModel;
        return this;
    }

    @Deprecated
    public final a a(ControllerListener controllerListener) {
        this.h = controllerListener;
        return this;
    }

    private a(Context context) {
        this.f8260d = context.getApplicationContext();
    }

    public static a a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f8257a, true, 1322, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f8257a, true, 1322, new Class[]{Context.class}, a.class);
        } else if (context2 != null) {
            return new a(context2);
        } else {
            throw new IllegalArgumentException("appContext == null");
        }
    }

    private static boolean a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f8257a, true, 1357, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f8257a, true, 1357, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        } else {
            if (view.getWindowToken() != null) {
                return true;
            }
            return false;
        }
    }

    private static ScalingUtils.ScaleType a(ImageView.ScaleType scaleType, ScalingUtils.ScaleType scaleType2) {
        if (PatchProxy.isSupport(new Object[]{scaleType, scaleType2}, null, f8257a, true, 1358, new Class[]{ImageView.ScaleType.class, ScalingUtils.ScaleType.class}, ScalingUtils.ScaleType.class)) {
            return (ScalingUtils.ScaleType) PatchProxy.accessDispatch(new Object[]{scaleType, scaleType2}, null, f8257a, true, 1358, new Class[]{ImageView.ScaleType.class, ScalingUtils.ScaleType.class}, ScalingUtils.ScaleType.class);
        }
        switch (AnonymousClass1.f8263a[scaleType.ordinal()]) {
            case 1:
                return ScalingUtils.ScaleType.CENTER;
            case 2:
                return ScalingUtils.ScaleType.CENTER_CROP;
            case 3:
                return ScalingUtils.ScaleType.CENTER_INSIDE;
            case 4:
                return ScalingUtils.ScaleType.FIT_CENTER;
            case 5:
                return ScalingUtils.ScaleType.FIT_START;
            case 6:
                return ScalingUtils.ScaleType.FIT_END;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return ScalingUtils.ScaleType.FIT_XY;
            case 8:
                return ScalingUtils.ScaleType.FOCUS_CROP;
            default:
                return scaleType2;
        }
    }

    private static ImageRequest a(Uri uri, ResizeOptions resizeOptions) {
        ResizeOptions resizeOptions2 = resizeOptions;
        if (PatchProxy.isSupport(new Object[]{uri, resizeOptions2}, null, f8257a, true, 1360, new Class[]{Uri.class, ResizeOptions.class}, ImageRequest.class)) {
            return (ImageRequest) PatchProxy.accessDispatch(new Object[]{uri, resizeOptions2}, null, f8257a, true, 1360, new Class[]{Uri.class, ResizeOptions.class}, ImageRequest.class);
        } else if (uri == null) {
            return null;
        } else {
            ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(uri);
            if (resizeOptions2 != null) {
                newBuilderWithSource.setResizeOptions(resizeOptions2);
            }
            return newBuilderWithSource.build();
        }
    }

    private static ImageRequest[] a(Uri uri, ImageModel imageModel, ResizeOptions resizeOptions, Postprocessor postprocessor) {
        Uri uri2 = uri;
        ResizeOptions resizeOptions2 = resizeOptions;
        Postprocessor postprocessor2 = postprocessor;
        if (PatchProxy.isSupport(new Object[]{uri2, imageModel, resizeOptions2, postprocessor2}, null, f8257a, true, 1359, new Class[]{Uri.class, ImageModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class)) {
            Object[] objArr = {uri2, imageModel, resizeOptions2, postprocessor2};
            return (ImageRequest[]) PatchProxy.accessDispatch(objArr, null, f8257a, true, 1359, new Class[]{Uri.class, ImageModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class);
        } else if (uri2 == null && (imageModel == null || Lists.isEmpty(imageModel.getUrls()))) {
            return new ImageRequest[0];
        } else {
            ArrayList arrayList = new ArrayList();
            ImageRequest a2 = a(uri2, resizeOptions2);
            if (a2 != null) {
                arrayList.add(a2);
            }
            if (imageModel != null && !Lists.isEmpty(imageModel.getUrls())) {
                c cVar = new c();
                for (String next : imageModel.getUrls()) {
                    if (!StringUtils.isEmpty(next)) {
                        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(next));
                        if (postprocessor2 != null) {
                            newBuilderWithSource.setPostprocessor(postprocessor2);
                        }
                        if (resizeOptions2 != null) {
                            newBuilderWithSource.setResizeOptions(resizeOptions2);
                        }
                        cVar.a(newBuilderWithSource);
                        arrayList.add(newBuilderWithSource.build());
                    }
                }
            }
            if (arrayList.size() == 0) {
                return new ImageRequest[0];
            }
            return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
        }
    }
}
