package com.ss.android.socialbase.downloader.model;

import com.ss.android.socialbase.downloader.c.a;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.s;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DownloadTask {
    private g chunkStrategy;
    private IDownloadDepend depend;
    private m diskSpaceHandler;
    private DownloadInfo downloadInfo;
    private DownloadInfo.a downloadInfoBuilder;
    private n fileUriProvider;
    private r forbiddenHandler;
    private s interceptor;
    private List<IDownloadListener> mainThreadListeners;
    private IDownloadMonitorDepend monitorDepend;
    private boolean needDelayForCacheSync;
    private x notificationClickCallback;
    private u notificationEventListener;
    private List<IDownloadListener> notificationListeners;
    private p retryDelayTimeCalculator;
    private Map<com.ss.android.socialbase.downloader.constants.g, IDownloadListener> singleListenerMap;
    private List<IDownloadListener> subThreadListeners;

    public g getChunkStrategy() {
        return this.chunkStrategy;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public m getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public n getFileUriProvider() {
        return this.fileUriProvider;
    }

    public r getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public s getInterceptor() {
        return this.interceptor;
    }

    public IDownloadMonitorDepend getMonitorDepend() {
        return this.monitorDepend;
    }

    public x getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public u getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public p getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        if (this.downloadInfo != null) {
            return this.downloadInfo.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        if (this.downloadInfo == null) {
            return -1;
        }
        return this.downloadInfo.getId();
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.needDelayForCacheSync = false;
        this.downloadInfoBuilder = new DownloadInfo.a();
        this.mainThreadListeners = new ArrayList();
        this.subThreadListeners = new ArrayList();
        this.notificationListeners = new ArrayList();
    }

    public int download() {
        int i;
        this.downloadInfo = this.downloadInfoBuilder.a();
        c a2 = c.a();
        l a3 = a2.a(this);
        if (a3 == null) {
            IDownloadMonitorDepend monitorDepend2 = getMonitorDepend();
            DownloadInfo downloadInfo2 = getDownloadInfo();
            BaseException baseException = new BaseException(1003, "tryDownload but getDownloadHandler failed");
            if (getDownloadInfo() != null) {
                i = getDownloadInfo().getStatus();
            } else {
                i = 0;
            }
            a.a(monitorDepend2, downloadInfo2, baseException, i);
        } else if (isNeedDelayForCacheSync()) {
            a2.f30908a.postDelayed(new Runnable(a3, this) {

                /* renamed from: a */
                final /* synthetic */ l f30911a;

                /* renamed from: b */
                final /* synthetic */ DownloadTask f30912b;

                public final void run(
/*
Method generation error in method: com.ss.android.socialbase.downloader.downloader.c.1.run():void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.socialbase.downloader.downloader.c.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            }, 500);
        } else {
            a3.a(this);
        }
        if (this.downloadInfo == null) {
            return 0;
        }
        return this.downloadInfo.getId();
    }

    public DownloadTask chunkStategy(g gVar) {
        this.chunkStrategy = gVar;
        return this;
    }

    public DownloadTask depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public DownloadTask diskSpaceHandler(m mVar) {
        this.diskSpaceHandler = mVar;
        return this;
    }

    public DownloadTask fileUriProvider(n nVar) {
        this.fileUriProvider = nVar;
        return this;
    }

    public DownloadTask forbiddenHandler(r rVar) {
        this.forbiddenHandler = rVar;
        return this;
    }

    public DownloadTask interceptor(s sVar) {
        this.interceptor = sVar;
        return this;
    }

    public DownloadTask monitorDepend(IDownloadMonitorDepend iDownloadMonitorDepend) {
        this.monitorDepend = iDownloadMonitorDepend;
        return this;
    }

    public DownloadTask notificationClickCallback(x xVar) {
        this.notificationClickCallback = xVar;
        return this;
    }

    public DownloadTask notificationEventListener(u uVar) {
        this.notificationEventListener = uVar;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(p pVar) {
        this.retryDelayTimeCalculator = pVar;
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(u uVar) {
        this.notificationEventListener = uVar;
    }

    public DownloadTask(DownloadInfo downloadInfo2) {
        this();
        this.downloadInfo = downloadInfo2;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.u = z;
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.q = list;
        return this;
    }

    public DownloadTask enqueueType(EnqueueType enqueueType) {
        this.downloadInfoBuilder.D = enqueueType;
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.b(str);
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.h = list;
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.m = z;
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.E = z;
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.F = z;
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.i = i;
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.o = i;
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.z = str;
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.s = str;
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.p = i;
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.a(str);
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.w = z;
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.t = z;
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.C = z;
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.n = z;
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.A = z;
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        this.downloadInfoBuilder.x = z;
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.B = z;
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.f31051f = z;
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.j = strArr;
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.k = iArr;
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.y = str;
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.l = i;
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.f31049d = str;
        return this;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.r = z;
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.v = z;
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.f31050e = str;
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.f31047b = str;
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.f31048c = str;
        return this;
    }

    public IDownloadListener getSingleDownloadListener(com.ss.android.socialbase.downloader.constants.g gVar) {
        return this.singleListenerMap.get(gVar);
    }

    public int getDownloadListenerSize(com.ss.android.socialbase.downloader.constants.g gVar) {
        int size;
        List<IDownloadListener> downloadListeners = getDownloadListeners(gVar);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public List<IDownloadListener> getDownloadListeners(com.ss.android.socialbase.downloader.constants.g gVar) {
        if (gVar == com.ss.android.socialbase.downloader.constants.g.MAIN) {
            return this.mainThreadListeners;
        }
        if (gVar == com.ss.android.socialbase.downloader.constants.g.SUB) {
            return this.subThreadListeners;
        }
        if (gVar == com.ss.android.socialbase.downloader.constants.g.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                if (!this.mainThreadListeners.contains(iDownloadListener)) {
                    this.mainThreadListeners.add(iDownloadListener);
                }
            }
            this.singleListenerMap.put(com.ss.android.socialbase.downloader.constants.g.MAIN, iDownloadListener);
        }
        return this;
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                if (!this.notificationListeners.contains(iDownloadListener)) {
                    this.notificationListeners.add(iDownloadListener);
                }
            }
            this.singleListenerMap.put(com.ss.android.socialbase.downloader.constants.g.NOTIFICATION, iDownloadListener);
        }
        return this;
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                if (!this.subThreadListeners.contains(iDownloadListener)) {
                    this.subThreadListeners.add(iDownloadListener);
                }
            }
            this.singleListenerMap.put(com.ss.android.socialbase.downloader.constants.g.SUB, iDownloadListener);
        }
        return this;
    }

    public IDownloadListener getDownloadListenerByIndex(com.ss.android.socialbase.downloader.constants.g gVar, int i) {
        List<IDownloadListener> downloadListeners = getDownloadListeners(gVar);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i >= downloadListeners.size()) {
                return null;
            }
            IDownloadListener iDownloadListener = downloadListeners.get(i);
            return iDownloadListener;
        }
    }

    public void setDownloadListeners(List<IDownloadListener> list, com.ss.android.socialbase.downloader.constants.g gVar) {
        if (list != null) {
            try {
                if (gVar == com.ss.android.socialbase.downloader.constants.g.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        this.mainThreadListeners.clear();
                        this.mainThreadListeners.addAll(list);
                    }
                } else if (gVar == com.ss.android.socialbase.downloader.constants.g.SUB) {
                    synchronized (this.subThreadListeners) {
                        this.subThreadListeners.clear();
                        this.subThreadListeners.addAll(list);
                    }
                } else if (gVar == com.ss.android.socialbase.downloader.constants.g.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        this.notificationListeners.clear();
                        this.notificationListeners.addAll(list);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void addDownloadListener(IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.g gVar, boolean z) {
        if (iDownloadListener != null) {
            if (z && this.singleListenerMap != null) {
                this.singleListenerMap.put(gVar, iDownloadListener);
            }
            List<IDownloadListener> downloadListeners = getDownloadListeners(gVar);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    if (!downloadListeners.contains(iDownloadListener)) {
                        downloadListeners.add(iDownloadListener);
                    }
                }
            }
        }
    }

    public void removeDownloadListener(IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.g gVar, boolean z) {
        if (z && this.singleListenerMap.containsKey(gVar)) {
            iDownloadListener = this.singleListenerMap.get(gVar);
            this.singleListenerMap.remove(gVar);
        }
        if (iDownloadListener != null) {
            List<IDownloadListener> downloadListeners = getDownloadListeners(gVar);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    if (downloadListeners.contains(iDownloadListener)) {
                        Iterator<IDownloadListener> it2 = downloadListeners.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().equals(iDownloadListener)) {
                                    it2.remove();
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
