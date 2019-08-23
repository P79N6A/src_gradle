package com.ss.ugc.live.b.a.c;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.ss.ugc.live.b.a.c;
import java.io.File;

public class a extends RuntimeException {
    private c mRequest;

    public long getId() {
        return this.mRequest.f78634a;
    }

    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return runtimeException;
        }
        return runtimeException + "\n" + cause.toString();
    }

    public String getMessage() {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mRequest.toString());
        sb.append("\navailable disk space:");
        String path = Environment.getDataDirectory().getPath();
        if (Build.VERSION.SDK_INT >= 18) {
            StatFs statFs = new StatFs(path);
            j = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024;
        } else {
            j = new File(path).getFreeSpace() / 1024;
        }
        sb.append(j);
        sb.append("KB\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public a(c cVar) {
        this.mRequest = cVar;
    }

    public a(String str, c cVar) {
        super(str);
        this.mRequest = cVar;
    }

    public a(String str, Throwable th, c cVar) {
        super(str, th);
        this.mRequest = cVar;
    }
}
