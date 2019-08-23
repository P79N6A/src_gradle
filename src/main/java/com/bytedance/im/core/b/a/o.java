package com.bytedance.im.core.b.a;

import android.content.ContentValues;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.b.a;
import com.bytedance.im.core.b.a.b.b;
import com.bytedance.im.core.b.a.c.d;
import com.bytedance.im.core.d.n;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static o f20944a;

    private o() {
    }

    public final boolean a(n nVar) {
        d dVar;
        String str;
        Boolean valueOf;
        n nVar2 = nVar;
        if (nVar2 == null || nVar.invalid()) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        try {
            long i = i(nVar.getUuid());
            if (nVar.getRowId() <= 0) {
                nVar2.setRowId(i);
            }
            com.bytedance.im.core.b.a.a.d.a();
            String uuid = nVar.getUuid();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            if (i > 0) {
                sb.append(" update msg set ");
                for (f fVar : f.values()) {
                    if (!"msg_uuid".equals(fVar.key)) {
                        sb.append(fVar.key);
                        sb.append("=?,");
                    }
                }
                String sb3 = sb.toString();
                str = sb3.substring(0, sb3.length() - 1) + " where msg_uuid='" + r.a(uuid) + "'";
            } else {
                sb.append(" insert into msg(");
                for (f fVar2 : f.values()) {
                    sb.append(fVar2.key);
                    sb.append(",");
                    sb2.append("?,");
                }
                String sb4 = sb.toString();
                String sb5 = sb2.toString();
                str = sb4.substring(0, sb4.length() - 1) + ") values (" + sb5.substring(0, sb5.length() - 1) + ");";
            }
            dVar = com.bytedance.im.core.b.a.a.d.d(str);
            if (i > 0) {
                if (!(dVar == null || nVar2 == null)) {
                    try {
                        dVar.a(f.COLUMN_SERVER_ID.ordinal() + 0, nVar.getMsgId());
                        dVar.a(f.COLUMN_CONVERSATION_ID.ordinal() + 0, r.a(nVar.getConversationId()));
                        dVar.a(f.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 0, nVar.getConversationShortId());
                        dVar.a(f.COLUMN_CONVERSATION_TYPE.ordinal() + 0, (long) nVar.getConversationType());
                        dVar.a(f.COLUMN_MSG_TYPE.ordinal() + 0, (long) nVar.getMsgType());
                        dVar.a(f.COLUMN_INNER_INDEX.ordinal() + 0, nVar.getIndex());
                        dVar.a(f.COLUMN_ORDER_INDEX.ordinal() + 0, nVar.getOrderIndex());
                        dVar.a(f.COLUMN_STATUS.ordinal() + 0, (long) nVar.getMsgStatus());
                        dVar.a(f.COLUMN_NET_STATUS.ordinal() + 0, (long) nVar.getSvrStatus());
                        dVar.a(f.COLUMN_VERSION.ordinal() + 0, nVar.getVersion());
                        dVar.a(f.COLUMN_DELETED.ordinal() + 0, (long) nVar.getDeleted());
                        dVar.a(f.COLUMN_CREATE_TIME.ordinal() + 0, nVar.getCreatedAt());
                        dVar.a(f.COLUMN_SENDER.ordinal() + 0, nVar.getSender());
                        dVar.a(f.COLUMN_CONTENT.ordinal() + 0, r.a(nVar.getContent()));
                        dVar.a(f.COLUMN_EXT.ordinal() + 0, r.a(nVar.getExtStr()));
                        dVar.a(f.COLUMN_LOCAL_INFO.ordinal() + 0, r.a(nVar.getLocalExtStr()));
                        dVar.a(f.COLUMN_READ_STATUS.ordinal() + 0, (long) nVar.getReadStatus());
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            com.bytedance.im.core.b.e.d.a("updateMessage", (Throwable) e);
                            com.bytedance.im.core.c.d.a(e);
                            r.a(dVar);
                            return bool.booleanValue();
                        } catch (Throwable th) {
                            th = th;
                            r.a(dVar);
                            throw th;
                        }
                    }
                }
                if (dVar.a() <= 0) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            } else {
                if (dVar != null) {
                    if (nVar2 != null) {
                        dVar.a(f.COLUMN_MSG_ID.ordinal() + 1, r.a(nVar.getUuid()));
                        dVar.a(f.COLUMN_SERVER_ID.ordinal() + 1, nVar.getMsgId());
                        dVar.a(f.COLUMN_CONVERSATION_ID.ordinal() + 1, r.a(nVar.getConversationId()));
                        dVar.a(f.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 1, nVar.getConversationShortId());
                        dVar.a(f.COLUMN_CONVERSATION_TYPE.ordinal() + 1, (long) nVar.getConversationType());
                        dVar.a(f.COLUMN_MSG_TYPE.ordinal() + 1, (long) nVar.getMsgType());
                        dVar.a(f.COLUMN_INNER_INDEX.ordinal() + 1, nVar.getIndex());
                        dVar.a(f.COLUMN_ORDER_INDEX.ordinal() + 1, nVar.getOrderIndex());
                        dVar.a(f.COLUMN_STATUS.ordinal() + 1, (long) nVar.getMsgStatus());
                        dVar.a(f.COLUMN_NET_STATUS.ordinal() + 1, (long) nVar.getSvrStatus());
                        dVar.a(f.COLUMN_VERSION.ordinal() + 1, nVar.getVersion());
                        dVar.a(f.COLUMN_DELETED.ordinal() + 1, (long) nVar.getDeleted());
                        dVar.a(f.COLUMN_CREATE_TIME.ordinal() + 1, nVar.getCreatedAt());
                        dVar.a(f.COLUMN_SENDER.ordinal() + 1, nVar.getSender());
                        dVar.a(f.COLUMN_CONTENT.ordinal() + 1, r.a(nVar.getContent()));
                        dVar.a(f.COLUMN_EXT.ordinal() + 1, r.a(nVar.getExtStr()));
                        dVar.a(f.COLUMN_LOCAL_INFO.ordinal() + 1, r.a(nVar.getLocalExtStr()));
                        dVar.a(f.COLUMN_READ_STATUS.ordinal() + 1, (long) nVar.getReadStatus());
                    }
                }
                long b2 = dVar.b();
                nVar2.setRowId(b2);
                if (b2 <= 0) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            bool = valueOf;
            if (bool.booleanValue()) {
                if (nVar.getDeleted() == 0) {
                    b.a().a(false, (Object) nVar2);
                } else {
                    b a2 = b.a();
                    if (b.c()) {
                        if (nVar2 != null) {
                            b.a aVar = new b.a(a2, (byte) 0);
                            aVar.f20906a = b.a((Object) nVar);
                            if (aVar.f20906a != null) {
                                if (!aVar.f20906a.isEmpty()) {
                                    Message message = new Message();
                                    message.what = 103;
                                    message.obj = aVar;
                                    a2.f20905a.sendMessage(message);
                                }
                            }
                        }
                    }
                }
                n.a().a(nVar2);
            }
            if (bool.booleanValue() && nVar.getAttachments() != null) {
                boolean b3 = i.a().b(nVar.getAttachments());
                r.a(dVar);
                return b3;
            }
        } catch (Exception e3) {
            e = e3;
            dVar = null;
            com.bytedance.im.core.b.e.d.a("updateMessage", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(dVar);
            return bool.booleanValue();
        } catch (Throwable th2) {
            th = th2;
            dVar = null;
            r.a(dVar);
            throw th;
        }
        r.a(dVar);
        return bool.booleanValue();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.bytedance.im.core.b.a.a.d.a();
        boolean c2 = com.bytedance.im.core.b.a.a.d.c("update msg set " + f.COLUMN_DELETED.key + "=1" + " where " + f.COLUMN_MSG_ID.key + "=\"" + str + "\"");
        if (c2) {
            n.a();
            n.a(str);
            b.a().a(str, a.COLUMN_MESSAGE_UUID.key);
        }
        return c2;
    }

    public static List<n> a(List<String> list, long j) {
        com.bytedance.im.core.b.a.c.b bVar = null;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_MSG_ID.key + " in ('" + q.a(list, "','") + "')  AND " + f.COLUMN_DELETED.key + "=? AND " + f.COLUMN_NET_STATUS.key + "=? AND " + f.COLUMN_INNER_INDEX.key + ">? order by " + f.COLUMN_ORDER_INDEX.key + " desc, " + f.COLUMN_CREATE_TIME.key + " desc", new String[]{PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, String.valueOf(j)});
            while (a2.d()) {
                try {
                    arrayList.add(a(a2));
                } catch (Exception e2) {
                    e = e2;
                    bVar = a2;
                    try {
                        com.bytedance.im.core.b.e.d.a("initMessageList", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("initMessageList", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static boolean a(String str, long j) {
        String str2 = "update msg set " + f.COLUMN_DELETED.key + "=1" + " where " + f.COLUMN_CONVERSATION_ID.key + "='" + str + "' AND " + f.COLUMN_INNER_INDEX.key + "<='" + j + "' AND " + f.COLUMN_INNER_INDEX.key + ">'0'";
        com.bytedance.im.core.b.a.a.d.a();
        return com.bytedance.im.core.b.a.a.d.c(str2);
    }

    public static o a() {
        if (f20944a == null) {
            synchronized (o.class) {
                if (f20944a == null) {
                    f20944a = new o();
                }
            }
        }
        return f20944a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg(");
        for (f fVar : f.values()) {
            sb.append(fVar.key);
            sb.append(" ");
            sb.append(fVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public final long f(String str) {
        n j = j(str);
        if (j != null) {
            return j.getIndex();
        }
        return 0;
    }

    public static boolean b(String str) {
        com.bytedance.im.core.b.a.a.d.a();
        boolean a2 = com.bytedance.im.core.b.a.a.d.a("msg", f.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
        if (a2) {
            n.a();
            n.b(str);
            b.a().a(str, a.COLUMN_CONVERSATION_ID.key, 2);
        }
        return a2;
    }

    public static n a(long j) {
        com.bytedance.im.core.b.a.c.b bVar;
        com.bytedance.im.core.b.a.c.b bVar2 = null;
        try {
            com.bytedance.im.core.b.a.a.d.a();
            bVar = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_SERVER_ID.key + "=?", new String[]{String.valueOf(j)});
            try {
                if (bVar.c()) {
                    n a2 = a(bVar);
                    r.a(bVar);
                    return a2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    r.a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            r.a(bVar2);
            throw th;
        }
        r.a(bVar);
        return null;
    }

    public static n c(String str) {
        com.bytedance.im.core.b.a.c.b bVar;
        com.bytedance.im.core.b.a.c.b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            com.bytedance.im.core.b.a.a.d.a();
            bVar = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_MSG_ID.key + "=?", new String[]{str});
            try {
                if (bVar.c()) {
                    n a2 = a(bVar);
                    r.a(bVar);
                    return a2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    r.a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            r.a(bVar2);
            throw th;
        }
        r.a(bVar);
        return null;
    }

    public static boolean d(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a("select * from msg where " + f.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (a2 != null) {
                try {
                    if (a2.b() > 0) {
                        z = true;
                    }
                } catch (Exception e2) {
                    Exception exc = e2;
                    bVar = a2;
                    e = exc;
                    try {
                        com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a2;
                    th = th3;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
            return z;
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return false;
        }
    }

    public static n e(String str) {
        com.bytedance.im.core.b.a.c.b bVar;
        com.bytedance.im.core.b.a.c.b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            com.bytedance.im.core.b.a.a.d.a();
            bVar = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? order by " + f.COLUMN_INNER_INDEX.key + " asc, " + f.COLUMN_CREATE_TIME.key + " asc limit 1", new String[]{str});
            try {
                if (bVar.c()) {
                    n a2 = a(bVar);
                    r.a(bVar);
                    return a2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("getLastShowMsg", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    r.a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("getLastShowMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            r.a(bVar2);
            throw th;
        }
        r.a(bVar);
        return null;
    }

    public static boolean h(String str) {
        String str2 = "update msg set " + f.COLUMN_READ_STATUS.key + "=1" + " where " + f.COLUMN_CONVERSATION_ID.key + "='" + str + "' AND " + f.COLUMN_INNER_INDEX.key + "='0'";
        com.bytedance.im.core.b.a.a.d.a();
        return com.bytedance.im.core.b.a.a.d.c(str2);
    }

    private static long i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a("select rowid from msg where " + f.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (a2 != null) {
                try {
                    if (a2.c()) {
                        long b2 = a2.b(a2.a("rowid"));
                        r.a(a2);
                        return b2;
                    }
                } catch (Exception e2) {
                    Exception exc = e2;
                    bVar = a2;
                    e = exc;
                    try {
                        com.bytedance.im.core.b.e.d.a("getRowid", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a2;
                    th = th3;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getRowid", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return -1;
        }
        return -1;
    }

    private static n j(String str) {
        com.bytedance.im.core.b.a.c.b bVar;
        com.bytedance.im.core.b.a.c.b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            com.bytedance.im.core.b.a.a.d.a();
            bVar = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? order by " + f.COLUMN_ORDER_INDEX.key + " desc, " + f.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str});
            try {
                if (bVar.c()) {
                    n a2 = a(bVar);
                    r.a(bVar);
                    return a2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("getLastMsg", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    r.a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("getLastMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            r.a(bVar2);
            throw th;
        }
        r.a(bVar);
        return null;
    }

    public static n g(String str) {
        com.bytedance.im.core.b.a.c.b bVar;
        com.bytedance.im.core.b.a.c.b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            com.bytedance.im.core.b.a.a.d.a();
            bVar = com.bytedance.im.core.b.a.a.d.a("select rowid,* from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? AND " + f.COLUMN_DELETED.key + "=? AND " + f.COLUMN_NET_STATUS.key + "=? order by " + f.COLUMN_ORDER_INDEX.key + " desc, " + f.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY});
            try {
                if (bVar.c()) {
                    n a2 = a(bVar);
                    r.a(bVar);
                    return a2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    com.bytedance.im.core.b.e.d.a("getLastShowMsg", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    r.a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("getLastShowMsg", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            r.a(bVar2);
            throw th;
        }
        r.a(bVar);
        return null;
    }

    private static n a(com.bytedance.im.core.b.a.c.b bVar) {
        if (bVar == null) {
            return null;
        }
        n nVar = new n();
        nVar.setRowId(bVar.b(bVar.a("rowid")));
        nVar.setUuid(bVar.c(bVar.a(f.COLUMN_MSG_ID.key)));
        nVar.setMsgId(bVar.b(bVar.a(f.COLUMN_SERVER_ID.key)));
        nVar.setConversationId(bVar.c(bVar.a(f.COLUMN_CONVERSATION_ID.key)));
        nVar.setConversationShortId(bVar.b(bVar.a(f.COLUMN_CONVERSATION_SHORT_ID.key)));
        nVar.setConversationType(bVar.a(bVar.a(f.COLUMN_CONVERSATION_TYPE.key)));
        nVar.setMsgType(bVar.a(bVar.a(f.COLUMN_MSG_TYPE.key)));
        nVar.setIndex(bVar.b(bVar.a(f.COLUMN_INNER_INDEX.key)));
        nVar.setOrderIndex(bVar.b(bVar.a(f.COLUMN_ORDER_INDEX.key)));
        nVar.setMsgStatus(bVar.a(bVar.a(f.COLUMN_STATUS.key)));
        nVar.setSvrStatus(bVar.a(bVar.a(f.COLUMN_NET_STATUS.key)));
        nVar.setVersion((long) bVar.a(bVar.a(f.COLUMN_VERSION.key)));
        nVar.setDeleted(bVar.a(bVar.a(f.COLUMN_DELETED.key)));
        nVar.setCreatedAt(bVar.b(bVar.a(f.COLUMN_CREATE_TIME.key)));
        nVar.setSender(bVar.b(bVar.a(f.COLUMN_SENDER.key)));
        nVar.setContent(bVar.c(bVar.a(f.COLUMN_CONTENT.key)));
        nVar.setExtStr(bVar.c(bVar.a(f.COLUMN_EXT.key)));
        nVar.setLocalExtStr(bVar.c(bVar.a(f.COLUMN_LOCAL_INFO.key)));
        nVar.setReadStatus(bVar.a(bVar.a(f.COLUMN_READ_STATUS.key)));
        i.a();
        nVar.setAttachments(i.a(nVar.getUuid()));
        return nVar;
    }

    public static boolean b(n nVar) {
        boolean z = false;
        if (nVar == null || nVar.invalid()) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(f.COLUMN_MSG_ID.key, nVar.getUuid());
        contentValues.put(f.COLUMN_SERVER_ID.key, Long.valueOf(nVar.getMsgId()));
        contentValues.put(f.COLUMN_CONVERSATION_ID.key, nVar.getConversationId());
        contentValues.put(f.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(nVar.getConversationShortId()));
        contentValues.put(f.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(nVar.getConversationType()));
        contentValues.put(f.COLUMN_MSG_TYPE.key, Integer.valueOf(nVar.getMsgType()));
        contentValues.put(f.COLUMN_INNER_INDEX.key, Long.valueOf(nVar.getIndex()));
        contentValues.put(f.COLUMN_ORDER_INDEX.key, Long.valueOf(nVar.getOrderIndex()));
        contentValues.put(f.COLUMN_STATUS.key, Integer.valueOf(nVar.getMsgStatus()));
        contentValues.put(f.COLUMN_NET_STATUS.key, Integer.valueOf(nVar.getSvrStatus()));
        contentValues.put(f.COLUMN_VERSION.key, Long.valueOf(nVar.getVersion()));
        contentValues.put(f.COLUMN_DELETED.key, Integer.valueOf(nVar.getDeleted()));
        contentValues.put(f.COLUMN_CREATE_TIME.key, Long.valueOf(nVar.getCreatedAt()));
        contentValues.put(f.COLUMN_SENDER.key, Long.valueOf(nVar.getSender()));
        contentValues.put(f.COLUMN_CONTENT.key, nVar.getContent());
        contentValues.put(f.COLUMN_EXT.key, nVar.getExtStr());
        contentValues.put(f.COLUMN_LOCAL_INFO.key, nVar.getLocalExtStr());
        contentValues.put(f.COLUMN_READ_STATUS.key, Integer.valueOf(nVar.getReadStatus()));
        com.bytedance.im.core.b.a.a.d.a();
        long a2 = com.bytedance.im.core.b.a.a.d.a("msg", (String) null, contentValues);
        nVar.setRowId(a2);
        n.a().a(nVar);
        if (a2 >= 0) {
            z = true;
        }
        if (z && nVar.getDeleted() == 0) {
            b.a().a(true, (Object) nVar);
        }
        if (!z || nVar.getAttachments() == null) {
            return z;
        }
        i.a();
        return i.a(nVar.getAttachments());
    }

    public static List<n> a(String str, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = "select rowid,* from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? AND " + f.COLUMN_DELETED.key + "=? AND " + f.COLUMN_NET_STATUS.key + "=?";
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a(str2 + " order by " + f.COLUMN_ORDER_INDEX.key + " desc, " + f.COLUMN_CREATE_TIME.key + " desc limit " + i, new String[]{str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY});
            while (a2.d()) {
                try {
                    arrayList.add(a(a2));
                } catch (Exception e2) {
                    e = e2;
                    bVar = a2;
                    try {
                        com.bytedance.im.core.b.e.d.a("initMessageList", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("initMessageList", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static long a(String str, long j, long j2, long j3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a("select * from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? AND " + f.COLUMN_DELETED.key + "=? AND (" + f.COLUMN_INNER_INDEX.key + "<=? AND " + f.COLUMN_INNER_INDEX.key + ">? OR " + f.COLUMN_INNER_INDEX.key + "='0') AND " + f.COLUMN_SENDER.key + "!=? AND " + f.COLUMN_NET_STATUS.key + "=? AND " + f.COLUMN_READ_STATUS.key + "=?", new String[]{str, PushConstants.PUSH_TYPE_NOTIFY, String.valueOf(j2), String.valueOf(j), String.valueOf(j3), PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY});
            try {
                long b2 = (long) a2.b();
                r.a(a2);
                return b2;
            } catch (Exception e2) {
                e = e2;
                bVar = a2;
                try {
                    com.bytedance.im.core.b.e.d.d("computeUnreadMsgCount");
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    r.a(bVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = a2;
                r.a(bVar);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.d("computeUnreadMsgCount");
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return 0;
        }
    }

    public static List<n> a(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = "select rowid,* from msg where " + f.COLUMN_CONVERSATION_ID.key + "=? AND " + f.COLUMN_DELETED.key + "=? AND " + f.COLUMN_NET_STATUS.key + "=? AND " + f.COLUMN_INNER_INDEX.key + "<?";
            com.bytedance.im.core.b.a.a.d.a();
            com.bytedance.im.core.b.a.c.b a2 = com.bytedance.im.core.b.a.a.d.a(str2 + " order by " + f.COLUMN_ORDER_INDEX.key + " desc, " + f.COLUMN_CREATE_TIME.key + " desc limit " + i, new String[]{str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, String.valueOf(j)});
            while (a2.d()) {
                try {
                    arrayList.add(a(a2));
                } catch (Exception e2) {
                    e = e2;
                    bVar = a2;
                    try {
                        com.bytedance.im.core.b.e.d.a("queryOlderMessageList", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("queryOlderMessageList", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }
}
