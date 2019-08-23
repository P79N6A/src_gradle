package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;
import java.io.File;
import java.util.Map;

public class NativeSessionReport implements Report {
    private final File reportDirectory;

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public Report.Type getType() {
        return Report.Type.NATIVE;
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public void remove() {
        for (File file : getFiles()) {
            new StringBuilder("Removing native report file at ").append(file.getPath());
            file.delete();
        }
        new StringBuilder("Removing native report directory at ").append(this.reportDirectory);
        this.reportDirectory.delete();
    }

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }
}
