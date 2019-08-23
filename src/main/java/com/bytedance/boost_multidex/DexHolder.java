package com.bytedance.boost_multidex;

import com.bytedance.boost_multidex.DexLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;

public abstract class DexHolder {
    File mFile;

    static class ApkBuffer extends DexHolder {
        private byte[] mBytes;
        private int mIndex;
        private File mOptFile;

        ApkBuffer(int i, byte[] bArr, File file, File file2) {
            this.mIndex = i;
            this.mBytes = bArr;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return null;
        }

        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(null, this.mBytes);
            } catch (Exception e2) {
                Monitor monitor = Monitor.get();
                monitor.logError("Fail to create DexFile: " + toString(), e2);
                Result.get().unFatalThrowable.add(e2);
                return null;
            }
        }

        public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
            Object dexFile = toDexFile();
            if (dexFile == null) {
                return null;
            }
            return elementConstructor.newInstance(null, dexFile);
        }

        public DexHolder toFasterHolder() {
            if (Utility.storeBytesToFile(this.mBytes, this.mFile)) {
                return new DexBuffer(this.mIndex, this.mFile, this.mOptFile);
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("], bytes len: ");
            sb.append(this.mBytes == null ? null : Integer.valueOf(this.mBytes.length));
            return sb.toString();
        }
    }

    static class DexBuffer extends DexHolder {
        private byte[] mBytes;
        private int mIndex;
        private File mOptFile;

        DexBuffer(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return new StoreInfo(1, this.mIndex, this.mFile);
        }

        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(this.mFile.getPath(), this.mBytes);
            } catch (Exception e2) {
                Monitor monitor = Monitor.get();
                monitor.logError("Fail to create DexFile: " + toString(), e2);
                Result.get().unFatalThrowable.add(e2);
                return null;
            }
        }

        public DexHolder toFasterHolder() {
            try {
                DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0).close();
                return new DexOpt(this.mIndex, this.mFile, this.mOptFile, false);
            } catch (IOException unused) {
                return null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("], bytes len: ");
            sb.append(this.mBytes == null ? null : Integer.valueOf(this.mBytes.length));
            return sb.toString();
        }
    }

    static class DexOpt extends DexHolder {
        private boolean mForceOpt;
        private int mIndex;
        private File mOptFile;

        DexOpt(int i, File file, File file2, boolean z) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
            this.mForceOpt = z;
        }

        public StoreInfo getInfo() {
            return new StoreInfo(2, this.mIndex, this.mOptFile);
        }

        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e2) {
                Monitor.get().logError("Fail to load dex file first time", e2);
                try {
                    return this.mForceOpt ? DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0) : BoostNative.loadDirectDex(this.mFile.getPath(), null);
                } catch (IOException e3) {
                    Monitor.get().logError("Fail to load dex file", e3);
                    throw new RuntimeException(e3);
                }
            }
        }

        public DexHolder toFasterHolder() {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "], force: " + this.mForceOpt;
        }
    }

    class StoreInfo {
        File file;
        int index;
        int type;

        StoreInfo(int i, int i2, File file2) {
            this.type = i;
            this.index = i2;
            this.file = file2;
        }
    }

    static class ZipOpt extends DexHolder {
        private int mIndex;
        private File mOptFile;

        ZipOpt(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return null;
        }

        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e2) {
                Monitor.get().logError("Fail to load dex file");
                throw new RuntimeException(e2);
            }
        }

        public DexHolder toFasterHolder() {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "]";
        }
    }

    DexHolder() {
    }

    /* access modifiers changed from: package-private */
    public abstract StoreInfo getInfo();

    /* access modifiers changed from: package-private */
    public abstract Object toDexFile();

    /* access modifiers changed from: protected */
    public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
        Object dexFile = toDexFile();
        if (dexFile == null) {
            return null;
        }
        return elementConstructor.newInstance(this.mFile, dexFile);
    }

    /* access modifiers changed from: package-private */
    public abstract DexHolder toFasterHolder();
}
