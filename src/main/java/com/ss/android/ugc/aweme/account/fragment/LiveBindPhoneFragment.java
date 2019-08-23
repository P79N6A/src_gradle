package com.ss.android.ugc.aweme.account.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.b.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.a.f;
import com.ss.android.ugc.aweme.account.login.d.a;
import com.ss.android.ugc.aweme.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public class LiveBindPhoneFragment extends LiveBaseVerifyCodeFragment<a> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f31914d;

    /* renamed from: e  reason: collision with root package name */
    protected EditText f31915e;

    /* renamed from: f  reason: collision with root package name */
    protected EditText f31916f;
    protected c g;
    protected Button h;
    public d i;
    private TextView w;
    private View.OnClickListener x = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31926a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31926a, false, 19933, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31926a, false, 19933, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (view.getId() == C0906R.id.as6 && LiveBindPhoneFragment.this.getActivity() != null) {
                LiveBindPhoneFragment.this.getActivity().onBackPressed();
            }
        }
    };

    public final /* bridge */ /* synthetic */ com.ss.android.mobilelib.b.a c() {
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31914d, false, 19918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31914d, false, 19918, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        isViewValid();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f31914d, false, 19917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31914d, false, 19917, new Class[0], Void.TYPE);
            return;
        }
        isViewValid();
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f31914d, false, 19924, new Class[0], String.class)) {
            return super.f();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f31914d, false, 19924, new Class[0], String.class);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f31914d, false, 19923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31914d, false, 19923, new Class[0], Void.TYPE);
            return;
        }
        UIUtils.displayToast((Context) l(), (int) C0906R.string.bli);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f31914d, false, 19920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31914d, false, 19920, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            if (this.f31916f == null || TextUtils.isEmpty(this.f31916f.getText()) || this.f31916f.getText().toString().length() < 8 || this.f31915e == null || TextUtils.isEmpty(this.f31915e.getText())) {
                this.h.setEnabled(false);
                this.h.setAlpha(0.5f);
            } else {
                this.h.setEnabled(true);
                this.h.setAlpha(1.0f);
            }
            if (!TextUtils.isEmpty(this.f31915e.getText()) && this.f31915e.getText().length() == 4) {
                this.f31916f.requestFocus();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31914d, false, 19915, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31914d, false, 19915, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f31914d, false, 19927, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f31914d, false, 19927, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f31905b.setEnabled(m());
        this.f31905b.setClickable(m());
    }

    public final void a(EditText editText, int i2) {
        if (PatchProxy.isSupport(new Object[]{editText, 20}, this, f31914d, false, 19922, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText, 20}, this, f31914d, false, 19922, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Editable text = editText.getText();
        int length = text.length();
        if (length > 20) {
            h();
            if (this.h != null) {
                this.h.setEnabled(false);
            }
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 20));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return;
        }
        if (this.h != null) {
            if (length < 8) {
                this.h.setEnabled(false);
                return;
            }
            this.h.setEnabled(true);
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f31914d, false, 19921, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f31914d, false, 19921, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.i.a(f(), str, str2, "", (b) new f(this) {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f31928c;

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.b> cVar) {
                String str;
                com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.b> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f31928c, false, 19934, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f31928c, false, 19934, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                User k = w.k();
                if (k != null) {
                    com.ss.android.account.b.a aVar = ((com.bytedance.sdk.account.f.a.b) cVar2.f22251a).f22365f.b().get("mobile");
                    if (aVar != null) {
                        str = aVar.f2419e;
                    } else {
                        str = "";
                    }
                    k.setPhoneBinded(true);
                    k.setBindPhone(str);
                    w.a(7, 1, (Object) new j(str, ((com.bytedance.sdk.account.f.a.b) cVar2.f22251a).f22365f.f22520e.toString()));
                }
            }

            public final void b(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.b> cVar) {
                com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.b> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f31928c, false, 19935, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f31928c, false, 19935, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                w.a(7, 3, (Object) new j("", cVar2.errorMsg));
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f31914d, false, 19919, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f31914d, false, 19919, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(C0906R.id.as6).setOnClickListener(this.x);
        this.f31915e = (EditText) view.findViewById(C0906R.id.a91);
        this.f31916f = (EditText) view.findViewById(C0906R.id.a8q);
        this.h = (Button) view.findViewById(C0906R.id.oo);
        this.f31905b = (TextView) view.findViewById(C0906R.id.csf);
        this.u = (EditText) view.findViewById(C0906R.id.a8r);
        this.t = (TextView) view.findViewById(C0906R.id.a0k);
        this.s = view.findViewById(C0906R.id.a0j);
        this.v = view.findViewById(C0906R.id.bxk);
        this.w = (TextView) view.findViewById(C0906R.id.go);
        TextView textView = this.w;
        if (com.ss.android.ugc.aweme.utils.permission.a.a((Activity) getActivity(), "android.permission.READ_CONTACTS")) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        this.f31915e.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31917a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f31917a, false, 19928, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f31917a, false, 19928, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                LiveBindPhoneFragment.this.g();
            }
        });
        this.f31916f.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31919a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f31919a, false, 19929, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f31919a, false, 19929, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                LiveBindPhoneFragment.this.g();
                LiveBindPhoneFragment.this.a(LiveBindPhoneFragment.this.f31916f, 20);
            }
        });
        this.g = c.a(getActivity()).a(this.f31915e, C0906R.string.abd).a(this.f31916f, C0906R.string.abf);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31921a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f31921a, false, 19930, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f31921a, false, 19930, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (LiveBindPhoneFragment.this.g.a()) {
                    LiveBindPhoneFragment.this.a(LiveBindPhoneFragment.this.f31916f);
                    int length = LiveBindPhoneFragment.this.f31916f.getText().toString().length();
                    if (length < 8 || length > 20) {
                        LiveBindPhoneFragment.this.h();
                    } else {
                        final String trim = LiveBindPhoneFragment.this.f31916f.getText().toString().trim();
                        LiveBindPhoneFragment.this.i.a(trim, (com.bytedance.sdk.account.api.a.b) new com.bytedance.sdk.account.api.a.b() {

                            /* renamed from: c  reason: collision with root package name */
                            public static ChangeQuickRedirect f31923c;

                            public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                                if (PatchProxy.isSupport(new Object[]{bVar}, this, f31923c, false, 19931, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f31923c, false, 19931, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                                    return;
                                }
                                LiveBindPhoneFragment.this.a(LiveBindPhoneFragment.this.f31915e.getText().toString(), trim);
                            }

                            public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                                if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f31923c, false, 19932, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f31923c, false, 19932, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (LiveBindPhoneFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.errorMsg)) {
                                    com.bytedance.ies.dmt.ui.d.a.b(LiveBindPhoneFragment.this.getContext(), bVar.errorMsg).a();
                                }
                            }
                        });
                    }
                }
            }
        });
        if (this.f31916f == null || TextUtils.isEmpty(this.f31916f.getText()) || this.f31916f.getText().toString().length() < 8 || this.f31915e == null || TextUtils.isEmpty(this.u.getText()) || TextUtils.isEmpty(this.f31915e.getText())) {
            this.h.setEnabled(false);
            this.h.setAlpha(0.5f);
        } else {
            this.h.setEnabled(true);
            this.h.setAlpha(1.0f);
        }
        this.i = com.bytedance.sdk.account.d.d.a(w.b());
        super.e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31914d, false, 19916, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.of, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31914d, false, 19916, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
