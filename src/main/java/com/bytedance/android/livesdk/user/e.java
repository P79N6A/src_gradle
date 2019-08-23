package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.l;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.HashMap;

public interface e {
    @NonNull
    i a();

    Observable<i> a(Context context, i iVar);

    Observable<a> a(b bVar);

    Observable<a> a(d dVar);

    Observable<a> a(k kVar);

    Single<User> a(HashMap<String, String> hashMap);

    String a(long j);

    void a(int i);

    void a(i iVar);

    void a(a aVar);

    void a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z);

    void a(boolean z);

    boolean a(h hVar);

    long b();

    Single<User> b(long j);

    @NonNull
    Observable<i> c(long j);

    boolean c();

    @NonNull
    Flowable<l> d();

    @NonNull
    Observable<a> d(long j);

    Single<i> e();

    @NonNull
    Observable<i> f();

    @NonNull
    Observable<a> g();
}
