package com.ss.android.ugc.aweme.message.d;

import a.i;
import com.bytedance.common.wschannel.ChannelInfo;
import com.bytedance.common.wschannel.WsChannelSdk;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.event.ConnectEvent;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.net.a.h;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.websocket.b.b;
import com.ss.android.websocket.b.b.d;
import com.ss.android.websocket.b.b.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0001H\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/message/ws/WsChannelBridge;", "", "()V", "lastConnectedUrl", "", "listener", "Lcom/bytedance/common/wschannel/app/OnMessageReceiveListener;", "payloadParserProxy", "Lcom/ss/android/ugc/aweme/message/ws/PayloadParserProxy;", "useNewSdk", "", "close", "", "getLastConnectedUrl", "getNetworkCode", "", "init", "context", "Landroid/app/Application;", "onCloseWs", "event", "Lcom/ss/android/websocket/ws/input/CloseWSEvent;", "onOpenWs", "Lcom/ss/android/websocket/ws/input/OpenWSEvent;", "onSendWs", "Lcom/ss/android/websocket/ws/input/SendWSMsgEvent;", "open", "postEvent", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3576a;

    /* renamed from: f  reason: collision with root package name */
    public static g f3577f;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3578b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3579c;

    /* renamed from: d  reason: collision with root package name */
    public String f3580d;

    /* renamed from: e  reason: collision with root package name */
    public final OnMessageReceiveListener f3581e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/message/ws/WsChannelBridge$Companion;", "", "()V", "LOG_TYPE", "", "TAG", "channelId", "", "inst", "Lcom/ss/android/ugc/aweme/message/ws/WsChannelBridge;", "getInst", "()Lcom/ss/android/ugc/aweme/message/ws/WsChannelBridge;", "setInst", "(Lcom/ss/android/ugc/aweme/message/ws/WsChannelBridge;)V", "get", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55388a;

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
            return r0;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized com.ss.android.ugc.aweme.message.d.g a() {
            /*
                r9 = this;
                monitor-enter(r9)
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r3 = f55388a     // Catch:{ all -> 0x0068 }
                r4 = 0
                r5 = 58806(0xe5b6, float:8.2405E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0068 }
                java.lang.Class<com.ss.android.ugc.aweme.message.d.g> r7 = com.ss.android.ugc.aweme.message.d.g.class
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x002a
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r4 = f55388a     // Catch:{ all -> 0x0068 }
                r5 = 0
                r6 = 58806(0xe5b6, float:8.2405E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0068 }
                java.lang.Class<com.ss.android.ugc.aweme.message.d.g> r8 = com.ss.android.ugc.aweme.message.d.g.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0068 }
                com.ss.android.ugc.aweme.message.d.g r0 = (com.ss.android.ugc.aweme.message.d.g) r0     // Catch:{ all -> 0x0068 }
                monitor-exit(r9)
                return r0
            L_0x002a:
                r8 = r9
                com.ss.android.ugc.aweme.message.d.g$a r8 = (com.ss.android.ugc.aweme.message.d.g.a) r8     // Catch:{ all -> 0x0068 }
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r3 = f55388a     // Catch:{ all -> 0x0068 }
                r4 = 0
                r5 = 58805(0xe5b5, float:8.2403E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0068 }
                java.lang.Class<com.ss.android.ugc.aweme.message.d.g> r7 = com.ss.android.ugc.aweme.message.d.g.class
                r2 = r8
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x0054
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r3 = f55388a     // Catch:{ all -> 0x0068 }
                r4 = 0
                r5 = 58805(0xe5b5, float:8.2403E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0068 }
                java.lang.Class<com.ss.android.ugc.aweme.message.d.g> r7 = com.ss.android.ugc.aweme.message.d.g.class
                r2 = r8
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0068 }
                com.ss.android.ugc.aweme.message.d.g r0 = (com.ss.android.ugc.aweme.message.d.g) r0     // Catch:{ all -> 0x0068 }
                goto L_0x0061
            L_0x0054:
                com.ss.android.ugc.aweme.message.d.g r1 = com.ss.android.ugc.aweme.message.d.g.f3577f     // Catch:{ all -> 0x0068 }
                if (r1 != 0) goto L_0x005f
                com.ss.android.ugc.aweme.message.d.g r1 = new com.ss.android.ugc.aweme.message.d.g     // Catch:{ all -> 0x0068 }
                r1.<init>(r0)     // Catch:{ all -> 0x0068 }
                com.ss.android.ugc.aweme.message.d.g.f3577f = r1     // Catch:{ all -> 0x0068 }
            L_0x005f:
                com.ss.android.ugc.aweme.message.d.g r0 = com.ss.android.ugc.aweme.message.d.g.f3577f     // Catch:{ all -> 0x0068 }
            L_0x0061:
                if (r0 != 0) goto L_0x0066
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x0068 }
            L_0x0066:
                monitor-exit(r9)
                return r0
            L_0x0068:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.message.d.g.a.a():com.ss.android.ugc.aweme.message.d.g");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/message/ws/WsChannelBridge$listener$1", "Lcom/bytedance/common/wschannel/app/OnMessageReceiveListener;", "onReceiveConnectEvent", "", "connectEvent", "Lcom/bytedance/common/wschannel/event/ConnectEvent;", "connectJson", "Lorg/json/JSONObject;", "onReceiveMsg", "wsChannelMsg", "Lcom/bytedance/common/wschannel/model/WsChannelMsg;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements OnMessageReceiveListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f55390b;

        b(g gVar) {
            this.f55390b = gVar;
        }

        public final void onReceiveMsg(@Nullable WsChannelMsg wsChannelMsg) {
            if (PatchProxy.isSupport(new Object[]{wsChannelMsg}, this, f55389a, false, 58807, new Class[]{WsChannelMsg.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wsChannelMsg}, this, f55389a, false, 58807, new Class[]{WsChannelMsg.class}, Void.TYPE);
            } else if (wsChannelMsg != null) {
                com.ss.android.websocket.b.b.c cVar = new com.ss.android.websocket.b.b.c(this.f55390b.f3580d, wsChannelMsg.getPayload(), this.f55390b.f3579c.a(new i(wsChannelMsg)));
                cVar.f78211d = wsChannelMsg.getMethod();
                cVar.a(Integer.valueOf(wsChannelMsg.getService()));
                this.f55390b.a(cVar);
            }
        }

        public final void onReceiveConnectEvent(@Nullable ConnectEvent connectEvent, @Nullable JSONObject jSONObject) {
            if (PatchProxy.isSupport(new Object[]{connectEvent, jSONObject}, this, f55389a, false, 58808, new Class[]{ConnectEvent.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{connectEvent, jSONObject}, this, f55389a, false, 58808, new Class[]{ConnectEvent.class, JSONObject.class}, Void.TYPE);
            } else if (connectEvent != null && jSONObject != null) {
                SocketState fromJson = SocketState.fromJson(jSONObject);
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "connectJson.toString()");
                b.a aVar = null;
                ConnectionState connectionState = connectEvent.connectionState;
                if (connectionState != null) {
                    switch (h.f55393a[connectionState.ordinal()]) {
                        case 1:
                            g gVar = this.f55390b;
                            String str = fromJson.connectionUrl;
                            Intrinsics.checkExpressionValueIsNotNull(str, "socketState.connectionUrl");
                            gVar.f3580d = str;
                            aVar = b.a.CONNECTED;
                            this.f55390b.a(new com.ss.android.websocket.b.b.b(fromJson.connectionUrl, jSONObject2));
                            break;
                        case 2:
                            aVar = b.a.CLOSED;
                            this.f55390b.a(new com.ss.android.websocket.b.b.a(-1, fromJson.connectionUrl, jSONObject2));
                            break;
                        case 3:
                            this.f55390b.a(new d(fromJson.connectionUrl, e.INTERNAL_ERROR));
                            break;
                        case 4:
                            aVar = b.a.OPENING;
                            break;
                    }
                }
                if (fromJson.errorCode == 4) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("error_url", fromJson.connectionUrl);
                        jSONObject3.put("error_detail", jSONObject2);
                        MonitorUtils.monitorCommonLog("aweme_ws_status", jSONObject3);
                    } catch (Exception unused) {
                    }
                }
                if (aVar != null) {
                    this.f55390b.a(new com.ss.android.websocket.b.b.g(fromJson.connectionUrl, aVar));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f55392b;

        c(Object obj) {
            this.f55392b = obj;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f55391a, false, 58809, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55391a, false, 58809, new Class[0], Void.TYPE);
            } else {
                bg.a(this.f55392b);
            }
            return Unit.INSTANCE;
        }
    }

    private g() {
        boolean z = false;
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Integer aZ = b2.aZ();
            if (aZ != null) {
                if (aZ.intValue() == 1) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f3578b = z;
        this.f3579c = new e();
        this.f3580d = "";
        this.f3581e = new b(this);
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public final void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f3576a, false, 58801, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f3576a, false, 58801, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new c<TResult>(obj2), i.f1052b);
    }

    @Subscribe
    public final void onCloseWs(@NotNull com.ss.android.websocket.b.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3576a, false, 58802, new Class[]{com.ss.android.websocket.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3576a, false, 58802, new Class[]{com.ss.android.websocket.b.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if (PatchProxy.isSupport(new Object[0], this, f3576a, false, 58800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3576a, false, 58800, new Class[0], Void.TYPE);
            return;
        }
        a(new com.ss.android.websocket.b.b.g(this.f3580d, b.a.CLOSING));
        WsChannelSdk.unregisterChannel(1239108);
    }

    @Subscribe
    public final void onSendWs(@NotNull com.ss.android.websocket.b.a.d dVar) {
        com.ss.android.websocket.b.a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3576a, false, 58804, new Class[]{com.ss.android.websocket.b.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3576a, false, 58804, new Class[]{com.ss.android.websocket.b.a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        if (dVar2.f78194b != null) {
            WsChannelMsg.Builder create = WsChannelMsg.Builder.create(1239108);
            com.ss.android.websocket.b.a.e eVar = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar, "event.wsMsgHolder");
            WsChannelMsg.Builder logId = create.setLogId(eVar.f78198d);
            com.ss.android.websocket.b.a.e eVar2 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar2, "event.wsMsgHolder");
            WsChannelMsg.Builder seqId = logId.setSeqId(eVar2.f78197c);
            com.ss.android.websocket.b.a.e eVar3 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar3, "event.wsMsgHolder");
            WsChannelMsg.Builder method = seqId.setMethod(eVar3.f78200f);
            com.ss.android.websocket.b.a.e eVar4 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar4, "event.wsMsgHolder");
            WsChannelMsg.Builder service = method.setService(eVar4.f78199e);
            com.ss.android.websocket.b.a.e eVar5 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar5, "event.wsMsgHolder");
            WsChannelMsg.Builder payload = service.setPayload(eVar5.f78196b);
            com.ss.android.websocket.b.a.e eVar6 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar6, "event.wsMsgHolder");
            WsChannelMsg.Builder payloadType = payload.setPayloadType(eVar6.g);
            com.ss.android.websocket.b.a.e eVar7 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar7, "event.wsMsgHolder");
            WsChannelMsg.Builder payloadEncoding = payloadType.setPayloadEncoding(eVar7.h);
            com.ss.android.websocket.b.a.e eVar8 = dVar2.f78194b;
            Intrinsics.checkExpressionValueIsNotNull(eVar8, "event.wsMsgHolder");
            Map a2 = eVar8.a();
            if (a2 != null) {
                for (Map.Entry entry : a2.entrySet()) {
                    payloadEncoding.addMsgHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            WsChannelSdk.sendPayload(payloadEncoding.build());
        }
    }

    @Subscribe
    public final void onOpenWs(@NotNull com.ss.android.websocket.b.a.b bVar) {
        int i;
        com.ss.android.websocket.b.a.b bVar2 = bVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3576a, false, 58803, new Class[]{com.ss.android.websocket.b.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3576a, false, 58803, new Class[]{com.ss.android.websocket.b.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "event");
        if (PatchProxy.isSupport(new Object[0], this, f3576a, false, 58799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3576a, false, 58799, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.ss.android.g.a.a()) {
            h g2 = h.g();
            AwemeAppData p = AwemeAppData.p();
            Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
            AppContext c2 = p.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "AwemeAppData.inst().appContext");
            String a2 = g2.a(c2.getContext(), "frontier_urls", "");
            CharSequence charSequence = a2;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                try {
                    JSONArray jSONArray = new JSONArray(a2);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(jSONArray.getString(i2));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("wss://frontier.snssdk.com/ws/v2");
        }
        Map hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        if (PatchProxy.isSupport(new Object[0], this, f3576a, false, 58797, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3576a, false, 58797, new Class[0], Integer.TYPE)).intValue();
        } else {
            i = f.a(NetworkUtils.getNetworkType(GlobalContext.getContext()));
        }
        hashMap.put("ne", String.valueOf(i));
        hashMap.put("is_background", String.valueOf(f.g()));
        if (com.ss.android.g.a.a()) {
            AwemeAppData p2 = AwemeAppData.p();
            Intrinsics.checkExpressionValueIsNotNull(p2, "AwemeAppData.inst()");
            AppContext c3 = p2.c();
            Intrinsics.checkExpressionValueIsNotNull(c3, "AwemeAppData.inst().appContext");
            com.ss.android.ugc.aweme.language.b currentI18nItem = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(c3.getContext());
            Intrinsics.checkExpressionValueIsNotNull(currentI18nItem, "ServiceManager.get().get…nst().appContext.context)");
            String a3 = currentI18nItem.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "ServiceManager.get().get…Context.context).language");
            hashMap.put("language", a3);
        }
        ChannelInfo.Builder aid = ChannelInfo.Builder.create(1239108).setAppKey("e1bd35ec9db7b8d846de66ed140b1ad9").setFPID(9).setAid(AppLog.getAppId());
        com.ss.android.ugc.aweme.app.i a4 = com.ss.android.ugc.aweme.app.i.a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "AppContextInfoManager.inst()");
        WsChannelSdk.registerToutianChannel(aid.setAppVersion(a4.getVersionCode()).setDeviceId(AppLog.getServerDeviceId()).setInstallId(AppLog.getInstallId()).urls(arrayList).extras(hashMap).builder(), AppLog.getSessionKey());
    }
}
