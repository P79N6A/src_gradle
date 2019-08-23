package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;

public class w extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f4038d;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f4039a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f4040b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f4041c;

    /* renamed from: e  reason: collision with root package name */
    TextView f4042e;

    /* renamed from: f  reason: collision with root package name */
    TextView f4043f;
    View g;
    protected SmartAnimatedImageView h;
    public boolean i;

    public void setEnable(boolean z) {
        this.i = z;
    }

    public w(Context context) {
        this(context, null);
    }

    public void setDrawableLeft(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f4038d, false, 80309, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f4038d, false, 80309, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f4039a.setImageDrawable(drawable2);
    }

    public void setDrawableRight(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f4038d, false, 80311, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f4038d, false, 80311, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f4041c.setImageDrawable(drawable2);
    }

    public void setSubtitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f4038d, false, 80318, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f4038d, false, 80318, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f4043f.setText(str2);
    }

    public void setTitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f4038d, false, 80315, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f4038d, false, 80315, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f4042e.setText(str2);
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4038d, false, 80316, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4038d, false, 80316, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f4040b;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public void setDrawableLeft(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80310, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80310, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f4039a.setImageResource(i2);
    }

    public void setDrawableRight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80312, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80312, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f4041c.setImageResource(i2);
    }

    public void setSingleLine(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4038d, false, 80321, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4038d, false, 80321, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.f4042e.setSingleLine(true);
        } else {
            this.f4042e.setSingleLine(false);
        }
        this.f4042e.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitle(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80317, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80317, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f4043f.setText(i2);
    }

    public void setSubtitleAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f4038d, false, 80319, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f4038d, false, 80319, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f4043f.setAlpha(f2);
    }

    public void setTextHighlight(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4038d, false, 80313, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4038d, false, 80313, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            i2 = ContextCompat.getColor(getContext(), C0906R.color.a08);
        } else {
            i2 = ContextCompat.getColor(getContext(), C0906R.color.a0b);
        }
        this.f4042e.setTextColor(i2);
        this.f4043f.setTextColor(i2);
    }

    public void setTitle(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80314, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4038d, false, 80314, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f4042e.setText(i2);
    }

    public w(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public w(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = true;
        this.g = LayoutInflater.from(context).inflate(C0906R.layout.z6, this);
        this.f4039a = (ImageView) findViewById(C0906R.id.c6h);
        this.f4042e = (TextView) findViewById(C0906R.id.c6e);
        this.f4043f = (TextView) findViewById(C0906R.id.c6l);
        this.f4040b = (ImageView) findViewById(C0906R.id.c6g);
        this.f4041c = (ImageView) findViewById(C0906R.id.aqn);
        this.h = (SmartAnimatedImageView) findViewById(C0906R.id.byr);
    }
}
