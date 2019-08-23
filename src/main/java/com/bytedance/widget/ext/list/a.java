package com.bytedance.widget.ext.list;

import android.arch.lifecycle.ItemViewModelStore;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemViewModelProvider;", "", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/ItemViewModelStore;", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;Landroid/arch/lifecycle/ItemViewModelStore;)V", "get", "VM", "Landroid/arch/lifecycle/ViewModel;", "key", "", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "Companion", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0243a f22916a = new C0243a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ViewModelProvider.Factory f22917b;

    /* renamed from: c  reason: collision with root package name */
    private final ItemViewModelStore f22918c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/widget/ext/list/ItemViewModelProvider$Companion;", "", "()V", "of", "Lcom/bytedance/widget/ext/list/ItemViewModelProvider;", "factory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "store", "Landroid/arch/lifecycle/ItemViewModelStore;", "widget_ext_list_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.widget.ext.list.a$a  reason: collision with other inner class name */
    public static final class C0243a {
        private C0243a() {
        }

        public /* synthetic */ C0243a(byte b2) {
            this();
        }

        @NotNull
        public static a a(@NotNull ViewModelProvider.Factory factory, @NotNull ItemViewModelStore itemViewModelStore) {
            Intrinsics.checkParameterIsNotNull(factory, "factory");
            Intrinsics.checkParameterIsNotNull(itemViewModelStore, "store");
            return new a(factory, itemViewModelStore);
        }
    }

    public a(@NotNull ViewModelProvider.Factory factory, @NotNull ItemViewModelStore itemViewModelStore) {
        Intrinsics.checkParameterIsNotNull(factory, "factory");
        Intrinsics.checkParameterIsNotNull(itemViewModelStore, "store");
        this.f22917b = factory;
        this.f22918c = itemViewModelStore;
    }

    @NotNull
    public final <VM extends ViewModel> VM a(@NotNull String str, @NotNull Class<VM> cls) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        VM vm = this.f22918c.get(str);
        if (!cls.isInstance(vm)) {
            VM create = this.f22917b.create(cls);
            ItemViewModelStore itemViewModelStore = this.f22918c;
            Intrinsics.checkExpressionValueIsNotNull(create, AdvanceSetting.NETWORK_TYPE);
            itemViewModelStore.put(str, create);
            Intrinsics.checkExpressionValueIsNotNull(create, "factory.create<VM>(clazz…re.put(key, it)\n        }");
            return create;
        } else if (vm != null) {
            return vm;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type VM");
        }
    }
}
