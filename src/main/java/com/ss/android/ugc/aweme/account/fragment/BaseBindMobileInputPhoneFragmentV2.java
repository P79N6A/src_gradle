package com.ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment;

public abstract class BaseBindMobileInputPhoneFragmentV2 extends BindMobileInputPhoneFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31893a;

    /* renamed from: b  reason: collision with root package name */
    DmtTextView f31894b;

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f31893a, false, 19898, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f31893a, false, 19898, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f31894b.setTextColor(getResources().getColor(C0906R.color.a6o));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31893a, false, 19897, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31893a, false, 19897, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.n1, viewGroup2, false);
        this.s = inflate.findViewById(C0906R.id.bg7);
        this.t = (TextView) inflate.findViewById(C0906R.id.dag);
        this.u = (EditText) inflate.findViewById(C0906R.id.a8r);
        this.v = inflate.findViewById(C0906R.id.bxk);
        this.f31894b = (DmtTextView) inflate.findViewById(C0906R.id.d1m);
        if (this.f31894b != null) {
            this.f31894b.setOnClickListener(new a(this));
        }
        return inflate;
    }
}
