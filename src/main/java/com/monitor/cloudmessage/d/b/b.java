package com.monitor.cloudmessage.d.b;

import android.support.annotation.NonNull;
import java.util.HashMap;

public class b {
    public long i;
    public boolean j;
    @NonNull
    public String k;
    public int l = 2;
    public String m = "no error";
    public long n;
    public HashMap<String, String> o;

    public b(long j2, boolean z, String str, HashMap<String, String> hashMap) {
        this.i = j2;
        this.j = z;
        this.k = str;
        this.n = System.currentTimeMillis();
        this.o = hashMap;
    }
}
