package com.bytedance.android.livesdk;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.MainThread;
import com.bef.effectsdk.AssetResourceFinder;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.h;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.io.IOException;

public enum s {
    INST;
    
    private static final String BEAUTY_FILE_NAME = null;
    private static final String BEAUTY_FILE_NAME_COMPOSER = null;
    private static final String BEAUTY_FILE_NAME_COMPOSER_QINGYAN = null;
    private static final String BEAUTY_FILE_NAME_QINGYAN = null;
    private static final String EFFECT_COMPOSER = null;
    private static final String FACE_DETECTION_FILE_NAME = null;
    private static final String FACE_DETECTION_FILE_V3_NAME = null;
    private static final String FILTER_DIRECTORY = null;
    private static final String FILTER_FILE_NAME = null;
    private static final String[] FOLDER_RES_FILES = null;
    private static final String RESHAPE_COMPOSER_FILE_NAME = null;
    private static final String RESHAPE_COMPOSER_QINYAN_FILE_NAME = null;
    private static final String[] RES_FILES = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String sLiveCameraResStoragePath;
    public MutableLiveData<Boolean> isLoadedRes;
    private boolean isLoadingRes;
    private String lastTimeFailedReason;

    public final String getLastTimeFailedReason() {
        return this.lastTimeFailedReason;
    }

    public final String getModelFilePath() {
        return sLiveCameraResStoragePath;
    }

