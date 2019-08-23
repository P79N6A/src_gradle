package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;

public final class NoticeView extends LinearLayout implements View.OnClickListener, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42967a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f42968b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f42969c;

    /* renamed from: d  reason: collision with root package name */
    TextView f42970d;

    /* renamed from: e  reason: collision with root package name */
    View f42971e;

    /* renamed from: f  reason: collision with root package name */
    View f42972f;
    private a g;
    private int h;

    public interface a {
        void a();

        void b();
    }

    public final void onColorModeChange(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f42970d;
    }

    public final void setOnInternalClickListener(a aVar) {
        this.g = aVar;
    }

    public NoticeView(@NonNull Context context) {
        this(context, null);
    }

    public final void setCloseImage(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f42967a, false, 37775, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f42967a, false, 37775, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        this.f42969c.setImageBitmap(bitmap2);
    }

    public final void setIconImage(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f42967a, false, 37773, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f42967a, false, 37773, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        this.f42968b.setImageBitmap(bitmap2);
    }

    public final void setTitleText(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f42967a, false, 37777, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f42967a, false, 37777, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.f42970d.setText(charSequence2);
    }

    private void setColorMode(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37781, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37781, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != i) {
            this.h = i;
            onColorModeChange(this.h);
        }
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f42967a, false, 37772, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f42967a, false, 37772, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.g != null) {
            if (view.getId() == C0906R.id.azy) {
                this.g.b();
                return;
            }
            if (view.getId() == C0906R.id.d3r) {
                this.g.a();
            }
        }
    }

    public final void setCloseImage(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37776, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37776, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42969c.setImageResource(i);
    }

    public final void setIconImage(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37774, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37774, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42968b.setImageResource(i);
    }

    public final void setTitleText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37779, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37779, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42970d.setText(getContext().getResources().getText(i));
    }

    public final void setTitleTextColor(@ColorInt int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37780, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42967a, false, 37780, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f42970d.setTextColor(i);
    }

    public final void setTitleText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42967a, false, 37778, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42967a, false, 37778, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f42970d.setText(str2);
    }

    public NoticeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.h = -1;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f42967a, false, 37771, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f42967a, false, 37771, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        inflate(context, C0906R.layout.a6w, this);
        this.f42968b = (ImageView) findViewById(C0906R.id.b2_);
        this.f42969c = (ImageView) findViewById(C0906R.id.azy);
        this.f42970d = (TextView) findViewById(C0906R.id.dkk);
        this.f42971e = findViewById(C0906R.id.d3r);
        this.f42972f = findViewById(C0906R.id.brh);
        this.f42969c.setOnTouchListener(new com.ss.android.ugc.aweme.h.a(0.5f, 150, null));
        this.f42971e.setOnTouchListener(new com.ss.android.ugc.aweme.h.a(0.5f, 150, null));
        this.f42969c.setOnClickListener(this);
        this.f42971e.setOnClickListener(this);
        setColorMode(b.a().f20312a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeView);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f42968b.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f42969c.setImageDrawable(drawable2);
        }
        this.f42970d.setText(obtainStyledAttributes.getString(3));
        this.f42970d.setTextColor(obtainStyledAttributes.getColor(4, getResources().getColor(C0906R.color.oy)));
        this.f42972f.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(C0906R.color.a2t)));
        obtainStyledAttributes.recycle();
    }
}
