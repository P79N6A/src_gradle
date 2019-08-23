package com.tencent.wcdb;

import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.tencent.wcdb.database.SQLiteAbortException;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConstraintException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDiskIOException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;

public final class DatabaseUtils {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static Collator mColl;

    @Deprecated
    public static class InsertHelper {
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private String mInsertSQL;
        private SQLiteStatement mInsertStatement;
        private SQLiteStatement mPreparedStatement;
        private SQLiteStatement mReplaceStatement;
        private final String mTableName;

        public void prepareForInsert() {
            this.mPreparedStatement = getStatement(false);
            this.mPreparedStatement.clearBindings();
        }

        public void prepareForReplace() {
            this.mPreparedStatement = getStatement(true);
            this.mPreparedStatement.clearBindings();
        }

        public void close() {
            if (this.mInsertStatement != null) {
                this.mInsertStatement.close();
                this.mInsertStatement = null;
            }
            if (this.mReplaceStatement != null) {
                this.mReplaceStatement.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        /* JADX INFO: finally extract failed */
        public long execute() {
            if (this.mPreparedStatement != null) {
                try {
                    long executeInsert = this.mPreparedStatement.executeInsert();
                    this.mPreparedStatement = null;
                    return executeInsert;
                } catch (SQLException e2) {
                    Log.e("WCDB.DatabaseUtils", "Error executing InsertHelper with table " + this.mTableName, e2);
                    this.mPreparedStatement = null;
                    return -1;
                } catch (Throwable th) {
                    this.mPreparedStatement = null;
                    throw th;
                }
            } else {
                throw new IllegalStateException("you must prepare this inserter before calling execute");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void buildSQL() throws com.tencent.wcdb.SQLException {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.794E-43)
                r0.<init>(r1)
                java.lang.String r2 = "INSERT INTO "
                r0.append(r2)
                java.lang.String r2 = r9.mTableName
                r0.append(r2)
                java.lang.String r2 = " ("
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "VALUES ("
                r2.append(r1)
                r1 = 0
                com.tencent.wcdb.database.SQLiteDatabase r3 = r9.mDb     // Catch:{ all -> 0x00b3 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r5 = "PRAGMA table_info("
                r4.<init>(r5)     // Catch:{ all -> 0x00b3 }
                java.lang.String r5 = r9.mTableName     // Catch:{ all -> 0x00b3 }
                r4.append(r5)     // Catch:{ all -> 0x00b3 }
                java.lang.String r5 = ")"
                r4.append(r5)     // Catch:{ all -> 0x00b3 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b3 }
                com.tencent.wcdb.Cursor r3 = r3.rawQuery(r4, r1)     // Catch:{ all -> 0x00b3 }
                java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00b1 }
                int r4 = r3.getCount()     // Catch:{ all -> 0x00b1 }
                r1.<init>(r4)     // Catch:{ all -> 0x00b1 }
                r9.mColumns = r1     // Catch:{ all -> 0x00b1 }
                r1 = 1
                r4 = 1
            L_0x0049:
                boolean r5 = r3.moveToNext()     // Catch:{ all -> 0x00b1 }
                if (r5 == 0) goto L_0x00a2
                java.lang.String r5 = r3.getString(r1)     // Catch:{ all -> 0x00b1 }
                r6 = 4
                java.lang.String r6 = r3.getString(r6)     // Catch:{ all -> 0x00b1 }
                java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r9.mColumns     // Catch:{ all -> 0x00b1 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00b1 }
                r7.put(r5, r8)     // Catch:{ all -> 0x00b1 }
                java.lang.String r7 = "'"
                r0.append(r7)     // Catch:{ all -> 0x00b1 }
                r0.append(r5)     // Catch:{ all -> 0x00b1 }
                java.lang.String r5 = "'"
                r0.append(r5)     // Catch:{ all -> 0x00b1 }
                if (r6 != 0) goto L_0x0076
                java.lang.String r5 = "?"
                r2.append(r5)     // Catch:{ all -> 0x00b1 }
                goto L_0x0083
            L_0x0076:
                java.lang.String r5 = "COALESCE(?, "
                r2.append(r5)     // Catch:{ all -> 0x00b1 }
                r2.append(r6)     // Catch:{ all -> 0x00b1 }
                java.lang.String r5 = ")"
                r2.append(r5)     // Catch:{ all -> 0x00b1 }
            L_0x0083:
                int r5 = r3.getCount()     // Catch:{ all -> 0x00b1 }
                if (r4 != r5) goto L_0x008c
                java.lang.String r5 = ") "
                goto L_0x008e
            L_0x008c:
                java.lang.String r5 = ", "
            L_0x008e:
                r0.append(r5)     // Catch:{ all -> 0x00b1 }
                int r5 = r3.getCount()     // Catch:{ all -> 0x00b1 }
                if (r4 != r5) goto L_0x009a
                java.lang.String r5 = ");"
                goto L_0x009c
            L_0x009a:
                java.lang.String r5 = ", "
            L_0x009c:
                r2.append(r5)     // Catch:{ all -> 0x00b1 }
                int r4 = r4 + 1
                goto L_0x0049
            L_0x00a2:
                if (r3 == 0) goto L_0x00a7
                r3.close()
            L_0x00a7:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r9.mInsertSQL = r0
                return
            L_0x00b1:
                r0 = move-exception
                goto L_0x00b5
            L_0x00b3:
                r0 = move-exception
                r3 = r1
            L_0x00b5:
                if (r3 == 0) goto L_0x00ba
                r3.close()
            L_0x00ba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.DatabaseUtils.InsertHelper.buildSQL():void");
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("column '" + str + "' is invalid");
        }

        private SQLiteStatement getStatement(boolean z) throws SQLException {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        public void bind(int i, double d2) {
            this.mPreparedStatement.bindDouble(i, d2);
        }

        public void bind(int i, float f2) {
            this.mPreparedStatement.bindDouble(i, (double) f2);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, (long) i2);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        /* JADX INFO: finally extract failed */
        private long insertInternal(ContentValues contentValues, boolean z) {
            this.mDb.beginTransactionNonExclusive();
            try {
                SQLiteStatement statement = getStatement(z);
                statement.clearBindings();
                for (Map.Entry next : contentValues.valueSet()) {
                    DatabaseUtils.bindObjectToProgram(statement, getColumnIndex((String) next.getKey()), next.getValue());
                }
                long executeInsert = statement.executeInsert();
                this.mDb.setTransactionSuccessful();
                this.mDb.endTransaction();
                return executeInsert;
            } catch (SQLException e2) {
                Log.e("WCDB.DatabaseUtils", "Error inserting " + contentValues + " into table  " + this.mTableName, e2);
                this.mDb.endTransaction();
                return -1;
            } catch (Throwable th) {
                this.mDb.endTransaction();
                throw th;
            }
        }

        public void bind(int i, String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }

        public void bind(int i, boolean z) {
            long j;
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(i, j);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    private static int getKeyLen(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr.length;
        }
        return bArr.length - 1;
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            readExceptionFromParcel(parcel, parcel.readString(), readExceptionCode);
        }
    }

    public static String sqlEscapeString(String str) {
        StringBuilder sb = new StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    private static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator instance = Collator.getInstance();
            mColl = instance;
            instance.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static final int readExceptionCode(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -128) {
            return readInt;
        }
        if (parcel.readInt() == 0) {
            Log.e("WCDB.DatabaseUtils", "Unexpected zero-sized Parcel reply header.");
        }
        return 0;
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) throws FileNotFoundException {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            String readString = parcel.readString();
            if (readExceptionCode != 1) {
                readExceptionFromParcel(parcel, readString, readExceptionCode);
                return;
            }
            throw new FileNotFoundException(readString);
        }
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) throws OperationApplicationException {
        int readExceptionCode = readExceptionCode(parcel);
        if (readExceptionCode != 0) {
            String readString = parcel.readString();
            if (readExceptionCode != 10) {
                readExceptionFromParcel(parcel, readString, readExceptionCode);
                return;
            }
            throw new OperationApplicationException(readString);
        }
    }

    private static char[] encodeHex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = DIGITS[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = DIGITS[bArr[i2] & 15];
        }
        return cArr;
    }

