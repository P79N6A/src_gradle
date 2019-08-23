package com.ss.android.ugc.aweme.effect.c.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH$¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTaskFactory;", "Param", "Target", "", "idGenerator", "Lcom/ss/android/ugc/aweme/effect/persistence/task/ITaskIDGenerator;", "(Lcom/ss/android/ugc/aweme/effect/persistence/task/ITaskIDGenerator;)V", "createTask", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "param", "(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "onCreateTask", "taskID", "", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class c<Param, Target> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43734a;

    /* renamed from: b  reason: collision with root package name */
    private final a f43735b;

    @NotNull
    public abstract b<Param, Target> a(Param param, @NotNull String str);

    private c(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "idGenerator");
        this.f43735b = aVar;
    }

    @NotNull
    public final b<Param, Target> a(Param param) {
        if (!PatchProxy.isSupport(new Object[]{param}, this, f43734a, false, 38902, new Class[]{Object.class}, b.class)) {
            return a(param, this.f43735b.a());
        }
        return (b) PatchProxy.accessDispatch(new Object[]{param}, this, f43734a, false, 38902, new Class[]{Object.class}, b.class);
    }

    public /* synthetic */ c(a aVar, int i) {
        this(new f());
    }
}
