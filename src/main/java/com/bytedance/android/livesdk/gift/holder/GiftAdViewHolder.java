package com.bytedance.android.livesdk.gift.holder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.gift.model.a.e;
import com.bytedance.android.livesdk.gift.model.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftAdViewHolder extends BasePanelViewHolder<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15023a;

    /* renamed from: b  reason: collision with root package name */
    TextView f15024b;

    public final ComboTarget a() {
        return null;
    }

    public GiftAdViewHolder(View view) {
        super(view);
        this.f15024b = (TextView) view.findViewById(C0906R.id.dc_);
    }

    public final /* synthetic */ void a(@NonNull b bVar) {
        e eVar = (e) bVar;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f15023a, false, 9730, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f15023a, false, 9730, new Class[]{e.class}, Void.TYPE);
            return;
        }
        super.a(eVar);
        if (eVar == null || eVar.f15098d == null || ((c) eVar.f15098d).f15109b <= 0) {
            this.f15024b.setVisibility(0);
        } else {
            this.f15024b.setVisibility(0);
            this.f15024b.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(((c) eVar.f15098d).f15109b)));
        }
        if (eVar != null) {
            this.k.setText(eVar.k());
        }
        this.k.setTextColor(ac.b((int) C0906R.color.aac));
        this.l.setVisibility(8);
    }
}
