package android.support.v4.app;

import android.support.v4.app.JobIntentService;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroid/support/v4/app/SafeJobIntentService;", "Landroid/support/v4/app/JobIntentService;", "()V", "dequeueWork", "Landroid/support/v4/app/JobIntentService$GenericWorkItem;", "dequeueWork$tools_dmt_av_impl_douyinCnRelease", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SafeJobIntentService extends JobIntentService {
    @Nullable
    /* renamed from: dequeueWork$tools_dmt_av_impl_douyinCnRelease */
    public JobIntentService.GenericWorkItem dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
