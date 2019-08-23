package com.ss.android.ugc.aweme.music.adapter;

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
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;

public class MusicUnitViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56224a;

    /* renamed from: b  reason: collision with root package name */
    private MusicUnitViewHolder f56225b;

    /* renamed from: c  reason: collision with root package name */
    private View f56226c;

    /* renamed from: d  reason: collision with root package name */
    private View f56227d;

    /* renamed from: e  reason: collision with root package name */
    private View f56228e;

    /* renamed from: f  reason: collision with root package name */
    private View f56229f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56224a, false, 59926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56224a, false, 59926, new Class[0], Void.TYPE);
            return;
        }
        MusicUnitViewHolder musicUnitViewHolder = this.f56225b;
        if (musicUnitViewHolder != null) {
            this.f56225b = null;
            musicUnitViewHolder.mNameView = null;
            musicUnitViewHolder.mSingerView = null;
            musicUnitViewHolder.mDurationView = null;
            musicUnitViewHolder.mCoverView = null;
            musicUnitViewHolder.mOkView = null;
            musicUnitViewHolder.mRightView = null;
            musicUnitViewHolder.mPlayView = null;
            musicUnitViewHolder.mTopView = null;
            musicUnitViewHolder.mProgressBarView = null;
            musicUnitViewHolder.musicDetailContainer = null;
            musicUnitViewHolder.musicItemll = null;
            musicUnitViewHolder.ivDetail = null;
            musicUnitViewHolder.divider = null;
            musicUnitViewHolder.ivCollectFrame = null;
            musicUnitViewHolder.ivMusicCollect = null;
            musicUnitViewHolder.ivOriginMusicMark = null;
            this.f56226c.setOnClickListener(null);
            this.f56226c = null;
            this.f56227d.setOnClickListener(null);
            this.f56227d = null;
            this.f56228e.setOnClickListener(null);
            this.f56228e = null;
            this.f56229f.setOnClickListener(null);
            this.f56229f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicUnitViewHolder_ViewBinding(final MusicUnitViewHolder musicUnitViewHolder, View view) {
        this.f56225b = musicUnitViewHolder;
        musicUnitViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mNameView'", TextView.class);
        musicUnitViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dj4, "field 'mSingerView'", TextView.class);
        musicUnitViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db8, "field 'mDurationView'", TextView.class);
        musicUnitViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cg2, "field 'mOkView' and method 'onClick'");
        musicUnitViewHolder.mOkView = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.cg2, "field 'mOkView'", LinearLayout.class);
        this.f56226c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56230a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56230a, false, 59927, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56230a, false, 59927, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicUnitViewHolder.onClick(view2);
            }
        });
        musicUnitViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cg_, "field 'mRightView'", RelativeLayout.class);
        musicUnitViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5d, "field 'mPlayView'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bid, "field 'mTopView' and method 'onClick'");
        musicUnitViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.bid, "field 'mTopView'", LinearLayout.class);
        this.f56227d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56233a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56233a, false, 59928, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56233a, false, 59928, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicUnitViewHolder.onClick(view2);
            }
        });
        musicUnitViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.bwz, "field 'mProgressBarView'", ProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.boe, "field 'musicDetailContainer' and method 'onClick'");
        musicUnitViewHolder.musicDetailContainer = (LinearLayout) Utils.castView(findRequiredView3, C0906R.id.boe, "field 'musicDetailContainer'", LinearLayout.class);
        this.f56228e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56236a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56236a, false, 59929, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56236a, false, 59929, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicUnitViewHolder.onClick(view2);
            }
        });
        musicUnitViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.boh, "field 'musicItemll'", LinearLayout.class);
        musicUnitViewHolder.ivDetail = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bod, "field 'ivDetail'", ImageView.class);
        musicUnitViewHolder.divider = Utils.findRequiredView(view, C0906R.id.boz, "field 'divider'");
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.u8, "field 'ivCollectFrame' and method 'onClick'");
        musicUnitViewHolder.ivCollectFrame = (LinearLayout) Utils.castView(findRequiredView4, C0906R.id.u8, "field 'ivCollectFrame'", LinearLayout.class);
        this.f56229f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56239a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56239a, false, 59930, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56239a, false, 59930, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicUnitViewHolder.onClick(view2);
            }
        });
        musicUnitViewHolder.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.bo_, "field 'ivMusicCollect'", CheckableImageView.class);
        musicUnitViewHolder.ivOriginMusicMark = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bve, "field 'ivOriginMusicMark'", ImageView.class);
    }
}
