package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;

public final class aa implements FileFilter {
    aa() {
    }

    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
