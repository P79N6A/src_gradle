package com.bytedance.im.core.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.d.f;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static m f20942a;

    private m() {
    }

    public static m a() {
        if (f20942a == null) {
            synchronized (m.class) {
                if (f20942a == null) {
                    f20942a = new m();
                }
            }
        }
        return f20942a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_setting (");
        for (d dVar : d.values()) {
            sb.append(dVar.key);
            sb.append(" ");
            sb.append(dVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.a();
        return d.a("conversation_setting", d.COLUMN_ID.key + "=?", new String[]{str});
    }

    public static f a(String str) {
        b bVar;
        f fVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            d.a();
            bVar = d.a("select * from conversation_setting where " + d.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (bVar.c()) {
                    if (bVar != null) {
                        f fVar2 = new f();
                        fVar2.setConversationId(bVar.c(bVar.a(d.COLUMN_ID.key)));
                        fVar2.setVersion(bVar.b(bVar.a(d.COLUMN_VERSION.key)));
                        fVar2.setStickTop(bVar.a(bVar.a(d.COLUMN_STICK_TOP.key)));
                        fVar2.setMute(bVar.a(bVar.a(d.COLUMN_MUTE.key)));
                        fVar2.setExtStr(bVar.c(bVar.a(d.COLUMN_EXT.key)));
                        fVar2.setFavor(bVar.a(bVar.a(d.COLUMN_FAVORITE.key)));
                        fVar = fVar2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("get ", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return fVar;
                } catch (Throwable th) {
                    th = th;
                    r.a(bVar);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("get ", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return fVar;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            r.a(bVar);
            throw th;
        }
        r.a(bVar);
        return fVar;
    }

    public static boolean a(f fVar) {
        Boolean bool;
        boolean z = false;
        if (fVar == null || TextUtils.isEmpty(fVar.getConversationId())) {
            return false;
        }
        Boolean bool2 = Boolean.FALSE;
        com.bytedance.im.core.b.a.c.d dVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_setting(");
            for (d dVar2 : d.values()) {
                sb.append(dVar2.key);
                sb.append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            d.a();
            com.bytedance.im.core.b.a.c.d d2 = d.d(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
            if (!(d2 == null || fVar == null)) {
                try {
                    d2.d();
                    d2.a(d.COLUMN_ID.ordinal() + 1, r.a(fVar.getConversationId()));
                    d2.a(d.COLUMN_VERSION.ordinal() + 1, fVar.getVersion());
                    d2.a(d.COLUMN_STICK_TOP.ordinal() + 1, (long) fVar.getStickTop());
                    d2.a(d.COLUMN_MUTE.ordinal() + 1, (long) fVar.getMute());
                    d2.a(d.COLUMN_EXT.ordinal() + 1, r.a(fVar.getExtStr()));
                    d2.a(d.COLUMN_FAVORITE.ordinal() + 1, (long) fVar.getFavor());
                } catch (Exception e2) {
                    e = e2;
                    dVar = d2;
                    try {
                        com.bytedance.im.core.b.e.d.a("insertOrUpdate ", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(dVar);
                        bool = bool2;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        r.a(dVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dVar = d2;
                    r.a(dVar);
                    throw th;
                }
            }
            if (d2.a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            r.a(d2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("insertOrUpdate ", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(dVar);
            bool = bool2;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }
}