    public final String getFilterFilePath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2633, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2633, new Class[0], String.class);
        }
        return sLiveCameraResStoragePath + FILTER_FILE_NAME;
    }

    public final String getLiveComposerFilePath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2631, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2631, new Class[0], String.class);
        }
        return sLiveCameraResStoragePath + EFFECT_COMPOSER;
    }

    public final String getBeautyComposerFilePath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2636, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2636, new Class[0], String.class);
        } else if (a.k()) {
            return sLiveCameraResStoragePath + BEAUTY_FILE_NAME_COMPOSER;
        } else {
            return sLiveCameraResStoragePath + BEAUTY_FILE_NAME_COMPOSER_QINGYAN;
        }
    }

    public final String getBeautyFilePath() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2635, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2635, new Class[0], String.class);
        }
        if (a.k()) {
            str = sLiveCameraResStoragePath + BEAUTY_FILE_NAME;
        } else {
            str = sLiveCameraResStoragePath + BEAUTY_FILE_NAME_QINGYAN;
        }
        if (h.a(str)) {
            return str;
        }
        return "";
    }

    public final String getFaceReshapeFilePath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2632, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2632, new Class[0], String.class);
        } else if (a.a()) {
            return sLiveCameraResStoragePath + FACE_DETECTION_FILE_V3_NAME;
        } else {
            return sLiveCameraResStoragePath + FACE_DETECTION_FILE_NAME;
        }
    }

    public final String getReshapeComposerFilePath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2637, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2637, new Class[0], String.class);
        } else if (a.a()) {
            return sLiveCameraResStoragePath + RESHAPE_COMPOSER_QINYAN_FILE_NAME;
        } else {
            return sLiveCameraResStoragePath + RESHAPE_COMPOSER_FILE_NAME;
        }
    }

    @MainThread
    public final boolean isLoadedRes() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2639, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2639, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.6".equals(b.h.a())));
        }
        return ((Boolean) this.isLoadedRes.getValue()).booleanValue();
    }

    static {
        FILTER_DIRECTORY = ac.a((int) C0906R.string.dbf);
        EFFECT_COMPOSER = ac.a((int) C0906R.string.dbe);
        FACE_DETECTION_FILE_NAME = ac.a((int) C0906R.string.dbj);
        FACE_DETECTION_FILE_V3_NAME = ac.a((int) C0906R.string.dbk);
        FILTER_FILE_NAME = ac.a((int) C0906R.string.dbm);
        BEAUTY_FILE_NAME = ac.a((int) C0906R.string.db_);
        BEAUTY_FILE_NAME_QINGYAN = ac.a((int) C0906R.string.dbc);
        BEAUTY_FILE_NAME_COMPOSER_QINGYAN = ac.a((int) C0906R.string.db8);
        BEAUTY_FILE_NAME_COMPOSER = ac.a((int) C0906R.string.db7);
        RESHAPE_COMPOSER_FILE_NAME = ac.a((int) C0906R.string.dbo);
        RESHAPE_COMPOSER_QINYAN_FILE_NAME = ac.a((int) C0906R.string.dbq);
        String[] f2 = ac.f(C0906R.array.af);
        RES_FILES = new String[f2.length];
        for (int i = 0; i < f2.length; i++) {
            String[] strArr = RES_FILES;
            strArr[i] = f2[i] + ".zip";
        }
        FOLDER_RES_FILES = new String[0];
        File dir = TTLiveSDKContext.getHostService().a().a().getDir(FILTER_DIRECTORY, 0);
        sLiveCameraResStoragePath = dir.getAbsolutePath() + File.separator;
    }

    private boolean load() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 2640, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 2640, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AssetManager assets = ac.e().getAssets();
        boolean z = true;
        for (String str2 : RES_FILES) {
            try {
                copy(assets, str2, sLiveCameraResStoragePath + File.separator + str2);
            } catch (IOException e2) {
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", (Throwable) e2);
                z = false;
            }
        }
        String[] strArr = FOLDER_RES_FILES;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                copyDir(assets, str, sLiveCameraResStoragePath + File.separator + str);
            } catch (IOException e3) {
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", (Throwable) e3);
                z = false;
            }
            i++;
        }
        for (String unzip : RES_FILES) {
            try {
                unzip(unzip);
            } catch (IOException e4) {
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", (Throwable) e4);
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void loadResources() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0099 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x0099 }
            r4 = 0
            r5 = 2638(0xa4e, float:3.697E-42)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0099 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0099 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0099 }
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x0099 }
            r5 = 0
            r6 = 2638(0xa4e, float:3.697E-42)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0099 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0099 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0099 }
            monitor-exit(r9)
            return
        L_0x0025:
            boolean r0 = r9.isLoadingRes     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x002b
            monitor-exit(r9)
            return
        L_0x002b:
            java.lang.String r0 = "0.0.6"
            com.bytedance.android.livesdk.w.c<java.lang.String> r1 = com.bytedance.android.livesdk.w.b.h     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0099 }
            r1 = 1
            if (r0 == 0) goto L_0x006a
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r9.isLoadedRes     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0050
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r9.isLoadedRes     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0099 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0068
        L_0x0050:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0099 }
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)     // Catch:{ all -> 0x0099 }
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()     // Catch:{ all -> 0x0099 }
            io.reactivex.Observable r0 = r0.observeOn(r1)     // Catch:{ all -> 0x0099 }
            com.bytedance.android.livesdk.t r1 = new com.bytedance.android.livesdk.t     // Catch:{ all -> 0x0099 }
            r1.<init>(r9)     // Catch:{ all -> 0x0099 }
            r0.subscribe((io.reactivex.functions.Consumer<? super T>) r1)     // Catch:{ all -> 0x0099 }
        L_0x0068:
            monitor-exit(r9)
            return
        L_0x006a:
            r9.isLoadingRes = r1     // Catch:{ all -> 0x0099 }
            com.bytedance.android.livesdk.u r0 = new com.bytedance.android.livesdk.u     // Catch:{ all -> 0x0099 }
            r0.<init>(r9)     // Catch:{ all -> 0x0099 }
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromCallable(r0)     // Catch:{ all -> 0x0099 }
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.io()     // Catch:{ all -> 0x0099 }
            io.reactivex.Flowable r0 = r0.subscribeOn(r1)     // Catch:{ all -> 0x0099 }
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()     // Catch:{ all -> 0x0099 }
            io.reactivex.Flowable r0 = r0.observeOn(r1)     // Catch:{ all -> 0x0099 }
            com.bytedance.android.livesdk.v r1 = new com.bytedance.android.livesdk.v     // Catch:{ all -> 0x0099 }
            r1.<init>(r9)     // Catch:{ all -> 0x0099 }
            com.bytedance.android.livesdk.w r2 = new com.bytedance.android.livesdk.w     // Catch:{ all -> 0x0099 }
            r2.<init>(r9)     // Catch:{ all -> 0x0099 }
            com.bytedance.android.livesdk.x r3 = new com.bytedance.android.livesdk.x     // Catch:{ all -> 0x0099 }
            r3.<init>(r9)     // Catch:{ all -> 0x0099 }
            r0.subscribe(r1, r2, r3)     // Catch:{ all -> 0x0099 }
            monitor-exit(r9)
            return
        L_0x0099:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.s.loadResources():void");
    }

    private void unzip(String str) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 2642, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 2642, new Class[]{String.class}, Void.TYPE);
            return;
        }
        h.a(sLiveCameraResStoragePath + str2, sLiveCameraResStoragePath);
    }

    public final com.bef.effectsdk.b getResourceFinder(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 2634, new Class[]{Context.class}, com.bef.effectsdk.b.class)) {
            return (com.bef.effectsdk.b) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 2634, new Class[]{Context.class}, com.bef.effectsdk.b.class);
        }
        com.bef.effectsdk.b bVar = null;
        if (!a.f()) {
            bVar = TTLiveSDKContext.getHostService().a().j();
        }
        if (bVar == null) {
            bVar = new AssetResourceFinder(context.getAssets(), INST.getModelFilePath());
        }
        return bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: okio.Sink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: okio.Sink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: okio.Sink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: okio.Sink} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copy(android.content.res.AssetManager r22, java.lang.String r23, java.lang.String r24) throws java.io.IOException {
        /*
            r21 = this;
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r22
            r12 = 1
            r4[r12] = r23
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 2641(0xa51, float:3.701E-42)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0051
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r22
            r14[r12] = r23
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 0
            r18 = 2641(0xa51, float:3.701E-42)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.AssetManager> r1 = android.content.res.AssetManager.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0051:
            boolean r3 = android.text.TextUtils.isEmpty(r23)
            if (r3 == 0) goto L_0x0058
            return
        L_0x0058:
            r3 = 0
            java.io.InputStream r1 = r22.open(r23)     // Catch:{ all -> 0x009e }
            okio.Source r4 = okio.Okio.source((java.io.InputStream) r1)     // Catch:{ all -> 0x009b }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0098 }
            r0.<init>(r2)     // Catch:{ all -> 0x0098 }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x006f
            r0.delete()     // Catch:{ all -> 0x0098 }
        L_0x006f:
            okio.Sink r2 = okio.Okio.sink((java.io.File) r0)     // Catch:{ all -> 0x0098 }
            okio.BufferedSink r5 = okio.Okio.buffer((okio.Sink) r2)     // Catch:{ all -> 0x0096 }
            r5.writeAll(r4)     // Catch:{ all -> 0x0093 }
            r5.flush()     // Catch:{ all -> 0x0093 }
            if (r5 == 0) goto L_0x0082
            r5.close()
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            if (r4 == 0) goto L_0x008c
            r4.close()
        L_0x008c:
            if (r1 == 0) goto L_0x0092
            r1.close()
            return
        L_0x0092:
            return
        L_0x0093:
            r0 = move-exception
            r3 = r5
            goto L_0x00a2
        L_0x0096:
            r0 = move-exception
            goto L_0x00a2
        L_0x0098:
            r0 = move-exception
            r2 = r3
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            r2 = r3
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            r1 = r3
            r2 = r1
        L_0x00a1:
            r4 = r2
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
            r3.close()
        L_0x00a7:
            if (r2 == 0) goto L_0x00ac
            r2.close()
        L_0x00ac:
            if (r4 == 0) goto L_0x00b1
            r4.close()
        L_0x00b1:
            if (r1 == 0) goto L_0x00b6
            r1.close()
        L_0x00b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.s.copy(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    private void copyDir(AssetManager assetManager, String str, String str2) throws IOException {
        AssetManager assetManager2 = assetManager;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{assetManager2, str3, str4}, this, changeQuickRedirect, false, 2643, new Class[]{AssetManager.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{assetManager2, str3, str4}, this, changeQuickRedirect, false, 2643, new Class[]{AssetManager.class, String.class, String.class}, Void.TYPE);
            return;
        }
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str4).mkdirs();
            for (String str5 : list) {
                copyDir(assetManager2, str3 + File.separator + str5, str4 + File.separator + str5);
            }
            return;
        }
        copy(assetManager, str, str2);
    }
}
