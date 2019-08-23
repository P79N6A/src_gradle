package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.LocalAliasTagsManager;
import com.vivo.push.model.SubscribeAppInfo;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.o;
import java.util.ArrayList;
import java.util.List;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnvarnishedMessage f81598a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager.LocalMessageCallback f81599b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81600c;

    public final void run() {
        int targetType = this.f81598a.getTargetType();
        String tragetContent = this.f81598a.getTragetContent();
        if (!TextUtils.isEmpty(tragetContent) && targetType != 0) {
            switch (targetType) {
                case 3:
                    SubscribeAppInfo subscribeAppInfo = this.f81600c.mSubscribeAppAliasManager.getSubscribeAppInfo();
                    if (subscribeAppInfo == null || subscribeAppInfo.getTargetStatus() != 1 || !subscribeAppInfo.getName().equals(tragetContent)) {
                        p.a().b("push_cache_sp", tragetContent);
                        o.a("LocalAliasTagsManager", tragetContent + " has ignored ; current Alias is " + subscribeAppInfo);
                        return;
                    }
                case 4:
                    List<String> subscribeTags = this.f81600c.mSubscribeAppTagManager.getSubscribeTags();
                    if (subscribeTags == null || !subscribeTags.contains(tragetContent)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(tragetContent);
                        p.a().b("push_cache_sp", arrayList);
                        o.a("LocalAliasTagsManager", tragetContent + " has ignored ; current tags is " + subscribeTags);
                        return;
                    }
            }
        }
        this.f81600c.mHandler.post(new k(this));
    }

    j(LocalAliasTagsManager localAliasTagsManager, UnvarnishedMessage unvarnishedMessage, LocalAliasTagsManager.LocalMessageCallback localMessageCallback) {
        this.f81600c = localAliasTagsManager;
        this.f81598a = unvarnishedMessage;
        this.f81599b = localMessageCallback;
    }
}
