package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "getChildJobCancellationCause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = a.ERROR, message = "This is internal API and may be removed in the future releases")
@InternalCoroutinesApi
public interface bw extends bk {
    @NotNull
    @InternalCoroutinesApi
    Throwable o();
}
