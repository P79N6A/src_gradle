package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class eu extends ex {
    public eu(Context context, int i) {
        super(context, i);
    }

    public int a() {
        return 4;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m207a() {
        return im.AppInstallList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m208a() {
        StringBuilder sb = new StringBuilder();
        try {
            PackageManager packageManager = this.f321a.getPackageManager();
            int i = 0;
            for (PackageInfo next : packageManager.getInstalledPackages(SearchJediMixFeedAdapter.f42517f)) {
                if ((next.applicationInfo.flags & 1) == 0) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    String charSequence = next.applicationInfo.loadLabel(packageManager).toString();
                    String b2 = g.b(this.f321a, next.packageName);
                    sb.append(charSequence);
                    sb.append(",");
                    sb.append(next.packageName);
                    sb.append(",");
                    sb.append(next.versionName);
                    sb.append(",");
                    sb.append(next.versionCode);
                    sb.append(",");
                    sb.append(b2);
                    i++;
                    if (i >= 200) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
