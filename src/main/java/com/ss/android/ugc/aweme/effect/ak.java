package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.VEStickerEffectAdapter;
import com.ss.android.ugc.aweme.shortvideo.bm;

public final /* synthetic */ class ak implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43701a;

    /* renamed from: b  reason: collision with root package name */
    private final VEStickerEffectAdapter.ViewHolder f43702b;

    ak(VEStickerEffectAdapter.ViewHolder viewHolder) {
        this.f43702b = viewHolder;
    }

    public final void onClick(View view) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f43701a, false, 38806, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43701a, false, 38806, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VEStickerEffectAdapter.ViewHolder viewHolder = this.f43702b;
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition != -1) {
            if (VEStickerEffectAdapter.this.f43627c == adapterPosition) {
                VEStickerEffectAdapter.this.f43627c = -1;
                i = 2;
            } else if (bm.a(VEStickerEffectAdapter.this.f43711e.get(adapterPosition).resDir)) {
                VEStickerEffectAdapter.this.f43627c = adapterPosition;
            } else {
                VEStickerEffectAdapter.this.f43627c = -1;
            }
            if (VEStickerEffectAdapter.this.f43626b != null) {
                VEStickerEffectAdapter.this.f43626b.a(VEStickerEffectAdapter.this.f43711e.get(viewHolder.getAdapterPosition()), i, adapterPosition);
            }
            VEStickerEffectAdapter.this.notifyDataSetChanged();
        }
    }
}
