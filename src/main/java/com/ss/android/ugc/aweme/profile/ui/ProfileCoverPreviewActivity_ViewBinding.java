package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.ui.widget.StatedButton;

public class ProfileCoverPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62119a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileCoverPreviewActivity f62120b;

    /* renamed from: c  reason: collision with root package name */
    private View f62121c;

    /* renamed from: d  reason: collision with root package name */
    private View f62122d;

    /* renamed from: e  reason: collision with root package name */
    private View f62123e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62119a, false, 68656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62119a, false, 68656, new Class[0], Void.TYPE);
            return;
        }
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f62120b;
        if (profileCoverPreviewActivity != null) {
            this.f62120b = null;
            profileCoverPreviewActivity.mCoverImage = null;
            profileCoverPreviewActivity.mChangeBtn = null;
            profileCoverPreviewActivity.mDownloadBtn = null;
            this.f62121c.setOnClickListener(null);
            this.f62121c = null;
            this.f62122d.setOnClickListener(null);
            this.f62122d = null;
            this.f62123e.setOnClickListener(null);
            this.f62123e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileCoverPreviewActivity_ViewBinding(final ProfileCoverPreviewActivity profileCoverPreviewActivity, View view) {
        this.f62120b = profileCoverPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b08, "field 'mCoverImage' and method 'onViewClicked'");
        profileCoverPreviewActivity.mCoverImage = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.b08, "field 'mCoverImage'", RemoteImageView.class);
        this.f62121c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62124a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62124a, false, 68657, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62124a, false, 68657, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileCoverPreviewActivity.onViewClicked(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.d_3, "field 'mChangeBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mChangeBtn = (TextView) Utils.castView(findRequiredView2, C0906R.id.d_3, "field 'mChangeBtn'", TextView.class);
        this.f62122d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62127a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62127a, false, 68658, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62127a, false, 68658, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileCoverPreviewActivity.onViewClicked(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b0q, "field 'mDownloadBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mDownloadBtn = (StatedButton) Utils.castView(findRequiredView3, C0906R.id.b0q, "field 'mDownloadBtn'", StatedButton.class);
        this.f62123e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62130a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62130a, false, 68659, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62130a, false, 68659, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileCoverPreviewActivity.onViewClicked(view2);
            }
        });
    }
}
