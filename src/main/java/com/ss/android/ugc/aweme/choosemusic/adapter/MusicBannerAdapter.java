package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.adapter.BannerAdapter;

public class MusicBannerAdapter extends BannerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35773a;

    /* renamed from: d  reason: collision with root package name */
    private int f35774d;

    public MusicBannerAdapter(Context context, LayoutInflater layoutInflater, int i) {
        super(context, layoutInflater);
        this.f35774d = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r16
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f35773a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 26485(0x6775, float:3.7113E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0059
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r16
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f35773a
            r3 = 0
            r4 = 26485(0x6775, float:3.7113E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0059:
            if (r16 != 0) goto L_0x0075
            android.content.Context r0 = r17.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690386(0x7f0f0392, float:1.9009814E38)
            android.view.View r0 = r0.inflate(r1, r9, r11)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder r1 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder
            int r2 = r7.f35774d
            r1.<init>(r0, r2)
            r0.setTag(r1)
            goto L_0x007e
        L_0x0075:
            java.lang.Object r0 = r16.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder r1 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder) r1
            r0 = r16
        L_0x007e:
            int r2 = r14.getCount()
            if (r2 <= 0) goto L_0x008f
            java.util.List r2 = r7.f41530c
            java.lang.Object r2 = r2.get(r15)
            com.ss.android.ugc.aweme.discover.model.Banner r2 = (com.ss.android.ugc.aweme.discover.model.Banner) r2
            r1.a(r2, r15)
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.adapter.MusicBannerAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
