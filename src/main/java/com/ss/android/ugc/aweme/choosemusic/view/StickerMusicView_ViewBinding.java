package com.ss.android.ugc.aweme.choosemusic.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class StickerMusicView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36043a;

    /* renamed from: b  reason: collision with root package name */
    private StickerMusicView f36044b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36043a, false, 26867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36043a, false, 26867, new Class[0], Void.TYPE);
            return;
        }
        StickerMusicView stickerMusicView = this.f36044b;
        if (stickerMusicView != null) {
            this.f36044b = null;
            stickerMusicView.mVgContainer = null;
            stickerMusicView.mLlMusicContainer = null;
            stickerMusicView.mTvwContent = null;
            stickerMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public StickerMusicView_ViewBinding(StickerMusicView stickerMusicView, View view) {
        this.f36044b = stickerMusicView;
        stickerMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bft, "field 'mVgContainer'", LinearLayout.class);
        stickerMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bfu, "field 'mLlMusicContainer'", LinearLayout.class);
        stickerMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dlt, "field 'mTvwContent'", TextView.class);
        stickerMusicView.mVwDivider = Utils.findRequiredView(view, C0906R.id.dw3, "field 'mVwDivider'");
    }
}
