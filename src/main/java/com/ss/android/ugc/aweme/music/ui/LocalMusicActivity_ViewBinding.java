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

public class LocalMusicActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56460a;

    /* renamed from: b  reason: collision with root package name */
    private LocalMusicActivity f56461b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56460a, false, 60148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56460a, false, 60148, new Class[0], Void.TYPE);
            return;
        }
        LocalMusicActivity localMusicActivity = this.f56461b;
        if (localMusicActivity != null) {
            this.f56461b = null;
            localMusicActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public LocalMusicActivity_ViewBinding(LocalMusicActivity localMusicActivity, View view) {
        this.f56461b = localMusicActivity;
        localMusicActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
