package com.ss.android.ugc.aweme.message.d;

import com.bytedance.common.wschannel.event.ConnectionState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f55393a;

    static {
        int[] iArr = new int[ConnectionState.values().length];
        f55393a = iArr;
        iArr[ConnectionState.CONNECTED.ordinal()] = 1;
        f55393a[ConnectionState.CONNECT_CLOSED.ordinal()] = 2;
        f55393a[ConnectionState.CONNECT_FAILED.ordinal()] = 3;
        f55393a[ConnectionState.CONNECTING.ordinal()] = 4;
    }
}
