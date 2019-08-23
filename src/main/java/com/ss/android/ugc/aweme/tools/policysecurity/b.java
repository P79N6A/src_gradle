package com.ss.android.ugc.aweme.tools.policysecurity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0011j\b\u0012\u0004\u0012\u00020\b`\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundSQLiteHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "enqueueUploadTask", "", "originalSoundUploadTask", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "queryPendingTasks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removeTaskForAwemeId", "awemeId", "", "updateTask", "task", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74924a;

    /* renamed from: b  reason: collision with root package name */
    public static b f74925b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f74926c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundSQLiteHelper$Companion;", "", "()V", "AUDIO_PATH", "", "AUDIO_VID", "AWEME_ID", "NAME", "UPDATE_TIME", "VERSION", "", "VID", "sInstance", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundSQLiteHelper;", "getInstance", "context", "Landroid/content/Context;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74927a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final b a(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f74927a, false, 87251, new Class[]{Context.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{context2}, this, f74927a, false, 87251, new Class[]{Context.class}, b.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            if (b.f74925b == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
                b.f74925b = new b(applicationContext);
            }
            b bVar = b.f74925b;
            if (bVar != null) {
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundSQLiteHelper");
        }
    }

    @NotNull
    public final ArrayList<c> a() {
        Throwable th;
        if (PatchProxy.isSupport(new Object[0], this, f74924a, false, 87247, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f74924a, false, 87247, new Class[0], ArrayList.class);
        }
        ArrayList<c> arrayList = new ArrayList<>();
        Closeable query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "update_time"}, null, null, null, null, null);
        try {
            Cursor cursor = (Cursor) query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("aweme_id"));
                Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(it.getColumnIndex(AWEME_ID))");
                String string2 = cursor.getString(cursor.getColumnIndex("vid"));
                Intrinsics.checkExpressionValueIsNotNull(string2, "it.getString(it.getColumnIndex(VID))");
                String string3 = cursor.getString(cursor.getColumnIndex("audio_path"));
                Intrinsics.checkExpressionValueIsNotNull(string3, "it.getString(it.getColumnIndex(AUDIO_PATH))");
                c cVar = new c(string, string2, string3, cursor.getLong(cursor.getColumnIndex("update_time")));
                arrayList.add(cVar);
            }
            CloseableKt.closeFinally(query, null);
            return arrayList;
        } catch (Throwable th2) {
            CloseableKt.closeFinally(query, th);
            throw th2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context, "OriginalSound", null, 1);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74924a, false, 87246, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74924a, false, 87246, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "originalSoundUploadTask");
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", cVar2.f74930c);
        contentValues.put("vid", cVar2.f74931d);
        contentValues.put("audio_path", cVar2.f74932e);
        contentValues.put("audio_vid", cVar2.f74929b);
        contentValues.put("update_time", Long.valueOf(cVar2.f74933f));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
    }

    public final void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f74924a, false, 87244, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f74924a, false, 87244, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sQLiteDatabase2, "db");
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74924a, false, 87248, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f74924a, false, 87248, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "awemeId");
        getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{str2});
    }

    public final void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74924a, false, 87245, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74924a, false, 87245, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sQLiteDatabase2, "db");
        throw new k("An operation is not implemented: " + "not implemented");
    }
}
