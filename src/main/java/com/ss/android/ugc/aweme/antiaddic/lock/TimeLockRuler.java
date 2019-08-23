package com.ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
public class TimeLockRuler {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean sLastContentFilterState;
    private static TimeLockUserSetting setting;

    public static void clearCache() {
        setting = null;
    }

    public static int getContentFilterFlag() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21831, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21831, new Class[0], Integer.TYPE)).intValue();
        }
        if (!isContentFilterOn()) {
            return 0;
        }
        if (isTeenagerAbEnable()) {
            return 2;
        }
        return 1;
    }

    public static String getContentFilterFlagText() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21832, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21832, new Class[0], String.class);
        }
        return Integer.toString(getContentFilterFlag());
    }

    public static long getLastPasswordSetTime() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21816, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21816, new Class[0], Long.TYPE)).longValue();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getLastSetTime();
        }
        return 0;
    }

    public static String getPassword() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21817, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21817, new Class[0], String.class);
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getPassword();
        }
        return "";
    }

    public static int getSelfTimeInMin() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21825, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21825, new Class[0], Integer.TYPE)).intValue();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting == null) {
            return 0;
        }
        return userSetting.getLockTimeInMin();
    }

    public static boolean isInTeenagerModeNewVersion() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21826, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21826, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isRuleValid() && isContentFilterOn() && isTeenagerAbEnable()) {
            z = true;
        }
        return z;
    }

    public static boolean isTeenModeON() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21828, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21828, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() && isInTeenagerModeNewVersion()) {
            z = true;
        }
        return z;
    }

    public static void removeUserSetting() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21812, new Class[0], Void.TYPE);
        } else {
            bg.a(removeUserSettingWithoutNotify());
        }
    }

    private static an<String> getSharePrefCache() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21809, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21809, new Class[0], an.class);
        }
        x a2 = x.a();
        if (PatchProxy.isSupport(new Object[0], a2, x.f2698a, false, 22451, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], a2, x.f2698a, false, 22451, new Class[0], an.class);
        }
        if (a2.f2703f == null) {
            a2.f2703f = new an<>("users_time_lock_setting", "");
        }
        return a2.f2703f;
    }

    public static synchronized TimeLockUserSetting getUserSetting() {
        synchronized (TimeLockRuler.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21811, new Class[0], TimeLockUserSetting.class)) {
                TimeLockUserSetting timeLockUserSetting = (TimeLockUserSetting) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21811, new Class[0], TimeLockUserSetting.class);
                return timeLockUserSetting;
            }
            if (setting == null) {
                Iterator<TimeLockUserSetting> it2 = getUserSettingList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TimeLockUserSetting next = it2.next();
                        try {
                            if (d.a().getCurUserId().equals(next.getUserId())) {
                                setting = next;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            TimeLockUserSetting timeLockUserSetting2 = setting;
            return timeLockUserSetting2;
        }
    }

    public static boolean isContentFilterOn() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21819, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21819, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b.f33436b.b() != b.a.CHILD || !d.a().isLogin()) {
            z = isSelfContentFilterOn();
        } else {
            z = b.f33436b.c();
        }
        sLastContentFilterState = z;
        if (z || ((Boolean) x.a().l().c()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean isParentalPlatformContentFilterOn() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21822, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21822, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b.f33436b.b() != b.a.CHILD || !d.a().isLogin() || !b.f33436b.c()) {
            return false;
        }
        return true;
    }

    public static boolean isParentalPlatformOn() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21823, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21823, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!d.a().isLogin() || (b.f33436b.b() != b.a.CHILD && b.f33436b.b() != b.a.PARENT && !b.f33436b.c())) {
            return false;
        }
        return true;
    }

    public static boolean isSelfContentFilterOn() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21820, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21820, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c.f33443d.e()) {
            return c.f33443d.a();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null && userSetting.isContentFilterOn()) {
            z = true;
        }
        return z;
    }

    public static boolean isSelfTimeLockOn() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21821, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21821, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c.f33443d.e()) {
            return c.f33443d.b();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null && userSetting.isTimeLockOn()) {
            z = true;
        }
        return z;
    }

    public static boolean isTimeLockOn() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21818, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21818, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b.f33436b.b() != b.a.CHILD || !d.a().isLogin()) {
            return isSelfTimeLockOn();
        }
        b bVar = b.f33436b;
        if (PatchProxy.isSupport(new Object[0], bVar, b.f33435a, false, 21731, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f33435a, false, 21731, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = b.a();
        if (a2 != null) {
            i = a2.D;
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public static TimeLockUserSetting removeUserSettingWithoutNotify() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21813, new Class[0], TimeLockUserSetting.class)) {
            return (TimeLockUserSetting) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21813, new Class[0], TimeLockUserSetting.class);
        }
        List<TimeLockUserSetting> userSettingList = getUserSettingList();
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setUserId(d.a().getCurUserId());
        userSettingList.remove(timeLockUserSetting);
        getSharePrefCache().a(cb.a().toJson((Object) userSettingList));
        clearCache();
        return timeLockUserSetting;
    }

    public static int getLockTimeInMin() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21824, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21824, new Class[0], Integer.TYPE)).intValue();
        }
        if (b.f33436b.b() == b.a.CHILD && d.a().isLogin()) {
            b bVar = b.f33436b;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f33435a, false, 21732, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], bVar, b.f33435a, false, 21732, new Class[0], Integer.TYPE)).intValue();
            }
            c a2 = b.a();
            if (a2 != null) {
                return a2.D;
            }
            return 0;
        } else if (c.f33443d.e()) {
            return c.f33443d.c();
        } else {
            TimeLockUserSetting userSetting = getUserSetting();
            if (userSetting == null) {
                return 0;
            }
            return userSetting.getLockTimeInMin();
        }
    }

    private static List<TimeLockUserSetting> getUserSettingList() {
        TimeLockUserSetting timeLockUserSetting;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21810, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21810, new Class[0], List.class);
        }
        String str = (String) getSharePrefCache().c();
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            Gson a2 = cb.a();
            List list = (List) a2.fromJson(str, new TypeToken<List<TimeLockUserSetting>>() {
            }.getType());
            if (list.size() != 0 && TextUtils.isEmpty(((TimeLockUserSetting) list.get(0)).getUserId())) {
                list.clear();
                try {
                    for (com.ss.android.ugc.aweme.antiaddic.lock.entity.c cVar : (List) a2.fromJson(str, new TypeToken<List<com.ss.android.ugc.aweme.antiaddic.lock.entity.c>>() {
                    }.getType())) {
                        if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.antiaddic.lock.entity.c.f33453a, false, 21851, new Class[0], TimeLockUserSetting.class)) {
                            timeLockUserSetting = (TimeLockUserSetting) PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.antiaddic.lock.entity.c.f33453a, false, 21851, new Class[0], TimeLockUserSetting.class);
                        } else {
                            TimeLockUserSetting timeLockUserSetting2 = new TimeLockUserSetting();
                            timeLockUserSetting2.setUserId(cVar.f33454b);
                            timeLockUserSetting2.setLastSetTime(cVar.f33455c);
                            timeLockUserSetting2.setPassword(cVar.f33456d);
                            timeLockUserSetting2.setTimeLockOn(cVar.f33457e);
                            if (a.a()) {
                                timeLockUserSetting2.setContentFilterOn(cVar.f33458f);
                            }
                            timeLockUserSetting = timeLockUserSetting2;
                        }
                        list.add(timeLockUserSetting);
                    }
                    getSharePrefCache().a(a2.toJson((Object) list));
                } catch (Exception unused) {
                    getSharePrefCache().a("");
                }
            }
            arrayList = list;
        }
        return arrayList;
    }

    public static boolean isRuleValid() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21815, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21815, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((((Boolean) x.a().l().c()).booleanValue() || b.f33436b.b() == b.a.CHILD || c.f33443d.f()) && d.a().isLogin()) {
            return true;
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting == null) {
            return false;
        }
        if (!a.a()) {
            return true;
        }
        if (System.currentTimeMillis() - userSetting.getLastSetTime() <= 2592000000L) {
            return true;
        }
        removeUserSetting();
        return false;
    }

    public static boolean isTeenagerAbEnable() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 21827, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 21827, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((b.f33436b.b() != b.a.CHILD || !d.a().isLogin()) && !a.a()) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71870, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71870, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null || d2.enableTeenagerModeNew == 1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void applyUserSetting(TimeLockUserSetting timeLockUserSetting) {
        TimeLockUserSetting timeLockUserSetting2 = timeLockUserSetting;
        if (PatchProxy.isSupport(new Object[]{timeLockUserSetting2}, null, changeQuickRedirect, true, 21814, new Class[]{TimeLockUserSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{timeLockUserSetting2}, null, changeQuickRedirect, true, 21814, new Class[]{TimeLockUserSetting.class}, Void.TYPE);
            return;
        }
        List<TimeLockUserSetting> userSettingList = getUserSettingList();
        userSettingList.remove(timeLockUserSetting2);
        userSettingList.add(timeLockUserSetting2);
        getSharePrefCache().a(cb.a().toJson((Object) userSettingList));
        setting = timeLockUserSetting2;
        bg.a(timeLockUserSetting);
    }

    public static void disableStartActivityIfNeeded(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, changeQuickRedirect, true, 21829, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, changeQuickRedirect, true, 21829, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (isTeenModeON() && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean isEnableShowTeenageTip(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 21830, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 21830, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isTeenModeON()) {
            return false;
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), i).a();
            return true;
        }
    }
}
