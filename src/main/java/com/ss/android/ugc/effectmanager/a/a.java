package com.ss.android.ugc.effectmanager.a;

import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.ss.android.ugc.effectmanager.g;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public g f77204a;

    /* renamed from: b  reason: collision with root package name */
    public LinkSelector f77205b = new LinkSelector(this);

    public a(@NonNull g gVar) {
        this.f77204a = gVar;
        LinkSelector linkSelector = this.f77205b;
        LinkSelectorConfiguration linkSelectorConfiguration = gVar.u;
        linkSelector.f77519c = linkSelectorConfiguration.mSpeedTimeOut;
        linkSelector.f77520d = linkSelectorConfiguration.mRepeatTime;
        linkSelector.f77521e = linkSelectorConfiguration.mEnableLinkSelector;
        linkSelector.f77522f = linkSelectorConfiguration.mContext;
        linkSelector.g = linkSelectorConfiguration.mSpeedApi;
        linkSelector.h.clear();
        linkSelector.h.addAll(linkSelectorConfiguration.mOriginHosts);
        linkSelector.i = linkSelector.h.get(0).getItemName();
        linkSelector.k = linkSelectorConfiguration.mIsNetworkChangeMonitor;
        linkSelector.j = linkSelectorConfiguration.mIsLazy;
        if (linkSelector.k && linkSelector.f77518b == null && linkSelector.a()) {
            linkSelector.f77518b = new LinkSelector.NetworkChangeReceiver();
            linkSelector.f77522f.registerReceiver(linkSelector.f77518b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
}
