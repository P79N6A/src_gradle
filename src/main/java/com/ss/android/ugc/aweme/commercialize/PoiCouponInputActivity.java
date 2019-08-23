package com.ss.android.ugc.aweme.commercialize;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.k;
import com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;

public class PoiCouponInputActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38418a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f38419b = {4, 9, 14};
    @DrawableRes

    /* renamed from: c  reason: collision with root package name */
    int f38420c = 2130838071;
    @BindView(2131493558)
    View clear;
    @BindView(2131493724)
    ImageView confirm;

    /* renamed from: d  reason: collision with root package name */
    ObjectAnimator f38421d = null;
    @DrawableRes

    /* renamed from: e  reason: collision with root package name */
    private int f38422e = 2130839819;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38423f;
    private final a g = new a((byte) 0);
    @BindView(2131494813)
    EditText input;
    @BindView(2131497604)
    TextTitleBar titleBar;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38428a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f38429b;

        /* renamed from: c  reason: collision with root package name */
        StringBuilder f38430c;

        /* renamed from: d  reason: collision with root package name */
        int f38431d;

        /* renamed from: e  reason: collision with root package name */
        int f38432e;

        /* renamed from: f  reason: collision with root package name */
        int f38433f;
        int g;
        int h;
        boolean i;

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final StringBuilder a() {
            if (PatchProxy.isSupport(new Object[0], this, f38428a, false, 30349, new Class[0], StringBuilder.class)) {
                return (StringBuilder) PatchProxy.accessDispatch(new Object[0], this, f38428a, false, 30349, new Class[0], StringBuilder.class);
            }
            if (this.f38430c == null) {
                this.f38430c = new StringBuilder();
                this.f38430c.append(this.f38429b.subSequence(0, this.g));
            }
            return this.f38430c;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(char c2) {
            if (PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, this, f38428a, false, 30346, new Class[]{Character.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, this, f38428a, false, 30346, new Class[]{Character.TYPE}, Void.TYPE);
                return;
            }
            if (this.f38430c != null) {
                this.f38430c.append(c2);
            }
            this.g++;
            this.h++;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38418a, false, 30340, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38418a, false, 30340, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30338, new Class[0], Void.TYPE);
            return;
        }
        this.f38423f = true;
        try {
            this.input.setText("");
        } finally {
            this.f38423f = false;
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493558})
    public void onClearClicked() {
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30332, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30331, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity", "onResume", true);
        super.onResume();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.input, 1);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity", "onResume", false);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30336, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30336, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Editable text = this.input.getText();
        int length = text.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isDigit(text.charAt(i2))) {
                i++;
            }
        }
        if (i == 12) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493724})
    public void onConfirmClicked() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30333, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30337, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30337, new Class[0], String.class);
        } else {
            StringBuilder sb = new StringBuilder();
            Editable text = this.input.getText();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                if (Character.isDigit(text.charAt(i))) {
                    sb.append(text.charAt(i));
                }
            }
            str = sb.toString();
        }
        b();
        this.confirm.setImageResource(this.f38422e);
        this.f38421d = ObjectAnimator.ofFloat(this.confirm, "rotation", new float[]{0.0f, 360.0f});
        this.f38421d.setDuration(800);
        this.f38421d.setRepeatMode(1);
        this.f38421d.setRepeatCount(-1);
        this.f38421d.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38426a;

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f38426a, false, 30343, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f38426a, false, 30343, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                PoiCouponInputActivity.this.confirm.setRotation(0.0f);
            }
        });
        this.f38421d.start();
        q a2 = CouponRedeemApi.a(str);
        a2.a(new l(this, a2, str), k.f34752b);
    }

    /* access modifiers changed from: package-private */
    @OnTextChanged(callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED, value = {2131494813})
    public void onInputChanged() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30334, new Class[0], Void.TYPE);
            return;
        }
        View view = this.clear;
        if (PatchProxy.isSupport(new Object[0], this, f38418a, false, 30335, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38418a, false, 30335, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.input.getText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        ImageView imageView = this.confirm;
        if (this.f38421d != null || !a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        imageView.setEnabled(z2);
        if (!this.f38423f) {
            a aVar = this.g;
            EditText editText = this.input;
            if (PatchProxy.isSupport(new Object[]{editText}, aVar, a.f38428a, false, 30344, new Class[]{EditText.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editText}, aVar, a.f38428a, false, 30344, new Class[]{EditText.class}, Void.TYPE);
            } else {
                aVar.f38429b = editText.getText();
                aVar.f38430c = null;
                aVar.f38431d = editText.getSelectionStart();
                aVar.f38432e = editText.getSelectionEnd();
                aVar.f38433f = aVar.f38429b.length();
                aVar.g = 0;
                aVar.h = 0;
                if (aVar.f38433f >= 14) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aVar.i = z4;
            }
            a aVar2 = this.g;
            if (PatchProxy.isSupport(new Object[0], aVar2, a.f38428a, false, 30345, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar2, a.f38428a, false, 30345, new Class[0], Void.TYPE);
            } else {
                while (aVar2.g < aVar2.f38433f && aVar2.h < 14) {
                    char charAt = aVar2.f38429b.charAt(aVar2.g);
                    int[] iArr = f38419b;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        } else if (iArr[i2] == aVar2.h) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z3) {
                        if (charAt == ' ') {
                            aVar2.a(charAt);
                        } else {
                            if (PatchProxy.isSupport(new Object[]{' '}, aVar2, a.f38428a, false, 30347, new Class[]{Character.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{' '}, aVar2, a.f38428a, false, 30347, new Class[]{Character.TYPE}, Void.TYPE);
                            } else {
                                aVar2.a().append(' ');
                                if (aVar2.f38431d >= aVar2.h) {
                                    aVar2.f38431d++;
                                }
                                if (aVar2.f38432e >= aVar2.h) {
                                    aVar2.f38432e++;
                                }
                                aVar2.h++;
                            }
                        }
                    } else if (Character.isDigit(charAt)) {
                        aVar2.a(charAt);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], aVar2, a.f38428a, false, 30348, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aVar2, a.f38428a, false, 30348, new Class[0], Void.TYPE);
                        } else {
                            aVar2.a();
                            aVar2.g++;
                            if (aVar2.f38431d >= aVar2.h) {
                                aVar2.f38431d--;
                            }
                            if (aVar2.f38432e >= aVar2.h) {
                                aVar2.f38432e--;
                            }
                        }
                    }
                }
            }
            a aVar3 = this.g;
            if (PatchProxy.isSupport(new Object[]{this}, aVar3, a.f38428a, false, 30350, new Class[]{PoiCouponInputActivity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, aVar3, a.f38428a, false, 30350, new Class[]{PoiCouponInputActivity.class}, Void.TYPE);
                return;
            }
            if (aVar3.f38430c != null) {
                a(aVar3.f38430c, Math.min(aVar3.f38431d, 14), Math.min(aVar3.f38432e, 14));
            } else if (aVar3.i) {
                a(aVar3.f38429b.subSequence(0, 14), Math.min(aVar3.f38431d, 14), Math.min(aVar3.f38432e, 14));
            }
            aVar3.f38429b = null;
            aVar3.f38430c = null;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f38418a, false, 30330, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f38418a, false, 30330, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cz);
        ButterKnife.bind((Activity) this);
        this.confirm.setEnabled(false);
        this.titleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38424a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f38424a, false, 30342, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f38424a, false, 30342, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                PoiCouponInputActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity", "onCreate", false);
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f38418a, false, 30339, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f38418a, false, 30339, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f38423f = true;
        try {
            this.input.setText(charSequence);
            int i3 = i;
            this.input.setSelection(i, i2);
        } finally {
            this.f38423f = false;
        }
    }
}
