package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u00107\u001a\u00020\u001aH\u0016J\u0010\u00108\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\u000e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020/2\u0006\u0010:\u001a\u00020;R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerBaseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/IStickerFetch$OnStickerDownloadListener;", "mItemView", "Landroid/view/View;", "effectStickerManager", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;", "mStickers", "", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;Ljava/util/List;)V", "getEffectStickerManager", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;", "setEffectStickerManager", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerManager;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getMItemView", "()Landroid/view/View;", "setMItemView", "(Landroid/view/View;)V", "mPosition", "", "getMPosition", "()I", "setMPosition", "(I)V", "getMStickers", "()Ljava/util/List;", "setMStickers", "(Ljava/util/List;)V", "stickerImageView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "getStickerImageView", "()Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "setStickerImageView", "(Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;)V", "stickerWrapper", "getStickerWrapper", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "setStickerWrapper", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;)V", "changeDownloadState", "", "onDownloading", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "onFailed", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onProgress", "progress", "onSuccess", "showBorderView", "isShow", "", "showDotView", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class EffectStickerBaseViewHolder extends RecyclerView.ViewHolder implements k.c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f69198b = null;
    @NotNull
    @JvmField
    protected static final String j = j;
    public static final a k = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    protected ah f69199c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public AVDmtImageTextView f69200d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Context f69201e;

    /* renamed from: f  reason: collision with root package name */
    public int f69202f;
    @NotNull
    public View g;
    @Nullable
    public EffectStickerManager h;
    @Nullable
    public List<? extends ah> i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/EffectStickerBaseViewHolder$Companion;", "", "()V", "NEW_TAG_SHOW", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final ah a() {
        if (PatchProxy.isSupport(new Object[0], this, f69198b, false, 78573, new Class[0], ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[0], this, f69198b, false, 78573, new Class[0], ah.class);
        }
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        return ahVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69198b, false, 78577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69198b, false, 78577, new Class[0], Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f69200d;
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        int i2 = ahVar.f69297d;
        ah ahVar2 = this.f69199c;
        if (ahVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        int i3 = ahVar2.f69298e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86785, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
            Object[] objArr2 = objArr;
            AVDmtImageTextView aVDmtImageTextView2 = aVDmtImageTextView;
            PatchProxy.accessDispatch(objArr2, aVDmtImageTextView2, AVDmtImageTextView.f74552a, false, 86785, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.a(i2, i3);
    }

    public final void a(@NotNull ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, this, f69198b, false, 78574, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar2}, this, f69198b, false, 78574, new Class[]{ah.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(ahVar2, "<set-?>");
        this.f69199c = ahVar2;
    }

    public void b(@NotNull Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69198b, false, 78579, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69198b, false, 78579, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        CharSequence charSequence = effect.effect_id;
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        Effect effect2 = ahVar.f69295b;
        Intrinsics.checkExpressionValueIsNotNull(effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(charSequence, effect2.effect_id)) {
            ah ahVar2 = this.f69199c;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
            }
            ahVar2.f69297d = 1;
            this.f69200d.c();
        }
    }

    public void a(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f69198b, false, 78578, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f69198b, false, 78578, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        CharSequence charSequence = effect2.effect_id;
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        Effect effect3 = ahVar.f69295b;
        Intrinsics.checkExpressionValueIsNotNull(effect3, "this.stickerWrapper.effect");
        if (TextUtils.equals(charSequence, effect3.effect_id)) {
            ah ahVar2 = this.f69199c;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
            }
            ahVar2.f69297d = 2;
            AVDmtImageTextView aVDmtImageTextView = this.f69200d;
            if (PatchProxy.isSupport(new Object[0], aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86781, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86781, new Class[0], Void.TYPE);
                return;
            }
            StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.b();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69198b, false, 78583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69198b, false, 78583, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69200d.c(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69198b, false, 78582, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69198b, false, 78582, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69200d.a(z);
    }

    public void a(@NotNull Effect effect, int i2) {
        if (PatchProxy.isSupport(new Object[]{effect, Integer.valueOf(i2)}, this, f69198b, false, 78581, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Integer.valueOf(i2)}, this, f69198b, false, 78581, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        ahVar.f69297d = 5;
        ah ahVar2 = this.f69199c;
        if (ahVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        ahVar2.f69298e = i2;
        CharSequence charSequence = effect.effect_id;
        ah ahVar3 = this.f69199c;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        Effect effect2 = ahVar3.f69295b;
        Intrinsics.checkExpressionValueIsNotNull(effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(charSequence, effect2.effect_id)) {
            this.f69200d.a(i2);
        }
    }

    public void a(@NotNull Effect effect, @NotNull c cVar) {
        Effect effect2 = effect;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, this, f69198b, false, 78580, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, this, f69198b, false, 78580, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        Intrinsics.checkParameterIsNotNull(cVar2, "e");
        CharSequence charSequence = effect2.effect_id;
        ah ahVar = this.f69199c;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
        }
        Effect effect3 = ahVar.f69295b;
        Intrinsics.checkExpressionValueIsNotNull(effect3, "this.stickerWrapper.effect");
        if (TextUtils.equals(charSequence, effect3.effect_id)) {
            ah ahVar2 = this.f69199c;
            if (ahVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stickerWrapper");
            }
            ahVar2.f69297d = 3;
            AVDmtImageTextView aVDmtImageTextView = this.f69200d;
            if (PatchProxy.isSupport(new Object[0], aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86783, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86783, new Class[0], Void.TYPE);
                return;
            }
            StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectStickerBaseViewHolder(@NotNull View view, @Nullable EffectStickerManager effectStickerManager, @Nullable List<? extends ah> list) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mItemView");
        this.g = view;
        this.h = effectStickerManager;
        this.i = list;
        View findViewById = this.g.findViewById(C0906R.id.cvk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mItemView.findViewById(R.id.sticker_img_view)");
        this.f69200d = (AVDmtImageTextView) findViewById;
        Context context = this.g.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mItemView.context");
        this.f69201e = context;
        this.f69200d.setShowDownloadIcon(true);
    }
}
