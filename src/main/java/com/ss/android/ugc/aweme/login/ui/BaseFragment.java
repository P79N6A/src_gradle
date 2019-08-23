package com.ss.android.ugc.aweme.login.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.mobilelib.c.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.mobile.a.c;

public abstract class BaseFragment<T extends a> extends AmeBaseFragment implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53812a;

    /* renamed from: b  reason: collision with root package name */
    protected c f53813b = new c("login");

    /* renamed from: c  reason: collision with root package name */
    public View f53814c;

    /* renamed from: d  reason: collision with root package name */
    protected T f53815d;

    /* renamed from: e  reason: collision with root package name */
    protected String f53816e;

    /* renamed from: f  reason: collision with root package name */
    protected String f53817f;
    private boolean g = false;
    private ProgressDialog h;

    public abstract T c();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f53812a, false, 56436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53812a, false, 56436, new Class[0], Void.TYPE);
            return;
        }
        this.h = null;
        if (PatchProxy.isSupport(new Object[0], this, f53812a, false, 56437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53812a, false, 56437, new Class[0], Void.TYPE);
        } else if (this.f53815d != null) {
            this.f53815d.a();
            this.f53815d = null;
        }
        super.onDestroyView();
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53812a, false, 56435, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53812a, false, 56435, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        try {
            this.f53815d = c();
        } catch (IllegalStateException unused) {
        }
        if (this.f53814c != null) {
            this.f53814c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53818a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f53818a, false, 56449, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f53818a, false, 56449, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        BaseFragment baseFragment = BaseFragment.this;
                        View view2 = BaseFragment.this.f53814c;
                        if (PatchProxy.isSupport(new Object[]{view2}, baseFragment, BaseFragment.f53812a, false, 56440, new Class[]{View.class}, Void.TYPE)) {
                            Object[] objArr = {view2};
                            BaseFragment baseFragment2 = baseFragment;
                            ChangeQuickRedirect changeQuickRedirect = BaseFragment.f53812a;
                            PatchProxy.accessDispatch(objArr, baseFragment2, changeQuickRedirect, false, 56440, new Class[]{View.class}, Void.TYPE);
                        } else if (baseFragment.getActivity() != null) {
                            ((InputMethodManager) baseFragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        }
                        BaseFragment.this.getActivity().onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53812a, false, 56433, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53812a, false, 56433, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f53816e = getArguments().getString("enter_from");
            this.f53817f = getArguments().getString("enter_method");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f53812a, false, 56434, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f53812a, false, 56434, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (view2 != null) {
            this.f53814c = view2.findViewById(C0906R.id.as6);
        }
    }
}
