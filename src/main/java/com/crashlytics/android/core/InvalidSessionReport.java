package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InvalidSessionReport implements Report {
    private final Map<String, String> customHeaders = new HashMap(ReportUploader.HEADER_INVALID_CLS_FILE);
    private final File[] files;
    private final String identifier;

    public File[] getFiles() {
        return this.files;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public Report.Type getType() {
        return Report.Type.JAVA;
    }

    public Map<String, String> getCustomHeaders() {
        return Collections.unmodifiableMap(this.customHeaders);
    }

    public File getFile() {
        return this.files[0];
    }

    public String getFileName() {
        return this.files[0].getName();
    }

    public void remove() {
        for (File file : this.files) {
            new StringBuilder("Removing invalid report file at ").append(file.getPath());
            file.delete();
        }
    }

    public InvalidSessionReport(String str, File[] fileArr) {
        this.files = fileArr;
        this.identifier = str;
    }
}
