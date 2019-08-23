package com.ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.f;
import com.bytedance.jedi.ext.adapter.multitype.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0004B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediBaseRawAdapter;", "VH", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/ss/android/ugc/aweme/base/arch/MultiTypeAdapter;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolderFactoryManager;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "manager", "getManager", "()Lcom/bytedance/jedi/ext/adapter/JediViewHolderFactoryManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class JediBaseRawAdapter<VH extends JediViewHolder<? extends d, ?>> extends MultiTypeAdapter<VH, f<VH>> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final f<VH> f34638b;

    public final /* bridge */ /* synthetic */ c b() {
        return this.f34638b;
    }

    public JediBaseRawAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        f<VH> fVar = new f<>(lifecycleOwner);
        a((com.bytedance.jedi.ext.adapter.multitype.d<VH>) fVar);
        this.f34638b = fVar;
    }
}
