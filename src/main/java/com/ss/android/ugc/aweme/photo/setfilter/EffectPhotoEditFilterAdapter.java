package com.ss.android.ugc.aweme.photo.setfilter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.EffectFilterAdapter;
import com.ss.android.ugc.aweme.filter.as;
import java.util.List;

public class EffectPhotoEditFilterAdapter extends EffectFilterAdapter {
    public static ChangeQuickRedirect h;

    public EffectPhotoEditFilterAdapter(@Nullable as asVar) {
        super(asVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        if (((com.ss.android.ugc.aweme.filter.h) getData().get(r12)).f47598b == r10.f47312b) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.support.v7.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = h
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63797(0xf935, float:8.9399E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 63797(0xf935, float:8.9399E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            int r0 = r10.getBasicItemViewType(r12)
            if (r0 != r9) goto L_0x0076
            r0 = r11
            com.ss.android.ugc.aweme.filter.EffectFilterAdapter$FilterViewHolder r0 = (com.ss.android.ugc.aweme.filter.EffectFilterAdapter.FilterViewHolder) r0
            android.view.View r0 = r0.itemView
            r1 = 2131166652(0x7f0705bc, float:1.7947555E38)
            if (r12 != 0) goto L_0x005c
            android.view.View r0 = r0.findViewById(r1)
            goto L_0x0071
        L_0x005c:
            android.view.View r0 = r0.findViewById(r1)
            java.util.List r1 = r10.getData()
            java.lang.Object r1 = r1.get(r12)
            com.ss.android.ugc.aweme.filter.h r1 = (com.ss.android.ugc.aweme.filter.h) r1
            int r1 = r1.f47598b
            int r2 = r10.f47312b
            if (r1 != r2) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r8 = 8
        L_0x0073:
            r0.setVisibility(r8)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoEditFilterAdapter.a(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public void onBindBasicViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, h, false, 63795, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, h, false, 63795, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onBindBasicViewHolder(viewHolder, i);
        a(viewHolder, i);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), list}, this, h, false, 63796, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), list}, this, h, false, 63796, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
        } else {
            a(viewHolder, i);
        }
    }
}
