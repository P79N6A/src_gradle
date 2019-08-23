package com.ss.android.ugc.aweme.im.sdk.j;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51694a;

    /* renamed from: b  reason: collision with root package name */
    public long f51695b;

    /* renamed from: c  reason: collision with root package name */
    public int f51696c;

    /* renamed from: d  reason: collision with root package name */
    public int f51697d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, String> f51698e;

    /* renamed from: f  reason: collision with root package name */
    public String f51699f;
    public String g;
    public byte[] h;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f51694a, false, 53995, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51694a, false, 53995, new Class[0], String.class);
        }
        return "WsChannelMsg{logId=" + this.f51695b + ", service=" + this.f51696c + ", method=" + this.f51697d + ", msgHeaders=" + this.f51698e + ", payloadEncoding='" + this.f51699f + '\'' + ", payloadType='" + this.g + '\'' + ", payload=" + Arrays.toString(this.h) + '}';
    }
}
