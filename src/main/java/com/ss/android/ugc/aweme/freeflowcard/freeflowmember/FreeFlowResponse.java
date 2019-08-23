package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/FreeFlowResponse;", "", "()V", "flow", "", "getFlow", "()I", "setFlow", "(I)V", "fromLocalError", "", "getFromLocalError", "()Z", "setFromLocalError", "(Z)V", "isOrderFlow", "setOrderFlow", "isSupport", "setSupport", "orderType", "getOrderType", "setOrderType", "prompt", "", "getPrompt", "()Ljava/lang/String;", "setPrompt", "(Ljava/lang/String;)V", "statusCode", "getStatusCode", "setStatusCode", "threshold", "getThreshold", "setThreshold", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FreeFlowResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("flow")
    private int flow;
    private boolean fromLocalError;
    @SerializedName("is_order_flow")
    private boolean isOrderFlow;
    @SerializedName("is_support")
    private boolean isSupport;
    @SerializedName("order_type")
    private int orderType = 1;
    @SerializedName("prompt")
    @NotNull
    private String prompt = "";
    @SerializedName("status_code")
    private int statusCode;
    @SerializedName("threshold")
    private int threshold;

    public final int getFlow() {
        return this.flow;
    }

    public final boolean getFromLocalError() {
        return this.fromLocalError;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPrompt() {
        return this.prompt;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final boolean isOrderFlow() {
        return this.isOrderFlow;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    public final void setFlow(int i) {
        this.flow = i;
    }

    public final void setFromLocalError(boolean z) {
        this.fromLocalError = z;
    }

    public final void setOrderFlow(boolean z) {
        this.isOrderFlow = z;
    }

    public final void setOrderType(int i) {
        this.orderType = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setSupport(boolean z) {
        this.isSupport = z;
    }

    public final void setThreshold(int i) {
        this.threshold = i;
    }

    public final void setPrompt(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46098, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46098, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.prompt = str2;
    }
}
