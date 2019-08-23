package com.ss.android.ugc.aweme.w.a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import java.util.LinkedList;
import java.util.List;

public abstract class a<T> implements WeakHandler.IHandler, c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public T mData;
    protected WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    protected List<p> mNotifyListeners;
    public int mQueryType = 1;

    public void clearAllNotifyListener() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60639, new Class[0], Void.TYPE);
            return;
        }
        if (this.mNotifyListeners != null) {
            this.mNotifyListeners.clear();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60641, new Class[0], Void.TYPE);
            return;
        }
        clearAllNotifyListener();
    }

    public void handleData(T t) {
        this.mData = t;
    }

    public void clearNotifyListener(p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, changeQuickRedirect, false, 60638, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, changeQuickRedirect, false, 60638, new Class[]{p.class}, Void.TYPE);
            return;
        }
        if (!(pVar == null || this.mNotifyListeners == null)) {
            this.mNotifyListeners.remove(pVar);
        }
    }

    public void addNotifyListener(p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, changeQuickRedirect, false, 60637, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, changeQuickRedirect, false, 60637, new Class[]{p.class}, Void.TYPE);
        } else if (pVar != null) {
            if (this.mNotifyListeners == null) {
                this.mNotifyListeners = new LinkedList();
            }
            this.mNotifyListeners.add(pVar);
        } else {
            throw new NullPointerException("INotifyListener could not be null");
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 60640, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 60640, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (p a2 : this.mNotifyListeners) {
                    a2.a((Exception) message.obj);
                }
            }
            return;
        }
        handleData(message.obj);
        if (this.mNotifyListeners != null) {
            for (p b2 : this.mNotifyListeners) {
                b2.b();
            }
        }
    }
}
