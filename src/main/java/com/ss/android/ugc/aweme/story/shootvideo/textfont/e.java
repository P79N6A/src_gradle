package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.MaskBlurLightTextView;

public class e extends FrameLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74180a;

    /* renamed from: b  reason: collision with root package name */
    c f74181b;

    /* renamed from: c  reason: collision with root package name */
    private MaskBlurLightTextView f74182c;

    /* renamed from: d  reason: collision with root package name */
    private View f74183d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f74184e;

    /* renamed from: f  reason: collision with root package name */
    private ObjectAnimator f74185f;
    private a g;
    private Drawable h;
    private Drawable i;

    public void setBackground(Drawable drawable) {
    }

    public c getFontData() {
        return this.f74181b;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86101, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86101, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f74181b != null && this.f74181b.b()) {
            z = true;
        }
        return z;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86106, new Class[0], Void.TYPE);
            return;
        }
        this.f74184e.setImageDrawable(ContextCompat.getDrawable(getContext(), 2130839835));
        this.f74185f = ObjectAnimator.ofFloat(this.f74184e, "rotation", new float[]{0.0f, 360.0f});
        this.f74185f.setDuration(800);
        this.f74185f.setRepeatMode(1);
        this.f74185f.setRepeatCount(-1);
        this.f74185f.start();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86107, new Class[0], Void.TYPE);
            return;
        }
        if (this.f74185f != null) {
            this.f74185f.cancel();
        }
        this.f74185f = null;
        this.f74184e.setRotation(0.0f);
        this.f74184e.setImageDrawable(ContextCompat.getDrawable(getContext(), 2130839396));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86102, new Class[0], Void.TYPE);
        } else if (this.f74181b != null) {
            switch (this.f74181b.k) {
                case 1:
                    this.f74184e.setVisibility(4);
                    return;
                case 2:
                    this.f74184e.setVisibility(0);
                    f();
                    break;
                case 3:
                    this.f74184e.setVisibility(0);
                    e();
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86108, new Class[0], Void.TYPE);
        } else if (this.f74181b != null) {
            Typeface a2 = d.a().a(this.f74181b.h);
            if (a2 != null) {
                this.f74182c.setTypeface(a2);
            }
            if (this.f74181b.a()) {
                this.f74182c.setMaskBlurColor(-6400);
            }
        }
    }

    public final boolean c() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f74180a, false, 86103, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74180a, false, 86103, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f74181b == null || TextUtils.isEmpty(this.f74181b.f74165b)) {
            return false;
        } else {
            if (this.f74181b.b()) {
                return true;
            }
            if (this.f74181b.k == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b();
                return false;
            } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
                a.b(getContext(), "检查网络后重试!").a();
                return false;
            } else {
                d.a().a(this.f74181b, getContext(), true);
                this.f74181b.k = 3;
                b();
                return false;
            }
        }
    }

    public void setDownloadCallback(a aVar) {
        this.g = aVar;
    }

    public e(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74180a, false, 86110, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74180a, false, 86110, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f74181b != null) {
            d.c(this.f74181b.f74169f);
            this.f74181b.k = 2;
            b();
        }
        if (this.g != null) {
            this.g.a(z);
        }
        if (z) {
            a.a(getContext(), getContext().getResources().getString(C0906R.string.ah5)).a();
        }
    }

    public void setBackground(int i2) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74180a, false, 86105, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74180a, false, 86105, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != 1) {
            drawable = this.i;
        } else {
            drawable = this.h;
        }
        this.f74183d.setBackground(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setFontData(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f74180a, false, 86104, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f74180a, false, 86104, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            this.f74181b = cVar;
            if (!TextUtils.isEmpty(this.f74181b.f74166c)) {
                this.f74182c.setText(this.f74181b.f74166c);
            }
        }
    }

    private e(Context context, AttributeSet attributeSet) {
        super(context, null);
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a9i, this);
        this.f74182c = (MaskBlurLightTextView) inflate.findViewById(C0906R.id.d42);
        this.f74184e = (ImageView) inflate.findViewById(C0906R.id.cv8);
        this.f74183d = inflate.findViewById(C0906R.id.dmq);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 4.0f);
        this.h = bc.a(-1, 16777215, (int) UIUtils.dip2Px(getContext(), 2.0f), dip2Px);
        this.i = bc.a(889192447, 16777215, 1, dip2Px);
    }

    public final void a(c cVar, boolean z, boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74180a, false, 86109, new Class[]{c.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z), Byte.valueOf(z2)}, this, f74180a, false, 86109, new Class[]{c.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b();
        if (!this.f74181b.b()) {
            if (z3) {
                a.a(getContext(), getContext().getResources().getString(C0906R.string.ah5)).a();
            }
            return;
        }
        if (this.g != null) {
            this.g.a(this.f74181b, this.f74181b.b(), z3);
        }
        d();
    }
}
