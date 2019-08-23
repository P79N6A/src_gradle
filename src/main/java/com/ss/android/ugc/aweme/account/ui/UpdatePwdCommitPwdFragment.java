package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.sdk.account.api.a.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public class UpdatePwdCommitPwdFragment extends BaseAccountFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32940a;

    /* renamed from: b  reason: collision with root package name */
    private d f32941b;

    public final int w() {
        return 2;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f32940a, false, 21191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32940a, false, 21191, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f32940a, false, 21194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32940a, false, 21194, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        w.a(8, 2, (Object) null);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f32940a, false, 21190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32940a, false, 21190, new Class[0], Void.TYPE);
            return;
        }
        this.f32941b = com.bytedance.sdk.account.d.d.a(getContext());
        this.mTitleHint.setText(C0906R.string.dob);
        this.mPasswordEt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordEt.setHint(C0906R.string.dod);
        this.mTxtHint.setText(C0906R.string.blh);
        this.mBtnLogin.setBackgroundResource(2130838071);
        r.a((Context) getActivity(), "set_psd_in", "psd", w.e(), 0);
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f32940a, false, 21192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32940a, false, 21192, new Class[0], Void.TYPE);
        } else if (this.mPasswordEt != null) {
            int length = this.mPasswordEt.getText().toString().trim().length();
            if (length < 8 || length > 20) {
                a.b((Context) getActivity(), (int) C0906R.string.bli).a();
                return;
            }
            final String trim = this.mPasswordEt.getText().toString().trim();
            this.f32941b.a(trim, (b) new b() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32942c;

                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                    String str;
                    com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f32942c, false, 21195, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f32942c, false, 21195, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                    } else if (UpdatePwdCommitPwdFragment.this.isViewValid() && UpdatePwdCommitPwdFragment.this.getActivity() != null) {
                        User k = w.k();
                        if (k != null) {
                            str = k.getBindPhone();
                        } else {
                            str = "";
                        }
                        ((BaseAccountActivity) UpdatePwdCommitPwdFragment.this.getActivity()).a(VerificationCodeFragment.b(1, str, trim, "", ""));
                    }
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                    com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f32942c, false, 21196, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f32942c, false, 21196, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (UpdatePwdCommitPwdFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.errorMsg)) {
                        a.b(UpdatePwdCommitPwdFragment.this.getContext(), bVar.errorMsg).a();
                    }
                }
            });
        }
    }

    public final boolean v() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32940a, false, 21193, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32940a, false, 21193, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPasswordEt == null || this.mPasswordEt.getText() == null) {
            return false;
        } else {
            if (this.mPasswordEt.getText().length() >= 8) {
                z = true;
            }
            return z;
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32940a, false, 21189, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32940a, false, 21189, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }
}
