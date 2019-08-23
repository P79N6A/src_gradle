package com.ss.android.ad.splash.utils;

import android.text.TextUtils;
import com.ss.android.ad.splash.core.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static volatile SimpleDateFormat f27849a;

    public static void a(final String str) {
        if (e.d()) {
            e.y().execute(new Runnable() {
                public final void run() {
                    String A = e.A();
                    if (!TextUtils.isEmpty(A)) {
                        File file = new File(A);
                        try {
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            String str = A + "errorInfo.txt";
                            File file2 = new File(str);
                            if (!file2.exists()) {
                                file2.createNewFile();
                            }
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(str, true), "utf-8");
                            StringBuilder sb = new StringBuilder();
                            if (i.f27849a == null) {
                                i.f27849a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                            }
                            sb.append(i.f27849a.format(new Date()));
                            sb.append(" ");
                            sb.append(str);
                            sb.append("\r\n");
                            outputStreamWriter.write(sb.toString());
                            outputStreamWriter.close();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
