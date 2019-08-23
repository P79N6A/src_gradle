package com.ss.android.ugc.aweme.music;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;

public class OriginMusicViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56151a;

    /* renamed from: b  reason: collision with root package name */
    private OriginMusicViewHolder f56152b;

    /* renamed from: c  reason: collision with root package name */
    private View f56153c;

    /* renamed from: d  reason: collision with root package name */
    private View f56154d;

    /* renamed from: e  reason: collision with root package name */
    private View f56155e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56151a, false, 59865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56151a, false, 59865, new Class[0], Void.TYPE);
            return;
        }
        OriginMusicViewHolder originMusicViewHolder = this.f56152b;
        if (originMusicViewHolder != null) {
            this.f56152b = null;
            originMusicViewHolder.mNameView = null;
            originMusicViewHolder.mDurationView = null;
            originMusicViewHolder.mCoverView = null;
            originMusicViewHolder.mOkView = null;
            originMusicViewHolder.mRightView = null;
            originMusicViewHolder.mPlayView = null;
            originMusicViewHolder.mTvConfirm = null;
            originMusicViewHolder.mTopView = null;
            originMusicViewHolder.mIvMusicCollect = null;
            originMusicViewHolder.mProgressBarView = null;
            originMusicViewHolder.musicItemll = null;
            originMusicViewHolder.ivDetail = null;
            originMusicViewHolder.txtUserCount = null;
            originMusicViewHolder.mTagView = null;
            this.f56153c.setOnClickListener(null);
            this.f56153c = null;
            this.f56154d.setOnClickListener(null);
            this.f56154d = null;
            this.f56155e.setOnClickListener(null);
            this.f56155e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public OriginMusicViewHolder_ViewBinding(final OriginMusicViewHolder originMusicViewHolder, View view) {
        this.f56152b = originMusicViewHolder;
        originMusicViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mNameView'", TextView.class);
        originMusicViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db8, "field 'mDurationView'", TextView.class);
        originMusicViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cg2, "field 'mOkView' and method 'onClick'");
        originMusicViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView, C0906R.id.cg2, "field 'mOkView'", RelativeLayout.class);
        this.f56153c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56156a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56156a, false, 59866, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56156a, false, 59866, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                originMusicViewHolder.onClick(view2);
            }
        });
        originMusicViewHolder.mRightView = (ConstraintLayout) Utils.findRequiredViewAsType(view, C0906R.id.cg_, "field 'mRightView'", ConstraintLayout.class);
        originMusicViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5d, "field 'mPlayView'", ImageView.class);
        originMusicViewHolder.mTvConfirm = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dnj, "field 'mTvConfirm'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bid, "field 'mTopView' and method 'onClick'");
        originMusicViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.bid, "field 'mTopView'", LinearLayout.class);
        this.f56154d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56159a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56159a, false, 59867, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56159a, false, 59867, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                originMusicViewHolder.onClick(view2);
            }
        });
        originMusicViewHolder.mIvMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3e, "field 'mIvMusicCollect'", CheckableImageView.class);
        originMusicViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.bwz, "field 'mProgressBarView'", ProgressBar.class);
        originMusicViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.boh, "field 'musicItemll'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bod, "field 'ivDetail' and method 'onClick'");
        originMusicViewHolder.ivDetail = (ImageView) Utils.castView(findRequiredView3, C0906R.id.bod, "field 'ivDetail'", ImageView.class);
        this.f56155e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56162a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56162a, false, 59868, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56162a, false, 59868, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                originMusicViewHolder.onClick(view2);
            }
        });
        originMusicViewHolder.txtUserCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dle, "field 'txtUserCount'", TextView.class);
        originMusicViewHolder.mTagView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cz_, "field 'mTagView'", TextView.class);
    }
}
