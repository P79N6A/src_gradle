package com.ss.android.ugc.gamora.editor;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.gamora.editor.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0007R'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00048FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\u0007R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001a\u0010\u0007R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001d\u0010\u0007R-\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0 0\u00048FX\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\"\u0010\u0007R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b%\u0010\u0007R!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b(\u0010\u0007R'\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00048FX\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b+\u0010\u0007R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b.\u0010\u0007R!\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00048FX\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b2\u0010\u0007R-\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004058FX\u0002¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b6\u00107R-\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004058FX\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b:\u00107R-\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004058FX\u0002¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b=\u00107R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b@\u0010\u0007R!\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bC\u0010\u0007¨\u0006E"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditToolbarViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "autoEnhanceIcon", "Landroid/arch/lifecycle/MutableLiveData;", "", "getAutoEnhanceIcon", "()Landroid/arch/lifecycle/MutableLiveData;", "autoEnhanceIcon$delegate", "Lkotlin/Lazy;", "backTipVisible", "", "getBackTipVisible", "backTipVisible$delegate", "backVisible", "getBackVisible", "backVisible$delegate", "bottomBarItems", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "getBottomBarItems", "bottomBarItems$delegate", "bottomHeight", "getBottomHeight", "bottomHeight$delegate", "bottomMargin", "getBottomMargin", "bottomMargin$delegate", "chooseMusicIcon", "getChooseMusicIcon", "chooseMusicIcon$delegate", "chooseMusicIconUrl", "Lkotlin/Pair;", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getChooseMusicIconUrl", "chooseMusicIconUrl$delegate", "chooseMusicText", "getChooseMusicText", "chooseMusicText$delegate", "nextStepVisible", "getNextStepVisible", "nextStepVisible$delegate", "titleBarItems", "getTitleBarItems", "titleBarItems$delegate", "titleBarVisible", "getTitleBarVisible", "titleBarVisible$delegate", "titlebarHideMore", "", "getTitlebarHideMore", "titlebarHideMore$delegate", "toolbarItemEnableMap", "", "getToolbarItemEnableMap", "()Ljava/util/Map;", "toolbarItemEnableMap$delegate", "toolbarItemGuideMap", "getToolbarItemGuideMap", "toolbarItemGuideMap$delegate", "toolbarItemVisibleMap", "getToolbarItemVisibleMap", "toolbarItemVisibleMap$delegate", "topMargin", "getTopMargin", "topMargin$delegate", "volumeRightMargin", "getVolumeRightMargin", "volumeRightMargin$delegate", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EditToolbarViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f77543a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "backVisible", "getBackVisible()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "backTipVisible", "getBackTipVisible()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "nextStepVisible", "getNextStepVisible()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "titleBarItems", "getTitleBarItems()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "bottomBarItems", "getBottomBarItems()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "toolbarItemVisibleMap", "getToolbarItemVisibleMap()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "toolbarItemEnableMap", "getToolbarItemEnableMap()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "toolbarItemGuideMap", "getToolbarItemGuideMap()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "titlebarHideMore", "getTitlebarHideMore()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "titleBarVisible", "getTitleBarVisible()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "chooseMusicText", "getChooseMusicText()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "chooseMusicIcon", "getChooseMusicIcon()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "chooseMusicIconUrl", "getChooseMusicIconUrl()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "volumeRightMargin", "getVolumeRightMargin()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "topMargin", "getTopMargin()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "bottomMargin", "getBottomMargin()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "bottomHeight", "getBottomHeight()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditToolbarViewModel.class), "autoEnhanceIcon", "getAutoEnhanceIcon()Landroid/arch/lifecycle/MutableLiveData;"))};
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f77544b = LazyKt.lazy(c.INSTANCE);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f77545c = LazyKt.lazy(b.INSTANCE);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f77546d = LazyKt.lazy(j.INSTANCE);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f77547e = LazyKt.lazy(k.INSTANCE);
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f77548f = LazyKt.lazy(d.INSTANCE);
    @NotNull
    private final Lazy g = LazyKt.lazy(p.INSTANCE);
    @NotNull
    private final Lazy h = LazyKt.lazy(n.INSTANCE);
    @NotNull
    private final Lazy i = LazyKt.lazy(o.INSTANCE);
    @NotNull
    private final Lazy j = LazyKt.lazy(m.INSTANCE);
    @NotNull
    private final Lazy k = LazyKt.lazy(l.INSTANCE);
    @NotNull
    private final Lazy l = LazyKt.lazy(i.INSTANCE);
    @NotNull
    private final Lazy m = LazyKt.lazy(g.INSTANCE);
    @NotNull
    private final Lazy n = LazyKt.lazy(h.INSTANCE);
    @NotNull
    private final Lazy o = LazyKt.lazy(r.INSTANCE);
    @NotNull
    private final Lazy p = LazyKt.lazy(q.INSTANCE);
    @NotNull
    private final Lazy q = LazyKt.lazy(f.INSTANCE);
    @NotNull
    private final Lazy r = LazyKt.lazy(e.INSTANCE);
    @NotNull
    private final Lazy s = LazyKt.lazy(a.INSTANCE);

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<MutableLiveData<List<? extends f>>> {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<List<f>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final f INSTANCE = new f();

        f() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final g INSTANCE = new g();

        g() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<MutableLiveData<Pair<? extends UrlModel, ? extends Boolean>>> {
        public static final h INSTANCE = new h();

        h() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Pair<UrlModel, Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final i INSTANCE = new i();

        i() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final j INSTANCE = new j();

        j() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<MutableLiveData<List<? extends f>>> {
        public static final k INSTANCE = new k();

        k() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<List<f>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final l INSTANCE = new l();

        l() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<MutableLiveData<Object>> {
        public static final m INSTANCE = new m();

        m() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Object> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<Map<Integer, ? extends MutableLiveData<Boolean>>> {
        public static final n INSTANCE = new n();

        n() {
            super(0);
        }

        @NotNull
        public final Map<Integer, MutableLiveData<Boolean>> invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : f.a.a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new MutableLiveData());
            }
            return MapsKt.toMap(linkedHashMap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<Map<Integer, ? extends MutableLiveData<Boolean>>> {
        public static final o INSTANCE = new o();

        o() {
            super(0);
        }

        @NotNull
        public final Map<Integer, MutableLiveData<Boolean>> invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : f.a.a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new MutableLiveData());
            }
            return MapsKt.toMap(linkedHashMap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function0<Map<Integer, ? extends MutableLiveData<Boolean>>> {
        public static final p INSTANCE = new p();

        p() {
            super(0);
        }

        @NotNull
        public final Map<Integer, MutableLiveData<Boolean>> invoke() {
            Map linkedHashMap = new LinkedHashMap();
            for (Number intValue : f.a.a()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), new MutableLiveData());
            }
            return MapsKt.toMap(linkedHashMap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final q INSTANCE = new q();

        q() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final r INSTANCE = new r();

        r() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> a() {
        return (MutableLiveData) this.f77544b.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> b() {
        return (MutableLiveData) this.f77545c.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> c() {
        return (MutableLiveData) this.f77546d.getValue();
    }

    @NotNull
    public final MutableLiveData<List<f>> d() {
        return (MutableLiveData) this.f77547e.getValue();
    }

    @NotNull
    public final MutableLiveData<List<f>> e() {
        return (MutableLiveData) this.f77548f.getValue();
    }

    @NotNull
    public final Map<Integer, MutableLiveData<Boolean>> f() {
        return (Map) this.g.getValue();
    }

    @NotNull
    public final Map<Integer, MutableLiveData<Boolean>> g() {
        return (Map) this.h.getValue();
    }

    @NotNull
    public final Map<Integer, MutableLiveData<Boolean>> h() {
        return (Map) this.i.getValue();
    }

    @NotNull
    public final MutableLiveData<Object> i() {
        return (MutableLiveData) this.j.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> j() {
        return (MutableLiveData) this.k.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> k() {
        return (MutableLiveData) this.l.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> l() {
        return (MutableLiveData) this.m.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<UrlModel, Boolean>> m() {
        return (MutableLiveData) this.n.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> n() {
        return (MutableLiveData) this.o.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> o() {
        return (MutableLiveData) this.p.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> p() {
        return (MutableLiveData) this.q.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> q() {
        return (MutableLiveData) this.r.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> r() {
        return (MutableLiveData) this.s.getValue();
    }
}
