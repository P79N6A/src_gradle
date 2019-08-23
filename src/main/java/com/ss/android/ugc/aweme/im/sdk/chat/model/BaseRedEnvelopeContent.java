package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseRedEnvelopeContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "()V", "redEnvelopeTitle", "", "getRedEnvelopeTitle", "()Ljava/lang/String;", "setRedEnvelopeTitle", "(Ljava/lang/String;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class BaseRedEnvelopeContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private String redEnvelopeTitle = "";

    @NotNull
    public final String getRedEnvelopeTitle() {
        return this.redEnvelopeTitle;
    }

    public final void setRedEnvelopeTitle(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 51105, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 51105, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.redEnvelopeTitle = str2;
    }
}
