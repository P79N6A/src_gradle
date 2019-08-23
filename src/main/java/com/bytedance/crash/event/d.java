package com.bytedance.crash.event;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.crash.db.a;
import com.bytedance.crash.i.j;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class d implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final File f19435a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f19436b = -1;

    public final int a() {
        int i;
        if (this.f19436b == -1) {
            String[] list = this.f19435a.list(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return str.endsWith(".event");
                }
            });
            if (list == null) {
                i = 0;
            } else {
                i = list.length;
            }
            a(i);
        }
        return this.f19436b;
    }

    public final ArrayList<a> b() {
        int i;
        a aVar;
        File[] listFiles = this.f19435a.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.endsWith(".event");
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            i = 0;
        } else {
            i = listFiles.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String absolutePath = listFiles[i2].getAbsolutePath();
            if (a.a().a(absolutePath)) {
                com.bytedance.crash.i.d.a(absolutePath);
                aVar = null;
            } else {
                aVar = b.a(absolutePath);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private void a(int i) {
        synchronized (d.class) {
            this.f19436b = i;
        }
    }

    d(File file) {
        if (file != null) {
            this.f19435a = file;
        } else {
            this.f19435a = new File(Environment.getExternalStorageDirectory(), "monitorLog");
        }
    }

    /* access modifiers changed from: private */
    public boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        aVar.uuid = UUID.randomUUID().toString();
        String c2 = c(aVar);
        if (!TextUtils.isEmpty(c2)) {
            try {
                if (!this.f19435a.exists()) {
                    this.f19435a.mkdirs();
                }
                com.bytedance.crash.i.d.a(new File(c2), aVar.a().toString(), false);
                a(-1);
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private boolean b(a aVar) {
        String c2 = c(aVar);
        if (TextUtils.isEmpty(c2)) {
            return false;
        }
        boolean a2 = com.bytedance.crash.i.d.a(c2);
        if (!a2) {
            a.a().a(com.bytedance.crash.db.a.a.a(c2));
        }
        a(-1);
        return a2;
    }

    private String c(a aVar) {
        if (aVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(aVar.uuid)) {
            aVar.uuid = UUID.randomUUID().toString();
        }
        return new File(this.f19435a, aVar.crashType + "_" + aVar.event + "_" + aVar.uuid + ".event").getAbsolutePath();
    }

    public final boolean a(ArrayList<a> arrayList) {
        if (j.a(arrayList)) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!b(arrayList.get(i))) {
                z = false;
            }
        }
        return z;
    }
}
