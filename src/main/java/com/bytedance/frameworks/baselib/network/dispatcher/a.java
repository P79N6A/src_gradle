package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class a extends Thread implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    protected static RequestQueue f19720a = RequestQueue.getDefaultRequestQueue();

    /* renamed from: b  reason: collision with root package name */
    protected static final AtomicInteger f19721b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    protected WeakHandler f19722c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<IRequest> f19723d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f19724e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f19725f;
    private String g;

    public boolean b() {
        return this.f19725f;
    }

    public void a() {
        this.f19724e = true;
        interrupt();
    }

    public void d() {
        this.f19722c.removeMessages(0);
    }

    public void f() {
        this.f19722c.removeMessages(2);
    }

    public void c() {
        d();
        this.f19722c.sendEmptyMessageDelayed(0, 2000);
    }

    public void e() {
        f();
        this.f19722c.sendEmptyMessageDelayed(2, 2000);
    }

    public void run() {
        String str;
        String str2;
        Process.setThreadPriority(10);
        while (true) {
            try {
                IRequest take = this.f19723d.take();
                d();
                if (take != null && (take instanceof ApiThread)) {
                    ApiThread apiThread = (ApiThread) take;
                    try {
                        this.f19725f = true;
                        a(apiThread);
                        if (apiThread.isCanceled()) {
                            this.f19725f = false;
                        } else {
                            str2 = Thread.currentThread().getName();
                            try {
                                str = apiThread.getName();
                                try {
                                    if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                                        Thread.currentThread().setName(str);
                                    }
                                    apiThread.run();
                                    if (apiThread instanceof c) {
                                        e();
                                    } else {
                                        c();
                                    }
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                str = null;
                            }
                            this.f19725f = false;
                            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                                Thread.currentThread().setName(str2);
                            }
                        }
                    } catch (Throwable unused3) {
                        str2 = null;
                        str = null;
                    }
                }
            } catch (InterruptedException unused4) {
                if (this.f19724e) {
                    return;
                }
            }
        }
    }

    public void a(ApiThread apiThread) {
        if (apiThread != null) {
            apiThread.cancelEnQueueExpireMsg();
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 2) {
                        f19720a.handleShrinkDelayRequestQueueSize();
                    }
                    return;
                }
                f19720a.handleShrinkRequestQueueSize();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(BlockingQueue<IRequest> blockingQueue, String str, String str2) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.f19722c = new WeakHandler(Looper.getMainLooper(), this);
        this.f19724e = false;
        this.f19725f = false;
        this.g = "ApiDispatcher";
        this.f19723d = blockingQueue;
        this.g = str2;
    }
}
