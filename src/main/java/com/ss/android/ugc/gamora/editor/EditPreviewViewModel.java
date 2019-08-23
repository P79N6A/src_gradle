package com.ss.android.ugc.gamora.editor;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.Bitmap;
import dmt.av.video.v;
import dmt.av.video.w;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0018\u0010\u0007R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\u0007R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048FX\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b \u0010\u0007¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditPreviewViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "backgroundColor", "Landroid/arch/lifecycle/MutableLiveData;", "", "getBackgroundColor", "()Landroid/arch/lifecycle/MutableLiveData;", "backgroundColor$delegate", "Lkotlin/Lazy;", "editPrepareDone", "Ljava/lang/Void;", "getEditPrepareDone", "editPrepareDone$delegate", "firstFrameBitmap", "Landroid/graphics/Bitmap;", "getFirstFrameBitmap", "firstFrameBitmap$delegate", "firstFrameRendered", "", "getFirstFrameRendered", "firstFrameRendered$delegate", "firstFrameVisible", "", "getFirstFrameVisible", "firstFrameVisible$delegate", "vePreviewScaleOp", "Ldmt/av/video/VEPreviewScaleOp;", "getVePreviewScaleOp", "vePreviewScaleOp$delegate", "vePreviewScaleOpV2", "Ldmt/av/video/VEPreviewScaleOpV2;", "getVePreviewScaleOpV2", "vePreviewScaleOpV2$delegate", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EditPreviewViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f77537a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "firstFrameRendered", "getFirstFrameRendered()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "vePreviewScaleOp", "getVePreviewScaleOp()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "vePreviewScaleOpV2", "getVePreviewScaleOpV2()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "editPrepareDone", "getEditPrepareDone()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "firstFrameVisible", "getFirstFrameVisible()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "firstFrameBitmap", "getFirstFrameBitmap()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditPreviewViewModel.class), "backgroundColor", "getBackgroundColor()Landroid/arch/lifecycle/MutableLiveData;"))};
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f77538b = LazyKt.lazy(d.INSTANCE);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f77539c = LazyKt.lazy(f.INSTANCE);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f77540d = LazyKt.lazy(g.INSTANCE);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f77541e = LazyKt.lazy(b.INSTANCE);
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f77542f = LazyKt.lazy(e.INSTANCE);
    @NotNull
    private final Lazy g = LazyKt.lazy(c.INSTANCE);
    @NotNull
    private final Lazy h = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Ljava/lang/Void;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<MutableLiveData<Void>> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Void> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<MutableLiveData<Bitmap>> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Bitmap> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<MutableLiveData<Long>> {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Long> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Ldmt/av/video/VEPreviewScaleOp;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<MutableLiveData<v>> {
        public static final f INSTANCE = new f();

        f() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<v> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Ldmt/av/video/VEPreviewScaleOpV2;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<MutableLiveData<w>> {
        public static final g INSTANCE = new g();

        g() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<w> invoke() {
            return new MutableLiveData<>();
        }
    }

    @NotNull
    public final MutableLiveData<Long> a() {
        return (MutableLiveData) this.f77538b.getValue();
    }

    @NotNull
    public final MutableLiveData<v> b() {
        return (MutableLiveData) this.f77539c.getValue();
    }

    @NotNull
    public final MutableLiveData<w> c() {
        return (MutableLiveData) this.f77540d.getValue();
    }

    @NotNull
    public final MutableLiveData<Void> d() {
        return (MutableLiveData) this.f77541e.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> e() {
        return (MutableLiveData) this.f77542f.getValue();
    }

    @NotNull
    public final MutableLiveData<Bitmap> f() {
        return (MutableLiveData) this.g.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> g() {
        return (MutableLiveData) this.h.getValue();
    }
}
