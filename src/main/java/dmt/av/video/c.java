package dmt.av.video;

import android.content.Context;
import android.os.Environment;
import com.google.common.d.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Ldmt/av/video/ExternalLibraryLoader;", "Lcom/ss/android/ttve/nativePort/TENativeLibsLoader$ILibraryLoader;", "context", "Landroid/content/Context;", "wrappedLibraryLoader", "(Landroid/content/Context;Lcom/ss/android/ttve/nativePort/TENativeLibsLoader$ILibraryLoader;)V", "loadedSoNames", "Ljava/util/ArrayList;", "", "tempFilesDir", "Ljava/io/File;", "getTempFilesDir", "()Ljava/io/File;", "getNativeLibraryPathOnExternal", "soName", "load", "", "onLoadNativeLibs", "list", "", "wipeOutTempFilesDir", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82979a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f82980b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<String> f82981c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f82982d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c f82983e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Ldmt/av/video/ExternalLibraryLoader$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 1, 15})
    static final class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82985b;

        b(String str) {
            this.f82985b = str;
        }

        public final boolean accept(File file, String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{file, str2}, this, f82984a, false, 91949, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                return Intrinsics.areEqual((Object) str2, (Object) this.f82985b);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str2}, this, f82984a, false, 91949, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
        }
    }

    private final File a() {
        if (!PatchProxy.isSupport(new Object[0], this, f82979a, false, 91944, new Class[0], File.class)) {
            return new File(this.f82982d.getFilesDir(), "external_library");
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f82979a, false, 91944, new Class[0], File.class);
    }

    private final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f82979a, false, 91945, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f82979a, false, 91945, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f82981c.contains(str)) {
            return true;
        } else {
            String b2 = b(str);
            if (b2 == null) {
                return this.f82983e.a(CollectionsKt.listOf(str));
            }
            try {
                System.load(b2);
                this.f82981c.add(str);
            } catch (UnsatisfiedLinkError unused) {
            }
            return true;
        }
    }

    private final String b(String str) {
        boolean z;
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f82979a, false, 91946, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f82979a, false, 91946, new Class[]{String.class}, String.class);
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File a2 = a();
        if (!a2.exists() && !a2.mkdirs()) {
            return null;
        }
        String str4 = "lib" + str3 + ".so";
        File[] listFiles = externalStorageDirectory.listFiles(new b(str4));
        Intrinsics.checkExpressionValueIsNotNull(listFiles, "files");
        if (listFiles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(true ^ z)) {
            return null;
        }
        File file = new File(a2, str4);
        try {
            f.a(file);
            f.a(listFiles[0], file);
            str2 = file.getPath();
        } catch (IOException unused) {
            str2 = null;
        }
        return str2;
    }

    public final boolean a(@NotNull List<String> list) {
        List<String> list2 = list;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f82979a, false, 91948, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2}, this, f82979a, false, 91948, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
        for (String a2 : list2) {
            if (!a(a2)) {
                z = false;
            }
        }
        return z;
    }

    public c(@NotNull Context context, @NotNull b.c cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "wrappedLibraryLoader");
        this.f82982d = context;
        this.f82983e = cVar;
        if (PatchProxy.isSupport(new Object[0], this, f82979a, false, 91947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82979a, false, 91947, new Class[0], Void.TYPE);
            return;
        }
        File a2 = a();
        if (a2.exists()) {
            com.ss.android.ugc.aweme.video.b.b(a2);
        }
    }
}
