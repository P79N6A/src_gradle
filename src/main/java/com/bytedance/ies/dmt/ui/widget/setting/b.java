package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.c;
import com.ss.android.ugc.aweme.C0906R;

public abstract class b extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20515a;

    /* renamed from: e  reason: collision with root package name */
    protected String f20516e;

    /* renamed from: f  reason: collision with root package name */
    protected View f20517f;
    protected RelativeLayout g;
    protected FrameLayout h;
    protected ViewGroup i;
    protected FrameLayout j;
    protected TextView k;
    protected TextView l;
    protected View m;
    protected ImageView n;
    protected a o;
    protected int p;

    public interface a {
        void OnSettingItemClick(View view);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    public abstract int getRightLayoutId();

    public TextView getTxtRight() {
        return null;
    }

    public FrameLayout getDecorLayout() {
        return this.j;
    }

    @CallSuper
    public void setRightTxt(String str) {
        this.f20516e = str;
    }

    public b(Context context) {
        this(context, null);
    }

    public void setStartText(String str) {
        this.k.setText(str);
    }

    public void setOnSettingItemClickListener(a aVar) {
        this.o = aVar;
        this.g.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (b.this.o != null) {
                    b.this.o.OnSettingItemClick(b.this.f20517f);
                }
            }
        });
    }

    public void setRightLayoutVisibility(int i2) {
        ((ViewGroup) findViewById(C0906R.id.cem)).setVisibility(i2);
    }

    public void setSubText(String str) {
        this.l.setVisibility(0);
        this.l.setText(str);
    }

    public void setStartIcon(int i2) {
        if (getContext() != null && getContext().getResources() != null) {
            a(this.n, i2);
        }
    }

    public void setStartTextColor(int i2) {
        if (getContext() != null) {
            this.k.setTextColor(ContextCompat.getColor(getContext(), i2));
        }
    }

    public void setSubTextColor(int i2) {
        if (getContext() != null) {
            this.l.setTextColor(ContextCompat.getColor(getContext(), i2));
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void a(Context context) {
        this.f20517f = View.inflate(context, C0906R.layout.apa, this);
        this.g = (RelativeLayout) this.f20517f.findViewById(C0906R.id.chy);
        this.k = (TextView) this.f20517f.findViewById(C0906R.id.ddn);
        this.l = (TextView) this.f20517f.findViewById(C0906R.id.ddm);
        this.i = (ViewGroup) this.f20517f.findViewById(C0906R.id.cgo);
        this.j = (FrameLayout) this.f20517f.findViewById(C0906R.id.afu);
        this.n = (ImageView) this.f20517f.findViewById(C0906R.id.b2k);
        this.m = this.f20517f.findViewById(C0906R.id.dnx);
        this.h = (FrameLayout) findViewById(C0906R.id.cej);
        int rightLayoutId = getRightLayoutId();
        if (rightLayoutId != 0) {
            LayoutInflater.from(context).inflate(rightLayoutId, this.h, true);
        }
    }

    private static void a(ImageView imageView, int i2) {
        imageView.setImageResource(i2);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
        this.g.setBackground(c.e(context));
        this.k.setText(obtainStyledAttributes.getString(11));
        this.k.setTextColor(obtainStyledAttributes.getColor(14, c.a(context)));
        String string = obtainStyledAttributes.getString(10);
        if (!TextUtils.isEmpty(string)) {
            this.l.setText(string);
            this.k.setMaxLines(1);
            this.g.getLayoutParams().height = (int) UIUtils.dip2Px(getContext(), 70.0f);
        } else {
            this.l.setVisibility(8);
        }
        this.p = obtainStyledAttributes.getColor(12, c.c(context));
        this.l.setTextColor(this.p);
        if (obtainStyledAttributes.hasValue(9)) {
            a(this.n, obtainStyledAttributes.getResourceId(9, -1));
        } else {
            this.n.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int dip2Px = (int) UIUtils.dip2Px(context, 16.0f);
            if (Build.VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(dip2Px);
            } else {
                marginLayoutParams.leftMargin = dip2Px;
            }
        }
        int i3 = 0;
        if (!obtainStyledAttributes.getBoolean(3, false)) {
            this.m.setVisibility(8);
        }
        this.m.setBackgroundColor(c.d(context));
        this.f20516e = obtainStyledAttributes.getString(1);
        this.f20515a = obtainStyledAttributes.getBoolean(2, false);
        setRightLayoutVisibility(this.f20515a ? 8 : i3);
        obtainStyledAttributes.recycle();
        a(context, attributeSet);
    }
}
