package com.ss.android.ugc.aweme.feed;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.feed.a.b;
import com.ss.android.ugc.aweme.feed.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44607a;

    /* renamed from: e  reason: collision with root package name */
    private static a f44608e;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.a.a<String> f44609b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.f.a f44610c;

    /* renamed from: d  reason: collision with root package name */
    public JediViewModel f44611d;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, C0556a> f44612f = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.feed.a$a  reason: collision with other inner class name */
    public static class C0556a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final String f44615a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final Integer f44616b;

        public C0556a() {
        }

        public C0556a(String str, int i) {
            this.f44615a = str;
            this.f44616b = Integer.valueOf(i);
        }
    }

    public final Aweme a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f44607a, false, 39914, new Class[]{String.class, Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f44607a, false, 39914, new Class[]{String.class, Integer.TYPE}, Aweme.class);
        }
        String str2 = str + "type" + i;
        Aweme aweme = null;
        if (this.f44609b.b(str2)) {
            aweme = this.f44609b.a(str2);
        }
        return aweme;
    }

    public final void a(@NonNull String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f44607a, false, 39934, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f44607a, false, 39934, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Aweme b2 = a().b(str3);
        if (b2 != null) {
            b2.setRawPromotion(str4);
        }
    }

    public final void a(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f44607a, false, 39937, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f44607a, false, 39937, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.f44612f.put(str3, new C0556a(str4, i));
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f44607a, true, 39911, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f44607a, true, 39911, new Class[0], a.class);
        }
        if (f44608e == null) {
            f44608e = new a();
        }
        return f44608e;
    }

    private a() {
        AbTestManager a2 = AbTestManager.a();
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71913, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71913, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                z = d2.isReplaceAwemeManagerWithLRUCache;
            }
        }
        if (z) {
            this.f44609b = new c();
        } else {
            this.f44609b = new b();
        }
    }

    private void a(AwemeStatistics awemeStatistics) {
        AwemeStatistics awemeStatistics2 = awemeStatistics;
        if (PatchProxy.isSupport(new Object[]{awemeStatistics2}, this, f44607a, false, 39929, new Class[]{AwemeStatistics.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeStatistics2}, this, f44607a, false, 39929, new Class[]{AwemeStatistics.class}, Void.TYPE);
        } else if (awemeStatistics2 != null) {
            awemeStatistics2.setDiggCount(awemeStatistics.getDiggCount() + 1);
        }
    }

    private void b(AwemeStatistics awemeStatistics) {
        AwemeStatistics awemeStatistics2 = awemeStatistics;
        if (PatchProxy.isSupport(new Object[]{awemeStatistics2}, this, f44607a, false, 39930, new Class[]{AwemeStatistics.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeStatistics2}, this, f44607a, false, 39930, new Class[]{AwemeStatistics.class}, Void.TYPE);
        } else if (awemeStatistics2 != null) {
            awemeStatistics2.setDiggCount(awemeStatistics.getDiggCount() - 1);
        }
    }

    private boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44607a, false, 39918, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f44607a, false, 39918, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        } else {
            return true;
        }
    }

    private Aweme e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44607a, false, 39920, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f44607a, false, 39920, new Class[]{String.class}, Aweme.class);
        }
        Aweme aweme = null;
        if (this.f44609b.b(str)) {
            aweme = this.f44609b.a(str);
        }
        return aweme;
    }

    private AwemeStatistics f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44607a, false, 39921, new Class[]{String.class}, AwemeStatistics.class)) {
            return (AwemeStatistics) PatchProxy.accessDispatch(new Object[]{str}, this, f44607a, false, 39921, new Class[]{String.class}, AwemeStatistics.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            Aweme e2 = e(str);
            if (e2 == null) {
                return null;
            }
            AwemeStatistics statistics = e2.getStatistics();
            if (statistics == null) {
                statistics = new AwemeStatistics();
                e2.setStatistics(statistics);
            }
            return statistics;
        }
    }

    public final C0556a d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44607a, false, 39936, new Class[]{String.class}, C0556a.class)) {
            return (C0556a) PatchProxy.accessDispatch(new Object[]{str2}, this, f44607a, false, 39936, new Class[]{String.class}, C0556a.class);
        }
        C0556a aVar = this.f44612f.get(str2);
        if (aVar == null) {
            aVar = new C0556a();
        }
        return aVar;
    }

    private boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44607a, false, 39917, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f44607a, false, 39917, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            return aweme.isAd();
        }
    }

    public final Aweme a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44607a, false, 39912, new Class[]{Aweme.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme}, this, f44607a, false, 39912, new Class[]{Aweme.class}, Aweme.class);
        } else if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        } else {
            if (b(aweme) || c(aweme)) {
                return j.a().a(aweme);
            }
            return a(aweme, this.f44609b);
        }
    }

    public final Aweme b(String str) {
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{str}, this, f44607a, false, 39919, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f44607a, false, 39919, new Class[]{String.class}, Aweme.class);
        } else if (TextUtils.isEmpty(str) || PushConstants.PUSH_TYPE_NOTIFY.equals(str)) {
            return null;
        } else {
            if (this.f44609b.b(str)) {
                aweme = this.f44609b.a(str);
            } else {
                aweme = j.a().a(str);
            }
            return aweme;
        }
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44607a, false, 39922, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f44607a, false, 39922, new Class[]{String.class}, Void.TYPE);
            return;
        }
        j.a().d(str2);
        AwemeStatistics f2 = f(str);
        if (f2 != null) {
            f2.setCommentCount(f2.getCommentCount() + 1);
        }
    }

    public final Aweme a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f44607a, false, 39915, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f44607a, false, 39915, new Class[]{String.class}, Aweme.class);
        }
        String str2 = str + "type0";
        String str3 = str + "type1";
        Aweme aweme = null;
        if (this.f44609b.b(str2)) {
            aweme = this.f44609b.a(str2);
        } else if (this.f44609b.b(str3)) {
            aweme = this.f44609b.a(str3);
        }
        return aweme;
    }

    private Aweme a(Aweme aweme, com.ss.android.ugc.aweme.feed.a.a<String> aVar) {
        if (PatchProxy.isSupport(new Object[]{aweme, aVar}, this, f44607a, false, 39916, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.a.a.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme, aVar}, this, f44607a, false, 39916, new Class[]{Aweme.class, com.ss.android.ugc.aweme.feed.a.a.class}, Aweme.class);
        } else if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || this.f44609b == null || aweme.isProhibited() || aweme.isSelfSee()) {
            return aweme;
        } else {
            if (this.f44609b.b(aweme.getAid())) {
                Aweme a2 = this.f44609b.a(aweme.getAid());
                if (a2 != null) {
                    a2.update(aweme);
                    return a2;
                }
                this.f44609b.a(aweme.getAid(), aweme);
            } else {
                this.f44609b.a(aweme.getAid(), aweme);
            }
            return aweme;
        }
    }

    private void d(@NonNull Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39933, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39933, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        aweme.setUserDigg(i);
        if (i == 0) {
            b(aweme.getStatistics());
            return;
        }
        a(aweme.getStatistics());
        if (com.ss.android.g.a.a()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("mus_af_like_video_1", aweme.getAid());
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("mus_af_like_video_5", null);
        }
    }

    public final String c(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39941, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39941, new Class[]{Aweme.class, Integer.TYPE}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            C0556a d2 = a().d(aweme.getAid() + i);
            if (d2 != null) {
                return d2.f44615a;
            }
            return "";
        }
    }

    public final void d(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39935, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39935, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme b2 = b(str);
        if (b2 != null) {
            b2.setCollectStatus(i2);
        }
        if (com.ss.android.g.a.a() && i2 == 1) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("collect_video", str2);
        }
    }

    public final Aweme a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39913, new Class[]{Aweme.class, Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39913, new Class[]{Aweme.class, Integer.TYPE}, Aweme.class);
        } else if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        } else {
            if (b(aweme) || c(aweme)) {
                return j.a().a(aweme);
            }
            String str = aweme.getAid() + "type" + i;
            if (this.f44609b.b(str)) {
                Aweme a2 = this.f44609b.a(str);
                if (a2 != null) {
                    a2.update(aweme);
                    return a2;
                }
                this.f44609b.a(str, aweme);
            } else {
                this.f44609b.a(str, aweme);
            }
            return aweme;
        }
    }

    public final JSONObject b(Aweme aweme, int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39940, new Class[]{Aweme.class, Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f44607a, false, 39940, new Class[]{Aweme.class, Integer.TYPE}, JSONObject.class);
        } else if (aweme == null) {
            return new JSONObject();
        } else {
            String str2 = aweme.getAid() + i;
            JSONObject jSONObject = new JSONObject();
            try {
                C0556a d2 = a().d(str2);
                String str3 = d2.f44615a;
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("request_id", str3);
                }
                if (d2.f44616b != null) {
                    jSONObject.put("order", d2.f44616b);
                }
                if (aweme.isImage()) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                jSONObject.put("is_photo", str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            return jSONObject;
        }
    }

    public final void c(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39932, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39932, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            j a2 = j.a();
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, a2, j.f38834a, false, 30603, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                j jVar = a2;
                PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, jVar, j.f38834a, false, 30603, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str)) {
                Aweme a3 = a2.a(str2);
                if (a3 != null) {
                    a3.setUserDigg(i2);
                    if (i2 == 0) {
                        if (PatchProxy.isSupport(new Object[]{str2}, a2, j.f38834a, false, 30601, new Class[]{String.class}, Void.TYPE)) {
                            j jVar2 = a2;
                            PatchProxy.accessDispatch(new Object[]{str2}, jVar2, j.f38834a, false, 30601, new Class[]{String.class}, Void.TYPE);
                        } else {
                            AwemeStatistics c2 = a2.c(str2);
                            if (c2 != null) {
                                c2.setDiggCount(c2.getDiggCount() - 1);
                            }
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[]{str2}, a2, j.f38834a, false, 30600, new Class[]{String.class}, Void.TYPE)) {
                            j jVar3 = a2;
                            PatchProxy.accessDispatch(new Object[]{str2}, jVar3, j.f38834a, false, 30600, new Class[]{String.class}, Void.TYPE);
                        } else {
                            AwemeStatistics c3 = a2.c(str2);
                            if (c3 != null) {
                                c3.setDiggCount(c3.getDiggCount() + 1);
                            }
                        }
                    }
                }
            }
            Aweme e2 = e(str);
            if (e2 == null) {
                Aweme a4 = a(str2, 0);
                if (a4 != null) {
                    d(a4, i2);
                }
                Aweme a5 = a(str2, 1);
                if (a5 != null) {
                    d(a5, i2);
                }
                return;
            }
            d(e2, i2);
        }
    }

    public final void b(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39923, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f44607a, false, 39923, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        j.a().a(str2, i2);
        AwemeStatistics f2 = f(str);
        if (f2 != null) {
            f2.setCommentCount(i2);
        }
    }
}
