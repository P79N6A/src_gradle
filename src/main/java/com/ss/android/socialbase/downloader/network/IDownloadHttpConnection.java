package com.ss.android.socialbase.downloader.network;

import java.io.IOException;
import java.io.InputStream;

public interface IDownloadHttpConnection extends c {
    void end();

    InputStream getInputStream() throws IOException;
}
