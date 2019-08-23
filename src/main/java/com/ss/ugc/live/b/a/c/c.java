package com.ss.ugc.live.b.a.c;

import com.ss.ugc.live.b.a.b.a;

public final class c extends a {
    private a mDownloadRequest;
    private int mErrorCode;

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public final String getMessage() {
        return this.mDownloadRequest.toString() + "\n" + super.getMessage();
    }

    public c(com.ss.ugc.live.b.a.c cVar, int i, a aVar) {
        super(cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }

    public c(String str, com.ss.ugc.live.b.a.c cVar, int i, a aVar) {
        super(str, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }

    public c(String str, Throwable th, com.ss.ugc.live.b.a.c cVar, int i, a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }
}
