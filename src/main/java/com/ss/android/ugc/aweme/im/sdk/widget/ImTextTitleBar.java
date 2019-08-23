package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.R$styleable;
import com.ss.android.ugc.aweme.im.sdk.utils.au;

public class ImTextTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52780a;

    /* renamed from: b  reason: collision with root package name */
    public a f52781b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52782c;

    /* renamed from: d  reason: collision with root package name */
    private String f52783d;

    /* renamed from: e  reason: collision with root package name */
    private String f52784e;

    /* renamed from: f  reason: collision with root package name */
    private String f52785f;
    private Drawable g;
    private Drawable h;
    private float i;
    private float j;
    private float k;
    @ColorInt
    private int l;
    @ColorInt
    private int m;
    @ColorInt
    private int n;
    private DmtTextView o;
    private DmtTextView p;
    private View q;
    private DmtTextView r;
    private DmtTextView s;
    private AutoRTLImageView t;
    private AutoRTLImageView u;
    private ViewGroup v;
    private ViewGroup w;

    public interface a {
        void a();

        void b();
    }

    public DmtTextView getLeftTextView() {
        return this.o;
    }

    public View getLeftView() {
        return this.v;
    }

    public DmtTextView getRightTexView() {
        return this.p;
    }

    public View getRightView() {
        return this.w;
    }

    private void a() {
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f52780a, false, 54134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52780a, false, 54134, new Class[0], Void.TYPE);
            return;
        }
        int screenWidth = UIUtils.getScreenWidth(getContext());
        if (this.v.getVisibility() == 8 && this.w.getVisibility() == 8) {
            i2 = screenWidth - ((int) UIUtils.dip2Px(getContext(), 32.0f));
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (this.v.getVisibility() != 8) {
                this.v.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = this.v.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            if (this.w.getVisibility() != 8) {
                this.w.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 = this.w.getMeasuredWidth();
            }
            i2 = screenWidth - (Math.max(i3, i4) * 2);
        }
        if (this.s.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
            layoutParams.width = i2;
            this.q.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.r.getLayoutParams();
            layoutParams2.width = -2;
            this.r.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.r.getLayoutParams();
        layoutParams3.width = i2;
        this.r.setLayoutParams(layoutParams3);
    }

    public void setOnTitlebarClickListener(a aVar) {
        this.f52781b = aVar;
    }

    public ImTextTitleBar(@NonNull Context context) {
        this(context, null);
    }

    public void setTitle(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52780a, false, 54117, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52780a, false, 54117, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52785f = str;
        this.r.setText(str);
    }

    public void setLeftIcon(@DrawableRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54126, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54126, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setLeftIcon(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    public void setLeftText(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54122, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54122, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setLeftText(GlobalContext.getContext().getResources().getString(i2));
    }

    public void setLeftTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54124, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54124, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        if (this.o != null) {
            this.o.setTextColor(this.l);
        }
    }

    public void setLeftTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54125, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54125, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.i = f2;
        if (this.o != null) {
            this.o.setTextSize(0, this.i);
            a();
        }
    }

    public void setRightIcon(@DrawableRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54132, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54132, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setRightIcon(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), i2));
    }

    public void setRightText(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54129, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54129, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setRightText(GlobalContext.getContext().getResources().getString(i2));
    }

    public void setRightTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54130, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54130, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = i2;
        if (this.p != null) {
            this.p.setTextColor(this.m);
        }
    }

    public void setRightTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54131, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54131, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = f2;
        if (this.p != null) {
            this.p.setTextSize(0, this.j);
            a();
        }
    }

    public void setTitle(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54116, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54116, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setTitle(GlobalContext.getContext().getResources().getString(i2));
    }

    public void setTitleCount(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52780a, false, 54121, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52780a, false, 54121, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.s.getVisibility() != 0) {
            this.s.setVisibility(0);
        }
        this.s.setText(str);
        a();
    }

    public void setTitleTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54120, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52780a, false, 54120, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n = i2;
        this.r.setTextColor(this.n);
    }

    public void setTitleTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54119, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52780a, false, 54119, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k = f2;
        this.r.setTextSize(0, f2);
    }

    public void setLeftIcon(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f52780a, false, 54127, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f52780a, false, 54127, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.g = drawable;
        if (this.o != null) {
            this.o.setVisibility(8);
        }
        if (this.t == null) {
            this.t = new AutoRTLImageView(getContext());
            this.t.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.v.addView(this.t);
            this.v.setVisibility(0);
        } else {
            this.t.setVisibility(0);
        }
        this.v.setContentDescription(getContext().getResources().getString(C0906R.string.kj));
        this.t.setImageDrawable(this.g);
        a();
    }

    public void setLeftText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52780a, false, 54123, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52780a, false, 54123, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52783d = str;
        if (this.t != null) {
            this.t.setVisibility(8);
        }
        if (this.o == null) {
            this.o = new DmtTextView(getContext());
            this.v.addView(this.o);
            this.v.setVisibility(0);
            this.o.setTextColor(this.l);
            this.o.setTextSize(0, this.i);
        } else {
            this.o.setVisibility(0);
        }
        this.o.setText(this.f52783d);
        this.v.setContentDescription(this.f52783d);
        a();
    }

    public void setRightIcon(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f52780a, false, 54133, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f52780a, false, 54133, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.h = drawable;
        if (this.p != null) {
            this.p.setVisibility(8);
        }
        if (this.u == null) {
            this.u = new AutoRTLImageView(getContext());
            this.u.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.w.addView(this.u);
            this.w.setVisibility(0);
        } else {
            this.u.setVisibility(0);
        }
        this.w.setContentDescription(getContext().getResources().getString(C0906R.string.av5));
        this.u.setImageDrawable(this.h);
        a();
    }

    public void setRightText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52780a, false, 54128, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52780a, false, 54128, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52784e = str;
        if (this.u != null) {
            this.u.setVisibility(8);
        }
        if (this.p == null) {
            this.p = new DmtTextView(getContext());
            this.w.addView(this.p);
            this.w.setVisibility(0);
            this.p.setTextSize(0, this.j);
            this.p.setTextColor(this.m);
        } else {
            this.p.setVisibility(0);
        }
        this.w.setContentDescription(this.f52784e);
        this.p.setText(this.f52784e);
        a();
    }

    public void setTitle(CharSequence charSequence) {
        String str;
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f52780a, false, 54118, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f52780a, false, 54118, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        this.f52785f = str;
        this.r.setText(charSequence);
    }

    public ImTextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImTextTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f52782c = true;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f52780a, false, 54114, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f52780a, false, 54114, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ImTextTitleBar);
            this.f52782c = obtainStyledAttributes.getBoolean(11, true);
            this.f52783d = obtainStyledAttributes.getString(2);
            this.f52784e = obtainStyledAttributes.getString(6);
            this.f52785f = obtainStyledAttributes.getString(8);
            if (TextUtils.isEmpty(this.f52783d)) {
                this.g = obtainStyledAttributes.getDrawable(1);
            }
            this.l = obtainStyledAttributes.getColor(0, context.getResources().getColor(C0906R.color.ro));
            this.i = obtainStyledAttributes.getDimension(3, UIUtils.dip2Px(context, 16.0f));
            if (TextUtils.isEmpty(this.f52784e)) {
                this.h = obtainStyledAttributes.getDrawable(5);
            }
            this.m = obtainStyledAttributes.getColor(4, context.getResources().getColor(C0906R.color.ro));
            this.j = obtainStyledAttributes.getDimension(7, UIUtils.dip2Px(context, 16.0f));
            this.n = obtainStyledAttributes.getColor(9, context.getResources().getColor(C0906R.color.rm));
            this.k = obtainStyledAttributes.getDimension(10, UIUtils.dip2Px(context, 17.0f));
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[]{context2}, this, f52780a, false, 54115, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f52780a, false, 54115, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        inflate(context, C0906R.layout.a50, this);
        this.v = (ViewGroup) findViewById(C0906R.id.bav);
        this.w = (ViewGroup) findViewById(C0906R.id.cek);
        this.q = findViewById(C0906R.id.d3v);
        this.r = (DmtTextView) findViewById(C0906R.id.d41);
        this.s = (DmtTextView) findViewById(C0906R.id.a0h);
        if (!TextUtils.isEmpty(this.f52783d)) {
            setLeftText(this.f52783d);
            setLeftTextColor(this.l);
            setLeftTextSize(this.i);
        } else if (this.g != null) {
            setLeftIcon(this.g);
        } else if (this.f52782c) {
            setLeftIcon(com.ss.android.ugc.bytex.a.a.a.a(getContext().getResources(), 2130841646));
        }
        if (!TextUtils.isEmpty(this.f52784e)) {
            setRightText(this.f52784e);
            setRightTextColor(this.m);
            setRightTextSize(this.j);
        } else if (this.h != null) {
            setRightIcon(this.h);
        }
        if (!TextUtils.isEmpty(this.f52785f)) {
            setTitle(this.f52785f);
            setTitleTextColor(this.n);
            setTitleTextSize(this.k);
        }
        this.v.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52786a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f52786a, false, 54135, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f52786a, false, 54135, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f52781b != null) {
                    ImTextTitleBar.this.f52781b.a();
                }
            }
        });
        this.w.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52788a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f52788a, false, 54136, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f52788a, false, 54136, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f52781b != null) {
                    ImTextTitleBar.this.f52781b.b();
                }
            }
        });
        au.a(this.v);
        au.a(this.w);
    }
}
