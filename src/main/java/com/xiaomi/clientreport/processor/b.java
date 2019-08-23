package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.data.a;
import com.xiaomi.push.bf;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public class b implements IPerfProcessor {

    /* renamed from: a  reason: collision with root package name */
    protected Context f81727a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, HashMap<String, a>> f71a;

    public b(Context context) {
        this.f81727a = context;
    }

    public static String a(a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    private String b(a aVar) {
        String str = "";
        int i = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i > 0 && !TextUtils.isEmpty(str2)) {
            str = String.valueOf(i) + "#" + str2;
        }
        File externalFilesDir = this.f81727a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            com.xiaomi.channel.commonutils.logger.b.d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    private String c(a aVar) {
        if (TextUtils.isEmpty(b(aVar))) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = r5 + i;
            if (bf.a(this.f81727a, str)) {
                return str;
            }
        }
        return null;
    }

    public void a() {
        bf.a(this.f81727a, "perf", "perfUploading");
        File[] a2 = bf.a(this.f81727a, "perfUploading");
        if (a2 != null && a2.length > 0) {
            for (File file : a2) {
                if (file != null) {
                    List a3 = e.a(this.f81727a, file.getAbsolutePath());
                    file.delete();
                    a(a3);
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m26a(a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f71a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a2 = a((a) perfClientReport);
            String a3 = e.a(perfClientReport);
            HashMap hashMap = this.f71a.get(a2);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a3);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a3, perfClientReport);
            this.f71a.put(a2, hashMap);
        }
    }

    public void a(List<String> list) {
        bf.a(this.f81727a, list);
    }

    public void a(a[] aVarArr) {
        String c2 = c(aVarArr[0]);
        if (!TextUtils.isEmpty(c2)) {
            e.a(c2, aVarArr);
        }
    }

    public void b() {
        if (this.f71a != null) {
            if (this.f71a.size() > 0) {
                for (String str : this.f71a.keySet()) {
                    HashMap hashMap = this.f71a.get(str);
                    if (hashMap != null && hashMap.size() > 0) {
                        a[] aVarArr = new a[hashMap.size()];
                        hashMap.values().toArray(aVarArr);
                        a(aVarArr);
                    }
                }
            }
            this.f71a.clear();
        }
    }

    public void setPerfMap(HashMap<String, HashMap<String, a>> hashMap) {
        this.f71a = hashMap;
    }
}
