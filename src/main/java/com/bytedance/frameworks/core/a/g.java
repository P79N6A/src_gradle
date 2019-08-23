package com.bytedance.frameworks.core.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.frameworks.core.a.b.a;
import com.bytedance.frameworks.core.a.b.b;
import com.bytedance.frameworks.core.a.b.c;
import com.bytedance.frameworks.core.a.b.d;
import com.bytedance.frameworks.core.a.b.e;
import com.bytedance.frameworks.core.a.b.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;

public final class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private volatile String f19959a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f19960b;

    /* renamed from: c  reason: collision with root package name */
    private c f19961c;

    /* renamed from: d  reason: collision with root package name */
    private e f19962d;

    /* renamed from: e  reason: collision with root package name */
    private f f19963e;

    /* renamed from: f  reason: collision with root package name */
    private b f19964f;

    public final void handleMessage(Message message) {
        long j;
        int i;
        int i2;
        JSONObject jSONObject;
        int i3;
        boolean z;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                this.f19961c = new c(this.f19960b, this.f19959a);
                this.f19962d = new e(this.f19960b, this.f19961c);
                this.f19964f = new b(this.f19960b, this.f19959a, this.f19961c);
                this.f19963e = new f(this.f19961c, this.f19962d);
                return;
            case 2:
                if (!(this.f19962d == null || message2.obj == null || !(message2.obj instanceof e))) {
                    this.f19962d.a((e) message2.obj);
                }
                return;
            case 3:
                boolean z2 = false;
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof c))) {
                    f fVar = this.f19963e;
                    c cVar = (c) message2.obj;
                    if (cVar != null) {
                        String str = cVar.f19899c + cVar.f19897a + cVar.f19898b;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        a aVar = fVar.f19953a.get(str);
                        if (aVar == null) {
                            aVar = new a(cVar.f19899c, cVar.f19897a, 0.0f, currentTimeMillis);
                            aVar.f19894f = cVar.f19898b;
                            fVar.f19953a.put(str, aVar);
                        }
                        if (aVar.f19893e || cVar.f19901e) {
                            z2 = true;
                        }
                        aVar.f19893e = z2;
                        aVar.f19891c += cVar.f19900d;
                    }
                }
                return;
            case 4:
                boolean z3 = false;
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof c))) {
                    f fVar2 = this.f19963e;
                    c cVar2 = (c) message2.obj;
                    if (cVar2 != null) {
                        String str2 = cVar2.f19899c + cVar2.f19897a + cVar2.f19898b;
                        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                        f fVar3 = fVar2.f19954b.get(str2);
                        if (fVar3 == null) {
                            fVar3 = new f(cVar2.f19899c, cVar2.f19897a, 0, 0.0f, currentTimeMillis2);
                            fVar3.f19918f = cVar2.f19898b;
                            fVar2.f19954b.put(str2, fVar3);
                        }
                        if (fVar3.g || cVar2.f19901e) {
                            z3 = true;
                        }
                        fVar3.g = z3;
                        fVar3.f19916d += cVar2.f19900d;
                        fVar3.f19915c++;
                    }
                }
                return;
            case 5:
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof b))) {
                    this.f19963e.a((b) message2.obj);
                }
                return;
            case 6:
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof c))) {
                    this.f19963e.b((c) message2.obj);
                }
                return;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof c))) {
                    this.f19963e.a((c) message2.obj);
                }
                return;
            case 8:
                if (this.f19964f != null) {
                    b bVar = this.f19964f;
                    String str3 = bVar.f19888f;
                    if (TextUtils.isEmpty(str3) || com.bytedance.frameworks.core.a.a.c.f19882b.get(str3) == null) {
                        i = com.bytedance.frameworks.core.a.a.c.f19881a.b();
                    } else {
                        i = com.bytedance.frameworks.core.a.a.c.f19882b.get(str3).b();
                    }
                    if (i > 0) {
                        bVar.f19884b = i;
                    }
                    String str4 = bVar.f19888f;
                    if (TextUtils.isEmpty(str4) || com.bytedance.frameworks.core.a.a.c.f19882b.get(str4) == null) {
                        i2 = com.bytedance.frameworks.core.a.a.c.f19881a.c();
                    } else {
                        i2 = com.bytedance.frameworks.core.a.a.c.f19882b.get(str4).c();
                    }
                    if (i2 > 0) {
                        bVar.f19885c = i2;
                    }
                    String str5 = bVar.f19888f;
                    if (TextUtils.isEmpty(str5) || com.bytedance.frameworks.core.a.a.c.f19882b.get(str5) == null) {
                        jSONObject = com.bytedance.frameworks.core.a.a.c.f19881a.g();
                    } else {
                        jSONObject = com.bytedance.frameworks.core.a.a.c.f19882b.get(str5).g();
                    }
                    bVar.f19887e = jSONObject;
                }
                if (this.f19961c != null) {
                    String str6 = this.f19961c.f19927f;
                    if (TextUtils.isEmpty(str6) || com.bytedance.frameworks.core.a.a.c.f19882b.get(str6) == null) {
                        j = com.bytedance.frameworks.core.a.a.c.f19881a.f();
                    } else {
                        j = com.bytedance.frameworks.core.a.a.c.f19882b.get(str6).f();
                    }
                    if (j <= 0) {
                        c.f19922a = 40000;
                        break;
                    } else {
                        c.f19922a = j;
                    }
                }
                return;
            case 9:
                if (!(this.f19964f == null || message2.obj == null || !(message2.obj instanceof Boolean))) {
                    this.f19964f.f19883a = ((Boolean) message2.obj).booleanValue();
                }
                return;
            case 10:
                if (!(this.f19963e == null || message2.obj == null || !(message2.obj instanceof d))) {
                    d dVar = (d) message2.obj;
                    dVar.f19907f = System.currentTimeMillis() / 1000;
                    dVar.f19906e = this.f19962d.f19949a;
                    if (message2.arg1 == 1) {
                        this.f19963e.b(dVar);
                        break;
                    } else {
                        this.f19963e.a(dVar);
                    }
                }
                return;
            case 11:
                if (!(this.f19964f == null || message2.obj == null || !(message2.obj instanceof com.bytedance.frameworks.core.a.b.g))) {
                    this.f19964f.a((com.bytedance.frameworks.core.a.b.g) message2.obj);
                }
                return;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                if (this.f19963e != null) {
                    this.f19963e.a(true);
                }
                return;
            case 13:
                if (this.f19963e != null) {
                    this.f19963e.a();
                    this.f19963e.a(false);
                }
                return;
            case 14:
                if (this.f19964f != null) {
                    this.f19964f.a();
                }
                return;
            case 15:
                if (this.f19961c != null) {
                    c cVar3 = this.f19961c;
                    Date date = new Date();
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(date);
                    int i4 = -1;
                    instance.add(5, -1);
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    long timeInMillis = instance.getTimeInMillis() / 1000;
                    Date date2 = new Date();
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTime(date2);
                    instance2.add(5, -1);
                    instance2.set(11, 23);
                    instance2.set(12, 59);
                    instance2.set(13, 59);
                    long a2 = cVar3.a(timeInMillis, instance2.getTimeInMillis() / 1000);
                    if (a2 > 0) {
                        try {
                            File file = new File(this.f19961c.f19926e.getPath());
                            if (file.exists()) {
                                i3 = (int) ((file.length() / 1024) / 1024);
                            } else {
                                i3 = -1;
                            }
                            c cVar4 = this.f19961c;
                            File file2 = new File(cVar4.f19926e.getPath() + "-journal");
                            if (file2.exists()) {
                                i4 = ((int) file2.length()) / 1024;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("log_type", "service_monitor");
                            jSONObject2.put("service", "local_monitor_count_day");
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("dayCount", a2);
                            jSONObject3.put("totalCount", this.f19961c.b());
                            jSONObject3.put("dbSize", i3);
                            jSONObject3.put("dbJournalSize", i4);
                            jSONObject2.put("value", jSONObject3);
                            jSONObject2.put("timestamp", System.currentTimeMillis());
                            f fVar4 = this.f19963e;
                            String jSONObject4 = jSONObject2.toString();
                            if (message2.arg1 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            fVar4.a("service_monitor", "disk", jSONObject4, z);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                return;
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                if (this.f19961c != null) {
                    this.f19961c.a((long) message2.arg1);
                    break;
                }
                break;
        }
    }

    public g(Looper looper, Context context, String str) {
        super(looper);
        this.f19960b = context;
        this.f19959a = str;
    }
}
