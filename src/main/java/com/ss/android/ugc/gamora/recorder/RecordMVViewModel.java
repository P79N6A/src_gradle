package com.ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordMVViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "enterEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEnterEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setEnterEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "pause", "Landroid/arch/lifecycle/MutableLiveData;", "", "getPause", "()Landroid/arch/lifecycle/MutableLiveData;", "reLayoutBottomLayout", "", "getReLayoutBottomLayout", "resume", "getResume", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "getShortVideoContext", "()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "setShortVideoContext", "(Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;)V", "topMargin", "getTopMargin", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecordMVViewModel extends ViewModel {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Effect f77601a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public fh f77602b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<Boolean> f77603c = new MutableLiveData<>();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final MutableLiveData<Boolean> f77604d = new MutableLiveData<>();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final MutableLiveData<Object> f77605e = new MutableLiveData<>();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final MutableLiveData<Object> f77606f = new MutableLiveData<>();
}
