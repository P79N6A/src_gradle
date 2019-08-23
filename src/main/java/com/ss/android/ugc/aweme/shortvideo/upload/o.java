package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71031a;

    /* renamed from: b  reason: collision with root package name */
    private static final o f71032b = new o();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f71033c = new ConcurrentLinkedQueue<>();

    public static o a() {
        return f71032b;
    }

    public final ArrayList<String> b() {
        if (PatchProxy.isSupport(new Object[0], this, f71031a, false, 80791, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f71031a, false, 80791, new Class[0], ArrayList.class);
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f71033c;
        concurrentLinkedQueue.offer(System.currentTimeMillis() + ":report");
        ArrayList<String> arrayList = new ArrayList<>(this.f71033c);
        this.f71033c.clear();
        return arrayList;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f71031a, false, 80790, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71031a, false, 80790, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f71033c.size() >= 30) {
            this.f71033c.poll();
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f71033c;
        concurrentLinkedQueue.offer(System.currentTimeMillis() + ":" + str);
    }
}
