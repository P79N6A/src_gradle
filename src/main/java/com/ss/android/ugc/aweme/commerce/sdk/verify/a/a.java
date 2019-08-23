package com.ss.android.ugc.aweme.commerce.sdk.verify.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/dto/VerifyStatusDTO;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Ljava/io/Serializable;", "()V", "agreementCommit", "", "getAgreementCommit", "()Z", "setAgreementCommit", "(Z)V", "openId", "", "getOpenId", "()J", "setOpenId", "(J)V", "schemaUrl", "", "getSchemaUrl", "()Ljava/lang/String;", "setSchemaUrl", "(Ljava/lang/String;)V", "taobaoUser", "getTaobaoUser", "setTaobaoUser", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.commerce.service.d.a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("agreement_commit")
    private boolean agreementCommit;
    @SerializedName("open_id")
    private long openId;
    @SerializedName("taobao_open_url")
    @Nullable
    private String schemaUrl = "";
    @SerializedName("taobao_user")
    private boolean taobaoUser;

    public final boolean getAgreementCommit() {
        return this.agreementCommit;
    }

    public final long getOpenId() {
        return this.openId;
    }

    @Nullable
    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final boolean getTaobaoUser() {
        return this.taobaoUser;
    }

    public final void setAgreementCommit(boolean z) {
        this.agreementCommit = z;
    }

    public final void setOpenId(long j) {
        this.openId = j;
    }

    public final void setSchemaUrl(@Nullable String str) {
        this.schemaUrl = str;
    }

    public final void setTaobaoUser(boolean z) {
        this.taobaoUser = z;
    }
}
