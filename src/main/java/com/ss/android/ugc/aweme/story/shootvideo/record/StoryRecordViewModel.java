package com.ss.android.ugc.aweme.story.shootvideo.record;

import a.i;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "pageScrollable", "Landroid/arch/lifecycle/MutableLiveData;", "", "recordDuration", "", "getPageScrollable", "Landroid/arch/lifecycle/LiveData;", "getRecordDuration", "setPageScrollAble", "", "scrollable", "updateRecordDuration", "duration", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73848a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<Boolean> f73849b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    final MutableLiveData<Long> f73850c = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordViewModel f73852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73853c;

        a(StoryRecordViewModel storyRecordViewModel, boolean z) {
            this.f73852b = storyRecordViewModel;
            this.f73853c = z;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f73851a, false, 85748, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73851a, false, 85748, new Class[0], Void.TYPE);
            } else {
                this.f73852b.f73849b.setValue(Boolean.valueOf(this.f73853c));
            }
            return Unit.INSTANCE;
        }
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f73848a, false, 85746, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f73848a, false, 85746, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f73850c.setValue(Long.valueOf(j));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73848a, false, 85747, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73848a, false, 85747, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new a<TResult>(this, z), i.f1052b);
    }
}
