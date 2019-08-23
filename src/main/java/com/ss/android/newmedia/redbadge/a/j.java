package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.c.b;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30289a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f30290b = {"_id", "class"};

    /* renamed from: c  reason: collision with root package name */
    private d f30291c;

    public j() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f30291c = new d();
        }
    }

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30289a, false, 18811, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30289a, false, 18811, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    private ContentValues a(ComponentName componentName, int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{componentName, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f30289a, false, 18810, new Class[]{ComponentName.class, Integer.TYPE, Boolean.TYPE}, ContentValues.class)) {
            return (ContentValues) PatchProxy.accessDispatch(new Object[]{componentName, Integer.valueOf(i), Byte.valueOf(z)}, this, f30289a, false, 18810, new Class[]{ComponentName.class, Integer.TYPE, Boolean.TYPE}, ContentValues.class);
        }
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        boolean z;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        if (PatchProxy.isSupport(new Object[]{context2, componentName2, Integer.valueOf(i)}, this, f30289a, false, 18809, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName2, Integer.valueOf(i)}, this, f30289a, false, 18809, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName2 != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            if (this.f30291c != null) {
                d dVar = this.f30291c;
                if (PatchProxy.isSupport(new Object[]{context2}, dVar, d.f30281a, false, 18792, new Class[]{Context.class}, Boolean.TYPE)) {
                    d dVar2 = dVar;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, dVar2, d.f30281a, false, 18792, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z = com.ss.android.newmedia.redbadge.c.a.a(context2, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
                }
                if (z) {
                    this.f30291c.a(context2, componentName2, i2);
                    return;
                }
            }
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                Cursor cursor2 = contentResolver.query(parse, f30290b, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor2 != null) {
                    try {
                        String className = componentName.getClassName();
                        boolean z2 = false;
                        while (cursor2.moveToNext()) {
                            int i3 = cursor2.getInt(0);
                            contentResolver.update(parse, a(componentName2, i2, false), "_id=?", new String[]{String.valueOf(i3)});
                            if (className.equals(cursor2.getString(cursor2.getColumnIndex("class")))) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            contentResolver.insert(parse, a(componentName2, i2, true));
                        }
                    } catch (Throwable th) {
                        th = th;
                        b.a(cursor2);
                        throw th;
                    }
                }
                b.a(cursor2);
            } catch (Throwable th2) {
                th = th2;
                throw new e(th.getMessage());
            }
        }
    }
}
