package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.friends.model.DouyinContactModel;
import java.util.List;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75522a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f75523b = {"android.permission.READ_CONTACTS"};

    public interface a {
        void a();

        void b();
    }

    @NonNull
    public static List<DouyinContactModel> a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75522a, true, 88107, new Class[]{Context.class}, List.class)) {
            return a(context2, null, false).f75519a;
        }
        return (List) PatchProxy.accessDispatch(new Object[]{context2}, null, f75522a, true, 88107, new Class[]{Context.class}, List.class);
    }

    public static boolean b(@NonNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75522a, true, 88112, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75522a, true, 88112, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (ContextCompat.checkSelfPermission(context2, "android.permission.READ_CONTACTS") != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void a(@NonNull Activity activity, @Nullable a aVar) {
        Activity activity2 = activity;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, null, f75522a, true, 88114, new Class[]{Activity.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, null, f75522a, true, 88114, new Class[]{Activity.class, a.class}, Void.TYPE);
            return;
        }
        b.a(activity2, new String[]{"android.permission.READ_CONTACTS"}, new aq(aVar2, activity2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(java.lang.String[] r19, int[] r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f75522a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r11] = r4
            java.lang.Class<int[]> r9 = int[].class
            r4 = 0
            r6 = 1
            r7 = 88109(0x1582d, float:1.23467E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75522a
            r15 = 1
            r16 = 88109(0x1582d, float:1.23467E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r11] = r1
            java.lang.Class<int[]> r18 = int[].class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            int[] r0 = (int[]) r0
            return r0
        L_0x0048:
            r2 = 0
            if (r0 == 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r11 = 0
        L_0x004f:
            if (r11 == 0) goto L_0x0064
            int r0 = r0.length
            int r2 = r1.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = new int[r0]
            r3 = 0
        L_0x005a:
            if (r10 >= r0) goto L_0x0064
            r2[r10] = r3
            r4 = r1[r10]
            int r3 = r3 + r4
            int r10 = r10 + 1
            goto L_0x005a
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ap.a(java.lang.String[], int[]):int[]");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0266, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0267, code lost:
        switch(r8) {
            case 0: goto L_0x0355;
            case 1: goto L_0x0340;
            case 2: goto L_0x031e;
            case 3: goto L_0x030c;
            case 4: goto L_0x02fa;
            case 5: goto L_0x02e8;
            case 6: goto L_0x02cb;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l :int: goto L_0x02bb;
            case 8: goto L_0x028a;
            case 9: goto L_0x026e;
            default: goto L_0x026a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026a, code lost:
        r33 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026e, code lost:
        r33 = r1;
        r30 = r10.getString(r10.getColumnIndex("data2"));
        r29 = r10.getString(r10.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028a, code lost:
        r33 = r1;
        r15.put(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r43.getResources(), r10.getInt(r10.getColumnIndex("data5")), r10.getString(r10.getColumnIndex("data6"))).toString(), r10.getString(r10.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02bb, code lost:
        r1 = r10.getString(r10.getColumnIndex("data1"));
        r8 = r31;
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02cb, code lost:
        r33 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d8, code lost:
        if (r10.getInt(r10.getColumnIndex("data2")) != 3) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02da, code lost:
        r5 = r10.getString(r10.getColumnIndex("data1"));
        r8 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e8, code lost:
        r33 = r1;
        r14.add(r10.getString(r10.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02fa, code lost:
        r33 = r1;
        r13.add(r10.getString(r10.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r33 = r1;
        r12.add(r10.getString(r10.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x031e, code lost:
        r33 = r1;
        r9 = r10.getString(r10.getColumnIndex("data1"));
        r3 = r10.getString(r10.getColumnIndex("data5"));
        r6 = r10.getString(r10.getColumnIndex("data4"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0340, code lost:
        r33 = r1;
        r7 = r10.getString(r10.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x034d, code lost:
        r8 = r31;
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0351, code lost:
        r1 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0355, code lost:
        r33 = r1;
        r1 = r10.getString(r10.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0366, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0372, code lost:
        r41 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x038c, code lost:
        if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[]{r1}, null, com.ss.android.ugc.aweme.login.utils.b.f53839a, true, 56499, new java.lang.Class[]{java.lang.String.class}, java.lang.String.class) == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x038e, code lost:
        r1 = (java.lang.String) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[]{r1}, null, com.ss.android.ugc.aweme.login.utils.b.f53839a, true, 56499, new java.lang.Class[]{java.lang.String.class}, java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b5, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03b7, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03bb, code lost:
        r1 = r1.trim();
        r8 = java.util.regex.Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03cd, code lost:
        if (r8.find() == false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03cf, code lost:
        r8 = r8.group(0);
        r1 = r8 + com.ss.android.ugc.aweme.login.utils.b.b(r1.substring(r1.indexOf(r8) + r8.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03f6, code lost:
        r1 = com.ss.android.ugc.aweme.login.utils.b.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03ff, code lost:
        if (r11.contains(r1) != false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0401, code lost:
        r11.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04b3, code lost:
        r6 = r25;
        r13 = r26;
        r3 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04bb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04bb A[ExcHandler: all (th java.lang.Throwable), PHI: r41 
      PHI: (r41v11 android.database.Cursor) = (r41v10 android.database.Cursor), (r41v10 android.database.Cursor), (r41v14 android.database.Cursor) binds: [B:149:0x0477, B:150:?, B:125:0x037a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:125:0x037a] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x053b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.utils.ao a(android.content.Context r43, java.lang.String r44, boolean r45) {
        /*
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r7 = 0
            r9[r7] = r43
            r6 = 1
            r9[r6] = r44
            java.lang.Byte r2 = java.lang.Byte.valueOf(r45)
            r16 = 2
            r9[r16] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = f75522a
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r14[r7] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r14[r6] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r14[r16] = r2
            java.lang.Class<com.ss.android.ugc.aweme.utils.ao> r15 = com.ss.android.ugc.aweme.utils.ao.class
            r10 = 0
            r12 = 1
            r13 = 88108(0x1582c, float:1.23466E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0058
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r7] = r43
            r9[r6] = r44
            java.lang.Byte r0 = java.lang.Byte.valueOf(r45)
            r9[r16] = r0
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f75522a
            r12 = 1
            r13 = 88108(0x1582c, float:1.23466E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r14[r7] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r14[r6] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r14[r16] = r0
            java.lang.Class<com.ss.android.ugc.aweme.utils.ao> r15 = com.ss.android.ugc.aweme.utils.ao.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.utils.ao r0 = (com.ss.android.ugc.aweme.utils.ao) r0
            return r0
        L_0x0058:
            com.ss.android.ugc.aweme.utils.ao r9 = new com.ss.android.ugc.aweme.utils.ao
            r9.<init>()
            android.content.ContentResolver r17 = r43.getContentResolver()
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI
            r10 = 21
            if (r45 == 0) goto L_0x007b
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r10) goto L_0x007b
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX"
            java.lang.String r4 = "true"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r4)
            android.net.Uri r2 = r2.build()
        L_0x007b:
            r3 = r2
            r4 = 0
            r5 = 0
            r11 = 0
            r2 = r17
            r15 = 1
            r6 = r11
            r14 = 0
            r7 = r44
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x008d
            return r9
        L_0x008d:
            int r0 = r2.getCount()
            if (r0 != 0) goto L_0x0097
            r2.close()
            return r9
        L_0x0097:
            android.os.Bundle r0 = r2.getExtras()
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r10) goto L_0x00c0
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            java.lang.String[] r3 = r0.getStringArray(r3)
            java.lang.String r5 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            int[] r0 = r0.getIntArray(r5)
            r9.f75520b = r3
            r9.f75521c = r0
            goto L_0x00c2
        L_0x00c0:
            r0 = 0
            r3 = 0
        L_0x00c2:
            int[] r3 = a((java.lang.String[]) r3, (int[]) r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r2.getCount()
            r5.<init>(r0)
            r9.f75519a = r5
            r6 = 7
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r0 = "data1"
            r7[r14] = r0
            java.lang.String r0 = "data2"
            r7[r15] = r0
            java.lang.String r0 = "data3"
            r7[r16] = r0
            java.lang.String r0 = "data4"
            r7[r8] = r0
            java.lang.String r0 = "data5"
            r18 = 4
            r7[r18] = r0
            java.lang.String r0 = "data6"
            r19 = 5
            r7[r19] = r0
            java.lang.String r0 = "mimetype"
            r20 = 6
            r7[r20] = r0
            r13 = 0
            r21 = 0
        L_0x00f9:
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L_0x0557
            com.ss.android.ugc.aweme.friends.model.DouyinContactModel r12 = new com.ss.android.ugc.aweme.friends.model.DouyinContactModel
            r12.<init>()
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x04f7, all -> 0x04f1 }
            long r10 = r2.getLong(r0)     // Catch:{ Exception -> 0x04f7, all -> 0x04f1 }
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x04f7, all -> 0x04f1 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r10)     // Catch:{ Exception -> 0x04f7, all -> 0x04f1 }
            java.lang.String r10 = "entities"
            android.net.Uri r11 = android.net.Uri.withAppendedPath(r0, r10)     // Catch:{ Exception -> 0x04f7, all -> 0x04f1 }
            r0 = 0
            r22 = 0
            r23 = 0
            r10 = r17
            r4 = r12
            r12 = r7
            r6 = r13
            r13 = r0
            r14 = r22
            r15 = r23
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04ea, all -> 0x04e6 }
            if (r10 != 0) goto L_0x0159
            if (r10 == 0) goto L_0x0134
            r10.close()
        L_0x0134:
            if (r3 == 0) goto L_0x0154
            int r0 = r3.length
            int r10 = r21 + 1
            if (r0 <= r10) goto L_0x014e
            r0 = r3[r10]
            if (r6 >= r0) goto L_0x0140
            goto L_0x014e
        L_0x0140:
            java.lang.String[] r0 = r9.f75520b
            int r0 = r0.length
            if (r0 <= r10) goto L_0x014b
            java.lang.String[] r0 = r9.f75520b
            r0 = r0[r10]
            r4.section = r0
        L_0x014b:
            r21 = r10
            goto L_0x0154
        L_0x014e:
            java.lang.String[] r0 = r9.f75520b
            r0 = r0[r21]
        L_0x0152:
            r4.section = r0
        L_0x0154:
            int r13 = r6 + 1
            r6 = 7
            goto L_0x052f
        L_0x0159:
            int r0 = r10.getCount()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            if (r0 != 0) goto L_0x0184
            r10.close()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            if (r10 == 0) goto L_0x0167
            r10.close()
        L_0x0167:
            if (r3 == 0) goto L_0x0154
            int r0 = r3.length
            int r10 = r21 + 1
            if (r0 <= r10) goto L_0x017f
            r0 = r3[r10]
            if (r6 >= r0) goto L_0x0173
            goto L_0x017f
        L_0x0173:
            java.lang.String[] r0 = r9.f75520b
            int r0 = r0.length
            if (r0 <= r10) goto L_0x014b
            java.lang.String[] r0 = r9.f75520b
            r0 = r0[r10]
            r4.section = r0
            goto L_0x014b
        L_0x017f:
            java.lang.String[] r0 = r9.f75520b
            r0 = r0[r21]
            goto L_0x0152
        L_0x0184:
            java.lang.String r0 = "display_name"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r11.<init>()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r12.<init>()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r13.<init>()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r14.<init>()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r15.<init>()     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.lang.String r8 = "photo_uri"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x04dd, all -> 0x04d6 }
            r27 = r3
            r28 = r5
            r26 = r6
            r24 = r7
            r25 = r9
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r29 = 0
            r30 = 0
        L_0x01c5:
            boolean r22 = r10.moveToNext()     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r22 == 0) goto L_0x0416
            r31 = r8
            java.lang.String r8 = "mimetype"
            int r8 = r10.getColumnIndex(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r8 = r10.getString(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            boolean r22 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r22 != 0) goto L_0x0405
            r22 = -1
            int r23 = r8.hashCode()     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            switch(r23) {
                case -1569536764: goto L_0x025a;
                case -1328682538: goto L_0x024e;
                case -1079224304: goto L_0x0241;
                case -1079210633: goto L_0x0235;
                case 3430506: goto L_0x0229;
                case 456415478: goto L_0x021d;
                case 684173810: goto L_0x0211;
                case 689862072: goto L_0x0205;
                case 950831081: goto L_0x01f7;
                case 2034973555: goto L_0x01ea;
                default: goto L_0x01e6;
            }     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
        L_0x01e6:
            r32 = r5
            goto L_0x0266
        L_0x01ea:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/nickname"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 1
            goto L_0x0267
        L_0x01f7:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/im"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 8
            goto L_0x0267
        L_0x0205:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/organization"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 2
            goto L_0x0267
        L_0x0211:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/phone_v2"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 0
            goto L_0x0267
        L_0x021d:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/website"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 5
            goto L_0x0267
        L_0x0229:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/sip_address"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 4
            goto L_0x0267
        L_0x0235:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/note"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 7
            goto L_0x0267
        L_0x0241:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/name"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 9
            goto L_0x0267
        L_0x024e:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/contact_event"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 6
            goto L_0x0267
        L_0x025a:
            r32 = r5
            java.lang.String r5 = "vnd.android.cursor.item/email_v2"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r5 == 0) goto L_0x0266
            r8 = 3
            goto L_0x0267
        L_0x0266:
            r8 = -1
        L_0x0267:
            switch(r8) {
                case 0: goto L_0x0355;
                case 1: goto L_0x0340;
                case 2: goto L_0x031e;
                case 3: goto L_0x030c;
                case 4: goto L_0x02fa;
                case 5: goto L_0x02e8;
                case 6: goto L_0x02cb;
                case 7: goto L_0x02bb;
                case 8: goto L_0x028a;
                case 9: goto L_0x026e;
                default: goto L_0x026a;
            }     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
        L_0x026a:
            r33 = r1
            goto L_0x0409
        L_0x026e:
            java.lang.String r5 = "data2"
            int r5 = r10.getColumnIndex(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r5 = r10.getString(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r8 = "data3"
            int r8 = r10.getColumnIndex(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r8 = r10.getString(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r33 = r1
            r30 = r5
            r29 = r8
            goto L_0x0409
        L_0x028a:
            java.lang.String r5 = "data5"
            int r5 = r10.getColumnIndex(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            int r5 = r10.getInt(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r8 = "data6"
            int r8 = r10.getColumnIndex(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r8 = r10.getString(r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r33 = r1
            android.content.res.Resources r1 = r43.getResources()     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.CharSequence r1 = android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r1, r5, r8)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r5 = "data1"
            int r5 = r10.getColumnIndex(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r5 = r10.getString(r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r15.put(r1, r5)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            goto L_0x0409
        L_0x02bb:
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r8 = r31
            r5 = r32
            goto L_0x01c5
        L_0x02cb:
            r33 = r1
            java.lang.String r1 = "data2"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            int r1 = r10.getInt(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r5 = 3
            if (r1 != r5) goto L_0x0409
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r5 = r1
            r8 = r31
            goto L_0x0351
        L_0x02e8:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r14.add(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            goto L_0x0409
        L_0x02fa:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r13.add(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            goto L_0x0409
        L_0x030c:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r12.add(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            goto L_0x0409
        L_0x031e:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r9 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = "data5"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r3 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = "data4"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r6 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            goto L_0x034d
        L_0x0340:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r7 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
        L_0x034d:
            r8 = r31
            r5 = r32
        L_0x0351:
            r1 = r33
            goto L_0x01c5
        L_0x0355:
            r33 = r1
            r5 = 3
            java.lang.String r1 = "data1"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            if (r8 != 0) goto L_0x0409
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r8 = 0
            r5[r8] = r1     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r35 = 0
            com.meituan.robust.ChangeQuickRedirect r36 = com.ss.android.ugc.aweme.login.utils.b.f53839a     // Catch:{ Exception -> 0x04ca, all -> 0x04bf }
            r37 = 1
            r38 = 56499(0xdcb3, float:7.9172E-41)
            r41 = r10
            r8 = 1
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r22 = 0
            r10[r22] = r8     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.Class<java.lang.String> r40 = java.lang.String.class
            r34 = r5
            r39 = r10
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            if (r5 == 0) goto L_0x03b0
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r10 = 0
            r8[r10] = r1     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r35 = 0
            com.meituan.robust.ChangeQuickRedirect r36 = com.ss.android.ugc.aweme.login.utils.b.f53839a     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r37 = 1
            r38 = 56499(0xdcb3, float:7.9172E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            r1[r10] = r22     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.Class<java.lang.String> r40 = java.lang.String.class
            r34 = r8
            r39 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            goto L_0x03b9
        L_0x03b0:
            r5 = 1
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            if (r8 == 0) goto L_0x03bb
            java.lang.String r1 = ""
        L_0x03b9:
            r10 = 0
            goto L_0x03fb
        L_0x03bb:
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r8 = "\\+[0-9]{1,3}[ \\-]"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.util.regex.Matcher r8 = r8.matcher(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            boolean r10 = r8.find()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            if (r10 == 0) goto L_0x03f6
            r10 = 0
            java.lang.String r8 = r8.group(r10)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r5.<init>()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r5.append(r8)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            int r22 = r1.indexOf(r8)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            int r8 = r8.length()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            int r8 = r22 + r8
            java.lang.String r1 = r1.substring(r8)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r1 = com.ss.android.ugc.aweme.login.utils.b.b(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r5.append(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            goto L_0x03fb
        L_0x03f6:
            r10 = 0
            java.lang.String r1 = com.ss.android.ugc.aweme.login.utils.b.b(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
        L_0x03fb:
            boolean r5 = r11.contains(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            if (r5 != 0) goto L_0x040c
            r11.add(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            goto L_0x040c
        L_0x0405:
            r33 = r1
            r32 = r5
        L_0x0409:
            r41 = r10
            r10 = 0
        L_0x040c:
            r8 = r31
            r5 = r32
            r1 = r33
            r10 = r41
            goto L_0x01c5
        L_0x0416:
            r33 = r1
            r32 = r5
            r31 = r8
            r41 = r10
            r10 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r5 = 18
            if (r1 < r5) goto L_0x0446
            java.lang.String r1 = "contact_last_updated_timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r42 = r11
            long r10 = r2.getLong(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r1.<init>(r10)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r8 = "yyyy-MM-dd hh:mm:ss"
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r5.<init>(r8, r10)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            java.lang.String r1 = r5.format(r1)     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            goto L_0x0449
        L_0x0446:
            r42 = r11
            r1 = 0
        L_0x0449:
            r4.nickName = r7     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.name = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.jobDesc = r6     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.organization = r9     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.department = r3     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.emails = r12     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.urls = r14     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r33
            r4.note = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r32
            r4.birthday = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.addresses = r13     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.instantMessageAddresses = r15     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r4.modificationDate = r1     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r42
            r4.phoneNumber = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r31
            r4.mImageUrl = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r29
            r4.familyName = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r0 = r30
            r4.givenName = r0     // Catch:{ Exception -> 0x04bd, all -> 0x04bb }
            r1 = r28
            r1.add(r4)     // Catch:{ Exception -> 0x04b2, all -> 0x04bb }
            if (r41 == 0) goto L_0x047f
            r41.close()
        L_0x047f:
            if (r27 == 0) goto L_0x04aa
            r3 = r27
            int r0 = r3.length
            int r5 = r21 + 1
            if (r0 <= r5) goto L_0x04a0
            r0 = r3[r5]
            r13 = r26
            if (r13 >= r0) goto L_0x0491
            r6 = r25
            goto L_0x04a4
        L_0x0491:
            r6 = r25
            java.lang.String[] r0 = r6.f75520b
            int r0 = r0.length
            if (r0 <= r5) goto L_0x051e
            java.lang.String[] r0 = r6.f75520b
            r0 = r0[r5]
            r4.section = r0
            goto L_0x051e
        L_0x04a0:
            r6 = r25
            r13 = r26
        L_0x04a4:
            java.lang.String[] r0 = r6.f75520b
            r0 = r0[r21]
            goto L_0x0525
        L_0x04aa:
            r6 = r25
            r13 = r26
            r3 = r27
            goto L_0x0527
        L_0x04b2:
            r0 = move-exception
            r6 = r25
            r13 = r26
            r3 = r27
            goto L_0x04ff
        L_0x04bb:
            r0 = move-exception
            goto L_0x04c2
        L_0x04bd:
            r0 = move-exception
            goto L_0x04cd
        L_0x04bf:
            r0 = move-exception
            r41 = r10
        L_0x04c2:
            r6 = r25
            r13 = r26
            r3 = r27
            goto L_0x0534
        L_0x04ca:
            r0 = move-exception
            r41 = r10
        L_0x04cd:
            r6 = r25
            r13 = r26
            r3 = r27
            r1 = r28
            goto L_0x04ff
        L_0x04d6:
            r0 = move-exception
            r13 = r6
            r6 = r9
            r41 = r10
            goto L_0x0534
        L_0x04dd:
            r0 = move-exception
            r1 = r5
            r13 = r6
            r24 = r7
            r6 = r9
            r41 = r10
            goto L_0x04ff
        L_0x04e6:
            r0 = move-exception
            r13 = r6
            r6 = r9
            goto L_0x04f4
        L_0x04ea:
            r0 = move-exception
            r1 = r5
            r13 = r6
            r24 = r7
            r6 = r9
            goto L_0x04fd
        L_0x04f1:
            r0 = move-exception
            r6 = r9
            r4 = r12
        L_0x04f4:
            r41 = 0
            goto L_0x0534
        L_0x04f7:
            r0 = move-exception
            r1 = r5
            r24 = r7
            r6 = r9
            r4 = r12
        L_0x04fd:
            r41 = 0
        L_0x04ff:
            com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r0)     // Catch:{ all -> 0x0533 }
            if (r41 == 0) goto L_0x0507
            r41.close()
        L_0x0507:
            if (r3 == 0) goto L_0x0527
            int r0 = r3.length
            int r5 = r21 + 1
            if (r0 <= r5) goto L_0x0521
            r0 = r3[r5]
            if (r13 >= r0) goto L_0x0513
            goto L_0x0521
        L_0x0513:
            java.lang.String[] r0 = r6.f75520b
            int r0 = r0.length
            if (r0 <= r5) goto L_0x051e
            java.lang.String[] r0 = r6.f75520b
            r0 = r0[r5]
            r4.section = r0
        L_0x051e:
            r21 = r5
            goto L_0x0527
        L_0x0521:
            java.lang.String[] r0 = r6.f75520b
            r0 = r0[r21]
        L_0x0525:
            r4.section = r0
        L_0x0527:
            int r13 = r13 + 1
            r5 = r1
            r9 = r6
            r7 = r24
            r6 = 7
            r8 = 3
        L_0x052f:
            r14 = 0
            r15 = 1
            goto L_0x00f9
        L_0x0533:
            r0 = move-exception
        L_0x0534:
            if (r41 == 0) goto L_0x0539
            r41.close()
        L_0x0539:
            if (r3 == 0) goto L_0x0556
            int r1 = r3.length
            int r2 = r21 + 1
            if (r1 <= r2) goto L_0x0550
            r1 = r3[r2]
            if (r13 < r1) goto L_0x0550
            java.lang.String[] r1 = r6.f75520b
            int r1 = r1.length
            if (r1 <= r2) goto L_0x0556
            java.lang.String[] r1 = r6.f75520b
            r1 = r1[r2]
            r4.section = r1
            goto L_0x0556
        L_0x0550:
            java.lang.String[] r1 = r6.f75520b
            r1 = r1[r21]
            r4.section = r1
        L_0x0556:
            throw r0
        L_0x0557:
            r6 = r9
            r2.close()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ap.a(android.content.Context, java.lang.String, boolean):com.ss.android.ugc.aweme.utils.ao");
    }
}
