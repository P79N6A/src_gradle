package com.ss.android.ugc.aweme.account.login.ui;

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
import com.ss.android.ugc.aweme.account.util.p;

public class InputCaptchaFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32443a;

    /* renamed from: b  reason: collision with root package name */
    public EditText f32444b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f32445c;

    /* renamed from: d  reason: collision with root package name */
    public View f32446d;

    /* renamed from: e  reason: collision with root package name */
    public a f32447e;

    /* renamed from: f  reason: collision with root package name */
    public b f32448f;
    public int g;
    private ImageView h;
    private View i;
    private String j;
    private boolean k;

    public interface a {
        void a();

        void b(String str, int i);
    }

    public interface b {
        void b();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f32443a, false, 20569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32443a, false, 20569, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.k = false;
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f32443a, false, 20567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32443a, false, 20567, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.k = true;
        a(this.j, "", this.g);
        AlertDialog alertDialog = (AlertDialog) getDialog();
        if (alertDialog != null) {
            alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32453a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32453a, false, 20575, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32453a, false, 20575, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (InputCaptchaFragment.this.f32447e == null) {
                        InputCaptchaFragment.this.dismiss();
                    } else if (TextUtils.isEmpty(InputCaptchaFragment.this.f32444b.getText().toString())) {
                        InputCaptchaFragment.this.f32446d.setVisibility(8);
                        InputCaptchaFragment.this.f32445c.setText(C0906R.string.abc);
                        InputCaptchaFragment.this.f32445c.setVisibility(0);
                    } else {
                        InputCaptchaFragment.this.f32447e.b(InputCaptchaFragment.this.f32444b.getText().toString(), InputCaptchaFragment.this.g);
                    }
                }
            });
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f32443a, false, 20568, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f32443a, false, 20568, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f32445c != null) {
            this.f32445c.setVisibility(4);
        }
        super.onDismiss(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32443a, false, 20564, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32443a, false, 20564, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.j = arguments.getString("captcha_data");
        this.g = arguments.getInt("captcha_scenario");
        setCancelable(false);
    }

    @SuppressLint({"InflateParams"})
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32443a, false, 20566, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f32443a, false, 20566, new Class[]{Bundle.class}, Dialog.class);
        }
        AlertDialog.Builder a2 = p.a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C0906R.layout.aad, null);
        this.h = (ImageView) inflate.findViewById(C0906R.id.qc);
        this.i = inflate.findViewById(C0906R.id.s0);
        this.f32444b = (EditText) inflate.findViewById(C0906R.id.qd);
        this.f32445c = (TextView) inflate.findViewById(C0906R.id.a_r);
        this.f32446d = inflate.findViewById(C0906R.id.c88);
        this.i.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32449a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32449a, false, 20573, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32449a, false, 20573, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (InputCaptchaFragment.this.f32447e != null) {
                    InputCaptchaFragment.this.f32447e.a();
                }
            }
        });
        a2.setView(inflate);
        a2.setPositiveButton((int) C0906R.string.b4c, (DialogInterface.OnClickListener) null);
        a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32451a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32451a, false, 20574, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32451a, false, 20574, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (InputCaptchaFragment.this.f32448f != null) {
                    InputCaptchaFragment.this.f32448f.b();
                }
            }
        });
        return a2.create();
    }

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f32443a, false, 20572, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f32443a, false, 20572, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }

    public static InputCaptchaFragment a(String str, int i2, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), aVar2}, null, f32443a, true, 20563, new Class[]{String.class, Integer.TYPE, a.class}, InputCaptchaFragment.class)) {
            return (InputCaptchaFragment) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), aVar2}, null, f32443a, true, 20563, new Class[]{String.class, Integer.TYPE, a.class}, InputCaptchaFragment.class);
        }
        InputCaptchaFragment inputCaptchaFragment = new InputCaptchaFragment();
        Bundle bundle = new Bundle();
        bundle.putString("captcha_data", str2);
        bundle.putInt("captcha_scenario", i2);
        inputCaptchaFragment.setArguments(bundle);
        inputCaptchaFragment.f32447e = aVar2;
        return inputCaptchaFragment;
    }

    public final void a(String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i2)}, this, f32443a, false, 20565, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i2)}, this, f32443a, false, 20565, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.k) {
            this.g = i2;
            this.j = str3;
            if (this.h != null) {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                try {
                    byte[] decode = Base64.decode(this.j, 1);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    this.h.setImageBitmap(decodeByteArray);
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
            if (TextUtils.isEmpty(str2)) {
                this.f32446d.setVisibility(0);
                this.f32445c.setVisibility(8);
                return;
            }
            this.f32446d.setVisibility(8);
            this.f32445c.setVisibility(0);
            this.f32445c.setText(str4);
        }
    }
}
