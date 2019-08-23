package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B>\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eJ9\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\r0\bJ\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0002J\u000e\u0010#\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0019R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneItemHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "effectPlatformSupplier", "Lcom/google/common/base/Supplier;", "Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;", "itemView", "Landroid/view/View;", "onStickerDownload", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Lcom/google/common/base/Supplier;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "currentPosition", "ivCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "ivLoading", "prefetchStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerFetchViewModel;", "rotationAnim", "Landroid/animation/ObjectAnimator;", "bindViewHolder", "effect", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "onItemClick", "view", "fetchStickerData", "stickerWrapper", "scaleView", "scale", "", "showContent", "showLoading", "updateStickerStatus", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneItemHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74010a;

    /* renamed from: b  reason: collision with root package name */
    final RemoteImageView f74011b;

    /* renamed from: c  reason: collision with root package name */
    public int f74012c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1<Integer, Unit> f74013d;

    /* renamed from: e  reason: collision with root package name */
    private StickerFetchViewModel f74014e;

    /* renamed from: f  reason: collision with root package name */
    private final RemoteImageView f74015f;
    private ObjectAnimator g;
    private final s<g> h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "stickerFetcher", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/IStickerFetch;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<k> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StorySceneItemHolder f74017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ah f74018c;

        a(StorySceneItemHolder storySceneItemHolder, ah ahVar) {
            this.f74017b = storySceneItemHolder;
            this.f74018c = ahVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            k kVar = (k) obj;
            if (PatchProxy.isSupport(new Object[]{kVar}, this, f74016a, false, 85918, new Class[]{k.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVar}, this, f74016a, false, 85918, new Class[]{k.class}, Void.TYPE);
            } else if (kVar != null) {
                kVar.a(this.f74018c, new k.c(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74019a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f74020b;

                    public final void a(@Nullable Effect effect, int i) {
                    }

                    public final void a(@Nullable Effect effect, @Nullable c cVar) {
                    }

                    {
                        this.f74020b = r1;
                    }

                    public final void a(@Nullable Effect effect) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f74019a, false, 85919, new Class[]{Effect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect}, this, f74019a, false, 85919, new Class[]{Effect.class}, Void.TYPE);
                            return;
                        }
                        this.f74020b.f74017b.a();
                    }

                    public final void b(@Nullable Effect effect) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f74019a, false, 85920, new Class[]{Effect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect}, this, f74019a, false, 85920, new Class[]{Effect.class}, Void.TYPE);
                            return;
                        }
                        this.f74020b.f74017b.b();
                        this.f74020b.f74017b.f74013d.invoke(Integer.valueOf(this.f74020b.f74017b.f74012c));
                    }
                });
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74010a, false, 85917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74010a, false, 85917, new Class[0], Void.TYPE);
            return;
        }
        this.f74015f.setVisibility(8);
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74010a, false, 85916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74010a, false, 85916, new Class[0], Void.TYPE);
            return;
        }
        this.f74015f.setVisibility(0);
        if (this.g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f74015f, "rotation", new float[]{0.0f, 360.0f});
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            this.g = ofFloat;
        } else {
            ObjectAnimator objectAnimator = this.g;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
        ObjectAnimator objectAnimator2 = this.g;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar}, this, f74010a, false, 85915, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar}, this, f74010a, false, 85915, new Class[]{ah.class}, Void.TYPE);
            return;
        }
        if (ahVar.f69297d == 3) {
            StickerFetchViewModel stickerFetchViewModel = this.f74014e;
            if (stickerFetchViewModel != null) {
                LiveData<k> a2 = stickerFetchViewModel.a((g) this.h.get());
                if (a2 != null) {
                    View view = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    Context context = view.getContext();
                    if (context != null) {
                        a2.observe((AppCompatActivity) context, new a(this, ahVar));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                    }
                }
            }
        } else if (ahVar.f69297d == 4) {
            a();
        } else {
            b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorySceneItemHolder(@NotNull s<g> sVar, @NotNull View view, @NotNull Function1<? super Integer, Unit> function1) {
        super(view);
        Intrinsics.checkParameterIsNotNull(sVar, "effectPlatformSupplier");
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(function1, "onStickerDownload");
        this.h = sVar;
        this.f74013d = function1;
        View findViewById = view.findViewById(C0906R.id.b4p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_scene_cover)");
        this.f74011b = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.b2w);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_loading)");
        this.f74015f = (RemoteImageView) findViewById2;
        if (view.getContext() instanceof AppCompatActivity) {
            Context context = view.getContext();
            if (context != null) {
                this.f74014e = (StickerFetchViewModel) ViewModelProviders.of((FragmentActivity) (AppCompatActivity) context).get(StickerFetchViewModel.class);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
        }
        com.ss.android.ugc.aweme.base.c.a(this.f74015f, 2130840586);
    }
}
