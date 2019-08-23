package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static int mNextId = 1;
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (sActiveWakeLocks) {
            PowerManager.WakeLock wakeLock = sActiveWakeLocks.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            sActiveWakeLocks.remove(intExtra);
            return true;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (sActiveWakeLocks) {
            int i = mNextId;
            int i2 = mNextId + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sActiveWakeLocks.put(i, newWakeLock);
            return startService;
        }
    }
}
