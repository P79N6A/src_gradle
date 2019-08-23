package com.ss.android.ugc.aweme.music.ui;

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

public class MusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56576a;

    /* renamed from: b  reason: collision with root package name */
    private MusicListFragment f56577b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56576a, false, 60416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56576a, false, 60416, new Class[0], Void.TYPE);
            return;
        }
        MusicListFragment musicListFragment = this.f56577b;
        if (musicListFragment != null) {
            this.f56577b = null;
            musicListFragment.mListView = null;
            musicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicListFragment_ViewBinding(MusicListFragment musicListFragment, View view) {
        this.f56577b = musicListFragment;
        musicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcn, "field 'mListView'", RecyclerView.class);
        musicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
