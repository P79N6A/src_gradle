package com.bytedance.jedi.arch.ext.list;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"4\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"hasMore", "Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "getHasMore", "(Lcom/bytedance/jedi/arch/ext/list/ListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "ext_list_release"}, k = 2, mv = {1, 1, 15})
public final class i {
    public static final <T, P extends k> b a(@NotNull ListState<T, P> listState) {
        return listState.getPayload().f21387a;
    }
}
