package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView;

public class HeaderDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61877a;

    /* renamed from: b  reason: collision with root package name */
    private HeaderDetailActivity f61878b;

    /* renamed from: c  reason: collision with root package name */
    private View f61879c;

    /* renamed from: d  reason: collision with root package name */
    private View f61880d;

    /* renamed from: e  reason: collision with root package name */
    private View f61881e;

    /* renamed from: f  reason: collision with root package name */
    private View f61882f;
    private View g;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61877a, false, 68108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61877a, false, 68108, new Class[0], Void.TYPE);
            return;
        }
        HeaderDetailActivity headerDetailActivity = this.f61878b;
        if (headerDetailActivity != null) {
            this.f61878b = null;
            headerDetailActivity.mTitleBar = null;
            headerDetailActivity.mMore = null;
            headerDetailActivity.userAvatar = null;
            headerDetailActivity.fixedRatioFrame = null;
            headerDetailActivity.rootView = null;
            headerDetailActivity.mDownloadView = null;
            headerDetailActivity.progressBar = null;
            headerDetailActivity.bgView = null;
            headerDetailActivity.editText = null;
            headerDetailActivity.avatarDecoPanel = null;
            headerDetailActivity.mDecoTextView = null;
            headerDetailActivity.mDecoHintView = null;
            this.f61879c.setOnClickListener(null);
            this.f61879c = null;
            this.f61880d.setOnClickListener(null);
            this.f61880d = null;
            this.f61881e.setOnClickListener(null);
            this.f61881e = null;
            this.f61882f.setOnClickListener(null);
            this.f61882f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HeaderDetailActivity_ViewBinding(final HeaderDetailActivity headerDetailActivity, View view) {
        this.f61878b = headerDetailActivity;
        headerDetailActivity.mTitleBar = Utils.findRequiredView(view, C0906R.id.d3m, "field 'mTitleBar'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b3b, "field 'mMore' and method 'onMoreClick'");
        headerDetailActivity.mMore = findRequiredView;
        this.f61879c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61883a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61883a, false, 68109, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61883a, false, 68109, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                headerDetailActivity.onMoreClick();
            }
        });
        headerDetailActivity.userAvatar = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp7, "field 'userAvatar'", RemoteImageView.class);
        headerDetailActivity.fixedRatioFrame = (FixedRatioFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.ail, "field 'fixedRatioFrame'", FixedRatioFrameLayout.class);
        headerDetailActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.ci4, "field 'rootView'", ViewGroup.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.b0q, "field 'mDownloadView' and method 'saveBitmap'");
        headerDetailActivity.mDownloadView = (ImageView) Utils.castView(findRequiredView2, C0906R.id.b0q, "field 'mDownloadView'", ImageView.class);
        this.f61880d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61886a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61886a, false, 68110, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61886a, false, 68110, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                headerDetailActivity.saveBitmap();
            }
        });
        headerDetailActivity.progressBar = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b48, "field 'progressBar'", ImageView.class);
        headerDetailActivity.bgView = Utils.findRequiredView(view, C0906R.id.k4, "field 'bgView'");
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.db9, "field 'editText' and method 'editProfile'");
        headerDetailActivity.editText = (TextView) Utils.castView(findRequiredView3, C0906R.id.db9, "field 'editText'", TextView.class);
        this.f61881e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61889a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61889a, false, 68111, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61889a, false, 68111, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                headerDetailActivity.editProfile();
            }
        });
        headerDetailActivity.avatarDecoPanel = Utils.findRequiredView(view, C0906R.id.hw, "field 'avatarDecoPanel'");
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.hx, "field 'mDecoTextView' and method 'onSetSameClicked'");
        headerDetailActivity.mDecoTextView = (StateDmtTextView) Utils.castView(findRequiredView4, C0906R.id.hx, "field 'mDecoTextView'", StateDmtTextView.class);
        this.f61882f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61892a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61892a, false, 68112, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61892a, false, 68112, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                headerDetailActivity.onSetSameClicked();
            }
        });
        headerDetailActivity.mDecoHintView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.hz, "field 'mDecoHintView'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.ayw, "method 'onBackClick'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61895a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61895a, false, 68113, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61895a, false, 68113, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                headerDetailActivity.onBackClick();
            }
        });
    }
}
