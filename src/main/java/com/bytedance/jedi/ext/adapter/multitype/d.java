package com.bytedance.jedi.ext.adapter.multitype;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003JY\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002'\b\u0002\u0010\u0005\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\u000fH&J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u00072 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\u000fH'¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryRegistry;", "VH", "Lcom/bytedance/jedi/ext/adapter/multitype/MultiTypeViewHolder;", "", "register", "typeMatcher", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderTypeMatcher;", "factory", "Landroid/view/ViewGroup;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactory;", "viewType", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public interface d<VH extends MultiTypeViewHolder<?>> {
    @NotNull
    @Deprecated(message = "use register with typeMatcher, and call findItemViewType in getItemViewType")
    d<VH> a(int i, @NotNull Function1<? super ViewGroup, ? extends VH> function1);
}
