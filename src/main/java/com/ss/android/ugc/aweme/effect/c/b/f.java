package com.ss.android.ugc.aweme.effect.c.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/persistence/task/UUIDTaskIDGenerator;", "Lcom/ss/android/ugc/aweme/effect/persistence/task/ITaskIDGenerator;", "()V", "nextTaskID", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43739a;

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f43739a, false, 38903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43739a, false, 38903, new Class[0], String.class);
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}
