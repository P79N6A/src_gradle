package com.facebook.react.modules.toast;

import android.os.Build;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.ss.android.ugc.aweme.utils.eq;
import java.util.HashMap;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

@ReactModule(name = "ToastAndroid")
public class ToastModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "ToastAndroid";
    }

    public Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("SHORT", 0);
        newHashMap.put("LONG", 1);
        newHashMap.put("TOP", 49);
        newHashMap.put("BOTTOM", 81);
        newHashMap.put("CENTER", 17);
        return newHashMap;
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void show(final String str, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$1$_lancet */
            public class _lancet {
                private _lancet() {
                }

                @TargetClass
                @Proxy
                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i));
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$2$_lancet */
            public class _lancet {
                private _lancet() {
                }

                @TargetClass
                @Proxy
                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        final String str2 = str;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        AnonymousClass3 r0 = new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$3$_lancet */
            public class _lancet {
                private _lancet() {
                }

                @TargetClass
                @Proxy
                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str2, i5);
                makeText.setGravity(i6, i7, i8);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
            }
        };
        UiThreadUtil.runOnUiThread(r0);
    }
}
