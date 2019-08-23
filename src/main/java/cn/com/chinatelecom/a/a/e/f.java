package cn.com.chinatelecom.a.a.e;

import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Timestamp;

public final class f {
    public static String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void a(String str, String str2) {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                File file = new File(Environment.getExternalStorageDirectory(), "ctg_sdk_log.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.append(new Timestamp(System.currentTimeMillis()).toString()).append("----").append(str).append("----").append(str2).append("\n");
                bufferedWriter.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a(String str, String str2, Throwable th) {
        if (!b.f1706a) {
            return 0;
        }
        if (b.f1706a) {
            a(str, str2);
        }
        return Log.w(str, str2, th);
    }
}
