package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vivo.push.cache.ISubscribeAppAliasManager;
import com.vivo.push.cache.ISubscribeAppTagManager;
import com.vivo.push.cache.impl.SubscribeAppAliasManagerImpl;
import com.vivo.push.cache.impl.b;
import com.vivo.push.model.SubscribeAppInfo;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.d;
import com.vivo.push.util.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class LocalAliasTagsManager {
    private static final Object SLOCK = new Object();
    public static final ExecutorService WORK_POOL = d.a("LocalAliasTagsManager");
    private static volatile LocalAliasTagsManager mLocalAliasTagsManager;
    public Context mContext;
    public Handler mHandler = new Handler(Looper.getMainLooper());
    public ISubscribeAppAliasManager mSubscribeAppAliasManager;
    public ISubscribeAppTagManager mSubscribeAppTagManager;

    public interface LocalMessageCallback {
        boolean onNotificationMessageArrived(Context context, UPSNotificationMessage uPSNotificationMessage);

        void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage);
    }

    public List<String> getLocalTags() {
        return this.mSubscribeAppTagManager.getSubscribeTags();
    }

    public String getLocalAlias() {
        SubscribeAppInfo subscribeAppInfo = this.mSubscribeAppAliasManager.getSubscribeAppInfo();
        if (subscribeAppInfo != null) {
            return subscribeAppInfo.getName();
        }
        return null;
    }

    public void init() {
        WORK_POOL.execute(new g(this));
    }

    public void setSubscribeAppAliasManager(ISubscribeAppAliasManager iSubscribeAppAliasManager) {
        this.mSubscribeAppAliasManager = iSubscribeAppAliasManager;
    }

    public void setSubscribeAppTagManager(ISubscribeAppTagManager iSubscribeAppTagManager) {
        this.mSubscribeAppTagManager = iSubscribeAppTagManager;
    }

    public void delLocalAlias(String str) {
        WORK_POOL.execute(new h(this, str));
    }

    public void delLocalTags(ArrayList<String> arrayList) {
        WORK_POOL.execute(new i(this, arrayList));
    }

    public void setLocalAlias(String str) {
        WORK_POOL.execute(new d(this, str));
    }

    public void setLocalTags(ArrayList<String> arrayList) {
        WORK_POOL.execute(new f(this, arrayList));
    }

    private LocalAliasTagsManager(Context context) {
        this.mContext = context;
        this.mSubscribeAppTagManager = new b(context);
        this.mSubscribeAppAliasManager = new SubscribeAppAliasManagerImpl(context);
    }

    public static final LocalAliasTagsManager getInstance(Context context) {
        if (mLocalAliasTagsManager == null) {
            synchronized (SLOCK) {
                if (mLocalAliasTagsManager == null) {
                    mLocalAliasTagsManager = new LocalAliasTagsManager(context.getApplicationContext());
                }
            }
        }
        return mLocalAliasTagsManager;
    }

    public void onReceiverMsg(UnvarnishedMessage unvarnishedMessage, LocalMessageCallback localMessageCallback) {
        WORK_POOL.execute(new j(this, unvarnishedMessage, localMessageCallback));
    }

    public void onDelAlias(List<String> list, String str) {
        if ("push_cache_sp".equals(str)) {
            WORK_POOL.execute(new l(this, list));
        }
    }

    public void onDelTags(List<String> list, String str) {
        if ("push_cache_sp".equals(str)) {
            WORK_POOL.execute(new m(this, list));
        }
    }

    public void onSetAlias(List<String> list, String str) {
        if ("push_cache_sp".equals(str)) {
            WORK_POOL.execute(new n(this, list));
        }
    }

    public void onSetTags(List<String> list, String str) {
        if ("push_cache_sp".equals(str)) {
            WORK_POOL.execute(new e(this, list));
        }
    }

    public boolean onReceiverNotification(UPSNotificationMessage uPSNotificationMessage, LocalMessageCallback localMessageCallback) {
        int targetType = uPSNotificationMessage.getTargetType();
        String tragetContent = uPSNotificationMessage.getTragetContent();
        switch (targetType) {
            case 3:
                SubscribeAppInfo subscribeAppInfo = this.mSubscribeAppAliasManager.getSubscribeAppInfo();
                if (subscribeAppInfo == null || subscribeAppInfo.getTargetStatus() != 1 || !subscribeAppInfo.getName().equals(tragetContent)) {
                    p.a().b("push_cache_sp", tragetContent);
                    o.a("LocalAliasTagsManager", tragetContent + " has ignored ; current Alias is " + subscribeAppInfo);
                    return true;
                }
            case 4:
                List subscribeTags = this.mSubscribeAppTagManager.getSubscribeTags();
                if (subscribeTags == null || !subscribeTags.contains(tragetContent)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(tragetContent);
                    p.a().b("push_cache_sp", arrayList);
                    o.a("LocalAliasTagsManager", tragetContent + " has ignored ; current tags is " + subscribeTags);
                    return true;
                }
        }
        return localMessageCallback.onNotificationMessageArrived(this.mContext, uPSNotificationMessage);
    }
}
