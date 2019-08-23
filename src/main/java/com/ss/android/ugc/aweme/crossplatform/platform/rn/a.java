package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.graphic.RNCanvas.RNCanvasPackage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.business.BusinessModule;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule;
import com.ss.android.ugc.aweme.fe.registry.rn.AmeRNBridgeModule;
import com.ss.android.ugc.aweme.framework.b.b;
import com.ss.android.ugc.aweme.poi.rn.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.swmansion.gesturehandler.react.e;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40830a;

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f40830a, false, 34322, new Class[0], Boolean.TYPE)) {
            return ((Boolean) SharePrefCache.inst().getRnPreloadContextOn().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40830a, false, 34322, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f40830a, false, 34323, new Class[0], Boolean.TYPE)) {
            return ((Boolean) SharePrefCache.inst().getRnSnapshotOn().c()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40830a, false, 34323, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final ImageDecodeOptions e() {
        if (PatchProxy.isSupport(new Object[0], this, f40830a, false, 34325, new Class[0], ImageDecodeOptions.class)) {
            return (ImageDecodeOptions) PatchProxy.accessDispatch(new Object[0], this, f40830a, false, 34325, new Class[0], ImageDecodeOptions.class);
        }
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        imageDecodeOptionsBuilder.setDecodeAllFrames(false);
        return new ImageDecodeOptions(imageDecodeOptionsBuilder);
    }

    public final List<ReactPackage> a() {
        if (PatchProxy.isSupport(new Object[0], this, f40830a, false, 34321, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f40830a, false, 34321, new Class[0], List.class);
        }
        return Arrays.asList(new ReactPackage[]{new f(), new e(), new RNCanvasPackage()});
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f40830a, false, 34324, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40830a, false, 34324, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71679, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71679, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a2.l != null) {
            return a2.l.booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                a2.l = Boolean.FALSE;
                return a2.l.booleanValue();
            }
            a2.l = Boolean.valueOf(d2.isUseFrescoFastImage);
            return a2.l.booleanValue();
        }
    }

    public a(ImagePipelineConfig imagePipelineConfig) {
        super(imagePipelineConfig);
    }

    public final View a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f40830a, false, 34319, new Class[]{Context.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2}, this, f40830a, false, 34319, new Class[]{Context.class}, View.class);
        }
        DmtStatusView dmtStatusView = new DmtStatusView(context2);
        dmtStatusView.setBuilder(DmtStatusView.a.a(context));
        dmtStatusView.d();
        return dmtStatusView;
    }

    public final List<NativeModule> a(ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        if (PatchProxy.isSupport(new Object[]{reactApplicationContext2}, this, f40830a, false, 34320, new Class[]{ReactApplicationContext.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext2}, this, f40830a, false, 34320, new Class[]{ReactApplicationContext.class}, List.class);
        }
        return Arrays.asList(new NativeModule[]{new ReactCommonModule(reactApplicationContext2), new BusinessModule(reactApplicationContext2), new AmeRNBridgeModule(reactApplicationContext2)});
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40830a, false, 34327, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f40830a, false, 34327, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && str2.startsWith("http")) {
            super.a(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rn_is_ues_fresco", d());
                jSONObject.put("rn_image_key", str2);
                jSONObject.put("rn_image_is_success", 0);
            } catch (JSONException unused) {
            }
            n.b("service_monitor", "rn_fresco_fast_image", jSONObject);
        }
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f40830a, false, 34326, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f40830a, false, 34326, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && str2.startsWith("http")) {
            super.a(str, z);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rn_is_ues_fresco", d());
                jSONObject.put("rn_image_key", str2);
                jSONObject.put("rn_image_is_cache", z);
                jSONObject.put("rn_image_is_success", 1);
            } catch (JSONException unused) {
            }
            n.b("service_monitor", "rn_fresco_fast_image", jSONObject);
        }
    }
}
