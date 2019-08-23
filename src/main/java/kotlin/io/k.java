package kotlin.io;

import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/io/FilesKt")
public class k extends j {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2 {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @NotNull
        public final Void invoke(@NotNull File file, @NotNull IOException iOException) {
            Intrinsics.checkParameterIsNotNull(file, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(iOException, "exception");
            throw iOException;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<File, IOException, Unit> {
        final /* synthetic */ Function2 $onError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Function2 function2) {
            super(2);
            this.$onError = function2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((File) obj, (IOException) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull File file, @NotNull IOException iOException) {
            Intrinsics.checkParameterIsNotNull(file, "f");
            Intrinsics.checkParameterIsNotNull(iOException, "e");
            if (((n) this.$onError.invoke(file, iOException)) == n.TERMINATE) {
                throw new o(file);
            }
        }
    }

    private static final c normalize$FilesKt__UtilsKt(@NotNull c cVar) {
        return new c(cVar.f83549a, normalize$FilesKt__UtilsKt(cVar.f83550b));
    }

    @NotNull
    public static final String getExtension(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$extension");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt.substringAfterLast(name, '.', "");
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$nameWithoutExtension");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt.substringBeforeLast$default(name, ClassUtils.PACKAGE_SEPARATOR, (String) null, 2, (Object) null);
    }

    public static final boolean deleteRecursively(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$deleteRecursively");
        Iterator it2 = FilesKt.walkBottomUp(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it2.hasNext()) {
                    return z;
                }
                File file2 = (File) it2.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$invariantSeparatorsPath");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "path");
            return StringsKt.replace$default(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path2, "path");
        return path2;
    }

    @NotNull
    public static final File normalize(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$normalize");
        c components = FilesKt.toComponents(file);
        File file2 = components.f83549a;
        String str = File.separator;
        Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
        return FilesKt.resolve(file2, CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt(components.f83550b), str, null, null, 0, null, null, 62, null));
    }

    private static final List<File> normalize$FilesKt__UtilsKt(@NotNull List<? extends File> list) {
        List<File> arrayList = new ArrayList<>(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472 && name.equals("..")) {
                        if (arrayList.isEmpty() || !(!Intrinsics.areEqual((Object) ((File) CollectionsKt.last(arrayList)).getName(), (Object) ".."))) {
                            arrayList.add(file);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else if (name.equals(ClassUtils.PACKAGE_SEPARATOR)) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    public static final boolean endsWith(@NotNull File file, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(file, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(str, "other");
        return FilesKt.endsWith(file, new File(str));
    }

    @NotNull
    public static final File relativeTo(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$relativeTo");
        Intrinsics.checkParameterIsNotNull(file2, "base");
        return new File(FilesKt.toRelativeString(file, file2));
    }

    @Nullable
    public static final File relativeToOrNull(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$relativeToOrNull");
        Intrinsics.checkParameterIsNotNull(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    @NotNull
    public static final File relativeToOrSelf(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$relativeToOrSelf");
        Intrinsics.checkParameterIsNotNull(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return file;
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(file, "$this$resolve");
        Intrinsics.checkParameterIsNotNull(str, "relative");
        return FilesKt.resolve(file, new File(str));
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(file, "$this$resolveSibling");
        Intrinsics.checkParameterIsNotNull(str, "relative");
        return FilesKt.resolveSibling(file, new File(str));
    }

    public static final boolean startsWith(@NotNull File file, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(file, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(str, "other");
        return FilesKt.startsWith(file, new File(str));
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull File file2) {
        File file3;
        Intrinsics.checkParameterIsNotNull(file, "$this$resolveSibling");
        Intrinsics.checkParameterIsNotNull(file2, "relative");
        c components = FilesKt.toComponents(file);
        if (components.a() == 0) {
            file3 = new File("..");
        } else {
            file3 = components.a(0, components.a() - 1);
        }
        return FilesKt.resolve(FilesKt.resolve(components.f83549a, file3), file2);
    }

    public static final boolean startsWith(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(file2, "other");
        c components = FilesKt.toComponents(file);
        c components2 = FilesKt.toComponents(file2);
        if (!(!Intrinsics.areEqual((Object) components.f83549a, (Object) components2.f83549a)) && components.a() >= components2.a()) {
            return components.f83550b.subList(0, components2.a()).equals(components2.f83550b);
        }
        return false;
    }

    @NotNull
    public static final String toRelativeString(@NotNull File file, @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull(file, "$this$toRelativeString");
        Intrinsics.checkParameterIsNotNull(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final boolean endsWith(@NotNull File file, @NotNull File file2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(file, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(file2, "other");
        c components = FilesKt.toComponents(file);
        c components2 = FilesKt.toComponents(file2);
        String path = components2.f83549a.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "root.path");
        if (path.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Intrinsics.areEqual((Object) file, (Object) file2);
        }
        int a2 = components.a() - components2.a();
        if (a2 < 0) {
            return false;
        }
        return components.f83550b.subList(a2, components.a()).equals(components2.f83550b);
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull File file2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(file, "$this$resolve");
        Intrinsics.checkParameterIsNotNull(file2, "relative");
        if (FilesKt.isRooted(file2)) {
            return file2;
        }
        String file3 = file.toString();
        Intrinsics.checkExpressionValueIsNotNull(file3, "this.toString()");
        CharSequence charSequence = file3;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || StringsKt.endsWith$default(charSequence, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(@NotNull File file, File file2) {
        c normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt.toComponents(file));
        c normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt.toComponents(file2));
        if (!Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt.f83549a, (Object) normalize$FilesKt__UtilsKt2.f83549a)) {
            return null;
        }
        int a2 = normalize$FilesKt__UtilsKt2.a();
        int a3 = normalize$FilesKt__UtilsKt.a();
        int i = 0;
        int min = Math.min(a3, a2);
        while (i < min && Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt.f83550b.get(i), (Object) normalize$FilesKt__UtilsKt2.f83550b.get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = a2 - 1;
        if (i2 >= i) {
            while (!Intrinsics.areEqual((Object) normalize$FilesKt__UtilsKt2.f83550b.get(i2).getName(), (Object) "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < a3) {
            if (i < a2) {
                sb.append(File.separatorChar);
            }
            String str = File.separator;
            Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
            CollectionsKt.joinTo$default(CollectionsKt.drop(normalize$FilesKt__UtilsKt.f83550b, i), sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    @NotNull
    public static final File createTempFile(@NotNull String str, @Nullable String str2, @Nullable File file) {
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        Intrinsics.checkExpressionValueIsNotNull(createTempFile, "File.createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    @NotNull
    public static final File createTempDir(@NotNull String str, @Nullable String str2, @Nullable File file) {
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            Intrinsics.checkExpressionValueIsNotNull(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4 A[Catch:{ o -> 0x00f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyRecursively(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull java.io.File r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.n> r14) {
        /*
            java.lang.String r0 = "$this$copyRecursively"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002f
            kotlin.io.m r12 = new kotlin.io.m
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r7 = 2
            r8 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.n r11 = (kotlin.io.n) r11
            kotlin.io.n r12 = kotlin.io.n.TERMINATE
            if (r11 == r12) goto L_0x002e
            return r1
        L_0x002e:
            return r2
        L_0x002f:
            kotlin.io.e r0 = kotlin.io.FilesKt.walkTopDown(r11)     // Catch:{ o -> 0x00f8 }
            kotlin.io.k$b r3 = new kotlin.io.k$b     // Catch:{ o -> 0x00f8 }
            r3.<init>(r14)     // Catch:{ o -> 0x00f8 }
            r9 = r3
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch:{ o -> 0x00f8 }
            java.lang.String r3 = "function"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r3)     // Catch:{ o -> 0x00f8 }
            kotlin.io.e r3 = new kotlin.io.e     // Catch:{ o -> 0x00f8 }
            java.io.File r5 = r0.f83551a     // Catch:{ o -> 0x00f8 }
            kotlin.io.g r6 = r0.f83552b     // Catch:{ o -> 0x00f8 }
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r7 = r0.f83553c     // Catch:{ o -> 0x00f8 }
            kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r8 = r0.f83554d     // Catch:{ o -> 0x00f8 }
            int r10 = r0.f83556f     // Catch:{ o -> 0x00f8 }
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ o -> 0x00f8 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ o -> 0x00f8 }
        L_0x0054:
            boolean r3 = r0.hasNext()     // Catch:{ o -> 0x00f8 }
            if (r3 == 0) goto L_0x00f7
            java.lang.Object r3 = r0.next()     // Catch:{ o -> 0x00f8 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ o -> 0x00f8 }
            boolean r4 = r3.exists()     // Catch:{ o -> 0x00f8 }
            if (r4 != 0) goto L_0x007d
            kotlin.io.m r10 = new kotlin.io.m     // Catch:{ o -> 0x00f8 }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ o -> 0x00f8 }
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r3 = (kotlin.io.n) r3     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r4 = kotlin.io.n.TERMINATE     // Catch:{ o -> 0x00f8 }
            if (r3 != r4) goto L_0x0054
            return r2
        L_0x007d:
            java.lang.String r4 = kotlin.io.FilesKt.toRelativeString(r3, r11)     // Catch:{ o -> 0x00f8 }
            java.io.File r5 = new java.io.File     // Catch:{ o -> 0x00f8 }
            r5.<init>(r12, r4)     // Catch:{ o -> 0x00f8 }
            boolean r4 = r5.exists()     // Catch:{ o -> 0x00f8 }
            if (r4 == 0) goto L_0x00c6
            boolean r4 = r3.isDirectory()     // Catch:{ o -> 0x00f8 }
            if (r4 == 0) goto L_0x0098
            boolean r4 = r5.isDirectory()     // Catch:{ o -> 0x00f8 }
            if (r4 != 0) goto L_0x00c6
        L_0x0098:
            if (r13 != 0) goto L_0x009c
        L_0x009a:
            r4 = 1
            goto L_0x00b2
        L_0x009c:
            boolean r4 = r5.isDirectory()     // Catch:{ o -> 0x00f8 }
            if (r4 == 0) goto L_0x00ab
            boolean r4 = kotlin.io.FilesKt.deleteRecursively(r5)     // Catch:{ o -> 0x00f8 }
            if (r4 != 0) goto L_0x00a9
            goto L_0x009a
        L_0x00a9:
            r4 = 0
            goto L_0x00b2
        L_0x00ab:
            boolean r4 = r5.delete()     // Catch:{ o -> 0x00f8 }
            if (r4 != 0) goto L_0x00a9
            goto L_0x009a
        L_0x00b2:
            if (r4 == 0) goto L_0x00c6
            kotlin.io.b r4 = new kotlin.io.b     // Catch:{ o -> 0x00f8 }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ o -> 0x00f8 }
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r3 = (kotlin.io.n) r3     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r4 = kotlin.io.n.TERMINATE     // Catch:{ o -> 0x00f8 }
            if (r3 != r4) goto L_0x0054
            return r2
        L_0x00c6:
            boolean r4 = r3.isDirectory()     // Catch:{ o -> 0x00f8 }
            if (r4 == 0) goto L_0x00d0
            r5.mkdirs()     // Catch:{ o -> 0x00f8 }
            goto L_0x0054
        L_0x00d0:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = kotlin.io.FilesKt.copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch:{ o -> 0x00f8 }
            long r4 = r4.length()     // Catch:{ o -> 0x00f8 }
            long r6 = r3.length()     // Catch:{ o -> 0x00f8 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0054
            java.io.IOException r4 = new java.io.IOException     // Catch:{ o -> 0x00f8 }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ o -> 0x00f8 }
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r3 = (kotlin.io.n) r3     // Catch:{ o -> 0x00f8 }
            kotlin.io.n r4 = kotlin.io.n.TERMINATE     // Catch:{ o -> 0x00f8 }
            if (r3 != r4) goto L_0x0054
            return r2
        L_0x00f7:
            return r1
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.k.copyRecursively(java.io.File, java.io.File, boolean, kotlin.jvm.functions.Function2):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r6 = r10;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        throw r8;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File copyTo(@org.jetbrains.annotations.NotNull java.io.File r7, @org.jetbrains.annotations.NotNull java.io.File r8, boolean r9, int r10) {
        /*
            java.lang.String r0 = "$this$copyTo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0087
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x002f
            r0 = 1
            if (r9 != 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            boolean r9 = r8.delete()
            if (r9 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            kotlin.io.b r9 = new kotlin.io.b
            java.lang.String r10 = "The destination file already exists."
            r9.<init>(r7, r8, r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x002f:
            boolean r9 = r7.isDirectory()
            if (r9 == 0) goto L_0x0046
            boolean r9 = r8.mkdirs()
            if (r9 == 0) goto L_0x003c
            goto L_0x0071
        L_0x003c:
            kotlin.io.d r9 = new kotlin.io.d
            java.lang.String r10 = "Failed to create target directory."
            r9.<init>(r7, r8, r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0046:
            java.io.File r9 = r8.getParentFile()
            if (r9 == 0) goto L_0x004f
            r9.mkdirs()
        L_0x004f:
            java.io.FileInputStream r9 = new java.io.FileInputStream
            r9.<init>(r7)
            java.io.Closeable r9 = (java.io.Closeable) r9
            r7 = 0
            r0 = r9
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ Throwable -> 0x0081 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0081 }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x0081 }
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ Throwable -> 0x0081 }
            r2 = r1
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch:{ Throwable -> 0x0075, all -> 0x0072 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Throwable -> 0x0075, all -> 0x0072 }
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ Throwable -> 0x0075, all -> 0x0072 }
            kotlin.io.ByteStreamsKt.copyTo(r0, r2, r10)     // Catch:{ Throwable -> 0x0075, all -> 0x0072 }
            kotlin.io.CloseableKt.closeFinally(r1, r7)     // Catch:{ Throwable -> 0x0081 }
            kotlin.io.CloseableKt.closeFinally(r9, r7)
        L_0x0071:
            return r8
        L_0x0072:
            r8 = move-exception
            r10 = r7
            goto L_0x007b
        L_0x0075:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r10 = move-exception
            r6 = r10
            r10 = r8
            r8 = r6
        L_0x007b:
            kotlin.io.CloseableKt.closeFinally(r1, r10)     // Catch:{ Throwable -> 0x0081 }
            throw r8     // Catch:{ Throwable -> 0x0081 }
        L_0x007f:
            r8 = move-exception
            goto L_0x0083
        L_0x0081:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x007f }
        L_0x0083:
            kotlin.io.CloseableKt.closeFinally(r9, r7)
            throw r8
        L_0x0087:
            kotlin.io.m r8 = new kotlin.io.m
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.k.copyTo(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return FilesKt.createTempDir(str, str2, file);
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return FilesKt.createTempFile(str, str2, file);
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return FilesKt.copyTo(file, file2, z, i);
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = a.INSTANCE;
        }
        return FilesKt.copyRecursively(file, file2, z, function2);
    }
}
