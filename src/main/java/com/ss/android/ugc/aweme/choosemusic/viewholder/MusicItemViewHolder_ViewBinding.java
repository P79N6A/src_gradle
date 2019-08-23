package com.ss.android.ugc.aweme.choosemusic.viewholder;

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
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;

public class MusicItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36111a;

    /* renamed from: b  reason: collision with root package name */
    private MusicItemViewHolder f36112b;

    /* renamed from: c  reason: collision with root package name */
    private View f36113c;

    /* renamed from: d  reason: collision with root package name */
    private View f36114d;

    /* renamed from: e  reason: collision with root package name */
    private View f36115e;

    /* renamed from: f  reason: collision with root package name */
    private View f36116f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36111a, false, 26927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36111a, false, 26927, new Class[0], Void.TYPE);
            return;
        }
        MusicItemViewHolder musicItemViewHolder = this.f36112b;
        if (musicItemViewHolder != null) {
            this.f36112b = null;
            musicItemViewHolder.mIvMusicCover = null;
            musicItemViewHolder.mOriginalTag = null;
            musicItemViewHolder.mIvMusicMark = null;
            musicItemViewHolder.mIvPlayView = null;
            musicItemViewHolder.mTvMusicName = null;
            musicItemViewHolder.mTvMusicSinger = null;
            musicItemViewHolder.mIvMusicCollect = null;
            musicItemViewHolder.mIvMusicDetail = null;
            musicItemViewHolder.mLlUseToShoot = null;
            musicItemViewHolder.mIvUseToShoot = null;
            musicItemViewHolder.mTvUseToShoot = null;
            musicItemViewHolder.mRlUseContainer = null;
            musicItemViewHolder.mLlItemContainer = null;
            musicItemViewHolder.mRLCoverContainer = null;
            musicItemViewHolder.mLlTitltContainer = null;
            musicItemViewHolder.mSpaceView = null;
            musicItemViewHolder.mTvMusicDuration = null;
            this.f36113c.setOnClickListener(null);
            this.f36113c = null;
            this.f36114d.setOnClickListener(null);
            this.f36114d = null;
            this.f36115e.setOnClickListener(null);
            this.f36115e = null;
            this.f36116f.setOnClickListener(null);
            this.f36116f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicItemViewHolder_ViewBinding(final MusicItemViewHolder musicItemViewHolder, View view) {
        this.f36112b = musicItemViewHolder;
        musicItemViewHolder.mIvMusicCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mIvMusicCover'", RemoteImageView.class);
        musicItemViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3q, "field 'mOriginalTag'", ImageView.class);
        musicItemViewHolder.mIvMusicMark = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3h, "field 'mIvMusicMark'", ImageView.class);
        musicItemViewHolder.mIvPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5d, "field 'mIvPlayView'", ImageView.class);
        musicItemViewHolder.mTvMusicName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mTvMusicName'", TextView.class);
        musicItemViewHolder.mTvMusicSinger = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dj4, "field 'mTvMusicSinger'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b3e, "field 'mIvMusicCollect' and method 'onClick'");
        musicItemViewHolder.mIvMusicCollect = (CheckableImageView) Utils.castView(findRequiredView, C0906R.id.b3e, "field 'mIvMusicCollect'", CheckableImageView.class);
        this.f36113c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36117a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36117a, false, 26928, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36117a, false, 26928, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicItemViewHolder.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.b3g, "field 'mIvMusicDetail' and method 'onClick'");
        musicItemViewHolder.mIvMusicDetail = (ImageView) Utils.castView(findRequiredView2, C0906R.id.b3g, "field 'mIvMusicDetail'", ImageView.class);
        this.f36114d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36120a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36120a, false, 26929, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36120a, false, 26929, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicItemViewHolder.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bif, "field 'mLlUseToShoot' and method 'onClick'");
        musicItemViewHolder.mLlUseToShoot = (ViewGroup) Utils.castView(findRequiredView3, C0906R.id.bif, "field 'mLlUseToShoot'", ViewGroup.class);
        this.f36115e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36123a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36123a, false, 26930, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36123a, false, 26930, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicItemViewHolder.onClick(view2);
            }
        });
        musicItemViewHolder.mIvUseToShoot = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b6d, "field 'mIvUseToShoot'", ImageView.class);
        musicItemViewHolder.mTvUseToShoot = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dlc, "field 'mTvUseToShoot'", TextView.class);
        musicItemViewHolder.mRlUseContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.cgr, "field 'mRlUseContainer'", ViewGroup.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.bha, "field 'mLlItemContainer' and method 'onClick'");
        musicItemViewHolder.mLlItemContainer = (ViewGroup) Utils.castView(findRequiredView4, C0906R.id.bha, "field 'mLlItemContainer'", ViewGroup.class);
        this.f36116f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36126a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f36126a, false, 26931, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f36126a, false, 26931, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicItemViewHolder.onClick(view2);
            }
        });
        musicItemViewHolder.mRLCoverContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.cfo, "field 'mRLCoverContainer'", ViewGroup.class);
        musicItemViewHolder.mLlTitltContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.bib, "field 'mLlTitltContainer'", ViewGroup.class);
        musicItemViewHolder.mSpaceView = Utils.findRequiredView(view, C0906R.id.dw8, "field 'mSpaceView'");
        musicItemViewHolder.mTvMusicDuration = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df1, "field 'mTvMusicDuration'", TextView.class);
    }
}
