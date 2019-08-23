package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class BaseDTProfileFragment_ViewBinding extends BaseProfileFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f61746b;

    /* renamed from: a  reason: collision with root package name */
    private BaseDTProfileFragment f61747a;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61746b, false, 67856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61746b, false, 67856, new Class[0], Void.TYPE);
            return;
        }
        BaseDTProfileFragment baseDTProfileFragment = this.f61747a;
        if (baseDTProfileFragment != null) {
            this.f61747a = null;
            baseDTProfileFragment.mTitleColorCtrl = null;
            baseDTProfileFragment.mMoreBtnBg = null;
            baseDTProfileFragment.mBackBtnBg = null;
            baseDTProfileFragment.mUserCover = null;
            baseDTProfileFragment.mCoverMask = null;
            baseDTProfileFragment.mFastChatBtn = null;
            baseDTProfileFragment.mFastFollowBtn = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseDTProfileFragment_ViewBinding(BaseDTProfileFragment baseDTProfileFragment, View view) {
        super(baseDTProfileFragment, view);
        this.f61747a = baseDTProfileFragment;
        baseDTProfileFragment.mTitleColorCtrl = Utils.findRequiredView(view, C0906R.id.d3q, "field 'mTitleColorCtrl'");
        baseDTProfileFragment.mMoreBtnBg = Utils.findRequiredView(view, C0906R.id.bnj, "field 'mMoreBtnBg'");
        baseDTProfileFragment.mBackBtnBg = view.findViewById(C0906R.id.iy);
        baseDTProfileFragment.mUserCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b09, "field 'mUserCover'", RemoteImageView.class);
        baseDTProfileFragment.mCoverMask = view.findViewById(C0906R.id.a1h);
        baseDTProfileFragment.mFastChatBtn = (RemoteImageView) Utils.findOptionalViewAsType(view, C0906R.id.ack, "field 'mFastChatBtn'", RemoteImageView.class);
        baseDTProfileFragment.mFastFollowBtn = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.acl, "field 'mFastFollowBtn'", DmtTextView.class);
    }
}
