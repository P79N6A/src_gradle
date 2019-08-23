package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.widget.ViewFlipper;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;

public class LiveRankViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14250a;

    /* renamed from: d  reason: collision with root package name */
    ViewFlipper f14251d;

    public LiveRankViewHolder(View view) {
        super(view);
        this.f14251d = (ViewFlipper) view.findViewById(C0906R.id.anr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.bytedance.android.livesdk.feed.banner.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r12, int r13) {
        /*
            r11 = this;
            r7 = r12
            com.bytedance.android.live.base.model.feed.FeedItem r7 = (com.bytedance.android.live.base.model.feed.FeedItem) r7
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f14250a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r1 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 8757(0x2235, float:1.2271E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0048
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f14250a
            r3 = 0
            r4 = 8757(0x2235, float:1.2271E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r1 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0048:
            com.bytedance.android.live.base.model.d r0 = r7.item
            com.bytedance.android.livesdk.feed.d.h r0 = (com.bytedance.android.livesdk.feed.d.h) r0
            com.bytedance.android.live.base.model.b.c r0 = r0.f14086b
            if (r0 == 0) goto L_0x00e4
            java.util.List<com.bytedance.android.live.base.model.live.c> r1 = r0.f7706b
            boolean r1 = com.bytedance.common.utility.Lists.isEmpty(r1)
            if (r1 == 0) goto L_0x005a
            goto L_0x00e4
        L_0x005a:
            r1 = 0
        L_0x005b:
            java.util.List<com.bytedance.android.live.base.model.live.c> r2 = r0.f7706b
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x00aa
            android.widget.ViewFlipper r2 = r11.f14251d
            int r2 = r2.getChildCount()
            r3 = 2131170578(0x7f071512, float:1.7955518E38)
            if (r1 < r2) goto L_0x008f
            android.view.View r2 = r11.itemView
            android.content.Context r2 = r2.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r4 = 2131691223(0x7f0f06d7, float:1.9011512E38)
            android.widget.ViewFlipper r5 = r11.f14251d
            android.view.View r2 = r2.inflate(r4, r5, r9)
            android.widget.ViewFlipper r4 = r11.f14251d
            r4.addView(r2)
            com.bytedance.android.livesdk.feed.banner.a r4 = new com.bytedance.android.livesdk.feed.banner.a
            r4.<init>(r2)
            r2.setTag(r3, r4)
            goto L_0x009c
        L_0x008f:
            android.widget.ViewFlipper r2 = r11.f14251d
            android.view.View r2 = r2.getChildAt(r1)
            java.lang.Object r2 = r2.getTag(r3)
            r4 = r2
            com.bytedance.android.livesdk.feed.banner.a r4 = (com.bytedance.android.livesdk.feed.banner.a) r4
        L_0x009c:
            java.util.List<com.bytedance.android.live.base.model.live.c> r2 = r0.f7706b
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.android.live.base.model.live.c r2 = (com.bytedance.android.live.base.model.live.c) r2
            r4.a(r2)
            int r1 = r1 + 1
            goto L_0x005b
        L_0x00aa:
            android.widget.ViewFlipper r2 = r11.f14251d
            int r2 = r2.getChildCount()
            int r2 = r2 - r10
        L_0x00b1:
            if (r2 < r1) goto L_0x00bb
            android.widget.ViewFlipper r3 = r11.f14251d
            r3.removeViewAt(r2)
            int r2 = r2 + -1
            goto L_0x00b1
        L_0x00bb:
            android.widget.ViewFlipper r1 = r11.f14251d
            r1.setVisibility(r9)
            android.widget.ViewFlipper r1 = r11.f14251d
            int r1 = r1.getChildCount()
            if (r1 > r10) goto L_0x00ce
            android.widget.ViewFlipper r0 = r11.f14251d
            r0.stopFlipping()
            return
        L_0x00ce:
            android.widget.ViewFlipper r1 = r11.f14251d
            int r2 = r0.f7705a
            if (r2 > 0) goto L_0x00d7
            r0 = 5000(0x1388, float:7.006E-42)
            goto L_0x00db
        L_0x00d7:
            int r0 = r0.f7705a
            int r0 = r0 * 1000
        L_0x00db:
            r1.setFlipInterval(r0)
            android.widget.ViewFlipper r0 = r11.f14251d
            r0.startFlipping()
            return
        L_0x00e4:
            android.widget.ViewFlipper r0 = r11.f14251d
            r0.stopFlipping()
            android.widget.ViewFlipper r0 = r11.f14251d
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.live.LiveRankViewHolder.a(java.lang.Object, int):void");
    }
}
