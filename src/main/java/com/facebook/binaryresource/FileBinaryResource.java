package com.facebook.binaryresource;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileBinaryResource implements BinaryResource {
    private final File mFile;

    public File getFile() {
        return this.mFile;
    }

    public int hashCode() {
        return this.mFile.hashCode();
    }

    public InputStream openStream() throws IOException {
        return new FileInputStream(this.mFile);
    }

    public byte[] read() throws IOException {
        return e.a(this.mFile);
    }

    public long size() {
        return this.mFile.length();
    }

    private FileBinaryResource(File file) {
        this.mFile = (File) Preconditions.checkNotNull(file);
    }

    public static FileBinaryResource createOrNull(File file) {
        if (file != null) {
            return new FileBinaryResource(file);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FileBinaryResource)) {
            return false;
        }
        return this.mFile.equals(((FileBinaryResource) obj).mFile);
    }
}
