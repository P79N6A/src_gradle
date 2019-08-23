package com.facebook.common.b;

import com.facebook.common.internal.Preconditions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class c {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.b.c$c  reason: collision with other inner class name */
    public static class C0254c extends FileNotFoundException {
        public C0254c(String str) {
            super(str);
        }
    }

    public static class d extends IOException {
        public d(String str) {
            super(str);
        }

        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) throws a {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void a(File file, File file2) throws d {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable th = null;
            if (file2.exists()) {
                th = new b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th = new C0254c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th = new FileNotFoundException(file.getAbsolutePath());
            }
            throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
        }
    }
}
