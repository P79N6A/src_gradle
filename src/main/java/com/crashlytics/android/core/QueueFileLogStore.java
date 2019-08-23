package com.crashlytics.android.core;

import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class QueueFileLogStore implements FileLogStore {
    private u logFile;
    private final int maxLogSize;
    private final File workingFile;

    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public void closeLogFile() {
        i.a((Closeable) this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new u(this.workingFile);
            } catch (IOException unused) {
                new StringBuilder("Could not open log file: ").append(this.workingFile);
            }
        }
    }

    public ByteString getLogAsByteString() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        if (this.logFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[this.logFile.a()];
        try {
            this.logFile.a((u.c) new u.c() {
                public void read(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException unused) {
        }
        return new LogBytes(bArr, iArr[0]);
    }

    public QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }

    private void doWriteToLog(long j, String str) {
        if (this.logFile != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > this.maxLogSize / 4) {
                    str = "..." + str.substring(str.length() - r0);
                }
                this.logFile.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes("UTF-8"));
                while (!this.logFile.b() && this.logFile.a() > this.maxLogSize) {
                    this.logFile.c();
                }
            } catch (IOException unused) {
            }
        }
    }
}
