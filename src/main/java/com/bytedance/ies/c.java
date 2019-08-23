package com.bytedance.ies;

import java.util.List;
import javax.annotation.Nullable;

public interface c {
    @Nullable
    <T> T a(String str, Class<T> cls, T t);

    @Nullable
    <T> List<T> a(String str, Class<T> cls, List<T> list);
}
