package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/OutputFilePathCalculator;", "", "()V", "calculateAudioOutputFilePath", "", "concatAudioPath", "calculateOutputFilePath", "concatVideoPath", "calculateParallelUploadFile", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67483a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f67484b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/OutputFilePathCalculator$Companion;", "", "()V", "generateTempCoverPath", "", "getCacheDir", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67485a;

        private a() {
        }

        @NotNull
        private String b() {
            if (PatchProxy.isSupport(new Object[0], this, f67485a, false, 76295, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f67485a, false, 76295, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
            Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
            File cacheDir = application.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir, "AVEnv.application.cacheDir");
            sb.append(cacheDir.getPath());
            sb.append(File.separator);
            return sb.toString();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            if (PatchProxy.isSupport(new Object[0], this, f67485a, false, 76294, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f67485a, false, 76294, new Class[0], String.class);
            }
            return b() + b.b("_cover.png");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JvmStatic
    @NotNull
    public static final String a() {
        return PatchProxy.isSupport(new Object[0], null, f67483a, true, 76293, new Class[0], String.class) ? (String) PatchProxy.accessDispatch(new Object[0], null, f67483a, true, 76293, new Class[0], String.class) : f67484b.a();
    }

    @NotNull
    public final String a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67483a, false, 76290, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f67483a, false, 76290, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "concatVideoPath");
        File file = new File(str2);
        String parent = file.getParent();
        String path = new File(parent, "synthetise_" + file.getName()).getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "synthetiseOutputFile.path");
        return path;
    }
}
