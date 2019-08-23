package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.account.globallistener.GlobalListener;
import com.ss.android.ugc.aweme.account.login.e.a;
import com.ss.android.ugc.aweme.base.ui.c;
import java.lang.ref.WeakReference;

public abstract class BasePhoneNumberInputFragment<T extends a> extends BasePhoneNumberFragment<T> implements GlobalListener.a {
    public static ChangeQuickRedirect r;

    /* renamed from: a  reason: collision with root package name */
    private TextWatcher f32364a;

    /* renamed from: b  reason: collision with root package name */
    private c f32365b = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32366a;

        public final void afterTextChanged(Editable editable) {
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f32366a, false, 20491, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f32366a, false, 20491, new Class[]{Editable.class}, Void.TYPE);
            } else if (BasePhoneNumberInputFragment.this.isViewValid()) {
                if (editable.length() > 0) {
                    BasePhoneNumberInputFragment.this.v.setVisibility(0);
                } else {
                    BasePhoneNumberInputFragment.this.v.setVisibility(8);
                }
                BasePhoneNumberInputFragment basePhoneNumberInputFragment = BasePhoneNumberInputFragment.this;
                String obj = editable.toString();
                if (PatchProxy.isSupport(new Object[]{obj}, basePhoneNumberInputFragment, BasePhoneNumberFragment.p, false, 20471, new Class[]{String.class}, Void.TYPE)) {
                    BasePhoneNumberInputFragment basePhoneNumberInputFragment2 = basePhoneNumberInputFragment;
                    PatchProxy.accessDispatch(new Object[]{obj}, basePhoneNumberInputFragment2, BasePhoneNumberFragment.p, false, 20471, new Class[]{String.class}, Void.TYPE);
                } else {
                    basePhoneNumberInputFragment.q.setRawInput(obj);
                }
                StringBuilder sb = new StringBuilder();
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    int digit = Character.digit(editable2.charAt(i), 10);
                    if (digit != -1) {
                        sb.append(digit);
                    }
                }
                if (sb.length() == 0) {
                    BasePhoneNumberInputFragment.this.a(0);
                } else {
                    try {
                        BasePhoneNumberInputFragment.this.a(Long.parseLong(sb.toString(), 10));
                    } catch (NumberFormatException unused) {
                    }
                }
                BasePhoneNumberInputFragment.this.n();
                BasePhoneNumberInputFragment.this.a(editable.toString());
            }
        }
    };
    protected View s;
    protected TextView t;
    public EditText u;
    protected View v;

    public void a(String str) {
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20486, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().startActivity(new Intent(getActivity(), CountryListActivity.class));
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20484, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32368a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32368a, false, 20492, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32368a, false, 20492, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (BasePhoneNumberInputFragment.this.isViewValid()) {
                        BasePhoneNumberInputFragment.this.d();
                    }
                }
            });
        }
        if (this.v != null) {
            this.v.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32370a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32370a, false, 20493, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32370a, false, 20493, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    BasePhoneNumberInputFragment.this.u.setText("");
                }
            });
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20483, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20482, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20481, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        f();
        a(q(), o());
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 20487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 20487, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.u != null) {
            if (this.f32364a != null) {
                this.u.removeTextChangedListener(this.f32364a);
            }
            this.f32364a = c(p());
            this.u.addTextChangedListener(this.f32364a);
            if (this.f32365b != null) {
                this.u.removeTextChangedListener(this.f32365b);
                this.u.addTextChangedListener(this.f32365b);
            }
        }
    }

    private TextWatcher c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, r, false, 20488, new Class[]{String.class}, TextWatcher.class)) {
            return (TextWatcher) PatchProxy.accessDispatch(new Object[]{str2}, this, r, false, 20488, new Class[]{String.class}, TextWatcher.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                return new PhoneNumberFormattingTextWatcher(str2);
            }
            return new a.b();
        }
    }

    public final void a(com.ss.android.ugc.aweme.account.login.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, r, false, 20490, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, r, false, 20490, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            String str = aVar.f32262d;
            if (PatchProxy.isSupport(new Object[]{str}, this, BasePhoneNumberFragment.p, false, 20473, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, BasePhoneNumberFragment.p, false, 20473, new Class[]{String.class}, Void.TYPE);
            } else {
                this.q.setCountryIso(str);
            }
            a(aVar.a());
            f();
            n();
            a(q(), o());
        }
    }

    public final Bundle b(@Nullable String str) {
        Bundle bundle;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, r, false, 20489, new Class[]{String.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{str2}, this, r, false, 20489, new Class[]{String.class}, Bundle.class);
        }
        if (getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(getArguments());
        }
        bundle.putString("platform", "mobile");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("login_path", str2);
        }
        return bundle;
    }

    private void a(int i, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, r, false, 20485, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, r, false, 20485, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.t != null) {
                TextView textView = this.t;
                textView.setText("+" + String.valueOf(i));
            }
            if (this.u != null) {
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                Editable text = this.u.getText();
                if (text != null) {
                    text.replace(0, text.length(), str2, 0, str2.length());
                    Selection.setSelection(text, text.length());
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 20480, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 20480, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{this}, null, GlobalListener.f31971a, true, 19966, new Class[]{GlobalListener.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, GlobalListener.f31971a, true, 19966, new Class[]{GlobalListener.a.class}, Void.TYPE);
            return;
        }
        synchronized (GlobalListener.class) {
            GlobalListener.f31972b.add(new WeakReference(this));
        }
    }
}
