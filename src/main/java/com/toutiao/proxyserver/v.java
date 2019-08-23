package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public final class v extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80266a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Proxy> f80267b = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: c  reason: collision with root package name */
    private final ProxySelector f80268c = ProxySelector.getDefault();

    /* renamed from: d  reason: collision with root package name */
    private final String f80269d;

    /* renamed from: e  reason: collision with root package name */
    private final int f80270e;

    public final List<Proxy> select(URI uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f80266a, false, 91766, new Class[]{URI.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{uri}, this, f80266a, false, 91766, new Class[]{URI.class}, List.class);
        } else if (uri == null) {
            throw new IllegalArgumentException("URI can't be null");
        } else if (!this.f80269d.equalsIgnoreCase(uri.getHost()) || this.f80270e != uri.getPort()) {
            return this.f80268c.select(uri);
        } else {
            return f80267b;
        }
    }

    v(String str, int i) {
        this.f80269d = str;
        this.f80270e = i;
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        URI uri2 = uri;
        SocketAddress socketAddress2 = socketAddress;
        IOException iOException2 = iOException;
        if (PatchProxy.isSupport(new Object[]{uri2, socketAddress2, iOException2}, this, f80266a, false, 91767, new Class[]{URI.class, SocketAddress.class, IOException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2, socketAddress2, iOException2}, this, f80266a, false, 91767, new Class[]{URI.class, SocketAddress.class, IOException.class}, Void.TYPE);
            return;
        }
        this.f80268c.connectFailed(uri2, socketAddress2, iOException2);
    }
}
