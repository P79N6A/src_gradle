package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.login.ui.CheckButton;

public abstract class AbsTimeLockFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2606a;

    /* renamed from: b  reason: collision with root package name */
    protected EditText f2607b;

    /* renamed from: c  reason: collision with root package name */
    protected CheckButton f2608c;

    /* renamed from: d  reason: collision with root package name */
    protected Button f2609d;

    public int a() {
        return C0906R.string.cl0;
    }

    public abstract void b(String str);

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2606a, false, 21931, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2606a, false, 21931, new Class[]{View.class}, Void.TYPE);
        } else if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2606a, false, 21930, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2606a, false, 21930, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        } else {
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2606a, false, 21929, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2606a, false, 21929, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f2607b = (EditText) view.findViewById(C0906R.id.a8y);
        final EditText editText = this.f2607b;
        if (PatchProxy.isSupport(new Object[]{editText}, this, f2606a, false, 21932, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText}, this, f2606a, false, 21932, new Class[]{View.class}, Void.TYPE);
        } else {
            final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33480a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33480a, false, 21936, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f33480a, false, 21936, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33484a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f33484a, false, 21937, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f33484a, false, 21937, new Class[0], Void.TYPE);
                            } else if (AbsTimeLockFragment.this.getActivity() != null && AbsTimeLockFragment.this.isViewValid()) {
                                ((InputMethodManager) AbsTimeLockFragment.this.getActivity().getSystemService("input_method")).showSoftInput(editText, 1);
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            editText.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33486a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f33486a, false, 21938, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33486a, false, 21938, new Class[0], Void.TYPE);
                        return;
                    }
                    editText.requestFocus();
                }
            });
        }
        this.f2608c = (CheckButton) view.findViewById(C0906R.id.oo);
        this.f2609d = (Button) view.findViewById(C0906R.id.bo6);
        if (a.b()) {
            this.f2609d.setVisibility(0);
            this.f2609d.setAlpha(0.5f);
            this.f2608c.setVisibility(8);
        } else {
            this.f2609d.setVisibility(8);
            this.f2608c.setVisibility(0);
        }
        this.f2608c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33474a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33474a, false, 21933, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33474a, false, 21933, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                String obj = AbsTimeLockFragment.this.f2607b.getText().toString();
                if (!AbsTimeLockFragment.this.a(obj)) {
                    com.bytedance.ies.dmt.ui.d.a.b(AbsTimeLockFragment.this.getContext(), AbsTimeLockFragment.this.a()).a();
                } else {
                    AbsTimeLockFragment.this.b(obj);
                }
            }
        });
        this.f2609d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33476a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33476a, false, 21934, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33476a, false, 21934, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                String obj = AbsTimeLockFragment.this.f2607b.getText().toString();
                if (!AbsTimeLockFragment.this.a(obj)) {
                    com.bytedance.ies.dmt.ui.d.a.b(AbsTimeLockFragment.this.getContext(), AbsTimeLockFragment.this.a()).a();
                } else {
                    AbsTimeLockFragment.this.b(obj);
                }
            }
        });
        this.f2607b.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33478a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f33478a, false, 21935, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f33478a, false, 21935, new Class[]{Editable.class}, Void.TYPE);
                } else if (editable.length() == 4) {
                    AbsTimeLockFragment.this.f2608c.setAlpha(1.0f);
                    AbsTimeLockFragment.this.f2609d.setAlpha(1.0f);
                } else {
                    AbsTimeLockFragment.this.f2608c.setAlpha(0.5f);
                    AbsTimeLockFragment.this.f2609d.setAlpha(0.5f);
                }
            }
        });
    }
}
