package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SessionReport implements Report {
    private final Map<String, String> customHeaders;
    private final File file;
    private final File[] files;

    public File getFile() {
        return this.file;
    }

    public File[] getFiles() {
        return this.files;
    }

    public Report.Type getType() {
        return Report.Type.JAVA;
    }

    public Map<String, String> getCustomHeaders() {
        return Collections.unmodifiableMap(this.customHeaders);
    }

    public String getFileName() {
        return getFile().getName();
    }

    public String getIdentifier() {
        String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    public void remove() {
        new StringBuilder("Removing report at ").append(this.file.getPath());
        this.file.delete();
    }

    public SessionReport(File file2) {
        this(file2, Collections.emptyMap());
    }

    public SessionReport(File file2, Map<String, String> map) {
        this.file = file2;
        this.files = new File[]{file2};
        this.customHeaders = new HashMap(map);
        if (this.file.length() == 0) {
            this.customHeaders.putAll(ReportUploader.HEADER_INVALID_CLS_FILE);
        }
    }
}
