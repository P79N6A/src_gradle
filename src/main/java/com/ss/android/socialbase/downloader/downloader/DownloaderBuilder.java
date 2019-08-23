package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.network.d;
import java.util.concurrent.ExecutorService;

public class DownloaderBuilder {
    private f chunkAdjustCalculator;
    private g chunkCntCalculator;
    private final Context context;
    private ExecutorService cpuThreadExecutorService;
    private ExecutorService dbThreadExecutorService;
    private i downloadCache;
    private boolean downloadInMultiProcess;
    private k downloadLaunchHandler;
    private d headHttpService;
    private IDownloadHttpService httpService;
    private j idGenerator;
    private ExecutorService ioThreadExecutorService;
    private int maxDownloadPoolSize;
    private o monitorConfig;
    private int writeBufferSize;

    public f getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public g getChunkCntCalculator() {
        return this.chunkCntCalculator;
    }

    public Context getContext() {
        return this.context;
    }

    public ExecutorService getCpuThreadExecutorService() {
        return this.cpuThreadExecutorService;
    }

    public ExecutorService getDbThreadExecutorService() {
        return this.dbThreadExecutorService;
    }

    public i getDownloadCache() {
        return this.downloadCache;
    }

    public k getDownloadLaunchHandler() {
        return this.downloadLaunchHandler;
    }

    public d getHeadHttpService() {
        return this.headHttpService;
    }

    public IDownloadHttpService getHttpService() {
        return this.httpService;
    }

    public ExecutorService getIOThreadExecutorService() {
        return this.ioThreadExecutorService;
    }

    public j getIdGenerator() {
        return this.idGenerator;
    }

    public int getMaxDownloadPoolSize() {
        return this.maxDownloadPoolSize;
    }

    public o getMonitorConfig() {
        return this.monitorConfig;
    }

    public int getWriteBufferSize() {
        return this.writeBufferSize;
    }

    public boolean isDownloadInMultiProcess() {
        return this.downloadInMultiProcess;
    }

    public Downloader build() {
        return new Downloader(this);
    }

    public DownloaderBuilder chunkAdjustCalculator(f fVar) {
        this.chunkAdjustCalculator = fVar;
        return this;
    }

    public DownloaderBuilder chunkCntCalculator(g gVar) {
        this.chunkCntCalculator = gVar;
        return this;
    }

    public DownloaderBuilder cpuThreadExecutorService(ExecutorService executorService) {
        this.cpuThreadExecutorService = executorService;
        return this;
    }

    public DownloaderBuilder dbThreadExecutorService(ExecutorService executorService) {
        this.dbThreadExecutorService = executorService;
        return this;
    }

    public DownloaderBuilder downloadCache(i iVar) {
        this.downloadCache = iVar;
        return this;
    }

    public DownloaderBuilder downloadInMultiProcess(boolean z) {
        this.downloadInMultiProcess = z;
        return this;
    }

    public DownloaderBuilder downloadLaunchHandler(k kVar) {
        this.downloadLaunchHandler = kVar;
        return this;
    }

    public DownloaderBuilder headHttpService(d dVar) {
        this.headHttpService = dVar;
        return this;
    }

    public DownloaderBuilder httpService(IDownloadHttpService iDownloadHttpService) {
        this.httpService = iDownloadHttpService;
        return this;
    }

    public DownloaderBuilder idGenerator(j jVar) {
        this.idGenerator = jVar;
        return this;
    }

    public DownloaderBuilder ioThreadExecutorService(ExecutorService executorService) {
        this.ioThreadExecutorService = executorService;
        return this;
    }

    public DownloaderBuilder maxDownloadPoolSize(int i) {
        this.maxDownloadPoolSize = i;
        return this;
    }

    public DownloaderBuilder monitorConfig(o oVar) {
        this.monitorConfig = oVar;
        return this;
    }

    public DownloaderBuilder writeBufferSize(int i) {
        this.writeBufferSize = i;
        return this;
    }

    public DownloaderBuilder(Context context2) {
        this.context = context2;
    }
}
