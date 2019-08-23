package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.b;
import com.meizu.cloud.pushsdk.handler.a.d;
import com.meizu.cloud.pushsdk.handler.a.e;
import com.meizu.cloud.pushsdk.handler.a.f;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile a f26824a;

    /* renamed from: b  reason: collision with root package name */
    private Context f26825b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, c> f26826c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Map<String, com.meizu.cloud.pushsdk.handler.a> f26827d;

    /* renamed from: com.meizu.cloud.pushsdk.a$a  reason: collision with other inner class name */
    public class C0311a extends com.meizu.cloud.pushsdk.handler.a {
        public C0311a() {
        }

        public void a(Context context, Intent intent) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, intent);
                }
            }
        }

        public void a(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, mzPushMessage);
                }
            }
        }

        public void a(Context context, PushSwitchStatus pushSwitchStatus) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, pushSwitchStatus);
                }
            }
        }

        public void a(Context context, RegisterStatus registerStatus) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, registerStatus);
                }
            }
        }

        public void a(Context context, SubAliasStatus subAliasStatus) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, subAliasStatus);
                }
            }
        }

        public void a(Context context, SubTagsStatus subTagsStatus) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, subTagsStatus);
                }
            }
        }

        public void a(Context context, UnRegisterStatus unRegisterStatus) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, unRegisterStatus);
                }
            }
        }

        public void a(Context context, String str) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, str);
                }
            }
        }

        public void a(Context context, String str, String str2) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, str, str2);
                }
            }
        }

        public void a(Context context, boolean z) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(context, z);
                }
            }
        }

        public void a(PushNotificationBuilder pushNotificationBuilder) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.a(pushNotificationBuilder);
                }
            }
        }

        public void b(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.b(context, mzPushMessage);
                }
            }
        }

        public void b(Context context, String str) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.b(context, str);
                }
            }
        }

        public void c(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.c(context, mzPushMessage);
                }
            }
        }

        public void c(Context context, String str) {
            for (Map.Entry value : a.this.f26827d.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) value.getValue();
                if (aVar != null) {
                    aVar.c(context, str);
                }
            }
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, List<c> list) {
        this(context, list, null);
    }

    public a(Context context, List<c> list, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.f26826c = new HashMap();
        this.f26827d = null;
        if (context != null) {
            this.f26825b = context.getApplicationContext();
            this.f26827d = new HashMap();
            C0311a aVar2 = new C0311a();
            if (list == null) {
                a((c) new com.meizu.cloud.pushsdk.handler.a.c(context, aVar2));
                a((c) new b(context, aVar2));
                a((c) new e(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.c.b(context, aVar2));
                a((c) new d(context, aVar2));
                a((c) new f(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.c.c(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.a(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.c(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.f(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.d(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.e(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.e.a(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.d.b(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.c.d(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.a.a(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.c.a(context, aVar2));
                a((c) new com.meizu.cloud.pushsdk.handler.a.c.e(context, aVar2));
                return;
            }
            a(list);
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static a a(Context context) {
        if (f26824a == null) {
            synchronized (a.class) {
                if (f26824a == null) {
                    DebugLogger.i("PushMessageProxy", "PushMessageProxy init");
                    f26824a = new a(context);
                }
            }
        }
        return f26824a;
    }

    public a a(c cVar) {
        this.f26826c.put(Integer.valueOf(cVar.a()), cVar);
        return this;
    }

    public a a(String str, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.f26827d.put(str, aVar);
        return this;
    }

    public a a(List<c> list) {
        if (list != null) {
            for (c a2 : list) {
                a(a2);
            }
            return this;
        }
        throw new IllegalArgumentException("messageManagerList must not be null.");
    }

    public void a(Intent intent) {
        DebugLogger.e("PushMessageProxy", "is onMainThread " + a());
        try {
            String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD);
            DebugLogger.i("PushMessageProxy", "receive action " + intent.getAction() + " method " + stringExtra);
            if (intent != null) {
                for (Map.Entry<Integer, c> value : this.f26826c.entrySet()) {
                    if (((c) value.getValue()).b(intent)) {
                        break;
                    }
                }
            }
        } catch (Exception e2) {
            DebugLogger.e("PushMessageProxy", "processMessage error " + e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return Thread.currentThread() == this.f26825b.getMainLooper().getThread();
    }
}
