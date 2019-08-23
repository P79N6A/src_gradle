package com.ss.android.ugc.aweme.account.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseAccountFragment_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32849b;

    /* renamed from: a  reason: collision with root package name */
    private BaseAccountFragment f32850a;

    /* renamed from: c  reason: collision with root package name */
    private View f32851c;

    /* renamed from: d  reason: collision with root package name */
    private View f32852d;

    /* renamed from: e  reason: collision with root package name */
    private View f32853e;

    /* renamed from: f  reason: collision with root package name */
    private View f32854f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f32849b, false, 21059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32849b, false, 21059, new Class[0], Void.TYPE);
            return;
        }
        BaseAccountFragment baseAccountFragment = this.f32850a;
        if (baseAccountFragment != null) {
            this.f32850a = null;
            baseAccountFragment.mPhoneContainer = null;
            baseAccountFragment.mEditCodeContainer = null;
            baseAccountFragment.mEditText = null;
            baseAccountFragment.backBtn = null;
            baseAccountFragment.mTxtHint = null;
            baseAccountFragment.mTxtTimer = null;
            baseAccountFragment.mBtnLogin = null;
            baseAccountFragment.mRlTitle = null;
            baseAccountFragment.mTitleHint = null;
            baseAccountFragment.mRightText = null;
            baseAccountFragment.mPasswordEt = null;
            baseAccountFragment.mPasswordTip = null;
            baseAccountFragment.mSafeCheckHint = null;
            baseAccountFragment.mBtnPreAccount = null;
            baseAccountFragment.mPhoneDownView = null;
            baseAccountFragment.mCodeDownView = null;
            baseAccountFragment.mPasswordDownView = null;
            baseAccountFragment.mLLContainer = null;
            baseAccountFragment.mLoadingUI = null;
            baseAccountFragment.mDmtStatusView = null;
            this.f32851c.setOnClickListener(null);
            this.f32851c = null;
            this.f32852d.setOnClickListener(null);
            this.f32852d = null;
            this.f32853e.setOnClickListener(null);
            this.f32853e = null;
            this.f32854f.setOnClickListener(null);
            this.f32854f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseAccountFragment_ViewBinding(final BaseAccountFragment baseAccountFragment, View view) {
        this.f32850a = baseAccountFragment;
        baseAccountFragment.mPhoneContainer = Utils.findRequiredView(view, C0906R.id.bgh, "field 'mPhoneContainer'");
        baseAccountFragment.mEditCodeContainer = Utils.findRequiredView(view, C0906R.id.bgg, "field 'mEditCodeContainer'");
        baseAccountFragment.mEditText = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.a8l, "field 'mEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'backBtn'");
        baseAccountFragment.backBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.ix, "field 'backBtn'", ImageView.class);
        this.f32851c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32855a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f32855a, false, 21060, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f32855a, false, 21060, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAccountFragment.onClick(view2);
            }
        });
        baseAccountFragment.mTxtHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dnb, "field 'mTxtHint'", TextView.class);
        baseAccountFragment.mTxtTimer = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dnl, "field 'mTxtTimer'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.og, "field 'mBtnLogin'");
        baseAccountFragment.mBtnLogin = findRequiredView2;
        this.f32852d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32858a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f32858a, false, 21061, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f32858a, false, 21061, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAccountFragment.onClick(view2);
            }
        });
        baseAccountFragment.mRlTitle = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cgp, "field 'mRlTitle'", RelativeLayout.class);
        baseAccountFragment.mTitleHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d3u, "field 'mTitleHint'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.dnh, "field 'mRightText'");
        baseAccountFragment.mRightText = (TextView) Utils.castView(findRequiredView3, C0906R.id.dnh, "field 'mRightText'", TextView.class);
        this.f32853e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32861a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f32861a, false, 21062, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f32861a, false, 21062, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAccountFragment.onClick(view2);
            }
        });
        baseAccountFragment.mPasswordEt = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.a8g, "field 'mPasswordEt'", EditText.class);
        baseAccountFragment.mPasswordTip = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfw, "field 'mPasswordTip'", TextView.class);
        baseAccountFragment.mSafeCheckHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dhu, "field 'mSafeCheckHint'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.op, "field 'mBtnPreAccount'");
        baseAccountFragment.mBtnPreAccount = (DmtButton) Utils.castView(findRequiredView4, C0906R.id.op, "field 'mBtnPreAccount'", DmtButton.class);
        this.f32854f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32864a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f32864a, false, 21063, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f32864a, false, 21063, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseAccountFragment.onClick(view2);
            }
        });
        baseAccountFragment.mPhoneDownView = Utils.findRequiredView(view, C0906R.id.bxl, "field 'mPhoneDownView'");
        baseAccountFragment.mCodeDownView = Utils.findRequiredView(view, C0906R.id.ty, "field 'mCodeDownView'");
        baseAccountFragment.mPasswordDownView = Utils.findRequiredView(view, C0906R.id.bwj, "field 'mPasswordDownView'");
        baseAccountFragment.mLLContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bg2, "field 'mLLContainer'", LinearLayout.class);
        baseAccountFragment.mLoadingUI = (DmtLoadingLayout) Utils.findOptionalViewAsType(view, C0906R.id.bjk, "field 'mLoadingUI'", DmtLoadingLayout.class);
        baseAccountFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
