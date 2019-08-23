package com.tt.miniapphost;

import com.tt.miniapphost.dynamic.IStorageManager;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import java.util.Map;

@AnyProcess
public class StorageManager implements IStorageManager {
    private IStorageManager mImpl;

    public boolean cleanAllMiniAppStorage() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.cleanAllMiniAppStorage();
        }
        return false;
    }

    public Map<String, Long> getCachePathAndSize() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.getCachePathAndSize();
        }
        return null;
    }

    public Map<String, Long> getPathAndSize() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.getPathAndSize();
        }
        return null;
    }

    public long clear() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.clear();
        }
        return 0;
    }

    public long getCacheSize() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.getCacheSize();
        }
        return 0;
    }

    public long getTotalSize() {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.getTotalSize();
        }
        return 0;
    }

    private void initImpl() {
        if (this.mImpl == null) {
            try {
                Class<?> cls = Class.forName("com.tt.miniapp.storage.StorageManagerImpl");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
                if (invoke != null) {
                    this.mImpl = (IStorageManager) invoke;
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "StorageManager", e2.getStackTrace());
            }
        }
    }

    public boolean cleanMiniAppStorage(String str) {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.cleanMiniAppStorage(str);
        }
        return false;
    }

    @HostProcess
    public boolean removeMiniApp(String str) {
        initImpl();
        if (this.mImpl != null) {
            return this.mImpl.removeMiniApp(str);
        }
        return false;
    }
}
