package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class MusicViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41695a;

    /* renamed from: b  reason: collision with root package name */
    private MusicViewHolder f41696b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41695a, false, 35700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41695a, false, 35700, new Class[0], Void.TYPE);
            return;
        }
        MusicViewHolder musicViewHolder = this.f41696b;
        if (musicViewHolder != null) {
            this.f41696b = null;
            musicViewHolder.coverView = null;
            musicViewHolder.titleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicViewHolder_ViewBinding(MusicViewHolder musicViewHolder, View view) {
        this.f41696b = musicViewHolder;
        musicViewHolder.coverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'coverView'", RemoteImageView.class);
        musicViewHolder.titleView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'titleView'", DmtTextView.class);
    }
}
