package com.ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment;
import com.ss.android.ugc.aweme.utils.ad;

public class VerificationCodeFragmentV2 extends VerificationCodeFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31950a;
    @BindView(2131493420)
    TextTitleBar mTextTitleBar;

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f31950a, false, 19964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31950a, false, 19964, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        this.mTextTitleBar.setColorMode(0);
        if (this.g == 5) {
            this.mTitleHint.setText(C0906R.string.mk);
            if (!TextUtils.isEmpty(this.h)) {
                this.mTxtHint.setText(getString(C0906R.string.af4, this.h));
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31950a, false, 19963, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.r6, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31950a, false, 19963, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public static VerificationCodeFragmentV2 a(int i, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str5, str6, str7, str8}, null, f31950a, true, 19961, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragmentV2.class)) {
            Object[] objArr = {Integer.valueOf(i), str5, str6, str7, str8};
            return (VerificationCodeFragmentV2) PatchProxy.accessDispatch(objArr, null, f31950a, true, 19961, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}, VerificationCodeFragmentV2.class);
        }
        Bundle bundle = ad.a().a("password", str6).a("ticket", str7).f75487b;
        Object[] objArr2 = {str8, Integer.valueOf(i), str5, bundle};
        if (PatchProxy.isSupport(objArr2, null, f31950a, true, 19962, new Class[]{String.class, Integer.TYPE, String.class, Bundle.class}, VerificationCodeFragmentV2.class)) {
            Object[] objArr3 = {str8, Integer.valueOf(i), str5, bundle};
            return (VerificationCodeFragmentV2) PatchProxy.accessDispatch(objArr3, null, f31950a, true, 19962, new Class[]{String.class, Integer.TYPE, String.class, Bundle.class}, VerificationCodeFragmentV2.class);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("type", i);
        bundle.putString("mobile", str5);
        bundle.putString("enter_from", str8);
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = new VerificationCodeFragmentV2();
        verificationCodeFragmentV2.setArguments(bundle);
        return verificationCodeFragmentV2;
    }
}
