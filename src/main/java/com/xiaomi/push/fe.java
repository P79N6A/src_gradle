package com.xiaomi.push;

import android.net.wifi.ScanResult;
import java.util.Comparator;

public class fe implements Comparator<ScanResult> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fd f82008a;

    fe(fd fdVar) {
        this.f82008a = fdVar;
    }

    /* renamed from: a */
    public int compare(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult2.level - scanResult.level;
    }
}
