package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006R7\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "", "()V", "viewModels", "Ljava/util/HashMap;", "", "Landroid/arch/lifecycle/ViewModel;", "Lkotlin/collections/HashMap;", "getViewModels", "()Ljava/util/HashMap;", "viewModels$delegate", "Lkotlin/Lazy;", "clear", "", "get", "key", "put", "viewModel", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class JediViewHolderProxyViewModelStore {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JediViewHolderProxyViewModelStore.class), "viewModels", "getViewModels()Ljava/util/HashMap;"))};
    private final Lazy viewModels$delegate = LazyKt.lazy(JediViewHolderProxyViewModelStore$viewModels$2.INSTANCE);

    private final HashMap<String, ViewModel> getViewModels() {
        return (HashMap) this.viewModels$delegate.getValue();
    }

    public final void clear() {
        Collection<ViewModel> values = getViewModels().values();
        Intrinsics.checkExpressionValueIsNotNull(values, "viewModels.values");
        for (ViewModel onCleared : values) {
            onCleared.onCleared();
        }
        getViewModels().clear();
    }

    @Nullable
    public final ViewModel get(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return getViewModels().get(str);
    }

    public final void put(@NotNull String str, @NotNull ViewModel viewModel) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(viewModel, "viewModel");
        ViewModel put = getViewModels().put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
