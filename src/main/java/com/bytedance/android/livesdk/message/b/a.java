package com.bytedance.android.livesdk.message.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.MessageApi;
import com.bytedance.android.livesdk.message.b;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.message.proto.Message;
import com.bytedance.android.livesdk.message.proto.Response;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.c;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Wire;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class a implements c, IMessageClient {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16391a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f16392b = "a";

    /* renamed from: c  reason: collision with root package name */
    private IMessageClient.Callback f16393c;

    /* renamed from: d  reason: collision with root package name */
    private long f16394d;

    /* renamed from: e  reason: collision with root package name */
    private long f16395e;

    /* renamed from: f  reason: collision with root package name */
    private Context f16396f;
    private MessageApi g = ((MessageApi) j.q().d().a(MessageApi.class));
    private long h;
    private String i;
    private String j;
    private long k;
    private long l;
    private long m;
    private boolean n = true;
    private boolean o = true;

    public void connectToWebSocket() {
    }

    public void disconnectFromWebSocket() {
    }

    private void a() {
        this.k = -1;
        this.l = 0;
        this.m = 0;
    }

    public long getUserId() {
        if (PatchProxy.isSupport(new Object[0], this, f16391a, false, 10998, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f16391a, false, 10998, new Class[0], Long.TYPE)).longValue();
        } else if (this.f16395e > 0) {
            return this.f16395e;
        } else {
            this.f16395e = TTLiveSDKContext.getHostService().k().b();
            return this.f16395e;
        }
    }

    public void setCallback(IMessageClient.Callback callback) {
        this.f16393c = callback;
    }

    public a(boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.i = str;
    }

    private ProtoApiResult a(Response response) {
        if (PatchProxy.isSupport(new Object[]{response}, this, f16391a, false, 10997, new Class[]{Response.class}, ProtoApiResult.class)) {
            return (ProtoApiResult) PatchProxy.accessDispatch(new Object[]{response}, this, f16391a, false, 10997, new Class[]{Response.class}, ProtoApiResult.class);
        }
        ProtoApiResult protoApiResult = new ProtoApiResult();
        protoApiResult.cursor = response.cursor;
        protoApiResult.fetchInterval = ((Long) Wire.get(response.fetch_interval, 1000L)).longValue();
        protoApiResult.now = ((Long) Wire.get(response.now, Long.valueOf(System.currentTimeMillis()))).longValue();
        this.j = response.internal_ext;
        long currentTimeMillis = System.currentTimeMillis();
        this.k = currentTimeMillis - this.h;
        ah.c((protoApiResult.now + ((currentTimeMillis - this.h) / 2)) - currentTimeMillis);
        protoApiResult.messages = new ArrayList();
        if (response.messages == null || response.messages.isEmpty()) {
            return protoApiResult;
        }
        for (Message next : response.messages) {
            if (!TextUtils.isEmpty(next.method) && next.payload != null && next.payload.size() > 0) {
                try {
                    ProtoAdapter<? extends com.squareup.wire.Message> protoAdapter = com.bytedance.android.livesdk.chatroom.bl.a.getProtoAdapter(next.method);
                    if (protoAdapter != null) {
                        com.squareup.wire.Message message = (com.squareup.wire.Message) protoAdapter.decode(next.payload);
                        com.bytedance.android.livesdk.message.model.c messageObject = com.bytedance.android.livesdk.chatroom.bl.a.getMessageObject(next.method);
                        if (messageObject != null) {
                            try {
                                com.bytedance.android.livesdk.message.model.c wrap = messageObject.wrap(message);
                                wrap.timestamp = ((Long) Wire.get(response.now, 0L)).longValue();
                                TTLiveSDKContext.getHostService().b().a().b();
                                if (this.n) {
                                    this.n = false;
                                    b.a("ON_FIRST_MSG_RECEIVED", next.method, wrap.getMessageId());
                                }
                                if (this.o && (wrap instanceof as) && ((as) wrap).f16486c != null && ((as) wrap).f16486c.getId() == TTLiveSDKContext.getHostService().k().b()) {
                                    this.o = false;
                                    b.a("ON_SELF_ENTER_MSG_RECEIVED", "WebcastMemberMessage", wrap.getMessageId());
                                }
                                protoApiResult.messages.add(wrap);
                            } catch (Exception e2) {
                                com.bytedance.android.livesdk.j.c.b().a(6, e2.getStackTrace());
                                b.a(e2, next.method);
                            }
                        }
                    }
                } catch (IOException e3) {
                    com.bytedance.android.livesdk.j.c.b().a(6, e3.getStackTrace());
                    b.a((Exception) e3, next.method);
                }
            }
        }
        this.l = (long) response.messages.size();
        this.m = (long) protoApiResult.messages.size();
        return protoApiResult;
    }

    public void apiCall(Map<String, String> map) {
        Map<String, String> map2;
        if (PatchProxy.isSupport(new Object[]{map}, this, f16391a, false, 10994, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f16391a, false, 10994, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{map}, this, f16391a, false, 10996, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f16391a, false, 10996, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        if (map == null) {
            map2 = new HashMap<>();
        } else {
            map2 = map;
        }
        map2.put("resp_content_type", "protobuf");
        if (PatchProxy.isSupport(new Object[]{map2}, this, f16391a, false, 10995, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f16391a, false, 10995, new Class[]{Map.class}, Void.TYPE);
        } else {
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                map2.put("app_language", this.f16396f.getResources().getConfiguration().locale.getLanguage());
            }
            TTLiveSDKContext.getHostService().a();
            map2.put("live_id", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            map2.remove("fetch_time");
            map2.remove("ack_ids");
            map2.put("identity", this.i);
            map2.put("last_rtt", String.valueOf(this.k));
            map2.put("recv_cnt", String.valueOf(this.l));
            map2.put("parse_cnt", String.valueOf(this.m));
            if (!TextUtils.isEmpty(this.j)) {
                map2.put("internal_ext", this.j);
            }
        }
        if (this.g == null) {
            this.g = (MessageApi) j.q().d().a(MessageApi.class);
        }
        Call<Response> fetchMessageUsePb = this.g.fetchMessageUsePb(this.f16394d, map2);
        try {
            this.h = System.currentTimeMillis();
            SsResponse execute = fetchMessageUsePb.execute();
            if (execute.isSuccessful()) {
                try {
                    if (this.f16393c != null) {
                        this.f16393c.onApiSuccess(a((Response) execute.body()));
                    }
                } catch (Exception unused) {
                }
                return;
            }
            a();
            if (this.f16393c != null) {
                this.f16393c.onApiError(new Exception(String.valueOf(execute.code())));
            }
            b.a("Api error, error_code:" + execute.code(), (String) null);
        } catch (Exception e2) {
            a();
            if (this.f16393c != null) {
                this.f16393c.onApiError(e2);
            }
            StringWriter stringWriter = new StringWriter();
            com.google.a.a.a.a.a.a.a((Throwable) e2, new PrintWriter(stringWriter));
            b.a(e2.getMessage(), stringWriter.toString());
        }
    }

    public final void a(long j2, Context context) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), context}, this, f16391a, false, 10992, new Class[]{Long.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), context}, this, f16391a, false, 10992, new Class[]{Long.TYPE, Context.class}, Void.TYPE);
            return;
        }
        this.f16394d = j3;
        this.f16396f = context.getApplicationContext();
    }
}
