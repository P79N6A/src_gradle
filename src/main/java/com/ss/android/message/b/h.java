package com.ss.android.message.b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.Templates;
import org.msgpack.unpacker.Unpacker;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29985a;

    /* renamed from: b  reason: collision with root package name */
    public static PowerManager.WakeLock f29986b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f29987a = new HashMap();
    }

    public static class b extends AbstractTemplate<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29988a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public a read(Unpacker unpacker, a aVar, boolean z) throws IOException {
            a aVar2;
            Unpacker unpacker2 = unpacker;
            if (PatchProxy.isSupport(new Object[]{unpacker2, aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f29988a, false, 18175, new Class[]{Unpacker.class, a.class, Boolean.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{unpacker2, aVar, Byte.valueOf(z)}, this, f29988a, false, 18175, new Class[]{Unpacker.class, a.class, Boolean.TYPE}, a.class);
            } else if (!z && unpacker.trySkipNil()) {
                return null;
            } else {
                if (aVar == null) {
                    aVar2 = new a();
                } else {
                    aVar2 = aVar;
                }
                int readMapBegin = unpacker.readMapBegin();
                aVar2.f29987a = new HashMap();
                for (int i = 0; i < readMapBegin; i++) {
                    try {
                        Object a2 = h.a(unpacker.readValue());
                        aVar2.f29987a.put((String) unpacker2.read(Templates.TString), a2);
                    } catch (UnsupportedOperationException e2) {
                        h.a((Exception) e2);
                    } catch (c e3) {
                        h.a((Exception) e3);
                    }
                }
                unpacker.readMapEnd();
                return aVar2;
            }
        }

        public final /* synthetic */ void write(Packer packer, Object obj, boolean z) throws IOException {
            Packer packer2 = packer;
            a aVar = (a) obj;
            if (PatchProxy.isSupport(new Object[]{packer2, aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f29988a, false, 18174, new Class[]{Packer.class, a.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{packer2, aVar, Byte.valueOf(z)}, this, f29988a, false, 18174, new Class[]{Packer.class, a.class, Boolean.TYPE}, Void.TYPE);
            } else if (aVar != null) {
                packer2.writeMapBegin(aVar.f29987a.size());
                for (Map.Entry next : aVar.f29987a.entrySet()) {
                    packer2.write((String) next.getKey());
                    packer2.write(next.getValue());
                }
                packer.writeMapEnd();
            } else if (!z) {
                packer.writeNil();
            } else {
                throw new NullPointerException();
            }
        }
    }

    public static void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, null, f29985a, true, 18162, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, null, f29985a, true, 18162, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Logger.debug();
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        Object obj = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, null, f29985a, true, 18164, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, null, f29985a, true, 18164, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, byte[].class);
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(obj, i, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] a(int i, int i2) {
        if (i2 <= 0 || i2 > 4) {
            return null;
        }
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                bArr[0] = (byte) (i & 255);
            } else if (i3 == 1) {
                bArr[1] = (byte) ((65280 & i) >> 8);
            } else if (i3 == 2) {
                bArr[2] = (byte) ((16711680 & i) >> 16);
            } else {
                bArr[3] = (byte) ((-16777216 & i) >> 24);
            }
        }
        return bArr;
    }

    private static boolean a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f29985a, true, 18172, new Class[]{Context.class}, Boolean.TYPE)) {
            return Build.VERSION.SDK_INT >= 26 && com.ss.android.message.a.b() >= 26;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f29985a, true, 18172, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean c() {
        if (22 == Build.VERSION.SDK_INT) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f29985a, true, 18169, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29985a, true, 18169, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("vivo")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("vivo")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().contains("vivo")) {
            return false;
        }
        return true;
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f29985a, true, 18161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f29985a, true, 18161, new Class[0], Void.TYPE);
            return;
        }
        if (f29986b != null) {
            f29986b.release();
            f29986b = null;
        }
    }

    public static int a(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return Integer.MIN_VALUE;
        }
        int length = bArr.length;
        byte b2 = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                b2 = bArr[0] & 255;
            } else if (i == 1) {
                b2 |= (bArr[1] << 8) & 65280;
            } else if (i == 2) {
                b2 |= (bArr[2] << 16) & 16711680;
            } else if (i == 3) {
                b2 |= (bArr[3] << 24) & -16777216;
            }
        }
        return b2;
    }

    public static RemoteException a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f29985a, true, 18163, new Class[]{String.class}, RemoteException.class)) {
            return (RemoteException) PatchProxy.accessDispatch(new Object[]{str2}, null, f29985a, true, 18163, new Class[]{String.class}, RemoteException.class);
        }
        RemoteException remoteException = new RemoteException();
        remoteException.initCause(new Throwable(str2));
        return remoteException;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|30|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r1.read(org.msgpack.template.Templates.TLong);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(org.msgpack.type.Value r17) throws java.io.IOException, java.lang.UnsupportedOperationException, org.msgpack.c {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f29985a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<org.msgpack.type.Value> r3 = org.msgpack.type.Value.class
            r7[r9] = r3
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r3 = 0
            r5 = 1
            r6 = 18166(0x46f6, float:2.5456E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f29985a
            r13 = 1
            r14 = 18166(0x46f6, float:2.5456E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<org.msgpack.type.Value> r0 = org.msgpack.type.Value.class
            r15[r9] = r0
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0035:
            org.msgpack.unpacker.Converter r1 = new org.msgpack.unpacker.Converter
            r1.<init>(r0)
            boolean r2 = r17.isNilValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0045
            r1.close()
            r0 = 0
            return r0
        L_0x0045:
            boolean r2 = r17.isRawValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0053
            byte[] r0 = r1.readByteArray()     // Catch:{ all -> 0x00d0 }
            r1.close()
            return r0
        L_0x0053:
            boolean r2 = r17.isBooleanValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0063
            org.msgpack.template.Template<java.lang.Boolean> r0 = org.msgpack.template.Templates.TBoolean     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r1.read((org.msgpack.template.Template<T>) r0)     // Catch:{ all -> 0x00d0 }
            r1.close()
            return r0
        L_0x0063:
            boolean r2 = r17.isIntegerValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x007d
            org.msgpack.template.Template<java.lang.Integer> r0 = org.msgpack.template.Templates.TInteger     // Catch:{ c -> 0x0073 }
            java.lang.Object r0 = r1.read((org.msgpack.template.Template<T>) r0)     // Catch:{ c -> 0x0073 }
            r1.close()
            return r0
        L_0x0073:
            org.msgpack.template.Template<java.lang.Long> r0 = org.msgpack.template.Templates.TLong     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r1.read((org.msgpack.template.Template<T>) r0)     // Catch:{ all -> 0x00d0 }
            r1.close()
            return r0
        L_0x007d:
            boolean r2 = r17.isFloatValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x008d
            org.msgpack.template.Template<java.lang.Double> r0 = org.msgpack.template.Templates.TDouble     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r1.read((org.msgpack.template.Template<T>) r0)     // Catch:{ all -> 0x00d0 }
            r1.close()
            return r0
        L_0x008d:
            boolean r2 = r17.isArrayValue()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00bc
            org.msgpack.type.ArrayValue r0 = r17.asArrayValue()     // Catch:{ all -> 0x00d0 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00d0 }
            int r3 = r0.size()     // Catch:{ all -> 0x00d0 }
            r2.<init>(r3)     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x00a4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00d0 }
            org.msgpack.type.Value r3 = (org.msgpack.type.Value) r3     // Catch:{ all -> 0x00d0 }
            java.lang.Object r3 = a((org.msgpack.type.Value) r3)     // Catch:{ all -> 0x00d0 }
            r2.add(r3)     // Catch:{ all -> 0x00d0 }
            goto L_0x00a4
        L_0x00b8:
            r1.close()
            return r2
        L_0x00bc:
            boolean r0 = r17.isMapValue()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x00d0 }
            r0.<init>()     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00c8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "fatal error"
            r0.<init>(r2)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.h.a(org.msgpack.type.Value):java.lang.Object");
    }

    public static boolean b(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f29985a, true, 18168, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f29985a, true, 18168, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str) || str2.equalsIgnoreCase("unknown")) {
            return true;
        } else {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (str2.charAt(i) != '0') {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            return z;
        }
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, null, f29985a, true, 18170, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, null, f29985a, true, 18170, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        a(context2, intent2, true);
    }

    private static void a(Context context, Intent intent, boolean z) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, (byte) 1}, null, f29985a, true, 18171, new Class[]{Context.class, Intent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2, (byte) 1}, null, f29985a, true, 18171, new Class[]{Context.class, Intent.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (a(context)) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent2, 0);
                if (queryIntentServices != null) {
                    String str = queryIntentServices.get(0).serviceInfo.name;
                    if (!StringUtils.isEmpty(str)) {
                        intent2.setComponent(new ComponentName(context2, str));
                        context.getApplicationContext().bindService(intent2, new g(intent2, true, context.getApplicationContext()), 1);
                        return;
                    }
                }
            }
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }
}
