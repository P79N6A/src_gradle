package com.ss.android.ugc.aweme.filter.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.b.c;
import com.ss.android.ugc.aweme.filter.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/downloader/FilterDownloaderFactory;", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTaskFactory;", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "Ljava/lang/Void;", "()V", "onCreateTask", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "param", "taskID", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends c<h, Void> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f47460b;

    public b() {
        super(null, 1);
    }

    public final /* synthetic */ com.ss.android.ugc.aweme.effect.c.b.b a(Object obj, String str) {
        String str2 = str;
        h hVar = (h) obj;
        if (PatchProxy.isSupport(new Object[]{hVar, str2}, this, f47460b, false, 44446, new Class[]{h.class, String.class}, com.ss.android.ugc.aweme.effect.c.b.b.class)) {
            return (com.ss.android.ugc.aweme.effect.c.b.b) PatchProxy.accessDispatch(new Object[]{hVar, str2}, this, f47460b, false, 44446, new Class[]{h.class, String.class}, com.ss.android.ugc.aweme.effect.c.b.b.class);
        }
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        Intrinsics.checkParameterIsNotNull(str2, "taskID");
        return new a(str2, hVar);
    }
}
