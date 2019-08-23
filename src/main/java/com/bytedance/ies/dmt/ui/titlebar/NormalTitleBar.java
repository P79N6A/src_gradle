package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;

public class NormalTitleBar extends a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f20451a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f20452b;

    /* renamed from: c  reason: collision with root package name */
    private a f20453c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f20454d;

    /* renamed from: e  reason: collision with root package name */
    private View f20455e;
    @ColorInt

    /* renamed from: f  reason: collision with root package name */
    private int f20456f;

    public ImageView getEndBtn() {
        return this.f20452b;
    }

    public ImageView getStartBtn() {
        return this.f20451a;
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.f20453c = aVar;
    }

    public NormalTitleBar(Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(@ColorInt int i) {
        this.f20455e.setBackgroundColor(i);
    }

    public void setEndBtnIcon(@DrawableRes int i) {
        this.f20452b.setImageResource(i);
    }

    public void setStartBtnIcon(@DrawableRes int i) {
        this.f20451a.setImageResource(i);
    }

    public void showDividerLine(boolean z) {
        int i;
        View view = this.f20455e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onColorModeChange(int i) {
        int i2;
        ImageView imageView = this.f20451a;
        if (b.a(i)) {
            i2 = 2130841646;
        } else {
            i2 = 2130841647;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f20453c != null) {
            if (view.getId() == C0906R.id.ix) {
                this.f20453c.a(view);
            } else if (view.getId() == C0906R.id.ceh) {
                this.f20453c.b(view);
            }
        }
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        inflate(context, C0906R.layout.ar9, this);
        this.f20451a = (ImageView) findViewById(C0906R.id.ix);
        this.mTitleView = (DmtTextView) findViewById(C0906R.id.title);
        this.f20452b = (ImageView) findViewById(C0906R.id.ceh);
        this.f20455e = findViewById(C0906R.id.bbl);
        this.f20451a.setOnClickListener(this);
        this.f20452b.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b(0.5f, 1.0f);
        this.f20451a.setOnTouchListener(bVar);
        this.f20452b.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NormalTitleBar);
            String string = obtainStyledAttributes.getString(3);
            float dimension = obtainStyledAttributes.getDimension(5, UIUtils.dip2Px(context, 17.0f));
            int color = obtainStyledAttributes.getColor(4, -15329245);
            this.mTitleView.setText(string);
            this.mTitleView.setTextSize(0, dimension);
            this.mTitleView.setTextColor(color);
            this.f20454d = obtainStyledAttributes.getDrawable(0);
            if (this.f20454d != null) {
                this.f20452b.setImageDrawable(this.f20454d);
            }
            this.f20455e.setVisibility(obtainStyledAttributes.getInt(2, 0));
            Resources resources = getResources();
            if (b.c()) {
                i2 = C0906R.color.ama;
            } else {
                i2 = C0906R.color.am_;
            }
            this.f20456f = obtainStyledAttributes.getColor(1, resources.getColor(i2));
            this.f20455e.setBackgroundColor(this.f20456f);
            obtainStyledAttributes.recycle();
        }
        setColorMode(b.a().f20312a);
    }
}
