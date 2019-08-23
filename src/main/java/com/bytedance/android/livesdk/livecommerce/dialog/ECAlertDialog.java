package com.bytedance.android.livesdk.livecommerce.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECAlertDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16175a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16176b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16177c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f16178d;

    public void setTitle(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f16175a, false, 10657, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f16175a, false, 10657, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.f16176b.setText(charSequence2);
    }

    public void setTitle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16175a, false, 10656, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16175a, false, 10656, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f16176b.setText(i);
    }

    public ECAlertDialog(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f16175a, false, 10654, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16175a, false, 10654, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (a.a()) {
            setContentView((int) C0906R.layout.l9);
            this.f16176b = (TextView) findViewById(C0906R.id.dkk);
            this.f16177c = (TextView) findViewById(C0906R.id.d9v);
            this.f16178d = (TextView) findViewById(C0906R.id.d_u);
        } else {
            setContentView((int) C0906R.layout.l8);
            this.f16176b = (TextView) findViewById(C0906R.id.dkk);
            this.f16177c = (TextView) findViewById(C0906R.id.d9v);
            this.f16178d = (TextView) findViewById(C0906R.id.d_u);
        }
        if (PatchProxy.isSupport(new Object[]{context}, this, f16175a, false, 10655, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16175a, false, 10655, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(17170445);
        }
    }

    public final void a(int i, final DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener}, this, f16175a, false, 10658, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener}, this, f16175a, false, 10658, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f16178d.setText(i);
        this.f16178d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16179a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f16179a, false, 10660, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f16179a, false, 10660, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (onClickListener != null) {
                    onClickListener.onClick(this, 0);
                }
            }
        });
    }

    public final void b(int i, final DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener}, this, f16175a, false, 10659, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener}, this, f16175a, false, 10659, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f16177c.setText(i);
        this.f16177c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16183a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f16183a, false, 10661, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f16183a, false, 10661, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (onClickListener != null) {
                    onClickListener.onClick(this, 1);
                }
            }
        });
    }
}
