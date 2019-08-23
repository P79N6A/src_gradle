package com.bytedance.boost_multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class Locker {
    private FileLock cacheLock;
    private FileChannel lockChannel;
    private File lockFile;
    private RandomAccessFile lockRaf;

    Locker(File file) {
        this.lockFile = file;
    }

    /* access modifiers changed from: package-private */
    public void close() {
        if (this.cacheLock != null) {
            try {
                this.cacheLock.release();
            } catch (IOException unused) {
            }
        }
        Utility.closeQuietly(this.lockChannel);
        Utility.closeQuietly(this.lockRaf);
        Monitor monitor = Monitor.get();
        monitor.logInfo("Release lock " + this.lockFile.getPath());
    }

    /* access modifiers changed from: package-private */
    public void lock() {
        this.lockRaf = new RandomAccessFile(this.lockFile, "rw");
        try {
            this.lockChannel = this.lockRaf.getChannel();
            Monitor monitor = Monitor.get();
            monitor.logInfo("Blocking on lock " + this.lockFile.getPath());
            this.cacheLock = this.lockChannel.lock();
            Monitor monitor2 = Monitor.get();
            monitor2.logInfo(this.lockFile.getPath() + " locked");
        } catch (IOException e2) {
            Utility.closeQuietly(this.lockChannel);
            throw e2;
        } catch (IOException e3) {
            Utility.closeQuietly(this.lockRaf);
            throw e3;
        }
    }
}
