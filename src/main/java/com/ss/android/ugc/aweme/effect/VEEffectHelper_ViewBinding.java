package com.ss.android.ugc.aweme.effect;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;

public class VEEffectHelper_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43603a;

    /* renamed from: b  reason: collision with root package name */
    private VEEffectHelper f43604b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f43603a, false, 38756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43603a, false, 38756, new Class[0], Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43604b;
        if (vEEffectHelper != null) {
            this.f43604b = null;
            vEEffectHelper.mEffectSeekLayout = null;
            vEEffectHelper.mSeeklayout = null;
            vEEffectHelper.contentlatout = null;
            vEEffectHelper.mIvPlay = null;
            vEEffectHelper.mRlEffectHint = null;
            vEEffectHelper.mTvEffectHint = null;
            vEEffectHelper.mEffectTitleLayout = null;
            vEEffectHelper.videolayout = null;
            vEEffectHelper.loadingArea = null;
            vEEffectHelper.mStatusView = null;
            vEEffectHelper.mTextxSave = null;
            vEEffectHelper.mTextCancel = null;
            vEEffectHelper.mViewPager = null;
            vEEffectHelper.mTabLayout = null;
            vEEffectHelper.mChooseVideoCoverView = null;
            vEEffectHelper.mVideoEditView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VEEffectHelper_ViewBinding(VEEffectHelper vEEffectHelper, View view) {
        this.f43604b = vEEffectHelper;
        vEEffectHelper.mEffectSeekLayout = (VEEffectSeekLayout) Utils.findRequiredViewAsType(view, C0906R.id.a9_, "field 'mEffectSeekLayout'", VEEffectSeekLayout.class);
        vEEffectHelper.mSeeklayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.cmt, "field 'mSeeklayout'", LinearLayout.class);
        vEEffectHelper.contentlatout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.zg, "field 'contentlatout'", FrameLayout.class);
        vEEffectHelper.mIvPlay = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b43, "field 'mIvPlay'", ImageView.class);
        vEEffectHelper.mRlEffectHint = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cfw, "field 'mRlEffectHint'", RelativeLayout.class);
        vEEffectHelper.mTvEffectHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbb, "field 'mTvEffectHint'", TextView.class);
        vEEffectHelper.mEffectTitleLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.a99, "field 'mEffectTitleLayout'", RelativeLayout.class);
        vEEffectHelper.videolayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.dtb, "field 'videolayout'", RelativeLayout.class);
        vEEffectHelper.loadingArea = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bj4, "field 'loadingArea'", LinearLayout.class);
        vEEffectHelper.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.bjh, "field 'mStatusView'", DmtStatusView.class);
        vEEffectHelper.mTextxSave = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dhw, "field 'mTextxSave'", TextView.class);
        vEEffectHelper.mTextCancel = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d9y, "field 'mTextCancel'", TextView.class);
        vEEffectHelper.mViewPager = (NoScrollViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", NoScrollViewPager.class);
        vEEffectHelper.mTabLayout = (AVDmtTabLayout) Utils.findRequiredViewAsType(view, C0906R.id.cyz, "field 'mTabLayout'", AVDmtTabLayout.class);
        vEEffectHelper.mChooseVideoCoverView = (ChooseVideoCoverView) Utils.findRequiredViewAsType(view, C0906R.id.sq, "field 'mChooseVideoCoverView'", ChooseVideoCoverView.class);
        vEEffectHelper.mVideoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, C0906R.id.ds3, "field 'mVideoEditView'", VideoEditView.class);
    }
}
