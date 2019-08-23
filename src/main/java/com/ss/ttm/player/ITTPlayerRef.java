package com.ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.ttm.player.MediaPlayer;

public abstract class ITTPlayerRef {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void close();

    public abstract Context getContext();

    public abstract double getDoubleOption(int i, double d2);

    public abstract float getFloatOption(int i, float f2);

    public abstract int getIntOption(int i, int i2);

    public abstract int getLifeId();

    public abstract long getLongOption(int i, long j);

    public abstract String getStringOption(int i);

    public abstract int getType();

    public void invalid() {
    }

    public abstract boolean isValid();

    public abstract void mouseEvent(int i, int i2, int i3);

    public abstract void pause();

    public abstract void prepare();

    public abstract void prevClose();

    public abstract void release();

    public abstract void reset();

    public abstract void rotateCamera(float f2, float f3);

    public abstract void seekTo(int i);

    public abstract void setCacheFile(String str, int i);

    public abstract void setDataSource(String str);

    public abstract void setDataSourceFd(int i);

    public abstract int setDoubleOption(int i, double d2);

    public abstract int setFloatOption(int i, float f2);

    public abstract int setIntOption(int i, int i2);

    public abstract int setLongOption(int i, long j);

    public abstract void setLooping(int i);

    public abstract void setNotifyState(long j);

    public abstract void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener);

    public abstract int setStringOption(int i, String str);

    public abstract void setSurface(Surface surface);

    public abstract void setVolume(float f2, float f3);

    public abstract void start();

    public abstract void stop();

    public abstract void switchStream(int i, int i2);

    public abstract void takeScreenshot();

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.ss.ttm.player.ITTPlayerRef create(android.content.Context r20, com.ss.ttm.player.TTPlayerClient r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.ttm.player.ITTPlayerRef> r2 = com.ss.ttm.player.ITTPlayerRef.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a6 }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x00a6 }
            r12 = 1
            r4[r12] = r1     // Catch:{ all -> 0x00a6 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect     // Catch:{ all -> 0x00a6 }
            r7 = 1
            r8 = 90659(0x16223, float:1.2704E-40)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r11] = r10     // Catch:{ all -> 0x00a6 }
            java.lang.Class<com.ss.ttm.player.TTPlayerClient> r10 = com.ss.ttm.player.TTPlayerClient.class
            r9[r12] = r10     // Catch:{ all -> 0x00a6 }
            java.lang.Class<com.ss.ttm.player.ITTPlayerRef> r10 = com.ss.ttm.player.ITTPlayerRef.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a6 }
            r13[r11] = r0     // Catch:{ all -> 0x00a6 }
            r13[r12] = r1     // Catch:{ all -> 0x00a6 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect     // Catch:{ all -> 0x00a6 }
            r16 = 1
            r17 = 90659(0x16223, float:1.2704E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1     // Catch:{ all -> 0x00a6 }
            java.lang.Class<com.ss.ttm.player.TTPlayerClient> r1 = com.ss.ttm.player.TTPlayerClient.class
            r0[r12] = r1     // Catch:{ all -> 0x00a6 }
            java.lang.Class<com.ss.ttm.player.ITTPlayerRef> r19 = com.ss.ttm.player.ITTPlayerRef.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a6 }
            com.ss.ttm.player.ITTPlayerRef r0 = (com.ss.ttm.player.ITTPlayerRef) r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r2)
            return r0
        L_0x004d:
            int r4 = com.ss.ttm.utils.HardWareInfo.getCpuFamily()     // Catch:{ all -> 0x00a6 }
            r5 = 0
            if (r4 != r12) goto L_0x008f
            boolean r4 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r3, (boolean) r11)     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = "com.ss.ttm.player.TTPlayerIPCRef"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x007d }
            java.lang.String r6 = "create"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x007d }
            java.lang.Class<com.ss.ttm.player.TTPlayerClient> r8 = com.ss.ttm.player.TTPlayerClient.class
            r7[r11] = r8     // Catch:{ Exception -> 0x007d }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r12] = r8     // Catch:{ Exception -> 0x007d }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch:{ Exception -> 0x007d }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007d }
            r3[r11] = r1     // Catch:{ Exception -> 0x007d }
            r3[r12] = r0     // Catch:{ Exception -> 0x007d }
            java.lang.Object r3 = r4.invoke(r5, r3)     // Catch:{ Exception -> 0x007d }
            com.ss.ttm.player.ITTPlayerRef r3 = (com.ss.ttm.player.ITTPlayerRef) r3     // Catch:{ Exception -> 0x007d }
            goto L_0x007e
        L_0x007d:
            r3 = r5
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            com.ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x00a6 }
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != 0) goto L_0x008f
            com.ss.ttm.player.TTPlayerRef r5 = com.ss.ttm.player.TTPlayerRef.create(r1, r0)     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x008f
            com.ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x00a6 }
        L_0x008f:
            if (r5 != 0) goto L_0x00a4
            r0 = 7
            boolean r1 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r0, (boolean) r11)     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x00a4
            r1 = 10
            int r1 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r1, (int) r11)     // Catch:{ all -> 0x00a6 }
            r3 = 3
            if (r1 >= r3) goto L_0x00a4
            com.ss.ttm.player.TTPlayerConfiger.setValue((int) r0, (boolean) r12)     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r2)
            return r5
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.ITTPlayerRef.create(android.content.Context, com.ss.ttm.player.TTPlayerClient):com.ss.ttm.player.ITTPlayerRef");
    }
}
