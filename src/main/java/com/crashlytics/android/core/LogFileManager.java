package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;
import java.io.File;
import java.util.Set;

public class LogFileManager {
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    static final class NoopLogStore implements FileLogStore {
        public final void closeLogFile() {
        }

        public final void deleteLogFile() {
        }

        public final ByteString getLogAsByteString() {
            return null;
        }

        public final byte[] getLogAsBytes() {
            return null;
        }

        public final void writeToLog(long j, String str) {
        }

        private NoopLogStore() {
        }
    }

    /* access modifiers changed from: package-private */
    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    /* access modifiers changed from: package-private */
    public ByteString getByteStringForLog() {
        return this.currentLog.getLogAsByteString();
    }

    /* access modifiers changed from: package-private */
    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    private String getSessionIdForFile(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    private File getWorkingFileForSession(String str) {
        return new File(this.directoryProvider.getLogFileDir(), "crashlytics-userlog-" + str + ".temp");
    }

    /* access modifiers changed from: package-private */
    public void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null && i.a(this.context, "com.crashlytics.CollectCustomLogs", true)) {
            setLogFile(getWorkingFileForSession(str), 65536);
        }
    }

    LogFileManager(Context context2, DirectoryProvider directoryProvider2) {
        this(context2, directoryProvider2, null);
    }

    /* access modifiers changed from: package-private */
    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    /* access modifiers changed from: package-private */
    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    LogFileManager(Context context2, DirectoryProvider directoryProvider2, String str) {
        this.context = context2;
        this.directoryProvider = directoryProvider2;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }
}
