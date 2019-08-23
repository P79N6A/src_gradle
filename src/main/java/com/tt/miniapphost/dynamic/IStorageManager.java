package com.tt.miniapphost.dynamic;

import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.Map;

public interface IStorageManager {
    @AnyProcess
    boolean cleanAllMiniAppStorage();

    @AnyProcess
    boolean cleanMiniAppStorage(String str);

    @AnyProcess
    long clear();

    @AnyProcess
    Map<String, Long> getCachePathAndSize();

    @AnyProcess
    long getCacheSize();

    @AnyProcess
    Map<String, Long> getPathAndSize();

    @AnyProcess
    long getTotalSize();

    @AnyProcess
    boolean removeMiniApp(String str);
}
