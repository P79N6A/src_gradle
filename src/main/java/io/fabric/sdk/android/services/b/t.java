package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.a.b;
import io.fabric.sdk.android.services.a.d;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final d<String> f83199a = new d<String>() {
        public final /* synthetic */ Object load(Context context) throws Exception {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                return "";
            }
            return installerPackageName;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final b<String> f83200b = new b<>();

    public final String a(Context context) {
        try {
            String str = (String) this.f83200b.a(context, this.f83199a);
            if ("".equals(str)) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }
}
