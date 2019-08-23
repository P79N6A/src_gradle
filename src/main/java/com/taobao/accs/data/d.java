package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.b;
import com.taobao.accs.net.j;
import com.taobao.accs.ut.a.a;
import com.taobao.accs.ut.a.e;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.g;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap<String, ScheduledFuture<?>> f78944a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f78945b;

    /* renamed from: c  reason: collision with root package name */
    protected TrafficsMonitor f78946c;

    /* renamed from: d  reason: collision with root package name */
    public FlowControl f78947d;

    /* renamed from: e  reason: collision with root package name */
    public AntiBrush f78948e;

    /* renamed from: f  reason: collision with root package name */
    public String f78949f = "";
    private ConcurrentMap<Message.a, Message> g = new ConcurrentHashMap();
    private boolean h = false;
    private Context i;
    private com.taobao.accs.ut.a.d j;
    private Message k;
    private b l;
    private String m = "MsgRecv_";
    private LinkedHashMap<String, String> n = new MessageHandler$1(this);
    private Map<String, a> o = new HashMap();
    private Runnable p = new f(this);

    private boolean b(int i2) {
        return i2 == -1 || i2 == -9 || i2 == -10 || i2 == -11;
    }

    public boolean c() {
        return this.h;
    }

    public com.taobao.accs.ut.a.d g() {
        return this.j;
    }

    public void a(byte[] bArr, String str) throws IOException {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(this.m, "onMessage", "host", str);
        }
        g gVar = new g(bArr);
        try {
            int a2 = gVar.a();
            int i2 = (a2 & 240) >> 4;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str2 = this.m;
                ALog.d(str2, "version:" + i2, new Object[0]);
            }
            int i3 = a2 & 15;
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str3 = this.m;
                ALog.d(str3, "compress:" + i3, new Object[0]);
            }
            gVar.a();
            int b2 = gVar.b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                String str4 = this.m;
                ALog.d(str4, "totalLen:" + b2, new Object[0]);
            }
            int i4 = 0;
            while (i4 < b2) {
                int b3 = gVar.b();
                int i5 = i4 + 2;
                if (b3 > 0) {
                    byte[] bArr2 = new byte[b3];
                    gVar.read(bArr2);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        String str5 = this.m;
                        ALog.d(str5, "buf len:" + bArr2.length, new Object[0]);
                    }
                    i4 = i5 + bArr2.length;
                    a(i3, bArr2, str, i2);
                } else {
                    throw new IOException("data format error");
                }
            }
        } catch (Throwable th) {
            com.taobao.accs.utl.b.a("accs", "send_fail", "", PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.f78945b + th.toString());
            ALog.e(this.m, "", th, new Object[0]);
        } finally {
            gVar.close();
        }
    }

    public void a(Message message, int i2) {
        a(message, i2, null, null, null);
    }

    public void a(Message message, int i2, Map<Integer, String> map) {
        a(message, i2, null, null, map);
    }

    public void a(Message message, int i2, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        byte[] bArr2;
        Message.ReqType reqType2;
        int i3;
        Message message2 = message;
        if (message2.t == null || message.a() < 0 || message.a() == 2) {
            ALog.d(this.m, "onError, skip ping/ack", new Object[0]);
            return;
        }
        if (message2.O != null) {
            this.f78944a.remove(message2.O);
        }
        Map<Integer, String> map2 = map;
        String str = null;
        if (this.f78948e.checkAntiBrush(message2.f78931f, map2)) {
            i3 = 70022;
            map2 = null;
            reqType2 = null;
            bArr2 = null;
        } else {
            i3 = i2;
            reqType2 = reqType;
            bArr2 = bArr;
        }
        int a2 = this.f78947d.a(map2, message2.H);
        if (a2 != 0) {
            i3 = a2 == 2 ? 70021 : a2 == 3 ? 70023 : 70020;
            map2 = null;
            reqType2 = null;
            bArr2 = null;
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(this.m, "onResult", "command", message2.t, "erorcode", Integer.valueOf(i3));
        }
        if (message2.t.intValue() != 102) {
            if (message2.f78930e) {
                ALog.e(this.m, "onResult message is cancel", "command", message2.t);
            } else if (!b(i3) || message2.t.intValue() == 100 || message2.R > Message.f78926a) {
                Intent c2 = c(message);
                c2.putExtra("errorCode", i3);
                Message.ReqType valueOf = Message.ReqType.valueOf((message2.k >> 13) & 3);
                if (reqType2 == Message.ReqType.RES || valueOf == Message.ReqType.REQ) {
                    c2.putExtra("send_type", "res");
                }
                if (i3 == 200) {
                    c2.putExtra("data", bArr2);
                }
                c2.putExtra("appKey", this.l.f78990b);
                c2.putExtra("configTag", this.l.m);
                a(map2, c2);
                g.a(this.i, this.l, c2);
                if (!TextUtils.isEmpty(message2.H)) {
                    UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message2.t, "serviceId=" + message2.H + " errorCode=" + i3 + " dataId=" + message2.q, 221);
                    StringBuilder sb = new StringBuilder("1commandId=");
                    sb.append(message2.t);
                    sb.append("serviceId=");
                    sb.append(message2.H);
                    com.taobao.accs.utl.b.a("accs", "to_buss", sb.toString(), 0.0d);
                }
            } else {
                message2.T = System.currentTimeMillis();
                message2.R++;
                ALog.d(this.m, "onResult", "retryTimes", Integer.valueOf(message2.R));
                this.l.b(message2, true);
            }
            NetPerformanceMonitor e2 = message.e();
            if (e2 != null) {
                e2.onToBizDate();
                if (message2.f78931f != null) {
                    str = message2.f78931f.toString();
                }
                if (i3 == 200) {
                    e2.setRet(true);
                    if (message2.R > 0) {
                        com.taobao.accs.utl.b.a("accs", "resend", "succ", 0.0d);
                        com.taobao.accs.utl.b.a("accs", "resend", "succ_" + message2.R, 0.0d);
                    } else {
                        com.taobao.accs.utl.b.a("accs", "Request_Success_Rate", str);
                    }
                } else {
                    if (message2.R > 0) {
                        com.taobao.accs.utl.b.a("accs", "resend", "fail＿" + i3, 0.0d);
                        com.taobao.accs.utl.b.a("accs", "resend", "fail", 0.0d);
                    } else if (i3 != -13) {
                        com.taobao.accs.utl.b.a("accs", "Request_Success_Rate", str, UtilityImpl.a(i3), this.f78945b + message2.H + message2.S);
                    }
                    e2.setRet(false);
                    e2.setFailReason(i3);
                }
                AppMonitor.getInstance().commitStat(message.e());
            }
            b(message2, i3);
        }
    }

    public void a() {
        ALog.d(this.m, "onSendPing", new Object[0]);
        synchronized (d.class) {
            this.h = true;
        }
    }

    public void a(Message message) {
        if (!(this.k == null || message.O == null || message.H == null || !this.k.O.equals(message.O) || !this.k.H.equals(message.H))) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.H, message.O, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.a() != -1 && message.a() != 2 && !message.f78928c) {
            this.g.put(message.d(), message);
        }
    }

    public void a(int i2) {
        this.h = false;
        Message.a[] aVarArr = (Message.a[]) this.g.keySet().toArray(new Message.a[0]);
        if (aVarArr.length > 0) {
            ALog.d(this.m, "onNetworkFail", new Object[0]);
            for (Message.a remove : aVarArr) {
                Message message = (Message) this.g.remove(remove);
                if (message != null) {
                    a(message, i2);
                }
            }
        }
    }

    public void a(TrafficsMonitor.a aVar) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new e(this, aVar));
        } catch (Throwable th) {
            ALog.e(this.m, "addTrafficsInfo", th, new Object[0]);
        }
    }

    public int d() {
        return this.g.size();
    }

    public Collection<Message> e() {
        return this.g.values();
    }

    public Set<Message.a> f() {
        return this.g.keySet();
    }

    public void h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.p);
        } catch (Throwable th) {
            ALog.e(this.m, "restoreTraffics", th, new Object[0]);
        }
    }

    private void i() {
        try {
            File dir = this.i.getDir("accs", 0);
            File file = new File(dir, "message" + this.l.i());
            if (!file.exists()) {
                ALog.d(this.m, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    this.n.put(readLine, readLine);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    private void j() {
        try {
            File dir = this.i.getDir("accs", 0);
            FileWriter fileWriter = new FileWriter(new File(dir, "message" + this.l.i()));
            fileWriter.write("");
            for (String append : this.n.keySet()) {
                fileWriter.append(append).append("\r\n");
            }
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    public void b() {
        ALog.d(this.m, "onRcvPing", new Object[0]);
        synchronized (d.class) {
            this.h = false;
        }
    }

    public void a(byte[] bArr) throws IOException {
        a(bArr, (String) null);
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.n.containsKey(str);
    }

    private void d(String str) {
        if (!TextUtils.isEmpty(str) && !this.n.containsKey(str)) {
            this.n.put(str, str);
            j();
        }
    }

    private Intent c(Message message) {
        Intent intent = new Intent("com.taobao.accs.intent.action.RECEIVE");
        intent.setPackage(message.s);
        intent.putExtra("command", message.t);
        intent.putExtra("serviceId", message.H);
        intent.putExtra("userInfo", message.G);
        if (message.t != null && message.t.intValue() == 100) {
            intent.putExtra("dataId", message.O);
        }
        return intent;
    }

    public Message b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (Message) this.g.remove(new Message.a(0, str));
        }
        return null;
    }

    private Map<Integer, String> a(g gVar) {
        HashMap hashMap;
        if (gVar == null) {
            return null;
        }
        try {
            int b2 = gVar.b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.m, "extHeaderLen:" + b2, new Object[0]);
            }
            hashMap = null;
            int i2 = 0;
            while (i2 < b2) {
                try {
                    int b3 = gVar.b();
                    int i3 = (64512 & b3) >> 10;
                    int i4 = b3 & 1023;
                    String a2 = gVar.a(i4);
                    i2 = i2 + 2 + i4;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(Integer.valueOf(i3), a2);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.d(this.m, "", "extHeaderType", Integer.valueOf(i3), "value", a2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    ALog.e(this.m, "parseExtHeader", e, new Object[0]);
                    return hashMap;
                }
            }
        } catch (Exception e3) {
            e = e3;
            hashMap = null;
            ALog.e(this.m, "parseExtHeader", e, new Object[0]);
            return hashMap;
        }
        return hashMap;
    }

    private byte[] a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused) {
            }
            return byteArray;
        } catch (Exception e2) {
            String str = this.m;
            ALog.e(str, "uncompress data error " + e2.toString(), new Object[0]);
            com.taobao.accs.utl.b.a("accs", "send_fail", "", PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.f78945b + " uncompress data error " + e2.toString());
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public void b(Message message) {
        if (this.g.keySet().size() > 0) {
            for (Message.a aVar : this.g.keySet()) {
                Message message2 = (Message) this.g.get(aVar);
                if (!(message2 == null || message2.t == null || !message2.f().equals(message.f()))) {
                    switch (message.t.intValue()) {
                        case 1:
                        case 2:
                            if (message2.t.intValue() == 1 || message2.t.intValue() == 2) {
                                message2.f78930e = true;
                                break;
                            }
                        case 3:
                        case 4:
                            if (message2.t.intValue() == 3 || message2.t.intValue() == 4) {
                                message2.f78930e = true;
                                break;
                            }
                        case 5:
                        case 6:
                            if (message2.t.intValue() == 5 || message2.t.intValue() == 6) {
                                message2.f78930e = true;
                                break;
                            }
                    }
                }
                if (message2 != null && message2.f78930e) {
                    ALog.e(this.m, "cancelControlMessage", "command", message2.t);
                }
            }
        }
    }

    public Message a(String str) {
        return (Message) this.g.get(new Message.a(0, str));
    }

    private void a(Map<Integer, String> map, Intent intent) {
        if (map != null && intent != null) {
            intent.putExtra("ext_header", (HashMap) map);
        }
    }

    private void a(String str, String str2) {
        e eVar = new e();
        eVar.f79067a = UtilityImpl.l(this.i);
        eVar.f79069c = str;
        eVar.f79070d = System.currentTimeMillis();
        eVar.f79072f = "";
        eVar.f79071e = str2;
        eVar.f79068b = "";
        eVar.a();
    }

    public d(Context context, b bVar) {
        String str;
        this.i = context;
        this.l = bVar;
        this.f78946c = new TrafficsMonitor(this.i);
        this.f78947d = new FlowControl(this.i);
        this.f78948e = new AntiBrush(this.i);
        if (bVar == null) {
            str = this.m;
        } else {
            str = this.m + bVar.m;
        }
        this.m = str;
        i();
        h();
    }

    private void b(Message message, int i2) {
        boolean z;
        if (message != null) {
            String l2 = UtilityImpl.l(this.i);
            String str = System.currentTimeMillis();
            if (i2 != 200) {
                z = false;
            } else {
                z = true;
            }
            int intValue = message.t.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    com.taobao.accs.ut.a.b bVar = new com.taobao.accs.ut.a.b();
                    bVar.f79049a = l2;
                    bVar.f79050b = str;
                    bVar.f79051c = z;
                    bVar.f79053e = message.G;
                    bVar.a(i2);
                    bVar.a();
                }
                return;
            }
            a aVar = new a();
            aVar.f79043a = l2;
            aVar.f79044b = str;
            aVar.f79045c = z;
            aVar.a(i2);
            aVar.a();
        }
    }

    private byte[] a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int parseInt = Integer.parseInt(map.get(17));
                    int parseInt2 = Integer.parseInt(map.get(16));
                    if (parseInt2 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    } else if (parseInt < 0 || parseInt >= parseInt2) {
                        throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", new Object[]{Integer.valueOf(parseInt2), Integer.valueOf(parseInt)}));
                    } else {
                        String str2 = map.get(18);
                        long j2 = 0;
                        String str3 = map.get(15);
                        if (!TextUtils.isEmpty(str3)) {
                            j2 = Long.parseLong(str3);
                        }
                        a aVar = this.o.get(str);
                        if (aVar == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(this.m, "putBurstMessage", "dataId", str, "burstLength", Integer.valueOf(parseInt2));
                            }
                            aVar = new a(str, parseInt2, str2);
                            aVar.a(j2);
                            this.o.put(str, aVar);
                        }
                        return aVar.a(parseInt, parseInt2, bArr);
                    }
                }
            } catch (Throwable th) {
                ALog.w(this.m, "putBurstMessage", th, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    private void a(Intent intent, String str, String str2, short s) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra("flags", s);
        }
    }

    private void a(Message message, byte[] bArr, byte[] bArr2, String str) {
        Message message2 = message;
        int i2 = -8;
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(this.m, "handleControlMessage parse", "json", jSONObject.toString());
                }
                if (message2.t.intValue() == 100) {
                    i2 = 200;
                } else {
                    i2 = jSONObject.getInt("code");
                }
                if (i2 == 200) {
                    int intValue = message2.t.intValue();
                    if (intValue != 100) {
                        switch (intValue) {
                            case 1:
                                UtilityImpl.b("ACCS_SDK", this.i);
                                this.l.j().a(this.i.getPackageName());
                                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                                this.f78949f = com.taobao.accs.utl.d.a(jSONObject2, "accsToken", null);
                                if (jSONObject2 != null) {
                                    JSONArray jSONArray = jSONObject2.getJSONArray("packageNames");
                                    if (jSONArray != null) {
                                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                            String string = jSONArray.getString(i3);
                                            if (UtilityImpl.a(this.i, string)) {
                                                this.l.j().a(message2.s);
                                            } else {
                                                ALog.e(this.m, "unbind app", "pkg", string);
                                                this.l.b(Message.a(this.l, string), true);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                this.l.j().b(message2.s);
                                break;
                            case 3:
                                this.l.j().a(message2.s, message2.G);
                                break;
                            case 4:
                                this.l.j().e(message2.s);
                                break;
                        }
                    } else if ((this.l instanceof j) && !message2.n.equals("4|sal|st")) {
                        ((j) this.l).a(jSONObject);
                    }
                } else if (message2.t.intValue() == 3 && i2 == 300) {
                    this.l.j().b(message2.s);
                }
            } catch (Throwable th) {
                th = th;
                ALog.e(this.m, "handleControlMessage", th, new Object[0]);
                com.taobao.accs.utl.b.a("accs", "send_fail", "handleControlMessage", "", this.f78945b + th.toString());
            }
        } catch (Throwable th2) {
            th = th2;
            byte[] bArr3 = bArr;
            ALog.e(this.m, "handleControlMessage", th, new Object[0]);
            com.taobao.accs.utl.b.a("accs", "send_fail", "handleControlMessage", "", this.f78945b + th.toString());
            a(message, i2, null, bArr, null);
            TrafficsMonitor.a aVar = new TrafficsMonitor.a(message2.H, GlobalAppRuntimeInfo.isAppBackground(), str, (long) bArr2.length);
            a(aVar);
        }
        a(message, i2, null, bArr, null);
        TrafficsMonitor.a aVar2 = new TrafficsMonitor.a(message2.H, GlobalAppRuntimeInfo.isAppBackground(), str, (long) bArr2.length);
        a(aVar2);
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: type inference failed for: r6v44 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0259 A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028a A[Catch:{ Exception -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0308 A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0377 A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x037d A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x051d A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x052b A[Catch:{ Exception -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0592 A[Catch:{ Exception -> 0x0697 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05f4 A[Catch:{ Exception -> 0x0697 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05f6 A[Catch:{ Exception -> 0x0697 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r48, byte[] r49, java.lang.String r50, int r51) throws java.io.IOException {
        /*
            r47 = this;
            r7 = r47
            r0 = r48
            r8 = r49
            r14 = r50
            com.taobao.accs.utl.g r1 = new com.taobao.accs.utl.g
            r1.<init>(r8)
            int r2 = r1.b()
            long r9 = (long) r2
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            r15 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r7.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "flag:"
            r3.<init>(r4)
            int r4 = (int) r9
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r15]
            com.taobao.accs.utl.ALog.d(r2, r3, r4)
        L_0x0035:
            int r2 = r1.a()
            java.lang.String r11 = r1.a(r2)
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = r7.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "target:"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r15]
            com.taobao.accs.utl.ALog.d(r2, r3, r4)
        L_0x005a:
            int r2 = r1.a()
            java.lang.String r12 = r1.a(r2)
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            if (r2 == 0) goto L_0x007f
            java.lang.String r2 = r7.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "source:"
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r15]
            com.taobao.accs.utl.ALog.d(r2, r3, r4)
        L_0x007f:
            int r2 = r1.a()     // Catch:{ Exception -> 0x0713 }
            java.lang.String r13 = r1.a(r2)     // Catch:{ Exception -> 0x0713 }
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = r7.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dataId:"
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r15]
            com.taobao.accs.utl.ALog.d(r2, r3, r4)
        L_0x00a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r13)
            java.lang.String r6 = r2.toString()
            int r2 = r1.available()
            r4 = 2
            r3 = 1
            if (r2 <= 0) goto L_0x0102
            r2 = r51
            if (r2 != r4) goto L_0x00e3
            java.util.Map r2 = r7.a((com.taobao.accs.utl.g) r1)
            if (r2 == 0) goto L_0x00e0
            r16 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            boolean r5 = r2.containsKey(r5)
            if (r5 == 0) goto L_0x00e0
            r5 = 17
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r2.containsKey(r5)
            if (r5 == 0) goto L_0x00e0
            r5 = r2
            r2 = 1
            goto L_0x00e5
        L_0x00e0:
            r5 = r2
            r2 = 0
            goto L_0x00e5
        L_0x00e3:
            r2 = 0
            r5 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x00f6
            if (r2 == 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            if (r0 != r3) goto L_0x00f1
            byte[] r16 = r7.a((java.io.InputStream) r1)
            goto L_0x00fa
        L_0x00f1:
            r16 = r2
            r2 = r5
            r5 = 0
            goto L_0x0106
        L_0x00f6:
            byte[] r16 = r1.c()
        L_0x00fa:
            r46 = r16
            r16 = r2
            r2 = r5
            r5 = r46
            goto L_0x0106
        L_0x0102:
            r2 = 0
            r5 = 0
            r16 = 0
        L_0x0106:
            r1.close()
            if (r5 != 0) goto L_0x011d
            java.lang.String r1 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = "oriData is null"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.d(r1, r4, r3)     // Catch:{ Exception -> 0x0115 }
            goto L_0x013e
        L_0x0115:
            r0 = move-exception
        L_0x0116:
            r6 = r7
        L_0x0117:
            r7 = r13
            r2 = 0
        L_0x0119:
            r3 = 5
        L_0x011a:
            r4 = 0
            goto L_0x06d7
        L_0x011d:
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Exception -> 0x0115 }
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)     // Catch:{ Exception -> 0x0115 }
            if (r1 == 0) goto L_0x013e
            java.lang.String r1 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = "oriData:"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0115 }
            r3.append(r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0115 }
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.d(r1, r3, r4)     // Catch:{ Exception -> 0x0115 }
        L_0x013e:
            r1 = 15
            long r3 = r9 >> r1
            r21 = 1
            long r3 = r3 & r21
            int r1 = (int) r3     // Catch:{ Exception -> 0x0115 }
            int r4 = com.taobao.accs.data.Message.c.a(r1)     // Catch:{ Exception -> 0x0115 }
            r1 = 13
            long r23 = r9 >> r1
            r25 = 3
            r27 = r2
            long r1 = r23 & r25
            int r1 = (int) r1     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.data.Message$ReqType r3 = com.taobao.accs.data.Message.ReqType.valueOf((int) r1)     // Catch:{ Exception -> 0x0115 }
            r1 = 12
            long r1 = r9 >> r1
            long r1 = r1 & r21
            int r1 = (int) r1     // Catch:{ Exception -> 0x0115 }
            r2 = 11
            long r23 = r9 >> r2
            r29 = r5
            r28 = r6
            long r5 = r23 & r21
            int r2 = (int) r5     // Catch:{ Exception -> 0x0115 }
            int r6 = com.taobao.accs.data.Message.b.a(r2)     // Catch:{ Exception -> 0x0115 }
            r5 = 6
            long r23 = r9 >> r5
            r30 = r6
            long r5 = r23 & r21
            int r2 = (int) r5     // Catch:{ Exception -> 0x0115 }
            r5 = 1
            if (r2 != r5) goto L_0x017d
            r6 = 1
            goto L_0x017e
        L_0x017d:
            r6 = 0
        L_0x017e:
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Exception -> 0x0115 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x01d5
            java.lang.String r2 = r7.m     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "handleMessage"
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r21 = "dataId"
            r22 = 0
            r15[r22] = r21     // Catch:{ Exception -> 0x01d0 }
            r20 = 1
            r15[r20] = r13     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r21 = "type"
            r19 = 2
            r15[r19] = r21     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r21 = com.taobao.accs.data.Message.c.b(r4)     // Catch:{ Exception -> 0x01d0 }
            r22 = 3
            r15[r22] = r21     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r21 = "reqType"
            r23 = 4
            r15[r23] = r21     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r21 = r3.name()     // Catch:{ Exception -> 0x01d0 }
            r18 = 5
            r15[r18] = r21     // Catch:{ Exception -> 0x0115 }
            java.lang.String r21 = "resType"
            r24 = 6
            r15[r24] = r21     // Catch:{ Exception -> 0x0115 }
            r21 = 7
            java.lang.String r25 = com.taobao.accs.data.Message.b.b(r30)     // Catch:{ Exception -> 0x0115 }
            r15[r21] = r25     // Catch:{ Exception -> 0x0115 }
            r21 = 8
            java.lang.String r25 = "target"
            r15[r21] = r25     // Catch:{ Exception -> 0x0115 }
            r21 = 9
            r15[r21] = r11     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.i(r2, r5, r15)     // Catch:{ Exception -> 0x0115 }
            goto L_0x01df
        L_0x01d0:
            r0 = move-exception
            r18 = 5
            goto L_0x0116
        L_0x01d5:
            r18 = 5
            r19 = 2
            r22 = 3
            r23 = 4
            r24 = 6
        L_0x01df:
            r2 = 1
            if (r4 != r2) goto L_0x02f5
            com.taobao.accs.data.Message$ReqType r2 = com.taobao.accs.data.Message.ReqType.ACK     // Catch:{ Exception -> 0x0115 }
            if (r3 == r2) goto L_0x01fe
            com.taobao.accs.data.Message$ReqType r2 = com.taobao.accs.data.Message.ReqType.RES     // Catch:{ Exception -> 0x0115 }
            if (r3 != r2) goto L_0x01eb
            goto L_0x01fe
        L_0x01eb:
            r41 = r3
            r1 = r4
            r40 = r6
            r34 = r9
            r0 = r27
            r37 = r28
            r36 = r29
            r39 = r30
        L_0x01fa:
            r6 = 1
            r9 = 2
            goto L_0x0306
        L_0x01fe:
            java.util.concurrent.ConcurrentMap<com.taobao.accs.data.Message$a, com.taobao.accs.data.Message> r2 = r7.g     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.data.Message$a r5 = new com.taobao.accs.data.Message$a     // Catch:{ Exception -> 0x0115 }
            r15 = 0
            r5.<init>(r15, r13)     // Catch:{ Exception -> 0x0115 }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ Exception -> 0x0115 }
            r15 = r2
            com.taobao.accs.data.Message r15 = (com.taobao.accs.data.Message) r15     // Catch:{ Exception -> 0x0115 }
            if (r15 == 0) goto L_0x02b9
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Exception -> 0x0115 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x022d
            java.lang.String r2 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r5 = "handleMessage reqMessage not null"
            r31 = r4
            r32 = r6
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0226 }
            com.taobao.accs.utl.ALog.d(r2, r5, r6)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0231
        L_0x0226:
            r0 = move-exception
            r6 = r7
        L_0x0228:
            r7 = r13
            r2 = 0
            r3 = 5
            goto L_0x06d7
        L_0x022d:
            r31 = r4
            r32 = r6
        L_0x0231:
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 1
            if (r1 != r4) goto L_0x024f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x024a }
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x024a }
            r5 = r29
            r2.<init>(r5)     // Catch:{ Exception -> 0x024c }
            r1.<init>(r2)     // Catch:{ Exception -> 0x024c }
            java.lang.String r2 = "code"
            int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x024c }
            r6 = r1
            goto L_0x0253
        L_0x024a:
            r5 = r29
        L_0x024c:
            r1 = -3
            r6 = -3
            goto L_0x0253
        L_0x024f:
            r5 = r29
            r6 = 200(0xc8, float:2.8E-43)
        L_0x0253:
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r1 = r15.e()     // Catch:{ Exception -> 0x0115 }
            if (r1 == 0) goto L_0x0260
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r1 = r15.e()     // Catch:{ Exception -> 0x0115 }
            r1.onRecAck()     // Catch:{ Exception -> 0x0115 }
        L_0x0260:
            com.taobao.accs.data.Message$ReqType r1 = com.taobao.accs.data.Message.ReqType.RES     // Catch:{ Exception -> 0x0115 }
            if (r3 != r1) goto L_0x028a
            r2 = 5
            r1 = r47
            r34 = r9
            r33 = r27
            r9 = 5
            r2 = r15
            r10 = r3
            r3 = r6
            r6 = r31
            r4 = r10
            r36 = r5
            r9 = 0
            r38 = r6
            r37 = r28
            r39 = r30
            r40 = r32
            r6 = r33
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0285 }
            r5 = r33
            goto L_0x029d
        L_0x0285:
            r0 = move-exception
            r6 = r7
            r2 = r9
            goto L_0x0399
        L_0x028a:
            r36 = r5
            r34 = r9
            r5 = r27
            r37 = r28
            r39 = r30
            r38 = r31
            r40 = r32
            r9 = 0
            r10 = r3
            r7.a((com.taobao.accs.data.Message) r15, (int) r6, (java.util.Map<java.lang.Integer, java.lang.String>) r5)     // Catch:{ Exception -> 0x0285 }
        L_0x029d:
            com.taobao.accs.ut.monitor.TrafficsMonitor$a r6 = new com.taobao.accs.ut.monitor.TrafficsMonitor$a     // Catch:{ Exception -> 0x0285 }
            java.lang.String r2 = r15.H     // Catch:{ Exception -> 0x0285 }
            boolean r3 = anet.channel.GlobalAppRuntimeInfo.isAppBackground()     // Catch:{ Exception -> 0x0285 }
            int r1 = r8.length     // Catch:{ Exception -> 0x0285 }
            r41 = r10
            long r9 = (long) r1
            r1 = r6
            r4 = r50
            r0 = r5
            r15 = r6
            r5 = r9
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x0115 }
            r7.a((com.taobao.accs.ut.monitor.TrafficsMonitor.a) r15)     // Catch:{ Exception -> 0x0115 }
            r1 = r38
            goto L_0x01fa
        L_0x02b9:
            r41 = r3
            r38 = r4
            r40 = r6
            r34 = r9
            r0 = r27
            r37 = r28
            r36 = r29
            r39 = r30
            com.taobao.accs.net.b r1 = r7.l     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.net.b r2 = r7.l     // Catch:{ Exception -> 0x0115 }
            r3 = 0
            java.lang.String r2 = r2.b((java.lang.String) r3)     // Catch:{ Exception -> 0x0396 }
            r3 = 5
            com.taobao.accs.data.Message r2 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r11, (java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x02ef }
            r6 = 1
            r1.b((com.taobao.accs.data.Message) r2, (boolean) r6)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "handleMessage data ack/res reqMessage is null"
            r9 = 2
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = "dataId"
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0115 }
            r3[r6] = r13     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.e(r1, r2, r3)     // Catch:{ Exception -> 0x0115 }
            r1 = r38
            goto L_0x0306
        L_0x02ef:
            r0 = move-exception
            r6 = r7
            r7 = r13
            r2 = 0
            goto L_0x011a
        L_0x02f5:
            r41 = r3
            r40 = r6
            r34 = r9
            r0 = r27
            r37 = r28
            r36 = r29
            r39 = r30
            r6 = 1
            r9 = 2
            r1 = r4
        L_0x0306:
            if (r1 != 0) goto L_0x0377
            com.taobao.accs.data.Message$ReqType r2 = com.taobao.accs.data.Message.ReqType.RES     // Catch:{ Exception -> 0x0115 }
            r3 = r41
            if (r3 != r2) goto L_0x0374
            java.util.concurrent.ConcurrentMap<com.taobao.accs.data.Message$a, com.taobao.accs.data.Message> r2 = r7.g     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.data.Message$a r4 = new com.taobao.accs.data.Message$a     // Catch:{ Exception -> 0x0115 }
            r5 = 0
            r4.<init>(r5, r13)     // Catch:{ Exception -> 0x0115 }
            java.lang.Object r2 = r2.remove(r4)     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.data.Message r2 = (com.taobao.accs.data.Message) r2     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x0324
            r4 = r36
            r7.a((com.taobao.accs.data.Message) r2, (byte[]) r4, (byte[]) r8, (java.lang.String) r14)     // Catch:{ Exception -> 0x0115 }
            return
        L_0x0324:
            r4 = r36
            java.lang.String r2 = "4|sal|st"
            boolean r2 = r12.contains(r2)     // Catch:{ Exception -> 0x0115 }
            if (r2 != 0) goto L_0x0344
            com.taobao.accs.net.b r2 = r7.l     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.net.b r5 = r7.l     // Catch:{ Exception -> 0x0115 }
            r10 = 0
            java.lang.String r5 = r5.b((java.lang.String) r10)     // Catch:{ Exception -> 0x0340 }
            r10 = 5
            com.taobao.accs.data.Message r5 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r11, (java.lang.String) r5, (int) r10)     // Catch:{ Exception -> 0x0115 }
            r2.b((com.taobao.accs.data.Message) r5, (boolean) r6)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0344
        L_0x0340:
            r0 = move-exception
            r6 = r7
            r2 = r10
            goto L_0x0399
        L_0x0344:
            java.lang.String r2 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r5 = "handleMessage contorl ACK reqMessage is null"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r15 = "dataId"
            r17 = 0
            r10[r17] = r15     // Catch:{ Exception -> 0x0115 }
            r10[r6] = r13     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.e(r2, r5, r10)     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Exception -> 0x0115 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x037b
            java.lang.String r2 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r5 = "handleMessage not handled"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r15 = "body"
            r17 = 0
            r10[r17] = r15     // Catch:{ Exception -> 0x0115 }
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x0115 }
            r15.<init>(r4)     // Catch:{ Exception -> 0x0115 }
            r10[r6] = r15     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.d(r2, r5, r10)     // Catch:{ Exception -> 0x0115 }
            goto L_0x037b
        L_0x0374:
            r4 = r36
            goto L_0x037b
        L_0x0377:
            r4 = r36
            r3 = r41
        L_0x037b:
            if (r1 != r6) goto L_0x06d5
            com.taobao.accs.data.Message$ReqType r1 = com.taobao.accs.data.Message.ReqType.DATA     // Catch:{ Exception -> 0x0115 }
            if (r3 != r1) goto L_0x06d5
            if (r11 != 0) goto L_0x039c
            com.taobao.accs.net.b r0 = r7.l     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = ""
            com.taobao.accs.net.b r2 = r7.l     // Catch:{ Exception -> 0x0115 }
            r3 = 0
            java.lang.String r2 = r2.b((java.lang.String) r3)     // Catch:{ Exception -> 0x0396 }
            com.taobao.accs.data.Message r1 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r1, (java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x0115 }
            r0.b((com.taobao.accs.data.Message) r1, (boolean) r6)     // Catch:{ Exception -> 0x0115 }
            return
        L_0x0396:
            r0 = move-exception
            r2 = r3
        L_0x0398:
            r6 = r7
        L_0x0399:
            r7 = r13
            goto L_0x0119
        L_0x039c:
            java.lang.String r1 = "\\|"
            java.lang.String[] r1 = r11.split(r1)     // Catch:{ Exception -> 0x0115 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0115 }
            if (r2 >= r9) goto L_0x03b8
            com.taobao.accs.net.b r0 = r7.l     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = ""
            com.taobao.accs.net.b r2 = r7.l     // Catch:{ Exception -> 0x0115 }
            r3 = 0
            java.lang.String r2 = r2.b((java.lang.String) r3)     // Catch:{ Exception -> 0x0396 }
            com.taobao.accs.data.Message r1 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r1, (java.lang.String) r2, (int) r6)     // Catch:{ Exception -> 0x0115 }
            r0.b((com.taobao.accs.data.Message) r1, (boolean) r6)     // Catch:{ Exception -> 0x0115 }
            return
        L_0x03b8:
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Exception -> 0x0115 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x03d4
            java.lang.String r2 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r3 = "handleMessage onPush"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r10 = "isBurstData"
            r15 = 0
            r5[r15] = r10     // Catch:{ Exception -> 0x0115 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)     // Catch:{ Exception -> 0x0115 }
            r5[r6] = r10     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.d(r2, r3, r5)     // Catch:{ Exception -> 0x0115 }
        L_0x03d4:
            com.taobao.accs.ut.a.d r2 = r7.j     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x03dd
            com.taobao.accs.ut.a.d r2 = r7.j     // Catch:{ Exception -> 0x0115 }
            r2.a()     // Catch:{ Exception -> 0x0115 }
        L_0x03dd:
            com.taobao.accs.ut.a.d r2 = new com.taobao.accs.ut.a.d     // Catch:{ Exception -> 0x0115 }
            r2.<init>()     // Catch:{ Exception -> 0x0115 }
            r7.j = r2     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.ut.a.d r2 = r7.j     // Catch:{ Exception -> 0x0115 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0115 }
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x0115 }
            r2.f79063c = r3     // Catch:{ Exception -> 0x0115 }
            android.content.Context r2 = r7.i     // Catch:{ Exception -> 0x0115 }
            r3 = r1[r6]     // Catch:{ Exception -> 0x0115 }
            boolean r2 = com.taobao.accs.utl.UtilityImpl.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0115 }
            if (r2 == 0) goto L_0x069a
            int r2 = r1.length     // Catch:{ Exception -> 0x0115 }
            r3 = 3
            if (r2 < r3) goto L_0x0402
            r2 = r1[r9]     // Catch:{ Exception -> 0x0115 }
            r15 = r2
            goto L_0x0403
        L_0x0402:
            r15 = 0
        L_0x0403:
            com.taobao.accs.ut.a.d r2 = r7.j     // Catch:{ Exception -> 0x0115 }
            r2.f79065e = r15     // Catch:{ Exception -> 0x0115 }
            r2 = r37
            boolean r5 = r7.c((java.lang.String) r2)     // Catch:{ Exception -> 0x0115 }
            r42 = r4
            if (r5 == 0) goto L_0x044b
            com.taobao.accs.net.b r1 = r7.l     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.net.b r2 = r7.l     // Catch:{ Exception -> 0x0115 }
            r5 = 0
            java.lang.String r2 = r2.b((java.lang.String) r5)     // Catch:{ Exception -> 0x0447 }
            com.taobao.accs.data.Message r2 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r15, (java.lang.String) r2, (int) r9)     // Catch:{ Exception -> 0x0115 }
            r1.b((com.taobao.accs.data.Message) r2, (boolean) r6)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "handleMessage msg duplicate"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r8 = "dataId"
            r10 = 0
            r5[r10] = r8     // Catch:{ Exception -> 0x0115 }
            r5[r6] = r13     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.e(r1, r2, r5)     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.ut.a.d r1 = r7.j     // Catch:{ Exception -> 0x0115 }
            r1.h = r6     // Catch:{ Exception -> 0x0115 }
            r17 = r0
            r6 = r7
            r44 = r11
            r45 = r12
            r9 = r34
            r0 = r39
            r43 = r40
            r1 = 1
            r11 = 0
            goto L_0x062d
        L_0x0447:
            r0 = move-exception
            r2 = r5
            goto L_0x0398
        L_0x044b:
            if (r16 == 0) goto L_0x04a4
            r5 = r42
            byte[] r5 = r7.a((java.lang.String) r2, (java.util.Map<java.lang.Integer, java.lang.String>) r0, (byte[]) r5)     // Catch:{ Exception -> 0x0115 }
            if (r5 != 0) goto L_0x0466
            com.taobao.accs.net.b r0 = r7.l     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.net.b r1 = r7.l     // Catch:{ Exception -> 0x0115 }
            r10 = 0
            java.lang.String r1 = r1.b((java.lang.String) r10)     // Catch:{ Exception -> 0x0340 }
            com.taobao.accs.data.Message r1 = com.taobao.accs.data.Message.a((java.lang.String) r13, (java.lang.String) r15, (java.lang.String) r1, (int) r6)     // Catch:{ Exception -> 0x0340 }
            r0.b((com.taobao.accs.data.Message) r1, (boolean) r6)     // Catch:{ Exception -> 0x0340 }
            return
        L_0x0466:
            r3 = r0
            r0 = r48
            r10 = 0
            if (r0 != r6) goto L_0x04a7
            com.taobao.accs.utl.g r0 = new com.taobao.accs.utl.g     // Catch:{ Exception -> 0x0340 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0340 }
            byte[] r5 = r7.a((java.io.InputStream) r0)     // Catch:{ Exception -> 0x0340 }
            com.taobao.accs.utl.ALog$Level r4 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Exception -> 0x0340 }
            boolean r4 = com.taobao.accs.utl.ALog.isPrintLog(r4)     // Catch:{ Exception -> 0x0340 }
            if (r4 == 0) goto L_0x04a0
            java.lang.String r4 = r7.m     // Catch:{ Exception -> 0x0340 }
            java.lang.String r10 = "handleMessage gzip completeOriData"
            r9 = 4
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r16 = "dataId"
            r17 = 0
            r6[r17] = r16     // Catch:{ Exception -> 0x0115 }
            r16 = 1
            r6[r16] = r2     // Catch:{ Exception -> 0x0115 }
            java.lang.String r16 = "length"
            r17 = 2
            r6[r17] = r16     // Catch:{ Exception -> 0x0115 }
            int r9 = r5.length     // Catch:{ Exception -> 0x0115 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0115 }
            r16 = 3
            r6[r16] = r9     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.d(r4, r10, r6)     // Catch:{ Exception -> 0x0115 }
        L_0x04a0:
            r0.close()     // Catch:{ Exception -> 0x0115 }
            goto L_0x04a7
        L_0x04a4:
            r3 = r0
            r5 = r42
        L_0x04a7:
            r7.d(r2)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r0 = "accs"
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0115 }
            if (r0 == 0) goto L_0x04d7
            java.lang.String r0 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "handleMessage try deliverMsg"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r6 = "dataId"
            r9 = 0
            r4[r9] = r6     // Catch:{ Exception -> 0x0115 }
            r6 = 1
            r4[r6] = r13     // Catch:{ Exception -> 0x0115 }
            java.lang.String r9 = "target"
            r10 = 2
            r4[r10] = r9     // Catch:{ Exception -> 0x0115 }
            r9 = r1[r6]     // Catch:{ Exception -> 0x0115 }
            r6 = 3
            r4[r6] = r9     // Catch:{ Exception -> 0x0115 }
            java.lang.String r6 = "serviceId"
            r9 = 4
            r4[r9] = r6     // Catch:{ Exception -> 0x0115 }
            r6 = 5
            r4[r6] = r15     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.e(r0, r2, r4)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0504
        L_0x04d7:
            r4 = 6
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Exception -> 0x0115 }
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)     // Catch:{ Exception -> 0x0115 }
            if (r0 == 0) goto L_0x0504
            java.lang.String r0 = r7.m     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "handleMessage try deliverMsg"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r6 = "dataId"
            r9 = 0
            r4[r9] = r6     // Catch:{ Exception -> 0x0115 }
            r6 = 1
            r4[r6] = r13     // Catch:{ Exception -> 0x0115 }
            java.lang.String r9 = "target"
            r10 = 2
            r4[r10] = r9     // Catch:{ Exception -> 0x0115 }
            r9 = r1[r6]     // Catch:{ Exception -> 0x0115 }
            r6 = 3
            r4[r6] = r9     // Catch:{ Exception -> 0x0115 }
            java.lang.String r6 = "serviceId"
            r9 = 4
            r4[r9] = r6     // Catch:{ Exception -> 0x0115 }
            r6 = 5
            r4[r6] = r15     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.utl.ALog.i(r0, r2, r4)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0505
        L_0x0504:
            r6 = 5
        L_0x0505:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "com.taobao.accs.intent.action.RECEIVE"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0115 }
            r2 = 1
            r4 = r1[r2]     // Catch:{ Exception -> 0x0115 }
            r0.setPackage(r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r2 = "command"
            r4 = 101(0x65, float:1.42E-43)
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x0115 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0115 }
            r4 = 3
            if (r2 < r4) goto L_0x0525
            java.lang.String r2 = "serviceId"
            r4 = 2
            r9 = r1[r4]     // Catch:{ Exception -> 0x0115 }
            r0.putExtra(r2, r9)     // Catch:{ Exception -> 0x0115 }
        L_0x0525:
            java.lang.String r2 = ""
            int r4 = r1.length     // Catch:{ Exception -> 0x0115 }
            r9 = 4
            if (r4 < r9) goto L_0x0533
            r4 = 3
            r2 = r1[r4]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "userInfo"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0115 }
        L_0x0533:
            java.lang.String r1 = "data"
            r0.putExtra(r1, r5)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "dataId"
            r0.putExtra(r1, r13)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "packageName"
            android.content.Context r4 = r7.i     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x0115 }
            r0.putExtra(r1, r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "host"
            r0.putExtra(r1, r14)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "conn_type"
            int r4 = r7.f78945b     // Catch:{ Exception -> 0x0115 }
            r0.putExtra(r1, r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "bizAck"
            r10 = r40
            r0.putExtra(r1, r10)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "appKey"
            com.taobao.accs.net.b r4 = r7.l     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = r4.i()     // Catch:{ Exception -> 0x0115 }
            r0.putExtra(r1, r4)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r1 = "configTag"
            com.taobao.accs.net.b r4 = r7.l     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = r4.m     // Catch:{ Exception -> 0x0115 }
            r0.putExtra(r1, r4)     // Catch:{ Exception -> 0x0115 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r1 = new com.taobao.accs.ut.monitor.NetPerformanceMonitor     // Catch:{ Exception -> 0x0115 }
            r1.<init>()     // Catch:{ Exception -> 0x0115 }
            r4 = 4
            r1.setMsgType(r4)     // Catch:{ Exception -> 0x0115 }
            r1.onReceiveData()     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = "monitor"
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0115 }
            r7.a((java.util.Map<java.lang.Integer, java.lang.String>) r3, (android.content.Intent) r0)     // Catch:{ Exception -> 0x0115 }
            if (r10 == 0) goto L_0x0592
            r6 = r34
            int r1 = (int) r6
            short r1 = (short) r1
            r43 = r10
            r9 = r6
            r6 = r47
            r6.a((android.content.Intent) r0, (java.lang.String) r12, (java.lang.String) r11, (short) r1)     // Catch:{ Exception -> 0x0697 }
            goto L_0x0597
        L_0x0592:
            r6 = r7
            r43 = r10
            r9 = r34
        L_0x0597:
            android.content.Context r1 = r6.i     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.net.b r4 = r6.l     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.data.g.a(r1, r4, r0)     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.utl.UTMini r16 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Exception -> 0x0697 }
            r17 = 66001(0x101d1, float:9.2487E-41)
            java.lang.String r18 = "MsgToBussPush"
            java.lang.String r19 = "commandId=101"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = "serviceId="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0697 }
            r0.append(r15)     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = " dataId="
            r0.append(r1)     // Catch:{ Exception -> 0x0697 }
            r0.append(r13)     // Catch:{ Exception -> 0x0697 }
            java.lang.String r20 = r0.toString()     // Catch:{ Exception -> 0x0697 }
            r0 = 221(0xdd, float:3.1E-43)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0697 }
            r16.commitEvent(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0697 }
            java.lang.String r0 = "accs"
            java.lang.String r1 = "to_buss"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0697 }
            java.lang.String r7 = "1commandId=101serviceId="
            r4.<init>(r7)     // Catch:{ Exception -> 0x0697 }
            r4.append(r15)     // Catch:{ Exception -> 0x0697 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0697 }
            r44 = r11
            r45 = r12
            r11 = 0
            com.taobao.accs.utl.b.a(r0, r1, r4, r11)     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.a.d r0 = r6.j     // Catch:{ Exception -> 0x0697 }
            r0.f79062b = r13     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.a.d r0 = r6.j     // Catch:{ Exception -> 0x0697 }
            r0.i = r2     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.a.d r0 = r6.j     // Catch:{ Exception -> 0x0697 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0697 }
            r1.<init>()     // Catch:{ Exception -> 0x0697 }
            if (r5 != 0) goto L_0x05f6
            r2 = 0
            goto L_0x05f7
        L_0x05f6:
            int r2 = r5.length     // Catch:{ Exception -> 0x0697 }
        L_0x05f7:
            r1.append(r2)     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0697 }
            r0.f79066f = r1     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.a.d r0 = r6.j     // Catch:{ Exception -> 0x0697 }
            android.content.Context r1 = r6.i     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = com.taobao.accs.utl.UtilityImpl.l(r1)     // Catch:{ Exception -> 0x0697 }
            r0.f79061a = r1     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.a.d r0 = r6.j     // Catch:{ Exception -> 0x0697 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0697 }
            r0.f79064d = r1     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.ut.monitor.TrafficsMonitor$a r7 = new com.taobao.accs.ut.monitor.TrafficsMonitor$a     // Catch:{ Exception -> 0x0697 }
            boolean r2 = anet.channel.GlobalAppRuntimeInfo.isAppBackground()     // Catch:{ Exception -> 0x0697 }
            int r0 = r8.length     // Catch:{ Exception -> 0x0697 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0697 }
            r0 = r7
            r1 = r15
            r17 = r3
            r3 = r50
            r0.<init>(r1, r2, r3, r4)     // Catch:{ Exception -> 0x0697 }
            r6.a((com.taobao.accs.ut.monitor.TrafficsMonitor.a) r7)     // Catch:{ Exception -> 0x0697 }
            r0 = r39
            r1 = 1
        L_0x062d:
            if (r0 != r1) goto L_0x0712
            java.lang.String r0 = "accs"
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0697 }
            if (r0 == 0) goto L_0x064e
            java.lang.String r0 = r6.m     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = "handleMessage try sendAck dataId"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0697 }
            java.lang.String r3 = "dataId"
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x064b }
            r3 = 1
            r2[r3] = r13     // Catch:{ Exception -> 0x0697 }
            com.taobao.accs.utl.ALog.e(r0, r1, r2)     // Catch:{ Exception -> 0x0697 }
            r4 = 0
            goto L_0x0660
        L_0x064b:
            r0 = move-exception
            goto L_0x0228
        L_0x064e:
            java.lang.String r0 = r6.m     // Catch:{ Exception -> 0x0697 }
            java.lang.String r1 = "handleMessage try sendAck dataId"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0697 }
            java.lang.String r3 = "dataId"
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x064b }
            r3 = 1
            r2[r3] = r13     // Catch:{ Exception -> 0x064b }
            com.taobao.accs.utl.ALog.i(r0, r1, r2)     // Catch:{ Exception -> 0x064b }
        L_0x0660:
            com.taobao.accs.net.b r8 = r6.l     // Catch:{ Exception -> 0x064b }
            r0 = 0
            int r1 = (int) r9
            short r1 = (short) r1
            r2 = 0
            r3 = 5
            r9 = r44
            r20 = r43
            r10 = r45
            r4 = r11
            r11 = r13
            r12 = r0
            r7 = r13
            r13 = r1
            r14 = r50
            r0 = r15
            r1 = 0
            r15 = r17
            com.taobao.accs.data.Message r8 = com.taobao.accs.data.Message.a(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0694 }
            com.taobao.accs.net.b r9 = r6.l     // Catch:{ Exception -> 0x0694 }
            r10 = 1
            r9.b((com.taobao.accs.data.Message) r8, (boolean) r10)     // Catch:{ Exception -> 0x0694 }
            java.lang.String r8 = r8.q     // Catch:{ Exception -> 0x0694 }
            r6.a((java.lang.String) r8, (java.lang.String) r0)     // Catch:{ Exception -> 0x0694 }
            if (r20 == 0) goto L_0x0712
            java.lang.String r0 = "accs"
            java.lang.String r8 = "ack"
            java.lang.String r9 = ""
            com.taobao.accs.utl.b.a(r0, r8, r9, r4)     // Catch:{ Exception -> 0x0694 }
            goto L_0x0712
        L_0x0694:
            r0 = move-exception
            goto L_0x011a
        L_0x0697:
            r0 = move-exception
            goto L_0x0117
        L_0x069a:
            r6 = r7
            r7 = r13
            r2 = 0
            r3 = 5
            r4 = 0
            java.lang.String r0 = r6.m     // Catch:{ Exception -> 0x06d3 }
            java.lang.String r5 = "handleMessage not exist, unbind it"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x06d3 }
            java.lang.String r9 = "package"
            r8[r4] = r9     // Catch:{ Exception -> 0x06d3 }
            r9 = 1
            r10 = r1[r9]     // Catch:{ Exception -> 0x06d3 }
            r8[r9] = r10     // Catch:{ Exception -> 0x06d3 }
            com.taobao.accs.utl.ALog.e(r0, r5, r8)     // Catch:{ Exception -> 0x06d3 }
            com.taobao.accs.net.b r0 = r6.l     // Catch:{ Exception -> 0x06d3 }
            java.lang.String r5 = ""
            com.taobao.accs.net.b r8 = r6.l     // Catch:{ Exception -> 0x06d3 }
            java.lang.String r8 = r8.b((java.lang.String) r2)     // Catch:{ Exception -> 0x06d3 }
            r9 = 4
            com.taobao.accs.data.Message r5 = com.taobao.accs.data.Message.a((java.lang.String) r7, (java.lang.String) r5, (java.lang.String) r8, (int) r9)     // Catch:{ Exception -> 0x06d3 }
            r8 = 1
            r0.b((com.taobao.accs.data.Message) r5, (boolean) r8)     // Catch:{ Exception -> 0x06d3 }
            com.taobao.accs.net.b r0 = r6.l     // Catch:{ Exception -> 0x06d3 }
            com.taobao.accs.net.b r5 = r6.l     // Catch:{ Exception -> 0x06d3 }
            r1 = r1[r8]     // Catch:{ Exception -> 0x06d3 }
            com.taobao.accs.data.Message r1 = com.taobao.accs.data.Message.a((com.taobao.accs.net.b) r5, (java.lang.String) r1)     // Catch:{ Exception -> 0x06d3 }
            r0.b((com.taobao.accs.data.Message) r1, (boolean) r8)     // Catch:{ Exception -> 0x06d3 }
            goto L_0x06d6
        L_0x06d3:
            r0 = move-exception
            goto L_0x06d7
        L_0x06d5:
            r6 = r7
        L_0x06d6:
            return
        L_0x06d7:
            java.lang.String r1 = r6.m
            java.lang.String r5 = "handleMessage"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.taobao.accs.utl.ALog.e(r1, r5, r0, r4)
            com.taobao.accs.net.b r1 = r6.l
            java.lang.String r4 = ""
            com.taobao.accs.net.b r5 = r6.l
            java.lang.String r2 = r5.b((java.lang.String) r2)
            com.taobao.accs.data.Message r2 = com.taobao.accs.data.Message.a((java.lang.String) r7, (java.lang.String) r4, (java.lang.String) r2, (int) r3)
            r3 = 1
            r1.b((com.taobao.accs.data.Message) r2, (boolean) r3)
            java.lang.String r1 = "accs"
            java.lang.String r2 = "send_fail"
            java.lang.String r3 = ""
            java.lang.String r4 = "1"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r6.f78945b
            r5.append(r7)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.taobao.accs.utl.b.a(r1, r2, r3, r4, r0)
        L_0x0712:
            return
        L_0x0713:
            r0 = move-exception
            r6 = r7
            r4 = 0
            java.lang.String r2 = r6.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "dataId read error "
            r3.<init>(r5)
            java.lang.String r5 = r0.toString()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.taobao.accs.utl.ALog.e(r2, r3, r4)
            r1.close()
            java.lang.String r1 = "accs"
            java.lang.String r2 = "send_fail"
            java.lang.String r3 = ""
            java.lang.String r4 = "1"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r6.f78945b
            r5.append(r7)
            java.lang.String r7 = "data id read error"
            r5.append(r7)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.taobao.accs.utl.b.a(r1, r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.d.a(int, byte[], java.lang.String, int):void");
    }
}
