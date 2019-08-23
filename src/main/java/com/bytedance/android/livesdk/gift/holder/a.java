package com.bytedance.android.livesdk.gift.holder;

import android.view.View;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15027a;

    /* renamed from: b  reason: collision with root package name */
    private final BasePanelViewHolder f15028b;

    /* renamed from: c  reason: collision with root package name */
    private final b f15029c;

    a(BasePanelViewHolder basePanelViewHolder, b bVar) {
        this.f15028b = basePanelViewHolder;
        this.f15029c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15027a, false, 9726, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15027a, false, 9726, new Class[]{View.class}, Void.TYPE);
            return;
        }
        BasePanelViewHolder basePanelViewHolder = this.f15028b;
        b bVar = this.f15029c;
        if (basePanelViewHolder.n != null) {
            basePanelViewHolder.n.a(basePanelViewHolder, bVar);
        }
    }
}
