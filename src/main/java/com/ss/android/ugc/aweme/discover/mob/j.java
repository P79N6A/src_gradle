package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.aa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eJ&\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J2\u0010%\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020\u0005H\u0007J&\u0010(\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J&\u0010*\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J\u0016\u0010,\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005J(\u0010.\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010!\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tXT¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchResultStatistics;", "", "()V", "SHOWN_LIST", "", "", "[Ljava/lang/String;", "TOKEN_TYPE", "TYPE_COMMODITY", "", "TYPE_MUSIC", "TYPE_POI", "TYPE_TAG", "TYPE_USER", "mShownListMap", "Ljava/util/HashSet;", "Lcom/ss/android/ugc/aweme/discover/mob/Info;", "Lkotlin/collections/HashSet;", "[Ljava/util/HashSet;", "addShownList", "", "T", "itemList", "", "clearShownList", "getSearchType", "labelName", "onEventV3", "eventName", "map", "", "sendChallengeFavouriteEvent", "event", "enterFrom", "tagId", "fromSearchResult", "", "sendFollowEvent", "toUserId", "enterMethod", "sendMusicFavouriteEvent", "musicId", "sendPoiFavouriteEvent", "poiId", "sendSearchResultShow", "keyword", "sendVideoPlayEvent", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42668a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f42669b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f42670c = {"person", "tag", "music", "poi", "ecommerce"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f42671d = {"user_list", "tag_list", "music_list", "poi_list", "ecommerce_list"};

    /* renamed from: e  reason: collision with root package name */
    private static HashSet<d>[] f42672e = {new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>()};

    @JvmOverloads
    public final void a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42668a, false, 36981, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, Byte.valueOf(z)}, this, f42668a, false, 36981, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(str, str2, str3, z, "");
    }

    private j() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> void a(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f42668a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 36975(0x906f, float:5.1813E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f42668a
            r13 = 0
            r14 = 36975(0x906f, float:5.1813E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = -1
            if (r18 == 0) goto L_0x0132
            r0 = r18
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0131
            java.lang.Object r3 = r0.next()
            r4 = 0
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.mixfeed.a
            r6 = 2
            if (r5 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            com.ss.android.ugc.aweme.discover.mixfeed.a r3 = (com.ss.android.ugc.aweme.discover.mixfeed.a) r3
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r6 = r3.f42543d
            r5.a((java.util.List) r6)
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchChallenge> r6 = r3.f42545f
            r5.a((java.util.List) r6)
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r3.f42544e
            r5.a((java.util.List) r6)
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r6 = r3.j
            r5.a((java.util.List) r6)
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchCommodity> r6 = r3.l
            r5.a((java.util.List) r6)
            com.ss.android.ugc.aweme.discover.mob.j r5 = f42669b
            com.ss.android.ugc.aweme.discover.model.SearchMovie r3 = r3.m
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            r5.a((java.util.List) r3)     // Catch:{ Throwable -> 0x0133 }
            goto L_0x0126
        L_0x0081:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.model.SearchUser
            if (r5 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = (com.ss.android.ugc.aweme.discover.model.SearchUser) r3
            com.ss.android.ugc.aweme.profile.model.User r2 = r3.user
            java.lang.String r5 = "it.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            java.lang.String r2 = r2.getUid()
            java.lang.String r5 = "it.user.uid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            boolean r3 = r3.isAladdin()
            r4.<init>(r2, r3)
            r2 = 0
            goto L_0x0126
        L_0x00a3:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.model.SearchChallenge
            if (r5 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            com.ss.android.ugc.aweme.discover.model.SearchChallenge r3 = (com.ss.android.ugc.aweme.discover.model.SearchChallenge) r3
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r3.getChallenge()
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = r2.getCid()
            if (r2 != 0) goto L_0x00b9
        L_0x00b7:
            java.lang.String r2 = ""
        L_0x00b9:
            r4.<init>(r2, r9, r6)
        L_0x00bc:
            r2 = 1
            goto L_0x0126
        L_0x00be:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.music.model.Music
            if (r5 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            com.ss.android.ugc.aweme.music.model.Music r3 = (com.ss.android.ugc.aweme.music.model.Music) r3
            java.lang.String r2 = r3.getMid()
            java.lang.String r3 = "it.mid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r4.<init>(r2, r9, r6)
            r2 = 2
            goto L_0x0126
        L_0x00d4:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.model.SearchPoi
            if (r5 == 0) goto L_0x00ef
            r2 = 3
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            com.ss.android.ugc.aweme.discover.model.SearchPoi r3 = (com.ss.android.ugc.aweme.discover.model.SearchPoi) r3
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r3 = r3.poi
            java.lang.String r5 = "it.poi"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            java.lang.String r3 = r3.poiId
            java.lang.String r5 = "it.poi.poiId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            r4.<init>(r3, r9, r6)
            goto L_0x0126
        L_0x00ef:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.model.SearchCommodity
            if (r5 == 0) goto L_0x010e
            r2 = 4
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            com.ss.android.ugc.aweme.discover.model.SearchCommodity r3 = (com.ss.android.ugc.aweme.discover.model.SearchCommodity) r3
            com.ss.android.ugc.aweme.discover.model.Commodity r3 = r3.getCommodity()
            java.lang.String r5 = "it.commodity"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            java.lang.String r3 = r3.getGid()
            java.lang.String r5 = "it.commodity.gid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            r4.<init>(r3, r9, r6)
            goto L_0x0126
        L_0x010e:
            boolean r5 = r3 instanceof com.ss.android.ugc.aweme.discover.model.SearchMovie
            if (r5 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.discover.model.SearchMovie r3 = (com.ss.android.ugc.aweme.discover.model.SearchMovie) r3
            com.ss.android.ugc.aweme.discover.model.Movie r2 = r3.getMovie()
            java.lang.String r2 = r2.getChallengeId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.discover.mob.d r4 = new com.ss.android.ugc.aweme.discover.mob.d
            r4.<init>(r2, r1)
            goto L_0x00bc
        L_0x0126:
            if (r4 == 0) goto L_0x003f
            java.util.HashSet<com.ss.android.ugc.aweme.discover.mob.d>[] r3 = f42672e
            r3 = r3[r2]
            r3.add(r4)
            goto L_0x003f
        L_0x0131:
            return
        L_0x0132:
            return
        L_0x0133:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mob.j.a(java.util.List):void");
    }

    public final void a(@NotNull String str, @NotNull Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f42668a, false, 36985, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f42668a, false, 36985, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(map2, "map");
        r.a(str2, aa.a(map));
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42668a, false, 36976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42668a, false, 36976, new Class[0], Void.TYPE);
            return;
        }
        for (HashSet<d> clear : f42672e) {
            clear.clear();
        }
    }

    private final int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42668a, false, 36977, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f42668a, false, 36977, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        switch (str.hashCode()) {
            case 111178:
                if (str2.equals("poi")) {
                    return 5;
                }
                break;
            case 114586:
                if (str2.equals("tag")) {
                    return 2;
                }
                break;
            case 3599307:
                if (str2.equals(AllStoryActivity.f73306b)) {
                    return 0;
                }
                break;
            case 104263205:
                if (str2.equals("music")) {
                    return 1;
                }
                break;
            case 998835423:
                if (str2.equals("general_search")) {
                    return 3;
                }
                break;
            case 1528280640:
                if (str2.equals("ecommerce")) {
                    return 7;
                }
                break;
        }
        return -1;
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        Iterator it2;
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6}, this, f42668a, false, 36978, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6}, this, f42668a, false, 36978, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str5, "labelName");
        Intrinsics.checkParameterIsNotNull(str6, "keyword");
        int a2 = a(str);
        if (a2 >= 0) {
            String a3 = e.a().a(a2);
            int i = 0;
            for (Iterable<d> iterable : f42672e) {
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((d) next).f42658c) {
                        arrayList.add(next);
                    }
                }
                for (d dVar : (List) arrayList) {
                    d a4 = d.a();
                    if (TextUtils.equals(str5, "general_search")) {
                        str4 = "general_search";
                    } else {
                        str4 = "search_result";
                    }
                    d a5 = a4.a("enter_from", str4).a("token_type", f42670c[i]).a(f42671d[i], dVar.f42657b).a("search_keyword", str6).a("log_pb", ai.a().a(a3)).a("search_id", a3).a("is_aladdin", 1);
                    j jVar = f42669b;
                    Map<String, String> map = a5.f34114b;
                    Intrinsics.checkExpressionValueIsNotNull(map, "builder.builder()");
                    jVar.a("search_result_show", map);
                }
                Collection arrayList2 = new ArrayList();
                for (d dVar2 : iterable) {
                    if (!dVar2.f42658c) {
                        arrayList2.add(it2.next());
                    }
                }
                if (((List) arrayList2).size() > 0) {
                    d a6 = d.a();
                    if (TextUtils.equals(str5, "general_search")) {
                        str3 = "general_search";
                    } else {
                        str3 = "search_result";
                    }
                    d a7 = a6.a("enter_from", str3).a("token_type", f42670c[i]);
                    String str7 = f42671d[i];
                    Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (d dVar3 : iterable) {
                        arrayList3.add(dVar3.f42657b);
                    }
                    d a8 = a7.a(str7, ((List) arrayList3).toString()).a("search_keyword", str6).a("log_pb", ai.a().a(a3));
                    Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (d dVar4 : iterable) {
                        arrayList4.add(Integer.valueOf(dVar4.f42658c ? 1 : 0));
                    }
                    d a9 = a8.a("is_aladdin", ((List) arrayList4).toString());
                    j jVar2 = f42669b;
                    Map<String, String> map2 = a9.f34114b;
                    Intrinsics.checkExpressionValueIsNotNull(map2, "builder.builder()");
                    jVar2.a("search_result_show", map2);
                }
                i++;
            }
            a();
        }
    }

    public final void b(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42668a, false, 36984, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str7, Byte.valueOf(z)}, this, f42668a, false, 36984, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str5, "event");
        Intrinsics.checkParameterIsNotNull(str6, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str7, "poiId");
        if (z) {
            str4 = e.a().a(5);
        } else {
            str4 = e.a().a(3);
        }
        Map<String, String> map = d.a().a("enter_from", str6).a("poi_id", str7).a("log_pb", ai.a().a(str4)).f34114b;
        Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
        a(str5, map);
    }

    public final void a(@NotNull String str, @Nullable Aweme aweme, @NotNull String str2, boolean z) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, aweme, str5, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42668a, false, 36979, new Class[]{String.class, Aweme.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, aweme, str5, Byte.valueOf(z)}, this, f42668a, false, 36979, new Class[]{String.class, Aweme.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "event");
        Intrinsics.checkParameterIsNotNull(str5, "enterFrom");
        String str6 = "general";
        String a2 = e.a().a(3);
        if (z) {
            int hashCode = str2.hashCode();
            if (hashCode != -1731750228) {
                if (hashCode != 452151140) {
                    if (hashCode != 809483594) {
                        if (hashCode == 1402633315 && str5.equals("challenge")) {
                            str6 = "tag";
                            a2 = e.a().a(2);
                        }
                    } else if (str5.equals("others_homepage")) {
                        str6 = AllStoryActivity.f73306b;
                        a2 = e.a().a(0);
                    }
                } else if (str5.equals("poi_page")) {
                    str6 = "poi";
                    a2 = e.a().a(5);
                }
            } else if (str5.equals("single_song")) {
                str6 = "music";
                a2 = e.a().a(1);
            }
        }
        d a3 = d.a().a("enter_from", str5);
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        Map<String, String> map = a3.a("group_id", str3).a("log_pb", ai.a().a(a2)).a("search_type", str6).f34114b;
        Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
        a(str4, map);
    }

    @JvmOverloads
    public final void a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4) {
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, Byte.valueOf(z ? (byte) 1 : 0), str9}, this, f42668a, false, 36980, new Class[]{String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str6, str7, str8, Byte.valueOf(z), str9};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42668a, false, 36980, new Class[]{String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str6, "event");
        Intrinsics.checkParameterIsNotNull(str7, "toUserId");
        Intrinsics.checkParameterIsNotNull(str8, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str9, "enterMethod");
        if (z) {
            str5 = e.a().a(0);
        } else {
            str5 = e.a().a(3);
        }
        Map<String, String> map = d.a().a("enter_from", str8).a("enter_method", str9).a("to_user_id", str7).a("log_pb", ai.a().a(str5)).f34114b;
        Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
        a(str6, map);
    }
}
