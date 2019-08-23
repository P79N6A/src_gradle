package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class ProfileMoreFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62243a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileMoreFragment f62244b;

    /* renamed from: c  reason: collision with root package name */
    private View f62245c;

    /* renamed from: d  reason: collision with root package name */
    private View f62246d;

    /* renamed from: e  reason: collision with root package name */
    private View f62247e;

    /* renamed from: f  reason: collision with root package name */
    private View f62248f;
    private View g;
    private View h;
    private View i;
    private View j;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62243a, false, 68875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62243a, false, 68875, new Class[0], Void.TYPE);
            return;
        }
        ProfileMoreFragment profileMoreFragment = this.f62244b;
        if (profileMoreFragment != null) {
            this.f62244b = null;
            profileMoreFragment.mTitleBar = null;
            profileMoreFragment.mSendMsgImage = null;
            profileMoreFragment.mBlock = null;
            profileMoreFragment.mRemarkName = null;
            profileMoreFragment.mRemarkNameUnderline = null;
            profileMoreFragment.mRemoveFollower = null;
            profileMoreFragment.mRemoveFollowerUnderline = null;
            profileMoreFragment.mBlockStory = null;
            profileMoreFragment.shareView = null;
            profileMoreFragment.mBackBtn = null;
            profileMoreFragment.mAvatarIv = null;
            this.f62245c.setOnClickListener(null);
            this.f62245c = null;
            this.f62246d.setOnClickListener(null);
            this.f62246d = null;
            this.f62247e.setOnClickListener(null);
            this.f62247e = null;
            this.f62248f.setOnClickListener(null);
            this.f62248f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileMoreFragment_ViewBinding(final ProfileMoreFragment profileMoreFragment, View view) {
        this.f62244b = profileMoreFragment;
        profileMoreFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3v, "field 'mTitleBar'", ButtonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cnw, "field 'mSendMsgImage' and method 'onClick'");
        profileMoreFragment.mSendMsgImage = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.cnw, "field 'mSendMsgImage'", RemoteImageView.class);
        this.f62245c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62249a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62249a, false, 68876, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62249a, false, 68876, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ll, "field 'mBlock' and method 'onClick'");
        profileMoreFragment.mBlock = (CommonItemView) Utils.castView(findRequiredView2, C0906R.id.ll, "field 'mBlock'", CommonItemView.class);
        this.f62246d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62252a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62252a, false, 68877, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62252a, false, 68877, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.cd8, "field 'mRemarkName' and method 'onClick'");
        profileMoreFragment.mRemarkName = (CommonItemView) Utils.castView(findRequiredView3, C0906R.id.cd8, "field 'mRemarkName'", CommonItemView.class);
        this.f62247e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62255a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62255a, false, 68878, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62255a, false, 68878, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        profileMoreFragment.mRemarkNameUnderline = Utils.findRequiredView(view, C0906R.id.cd9, "field 'mRemarkNameUnderline'");
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.cdb, "field 'mRemoveFollower' and method 'onClick'");
        profileMoreFragment.mRemoveFollower = (CommonItemView) Utils.castView(findRequiredView4, C0906R.id.cdb, "field 'mRemoveFollower'", CommonItemView.class);
        this.f62248f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62258a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62258a, false, 68879, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62258a, false, 68879, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        profileMoreFragment.mRemoveFollowerUnderline = Utils.findRequiredView(view, C0906R.id.cdc, "field 'mRemoveFollowerUnderline'");
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.lo, "field 'mBlockStory' and method 'onClick'");
        profileMoreFragment.mBlockStory = (CommonItemView) Utils.castView(findRequiredView5, C0906R.id.lo, "field 'mBlockStory'", CommonItemView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62261a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62261a, false, 68880, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62261a, false, 68880, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.cp3, "field 'shareView' and method 'onClick'");
        profileMoreFragment.shareView = findRequiredView6;
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62264a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62264a, false, 68881, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62264a, false, 68881, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackBtn' and method 'onClick'");
        profileMoreFragment.mBackBtn = findRequiredView7;
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62267a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62267a, false, 68882, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62267a, false, 68882, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
        profileMoreFragment.mAvatarIv = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvatarIv'", AvatarImageView.class);
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.cdl, "method 'onClick'");
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62270a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62270a, false, 68883, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62270a, false, 68883, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileMoreFragment.onClick(view2);
            }
        });
    }
}
