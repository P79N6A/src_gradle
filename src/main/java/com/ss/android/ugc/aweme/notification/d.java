package com.ss.android.ugc.aweme.notification;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.an;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/NoticeSharePrefCache;", "", "()V", "TAG", "", "RobotDeleteManager", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f58086a = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X.¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/NoticeSharePrefCache$RobotDeleteManager;", "", "()V", "ROBOT_LAST_DELETE_TIMESTAMP", "", "mCurrentNoticeMap", "", "", "", "mDataType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "mGson", "Lcom/google/gson/Gson;", "mRobotLastTimestampCacheItem", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "getMRobotLastTimestampCacheItem", "()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "mRobotLastTimestampKey", "getMRobotLastTimestampKey", "()Ljava/lang/String;", "mUserId", "initData", "", "isGroupDeleted", "", "groupType", "lastTimestamp", "updateDeleteTime", "timestamp", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58087a;

        /* renamed from: b  reason: collision with root package name */
        public static String f58088b;

        /* renamed from: c  reason: collision with root package name */
        public static final Gson f58089c = new Gson();

        /* renamed from: d  reason: collision with root package name */
        public static final Type f58090d = new C0652a().getType();

        /* renamed from: e  reason: collision with root package name */
        public static Map<Integer, Long> f58091e;

        /* renamed from: f  reason: collision with root package name */
        public static final a f58092f = new a();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/notification/NoticeSharePrefCache$RobotDeleteManager$mDataType$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.notification.d$a$a  reason: collision with other inner class name */
        public static final class C0652a extends TypeToken<Map<Integer, Long>> {
            C0652a() {
            }
        }

        private a() {
        }

        public final an<String> a() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f58087a, false, 62820, new Class[0], an.class)) {
                return (an) PatchProxy.accessDispatch(new Object[0], this, f58087a, false, 62820, new Class[0], an.class);
            }
            if (PatchProxy.isSupport(new Object[0], this, f58087a, false, 62819, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f58087a, false, 62819, new Class[0], String.class);
            } else {
                StringBuilder sb = new StringBuilder("robot_last_delete_timestamp");
                String str2 = f58088b;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUserId");
                }
                sb.append(str2);
                str = sb.toString();
            }
            return new an<>(str, "");
        }

        public final void b() {
            Map<Integer, Long> map;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f58087a, false, 62823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58087a, false, 62823, new Class[0], Void.TYPE);
                return;
            }
            String str = (String) a().c();
            try {
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (z) {
                    map = new LinkedHashMap<>();
                } else {
                    Object fromJson = f58089c.fromJson(str, f58090d);
                    Intrinsics.checkExpressionValueIsNotNull(fromJson, "mGson.fromJson(string, mDataType)");
                    map = (Map) fromJson;
                }
            } catch (Exception unused) {
                map = new LinkedHashMap<>();
            }
            f58091e = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x007f, code lost:
            if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3.getCurUserId())) != false) goto L_0x0081;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final boolean a(int r19, long r20) {
            /*
                r0 = r20
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
                r10 = 0
                r3[r10] = r4
                java.lang.Long r4 = new java.lang.Long
                r4.<init>(r0)
                r11 = 1
                r3[r11] = r4
                com.meituan.robust.ChangeQuickRedirect r5 = f58087a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r10] = r4
                java.lang.Class r4 = java.lang.Long.TYPE
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Boolean.TYPE
                r4 = 0
                r6 = 1
                r7 = 62821(0xf565, float:8.8031E-41)
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x005c
                java.lang.Object[] r12 = new java.lang.Object[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
                r12[r10] = r3
                java.lang.Long r3 = new java.lang.Long
                r3.<init>(r0)
                r12[r11] = r3
                r13 = 0
                com.meituan.robust.ChangeQuickRedirect r14 = f58087a
                r15 = 1
                r16 = 62821(0xf565, float:8.8031E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Long.TYPE
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Boolean.TYPE
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x005c:
                java.util.Map<java.lang.Integer, java.lang.Long> r2 = f58091e
                if (r2 == 0) goto L_0x0081
                java.lang.String r2 = f58088b
                if (r2 == 0) goto L_0x0081
                java.lang.String r2 = f58088b
                if (r2 != 0) goto L_0x006d
                java.lang.String r3 = "mUserId"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x006d:
                com.ss.android.ugc.aweme.IAccountUserService r3 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r4 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r3 = r3.getCurUserId()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
                r2 = r2 ^ r11
                if (r2 == 0) goto L_0x009a
            L_0x0081:
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r3 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                java.lang.String r2 = r2.getCurUserId()
                java.lang.String r3 = "AccountUserProxyService.get().curUserId"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                f58088b = r2
                com.ss.android.ugc.aweme.notification.d$a r2 = f58092f
                r2.b()
            L_0x009a:
                java.util.Map<java.lang.Integer, java.lang.Long> r2 = f58091e
                if (r2 != 0) goto L_0x00a3
                java.lang.String r3 = "mCurrentNoticeMap"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x00a3:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                if (r2 == 0) goto L_0x00b9
                long r2 = r2.longValue()
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x00b8
                return r11
            L_0x00b8:
                return r10
            L_0x00b9:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.d.a.a(int, long):boolean");
        }
    }

    private d() {
    }
}
