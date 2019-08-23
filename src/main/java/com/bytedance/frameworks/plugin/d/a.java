package com.bytedance.frameworks.plugin.d;

import android.content.pm.PackageInfo;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.e;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f2214a;

    /* renamed from: b  reason: collision with root package name */
    public int f2215b;

    /* renamed from: c  reason: collision with root package name */
    public File f2216c;

    /* renamed from: d  reason: collision with root package name */
    public int f2217d;

    a() {
    }

    public final String toString() {
        return "PluginApk{mPackageName='" + this.f2214a + '\'' + ", mVersionCode=" + this.f2215b + ", mApkPath=" + this.f2216c + ", installPriority=" + this.f2217d + '}';
    }

    public static a a(File file) {
        if (file == null) {
            return null;
        }
        PackageInfo packageArchiveInfo = e.a().getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        a aVar = new a();
        aVar.f2214a = packageArchiveInfo.packageName;
        aVar.f2215b = packageArchiveInfo.versionCode;
        aVar.f2216c = file;
        b a2 = b.a().a(aVar.f2214a);
        if (a2 == null) {
            return null;
        }
        int i = 1;
        if (a2.f2150f == 1) {
            i = 3;
        }
        aVar.f2217d = i;
        return aVar;
    }
}
