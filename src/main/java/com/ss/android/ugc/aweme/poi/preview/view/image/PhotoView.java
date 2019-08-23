package com.ss.android.ugc.aweme.poi.preview.view.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PhotoView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60222a;
    public PointF A = new PointF();
    public f B = new f();
    public RectF C;
    public Runnable D;
    public View.OnLongClickListener E;
    public Runnable F = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60230a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f60230a, false, 65552, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60230a, false, 65552, new Class[0], Void.TYPE);
                return;
            }
            if (PhotoView.this.g != null) {
                PhotoView.this.g.onClick(PhotoView.this);
            }
        }
    };
    private int G;
    private int H;
    private int I;
    private int J = 500;
    private Matrix K = new Matrix();
    private Matrix L = new Matrix();
    private GestureDetector M;
    private ScaleGestureDetector N;
    private ImageView.ScaleType O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private PointF T = new PointF();
    private a U;
    private long V;
    private ScaleGestureDetector.OnScaleGestureListener W = new ScaleGestureDetector.OnScaleGestureListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60228a;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f60228a, false, 65551, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f60228a, false, 65551, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            PhotoView.this.p *= scaleFactor;
            if (PhotoView.this.p > 1.0f) {
                PhotoView.this.k = true;
            } else {
                PhotoView.this.k = false;
            }
            PhotoView.this.f60226e.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            PhotoView.this.b();
            return true;
        }
    };
    private GestureDetector.OnGestureListener aa = new GestureDetector.SimpleOnGestureListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60232a;

        public final boolean onDown(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60232a, false, 65554, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60232a, false, 65554, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            PhotoView.this.i = false;
            PhotoView.this.h = false;
            PhotoView.this.l = false;
            PhotoView.this.removeCallbacks(PhotoView.this.F);
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60232a, false, 65553, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60232a, false, 65553, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            if (PhotoView.this.E != null) {
                PhotoView.this.E.onLongClick(PhotoView.this);
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60232a, false, 65557, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60232a, false, 65557, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            PhotoView.this.postDelayed(PhotoView.this.F, 250);
            return false;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f2;
            float f3;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60232a, false, 65558, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60232a, false, 65558, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            PhotoView.this.B.b();
            float width = PhotoView.this.w.left + (PhotoView.this.w.width() / 2.0f);
            float height = PhotoView.this.w.top + (PhotoView.this.w.height() / 2.0f);
            PhotoView.this.z.set(width, height);
            PhotoView.this.A.set(width, height);
            PhotoView.this.q = 0;
            PhotoView.this.r = 0;
            if (PhotoView.this.k) {
                f3 = PhotoView.this.p;
                f2 = 1.0f;
            } else {
                f3 = PhotoView.this.p;
                f2 = PhotoView.this.f60224c;
                PhotoView.this.z.set(motionEvent.getX(), motionEvent.getY());
            }
            PhotoView.this.f60227f.reset();
            PhotoView.this.f60227f.postTranslate(-PhotoView.this.v.left, -PhotoView.this.v.top);
            PhotoView.this.f60227f.postTranslate(PhotoView.this.A.x, PhotoView.this.A.y);
            PhotoView.this.f60227f.postTranslate(-PhotoView.this.s, -PhotoView.this.t);
            PhotoView.this.f60227f.postRotate(PhotoView.this.o, PhotoView.this.A.x, PhotoView.this.A.y);
            PhotoView.this.f60227f.postScale(f2, f2, PhotoView.this.z.x, PhotoView.this.z.y);
            PhotoView.this.f60227f.postTranslate((float) PhotoView.this.q, (float) PhotoView.this.r);
            PhotoView.this.f60227f.mapRect(PhotoView.this.x, PhotoView.this.v);
            PhotoView.this.a(PhotoView.this.x);
            PhotoView.this.k = !PhotoView.this.k;
            PhotoView.this.B.a(f3, f2);
            PhotoView.this.B.a();
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            float f4;
            float f5;
            int i;
            float f6;
            int i2;
            int i3;
            int i4;
            float f7;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f60232a, false, 65555, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f60232a, false, 65555, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (PhotoView.this.h) {
                return false;
            } else {
                if ((!PhotoView.this.m && !PhotoView.this.n) || PhotoView.this.B.f60242b) {
                    return false;
                }
                if (((float) Math.round(PhotoView.this.w.left)) >= PhotoView.this.u.left || ((float) Math.round(PhotoView.this.w.right)) <= PhotoView.this.u.right) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if (((float) Math.round(PhotoView.this.w.top)) >= PhotoView.this.u.top || ((float) Math.round(PhotoView.this.w.bottom)) <= PhotoView.this.u.bottom) {
                    f5 = 0.0f;
                } else {
                    f5 = f3;
                }
                if (PhotoView.this.l || PhotoView.this.o % 90.0f != 0.0f) {
                    float f8 = (float) (((int) (PhotoView.this.o / 90.0f)) * 90);
                    float f9 = PhotoView.this.o % 90.0f;
                    if (f9 > 45.0f) {
                        f8 += 90.0f;
                    } else if (f9 < -45.0f) {
                        f8 -= 90.0f;
                    }
                    PhotoView.this.B.a((int) PhotoView.this.o, (int) f8);
                    PhotoView.this.o = f8;
                }
                PhotoView.this.a(PhotoView.this.w);
                f fVar = PhotoView.this.B;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, fVar, f.f60241a, false, 65566, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    f fVar2 = fVar;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, fVar2, f.f60241a, false, 65566, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                } else {
                    if (f4 < 0.0f) {
                        i = Integer.MAX_VALUE;
                    } else {
                        i = 0;
                    }
                    fVar.i = i;
                    if (f4 > 0.0f) {
                        f6 = Math.abs(PhotoView.this.w.left);
                    } else {
                        f6 = PhotoView.this.w.right - PhotoView.this.u.right;
                    }
                    int i13 = (int) f6;
                    if (f4 < 0.0f) {
                        i13 = Integer.MAX_VALUE - i13;
                    }
                    if (f4 < 0.0f) {
                        i2 = i13;
                    } else {
                        i2 = 0;
                    }
                    if (f4 < 0.0f) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = i13;
                    }
                    if (f4 < 0.0f) {
                        i13 = Integer.MAX_VALUE - i2;
                    }
                    if (f5 < 0.0f) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 0;
                    }
                    fVar.j = i4;
                    if (f5 > 0.0f) {
                        f7 = Math.abs(PhotoView.this.w.top);
                    } else {
                        f7 = PhotoView.this.w.bottom - PhotoView.this.u.bottom;
                    }
                    int i14 = (int) f7;
                    if (f5 < 0.0f) {
                        i14 = Integer.MAX_VALUE - i14;
                    }
                    if (f5 < 0.0f) {
                        i5 = i14;
                    } else {
                        i5 = 0;
                    }
                    if (f5 < 0.0f) {
                        i6 = Integer.MAX_VALUE;
                    } else {
                        i6 = i14;
                    }
                    if (f5 < 0.0f) {
                        i14 = Integer.MAX_VALUE - i5;
                    }
                    if (f4 == 0.0f) {
                        i8 = 0;
                        i7 = 0;
                    } else {
                        i8 = i2;
                        i7 = i3;
                    }
                    if (f5 == 0.0f) {
                        i10 = 0;
                        i9 = 0;
                    } else {
                        i10 = i5;
                        i9 = i6;
                    }
                    OverScroller overScroller = fVar.f60244d;
                    int i15 = fVar.i;
                    int i16 = fVar.j;
                    int i17 = (int) f4;
                    int i18 = (int) f5;
                    if (Math.abs(i13) < PhotoView.this.f60225d * 2) {
                        i11 = 0;
                    } else {
                        i11 = PhotoView.this.f60225d;
                    }
                    if (Math.abs(i14) < PhotoView.this.f60225d * 2) {
                        i12 = 0;
                    } else {
                        i12 = PhotoView.this.f60225d;
                    }
                    overScroller.fling(i15, i16, i17, i18, i8, i7, i10, i9, i11, i12);
                }
                PhotoView.this.B.a();
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            float f4;
            float f5;
            float f6 = f2;
            float f7 = f3;
            if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f60232a, false, 65556, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f60232a, false, 65556, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (PhotoView.this.B.f60242b) {
                PhotoView.this.B.b();
            }
            if (PhotoView.this.a(f6)) {
                if (f6 >= 0.0f || PhotoView.this.w.left - f6 <= PhotoView.this.u.left) {
                    f5 = f6;
                } else {
                    f5 = PhotoView.this.w.left;
                }
                if (f5 > 0.0f && PhotoView.this.w.right - f5 < PhotoView.this.u.right) {
                    f5 = PhotoView.this.w.right - PhotoView.this.u.right;
                }
                PhotoView.this.f60226e.postTranslate(-f5, 0.0f);
                PhotoView.this.q = (int) (((float) PhotoView.this.q) - f5);
            } else if (PhotoView.this.m || PhotoView.this.h || PhotoView.this.i) {
                PhotoView.this.c();
                if (!PhotoView.this.h) {
                    if (f6 >= 0.0f || PhotoView.this.w.left - f6 <= PhotoView.this.y.left) {
                        f4 = f6;
                    } else {
                        f4 = PhotoView.this.a(PhotoView.this.w.left - PhotoView.this.y.left, f6);
                    }
                    if (f4 > 0.0f && PhotoView.this.w.right - f4 < PhotoView.this.y.right) {
                        f4 = PhotoView.this.a(PhotoView.this.w.right - PhotoView.this.y.right, f4);
                    }
                } else {
                    f4 = f6;
                }
                PhotoView.this.q = (int) (((float) PhotoView.this.q) - f4);
                PhotoView.this.f60226e.postTranslate(-f4, 0.0f);
                PhotoView.this.i = true;
            }
            if (PhotoView.this.b(f7)) {
                if (f7 < 0.0f && PhotoView.this.w.top - f7 > PhotoView.this.u.top) {
                    f7 = PhotoView.this.w.top;
                }
                if (f7 > 0.0f && PhotoView.this.w.bottom - f7 < PhotoView.this.u.bottom) {
                    f7 = PhotoView.this.w.bottom - PhotoView.this.u.bottom;
                }
                PhotoView.this.f60226e.postTranslate(0.0f, -f7);
                PhotoView.this.r = (int) (((float) PhotoView.this.r) - f7);
            } else if (PhotoView.this.n || PhotoView.this.i || PhotoView.this.h) {
                PhotoView.this.c();
                if (!PhotoView.this.h) {
                    if (f7 < 0.0f && PhotoView.this.w.top - f7 > PhotoView.this.y.top) {
                        f7 = PhotoView.this.b(PhotoView.this.w.top - PhotoView.this.y.top, f7);
                    }
                    if (f7 > 0.0f && PhotoView.this.w.bottom - f7 < PhotoView.this.y.bottom) {
                        f7 = PhotoView.this.b(PhotoView.this.w.bottom - PhotoView.this.y.bottom, f7);
                    }
                }
                PhotoView.this.f60226e.postTranslate(0.0f, -f7);
                PhotoView.this.r = (int) (((float) PhotoView.this.r) - f7);
                PhotoView.this.i = true;
            }
            PhotoView.this.b();
            return true;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public int f60223b;

    /* renamed from: c  reason: collision with root package name */
    public float f60224c;

    /* renamed from: d  reason: collision with root package name */
    public int f60225d;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f60226e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public Matrix f60227f = new Matrix();
    public View.OnClickListener g;
    public boolean h;
    public boolean i;
    public boolean j = false;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public float o;
    public float p = 1.0f;
    public int q;
    public int r;
    public float s;
    public float t;
    public RectF u = new RectF();
    public RectF v = new RectF();
    public RectF w = new RectF();
    public RectF x = new RectF();
    public RectF y = new RectF();
    public PointF z = new PointF();

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60234a = new int[ImageView.ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60234a = r0
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f60234a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView.AnonymousClass4.<clinit>():void");
        }
    }

    public interface a {
        float a();
    }

    public class b implements a {
        public final float a() {
            return PhotoView.this.w.bottom;
        }

        public b() {
        }
    }

    class c implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60236a;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f60237b;

        private c() {
            this.f60237b = new DecelerateInterpolator();
        }

        public final float getInterpolation(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60236a, false, 65560, new Class[]{Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60236a, false, 65560, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            } else if (this.f60237b != null) {
                return this.f60237b.getInterpolation(f2);
            } else {
                return f2;
            }
        }

        /* synthetic */ c(PhotoView photoView, byte b2) {
            this();
        }
    }

    public class d implements a {
        public final float a() {
            return (PhotoView.this.w.top + PhotoView.this.w.bottom) / 2.0f;
        }

        public d() {
        }
    }

    public class e implements a {
        public final float a() {
            return PhotoView.this.w.top;
        }

        public e() {
        }
    }

    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60241a;

        /* renamed from: b  reason: collision with root package name */
        boolean f60242b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f60243c;

        /* renamed from: d  reason: collision with root package name */
        OverScroller f60244d;

        /* renamed from: e  reason: collision with root package name */
        Scroller f60245e;

        /* renamed from: f  reason: collision with root package name */
        Scroller f60246f;
        Scroller g;
        a h;
        int i;
        int j;
        int k;
        int l;
        RectF m = new RectF();
        c n = new c(PhotoView.this, (byte) 0);

        private void d() {
            if (PatchProxy.isSupport(new Object[0], this, f60241a, false, 65571, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60241a, false, 65571, new Class[0], Void.TYPE);
                return;
            }
            if (this.f60242b) {
                PhotoView.this.post(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f60241a, false, 65567, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60241a, false, 65567, new Class[0], Void.TYPE);
                return;
            }
            this.f60242b = true;
            d();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f60241a, false, 65568, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60241a, false, 65568, new Class[0], Void.TYPE);
                return;
            }
            PhotoView.this.removeCallbacks(this);
            this.f60243c.abortAnimation();
            this.f60245e.abortAnimation();
            this.f60244d.abortAnimation();
            this.g.abortAnimation();
            this.f60242b = false;
        }

        private void c() {
            if (PatchProxy.isSupport(new Object[0], this, f60241a, false, 65570, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60241a, false, 65570, new Class[0], Void.TYPE);
                return;
            }
            PhotoView.this.f60226e.reset();
            PhotoView.this.f60226e.postTranslate(-PhotoView.this.v.left, -PhotoView.this.v.top);
            PhotoView.this.f60226e.postTranslate(PhotoView.this.A.x, PhotoView.this.A.y);
            PhotoView.this.f60226e.postTranslate(-PhotoView.this.s, -PhotoView.this.t);
            PhotoView.this.f60226e.postRotate(PhotoView.this.o, PhotoView.this.A.x, PhotoView.this.A.y);
            PhotoView.this.f60226e.postScale(PhotoView.this.p, PhotoView.this.p, PhotoView.this.z.x, PhotoView.this.z.y);
            PhotoView.this.f60226e.postTranslate((float) PhotoView.this.q, (float) PhotoView.this.r);
            PhotoView.this.b();
        }

        public final void run() {
            boolean z;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[0], this, f60241a, false, 65569, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60241a, false, 65569, new Class[0], Void.TYPE);
                return;
            }
            if (this.f60245e.computeScrollOffset()) {
                PhotoView.this.p = ((float) this.f60245e.getCurrX()) / 10000.0f;
                z = false;
            } else {
                z = true;
            }
            if (this.f60243c.computeScrollOffset()) {
                int currX = this.f60243c.getCurrX() - this.k;
                int currY = this.f60243c.getCurrY() - this.l;
                PhotoView.this.q += currX;
                PhotoView.this.r += currY;
                this.k = this.f60243c.getCurrX();
                this.l = this.f60243c.getCurrY();
                z = false;
            }
            if (this.f60244d.computeScrollOffset()) {
                int currX2 = this.f60244d.getCurrX() - this.i;
                int currY2 = this.f60244d.getCurrY() - this.j;
                this.i = this.f60244d.getCurrX();
                this.j = this.f60244d.getCurrY();
                PhotoView.this.q += currX2;
                PhotoView.this.r += currY2;
                z = false;
            }
            if (this.g.computeScrollOffset()) {
                PhotoView.this.o = (float) this.g.getCurrX();
                z = false;
            }
            if (this.f60246f.computeScrollOffset() || PhotoView.this.C != null) {
                float currX3 = ((float) this.f60246f.getCurrX()) / 10000.0f;
                float currY3 = ((float) this.f60246f.getCurrY()) / 10000.0f;
                PhotoView.this.f60227f.setScale(currX3, currY3, (PhotoView.this.w.left + PhotoView.this.w.right) / 2.0f, this.h.a());
                PhotoView.this.f60227f.mapRect(this.m, PhotoView.this.w);
                if (currX3 == 1.0f) {
                    this.m.left = PhotoView.this.u.left;
                    this.m.right = PhotoView.this.u.right;
                }
                if (currY3 == 1.0f) {
                    this.m.top = PhotoView.this.u.top;
                    this.m.bottom = PhotoView.this.u.bottom;
                }
                PhotoView.this.C = this.m;
            }
            if (!z) {
                c();
                d();
                return;
            }
            this.f60242b = false;
            if (PhotoView.this.m) {
                if (PhotoView.this.w.left > 0.0f) {
                    PhotoView.this.q = (int) (((float) PhotoView.this.q) - PhotoView.this.w.left);
                } else if (PhotoView.this.w.right < PhotoView.this.u.width()) {
                    PhotoView.this.q -= (int) (PhotoView.this.u.width() - PhotoView.this.w.right);
                }
                z2 = true;
            }
            if (PhotoView.this.n) {
                if (PhotoView.this.w.top > 0.0f) {
                    PhotoView.this.r = (int) (((float) PhotoView.this.r) - PhotoView.this.w.top);
                } else if (PhotoView.this.w.bottom < PhotoView.this.u.height()) {
                    PhotoView.this.r -= (int) (PhotoView.this.u.height() - PhotoView.this.w.bottom);
                }
                z2 = true;
            }
            if (z2) {
                c();
            }
            PhotoView.this.invalidate();
            if (PhotoView.this.D != null) {
                PhotoView.this.D.run();
                PhotoView.this.D = null;
            }
        }

        f() {
            Context context = PhotoView.this.getContext();
            this.f60243c = new OverScroller(context, this.n);
            this.f60245e = new Scroller(context, this.n);
            this.f60244d = new OverScroller(context, this.n);
            this.f60246f = new Scroller(context, this.n);
            this.g = new Scroller(context, this.n);
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2, float f3) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60241a, false, 65562, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60241a, false, 65562, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            this.f60245e.startScroll((int) (f2 * 10000.0f), 0, (int) ((f3 - f2) * 10000.0f), 0, PhotoView.this.f60223b);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60241a, false, 65564, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60241a, false, 65564, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.g.startScroll(i2, 0, i3 - i2, 0, PhotoView.this.f60223b);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3, int i4, int i5) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60241a, false, 65561, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60241a, false, 65561, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.k = 0;
            this.l = 0;
            this.f60243c.startScroll(0, 0, i4, i5, PhotoView.this.f60223b);
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2, float f3, float f4, float f5, int i2, a aVar) {
            a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Integer.valueOf(i2), aVar2}, this, f60241a, false, 65563, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Integer.valueOf(i2), aVar2}, this, f60241a, false, 65563, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE, a.class}, Void.TYPE);
                return;
            }
            this.f60246f.startScroll((int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), (int) (10000.0f * f5), i2);
            this.h = aVar2;
        }
    }

    public final void a() {
        this.j = true;
    }

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public int getAnimaDuring() {
        return this.f60223b;
    }

    public float getMaxScale() {
        return this.f60224c;
    }

    public final boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60222a, false, 65541, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60222a, false, 65541, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.w.width() <= this.u.width()) {
            return false;
        } else {
            if (f2 >= 0.0f || ((float) Math.round(this.w.left)) - f2 < this.u.left) {
                return f2 <= 0.0f || ((float) Math.round(this.w.right)) - f2 > this.u.right;
            }
            return false;
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65548, new Class[0], Void.TYPE);
            return;
        }
        this.f60226e.reset();
        b();
        this.p = 1.0f;
        this.q = 0;
        this.r = 0;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65519, new Class[0], Void.TYPE);
        } else if (this.P && this.Q) {
            Drawable drawable = getDrawable();
            int a2 = a(drawable);
            int b2 = b(drawable);
            float f2 = (float) a2;
            if (f2 > this.u.width() || ((float) b2) > this.u.height()) {
                float width = f2 / this.w.width();
                float height = ((float) b2) / this.w.height();
                if (width > height) {
                    height = width;
                }
                this.p = height;
                this.f60226e.postScale(this.p, this.p, this.T.x, this.T.y);
                b();
                l();
            }
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65520, new Class[0], Void.TYPE);
            return;
        }
        if (this.w.width() < this.u.width() || this.w.height() < this.u.height()) {
            float width = this.u.width() / this.w.width();
            float height = this.u.height() / this.w.height();
            if (width <= height) {
                width = height;
            }
            this.p = width;
            this.f60226e.postScale(this.p, this.p, this.T.x, this.T.y);
            b();
            l();
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65521, new Class[0], Void.TYPE);
            return;
        }
        if (this.w.width() > this.u.width() || this.w.height() > this.u.height()) {
            float width = this.u.width() / this.w.width();
            float height = this.u.height() / this.w.height();
            if (width >= height) {
                width = height;
            }
            this.p = width;
            this.f60226e.postScale(this.p, this.p, this.T.x, this.T.y);
            b();
            l();
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65522, new Class[0], Void.TYPE);
            return;
        }
        if (this.w.width() < this.u.width()) {
            this.p = this.u.width() / this.w.width();
            this.f60226e.postScale(this.p, this.p, this.T.x, this.T.y);
            b();
            l();
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65523, new Class[0], Void.TYPE);
            return;
        }
        h();
        float f2 = -this.w.top;
        this.r = (int) (((float) this.r) + f2);
        this.f60226e.postTranslate(0.0f, f2);
        b();
        l();
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65524, new Class[0], Void.TYPE);
            return;
        }
        h();
        float f2 = this.u.bottom - this.w.bottom;
        this.r = (int) (((float) this.r) + f2);
        this.f60226e.postTranslate(0.0f, f2);
        b();
        l();
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65525, new Class[0], Void.TYPE);
            return;
        }
        this.f60226e.postScale(this.u.width() / this.w.width(), this.u.height() / this.w.height(), this.T.x, this.T.y);
        b();
        l();
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65526, new Class[0], Void.TYPE);
            return;
        }
        Drawable drawable = getDrawable();
        this.v.set(0.0f, 0.0f, (float) a(drawable), (float) b(drawable));
        this.K.set(this.L);
        this.K.mapRect(this.v);
        this.s = this.v.width() / 2.0f;
        this.t = this.v.height() / 2.0f;
        this.p = 1.0f;
        this.q = 0;
        this.r = 0;
        this.f60226e.reset();
    }

    public a getInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65545, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65545, new Class[0], a.class);
        }
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        a((View) this, iArr);
        rectF.set(((float) iArr[0]) + this.w.left, ((float) iArr[1]) + this.w.top, ((float) iArr[0]) + this.w.right, ((float) iArr[1]) + this.w.bottom);
        a aVar = new a(rectF, this.w, this.u, this.v, this.T, this.p, this.o, this.O);
        return aVar;
    }

    public final void c() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65540, new Class[0], Void.TYPE);
            return;
        }
        if (!this.i) {
            RectF rectF = this.u;
            RectF rectF2 = this.w;
            RectF rectF3 = this.y;
            if (PatchProxy.isSupport(new Object[]{rectF, rectF2, rectF3}, this, f60222a, false, 65539, new Class[]{RectF.class, RectF.class, RectF.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{rectF, rectF2, rectF3}, this, f60222a, false, 65539, new Class[]{RectF.class, RectF.class, RectF.class}, Void.TYPE);
                return;
            }
            if (rectF.left > rectF2.left) {
                f2 = rectF.left;
            } else {
                f2 = rectF2.left;
            }
            if (rectF.right < rectF2.right) {
                f3 = rectF.right;
            } else {
                f3 = rectF2.right;
            }
            if (f2 > f3) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            if (rectF.top > rectF2.top) {
                f4 = rectF.top;
            } else {
                f4 = rectF2.top;
            }
            if (rectF.bottom < rectF2.bottom) {
                f5 = rectF.bottom;
            } else {
                f5 = rectF2.bottom;
            }
            if (f4 > f5) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            rectF3.set(f2, f4, f3, f5);
        }
    }

    private void d() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65518, new Class[0], Void.TYPE);
        } else if (this.P && this.Q) {
            this.K.reset();
            this.f60226e.reset();
            this.k = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int a2 = a(drawable);
            int b2 = b(drawable);
            float f3 = (float) a2;
            float f4 = (float) b2;
            this.v.set(0.0f, 0.0f, f3, f4);
            int i2 = (width - a2) / 2;
            int i3 = (height - b2) / 2;
            float f5 = 1.0f;
            if (a2 > width) {
                f2 = ((float) width) / f3;
            } else {
                f2 = 1.0f;
            }
            if (b2 > height) {
                f5 = ((float) height) / f4;
            }
            if (f2 >= f5) {
                f2 = f5;
            }
            this.K.reset();
            this.K.postTranslate((float) i2, (float) i3);
            this.K.postScale(f2, f2, this.T.x, this.T.y);
            this.K.mapRect(this.v);
            this.s = this.v.width() / 2.0f;
            this.t = this.v.height() / 2.0f;
            this.z.set(this.T);
            this.A.set(this.z);
            b();
            switch (AnonymousClass4.f60234a[this.O.ordinal()]) {
                case 1:
                    e();
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    g();
                    break;
                case 4:
                    h();
                    break;
                case 5:
                    i();
                    break;
                case 6:
                    j();
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    k();
                    break;
            }
            this.R = true;
            if (this.U != null && System.currentTimeMillis() - this.V < ((long) this.J)) {
                a(this.U);
            }
            this.U = null;
            if (b2 > a2 * 3) {
                this.f60226e.postTranslate(0.0f, -this.w.top);
                this.r = (int) (((float) this.r) - this.w.top);
                b();
            }
        }
    }

    public final void b() {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65527, new Class[0], Void.TYPE);
            return;
        }
        this.L.set(this.K);
        this.L.postConcat(this.f60226e);
        setImageMatrix(this.L);
        this.f60226e.mapRect(this.w, this.v);
        if (this.w.width() > this.u.width()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.m = z2;
        if (this.w.height() > this.u.height()) {
            z3 = true;
        }
        this.n = z3;
    }

    public void setAnimaDuring(int i2) {
        this.f60223b = i2;
    }

    public void setMaxAnimFromWaiteTime(int i2) {
        this.J = i2;
    }

    public void setMaxScale(float f2) {
        this.f60224c = f2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.E = onLongClickListener;
    }

    public void setInterpolator(Interpolator interpolator) {
        Interpolator interpolator2 = interpolator;
        if (PatchProxy.isSupport(new Object[]{interpolator2}, this, f60222a, false, 65512, new Class[]{Interpolator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interpolator2}, this, f60222a, false, 65512, new Class[]{Interpolator.class}, Void.TYPE);
            return;
        }
        this.B.n.f60237b = interpolator2;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f60222a, false, 65510, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f60222a, false, 65510, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.setOnClickListener(onClickListener);
        this.g = onClickListener2;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (PatchProxy.isSupport(new Object[]{scaleType}, this, f60222a, false, 65511, new Class[]{ImageView.ScaleType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{scaleType}, this, f60222a, false, 65511, new Class[]{ImageView.ScaleType.class}, Void.TYPE);
            return;
        }
        ImageView.ScaleType scaleType2 = this.O;
        this.O = scaleType;
        if (scaleType2 != scaleType) {
            d();
        }
    }

    private static int a(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, null, f60222a, true, 65516, new Class[]{Drawable.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{drawable}, null, f60222a, true, 65516, new Class[]{Drawable.class}, Integer.TYPE)).intValue();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getBounds().width();
        }
        return intrinsicWidth;
    }

    private static int b(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, null, f60222a, true, 65517, new Class[]{Drawable.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{drawable}, null, f60222a, true, 65517, new Class[]{Drawable.class}, Integer.TYPE)).intValue();
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getBounds().height();
        }
        return intrinsicHeight;
    }

    private boolean c(RectF rectF) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2}, this, f60222a, false, 65536, new Class[]{RectF.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF2}, this, f60222a, false, 65536, new Class[]{RectF.class}, Boolean.TYPE)).booleanValue();
        } else if (Math.abs(((float) Math.round(rectF2.left)) - ((this.u.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65543, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65543, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h) {
            return true;
        } else {
            return a((float) i2);
        }
    }

    public boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65544, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65544, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h) {
            return true;
        } else {
            return b((float) i2);
        }
    }

    public void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f60222a, false, 65531, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f60222a, false, 65531, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.C != null) {
            canvas.clipRect(this.C);
            this.C = null;
        }
        super.draw(canvas);
    }

    public void setAdjustViewBounds(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60222a, false, 65529, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60222a, false, 65529, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setAdjustViewBounds(z2);
        this.S = z2;
    }

    public void setImageResource(int i2) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65513, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60222a, false, 65513, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            drawable = com.ss.android.ugc.bytex.a.a.a.a(getResources(), i2);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    private boolean b(RectF rectF) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2}, this, f60222a, false, 65535, new Class[]{RectF.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF2}, this, f60222a, false, 65535, new Class[]{RectF.class}, Boolean.TYPE)).booleanValue();
        } else if (Math.abs(((float) Math.round(rectF2.top)) - ((this.u.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public void setImageDrawable(Drawable drawable) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f60222a, false, 65514, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f60222a, false, 65514, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.P = false;
            return;
        }
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f60222a, false, 65515, new Class[]{Drawable.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable}, this, f60222a, false, 65515, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        } else if ((drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) && ((drawable.getMinimumWidth() <= 0 || drawable.getMinimumHeight() <= 0) && (drawable.getBounds().width() <= 0 || drawable.getBounds().height() <= 0))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (!this.P) {
                this.P = true;
            }
            d();
        }
    }

    private void a(a aVar) {
        a aVar2;
        a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar3}, this, f60222a, false, 65549, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3}, this, f60222a, false, 65549, new Class[]{a.class}, Void.TYPE);
        } else if (this.R) {
            m();
            a info = getInfo();
            float width = aVar3.f60270b.width() / info.f60270b.width();
            float height = aVar3.f60270b.height() / info.f60270b.height();
            if (width < height) {
                height = width;
            }
            float width2 = aVar3.f60269a.left + (aVar3.f60269a.width() / 2.0f);
            float height2 = aVar3.f60269a.top + (aVar3.f60269a.height() / 2.0f);
            this.f60226e.reset();
            this.f60226e.postTranslate(-this.v.left, -this.v.top);
            this.f60226e.postTranslate(width2 - (this.v.width() / 2.0f), height2 - (this.v.height() / 2.0f));
            this.f60226e.postScale(height, height, width2, height2);
            this.f60226e.postRotate(aVar3.g, width2, height2);
            b();
            this.z.set(width2, height2);
            this.A.set(width2, height2);
            this.B.a(0, 0, (int) (this.T.x - width2), (int) (this.T.y - height2));
            this.B.a(height, 1.0f);
            this.B.a((int) aVar3.g, 0);
            if (aVar3.f60271c.width() < aVar3.f60270b.width() || aVar3.f60271c.height() < aVar3.f60270b.height()) {
                float width3 = aVar3.f60271c.width() / aVar3.f60270b.width();
                float height3 = aVar3.f60271c.height() / aVar3.f60270b.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                if (aVar3.h == ImageView.ScaleType.FIT_START) {
                    aVar2 = new e();
                } else if (aVar3.h == ImageView.ScaleType.FIT_END) {
                    aVar2 = new b();
                } else {
                    aVar2 = new d();
                }
                this.B.a(width3, height3, 1.0f - width3, 1.0f - height3, this.f60223b / 3, aVar2);
                this.f60227f.setScale(width3, height3, (this.w.left + this.w.right) / 2.0f, aVar2.a());
                this.f60227f.mapRect(this.B.m, this.w);
                this.C = this.B.m;
            }
            this.B.a();
        } else {
            this.U = aVar3;
            this.V = System.currentTimeMillis();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60222a, false, 65532, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60222a, false, 65532, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.j) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (motionEvent.getPointerCount() >= 2) {
                this.h = true;
            }
            this.M.onTouchEvent(motionEvent);
            this.N.onTouchEvent(motionEvent);
            if (actionMasked == 1 || actionMasked == 3) {
                if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65533, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65533, new Class[0], Void.TYPE);
                } else if (!this.B.f60242b) {
                    if (this.l || this.o % 90.0f != 0.0f) {
                        float f2 = (float) (((int) (this.o / 90.0f)) * 90);
                        float f3 = this.o % 90.0f;
                        if (f3 > 45.0f) {
                            f2 += 90.0f;
                        } else if (f3 < -45.0f) {
                            f2 -= 90.0f;
                        }
                        this.B.a((int) this.o, (int) f2);
                        this.o = f2;
                    }
                    float f4 = this.p;
                    if (this.p < 1.0f) {
                        this.B.a(this.p, 1.0f);
                        f4 = 1.0f;
                    } else if (this.p > this.f60224c) {
                        f4 = this.f60224c;
                        this.B.a(this.p, this.f60224c);
                    }
                    float width = this.w.left + (this.w.width() / 2.0f);
                    float height = this.w.top + (this.w.height() / 2.0f);
                    this.z.set(width, height);
                    this.A.set(width, height);
                    this.q = 0;
                    this.r = 0;
                    this.f60227f.reset();
                    this.f60227f.postTranslate(-this.v.left, -this.v.top);
                    this.f60227f.postTranslate(width - this.s, height - this.t);
                    this.f60227f.postScale(f4, f4, width, height);
                    this.f60227f.postRotate(this.o, width, height);
                    this.f60227f.mapRect(this.x, this.v);
                    a(this.x);
                    this.B.a();
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.RectF r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f60222a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.graphics.RectF> r1 = android.graphics.RectF.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65534(0xfffe, float:9.1833E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f60222a
            r3 = 0
            r4 = 65534(0xfffe, float:9.1833E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.graphics.RectF> r1 = android.graphics.RectF.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            float r0 = r10.width()
            android.graphics.RectF r1 = r9.u
            float r1 = r1.width()
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            boolean r0 = r9.c(r10)
            if (r0 != 0) goto L_0x0080
            android.graphics.RectF r0 = r9.u
            float r0 = r0.width()
            float r1 = r10.width()
            float r0 = r0 - r1
            float r0 = r0 / r2
            float r1 = r10.left
            float r0 = r0 - r1
            int r0 = (int) r0
            int r0 = -r0
            goto L_0x0081
        L_0x005a:
            float r0 = r10.left
            android.graphics.RectF r1 = r9.u
            float r1 = r1.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            float r0 = r10.left
            android.graphics.RectF r1 = r9.u
            float r1 = r1.left
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0081
        L_0x006d:
            float r0 = r10.right
            android.graphics.RectF r1 = r9.u
            float r1 = r1.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            float r0 = r10.right
            android.graphics.RectF r1 = r9.u
            float r1 = r1.right
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            float r1 = r10.height()
            android.graphics.RectF r3 = r9.u
            float r3 = r3.height()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x00a7
            boolean r1 = r9.b((android.graphics.RectF) r10)
            if (r1 != 0) goto L_0x00cc
            android.graphics.RectF r1 = r9.u
            float r1 = r1.height()
            float r3 = r10.height()
            float r1 = r1 - r3
            float r1 = r1 / r2
            float r2 = r10.top
            float r1 = r1 - r2
            int r1 = (int) r1
            int r8 = -r1
            goto L_0x00cc
        L_0x00a7:
            float r1 = r10.top
            android.graphics.RectF r2 = r9.u
            float r2 = r2.top
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ba
            float r1 = r10.top
            android.graphics.RectF r2 = r9.u
            float r2 = r2.top
            float r1 = r1 - r2
            int r8 = (int) r1
            goto L_0x00cc
        L_0x00ba:
            float r1 = r10.bottom
            android.graphics.RectF r2 = r9.u
            float r2 = r2.bottom
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00cc
            float r1 = r10.bottom
            android.graphics.RectF r2 = r9.u
            float r2 = r2.bottom
            float r1 = r1 - r2
            int r8 = (int) r1
        L_0x00cc:
            if (r0 != 0) goto L_0x00d0
            if (r8 == 0) goto L_0x00ec
        L_0x00d0:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r1 = r9.B
            android.widget.OverScroller r1 = r1.f60244d
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00e1
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r1 = r9.B
            android.widget.OverScroller r1 = r1.f60244d
            r1.abortAnimation()
        L_0x00e1:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r1 = r9.B
            int r2 = r9.q
            int r3 = r9.r
            int r0 = -r0
            int r4 = -r8
            r1.a(r2, r3, r0, r4)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView.a(android.graphics.RectF):void");
    }

    public final boolean b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60222a, false, 65542, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60222a, false, 65542, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.w.height() <= this.u.height()) {
            return false;
        } else {
            if (f2 < 0.0f && ((float) Math.round(this.w.top)) - f2 >= this.u.top) {
                return false;
            }
            if (f2 <= 0.0f || ((float) Math.round(this.w.bottom)) - f2 > this.u.bottom) {
                return true;
            }
            return false;
        }
    }

    private static void a(View view, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{view, iArr}, null, f60222a, true, 65547, new Class[]{View.class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, iArr}, null, f60222a, true, 65547, new Class[]{View.class, int[].class}, Void.TYPE);
            return;
        }
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (((float) iArr[0]) + 0.5f);
        iArr[1] = (int) (((float) iArr[1]) + 0.5f);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60222a, false, 65528, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60222a, false, 65528, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.P) {
            super.onMeasure(i2, i3);
        } else {
            Drawable drawable = getDrawable();
            int a2 = a(drawable);
            int b2 = b(drawable);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || a2 <= size) : mode == 0) {
                size = a2;
            }
            if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || b2 <= size2) : mode2 == 0) {
                size2 = b2;
            }
            if (this.S) {
                float f2 = (float) a2;
                float f3 = (float) b2;
                float f4 = (float) size;
                float f5 = (float) size2;
                if (f2 / f3 != f4 / f5) {
                    float f6 = f5 / f3;
                    float f7 = f4 / f2;
                    if (f6 < f7) {
                        f7 = f6;
                    }
                    if (layoutParams.width != -1) {
                        size = (int) (f2 * f7);
                    }
                    if (layoutParams.height != -1) {
                        size2 = (int) (f3 * f7);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }
    }

    public final float b(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60222a, false, 65538, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)) {
            return (Math.abs(Math.abs(f2) - ((float) this.I)) / ((float) this.I)) * f3;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60222a, false, 65538, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public final float a(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60222a, false, 65537, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)) {
            return (Math.abs(Math.abs(f2) - ((float) this.I)) / ((float) this.I)) * f3;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60222a, false, 65537, new Class[]{Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[0], this, f60222a, false, 65509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60222a, false, 65509, new Class[0], Void.TYPE);
            return;
        }
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.O == null) {
            this.O = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.M = new GestureDetector(getContext(), this.aa);
        this.N = new ScaleGestureDetector(getContext(), this.W);
        float f2 = getResources().getDisplayMetrics().density;
        int i3 = (int) (30.0f * f2);
        this.H = i3;
        this.f60225d = i3;
        this.I = (int) (f2 * 140.0f);
        this.G = 35;
        this.f60223b = 340;
        this.f60224c = 2.5f;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60222a, false, 65530, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60222a, false, 65530, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        this.u.set(0.0f, 0.0f, (float) i6, (float) i7);
        this.T.set((float) (i6 / 2), (float) (i7 / 2));
        if (!this.Q) {
            this.Q = true;
            d();
        }
    }
}
