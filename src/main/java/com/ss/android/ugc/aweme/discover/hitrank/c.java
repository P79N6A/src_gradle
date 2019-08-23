package com.ss.android.ugc.aweme.discover.hitrank;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007J*\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000bH\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/RankHelper;", "", "()V", "isDiscussion", "", "()Z", "setDiscussion", "(Z)V", "isFromRnTask", "setFromRnTask", "starId", "", "getStarId", "()Ljava/lang/String;", "setStarId", "(Ljava/lang/String;)V", "getFansSchema", "from", "starUid", "secStarUid", "getSchema", "isToHitRank", "schema", "processPublishChallenges", "", "videoEditModel", "Lcom/ss/android/ugc/aweme/shortvideo/BaseShortVideoContext;", "processPublishStickerIds", "activity", "Landroid/support/v4/app/FragmentActivity;", "id", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42384a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f42385b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static String f42386c = "";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f42387d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f42388e = new c();

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final String a(@NotNull String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f42384a, true, 36393, new Class[]{String.class}, String.class)) {
            return a(str2, null, null, 6);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f42384a, true, 36393, new Class[]{String.class}, String.class);
    }

    private c() {
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42384a, false, 36399, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42384a, false, 36399, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        f42386c = str2;
    }

    @JvmStatic
    public static final boolean c(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f42384a, true, 36402, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f42384a, true, 36402, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "schema");
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence) || !StringsKt.startsWith$default(str2, "aweme://search/trending", false, 2, null) || !StringsKt.contains$default(charSequence, (CharSequence) "type=4", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    public final void a(@NotNull BaseShortVideoContext baseShortVideoContext) {
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2}, this, f42384a, false, 36401, new Class[]{BaseShortVideoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2}, this, f42384a, false, 36401, new Class[]{BaseShortVideoContext.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseShortVideoContext2, "videoEditModel");
        List<AVTextExtraStruct> list = baseShortVideoContext2.structList;
        if (list != null) {
            List arrayList = new ArrayList();
            for (AVTextExtraStruct next : list) {
                Intrinsics.checkExpressionValueIsNotNull(next, "struct");
                if (next.getType() == 1) {
                    String hashTagName = next.getHashTagName();
                    Intrinsics.checkExpressionValueIsNotNull(hashTagName, "struct.hashTagName");
                    arrayList.add(hashTagName);
                }
            }
            if (f42387d && arrayList.size() > 0 && !TextUtils.isEmpty(f42386c)) {
                f.f42393c.a(f42386c, 9, arrayList);
            }
        }
        f42387d = false;
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final String a(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f42384a, true, 36391, new Class[]{String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f42384a, true, 36391, new Class[]{String.class, String.class, String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "from");
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<String> billboardStarScheme = inst.getBillboardStarScheme();
        Intrinsics.checkExpressionValueIsNotNull(billboardStarScheme, "SharePrefCache.inst().billboardStarScheme");
        String str7 = (String) billboardStarScheme.c();
        if (TextUtils.isEmpty(str7)) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str7, "billboardStarUrl");
        f.a a2 = f.a(str7);
        if (!TextUtils.isEmpty(str5)) {
            if (str5 == null) {
                Intrinsics.throwNpe();
            }
            a2.a("star_uid", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            if (str6 == null) {
                Intrinsics.throwNpe();
            }
            a2.a("sec_star_uid", str6);
        }
        a2.a("from", str4);
        String uri = a2.a().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "parseRnSchema.build().toString()");
        return uri;
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final String b(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f42384a, true, 36395, new Class[]{String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f42384a, true, 36395, new Class[]{String.class, String.class, String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "from");
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<String> billboardFansScheme = inst.getBillboardFansScheme();
        Intrinsics.checkExpressionValueIsNotNull(billboardFansScheme, "SharePrefCache.inst().billboardFansScheme");
        String str7 = (String) billboardFansScheme.c();
        if (TextUtils.isEmpty(str7)) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str7, "schema_fans");
        f.a a2 = f.a(str7);
        if (!TextUtils.isEmpty(str5)) {
            if (str5 == null) {
                Intrinsics.throwNpe();
            }
            a2.a("star_uid", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            if (str6 == null) {
                Intrinsics.throwNpe();
            }
            a2.a("sec_star_uid", str6);
        }
        a2.a("from", str4);
        String uri = a2.a().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "parseRnSchema.build().toString()");
        return uri;
    }

    public static /* synthetic */ String a(String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return a(str, str2, str3);
    }
}
