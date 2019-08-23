package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.common.b.a;
import com.ss.android.ugc.aweme.music.e;
import com.ss.android.ugc.aweme.utils.bm;
import java.util.HashMap;

public final class t implements a.C0521a, com.ss.android.ugc.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56765a;

    /* renamed from: b  reason: collision with root package name */
    String f56766b;

    /* renamed from: c  reason: collision with root package name */
    int f56767c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    String f56768d;

    /* renamed from: e  reason: collision with root package name */
    String f56769e;

    /* renamed from: f  reason: collision with root package name */
    e f56770f;
    f g;

    public final t a(e eVar) {
        this.f56770f = eVar;
        return this;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56765a, false, 60362, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56765a, false, 60362, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f56770f != null) {
            this.f56770f.a(this.f56766b, this.f56767c, this.f56768d, (float[]) null);
        }
    }

    public t(@Nullable String str, f fVar) {
        this.f56768d = str;
        this.g = fVar;
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f56765a, false, 60363, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f56765a, false, 60363, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f56769e = str;
        if (this.f56770f != null) {
            this.f56770f.a(this.f56768d, this.f56767c, this.f56768d, (int) ((((float) i) * 0.02f) + 98.0f));
        }
    }

    public final void b(final String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, 4}, this, f56765a, false, 60359, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, 4}, this, f56765a, false, 60359, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(this.f56768d) || this.f56770f == null) {
            final String a2 = com.ss.android.ugc.aweme.music.util.e.a(str);
            bm.a(com.ss.android.ugc.aweme.music.util.e.f56803b, false);
            HashMap hashMap = new HashMap();
            hashMap.put("Accept-Encoding", " ");
            e.a a3 = new e.a().a(this.f56768d).a(hashMap);
            a3.g = b.a().b();
            com.ss.android.ugc.aweme.app.application.initialization.a.a(a3.b(a2).a(), (d) new d(4) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56771a;

                public final void onCancel() {
                }

                public final void onDownloadPause() {
                }

                public final void onDownloadStart(int i) {
                }

                public final void onDownloadSuccess(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f56771a, false, 60365, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f56771a, false, 60365, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    if (t.this.f56770f != null) {
                        t.this.f56770f.a(str, 4, a2, (float[]) null);
                    }
                }

                public final void onError(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f56771a, false, 60366, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f56771a, false, 60366, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    if (t.this.f56770f != null) {
                        t.this.f56770f.a(str, 4, (String) null, (float[]) null);
                    }
                }

                public final void onDownloadProgress(int i, long j, long j2) {
                    long j3 = j;
                    long j4 = j2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f56771a, false, 60367, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f56771a, false, 60367, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                        return;
                    }
                    if (t.this.f56770f != null) {
                        t.this.f56770f.a(t.this.f56769e, 4, a2, (i / 10) + 90);
                    }
                }
            });
        } else {
            this.f56770f.a(str, 4, (String) null, (float[]) null);
        }
    }

    public final void a(String str, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{str, exc}, this, f56765a, false, 60364, new Class[]{String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, exc}, this, f56765a, false, 60364, new Class[]{String.class, Exception.class}, Void.TYPE);
            return;
        }
        if (this.f56770f != null) {
            this.f56770f.a(this.f56766b, this.f56767c, this.f56768d, (float[]) null);
        }
    }

    public final void a(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), 4}, this, f56765a, false, 60360, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), 4}, this, f56765a, false, 60360, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f56770f != null) {
            this.f56770f.a(str, 4, this.f56768d, (int) (((float) i) * 0.9f));
        }
    }

    public final void a(String str, int i, Exception exc) {
        String str2 = str;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{str2, 4, exc2}, this, f56765a, false, 60361, new Class[]{String.class, Integer.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 4, exc2}, this, f56765a, false, 60361, new Class[]{String.class, Integer.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        if (this.f56770f != null) {
            this.f56770f.a(str2, 4, this.f56768d, exc2);
        }
    }
}
