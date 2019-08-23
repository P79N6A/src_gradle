package com.ss.android.ugc.aweme.hybrid.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/AbstractSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ISession;", "preSession", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "(Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;)V", "isActivated", "", "()Z", "setActivated", "(Z)V", "getPreSession", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "begin", "", "id", "end", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49967a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f49968b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f49969c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final k f49970d;

    public void b() {
        this.f49969c = false;
    }

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f49967a, false, 49900, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49967a, false, 49900, new Class[0], String.class);
        }
        String str = this.f49968b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
        }
        return str;
    }

    public a(@Nullable k kVar) {
        this.f49970d = kVar;
    }

    public void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f49967a, false, 49902, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f49967a, false, 49902, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f49968b = str;
        this.f49969c = true;
    }

    public /* synthetic */ a(k kVar, int i) {
        this(null);
    }
}
