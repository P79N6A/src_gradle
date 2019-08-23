package com.bytedance.android.livesdk;

import android.support.v4.app.DialogFragment;
import android.view.View;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9669a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightFragment f9670b;

    c(FansClubAutoLightFragment fansClubAutoLightFragment) {
        this.f9670b = fansClubAutoLightFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9669a, false, 2506, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9669a, false, 2506, new Class[]{View.class}, Void.TYPE);
            return;
        }
        FansClubAutoLightFragment fansClubAutoLightFragment = this.f9670b;
        if (fansClubAutoLightFragment.j == null) {
            fansClubAutoLightFragment.j = j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a("https://hotsoon.snssdk.com/falcon/live_inroom/page/fans_intro/index.html?show_rule=true").a((int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).b(360).d(12).e(17));
        }
        BaseDialogFragment.a(fansClubAutoLightFragment.getActivity(), (DialogFragment) fansClubAutoLightFragment.j);
    }
}
