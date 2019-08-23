package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.bt;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/MTLocationPopupManager;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mActivity", "mCountLimitForB", "", "mCountLimitForOther", "mDialog", "Lcom/ss/android/ugc/aweme/feed/ui/MTLocationPopupDialog;", "mPreferences", "Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;", "destroy", "", "recordConsumedFeedsCount", "aid", "", "showLocationPopupIfNeeded", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46513a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f46514b;

    /* renamed from: c  reason: collision with root package name */
    public final bt f46515c = new bt();

    /* renamed from: d  reason: collision with root package name */
    public aq f46516d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46517e = 6;

    /* renamed from: f  reason: collision with root package name */
    public final int f46518f = 3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class a<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ar f46520b;

        public a(ar arVar) {
            this.f46520b = arVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f46519a, false, 42897, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46519a, false, 42897, new Class[0], Void.TYPE);
            } else {
                if (this.f46520b.f46516d == null) {
                    this.f46520b.f46516d = new aq(this.f46520b.f46514b);
                    aq aqVar = this.f46520b.f46516d;
                    if (aqVar != null) {
                        aqVar.setOnShowListener(new DialogInterface.OnShowListener(this) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f46521a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ a f46522b;

                            {
                                this.f46522b = r1;
                            }

                            public final void onShow(DialogInterface dialogInterface) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f46521a, false, 42898, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f46521a, false, 42898, new Class[]{DialogInterface.class}, Void.TYPE);
                                    return;
                                }
                                bt btVar = this.f46522b.f46520b.f46515c;
                                if (PatchProxy.isSupport(new Object[]{(byte) 1}, btVar, bt.f54646a, false, 57653, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                    bt btVar2 = btVar;
                                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, btVar2, bt.f54646a, false, 57653, new Class[]{Boolean.TYPE}, Void.TYPE);
                                } else {
                                    try {
                                        btVar.f54647b.E(true);
                                    } catch (Throwable th) {
                                        ExceptionMonitor.ensureNotReachHere(th, "MainTabPreferences AbstractMethodError");
                                    }
                                }
                                r.a("location_permission_show", (Map) null);
                            }
                        });
                    }
                }
                aq aqVar2 = this.f46520b.f46516d;
                if (aqVar2 == null) {
                    Intrinsics.throwNpe();
                }
                if (!aqVar2.isShowing()) {
                    aq aqVar3 = this.f46520b.f46516d;
                    if (aqVar3 != null) {
                        aqVar3.show();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public ar(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f46514b = activity;
    }
}
