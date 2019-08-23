package com.bytedance.android.livesdk.gift.relay;

import android.support.v7.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.relay.GiftRelayAdapter;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements GiftRelayAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15427a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15428b;

    a(GiftRelayDialogFragment giftRelayDialogFragment) {
        this.f15428b = giftRelayDialogFragment;
    }

    public final void a(c.a aVar) {
        int i;
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f15427a, false, 10113, new Class[]{c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f15427a, false, 10113, new Class[]{c.a.class}, Void.TYPE);
            return;
        }
        GiftRelayDialogFragment giftRelayDialogFragment = this.f15428b;
        c.a aVar3 = giftRelayDialogFragment.j.f15409c;
        if (aVar3 != null) {
            GiftRelayAdapter giftRelayAdapter = giftRelayDialogFragment.j;
            if (!PatchProxy.isSupport(new Object[]{aVar3}, giftRelayAdapter, GiftRelayAdapter.f15407a, false, 10087, new Class[]{c.a.class}, Integer.TYPE)) {
                i = 0;
                while (true) {
                    if (i >= giftRelayAdapter.f15408b.size()) {
                        i = -1;
                        break;
                    } else if (aVar3 == giftRelayAdapter.f15408b.get(i)) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{aVar3}, giftRelayAdapter, GiftRelayAdapter.f15407a, false, 10087, new Class[]{c.a.class}, Integer.TYPE)).intValue();
            }
            if (i >= 0) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = giftRelayDialogFragment.i.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition instanceof GiftRelayViewHolder) {
                    ((GiftRelayViewHolder) findViewHolderForAdapterPosition).a(false);
                }
            }
        }
        giftRelayDialogFragment.k.setBackgroundResource(aVar2 == aVar3 ? 2130841067 : 2130840992);
        if (giftRelayDialogFragment.o.hasMessages(0)) {
            giftRelayDialogFragment.o.removeMessages(0);
            giftRelayDialogFragment.o.sendEmptyMessage(0);
        }
    }
}
