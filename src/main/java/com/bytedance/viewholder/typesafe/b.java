package com.bytedance.viewholder.typesafe;

import android.view.ViewGroup;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00028\u00000\bj\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\nH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "VH", "Lcom/bytedance/viewholder/typesafe/TypeSafeViewHolder;", "", "register", "viewType", "", "factory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactory;", "typesafe_viewholder_release"}, k = 1, mv = {1, 1, 13})
public interface b<VH extends TypeSafeViewHolder<?>> {
    @NotNull
    b<VH> a(int i, @NotNull Function1<? super ViewGroup, ? extends VH> function1);
}
