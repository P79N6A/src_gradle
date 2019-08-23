package com.bytedance.jedi.arch;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JM\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u0007\"\u0014\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/arch/MiddlewareBindingFactory;", "", "create", "T", "S", "Lcom/bytedance/jedi/arch/State;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/bytedance/jedi/arch/MiddlewareBinding;", "arch_release"}, k = 1, mv = {1, 1, 15})
public interface o {
    @Nullable
    <S extends x, VM extends JediViewModel<S>, T extends n<S, VM>> T a(@NotNull Class<VM> cls);
}
