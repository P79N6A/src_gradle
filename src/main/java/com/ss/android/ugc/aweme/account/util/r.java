package com.ss.android.ugc.aweme.account.util;

import a.i;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.MusLoginManager;
import com.ss.android.ugc.aweme.account.login.bean.a;
import com.ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.ss.android.ugc.aweme.account.terminal.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33113a;

    public static i<String> b() {
        if (PatchProxy.isSupport(new Object[0], null, f33113a, true, 21434, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f33113a, true, 21434, new Class[0], i.class);
        }
        return i.a(w.f33123b);
    }

    public static i<a> a() {
        if (PatchProxy.isSupport(new Object[0], null, f33113a, true, 21430, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f33113a, true, 21430, new Class[0], i.class);
        }
        if (g.b().bB().booleanValue()) {
            CachedUserAgeInfo c2 = c();
            if (c2 != null) {
                return a(c2.getBirthday(), c2.getUserMode(), true);
            }
        }
        return i.a(t.f33117b);
    }

    private static CachedUserAgeInfo c() {
        HashMap hashMap;
        if (PatchProxy.isSupport(new Object[0], null, f33113a, true, 21447, new Class[0], CachedUserAgeInfo.class)) {
            return (CachedUserAgeInfo) PatchProxy.accessDispatch(new Object[0], null, f33113a, true, 21447, new Class[0], CachedUserAgeInfo.class);
        }
        try {
            hashMap = (HashMap) new Gson().fromJson(n.d(), new TypeToken<HashMap<String, CachedUserAgeInfo>>() {
            }.getType());
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), w.e())) {
                    return (CachedUserAgeInfo) entry.getValue();
                }
            }
        }
        return null;
    }

    public static i<Bundle> b(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, null, f33113a, true, 21432, new Class[]{Bundle.class}, i.class)) {
            return i.a((Callable<TResult>) new u<TResult>(bundle2)).a((a.g<TResult, TContinuationResult>) new v<TResult,TContinuationResult>(bundle2), i.f1052b);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f33113a, true, 21432, new Class[]{Bundle.class}, i.class);
    }

    public static i<a> a(@NonNull Bundle bundle) {
        AgeGateResponse ageGateResponse;
        Bundle bundle2 = bundle;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f33113a, true, 21429, new Class[]{Bundle.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f33113a, true, 21429, new Class[]{Bundle.class}, i.class);
        }
        if (bundle2.getSerializable("age_gate_response") != null) {
            ageGateResponse = (AgeGateResponse) bundle2.getSerializable("age_gate_response");
        } else {
            ageGateResponse = null;
        }
        if (ageGateResponse != null && n.c() == 1) {
            if (!ageGateResponse.is_eligible()) {
                i = 2;
            }
            bundle2.putInt("user_mode", i);
            if (g.b().bB().booleanValue()) {
                return a(b.a(), i, false);
            }
            return new MusLoginManager().a(i);
        } else if (g.b().bB().booleanValue()) {
            return a(b.a(), -1, false);
        } else {
            return i.a(s.f33115b);
        }
    }

    static final /* synthetic */ User c(@NonNull Bundle bundle) throws Exception {
        try {
            User queryUser = w.a().queryUser(null, true);
            d.a(true, 0, "", bundle);
            if (n.c() == 1 && queryUser.getUserMode() == 0) {
                SharedPreferences a2 = c.a(w.b(), "aweme_user", 0);
                int i = bundle.getInt("user_mode", -1);
                if (i != 2) {
                    if (i != 1) {
                        int i2 = a2.getInt("ftc_user_mode_prefix_" + queryUser.getUid(), 0);
                        if (i2 == 2 || i2 == 1) {
                            queryUser.setUserMode(i2);
                        }
                    }
                }
                queryUser.setUserMode(i);
                SharedPreferences.Editor edit = a2.edit();
                edit.putInt("ftc_user_mode_prefix_" + queryUser.getUid(), i).commit();
            }
            return queryUser;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            d.a(false, e2.getErrorCode(), e2.getErrorMsg(), bundle);
            if (e2.getErrorCode() == 9) {
                w.a().setUserBanned();
            } else if (e2.getErrorCode() == 14) {
                w.a().setUserLogicDelete(e2.getErrorMsg());
            }
            throw e2;
        }
    }

    private static void a(String str) {
        HashMap hashMap;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33113a, true, 21449, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f33113a, true, 21449, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            hashMap = (HashMap) new Gson().fromJson(n.d(), new TypeToken<HashMap<String, CachedUserAgeInfo>>() {
            }.getType());
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str2)) {
                    hashMap.remove(entry.getKey());
                    break;
                }
            }
            n.a(new Gson().toJson((Object) hashMap));
        }
    }

    private static i<a> a(String str, int i, boolean z) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f33113a, true, 21446, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z)}, null, f33113a, true, 21446, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, i.class);
        }
        MusLoginManager musLoginManager = new MusLoginManager();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("birthday", str2);
        }
        if (i2 != -1) {
            hashMap.put("user_mode", String.valueOf(i));
        }
        if (hashMap.containsKey("birthday")) {
            return musLoginManager.a(hashMap).b(new y(str2, i2, z), i.f1051a);
        }
        return i.a(z.f33131b);
    }

    static final /* synthetic */ i a(String str, int i, boolean z, i iVar) throws Exception {
        HashMap hashMap;
        if (iVar.d() || iVar.c() || !(((a) iVar.e()).f32181a == 0 || ((a) iVar.e()).f32181a == 5)) {
            String e2 = w.e();
            CachedUserAgeInfo cachedUserAgeInfo = new CachedUserAgeInfo(str, i);
            int i2 = 2;
            if (PatchProxy.isSupport(new Object[]{e2, cachedUserAgeInfo}, null, f33113a, true, 21448, new Class[]{String.class, CachedUserAgeInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{e2, cachedUserAgeInfo}, null, f33113a, true, 21448, new Class[]{String.class, CachedUserAgeInfo.class}, Void.TYPE);
            } else {
                String d2 = n.d();
                if (TextUtils.isEmpty(d2)) {
                    hashMap = new HashMap();
                    hashMap.put(e2, cachedUserAgeInfo);
                } else {
                    try {
                        hashMap = (HashMap) new Gson().fromJson(d2, new TypeToken<HashMap<String, CachedUserAgeInfo>>() {
                        }.getType());
                    } catch (Exception unused) {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        hashMap.put(e2, cachedUserAgeInfo);
                    }
                }
                n.a(new Gson().toJson((Object) hashMap));
            }
            com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a().a("type", "/aweme/v1/user/info/sync/").a("error_message", Integer.valueOf(((a) iVar.e()).f32181a));
            if (!z) {
                i2 = 1;
            }
            n.b("compliance_api_status", "", a2.a("status", Integer.valueOf(i2)).b());
        } else if (iVar.b() && (((a) iVar.e()).f32181a == 0 || ((a) iVar.e()).f32181a == 5)) {
            if (z) {
                a(w.e());
            } else {
                b.f33082a = "";
            }
            n.b("compliance_api_status", "", com.ss.android.ugc.aweme.account.a.a.a.a().a("type", "/aweme/v1/user/info/sync/").a("status", (Integer) 0).b());
        }
        return i.a(aa.f33074b);
    }
}
