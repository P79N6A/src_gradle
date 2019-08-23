package com.ss.android.ugc.aweme.discover.ui.a;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.dmt.ui.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/status/SearchStatusUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43077a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f43078b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/status/SearchStatusUtils$Companion;", "", "()V", "isEmptyStatus", "", "status", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "setStatus", "", "statusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43079a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private boolean a(@NotNull c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f43079a, false, 38133, new Class[]{c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f43079a, false, 38133, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "status");
            if (cVar2.r == a.EMPTY.getType()) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final void a(@NotNull DmtStatusView dmtStatusView, @NotNull c cVar) {
            DmtStatusView dmtStatusView2 = dmtStatusView;
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{dmtStatusView2, cVar2}, this, f43079a, false, 38134, new Class[]{DmtStatusView.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dmtStatusView2, cVar2}, this, f43079a, false, 38134, new Class[]{DmtStatusView.class, c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dmtStatusView2, "statusView");
            Intrinsics.checkParameterIsNotNull(cVar2, "status");
            if (a(cVar2) || (com.ss.android.g.a.a() && !cVar2.o)) {
                View a2 = dmtStatusView2.a(1);
                if (a2 instanceof e) {
                    ((e) a2).setStatus(cVar2);
                }
                dmtStatusView.e();
                return;
            }
            View a3 = dmtStatusView2.a(2);
            if (a3 != null) {
                ((e) a3).setStatus(cVar2);
                dmtStatusView.f();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
        }
    }

    @JvmStatic
    public static final void a(@NotNull DmtStatusView dmtStatusView, @NotNull c cVar) {
        DmtStatusView dmtStatusView2 = dmtStatusView;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{dmtStatusView2, cVar2}, null, f43077a, true, 38132, new Class[]{DmtStatusView.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtStatusView2, cVar2}, null, f43077a, true, 38132, new Class[]{DmtStatusView.class, c.class}, Void.TYPE);
            return;
        }
        f43078b.a(dmtStatusView2, cVar2);
    }
}
