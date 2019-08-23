package com.ss.android.ugc.aweme.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class MaterialRippleLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34953a;
    private int A;
    private int B;
    private GestureDetector C;
    private a D;
    private b E;
    private GestureDetector.SimpleOnGestureListener F;
    private Property<MaterialRippleLayout, Integer> G;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34954b;

    /* renamed from: c  reason: collision with root package name */
    int f34955c;

    /* renamed from: d  reason: collision with root package name */
    public int f34956d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f34957e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f34958f;
    public boolean g;
    public View h;
    ObjectAnimator i;
    boolean j;
    public boolean k;
    public boolean l;
    Property<MaterialRippleLayout, Float> m;
    private final Paint n;
    private final Rect o;
    private int p;
    private boolean q;
    private int r;
    private int s;
    private Drawable t;
    private float u;
    private float v;
    private AdapterView w;
    private AnimatorSet x;
    private Point y;
    private Point z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34970a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34970a, false, 25083, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34970a, false, 25083, new Class[0], Void.TYPE);
            } else if (!MaterialRippleLayout.this.l) {
                if (MaterialRippleLayout.this.getParent() instanceof AdapterView) {
                    if (!MaterialRippleLayout.this.h.performClick()) {
                        a((AdapterView) MaterialRippleLayout.this.getParent());
                    }
                } else if (MaterialRippleLayout.this.g) {
                    a(MaterialRippleLayout.this.b());
                } else {
                    MaterialRippleLayout.this.h.performClick();
                }
            }
        }

        private a() {
        }

        private void a(AdapterView adapterView) {
            long j;
            if (PatchProxy.isSupport(new Object[]{adapterView}, this, f34970a, false, 25084, new Class[]{AdapterView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{adapterView}, this, f34970a, false, 25084, new Class[]{AdapterView.class}, Void.TYPE);
                return;
            }
            int positionForView = adapterView.getPositionForView(MaterialRippleLayout.this);
            if (adapterView.getAdapter() != null) {
                j = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(MaterialRippleLayout.this, positionForView, j);
            }
        }

        /* synthetic */ a(MaterialRippleLayout materialRippleLayout, byte b2) {
            this();
        }
    }

    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34972a;

        /* renamed from: c  reason: collision with root package name */
        private final MotionEvent f34974c;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34972a, false, 25085, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34972a, false, 25085, new Class[0], Void.TYPE);
                return;
            }
            MaterialRippleLayout.this.k = false;
            MaterialRippleLayout.this.h.setLongClickable(false);
            MaterialRippleLayout.this.h.onTouchEvent(this.f34974c);
            MaterialRippleLayout.this.h.setPressed(true);
            if (MaterialRippleLayout.this.f34954b) {
                MaterialRippleLayout materialRippleLayout = MaterialRippleLayout.this;
                if (PatchProxy.isSupport(new Object[0], materialRippleLayout, MaterialRippleLayout.f34953a, false, 25053, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], materialRippleLayout, MaterialRippleLayout.f34953a, false, 25053, new Class[0], Void.TYPE);
                } else if (!materialRippleLayout.j) {
                    if (materialRippleLayout.i != null) {
                        materialRippleLayout.i.cancel();
                    }
                    materialRippleLayout.i = ObjectAnimator.ofFloat(materialRippleLayout, materialRippleLayout.m, new float[]{(float) materialRippleLayout.f34955c, (float) (Math.sqrt(Math.pow((double) materialRippleLayout.getWidth(), 2.0d) + Math.pow((double) materialRippleLayout.getHeight(), 2.0d)) * 1.2000000476837158d)}).setDuration(2500);
                    materialRippleLayout.i.setInterpolator(new LinearInterpolator());
                    materialRippleLayout.i.start();
                }
            }
        }

        public b(MotionEvent motionEvent) {
            this.f34974c = motionEvent;
        }
    }

    public boolean isInEditMode() {
        return true;
    }

    public <T extends View> T getChildView() {
        return this.h;
    }

    public float getRadius() {
        return this.v;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25055, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null) {
            this.x.cancel();
            this.x.removeAllListeners();
        }
        if (this.i != null) {
            this.i.cancel();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25052, new Class[0], Void.TYPE);
            return;
        }
        if (this.E != null) {
            removeCallbacks(this.E);
            this.k = false;
        }
    }

    public int getRippleAlpha() {
        if (!PatchProxy.isSupport(new Object[0], this, f34953a, false, 25065, new Class[0], Integer.TYPE)) {
            return this.n.getAlpha();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25065, new Class[0], Integer.TYPE)).intValue();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25073, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT <= 17) {
            if (this.u != 0.0f) {
                this.A = getLayerType();
                setLayerType(1, null);
                return;
            }
            setLayerType(this.A, null);
        }
    }

    private float getEndRadius() {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25056, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25056, new Class[0], Float.TYPE)).floatValue();
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = height / 2;
        if (width / 2 > this.y.x) {
            i2 = width - this.y.x;
        } else {
            i2 = this.y.x;
        }
        float f2 = (float) i2;
        if (i4 > this.y.y) {
            i3 = height - this.y.y;
        } else {
            i3 = this.y.y;
        }
        return ((float) Math.sqrt(Math.pow((double) f2, 2.0d) + Math.pow((double) ((float) i3), 2.0d))) * 1.2f;
    }

    public final AdapterView b() {
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25058, new Class[0], AdapterView.class)) {
            return (AdapterView) PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25058, new Class[0], AdapterView.class);
        } else if (this.w != null) {
            return this.w;
        } else {
            ViewParent parent = getParent();
            while (!(parent instanceof AdapterView)) {
                try {
                    parent = parent.getParent();
                } catch (NullPointerException unused) {
                    throw new RuntimeException("Could not find a parent AdapterView");
                }
            }
            this.w = (AdapterView) parent;
            return this.w;
        }
    }

    public void setRippleDelayClick(boolean z2) {
        this.f34957e = z2;
    }

    public void setRippleDiameter(int i2) {
        this.f34955c = i2;
    }

    public void setRippleDuration(int i2) {
        this.r = i2;
    }

    public void setRippleFadeDuration(int i2) {
        this.s = i2;
    }

    public void setRippleHover(boolean z2) {
        this.f34954b = z2;
    }

    public void setRippleInAdapter(boolean z2) {
        this.g = z2;
    }

    public void setRippleOverlay(boolean z2) {
        this.q = z2;
    }

    public void setRipplePersistent(boolean z2) {
        this.f34958f = z2;
    }

    public MaterialRippleLayout(Context context) {
        this(context, null, 0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34953a, false, 25050, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34953a, false, 25050, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!a(this.h, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        } else {
            return false;
        }
    }

    public void setDefaultRippleAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34953a, false, 25070, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34953a, false, 25070, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f34956d = (int) (255.0f * f2);
        this.n.setAlpha(this.f34956d);
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f34953a, false, 25048, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f34953a, false, 25048, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.h != null) {
            this.h.setOnClickListener(onClickListener);
        } else {
            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (PatchProxy.isSupport(new Object[]{onLongClickListener}, this, f34953a, false, 25049, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener}, this, f34953a, false, 25049, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
        } else if (this.h != null) {
            this.h.setOnLongClickListener(onLongClickListener);
        } else {
            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
        }
    }

    public void setRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f34953a, false, 25064, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f34953a, false, 25064, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.v = f2;
        invalidate();
    }

    public void setRippleAlpha(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f34953a, false, 25066, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f34953a, false, 25066, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        this.n.setAlpha(num.intValue());
        invalidate();
    }

    public void setRippleBackground(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25068, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25068, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.t = new ColorDrawable(i2);
        this.t.setBounds(this.o);
        invalidate();
    }

    public void setRippleColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25067, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25067, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.p = i2;
        this.n.setColor(i2);
        this.n.setAlpha(this.f34956d);
        invalidate();
    }

    public void setRippleRoundedCorners(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25069, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34953a, false, 25069, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.u = (float) i2;
        d();
    }

    public void draw(Canvas canvas) {
        boolean z2 = true;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34953a, false, 25063, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34953a, false, 25063, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25060, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25060, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g) {
            int positionForView = b().getPositionForView(this);
            if (positionForView == this.B) {
                z2 = false;
            }
            this.B = positionForView;
            if (z2) {
                a();
                c();
                this.h.setPressed(false);
                setRadius(0.0f);
            }
            z3 = z2;
        }
        if (this.q) {
            if (!z3) {
                this.t.draw(canvas);
            }
            super.draw(canvas);
            if (!z3) {
                if (this.u != 0.0f) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), this.u, this.u, Path.Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.y.x, (float) this.y.y, this.v, this.n);
            }
        } else {
            if (!z3) {
                this.t.draw(canvas);
                canvas.drawCircle((float) this.y.x, (float) this.y.y, this.v, this.n);
            }
            super.draw(canvas);
        }
    }

    public final void a(final Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f34953a, false, 25054, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f34953a, false, 25054, new Class[]{Runnable.class}, Void.TYPE);
        } else if (!this.j) {
            float endRadius = getEndRadius();
            c();
            this.x = new AnimatorSet();
            this.x.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34963a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f34963a, false, 25078, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f34963a, false, 25078, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    if (!MaterialRippleLayout.this.f34958f) {
                        MaterialRippleLayout.this.setRadius(0.0f);
                        MaterialRippleLayout.this.setRippleAlpha(Integer.valueOf(MaterialRippleLayout.this.f34956d));
                    }
                    if (runnable != null && MaterialRippleLayout.this.f34957e) {
                        runnable.run();
                    }
                    MaterialRippleLayout.this.h.setPressed(false);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.m, new float[]{this.v, endRadius});
            ofFloat.setDuration((long) this.r);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.G, new int[]{this.f34956d, 0});
            ofInt.setDuration((long) this.s);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.r - this.s) - 50));
            if (this.f34958f) {
                this.x.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.x.play(ofInt);
            } else {
                this.x.playTogether(new Animator[]{ofFloat, ofInt});
            }
            this.x.start();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34953a, false, 25051, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34953a, false, 25051, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled() || !this.h.isEnabled()) {
            return onTouchEvent;
        }
        boolean contains = this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (contains) {
            this.z.set(this.y.x, this.y.y);
            this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.C.onTouchEvent(motionEvent) || this.l) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25059, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25059, new Class[0], Void.TYPE);
                } else if (this.g) {
                    this.B = b().getPositionForView(this);
                }
                this.j = false;
                this.E = new b(motionEvent);
                if (PatchProxy.isSupport(new Object[0], this, f34953a, false, 25057, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34953a, false, 25057, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    ViewParent parent = getParent();
                    while (true) {
                        if (parent == null || !(parent instanceof ViewGroup)) {
                            z2 = false;
                        } else if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                            z2 = true;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                if (!z2) {
                    this.E.run();
                    break;
                } else {
                    a();
                    this.k = true;
                    postDelayed(this.E, (long) ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
            case 1:
                this.D = new a(this, (byte) 0);
                if (this.k) {
                    this.h.setPressed(true);
                    postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f34959a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f34959a, false, 25075, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f34959a, false, 25075, new Class[0], Void.TYPE);
                                return;
                            }
                            MaterialRippleLayout.this.h.setPressed(false);
                        }
                    }, (long) ViewConfiguration.getPressedStateDuration());
                }
                if (contains) {
                    a(this.D);
                } else if (!this.f34954b) {
                    setRadius(0.0f);
                }
                if (!this.f34957e && contains) {
                    this.D.run();
                }
                a();
                break;
            case 2:
                if (this.f34954b) {
                    if (contains && !this.j) {
                        invalidate();
                    } else if (!contains) {
                        a(null);
                    }
                }
                if (!contains) {
                    a();
                    if (this.i != null) {
                        this.i.cancel();
                    }
                    this.h.onTouchEvent(motionEvent);
                    this.j = true;
                    break;
                }
                break;
            case 3:
                if (this.g) {
                    this.y.set(this.z.x, this.z.y);
                    this.z = new Point();
                }
                this.h.onTouchEvent(motionEvent);
                if (!this.f34954b) {
                    this.h.setPressed(false);
                } else if (!this.k) {
                    a(null);
                }
                a();
                break;
        }
        return true;
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), layoutParams}, this, f34953a, false, 25047, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), layoutParams}, this, f34953a, false, 25047, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
        } else if (getChildCount() <= 0) {
            this.h = view2;
            super.addView(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("MaterialRippleLayout can host only one child");
        }
    }

    private boolean a(View view, int i2, int i3) {
        View view2 = view;
        int i4 = i2;
        int i5 = i3;
        loop0:
        while (true) {
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34953a, false, 25061, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34953a, false, 25061, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                while (i6 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i6);
                    Rect rect = new Rect();
                    childAt.getHitRect(rect);
                    if (rect.contains(i4, i5)) {
                        i4 -= rect.left;
                        i5 -= rect.top;
                        view2 = childAt;
                    } else {
                        i6++;
                    }
                }
                break loop0;
            } else if (view2 != this.h) {
                if (!view2.isEnabled() || (!view2.isClickable() && !view2.isLongClickable() && !view2.isFocusableInTouchMode())) {
                    return false;
                }
                return true;
            }
        }
        return view2.isFocusableInTouchMode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialRippleLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        Context context2 = context;
        this.n = new Paint(1);
        this.o = new Rect();
        this.y = new Point();
        this.z = new Point();
        this.F = new GestureDetector.SimpleOnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34961a;

            public final boolean onDown(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34961a, false, 25077, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34961a, false, 25077, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                MaterialRippleLayout.this.l = false;
                return super.onDown(motionEvent);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f34961a, false, 25076, new Class[]{MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f34961a, false, 25076, new Class[]{MotionEvent.class}, Void.TYPE);
                    return;
                }
                MaterialRippleLayout.this.l = MaterialRippleLayout.this.h.performLongClick();
                if (MaterialRippleLayout.this.l) {
                    if (MaterialRippleLayout.this.f34954b) {
                        MaterialRippleLayout.this.a(null);
                    }
                    MaterialRippleLayout.this.a();
                }
            }
        };
        this.m = new Property<MaterialRippleLayout, Float>(Float.class, "radius") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34966a;

            public final /* synthetic */ Object get(Object obj) {
                MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) obj;
                if (!PatchProxy.isSupport(new Object[]{materialRippleLayout}, this, f34966a, false, 25079, new Class[]{MaterialRippleLayout.class}, Float.class)) {
                    return Float.valueOf(materialRippleLayout.getRadius());
                }
                return (Float) PatchProxy.accessDispatch(new Object[]{materialRippleLayout}, this, f34966a, false, 25079, new Class[]{MaterialRippleLayout.class}, Float.class);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) obj;
                Float f2 = (Float) obj2;
                if (PatchProxy.isSupport(new Object[]{materialRippleLayout, f2}, this, f34966a, false, 25080, new Class[]{MaterialRippleLayout.class, Float.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{materialRippleLayout, f2}, this, f34966a, false, 25080, new Class[]{MaterialRippleLayout.class, Float.class}, Void.TYPE);
                    return;
                }
                materialRippleLayout.setRadius(f2.floatValue());
            }
        };
        this.G = new Property<MaterialRippleLayout, Integer>(Integer.class, "rippleAlpha") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34968a;

            public final /* synthetic */ Object get(Object obj) {
                MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) obj;
                if (!PatchProxy.isSupport(new Object[]{materialRippleLayout}, this, f34968a, false, 25081, new Class[]{MaterialRippleLayout.class}, Integer.class)) {
                    return Integer.valueOf(materialRippleLayout.getRippleAlpha());
                }
                return (Integer) PatchProxy.accessDispatch(new Object[]{materialRippleLayout}, this, f34968a, false, 25081, new Class[]{MaterialRippleLayout.class}, Integer.class);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                MaterialRippleLayout materialRippleLayout = (MaterialRippleLayout) obj;
                Integer num = (Integer) obj2;
                if (PatchProxy.isSupport(new Object[]{materialRippleLayout, num}, this, f34968a, false, 25082, new Class[]{MaterialRippleLayout.class, Integer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{materialRippleLayout, num}, this, f34968a, false, 25082, new Class[]{MaterialRippleLayout.class, Integer.class}, Void.TYPE);
                    return;
                }
                materialRippleLayout.setRippleAlpha(num);
            }
        };
        setWillNotDraw(false);
        this.C = new GestureDetector(context2, this.F);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.MaterialRippleLayout);
        this.p = obtainStyledAttributes.getColor(2, -1);
        Resources resources = getResources();
        if (PatchProxy.isSupport(new Object[]{resources, Float.valueOf(35.0f)}, null, f34953a, true, 25074, new Class[]{Resources.class, Float.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{resources, Float.valueOf(35.0f)}, null, f34953a, true, 25074, new Class[]{Resources.class, Float.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics());
        }
        this.f34955c = obtainStyledAttributes.getDimensionPixelSize(4, (int) f2);
        this.q = obtainStyledAttributes.getBoolean(9, false);
        this.f34954b = obtainStyledAttributes.getBoolean(7, true);
        this.r = obtainStyledAttributes.getInt(5, 350);
        this.f34956d = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f34957e = obtainStyledAttributes.getBoolean(3, true);
        this.s = obtainStyledAttributes.getInteger(6, 75);
        this.t = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f34958f = obtainStyledAttributes.getBoolean(10, false);
        this.g = obtainStyledAttributes.getBoolean(8, false);
        this.u = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        this.n.setColor(this.p);
        this.n.setAlpha(this.f34956d);
        d();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34953a, false, 25062, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f34953a, false, 25062, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i2;
        int i7 = i3;
        this.o.set(0, 0, i2, i3);
        this.t.setBounds(this.o);
    }
}
