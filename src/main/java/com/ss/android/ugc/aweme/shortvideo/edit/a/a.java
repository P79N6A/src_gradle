package com.ss.android.ugc.aweme.shortvideo.edit.a;

import android.app.Application;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/autoenhance/AutoEnhanceConfig;", "", "()V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66932a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static String f66933b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final String f66934c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0711a f66935d = new C0711a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\r8F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00148FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\r8F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/autoenhance/AutoEnhanceConfig$Companion;", "", "()V", "HDR_FILTER_RESOURCE_DIR", "", "TAG", "hdrFilterDir", "hdrFilterDir$annotations", "getHdrFilterDir", "()Ljava/lang/String;", "setHdrFilterDir", "(Ljava/lang/String;)V", "lightDetectNeeded", "", "lightDetectNeeded$annotations", "getLightDetectNeeded", "()Z", "setLightDetectNeeded", "(Z)V", "lightEnhanceThreshold", "", "lightEnhanceThreshold$annotations", "getLightEnhanceThreshold", "()I", "supportEnhance", "supportEnhance$annotations", "getSupportEnhance", "setSupportEnhance", "tryCopyResource", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.a.a$a  reason: collision with other inner class name */
    public static final class C0711a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66936a;

        private C0711a() {
        }

        public final boolean a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f66936a, false, 76703, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66936a, false, 76703, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (a.f66935d.b() && com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.LightEnhanceBlackList) == 0) {
                z = true;
            }
            return z;
        }

        public final boolean b() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f66936a, false, 76705, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66936a, false, 76705, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.ShowAutoImproveButtonInEditPage) == 1 && com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.EnableOpenGl3) == 1 && Build.VERSION.SDK_INT > 20) {
                if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.NewEditPage) == 0 && com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c() {
            if (PatchProxy.isSupport(new Object[0], this, f66936a, false, 76706, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66936a, false, 76706, new Class[0], Boolean.TYPE)).booleanValue();
            }
            boolean exists = new File(a.f66934c, "content.json").exists();
            m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, m.class);
            if (mVar.g(false) && exists) {
                return true;
            }
            Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
            Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
            try {
                fd.a(application.getAssets().open("HDR_Filter.zip"), a.f66934c);
                mVar.f(true);
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public /* synthetic */ C0711a(byte b2) {
            this();
        }
    }

    public static final boolean a() {
        return PatchProxy.isSupport(new Object[0], null, f66932a, true, 76699, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f66932a, true, 76699, new Class[0], Boolean.TYPE)).booleanValue() : f66935d.a();
    }

    public static final boolean b() {
        return PatchProxy.isSupport(new Object[0], null, f66932a, true, 76701, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f66932a, true, 76701, new Class[0], Boolean.TYPE)).booleanValue() : f66935d.b();
    }

    static {
        Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
        Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
        String absolutePath = new File(application.getFilesDir(), "hdr_filter").getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "File(AVEnv.application.f…hdr_filter\").absolutePath");
        f66934c = absolutePath;
        File file = new File(f66934c);
        if (!file.exists()) {
            file.mkdirs();
        }
        f66935d.c();
    }
}
