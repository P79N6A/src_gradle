package com.ss.android.ugc.aweme;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/AccountServiceProvider;", "", "getService", "Lcom/ss/android/ugc/aweme/framework/services/ServiceProvider;", "T", "clazz", "Ljava/lang/Class;", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public interface c {
    @Nullable
    <T> ServiceProvider<T> a(@NotNull Class<T> cls);
}
