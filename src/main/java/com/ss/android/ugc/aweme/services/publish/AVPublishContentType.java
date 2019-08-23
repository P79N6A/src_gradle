package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/AVPublishContentType;", "", "contentType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "Video", "PhotoMovie", "Photo", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public enum AVPublishContentType {
    Video("video"),
    PhotoMovie("video"),
    Photo("photo");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String contentType;

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    private AVPublishContentType(String str) {
        this.contentType = str;
    }
}
