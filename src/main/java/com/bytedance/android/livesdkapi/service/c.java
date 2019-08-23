package com.bytedance.android.livesdkapi.service;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.d.b;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.a.a;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.host.IHostApp;

public interface c {
    Fragment a(com.bytedance.android.livesdkapi.depend.model.a.c cVar, Bundle bundle);

    LiveActivityProxy a(FragmentActivity fragmentActivity, @IHostApp.ActivityType int i);

    b a(Context context, ViewGroup viewGroup);

    h a(long j, Bundle bundle);

    a a(Bundle bundle);

    void a();

    void a(long j, a aVar);

    void a(Context context);

    void a(Context context, String str);

    void a(String str);

    void a(String str, boolean z);

    void a(boolean z);

    boolean a(Context context, Uri uri);

    com.bytedance.android.livesdkapi.b.b b(Bundle bundle);

    e b();

    void b(Context context);

    d c();

    n d();

    g e();

    com.bytedance.android.livesdkapi.depend.d.a.b f();

    Fragment g();

    com.bytedance.android.livesdkapi.depend.d.c h();

    f i();

    com.bytedance.android.livesdkapi.depend.d.e j();
}
