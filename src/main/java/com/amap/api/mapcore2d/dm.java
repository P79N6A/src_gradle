package com.amap.api.mapcore2d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dm {

    /* renamed from: d  reason: collision with root package name */
    private static Map<Class<? extends dl>, dl> f5969d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private dr f5970a;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f5971b;

    /* renamed from: c  reason: collision with root package name */
    private dl f5972c;

    private boolean a(Annotation annotation) {
        return annotation != null;
    }

    /* JADX INFO: finally extract failed */
    public <T> void a(String str, Class<T> cls) {
        synchronized (this.f5972c) {
            String a2 = a(b(cls));
            if (!TextUtils.isEmpty(a2)) {
                this.f5971b = b(false);
                if (this.f5971b != null) {
                    try {
                        this.f5971b.delete(a2, str, null);
                        if (this.f5971b != null) {
                            this.f5971b.close();
                            this.f5971b = null;
                        }
                    } catch (Throwable th) {
                        try {
                            dd.a(th, "DataBase", "deleteData");
                            if (this.f5971b != null) {
                                this.f5971b.close();
                            }
                        } catch (Throwable th2) {
                            if (this.f5971b != null) {
                                this.f5971b.close();
                                this.f5971b = null;
                            }
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r4.f5971b != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r4.f5971b.close();
        r4.f5971b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0007, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0005, B:32:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void a(java.lang.String r5, java.lang.Object r6, boolean r7) {
        /*
            r4 = this;
            com.amap.api.mapcore2d.dl r0 = r4.f5972c
            monitor-enter(r0)
            if (r6 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r5 = move-exception
            goto L_0x0068
        L_0x0009:
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x0007 }
            com.amap.api.mapcore2d.dn r1 = r4.b((java.lang.Class<T>) r1)     // Catch:{ all -> 0x0007 }
            java.lang.String r2 = r4.a((com.amap.api.mapcore2d.dn) r1)     // Catch:{ all -> 0x0007 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0007 }
            if (r3 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x001d:
            android.content.ContentValues r6 = r4.a((java.lang.Object) r6, (com.amap.api.mapcore2d.dn) r1)     // Catch:{ all -> 0x0007 }
            if (r6 != 0) goto L_0x0025
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0025:
            android.database.sqlite.SQLiteDatabase r1 = r4.b((boolean) r7)     // Catch:{ all -> 0x0007 }
            r4.f5971b = r1     // Catch:{ all -> 0x0007 }
            android.database.sqlite.SQLiteDatabase r1 = r4.f5971b     // Catch:{ all -> 0x0007 }
            if (r1 != 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0031:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.f5971b     // Catch:{ Throwable -> 0x0045 }
            r3.update(r2, r6, r5, r1)     // Catch:{ Throwable -> 0x0045 }
            android.database.sqlite.SQLiteDatabase r5 = r4.f5971b     // Catch:{ all -> 0x0007 }
            if (r5 == 0) goto L_0x0066
            android.database.sqlite.SQLiteDatabase r5 = r4.f5971b     // Catch:{ all -> 0x0007 }
            r5.close()     // Catch:{ all -> 0x0007 }
        L_0x0040:
            r4.f5971b = r1     // Catch:{ all -> 0x0007 }
            goto L_0x0066
        L_0x0043:
            r5 = move-exception
            goto L_0x0050
        L_0x0045:
            r5 = move-exception
            if (r7 != 0) goto L_0x005c
            java.lang.String r6 = "DataBase"
            java.lang.String r7 = "updateData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0043 }
            goto L_0x005c
        L_0x0050:
            android.database.sqlite.SQLiteDatabase r6 = r4.f5971b     // Catch:{ all -> 0x0007 }
            if (r6 == 0) goto L_0x005b
            android.database.sqlite.SQLiteDatabase r6 = r4.f5971b     // Catch:{ all -> 0x0007 }
            r6.close()     // Catch:{ all -> 0x0007 }
            r4.f5971b = r1     // Catch:{ all -> 0x0007 }
        L_0x005b:
            throw r5     // Catch:{ all -> 0x0007 }
        L_0x005c:
            android.database.sqlite.SQLiteDatabase r5 = r4.f5971b     // Catch:{ all -> 0x0007 }
            if (r5 == 0) goto L_0x0066
            android.database.sqlite.SQLiteDatabase r5 = r4.f5971b     // Catch:{ all -> 0x0007 }
            r5.close()     // Catch:{ all -> 0x0007 }
            goto L_0x0040
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dm.a(java.lang.String, java.lang.Object, boolean):void");
    }

    public <T> void a(String str, Object obj) {
        a(str, obj, false);
    }

    public void a(Object obj, String str) {
        synchronized (this.f5972c) {
            List<?> b2 = b(str, obj.getClass());
            if (b2 != null) {
                if (b2.size() != 0) {
                    a(str, obj);
                }
            }
            a((T) obj);
        }
    }

    public <T> void a(T t) {
        a(t, false);
    }

    /* JADX INFO: finally extract failed */
    public <T> void a(T t, boolean z) {
        synchronized (this.f5972c) {
            this.f5971b = b(z);
            if (this.f5971b != null) {
                try {
                    a(this.f5971b, t);
                    if (this.f5971b != null) {
                        this.f5971b.close();
                        this.f5971b = null;
                    }
                } catch (Throwable th) {
                    try {
                        dd.a(th, "DataBase", "insertData");
                        if (this.f5971b != null) {
                            this.f5971b.close();
                        }
                    } catch (Throwable th2) {
                        if (this.f5971b != null) {
                            this.f5971b.close();
                            this.f5971b = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00fc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d7 A[SYNTHETIC, Splitter:B:86:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00e9 A[Catch:{ Throwable -> 0x00f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.util.List<T> a(java.lang.String r13, java.lang.Class<T> r14, boolean r15) {
        /*
            r12 = this;
            com.amap.api.mapcore2d.dl r0 = r12.f5972c
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            com.amap.api.mapcore2d.dn r2 = r12.b((java.lang.Class<T>) r14)     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = r12.a((com.amap.api.mapcore2d.dn) r2)     // Catch:{ all -> 0x00fd }
            android.database.sqlite.SQLiteDatabase r3 = r12.f5971b     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x001a
            android.database.sqlite.SQLiteDatabase r3 = r12.a((boolean) r15)     // Catch:{ all -> 0x00fd }
            r12.f5971b = r3     // Catch:{ all -> 0x00fd }
        L_0x001a:
            android.database.sqlite.SQLiteDatabase r3 = r12.f5971b     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x00fb
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x00fb
            if (r13 != 0) goto L_0x0028
            goto L_0x00fb
        L_0x0028:
            r11 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.f5971b     // Catch:{ Throwable -> 0x00a1, all -> 0x009e }
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r13
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00a1, all -> 0x009e }
            if (r13 != 0) goto L_0x0068
            android.database.sqlite.SQLiteDatabase r14 = r12.f5971b     // Catch:{ Throwable -> 0x0066 }
            r14.close()     // Catch:{ Throwable -> 0x0066 }
            r12.f5971b = r11     // Catch:{ Throwable -> 0x0066 }
            if (r13 == 0) goto L_0x004e
            r13.close()     // Catch:{ Throwable -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r13 = move-exception
            if (r15 != 0) goto L_0x004e
            java.lang.String r14 = "DataBase"
            java.lang.String r2 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x00fd }
        L_0x004e:
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x005a }
            if (r13 == 0) goto L_0x0064
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x005a }
            r13.close()     // Catch:{ Throwable -> 0x005a }
            r12.f5971b = r11     // Catch:{ Throwable -> 0x005a }
            goto L_0x0064
        L_0x005a:
            r13 = move-exception
            if (r15 != 0) goto L_0x0064
            java.lang.String r14 = "DataBase"
            java.lang.String r15 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x00fd }
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return r1
        L_0x0066:
            r14 = move-exception
            goto L_0x00a3
        L_0x0068:
            boolean r3 = r13.moveToNext()     // Catch:{ Throwable -> 0x0066 }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r12.a((android.database.Cursor) r13, (java.lang.Class<T>) r14, (com.amap.api.mapcore2d.dn) r2)     // Catch:{ Throwable -> 0x0066 }
            r1.add(r3)     // Catch:{ Throwable -> 0x0066 }
            goto L_0x0068
        L_0x0076:
            if (r13 == 0) goto L_0x0086
            r13.close()     // Catch:{ Throwable -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r13 = move-exception
            if (r15 != 0) goto L_0x0086
            java.lang.String r14 = "DataBase"
            java.lang.String r2 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x00fd }
        L_0x0086:
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x0093 }
            if (r13 == 0) goto L_0x00f9
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x0093 }
            r13.close()     // Catch:{ Throwable -> 0x0093 }
            r12.f5971b = r11     // Catch:{ Throwable -> 0x0093 }
            goto L_0x00f9
        L_0x0093:
            r13 = move-exception
            if (r15 != 0) goto L_0x00f9
            java.lang.String r14 = "DataBase"
            java.lang.String r15 = "searchListData"
        L_0x009a:
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x00fd }
            goto L_0x00f9
        L_0x009e:
            r14 = move-exception
            r13 = r11
            goto L_0x00ae
        L_0x00a1:
            r14 = move-exception
            r13 = r11
        L_0x00a3:
            if (r15 != 0) goto L_0x00d5
            java.lang.String r2 = "DataBase"
            java.lang.String r3 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r14, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00d5
        L_0x00ad:
            r14 = move-exception
        L_0x00ae:
            if (r13 == 0) goto L_0x00be
            r13.close()     // Catch:{ Throwable -> 0x00b4 }
            goto L_0x00be
        L_0x00b4:
            r13 = move-exception
            if (r15 != 0) goto L_0x00be
            java.lang.String r1 = "DataBase"
            java.lang.String r2 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00fd }
        L_0x00be:
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x00ca }
            if (r13 == 0) goto L_0x00d4
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x00ca }
            r13.close()     // Catch:{ Throwable -> 0x00ca }
            r12.f5971b = r11     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00d4
        L_0x00ca:
            r13 = move-exception
            if (r15 != 0) goto L_0x00d4
            java.lang.String r15 = "DataBase"
            java.lang.String r1 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r15, (java.lang.String) r1)     // Catch:{ all -> 0x00fd }
        L_0x00d4:
            throw r14     // Catch:{ all -> 0x00fd }
        L_0x00d5:
            if (r13 == 0) goto L_0x00e5
            r13.close()     // Catch:{ Throwable -> 0x00db }
            goto L_0x00e5
        L_0x00db:
            r13 = move-exception
            if (r15 != 0) goto L_0x00e5
            java.lang.String r14 = "DataBase"
            java.lang.String r2 = "searchListData"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r13, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x00fd }
        L_0x00e5:
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x00f1 }
            if (r13 == 0) goto L_0x00f9
            android.database.sqlite.SQLiteDatabase r13 = r12.f5971b     // Catch:{ Throwable -> 0x00f1 }
            r13.close()     // Catch:{ Throwable -> 0x00f1 }
            r12.f5971b = r11     // Catch:{ Throwable -> 0x00f1 }
            goto L_0x00f9
        L_0x00f1:
            r13 = move-exception
            if (r15 != 0) goto L_0x00f9
            java.lang.String r14 = "DataBase"
            java.lang.String r15 = "searchListData"
            goto L_0x009a
        L_0x00f9:
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return r1
        L_0x00fb:
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return r1
        L_0x00fd:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dm.a(java.lang.String, java.lang.Class, boolean):java.util.List");
    }

    private Field[] a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        if (z) {
            return cls.getSuperclass().getDeclaredFields();
        }
        return cls.getDeclaredFields();
    }

    private <T> String a(dn dnVar) {
        if (dnVar == null) {
            return null;
        }
        return dnVar.a();
    }

    private SQLiteDatabase a(boolean z) {
        try {
            if (this.f5971b == null) {
                this.f5971b = this.f5970a.getReadableDatabase();
            }
        } catch (Throwable th) {
            if (!z) {
                dd.a(th, "DBOperation", "getReadAbleDataBase");
            }
        }
        return this.f5971b;
    }

    private <T> dn b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(dn.class);
        if (!a(annotation)) {
            return null;
        }
        return (dn) annotation;
    }

    private SQLiteDatabase b(boolean z) {
        try {
            if (this.f5971b == null || this.f5971b.isReadOnly()) {
                if (this.f5971b != null) {
                    this.f5971b.close();
                }
                this.f5971b = this.f5970a.getWritableDatabase();
            }
        } catch (Throwable th) {
            dd.a(th, "DBOperation", "getWriteDatabase");
        }
        return this.f5971b;
    }

    public static synchronized dl a(Class<? extends dl> cls) throws IllegalAccessException, InstantiationException {
        dl dlVar;
        synchronized (dm.class) {
            if (f5969d.get(cls) == null) {
                f5969d.put(cls, cls.newInstance());
            }
            dlVar = f5969d.get(cls);
        }
        return dlVar;
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String next : map.keySet()) {
            if (z) {
                sb.append(next);
                sb.append(" = '");
                sb.append(map.get(next));
                sb.append("'");
                z = false;
            } else {
                sb.append(" and ");
                sb.append(next);
                sb.append(" = '");
                sb.append(map.get(next));
                sb.append("'");
            }
        }
        return sb.toString();
    }

    public <T> List<T> b(String str, Class<T> cls) {
        return a(str, (Class) cls, false);
    }

    public dm(Context context, dl dlVar) {
        try {
            dr drVar = new dr(context.getApplicationContext(), dlVar.a(), null, dlVar.b(), dlVar);
            this.f5970a = drVar;
        } catch (Throwable unused) {
        }
        this.f5972c = dlVar;
    }

    private ContentValues a(Object obj, dn dnVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), dnVar.b())) {
            field.setAccessible(true);
            a(obj, field, contentValues);
        }
        return contentValues;
    }

    private <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        dn b2 = b(t.getClass());
        String a2 = a(b2);
        if (!TextUtils.isEmpty(a2) && t != null && sQLiteDatabase != null) {
            ContentValues a3 = a((Object) t, b2);
            if (a3 != null) {
                sQLiteDatabase.insert(a2, null, a3);
            }
        }
    }

    private <T> T a(Cursor cursor, Class<T> cls, dn dnVar) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Field[] a2 = a(cls, dnVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : a2) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(Cdo.class);
            if (annotation != null) {
                Cdo doVar = (Cdo) annotation;
                int b2 = doVar.b();
                int columnIndex = cursor.getColumnIndex(doVar.a());
                switch (b2) {
                    case 1:
                        field.set(newInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case 2:
                        field.set(newInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case 3:
                        field.set(newInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case 4:
                        field.set(newInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case 5:
                        field.set(newInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case 6:
                        field.set(newInstance, cursor.getString(columnIndex));
                        break;
                    case e.l /*?: ONE_ARG  (7 int)*/:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return newInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.Object r3, java.lang.reflect.Field r4, android.content.ContentValues r5) {
        /*
            r2 = this;
            java.lang.Class<com.amap.api.mapcore2d.do> r0 = com.amap.api.mapcore2d.Cdo.class
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.amap.api.mapcore2d.do r0 = (com.amap.api.mapcore2d.Cdo) r0
            int r1 = r0.b()
            switch(r1) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0061;
                case 3: goto L_0x0051;
                case 4: goto L_0x0041;
                case 5: goto L_0x0031;
                case 6: goto L_0x0023;
                case 7: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0081
        L_0x0013:
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            byte[] r3 = (byte[]) r3     // Catch:{ IllegalAccessException -> 0x0080 }
            byte[] r3 = (byte[]) r3     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r4 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r4, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0081
        L_0x0023:
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r4 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r4, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0080
        L_0x0031:
            long r3 = r4.getLong(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r0 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r0, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0080
        L_0x0041:
            double r3 = r4.getDouble(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r0 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r0, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0080
        L_0x0051:
            float r3 = r4.getFloat(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r4 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r4, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0080
        L_0x0061:
            int r3 = r4.getInt(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r4 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r4, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            goto L_0x0080
        L_0x0071:
            short r3 = r4.getShort(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.String r4 = r0.a()     // Catch:{ IllegalAccessException -> 0x0080 }
            java.lang.Short r3 = java.lang.Short.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0080 }
            r5.put(r4, r3)     // Catch:{ IllegalAccessException -> 0x0080 }
        L_0x0080:
            return
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dm.a(java.lang.Object, java.lang.reflect.Field, android.content.ContentValues):void");
    }
}
