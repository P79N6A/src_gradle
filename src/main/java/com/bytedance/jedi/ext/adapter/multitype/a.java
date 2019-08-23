package com.bytedance.jedi.ext.adapter.multitype;

import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/GenericViewHolderFactoryManagerOwner;", "VH", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "M", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "", "manager", "getManager", "()Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public interface a<VH extends MultiTypeViewHolder<?>, M extends c<VH>> {
    @NotNull
    M b();
}
