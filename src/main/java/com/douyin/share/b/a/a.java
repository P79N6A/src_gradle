package com.douyin.share.b.a;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.image.b;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a extends com.douyin.share.a.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f23165a = h.a(m.a(p.FIXED).a(1).a());

    /* renamed from: b  reason: collision with root package name */
    public String f23166b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f23167c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f23168d = f23165a;

    /* renamed from: e  reason: collision with root package name */
    private String f23169e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23170f = "";
    private final String g = "client_share";

    public final String d() {
        return "100290348";
    }

    public final Activity a() {
        return this.f23167c;
    }

    public final String c() {
        return this.f23169e;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f23166b)) {
            return "wx76fdd06dde311af3";
        }
        return this.f23166b;
    }

    public final a a(Activity activity) {
        this.f23167c = activity;
        new b(activity);
        this.f23169e = b.a();
        return this;
    }
}
