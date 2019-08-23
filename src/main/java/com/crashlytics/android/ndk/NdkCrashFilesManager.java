package com.crashlytics.android.ndk;

import io.fabric.sdk.android.services.b.w;
import io.fabric.sdk.android.services.e.a;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class NdkCrashFilesManager implements CrashFilesManager {
    private static final FileFilter ONLY_DIRECTORIES_FILTER = new FileFilter() {
        public final boolean accept(File file) {
            return file.isDirectory();
        }
    };
    private final a fileStore;

    private File getNativeRootFileDirectory() {
        return new File(this.fileStore.a(), "native");
    }

    public TreeSet<File> getAllNativeDirectories() {
        return getAllTimestampedDirectories(getNativeRootFileDirectory());
    }

    public File getNewNativeDirectory() {
        File nativeRootFileDirectory = getNativeRootFileDirectory();
        if (!nativeRootFileDirectory.isDirectory() && !nativeRootFileDirectory.mkdir()) {
            return null;
        }
        File file = new File(nativeRootFileDirectory, Long.toString(new w().a()));
        if (file.mkdir()) {
            return file;
        }
        return null;
    }

    public NdkCrashFilesManager(a aVar) {
        this.fileStore = aVar;
    }

    private static TreeSet<File> getAllTimestampedDirectories(File file) {
        if (file == null || !file.isDirectory()) {
            return new TreeSet<>();
        }
        File[] listFiles = file.listFiles(ONLY_DIRECTORIES_FILTER);
        TreeSet<File> treeSet = new TreeSet<>(new Comparator<File>() {
            public final int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
        treeSet.addAll(Arrays.asList(listFiles));
        return treeSet;
    }
}
