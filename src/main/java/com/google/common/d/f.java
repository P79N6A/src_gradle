package com.google.common.d;

import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ar;
import com.google.common.collect.cf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@GwtIncompatible
@Beta
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final cf<File> f24831a = new cf<File>() {
        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final com.google.common.c.a<File> f24832b = new com.google.common.c.a<File>() {
    };

    static final class a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final File f24833a;

        /* renamed from: b  reason: collision with root package name */
        private final ar<e> f24834b;

        public final /* synthetic */ OutputStream a() throws IOException {
            return new FileOutputStream(this.f24833a, this.f24834b.contains(e.APPEND));
        }

        public final String toString() {
            return "Files.asByteSink(" + this.f24833a + ", " + this.f24834b + ")";
        }

        private a(File file, e... eVarArr) {
            this.f24833a = (File) m.a(file);
            this.f24834b = ar.copyOf((E[]) eVarArr);
        }

        /* synthetic */ a(File file, e[] eVarArr, byte b2) {
            this(file, eVarArr);
        }
    }

    static final class b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final File f24835a;

        public final /* synthetic */ InputStream a() throws IOException {
            return new FileInputStream(this.f24835a);
        }

        public final String toString() {
            return "Files.asByteSource(" + this.f24835a + ")";
        }

        private b(File file) {
            this.f24835a = (File) m.a(file);
        }

        /* synthetic */ b(File file, byte b2) {
            this(file);
        }
    }

    public static void a(File file) throws IOException {
        m.a(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to update modification time of " + file);
        }
    }

    public static void a(File file, File file2) throws IOException {
        if (!file.equals(file2)) {
            new b(file, (byte) 0).a(new a(file2, new e[0], (byte) 0));
        } else {
            throw new IllegalArgumentException(m.a("Source %s and destination %s must be different", file, file2));
        }
    }
}
