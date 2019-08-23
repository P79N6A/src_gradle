package com.bytedance.im.core.b.a.b;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.e.l;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.ArrayList;
import java.util.List;

public class b implements l.a {

    /* renamed from: b  reason: collision with root package name */
    private static b f20904b;

    /* renamed from: a  reason: collision with root package name */
    public l f20905a;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public List<com.bytedance.im.core.d.a.a> f20906a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f20907b;

        /* renamed from: c  reason: collision with root package name */
        String f20908c;

        /* renamed from: d  reason: collision with root package name */
        int f20909d;

        private a() {
        }

        public /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public static boolean b() {
        c.a();
        return false;
    }

    public static boolean c() {
        c.a();
        return false;
    }

    public static b a() {
        if (f20904b == null) {
            synchronized (b.class) {
                f20904b = new b();
            }
        }
        return f20904b;
    }

    public b() {
        Looper looper = c.a().b().H;
        if (looper != null) {
            this.f20905a = new l(looper, this);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FTS-MANGER-QUEUE");
        handlerThread.start();
        this.f20905a = new l(handlerThread.getLooper(), this);
    }

    public static List<com.bytedance.im.core.d.a.a> a(Object obj) {
        c.a();
        return null;
    }

    public final void a(Message message) {
        if (message.obj instanceof a) {
            a aVar = (a) message.obj;
            switch (message.what) {
                case BaseLoginOrRegisterActivity.o /*101*/:
                    c.a().a(aVar.f20906a);
                    return;
                case 102:
                    c a2 = c.a();
                    List<com.bytedance.im.core.d.a.a> list = aVar.f20906a;
                    if (list != null && !list.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (com.bytedance.im.core.d.a.a next : list) {
                            if (next != null && !TextUtils.isEmpty(next.a())) {
                                sb.append(",\"");
                                sb.append(next.a());
                                sb.append('\"');
                            }
                        }
                        if (sb.toString().length() > 0) {
                            String str = "(" + r1.substring(1) + ")";
                            d.a();
                            if (d.c("delete from fts_entity where " + a.COLUMN_ID.key + " in " + str)) {
                                a2.a(list);
                            }
                        }
                    }
                    return;
                case 103:
                    c.a();
                    c.b(aVar.f20906a);
                    return;
                case 104:
                    c.a();
                    c.a(aVar.f20907b, aVar.f20908c);
                    return;
                case 105:
                    c.a();
                    c.a(aVar.f20907b, aVar.f20908c, aVar.f20909d);
                    break;
            }
        }
    }

    public final void a(String str, String str2) {
        if (c() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a((List<String>) arrayList, str2);
        }
    }

    public final void a(List<String> list, String str) {
        if (c() && list != null && !list.isEmpty()) {
            a aVar = new a(this, (byte) 0);
            aVar.f20907b = list;
            aVar.f20908c = str;
            Message message = new Message();
            message.what = 104;
            message.obj = aVar;
            this.f20905a.sendMessage(message);
        }
    }

    public final void a(boolean z, Object obj) {
        if (c() && obj != null) {
            a aVar = new a(this, (byte) 0);
            aVar.f20906a = a(obj);
            if (aVar.f20906a != null && !aVar.f20906a.isEmpty()) {
                Message message = new Message();
                if (z) {
                    message.what = BaseLoginOrRegisterActivity.o;
                } else {
                    message.what = 102;
                }
                message.obj = aVar;
                this.f20905a.sendMessage(message);
            }
        }
    }

    private void a(List<String> list, String str, int i) {
        if (c() && !list.isEmpty()) {
            a aVar = new a(this, (byte) 0);
            aVar.f20907b = list;
            aVar.f20908c = str;
            aVar.f20909d = i;
            Message message = new Message();
            message.what = 105;
            message.obj = aVar;
            this.f20905a.sendMessage(message);
        }
    }

    public final void a(String str, String str2, int i) {
        if (c() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a((List<String>) arrayList, str2, i);
        }
    }
}
