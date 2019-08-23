package com.tt.option.net;

import com.tt.miniapphost.process.annotation.AnyProcess;

public interface HostOptionNetDepend {

    public interface IDownloadListener {
        @AnyProcess
        void updateProgress(int i, long j, long j2);
    }

    @AnyProcess
    TmaResponse doGet(TmaRequest tmaRequest) throws Exception;

    @AnyProcess
    TmaResponse doPostBody(TmaRequest tmaRequest) throws Exception;

    @AnyProcess
    TmaFileResponse downloadFile(TmaFileRequest tmaFileRequest, IDownloadListener iDownloadListener) throws Exception;

    @AnyProcess
    TmaResponse postMultiPart(TmaRequest tmaRequest) throws Exception;
}
