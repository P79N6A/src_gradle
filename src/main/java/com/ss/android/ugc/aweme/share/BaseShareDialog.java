package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.view.ViewCompat;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.h;
import com.ss.android.ugc.aweme.language.I18nManagerService;

public abstract class BaseShareDialog extends IShareService.SharePage implements View.OnTouchListener, b.C0026b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f64482d;

    /* renamed from: a  reason: collision with root package name */
    private SparseIntArray f64483a;

    /* renamed from: b  reason: collision with root package name */
    private View f64484b;

    /* renamed from: c  reason: collision with root package name */
    private float f64485c = 1.2f;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f64486e;

    /* renamed from: f  reason: collision with root package name */
    public HorizontalScrollView f64487f;
    public LinearLayout g;
    public TextView h;
    public FrameLayout i;
    public DmtTextView j;
    public DmtTextView k;
    public View l;
    public MyHorizontalScrollView m;
    public View n;
    public View o;
    public RemoteImageView p;
    public DmtEditText q;
    public b.a r;
    public LinearLayout s;
    protected boolean t;
    private float u = 1.0f;
    private int v = 100;
    private int w;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f64482d, false, 72965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64482d, false, 72965, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeAllViews();
        super.onDetachedFromWindow();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64482d, false, 72955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64482d, false, 72955, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null && ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(getContext())) {
            this.m.addOnLayoutChangeListener(new r(this));
        }
    }

    public final h a() {
        if (PatchProxy.isSupport(new Object[0], this, f64482d, false, 72971, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64482d, false, 72971, new Class[0], h.class);
        }
        h hVar = new h();
        hVar.f50072a = this.j;
        hVar.f50074c = this.n;
        hVar.f50076e = this.m;
        hVar.j = this.p;
        hVar.f50075d = this.o;
        hVar.k = this.q;
        hVar.f50077f = this.f64484b;
        hVar.f50073b = this.k;
        hVar.l = this;
        return hVar;
    }

    public void addShareViewInTop(View view) {
        this.f64484b = view;
    }

    public BaseShareDialog(Activity activity) {
        super(activity, C0906R.style.re);
        setOwnerActivity(activity);
        this.f64483a = new SparseIntArray(10);
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64482d, false, 72967, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f64482d, false, 72967, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f64487f.addView(view2);
    }

    public void setPanelTitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f64482d, false, 72966, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f64482d, false, 72966, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.h.setText(str2);
    }

    public void addBottomShareItem(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64482d, false, 72968, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f64482d, false, 72968, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g.addView(view2);
        b();
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f64482d, false, 72958, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f64482d, false, 72958, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.mActionHandler == null || !this.mActionHandler.checkStatus(str)) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64482d, false, 72954, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64482d, false, 72954, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.gm);
        this.f64486e = (LinearLayout) findViewById(C0906R.id.chy);
        this.j = (DmtTextView) findViewById(C0906R.id.q2);
        this.k = (DmtTextView) findViewById(C0906R.id.cnn);
        this.n = findViewById(C0906R.id.cpg);
        this.m = (MyHorizontalScrollView) findViewById(C0906R.id.cmb);
        b();
        this.o = findViewById(C0906R.id.b9d);
        this.p = (RemoteImageView) this.o.findViewById(C0906R.id.bo0);
        this.q = (DmtEditText) this.o.findViewById(C0906R.id.bo1);
        int screenHeight = UIUtils.getScreenHeight(getOwnerActivity()) - UIUtils.getStatusBarHeight(getContext());
        Window window = getWindow();
        if (window != null) {
            if (screenHeight == 0) {
                screenHeight = -1;
            }
            a(window, -1, screenHeight);
            LinearLayout linearLayout = this.f64486e;
            if (PatchProxy.isSupport(new Object[]{linearLayout}, this, f64482d, false, 72962, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{linearLayout}, this, f64482d, false, 72962, new Class[]{View.class}, Void.TYPE);
            } else {
                final BottomSheetBehavior from = BottomSheetBehavior.from((View) linearLayout.getParent());
                if (from != null) {
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64488a;

                        public final void onSlide(@NonNull View view, float f2) {
                        }

                        public final void onStateChanged(@NonNull View view, int i) {
                            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f64488a, false, 72974, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f64488a, false, 72974, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i == 5) {
                                BaseShareDialog.this.cancel();
                                from.setState(4);
                            }
                        }
                    });
                }
            }
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
            setCanceledOnTouchOutside(true);
        }
        this.i = (FrameLayout) findViewById(C0906R.id.d5g);
        View view = this.f64484b;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64482d, false, 72963, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64482d, false, 72963, new Class[]{View.class}, Void.TYPE);
        } else if (!(view == null || this.i == null)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                this.i.addView(view);
            } else if (a.a()) {
                throw new IllegalStateException("Cannot add view from a non-ui thread");
            }
        }
        this.f64487f = (HorizontalScrollView) findViewById(C0906R.id.cpf);
        this.g = (LinearLayout) findViewById(C0906R.id.b_h);
        this.h = (TextView) findViewById(C0906R.id.cq4);
        this.l = findViewById(C0906R.id.cpy);
        this.s = (LinearLayout) findViewById(C0906R.id.cq6);
        ViewCompat.requireViewById(this.f64486e, C0906R.id.q2).setOnClickListener(new q(this));
    }

    public BaseShareDialog(Activity activity, byte b2) {
        super(activity, C0906R.style.rc);
        setOwnerActivity(activity);
        this.f64483a = new SparseIntArray(10);
    }

    public void setBaseItemVisible(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f64482d, false, 72957, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f64482d, false, 72957, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View findViewWithTag = this.f64486e.findViewWithTag(str);
        if (findViewWithTag != null) {
            int i3 = this.f64483a.get(findViewWithTag.getId());
            if (i3 > 0) {
                View findViewById = this.f64486e.findViewById(i3);
                if (findViewById != null) {
                    findViewById.setVisibility(i2);
                }
            }
        }
    }

    public void addBottomShareItem(View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f64482d, false, 72969, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f64482d, false, 72969, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.addView(view2, i2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f64482d, false, 72960, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f64482d, false, 72960, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f64482d, false, 72961, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f64482d, false, 72961, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (view != null) {
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        this.w = view.getId();
                        view.animate().cancel();
                        view.animate().scaleY(this.f64485c).scaleX(this.f64485c).setDuration(100).start();
                        break;
                    case 1:
                        break;
                }
            }
            if (view.getId() == this.w) {
                view.animate().cancel();
                view.animate().scaleY(1.0f).scaleX(1.0f).setDuration(100).start();
            }
            this.w = 0;
        }
        return false;
    }

    public void a(@NonNull Window window, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{window, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f64482d, false, 72956, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f64482d, false, 72956, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        window.setLayout(i2, i3);
    }
}
