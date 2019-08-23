package com.ss.android.ugc.aweme.music;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.ui.OriginalMusicEntryView;

public class MusicDetailHeaderView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56135a;

    /* renamed from: b  reason: collision with root package name */
    private MusicDetailHeaderView f56136b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56135a, false, 59796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56135a, false, 59796, new Class[0], Void.TYPE);
            return;
        }
        MusicDetailHeaderView musicDetailHeaderView = this.f56136b;
        if (musicDetailHeaderView != null) {
            this.f56136b = null;
            musicDetailHeaderView.mMusicName = null;
            musicDetailHeaderView.mNickName = null;
            musicDetailHeaderView.mPlaceHolder = null;
            musicDetailHeaderView.mMusicCover = null;
            musicDetailHeaderView.mTitleLayout = null;
            musicDetailHeaderView.mHeadLayout = null;
            musicDetailHeaderView.mMusicUsedCount = null;
            musicDetailHeaderView.mBgCover = null;
            musicDetailHeaderView.ivMusicCollect = null;
            musicDetailHeaderView.mMusicCollectLayout = null;
            musicDetailHeaderView.mMusicCollectionText = null;
            musicDetailHeaderView.mMusicianEntry = null;
            musicDetailHeaderView.ivPlay = null;
            musicDetailHeaderView.ivStop = null;
            musicDetailHeaderView.recyclerTag = null;
            musicDetailHeaderView.tagMask = null;
            musicDetailHeaderView.tagLayout = null;
            musicDetailHeaderView.txtElse = null;
            musicDetailHeaderView.ivMusicianMark = null;
            musicDetailHeaderView.ivOriginalMusicEntryView = null;
            musicDetailHeaderView.btnEditMusicTitle = null;
            musicDetailHeaderView.mMusicTitle = null;
            musicDetailHeaderView.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicDetailHeaderView_ViewBinding(MusicDetailHeaderView musicDetailHeaderView, View view) {
        this.f56136b = musicDetailHeaderView;
        musicDetailHeaderView.mMusicName = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.bok, "field 'mMusicName'", ViewGroup.class);
        musicDetailHeaderView.mNickName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfe, "field 'mNickName'", TextView.class);
        musicDetailHeaderView.mPlaceHolder = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dgb, "field 'mPlaceHolder'", TextView.class);
        musicDetailHeaderView.mMusicCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.boa, "field 'mMusicCover'", RemoteImageView.class);
        musicDetailHeaderView.mTitleLayout = Utils.findRequiredView(view, C0906R.id.d3v, "field 'mTitleLayout'");
        musicDetailHeaderView.mHeadLayout = Utils.findRequiredView(view, C0906R.id.an6, "field 'mHeadLayout'");
        musicDetailHeaderView.mMusicUsedCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dow, "field 'mMusicUsedCount'", TextView.class);
        musicDetailHeaderView.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ke, "field 'mBgCover'", RemoteImageView.class);
        musicDetailHeaderView.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.bo_, "field 'ivMusicCollect'", CheckableImageView.class);
        musicDetailHeaderView.mMusicCollectLayout = Utils.findRequiredView(view, C0906R.id.bh_, "field 'mMusicCollectLayout'");
        musicDetailHeaderView.mMusicCollectionText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df0, "field 'mMusicCollectionText'", TextView.class);
        musicDetailHeaderView.mMusicianEntry = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3j, "field 'mMusicianEntry'", ImageView.class);
        musicDetailHeaderView.ivPlay = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bon, "field 'ivPlay'", ImageView.class);
        musicDetailHeaderView.ivStop = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bot, "field 'ivStop'", ImageView.class);
        musicDetailHeaderView.recyclerTag = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.czg, "field 'recyclerTag'", RecyclerView.class);
        musicDetailHeaderView.tagMask = Utils.findRequiredView(view, C0906R.id.cze, "field 'tagMask'");
        musicDetailHeaderView.tagLayout = Utils.findRequiredView(view, C0906R.id.a47, "field 'tagLayout'");
        musicDetailHeaderView.txtElse = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a9b, "field 'txtElse'", TextView.class);
        musicDetailHeaderView.ivMusicianMark = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bvh, "field 'ivMusicianMark'", ImageView.class);
        musicDetailHeaderView.ivOriginalMusicEntryView = (OriginalMusicEntryView) Utils.findRequiredViewAsType(view, C0906R.id.bvd, "field 'ivOriginalMusicEntryView'", OriginalMusicEntryView.class);
        musicDetailHeaderView.btnEditMusicTitle = (Button) Utils.findRequiredViewAsType(view, C0906R.id.a8p, "field 'btnEditMusicTitle'", Button.class);
        musicDetailHeaderView.mMusicTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bov, "field 'mMusicTitle'", TextView.class);
        musicDetailHeaderView.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
