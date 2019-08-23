package com.ss.android.ugc.aweme.choosemusic.fragment;

import com.meituan.robust.ChangeQuickRedirect;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35982a;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094 A[SYNTHETIC, Splitter:B:20:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.app.Fragment a(android.content.Intent r27) {
        /*
            r0 = r27
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f35982a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            r7[r9] = r3
            java.lang.Class<android.support.v4.app.Fragment> r8 = android.support.v4.app.Fragment.class
            r3 = 0
            r5 = 1
            r6 = 26616(0x67f8, float:3.7297E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f35982a
            r13 = 1
            r14 = 26616(0x67f8, float:3.7297E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            r15[r9] = r0
            java.lang.Class<android.support.v4.app.Fragment> r16 = android.support.v4.app.Fragment.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            return r0
        L_0x0035:
            if (r0 == 0) goto L_0x0162
            java.lang.String r2 = "cid"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "name"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "is_hot"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "music_category_is_hot"
            boolean r5 = r0.getBooleanExtra(r5, r9)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x005e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005e }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r4 = r5
        L_0x005f:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = "music_class_id"
            java.lang.String r5 = r0.getStringExtra(r5)
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0079
            java.lang.String r3 = "music_class_name"
            java.lang.String r3 = r0.getStringExtra(r3)
        L_0x0079:
            java.lang.String r6 = "change_music_page_detail"
            java.lang.String r7 = "music_class_enter_method"
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r8 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r8 = r0.getIntExtra(r8, r1)
            java.lang.String r10 = "musicType"
            java.lang.String r0 = r0.getStringExtra(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            r11 = 2
            if (r10 != 0) goto L_0x009e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x009d }
            int r8 = r0.intValue()     // Catch:{ Exception -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r8 = 2
        L_0x009e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r7 = "click_banner"
        L_0x00a6:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0162
            r0 = 6
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r9] = r5
            r12[r1] = r3
            r12[r11] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r10 = 3
            r12[r10] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            r19 = 4
            r12[r19] = r2
            r2 = 5
            r12[r2] = r7
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.i
            r16 = 26603(0x67eb, float:3.7279E-41)
            java.lang.Class[] r15 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r9] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r1] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r11] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r15[r10] = r17
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r15[r19] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r2] = r17
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment> r18 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.class
            r17 = r15
            r15 = 1
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x0136
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r9] = r5
            r12[r1] = r3
            r12[r11] = r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r12[r10] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            r12[r19] = r3
            r12[r2] = r7
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.i
            r23 = 1
            r24 = 26603(0x67eb, float:3.7279E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r9] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r1] = r3
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r19] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r2] = r1
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment> r26 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.class
            r20 = r12
            r25 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment r0 = (com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment) r0
            return r0
        L_0x0136:
            com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment r0 = new com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "music_class_id"
            r1.putString(r2, r5)
            java.lang.String r2 = "music_class_name"
            r1.putString(r2, r3)
            java.lang.String r2 = "music_class_enter_from"
            r1.putString(r2, r6)
            java.lang.String r2 = "music_class_is_hot"
            r1.putBoolean(r2, r4)
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r1.putInt(r2, r8)
            java.lang.String r2 = "music_class_enter_method"
            r1.putString(r2, r7)
            r0.setArguments(r1)
            return r0
        L_0x0162:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.j.a(android.content.Intent):android.support.v4.app.Fragment");
    }
}
