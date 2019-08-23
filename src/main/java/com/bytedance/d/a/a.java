package com.bytedance.d.a;

import android.os.Build;
import android.system.Os;
import com.bytedance.d.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/oomdumper/taskparser/FdFileParser;", "", "()V", "parse", "", "", "fdDir", "Ljava/io/File;", "oomdumper_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19592a = new a();

    private a() {
    }

    @NotNull
    public static List<String> a(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "fdDir");
        if (!file.exists() || !file.isDirectory()) {
            return CollectionsKt.emptyList();
        }
        Set linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        Intrinsics.checkExpressionValueIsNotNull(listFiles, "fdDir.listFiles()");
        Collection arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (file2.exists()) {
                arrayList.add(file2);
            }
        }
        for (File file3 : (List) arrayList) {
            if (file3.exists()) {
                if (Build.VERSION.SDK_INT >= 21) {
                    Intrinsics.checkExpressionValueIsNotNull(file3, "fdFile");
                    String readlink = Os.readlink(file3.getPath());
                    Intrinsics.checkExpressionValueIsNotNull(readlink, "Os.readlink(fdFile.path)");
                    linkedHashSet.add(readlink);
                } else {
                    StringBuilder sb = new StringBuilder("readlink ");
                    Intrinsics.checkExpressionValueIsNotNull(file3, "fdFile");
                    sb.append(file3.getPath());
                    linkedHashSet.add(b.a(sb.toString()).get(0));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }
}
