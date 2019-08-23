package com.ss.android.downloadlib.addownload.a;

import android.support.annotation.UiThread;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28723a = "a";

    /* renamed from: f  reason: collision with root package name */
    private static a f28724f;

    /* renamed from: b  reason: collision with root package name */
    public Map<Long, com.ss.android.downloadlib.addownload.d.a> f28725b = b.a("sp_ad_install_back_dialog", "key_uninstalled_list");

    /* renamed from: c  reason: collision with root package name */
    public boolean f28726c = false;

    /* renamed from: d  reason: collision with root package name */
    public String f28727d;

    /* renamed from: e  reason: collision with root package name */
    public Map<Long, com.ss.android.downloadlib.addownload.d.a> f28728e = b.a("sp_name_installed_app", "key_installed_list");
    private Set<Long> g = new HashSet();
    private b h = new b();

    /* renamed from: com.ss.android.downloadlib.addownload.a.a$a  reason: collision with other inner class name */
    public interface C0341a {
        void a();
    }

    @UiThread
    public static a a() {
        if (f28724f == null) {
            f28724f = new a();
        }
        return f28724f;
    }

    private a() {
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f28727d = "";
            return;
        }
        if (TextUtils.equals(this.f28727d, str)) {
            this.f28727d = "";
        }
    }

    public final void a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        if (this.g.contains(Long.valueOf(j2)) || this.f28725b.containsKey(Long.valueOf(j2))) {
            com.ss.android.downloadlib.addownload.d.a aVar = this.f28725b.get(Long.valueOf(j2));
            if (aVar != null) {
                if (TextUtils.equals(aVar.g, str4)) {
                    return;
                }
                Map<Long, com.ss.android.downloadlib.addownload.d.a> map = this.f28725b;
                Long valueOf = Long.valueOf(j2);
                com.ss.android.downloadlib.addownload.d.a aVar2 = new com.ss.android.downloadlib.addownload.d.a(j, j2, j3, str, str2, str3, str4);
                map.put(valueOf, aVar2);
                this.g.add(Long.valueOf(j2));
                b.a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f28725b);
                new StringBuilder("added info, app name is ").append(str2);
            }
        }
        String str5 = str4;
        Map<Long, com.ss.android.downloadlib.addownload.d.a> map2 = this.f28725b;
        Long valueOf2 = Long.valueOf(j2);
        com.ss.android.downloadlib.addownload.d.a aVar22 = new com.ss.android.downloadlib.addownload.d.a(j, j2, j3, str, str2, str3, str4);
        map2.put(valueOf2, aVar22);
        this.g.add(Long.valueOf(j2));
        b.a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f28725b);
        new StringBuilder("added info, app name is ").append(str2);
    }
}
