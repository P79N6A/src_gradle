package com.bytedance.android.livesdk.livecommerce;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import com.bytedance.android.livesdkapi.d.b;
import com.bytedance.android.livesdkapi.d.e;
import com.bytedance.android.livesdkapi.d.f;
import com.bytedance.android.livesdkapi.d.h;
import com.bytedance.android.livesdkapi.d.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15889a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f15890b = new a();

    private a() {
    }

    public final boolean a(@NonNull Activity activity, boolean z) {
        Activity activity2 = activity;
        if (!PatchProxy.isSupport(new Object[]{activity2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15889a, false, 10378, new Class[]{Activity.class, Boolean.TYPE}, Boolean.TYPE)) {
            return b.a().a(activity2, z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z)}, this, f15889a, false, 10378, new Class[]{Activity.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final b a(@NonNull Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f15889a, false, 10375, new Class[]{Context.class}, b.class)) {
            return b.a().a(context2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context2}, this, f15889a, false, 10375, new Class[]{Context.class}, b.class);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15889a, false, 10380, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15889a, false, 10380, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b.a().b(z);
    }

    public final void a(@NonNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f15889a, false, 10377, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f15889a, false, 10377, new Class[]{h.class}, Void.TYPE);
            return;
        }
        b.a().a(hVar2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15889a, false, 10379, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15889a, false, 10379, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b.a().a(z);
    }

    public final void a(i iVar, String str) {
        i iVar2 = iVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iVar2, str2}, this, f15889a, false, 10372, new Class[]{i.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2, str2}, this, f15889a, false, 10372, new Class[]{i.class, String.class}, Void.TYPE);
            return;
        }
        b.a().a(iVar2, str2);
    }

    public final DialogFragment a(Context context, String str, i iVar) {
        Context context2 = context;
        String str2 = str;
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, iVar2}, this, f15889a, false, 10373, new Class[]{Context.class, String.class, i.class}, DialogFragment.class)) {
            return b.a().a(context2, str2, iVar2);
        }
        return (DialogFragment) PatchProxy.accessDispatch(new Object[]{context2, str2, iVar2}, this, f15889a, false, 10373, new Class[]{Context.class, String.class, i.class}, DialogFragment.class);
    }

    public final void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, e eVar) {
        Fragment fragment2 = fragment;
        String str3 = str;
        String str4 = str2;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{fragment2, str3, str4, eVar2}, this, f15889a, false, 10374, new Class[]{Fragment.class, String.class, String.class, e.class}, Void.TYPE)) {
            Object[] objArr = {fragment2, str3, str4, eVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f15889a, false, 10374, new Class[]{Fragment.class, String.class, String.class, e.class}, Void.TYPE);
            return;
        }
        b.a().a(fragment2, str3, str4, eVar2);
    }
}
