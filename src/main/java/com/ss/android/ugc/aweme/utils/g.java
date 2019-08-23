package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\t\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"ANDROID_Q_DEBUG", "", "TAG", "", "getAdaptionPath", "type", "Lcom/ss/android/ugc/aweme/utils/MediaType;", "getAdaptionPaths", "", "([Ljava/lang/String;Lcom/ss/android/ugc/aweme/utils/MediaType;)[Ljava/lang/String;", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75889a;

    @NotNull
    public static final String a(@NotNull String str, @NotNull co coVar) {
        String str2 = str;
        co coVar2 = coVar;
        if (PatchProxy.isSupport(new Object[]{str2, coVar2}, null, f75889a, true, 87877, new Class[]{String.class, co.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, coVar2}, null, f75889a, true, 87877, new Class[]{String.class, co.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "$this$getAdaptionPath");
        Intrinsics.checkParameterIsNotNull(coVar2, "type");
        return e.a.a().b(str2, coVar2);
    }

    @NotNull
    public static final List<String> a(@NotNull List<String> list, @NotNull co coVar) {
        List<String> list2 = list;
        co coVar2 = coVar;
        if (PatchProxy.isSupport(new Object[]{list2, coVar2}, null, f75889a, true, 87876, new Class[]{List.class, co.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2, coVar2}, null, f75889a, true, 87876, new Class[]{List.class, co.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "$this$getAdaptionPaths");
        Intrinsics.checkParameterIsNotNull(coVar2, "type");
        return e.a.a().a(list2, coVar2);
    }

    @NotNull
    public static final String[] a(@NotNull String[] strArr, @NotNull co coVar) {
        Object obj = strArr;
        co coVar2 = coVar;
        if (PatchProxy.isSupport(new Object[]{obj, coVar2}, null, f75889a, true, 87875, new Class[]{String[].class, co.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{obj, coVar2}, null, f75889a, true, 87875, new Class[]{String[].class, co.class}, String[].class);
        }
        Intrinsics.checkParameterIsNotNull(obj, "$this$getAdaptionPaths");
        Intrinsics.checkParameterIsNotNull(coVar2, "type");
        Collection a2 = e.a.a().a(ArraysKt.asList((T[]) strArr), coVar2);
        if (a2 != null) {
            Object[] array = a2.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }
}
