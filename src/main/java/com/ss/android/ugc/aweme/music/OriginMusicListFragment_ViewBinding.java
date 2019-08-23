package com.ss.android.ugc.aweme.music;

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

public class OriginMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56139a;

    /* renamed from: b  reason: collision with root package name */
    private OriginMusicListFragment f56140b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56139a, false, 59850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56139a, false, 59850, new Class[0], Void.TYPE);
            return;
        }
        OriginMusicListFragment originMusicListFragment = this.f56140b;
        if (originMusicListFragment != null) {
            this.f56140b = null;
            originMusicListFragment.mListView = null;
            originMusicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public OriginMusicListFragment_ViewBinding(OriginMusicListFragment originMusicListFragment, View view) {
        this.f56140b = originMusicListFragment;
        originMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ciy, "field 'mListView'", RecyclerView.class);
        originMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
