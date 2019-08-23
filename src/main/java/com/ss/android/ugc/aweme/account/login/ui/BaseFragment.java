package com.ss.android.ugc.aweme.account.login.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.mobilelib.c.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.i.d;
import com.ss.android.ugc.aweme.account.login.a.k;
import com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseFragment<T extends a> extends AmeBaseFragment implements b, k {
    public static ChangeQuickRedirect j;

    /* renamed from: a  reason: collision with root package name */
    private InputCaptchaFragment f32344a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32345b;

    /* renamed from: c  reason: collision with root package name */
    private ProgressDialog f32346c;
    public View k;
    protected T l;
    public String m;
    public String n;
    protected String o;

    @Nullable
    public abstract T c();

    public boolean isRegisterEventBus() {
        return false;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20418, new Class[0], Void.TYPE);
            return;
        }
        k();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20417, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32344a != null) {
            this.f32344a.dismiss();
            this.f32344a = null;
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20411, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.a();
            this.l = null;
        }
    }

    public final LoginOrRegisterActivity l() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 20423, new Class[0], LoginOrRegisterActivity.class)) {
            return (LoginOrRegisterActivity) getActivity();
        }
        return (LoginOrRegisterActivity) PatchProxy.accessDispatch(new Object[0], this, j, false, 20423, new Class[0], LoginOrRegisterActivity.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20410, new Class[0], Void.TYPE);
            return;
        }
        this.f32346c = null;
        j();
        super.onDestroyView();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20419, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20413, new Class[0], Void.TYPE);
        } else if (this.f32346c != null && this.f32346c.isShowing()) {
            this.f32346c.dismiss();
        }
        i();
    }

    public final ProgressDialog k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20412, new Class[0], ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[0], this, j, false, 20412, new Class[0], ProgressDialog.class);
        }
        if (this.f32346c == null) {
            this.f32346c = p.b(getActivity());
            this.f32346c.setMessage(getString(C0906R.string.bc0));
            this.f32346c.setCanceledOnTouchOutside(false);
        }
        if (!this.f32346c.isShowing()) {
            this.f32346c.show();
        }
        return this.f32346c;
    }

    public void b(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 20416, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 20416, new Class[]{View.class}, Void.TYPE);
        } else if (!this.f32345b) {
            final View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32349a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f32349a, false, 20426, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f32349a, false, 20426, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f32353a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f32353a, false, 20427, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f32353a, false, 20427, new Class[0], Void.TYPE);
                            } else if (BaseFragment.this.getActivity() != null && BaseFragment.this.isViewValid()) {
                                ((InputMethodManager) BaseFragment.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32355a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f32355a, false, 20428, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f32355a, false, 20428, new Class[0], Void.TYPE);
                        return;
                    }
                    view.requestFocus();
                }
            });
            this.f32345b = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, j, false, 20409, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, j, false, 20409, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        try {
            this.l = c();
        } catch (IllegalStateException unused) {
        }
        if (this.k != null) {
            this.k.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32347a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32347a, false, 20425, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32347a, false, 20425, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        BaseFragment.this.a(BaseFragment.this.k);
                        BaseFragment.this.getActivity().onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, j, false, 20407, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, j, false, 20407, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.m = getArguments().getString("enter_from");
            this.n = getArguments().getString("enter_method");
            this.o = getArguments().getString("enter_type");
        }
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 20415, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 20415, new Class[]{View.class}, Void.TYPE);
        } else if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, j, false, 20408, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, j, false, 20408, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (view2 != null) {
            this.k = view2.findViewById(C0906R.id.as6);
        }
    }

    public void a(String str, int i, boolean z) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 20422, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z)}, this, j, false, 20422, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() != null) {
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), str2).a();
            } else if (i2 == -12) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.ke).a();
            } else if (i2 == -21) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.abh).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.abl).a();
            }
            if (!z) {
                i();
            }
        }
    }

    public final void a(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        final int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, j, false, 20420, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, j, false, 20420, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AnonymousClass4 r0 = new InputCaptchaFragment.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32358a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f32358a, false, 20430, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32358a, false, 20430, new Class[0], Void.TYPE);
                    return;
                }
                BaseFragment.this.k();
                if (BaseFragment.this.l != null) {
                    BaseFragment.this.l.a(i2);
                }
            }

            public final void b(String str, int i) {
                if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32358a, false, 20429, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32358a, false, 20429, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseFragment.this.k();
                if (BaseFragment.this.l != null) {
                    BaseFragment.this.l.a(str, i);
                }
            }
        };
        if (getActivity() != null) {
            if (this.f32344a == null) {
                this.f32344a = InputCaptchaFragment.a(str3, i2, (InputCaptchaFragment.a) r0);
                FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                beginTransaction.add((Fragment) this.f32344a, "captcha");
                beginTransaction.commitAllowingStateLoss();
            } else if (getActivity().getSupportFragmentManager().findFragmentByTag("captcha") == null) {
                this.f32344a.show(getActivity().getSupportFragmentManager(), "captcha");
                this.f32344a.f32447e = r0;
            }
            this.f32344a.a(str3, str4, i2);
        }
    }

    public final void a(String str, String str2, int i, InputCaptchaFragment.a aVar) {
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        int i2 = i;
        InputCaptchaFragment.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str5, str6, Integer.valueOf(i), aVar2}, this, j, false, 20421, new Class[]{String.class, String.class, Integer.TYPE, InputCaptchaFragment.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, Integer.valueOf(i), aVar2}, this, j, false, 20421, new Class[]{String.class, String.class, Integer.TYPE, InputCaptchaFragment.a.class}, Void.TYPE);
        } else if (getActivity() != null) {
            String valueOf = String.valueOf(i);
            if (PatchProxy.isSupport(new Object[]{str5, valueOf, str6}, null, d.f31990a, true, 20047, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {str5, valueOf, str6};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, d.f31990a, true, 20047, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "on show captcha");
                if (str5 == null) {
                    str3 = "";
                } else {
                    str3 = str5;
                }
                hashMap.put("captcha", str3);
                if (valueOf == null) {
                    valueOf = "";
                }
                hashMap.put("scenario", valueOf);
                if (str6 == null) {
                    str4 = "";
                } else {
                    str4 = str6;
                }
                hashMap.put("errorMsg", str4);
                d dVar = d.f31991b;
                String hashMap2 = hashMap.toString();
                Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                dVar.c(hashMap2);
            }
            if (this.f32344a == null) {
                this.f32344a = InputCaptchaFragment.a(str5, i2, aVar2);
                FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                beginTransaction.add((Fragment) this.f32344a, "captcha");
                beginTransaction.commitAllowingStateLoss();
            } else if (getActivity().getSupportFragmentManager().findFragmentByTag("captcha") == null) {
                this.f32344a.show(getActivity().getSupportFragmentManager(), "captcha");
                this.f32344a.f32447e = aVar2;
            }
            this.f32344a.a(str5, str6, i2);
        }
    }
}
