package com.ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements ViewModelProvider.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34650a;

    public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f34650a, false, 24534, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f34650a, false, 24534, new Class[]{Class.class}, ViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
        return (ViewModel) cls.newInstance();
    }
}
