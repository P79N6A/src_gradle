package com.bytedance.android.livesdk.gift.holder;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.gift.a;
import com.bytedance.android.livesdk.gift.model.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftPanelViewHolder extends BaseGiftPanelViewHolder<f> {
    public static ChangeQuickRedirect p;
    private final View q;

    public GiftPanelViewHolder(View view) {
        super(view);
        this.q = view.findViewById(C0906R.id.dc_);
    }

    /* access modifiers changed from: private */
    public void a(@NonNull f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, p, false, 9731, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, p, false, 9731, new Class[]{f.class}, Void.TYPE);
            return;
        }
        super.a(fVar);
        this.q.setVisibility(8);
        if (fVar.c()) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, p, false, 9732, new Class[]{f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, p, false, 9732, new Class[]{f.class}, Void.TYPE);
            } else if (TextUtils.isEmpty(a.a(fVar.q().f15105d))) {
                a.b(fVar.q().f15105d);
            }
        }
    }
}
