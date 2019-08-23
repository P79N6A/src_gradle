package com.google.firebase.iid;

import android.app.Service;
import android.support.annotation.VisibleForTesting;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;

public abstract class zzb extends Service {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f24903a = h.a(m.a(p.FIXED).a(1).a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f24904b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private int f24905c = 0;
}
