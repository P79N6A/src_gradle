package com.meizu.cloud.pushsdk.handler.a.a;

import android.os.Environment;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private File f27195a;

    public b(String str) {
        this.f27195a = new File(str);
    }

    private void a(File file, ZipOutputStream zipOutputStream, String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String sb2 = sb.toString();
        if (file.isDirectory()) {
            for (File a2 : file.listFiles()) {
                a(a2, zipOutputStream, sb2);
            }
            return;
        }
        DebugLogger.i("ZipTask", "current file " + sb2 + "/" + file.getName() + " size is " + (file.length() / 1024) + "KB");
        if (file.length() < 10485760) {
            byte[] bArr = new byte[1048576];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1048576);
            zipOutputStream.putNextEntry(new ZipEntry(sb2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            bufferedInputStream.close();
            zipOutputStream.flush();
            zipOutputStream.closeEntry();
        }
    }

    private void a(Collection<File> collection, File file) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        for (File a2 : collection) {
            a(a2, zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    public boolean a(List<String> list) throws Exception {
        if (!this.f27195a.exists()) {
            this.f27195a.getParentFile().mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            File file = new File(absolutePath + it2.next());
            if (file.exists()) {
                arrayList.add(file);
            }
        }
        a(arrayList, this.f27195a);
        return true;
    }
}
