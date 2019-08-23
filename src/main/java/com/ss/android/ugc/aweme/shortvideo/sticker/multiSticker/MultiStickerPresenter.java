package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker;

import android.arch.lifecycle.LifecycleObserver;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class MultiStickerPresenter implements LifecycleObserver, m.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70143a;

    /* renamed from: b  reason: collision with root package name */
    public FaceStickerBean f70144b;

    /* renamed from: c  reason: collision with root package name */
    public Effect f70145c;

    /* renamed from: d  reason: collision with root package name */
    private a f70146d;

    /* renamed from: e  reason: collision with root package name */
    private AppCompatActivity f70147e;

    /* renamed from: f  reason: collision with root package name */
    private FaceStickerBean f70148f;
    private EffectStickerManager g;
    private fh h;
    private boolean i = true;

    public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
    }

    public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
    }

    public final void b(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f70143a, false, 79795, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f70143a, false, 79795, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        d(faceStickerBean);
    }

    public final void c(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f70143a, false, 79796, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f70143a, false, 79796, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        d(faceStickerBean);
    }

    private int a(List<Effect> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f70143a, false, 79793, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f70143a, false, 79793, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(list) || this.f70145c == null) {
            return 0;
        } else {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (TextUtils.equals(list.get(i2).id, this.f70145c.id)) {
                    return i2;
                }
            }
            return 0;
        }
    }

    private void d(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f70143a, false, 79797, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f70143a, false, 79797, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        if (faceStickerBean.getStickerId() == 0) {
            this.f70148f = FaceStickerBean.NONE;
        }
        this.f70146d.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@android.support.annotation.NonNull com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r27) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79792(0x137b0, float:1.11812E-40)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79792(0x137b0, float:1.11812E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79794(0x137b2, float:1.11815E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79794(0x137b2, float:1.11815E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0092
        L_0x0071:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r7.f70148f
            if (r0 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r7.f70148f
            java.util.List r0 = r0.getChildren()
            if (r0 != 0) goto L_0x007e
            goto L_0x0091
        L_0x007e:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r7.f70148f
            java.util.List r0 = r0.getChildren()
            long r1 = r27.getStickerId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.contains(r1)
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r7.f70144b = r8
            return
        L_0x0097:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79798(0x137b6, float:1.11821E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79798(0x137b6, float:1.11821E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00dd
        L_0x00d0:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r8 == r0) goto L_0x00dc
            int r0 = r27.getEffectType()
            if (r0 != r9) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            r11 = 0
            if (r0 != 0) goto L_0x00ec
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            r7.f70148f = r0
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a r0 = r7.f70146d
            r0.a()
            r7.f70144b = r11
            return
        L_0x00ec:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79799(0x137b7, float:1.11822E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0123
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79799(0x137b7, float:1.11822E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r5[r10] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r11 = r0
            java.util.List r11 = (java.util.List) r11
            goto L_0x020c
        L_0x0123:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.NONE
            if (r8 != r0) goto L_0x0129
            goto L_0x020c
        L_0x0129:
            java.util.List r12 = r27.getChildren()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79800(0x137b8, float:1.11824E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0162
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f70143a
            r3 = 0
            r4 = 79800(0x137b8, float:1.11824E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x018c
        L_0x0162:
            if (r12 != 0) goto L_0x0166
            r0 = r11
            goto L_0x018c
        L_0x0166:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.g
            java.util.HashMap<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r0.f3974e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r12.iterator()
        L_0x0173:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r0.get(r3)
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
            if (r3 == 0) goto L_0x0173
            r1.add(r3)
            goto L_0x0173
        L_0x018b:
            r0 = r1
        L_0x018c:
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a r1 = r7.f70146d
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a.f70150a
            r15 = 0
            r16 = 79803(0x137bb, float:1.11828E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x01c2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a.f70150a
            r15 = 0
            r16 = 79803(0x137bb, float:1.11828E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x020b
        L_0x01c2:
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter r1 = r1.f70152c
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter.f70156a
            r22 = 0
            r23 = 79811(0x137c3, float:1.11839E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r3[r10] = r4
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r20 = r1
            r24 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L_0x0200
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter.f70156a
            r22 = 0
            r23 = 79811(0x137c3, float:1.11839E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r3[r10] = r4
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r20 = r1
            r24 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x020b
        L_0x0200:
            java.util.List r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r0, (java.lang.String) r11)
            r1.f70157b = r2
            r1.notifyDataSetChanged()
            r1.f70159d = r10
        L_0x020b:
            r11 = r0
        L_0x020c:
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x021c
            int r0 = r7.a((java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>) r11)
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a r1 = r7.f70146d
            r1.a(r8, r0)
            r7.i = r10
            goto L_0x0221
        L_0x021c:
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a r0 = r7.f70146d
            r0.a(r8, r10)
        L_0x0221:
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a r0 = r7.f70146d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a.f70150a
            r14 = 0
            r15 = 79801(0x137b9, float:1.11825E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x024b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.a.f70150a
            r14 = 0
            r15 = 79801(0x137b9, float:1.11825E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0250
        L_0x024b:
            android.support.v7.widget.RecyclerView r0 = r0.f70151b
            r0.setVisibility(r10)
        L_0x0250:
            com.ss.android.ugc.aweme.utils.a r0 = com.ss.android.ugc.aweme.utils.a.f75468b
            java.lang.String r1 = "prop_show"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = r27.getPropSource()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "click_banner"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.fh r4 = r7.h
            java.lang.String r4 = r4.q
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.fh r4 = r7.h
            java.lang.String r4 = r4.r
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.fh r4 = r7.h
            int r4 = r4.v
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (int) r4)
            java.lang.String r3 = "parent_pop_id"
            long r4 = r27.getStickerId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (long) r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            r0.a(r1, r2)
            r7.f70148f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter.a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean):void");
    }

    public MultiStickerPresenter(AppCompatActivity appCompatActivity, View view, EffectStickerManager effectStickerManager, fh fhVar) {
        AnonymousClass1 r0 = new c() {
            public final void a(FaceStickerBean faceStickerBean) {
                MultiStickerPresenter.this.f70144b = faceStickerBean;
            }
        };
        this.g = effectStickerManager;
        this.f70146d = new a(appCompatActivity, view, r0, effectStickerManager);
        this.f70147e = appCompatActivity;
        appCompatActivity.getLifecycle().addObserver(this);
        this.h = fhVar;
    }
}
