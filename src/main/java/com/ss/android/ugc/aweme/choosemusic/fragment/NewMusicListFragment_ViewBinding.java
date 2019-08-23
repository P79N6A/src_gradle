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

public class NewMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35946a;

    /* renamed from: b  reason: collision with root package name */
    private NewMusicListFragment f35947b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35946a, false, 26665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35946a, false, 26665, new Class[0], Void.TYPE);
            return;
        }
        NewMusicListFragment newMusicListFragment = this.f35947b;
        if (newMusicListFragment != null) {
            this.f35947b = null;
            newMusicListFragment.mListView = null;
            newMusicListFragment.mStatusView = null;
            newMusicListFragment.mBackgroundView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public NewMusicListFragment_ViewBinding(NewMusicListFragment newMusicListFragment, View view) {
        this.f35947b = newMusicListFragment;
        newMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcn, "field 'mListView'", RecyclerView.class);
        newMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        newMusicListFragment.mBackgroundView = Utils.findRequiredView(view, C0906R.id.bgz, "field 'mBackgroundView'");
    }
}
