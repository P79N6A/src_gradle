package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class MusicDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56531a;

    /* renamed from: b  reason: collision with root package name */
    private MusicDetailFragment f56532b;

    /* renamed from: c  reason: collision with root package name */
    private View f56533c;

    /* renamed from: d  reason: collision with root package name */
    private View f56534d;

    /* renamed from: e  reason: collision with root package name */
    private View f56535e;

    /* renamed from: f  reason: collision with root package name */
    private View f56536f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56531a, false, 60320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56531a, false, 60320, new Class[0], Void.TYPE);
            return;
        }
        MusicDetailFragment musicDetailFragment = this.f56532b;
        if (musicDetailFragment != null) {
            this.f56532b = null;
            musicDetailFragment.mMusicName = null;
            musicDetailFragment.mNickName = null;
            musicDetailFragment.mPlaceHolder = null;
            musicDetailFragment.mMusicCover = null;
            musicDetailFragment.mTitleLayout = null;
            musicDetailFragment.mHeadLayout = null;
            musicDetailFragment.mMusicUsedCount = null;
            musicDetailFragment.mBgCover = null;
            musicDetailFragment.ivMusicCollect = null;
            musicDetailFragment.mMusicCollectLayout = null;
            musicDetailFragment.mMusicCollectionText = null;
            musicDetailFragment.mMusicRingstoneLayout = null;
            musicDetailFragment.ivMusicRingtone = null;
            musicDetailFragment.mMusicRingtoneText = null;
            musicDetailFragment.mMusicianEntry = null;
            musicDetailFragment.mMusicianEntryI18n = null;
            musicDetailFragment.ivPlay = null;
            musicDetailFragment.ivStop = null;
            musicDetailFragment.recyclerTag = null;
            musicDetailFragment.tagMask = null;
            musicDetailFragment.tagLayout = null;
            musicDetailFragment.txtElse = null;
            musicDetailFragment.ivMusicianMark = null;
            musicDetailFragment.ivOriginalMusicEntryView = null;
            musicDetailFragment.btnEditMusicTitle = null;
            musicDetailFragment.mMusicTitle = null;
            musicDetailFragment.mStatusView = null;
            musicDetailFragment.ivShareBtn = null;
            musicDetailFragment.mVsOriginalMusic = null;
            musicDetailFragment.mVsThirdMusic = null;
            musicDetailFragment.mFlStartRecord = null;
            this.f56533c.setOnClickListener(null);
            this.f56533c = null;
            this.f56534d.setOnClickListener(null);
            this.f56534d = null;
            this.f56535e.setOnClickListener(null);
            this.f56535e = null;
            this.f56536f.setOnClickListener(null);
            this.f56536f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicDetailFragment_ViewBinding(final MusicDetailFragment musicDetailFragment, View view) {
        this.f56532b = musicDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bok, "field 'mMusicName' and method 'click'");
        musicDetailFragment.mMusicName = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.bok, "field 'mMusicName'", ViewGroup.class);
        this.f56533c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56537a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56537a, false, 60321, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56537a, false, 60321, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.mNickName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfe, "field 'mNickName'", TextView.class);
        musicDetailFragment.mPlaceHolder = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dgb, "field 'mPlaceHolder'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.boa, "field 'mMusicCover' and method 'click'");
        musicDetailFragment.mMusicCover = (RemoteImageView) Utils.castView(findRequiredView2, C0906R.id.boa, "field 'mMusicCover'", RemoteImageView.class);
        this.f56534d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56540a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56540a, false, 60322, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56540a, false, 60322, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.mTitleLayout = Utils.findRequiredView(view, C0906R.id.d3v, "field 'mTitleLayout'");
        musicDetailFragment.mHeadLayout = Utils.findRequiredView(view, C0906R.id.an6, "field 'mHeadLayout'");
        musicDetailFragment.mMusicUsedCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dow, "field 'mMusicUsedCount'", TextView.class);
        musicDetailFragment.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ke, "field 'mBgCover'", RemoteImageView.class);
        musicDetailFragment.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.bo_, "field 'ivMusicCollect'", CheckableImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bh_, "field 'mMusicCollectLayout' and method 'click'");
        musicDetailFragment.mMusicCollectLayout = findRequiredView3;
        this.f56535e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56543a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56543a, false, 60323, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56543a, false, 60323, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.mMusicCollectionText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df0, "field 'mMusicCollectionText'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.bhb, "field 'mMusicRingstoneLayout' and method 'click'");
        musicDetailFragment.mMusicRingstoneLayout = findRequiredView4;
        this.f56536f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56546a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56546a, false, 60324, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56546a, false, 60324, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.ivMusicRingtone = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.bop, "field 'ivMusicRingtone'", CheckableImageView.class);
        musicDetailFragment.mMusicRingtoneText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df3, "field 'mMusicRingtoneText'", TextView.class);
        musicDetailFragment.mMusicianEntry = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3j, "field 'mMusicianEntry'", ImageView.class);
        musicDetailFragment.mMusicianEntryI18n = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3k, "field 'mMusicianEntryI18n'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.bon, "field 'ivPlay' and method 'click'");
        musicDetailFragment.ivPlay = (ImageView) Utils.castView(findRequiredView5, C0906R.id.bon, "field 'ivPlay'", ImageView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56549a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56549a, false, 60325, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56549a, false, 60325, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.bot, "field 'ivStop' and method 'click'");
        musicDetailFragment.ivStop = (ImageView) Utils.castView(findRequiredView6, C0906R.id.bot, "field 'ivStop'", ImageView.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56552a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56552a, false, 60326, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56552a, false, 60326, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.recyclerTag = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.czg, "field 'recyclerTag'", RecyclerView.class);
        musicDetailFragment.tagMask = Utils.findRequiredView(view, C0906R.id.cze, "field 'tagMask'");
        musicDetailFragment.tagLayout = Utils.findRequiredView(view, C0906R.id.a47, "field 'tagLayout'");
        musicDetailFragment.txtElse = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a9b, "field 'txtElse'", TextView.class);
        musicDetailFragment.ivMusicianMark = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bvh, "field 'ivMusicianMark'", ImageView.class);
        musicDetailFragment.ivOriginalMusicEntryView = (OriginalMusicEntryView) Utils.findRequiredViewAsType(view, C0906R.id.bvd, "field 'ivOriginalMusicEntryView'", OriginalMusicEntryView.class);
        musicDetailFragment.btnEditMusicTitle = (Button) Utils.findRequiredViewAsType(view, C0906R.id.a8p, "field 'btnEditMusicTitle'", Button.class);
        musicDetailFragment.mMusicTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bov, "field 'mMusicTitle'", TextView.class);
        musicDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.cp9, "field 'ivShareBtn' and method 'click'");
        musicDetailFragment.ivShareBtn = (ImageView) Utils.castView(findRequiredView7, C0906R.id.cp9, "field 'ivShareBtn'", ImageView.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56555a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56555a, false, 60327, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56555a, false, 60327, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        musicDetailFragment.mVsOriginalMusic = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.dvv, "field 'mVsOriginalMusic'", ViewStub.class);
        musicDetailFragment.mVsThirdMusic = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.dw0, "field 'mVsThirdMusic'", ViewStub.class);
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.cup, "field 'mFlStartRecord' and method 'click'");
        musicDetailFragment.mFlStartRecord = (FrameLayout) Utils.castView(findRequiredView8, C0906R.id.cup, "field 'mFlStartRecord'", FrameLayout.class);
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56558a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56558a, false, 60328, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56558a, false, 60328, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, C0906R.id.ix, "method 'click'");
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56561a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56561a, false, 60329, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56561a, false, 60329, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragment.click(view2);
            }
        });
    }
}
