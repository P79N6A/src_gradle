package com.bytedance.jedi.arch;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\f\b\u0000\u0010\u0007*\u00020\b*\u00020\t\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\b¢\u0006\u0002\u0010\u0012\u001ab\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\f\b\u0000\u0010\u0007*\u00020\b*\u00020\t\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\b¢\u0006\u0002\u0010\u0012\u001ab\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\f\b\u0000\u0010\u0007*\u00020\b*\u00020\t\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\b¢\u0006\u0002\u0010\u0012\u001a\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0014\b\u0000\u0010\u0007*\u00020\b*\u00020\t*\u0006\u0012\u0002\b\u00030\u0017\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102!\b\n\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u0002H\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u0002H\u000b0\u0019¢\u0006\u0002\b\u001bH\b¢\u0006\u0002\u0010\u001c\u001a\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0016\"\u0014\b\u0000\u0010\u0007*\u00020\u001d*\u00020\t*\u0006\u0012\u0002\b\u00030\u0017\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102!\b\n\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u0002H\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u0002H\u000b0\u0019¢\u0006\u0002\b\u001bH\b¢\u0006\u0002\u0010\u001e\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, d2 = {"assertionFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getAssertionFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "activityViewModel", "Lkotlin/Lazy;", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "viewModelClass", "Lkotlin/reflect/KClass;", "keyFactory", "Lkotlin/Function0;", "", "(Landroid/support/v4/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "hostViewModel", "parentFragmentViewModel", "viewModel", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "argumentsAcceptor", "Lkotlin/Function2;", "Landroid/os/Bundle;", "Lkotlin/ExtensionFunctionType;", "(Landroid/support/v4/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "arch_release"}, k = 2, mv = {1, 1, 15})
public final class b {
    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a  reason: collision with root package name */
    private static final ViewModelProvider.Factory f21346a = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/bytedance/jedi/arch/ExtensionsKt$assertionFactory$1", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "arch_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements ViewModelProvider.Factory {
        a() {
        }

        public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            throw new af(cls.getSimpleName() + " should be created in the host before being used.");
        }
    }

    @NotNull
    public static final ViewModelProvider.Factory a() {
        return f21346a;
    }
}
