package com.bytedance.usergrowth.data.deviceinfo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.bytedance.usergrowth.data.deviceinfo.DeviceInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class b {
    private static String a(BluetoothDevice bluetoothDevice) {
        try {
            Method declaredMethod = bluetoothDevice.getClass().getDeclaredMethod("getAlias", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(bluetoothDevice, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<DeviceInfo.BluetoothInfo> a(BluetoothAdapter bluetoothAdapter) {
        ArrayList arrayList = new ArrayList();
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            return arrayList;
        }
        try {
            Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            if (bondedDevices != null) {
                for (BluetoothDevice next : bondedDevices) {
                    if (next != null) {
                        DeviceInfo.BluetoothInfo.Builder status = DeviceInfo.BluetoothInfo.newBuilder().setName(next.getName()).setMacid(next.getAddress()).setStatus(a(next, true).intValue());
                        String a2 = a(next);
                        if (!TextUtils.isEmpty(a2)) {
                            status.setAlias(a2);
                        }
                        arrayList.add(status.build());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "02:00:00:00:00:00") || TextUtils.equals(str, "00:00:00:00:00:00")) {
            return false;
        }
        return true;
    }

    private static Integer a(BluetoothDevice bluetoothDevice, boolean z) {
        int i = 2;
        try {
            Method declaredMethod = bluetoothDevice.getClass().getDeclaredMethod("isConnected", new Class[0]);
            declaredMethod.setAccessible(true);
            if (((Boolean) declaredMethod.invoke(bluetoothDevice, new Object[0])).booleanValue()) {
                i = 1;
            }
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[SYNTHETIC, Splitter:B:16:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo a(android.content.Context r6, android.bluetooth.BluetoothAdapter r7) {
        /*
            java.lang.Class<android.bluetooth.BluetoothAdapter> r0 = android.bluetooth.BluetoothAdapter.class
            r7.getName()
            java.lang.String r1 = r7.getAddress()
            boolean r2 = a((java.lang.String) r1)
            if (r2 != 0) goto L_0x0050
            java.lang.String r2 = "mService"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x003d }
            r2 = 1
            r0.setAccessible(r2)     // Catch:{ Exception -> 0x003d }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x003b
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception -> 0x003d }
            java.lang.String r3 = "getAddress"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x003d }
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003d }
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            r1 = r0
        L_0x003d:
            boolean r0 = a((java.lang.String) r1)
            if (r0 != 0) goto L_0x0050
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = "bluetooth_address"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r0)     // Catch:{ Throwable -> 0x004f }
            r1 = r6
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            boolean r6 = a((java.lang.String) r1)
            if (r6 == 0) goto L_0x006b
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo$Builder r6 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo.newBuilder()
            java.lang.String r7 = r7.getName()
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo$Builder r6 = r6.setName(r7)
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo$Builder r6 = r6.setMacid(r1)
            com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo r6 = r6.build()
            return r6
        L_0x006b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.b.a(android.content.Context, android.bluetooth.BluetoothAdapter):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo");
    }
}
