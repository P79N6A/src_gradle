package com.ss.android.ugc.aweme.filter;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.av.widget.CompatBottomSheetDialog;
import com.ss.android.ugc.aweme.filter.base.SpaceItemDecoration;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.tools.R$styleable;
import java.util.List;

public class FilterDialog extends CompatBottomSheetDialog {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f47382c;

    /* renamed from: d  reason: collision with root package name */
    MutableLiveData<h> f47383d;

    /* renamed from: e  reason: collision with root package name */
    public FilterAdapter f47384e;

    /* renamed from: f  reason: collision with root package name */
    Observer<List<h>> f47385f = new Observer<List<h>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47386a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f47386a, false, 44222, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f47386a, false, 44222, new Class[]{List.class}, Void.TYPE);
                return;
            }
            FilterDialog.this.f47384e.submitList(list);
        }
    };
    public h g;
    TextView h;
    TextView i;
    TextView j;
    FilterDialogExtContentLayout k;
    FilterDialogExtContentLayout l;
    boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public View q;
    public aw r;
    private Activity s;
    private RecyclerView t;
    private CoordinatorLayout u;
    private LinearLayout v;
    private ImageView w;
    private z x;
    private Observer<h> y = new Observer<h>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47394a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            h hVar = (h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f47394a, false, 44224, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f47394a, false, 44224, new Class[]{h.class}, Void.TYPE);
                return;
            }
            FilterDialog.this.f47384e.a(hVar);
        }
    };

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44217, new Class[0], Void.TYPE);
            return;
        }
        a.d().a().removeObserver(this.f47385f);
        if (this.f47383d != null) {
            this.f47383d.removeObserver(this.y);
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44221, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.f47384e.a(this.g);
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44216, new Class[0], Void.TYPE);
            return;
        }
        super.cancel();
        b();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44215, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        b();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44214, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        a(true, new MutableLiveData<>());
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44203, new Class[0], Void.TYPE);
            return;
        }
        b(this.t);
        if (!this.m) {
            a(this.h, true);
            a(this.i, false);
            a(this.j, false);
        }
        this.n = true;
        this.o = false;
        this.p = false;
    }

    public FilterDialog(Context context) {
        super(context, C0906R.style.ra);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.s = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        setOwnerActivity(this.s);
    }

    private void c(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47382c, false, 44206, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47382c, false, 44206, new Class[]{View.class}, Void.TYPE);
        } else if (this.q != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47402a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f47402a, false, 44228, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f47402a, false, 44228, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    FilterDialog.this.q.setVisibility(8);
                    FilterDialog.this.a(view);
                }
            });
            this.q.startAnimation(alphaAnimation);
        } else {
            a(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47382c, false, 44208, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47382c, false, 44208, new Class[]{View.class}, Void.TYPE);
            return;
        }
        c(view);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47382c, false, 44211, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47382c, false, 44211, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = z;
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44202, new Class[0], Void.TYPE);
            return;
        }
        if (this.m) {
            this.w.setVisibility(0);
            this.v.setVisibility(8);
        } else {
            this.w.setVisibility(8);
            this.v.setVisibility(0);
        }
        a();
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44210, new Class[0], Void.TYPE);
            return;
        }
        b();
        this.f47384e = new FilterAdapter(getContext());
        this.f47384e.f47342e = new aw() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47407a;

            public final void a(h hVar) {
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f47407a, false, 44229, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f47407a, false, 44229, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                if (FilterDialog.this.r != null) {
                    FilterDialog.this.r.a(hVar);
                }
                FilterDialog.this.f47383d.setValue(hVar);
            }
        };
        this.t.setAdapter(this.f47384e);
        this.f47384e.f47343f = this.x;
    }

    public final void a(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f47382c, false, 44207, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f47382c, false, 44207, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    FilterDialog.this.q = view2;
                }
            });
            view2.setVisibility(0);
            view2.startAnimation(alphaAnimation);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f47382c, false, 44200, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f47382c, false, 44200, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1024);
        setContentView((int) C0906R.layout.a_6);
        if (PatchProxy.isSupport(new Object[0], this, f47382c, false, 44201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47382c, false, 44201, new Class[0], Void.TYPE);
        } else {
            this.u = (CoordinatorLayout) findViewById(C0906R.id.be7);
            this.v = (LinearLayout) findViewById(C0906R.id.cyn);
            this.h = (TextView) findViewById(C0906R.id.cys);
            this.h.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47396a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47396a, false, 44225, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47396a, false, 44225, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!FilterDialog.this.n) {
                        FilterDialog.this.a();
                    }
                }
            });
            this.i = (TextView) findViewById(C0906R.id.cz3);
            this.i.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47398a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47398a, false, 44226, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47398a, false, 44226, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!FilterDialog.this.o) {
                        FilterDialog filterDialog = FilterDialog.this;
                        if (PatchProxy.isSupport(new Object[0], filterDialog, FilterDialog.f47382c, false, 44204, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], filterDialog, FilterDialog.f47382c, false, 44204, new Class[0], Void.TYPE);
                            return;
                        }
                        filterDialog.b(filterDialog.k);
                        if (!filterDialog.m) {
                            filterDialog.a(filterDialog.h, false);
                            filterDialog.a(filterDialog.i, true);
                            filterDialog.a(filterDialog.j, false);
                        }
                        filterDialog.n = false;
                        filterDialog.o = true;
                        filterDialog.p = false;
                    }
                }
            });
            this.j = (TextView) findViewById(C0906R.id.cym);
            this.j.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47400a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47400a, false, 44227, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47400a, false, 44227, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!FilterDialog.this.p) {
                        FilterDialog filterDialog = FilterDialog.this;
                        if (PatchProxy.isSupport(new Object[0], filterDialog, FilterDialog.f47382c, false, 44205, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], filterDialog, FilterDialog.f47382c, false, 44205, new Class[0], Void.TYPE);
                            return;
                        }
                        filterDialog.b(filterDialog.l);
                        if (!filterDialog.m) {
                            filterDialog.a(filterDialog.h, false);
                            filterDialog.a(filterDialog.i, false);
                            filterDialog.a(filterDialog.j, true);
                        }
                        filterDialog.n = false;
                        filterDialog.o = false;
                        filterDialog.p = true;
                    }
                }
            });
            this.t = (RecyclerView) findViewById(C0906R.id.ae0);
            this.t.setLayoutManager(new CenterLayoutManager(this.s, 0, false));
            this.t.addItemDecoration(new SpaceItemDecoration(this.s, b.a(this.s, 20.0f)));
            this.k = (FilterDialogExtContentLayout) findViewById(C0906R.id.cse);
            this.k.setExtContentType(0);
            this.k.setItemInterceptor(this.x);
            this.l = (FilterDialogExtContentLayout) findViewById(C0906R.id.kv);
            this.l.setExtContentType(1);
            this.l.setItemInterceptor(this.x);
            this.w = (ImageView) findViewById(C0906R.id.d5f);
        }
        Activity activity = this.s;
        if (PatchProxy.isSupport(new Object[]{activity}, null, f47382c, true, 44197, new Class[]{Activity.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{activity}, null, f47382c, true, 44197, new Class[]{Activity.class}, Integer.TYPE)).intValue();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, f47382c, true, 44198, new Class[]{Context.class}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f47382c, true, 44198, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = resources.getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
        }
        int i4 = i2 - i3;
        Window window = getWindow();
        if (window != null) {
            if (i4 == 0) {
                i4 = -1;
            }
            window.setLayout(-1, i4);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
        }
        CoordinatorLayout coordinatorLayout = this.u;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout}, this, f47382c, false, 44220, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout}, this, f47382c, false, 44220, new Class[]{View.class}, Void.TYPE);
        } else {
            final BottomSheetBehavior from = BottomSheetBehavior.from((View) coordinatorLayout.getParent());
            if (from != null) {
                from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47391a;

                    public final void onSlide(@NonNull View view, float f2) {
                    }

                    public final void onStateChanged(@NonNull View view, int i) {
                        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f47391a, false, 44223, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f47391a, false, 44223, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == 5) {
                            FilterDialog.this.dismiss();
                            from.setState(4);
                        }
                    }
                });
            }
        }
        setCanceledOnTouchOutside(true);
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView, boolean z) {
        int i2;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f47382c, false, 44209, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Byte.valueOf(z)}, this, f47382c, false, 44209, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = textView.getContext().getTheme().obtainStyledAttributes(R$styleable.Reverse_Color);
        if (z) {
            i2 = obtainStyledAttributes.getColor(20, 0);
        } else {
            i2 = obtainStyledAttributes.getColor(9, 0);
        }
        textView2.setTextColor(i2);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z, MutableLiveData<h> mutableLiveData) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), mutableLiveData}, this, f47382c, false, 44218, new Class[]{Boolean.TYPE, MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), mutableLiveData}, this, f47382c, false, 44218, new Class[]{Boolean.TYPE, MutableLiveData.class}, Void.TYPE);
            return;
        }
        super.show();
        a(z);
        a.d().a().observe((LifecycleOwner) this.s, this.f47385f);
        mutableLiveData.observe((LifecycleOwner) this.s, this.y);
        this.f47383d = mutableLiveData;
        c();
    }
}
