package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.zip.ZipException;

public final class n extends ZipException {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 20161221;

    /* renamed from: a  reason: collision with root package name */
    private final transient u f51759a;
    private final a reason;

    public static class a implements Serializable {
        public static final a DATA_DESCRIPTOR = new a("data descriptor");
        public static final a ENCRYPTION = new a("encryption");
        public static final a METHOD = new a("compression method");
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String name;

        public final String toString() {
            return this.name;
        }

        private a(String str) {
            this.name = str;
        }
    }

    public final u getEntry() {
        return this.f51759a;
    }

    public final a getFeature() {
        return this.reason;
    }

    public n(a aVar, u uVar) {
        super("unsupported feature " + aVar + " used in entry " + uVar.getName());
        this.reason = aVar;
        this.f51759a = uVar;
    }
}
