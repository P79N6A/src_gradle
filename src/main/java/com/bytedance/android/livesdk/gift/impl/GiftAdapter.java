package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.gift.model.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GiftAdapter extends AbsGiftAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f15041f;

    public final void a(List<b> list) {
        List asList;
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f15041f, false, 9771, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15041f, false, 9771, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{list}, this, f15041f, false, 9773, new Class[]{Collection.class}, List.class)) {
            asList = (List) PatchProxy.accessDispatch(new Object[]{list}, this, f15041f, false, 9773, new Class[]{Collection.class}, List.class);
        } else {
            int size = (((list.size() - 1) / 8) + 1) * 8;
            b[] bVarArr = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new d();
            }
            for (b next : list) {
                int i4 = i2 / 8;
                int i5 = i2 % 8;
                if (i5 < 4) {
                    i = (i5 * 2) + (i4 * 8);
                } else {
                    i = ((i5 - 4) * 2) + 1 + (i4 * 8);
                }
                i2++;
                if (i < size) {
                    bVarArr[i] = next;
                }
            }
            asList = Arrays.asList(bVarArr);
        }
        super.a(asList);
    }

    @NonNull
    /* renamed from: a */
    public final BasePanelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15041f, false, 9772, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class)) {
            return (BasePanelViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f15041f, false, 9772, new Class[]{ViewGroup.class, Integer.TYPE}, BasePanelViewHolder.class);
        }
        BasePanelViewHolder a2 = super.onCreateViewHolder(viewGroup, i);
        Point point = new Point();
        ((WindowManager) this.f15033b.getSystemService("window")).getDefaultDisplay().getSize(point);
        a2.itemView.setLayoutParams(new ViewGroup.LayoutParams(point.x / 4, (int) UIUtils.dip2Px(this.f15033b, 104.0f)));
        return a2;
    }

    public GiftAdapter(Context context, Room room, AbsGiftAdapter.a aVar) {
        super(context, room, aVar);
    }
}
