package f.a.a.a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.FloatMath;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class c implements GestureDetector.OnDoubleTapListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, f.a.a.a.a.e {
    private static /* synthetic */ int[] B;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f83106a = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: b  reason: collision with root package name */
    static final Interpolator f83107b = new AccelerateDecelerateInterpolator();
    private boolean A;

    /* renamed from: c  reason: collision with root package name */
    float f83108c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    float f83109d = 1.75f;

    /* renamed from: e  reason: collision with root package name */
    float f83110e = 3.0f;

    /* renamed from: f  reason: collision with root package name */
    boolean f83111f = true;
    public final Matrix g = new Matrix();
    C0880c h;
    d i;
    e j;
    public View.OnLongClickListener k;
    ImageView.ScaleType l = ImageView.ScaleType.FIT_CENTER;
    float m = 0.0f;
    private WeakReference<ImageView> n;
    private GestureDetector o;
    private f.a.a.a.a.d p;
    private final Matrix q = new Matrix();
    private final Matrix r = new Matrix();
    private final RectF s = new RectF();
    private final float[] t = new float[9];
    private int u;
    private int v;
    private int w;
    private int x;
    private b y;
    private int z = 2;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final float f83114b;

        /* renamed from: c  reason: collision with root package name */
        private final float f83115c;

        /* renamed from: d  reason: collision with root package name */
        private final long f83116d = System.currentTimeMillis();

        /* renamed from: e  reason: collision with root package name */
        private final float f83117e;

        /* renamed from: f  reason: collision with root package name */
        private final float f83118f;

        public final void run() {
            ImageView c2 = c.this.c();
            if (c2 != null) {
                float interpolation = c.f83107b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f83116d)) * 1.0f) / 200.0f));
                float d2 = (this.f83117e + ((this.f83118f - this.f83117e) * interpolation)) / c.this.d();
                c.this.g.postScale(d2, d2, this.f83114b, this.f83115c);
                c.this.g();
                if (interpolation < 1.0f) {
                    a.a(c2, this);
                }
            }
        }

        public a(float f2, float f3, float f4, float f5) {
            this.f83114b = f4;
            this.f83115c = f5;
            this.f83117e = f2;
            this.f83118f = f3;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final f.a.a.a.b.d f83119a;

        /* renamed from: b  reason: collision with root package name */
        int f83120b;

        /* renamed from: c  reason: collision with root package name */
        int f83121c;

        public final void a() {
            this.f83119a.a(true);
        }

        public final void run() {
            if (!this.f83119a.b()) {
                ImageView c2 = c.this.c();
                if (c2 != null && this.f83119a.a()) {
                    int c3 = this.f83119a.c();
                    int d2 = this.f83119a.d();
                    if (c.f83106a) {
                        StringBuilder sb = new StringBuilder("fling run(). CurrentX:");
                        sb.append(this.f83120b);
                        sb.append(" CurrentY:");
                        sb.append(this.f83121c);
                        sb.append(" NewX:");
                        sb.append(c3);
                        sb.append(" NewY:");
                        sb.append(d2);
                    }
                    c.this.g.postTranslate((float) (this.f83120b - c3), (float) (this.f83121c - d2));
                    c.this.a(c.this.f());
                    this.f83120b = c3;
                    this.f83121c = d2;
                    a.a(c2, this);
                }
            }
        }

        public b(Context context) {
            f.a.a.a.b.d dVar;
            if (Build.VERSION.SDK_INT < 9) {
                dVar = new f.a.a.a.b.c(context);
            } else if (Build.VERSION.SDK_INT < 14) {
                dVar = new f.a.a.a.b.a(context);
            } else {
                dVar = new f.a.a.a.b.b(context);
            }
            this.f83119a = dVar;
        }
    }

    /* renamed from: f.a.a.a.c$c  reason: collision with other inner class name */
    public interface C0880c {
    }

    public interface d {
        void a(View view, float f2, float f3);
    }

    public interface e {
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    private void i() {
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
    }

    private void l() {
        this.g.reset();
        a(f());
        k();
    }

    public final RectF b() {
        k();
        return b(f());
    }

    public final void g() {
        if (k()) {
            a(f());
        }
    }

    private void j() {
        ImageView c2 = c();
        if (c2 != null && !(c2 instanceof b) && !ImageView.ScaleType.MATRIX.equals(c2.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    public final void e() {
        ImageView c2 = c();
        if (c2 != null) {
            if (this.A) {
                a(c2);
                a(c2.getDrawable());
                return;
            }
            l();
        }
    }

    /* access modifiers changed from: protected */
    public final Matrix f() {
        this.r.set(this.q);
        this.r.postConcat(this.g);
        return this.r;
    }

    public final ImageView c() {
        ImageView imageView;
        if (this.n != null) {
            imageView = (ImageView) this.n.get();
        } else {
            imageView = null;
        }
        if (imageView == null) {
            a();
        }
        return imageView;
    }

    public final float d() {
        return FloatMath.sqrt(((float) Math.pow((double) a(this.g, 0), 2.0d)) + ((float) Math.pow((double) a(this.g, 3), 2.0d)));
    }

    public final void onGlobalLayout() {
        ImageView c2 = c();
        if (c2 != null && this.A) {
            int top = c2.getTop();
            int right = c2.getRight();
            int bottom = c2.getBottom();
            int left = c2.getLeft();
            if (top != this.u || bottom != this.w || left != this.x || right != this.v) {
                a(c2.getDrawable());
                this.u = top;
                this.v = right;
                this.w = bottom;
                this.x = left;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|(2:18|19)|20|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] h() {
        /*
            int[] r0 = B
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0030 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
        L_0x0030:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0039 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x004b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.c.h():int[]");
    }

    public final void a() {
        if (this.n != null) {
            ImageView imageView = (ImageView) this.n.get();
            if (imageView != null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                imageView.setOnTouchListener(null);
                i();
            }
            if (this.o != null) {
                this.o.setOnDoubleTapListener(null);
            }
            this.h = null;
            this.i = null;
            this.j = null;
            this.n = null;
        }
    }

    private boolean k() {
        float f2;
        float f3;
        ImageView c2 = c();
        if (c2 == null) {
            return false;
        }
        RectF b2 = b(f());
        if (b2 == null) {
            return false;
        }
        float height = b2.height();
        float width = b2.width();
        float c3 = (float) c(c2);
        float f4 = 0.0f;
        if (height <= c3) {
            switch (h()[this.l.ordinal()]) {
                case 5:
                    f2 = (c3 - height) - b2.top;
                    break;
                case 6:
                    f2 = -b2.top;
                    break;
                default:
                    f2 = ((c3 - height) / 2.0f) - b2.top;
                    break;
            }
        } else if (b2.top > 0.0f) {
            f2 = -b2.top;
        } else if (b2.bottom < c3) {
            f2 = c3 - b2.bottom;
        } else {
            f2 = 0.0f;
        }
        float b3 = (float) b(c2);
        if (width <= b3) {
            switch (h()[this.l.ordinal()]) {
                case 5:
                    f3 = (b3 - width) - b2.left;
                    break;
                case 6:
                    f3 = -b2.left;
                    break;
                default:
                    f3 = ((b3 - width) / 2.0f) - b2.left;
                    break;
            }
            f4 = f3;
            this.z = 2;
        } else if (b2.left > 0.0f) {
            this.z = 0;
            f4 = -b2.left;
        } else if (b2.right < b3) {
            f4 = b3 - b2.right;
            this.z = 1;
        } else {
            this.z = -1;
        }
        this.g.postTranslate(f4, f2);
        return true;
    }

    public final void a(boolean z2) {
        this.A = z2;
        e();
    }

    private static int b(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private static int c(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private static void a(ImageView imageView) {
        if (imageView != null && !(imageView instanceof b) && !ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    private RectF b(Matrix matrix) {
        ImageView c2 = c();
        if (c2 != null) {
            Drawable drawable = c2.getDrawable();
            if (drawable != null) {
                this.s.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                matrix.mapRect(this.s);
                return this.s;
            }
        }
        return null;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float d2 = d();
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (d2 < this.f83109d) {
                a(this.f83109d, x2, y2, true);
            } else if (d2 < this.f83109d || d2 >= this.f83110e) {
                a(this.f83108c, x2, y2, true);
            } else {
                a(this.f83110e, x2, y2, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ImageView c2 = c();
        if (this.i != null) {
            RectF b2 = b();
            if (b2 != null) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (b2.contains(x2, y2)) {
                    this.i.a(c2, (x2 - b2.left) / b2.width(), (y2 - b2.top) / b2.height());
                    return true;
                }
            }
        }
        if (this.j != null) {
            motionEvent.getX();
            motionEvent.getY();
        }
        return false;
    }

    public c(ImageView imageView) {
        f.a.a.a.a.d dVar;
        this.n = new WeakReference<>(imageView);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        a(imageView);
        if (!imageView.isInEditMode()) {
            Context context = imageView.getContext();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 5) {
                dVar = new f.a.a.a.a.a(context);
            } else if (i2 < 8) {
                dVar = new f.a.a.a.a.b(context);
            } else {
                dVar = new f.a.a.a.a.c(context);
            }
            dVar.a(this);
            this.p = dVar;
            this.o = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() {
                public final void onLongPress(MotionEvent motionEvent) {
                    if (c.this.k != null) {
                        c.this.k.onLongClick(c.this.c());
                    }
                }
            });
            this.o.setOnDoubleTapListener(this);
            a(true);
        }
    }

    private void a(Drawable drawable) {
        ImageView c2 = c();
        if (c2 != null && drawable != null) {
            float b2 = (float) b(c2);
            float c3 = (float) c(c2);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.q.reset();
            float f2 = (float) intrinsicWidth;
            float f3 = b2 / f2;
            float f4 = (float) intrinsicHeight;
            float f5 = c3 / f4;
            if (this.l != ImageView.ScaleType.CENTER) {
                if (this.l != ImageView.ScaleType.CENTER_CROP) {
                    if (this.l != ImageView.ScaleType.CENTER_INSIDE) {
                        RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                        RectF rectF2 = new RectF(0.0f, 0.0f, b2, c3);
                        switch (h()[this.l.ordinal()]) {
                            case 4:
                                this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                                break;
                            case 5:
                                this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                                break;
                            case 6:
                                this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                                break;
                            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                                this.q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                                break;
                        }
                    } else {
                        float min = Math.min(1.0f, Math.min(f3, f5));
                        this.q.postScale(min, min);
                        this.q.postTranslate((b2 - (f2 * min)) / 2.0f, (c3 - (f4 * min)) / 2.0f);
                    }
                } else {
                    float max = Math.max(f3, f5);
                    this.q.postScale(max, max);
                    this.q.postTranslate((b2 - (f2 * max)) / 2.0f, (c3 - (f4 * max)) / 2.0f);
                }
            } else {
                this.q.postTranslate((b2 - f2) / 2.0f, (c3 - f4) / 2.0f);
            }
            l();
        }
    }

    public final void a(Matrix matrix) {
        ImageView c2 = c();
        if (c2 != null) {
            j();
            c2.setImageMatrix(matrix);
            if (this.h != null) {
                b(matrix);
            }
        }
    }

    private float a(Matrix matrix, int i2) {
        matrix.getValues(this.t);
        return this.t[i2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r0 = r11.A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007b
            r0 = r12
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x007b
            android.view.ViewParent r0 = r12.getParent()
            int r3 = r13.getAction()
            r4 = 3
            if (r3 == r4) goto L_0x002e
            switch(r3) {
                case 0: goto L_0x0025;
                case 1: goto L_0x002e;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0058
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x002a:
            r11.i()
            goto L_0x0058
        L_0x002e:
            float r3 = r11.d()
            float r4 = r11.f83108c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0058
            android.graphics.RectF r3 = r11.b()
            if (r3 == 0) goto L_0x0058
            f.a.a.a.c$a r10 = new f.a.a.a.c$a
            float r6 = r11.d()
            float r7 = r11.f83108c
            float r8 = r3.centerX()
            float r9 = r3.centerY()
            r4 = r10
            r5 = r11
            r4.<init>(r6, r7, r8, r9)
            r12.post(r10)
            r12 = 1
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            android.view.GestureDetector r3 = r11.o
            if (r3 == 0) goto L_0x0066
            android.view.GestureDetector r3 = r11.o
            boolean r3 = r3.onTouchEvent(r13)
            if (r3 == 0) goto L_0x0066
            r12 = 1
        L_0x0066:
            if (r12 != 0) goto L_0x006d
            if (r0 == 0) goto L_0x006d
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x006d:
            f.a.a.a.a.d r0 = r11.p
            if (r0 == 0) goto L_0x007c
            f.a.a.a.a.d r0 = r11.p
            boolean r13 = r0.c(r13)
            if (r13 == 0) goto L_0x007c
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = 0
        L_0x007c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(float f2, float f3) {
        if (f83106a) {
            String.format("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f2), Float.valueOf(f3)});
        }
        ImageView c2 = c();
        this.g.postTranslate(f2, f3);
        g();
        if (this.f83111f && !this.p.a()) {
            if (this.z == 2 || ((this.z == 0 && f2 >= 1.0f) || (this.z == 1 && f2 <= -1.0f))) {
                ViewParent parent = c2.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    static void a(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f3 >= f4) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    public final void b(float f2, float f3, float f4) {
        if (f83106a) {
            String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)});
        }
        if (d() < this.f83110e || f2 < 1.0f) {
            this.g.postScale(f2, f2, f3, f4);
            g();
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f6 = f4;
        float f7 = f5;
        if (f83106a) {
            StringBuilder sb = new StringBuilder("onFling. sX: ");
            sb.append(f2);
            sb.append(" sY: ");
            sb.append(f3);
            sb.append(" Vx: ");
            sb.append(f6);
            sb.append(" Vy: ");
            sb.append(f7);
        }
        ImageView c2 = c();
        this.y = new b(c2.getContext());
        b bVar = this.y;
        int b2 = b(c2);
        int c3 = c(c2);
        int i6 = (int) f6;
        int i7 = (int) f7;
        RectF b3 = c.this.b();
        if (b3 != null) {
            int round = Math.round(-b3.left);
            float f8 = (float) b2;
            if (f8 < b3.width()) {
                i2 = Math.round(b3.width() - f8);
                i3 = 0;
            } else {
                i3 = round;
                i2 = i3;
            }
            int round2 = Math.round(-b3.top);
            float f9 = (float) c3;
            if (f9 < b3.height()) {
                i4 = Math.round(b3.height() - f9);
                i5 = 0;
            } else {
                i5 = round2;
                i4 = i5;
            }
            bVar.f83120b = round;
            bVar.f83121c = round2;
            if (f83106a) {
                StringBuilder sb2 = new StringBuilder("fling. StartX:");
                sb2.append(round);
                sb2.append(" StartY:");
                sb2.append(round2);
                sb2.append(" MaxX:");
                sb2.append(i2);
                sb2.append(" MaxY:");
                sb2.append(i4);
            }
            if (!(round == i2 && round2 == i4)) {
                bVar.f83119a.a(round, round2, i6, i7, i3, i2, i5, i4, 0, 0);
            }
        }
        c2.post(this.y);
    }

    public final void a(float f2, float f3, float f4, boolean z2) {
        ImageView c2 = c();
        if (c2 != null && f2 >= this.f83108c && f2 <= this.f83110e) {
            if (z2) {
                a aVar = new a(d(), f2, f3, f4);
                c2.post(aVar);
                return;
            }
            this.g.setScale(f2, f2, f3, f4);
            g();
        }
    }
}
