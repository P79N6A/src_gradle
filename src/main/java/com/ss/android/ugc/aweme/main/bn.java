package com.ss.android.ugc.aweme.main;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.a.a;

public final class bn extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54606a;

    /* renamed from: b  reason: collision with root package name */
    TextView f54607b;

    /* renamed from: c  reason: collision with root package name */
    TextView f54608c;

    /* renamed from: d  reason: collision with root package name */
    TextView f54609d;

    /* renamed from: e  reason: collision with root package name */
    TextView f54610e;

    /* renamed from: f  reason: collision with root package name */
    Activity f54611f;
    int g;
    int h;
    int i;
    int j;
    AnimatorSet k;
    private RelativeLayout l;
    private ImageView m;

    public final View getContentView() {
        return this.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54606a, false, 57607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54606a, false, 57607, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.f54611f != null && !this.f54611f.isFinishing() && isShowing()) {
            getContentView().clearAnimation();
            this.k.cancel();
            try {
                dismiss();
            } catch (Exception e2) {
                a.a((Throwable) e2);
            }
        }
    }

    public bn(Activity activity) {
        super(activity);
        View inflate;
        this.f54611f = activity;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f54606a, false, 57596, new Class[]{Activity.class}, View.class)) {
            inflate = (View) PatchProxy.accessDispatch(new Object[]{activity}, this, f54606a, false, 57596, new Class[]{Activity.class}, View.class);
        } else {
            inflate = LayoutInflater.from(activity).inflate(C0906R.layout.abt, null, false);
        }
        View view = inflate;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54606a, false, 57598, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54606a, false, 57598, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(view);
            setBackgroundDrawable(new ColorDrawable(this.f54611f.getResources().getColor(C0906R.color.ano)));
            setOutsideTouchable(false);
            update();
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f54606a, false, 57597, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54606a, false, 57597, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f54607b = (TextView) view.findViewById(C0906R.id.dac);
        this.f54608c = (TextView) view.findViewById(C0906R.id.dad);
        this.f54610e = (TextView) view.findViewById(C0906R.id.daf);
        this.f54609d = (TextView) view.findViewById(C0906R.id.dae);
        this.l = (RelativeLayout) view.findViewById(C0906R.id.ci4);
        this.m = (ImageView) view.findViewById(C0906R.id.az9);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), textView2}, this, f54606a, false, 57605, new Class[]{Integer.TYPE, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), textView2}, this, f54606a, false, 57605, new Class[]{Integer.TYPE, TextView.class}, Void.TYPE);
            return;
        }
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.f54611f.getResources(), i2);
        a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
        textView2.setCompoundDrawables(a2, null, null, null);
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView, int i2) {
        String str;
        TextView textView2 = textView;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{textView2, Integer.valueOf(i2)}, this, f54606a, false, 57603, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Integer.valueOf(i2)}, this, f54606a, false, 57603, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE);
        } else if (i3 == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (i3 > 99) {
                str = "99+";
            } else {
                str = i3;
            }
            textView2.setText(str);
        }
    }
}
