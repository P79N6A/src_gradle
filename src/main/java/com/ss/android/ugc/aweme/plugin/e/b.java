package com.ss.android.ugc.aweme.plugin.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59318a;

    /* renamed from: b  reason: collision with root package name */
    public c f59319b;

    /* renamed from: c  reason: collision with root package name */
    public C0667b f59320c;

    /* renamed from: d  reason: collision with root package name */
    public a f59321d;

    /* renamed from: e  reason: collision with root package name */
    public long f59322e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f59323f;
    public a g = a.Direct;
    public long h = -1;
    public String i;
    public int j;
    public Exception k;
    private long l = -1;

    public enum a {
        Direct("direct"),
        SwitchToFullNet("data"),
        Entrance("entrance"),
        Retry("retry"),
        Pause("pause"),
        Resume("resume"),
        NetworkChangeRetry("network");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String mType;

        public final String getType() {
            return this.mType;
        }

        private a(String str) {
            this.mType = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.plugin.e.b$b  reason: collision with other inner class name */
    public enum C0667b {
        SUCCESS(0),
        ALREADY_DOWNLOADED(0),
        FAILED(1),
        DELETED(2),
        CANCELED(3),
        PENDING(4),
        PAUSED_BY_APP(5),
        PAUSED_BY_NETWORK(5),
        PAUSED_BY_OTHERS(5),
        PAUSED_BY_LOADPATCH_ONLY(5),
        CREATED(6),
        DOWNLOADING(7),
        FIRST_DOWNLOAD(8),
        VERIFY_FAILED(9),
        INSUFFICIENT_STORAGE_FAILED(10);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int status;

        public final int getStatus() {
            return this.status;
        }

        public final boolean isCanceled() {
            if (this == CANCELED) {
                return true;
            }
            return false;
        }

        public final boolean isDownloading() {
            if (this == DOWNLOADING) {
                return true;
            }
            return false;
        }

        public final boolean isInSufficientStorage() {
            if (this == INSUFFICIENT_STORAGE_FAILED) {
                return true;
            }
            return false;
        }

        public final boolean isPending() {
            if (this == PENDING) {
                return true;
            }
            return false;
        }

        public final boolean isSucceed() {
            if (this.status == 0) {
                return true;
            }
            return false;
        }

        public final boolean isComplete() {
            if (this.status <= CANCELED.status) {
                return true;
            }
            return false;
        }

        public final boolean isPaused() {
            if (this.status == 5) {
                return true;
            }
            return false;
        }

        public final boolean isFailed() {
            if (this == FAILED || this == VERIFY_FAILED || this == INSUFFICIENT_STORAGE_FAILED) {
                return true;
            }
            return false;
        }

        private C0667b(int i) {
            this.status = i;
        }
    }

    public final void a(C0667b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f59318a, false, 64647, new Class[]{C0667b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f59318a, false, 64647, new Class[]{C0667b.class}, Void.TYPE);
            return;
        }
        this.f59320c = bVar;
        if (bVar.isFailed() || bVar.isSucceed() || bVar.isComplete()) {
            this.l = System.currentTimeMillis();
        }
    }
}
