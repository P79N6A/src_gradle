package com.taobao.accs.utl;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.client.GlobalClientInfo;

public class e {
    public static void a() {
        try {
            int c2 = c();
            if (c2 > 0) {
                SharedPreferences.Editor edit = c.a(GlobalClientInfo.getContext(), "ACCS_LOAD_SO", 0).edit();
                edit.clear();
                edit.apply();
                ALog.i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(c2));
            }
        } catch (Throwable th) {
            ALog.e("LoadSoFailUtil", "loadSoSuccess", th, new Object[0]);
        }
    }

    public static int c() {
        int i;
        try {
            i = c.a(GlobalClientInfo.getContext(), "ACCS_LOAD_SO", 0).getInt("load_so_times", 0);
            try {
                ALog.i("LoadSoFailUtil", "getSoFailTimes", "times", Integer.valueOf(i));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            ALog.e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
            return i;
        }
        return i;
    }

    public static void b() {
        try {
            SharedPreferences a2 = c.a(GlobalClientInfo.getContext(), "ACCS_LOAD_SO", 0);
            int i = a2.getInt("load_so_times", 0) + 1;
            if (i > 0) {
                SharedPreferences.Editor edit = a2.edit();
                edit.putInt("load_so_times", i);
                edit.apply();
            }
            ALog.e("LoadSoFailUtil", "loadSoFail", "times", Integer.valueOf(i));
        } catch (Throwable th) {
            ALog.e("LoadSoFailUtil", "loadSoFail", th, new Object[0]);
        }
    }
}
