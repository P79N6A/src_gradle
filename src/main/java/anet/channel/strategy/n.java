package anet.channel.strategy;

import java.io.File;
import java.util.Comparator;

public final class n implements Comparator<File> {
    n() {
    }

    /* renamed from: a */
    public final int compare(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }
}
