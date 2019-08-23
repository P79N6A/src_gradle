package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\f\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/ArrayUtils;", "", "()V", "convert", "Lorg/json/JSONArray;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "convertString", "", "", "jsonArray", "toStrList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75957a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f75958b = new r();

    private r() {
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f75957a, true, 87989, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list2}, null, f75957a, true, 87989, new Class[]{List.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "$this$toStrList");
        return CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final List<String> a(@Nullable JSONArray jSONArray) {
        Integer num;
        JSONArray jSONArray2 = jSONArray;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, this, f75957a, false, 87987, new Class[]{JSONArray.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{jSONArray2}, this, f75957a, false, 87987, new Class[]{JSONArray.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray2 != null) {
            try {
                num = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        } else {
            num = null;
        }
        if (num == null) {
            Intrinsics.throwNpe();
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            while (true) {
                arrayList.add(jSONArray2.getString(i));
                if (i == intValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
