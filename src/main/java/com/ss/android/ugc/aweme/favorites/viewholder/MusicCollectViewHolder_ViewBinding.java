package com.ss.android.ugc.aweme.favorites.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
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

public class MusicCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44376a;

    /* renamed from: b  reason: collision with root package name */
    private MusicCollectViewHolder f44377b;

    /* renamed from: c  reason: collision with root package name */
    private View f44378c;

    /* renamed from: d  reason: collision with root package name */
    private View f44379d;

    /* renamed from: e  reason: collision with root package name */
    private View f44380e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44376a, false, 39698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44376a, false, 39698, new Class[0], Void.TYPE);
            return;
        }
        MusicCollectViewHolder musicCollectViewHolder = this.f44377b;
        if (musicCollectViewHolder != null) {
            this.f44377b = null;
            musicCollectViewHolder.mNameView = null;
            musicCollectViewHolder.mOriginalTag = null;
            musicCollectViewHolder.mSingerView = null;
            musicCollectViewHolder.mCoverView = null;
            musicCollectViewHolder.mRightView = null;
            musicCollectViewHolder.mPlayView = null;
            musicCollectViewHolder.mTopView = null;
            musicCollectViewHolder.mProgressBarView = null;
            musicCollectViewHolder.musicItemll = null;
            musicCollectViewHolder.mMusicDuration = null;
            musicCollectViewHolder.mOkView = null;
            this.f44378c.setOnClickListener(null);
            this.f44378c = null;
            this.f44379d.setOnClickListener(null);
            this.f44379d = null;
            this.f44380e.setOnClickListener(null);
            this.f44380e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicCollectViewHolder_ViewBinding(final MusicCollectViewHolder musicCollectViewHolder, View view) {
        this.f44377b = musicCollectViewHolder;
        musicCollectViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mNameView'", TextView.class);
        musicCollectViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3q, "field 'mOriginalTag'", ImageView.class);
        musicCollectViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dj4, "field 'mSingerView'", TextView.class);
        musicCollectViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'mCoverView'", RemoteImageView.class);
        musicCollectViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cg_, "field 'mRightView'", RelativeLayout.class);
        musicCollectViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5d, "field 'mPlayView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bid, "field 'mTopView' and method 'onClick'");
        musicCollectViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.bid, "field 'mTopView'", LinearLayout.class);
        this.f44378c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44381a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44381a, false, 39699, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44381a, false, 39699, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicCollectViewHolder.onClick(view2);
            }
        });
        musicCollectViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.bwz, "field 'mProgressBarView'", ProgressBar.class);
        musicCollectViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.boh, "field 'musicItemll'", LinearLayout.class);
        musicCollectViewHolder.mMusicDuration = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ub, "field 'mMusicDuration'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cg2, "field 'mOkView' and method 'onClick'");
        musicCollectViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView2, C0906R.id.cg2, "field 'mOkView'", RelativeLayout.class);
        this.f44379d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44384a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44384a, false, 39700, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44384a, false, 39700, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicCollectViewHolder.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bod, "method 'onClick'");
        this.f44380e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44387a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44387a, false, 39701, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44387a, false, 39701, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicCollectViewHolder.onClick(view2);
            }
        });
    }
}
