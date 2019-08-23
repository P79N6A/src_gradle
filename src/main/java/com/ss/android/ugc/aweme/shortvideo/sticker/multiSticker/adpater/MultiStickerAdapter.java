package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.c;
import java.util.ArrayList;
import java.util.List;

public class MultiStickerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70156a;

    /* renamed from: b  reason: collision with root package name */
    public List<ah> f70157b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f70158c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70159d;

    /* renamed from: e  reason: collision with root package name */
    private c f70160e;

    /* renamed from: f  reason: collision with root package name */
    private EffectStickerManager f70161f;

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f70156a, false, 79810, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70156a, false, 79810, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f70157b == null) {
            return 0;
        } else {
            return this.f70157b.size();
        }
    }

    public MultiStickerAdapter(c cVar, EffectStickerManager effectStickerManager) {
        this.f70160e = cVar;
        this.f70161f = effectStickerManager;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f70156a, false, 79807, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new MultiStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xn, viewGroup2, false), this.f70161f);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f70156a, false, 79807, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.ah} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            r20 = this;
            r7 = r20
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79808(0x137c0, float:1.11835E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            r3 = 0
            r4 = 79808(0x137c0, float:1.11835E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            r8 = r21
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder r8 = (com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder) r8
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            r3 = 0
            r4 = 79809(0x137c1, float:1.11836E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            r3 = 0
            r4 = 79809(0x137c1, float:1.11836E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0
        L_0x008d:
            r15 = r0
            goto L_0x00a3
        L_0x008f:
            if (r9 < 0) goto L_0x00a1
            int r0 = r20.getItemCount()
            if (r9 < r0) goto L_0x0098
            goto L_0x00a1
        L_0x0098:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r0 = r7.f70157b
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0
            goto L_0x008d
        L_0x00a1:
            r0 = 0
            goto L_0x008d
        L_0x00a3:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            r3 = 0
            r4 = 79812(0x137c4, float:1.1184E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70156a
            r3 = 0
            r4 = 79812(0x137c4, float:1.1184E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0125
        L_0x00e4:
            int r0 = r7.f70158c
            if (r0 < 0) goto L_0x00fa
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r0 = r7.f70157b
            int r1 = r7.f70158c
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0)
            if (r0 == 0) goto L_0x00fa
            r0 = 1
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            if (r0 == 0) goto L_0x0116
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r0 = r7.f70157b
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0)
            r0 = r0 ^ r12
            boolean r1 = r7.f70159d
            if (r1 != 0) goto L_0x0114
            if (r0 == 0) goto L_0x0114
            r7.f70159d = r12
            r0 = 1
            goto L_0x0125
        L_0x0114:
            r0 = 0
            goto L_0x0125
        L_0x0116:
            int r0 = r7.f70158c
            if (r0 != r9) goto L_0x011c
            r0 = 1
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            boolean r1 = r7.f70159d
            if (r1 != 0) goto L_0x0125
            if (r0 == 0) goto L_0x0125
            r7.f70159d = r12
        L_0x0125:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r1 = r7.f70157b
            r2 = 3
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r15
            java.lang.Byte r3 = java.lang.Byte.valueOf(r0)
            r13[r12] = r3
            r13[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder.f70162a
            r16 = 0
            r17 = 79814(0x137c6, float:1.11843E-40)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r5 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r4[r11] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r12] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r8
            r5 = r15
            r15 = r3
            r18 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0182
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r11] = r5
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r3[r12] = r0
            r3[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder.f70162a
            r1 = 0
            r4 = 79814(0x137c6, float:1.11843E-40)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r13[r11] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r12] = r2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r2 = r8
            r8 = r3
            r9 = r2
            r10 = r0
            r11 = r1
            r12 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0182:
            r2 = r8
            if (r5 == 0) goto L_0x022a
            r2.l = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r2.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = r1.g
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r5
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.f69294a
            r16 = 1
            r17 = 78812(0x133dc, float:1.10439E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r4 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r3[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.effectplatform.g> r4 = com.ss.android.ugc.aweme.effectplatform.g.class
            r3[r12] = r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r19 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x01d1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r5
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.f69294a
            r16 = 1
            r17 = 78812(0x133dc, float:1.10439E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r1[r11] = r3
            java.lang.Class<com.ss.android.ugc.aweme.effectplatform.g> r3 = com.ss.android.ugc.aweme.effectplatform.g.class
            r1[r12] = r3
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r19 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r15 = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r15 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r15
            goto L_0x01da
        L_0x01d1:
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.f69295b
            int r1 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.b(r3, r1)
            r5.f69297d = r1
            r15 = r5
        L_0x01da:
            r2.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r15)
            r2.a((boolean) r11)
            r2.b()
            com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r1 = r2.f69200d
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r3 = r2.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r3.icon_url
            java.util.List<java.lang.String> r3 = r3.url_list
            java.lang.Object r3 = r3.get(r11)
            java.lang.String r3 = (java.lang.String) r3
            r1.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r2.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = r1.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r3 = r2.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f69295b
            java.lang.String r3 = r3.id
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = r2.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f69295b
            java.util.List r4 = r4.getTags()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r2.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            java.lang.String r5 = r5.tags_updated_at
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder$1 r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerViewHolder$1
            r6.<init>()
            r1.a((java.lang.String) r3, (java.util.List<java.lang.String>) r4, (java.lang.String) r5, (com.ss.android.ugc.effectmanager.effect.b.m) r6)
            if (r0 == 0) goto L_0x022a
            android.view.View r0 = r2.g
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.a
            r1.<init>(r2)
            r0.post(r1)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }
}
