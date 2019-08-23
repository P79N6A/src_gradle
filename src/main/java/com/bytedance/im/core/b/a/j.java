package com.bytedance.im.core.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.d.c;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f20939a;

    private j() {
    }

    public static j a() {
        if (f20939a == null) {
            synchronized (j.class) {
                if (f20939a == null) {
                    f20939a = new j();
                }
            }
        }
        return f20939a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_core (");
        for (c cVar : c.values()) {
            sb.append(cVar.key);
            sb.append(" ");
            sb.append(cVar.type);
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
        return d.a("conversation_core", c.COLUMN_ID.key + "=?", new String[]{str});
    }

    public static c a(String str) {
        b bVar;
        c cVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            d.a();
            bVar = d.a("select * from conversation_core where " + c.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (bVar.c()) {
                    if (bVar != null) {
                        c cVar2 = new c();
                        cVar2.setConversationId(bVar.c(bVar.a(c.COLUMN_ID.key)));
                        cVar2.setVersion(bVar.b(bVar.a(c.COLUMN_VERSION.key)));
                        cVar2.setName(bVar.c(bVar.a(c.COLUMN_NAME.key)));
                        cVar2.setIcon(bVar.c(bVar.a(c.COLUMN_ICON.key)));
                        cVar2.setDesc(bVar.c(bVar.a(c.COLUMN_DESC.key)));
                        cVar2.setNotice(bVar.c(bVar.a(c.COLUMN_NOTICE.key)));
                        cVar2.setOwner(bVar.b(bVar.a(c.COLUMN_OWNER_ID.key)));
                        cVar2.setSecOwner(bVar.c(bVar.a(c.COLUMN_SEC_OWNER.key)));
                        cVar2.setExtStr(bVar.c(bVar.a(c.COLUMN_EXT.key)));
                        cVar = cVar2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("get ", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return cVar;
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
            return cVar;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            r.a(bVar);
            throw th;
        }
        r.a(bVar);
        return cVar;
    }

    public static boolean a(c cVar) {
        Boolean bool;
        boolean z = false;
        if (cVar == null || TextUtils.isEmpty(cVar.getConversationId())) {
            return false;
        }
        Boolean bool2 = Boolean.FALSE;
        com.bytedance.im.core.b.a.c.d dVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_core(");
            for (c cVar2 : c.values()) {
                sb.append(cVar2.key);
                sb.append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            d.a();
            com.bytedance.im.core.b.a.c.d dVar2 = d.d(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
            if (!(dVar2 == null || cVar == null)) {
                try {
                    dVar2.d();
                    dVar2.a(c.COLUMN_ID.ordinal() + 1, r.a(cVar.getConversationId()));
                    dVar2.a(c.COLUMN_VERSION.ordinal() + 1, cVar.getVersion());
                    dVar2.a(c.COLUMN_NAME.ordinal() + 1, r.a(cVar.getName()));
                    dVar2.a(c.COLUMN_ICON.ordinal() + 1, r.a(cVar.getIcon()));
                    dVar2.a(c.COLUMN_DESC.ordinal() + 1, r.a(cVar.getDesc()));
                    dVar2.a(c.COLUMN_NOTICE.ordinal() + 1, r.a(cVar.getNotice()));
                    dVar2.a(c.COLUMN_OWNER_ID.ordinal() + 1, cVar.getOwner());
                    dVar2.a(c.COLUMN_SEC_OWNER.ordinal() + 1, r.a(cVar.getSecOwner()));
                    dVar2.a(c.COLUMN_EXT.ordinal() + 1, r.a(cVar.getExtStr()));
                } catch (Exception e2) {
                    e = e2;
                    dVar = dVar2;
                    try {
                        com.bytedance.im.core.b.e.d.a("insertOrUpdate ", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(dVar);
                        bool = bool2;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        dVar2 = dVar;
                        r.a(dVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r.a(dVar2);
                    throw th;
                }
            }
            if (dVar2.a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            r.a(dVar2);
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
