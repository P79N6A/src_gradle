package com.ss.android.ugc.aweme.legoImp.a.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.poi.nearby.b.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/legoImp/request/idle/SameCityActiveRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "activePresenter", "Lcom/ss/android/ugc/aweme/poi/nearby/presenter/PoiSameCityActivePresenter;", "(Lcom/ss/android/ugc/aweme/poi/nearby/presenter/PoiSameCityActivePresenter;)V", "mActivePresenter", "request", "", "context", "Landroid/content/Context;", "coldBoot", "", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53077a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f53078b = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f53079d = true;

    /* renamed from: c  reason: collision with root package name */
    private m f53080c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/legoImp/request/idle/SameCityActiveRequest$Companion;", "", "()V", "sColdStart", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final e a() {
        if (PatchProxy.isSupport(new Object[0], this, f53077a, false, 55203, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f53077a, false, 55203, new Class[0], e.class);
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Boolean aD = b2.aD();
            Intrinsics.checkExpressionValueIsNotNull(aD, "SettingsReader.get().dis…etchSamecityActiveRequest");
            if (aD.booleanValue()) {
                return e.NORMAL;
            }
        } catch (Exception unused) {
        }
        if (f53079d) {
            return e.IDLE;
        }
        return e.NORMAL;
    }

    public b(@NotNull m mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "activePresenter");
        this.f53080c = mVar;
    }

    public final void a(@NotNull Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53077a, false, 55204, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f53077a, false, 55204, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.f53080c.a(new Object[0]);
        if (f53079d) {
            f53079d = false;
        }
        r.a("request_fresh_name", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
    }
}
