package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView;
import com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView;
import com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout;

public class ProfileCoverCropActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62095a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileCoverCropActivity f62096b;

    /* renamed from: c  reason: collision with root package name */
    private View f62097c;

    /* renamed from: d  reason: collision with root package name */
    private View f62098d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62095a, false, 68623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62095a, false, 68623, new Class[0], Void.TYPE);
            return;
        }
        ProfileCoverCropActivity profileCoverCropActivity = this.f62096b;
        if (profileCoverCropActivity != null) {
            this.f62096b = null;
            profileCoverCropActivity.mTitleBar = null;
            profileCoverCropActivity.mCropContainer = null;
            profileCoverCropActivity.mCoverImage = null;
            profileCoverCropActivity.mCoverWindow = null;
            profileCoverCropActivity.mFakeShelter = null;
            profileCoverCropActivity.mFakeShelterTop = null;
            profileCoverCropActivity.mCancel = null;
            profileCoverCropActivity.mConfirm = null;
            profileCoverCropActivity.mStatusView = null;
            this.f62097c.setOnClickListener(null);
            this.f62097c = null;
            this.f62098d.setOnClickListener(null);
            this.f62098d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileCoverCropActivity_ViewBinding(final ProfileCoverCropActivity profileCoverCropActivity, View view) {
        this.f62096b = profileCoverCropActivity;
        profileCoverCropActivity.mTitleBar = Utils.findRequiredView(view, C0906R.id.d3m, "field 'mTitleBar'");
        profileCoverCropActivity.mCropContainer = (SwitchModeFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.a1n, "field 'mCropContainer'", SwitchModeFrameLayout.class);
        profileCoverCropActivity.mCoverImage = (PinchImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCoverImage'", PinchImageView.class);
        profileCoverCropActivity.mCoverWindow = (PreviewBoxView) Utils.findRequiredViewAsType(view, C0906R.id.b0b, "field 'mCoverWindow'", PreviewBoxView.class);
        profileCoverCropActivity.mFakeShelter = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b14, "field 'mFakeShelter'", ImageView.class);
        profileCoverCropActivity.mFakeShelterTop = Utils.findRequiredView(view, C0906R.id.b15, "field 'mFakeShelterTop'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.d9v, "field 'mCancel' and method 'onViewClicked'");
        profileCoverCropActivity.mCancel = (DmtTextView) Utils.castView(findRequiredView, C0906R.id.d9v, "field 'mCancel'", DmtTextView.class);
        this.f62097c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62099a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62099a, false, 68624, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62099a, false, 68624, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileCoverCropActivity.onViewClicked(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.d_u, "field 'mConfirm' and method 'onViewClicked'");
        profileCoverCropActivity.mConfirm = (DmtTextView) Utils.castView(findRequiredView2, C0906R.id.d_u, "field 'mConfirm'", DmtTextView.class);
        this.f62098d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62102a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62102a, false, 68625, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62102a, false, 68625, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileCoverCropActivity.onViewClicked(view2);
            }
        });
        profileCoverCropActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
