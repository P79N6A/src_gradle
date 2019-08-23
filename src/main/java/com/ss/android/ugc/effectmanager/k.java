package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.common.d;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public d<String, a> f77513a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public ModelInfo f77514a;

        public final String a() {
            return this.f77514a.getName();
        }

        public final int hashCode() {
            return this.f77514a.hashCode();
        }

        public a(ModelInfo modelInfo) {
            this.f77514a = modelInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f77514a.equals(((a) obj).f77514a);
        }
    }

    /* access modifiers changed from: package-private */
    public final UrlModel a(String str) {
        for (a aVar : this.f77513a.a()) {
            if (aVar.a().equals(str)) {
                return aVar.f77514a.getFile_url();
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }
}
