package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class al {

    /* renamed from: a  reason: collision with root package name */
    private static al f82497a;

    /* renamed from: a  reason: collision with other field name */
    private List<a> f929a = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f930a = new ConcurrentHashMap<>();

    public interface a {
        void a();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f82498a;

        /* renamed from: a  reason: collision with other field name */
        public Context f931a;

        /* renamed from: a  reason: collision with other field name */
        IBinder.DeathRecipient f932a = null;

        /* renamed from: a  reason: collision with other field name */
        Messenger f933a;

        /* renamed from: a  reason: collision with other field name */
        private XMPushService.b f934a = new XMPushService.b(this);

        /* renamed from: a  reason: collision with other field name */
        private XMPushService f935a;

        /* renamed from: a  reason: collision with other field name */
        final C0871b f936a = new C0871b();

        /* renamed from: a  reason: collision with other field name */
        c f937a = c.unbind;

        /* renamed from: a  reason: collision with other field name */
        public d f938a;

        /* renamed from: a  reason: collision with other field name */
        public String f939a;

        /* renamed from: a  reason: collision with other field name */
        private List<a> f940a = new ArrayList();

        /* renamed from: a  reason: collision with other field name */
        public boolean f941a;

        /* renamed from: b  reason: collision with root package name */
        c f82499b = null;

        /* renamed from: b  reason: collision with other field name */
        public String f942b;

        /* renamed from: b  reason: collision with other field name */
        private boolean f943b = false;

        /* renamed from: c  reason: collision with root package name */
        public String f82500c;

        /* renamed from: d  reason: collision with root package name */
        public String f82501d;

        /* renamed from: e  reason: collision with root package name */
        public String f82502e;

        /* renamed from: f  reason: collision with root package name */
        public String f82503f;
        public String g;
        public String h;
        public String i;

        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        /* renamed from: com.xiaomi.push.service.al$b$b  reason: collision with other inner class name */
        class C0871b extends XMPushService.i {

            /* renamed from: a  reason: collision with other field name */
            String f944a;

            /* renamed from: b  reason: collision with root package name */
            int f82505b;

            /* renamed from: b  reason: collision with other field name */
            String f945b;

            /* renamed from: c  reason: collision with root package name */
            int f82506c;

            public C0871b() {
                super(0);
            }

            public XMPushService.i a(int i, int i2, String str, String str2) {
                this.f82505b = i;
                this.f82506c = i2;
                this.f945b = str2;
                this.f944a = str;
                return this;
            }

            public String a() {
                return "notify job";
            }

            /* renamed from: a  reason: collision with other method in class */
            public void m609a() {
                if (b.this.a(this.f82505b, this.f82506c, this.f945b)) {
                    b.this.a(this.f82505b, this.f82506c, this.f944a, this.f945b);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.g);
            }
        }

        class c implements IBinder.DeathRecipient {

            /* renamed from: a  reason: collision with root package name */
            final Messenger f82507a;

            /* renamed from: a  reason: collision with other field name */
            final b f946a;

            c(b bVar, Messenger messenger) {
                this.f946a = bVar;
                this.f82507a = messenger;
            }

            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.f946a.g);
                b.a(b.this).a((XMPushService.i) new an(this, 0), 0);
                if ("9".equals(this.f946a.g) && "com.xiaomi.xmsf".equals(b.a(b.this).getPackageName())) {
                    b.a(b.this).a((XMPushService.i) new ao(this, 0), 60000);
                }
            }
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
            this.f935a = xMPushService;
            a((a) new am(this));
        }

        public static String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int lastIndexOf = str.lastIndexOf("/");
            return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
        }

        /* access modifiers changed from: private */
        public void a(int i2, int i3, String str, String str2) {
            this.f82499b = this.f937a;
            if (i2 == 2) {
                this.f938a.a(this.f931a, this, i3);
            } else if (i2 == 3) {
                this.f938a.a(this.f931a, this, str2, str);
            } else if (i2 == 1) {
                boolean z = this.f937a == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f82498a++;
                } else if (z) {
                    this.f82498a = 0;
                    if (this.f933a != null) {
                        try {
                            this.f933a.send(Message.obtain(null, 16, this.f935a.f890a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f938a.a(this.f935a, this, z, i3, str);
            }
        }

        /* access modifiers changed from: private */
        public boolean a(int i2, int i3, String str) {
            StringBuilder sb;
            if (this.f82499b != null && this.f943b) {
                if (this.f82499b == this.f937a) {
                    sb = new StringBuilder(" status recovered, don't notify client:");
                } else if (this.f933a == null || !this.f943b) {
                    sb = new StringBuilder("peer died, ignore notify ");
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.g);
                }
                sb.append(this.g);
                com.xiaomi.channel.commonutils.logger.b.b(sb.toString());
                return false;
            }
            return true;
        }

        private boolean b(int i2, int i3, String str) {
            switch (i2) {
                case 1:
                    if (this.f937a == c.binded || !this.f935a.c() || i3 == 21) {
                        return false;
                    }
                    if (i3 == 7 && "wait".equals(str)) {
                        return false;
                    }
                    break;
                case 2:
                    return this.f935a.c();
                case 3:
                    if ("wait".equals(str)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            return true;
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f82498a + 1) * 15))) * 1000;
        }

        public String a(int i2) {
            switch (i2) {
                case 1:
                    return "OPEN";
                case 2:
                    return "CLOSE";
                case 3:
                    return "KICK";
                default:
                    return "unknown";
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: collision with other method in class */
        public void m608a() {
            try {
                Messenger messenger = this.f933a;
                if (!(messenger == null || this.f932a == null)) {
                    messenger.getBinder().unlinkToDeath(this.f932a, 0);
                }
            } catch (Exception unused) {
            }
            this.f82499b = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Messenger messenger) {
            a();
            if (messenger != null) {
                try {
                    this.f933a = messenger;
                    this.f943b = true;
                    this.f932a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f932a, 0);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e2.getMessage());
                    this.f933a = null;
                    this.f943b = false;
                }
            } else {
                com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.g);
            }
        }

        public void a(a aVar) {
            synchronized (this.f940a) {
                this.f940a.add(aVar);
            }
        }

        public void a(c cVar, int i2, int i3, String str, String str2) {
            synchronized (this.f940a) {
                for (a a2 : this.f940a) {
                    a2.a(this.f937a, cVar, i3);
                }
            }
            if (this.f937a != cVar) {
                com.xiaomi.channel.commonutils.logger.b.a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", new Object[]{this.f937a, cVar, a(i2), ap.a(i3), str, str2, this.g}));
                this.f937a = cVar;
            }
            if (this.f938a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
            } else if (cVar != c.binding) {
                int i4 = 10100;
                if (this.f82499b == null || !this.f943b) {
                    i4 = 0;
                } else if (this.f933a != null && this.f943b) {
                    i4 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                }
                this.f935a.b((XMPushService.i) this.f936a);
                if (b(i2, i3, str2)) {
                    a(i2, i3, str, str2);
                    return;
                }
                this.f935a.a(this.f936a.a(i2, i3, str, str2), (long) i4);
            }
        }

        public void b(a aVar) {
            synchronized (this.f940a) {
                this.f940a.remove(aVar);
            }
        }
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    private al() {
    }

    public static al a() {
        al alVar;
        synchronized (al.class) {
            try {
                if (f82497a == null) {
                    f82497a = new al();
                }
                alVar = f82497a;
            } catch (Throwable th) {
                Class<al> cls = al.class;
                throw th;
            }
        }
        return alVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m601a() {
        int size;
        synchronized (this) {
            size = this.f930a.size();
        }
        return size;
    }

    public b a(String str, String str2) {
        b bVar;
        synchronized (this) {
            HashMap hashMap = this.f930a.get(str);
            bVar = hashMap == null ? null : (b) hashMap.get(a(str2));
        }
        return bVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<b> m602a() {
        ArrayList<b> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>();
            for (HashMap<String, b> values : this.f930a.values()) {
                arrayList.addAll(values.values());
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Collection<b> m603a(String str) {
        Collection<b> arrayList;
        synchronized (this) {
            arrayList = !this.f930a.containsKey(str) ? new ArrayList<>() : ((HashMap) this.f930a.get(str).clone()).values();
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m604a(String str) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (HashMap<String, b> values : this.f930a.values()) {
                for (b bVar : values.values()) {
                    if (str.equals(bVar.f939a)) {
                        arrayList.add(bVar.g);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m605a() {
        synchronized (this) {
            Iterator it2 = a().iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a();
            }
            this.f930a.clear();
        }
    }

    public void a(Context context) {
        synchronized (this) {
            for (HashMap<String, b> values : this.f930a.values()) {
                for (b a2 : values.values()) {
                    a2.a(c.unbind, 1, 3, (String) null, (String) null);
                }
            }
        }
    }

    public void a(Context context, int i) {
        synchronized (this) {
            for (HashMap<String, b> values : this.f930a.values()) {
                for (b a2 : values.values()) {
                    a2.a(c.unbind, 2, i, (String) null, (String) null);
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            this.f929a.add(aVar);
        }
    }

    public void a(b bVar) {
        synchronized (this) {
            HashMap hashMap = this.f930a.get(bVar.g);
            if (hashMap == null) {
                hashMap = new HashMap();
                this.f930a.put(bVar.g, hashMap);
            }
            hashMap.put(a(bVar.f942b), bVar);
            for (a a2 : this.f929a) {
                a2.a();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m606a(String str) {
        synchronized (this) {
            HashMap hashMap = this.f930a.get(str);
            if (hashMap != null) {
                for (b a2 : hashMap.values()) {
                    a2.a();
                }
                hashMap.clear();
                this.f930a.remove(str);
            }
            for (a a3 : this.f929a) {
                a3.a();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m607a(String str, String str2) {
        synchronized (this) {
            HashMap hashMap = this.f930a.get(str);
            if (hashMap != null) {
                b bVar = (b) hashMap.get(a(str2));
                if (bVar != null) {
                    bVar.a();
                }
                hashMap.remove(a(str2));
                if (hashMap.isEmpty()) {
                    this.f930a.remove(str);
                }
            }
            for (a a2 : this.f929a) {
                a2.a();
            }
        }
    }

    public void b() {
        synchronized (this) {
            this.f929a.clear();
        }
    }
}
