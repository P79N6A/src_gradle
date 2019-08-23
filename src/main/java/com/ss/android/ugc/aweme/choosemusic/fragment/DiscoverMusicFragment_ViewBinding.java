package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DiscoverMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35934a;

    /* renamed from: b  reason: collision with root package name */
    private DiscoverMusicFragment f35935b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35934a, false, 26587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35934a, false, 26587, new Class[0], Void.TYPE);
            return;
        }
        DiscoverMusicFragment discoverMusicFragment = this.f35935b;
        if (discoverMusicFragment != null) {
            this.f35935b = null;
            discoverMusicFragment.mListView = null;
            discoverMusicFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DiscoverMusicFragment_ViewBinding(DiscoverMusicFragment discoverMusicFragment, View view) {
        this.f35935b = discoverMusicFragment;
        discoverMusicFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcn, "field 'mListView'", RecyclerView.class);
        discoverMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
