package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusicBoardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36077a;

    /* renamed from: b  reason: collision with root package name */
    private MusicBoardViewHolder f36078b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36077a, false, 26891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36077a, false, 26891, new Class[0], Void.TYPE);
            return;
        }
        MusicBoardViewHolder musicBoardViewHolder = this.f36078b;
        if (musicBoardViewHolder != null) {
            this.f36078b = null;
            musicBoardViewHolder.mTvTitleRight = null;
            musicBoardViewHolder.mTvTitleLeft = null;
            musicBoardViewHolder.mVpMusicContainer = null;
            musicBoardViewHolder.mVwLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicBoardViewHolder_ViewBinding(MusicBoardViewHolder musicBoardViewHolder, View view) {
        this.f36078b = musicBoardViewHolder;
        musicBoardViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkt, "field 'mTvTitleRight'", TextView.class);
        musicBoardViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkq, "field 'mTvTitleLeft'", TextView.class);
        musicBoardViewHolder.mVpMusicContainer = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.dvk, "field 'mVpMusicContainer'", ViewPager.class);
        musicBoardViewHolder.mVwLine = Utils.findRequiredView(view, C0906R.id.a5r, "field 'mVwLine'");
    }
}
