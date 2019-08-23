package com.ss.android.ugc.aweme.hybrid.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiResultException;", "Ljava/lang/Exception;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IJsonFormatable;", "type", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "formatData", "Lorg/json/JSONObject;", "getFormatData", "()Lorg/json/JSONObject;", "getType", "()Ljava/lang/String;", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class c extends Exception implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String type;

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final JSONObject getFormatData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49910, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49910, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.type);
        StringBuilder sb = new StringBuilder();
        Throwable cause = getCause();
        if (cause == null) {
            Intrinsics.throwNpe();
        }
        sb.append(cause.getClass().getSimpleName());
        sb.append(": ");
        Throwable cause2 = getCause();
        if (cause2 == null) {
            Intrinsics.throwNpe();
        }
        sb.append(cause2.getMessage());
        jSONObject.put("error_message", sb.toString());
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
        Intrinsics.checkParameterIsNotNull(str, "type");
        Intrinsics.checkParameterIsNotNull(th, "cause");
        this.type = str;
    }
}
