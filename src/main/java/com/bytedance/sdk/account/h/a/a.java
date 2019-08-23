package com.bytedance.sdk.account.h.a;

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
    protected static f f22413a = f.a();

    /* renamed from: b  reason: collision with root package name */
    protected static final AtomicInteger f22414b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    protected WeakHandler f22415c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<e> f22416d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f22417e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f22418f;
    private String g;

    public boolean b() {
        return this.f22418f;
    }

    public void a() {
        this.f22417e = true;
        interrupt();
    }

    public void d() {
        this.f22415c.removeMessages(0);
    }

    public void c() {
        d();
        this.f22415c.sendEmptyMessageDelayed(0, 2000);
    }

    public void run() {
        String str;
        String str2;
        Process.setThreadPriority(10);
        while (true) {
            try {
                e take = this.f22416d.take();
                d();
                if (take != null && (take instanceof c)) {
                    c cVar = (c) take;
                    try {
                        this.f22418f = true;
                        a(cVar);
                        if (cVar.a()) {
                            this.f22418f = false;
                        } else {
                            str2 = Thread.currentThread().getName();
                            try {
                                str = cVar.f22426d;
                                try {
                                    if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                                        Thread.currentThread().setName(str);
                                    }
                                    cVar.run();
                                    c();
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                str = null;
                            }
                            this.f22418f = false;
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
                if (this.f22417e) {
                    return;
                }
            }
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            cVar.g();
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 0) {
                    f22413a.d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(BlockingQueue<e> blockingQueue, String str, String str2) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.f22415c = new WeakHandler(Looper.getMainLooper(), this);
        this.f22417e = false;
        this.f22418f = false;
        this.g = "ApiDispatcher";
        this.f22416d = blockingQueue;
        this.g = str2;
    }
}
