package com.bytedance.android.live.core.a;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import java.util.List;

public final class o<V> extends j<String, V> {
    public static String a() {
        return "single.memory.list.cache.default.key";
    }

    public o() {
        this(p.f7819b);
    }

    private o(Function<String, Integer> function) {
        this(function, q.f7821b, r.f7823b);
    }

    private o(Function<String, Integer> function, Function4<String, List<V>, Integer, List<V>, List<V>> function4, BiFunction<String, List<V>, List<V>> biFunction) {
        super(function, function4, biFunction);
    }
}
