package com.bytedance.android.livesdk.gift.holder;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.a.i;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RedPacketPanelViewHolder extends BaseGiftPanelViewHolder<i> {
    public static ChangeQuickRedirect p;
    private final View q;

    public final ComboTarget a() {
        return null;
    }

    public RedPacketPanelViewHolder(View view) {
        super(view);
        this.q = view.findViewById(C0906R.id.dc_);
    }

    /* access modifiers changed from: private */
    public void a(@NonNull i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, p, false, 9741, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, p, false, 9741, new Class[]{i.class}, Void.TYPE);
            return;
        }
        super.a(iVar);
        this.h.setText(iVar.k());
        this.q.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        if (this.h.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.bottomMargin = (int) ak.a(this.g, 5.0f);
            this.h.setLayoutParams(layoutParams);
        }
    }
}
