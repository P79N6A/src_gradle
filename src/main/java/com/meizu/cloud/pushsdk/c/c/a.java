package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.f.d;
import com.meizu.cloud.pushsdk.c.f.e;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected final List<b> f27128a;

    /* renamed from: b  reason: collision with root package name */
    protected final long f27129b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f27130c;

    /* renamed from: com.meizu.cloud.pushsdk.c.c.a$a  reason: collision with other inner class name */
    public static abstract class C0314a<T extends C0314a<T>> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public List<b> f27131a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f27132b = System.currentTimeMillis();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f27133c = e.b();

        /* access modifiers changed from: protected */
        public abstract T a();

        public T a(long j) {
            this.f27132b = j;
            return a();
        }
    }

    protected a(C0314a<?> aVar) {
        d.a(aVar.f27131a);
        d.a(aVar.f27133c);
        d.a(!aVar.f27133c.isEmpty(), (Object) "eventId cannot be empty");
        this.f27128a = aVar.f27131a;
        this.f27129b = aVar.f27132b;
        this.f27130c = aVar.f27133c;
    }

    /* access modifiers changed from: protected */
    public c a(c cVar) {
        cVar.a(NotificationStyle.EXPANDABLE_IMAGE_URL, c());
        cVar.a(TimeDisplaySetting.TIME_DISPLAY_SETTING, Long.toString(b()));
        return cVar;
    }

    public List<b> a() {
        return new ArrayList(this.f27128a);
    }

    public long b() {
        return this.f27129b;
    }

    public String c() {
        return this.f27130c;
    }
}
