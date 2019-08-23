package com.bytedance.g.c;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\b"}, d2 = {"append", "", "T", "t", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "prepend", "vast"}, k = 2, mv = {1, 1, 13})
public final class a {
    @NotNull
    public static final <T> List<T> a(@Nullable List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(t);
        return list;
    }

    @NotNull
    public static final <T> List<T> b(@Nullable List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(0, t);
        return list;
    }

    @NotNull
    public static final <T> Set<T> a(@Nullable Set<T> set, T t) {
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(t);
        return set;
    }
}
