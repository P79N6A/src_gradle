package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.JediViewHolderProxyViewModelStore;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0002\b\u00030\u00030\u0002R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/IJediViewHolderProxy;", "Lcom/bytedance/jedi/arch/LifecycleOwnerHolder;", "Lcom/bytedance/jedi/arch/ReceiverHolder;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "store", "Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "getStore", "()Landroid/arch/lifecycle/JediViewHolderProxyViewModelStore;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public interface b extends k, r<JediViewHolder<? extends d, ?>> {
    @NotNull
    JediViewHolderProxyViewModelStore b();
}
