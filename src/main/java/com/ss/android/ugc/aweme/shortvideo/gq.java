package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;

public final class gq extends RuntimeException {
    public static int FAIL_CODE_PRODUCE_DATA = 1001;
    public static ChangeQuickRedirect changeQuickRedirect;
    SynthetiseResult result;

    public final SynthetiseResult getResult() {
        return this.result;
    }

    public final int getCode() {
        return this.result.ret;
    }

    public gq(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.result = synthetiseResult;
    }

    public gq(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.result = synthetiseResult;
    }
}
