package com.bytedance.android.livesdk.fansclub;

import android.support.annotation.Nullable;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FansClubAnimationWidget extends LiveRecyclableWidget implements c<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13842a;

    public final /* bridge */ /* synthetic */ void a(@Nullable Object obj) {
    }

    public int getLayoutId() {
        return C0906R.layout.ake;
    }

    public void onInit(@Nullable Object[] objArr) {
    }

    public void onUnload() {
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13842a, false, 8285, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13842a, false, 8285, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.dataCenter.lambda$put$1$DataCenter("data_fans_club_anim_view", this.containerView.findViewById(C0906R.id.b6y));
    }
}
