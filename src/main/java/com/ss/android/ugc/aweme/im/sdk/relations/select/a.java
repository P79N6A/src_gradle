package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u0005*\u0002H\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u000e\b\u0006\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0002\u0010\r\u001ak\u0010\u000e\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0003*\u00020\u000f\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u0005*\u0002H\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u000e\b\u0006\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0019\b\n\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0011¢\u0006\u0002\b\u0012H\b¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"activityViewModel", "Lkotlin/Lazy;", "VM", "T", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "Landroid/arch/lifecycle/ViewModel;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "viewModelClass", "Lkotlin/reflect/KClass;", "keyFactory", "Lkotlin/Function0;", "", "(Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;Landroid/arch/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "viewModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelFactoryOwner;", "argumentsAcceptor", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelFactoryOwner;Landroid/arch/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroid/arch/lifecycle/ViewModel;", "im.base_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0004*\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "VM", "T", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelFactoryOwner;", "Landroid/arch/lifecycle/ViewModel;", "invoke", "(Landroid/arch/lifecycle/ViewModel;)Landroid/arch/lifecycle/ViewModel;"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$a  reason: collision with other inner class name */
    public static final class C0607a extends Lambda implements Function1<VM, VM> {
        public static final C0607a INSTANCE = new C0607a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0607a() {
            super(1);
        }

        @NotNull
        public final VM invoke(@NotNull VM vm) {
            VM vm2 = vm;
            if (PatchProxy.isSupport(new Object[]{vm2}, this, changeQuickRedirect, false, 52999, new Class[]{ViewModel.class}, ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[]{vm2}, this, changeQuickRedirect, false, 52999, new Class[]{ViewModel.class}, ViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(vm2, "$receiver");
            return vm2;
        }
    }
}
