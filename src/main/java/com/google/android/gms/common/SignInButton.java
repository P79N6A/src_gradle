package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.R$styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzbv;
import com.google.android.gms.common.internal.zzbw;
import com.google.android.gms.dynamic.zzq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    private int mColor;
    private int mSize;
    private View zzaAv;
    private View.OnClickListener zzaAw;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SignInButton, 0, 0);
        try {
            this.mSize = obtainStyledAttributes.getInt(0, 0);
            this.mColor = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.mSize, this.mColor);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void onClick(View view) {
        if (this.zzaAw != null && view == this.zzaAv) {
            this.zzaAw.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        setStyle(this.mSize, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zzaAv.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzaAw = onClickListener;
        if (this.zzaAv != null) {
            this.zzaAv.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        setStyle(this.mSize, this.mColor);
    }

    public final void setSize(int i) {
        setStyle(i, this.mColor);
    }

    public final void setStyle(int i, int i2) {
        this.mSize = i;
        this.mColor = i2;
        Context context = getContext();
        if (this.zzaAv != null) {
            removeView(this.zzaAv);
        }
        try {
            this.zzaAv = zzbv.zzc(context, this.mSize, this.mColor);
        } catch (zzq unused) {
            int i3 = this.mSize;
            int i4 = this.mColor;
            zzbw zzbw = new zzbw(context);
            zzbw.zza(context.getResources(), i3, i4);
            this.zzaAv = zzbw;
        }
        addView(this.zzaAv);
        this.zzaAv.setEnabled(isEnabled());
        this.zzaAv.setOnClickListener(this);
    }

    @Deprecated
    public final void setStyle(int i, int i2, Scope[] scopeArr) {
        setStyle(i, i2);
    }
}
