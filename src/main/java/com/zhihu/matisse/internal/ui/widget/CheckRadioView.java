package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.C0906R;

public class CheckRadioView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f82703a;

    /* renamed from: b  reason: collision with root package name */
    private int f82704b;

    /* renamed from: c  reason: collision with root package name */
    private int f82705c;

    private void a() {
        this.f82704b = ResourcesCompat.getColor(getResources(), C0906R.color.aou, getContext().getTheme());
        this.f82705c = ResourcesCompat.getColor(getResources(), C0906R.color.aot, getContext().getTheme());
        setChecked(false);
    }

    public CheckRadioView(Context context) {
        super(context);
        a();
    }

    public void setColor(int i) {
        if (this.f82703a == null) {
            this.f82703a = getDrawable();
        }
        this.f82703a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(2130839236);
            this.f82703a = getDrawable();
            if (this.f82703a != null) {
                this.f82703a.setColorFilter(this.f82704b, PorterDuff.Mode.SRC_IN);
            }
        } else {
            setImageResource(2130839235);
            this.f82703a = getDrawable();
            if (this.f82703a != null) {
                this.f82703a.setColorFilter(this.f82705c, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
