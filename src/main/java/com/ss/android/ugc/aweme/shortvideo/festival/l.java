package com.ss.android.ugc.aweme.shortvideo.festival;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bm;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"WATER_PIC_NAME_END", "", "WATER_PIC_NAME_START", "filterWaterMarkImg", "", "Lcom/ss/android/ugc/aweme/shortvideo/festival/WaterFile;", "waterFileDir", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67710a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67711a;

        public final int compare(T t, T t2) {
            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f67711a, false, 77248, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                return ComparisonsKt.compareValues(Integer.valueOf(((j) t).f67708b), Integer.valueOf(((j) t2).f67708b));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f67711a, false, 77248, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
    }

    @Nullable
    public static final List<j> a(@Nullable String str) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f67710a, true, 77247, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f67710a, true, 77247, new Class[]{String.class}, List.class);
        } else if (!bm.a(str)) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (File file : new File(str2).listFiles()) {
                Intrinsics.checkExpressionValueIsNotNull(file, "waterFile");
                if (!file.isHidden()) {
                    String name = file.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "waterFile.name");
                    if (StringsKt.startsWith$default(name, "dynamic_watermark_", false, 2, null)) {
                        String path = file.getPath();
                        Intrinsics.checkExpressionValueIsNotNull(path, "waterFile.path");
                        if (StringsKt.endsWith$default(path, ".png", false, 2, null)) {
                            String name2 = file.getName();
                            Intrinsics.checkExpressionValueIsNotNull(name2, "waterFile.name");
                            String substringBeforeLast$default = StringsKt.substringBeforeLast$default(StringsKt.substringAfterLast$default(name2, "dynamic_watermark_", (String) null, 2, (Object) null), ".png", (String) null, 2, (Object) null);
                            if (StringsKt.toIntOrNull(substringBeforeLast$default) == null) {
                                i = 0;
                            } else {
                                i = Integer.parseInt(substringBeforeLast$default);
                            }
                            String path2 = file.getPath();
                            Intrinsics.checkExpressionValueIsNotNull(path2, "waterFile.path");
                            arrayList.add(new j(i, path2));
                        }
                    }
                }
            }
            List<j> list = arrayList;
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new a());
            }
            return list;
        }
    }
}
