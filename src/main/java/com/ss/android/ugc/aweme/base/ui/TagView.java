package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ies.framework.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TagView extends BorderLayout {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f34992f;
    private String g;
    private ImageView h;
    private AppCompatTextView i;
    @ColorInt
    private int j;

    public TagView(Context context) {
        this(context, null);
    }

    @CallSuper
    public void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34992f, false, 25147, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34992f, false, 25147, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.setSelected(z);
        }
        if (this.i != null) {
            if (z) {
                this.i.setTextColor(this.f34930d);
            } else {
                this.i.setTextColor(this.j);
            }
        }
        super.setSelected(z);
    }

    public TagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TagView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[0], this, f34992f, false, 25148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34992f, false, 25148, new Class[0], Void.TYPE);
        } else {
            setOrientation(0);
            inflate(getContext(), C0906R.layout.a8i, this);
            this.h = (ImageView) findViewById(C0906R.id.b5y);
            this.i = (AppCompatTextView) findViewById(C0906R.id.dk_);
        }
        Context context2 = getContext();
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f34992f, false, 25149, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f34992f, false, 25149, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.TagView);
        this.f34928b = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) this.f34928b);
        this.f34929c = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f34929c);
        this.f34930d = obtainStyledAttributes.getColor(3, this.f34930d);
        this.f34931e = obtainStyledAttributes.getColor(6, this.f34931e);
        this.g = obtainStyledAttributes.getString(4);
        this.j = obtainStyledAttributes.getColor(5, this.f34931e);
        if (!TextUtils.isEmpty(this.g) && this.i != null) {
            this.i.setText(this.g);
            this.i.setTextColor(this.j);
        }
        a(this.f34930d, this.f34931e);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (!(drawable == null || this.h == null)) {
            this.h.setImageDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }
}
