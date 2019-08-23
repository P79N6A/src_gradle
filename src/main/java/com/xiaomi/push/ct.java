package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class ct extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bl f81912a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct(bl blVar, Looper looper) {
        super(looper);
        this.f81912a = blVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case BaseLoginOrRegisterActivity.o:
                this.f81912a.c();
                return;
            case 102:
                bm.a().b();
                return;
            default:
                return;
        }
    }
}
