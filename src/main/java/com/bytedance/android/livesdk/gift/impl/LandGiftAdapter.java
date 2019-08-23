package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LandGiftAdapter extends AbsGiftAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f15045f;

    /* renamed from: a */
    public final BasePanelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15045f, false, 9790, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class)) {
            return (BasePanelViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15045f, false, 9790, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class);
        }
        BasePanelViewHolder a2 = super.onCreateViewHolder(viewGroup, i);
        a2.itemView.setLayoutParams(new ViewGroup.LayoutParams((int) UIUtils.dip2Px(this.f15033b, 93.0f), (int) UIUtils.dip2Px(this.f15033b, 104.0f)));
        return a2;
    }

    public LandGiftAdapter(Context context, Room room, AbsGiftAdapter.a aVar) {
        super(context, room, aVar);
    }
}
