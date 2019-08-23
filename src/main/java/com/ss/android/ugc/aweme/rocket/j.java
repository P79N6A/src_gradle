package com.ss.android.ugc.aweme.rocket;

import com.ss.android.websocket.b.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f63664a;

    static {
        int[] iArr = new int[b.a.values().length];
        f63664a = iArr;
        iArr[b.a.OPENING.ordinal()] = 1;
        f63664a[b.a.CONNECTED.ordinal()] = 2;
        f63664a[b.a.CLOSING.ordinal()] = 3;
        f63664a[b.a.RETRY_WAITING.ordinal()] = 4;
        f63664a[b.a.CLOSED.ordinal()] = 5;
    }
}
