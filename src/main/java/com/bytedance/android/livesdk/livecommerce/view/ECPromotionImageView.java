package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECPromotionImageView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16277a;

    /* renamed from: b  reason: collision with root package name */
    public int f16278b;

    /* renamed from: c  reason: collision with root package name */
    private HSImageView f16279c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f16280d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f16281e;

    /* renamed from: f  reason: collision with root package name */
    private View f16282f;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16277a, false, 10836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16277a, false, 10836, new Class[0], Void.TYPE);
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16283a;

            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f16283a, false, 10837, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16283a, false, 10837, new Class[0], Void.TYPE);
                    return;
                }
                ECPromotionImageView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ViewGroup.LayoutParams layoutParams = ECPromotionImageView.this.getLayoutParams();
                Context context = ECPromotionImageView.this.getContext();
                if (!(layoutParams == null || context == null)) {
                    layoutParams.width = ECPromotionImageView.this.f16278b;
                    layoutParams.height = ECPromotionImageView.this.f16278b;
                    ECPromotionImageView.this.setLayoutParams(layoutParams);
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16277a, false, 10834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16277a, false, 10834, new Class[0], Void.TYPE);
            return;
        }
        a(a.a(getContext(), 80.0f));
    }

    public ECPromotionImageView(@NonNull Context context) {
        super(context);
        a(context);
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16277a, false, 10833, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16277a, false, 10833, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str);
        this.f16281e.setVisibility(0);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16277a, false, 10835, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16277a, false, 10835, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f16278b = i;
        b();
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16277a, false, 10830, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16277a, false, 10830, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str);
        this.f16280d.setText(C0906R.string.a9h);
        this.f16280d.setVisibility(0);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16277a, false, 10831, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16277a, false, 10831, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str);
        this.f16280d.setText(C0906R.string.a_1);
        this.f16280d.setVisibility(0);
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16277a, false, 10832, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16277a, false, 10832, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str);
        this.f16280d.setText(C0906R.string.a8o);
        this.f16280d.setVisibility(0);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16277a, false, 10828, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16277a, false, 10828, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View.inflate(context, C0906R.layout.lj, this);
        this.f16279c = (HSImageView) findViewById(C0906R.id.apc);
        this.f16280d = (TextView) findViewById(C0906R.id.djm);
        this.f16281e = (LinearLayout) findViewById(C0906R.id.bgk);
        this.f16282f = findViewById(C0906R.id.du0);
        if (a.a()) {
            this.f16278b = (int) a.a(context, (int) C0906R.dimen.fl);
            this.f16281e.setBackgroundResource(2130838627);
            this.f16282f.setBackgroundResource(2130838625);
            return;
        }
        this.f16278b = (int) a.a(context, (int) C0906R.dimen.fk);
        this.f16281e.setBackgroundResource(2130838626);
        this.f16282f.setBackgroundResource(2130838624);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16277a, false, 10829, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16277a, false, 10829, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (a.a()) {
            com.bytedance.android.livesdk.livecommerce.b.a.a(this.f16279c, str, 8);
        } else {
            com.bytedance.android.livesdk.livecommerce.b.a.a(this.f16279c, str, 2);
        }
        this.f16280d.setVisibility(8);
        this.f16281e.setVisibility(8);
    }

    public ECPromotionImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECPromotionImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
