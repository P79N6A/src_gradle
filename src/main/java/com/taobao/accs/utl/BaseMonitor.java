package com.taobao.accs.utl;

import anet.channel.statist.StatObject;

public abstract class BaseMonitor extends StatObject {

    /* renamed from: a  reason: collision with root package name */
    private boolean f79093a;

    public String checkString(String str) {
        return str == null ? "none" : str;
    }

    public boolean beforeCommit() {
        if (this.f79093a) {
            return false;
        }
        this.f79093a = true;
        return true;
    }
}
