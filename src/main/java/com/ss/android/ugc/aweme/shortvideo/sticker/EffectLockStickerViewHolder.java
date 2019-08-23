package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020'H\u0002J.\u0010+\u001a\u00020*2\b\u0010(\u001a\u0004\u0018\u00010\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020'J\b\u0010.\u001a\u00020*H\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020'H\u0002J\u0012\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u00103\u001a\u00020*2\b\u0010(\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020'H\u0002J\b\u00106\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020*2\u0006\u0010)\u001a\u00020'H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectLockStickerViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "effectStickerManager", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;", "stickers", "", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;Ljava/util/List;)V", "context", "Landroid/content/Context;", "getEffectStickerManager", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;", "imgStickerBack", "Landroid/widget/ImageView;", "getImgStickerBack", "()Landroid/widget/ImageView;", "imgStickerDot", "imgStickerDownload", "imgStickerIcon", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "lockedStickerClicked", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/LockedStickerListener;", "getLockedStickerClicked", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/LockedStickerListener;", "setLockedStickerClicked", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/LockedStickerListener;)V", "mEffect", "mPosition", "", "mRotationAnim", "Landroid/animation/ObjectAnimator;", "getStickers", "()Ljava/util/List;", "getView", "()Landroid/view/View;", "autoApplySticker", "", "effect", "autoUseSticker", "", "bind", "data", "position", "cancelRotationAnim", "changeDownloadState", "isAutoReUseSticker", "onClick", "v", "setupDotVisible", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "flag", "startRotationAnim", "useCurItemSticker", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectLockStickerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69185a;

    /* renamed from: b  reason: collision with root package name */
    public ah f69186b;

    /* renamed from: c  reason: collision with root package name */
    public int f69187c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f69188d;

    /* renamed from: e  reason: collision with root package name */
    public final RemoteImageView f69189e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f69190f;
    @Nullable
    public com.ss.android.ugc.aweme.shortvideo.sticker.unlock.a g;
    @NotNull
    public final View h;
    @NotNull
    public final EffectStickerManager i;
    @NotNull
    public final List<ah> j;
    private ObjectAnimator k;
    private final ImageView l;
    private final ImageView m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/EffectLockStickerViewHolder$bind$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IIsTagNeedUpdatedListener;", "onTagNeedNotUpdate", "", "onTagNeedUpdate", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectLockStickerViewHolder f69192b;

        public final void a() {
            Effect effect;
            if (PatchProxy.isSupport(new Object[0], this, f69191a, false, 78567, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69191a, false, 78567, new Class[0], Void.TYPE);
                return;
            }
            EffectLockStickerViewHolder effectLockStickerViewHolder = this.f69192b;
            ah ahVar = this.f69192b.f69186b;
            if (ahVar != null) {
                effect = ahVar.f69295b;
            } else {
                effect = null;
            }
            effectLockStickerViewHolder.a(effect, true);
        }

        public final void b() {
            Effect effect;
            if (PatchProxy.isSupport(new Object[0], this, f69191a, false, 78568, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69191a, false, 78568, new Class[0], Void.TYPE);
                return;
            }
            EffectLockStickerViewHolder effectLockStickerViewHolder = this.f69192b;
            ah ahVar = this.f69192b.f69186b;
            if (ahVar != null) {
                effect = ahVar.f69295b;
            } else {
                effect = null;
            }
            effectLockStickerViewHolder.a(effect, false);
        }

        public a(EffectLockStickerViewHolder effectLockStickerViewHolder) {
            this.f69192b = effectLockStickerViewHolder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFinally"}, k = 3, mv = {1, 1, 15})
    static final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69193a = new b();

        b() {
        }

        public final void a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/EffectLockStickerViewHolder$onClick$2", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/IStickerFetch$OnStickerDownloadListener;", "onDownloading", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "onFailed", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onProgress", "progress", "", "onSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectLockStickerViewHolder f69195b;

        public final void a(@Nullable Effect effect, int i) {
        }

        c(EffectLockStickerViewHolder effectLockStickerViewHolder) {
            this.f69195b = effectLockStickerViewHolder;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 78569(0x132e9, float:1.10099E-40)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                r3 = 0
                r4 = 78569(0x132e9, float:1.10099E-40)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
                java.lang.String r0 = r10.effect_id
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r1 = r1.f69186b
                if (r1 == 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f69295b
                if (r1 == 0) goto L_0x0048
                java.lang.String r1 = r1.effect_id
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x005f
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r0.f69186b
                if (r0 == 0) goto L_0x005a
                r1 = 2
                r0.f69297d = r1
            L_0x005a:
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                r0.b()
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.c.a(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(@org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 78570(0x132ea, float:1.101E-40)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                r3 = 0
                r4 = 78570(0x132ea, float:1.101E-40)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
                java.lang.String r0 = r10.effect_id
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r1 = r1.f69186b
                if (r1 == 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f69295b
                if (r1 == 0) goto L_0x0048
                java.lang.String r1 = r1.effect_id
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x00b2
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r0.f69186b
                if (r0 == 0) goto L_0x0059
                r0.f69297d = r7
            L_0x0059:
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                r0.c()
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                r0.a()
                boolean r0 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.i(r10)
                if (r0 == 0) goto L_0x0078
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.unlock.a r0 = r0.g
                if (r0 == 0) goto L_0x0077
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = r9.f69195b
                int r1 = r1.f69187c
                r0.a(r1, r10)
                goto L_0x00b2
            L_0x0077:
                return
            L_0x0078:
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                android.widget.ImageView r0 = r0.f69190f
                r1 = 0
                r0.setAlpha(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                android.widget.ImageView r0 = r0.f69190f
                android.view.ViewPropertyAnimator r0 = r0.animate()
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
                r1 = 150(0x96, double:7.4E-322)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
                r0.start()
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r0.i
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = r9.f69195b
                int r1 = r1.f69187c
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r2 = r9.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r2.i
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r3 = r9.f69195b
                java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah> r3 = r3.j
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r4 = r9.f69195b
                int r4 = r4.f69187c
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r2.a((java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.ah>) r3, (int) r4)
                r0.a(r10, r1, r2)
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.c.b(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.effect.model.Effect r11, @org.jetbrains.annotations.NotNull com.ss.android.ugc.effectmanager.common.e.c r12) {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                r9 = 1
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r1 = com.ss.android.ugc.effectmanager.common.e.c.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 78571(0x132eb, float:1.10101E-40)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003f
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f69194a
                r3 = 0
                r4 = 78571(0x132eb, float:1.10101E-40)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r5[r8] = r1
                java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r1 = com.ss.android.ugc.effectmanager.common.e.c.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003f:
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
                java.lang.String r0 = r11.effect_id
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r1 = r10.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r1 = r1.f69186b
                if (r1 == 0) goto L_0x005a
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f69295b
                if (r1 == 0) goto L_0x005a
                java.lang.String r1 = r1.effect_id
                goto L_0x005b
            L_0x005a:
                r1 = 0
            L_0x005b:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x0084
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r10.f69195b
                android.content.Context r0 = r0.f69188d
                r1 = 2131559833(0x7f0d0599, float:1.8745021E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1, (int) r8)
                r0.a()
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r10.f69195b
                com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r0.f69186b
                if (r0 == 0) goto L_0x007a
                r1 = 3
                r0.f69297d = r1
            L_0x007a:
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r10.f69195b
                r0.c()
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder r0 = r10.f69195b
                r0.a()
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.c.a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.e.c):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectLockStickerViewHolder f69197b;

        public d(EffectLockStickerViewHolder effectLockStickerViewHolder) {
            this.f69197b = effectLockStickerViewHolder;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69196a, false, 78572, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69196a, false, 78572, new Class[0], Void.TYPE);
                return;
            }
            if (this.f69197b.h.getParent() != null) {
                this.f69197b.h.performClick();
            }
        }
    }

    public final void a() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], this, f69185a, false, 78558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69185a, false, 78558, new Class[0], Void.TYPE);
            return;
        }
        ah ahVar = this.f69186b;
        if (ahVar != null) {
            num = Integer.valueOf(ahVar.f69297d);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            this.m.setVisibility(0);
        } else if (num != null && num.intValue() == 3) {
            this.m.setVisibility(0);
        } else if (num != null && num.intValue() == 4) {
            this.m.setVisibility(0);
        } else {
            if (num != null && num.intValue() == 2) {
                this.m.setVisibility(0);
                b();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69185a, false, 78559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69185a, false, 78559, new Class[0], Void.TYPE);
            return;
        }
        this.m.setImageDrawable(ContextCompat.getDrawable(this.f69188d, 2130837708));
        this.k = ObjectAnimator.ofFloat(this.m, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.k;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.k;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.k;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69185a, false, 78560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69185a, false, 78560, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.m.setRotation(0.0f);
        this.m.setImageDrawable(ContextCompat.getDrawable(this.f69188d, 2130837707));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f69185a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 78562(0x132e2, float:1.10089E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f69185a
            r3 = 0
            r4 = 78562(0x132e2, float:1.10089E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
            android.widget.ImageView r0 = r9.l
            int r0 = r0.getVisibility()
            r1 = 150(0x96, double:7.4E-322)
            r3 = 0
            if (r0 != 0) goto L_0x0051
            android.widget.ImageView r0 = r9.l
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
        L_0x0051:
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r0 = r9.f69186b
            if (r0 == 0) goto L_0x005b
            int r0 = r0.f69297d
            r4 = 2
            if (r0 != r4) goto L_0x005b
            return
        L_0x005b:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r9.i
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = r9.f69186b
            r5 = 0
            if (r4 == 0) goto L_0x0065
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f69295b
            goto L_0x0066
        L_0x0065:
            r4 = r5
        L_0x0066:
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r9.i
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r4 = r9.f69186b
            if (r4 == 0) goto L_0x0074
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r4.f69295b
        L_0x0074:
            r0.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r5)
            android.widget.ImageView r0 = r9.f69190f
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r4)
            android.widget.ImageView r0 = r9.f69190f
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
        L_0x0090:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r9.i
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r0.g
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r1 = r9.f69186b
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f69295b
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = r1.id
            goto L_0x00a0
        L_0x009f:
            r1 = r5
        L_0x00a0:
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r2 = r9.f69186b
            if (r2 == 0) goto L_0x00aa
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f69295b
            if (r2 == 0) goto L_0x00aa
            java.lang.String r5 = r2.tags_updated_at
        L_0x00aa:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$b r2 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.b.f69193a
            com.ss.android.ugc.effectmanager.effect.b.p r2 = (com.ss.android.ugc.effectmanager.effect.b.p) r2
            r0.a((java.lang.String) r1, (java.lang.String) r5, (com.ss.android.ugc.effectmanager.effect.b.p) r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r9.i
            com.ss.android.ugc.aweme.shortvideo.sticker.ah r1 = r9.f69186b
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$c r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder$c
            r2.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.k$c r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.k.c) r2
            r0.a((com.ss.android.ugc.aweme.shortvideo.sticker.ah) r1, (com.ss.android.ugc.aweme.shortvideo.sticker.k.c) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder.onClick(android.view.View):void");
    }

    public final void a(Effect effect, boolean z) {
        if (PatchProxy.isSupport(new Object[]{effect, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69185a, false, 78561, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Byte.valueOf(z)}, this, f69185a, false, 78561, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE);
        } else if (effect != null) {
            if (!effect.getTags().contains("new") || !z) {
                this.l.setVisibility(4);
                return;
            }
            this.l.setAlpha(1.0f);
            this.l.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectLockStickerViewHolder(@NotNull View view, @NotNull EffectStickerManager effectStickerManager, @NotNull List<? extends ah> list) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(effectStickerManager, "effectStickerManager");
        Intrinsics.checkParameterIsNotNull(list, "stickers");
        this.h = view;
        this.i = effectStickerManager;
        this.j = list;
        this.h.setOnClickListener(this);
        Context context = this.h.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.f69188d = context;
        View findViewById = this.h.findViewById(C0906R.id.atp);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.img_sticker_dot)");
        this.l = (ImageView) findViewById;
        View findViewById2 = this.h.findViewById(C0906R.id.atq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.img_sticker_icon)");
        this.f69189e = (RemoteImageView) findViewById2;
        View findViewById3 = this.h.findViewById(C0906R.id.ats);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.img_sticker_loading)");
        this.m = (ImageView) findViewById3;
        View findViewById4 = this.h.findViewById(C0906R.id.ato);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.img_sticker_back)");
        this.f69190f = (ImageView) findViewById4;
    }
}
