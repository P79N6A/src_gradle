package com.bytedance.jedi.model.c;

import com.bytedance.jedi.model.c.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"optional", "Lcom/bytedance/jedi/model/datasource/Optional;", "T", "(Ljava/lang/Object;)Lcom/bytedance/jedi/model/datasource/Optional;", "model_release"}, k = 2, mv = {1, 1, 15})
public final class g {
    @NotNull
    public static final <T> f<T> a(@Nullable T t) {
        if (t == null) {
            return f.a.a();
        }
        return new f<>(t);
    }
}
