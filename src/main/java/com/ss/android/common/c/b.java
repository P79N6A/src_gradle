package com.ss.android.common.c;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.c.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28237a;

    /* renamed from: c  reason: collision with root package name */
    private static b f28238c;

    /* renamed from: b  reason: collision with root package name */
    private String f28239b = "Location_Bt_InfoManager";

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f28237a, true, 15791, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f28237a, true, 15791, new Class[0], b.class);
        }
        if (f28238c == null) {
            synchronized (b.class) {
                if (f28238c == null) {
                    f28238c = new b();
                }
            }
        }
        return f28238c;
    }

    @SuppressLint({"MissingPermission"})
    public final a b() {
        if (PatchProxy.isSupport(new Object[0], this, f28237a, false, 15792, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f28237a, false, 15792, new Class[0], a.class);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            try {
                Field declaredField = BluetoothAdapter.class.getDeclaredField("mService");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(defaultAdapter);
                if (obj != null) {
                    Method method = obj.getClass().getMethod("getAddress", new Class[0]);
                    if (method != null) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (invoke != null) {
                            return new a.C0331a().a(defaultAdapter.getName()).b(invoke.toString()).a();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public final List<a> c() {
        if (PatchProxy.isSupport(new Object[0], this, f28237a, false, 15793, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f28237a, false, 15793, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            try {
                for (BluetoothDevice next : defaultAdapter.getBondedDevices()) {
                    arrayList.add(new a.C0331a().a(next.getName()).b(next.getAddress()).a());
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
