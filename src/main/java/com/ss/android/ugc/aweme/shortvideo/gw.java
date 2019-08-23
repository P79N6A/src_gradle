package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttuploader.TTVideoUploader;

public final class gw {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68012a;

    /* renamed from: b  reason: collision with root package name */
    private static a f68013b = new b((byte) 0);

    public interface a {
        void a(TTVideoUploader tTVideoUploader, int i);
    }

    static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68014a;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(TTVideoUploader tTVideoUploader, int i) {
            if (PatchProxy.isSupport(new Object[]{tTVideoUploader, Integer.valueOf(i)}, this, f68014a, false, 74771, new Class[]{TTVideoUploader.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tTVideoUploader, Integer.valueOf(i)}, this, f68014a, false, 74771, new Class[]{TTVideoUploader.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            tTVideoUploader.setEnableHttps(i);
        }
    }

    public static void a(TTVideoUploader tTVideoUploader, int i) {
        TTVideoUploader tTVideoUploader2 = tTVideoUploader;
        if (PatchProxy.isSupport(new Object[]{tTVideoUploader2, Integer.valueOf(i)}, null, f68012a, true, 74770, new Class[]{TTVideoUploader.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoUploader2, Integer.valueOf(i)}, null, f68012a, true, 74770, new Class[]{TTVideoUploader.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f68013b.a(tTVideoUploader2, i);
    }
}
