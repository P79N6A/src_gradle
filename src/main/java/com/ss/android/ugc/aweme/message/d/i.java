package com.ss.android.ugc.aweme.message.d;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.websocket.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/message/ws/WsChannelFrame;", "Lcom/ss/android/websocket/internal/IFrame;", "wsChannelMsg", "Lcom/bytedance/common/wschannel/model/WsChannelMsg;", "(Lcom/bytedance/common/wschannel/model/WsChannelMsg;)V", "getWsChannelMsg", "()Lcom/bytedance/common/wschannel/model/WsChannelMsg;", "getMethod", "", "getMsgHeaders", "", "", "getPayload", "", "getPayloadEncoding", "getPayloadType", "getSeqId", "", "getService", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55394a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final WsChannelMsg f55395b;

    public final int getMethod() {
        if (!PatchProxy.isSupport(new Object[0], this, f55394a, false, 58812, new Class[0], Integer.TYPE)) {
            return this.f55395b.getMethod();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58812, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final byte[] getPayload() {
        if (PatchProxy.isSupport(new Object[0], this, f55394a, false, 58810, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58810, new Class[0], byte[].class);
        }
        byte[] payload = this.f55395b.getPayload();
        Intrinsics.checkExpressionValueIsNotNull(payload, "wsChannelMsg.payload");
        return payload;
    }

    @NotNull
    public final String getPayloadEncoding() {
        if (PatchProxy.isSupport(new Object[0], this, f55394a, false, 58814, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58814, new Class[0], String.class);
        }
        String payloadEncoding = this.f55395b.getPayloadEncoding();
        Intrinsics.checkExpressionValueIsNotNull(payloadEncoding, "wsChannelMsg.payloadEncoding");
        return payloadEncoding;
    }

    @NotNull
    public final String getPayloadType() {
        if (PatchProxy.isSupport(new Object[0], this, f55394a, false, 58815, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58815, new Class[0], String.class);
        }
        String payloadType = this.f55395b.getPayloadType();
        Intrinsics.checkExpressionValueIsNotNull(payloadType, "wsChannelMsg.payloadType");
        return payloadType;
    }

    public final long getSeqId() {
        if (!PatchProxy.isSupport(new Object[0], this, f55394a, false, 58811, new Class[0], Long.TYPE)) {
            return this.f55395b.getSeqId();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58811, new Class[0], Long.TYPE)).longValue();
    }

    public final int getService() {
        if (!PatchProxy.isSupport(new Object[0], this, f55394a, false, 58816, new Class[0], Integer.TYPE)) {
            return this.f55395b.getService();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55394a, false, 58816, new Class[0], Integer.TYPE)).intValue();
    }

    public i(@NotNull WsChannelMsg wsChannelMsg) {
        Intrinsics.checkParameterIsNotNull(wsChannelMsg, "wsChannelMsg");
        this.f55395b = wsChannelMsg;
    }
}
