package com.ss.android.ugc.aweme.fe.registry.rn;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44598a;

    /* renamed from: b  reason: collision with root package name */
    private final AmeRNBridgeModule f44599b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44600c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadableMap f44601d;

    /* renamed from: e  reason: collision with root package name */
    private final Callback f44602e;

    a(AmeRNBridgeModule ameRNBridgeModule, String str, ReadableMap readableMap, Callback callback) {
        this.f44599b = ameRNBridgeModule;
        this.f44600c = str;
        this.f44601d = readableMap;
        this.f44602e = callback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44598a, false, 39874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44598a, false, 39874, new Class[0], Void.TYPE);
            return;
        }
        this.f44599b.lambda$call$0$AmeRNBridgeModule(this.f44600c, this.f44601d, this.f44602e);
    }
}
