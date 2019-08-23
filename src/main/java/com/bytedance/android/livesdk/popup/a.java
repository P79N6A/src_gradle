package com.bytedance.android.livesdk.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.PopupWindowCompat;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.popup.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a<T extends a> implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16841a;
    private boolean A = true;
    private int B;
    private int C = 1;

    /* renamed from: b  reason: collision with root package name */
    public PopupWindow f16842b;

    /* renamed from: c  reason: collision with root package name */
    Context f16843c;

    /* renamed from: d  reason: collision with root package name */
    public View f16844d;

    /* renamed from: e  reason: collision with root package name */
    public int f16845e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16846f = true;
    public int g = -2;
    public int h = -2;
    public PopupWindow.OnDismissListener i;
    public View j;
    public int k = 2;
    public int l = 1;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public C0115a r;
    private boolean s = true;
    private int t;
    private boolean u;
    private float v = 0.7f;
    @ColorInt
    private int w = -16777216;
    @NonNull
    private ViewGroup x;
    private Transition y;
    private Transition z;

    /* renamed from: com.bytedance.android.livesdk.popup.a$a  reason: collision with other inner class name */
    public interface C0115a {
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12769, new Class[0], Void.TYPE);
        }
    }

    public final T a() {
        return this;
    }

    public abstract void a(View view, T t2);

    public final T a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16841a, false, 12790, new Class[]{Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16841a, false, 12790, new Class[]{Boolean.TYPE}, a.class);
        }
        this.s = z2;
        return a();
    }

    public final void a(@NonNull View view, int i2, int i3, int i4, int i5) {
        View view2 = view;
        int i6 = i2;
        int i7 = i3;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f16841a, false, 12809, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f16841a, false, 12809, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        c(true);
        this.j = view2;
        this.m = i4;
        this.n = i5;
        this.k = i6;
        this.l = i7;
        d();
        int b2 = b(view2, i7, this.g, this.m);
        int a2 = a(view2, i6, this.h, this.n);
        if (this.o) {
            c();
        }
        PopupWindowCompat.showAsDropDown(this.f16842b, view2, b2, a2, 0);
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12772, new Class[0], Void.TYPE);
            return;
        }
        e().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16851a;

            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f16851a, false, 12829, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16851a, false, 12829, new Class[0], Void.TYPE);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    a.this.e().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    a.this.e().getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                a.this.g = a.this.e().getWidth();
                a.this.h = a.this.e().getHeight();
                a.this.p = true;
                a.this.o = false;
                if (a.this.r != null) {
                    if (a.this.j != null) {
                        a.this.j.getWidth();
                    }
                    if (a.this.j != null) {
                        a.this.j.getHeight();
                    }
                }
                if (a.this.f() && a.this.q) {
                    a aVar = a.this;
                    int i = a.this.g;
                    int i2 = a.this.h;
                    View view = a.this.j;
                    int i3 = a.this.k;
                    int i4 = a.this.l;
                    int i5 = a.this.m;
                    int i6 = a.this.n;
                    int i7 = i6;
                    int i8 = i5;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, aVar, a.f16841a, false, 12773, new Class[]{Integer.TYPE, Integer.TYPE, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i7)}, aVar2, a.f16841a, false, 12773, new Class[]{Integer.TYPE, Integer.TYPE, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (aVar.f16842b != null) {
                        aVar.f16842b.update(view, aVar.b(view, i4, i, i8), aVar.a(view, i3, i2, i7), i, i2);
                    }
                }
            }
        });
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12823, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16842b != null) {
            c.a(this.f16842b);
        }
    }

    public final View e() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12820, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12820, new Class[0], View.class);
        } else if (this.f16842b != null) {
            return this.f16842b.getContentView();
        } else {
            return null;
        }
    }

    public final boolean f() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12821, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12821, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16842b != null && this.f16842b.isShowing()) {
            z2 = true;
        }
        return z2;
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12768, new Class[0], Void.TYPE);
        } else if (!this.A) {
            this.f16842b.setFocusable(true);
            this.f16842b.setOutsideTouchable(false);
            this.f16842b.setBackgroundDrawable(null);
            this.f16842b.getContentView().setFocusable(true);
            this.f16842b.getContentView().setFocusableInTouchMode(true);
            this.f16842b.getContentView().setOnKeyListener(new View.OnKeyListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16847a;

                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f16847a, false, 12826, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f16847a, false, 12826, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                    } else if (i == 4) {
                        PopupWindow popupWindow = a.this.f16842b;
                        if (PatchProxy.isSupport(new Object[]{popupWindow}, null, b.f16853a, true, 12827, new Class[]{PopupWindow.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{popupWindow}, null, b.f16853a, true, 12827, new Class[]{PopupWindow.class}, Void.TYPE);
                        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            popupWindow.dismiss();
                        } else {
                            throw new IllegalStateException("debug check! this method should be called from main thread!");
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            this.f16842b.setTouchInterceptor(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16849a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f16849a, false, 12828, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f16849a, false, 12828, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if ((motionEvent.getAction() != 0 || (x >= 0 && x < a.this.g && y >= 0 && y < a.this.h)) && motionEvent.getAction() != 4) {
                        return false;
                    }
                    return true;
                }
            });
        } else {
            this.f16842b.setFocusable(this.f16846f);
            this.f16842b.setOutsideTouchable(this.s);
            this.f16842b.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12771, new Class[0], Void.TYPE);
            return;
        }
        View e2 = e();
        if (this.g <= 0 || this.h <= 0) {
            e2.measure(0, 0);
            if (this.g <= 0) {
                this.g = e2.getMeasuredWidth();
            }
            if (this.h <= 0) {
                this.h = e2.getMeasuredHeight();
            }
        }
    }

    public final T b() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12766, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12766, new Class[0], a.class);
        }
        if (this.f16842b == null) {
            this.f16842b = new PopupWindow();
        }
        i();
        g();
        a(this.f16844d);
        if (this.t != 0) {
            this.f16842b.setAnimationStyle(this.t);
        }
        h();
        this.f16842b.setOnDismissListener(this);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.y != null) {
                this.f16842b.setEnterTransition(this.y);
            }
            if (this.z != null) {
                this.f16842b.setExitTransition(this.z);
            }
        }
        return a();
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12814, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 18 && this.u) {
            if (this.x != null) {
                a(this.x);
                return;
            }
            if (!(e() == null || e().getContext() == null || !(e().getContext() instanceof Activity))) {
                a((Activity) e().getContext());
            }
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12767, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16844d == null) {
            if (this.f16845e == 0 || this.f16843c == null) {
                throw new IllegalArgumentException("The content view is null,the layoutId=" + this.f16845e + ",appContext=" + this.f16843c);
            }
            this.f16844d = LayoutInflater.from(this.f16843c).inflate(this.f16845e, null);
        }
        this.f16842b.setContentView(this.f16844d);
        if (this.g > 0 || this.g == -2 || this.g == -1) {
            this.f16842b.setWidth(this.g);
        } else {
            this.f16842b.setWidth(-2);
        }
        if (this.h > 0 || this.h == -2 || this.h == -1) {
            this.f16842b.setHeight(this.h);
        } else {
            this.f16842b.setHeight(-2);
        }
        j();
        c();
        this.f16842b.setInputMethodMode(this.B);
        this.f16842b.setSoftInputMode(this.C);
    }

    public void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12824, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12825, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.onDismiss();
        }
        if (PatchProxy.isSupport(new Object[0], this, f16841a, false, 12817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16841a, false, 12817, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 18 && this.u) {
            if (this.x != null) {
                ViewGroup viewGroup = this.x;
                if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f16841a, false, 12819, new Class[]{ViewGroup.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f16841a, false, 12819, new Class[]{ViewGroup.class}, Void.TYPE);
                } else {
                    viewGroup.getOverlay().clear();
                }
            } else if (e() != null) {
                Activity activity = (Activity) e().getContext();
                if (activity != null) {
                    if (PatchProxy.isSupport(new Object[]{activity}, this, f16841a, false, 12818, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, this, f16841a, false, 12818, new Class[]{Activity.class}, Void.TYPE);
                    } else {
                        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
                    }
                }
            }
        }
        if (this.f16842b != null && this.f16842b.isShowing()) {
            c.a(this.f16842b);
        }
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f16841a, false, 12770, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f16841a, false, 12770, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view2, a());
    }

    @RequiresApi(api = 18)
    private void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f16841a, false, 12815, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f16841a, false, 12815, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.w);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.v * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    public void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16841a, false, 12801, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16841a, false, 12801, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.q != z2) {
            this.q = z2;
        }
        if (this.f16842b == null) {
            b();
        }
    }

    @RequiresApi(api = 18)
    private void a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f16841a, false, 12816, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f16841a, false, 12816, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(this.w);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.v * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    public final T b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16841a, false, 12782, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16841a, false, 12782, new Class[]{Integer.TYPE}, a.class);
        }
        this.h = i2;
        return a();
    }

    public final T a(@LayoutRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16841a, false, 12776, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16841a, false, 12776, new Class[]{Integer.TYPE}, a.class);
        }
        this.f16844d = null;
        this.f16845e = i2;
        return a();
    }

    public final T b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f16841a, false, 12791, new Class[]{Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f16841a, false, 12791, new Class[]{Boolean.TYPE}, a.class);
        }
        this.A = true;
        return a();
    }

    public final T a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16841a, false, 12778, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16841a, false, 12778, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, a.class);
        }
        this.f16844d = view2;
        this.f16845e = 0;
        this.g = i2;
        this.h = i3;
        return a();
    }

    /* access modifiers changed from: package-private */
    public int b(View view, int i2, int i3, int i4) {
        int i5;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f16841a, false, 12811, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f16841a, false, 12811, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i2) {
            case 0:
                i5 = i4 + ((view.getWidth() / 2) - (i3 / 2));
                break;
            case 1:
                i5 = i4 - i3;
                break;
            case 2:
                i5 = i4 + view.getWidth();
                break;
            case 4:
                i5 = i4 - (i3 - view.getWidth());
                break;
            default:
                i5 = i4;
                break;
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    public int a(View view, int i2, int i3, int i4) {
        int i5;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f16841a, false, 12810, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f16841a, false, 12810, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i2) {
            case 0:
                i5 = i4 - ((view.getHeight() / 2) + (i3 / 2));
                break;
            case 1:
                i5 = i4 - (i3 + view.getHeight());
                break;
            case 3:
                i5 = i4 - view.getHeight();
                break;
            case 4:
                i5 = i4 - i3;
                break;
            default:
                i5 = i4;
                break;
        }
        return i5;
    }
}
