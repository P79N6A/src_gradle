package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PrivacyActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64181a;

    /* renamed from: b  reason: collision with root package name */
    private PrivacyActivity f64182b;

    /* renamed from: c  reason: collision with root package name */
    private View f64183c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64181a, false, 72571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64181a, false, 72571, new Class[0], Void.TYPE);
            return;
        }
        PrivacyActivity privacyActivity = this.f64182b;
        if (privacyActivity != null) {
            this.f64182b = null;
            privacyActivity.mTitle = null;
            privacyActivity.mBack = null;
            privacyActivity.contactItem = null;
            privacyActivity.mPrivacyManagerItem = null;
            privacyActivity.mBlockListItem = null;
            privacyActivity.mCommentManagerItem = null;
            privacyActivity.mReactItem = null;
            privacyActivity.mDuetItem = null;
            privacyActivity.mWhoCanSeeMyLikeListItem = null;
            privacyActivity.mPrivateAccount = null;
            this.f64183c.setOnClickListener(null);
            this.f64183c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PrivacyActivity_ViewBinding(final PrivacyActivity privacyActivity, View view) {
        this.f64182b = privacyActivity;
        privacyActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBack' and method 'back'");
        privacyActivity.mBack = (ImageView) Utils.castView(findRequiredView, C0906R.id.ix, "field 'mBack'", ImageView.class);
        this.f64183c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64184a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64184a, false, 72572, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64184a, false, 72572, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privacyActivity.back();
            }
        });
        privacyActivity.contactItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c64, "field 'contactItem'", CommonItemView.class);
        privacyActivity.mPrivacyManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c69, "field 'mPrivacyManagerItem'", CommonItemView.class);
        privacyActivity.mBlockListItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c63, "field 'mBlockListItem'", CommonItemView.class);
        privacyActivity.mCommentManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.vf, "field 'mCommentManagerItem'", CommonItemView.class);
        privacyActivity.mReactItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c68, "field 'mReactItem'", CommonItemView.class);
        privacyActivity.mDuetItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c66, "field 'mDuetItem'", CommonItemView.class);
        privacyActivity.mWhoCanSeeMyLikeListItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dxl, "field 'mWhoCanSeeMyLikeListItem'", CommonItemView.class);
        privacyActivity.mPrivateAccount = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c67, "field 'mPrivateAccount'", CommonItemView.class);
    }
}
