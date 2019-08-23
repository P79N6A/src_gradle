package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusicListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56574a;

    /* renamed from: b  reason: collision with root package name */
    private MusicListActivity f56575b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56574a, false, 60383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56574a, false, 60383, new Class[0], Void.TYPE);
            return;
        }
        MusicListActivity musicListActivity = this.f56575b;
        if (musicListActivity != null) {
            this.f56575b = null;
            musicListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicListActivity_ViewBinding(MusicListActivity musicListActivity, View view) {
        this.f56575b = musicListActivity;
        musicListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
