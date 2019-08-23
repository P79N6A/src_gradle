package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.aa;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class e implements Sequence<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f83551a;

    /* renamed from: b  reason: collision with root package name */
    public final g f83552b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1<File, Boolean> f83553c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1<File, Unit> f83554d;

    /* renamed from: e  reason: collision with root package name */
    public final Function2<File, IOException, Unit> f83555e;

    /* renamed from: f  reason: collision with root package name */
    public final int f83556f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    static abstract class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(file);
            Intrinsics.checkParameterIsNotNull(file, "rootDir");
            if (aa.f83419a) {
                boolean isDirectory = file.isDirectory();
                if (aa.f83419a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    final class b extends kotlin.collections.b<File> {

        /* renamed from: b  reason: collision with root package name */
        private final ArrayDeque<c> f83558b = new ArrayDeque<>();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
        final class a extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f83559a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f83560c;

            /* renamed from: d  reason: collision with root package name */
            private File[] f83561d;

            /* renamed from: e  reason: collision with root package name */
            private int f83562e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f83563f;

            @Nullable
            public final File a() {
                if (!this.f83563f && this.f83561d == null) {
                    Function1<File, Boolean> function1 = e.this.f83553c;
                    if (function1 != null && !((Boolean) function1.invoke(this.f83570b)).booleanValue()) {
                        return null;
                    }
                    this.f83561d = this.f83570b.listFiles();
                    if (this.f83561d == null) {
                        Function2<File, IOException, Unit> function2 = e.this.f83555e;
                        if (function2 != null) {
                            File file = this.f83570b;
                            a aVar = new a(this.f83570b, null, "Cannot list files in a directory", 2, null);
                            function2.invoke(file, aVar);
                        }
                        this.f83563f = true;
                    }
                }
                if (this.f83561d != null) {
                    int i = this.f83562e;
                    File[] fileArr = this.f83561d;
                    if (fileArr == null) {
                        Intrinsics.throwNpe();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f83561d;
                        if (fileArr2 == null) {
                            Intrinsics.throwNpe();
                        }
                        int i2 = this.f83562e;
                        this.f83562e = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f83560c) {
                    this.f83560c = true;
                    return this.f83570b;
                }
                Function1<File, Unit> function12 = e.this.f83554d;
                if (function12 != null) {
                    function12.invoke(this.f83570b);
                }
                return null;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, @NotNull File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootDir");
                this.f83559a = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
        /* renamed from: kotlin.io.e$b$b  reason: collision with other inner class name */
        final class C0894b extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f83564a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f83565c;

            @Nullable
            public final File a() {
                if (this.f83565c) {
                    return null;
                }
                this.f83565c = true;
                return this.f83570b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0894b(b bVar, @NotNull File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootFile");
                this.f83564a = bVar;
                if (aa.f83419a) {
                    boolean isFile = file.isFile();
                    if (aa.f83419a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
        final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f83566a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f83567c;

            /* renamed from: d  reason: collision with root package name */
            private File[] f83568d;

            /* renamed from: e  reason: collision with root package name */
            private int f83569e;

            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
                if (r0.length == 0) goto L_0x0079;
             */
            @org.jetbrains.annotations.Nullable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File a() {
                /*
                    r10 = this;
                    boolean r0 = r10.f83567c
                    r1 = 0
                    if (r0 != 0) goto L_0x0022
                    kotlin.io.e$b r0 = r10.f83566a
                    kotlin.io.e r0 = kotlin.io.e.this
                    kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r0 = r0.f83553c
                    if (r0 == 0) goto L_0x001c
                    java.io.File r2 = r10.f83570b
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x001c
                    return r1
                L_0x001c:
                    r0 = 1
                    r10.f83567c = r0
                    java.io.File r0 = r10.f83570b
                    return r0
                L_0x0022:
                    java.io.File[] r0 = r10.f83568d
                    if (r0 == 0) goto L_0x0041
                    int r0 = r10.f83569e
                    java.io.File[] r2 = r10.f83568d
                    if (r2 != 0) goto L_0x002f
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x002f:
                    int r2 = r2.length
                    if (r0 >= r2) goto L_0x0033
                    goto L_0x0041
                L_0x0033:
                    kotlin.io.e$b r0 = r10.f83566a
                    kotlin.io.e r0 = kotlin.io.e.this
                    kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r0 = r0.f83554d
                    if (r0 == 0) goto L_0x0040
                    java.io.File r2 = r10.f83570b
                    r0.invoke(r2)
                L_0x0040:
                    return r1
                L_0x0041:
                    java.io.File[] r0 = r10.f83568d
                    if (r0 != 0) goto L_0x0087
                    java.io.File r0 = r10.f83570b
                    java.io.File[] r0 = r0.listFiles()
                    r10.f83568d = r0
                    java.io.File[] r0 = r10.f83568d
                    if (r0 != 0) goto L_0x006b
                    kotlin.io.e$b r0 = r10.f83566a
                    kotlin.io.e r0 = kotlin.io.e.this
                    kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r0 = r0.f83555e
                    if (r0 == 0) goto L_0x006b
                    java.io.File r2 = r10.f83570b
                    kotlin.io.a r9 = new kotlin.io.a
                    java.io.File r4 = r10.f83570b
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x006b:
                    java.io.File[] r0 = r10.f83568d
                    if (r0 == 0) goto L_0x0079
                    java.io.File[] r0 = r10.f83568d
                    if (r0 != 0) goto L_0x0076
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x0076:
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0087
                L_0x0079:
                    kotlin.io.e$b r0 = r10.f83566a
                    kotlin.io.e r0 = kotlin.io.e.this
                    kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r0 = r0.f83554d
                    if (r0 == 0) goto L_0x0086
                    java.io.File r2 = r10.f83570b
                    r0.invoke(r2)
                L_0x0086:
                    return r1
                L_0x0087:
                    java.io.File[] r0 = r10.f83568d
                    if (r0 != 0) goto L_0x008e
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x008e:
                    int r1 = r10.f83569e
                    int r2 = r1 + 1
                    r10.f83569e = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.e.b.c.a():java.io.File");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, @NotNull File file) {
                super(file);
                Intrinsics.checkParameterIsNotNull(file, "rootDir");
                this.f83566a = bVar;
            }
        }

        public final void a() {
            File file;
            File a2;
            while (true) {
                c peek = this.f83558b.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                a2 = peek.a();
                if (a2 == null) {
                    this.f83558b.pop();
                } else if (Intrinsics.areEqual((Object) a2, (Object) peek.f83570b) || !a2.isDirectory() || this.f83558b.size() >= e.this.f83556f) {
                    file = a2;
                } else {
                    this.f83558b.push(a(a2));
                }
            }
            file = a2;
            if (file != null) {
                a(file);
            } else {
                b();
            }
        }

        public b() {
            if (e.this.f83551a.isDirectory()) {
                this.f83558b.push(a(e.this.f83551a));
            } else if (e.this.f83551a.isFile()) {
                this.f83558b.push(new C0894b(this, e.this.f83551a));
            } else {
                b();
            }
        }

        private final a a(File file) {
            switch (f.f83571a[e.this.f83552b.ordinal()]) {
                case 1:
                    return new c(this, file);
                case 2:
                    return new a(this, file);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    static abstract class c {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final File f83570b;

        @Nullable
        public abstract File a();

        public c(@NotNull File file) {
            Intrinsics.checkParameterIsNotNull(file, "root");
            this.f83570b = file;
        }
    }

    @NotNull
    public final Iterator<File> iterator() {
        return new b<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(@NotNull File file, @NotNull g gVar) {
        this(file, gVar, null, null, null, 0, 32);
        Intrinsics.checkParameterIsNotNull(file, "start");
        Intrinsics.checkParameterIsNotNull(gVar, "direction");
    }

    e(File file, g gVar, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.f83551a = file;
        this.f83552b = gVar;
        this.f83553c = function1;
        this.f83554d = function12;
        this.f83555e = function2;
        this.f83556f = i;
    }

    private /* synthetic */ e(File file, g gVar, Function1 function1, Function1 function12, Function2 function2, int i, int i2) {
        this(file, gVar, null, null, null, Integer.MAX_VALUE);
    }
}
