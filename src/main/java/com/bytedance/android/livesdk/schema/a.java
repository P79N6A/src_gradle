package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17166a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.host.a f17167b;

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f17166a, false, 13149, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f17166a, false, 13149, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        }
    }

    public final void a(Context context, long j, Bundle bundle) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), bundle}, this, f17166a, false, 13144, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, new Long(j2), bundle}, this, f17166a, false, 13144, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE);
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f17166a, false, 13142, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f17166a, false, 13142, new Class[]{String.class, String.class}, Void.TYPE);
        }
    }

    public final void a(String str, String str2, Context context) {
        String str3 = str;
        String str4 = str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str3, str4, context2}, this, f17166a, false, 13139, new Class[]{String.class, String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, context2}, this, f17166a, false, 13139, new Class[]{String.class, String.class, Context.class}, Void.TYPE);
            return;
        }
        this.f17167b.a(str3, str4, context2);
    }

    public final boolean a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2}, this, f17166a, false, 13145, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return this.f17167b.a(context2, str2, new Bundle());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f17166a, false, 13145, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public a(com.bytedance.android.livesdkapi.host.a aVar) {
        this.f17167b = aVar;
    }

    public final void b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f17166a, false, 13147, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f17166a, false, 13147, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(PushConstants.WEB_URL, str2);
        this.f17167b.a(context2, intent);
    }

    public final void a(long j, Map<String, String> map) {
        long j2 = j;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), map2}, this, f17166a, false, 13143, new Class[]{Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), map2}, this, f17166a, false, 13143, new Class[]{Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        this.f17167b.a(j2, map2);
    }

    public final void a(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, this, f17166a, false, 13141, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, this, f17166a, false, 13141, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        this.f17167b.a(str2, context2);
    }

    public final void a(String str, Bundle bundle, Context context) {
        String str2 = str;
        Bundle bundle2 = bundle;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, bundle2, context2}, this, f17166a, false, 13140, new Class[]{String.class, Bundle.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle2, context2}, this, f17166a, false, 13140, new Class[]{String.class, Bundle.class, Context.class}, Void.TYPE);
            return;
        }
        this.f17167b.a(str2, bundle2, context2);
    }
}
