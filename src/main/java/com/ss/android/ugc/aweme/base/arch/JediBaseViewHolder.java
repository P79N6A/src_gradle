package com.ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.ViewModelProvider;
import android.view.View;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewHolder;", "R", "Lcom/bytedance/jedi/arch/IReceiver;", "ITEM", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "setViewModelFactory", "(Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class JediBaseViewHolder<R extends d, ITEM> extends JediViewHolder<R, ITEM> implements ae<c> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public c f34641a = new c();

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f34641a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediBaseViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
