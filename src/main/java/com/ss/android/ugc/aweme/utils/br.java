package com.ss.android.ugc.aweme.utils;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/FpsMonitorFactory;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class br {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75628a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f75629b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/FpsMonitorFactory$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/utils/FpsMonitor;", "type", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75630a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final bq a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f75630a, false, 88330, new Class[]{String.class}, bq.class)) {
                return (bq) PatchProxy.accessDispatch(new Object[]{str2}, this, f75630a, false, 88330, new Class[]{String.class}, bq.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "type");
            if (MonitorUtils.getServiceNameSwitch("fps") || MonitorUtils.getMetricsTypeSwitch(str)) {
                return new dg(str2, com.ss.android.ugc.aweme.g.a.a());
            }
            return new cq();
        }
    }

    @JvmStatic
    @NotNull
    public static final bq a(@NotNull String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75628a, true, 88329, new Class[]{String.class}, bq.class)) {
            return f75629b.a(str2);
        }
        return (bq) PatchProxy.accessDispatch(new Object[]{str2}, null, f75628a, true, 88329, new Class[]{String.class}, bq.class);
    }
}
