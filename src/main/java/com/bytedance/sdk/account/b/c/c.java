package com.bytedance.sdk.account.b.c;

import android.os.Bundle;

public final class c {

    public static class a extends a {

        /* renamed from: a  reason: collision with root package name */
        public String f22259a;

        /* renamed from: b  reason: collision with root package name */
        public String f22260b;

        /* renamed from: c  reason: collision with root package name */
        public String f22261c;

        /* renamed from: d  reason: collision with root package name */
        public int f22262d = -1;

        /* renamed from: e  reason: collision with root package name */
        public String f22263e;

        /* renamed from: f  reason: collision with root package name */
        public String f22264f;
        public String g;

        public int getType() {
            return 1;
        }

        public a() {
        }

        public a(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f22259a = bundle.getString("_bytedance_params_state");
            this.f22261c = bundle.getString("_bytedance_params_client_key");
            this.f22260b = bundle.getString("_bytedance_params_redirect_uri");
            this.f22263e = bundle.getString("_bytedance_params_scope");
            this.f22264f = bundle.getString("_bytedance_params_optional_scope0");
            this.g = bundle.getString("_bytedance_params_optional_scope1");
            this.f22262d = bundle.getInt("wap_requested_orientation", -1);
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.f22259a);
            bundle.putString("_bytedance_params_client_key", this.f22261c);
            bundle.putString("_bytedance_params_redirect_uri", this.f22260b);
            bundle.putString("_bytedance_params_scope", this.f22263e);
            bundle.putString("_bytedance_params_optional_scope0", this.f22264f);
            bundle.putString("_bytedance_params_optional_scope1", this.g);
            bundle.putInt("wap_requested_orientation", this.f22262d);
        }
    }

    public static class b extends b {

        /* renamed from: a  reason: collision with root package name */
        public String f22265a;

        /* renamed from: b  reason: collision with root package name */
        public String f22266b;

        /* renamed from: c  reason: collision with root package name */
        public String f22267c;

        public int getType() {
            return 2;
        }

        public b() {
        }

        public b(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f22265a = bundle.getString("_bytedance_params_authcode");
            this.f22266b = bundle.getString("_bytedance_params_state");
            this.f22267c = bundle.getString("_bytedance_params_granted_permission");
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.f22265a);
            bundle.putString("_bytedance_params_state", this.f22266b);
            bundle.putString("_bytedance_params_granted_permission", this.f22267c);
        }
    }
}
