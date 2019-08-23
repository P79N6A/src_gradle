package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.login.ui.BasePhoneNumberInputFragment;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.ss.android.ugc.aweme.account.view.StateButton;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public abstract class BaseAccountFragment extends BasePhoneNumberInputFragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f32845d;

    /* renamed from: a  reason: collision with root package name */
    private c f32846a = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32847a;

        public final void afterTextChanged(Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f32847a, false, 21058, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f32847a, false, 21058, new Class[]{Editable.class}, Void.TYPE);
            } else if (BaseAccountFragment.this.mBtnLogin == null || BaseAccountFragment.this.mBtnLogin.getVisibility() != 0) {
                if (BaseAccountFragment.this.mBtnPreAccount != null && BaseAccountFragment.this.mBtnPreAccount.getVisibility() == 0) {
                    BaseAccountFragment.this.mBtnPreAccount.setEnabled(BaseAccountFragment.this.v());
                }
            } else {
                StateButton.a.a(BaseAccountFragment.this.mBtnLogin, BaseAccountFragment.this.v());
            }
        }
    };
    @BindView(2131492914)
    ImageView backBtn;
    @BindView(2131492929)
    View mBtnLogin;
    @BindView(2131492934)
    DmtButton mBtnPreAccount;
    @BindView(2131492964)
    View mCodeDownView;
    @BindView(2131493387)
    DmtStatusView mDmtStatusView;
    @BindView(2131493182)
    View mEditCodeContainer;
    @BindView(2131493018)
    EditText mEditText;
    @BindView(2131493177)
    LinearLayout mLLContainer;
    @Nullable
    @BindView(2131493191)
    DmtLoadingLayout mLoadingUI;
    @BindView(2131493240)
    View mPasswordDownView;
    @BindView(2131493017)
    EditText mPasswordEt;
    @BindView(2131493452)
    TextView mPasswordTip;
    @BindView(2131493183)
    View mPhoneContainer;
    @BindView(2131493246)
    View mPhoneDownView;
    @BindView(2131493491)
    TextView mRightText;
    @BindView(2131493306)
    RelativeLayout mRlTitle;
    @BindView(2131493455)
    TextView mSafeCheckHint;
    @BindView(2131493422)
    protected TextView mTitleHint;
    @BindView(2131493488)
    protected TextView mTxtHint;
    @BindView(2131493493)
    TextView mTxtTimer;

    public final a c() {
        return null;
    }

    public abstract void f();

    public abstract void u();

    public abstract boolean v();

    public abstract int w();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f32845d, false, 21051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32845d, false, 21051, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f32845d, false, 21056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32845d, false, 21056, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLoadingUI != null) {
            this.mLoadingUI.setVisibility(8);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f32845d, false, 21045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32845d, false, 21045, new Class[0], Void.TYPE);
        } else if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.d();
            }
        } else {
            StateButton.a.b(this.mBtnLogin);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f32845d, false, 21046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32845d, false, 21046, new Class[0], Void.TYPE);
        } else if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.setVisibility(8);
            }
        } else {
            StateButton.a.a(this.mBtnLogin);
        }
    }

    public void t() {
        if (PatchProxy.isSupport(new Object[0], this, f32845d, false, 21049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32845d, false, 21049, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            ((AccountOpeModel) ViewModelProviders.of(getActivity()).get(AccountOpeModel.class)).f32738a.postValue(new com.ss.android.ugc.aweme.account.model.a(false));
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32845d, false, 21054, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32845d, false, 21054, new Class[]{View.class}, Void.TYPE);
            return;
        }
        KeyboardUtils.c(view);
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32845d, false, 21053, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32845d, false, 21053, new Class[]{View.class}, Void.TYPE);
            return;
        }
        KeyboardUtils.a(view);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32845d, false, 21057, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32845d, false, 21057, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.a(str);
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mBtnPreAccount.setEnabled(v());
            }
            return;
        }
        StateButton.a.a(this.mBtnLogin, v());
    }

    public void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32845d, false, 21052, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32845d, false, 21052, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("phone_bundling_skip", (Map) new b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(str)).f31599b);
        KeyboardUtils.c(this.mEditText);
        getActivity().finish();
    }

    @Nullable
    @OnClick({2131492914, 2131492929, 2131493491, 2131492934})
    @Optional
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32845d, false, 21050, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32845d, false, 21050, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (view.getId() == C0906R.id.ix) {
                t();
            } else if (view.getId() == C0906R.id.og || view.getId() == C0906R.id.op) {
                u();
            } else {
                if (view.getId() == C0906R.id.dnh || view.getId() == C0906R.id.d1m) {
                    c("");
                }
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32845d, false, 21048, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32845d, false, 21048, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        f();
        this.mEditCodeContainer.setVisibility(8);
        this.mPhoneContainer.setVisibility(8);
        this.mPasswordEt.setVisibility(8);
        if (w() == 1) {
            b(this.u);
            this.mPhoneContainer.setVisibility(0);
        } else if (w() == 2) {
            b(this.mPasswordEt);
            this.mPasswordEt.setVisibility(0);
            this.mPasswordEt.addTextChangedListener(this.f32846a);
            this.mPasswordTip.setVisibility(0);
        } else if (w() == 0) {
            b(this.mEditText);
            this.mEditCodeContainer.setVisibility(0);
            this.mEditText.addTextChangedListener(this.f32846a);
        } else {
            if (w() == 3) {
                b(this.mEditText);
                this.mEditCodeContainer.setVisibility(0);
                this.mPasswordEt.setVisibility(0);
                this.mEditText.addTextChangedListener(this.f32846a);
                this.mPasswordEt.addTextChangedListener(this.f32846a);
                this.mPasswordTip.setVisibility(0);
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32845d, false, 21047, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32845d, false, 21047, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.apf, viewGroup2, false);
        this.s = inflate.findViewById(C0906R.id.bg7);
        this.t = (TextView) inflate.findViewById(C0906R.id.dag);
        this.u = (EditText) inflate.findViewById(C0906R.id.a8r);
        this.v = inflate.findViewById(C0906R.id.bxk);
        return inflate;
    }
}
