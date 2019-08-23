package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdk.schema.a.c;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d implements com.bytedance.android.livesdk.schema.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17175a;

    /* renamed from: b  reason: collision with root package name */
    private RoomActionHandler f17176b;

    /* renamed from: c  reason: collision with root package name */
    private m f17177c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f17178d;

    public static final class a implements h.b<com.bytedance.android.livesdk.schema.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17179a;

        @NonNull
        public final h.b.a<com.bytedance.android.livesdk.schema.a.a> a(h.b.a<com.bytedance.android.livesdk.schema.a.a> aVar) {
            h.b.a<com.bytedance.android.livesdk.schema.a.a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17179a, false, 13162, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new d((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17179a, false, 13162, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final boolean a(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, this, f17175a, false, 13153, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, this, f17175a, false, 13153, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        return a(context2, Uri.parse(str), true);
    }

    private d() {
        this.f17178d = new ArrayList();
        this.f17176b = new RoomActionHandler();
        this.f17177c = new m();
        this.f17178d.add(this.f17176b);
        this.f17178d.add(this.f17177c);
        this.f17178d.add(new n());
        this.f17178d.add(new e());
        b.a(com.bytedance.android.livesdk.schema.a.a.class, this);
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final boolean a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17175a, false, 13157, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return this.f17177c.a(j2, null, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17175a, false, 13157, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean b(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, this, f17175a, false, 13154, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str}, this, f17175a, false, 13154, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        return a(context2, Uri.parse(str), false);
    }

    public final boolean a(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (!PatchProxy.isSupport(new Object[]{context2, uri2}, this, f17175a, false, 13152, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return a(context2, uri2, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, f17175a, false, 13152, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Context context, b.a aVar) {
        Context context2 = context;
        b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{context2, aVar2}, this, f17175a, false, 13156, new Class[]{Context.class, b.a.class}, Boolean.TYPE)) {
            return this.f17176b.handleEnterRoom(context2, aVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, f17175a, false, 13156, new Class[]{Context.class, b.a.class}, Boolean.TYPE)).booleanValue();
    }

    private boolean a(Context context, Uri uri, boolean z) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f17175a, false, 13155, new Class[]{Context.class, Uri.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2, Byte.valueOf(z)}, this, f17175a, false, 13155, new Class[]{Context.class, Uri.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if ((TextUtils.equals(uri.getScheme(), "http") || TextUtils.equals(uri.getScheme(), "https")) && z) {
            j.q().f().a(context2, com.bytedance.android.livesdk.browser.c.c.b(uri.toString()));
            return true;
        } else {
            for (c next : this.f17178d) {
                if (next.canHandle(uri2)) {
                    return next.handle(context2, uri2);
                }
            }
            if (!z || !TTLiveSDKContext.getHostService().i().a(context2, uri.toString())) {
                return false;
            }
            return true;
        }
    }

    public final boolean a(long j, String str, Map<String, String> map) {
        long j2 = j;
        String str2 = str;
        Map<String, String> map2 = map;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), str2, map2}, this, f17175a, false, 13158, new Class[]{Long.TYPE, String.class, Map.class}, Boolean.TYPE)) {
            return this.f17177c.a(j2, str2, map2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, map2}, this, f17175a, false, 13158, new Class[]{Long.TYPE, String.class, Map.class}, Boolean.TYPE)).booleanValue();
    }
}
