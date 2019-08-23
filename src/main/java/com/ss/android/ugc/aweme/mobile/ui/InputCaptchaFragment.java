package com.ss.android.ugc.aweme.mobile.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class InputCaptchaFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56102a;

    /* renamed from: b  reason: collision with root package name */
    public EditText f56103b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f56104c;

    /* renamed from: d  reason: collision with root package name */
    public View f56105d;

    /* renamed from: e  reason: collision with root package name */
    public a f56106e;

    /* renamed from: f  reason: collision with root package name */
    public int f56107f;
    private ImageView g;
    private View h;
    private String i;
    private boolean j;

    public interface a {
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f56102a, false, 59707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56102a, false, 59707, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.j = false;
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f56102a, false, 59705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56102a, false, 59705, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.j = true;
        String str = this.i;
        int i2 = this.f56107f;
        if (PatchProxy.isSupport(new Object[]{str, "", Integer.valueOf(i2)}, this, f56102a, false, 59703, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, "", Integer.valueOf(i2)}, this, f56102a, false, 59703, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.j) {
            this.f56107f = i2;
            this.i = str;
            if (this.g != null) {
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                try {
                    byte[] decode = Base64.decode(this.i, 1);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    this.g.setImageBitmap(decodeByteArray);
                    if (decodeByteArray.getWidth() <= 0 || decodeByteArray.getHeight() <= 0) {
                        layoutParams.height = 0;
                    } else {
                        layoutParams.width = getResources().getDimensionPixelSize(C0906R.dimen.cg);
                        layoutParams.height = (layoutParams.width * decodeByteArray.getHeight()) / decodeByteArray.getWidth();
                    }
                } catch (Exception unused) {
                    layoutParams.height = 0;
                }
            }
            if (TextUtils.isEmpty("")) {
                this.f56105d.setVisibility(0);
                this.f56104c.setVisibility(8);
            } else {
                this.f56105d.setVisibility(8);
                this.f56104c.setVisibility(0);
                this.f56104c.setText("");
            }
        }
        AlertDialog alertDialog = (AlertDialog) getDialog();
        if (alertDialog != null) {
            alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56112a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56112a, false, 59713, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56112a, false, 59713, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (InputCaptchaFragment.this.f56106e == null) {
                        InputCaptchaFragment.this.dismiss();
                    } else if (TextUtils.isEmpty(InputCaptchaFragment.this.f56103b.getText().toString())) {
                        InputCaptchaFragment.this.f56105d.setVisibility(8);
                        InputCaptchaFragment.this.f56104c.setText(C0906R.string.abc);
                        InputCaptchaFragment.this.f56104c.setVisibility(0);
                    } else {
                        InputCaptchaFragment.this.f56103b.getText();
                    }
                }
            });
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f56102a, false, 59706, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f56102a, false, 59706, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f56104c != null) {
            this.f56104c.setVisibility(4);
        }
        super.onDismiss(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56102a, false, 59702, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56102a, false, 59702, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.i = arguments.getString("captcha_data");
        this.f56107f = arguments.getInt("captcha_scenario");
        setCancelable(false);
    }

    @SuppressLint({"InflateParams"})
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56102a, false, 59704, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f56102a, false, 59704, new Class[]{Bundle.class}, Dialog.class);
        }
        AlertDialog.Builder a2 = com.ss.android.a.a.a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C0906R.layout.aad, null);
        this.g = (ImageView) inflate.findViewById(C0906R.id.qc);
        this.h = inflate.findViewById(C0906R.id.s0);
        this.f56103b = (EditText) inflate.findViewById(C0906R.id.qd);
        this.f56104c = (TextView) inflate.findViewById(C0906R.id.a_r);
        this.f56105d = inflate.findViewById(C0906R.id.c88);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56108a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56108a, false, 59711, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56108a, false, 59711, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
            }
        });
        a2.setView(inflate);
        a2.setPositiveButton((int) C0906R.string.b4c, (DialogInterface.OnClickListener) null);
        a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56110a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56110a, false, 59712, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56110a, false, 59712, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                }
            }
        });
        return a2.create();
    }

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f56102a, false, 59710, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f56102a, false, 59710, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }
}
