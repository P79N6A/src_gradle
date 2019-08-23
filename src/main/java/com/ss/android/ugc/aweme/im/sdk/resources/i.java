package com.ss.android.ugc.aweme.im.sdk.resources;

import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import com.taobao.android.dexposed.ClassUtils;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52291a;

    private static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f52291a, true, 53105, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f52291a, true, 53105, new Class[0], String.class);
        }
        return FileUtils.getFilesDirPath(GlobalContext.getContext()) + "/im_resources/";
    }

    public static String b(e eVar) {
        if (!PatchProxy.isSupport(new Object[]{eVar}, null, f52291a, true, 53111, new Class[]{e.class}, String.class)) {
            return b(eVar.getType(), eVar.getId(), eVar.getVersion());
        }
        return (String) PatchProxy.accessDispatch(new Object[]{eVar}, null, f52291a, true, 53111, new Class[]{e.class}, String.class);
    }

    public static String a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, null, f52291a, true, 53106, new Class[]{e.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar}, null, f52291a, true, 53106, new Class[]{e.class}, String.class);
        }
        return a(eVar.getType()) + a(eVar.getId(), eVar.getVersion()) + ".zip";
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52291a, true, 53107, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f52291a, true, 53107, new Class[]{String.class}, String.class);
        }
        return a() + str2 + "/";
    }

    private static String a(long j, String str) {
        String str2;
        long j2 = j;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3}, null, f52291a, true, 53109, new Class[]{Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), str3}, null, f52291a, true, 53109, new Class[]{Long.TYPE, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append("_");
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str, long j, String str2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), str2}, null, f52291a, true, 53112, new Class[]{String.class, Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), str2}, null, f52291a, true, 53112, new Class[]{String.class, Long.TYPE, String.class}, String.class);
        }
        return a(str, j, str2) + "/" + j2;
    }

    public static String a(String str, long j, String str2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), str2}, null, f52291a, true, 53110, new Class[]{String.class, Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), str2}, null, f52291a, true, 53110, new Class[]{String.class, Long.TYPE, String.class}, String.class);
        }
        return a(str) + a(j, str2);
    }
}
