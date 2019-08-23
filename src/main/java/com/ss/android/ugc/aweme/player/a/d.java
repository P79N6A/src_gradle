package com.ss.android.ugc.aweme.player.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/player/etdata/VideoPlayEndEventHelper;", "", "()V", "HIT_MAPPING", "", "", "X_CACHE", "getX_CACHE", "()Ljava/lang/String;", "X_M_CACHE", "getX_M_CACHE", "getHitCodeFromHeaderValue", "", "value", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59081a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f59082b = new d();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final String f59083c = "X-Cache";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f59084d = "X-M-Cache";

    /* renamed from: e  reason: collision with root package name */
    private static List<String> f59085e;

    private d() {
    }

    static {
        List<String> arrayList = new ArrayList<>();
        f59085e = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f59085e;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        list.add("TCP_MISS");
        List<String> list2 = f59085e;
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f59085e;
        if (list3 == null) {
            Intrinsics.throwNpe();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f59085e;
        if (list4 == null) {
            Intrinsics.throwNpe();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f59085e;
        if (list5 == null) {
            Intrinsics.throwNpe();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f59085e;
        if (list6 == null) {
            Intrinsics.throwNpe();
        }
        list6.add("HIT");
        List<String> list7 = f59085e;
        if (list7 == null) {
            Intrinsics.throwNpe();
        }
        list7.add("MISS");
        List<String> list8 = f59085e;
        if (list8 == null) {
            Intrinsics.throwNpe();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f59085e;
        if (list9 == null) {
            Intrinsics.throwNpe();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f59085e;
        if (list10 == null) {
            Intrinsics.throwNpe();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f59085e;
        if (list11 == null) {
            Intrinsics.throwNpe();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f59085e;
        if (list12 == null) {
            Intrinsics.throwNpe();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f59085e;
        if (list13 == null) {
            Intrinsics.throwNpe();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    public final int a(@Nullable String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f59081a, false, 64211, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f59081a, false, 64211, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!TextUtils.isEmpty(str2)) {
            List<String> list = f59085e;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                if (StringsKt.startsWith$default(str2, next, false, 2, null)) {
                    List<String> list2 = f59085e;
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    i = list2.indexOf(next) + 1;
                }
            }
        }
        return i;
    }
}
