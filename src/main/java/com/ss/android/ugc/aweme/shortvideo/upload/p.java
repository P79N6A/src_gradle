package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.ttuploader.TTVideoInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/UploadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "info", "Lcom/ss/ttuploader/TTVideoInfo;", "(Lcom/ss/ttuploader/TTVideoInfo;)V", "mInfo", "getErrorCode", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final TTVideoInfo mInfo;

    public final long getErrorCode() {
        TTVideoInfo tTVideoInfo = this.mInfo;
        if (tTVideoInfo != null) {
            return tTVideoInfo.mErrcode;
        }
        return 0;
    }

    public p(@Nullable TTVideoInfo tTVideoInfo) {
        this.mInfo = tTVideoInfo;
    }
}
