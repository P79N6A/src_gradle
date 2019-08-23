package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class u implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18560a;

    /* renamed from: b  reason: collision with root package name */
    public Context f18561b;

    /* renamed from: c  reason: collision with root package name */
    View.OnClickListener f18562c;

    /* renamed from: d  reason: collision with root package name */
    View.OnClickListener f18563d;

    /* renamed from: e  reason: collision with root package name */
    Dialog f18564e;

    /* renamed from: f  reason: collision with root package name */
    private View f18565f;
    private boolean g = true;
    private DialogInterface.OnDismissListener h;
    private WindowManager i;
    private int j;
    private int k;
    private TextView l;
    private View m;
    private TextView n;

    public final Dialog c() {
        if (PatchProxy.isSupport(new Object[0], this, f18560a, false, 14628, new Class[0], Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[0], this, f18560a, false, 14628, new Class[0], Dialog.class);
        }
        Dialog a2 = a();
        a2.show();
        return a2;
    }

    public final Dialog a() {
        if (PatchProxy.isSupport(new Object[0], this, f18560a, false, 14627, new Class[0], Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[0], this, f18560a, false, 14627, new Class[0], Dialog.class);
        }
        this.f18564e = new Dialog(this.f18561b, C0906R.style.wd);
        this.f18564e.setCancelable(this.g);
        this.f18564e.setContentView(this.f18565f);
        this.f18564e.setCanceledOnTouchOutside(true);
        this.f18564e.setOnDismissListener(this.h);
        this.f18565f.findViewById(C0906R.id.bpi).setOnClickListener(new x(this));
        this.f18565f.findViewById(C0906R.id.bph).setOnClickListener(new y(this));
        Window window = this.f18564e.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.k;
            window.setAttributes(attributes);
        }
        return this.f18564e;
    }

    public final u a(View.OnClickListener onClickListener) {
        this.f18562c = onClickListener;
        return this;
    }

    public final u b(View.OnClickListener onClickListener) {
        this.f18563d = onClickListener;
        return this;
    }

    public final u a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f18560a, false, 14623, new Class[]{String.class}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{str}, this, f18560a, false, 14623, new Class[]{String.class}, u.class);
        }
        this.n.setText(str);
        return this;
    }

    public final u b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f18560a, false, 14625, new Class[]{String.class}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{str}, this, f18560a, false, 14625, new Class[]{String.class}, u.class);
        }
        this.l.setText(str);
        return this;
    }

    public u(Context context) {
        this.f18561b = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            this.f18565f = layoutInflater.inflate(C0906R.layout.ale, null);
        }
        this.i = (WindowManager) context.getSystemService("window");
        if (this.i != null) {
            this.j = this.i.getDefaultDisplay().getWidth();
        }
        this.k = (int) (((float) this.j) - (context.getResources().getDimension(C0906R.dimen.pj) * 2.0f));
        this.n = (TextView) this.f18565f.findViewById(C0906R.id.bpi);
        this.l = (TextView) this.f18565f.findViewById(C0906R.id.bph);
        this.m = this.f18565f.findViewById(C0906R.id.dnu);
    }

    /* renamed from: a */
    public final u d(@IdRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18560a, false, 14616, new Class[]{Integer.TYPE}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18560a, false, 14616, new Class[]{Integer.TYPE}, u.class);
        }
        this.f18565f.findViewById(C0906R.id.bpf).setPadding(0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.ph), 0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.pi));
        ((TextView) this.f18565f.findViewById(C0906R.id.bpf)).setText(i2);
        return this;
    }

    public final /* synthetic */ n.a c(@IdRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18560a, false, 14620, new Class[]{Integer.TYPE}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18560a, false, 14620, new Class[]{Integer.TYPE}, u.class);
        }
        this.f18565f.findViewById(C0906R.id.bpf).setPadding(0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.ph), 0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.pg));
        this.f18565f.findViewById(C0906R.id.bpd).setVisibility(0);
        ((TextView) this.f18565f.findViewById(C0906R.id.bpe)).setText(i2);
        return this;
    }

    public final /* synthetic */ n.a c(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f18560a, false, 14619, new Class[]{CharSequence.class}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{charSequence}, this, f18560a, false, 14619, new Class[]{CharSequence.class}, u.class);
        }
        this.f18565f.findViewById(C0906R.id.bpf).setPadding(0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.ph), 0, (int) this.f18561b.getResources().getDimension(C0906R.dimen.pg));
        this.f18565f.findViewById(C0906R.id.bpd).setVisibility(0);
        ((TextView) this.f18565f.findViewById(C0906R.id.bpe)).setText(charSequence);
        return this;
    }

    public final /* synthetic */ n.a b(int i2, @StringRes int i3, DialogInterface.OnClickListener onClickListener) {
        int i4 = i2;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), onClickListener2}, this, f18560a, false, 14617, new Class[]{Integer.TYPE, Integer.TYPE, DialogInterface.OnClickListener.class}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), onClickListener2}, this, f18560a, false, 14617, new Class[]{Integer.TYPE, Integer.TYPE, DialogInterface.OnClickListener.class}, u.class);
        }
        CharSequence text = this.f18561b.getText(i3);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), text, onClickListener2}, this, f18560a, false, 14618, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class}, u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), text, onClickListener2}, this, f18560a, false, 14618, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class}, u.class);
        } else if (i4 == 0) {
            return a(text.toString()).a((View.OnClickListener) new v(this, onClickListener2, i4));
        } else {
            if (i4 == 1) {
                return b(text.toString()).b((View.OnClickListener) new w(this, onClickListener2, i4));
            }
            return this;
        }
    }
}
