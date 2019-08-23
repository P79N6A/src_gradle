package com.ali.auth.third.core.task;

import android.app.Activity;
import com.ali.auth.third.core.MemberSDK;
import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.message.MessageUtils;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.ReflectionUtils;

public class InitWaitTask extends TaskWithDialog<Void, Void, Void> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Runnable f4966a;

    /* renamed from: b  reason: collision with root package name */
    private String f4967b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f4968c;
    protected FailureCallback failureCallback;

    public InitWaitTask(Activity activity, FailureCallback failureCallback2, Runnable runnable) {
        this(activity, failureCallback2, runnable, null);
    }

    public InitWaitTask(Activity activity, FailureCallback failureCallback2, Runnable runnable, String str) {
        super(activity);
        this.f4966a = runnable;
        this.failureCallback = failureCallback2;
        this.f4967b = str;
        this.f4968c = ReflectionUtils.loadClassQuietly("com.alibaba.sdk.android.session.CredentialService");
    }

    /* access modifiers changed from: protected */
    public Void asyncExecute(Void... voidArr) {
        Boolean checkInitStatus = KernelContext.checkInitStatus();
        if (checkInitStatus == null) {
            CommonUtils.onFailure(this.failureCallback, MessageUtils.createMessage(10012, new Object[0]));
        } else if (!checkInitStatus.booleanValue()) {
            MemberSDK.init(KernelContext.context, new e(this));
        } else {
            if (this.f4968c != null) {
                Object a2 = KernelContext.serviceRegistry.a(this.f4968c, null);
                if (a2 != null) {
                    ReflectionUtils.invoke("com.alibaba.sdk.android.session.CredentialService", "init", null, a2, null);
                }
            }
            this.f4966a.run();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void doWhenException(Throwable th) {
        CommonUtils.toastSystemException();
    }
}
