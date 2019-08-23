package com.ss.ttm.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AVErrorInfo {
    private static StringBuilder PHONE_INFO;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void setupPhoneInfo(Context context, StringBuilder sb) {
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{context, sb2}, null, changeQuickRedirect, true, 91140, new Class[]{Context.class, StringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, sb2}, null, changeQuickRedirect, true, 91140, new Class[]{Context.class, StringBuilder.class}, Void.TYPE);
            return;
        }
        String[] version = VersionInfo.getVersion();
        if (version != null) {
            sb2.append(String.format("version:%s,%s,%s\r\n", new Object[]{version[0], version[1], version[2]}));
            sb2.append("\r\n");
        }
        long[] romMemroy = MemoryInfo.getRomMemroy();
        if (romMemroy != null) {
            sb2.append(String.format("rom memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(romMemroy[0]), Long.valueOf(romMemroy[1])}));
            sb2.append("\r\n");
        }
        sb2.append(String.format("ram memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(MemoryInfo.getTolalMemory()), Long.valueOf(MemoryInfo.getAvailMemory(context))}));
        sb2.append("\r\n");
        long[] sDCardSize = HardWareInfo.getSDCardSize();
        if (sDCardSize != null) {
            sb2.append(String.format("sdcard totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(sDCardSize[0]), Long.valueOf(sDCardSize[1])}));
            sb2.append("\r\n");
        }
    }

    public static void setupErrorInfo(Context context, StringBuilder sb, String str, String str2, String str3) {
        Context context2 = context;
        StringBuilder sb2 = sb;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, sb2, str, str4, str3}, null, changeQuickRedirect, true, 91141, new Class[]{Context.class, StringBuilder.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, sb2, str, str4, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 91141, new Class[]{Context.class, StringBuilder.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PHONE_INFO == null) {
            PHONE_INFO = new StringBuilder();
            setupPhoneInfo(context2, PHONE_INFO);
        }
        sb2.append(PHONE_INFO);
        sb2.append("\r\n");
        sb.append(str);
        sb2.append(":");
        sb2.append(str4);
    }
}
