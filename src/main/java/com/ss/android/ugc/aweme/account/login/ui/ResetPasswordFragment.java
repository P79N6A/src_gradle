package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.sdk.account.api.a.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;

public class ResetPasswordFragment extends BaseResetPasswordFragment {
    public static ChangeQuickRedirect D;
    private String E = "user_click";
    private d F;

    public final String x() {
        return this.E;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, D, false, 20748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, D, false, 20748, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (isViewValid() && this.g != null) {
            ((CheckButton) this.g).c();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, D, false, 20747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, D, false, 20747, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.g != null) {
            ((CheckButton) this.g).a();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, D, false, 20750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, D, false, 20750, new Class[0], Void.TYPE);
            return;
        }
        final String trim = this.f32375d.getText().toString().trim();
        this.F.a(trim, (b) new b() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f32572c;

            public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f32572c, false, 20751, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f32572c, false, 20751, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                    return;
                }
                ResetPasswordFragment.this.a(ResetPasswordFragment.this.f32374c.getText().toString(), trim, null);
            }

            public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f32572c, false, 20752, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f32572c, false, 20752, new Class[]{com.bytedance.sdk.account.api.c.b.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (ResetPasswordFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.errorMsg)) {
                    a.b(ResetPasswordFragment.this.getContext(), bVar.errorMsg).a();
                }
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, D, false, 20749, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, D, false, 20749, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.F = com.bytedance.sdk.account.d.d.a(getContext());
        this.z = (TextView) view.findViewById(C0906R.id.csf);
        this.A = (TextView) view.findViewById(C0906R.id.ajd);
        String str = this.i;
        if (TextUtils.isEmpty(this.i)) {
            str = this.h;
        }
        String format = String.format(getString(C0906R.string.af4), new Object[]{str});
        if (format != null) {
            i = format.indexOf(str);
        } else {
            i = 0;
        }
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C0906R.color.a1s)), i, str.length() + i, 17);
        this.f32373b.setText(spannableString);
        this.g.setEnabled(false);
        super.e();
        this.E = "auto_system";
        this.z.performClick();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, D, false, 20746, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, D, false, 20746, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.px, viewGroup2, false);
        if (Build.VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(C0906R.id.cv4);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = p.c();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
