package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;

public class StickerPropDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71697a;

    /* renamed from: b  reason: collision with root package name */
    private StickerPropDetailFragment f71698b;

    /* renamed from: c  reason: collision with root package name */
    private View f71699c;

    /* renamed from: d  reason: collision with root package name */
    private View f71700d;

    /* renamed from: e  reason: collision with root package name */
    private View f71701e;

    /* renamed from: f  reason: collision with root package name */
    private View f71702f;
    private View g;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f71697a, false, 82058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71697a, false, 82058, new Class[0], Void.TYPE);
            return;
        }
        StickerPropDetailFragment stickerPropDetailFragment = this.f71698b;
        if (stickerPropDetailFragment != null) {
            this.f71698b = null;
            stickerPropDetailFragment.mTextStickerInfo = null;
            stickerPropDetailFragment.mLayoutStickerUrl = null;
            stickerPropDetailFragment.mTextStickerUrl = null;
            stickerPropDetailFragment.mVpExpandContainer = null;
            stickerPropDetailFragment.txtDisclaimer = null;
            stickerPropDetailFragment.ivDisclaimer = null;
            stickerPropDetailFragment.imgToRecord = null;
            stickerPropDetailFragment.lockImageView = null;
            stickerPropDetailFragment.coverImgView = null;
            stickerPropDetailFragment.titleTextView = null;
            stickerPropDetailFragment.nickNameTextView = null;
            stickerPropDetailFragment.usedCountTextView = null;
            stickerPropDetailFragment.mHeadLayout = null;
            stickerPropDetailFragment.mInfoView = null;
            stickerPropDetailFragment.mStatusView = null;
            stickerPropDetailFragment.mBgCover = null;
            stickerPropDetailFragment.mStickerOwnerProfileView = null;
            stickerPropDetailFragment.mBottomLineView = null;
            stickerPropDetailFragment.mTopLineView = null;
            stickerPropDetailFragment.mArrowImg = null;
            stickerPropDetailFragment.mStickerPropActImgView = null;
            stickerPropDetailFragment.mStickerPropActImgView_i18n = null;
            stickerPropDetailFragment.gridView = null;
            stickerPropDetailFragment.mCollectView = null;
            stickerPropDetailFragment.ivCollect = null;
            stickerPropDetailFragment.tvCollect = null;
            stickerPropDetailFragment.mAdOwnerLL = null;
            stickerPropDetailFragment.mAdNickNameTv = null;
            stickerPropDetailFragment.mLinkIconIv = null;
            stickerPropDetailFragment.mShareBtn = null;
            this.f71699c.setOnClickListener(null);
            this.f71699c = null;
            this.f71700d.setOnClickListener(null);
            this.f71700d = null;
            this.f71701e.setOnClickListener(null);
            this.f71701e = null;
            this.f71702f.setOnClickListener(null);
            this.f71702f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public StickerPropDetailFragment_ViewBinding(final StickerPropDetailFragment stickerPropDetailFragment, View view) {
        this.f71698b = stickerPropDetailFragment;
        stickerPropDetailFragment.mTextStickerInfo = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d10, "field 'mTextStickerInfo'", TextView.class);
        stickerPropDetailFragment.mLayoutStickerUrl = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b9a, "field 'mLayoutStickerUrl'", LinearLayout.class);
        stickerPropDetailFragment.mTextStickerUrl = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d11, "field 'mTextStickerUrl'", TextView.class);
        stickerPropDetailFragment.mVpExpandContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ab0, "field 'mVpExpandContainer'", LinearLayout.class);
        stickerPropDetailFragment.txtDisclaimer = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ab2, "field 'txtDisclaimer'", TextView.class);
        stickerPropDetailFragment.ivDisclaimer = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ab1, "field 'ivDisclaimer'", ImageView.class);
        stickerPropDetailFragment.imgToRecord = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.atn, "field 'imgToRecord'", ImageView.class);
        stickerPropDetailFragment.lockImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.cvt, "field 'lockImageView'", RemoteImageView.class);
        stickerPropDetailFragment.coverImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.cvs, "field 'coverImgView'", RemoteImageView.class);
        stickerPropDetailFragment.titleTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cvu, "field 'titleTextView'", TextView.class);
        stickerPropDetailFragment.nickNameTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfe, "field 'nickNameTextView'", TextView.class);
        stickerPropDetailFragment.usedCountTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dow, "field 'usedCountTextView'", TextView.class);
        stickerPropDetailFragment.mHeadLayout = Utils.findRequiredView(view, C0906R.id.an6, "field 'mHeadLayout'");
        stickerPropDetailFragment.mInfoView = Utils.findRequiredView(view, C0906R.id.aul, "field 'mInfoView'");
        stickerPropDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        stickerPropDetailFragment.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ke, "field 'mBgCover'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ba0, "field 'mStickerOwnerProfileView' and method 'click'");
        stickerPropDetailFragment.mStickerOwnerProfileView = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.ba0, "field 'mStickerOwnerProfileView'", ViewGroup.class);
        this.f71699c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71703a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f71703a, false, 82059, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f71703a, false, 82059, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                stickerPropDetailFragment.click(view2);
            }
        });
        stickerPropDetailFragment.mBottomLineView = Utils.findRequiredView(view, C0906R.id.mi, "field 'mBottomLineView'");
        stickerPropDetailFragment.mTopLineView = Utils.findRequiredView(view, C0906R.id.d5h, "field 'mTopLineView'");
        stickerPropDetailFragment.mArrowImg = Utils.findRequiredView(view, C0906R.id.fw, "field 'mArrowImg'");
        stickerPropDetailFragment.mStickerPropActImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5j, "field 'mStickerPropActImgView'", RemoteImageView.class);
        stickerPropDetailFragment.mStickerPropActImgView_i18n = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5k, "field 'mStickerPropActImgView_i18n'", RemoteImageView.class);
        stickerPropDetailFragment.gridView = (GridView) Utils.findRequiredViewAsType(view, C0906R.id.cvi, "field 'gridView'", GridView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cvq, "field 'mCollectView' and method 'click'");
        stickerPropDetailFragment.mCollectView = findRequiredView2;
        this.f71700d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71706a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f71706a, false, 82060, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f71706a, false, 82060, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                stickerPropDetailFragment.click(view2);
            }
        });
        stickerPropDetailFragment.ivCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.cvr, "field 'ivCollect'", CheckableImageView.class);
        stickerPropDetailFragment.tvCollect = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.djw, "field 'tvCollect'", DmtTextView.class);
        stickerPropDetailFragment.mAdOwnerLL = Utils.findRequiredView(view, C0906R.id.cm, "field 'mAdOwnerLL'");
        stickerPropDetailFragment.mAdNickNameTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cg, "field 'mAdNickNameTv'", TextView.class);
        stickerPropDetailFragment.mLinkIconIv = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bcb, "field 'mLinkIconIv'", ImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.cp9, "field 'mShareBtn' and method 'click'");
        stickerPropDetailFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView3, C0906R.id.cp9, "field 'mShareBtn'", ImageView.class);
        this.f71701e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71709a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f71709a, false, 82061, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f71709a, false, 82061, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                stickerPropDetailFragment.click(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.ix, "method 'click'");
        this.f71702f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71712a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f71712a, false, 82062, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f71712a, false, 82062, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                stickerPropDetailFragment.click(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.cup, "method 'click'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71715a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f71715a, false, 82063, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f71715a, false, 82063, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                stickerPropDetailFragment.click(view2);
            }
        });
    }
}
