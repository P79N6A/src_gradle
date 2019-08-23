package com.ss.ttm.player;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.utils.AVTime;
import com.ss.ttm.utils.PhoneInfo;
import com.ss.ttm.utils.app.ServiceUtil;

public class TTPlayerFactory implements Handler.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static TTPlayerFactory mInstance;
    private Context mAppContext;
    private TTPlayerConnection mConnection;
    private Handler mHandler;
    private Object mLocker = new Object();
    public LongSparseArray<TTPlayerIPCRef> mPlayers = new LongSparseArray<>();

    public static Context getContext() {
        return mInstance.mAppContext;
    }

    TTPlayerFactory() {
    }

    private void tryStopService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91006, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.mLocker) {
            if (this.mPlayers.size() == 0) {
                stopService();
            }
        }
    }

    private boolean isConnectionTimeout() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91009, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91009, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int i = 0;
        while (!this.mConnection.isConnectioned()) {
            if (i > 2000) {
                return true;
            }
            try {
                Thread.sleep(10);
                i += 10;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void stopService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91005, new Class[0], Void.TYPE);
            return;
        }
        TTPlayerConfiger.setValue(12, "stop service.time:" + AVTime.getFormatNow());
        try {
            this.mConnection.disConnection();
            this.mAppContext.unbindService(this.mConnection);
        } catch (Throwable unused) {
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mAppContext = null;
        mInstance = null;
        this.mHandler = null;
        this.mConnection = null;
    }

    private boolean startService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91008, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91008, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mConnection = new TTPlayerConnection(this);
        StringBuilder sb = new StringBuilder();
        sb.append("will start service to start.time:" + AVTime.getFormatNow());
        sb.append("\r\n");
        Intent intent = new Intent(this.mAppContext, TTPlayerService.class);
        intent.putExtra("real_package_name", "com.ss.ttm");
        if (!ServiceUtil.bindService((ContextWrapper) this.mAppContext, intent, this.mConnection, 1, null)) {
            sb.append("bindService fail.time:" + AVTime.getFormatNow());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return false;
        } else if (isConnectionTimeout()) {
            TTPlayerConfiger.setValue(10, TTPlayerConfiger.getValue(10, 0) + 1);
            sb.append("start service timeout.time:" + AVTime.getFormatNow());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return false;
        } else {
            if (this.mConnection.isConnectioned()) {
                this.mConnection.doConnectioned();
            }
            TTPlayerConfiger.setValue(10, 0);
            sb.append("start service is ok.time:" + System.currentTimeMillis());
            sb.append("\r\n");
            TTPlayerConfiger.setValue(16, sb.toString());
            return true;
        }
    }

    public void onServiceDisconnected() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91010, new Class[0], Void.TYPE);
            return;
        }
        int size = this.mPlayers.size();
        if (TTPlayerConfiger.getValue(18, 1) > 1) {
            str = "not find breakpad crash file";
            try {
                String existsCrashFilePath = TTCrashUtil.existsCrashFilePath(this.mAppContext);
                if (existsCrashFilePath != null) {
                    str = "find breakpad crash file";
                }
                if (size <= 0 && existsCrashFilePath != null) {
                    TTCrashUtil.deleteCrashFile(this.mAppContext, existsCrashFilePath);
                }
            } catch (Throwable unused) {
            }
        } else {
            str = "port version is old";
        }
        TTPlayerConfiger.setValue(21, PhoneInfo.isRunningForeground(this.mAppContext) ? 1 : 0);
        TTPlayerConfiger.setValue(22, PhoneInfo.isScreenOn(this.mAppContext) ? 1 : 0);
        TTPlayerConfiger.setValue(23, PhoneInfo.batteryPct(this.mAppContext));
        for (int i = 0; i < size; i++) {
            TTPlayerIPCRef tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.valueAt(i);
            if (tTPlayerIPCRef != null) {
                tTPlayerIPCRef.onCrashedInfo("<" + TTPlayerFactory.class.getSimpleName() + ",onServiceDisconnected," + AVTime.getFormatNow() + ">player is will null.activity player:" + size + "," + str + "\r\n");
                sendCrashedError(tTPlayerIPCRef, 20000);
            }
        }
        this.mPlayers.clear();
        this.mConnection = null;
    }

    public static synchronized TTPlayerIPCRef create(Context context) {
        TTPlayerIPCRef createPlayer;
        Context context2 = context;
        synchronized (TTPlayerFactory.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91002, new Class[]{Context.class}, TTPlayerIPCRef.class)) {
                TTPlayerIPCRef tTPlayerIPCRef = (TTPlayerIPCRef) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91002, new Class[]{Context.class}, TTPlayerIPCRef.class);
                return tTPlayerIPCRef;
            }
            if (mInstance == null) {
                TTPlayerFactory tTPlayerFactory = new TTPlayerFactory();
                mInstance = tTPlayerFactory;
                tTPlayerFactory.mAppContext = context.getApplicationContext();
                mInstance.mHandler = new Handler(mInstance);
            }
            try {
                synchronized (mInstance.mLocker) {
                    createPlayer = mInstance.createPlayer(context2);
                }
                return createPlayer;
            } catch (Exception e2) {
                TTPlayerConfiger.setValue(16, e2.getMessage());
                return null;
            }
        }
    }

    private TTPlayerIPCRef getPlayer(long j) {
        TTPlayerIPCRef tTPlayerIPCRef;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91017, new Class[]{Long.TYPE}, TTPlayerIPCRef.class)) {
            return (TTPlayerIPCRef) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91017, new Class[]{Long.TYPE}, TTPlayerIPCRef.class);
        } else if (this.mPlayers.size() == 0) {
            return null;
        } else {
            if (j > 0) {
                try {
                    tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.get(j);
                } catch (Throwable unused) {
                    return null;
                }
            } else {
                tTPlayerIPCRef = (TTPlayerIPCRef) this.mPlayers.valueAt(0);
            }
            return tTPlayerIPCRef;
        }
    }

    public boolean handleMessage(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 91011, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 91011, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        if (10000 == message2.what) {
            tryStopService();
        }
        return true;
    }

    public TTPlayerIPCRef createPlayer(Context context) throws Exception {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 91003, new Class[]{Context.class}, TTPlayerIPCRef.class)) {
            return (TTPlayerIPCRef) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 91003, new Class[]{Context.class}, TTPlayerIPCRef.class);
        } else if (this.mConnection == null && !startService()) {
            TTPlayerConfiger.setValue(16, TTPlayerConfiger.getValue(16, "not find") + "\r\nstart server is error.");
            return null;
        } else if (this.mConnection == null || !this.mConnection.isConnectioned()) {
            TTPlayerConfiger.setValue(16, "connection is null or not connectioned.");
            return null;
        } else {
            TTPlayerIPCRef tTPlayerIPCRef = new TTPlayerIPCRef(this.mConnection, context);
            if (tTPlayerIPCRef.getId() == 0) {
                TTPlayerConfiger.setValue(16, "create player handle is zore");
                return null;
            }
            this.mPlayers.size();
            this.mPlayers.put(tTPlayerIPCRef.getId(), tTPlayerIPCRef);
            this.mHandler.removeMessages(10000);
            return tTPlayerIPCRef;
        }
    }

    public static synchronized void release(TTPlayerIPCRef tTPlayerIPCRef, long j) {
        TTPlayerIPCRef tTPlayerIPCRef2 = tTPlayerIPCRef;
        long j2 = j;
        synchronized (TTPlayerFactory.class) {
            if (PatchProxy.isSupport(new Object[]{tTPlayerIPCRef2, new Long(j2)}, null, changeQuickRedirect, true, 91007, new Class[]{TTPlayerIPCRef.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tTPlayerIPCRef2, new Long(j2)}, null, changeQuickRedirect, true, 91007, new Class[]{TTPlayerIPCRef.class, Long.TYPE}, Void.TYPE);
            } else if (mInstance != null) {
                mInstance.releasePlayer(tTPlayerIPCRef2, j2);
            }
        }
    }

    private void releasePlayer(TTPlayerIPCRef tTPlayerIPCRef, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{tTPlayerIPCRef, new Long(j2)}, this, changeQuickRedirect, false, 91004, new Class[]{TTPlayerIPCRef.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTPlayerIPCRef, new Long(j2)}, this, changeQuickRedirect, false, 91004, new Class[]{TTPlayerIPCRef.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayers.remove(j2);
        if (this.mPlayers.size() <= 0) {
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 10000;
            this.mHandler.removeMessages(10000);
            this.mHandler.sendMessageDelayed(obtainMessage, 600000);
        }
    }

    private int sendCrashedError(TTPlayerIPCRef tTPlayerIPCRef, int i) {
        TTPlayerIPCRef tTPlayerIPCRef2 = tTPlayerIPCRef;
        if (PatchProxy.isSupport(new Object[]{tTPlayerIPCRef2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91014, new Class[]{TTPlayerIPCRef.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{tTPlayerIPCRef2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91014, new Class[]{TTPlayerIPCRef.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        tTPlayerIPCRef2.handleNotify(0, i, 0, null);
        return 0;
    }

    public void sendCrashedInfo(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 91013, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 91013, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.onCrashedInfo(str2);
        }
    }

    public int sendCrashedError(long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91015, new Class[]{Long.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91015, new Class[]{Long.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayerIPCRef player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        sendCrashedError(player, i);
        return -1;
    }

    public void onPlayerLogInfo(long j, int i, int i2, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91012, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91012, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.onPlayerLogInfo(i, i2, str2);
        }
    }

    public void sendNotify(long j, int i, int i2, int i3, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 91016, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 91016, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        TTPlayerIPCRef player = getPlayer(j);
        if (player != null) {
            player.handleNotify(i, i2, i3, str2);
        }
    }
}
