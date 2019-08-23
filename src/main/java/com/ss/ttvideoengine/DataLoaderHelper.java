package com.ss.ttvideoengine;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class DataLoaderHelper implements AVMDLDataLoaderListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean isProxyLibraryLoaded;
    private DataLoaderTaskQueue mAlltasks;
    private AVMDLDataLoaderConfigure mConfigure;
    private Context mContext;
    private Exception mException;
    private DataLoaderTaskQueue mExecuteTasks;
    private AVMDLDataLoader mInnerDataLoader;
    public DataLoaderListener mListener;
    private final ReentrantLock mLock;
    private TTVNetClient mNetClient;
    private DataLoaderTaskQueue mPreloadTasks;
    private volatile LibraryLoaderProxy mProxy;
    private volatile int mState;

    public class DataLoaderCacheFileInfo {
        public long mCacheSizeFromZero;
        public String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheFileInfo() {
        }
    }

    public class DataLoaderTaskItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mApiString;
        public String mDecryptionKey;
        public VideoInfoFetcher mFetcher;
        public String mKey;
        public TaskListener mListener;
        public long mPreloadSize;
        public String mProxyUrl;
        public Resolution mResolution = Resolution.Undefine;
        public VideoModel mResponseData;
        public Error mResponseError;
        public PreloaderVidItem mVidItem;
        public String mVideoId;
        public String[] mdirectUrls;

        class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
            public static ChangeQuickRedirect changeQuickRedirect;
            private final WeakReference<DataLoaderTaskItem> mTaskItemRef;

            public void onLog(String str) {
            }

            public void onRetry(Error error) {
            }

            public void onStatusException(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91212, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91212, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItemRef.get();
                if (!(dataLoaderTaskItem == null || dataLoaderTaskItem.mListener == null)) {
                    dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                }
            }

            public MyFetcherListener(DataLoaderTaskItem dataLoaderTaskItem) {
                this.mTaskItemRef = new WeakReference<>(dataLoaderTaskItem);
            }

            public void onCompletion(VideoModel videoModel, Error error) {
                VideoModel videoModel2 = videoModel;
                Error error2 = error;
                if (PatchProxy.isSupport(new Object[]{videoModel2, error2}, this, changeQuickRedirect, false, 91211, new Class[]{VideoModel.class, Error.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{videoModel2, error2}, this, changeQuickRedirect, false, 91211, new Class[]{VideoModel.class, Error.class}, Void.TYPE);
                    return;
                }
                DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItemRef.get();
                if (dataLoaderTaskItem != null) {
                    dataLoaderTaskItem.mResponseData = videoModel2;
                    dataLoaderTaskItem.mResponseError = error2;
                    if (dataLoaderTaskItem.mListener != null) {
                        dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                    }
                }
            }
        }

        public void setListener(TaskListener taskListener) {
            this.mListener = taskListener;
        }

        public DataLoaderTaskItem() {
        }

        public void setUp(String str, Resolution resolution, long j, TTVNetClient tTVNetClient) {
            String str2 = str;
            Resolution resolution2 = resolution;
            long j2 = j;
            TTVNetClient tTVNetClient2 = tTVNetClient;
            if (PatchProxy.isSupport(new Object[]{str2, resolution2, new Long(j2), tTVNetClient2}, this, changeQuickRedirect, false, 91210, new Class[]{String.class, Resolution.class, Long.TYPE, TTVNetClient.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, resolution2, new Long(j2), tTVNetClient2}, this, changeQuickRedirect, false, 91210, new Class[]{String.class, Resolution.class, Long.TYPE, TTVNetClient.class}, Void.TYPE);
                return;
            }
            this.mKey = str2;
            this.mResolution = resolution2;
            this.mPreloadSize = j2;
            VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(tTVNetClient2);
            videoInfoFetcher.setListener(new MyFetcherListener(this));
            this.mFetcher = videoInfoFetcher;
        }
    }

    public class DataLoaderTaskProgressInfo {
        public long mCacheSizeFromZero;
        public String mDecryptionKey;
        public String mKey;
        public String mLocalFilePath;
        public long mMediaSize;
        public Resolution mResolution = Resolution.Undefine;
        public String mVideoId;

        public DataLoaderTaskProgressInfo() {
        }
    }

    class DataLoaderTaskQueue {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ReentrantLock mLock;
        private long mMaxCount;
        private final ArrayList<DataLoaderTaskItem> mTaskItems;

        public long count() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91213, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91213, new Class[0], Long.TYPE)).longValue();
            }
            this.mLock.lock();
            long size = (long) this.mTaskItems.size();
            this.mLock.unlock();
            return size;
        }

        private Boolean _enoughItems() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91222, new Class[0], Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91222, new Class[0], Boolean.class);
            } else if (this.mMaxCount < 1) {
                return Boolean.FALSE;
            } else {
                if (((long) this.mTaskItems.size()) >= this.mMaxCount) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        public DataLoaderTaskItem backItem() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91216, new Class[0], DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91216, new Class[0], DataLoaderTaskItem.class);
            }
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(this.mTaskItems.size() - 1);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem frontItem() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91214, new Class[0], DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91214, new Class[0], DataLoaderTaskItem.class);
            }
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(0);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popBackItem() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91217, new Class[0], DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91217, new Class[0], DataLoaderTaskItem.class);
            }
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(this.mTaskItems.size() - 1);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popFrontItem() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91215, new Class[0], DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91215, new Class[0], DataLoaderTaskItem.class);
            }
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(0);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public void setMaxCount(long j) {
            this.mMaxCount = j;
        }

        private DataLoaderTaskQueue() {
            this.mLock = new ReentrantLock();
            this.mTaskItems = new ArrayList<>();
            this.mMaxCount = 0;
        }

        public boolean containItem(String str) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91219, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91219, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                Boolean bool = Boolean.FALSE;
                this.mLock.lock();
                while (true) {
                    if (i >= this.mTaskItems.size()) {
                        break;
                    } else if (this.mTaskItems.get(i).mKey.equals(str)) {
                        bool = Boolean.TRUE;
                        break;
                    } else {
                        i++;
                    }
                }
                this.mLock.unlock();
                return bool.booleanValue();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean enqueueItem(DataLoaderTaskItem dataLoaderTaskItem) {
            Boolean bool;
            if (PatchProxy.isSupport(new Object[]{dataLoaderTaskItem}, this, changeQuickRedirect, false, 91218, new Class[]{DataLoaderTaskItem.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dataLoaderTaskItem}, this, changeQuickRedirect, false, 91218, new Class[]{DataLoaderTaskItem.class}, Boolean.TYPE)).booleanValue();
            } else if (dataLoaderTaskItem == null || TextUtils.isEmpty(dataLoaderTaskItem.mKey)) {
                return false;
            } else {
                Boolean bool2 = Boolean.FALSE;
                this.mLock.lock();
                if (_enoughItems().booleanValue()) {
                    bool = Boolean.FALSE;
                } else {
                    this.mTaskItems.add(dataLoaderTaskItem);
                    bool = Boolean.TRUE;
                }
                this.mLock.unlock();
                return bool.booleanValue();
            }
        }

        public DataLoaderTaskItem itemForKey(String str) {
            DataLoaderTaskItem dataLoaderTaskItem;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91220, new Class[]{String.class}, DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91220, new Class[]{String.class}, DataLoaderTaskItem.class);
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                this.mLock.lock();
                while (true) {
                    if (i >= this.mTaskItems.size()) {
                        dataLoaderTaskItem = null;
                        break;
                    }
                    dataLoaderTaskItem = this.mTaskItems.get(i);
                    if (dataLoaderTaskItem.mKey.equals(str)) {
                        break;
                    }
                    i++;
                }
                this.mLock.unlock();
                return dataLoaderTaskItem;
            }
        }

        public DataLoaderTaskItem popItem(String str) {
            DataLoaderTaskItem dataLoaderTaskItem;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91221, new Class[]{String.class}, DataLoaderTaskItem.class)) {
                return (DataLoaderTaskItem) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91221, new Class[]{String.class}, DataLoaderTaskItem.class);
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                this.mLock.lock();
                while (true) {
                    if (i >= this.mTaskItems.size()) {
                        dataLoaderTaskItem = null;
                        break;
                    }
                    dataLoaderTaskItem = this.mTaskItems.get(i);
                    if (dataLoaderTaskItem.mKey.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (dataLoaderTaskItem != null) {
                    this.mTaskItems.remove(dataLoaderTaskItem);
                }
                this.mLock.unlock();
                return dataLoaderTaskItem;
            }
        }
    }

    static class Holder {
        public static DataLoaderHelper instance = new DataLoaderHelper();

        private Holder() {
        }
    }

    class MyTaskListener implements TaskListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<DataLoaderHelper> mDataLoader;

        public void taskFinished(DataLoaderTaskItem dataLoaderTaskItem) {
            DataLoaderTaskItem dataLoaderTaskItem2 = dataLoaderTaskItem;
            if (PatchProxy.isSupport(new Object[]{dataLoaderTaskItem2}, this, changeQuickRedirect, false, 91223, new Class[]{DataLoaderTaskItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataLoaderTaskItem2}, this, changeQuickRedirect, false, 91223, new Class[]{DataLoaderTaskItem.class}, Void.TYPE);
                return;
            }
            DataLoaderHelper dataLoaderHelper = (DataLoaderHelper) this.mDataLoader.get();
            if (dataLoaderHelper != null) {
                dataLoaderHelper._exectTask(dataLoaderTaskItem2);
                if (!(dataLoaderTaskItem2.mResponseError == null || dataLoaderHelper.mListener == null)) {
                    dataLoaderHelper.mListener.dataLoaderError(dataLoaderTaskItem2.mVideoId, 1, dataLoaderTaskItem2.mResponseError);
                }
            }
        }

        public MyTaskListener(DataLoaderHelper dataLoaderHelper) {
            this.mDataLoader = new WeakReference<>(dataLoaderHelper);
        }
    }

    interface TaskListener {
        void taskFinished(DataLoaderTaskItem dataLoaderTaskItem);
    }

    public static DataLoaderHelper getDataLoader() {
        return Holder.instance;
    }

    private DataLoaderHelper() {
        this.mState = 1;
        this.mPreloadTasks = new DataLoaderTaskQueue();
        this.mExecuteTasks = new DataLoaderTaskQueue();
        this.mAlltasks = new DataLoaderTaskQueue();
        this.mInnerDataLoader = null;
        this.mConfigure = null;
        this.mContext = null;
        this.mException = null;
        this.mLock = new ReentrantLock();
        this.mState = 1;
        this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    public void cancelAllTasks() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91193, new Class[0], Void.TYPE);
        } else if (this.mState == 0) {
            this.mLock.lock();
            try {
                cancelAllTasksInternal();
            } finally {
                this.mLock.unlock();
            }
        }
    }

    private void _startExecuteTask() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91204, new Class[0], Void.TYPE);
            return;
        }
        DataLoaderTaskItem backItem = this.mPreloadTasks.backItem();
        if (backItem != null && this.mExecuteTasks.enqueueItem(backItem)) {
            this.mPreloadTasks.popBackItem();
            if (backItem.mResponseData != null || (backItem.mdirectUrls != null && backItem.mdirectUrls.length > 0)) {
                _exectTask(backItem);
                return;
            }
            HashMap hashMap = new HashMap();
            if (backItem.mVidItem.mH265Enable) {
                hashMap.put("codec_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            backItem.mFetcher.fetchInfo(null);
        }
    }

    private void _tryToSetDefaultCacheDir() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91206, new Class[0], Void.TYPE);
        } else if (this.mContext != null && TextUtils.isEmpty(this.mConfigure.mCacheDir)) {
            String appFilesPath = TTHelper.getAppFilesPath(this.mContext);
            String str = appFilesPath + File.separator + "mdlcache";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            this.mConfigure.mCacheDir = str;
        }
    }

    private boolean loadLibrary() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91181, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91181, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mProxy == null) {
            return true;
        } else {
            if (this.mProxy != null && !this.isProxyLibraryLoaded) {
                this.isProxyLibraryLoaded = this.mProxy.loadLibrary("avmdl");
            }
            return this.isProxyLibraryLoaded;
        }
    }

    public void cancelAllTasksInternal() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91198, new Class[0], Void.TYPE);
            return;
        }
        this.mInnerDataLoader.cancelAll();
        DataLoaderTaskItem popBackItem = this.mExecuteTasks.popBackItem();
        while (popBackItem != null) {
            popBackItem.mFetcher.cancel();
            popBackItem = this.mExecuteTasks.popBackItem();
        }
        do {
        } while (this.mPreloadTasks.popBackItem() != null);
    }

    public void clearAllCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91196, new Class[0], Void.TYPE);
        } else if (this.mState == 0 && this.mLock.tryLock()) {
            try {
                this.mInnerDataLoader.clearAllCaches();
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91185, new Class[0], Void.TYPE);
            return;
        }
        this.mLock.lock();
        try {
            if (this.mState == 1) {
                TTVideoEngineLog.e("DataLoaderHelper", "DataLoader not started, not need close");
                return;
            }
            this.mListener = null;
            this.mInnerDataLoader.close();
            cancelAllTasksInternal();
            this.mState = 1;
            this.mLock.unlock();
        } finally {
            this.mLock.unlock();
        }
    }

    public long getAllCacheSize() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91195, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91195, new Class[0], Long.TYPE)).longValue();
        }
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        if (this.mLock.tryLock()) {
            try {
                j = this.mInnerDataLoader.getAllCacheSize();
            } finally {
                this.mLock.unlock();
            }
        }
        return j;
    }

    public boolean isRunging() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91184, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91184, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                z = true;
            }
            return z;
        } finally {
            this.mLock.unlock();
        }
    }

    private boolean initInternal() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91182, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91182, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mInnerDataLoader != null) {
            return true;
        } else {
            if (!loadLibrary()) {
                TTVideoEngineLog.d("DataLoaderHelper", String.format("library load fail", new Object[0]));
                return false;
            }
            if (this.mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (AVMDLDataLoader.init(z) != 0) {
                TTVideoEngineLog.d("DataLoaderHelper", String.format("library has not been loaded", new Object[0]));
                return false;
            }
            try {
                this.mInnerDataLoader = new AVMDLDataLoader(this.mConfigure);
                this.mInnerDataLoader.setListener(this);
                return true;
            } catch (Exception e2) {
                TTVideoEngineLog.d("DataLoaderHelper", String.format("create loader failed: exception is" + e2.toString(), new Object[0]));
                return false;
            }
        }
    }

    public void start() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91183, new Class[0], Void.TYPE);
            return;
        }
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                TTVideoEngineLog.e("DataLoaderHelper", "DataLoader has started not need start");
            } else if (initInternal()) {
                this.mExecuteTasks.setMaxCount(4);
                _tryToSetDefaultCacheDir();
                if (this.mConfigure == null) {
                    this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
                }
                this.mInnerDataLoader.setConfigure(this.mConfigure);
                if (this.mInnerDataLoader.start() >= 0) {
                    this.mState = 0;
                    TTVideoEngineLog.e("DataLoaderHelper", "DataLoader start.");
                    this.mLock.unlock();
                    return;
                }
                throw new Exception("start data loader fail");
            } else {
                throw new Exception("init data loader fail");
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public DataLoaderCacheFileInfo cacheFileInfo(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91197, new Class[]{String.class}, DataLoaderCacheFileInfo.class)) {
            return (DataLoaderCacheFileInfo) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91197, new Class[]{String.class}, DataLoaderCacheFileInfo.class);
        }
        DataLoaderCacheFileInfo dataLoaderCacheFileInfo = null;
        if (this.mState != 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.mLock.tryLock()) {
            try {
                dataLoaderCacheFileInfo = _getFileInfoModel(this.mInnerDataLoader.getStringCacheInfo(str));
            } finally {
                this.mLock.unlock();
            }
        }
        return dataLoaderCacheFileInfo;
    }

    public void cancelTask(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91192, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91192, new Class[]{String.class}, Void.TYPE);
        } else if (this.mState == 0 && !TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                this.mInnerDataLoader.cancel(str);
                DataLoaderTaskItem popItem = this.mExecuteTasks.popItem(str);
                if (popItem == null) {
                    popItem = this.mPreloadTasks.popItem(str);
                }
                if (popItem != null) {
                    popItem.mFetcher.cancel();
                    this.mLock.unlock();
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public long getCacheFileSize(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91194, new Class[]{String.class}, Long.TYPE)) {
            return TextUtils.isEmpty(str) ? 0 : 0;
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91194, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    public String getStringValue(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91191, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91191, new Class[]{Integer.TYPE}, String.class);
        }
        this.mLock.lock();
        if (i == 0) {
            try {
                return this.mConfigure.mCacheDir;
            } finally {
                this.mLock.unlock();
            }
        } else {
            this.mLock.unlock();
            return null;
        }
    }

    public void setContext(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 91179, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 91179, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        try {
            this.mContext = context;
            this.mLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.mLock.unlock();
            throw th2;
        }
    }

    public void setListener(DataLoaderListener dataLoaderListener) {
        if (PatchProxy.isSupport(new Object[]{dataLoaderListener}, this, changeQuickRedirect, false, 91178, new Class[]{DataLoaderListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataLoaderListener}, this, changeQuickRedirect, false, 91178, new Class[]{DataLoaderListener.class}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        try {
            this.mListener = dataLoaderListener;
            this.mLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.mLock.unlock();
            throw th2;
        }
    }

    public void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        if (PatchProxy.isSupport(new Object[]{libraryLoaderProxy}, this, changeQuickRedirect, false, 91180, new Class[]{LibraryLoaderProxy.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{libraryLoaderProxy}, this, changeQuickRedirect, false, 91180, new Class[]{LibraryLoaderProxy.class}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        if (libraryLoaderProxy != null) {
            try {
                this.mProxy = libraryLoaderProxy;
            } catch (Throwable th) {
                Throwable th2 = th;
                this.mLock.unlock();
                throw th2;
            }
        }
        this.mLock.unlock();
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        if (PatchProxy.isSupport(new Object[]{tTVNetClient}, this, changeQuickRedirect, false, 91177, new Class[]{TTVNetClient.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVNetClient}, this, changeQuickRedirect, false, 91177, new Class[]{TTVNetClient.class}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        try {
            this.mNetClient = tTVNetClient;
            this.mLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.mLock.unlock();
            throw th2;
        }
    }

    private DataLoaderCacheFileInfo _getFileInfoModel(String str) {
        DataLoaderCacheFileInfo dataLoaderCacheFileInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91209, new Class[]{String.class}, DataLoaderCacheFileInfo.class)) {
            return (DataLoaderCacheFileInfo) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91209, new Class[]{String.class}, DataLoaderCacheFileInfo.class);
        }
        DataLoaderCacheFileInfo dataLoaderCacheFileInfo2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str2.split(",");
        if (split.length < 3) {
            return null;
        }
        try {
            long longValue = Long.valueOf(split[0]).longValue();
            long longValue2 = Long.valueOf(split[1]).longValue();
            String str3 = split[2];
            if (longValue2 > 0) {
                try {
                    dataLoaderCacheFileInfo = new DataLoaderCacheFileInfo();
                } catch (Exception e2) {
                    e = e2;
                    TTVideoEngineLog.d("DataLoaderHelper", e.toString());
                    return dataLoaderCacheFileInfo2;
                }
                try {
                    dataLoaderCacheFileInfo.mCacheSizeFromZero = longValue;
                    dataLoaderCacheFileInfo.mMediaSize = longValue2;
                    dataLoaderCacheFileInfo.mLocalFilePath = str3;
                    dataLoaderCacheFileInfo2 = dataLoaderCacheFileInfo;
                } catch (Exception e3) {
                    e = e3;
                    dataLoaderCacheFileInfo2 = dataLoaderCacheFileInfo;
                    TTVideoEngineLog.d("DataLoaderHelper", e.toString());
                    return dataLoaderCacheFileInfo2;
                }
            }
        } catch (Exception e4) {
            e = e4;
            TTVideoEngineLog.d("DataLoaderHelper", e.toString());
            return dataLoaderCacheFileInfo2;
        }
        return dataLoaderCacheFileInfo2;
    }

    private DataLoaderTaskProgressInfo _progressInfoString(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91208, new Class[]{String.class}, DataLoaderTaskProgressInfo.class)) {
            return (DataLoaderTaskProgressInfo) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91208, new Class[]{String.class}, DataLoaderTaskProgressInfo.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            String[] split = str.split(",");
            if (split.length < 4) {
                return null;
            }
            try {
                long longValue = Long.valueOf(split[0]).longValue();
                long longValue2 = Long.valueOf(split[1]).longValue();
                String str2 = split[2];
                String str3 = split[3];
                DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = new DataLoaderTaskProgressInfo();
                dataLoaderTaskProgressInfo.mCacheSizeFromZero = longValue;
                dataLoaderTaskProgressInfo.mMediaSize = longValue2;
                dataLoaderTaskProgressInfo.mKey = str2;
                dataLoaderTaskProgressInfo.mLocalFilePath = str3;
                DataLoaderTaskItem itemForKey = this.mAlltasks.itemForKey(str2);
                if (itemForKey != null) {
                    dataLoaderTaskProgressInfo.mVideoId = itemForKey.mVideoId;
                    dataLoaderTaskProgressInfo.mResolution = itemForKey.mResolution;
                    dataLoaderTaskProgressInfo.mDecryptionKey = itemForKey.mDecryptionKey;
                }
                if (longValue2 == longValue) {
                    this.mAlltasks.popItem(str2);
                }
                return dataLoaderTaskProgressInfo;
            } catch (Exception e2) {
                TTVideoEngineLog.d("DataLoaderHelper", e2.toString());
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] _removeRepeatUrls(java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r5 = 0
            r6 = 91202(0x16442, float:1.27801E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 91202(0x16442, float:1.27801E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String[]> r16 = java.lang.String[].class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0039:
            if (r0 == 0) goto L_0x0080
            int r2 = r0.length
            if (r2 > r1) goto L_0x003f
            goto L_0x0080
        L_0x003f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r0[r9]
            r2.add(r3)
            r3 = 1
        L_0x004a:
            int r4 = r0.length
            if (r3 >= r4) goto L_0x0076
            r4 = r0[r3]
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            int r6 = r2.size()
            int r6 = r6 - r1
        L_0x0056:
            if (r6 < 0) goto L_0x006a
            java.lang.Object r7 = r2.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0067
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x006a
        L_0x0067:
            int r6 = r6 + -1
            goto L_0x0056
        L_0x006a:
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0073
            r2.add(r4)
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x004a
        L_0x0076:
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.toArray(r0)
            return r0
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper._removeRepeatUrls(java.lang.String[]):java.lang.String[]");
    }

    private boolean _supportProxy(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91201, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91201, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("http://127.0.0.1") || lowerCase.startsWith("http://localhost") || lowerCase.startsWith("file://") || lowerCase.startsWith("/") || lowerCase.endsWith(".mpd") || lowerCase.contains(".mpd?") || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8")) {
                return false;
            }
            return true;
        }
    }

    public void _exectTask(DataLoaderTaskItem dataLoaderTaskItem) {
        String[] strArr;
        if (PatchProxy.isSupport(new Object[]{dataLoaderTaskItem}, this, changeQuickRedirect, false, 91205, new Class[]{DataLoaderTaskItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataLoaderTaskItem}, this, changeQuickRedirect, false, 91205, new Class[]{DataLoaderTaskItem.class}, Void.TYPE);
        } else if (dataLoaderTaskItem == null) {
            _startExecuteTask();
        } else {
            this.mExecuteTasks.popItem(dataLoaderTaskItem.mKey);
            if (dataLoaderTaskItem.mResponseData != null || (dataLoaderTaskItem.mdirectUrls != null && dataLoaderTaskItem.mdirectUrls.length > 0)) {
                if (dataLoaderTaskItem.mResponseData != null) {
                    VideoInfo videoInfo = dataLoaderTaskItem.mResponseData.getVideoInfo(dataLoaderTaskItem.mResolution);
                    int index = dataLoaderTaskItem.mResolution.getIndex();
                    Resolution[] allResolutions = Resolution.getAllResolutions();
                    int length = ((allResolutions.length + index) - 1) % allResolutions.length;
                    while (true) {
                        if (length == index || videoInfo != null) {
                            break;
                        }
                        Resolution resolution = allResolutions[length];
                        VideoInfo videoInfo2 = dataLoaderTaskItem.mResponseData.getVideoInfo(resolution);
                        if (videoInfo2 != null) {
                            dataLoaderTaskItem.mResolution = resolution;
                            videoInfo = videoInfo2;
                            break;
                        }
                        length = ((length + allResolutions.length) - 1) % allResolutions.length;
                        videoInfo = videoInfo2;
                    }
                    String str = null;
                    if (videoInfo != null) {
                        strArr = videoInfo.mURLs;
                    } else {
                        strArr = null;
                    }
                    if (videoInfo != null) {
                        str = videoInfo.mFileHash;
                    }
                    dataLoaderTaskItem.mProxyUrl = proxyQuary(str, dataLoaderTaskItem.mVideoId, strArr);
                    if (!TextUtils.isEmpty(dataLoaderTaskItem.mProxyUrl)) {
                        this.mInnerDataLoader.preloadResource(dataLoaderTaskItem.mProxyUrl, (int) dataLoaderTaskItem.mPreloadSize);
                    }
                } else if (dataLoaderTaskItem.mdirectUrls != null && dataLoaderTaskItem.mdirectUrls.length > 0) {
                    dataLoaderTaskItem.mProxyUrl = proxyQuary(dataLoaderTaskItem.mKey, dataLoaderTaskItem.mVideoId, dataLoaderTaskItem.mdirectUrls);
                    if (!TextUtils.isEmpty(dataLoaderTaskItem.mProxyUrl)) {
                        this.mInnerDataLoader.preloadResource(dataLoaderTaskItem.mProxyUrl, (int) dataLoaderTaskItem.mPreloadSize);
                    }
                }
                _startExecuteTask();
                return;
            }
            _startExecuteTask();
        }
    }

    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo2 = aVMDLDataLoaderNotifyInfo;
        if (PatchProxy.isSupport(new Object[]{aVMDLDataLoaderNotifyInfo2}, this, changeQuickRedirect, false, 91207, new Class[]{AVMDLDataLoaderNotifyInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVMDLDataLoaderNotifyInfo2}, this, changeQuickRedirect, false, 91207, new Class[]{AVMDLDataLoaderNotifyInfo.class}, Void.TYPE);
        } else if (aVMDLDataLoaderNotifyInfo2 != null && this.mListener != null) {
            switch (aVMDLDataLoaderNotifyInfo2.what) {
                case 0:
                    this.mListener.onLogInfo(0, aVMDLDataLoaderNotifyInfo2.logType, aVMDLDataLoaderNotifyInfo2.jsonLog);
                    return;
                case 1:
                    this.mListener.onLogInfo(1, aVMDLDataLoaderNotifyInfo2.logType, aVMDLDataLoaderNotifyInfo2.jsonLog);
                    return;
                case 2:
                    this.mListener.onNotify(2, aVMDLDataLoaderNotifyInfo2.code, aVMDLDataLoaderNotifyInfo2.parameter, aVMDLDataLoaderNotifyInfo2.logInfo);
                    return;
                case 3:
                    this.mListener.onTaskProgress(_progressInfoString(aVMDLDataLoaderNotifyInfo2.logInfo));
                    return;
                case 4:
                    this.mListener.onTaskProgress(_progressInfoString(aVMDLDataLoaderNotifyInfo2.logInfo));
                    return;
                case 5:
                    this.mListener.onNotify(20, aVMDLDataLoaderNotifyInfo2.code, aVMDLDataLoaderNotifyInfo2.parameter, aVMDLDataLoaderNotifyInfo2.logInfo);
                    return;
                case 6:
                    try {
                        DataLoaderCDNLog dataLoaderCDNLog = new DataLoaderCDNLog(aVMDLDataLoaderNotifyInfo2.jsonLog);
                        this.mListener.onNotifyCDNLog(dataLoaderCDNLog);
                        TTVideoEngineLog.d("avmdlcdnlog", String.format("receive log %s json:%s", new Object[]{dataLoaderCDNLog, aVMDLDataLoaderNotifyInfo2.jsonLog.toString()}));
                        return;
                    } catch (Exception unused) {
                        break;
                    }
            }
        }
    }

    public void addTask(String str, PreloaderVidItem preloaderVidItem) {
        if (PatchProxy.isSupport(new Object[]{str, preloaderVidItem}, this, changeQuickRedirect, false, 91186, new Class[]{String.class, PreloaderVidItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, preloaderVidItem}, this, changeQuickRedirect, false, 91186, new Class[]{String.class, PreloaderVidItem.class}, Void.TYPE);
        } else if (this.mState == 0) {
            if (TextUtils.isEmpty(preloaderVidItem.mVideoId)) {
                TTVideoEngineLog.d("DataLoaderHelper", "videoId invalid.");
                return;
            }
            this.mLock.lock();
            try {
                _addTask(str, preloaderVidItem.mVideoId, null, preloaderVidItem.mPreloadSize, preloaderVidItem);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void setStringValue(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91190, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91190, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        if (i == 0) {
            try {
                this.mConfigure.mCacheDir = str;
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        this.mLock.unlock();
    }

    public void setIntValue(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91189, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91189, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mLock.lock();
        if (i == 1) {
            try {
                this.mConfigure.mMaxCacheSize = i2;
            } finally {
                this.mLock.unlock();
            }
        } else if (i == 2) {
            this.mConfigure.mRWTimeOut = i2;
        } else if (i == 3) {
            this.mConfigure.mOpenTimeOut = i2;
        } else if (i == 4) {
            this.mConfigure.mPreloadParallelNum = i2;
        } else if (i == 5) {
            this.mConfigure.mPreloadStrategy = i2;
        } else if (i == 6) {
            this.mConfigure.mPreloadWaitListType = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String proxyQuary(java.lang.String r15, java.lang.String r16, java.lang.String[] r17) {
        /*
            r14 = this;
            r7 = r14
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r15
            r12 = 1
            r0[r12] = r16
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3 = 0
            r4 = 91200(0x16440, float:1.27798E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0052
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            r0[r12] = r16
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 91200(0x16440, float:1.27798E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0052:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r1 = 0
            if (r0 != 0) goto L_0x00fc
            if (r9 == 0) goto L_0x00fc
            int r0 = r9.length
            if (r0 > 0) goto L_0x0060
            goto L_0x00fc
        L_0x0060:
            r0 = 0
        L_0x0061:
            int r2 = r9.length
            if (r0 >= r2) goto L_0x0070
            r2 = r9[r0]
            boolean r2 = r14._supportProxy(r2)
            if (r2 != 0) goto L_0x006d
            return r1
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0070:
            java.lang.String[] r0 = r14._removeRepeatUrls(r9)
            java.lang.String r2 = com.ss.ttvideoengine.utils.TTHelper.encodeUrl(r15)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x007f
            return r1
        L_0x007f:
            boolean r3 = android.text.TextUtils.isEmpty(r16)
            if (r3 == 0) goto L_0x0087
            r8 = r15
            goto L_0x0089
        L_0x0087:
            r8 = r16
        L_0x0089:
            java.lang.String r3 = com.ss.ttvideoengine.utils.TTHelper.encodeUrl(r8)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0095
            java.lang.String r3 = "videoId"
        L_0x0095:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = "?rk="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "&k="
            r4.append(r3)
            r4.append(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L_0x00af:
            int r3 = r0.length
            if (r11 >= r3) goto L_0x00ed
            r3 = r0[r11]
            java.lang.String r3 = com.ss.ttvideoengine.utils.TTHelper.encodeUrl(r3)
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x00d3
            java.lang.String r6 = "&u"
            r5.append(r6)
            r5.append(r11)
            java.lang.String r6 = "="
            r5.append(r6)
            r5.append(r3)
        L_0x00d3:
            int r3 = r4.length()
            int r6 = r2.length()
            int r3 = r3 + r6
            int r6 = r5.length()
            int r3 = r3 + r6
            int r3 = r3 + 32
            r6 = 3096(0xc18, float:4.338E-42)
            if (r3 > r6) goto L_0x00ed
            r2.append(r5)
            int r11 = r11 + 1
            goto L_0x00af
        L_0x00ed:
            int r0 = r2.length()
            if (r0 > 0) goto L_0x00f4
            return r1
        L_0x00f4:
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            return r0
        L_0x00fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.proxyQuary(java.lang.String, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public void addTask(String str, String str2, String str3, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, new Long(j2)}, this, changeQuickRedirect, false, 91187, new Class[]{String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, new Long(j2)}, this, changeQuickRedirect, false, 91187, new Class[]{String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
        } else if (this.mState == 0) {
            if (TextUtils.isEmpty(str3)) {
                TTVideoEngineLog.d("DataLoaderHelper", "url invalid.");
                return;
            }
            this.mLock.lock();
            try {
                _addTask(str, str2, new String[]{str3}, j, null);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addTask(java.lang.String r18, java.lang.String r19, java.lang.String[] r20, long r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r20
            r10 = r21
            r12 = 4
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r13 = 0
            r1[r13] = r18
            r14 = 1
            r1[r14] = r19
            r15 = 2
            r1[r15] = r9
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            r16 = 3
            r1[r16] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r13] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r14] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r15] = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r16] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91188(0x16434, float:1.27782E-40)
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006c
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r13] = r18
            r1[r14] = r19
            r1[r15] = r9
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            r1[r16] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 91188(0x16434, float:1.27782E-40)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r14] = r0
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r15] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r16] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x006c:
            int r1 = r8.mState
            if (r1 == 0) goto L_0x0071
            return
        L_0x0071:
            if (r9 == 0) goto L_0x0098
            int r1 = r9.length
            if (r1 != 0) goto L_0x0077
            goto L_0x0098
        L_0x0077:
            java.util.concurrent.locks.ReentrantLock r1 = r8.mLock
            r1.lock()
            r7 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r1._addTask(r2, r3, r4, r5, r7)     // Catch:{ all -> 0x0090 }
            java.util.concurrent.locks.ReentrantLock r0 = r8.mLock
            r0.unlock()
            return
        L_0x0090:
            r0 = move-exception
            r1 = r0
            java.util.concurrent.locks.ReentrantLock r0 = r8.mLock
            r0.unlock()
            throw r1
        L_0x0098:
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "urls invalid."
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.addTask(java.lang.String, java.lang.String, java.lang.String[], long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _addTask(java.lang.String r21, java.lang.String r22, java.lang.String[] r23, long r24, com.ss.ttvideoengine.PreloaderVidItem r26) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r13 = r26
            r14 = 5
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r15 = 0
            r0[r15] = r8
            r16 = 1
            r0[r16] = r9
            r17 = 2
            r0[r17] = r10
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r18 = 3
            r0[r18] = r1
            r19 = 4
            r0[r19] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r16] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r17] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r18] = r1
            java.lang.Class<com.ss.ttvideoengine.PreloaderVidItem> r1 = com.ss.ttvideoengine.PreloaderVidItem.class
            r5[r19] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 91203(0x16443, float:1.27803E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r8
            r0[r16] = r9
            r0[r17] = r10
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r0[r18] = r1
            r0[r19] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 91203(0x16443, float:1.27803E-40)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r16] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r17] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r18] = r1
            java.lang.Class<com.ss.ttvideoengine.PreloaderVidItem> r1 = com.ss.ttvideoengine.PreloaderVidItem.class
            r5[r19] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0082:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "key invalid."
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0, r1)
            return
        L_0x0090:
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r7.mExecuteTasks
            boolean r0 = r0.containItem(r8)
            if (r0 != 0) goto L_0x00df
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r7.mPreloadTasks
            boolean r0 = r0.containItem(r8)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00df
        L_0x00a1:
            com.ss.ttvideoengine.Resolution r0 = com.ss.ttvideoengine.Resolution.Undefine
            if (r13 == 0) goto L_0x00ab
            com.ss.ttvideoengine.Resolution r1 = r13.mResolution
            if (r1 == 0) goto L_0x00ab
            com.ss.ttvideoengine.Resolution r0 = r13.mResolution
        L_0x00ab:
            r2 = r0
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem r6 = new com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem
            r6.<init>()
            com.ss.ttvideoengine.net.TTVNetClient r5 = r7.mNetClient
            r0 = r6
            r1 = r21
            r3 = r24
            r0.setUp(r1, r2, r3, r5)
            r6.mVideoId = r9
            r6.mdirectUrls = r10
            r6.mVidItem = r13
            com.ss.ttvideoengine.DataLoaderHelper$MyTaskListener r0 = new com.ss.ttvideoengine.DataLoaderHelper$MyTaskListener
            r0.<init>(r7)
            r6.setListener(r0)
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r7.mPreloadTasks
            r0.enqueueItem(r6)
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r7.mAlltasks
            boolean r0 = r0.containItem(r8)
            if (r0 != 0) goto L_0x00db
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r7.mAlltasks
            r0.enqueueItem(r6)
        L_0x00db:
            r20._startExecuteTask()
            return
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper._addTask(java.lang.String, java.lang.String, java.lang.String[], long, com.ss.ttvideoengine.PreloaderVidItem):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String proxyUrl(java.lang.String r20, java.lang.String r21, java.lang.String[] r22, com.ss.ttvideoengine.Resolution r23, java.lang.String r24) {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = 5
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r14 = 0
            r1[r14] = r0
            r15 = 1
            r1[r15] = r9
            r16 = 2
            r1[r16] = r10
            r17 = 3
            r1[r17] = r11
            r18 = 4
            r1[r18] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r14] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r15] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r16] = r2
            java.lang.Class<com.ss.ttvideoengine.Resolution> r2 = com.ss.ttvideoengine.Resolution.class
            r6[r17] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r18] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 91199(0x1643f, float:1.27797E-40)
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x007a
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r14] = r0
            r1[r15] = r9
            r1[r16] = r10
            r1[r17] = r11
            r1[r18] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 91199(0x1643f, float:1.27797E-40)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r14] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r15] = r0
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r16] = r0
            java.lang.Class<com.ss.ttvideoengine.Resolution> r0 = com.ss.ttvideoengine.Resolution.class
            r6[r17] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r18] = r0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x007a:
            int r1 = r8.mState
            r2 = 0
            if (r1 == 0) goto L_0x0080
            return r2
        L_0x0080:
            boolean r1 = android.text.TextUtils.isEmpty(r20)
            if (r1 != 0) goto L_0x00fe
            if (r10 == 0) goto L_0x00fe
            int r1 = r10.length
            if (r1 > 0) goto L_0x008c
            goto L_0x00fe
        L_0x008c:
            int r1 = r10.length
            if (r14 >= r1) goto L_0x009d
            r1 = r10[r14]
            boolean r1 = r8._supportProxy(r1)
            if (r1 != 0) goto L_0x009a
            r0 = r10[r14]
            return r0
        L_0x009a:
            int r14 = r14 + 1
            goto L_0x008c
        L_0x009d:
            java.util.concurrent.locks.ReentrantLock r1 = r8.mLock
            r1.lock()
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r8.mInnerDataLoader     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.getLocalAddr()     // Catch:{ all -> 0x00f7 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00f7 }
            if (r3 == 0) goto L_0x00b4
            java.util.concurrent.locks.ReentrantLock r0 = r8.mLock
            r0.unlock()
            return r2
        L_0x00b4:
            java.lang.String r3 = r19.proxyQuary(r20, r21, r22)     // Catch:{ all -> 0x00f7 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00f7 }
            if (r4 == 0) goto L_0x00c4
            java.util.concurrent.locks.ReentrantLock r0 = r8.mLock
            r0.unlock()
            return r2
        L_0x00c4:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x00f7 }
            r2.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "http://"
            r2.append(r4)     // Catch:{ all -> 0x00f7 }
            r2.append(r1)     // Catch:{ all -> 0x00f7 }
            r2.append(r3)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.locks.ReentrantLock r2 = r8.mLock
            r2.unlock()
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r2 = r8.mAlltasks
            r2.popItem(r0)
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem r2 = new com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem
            r2.<init>()
            r2.mKey = r0
            r2.mVideoId = r9
            r2.mProxyUrl = r1
            r2.mResolution = r11
            r2.mDecryptionKey = r12
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r0 = r8.mAlltasks
            r0.enqueueItem(r2)
            return r1
        L_0x00f7:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r8.mLock
            r1.unlock()
            throw r0
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.proxyUrl(java.lang.String, java.lang.String, java.lang.String[], com.ss.ttvideoengine.Resolution, java.lang.String):java.lang.String");
    }
}
