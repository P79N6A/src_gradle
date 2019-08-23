package com.bytedance.im.core.a;

import com.bytedance.im.core.proto.ConversationType;
import com.bytedance.im.core.proto.StatusCode;

public final class d {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f20886a = ConversationType.ONE_TO_ONE_CHAT.getValue();

        /* renamed from: b  reason: collision with root package name */
        public static final int f20887b = ConversationType.GROUP_CHAT.getValue();

        /* renamed from: c  reason: collision with root package name */
        public static final int f20888c = ConversationType.LIVE_CHAT.getValue();
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f20889a = StatusCode.OK.getValue();

        /* renamed from: b  reason: collision with root package name */
        public static final int f20890b = StatusCode.INVALID_TOKEN.getValue();

        /* renamed from: c  reason: collision with root package name */
        public static final int f20891c = StatusCode.EXPIRED_TOKEN.getValue();

        /* renamed from: d  reason: collision with root package name */
        public static final int f20892d = StatusCode.INVALID_TICKET.getValue();

        /* renamed from: e  reason: collision with root package name */
        public static final int f20893e = StatusCode.INVALID_REQUEST.getValue();

        /* renamed from: f  reason: collision with root package name */
        public static final int f20894f = StatusCode.INVALID_CMD.getValue();
        public static final int g = StatusCode.SERVER_ERR.getValue();
    }
}
