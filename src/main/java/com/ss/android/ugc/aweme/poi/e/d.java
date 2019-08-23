package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.u.ao;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ$\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/utils/PageStayTimeHelper;", "", "()V", "mPageStartTime", "", "getMPageStartTime", "()J", "setMPageStartTime", "(J)V", "startCalTime", "", "stopCalTime", "context", "Landroid/content/Context;", "eventType", "", "stayTimeParams", "Lcom/ss/android/ugc/aweme/metrics/StayTimeEvent$StayTimeParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59777a;

    /* renamed from: b  reason: collision with root package name */
    public long f59778b = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f59780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f59782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ao.a f59783e;

        a(Context context, String str, long j, ao.a aVar) {
            this.f59780b = context;
            this.f59781c = str;
            this.f59782d = j;
            this.f59783e = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f59779a, false, 66799, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59779a, false, 66799, new Class[0], Void.TYPE);
                return;
            }
            if (this.f59780b != null) {
                r.a(this.f59780b, "stay_time", this.f59781c, this.f59782d, 0);
            }
            if (this.f59783e != null) {
                new ao().a(String.valueOf(this.f59782d)).b(this.f59781c).a(this.f59783e).e();
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59777a, false, 66797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59777a, false, 66797, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59778b == -1) {
            this.f59778b = System.currentTimeMillis();
        }
    }

    public final void a(@Nullable Context context, @Nullable String str, @Nullable ao.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, str, aVar}, this, f59777a, false, 66798, new Class[]{Context.class, String.class, ao.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, aVar}, this, f59777a, false, 66798, new Class[]{Context.class, String.class, ao.a.class}, Void.TYPE);
            return;
        }
        if (this.f59778b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f59778b;
            if (currentTimeMillis > 0 && !TextUtils.isEmpty(str)) {
                a aVar2 = new a(context, str, currentTimeMillis, aVar);
                com.ss.android.b.a.a.a.a(aVar2);
            }
            this.f59778b = -1;
        }
    }
}
