package com.ss.ttm.player;

import android.os.Build;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public class MediaCodecUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean sHasLoadCodecLib;

    public static native long createAJMediaCodecer(int i, int i2);

    public static final boolean supportAJMediaCodec() {
        if (Build.VERSION.SDK_INT > 16) {
            return true;
        }
        return false;
    }

    public static final boolean supportANMediaCodec() {
        if (Build.VERSION.SDK_INT > 21) {
            return true;
        }
        return false;
    }

    public static final boolean loadMediaCodecLibrary() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90660, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90660, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (sHasLoadCodecLib) {
            return true;
        }
        if (!supportANMediaCodec()) {
            return false;
        }
        try {
            if (TTPlayerConfiger.getValue(3, true)) {
                File file = new File(Environment.getExternalStorageDirectory() + "/ttplayer/libttmplayer_mc.so");
                if (file.exists()) {
                    System.load(file.getAbsolutePath());
                    return true;
                }
            }
            System.loadLibrary("ttmplayer_mc");
            sHasLoadCodecLib = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final long createMediaCodecer(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90661, new Class[]{Integer.TYPE, Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90661, new Class[]{Integer.TYPE, Integer.TYPE}, Long.TYPE)).longValue();
        }
        if (supportAJMediaCodec()) {
            try {
                return createAJMediaCodecer(i, i2);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
