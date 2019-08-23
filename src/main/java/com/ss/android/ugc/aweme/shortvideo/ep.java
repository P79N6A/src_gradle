package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/PublisherLogger;", "", "publisher", "(Ljava/lang/Object;)V", "getPublisher", "()Ljava/lang/Object;", "log", "", "text", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67584a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Object f67585b;

    public ep(@NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "publisher");
        this.f67585b = obj;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67584a, false, 74495, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f67584a, false, 74495, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "text");
        a.a();
        ai.d(this.f67585b + ' ' + str2);
    }
}
