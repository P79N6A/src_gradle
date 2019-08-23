package com.ss.android.ugc.aweme.d.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.d.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41045a;

    /* renamed from: f  reason: collision with root package name */
    private static a f41046f;

    /* renamed from: b  reason: collision with root package name */
    public e f41047b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41048c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.d.b.a f41049d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.d.b.a f41050e;

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f41045a, true, 25646, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f41045a, true, 25646, new Class[0], a.class);
        }
        if (f41046f == null) {
            synchronized (a.class) {
                if (f41046f == null) {
                    f41046f = new a();
                }
            }
        }
        return f41046f;
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f41045a, false, 25659, new Class[0], Boolean.TYPE)) {
            return d.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41045a, false, 25659, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final b b() {
        if (PatchProxy.isSupport(new Object[0], this, f41045a, false, 25648, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f41045a, false, 25648, new Class[0], b.class);
        } else if (!f() || this.f41047b == null || this.f41047b.f41070b == null) {
            return null;
        } else {
            return a(this.f41047b.f41070b);
        }
    }

    public final b c() {
        if (PatchProxy.isSupport(new Object[0], this, f41045a, false, 25649, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f41045a, false, 25649, new Class[0], b.class);
        } else if (!f() || this.f41047b == null || this.f41047b.f41071c == null) {
            return null;
        } else {
            return a(this.f41047b.f41071c);
        }
    }

    public boolean d() {
        HashMap hashMap;
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41045a, false, 25654, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41045a, false, 25654, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            hashMap = (HashMap) new Gson().fromJson((String) x.a().I().c(), new TypeToken<HashMap<String, Integer>>() {
            }.getType());
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        int intValue = ((Integer) SharePrefCache.inst().getCompleteProfilePolicyTimes().c()).intValue();
        if (hashMap == null || !hashMap.containsKey(com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            i = 0;
        } else {
            i = ((Integer) hashMap.get(com.ss.android.ugc.aweme.account.d.a().getCurUserId())).intValue();
        }
        if (i >= intValue) {
            z = true;
        }
        return z;
    }

    public boolean e() {
        HashMap hashMap;
        long j;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41045a, false, 25655, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41045a, false, 25655, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            hashMap = (HashMap) new Gson().fromJson((String) x.a().H().c(), new TypeToken<HashMap<String, Long>>() {
            }.getType());
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        if (hashMap == null || !hashMap.containsKey(com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            j = 0;
        } else {
            j = ((Long) hashMap.get(com.ss.android.ugc.aweme.account.d.a().getCurUserId())).longValue();
        }
        if (((int) ((((System.currentTimeMillis() - j) / 1000) / 3600) / 24)) < ((Integer) SharePrefCache.inst().getCompleteProfilePolicyInterval().c()).intValue()) {
            z = true;
        }
        return z;
    }

    private b a(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f41045a, false, 25650, new Class[]{List.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f41045a, false, 25650, new Class[]{List.class}, b.class);
        }
        for (b next : list) {
            if (next.f41062f == com.ss.android.ugc.aweme.account.d.a().getCurUser().getLoginPlatform() && next.f41061e) {
                return next;
            }
        }
        return null;
    }

    private boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41045a, false, 25657, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41045a, false, 25657, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            if (str2.startsWith(AllStoryActivity.f73306b)) {
                String substring = str2.substring(AllStoryActivity.f73306b.length());
                if (!TextUtils.isEmpty(substring) && TextUtils.isDigitsOnly(substring)) {
                    return false;
                }
                return true;
            } else if (!str2.startsWith("用户")) {
                return true;
            } else {
                String substring2 = str2.substring("用户".length());
                if (!TextUtils.isEmpty(substring2) && TextUtils.isDigitsOnly(substring2)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41045a, false, 25660, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41045a, false, 25660, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (this.f41050e != null) {
                this.f41050e.a(System.currentTimeMillis());
            }
        } else {
            if (this.f41049d != null) {
                this.f41049d.a(System.currentTimeMillis());
            }
        }
    }

    public final d a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41045a, false, 25651, new Class[]{Integer.TYPE}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41045a, false, 25651, new Class[]{Integer.TYPE}, d.class);
        } else if (!f() || this.f41047b == null || this.f41047b.f41069a == null) {
            return null;
        } else {
            for (d next : this.f41047b.f41069a) {
                if (next.f41066a == i) {
                    return next;
                }
            }
            return null;
        }
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41045a, false, 25652, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41045a, false, 25652, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!f()) {
            return false;
        } else {
            if (z) {
                if (this.f41050e == null || !this.f41050e.b(System.currentTimeMillis())) {
                    return false;
                }
                return true;
            } else if (this.f41049d == null || !this.f41049d.b(System.currentTimeMillis())) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean b(List<String> list, int i, int i2) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41045a, false, 25656, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41045a, false, 25656, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (list2 == null || list.isEmpty()) {
            return false;
        } else {
            if (i < 100 && i2 < 100) {
                return false;
            }
            Set<String> set = (Set) SharePrefCache.inst().getDefaultAvatarUrl().c();
            if (set != null && !set.isEmpty()) {
                String str = list2.get(0);
                for (String parse : set) {
                    try {
                        if (str.contains(Uri.parse(parse).getLastPathSegment())) {
                            return false;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return true;
        }
    }

    public final c a(List<String> list, int i, int i2) {
        int i3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41045a, false, 25658, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41045a, false, 25658, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, c.class);
        }
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        float f8 = 0.0f;
        if (curUser == null) {
            return new c(false, 0.0f, 2);
        }
        if (b(list, i, i2)) {
            i3 = (int) (((Float) SharePrefCache.inst().getProfilePerfectionAvatar().c()).floatValue() * 100.0f);
        } else {
            i3 = 0;
        }
        if (a(curUser.getNickname())) {
            f2 = ((Float) SharePrefCache.inst().getProfilePerfectionNickname().c()).floatValue() * 100.0f;
        } else {
            f2 = 0.0f;
        }
        int i4 = (int) f2;
        if (!TextUtils.isEmpty(curUser.getUniqueId())) {
            f3 = ((Float) SharePrefCache.inst().getProfilePerfectionShortId().c()).floatValue() * 100.0f;
        } else {
            f3 = 0.0f;
        }
        int i5 = (int) f3;
        if (curUser.getGender() != 0) {
            f4 = ((Float) SharePrefCache.inst().getProfilePerfectionGender().c()).floatValue() * 100.0f;
        } else {
            f4 = 0.0f;
        }
        int i6 = (int) f4;
        if (!TextUtils.isEmpty(curUser.getBirthday())) {
            f5 = ((Float) SharePrefCache.inst().getProfilePerfectionBirthday().c()).floatValue() * 100.0f;
        } else {
            f5 = 0.0f;
        }
        int i7 = (int) f5;
        if (!TextUtils.isEmpty(curUser.getSchoolName())) {
            f6 = ((Float) SharePrefCache.inst().getProfilePerfectionSchool().c()).floatValue() * 100.0f;
        } else {
            f6 = 0.0f;
        }
        int i8 = (int) f6;
        if (!TextUtils.isEmpty(curUser.getSignature())) {
            f7 = ((Float) SharePrefCache.inst().getProfilePerfectionSignature().c()).floatValue() * 100.0f;
        } else {
            f7 = 0.0f;
        }
        int i9 = (int) f7;
        if (!TextUtils.isEmpty(curUser.getIsoCountryCode()) || !TextUtils.isEmpty(curUser.getCity())) {
            f8 = ((Float) SharePrefCache.inst().getProfilePerfectionLocation().c()).floatValue() * 100.0f;
        }
        int i10 = i4 + i3 + i5 + i6 + i7 + i8 + i9 + ((int) f8);
        if (i10 >= ((int) (((Float) SharePrefCache.inst().getProfileCompletionThreshold().c()).floatValue() * 100.0f))) {
            return new c(false, (float) i10, 0);
        }
        if (i3 != 0) {
            return new c(true, (float) i10, 1);
        }
        return new c(true, (float) i10, 2);
    }
}
