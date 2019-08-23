package com.meizu.cloud.pushsdk.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f27070a = "EncryptionWriter";

    /* renamed from: b  reason: collision with root package name */
    private SimpleDateFormat f27071b = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: c  reason: collision with root package name */
    private d f27072c = new d("lo");

    /* renamed from: d  reason: collision with root package name */
    private BufferedWriter f27073d;

    /* renamed from: e  reason: collision with root package name */
    private int f27074e = 7;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f27075f = ".log.txt";

    class a implements Comparator<File> {
        a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return -1;
            }
            return lastModified == 0 ? 0 : 1;
        }
    }

    public void a() throws IOException {
        if (this.f27073d != null) {
            this.f27073d.flush();
            this.f27073d.close();
            this.f27073d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.getName().endsWith(e.this.f27075f);
            }
        });
        if (listFiles != null || listFiles.length > this.f27074e) {
            Arrays.sort(listFiles, new a());
            for (int i = this.f27074e; i < listFiles.length; i++) {
                listFiles[i].delete();
            }
        }
    }

    public void a(String str) throws IOException {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            String format = this.f27071b.format(new Date());
            File file2 = new File(str, format + this.f27075f);
            if (!file2.exists() && file2.createNewFile()) {
                a(file);
            }
            this.f27073d = new BufferedWriter(new FileWriter(file2, true));
            return;
        }
        throw new IOException("create " + str + " dir failed!!!");
    }

    public void a(String str, String str2, String str3) throws IOException {
        if (this.f27073d != null) {
            StringBuffer stringBuffer = new StringBuffer(str);
            stringBuffer.append(str2);
            stringBuffer.append(" ");
            stringBuffer.append(str3);
            this.f27073d.write(this.f27072c.a(stringBuffer.toString().getBytes()));
            this.f27073d.write("\r\n");
        }
    }
}
