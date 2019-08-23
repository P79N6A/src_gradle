package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import io.reactivex.subjects.PublishSubject;

public class TimeOutRefreshViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14475a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14476b;

    /* renamed from: c  reason: collision with root package name */
    public PublishSubject<Object> f14477c = PublishSubject.create();

    /* renamed from: d  reason: collision with root package name */
    public long f14478d = Long.MAX_VALUE;
}
