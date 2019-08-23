package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.header.ay;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/FollowUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bp {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75625a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f75626b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/FollowUtils$Companion;", "", "()V", "getFollowFromType", "", "userHeaderData", "Lcom/ss/android/ugc/aweme/profile/ui/header/UserHeaderData;", "enterFrom", "", "isFollowTabYellowDotShowInside", "", "groupType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75627a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final int a(@NotNull ay ayVar) {
            ay ayVar2 = ayVar;
            if (PatchProxy.isSupport(new Object[]{ayVar2}, this, f75627a, false, 88327, new Class[]{ay.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{ayVar2}, this, f75627a, false, 88327, new Class[]{ay.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(ayVar2, "userHeaderData");
            if (TextUtils.equals(ayVar.getmPreviousPagePosition(), "card_head") || TextUtils.equals(ayVar.getmPreviousPagePosition(), "recommend_card")) {
                return 12;
            }
            if (TextUtils.equals(ayVar.getmPreviousPagePosition(), "face_to_face")) {
                return 201901;
            }
            if (!ayVar.isFromFeed() || !TextUtils.equals(ayVar.getmEventType(), "homepage_follow")) {
                return a(ayVar.getmEventType());
            }
            return 13;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
            if (r0.equals("search_result") != false) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
            if (r0.equals("discovery_recommend") != false) goto L_0x012d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
            if (r0.equals("general_search") != false) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
            if (r0.equals("message") != false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
            if (r0.equals("poi_page") != false) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
            if (r0.equals("categorized_city_poi") != false) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
            if (r0.equals("chat") != false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
            return 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
            if (r0.equals("discovery") != false) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
            if (r0.equals("search_sug") != false) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0103, code lost:
            return 14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0120, code lost:
            if (r0.equals("homepage_fresh") != false) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0124, code lost:
            return 15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x012b, code lost:
            if (r0.equals("follow_rec") != false) goto L_0x012d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x012f, code lost:
            return 12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
            if (r0.equals("find_friends") != false) goto L_0x012d;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(@org.jetbrains.annotations.Nullable java.lang.String r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f75627a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Integer.TYPE
                r5 = 0
                r6 = 88326(0x15906, float:1.23771E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003d
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f75627a
                r13 = 0
                r14 = 88326(0x15906, float:1.23771E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Integer.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x003d:
                if (r0 != 0) goto L_0x0041
                goto L_0x0130
            L_0x0041:
                int r1 = r18.hashCode()
                switch(r1) {
                    case -2026708222: goto L_0x0125;
                    case -1842036323: goto L_0x011a;
                    case -1286505224: goto L_0x0110;
                    case -1165154881: goto L_0x0104;
                    case -710131922: goto L_0x00f9;
                    case -612351174: goto L_0x00ef;
                    case -182649969: goto L_0x00e4;
                    case -121207376: goto L_0x00db;
                    case 3052376: goto L_0x00d0;
                    case 3135424: goto L_0x00c5;
                    case 3322092: goto L_0x00ba;
                    case 3524221: goto L_0x00af;
                    case 110541305: goto L_0x00a5;
                    case 215764042: goto L_0x009b;
                    case 452151140: goto L_0x0091;
                    case 954925063: goto L_0x0088;
                    case 998835423: goto L_0x007e;
                    case 1234580717: goto L_0x0074;
                    case 1425879700: goto L_0x006a;
                    case 1605556258: goto L_0x005f;
                    case 1691937916: goto L_0x0054;
                    case 1839865103: goto L_0x004a;
                    default: goto L_0x0048;
                }
            L_0x0048:
                goto L_0x0130
            L_0x004a:
                java.lang.String r1 = "find_friends"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x012d
            L_0x0054:
                java.lang.String r1 = "homepage_hot"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 13
                return r0
            L_0x005f:
                java.lang.String r1 = "other_following"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 10
                return r0
            L_0x006a:
                java.lang.String r1 = "search_result"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x0101
            L_0x0074:
                java.lang.String r1 = "discovery_recommend"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x012d
            L_0x007e:
                java.lang.String r1 = "general_search"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x0101
            L_0x0088:
                java.lang.String r1 = "message"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x00d8
            L_0x0091:
                java.lang.String r1 = "poi_page"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x0122
            L_0x009b:
                java.lang.String r1 = "categorized_city_poi"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x0122
            L_0x00a5:
                java.lang.String r1 = "token"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 6
                return r0
            L_0x00af:
                java.lang.String r1 = "scan"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 17
                return r0
            L_0x00ba:
                java.lang.String r1 = "live"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 16
                return r0
            L_0x00c5:
                java.lang.String r1 = "fans"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 9
                return r0
            L_0x00d0:
                java.lang.String r1 = "chat"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
            L_0x00d8:
                r0 = 8
                return r0
            L_0x00db:
                java.lang.String r1 = "discovery"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                goto L_0x0101
            L_0x00e4:
                java.lang.String r1 = "other_fans"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 11
                return r0
            L_0x00ef:
                java.lang.String r1 = "phone_number"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 4
                return r0
            L_0x00f9:
                java.lang.String r1 = "search_sug"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
            L_0x0101:
                r0 = 14
                return r0
            L_0x0104:
                java.lang.String r1 = "face_to_face"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 201901(0x314ad, float:2.82924E-40)
                return r0
            L_0x0110:
                java.lang.String r1 = "message_fans"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
                r0 = 7
                return r0
            L_0x011a:
                java.lang.String r1 = "homepage_fresh"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
            L_0x0122:
                r0 = 15
                return r0
            L_0x0125:
                java.lang.String r1 = "follow_rec"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0130
            L_0x012d:
                r0 = 12
                return r0
            L_0x0130:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bp.a.a(java.lang.String):int");
        }
    }

    @JvmStatic
    public static final int a(@NotNull ay ayVar) {
        ay ayVar2 = ayVar;
        if (!PatchProxy.isSupport(new Object[]{ayVar2}, null, f75625a, true, 88324, new Class[]{ay.class}, Integer.TYPE)) {
            return f75626b.a(ayVar2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{ayVar2}, null, f75625a, true, 88324, new Class[]{ay.class}, Integer.TYPE)).intValue();
    }

    @JvmStatic
    public static final int a(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75625a, true, 88323, new Class[]{String.class}, Integer.TYPE)) {
            return f75626b.a(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f75625a, true, 88323, new Class[]{String.class}, Integer.TYPE)).intValue();
    }
}
