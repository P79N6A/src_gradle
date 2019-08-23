package com.ss.android.ugc.aweme.shortvideo.cut;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/CacheWriterAndReader;", "T", "", "read", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoFrameData;", "inputStream", "Ljava/io/InputStream;", "write", "", "outputStream", "Ljava/io/OutputStream;", "cacheData", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b<T> {
    @NotNull
    as<T> a(@NotNull InputStream inputStream);

    void a(@NotNull OutputStream outputStream, @NotNull as<T> asVar);
}
