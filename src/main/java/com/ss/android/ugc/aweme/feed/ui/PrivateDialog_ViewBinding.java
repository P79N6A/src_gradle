package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.views.PrivateShareTopItemView;
import com.ss.android.ugc.aweme.share.seconditem.b;

public class PrivateDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46258a;

    /* renamed from: b  reason: collision with root package name */
    private PrivateDialog f46259b;

    /* renamed from: c  reason: collision with root package name */
    private View f46260c;

    /* renamed from: d  reason: collision with root package name */
    private View f46261d;

    /* renamed from: e  reason: collision with root package name */
    private View f46262e;

    /* renamed from: f  reason: collision with root package name */
    private View f46263f;
    private View g;
    private View h;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46258a, false, 42963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46258a, false, 42963, new Class[0], Void.TYPE);
            return;
        }
        PrivateDialog privateDialog = this.f46259b;
        if (privateDialog != null) {
            this.f46259b = null;
            privateDialog.react = null;
            privateDialog.duet = null;
            privateDialog.reuseSticker = null;
            privateDialog.reuseMvView = null;
            privateDialog.ivReport = null;
            privateDialog.mTvSaveVideo = null;
            privateDialog.tlVideoPublic = null;
            privateDialog.mRootView = null;
            privateDialog.tvPrivate = null;
            privateDialog.ivPrivate = null;
            privateDialog.shareTopItemView = null;
            privateDialog.douPlusShareItem = null;
            privateDialog.ivLiveWallpaper = null;
            privateDialog.seeAdsPlanItem = null;
            privateDialog.mCollectItemView = null;
            privateDialog.mBtnFavouriteWrapper = null;
            privateDialog.cancel = null;
            privateDialog.send = null;
            privateDialog.mShareCover = null;
            privateDialog.mSendEt = null;
            privateDialog.mTopExternalLayout = null;
            privateDialog.mSecondRv = null;
            privateDialog.mMultiShareRv = null;
            privateDialog.mSecondLayout = null;
            privateDialog.ivDou = null;
            privateDialog.tvDou = null;
            this.f46260c.setOnClickListener(null);
            this.f46260c = null;
            this.f46261d.setOnClickListener(null);
            this.f46261d = null;
            this.f46262e.setOnClickListener(null);
            this.f46262e = null;
            this.f46263f.setOnClickListener(null);
            this.f46263f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PrivateDialog_ViewBinding(final PrivateDialog privateDialog, View view) {
        this.f46259b = privateDialog;
        privateDialog.react = Utils.findRequiredView(view, C0906R.id.bhk, "field 'react'");
        privateDialog.duet = Utils.findRequiredView(view, C0906R.id.bgf, "field 'duet'");
        privateDialog.reuseSticker = Utils.findRequiredView(view, C0906R.id.bhn, "field 'reuseSticker'");
        privateDialog.reuseMvView = Utils.findRequiredView(view, C0906R.id.bho, "field 'reuseMvView'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cdm, "field 'ivReport' and method 'onCick'");
        privateDialog.ivReport = (ImageView) Utils.castView(findRequiredView, C0906R.id.cdm, "field 'ivReport'", ImageView.class);
        this.f46260c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46264a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46264a, false, 42964, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46264a, false, 42964, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.onCick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.a6z, "field 'mTvSaveVideo' and method 'onCick'");
        privateDialog.mTvSaveVideo = (ImageView) Utils.castView(findRequiredView2, C0906R.id.a6z, "field 'mTvSaveVideo'", ImageView.class);
        this.f46261d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46267a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46267a, false, 42965, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46267a, false, 42965, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.onCick(view2);
            }
        });
        privateDialog.tlVideoPublic = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.bl8, "field 'tlVideoPublic'", RelativeLayout.class);
        privateDialog.mRootView = (CoordinatorLayout) Utils.findRequiredViewAsType(view, C0906R.id.chy, "field 'mRootView'", CoordinatorLayout.class);
        privateDialog.tvPrivate = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c6m, "field 'tvPrivate'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.c6j, "field 'ivPrivate' and method 'onCick'");
        privateDialog.ivPrivate = (ImageView) Utils.castView(findRequiredView3, C0906R.id.c6j, "field 'ivPrivate'", ImageView.class);
        this.f46262e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46270a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46270a, false, 42966, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46270a, false, 42966, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.onCick(view2);
            }
        });
        privateDialog.shareTopItemView = (PrivateShareTopItemView) Utils.findRequiredViewAsType(view, C0906R.id.duq, "field 'shareTopItemView'", PrivateShareTopItemView.class);
        privateDialog.douPlusShareItem = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.a6g, "field 'douPlusShareItem'", LinearLayout.class);
        privateDialog.ivLiveWallpaper = Utils.findRequiredView(view, C0906R.id.bfc, "field 'ivLiveWallpaper'");
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.c6k, "field 'seeAdsPlanItem' and method 'onCick'");
        privateDialog.seeAdsPlanItem = (LinearLayout) Utils.castView(findRequiredView4, C0906R.id.c6k, "field 'seeAdsPlanItem'", LinearLayout.class);
        this.f46263f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46273a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46273a, false, 42967, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46273a, false, 42967, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.onCick(view2);
            }
        });
        privateDialog.mCollectItemView = (b) Utils.findRequiredViewAsType(view, C0906R.id.nz, "field 'mCollectItemView'", b.class);
        privateDialog.mBtnFavouriteWrapper = Utils.findRequiredView(view, C0906R.id.o0, "field 'mBtnFavouriteWrapper'");
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.q2, "field 'cancel' and method 'cancel'");
        privateDialog.cancel = (DmtTextView) Utils.castView(findRequiredView5, C0906R.id.q2, "field 'cancel'", DmtTextView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46276a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46276a, false, 42968, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46276a, false, 42968, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.cancel();
            }
        });
        privateDialog.send = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.cnn, "field 'send'", DmtTextView.class);
        privateDialog.mShareCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.bo0, "field 'mShareCover'", RemoteImageView.class);
        privateDialog.mSendEt = (DmtEditText) Utils.findRequiredViewAsType(view, C0906R.id.bo1, "field 'mSendEt'", DmtEditText.class);
        privateDialog.mTopExternalLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.d5g, "field 'mTopExternalLayout'", FrameLayout.class);
        privateDialog.mSecondRv = Utils.findRequiredView(view, C0906R.id.cmb, "field 'mSecondRv'");
        privateDialog.mMultiShareRv = Utils.findRequiredView(view, C0906R.id.b9d, "field 'mMultiShareRv'");
        privateDialog.mSecondLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b_h, "field 'mSecondLayout'", LinearLayout.class);
        privateDialog.ivDou = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a6h, "field 'ivDou'", ImageView.class);
        privateDialog.tvDou = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.a6r, "field 'tvDou'", DmtTextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.bfd, "method 'onCick'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46279a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46279a, false, 42969, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46279a, false, 42969, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                privateDialog.onCick(view2);
            }
        });
    }
}
