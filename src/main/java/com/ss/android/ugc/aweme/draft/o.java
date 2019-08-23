package com.ss.android.ugc.aweme.draft;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.draft.a.b;
import com.ss.android.ugc.aweme.port.in.a;

public class o extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43497a;

    /* renamed from: b  reason: collision with root package name */
    private static o f43498b;

    private o() {
        super(a.f61119b.getApplicationContext(), "aweme.db", null, 20);
    }

    public static o a() {
        if (PatchProxy.isSupport(new Object[0], null, f43497a, true, 38461, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], null, f43497a, true, 38461, new Class[0], o.class);
        }
        if (f43498b == null) {
            synchronized (o.class) {
                if (f43498b == null) {
                    f43498b = new o();
                }
            }
        }
        return f43498b;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f43497a, false, 38462, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f43497a, false, 38462, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT\n);");
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (r1.isClosed() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r1.isClosed() == false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.database.sqlite.SQLiteDatabase r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f43497a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.database.sqlite.SQLiteDatabase> r5 = android.database.sqlite.SQLiteDatabase.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r7 = 0
            r8 = 38465(0x9641, float:5.3901E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f43497a
            r17 = 0
            r18 = 38465(0x9641, float:5.3901E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.database.sqlite.SQLiteDatabase> r1 = android.database.sqlite.SQLiteDatabase.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005e:
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            java.lang.String r5 = "SELECT * FROM "
            r4.<init>(r5)     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            r4.append(r1)     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            java.lang.String r1 = " LIMIT 0"
            r4.append(r1)     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x009d, all -> 0x0090 }
            if (r1 == 0) goto L_0x0084
            int r0 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x009e, all -> 0x0081 }
            r2 = -1
            if (r0 == r2) goto L_0x0084
            r11 = 1
            goto L_0x0084
        L_0x0081:
            r0 = move-exception
            r3 = r1
            goto L_0x0091
        L_0x0084:
            if (r1 == 0) goto L_0x00a7
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x00a7
        L_0x008c:
            r1.close()
            goto L_0x00a7
        L_0x0090:
            r0 = move-exception
        L_0x0091:
            if (r3 == 0) goto L_0x009c
            boolean r1 = r3.isClosed()
            if (r1 != 0) goto L_0x009c
            r3.close()
        L_0x009c:
            throw r0
        L_0x009d:
            r1 = r3
        L_0x009e:
            if (r1 == 0) goto L_0x00a7
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x00a7
            goto L_0x008c
        L_0x00a7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.o.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43497a, false, 38463, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43497a, false, 38463, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            UIUtils.displayToast(a.f61119b.getApplicationContext(), (int) C0906R.string.doi);
            if (PatchProxy.isSupport(new Object[]{0}, null, p.f43499a, true, 38466, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{0}, null, p.f43499a, true, 38466, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                System.exit(0);
                return;
            }
            throw new RuntimeException("Process killed, status is " + 0);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43497a, false, 38464, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43497a, false, 38464, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.x.a(true);
        if (i3 == 1 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN effect INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN origin INTEGER");
        }
        if (i3 <= 2 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN face_beauty INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN user_id TEXT");
        }
        if (i3 <= 3 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN segment_video TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN segment_sdk TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN hard_encode INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN special_points INTEGER");
        }
        if (i3 <= 4 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_path TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_id TEXT");
        }
        if (i3 <= 5 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_id TEXT");
        }
        if (i3 <= 6 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN effect_list TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN camera_poi INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN filter_label TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN beauty_label INTEGER");
        }
        if (i3 <= 7 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN reverse_path TEXT");
        }
        if (i3 <= 8 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect TEXT");
        }
        if (i3 <= 9 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_speed TEXT");
        }
        if (i3 <= 10 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect_segments TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN is_private INTEGER");
        }
        if (i3 <= 11 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN max_duration INTEGER");
            sQLiteDatabase2.execSQL("UPDATE local_draft SET max_duration = 15000");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN audio_track TEXT");
        }
        if (i3 <= 12 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN new_version INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN output_wav_path TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN custom_cover_start FLOAT");
        }
        if (i3 <= 13 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_width INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_height INTEGER");
        }
        if (i3 <= 14 && i3 != i4) {
            sQLiteDatabase2.execSQL(" UPDATE local_draft SET video_width = 540 ");
            sQLiteDatabase2.execSQL(" UPDATE local_draft SET video_height = 960 ");
        }
        if (i3 <= 15 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN duet_from TEXT");
            if (!com.ss.android.g.a.b()) {
                sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sync_platforms TEXT");
            }
        }
        if (i3 <= 16 && i3 != i4) {
            if (com.ss.android.g.a.b()) {
                sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sync_platforms TEXT");
            }
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN photo_movie TEXT");
        }
        if (i3 <= 17 && i3 != i4) {
            sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
        }
        if (i3 <= 18 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
            b bVar = new b();
            bVar.f43428b = 1;
            bVar.f43429c = 3;
            String json = a.f61120c.toJson((Object) bVar);
            sQLiteDatabase2.execSQL(" UPDATE local_draft SET draft_extras = '" + json + "'");
        }
        if (com.ss.android.g.a.c()) {
            if (i3 <= 19 && i3 != i4) {
                sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
            }
            if (i3 <= 19 && i3 != i4) {
                b bVar2 = new b();
                bVar2.f43428b = 1;
                bVar2.f43429c = 3;
                String json2 = a.f61120c.toJson((Object) bVar2);
                if (!a(sQLiteDatabase2, "local_draft", "draft_extras")) {
                    sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
                    sQLiteDatabase2.execSQL(" UPDATE local_draft SET draft_extras = '" + json2 + "'");
                    return;
                }
                sQLiteDatabase2.execSQL(" UPDATE local_draft SET draft_extras = '" + json2 + "' WHERE draft_extras" + " IS NULL");
            }
        }
    }
}
