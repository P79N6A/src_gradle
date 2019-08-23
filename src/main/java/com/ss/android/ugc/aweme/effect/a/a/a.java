package com.ss.android.ugc.aweme.effect.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/download/config/DefaultEffectDownloadStrategy;", "Lcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadStrategy;", "()V", "callbackInMainThread", "", "enableAutoDownload", "maxRetryCount", "", "onGetNextDownloadEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "queue", "Ljava/util/Queue;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43652a;

    @Nullable
    public final Effect a(@NotNull Queue<Effect> queue) {
        Queue<Effect> queue2 = queue;
        if (PatchProxy.isSupport(new Object[]{queue2}, this, f43652a, false, 38850, new Class[]{Queue.class}, Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[]{queue2}, this, f43652a, false, 38850, new Class[]{Queue.class}, Effect.class);
        }
        Intrinsics.checkParameterIsNotNull(queue2, "queue");
        return null;
    }
}
