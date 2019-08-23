package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class MusicDetailFragmentOld_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56498a;

    /* renamed from: b  reason: collision with root package name */
    private MusicDetailFragmentOld f56499b;

    /* renamed from: c  reason: collision with root package name */
    private View f56500c;

    /* renamed from: d  reason: collision with root package name */
    private View f56501d;

    /* renamed from: e  reason: collision with root package name */
    private View f56502e;

    /* renamed from: f  reason: collision with root package name */
    private View f56503f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56498a, false, 60310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56498a, false, 60310, new Class[0], Void.TYPE);
            return;
        }
        MusicDetailFragmentOld musicDetailFragmentOld = this.f56499b;
        if (musicDetailFragmentOld != null) {
            this.f56499b = null;
            musicDetailFragmentOld.mMusicName = null;
            musicDetailFragmentOld.mNickName = null;
            musicDetailFragmentOld.mPlaceHolder = null;
            musicDetailFragmentOld.mMusicCover = null;
            musicDetailFragmentOld.mTitleLayout = null;
            musicDetailFragmentOld.mHeadLayout = null;
            musicDetailFragmentOld.mMusicUsedCount = null;
            musicDetailFragmentOld.mBgCover = null;
            musicDetailFragmentOld.ivMusicCollect = null;
            musicDetailFragmentOld.ivPlay = null;
            musicDetailFragmentOld.ivStop = null;
            musicDetailFragmentOld.recyclerTag = null;
            musicDetailFragmentOld.tagMask = null;
            musicDetailFragmentOld.tagLayout = null;
            musicDetailFragmentOld.txtElse = null;
            musicDetailFragmentOld.ivMusicianMark = null;
            musicDetailFragmentOld.ivOriginalMusicEntryView = null;
            musicDetailFragmentOld.btnEditMusicTitle = null;
            musicDetailFragmentOld.mMusicTitle = null;
            musicDetailFragmentOld.txtOriginMusicName = null;
            musicDetailFragmentOld.mStatusView = null;
            this.f56500c.setOnClickListener(null);
            this.f56500c = null;
            this.f56501d.setOnClickListener(null);
            this.f56501d = null;
            this.f56502e.setOnClickListener(null);
            this.f56502e = null;
            this.f56503f.setOnClickListener(null);
            this.f56503f = null;
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
    public MusicDetailFragmentOld_ViewBinding(final MusicDetailFragmentOld musicDetailFragmentOld, View view) {
        this.f56499b = musicDetailFragmentOld;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bok, "field 'mMusicName' and method 'click'");
        musicDetailFragmentOld.mMusicName = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.bok, "field 'mMusicName'", ViewGroup.class);
        this.f56500c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56504a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56504a, false, 60311, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56504a, false, 60311, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        musicDetailFragmentOld.mNickName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfe, "field 'mNickName'", TextView.class);
        musicDetailFragmentOld.mPlaceHolder = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dgb, "field 'mPlaceHolder'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.boa, "field 'mMusicCover' and method 'click'");
        musicDetailFragmentOld.mMusicCover = (RemoteImageView) Utils.castView(findRequiredView2, C0906R.id.boa, "field 'mMusicCover'", RemoteImageView.class);
        this.f56501d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56507a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56507a, false, 60312, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56507a, false, 60312, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        musicDetailFragmentOld.mTitleLayout = Utils.findRequiredView(view, C0906R.id.d3v, "field 'mTitleLayout'");
        musicDetailFragmentOld.mHeadLayout = Utils.findRequiredView(view, C0906R.id.an6, "field 'mHeadLayout'");
        musicDetailFragmentOld.mMusicUsedCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dow, "field 'mMusicUsedCount'", TextView.class);
        musicDetailFragmentOld.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ke, "field 'mBgCover'", RemoteImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.bo_, "field 'ivMusicCollect' and method 'click'");
        musicDetailFragmentOld.ivMusicCollect = (CheckableImageView) Utils.castView(findRequiredView3, C0906R.id.bo_, "field 'ivMusicCollect'", CheckableImageView.class);
        this.f56502e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56510a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56510a, false, 60313, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56510a, false, 60313, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.bon, "field 'ivPlay' and method 'click'");
        musicDetailFragmentOld.ivPlay = (ImageView) Utils.castView(findRequiredView4, C0906R.id.bon, "field 'ivPlay'", ImageView.class);
        this.f56503f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56513a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56513a, false, 60314, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56513a, false, 60314, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.bot, "field 'ivStop' and method 'click'");
        musicDetailFragmentOld.ivStop = (ImageView) Utils.castView(findRequiredView5, C0906R.id.bot, "field 'ivStop'", ImageView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56516a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56516a, false, 60315, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56516a, false, 60315, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        musicDetailFragmentOld.recyclerTag = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.czg, "field 'recyclerTag'", RecyclerView.class);
        musicDetailFragmentOld.tagMask = Utils.findRequiredView(view, C0906R.id.cze, "field 'tagMask'");
        musicDetailFragmentOld.tagLayout = Utils.findRequiredView(view, C0906R.id.a47, "field 'tagLayout'");
        musicDetailFragmentOld.txtElse = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a9b, "field 'txtElse'", TextView.class);
        musicDetailFragmentOld.ivMusicianMark = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bvh, "field 'ivMusicianMark'", ImageView.class);
        musicDetailFragmentOld.ivOriginalMusicEntryView = (OriginalMusicEntryView) Utils.findRequiredViewAsType(view, C0906R.id.bvd, "field 'ivOriginalMusicEntryView'", OriginalMusicEntryView.class);
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.a8p, "field 'btnEditMusicTitle' and method 'click'");
        musicDetailFragmentOld.btnEditMusicTitle = (Button) Utils.castView(findRequiredView6, C0906R.id.a8p, "field 'btnEditMusicTitle'", Button.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56519a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56519a, false, 60316, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56519a, false, 60316, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        musicDetailFragmentOld.mMusicTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bov, "field 'mMusicTitle'", TextView.class);
        musicDetailFragmentOld.txtOriginMusicName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bvf, "field 'txtOriginMusicName'", TextView.class);
        musicDetailFragmentOld.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.ix, "method 'click'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56522a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56522a, false, 60317, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56522a, false, 60317, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.cup, "method 'click'");
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56525a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56525a, false, 60318, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56525a, false, 60318, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, C0906R.id.cp9, "method 'click'");
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56528a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56528a, false, 60319, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56528a, false, 60319, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDetailFragmentOld.click(view2);
            }
        });
    }
}
