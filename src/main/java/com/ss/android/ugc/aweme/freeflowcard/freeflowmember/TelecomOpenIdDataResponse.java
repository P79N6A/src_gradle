package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomOpenIdDataResponse;", "", "()V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "msg", "getMsg", "setMsg", "resCode", "", "getResCode", "()I", "setResCode", "(I)V", "resMsg", "getResMsg", "setResMsg", "result", "getResult", "setResult", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TelecomOpenIdDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    @NotNull
    private String data = "";
    @SerializedName("msg")
    @NotNull
    private String msg = "";
    @SerializedName("resCode")
    private int resCode;
    @SerializedName("resMsg")
    @NotNull
    private String resMsg = "";
    @SerializedName("result")
    private int result;

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final int getResCode() {
        return this.resCode;
    }

    @NotNull
    public final String getResMsg() {
        return this.resMsg;
    }

    public final int getResult() {
        return this.result;
    }

    public final void setResCode(int i) {
        this.resCode = i;
    }

    public final void setResult(int i) {
        this.result = i;
    }

    public final void setData(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46128, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46128, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.data = str2;
    }

    public final void setMsg(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46127, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46127, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.msg = str2;
    }

    public final void setResMsg(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46126, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46126, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.resMsg = str2;
    }
}
