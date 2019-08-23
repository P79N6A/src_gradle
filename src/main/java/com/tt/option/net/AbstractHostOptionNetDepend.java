package com.tt.option.net;

import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;
import com.tt.option.net.HostOptionNetDepend;

public class AbstractHostOptionNetDepend extends BaseAbstractHostDepend<HostOptionNetDepend> implements HostOptionNetDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionNetDependImpl";
    }

    @AnyProcess
    public TmaResponse doGet(TmaRequest tmaRequest) throws Exception {
        if (inject()) {
            return ((HostOptionNetDepend) this.defaultOptionDepend).doGet(tmaRequest);
        }
        return null;
    }

    @AnyProcess
    public TmaResponse doPostBody(TmaRequest tmaRequest) throws Exception {
        if (inject()) {
            return ((HostOptionNetDepend) this.defaultOptionDepend).doPostBody(tmaRequest);
        }
        return null;
    }

    @AnyProcess
    public TmaResponse postMultiPart(TmaRequest tmaRequest) throws Exception {
        if (inject()) {
            return ((HostOptionNetDepend) this.defaultOptionDepend).postMultiPart(tmaRequest);
        }
        return null;
    }

    @AnyProcess
    public TmaFileResponse downloadFile(TmaFileRequest tmaFileRequest, HostOptionNetDepend.IDownloadListener iDownloadListener) throws Exception {
        if (inject()) {
            return ((HostOptionNetDepend) this.defaultOptionDepend).downloadFile(tmaFileRequest, iDownloadListener);
        }
        return null;
    }
}
