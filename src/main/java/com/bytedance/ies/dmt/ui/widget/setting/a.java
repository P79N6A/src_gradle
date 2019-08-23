package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.c;
import com.ss.android.ugc.aweme.C0906R;

public abstract class a extends ConstraintLayout {

    /* renamed from: f  reason: collision with root package name */
    protected String f20513f;
    protected String g;
    protected float h;
    protected int i;
    protected String j;
    protected float k;
    protected int l;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected FrameLayout p;
    protected FrameLayout q;
    protected TextView r;
    protected TextView s;
    protected View t;
    protected ImageView u;
    protected C0015a v;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.a$a  reason: collision with other inner class name */
    public interface C0015a {
        void a(View view);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    public int getRightLayoutId() {
        return -1;
    }

    public TextView getTxtRight() {
        return null;
    }

    public FrameLayout getDecorLayout() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        setBackground(c.e(getContext()));
        this.r = (TextView) findViewById(C0906R.id.ddn);
        this.s = (TextView) findViewById(C0906R.id.ddm);
        this.q = (FrameLayout) findViewById(C0906R.id.afu);
        this.u = (ImageView) findViewById(C0906R.id.b2k);
        this.t = findViewById(C0906R.id.dnx);
        this.p = (FrameLayout) findViewById(C0906R.id.cem);
        this.r.setText(this.g);
        this.r.setTextSize(this.h);
        this.r.setTextColor(this.i);
        if (!TextUtils.isEmpty(this.j)) {
            this.s.setText(this.j);
            this.r.setMaxLines(1);
            if (getLayoutParams() != null) {
                getLayoutParams().height = (int) UIUtils.dip2Px(getContext(), 70.0f);
            }
        } else {
            this.s.setVisibility(8);
        }
        this.s.setTextSize(this.k);
        this.s.setTextColor(this.l);
        if (this.m != -1) {
            a(this.u, this.m);
        } else {
            this.u.setVisibility(8);
        }
        if (!this.n) {
            this.t.setVisibility(8);
        }
        this.t.setBackgroundColor(c.d(getContext()));
        int rightLayoutId = getRightLayoutId();
        if (-1 != rightLayoutId) {
            this.p.removeAllViews();
            LayoutInflater.from(getContext()).inflate(rightLayoutId, this.p, true);
        }
        if (this.o) {
            this.p.setVisibility(8);
        }
        a();
    }

    @CallSuper
    public void setRightTxt(String str) {
        this.f20513f = str;
    }

    public a(Context context) {
        this(context, null);
    }

    public void setRightLayoutVisibility(int i2) {
        this.p.setVisibility(i2);
    }

    public void setStartText(String str) {
        this.r.setText(str);
    }

    public void setOnSettingItemClickListener(C0015a aVar) {
        this.v = aVar;
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (a.this.v != null) {
                    a.this.v.a(a.this);
                }
            }
        });
    }

    public void setSubText(String str) {
        this.s.setVisibility(0);
        this.s.setText(str);
    }

    public void setStartIcon(int i2) {
        if (getContext() != null && getContext().getResources() != null) {
            a(this.u, i2);
        }
    }

    public void setStartTextColor(int i2) {
        if (getContext() != null) {
            this.r.setTextColor(ContextCompat.getColor(getContext(), i2));
        }
    }

    public void setSubTextColor(int i2) {
        if (getContext() != null) {
            this.s.setTextColor(ContextCompat.getColor(getContext(), i2));
        }
    }

    private static void a(ImageView imageView, int i2) {
        imageView.setImageResource(i2);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
        this.g = obtainStyledAttributes.getString(11);
        this.h = obtainStyledAttributes.getDimension(15, 15.0f);
        this.i = obtainStyledAttributes.getColor(14, c.a(context));
        this.j = obtainStyledAttributes.getString(10);
        this.k = obtainStyledAttributes.getDimension(13, 13.0f);
        this.l = obtainStyledAttributes.getColor(12, c.c(context));
        if (obtainStyledAttributes.hasValue(9)) {
            this.m = obtainStyledAttributes.getResourceId(9, -1);
        }
        this.n = obtainStyledAttributes.getBoolean(3, false);
        this.f20513f = obtainStyledAttributes.getString(1);
        this.o = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        a(context, attributeSet);
    }
}
