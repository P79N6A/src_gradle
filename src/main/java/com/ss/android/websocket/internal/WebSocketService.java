package com.ss.android.websocket.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.websocket.b.a;
import com.ss.android.websocket.b.a.c;
import com.ss.android.websocket.b.b;
import com.ss.android.websocket.b.b.d;
import com.ss.android.websocket.b.b.e;
import com.ss.android.websocket.b.b.f;
import com.ss.android.websocket.b.b.g;
import com.ss.android.websocket.internal.proto.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import okio.ByteString;
import org.greenrobot.eventbus.Subscribe;

public class WebSocketService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f4345a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, com.ss.android.websocket.a.a> f4346b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f4347c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Long> f4348d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Handler f4349e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f4350f;
    public Looper g;
    public com.ss.android.websocket.b.a h;

    class a extends Handler {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    WebSocketService webSocketService = WebSocketService.this;
                    com.ss.android.websocket.b.a.b bVar = (com.ss.android.websocket.b.a.b) message.obj;
                    String str = bVar.f78190a;
                    com.ss.android.websocket.b.c.b bVar2 = bVar.f78191b;
                    c cVar = bVar.f78192c;
                    if (webSocketService.f4347c.contains(str) && (webSocketService.f4345a.get(str) == null || webSocketService.f4345a.get(str).f78201a == b.a.CONNECTED)) {
                        com.ss.android.websocket.a.a aVar = webSocketService.f4346b.get(str);
                        if (aVar != null) {
                            try {
                                aVar.a(new Buffer().writeUtf8("ping"));
                            } catch (Exception unused) {
                                webSocketService.f4349e.post(new Runnable(str, bVar2, cVar) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ String f78256a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ com.ss.android.websocket.b.c.b f78257b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ c f78258c;

                                    public final void run() {
                                        org.greenrobot.eventbus.c.a().d(new d(this.f78256a, e.INTERNAL_ERROR));
                                        if (WebSocketService.this.a(this.f78256a, this.f78257b, this.f78258c, e.INTERNAL_ERROR)) {
                                            b bVar = WebSocketService.this.f4345a.get(this.f78256a);
                                            if (bVar != null) {
                                                WebSocketService.this.f4345a.put(this.f78256a, bVar.a(b.a.RETRY_WAITING));
                                            }
                                            org.greenrobot.eventbus.c.a().d(new g(this.f78256a, b.a.RETRY_WAITING));
                                            return;
                                        }
                                        WebSocketService.this.f4345a.remove(this.f78256a);
                                        org.greenrobot.eventbus.c.a().d(new g(this.f78256a, null));
                                        WebSocketService.this.f4346b.remove(this.f78256a);
                                    }

                                    {
                                        this.f78256a = r2;
                                        this.f78257b = r3;
                                        this.f78258c = r4;
                                    }
                                });
                            }
                        }
                        webSocketService.f4347c.remove(str);
                        return;
                    }
                case 1:
                    WebSocketService webSocketService2 = WebSocketService.this;
                    String str2 = ((com.ss.android.websocket.b.a.a) message.obj).f78189a;
                    if (!WebSocketService.a((Context) webSocketService2)) {
                        webSocketService2.f4349e.post(new Runnable(str2) {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f78260a;

                            public final void run() {
                                WebSocketService.this.f4347c.remove(this.f78260a);
                                WebSocketService.this.f4349e.post(new Runnable() {
                                    public final void run() {
                                        org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.b.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, AnonymousClass7.this.f78260a, "no network"));
                                        WebSocketService.this.f4345a.remove(AnonymousClass7.this.f78260a);
                                        org.greenrobot.eventbus.c.a().d(new g(AnonymousClass7.this.f78260a, null));
                                        WebSocketService.this.f4346b.remove(AnonymousClass7.this.f78260a);
                                        WebSocketService.this.f4348d.remove(AnonymousClass7.this.f78260a);
                                    }
                                });
                            }

                            {
                                this.f78260a = r2;
                            }
                        });
                        break;
                    } else {
                        com.ss.android.websocket.a.a aVar2 = webSocketService2.f4346b.get(str2);
                        if (aVar2 != null) {
                            try {
                                aVar2.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "Bye!");
                                break;
                            } catch (Exception e2) {
                                webSocketService2.f4349e.post(new Runnable(str2, e2) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ String f78263a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ Exception f78264b;

                                    public final void run() {
                                        WebSocketService.this.f4347c.remove(this.f78263a);
                                        WebSocketService.this.f4349e.post(new Runnable() {
                                            public final void run() {
                                                org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.b.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, AnonymousClass8.this.f78263a, AnonymousClass8.this.f78264b.getMessage()));
                                                WebSocketService.this.f4345a.remove(AnonymousClass8.this.f78263a);
                                                org.greenrobot.eventbus.c.a().d(new g(AnonymousClass8.this.f78263a, null));
                                                WebSocketService.this.f4346b.remove(AnonymousClass8.this.f78263a);
                                                WebSocketService.this.f4348d.remove(AnonymousClass8.this.f78263a);
                                            }
                                        });
                                    }

                                    {
                                        this.f78263a = r2;
                                        this.f78264b = r3;
                                    }
                                });
                            }
                        }
                        return;
                    }
                case 2:
                    WebSocketService.this.g.quit();
                    break;
                case 3:
                    WebSocketService webSocketService3 = WebSocketService.this;
                    com.ss.android.websocket.b.a.e eVar = (com.ss.android.websocket.b.a.e) message.obj;
                    String str3 = eVar.f78195a;
                    if (webSocketService3.f4345a.get(str3) == null || webSocketService3.f4345a.get(str3).f78201a != b.a.CONNECTED) {
                        org.greenrobot.eventbus.c.a().d(new f(str3, eVar, 0));
                        break;
                    } else {
                        com.ss.android.websocket.a.a aVar3 = webSocketService3.f4346b.get(str3);
                        if (aVar3 != null) {
                            try {
                                byte[] bArr = eVar.f78196b;
                                Map<String, String> a2 = eVar.a();
                                ArrayList arrayList = new ArrayList();
                                for (String next : a2.keySet()) {
                                    arrayList.add(new Frame.ExtendedEntry(next, a2.get(next)));
                                }
                                aVar3.a(RequestBody.create(com.ss.android.websocket.a.a.f78143b, Frame.ADAPTER.encode(new Frame.Builder().service(Integer.valueOf(eVar.f78199e)).seqid(Long.valueOf(eVar.f78197c)).logid(Long.valueOf(eVar.f78198d)).method(Integer.valueOf(eVar.f78200f)).payload(ByteString.of(bArr)).headers(arrayList).payload_type(eVar.g).payload_encoding(eVar.h).build())));
                                break;
                            } catch (Exception unused2) {
                                webSocketService3.f4349e.post(new Runnable(eVar, str3) {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ com.ss.android.websocket.b.a.e f78246a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f78247b;

                                    public final void run() {
                                        boolean z;
                                        WebSocketService webSocketService = WebSocketService.this;
                                        com.ss.android.websocket.b.a.e eVar = this.f78246a;
                                        long a2 = webSocketService.h.f4342a.f78187c.a(e.INTERNAL_ERROR);
                                        if (a2 != -1) {
                                            webSocketService.f4349e.sendMessageDelayed(webSocketService.f4349e.obtainMessage(3, eVar), a2);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            org.greenrobot.eventbus.c.a().d(new f(this.f78247b, this.f78246a, 1));
                                        }
                                    }

                                    {
                                        this.f78246a = r2;
                                        this.f78247b = r3;
                                    }
                                });
                                break;
                            }
                        } else {
                            webSocketService3.f4349e.post(new Runnable(str3, eVar) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f78249a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ com.ss.android.websocket.b.a.e f78250b;

                                public final void run() {
                                    org.greenrobot.eventbus.c.a().d(new f(this.f78249a, this.f78250b, 2));
                                }

                                {
                                    this.f78249a = r2;
                                    this.f78250b = r3;
                                }
                            });
                            return;
                        }
                    }
                    break;
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        if (org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f4349e = new Handler(getMainLooper());
        HandlerThread handlerThread = new HandlerThread("web_socket_service");
        handlerThread.start();
        this.g = handlerThread.getLooper();
        this.f4350f = new a(this.g);
        if (!org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().a((Object) this);
        }
        this.h = com.ss.android.websocket.b.a.a((Context) this);
    }

    static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b(Response response) {
        if (response != null) {
            try {
                if (response.body() != null) {
                    return response.body().string();
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return "null";
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.a.b bVar) {
        if (!a((Context) this)) {
            org.greenrobot.eventbus.c.a().d(new d(bVar.f78190a, e.INTERNAL_ERROR));
            return;
        }
        String str = bVar.f78190a;
        b bVar2 = this.f4345a.get(str);
        if (bVar2 == null || bVar2.f78201a == b.a.CLOSED) {
            a(str, bVar.f78191b, bVar.f78192c);
        }
    }

    public static long a(Response response) {
        String str;
        StringBuilder sb = new StringBuilder("open websocket headers: ");
        if (response == null) {
            str = "null";
        } else {
            str = response.headers().toString();
        }
        sb.append(str);
        Logger.i("web_socket_service", sb.toString());
        if (response == null || response.headers() == null) {
            return -1;
        }
        String str2 = response.headers().get("Handshake-Options");
        if (StringUtils.isEmpty(str2)) {
            return -1;
        }
        String str3 = "";
        String trim = str2.trim();
        String[] split = trim.split(";");
        if (split.length == 0) {
            str3 = trim.replace("ping-interval=", "");
        } else {
            int length = split.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str4 = split[i];
                    if (str4.contains("ping-interval=")) {
                        str3 = str4.replace("ping-interval=", "");
                        break;
                    }
                    i++;
                }
            }
        }
        try {
            return 1000 * Long.valueOf(str3).longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.a.a aVar) {
        String str = aVar.f78189a;
        b bVar = this.f4345a.get(str);
        if (bVar != null) {
            if (bVar.f78201a == b.a.CONNECTED) {
                this.f4350f.obtainMessage(1, aVar).sendToTarget();
                this.f4345a.put(str, bVar.a(b.a.CLOSING));
                org.greenrobot.eventbus.c.a().d(new g(str, b.a.CLOSING));
                return;
            }
            if (bVar.f78201a == b.a.RETRY_WAITING) {
                this.f4345a.remove(str);
                org.greenrobot.eventbus.c.a().d(new g(str, null));
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.a.d dVar) {
        if (!a((Context) this)) {
            org.greenrobot.eventbus.c.a().d(new f(dVar.f78193a, dVar.f78194b, 3));
            return;
        }
        String str = dVar.f78193a;
        if (!TextUtils.isEmpty(str) && dVar.f78194b != null) {
            b bVar = this.f4345a.get(str);
            if (bVar == null || bVar.f78201a != b.a.CONNECTED) {
                org.greenrobot.eventbus.c.a().d(new f(str, dVar.f78194b, 0));
            } else {
                this.f4350f.obtainMessage(3, dVar.f78194b).sendToTarget();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f4349e.postDelayed(new Runnable() {
            public final void run() {
                org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.a.f());
            }
        }, 300);
        return super.onStartCommand(intent, i, i2);
    }

    /* access modifiers changed from: package-private */
    public void a(final String str, final com.ss.android.websocket.b.c.b bVar, final c cVar) {
        this.f4345a.put(str, new b(b.a.OPENING, 0));
        org.greenrobot.eventbus.c.a().d(new g(str, b.a.OPENING));
        this.f4346b.remove(str);
        this.f4348d.remove(str);
        com.ss.android.websocket.a.b.a(new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).build(), new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp2").url(str + cVar.a()).build()).a((com.ss.android.websocket.a.c) new com.ss.android.websocket.a.c() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(okhttp3.ResponseBody r10) throws java.io.IOException {
                /*
                    r9 = this;
                    byte[] r10 = r10.bytes()
                    java.lang.String r0 = java.lang.String.valueOf(r10)
                    boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x000f
                    return
                L_0x000f:
                    com.squareup.wire.ProtoAdapter<com.ss.android.websocket.internal.proto.Frame> r0 = com.ss.android.websocket.internal.proto.Frame.ADAPTER
                    java.lang.Object r10 = r0.decode((byte[]) r10)
                    com.ss.android.websocket.internal.proto.Frame r10 = (com.ss.android.websocket.internal.proto.Frame) r10
                    com.ss.android.websocket.internal.WebSocketService r0 = com.ss.android.websocket.internal.WebSocketService.this
                    java.lang.String r1 = r6
                    r2 = 1
                    r3 = 0
                    if (r10 != 0) goto L_0x0021
                L_0x001f:
                    r2 = 0
                    goto L_0x0051
                L_0x0021:
                    long r4 = r10.getSeqId()
                    java.util.Map<java.lang.String, java.lang.Long> r6 = r0.f4348d
                    java.lang.Object r6 = r6.get(r1)
                    if (r6 != 0) goto L_0x0037
                    java.util.Map<java.lang.String, java.lang.Long> r0 = r0.f4348d
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r0.put(r1, r3)
                    goto L_0x0051
                L_0x0037:
                    java.util.Map<java.lang.String, java.lang.Long> r6 = r0.f4348d
                    java.lang.Object r6 = r6.get(r1)
                    java.lang.Long r6 = (java.lang.Long) r6
                    long r6 = r6.longValue()
                    int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r8 > 0) goto L_0x0048
                    goto L_0x001f
                L_0x0048:
                    java.util.Map<java.lang.String, java.lang.Long> r0 = r0.f4348d
                    java.lang.Long r3 = java.lang.Long.valueOf(r6)
                    r0.put(r1, r3)
                L_0x0051:
                    if (r2 != 0) goto L_0x0054
                    return
                L_0x0054:
                    byte[] r0 = r10.getPayload()
                    com.ss.android.websocket.b.c.b r1 = r7
                    if (r1 == 0) goto L_0x0063
                    com.ss.android.websocket.b.c.b r1 = r7
                    java.lang.Object r1 = r1.a(r10)
                    goto L_0x0064
                L_0x0063:
                    r1 = 0
                L_0x0064:
                    com.ss.android.websocket.internal.WebSocketService r2 = com.ss.android.websocket.internal.WebSocketService.this
                    android.os.Handler r2 = r2.f4349e
                    com.ss.android.websocket.internal.WebSocketService$2$4 r3 = new com.ss.android.websocket.internal.WebSocketService$2$4
                    r3.<init>(r0, r1, r10)
                    r2.post(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.websocket.internal.WebSocketService.AnonymousClass2.a(okhttp3.ResponseBody):void");
            }

            public final void a(Buffer buffer) {
                String str;
                com.ss.android.websocket.b.d.e eVar;
                long j;
                StringBuilder sb = new StringBuilder("websocket pong: ");
                if (buffer == null) {
                    str = "";
                } else {
                    str = buffer.readUtf8();
                }
                sb.append(str);
                Logger.i("web_socket_service", sb.toString());
                WebSocketService.this.f4347c.remove(str);
                a.C0832a aVar = WebSocketService.this.h.f4342a;
                if (aVar.f78186b == null) {
                    eVar = new com.ss.android.websocket.b.d.b();
                } else {
                    eVar = aVar.f78186b;
                }
                b bVar = WebSocketService.this.f4345a.get(str);
                if (bVar != null) {
                    j = eVar.a(bVar.f78202b);
                } else {
                    j = 0;
                }
                if (j > 0) {
                    WebSocketService.this.f4350f.postDelayed(new Runnable() {
                        public final void run() {
                            if (WebSocketService.this.f4346b.get(str) != null) {
                                WebSocketService.this.f4350f.obtainMessage(0, new com.ss.android.websocket.b.a.b(str, bVar, cVar)).sendToTarget();
                            }
                        }
                    }, j);
                    WebSocketService.this.f4347c.add(str);
                }
            }

            public final void a(final int i, final String str) {
                WebSocketService.this.f4347c.remove(str);
                WebSocketService.this.f4349e.post(new Runnable() {
                    public final void run() {
                        org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.b.a(i, str, str));
                        WebSocketService.this.f4345a.remove(str);
                        org.greenrobot.eventbus.c.a().d(new g(str, null));
                        WebSocketService.this.f4346b.remove(str);
                    }
                });
            }

            public final void a(com.ss.android.websocket.a.a aVar, Response response) {
                WebSocketService.this.f4347c.add(str);
                final String b2 = WebSocketService.b(response);
                final long a2 = WebSocketService.a(response);
                Handler handler = WebSocketService.this.f4349e;
                final com.ss.android.websocket.a.a aVar2 = aVar;
                AnonymousClass1 r2 = new Runnable() {
                    public final void run() {
                        com.ss.android.websocket.b.a.a((Context) WebSocketService.this).b().a();
                        org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.b.b(str, b2));
                        WebSocketService.this.f4346b.put(str, aVar2);
                        WebSocketService.this.f4345a.put(str, new b(b.a.CONNECTED, a2));
                        org.greenrobot.eventbus.c.a().d(new g(str, b.a.CONNECTED));
                        WebSocketService.this.f4350f.obtainMessage(0, new com.ss.android.websocket.b.a.b(str, bVar, cVar)).sendToTarget();
                    }
                };
                handler.post(r2);
            }

            public final void a(final IOException iOException, Response response) {
                final e eVar;
                if (!(response == null || response.headers() == null)) {
                    Headers headers = response.headers();
                    String str = headers.get("Handshake-Msg");
                    String str2 = headers.get("Handshake-Status");
                    StringUtils.isEmpty(str);
                    StringUtils.isEmpty(str2);
                }
                WebSocketService.this.f4347c.remove(str);
                final b bVar = WebSocketService.this.f4345a.get(str);
                if (bVar == null || bVar.f78201a != b.a.CLOSING) {
                    if (response == null || response.headers() == null) {
                        eVar = e.INTERNAL_ERROR;
                    } else {
                        response.headers();
                        String str3 = response.headers().get("Handshake-Msg");
                        if (StringUtils.isEmpty(str3)) {
                            eVar = e.INTERNAL_ERROR;
                        } else {
                            try {
                                eVar = e.valueOf(str3);
                            } catch (Exception unused) {
                                eVar = e.INTERNAL_ERROR;
                            }
                        }
                    }
                    WebSocketService.this.f4349e.post(new Runnable() {
                        public final void run() {
                            org.greenrobot.eventbus.c.a().d(new d(str, eVar));
                            if (WebSocketService.this.a(str, bVar, cVar, eVar)) {
                                if (bVar != null) {
                                    WebSocketService.this.f4345a.put(str, bVar.a(b.a.RETRY_WAITING));
                                } else {
                                    WebSocketService.this.f4345a.put(str, new b(b.a.RETRY_WAITING, 0));
                                }
                                org.greenrobot.eventbus.c.a().d(new g(str, b.a.RETRY_WAITING));
                                return;
                            }
                            WebSocketService.this.f4345a.remove(str);
                            org.greenrobot.eventbus.c.a().d(new g(str, null));
                            WebSocketService.this.f4346b.remove(str);
                        }
                    });
                    return;
                }
                WebSocketService.this.f4349e.post(new Runnable() {
                    public final void run() {
                        org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.b.a(-1, str, iOException.toString()));
                        WebSocketService.this.f4345a.remove(str);
                        org.greenrobot.eventbus.c.a().d(new g(str, null));
                        WebSocketService.this.f4346b.remove(str);
                    }
                });
            }
        });
    }

    public final boolean a(final String str, final com.ss.android.websocket.b.c.b bVar, final c cVar, e eVar) {
        long a2 = this.h.b().a(eVar);
        if (a2 == -1) {
            return false;
        }
        this.f4349e.postDelayed(new Runnable() {
            public final void run() {
                WebSocketService webSocketService = WebSocketService.this;
                String str = str;
                com.ss.android.websocket.b.c.b bVar = bVar;
                c cVar = cVar;
                b bVar2 = webSocketService.f4345a.get(str);
                if (bVar2 != null && bVar2.f78201a == b.a.RETRY_WAITING) {
                    webSocketService.a(str, bVar, cVar);
                }
            }
        }, a2);
        return true;
    }
}
