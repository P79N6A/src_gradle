package com.ss.android.ugc.aweme.antiaddic.lock.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;

public class TimeLockDesc extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33614a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f33615b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f33616c;

    public TimeLockDesc(Context context) {
        super(context);
        a(null, 0);
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f33614a, false, 22093, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f33614a, false, 22093, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f33616c.setImageDrawable(drawable2);
    }

    public void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33614a, false, 22092, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f33614a, false, 22092, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f33615b.setText(str2);
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i)}, this, f33614a, false, 22091, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i)}, this, f33614a, false, 22091, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        inflate(getContext(), C0906R.layout.ae1, this);
        this.f33616c = (ImageView) findViewById(C0906R.id.cum);
        this.f33615b = (TextView) findViewById(C0906R.id.d31);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.TimeLockDesc, i, 0);
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f33616c.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        }
        this.f33615b.setText(string);
        obtainStyledAttributes.recycle();
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
