package com.bytedance.android.livesdk.floatwindow.ui;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class ControlButton extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14579a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14580b;

    /* renamed from: c  reason: collision with root package name */
    public a f14581c;

    /* renamed from: d  reason: collision with root package name */
    private View f14582d;

    /* renamed from: e  reason: collision with root package name */
    private int f14583e;

    /* renamed from: f  reason: collision with root package name */
    private int f14584f;
    private int g;
    private int h;
    private int i;
    private int j;
    private ImageView k;
    private TextView l;

    public interface a {
        void a();
    }

    private int getLayoutId() {
        return C0906R.layout.ame;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14579a, false, 9117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14579a, false, 9117, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        this.f14582d = findViewById(C0906R.id.yl);
        this.k = (ImageView) findViewById(C0906R.id.b2_);
        this.l = (TextView) findViewById(C0906R.id.dau);
        this.f14582d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14585a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f14586c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f14585a, true, 9122, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f14585a, true, 9122, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("ControlButton.java", AnonymousClass1.class);
                f14586c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.floatwindow.ui.ControlButton$1", "android.view.View", "view", "", "void"), 65);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14585a, false, 9121, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14585a, false, 9121, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f14586c, this, this, view));
                ControlButton.this.f14580b = !ControlButton.this.f14580b;
                ControlButton.this.a();
                if (ControlButton.this.f14581c != null) {
                    ControlButton.this.f14581c.a();
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14579a, false, 9118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14579a, false, 9118, new Class[0], Void.TYPE);
        } else if (this.f14580b) {
            this.k.setImageResource(this.f14584f);
            this.l.setTextColor(getResources().getColor(this.h));
            this.l.setText(this.j);
        } else {
            this.k.setImageResource(this.f14583e);
            this.l.setTextColor(getResources().getColor(this.g));
            this.l.setText(this.i);
        }
    }

    public void setOnViewClickListener(a aVar) {
        this.f14581c = aVar;
    }

    public ControlButton(Context context) {
        super(context);
        b();
    }

    public void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14579a, false, 9120, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14579a, false, 9120, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14580b = z;
        a();
    }

    public ControlButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ControlButton(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    @RequiresApi(api = 21)
    public ControlButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        b();
    }

    public final void a(@DrawableRes int i2, @DrawableRes int i3, @ColorRes int i4, @ColorRes int i5, @StringRes int i6, @StringRes int i7, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(C0906R.color.si), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Byte.valueOf(z ? (byte) 1 : 0)}, this, f14579a, false, 9119, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(C0906R.color.si), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Byte.valueOf(z)}, this, f14579a, false, 9119, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14583e = i2;
        this.f14584f = i3;
        this.g = C0906R.color.si;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.f14580b = z;
        a();
    }
}
