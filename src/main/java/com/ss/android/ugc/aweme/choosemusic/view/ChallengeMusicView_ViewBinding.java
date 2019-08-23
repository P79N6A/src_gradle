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

public class ChallengeMusicView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36019a;

    /* renamed from: b  reason: collision with root package name */
    private ChallengeMusicView f36020b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36019a, false, 26828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36019a, false, 26828, new Class[0], Void.TYPE);
            return;
        }
        ChallengeMusicView challengeMusicView = this.f36020b;
        if (challengeMusicView != null) {
            this.f36020b = null;
            challengeMusicView.mVgContainer = null;
            challengeMusicView.mTvwContent = null;
            challengeMusicView.mLlMusicContainer = null;
            challengeMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChallengeMusicView_ViewBinding(ChallengeMusicView challengeMusicView, View view) {
        this.f36020b = challengeMusicView;
        challengeMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bft, "field 'mVgContainer'", LinearLayout.class);
        challengeMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dlt, "field 'mTvwContent'", TextView.class);
        challengeMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bfu, "field 'mLlMusicContainer'", LinearLayout.class);
        challengeMusicView.mVwDivider = Utils.findRequiredView(view, C0906R.id.dw3, "field 'mVwDivider'");
    }
}
