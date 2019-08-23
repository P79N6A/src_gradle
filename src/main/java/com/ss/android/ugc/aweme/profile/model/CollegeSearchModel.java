package com.ss.android.ugc.aweme.profile.model;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.api.CollegeApiManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeSearchModel implements WeakHandler.IHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean isSearching;
    private Map<String, CollegeModel> mCollegeCache;
    private String mCurrentSchool;
    private final WeakHandler mHandler;
    public SearchCollegeListener mSearchListener;

    public interface SearchCollegeListener {
        void onCheckCollegeResult(boolean z);

        void onSearchCollegeFail();

        void onSearchCollegeSuccess(List<String> list);
    }

    public CollegeSearchModel() {
        this(null);
    }

    public CollegeSearchModel(SearchCollegeListener searchCollegeListener) {
        this.mHandler = new WeakHandler(Looper.getMainLooper(), this);
        this.mCollegeCache = new HashMap();
        this.mSearchListener = searchCollegeListener;
    }

    public void checkHasCollege(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 67474, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 67474, new Class[]{String.class}, Void.TYPE);
        } else if (!this.isSearching) {
            this.isSearching = true;
            this.mCurrentSchool = str;
            if (this.mCollegeCache == null || this.mCollegeCache.get(str) == null || CollectionUtils.isEmpty(this.mCollegeCache.get(str).collegeList)) {
                CollegeApiManager.a(this.mHandler, str, 1);
                return;
            }
            this.mCollegeCache.get(str);
            if (this.mSearchListener != null) {
                this.mSearchListener.onCheckCollegeResult(true);
            }
            this.isSearching = false;
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 67476, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 67476, new Class[]{Message.class}, Void.TYPE);
        } else if (message.obj instanceof Exception) {
            handleException((Exception) message.obj, message.what);
        } else {
            handleData(message.obj, message.what);
        }
    }

    public void searchCollege(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 67475, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 67475, new Class[]{String.class}, Void.TYPE);
        } else if (!this.isSearching) {
            this.isSearching = true;
            this.mCurrentSchool = str;
            if (this.mCollegeCache == null || this.mCollegeCache.get(str) == null || CollectionUtils.isEmpty(this.mCollegeCache.get(str).collegeList)) {
                CollegeApiManager.a(this.mHandler, str, 0);
                return;
            }
            List<String> list = this.mCollegeCache.get(str).collegeList;
            if (this.mSearchListener != null) {
                this.mSearchListener.onSearchCollegeSuccess(list);
            }
            this.isSearching = false;
        }
    }

    private void handleException(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67477, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67477, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            if (this.mSearchListener != null) {
                this.mSearchListener.onSearchCollegeFail();
            }
        } else if (this.mSearchListener != null) {
            this.mSearchListener.onCheckCollegeResult(false);
        }
        this.isSearching = false;
    }

    private void handleData(Object obj, int i) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67478, new Class[]{Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67478, new Class[]{Object.class, Integer.TYPE}, Void.TYPE);
        } else if (this.mSearchListener == null) {
            this.isSearching = false;
        } else {
            CollegeModel collegeModel = (CollegeModel) obj;
            List<String> list = null;
            if (collegeModel != null) {
                list = collegeModel.collegeList;
            }
            if (!CollectionUtils.isEmpty(list)) {
                this.mCollegeCache.put(this.mCurrentSchool, collegeModel);
                if (i == 0) {
                    this.mSearchListener.onSearchCollegeSuccess(list);
                } else {
                    this.mSearchListener.onCheckCollegeResult(true);
                }
            } else if (i == 0) {
                this.mSearchListener.onSearchCollegeFail();
            } else {
                this.mSearchListener.onCheckCollegeResult(false);
            }
            this.isSearching = false;
        }
    }
}
