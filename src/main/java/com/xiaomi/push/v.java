package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f82609a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a  reason: collision with other field name */
    private Context f1023a;

    /* renamed from: a  reason: collision with other field name */
    private RandomAccessFile f1024a;

    /* renamed from: a  reason: collision with other field name */
    private String f1025a;

    /* renamed from: a  reason: collision with other field name */
    private FileLock f1026a;

    private v(Context context) {
        this.f1023a = context;
    }

    /* JADX INFO: finally extract failed */
    public static v a(Context context, File file) {
        b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (f82609a.add(str)) {
            v vVar = new v(context);
            vVar.f1025a = str;
            try {
                vVar.f1024a = new RandomAccessFile(file2, "rw");
                vVar.f1026a = vVar.f1024a.getChannel().lock();
                b.c("Locked: " + str + " :" + vVar.f1026a);
                if (vVar.f1026a == null) {
                    if (vVar.f1024a != null) {
                        z.a((Closeable) vVar.f1024a);
                    }
                    f82609a.remove(vVar.f1025a);
                }
                return vVar;
            } catch (Throwable th) {
                if (vVar.f1026a == null) {
                    if (vVar.f1024a != null) {
                        z.a((Closeable) vVar.f1024a);
                    }
                    f82609a.remove(vVar.f1025a);
                }
                throw th;
            }
        } else {
            throw new IOException("abtain lock failure");
        }
    }

    public final void a() {
        b.c("unLock: " + this.f1026a);
        if (this.f1026a != null && this.f1026a.isValid()) {
            try {
                this.f1026a.release();
            } catch (IOException unused) {
            }
            this.f1026a = null;
        }
        if (this.f1024a != null) {
            z.a((Closeable) this.f1024a);
        }
        f82609a.remove(this.f1025a);
    }
}
