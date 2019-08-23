package com.bytedance.apm.k;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.d;
import com.bytedance.apm.f.g;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f19044a = null;

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f19045b = -1;

    public static boolean a() {
        if (Build.VERSION.SDK_INT <= 22 || ContextCompat.checkSelfPermission(c.a(), "android.permission.READ_PHONE_STATE") != 0) {
            return false;
        }
        return true;
    }

    private static int a(@NonNull Context context) {
        if (f19045b == -1) {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), SearchJediMixFeedAdapter.f42517f);
                if (packageInfo != null) {
                    f19045b = packageInfo.applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return f19045b;
    }

    public static List<String> a(File file, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            if (str.trim().length() == 0) {
                bufferedReader = new BufferedReader(new FileReader(file));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            }
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (i >= 0) {
                            arrayList.add(readLine);
                        }
                        i++;
                    } else {
                        g.a(bufferedReader);
                        return arrayList;
                    }
                } catch (IOException e2) {
                    e = e2;
                    d.a().a(e, "TrafficUtils: readFile2List");
                    g.a(bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    g.a(bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            d.a().a(e, "TrafficUtils: readFile2List");
            g.a(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            g.a(bufferedReader2);
            throw th;
        }
    }

    @NonNull
    public static g a(int i, List<String> list) {
        long j;
        long j2;
        long j3;
        long j4;
        Iterator<String> it2;
        g gVar;
        long j5;
        long j6;
        Iterator<String> it3;
        g gVar2;
        long j7;
        long j8;
        long j9;
        g gVar3 = new g();
        Iterator<String> it4 = list.iterator();
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        while (it4.hasNext()) {
            String[] split = it4.next().split(" ");
            try {
                if (TextUtils.equals(split[3], "uid_tag_int")) {
                    gVar = gVar3;
                    it2 = it4;
                    j5 = j15;
                    j = j16;
                    j3 = j17;
                    j2 = j18;
                    j4 = j19;
                    j15 = j5;
                    gVar3 = gVar;
                    it4 = it2;
                    j19 = j4;
                    j17 = j3;
                    j18 = j2;
                    j16 = j;
                } else {
                    try {
                        if (i == Integer.parseInt(split[3])) {
                            long parseLong = Long.parseLong(split[5]);
                            long parseLong2 = Long.parseLong(split[7]);
                            if (Long.valueOf(split[4]).longValue() == 0) {
                                gVar2 = gVar3;
                                it3 = it4;
                                j19 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j11 += parseLong2;
                                        j10 += parseLong;
                                    } else if (split[1].startsWith("wlan")) {
                                        j13 += parseLong2;
                                        j12 += parseLong;
                                    } else {
                                        j9 = j15;
                                    }
                                    gVar3 = gVar2;
                                    it4 = it3;
                                } catch (Exception e2) {
                                    e = e2;
                                    j7 = j15;
                                    j8 = j16;
                                    j6 = j17;
                                    j = j8;
                                    d.a().a(e, "TrafficUtils: getFormatTrafficEntity");
                                    j15 = j7;
                                    gVar3 = gVar2;
                                    it4 = it3;
                                    j17 = j6;
                                    j16 = j;
                                }
                            } else {
                                gVar2 = gVar3;
                                it3 = it4;
                                long j20 = j19;
                                j18 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j15 += parseLong2;
                                        j14 += parseLong;
                                        gVar3 = gVar2;
                                        it4 = it3;
                                        j19 = j20;
                                    } else {
                                        long j21 = j15;
                                        try {
                                            if (split[1].startsWith("wlan")) {
                                                j17 += parseLong2;
                                                j16 += parseLong;
                                                j9 = j21;
                                                j19 = j20;
                                            } else {
                                                long j22 = j21;
                                                long j23 = j16;
                                                long j24 = j17;
                                                j19 = j20;
                                                j9 = j22;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            long j25 = j21;
                                            j8 = j16;
                                            j6 = j17;
                                            j19 = j20;
                                            j7 = j25;
                                            j = j8;
                                            d.a().a(e, "TrafficUtils: getFormatTrafficEntity");
                                            j15 = j7;
                                            gVar3 = gVar2;
                                            it4 = it3;
                                            j17 = j6;
                                            j16 = j;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    j8 = j16;
                                    j7 = j15;
                                    j6 = j17;
                                    j19 = j20;
                                    j = j8;
                                    d.a().a(e, "TrafficUtils: getFormatTrafficEntity");
                                    j15 = j7;
                                    gVar3 = gVar2;
                                    it4 = it3;
                                    j17 = j6;
                                    j16 = j;
                                }
                            }
                        } else {
                            gVar2 = gVar3;
                            it3 = it4;
                            j9 = j15;
                            long j26 = j16;
                            long j27 = j17;
                            long j28 = j18;
                            long j29 = j19;
                        }
                        j15 = j9;
                        gVar3 = gVar2;
                        it4 = it3;
                    } catch (Exception e5) {
                        e = e5;
                        gVar2 = gVar3;
                        it3 = it4;
                        j7 = j15;
                        j8 = j16;
                        j6 = j17;
                        long j30 = j18;
                        long j31 = j19;
                        j = j8;
                        d.a().a(e, "TrafficUtils: getFormatTrafficEntity");
                        j15 = j7;
                        gVar3 = gVar2;
                        it4 = it3;
                        j17 = j6;
                        j16 = j;
                    }
                }
            } catch (Exception e6) {
                gVar = gVar3;
                it2 = it4;
                j5 = j15;
                j = j16;
                j3 = j17;
                j2 = j18;
                j4 = j19;
                d.a().a(e6, "TrafficUtils: getFormatTrafficEntity");
            }
        }
        gVar3.h = j10;
        gVar3.g = j11;
        gVar3.f19003f = j12;
        gVar3.f19002e = j13;
        gVar3.f19001d = j14;
        gVar3.f19000c = j15;
        gVar3.f18999b = j16;
        gVar3.f18998a = j17;
        gVar3.i = j18;
        gVar3.j = j19;
        return gVar3;
    }

    public static long a(@NonNull Context context, long j, long j2, int i) {
        long j3 = 0;
        if (!a()) {
            return 0;
        }
        if (TextUtils.isEmpty(f19044a)) {
            f19044a = ((TelephonyManager) context.getApplicationContext().getSystemService("phone")).getSubscriberId();
        }
        String str = f19044a;
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getApplicationContext().getSystemService("netstats");
        if (networkStatsManager == null) {
            return 0;
        }
        NetworkStats networkStats = null;
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            networkStats = networkStatsManager.querySummary(i, str, j, j2);
        } catch (Exception e2) {
            d.a().a(e2, "TrafficUtils: getNetStats");
        }
        long j4 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            if (a(context) == bucket.getUid()) {
                j3 += bucket.getRxBytes();
                j4 += bucket.getTxBytes();
            }
        }
        return j3 + j4;
    }
}