    private static int extractSqlCode(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int charAt = str.charAt(i2);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                return 0;
            }
            i |= (charAt & 127) << (i2 * 8);
        }
        return i;
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return 1;
        }
        return 3;
    }

    public static int getSqlStatementType(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        switch (extractSqlCode(trim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        return queryNumEntries(sQLiteDatabase, str, null, null);
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public static int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public static boolean objectEquals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("NULL");
            return;
        }
        if (!(obj instanceof Boolean)) {
            appendEscapedSQLString(sb, obj.toString());
        } else if (((Boolean) obj).booleanValue()) {
            sb.append('1');
        } else {
            sb.append('0');
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor;
        if (cursor instanceof AbstractWindowedCursor) {
            abstractWindowedCursor = (AbstractWindowedCursor) cursor;
        } else {
            abstractWindowedCursor = null;
        }
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static boolean queryIsEmpty(SQLiteDatabase sQLiteDatabase, String str) {
        if (longForQuery(sQLiteDatabase, "select exists(select 1 from " + str + ")", null) == 0) {
            return true;
        }
        return false;
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        printStream.println(cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + str);
        }
        printStream.println("}");
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeExceptionToParcel(android.os.Parcel r4, java.lang.Exception r5) {
        /*
            boolean r0 = r5 instanceof java.io.FileNotFoundException
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0009
            r0 = 1
        L_0x0007:
            r3 = 0
            goto L_0x004a
        L_0x0009:
            boolean r0 = r5 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0010
            r0 = 2
        L_0x000e:
            r3 = 1
            goto L_0x004a
        L_0x0010:
            boolean r0 = r5 instanceof java.lang.UnsupportedOperationException
            if (r0 == 0) goto L_0x0016
            r0 = 3
            goto L_0x000e
        L_0x0016:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteAbortException
            if (r0 == 0) goto L_0x001c
            r0 = 4
            goto L_0x000e
        L_0x001c:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteConstraintException
            if (r0 == 0) goto L_0x0022
            r0 = 5
            goto L_0x000e
        L_0x0022:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException
            if (r0 == 0) goto L_0x0028
            r0 = 6
            goto L_0x000e
        L_0x0028:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteFullException
            if (r0 == 0) goto L_0x002e
            r0 = 7
            goto L_0x000e
        L_0x002e:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteDiskIOException
            if (r0 == 0) goto L_0x0035
            r0 = 8
            goto L_0x000e
        L_0x0035:
            boolean r0 = r5 instanceof com.tencent.wcdb.database.SQLiteException
            if (r0 == 0) goto L_0x003c
            r0 = 9
            goto L_0x000e
        L_0x003c:
            boolean r0 = r5 instanceof android.content.OperationApplicationException
            if (r0 == 0) goto L_0x0043
            r0 = 10
            goto L_0x000e
        L_0x0043:
            boolean r0 = r5 instanceof com.tencent.wcdb.support.OperationCanceledException
            if (r0 == 0) goto L_0x0062
            r0 = 11
            goto L_0x0007
        L_0x004a:
            r4.writeInt(r0)
            java.lang.String r0 = r5.getMessage()
            r4.writeString(r0)
            if (r3 == 0) goto L_0x0061
            java.lang.String r4 = "WCDB.DatabaseUtils"
            java.lang.String r0 = "Writing exception to parcel"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            com.tencent.wcdb.support.Log.e(r4, r0, r2)
        L_0x0061:
            return
        L_0x0062:
            r4.writeException(r5)
            java.lang.String r4 = "WCDB.DatabaseUtils"
            java.lang.String r0 = "Writing exception to parcel"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            com.tencent.wcdb.support.Log.e(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.DatabaseUtils.writeExceptionToParcel(android.os.Parcel, java.lang.Exception):void");
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        sb.append(cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + str + "\n");
        }
        sb.append("}\n");
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return queryNumEntries(sQLiteDatabase, str, str2, null);
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndex)));
        }
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndex)));
        }
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndex)));
        }
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Long.valueOf(cursor.getLong(columnIndex)));
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, Short.valueOf(cursor.getShort(columnIndex)));
        }
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            contentValues.put(str, cursor.getString(columnIndex));
        }
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
        } else {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    sQLiteProgram.bindLong(i, 1);
                } else {
                    sQLiteProgram.bindLong(i, 0);
                }
            } else if (obj instanceof byte[]) {
                sQLiteProgram.bindBlob(i, (byte[]) obj);
            } else {
                sQLiteProgram.bindString(i, obj.toString());
            }
        }
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case e.l:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            case 11:
                throw new OperationCanceledException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static void cursorFillWindow(Cursor cursor, int i, CursorWindow cursorWindow) {
        boolean z;
        if (i >= 0 && i < cursor.getCount()) {
            int position = cursor.getPosition();
            int columnCount = cursor.getColumnCount();
            cursorWindow.clear();
            cursorWindow.setStartPosition(i);
            cursorWindow.setNumColumns(columnCount);
            if (cursor.moveToPosition(i)) {
                while (cursorWindow.allocRow()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < columnCount) {
                            int type = cursor.getType(i2);
                            if (type != 4) {
                                switch (type) {
                                    case 0:
                                        z = cursorWindow.putNull(i, i2);
                                        break;
                                    case 1:
                                        z = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                                        break;
                                    case 2:
                                        z = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                                        break;
                                    default:
                                        String string = cursor.getString(i2);
                                        if (string == null) {
                                            z = cursorWindow.putNull(i, i2);
                                            break;
                                        } else {
                                            z = cursorWindow.putString(string, i, i2);
                                            break;
                                        }
                                }
                            } else {
                                byte[] blob = cursor.getBlob(i2);
                                if (blob != null) {
                                    z = cursorWindow.putBlob(blob, i, i2);
                                } else {
                                    z = cursorWindow.putNull(i, i2);
                                }
                            }
                            if (!z) {
                                cursorWindow.freeLastRow();
                            } else {
                                i2++;
                            }
                        }
                    }
                    i++;
                    if (!cursor.moveToNext()) {
                    }
                }
            }
            cursor.moveToPosition(position);
        }
    }

    public static void createDbFromSqlStatements(Context context, String str, int i, String str2) {
        createDbFromSqlStatements(context, str, null, null, i, str2);
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, null);
        }
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, null);
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, null);
        }
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String str3;
        if (!TextUtils.isEmpty(str2)) {
            str3 = " where " + str2;
        } else {
            str3 = "";
        }
        return longForQuery(sQLiteDatabase, "select count(*) from " + str + str3, strArr);
    }

    public static void createDbFromSqlStatements(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, String str2) {
        SQLiteDatabase openOrCreateDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, 0, null);
        for (String str3 : TextUtils.split(str2, ";\n")) {
            if (!TextUtils.isEmpty(str3)) {
                openOrCreateDatabase.execSQL(str3);
            }
        }
        openOrCreateDatabase.setVersion(i);
        openOrCreateDatabase.close();
    }
}
