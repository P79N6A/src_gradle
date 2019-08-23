package com.ss.android.ugc.gamora.editor;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.vesdk.p;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u000fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001e\u0010\u0007R!\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00048FX\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\"\u0010\u0007¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "clickedToolBar", "Landroid/arch/lifecycle/MutableLiveData;", "", "getClickedToolBar", "()Landroid/arch/lifecycle/MutableLiveData;", "clickedToolBar$delegate", "Lkotlin/Lazy;", "editPageType", "getEditPageType", "()I", "editPageType$delegate", "enableEditPagePrompt", "", "getEnableEditPagePrompt", "()Z", "enableEditPagePrompt$delegate", "nextStep", "", "getNextStep", "nextStep$delegate", "publishEditModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "getPublishEditModel", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "setPublishEditModel", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "quit", "getQuit", "quit$delegate", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "getVeEditor", "veEditor$delegate", "enableNewEditPage", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EditViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f77549a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "veEditor", "getVeEditor()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "quit", "getQuit()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "nextStep", "getNextStep()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "clickedToolBar", "getClickedToolBar()Landroid/arch/lifecycle/MutableLiveData;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "editPageType", "getEditPageType()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditViewModel.class), "enableEditPagePrompt", "getEnableEditPagePrompt()Z"))};
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public cb f77550b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f77551c = LazyKt.lazy(f.INSTANCE);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f77552d = LazyKt.lazy(e.INSTANCE);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f77553e = LazyKt.lazy(d.INSTANCE);
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f77554f = LazyKt.lazy(a.INSTANCE);
    @NotNull
    private final Lazy g = LazyKt.lazy(b.INSTANCE);
    @NotNull
    private final Lazy h = LazyKt.lazy(c.INSTANCE);

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Integer> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final int invoke() {
            return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.NewEditPage);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Boolean> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        public final boolean invoke() {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EditPagePrompt);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<MutableLiveData<Object>> {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Object> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<MutableLiveData<Object>> {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<Object> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/vesdk/VEEditor;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<MutableLiveData<p>> {
        public static final f INSTANCE = new f();

        f() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<p> invoke() {
            return new MutableLiveData<>();
        }
    }

    @NotNull
    public final MutableLiveData<p> a() {
        return (MutableLiveData) this.f77551c.getValue();
    }

    @NotNull
    public final MutableLiveData<Object> c() {
        return (MutableLiveData) this.f77552d.getValue();
    }

    @NotNull
    public final MutableLiveData<Object> d() {
        return (MutableLiveData) this.f77553e.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> e() {
        return (MutableLiveData) this.f77554f.getValue();
    }

    public final int f() {
        return ((Number) this.g.getValue()).intValue();
    }

    public final boolean g() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @NotNull
    public final cb b() {
        cb cbVar = this.f77550b;
        if (cbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishEditModel");
        }
        return cbVar;
    }

    public final boolean h() {
        if (f() > 0) {
            return true;
        }
        return false;
    }
}
