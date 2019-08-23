package com.ali.auth.third.core.task;

import com.ali.auth.third.core.callback.InitResultCallback;
import com.ali.auth.third.core.trace.SDKLogger;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InitResultCallback[] f4974a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4975b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4976c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f4977d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f4978e;

    c(a aVar, InitResultCallback[] initResultCallbackArr, boolean z, int i, String str) {
        this.f4978e = aVar;
        this.f4974a = initResultCallbackArr;
        this.f4975b = z;
        this.f4976c = i;
        this.f4977d = str;
    }

    public void run() {
        for (InitResultCallback initResultCallback : this.f4974a) {
            try {
                if (this.f4975b) {
                    initResultCallback.onSuccess();
                } else {
                    initResultCallback.onFailure(this.f4976c, this.f4977d);
                }
            } catch (Exception e2) {
                SDKLogger.e("kernel", e2.getMessage(), e2);
            }
        }
    }
}
