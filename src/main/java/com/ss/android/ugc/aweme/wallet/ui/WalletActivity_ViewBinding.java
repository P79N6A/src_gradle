package com.ss.android.ugc.aweme.wallet.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class WalletActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76583a;

    /* renamed from: b  reason: collision with root package name */
    private WalletActivity f76584b;

    /* renamed from: c  reason: collision with root package name */
    private View f76585c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f76583a, false, 89826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76583a, false, 89826, new Class[0], Void.TYPE);
            return;
        }
        WalletActivity walletActivity = this.f76584b;
        if (walletActivity != null) {
            this.f76584b = null;
            walletActivity.mBtnTitleBar = null;
            walletActivity.mRIVBanner = null;
            walletActivity.mTvDoubiBalance = null;
            walletActivity.mBtnCharge = null;
            walletActivity.mRvWalletItemList = null;
            walletActivity.mStatusView = null;
            this.f76585c.setOnClickListener(null);
            this.f76585c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public WalletActivity_ViewBinding(final WalletActivity walletActivity, View view) {
        this.f76584b = walletActivity;
        walletActivity.mBtnTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.p4, "field 'mBtnTitleBar'", ButtonTitleBar.class);
        walletActivity.mRIVBanner = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.cf7, "field 'mRIVBanner'", RemoteImageView.class);
        walletActivity.mTvDoubiBalance = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.db5, "field 'mTvDoubiBalance'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.nr, "field 'mBtnCharge' and method 'onClick'");
        walletActivity.mBtnCharge = (DmtButton) Utils.castView(findRequiredView, C0906R.id.nr, "field 'mBtnCharge'", DmtButton.class);
        this.f76585c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76586a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f76586a, false, 89827, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f76586a, false, 89827, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                walletActivity.onClick(view2);
            }
        });
        walletActivity.mRvWalletItemList = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ciw, "field 'mRvWalletItemList'", RecyclerView.class);
        walletActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
