package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.q;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tencent.bugly.CrashModule;
import java.util.HashMap;
import java.util.List;

public class CategoryStickerAdapter extends StickerAdapter<ah> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69546a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69547b = true;

    /* renamed from: c  reason: collision with root package name */
    public a f69548c;

    /* renamed from: f  reason: collision with root package name */
    private int f69549f;
    private EffectStickerManager g;
    private List<ah> h;
    private HashMap<String, Integer> i;

    public List<ah> getData() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69546a, false, 79083, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69546a, false, 79083, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (ae.c(((ah) b(i2)).f69295b)) {
            return 1003;
        } else {
            if (!com.ss.android.g.a.a() || !ae.i(((ah) b(i2)).f69295b)) {
                return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
            }
            return CrashModule.MODULE_ID;
        }
    }

    public void setData(List<ah> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69546a, false, 79082, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69546a, false, 79082, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.h = list;
        this.i = q.a(this.h);
        super.setData(this.h);
    }

    public final int a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f69546a, false, 79081, new Class[]{Effect.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effect2}, this, f69546a, false, 79081, new Class[]{Effect.class}, Integer.TYPE)).intValue();
        } else if (effect2 == null) {
            return -1;
        } else {
            Integer num = this.i.get(effect2.effect_id);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    public CategoryStickerAdapter(@NonNull EffectStickerManager effectStickerManager, int i2) {
        this.g = effectStickerManager;
        this.f69549f = i2;
        this.i = q.a(this.h);
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69546a, false, 79079, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69546a, false, 79079, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i2) {
            case 1003:
                return new EffectGameViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ts, viewGroup, false), this.g, this.h);
            case CrashModule.MODULE_ID /*1004*/:
                EffectLockStickerViewHolder effectLockStickerViewHolder = new EffectLockStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tr, viewGroup, false), this.g, this.h);
                effectLockStickerViewHolder.g = this.f69548c;
                return effectLockStickerViewHolder;
            default:
                return new EffectStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ts, viewGroup, false), this.g, this.h);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0358, code lost:
        if (android.text.TextUtils.equals(r3, r5) != false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0368, code lost:
        if (r3 != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x069e, code lost:
        if (r3 != false) goto L_0x06a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.support.v7.widget.RecyclerView.ViewHolder r21, int r22) {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f69546a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79080(0x134e8, float:1.10815E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69546a
            r3 = 0
            r4 = 79080(0x134e8, float:1.10815E-40)
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
            boolean r0 = r7.f69547b
            if (r0 == 0) goto L_0x0057
            int r0 = r7.f69549f
            if (r0 != r12) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            int r1 = r7.getItemViewType(r9)
            r2 = 3
            r3 = 4
            switch(r1) {
                case 1003: goto L_0x03f3;
                case 1004: goto L_0x00d7;
                default: goto L_0x0061;
            }
        L_0x0061:
            r1 = r21
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder) r1
            java.lang.Object r4 = r7.b(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r5 = r7.h
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r4
            r13[r12] = r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r13[r10] = r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
            r13[r2] = r6
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78622(0x1331e, float:1.10173E-40)
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r6[r11] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r6[r12] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r6[r2] = r8
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x04ea
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r11] = r4
            r8[r12] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r8[r10] = r4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r4 = 0
            r5 = 78622(0x1331e, float:1.10173E-40)
            java.lang.Class[] r13 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r13[r11] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r13[r12] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r13[r10] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r13[r2] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r1
            r10 = r0
            r11 = r4
            r12 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00d7:
            r1 = r21
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder) r1
            java.lang.Object r4 = r7.b(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r5 = r7.h
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r4
            r13[r12] = r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r13[r10] = r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
            r13[r2] = r6
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78557(0x132dd, float:1.10082E-40)
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r6[r11] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r6[r12] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r6[r2] = r8
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x014e
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r4
            r13[r12] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r13[r10] = r4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r13[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78557(0x132dd, float:1.10082E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r0[r11] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r0[r12] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r0[r10] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r0[r2] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0707
        L_0x014e:
            java.lang.String r2 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r2)
            if (r4 == 0) goto L_0x0707
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x015f
            goto L_0x0707
        L_0x015f:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.i
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.g
            com.ss.android.ugc.aweme.effectplatform.g r2 = (com.ss.android.ugc.aweme.effectplatform.g) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4, (com.ss.android.ugc.aweme.effectplatform.g) r2)
            r1.f69186b = r2
            android.widget.ImageView r2 = r1.f69190f
            r3 = 0
            r2.setAlpha(r3)
            r1.f69187c = r9
            r1.a()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.f69186b
            r5 = 0
            if (r2 == 0) goto L_0x017e
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            goto L_0x017f
        L_0x017e:
            r2 = r5
        L_0x017f:
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.j(r2)
            if (r2 == 0) goto L_0x01ce
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.f69186b
            if (r2 == 0) goto L_0x0190
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            if (r2 == 0) goto L_0x0190
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            goto L_0x0191
        L_0x0190:
            r2 = r5
        L_0x0191:
            if (r2 == 0) goto L_0x01d6
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.f69186b
            if (r2 == 0) goto L_0x01a2
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            if (r2 == 0) goto L_0x01a2
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            if (r2 == 0) goto L_0x01a2
            java.util.List<java.lang.String> r2 = r2.url_list
            goto L_0x01a3
        L_0x01a2:
            r2 = r5
        L_0x01a3:
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r2)
            if (r2 != 0) goto L_0x01d6
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f69189e
            r6 = 128(0x80, float:1.794E-43)
            r2.setImageAlpha(r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f69189e
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r6 = r1.f69186b
            if (r6 == 0) goto L_0x01c9
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f69295b
            if (r6 == 0) goto L_0x01c9
            com.ss.android.ugc.effectmanager.common.model.UrlModel r6 = r6.icon_url
            if (r6 == 0) goto L_0x01c9
            java.util.List<java.lang.String> r6 = r6.url_list
            if (r6 == 0) goto L_0x01c9
            java.lang.Object r6 = r6.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x01ca
        L_0x01c9:
            r6 = r5
        L_0x01ca:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2, (java.lang.String) r6)
            goto L_0x01d6
        L_0x01ce:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r1.f69189e
            r6 = 2130839391(0x7f02075f, float:1.7283791E38)
            r2.setImageResource(r6)
        L_0x01d6:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.i
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r6 = r1.f69186b
            if (r6 == 0) goto L_0x01e5
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f69295b
            if (r6 == 0) goto L_0x01e5
            java.lang.String r6 = r6.id
            goto L_0x01e6
        L_0x01e5:
            r6 = r5
        L_0x01e6:
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r8 = r1.f69186b
            if (r8 == 0) goto L_0x01f3
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r8.f69295b
            if (r8 == 0) goto L_0x01f3
            java.util.List r8 = r8.getTags()
            goto L_0x01f4
        L_0x01f3:
            r8 = r5
        L_0x01f4:
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r9 = r1.f69186b
            if (r9 == 0) goto L_0x01ff
            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r9.f69295b
            if (r9 == 0) goto L_0x01ff
            java.lang.String r9 = r9.tags_updated_at
            goto L_0x0200
        L_0x01ff:
            r9 = r5
        L_0x0200:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$a r10 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$a
            r10.<init>(r1)
            com.ss.android.ugc.effectmanager.effect.b.m r10 = (com.ss.android.ugc.effectmanager.effect.b.m) r10
            r2.a((java.lang.String) r6, (java.util.List<java.lang.String>) r8, (java.lang.String) r9, (com.ss.android.ugc.effectmanager.effect.b.m) r10)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.i
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f3971b
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r6 = r1.i
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r4.f69295b
            boolean r6 = r6.b(r8)
            r8 = 150(0x96, double:7.4E-322)
            if (r6 == 0) goto L_0x0233
            android.widget.ImageView r3 = r1.f69190f
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r6)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r8)
            r3.start()
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r3 = r1.i
            r3.c(r2)
            goto L_0x0244
        L_0x0233:
            android.widget.ImageView r2 = r1.f69190f
            android.view.ViewPropertyAnimator r2 = r2.animate()
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r8)
            r2.start()
        L_0x0244:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78566(0x132e6, float:1.10094E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0283
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r13[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78566(0x132e6, float:1.10094E-40)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x03dd
        L_0x0283:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.i
            boolean r2 = r2.i
            if (r2 == 0) goto L_0x03dd
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.f69186b
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78564(0x132e4, float:1.10092E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r3[r11] = r6
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x02c9
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78564(0x132e4, float:1.10092E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x037a
        L_0x02c9:
            com.ss.android.ugc.aweme.property.e r3 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r6 = com.ss.android.ugc.aweme.property.e.a.AutoApplySticker
            long r8 = r3.c(r6)
            boolean r3 = com.ss.android.ugc.aweme.utils.aw.a(r8)
            boolean r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r2)
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.c((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r2)
            if (r3 == 0) goto L_0x0373
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78565(0x132e5, float:1.10093E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0310
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78565(0x132e5, float:1.10093E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0368
        L_0x0310:
            android.content.Context r3 = r1.f69188d
            if (r3 == 0) goto L_0x036b
            android.support.v4.app.FragmentActivity r3 = (android.support.v4.app.FragmentActivity) r3
            android.arch.lifecycle.ViewModelProvider r3 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r3)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
            android.arch.lifecycle.ViewModel r3 = r3.get(r8)
            java.lang.String r8 = "ViewModelProviders.of(co…kerViewModel::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r8)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r3 = (com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r3
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r3.f70249b
            java.lang.String r8 = "ViewModelProviders.of(co…ss.java).currentUseEffect"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r8)
            java.lang.Object r3 = r3.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
            if (r3 == 0) goto L_0x035c
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r8 = r1.f69186b
            if (r8 == 0) goto L_0x033d
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r8.f69295b
            goto L_0x033e
        L_0x033d:
            r8 = r5
        L_0x033e:
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x035a
            java.lang.String r3 = r3.parent
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r8 = r1.f69186b
            if (r8 == 0) goto L_0x0352
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r8.f69295b
            if (r8 == 0) goto L_0x0352
            java.lang.String r5 = r8.effect_id
        L_0x0352:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L_0x035c
        L_0x035a:
            r3 = 1
            goto L_0x035d
        L_0x035c:
            r3 = 0
        L_0x035d:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r5 = r1.i
            int r5 = r5.j
            if (r5 != r12) goto L_0x0367
            if (r3 == 0) goto L_0x0367
            r3 = 1
            goto L_0x0368
        L_0x0367:
            r3 = 0
        L_0x0368:
            if (r3 == 0) goto L_0x0379
            goto L_0x0373
        L_0x036b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x0373:
            if (r6 != 0) goto L_0x0379
            if (r2 != 0) goto L_0x0379
            r2 = 1
            goto L_0x037a
        L_0x0379:
            r2 = 0
        L_0x037a:
            if (r2 == 0) goto L_0x03dd
            com.ss.android.ugc.aweme.property.e r2 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r3 = com.ss.android.ugc.aweme.property.e.a.AutoApplySticker
            long r5 = java.lang.System.currentTimeMillis()
            r2.a((com.ss.android.ugc.aweme.property.e.a) r3, (long) r5)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78563(0x132e3, float:1.1009E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x03c5
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r13[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.f69185a
            r16 = 0
            r17 = 78563(0x132e3, float:1.1009E-40)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x03dd
        L_0x03c5:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.i
            r2.i = r11
            if (r0 == 0) goto L_0x03dd
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r1.i
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f3971b
            if (r0 != 0) goto L_0x03dd
            android.view.View r0 = r1.h
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$d r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$d
            r2.<init>(r1)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.post(r2)
        L_0x03dd:
            android.view.View r0 = r1.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r4.f69295b
            java.lang.String r2 = "effect.effect"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.name
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setContentDescription(r1)
            return
        L_0x03f3:
            r1 = r21
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder) r1
            java.lang.Object r4 = r7.b(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = (com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r5 = r7.h
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r4
            r13[r12] = r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r13[r10] = r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
            r13[r2] = r6
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder.f69182a
            r16 = 0
            r17 = 78548(0x132d4, float:1.10069E-40)
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r6[r11] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r6[r12] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r6[r2] = r8
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x046a
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r11] = r4
            r8[r12] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r8[r10] = r4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder.f69182a
            r4 = 0
            r5 = 78548(0x132d4, float:1.10069E-40)
            java.lang.Class[] r13 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r13[r11] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r13[r12] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r13[r10] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r13[r2] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r1
            r10 = r0
            r11 = r4
            r12 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0707
        L_0x046a:
            if (r4 == 0) goto L_0x0707
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0474
            goto L_0x0707
        L_0x0474:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r1.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r0.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4, (com.ss.android.ugc.aweme.effectplatform.g) r0)
            r1.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r0)
            r1.a((boolean) r11)
            r1.f69202f = r9
            r1.b()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r0.icon_url
            if (r0 == 0) goto L_0x04b6
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r0.icon_url
            java.util.List<java.lang.String> r0 = r0.url_list
            boolean r0 = com.bytedance.common.utility.Lists.isEmpty(r0)
            if (r0 != 0) goto L_0x04b6
            com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r1.f69200d
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            java.util.List<java.lang.String> r2 = r2.url_list
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            r0.a((java.lang.String) r2)
        L_0x04b6:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r1.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r0.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            java.lang.String r2 = r2.id
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r3 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f69295b
            java.util.List r3 = r3.getTags()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            java.lang.String r5 = r5.tags_updated_at
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder$1 r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder$1
            r6.<init>()
            r0.a((java.lang.String) r2, (java.util.List<java.lang.String>) r3, (java.lang.String) r5, (com.ss.android.ugc.effectmanager.effect.b.m) r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r1.h
            r0.i = r11
            android.view.View r0 = r1.itemView
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r4.f69295b
            java.lang.String r1 = r1.name
            r0.setContentDescription(r1)
            return
        L_0x04ea:
            if (r4 == 0) goto L_0x0708
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x04f4
            goto L_0x0708
        L_0x04f4:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r4, (com.ss.android.ugc.aweme.effectplatform.g) r2)
            r1.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r2)
            r1.a((boolean) r11)
            r1.f69202f = r9
            r1.b()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            if (r2 == 0) goto L_0x0536
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.icon_url
            java.util.List<java.lang.String> r2 = r2.url_list
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r2)
            if (r2 != 0) goto L_0x0536
            com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r2 = r1.f69200d
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r3 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f69295b
            com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r3.icon_url
            java.util.List<java.lang.String> r3 = r3.url_list
            java.lang.Object r3 = r3.get(r11)
            java.lang.String r3 = (java.lang.String) r3
            r2.a((java.lang.String) r3)
        L_0x0536:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.h
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r3 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f69295b
            java.lang.String r3 = r3.id
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            java.util.List r5 = r5.getTags()
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r6 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f69295b
            java.lang.String r6 = r6.tags_updated_at
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder$1 r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder$1
            r8.<init>()
            r2.a((java.lang.String) r3, (java.util.List<java.lang.String>) r5, (java.lang.String) r6, (com.ss.android.ugc.effectmanager.effect.b.m) r8)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.h
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f3971b
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r3 = r1.h
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r4.f69295b
            boolean r3 = r3.b(r5)
            if (r3 == 0) goto L_0x0573
            r1.a((boolean) r12)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r3 = r1.h
            r3.c(r2)
            goto L_0x0576
        L_0x0573:
            r1.a((boolean) r11)
        L_0x0576:
            android.view.View r2 = r1.itemView
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r4.f69295b
            java.lang.String r3 = r3.name
            r2.setContentDescription(r3)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78628(0x13324, float:1.10181E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x05bc
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r0 = 0
            r2 = 78628(0x13324, float:1.10181E-40)
            java.lang.Class[] r13 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r13[r11] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r1
            r11 = r0
            r12 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x05bc:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.h
            boolean r2 = r2.i
            if (r2 == 0) goto L_0x0707
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r1.a()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78625(0x13321, float:1.10177E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r4 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0604
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78625(0x13321, float:1.10177E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x06a7
        L_0x0604:
            com.ss.android.ugc.aweme.property.e r3 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r4 = com.ss.android.ugc.aweme.property.e.a.AutoApplySticker
            long r3 = r3.c(r4)
            boolean r3 = com.ss.android.ugc.aweme.utils.aw.a(r3)
            boolean r4 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r2)
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.c((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r2)
            if (r3 == 0) goto L_0x06a0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78626(0x13322, float:1.10178E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x064b
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78626(0x13322, float:1.10178E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x069e
        L_0x064b:
            android.content.Context r3 = r1.f69201e
            android.support.v4.app.FragmentActivity r3 = (android.support.v4.app.FragmentActivity) r3
            android.arch.lifecycle.ViewModelProvider r3 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r3)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r5 = com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
            android.arch.lifecycle.ViewModel r3 = r3.get(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r3 = (com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r3
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r3.f70249b
            java.lang.Object r3 = r3.getValue()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
            if (r3 == 0) goto L_0x0692
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            if (r5 == 0) goto L_0x0692
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            if (r5 != 0) goto L_0x0674
            goto L_0x0692
        L_0x0674:
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0690
            java.lang.String r3 = r3.parent
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r5 = r1.a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r5.f69295b
            java.lang.String r5 = r5.effect_id
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L_0x0692
        L_0x0690:
            r3 = 1
            goto L_0x0693
        L_0x0692:
            r3 = 0
        L_0x0693:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r5 = r1.h
            int r5 = r5.j
            if (r5 != r12) goto L_0x069d
            if (r3 == 0) goto L_0x069d
            r3 = 1
            goto L_0x069e
        L_0x069d:
            r3 = 0
        L_0x069e:
            if (r3 == 0) goto L_0x06a6
        L_0x06a0:
            if (r4 != 0) goto L_0x06a6
            if (r2 != 0) goto L_0x06a6
            r2 = 1
            goto L_0x06a7
        L_0x06a6:
            r2 = 0
        L_0x06a7:
            if (r2 == 0) goto L_0x0707
            com.ss.android.ugc.aweme.property.e r2 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r3 = com.ss.android.ugc.aweme.property.e.a.AutoApplySticker
            long r4 = java.lang.System.currentTimeMillis()
            r2.a((com.ss.android.ugc.aweme.property.e.a) r3, (long) r4)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r16 = 0
            r17 = 78627(0x13323, float:1.1018E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x06f1
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder.f69217a
            r0 = 0
            r2 = 78627(0x13323, float:1.1018E-40)
            java.lang.Class[] r13 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r13[r11] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r1
            r11 = r0
            r12 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x06f1:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r1.h
            r2.i = r11
            if (r0 == 0) goto L_0x0707
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r1.h
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f3971b
            if (r0 != 0) goto L_0x0707
            android.view.View r0 = r1.g
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder$3 r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder$3
            r2.<init>()
            r0.post(r2)
        L_0x0707:
            return
        L_0x0708:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerAdapter.a(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        int i3 = i2;
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2), list2}, this, f69546a, false, 79084, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2), list2}, this, f69546a, false, 79084, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            ah ahVar = (ah) list2.get(0);
            if (getItemViewType(i3) == 1001) {
                EffectStickerViewHolder effectStickerViewHolder = (EffectStickerViewHolder) viewHolder;
                if (this.g.b(ahVar.f69295b)) {
                    effectStickerViewHolder.a(true);
                    this.g.c(ahVar.f69295b);
                } else {
                    effectStickerViewHolder.a(false);
                }
            } else if (getItemViewType(i3) == 1003) {
                EffectGameViewHolder effectGameViewHolder = (EffectGameViewHolder) viewHolder;
                if (this.g.b(ahVar.f69295b)) {
                    effectGameViewHolder.a(true);
                    this.g.c(ahVar.f69295b);
                } else {
                    effectGameViewHolder.a(false);
                }
            } else if (getItemViewType(i3) == 1004) {
                EffectLockStickerViewHolder effectLockStickerViewHolder = (EffectLockStickerViewHolder) viewHolder;
                if (this.g.b(ahVar.f69295b)) {
                    effectLockStickerViewHolder.f69190f.animate().alpha(1.0f).setDuration(150).start();
                    this.g.c(ahVar.f69295b);
                } else {
                    effectLockStickerViewHolder.f69190f.animate().alpha(0.0f).setDuration(150).start();
                }
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i2, list);
    }
}
