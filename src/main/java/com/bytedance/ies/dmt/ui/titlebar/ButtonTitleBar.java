package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;

public class ButtonTitleBar extends a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f20445a;

    /* renamed from: b  reason: collision with root package name */
    private DmtTextView f20446b;

    /* renamed from: c  reason: collision with root package name */
    private a f20447c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f20448d;

    /* renamed from: e  reason: collision with root package name */
    private View f20449e;
    @ColorInt

    /* renamed from: f  reason: collision with root package name */
    private int f20450f;

    public DmtTextView getEndBtn() {
        return this.f20446b;
    }

    public ImageView getStartBtn() {
        return this.f20445a;
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.f20447c = aVar;
    }

    public ButtonTitleBar(@NonNull Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(@ColorInt int i) {
        this.f20449e.setBackgroundColor(i);
    }

    public void showDividerLine(boolean z) {
        int i;
        View view = this.f20449e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onColorModeChange(int i) {
        int i2;
        ImageView imageView = this.f20445a;
        if (b.a(i)) {
            i2 = 2130841646;
        } else {
            i2 = 2130841647;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f20447c != null) {
            if (view.getId() == C0906R.id.ix) {
                this.f20447c.a(view);
            } else if (view.getId() == C0906R.id.ceh) {
                this.f20447c.b(view);
            }
        }
    }

    public ButtonTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        inflate(context, C0906R.layout.aqe, this);
        this.f20445a = (ImageView) findViewById(C0906R.id.ix);
        this.mTitleView = (DmtTextView) findViewById(C0906R.id.title);
        this.f20446b = (DmtTextView) findViewById(C0906R.id.ceh);
        this.f20449e = findViewById(C0906R.id.bbl);
        this.f20445a.setOnClickListener(this);
        this.f20446b.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b(0.5f, 1.0f);
        this.f20445a.setOnTouchListener(bVar);
        this.f20446b.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonTitleBar);
            String string = obtainStyledAttributes.getString(8);
            float dimension = obtainStyledAttributes.getDimension(10, UIUtils.dip2Px(context, 17.0f));
            int color = obtainStyledAttributes.getColor(9, -15329245);
            this.mTitleView.setText(string);
            this.mTitleView.setTextSize(0, dimension);
            this.mTitleView.setTextColor(color);
            String string2 = obtainStyledAttributes.getString(0);
            int i3 = obtainStyledAttributes.getInt(4, 1);
            float dimension2 = obtainStyledAttributes.getDimension(3, UIUtils.dip2Px(context, 17.0f));
            int color2 = obtainStyledAttributes.getColor(2, 0);
            this.f20448d = obtainStyledAttributes.getDrawable(1);
            int i4 = obtainStyledAttributes.getInt(5, 0);
            this.f20446b.setText(string2);
            if (i3 == 1) {
                this.f20446b.setTypeface(Typeface.defaultFromStyle(1));
                this.f20446b.setTextColor(getResources().getColor(C0906R.color.ak0));
            } else {
                this.f20446b.setTypeface(Typeface.defaultFromStyle(0));
                this.f20446b.setTextColor(getResources().getColor(C0906R.color.amq));
            }
            this.f20446b.setTextSize(0, dimension2);
            if (color2 != 0) {
                this.f20446b.setTextColor(color2);
            }
            if (this.f20448d != null) {
                this.f20446b.setBackground(this.f20448d);
            }
            this.f20446b.setVisibility(i4);
            this.f20449e.setVisibility(obtainStyledAttributes.getInt(7, 0));
            Resources resources = getResources();
            if (b.c()) {
                i2 = C0906R.color.ama;
            } else {
                i2 = C0906R.color.am_;
            }
            this.f20450f = obtainStyledAttributes.getColor(6, resources.getColor(i2));
            this.f20449e.setBackgroundColor(this.f20450f);
            obtainStyledAttributes.recycle();
        }
        setColorMode(b.a().f20312a);
    }
}
