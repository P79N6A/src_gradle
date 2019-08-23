package com.ss.android.ugc.aweme.framework.b;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.LifecycleState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48466b;

    /* renamed from: a  reason: collision with root package name */
    private ImagePipelineConfig f48467a;

    public View a(Context context) {
        return null;
    }

    public List<ReactPackage> a() {
        return null;
    }

    public List<NativeModule> a(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public ImageDecodeOptions e() {
        return null;
    }

    @Nullable
    public final String h() {
        return "index.android.jsbundle";
    }

    public final String i() {
        return "index";
    }

    public final ImagePipelineConfig f() {
        return this.f48467a;
    }

    public final LifecycleState g() {
        return LifecycleState.RESUMED;
    }

    public b(ImagePipelineConfig imagePipelineConfig) {
        this.f48467a = imagePipelineConfig;
    }

    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48466b, false, 45894, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48466b, false, 45894, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d();
    }

    public void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48466b, false, 45893, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f48466b, false, 45893, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d();
    }
}
