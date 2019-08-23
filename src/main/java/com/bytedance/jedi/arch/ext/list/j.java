package com.bytedance.jedi.arch.ext.list;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0000\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0003`\u0004\"\u0004\b\u0000\u0010\u0003\u001a:\u0010\u0005\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0003`\u0004\"\u0004\b\u0000\u0010\u0003\u001a:\u0010\u0006\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0003`\u0004\"\u0004\b\u0000\u0010\u0003*X\u0010\u0007\u001a\u0004\b\u0000\u0010\u0003\"&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001¨\u0006\b"}, d2 = {"Append", "Lkotlin/Function2;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/LoadStrategy;", "Prepend", "Replace", "LoadStrategy", "ext_list_release"}, k = 2, mv = {1, 1, 15})
public final class j {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "list", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<List<? extends T>, List<? extends T>, List<? extends T>> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @NotNull
        public final List<T> invoke(@NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            Intrinsics.checkParameterIsNotNull(list2, "loadMore");
            return CollectionsKt.plus((Collection<? extends T>) list, (Iterable<? extends T>) list2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "list", "refresh", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<List<? extends T>, List<? extends T>, List<? extends T>> {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @NotNull
        public final List<T> invoke(@NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            Intrinsics.checkParameterIsNotNull(list2, "refresh");
            if (!list2.isEmpty()) {
                return list2;
            }
            return list;
        }
    }

    @NotNull
    public static final <T> Function2<List<? extends T>, List<? extends T>, List<T>> a() {
        return b.INSTANCE;
    }

    @NotNull
    public static final <T> Function2<List<? extends T>, List<? extends T>, List<T>> b() {
        return a.INSTANCE;
    }
}
