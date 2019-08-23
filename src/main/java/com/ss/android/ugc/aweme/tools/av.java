package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/StartRecordingEventTrackEvent;", "Lcom/ss/android/ugc/aweme/tools/UiEvent;", "recordType", "", "(I)V", "getRecordType", "()I", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class av implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74634a;

    /* renamed from: b  reason: collision with root package name */
    public final int f74635b;

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74634a, false, 86993, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74634a, false, 86993, new Class[0], String.class);
        }
        return "StartRecordingCommandEvent{recordType=" + this.f74635b + '}';
    }

    public av(int i) {
        this.f74635b = i;
    }
}
