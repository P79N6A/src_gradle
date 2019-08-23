package com.ss.android.statistic.b;

import android.support.annotation.NonNull;
import com.bytedance.common.utility.Logger;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private a f31114a;

    public c(a aVar) {
        this.f31114a = aVar;
    }

    public final boolean a(@NonNull com.ss.android.statistic.c cVar) {
        String str;
        boolean a2 = this.f31114a.a(cVar);
        if (a2) {
            str = "enqueue log is " + cVar.toString();
        } else {
            str = "not enqueue log is " + cVar.toString();
        }
        Logger.d("StatisticLogger", str);
        return a2;
    }

    public final boolean a(@NonNull com.ss.android.statistic.c cVar, @NonNull String str) {
        String str2;
        boolean a2 = this.f31114a.a(cVar, str);
        if (a2) {
            str2 = "send to " + str + " log is " + cVar.toString();
        } else {
            str2 = "not send to " + str + " log is " + cVar.toString();
        }
        Logger.d("StatisticLogger", str2);
        return a2;
    }
}
