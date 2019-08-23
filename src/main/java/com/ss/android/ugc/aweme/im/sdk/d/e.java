package com.ss.android.ugc.aweme.im.sdk.d;

import a.g;
import a.i;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.im.sdk.h.c.a;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.model.f;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.c;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51217a;

    /* renamed from: d  reason: collision with root package name */
    private static e f51218d;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, IMUser> f51219b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f51220c;

    public final void a(@NonNull Map<String, String> map, m mVar) {
        if (PatchProxy.isSupport(new Object[]{map, mVar}, this, f51217a, false, 51724, new Class[]{Map.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, mVar}, this, f51217a, false, 51724, new Class[]{Map.class, m.class}, Void.TYPE);
        } else if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() != null && !this.f51220c.contains(next.getKey()) && !TextUtils.isEmpty((CharSequence) next.getValue())) {
                    this.f51220c.add(next.getKey());
                    sb.append("\"");
                    sb.append((String) next.getValue());
                    sb.append("\",");
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                a("[" + sb2.substring(0, sb2.lastIndexOf(",")) + "]", map, true, mVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Map<String, String> map, boolean z, m mVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map, Byte.valueOf(z ? (byte) 1 : 0), mVar}, this, f51217a, false, 51725, new Class[]{String.class, Map.class, Boolean.TYPE, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map, Byte.valueOf(z), mVar}, this, f51217a, false, 51725, new Class[]{String.class, Map.class, Boolean.TYPE, m.class}, Void.TYPE);
            return;
        }
        f fVar = new f(this, z, str, map, mVar);
        r.a(str2, (g<f, List<IMUser>>) fVar).a(g.f51239b, i.f1052b);
    }

    public final void a(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, this, f51217a, false, 51729, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2}, this, f51217a, false, 51729, new Class[]{IMUser.class}, Void.TYPE);
        } else if (iMUser2 != null) {
            a.a().a(iMUser2);
            b(iMUser);
        }
    }

    public final void a(IMUser iMUser, boolean z) {
        if (PatchProxy.isSupport(new Object[]{iMUser, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51217a, false, 51735, new Class[]{IMUser.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser, Byte.valueOf(z)}, this, f51217a, false, 51735, new Class[]{IMUser.class, Boolean.TYPE}, Void.TYPE);
        } else if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
            String uid = iMUser.getUid();
            if (((IMUser) this.f51219b.get(uid)) != null) {
                if (iMUser.getFollowStatus() == 0 && iMUser.isHasUnreadStory()) {
                    iMUser.setHasUnreadStory(false);
                }
                this.f51219b.remove(uid);
                this.f51219b.put(uid, iMUser);
                b(iMUser, z);
            }
        }
    }

    public final List<IMUser> a(List<IMUser> list, String str) {
        List<IMUser> list2 = list;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{list2, str2}, this, f51217a, false, 51740, new Class[]{List.class, String.class}, List.class)) {
            return a(list2, str2, false);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{list2, str2}, this, f51217a, false, 51740, new Class[]{List.class, String.class}, List.class);
    }

    public final List<IMUser> a(List<IMUser> list, String str, boolean z) {
        String str2;
        String str3 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51217a, false, 51741, new Class[]{List.class, String.class, Boolean.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, str3, Byte.valueOf(z)}, this, f51217a, false, 51741, new Class[]{List.class, String.class, Boolean.TYPE}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            while (true) {
                if (i >= str.length()) {
                    str2 = str3;
                    break;
                } else if (com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str3.charAt(i))) {
                    str2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(str).toLowerCase();
                    break;
                } else {
                    i++;
                }
            }
            for (IMUser next : list) {
                if (z || next.getType() == 0 || next.getType() == 3) {
                    if (!TextUtils.isEmpty(next.getRemarkName()) && (a(next.getRemarkName(), lowerCase) || (!m.a() && (a(next.getRemarkInitial(), lowerCase) || a(next.getRemarkName(), next.getRemarkPinyin(), lowerCase, str2))))) {
                        next.setSearchType(5);
                        arrayList.add(next);
                    } else if (!TextUtils.isEmpty(next.getNickName()) && (a(next.getNickName(), lowerCase) || (!m.a() && (a(next.getNickNameInitial(), lowerCase) || a(next.getNickName(), next.getNickNamePinyin(), lowerCase, str2))))) {
                        next.setSearchType(3);
                        arrayList.add(next);
                    } else if (!TextUtils.isEmpty(next.getContactName()) && (a(next.getContactName(), lowerCase) || ((!m.a() && a(next.getContactNameInitial(), lowerCase)) || a(next.getContactName(), next.getContactNamePinyin(), lowerCase, str2)))) {
                        next.setSearchType(2);
                        arrayList.add(next);
                    } else if (!m.b()) {
                        if (!TextUtils.isEmpty(next.getUniqueId())) {
                            if (a(next.getUniqueId(), lowerCase)) {
                                next.setSearchType(1);
                                arrayList.add(next);
                            }
                        } else if (a(next.getShortId(), lowerCase)) {
                            next.setSearchType(1);
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        if (!m.b() && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<IMUser>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51230a;

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    int i;
                    IMUser iMUser = (IMUser) obj;
                    IMUser iMUser2 = (IMUser) obj2;
                    if (PatchProxy.isSupport(new Object[]{iMUser, iMUser2}, this, f51230a, false, 51754, new Class[]{IMUser.class, IMUser.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{iMUser, iMUser2}, this, f51230a, false, 51754, new Class[]{IMUser.class, IMUser.class}, Integer.TYPE)).intValue();
                    } else if (iMUser == null && iMUser2 == null) {
                        return 0;
                    } else {
                        if (iMUser != null && iMUser2 != null) {
                            i = Integer.compare(iMUser2.getSearchType(), iMUser.getSearchType());
                        } else if (iMUser != null) {
                            return 1;
                        } else {
                            i = -1;
                        }
                        return i;
                    }
                }
            });
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String str3 = str2;
        if (!PatchProxy.isSupport(new Object[]{str, str3}, this, f51217a, false, 51742, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return !TextUtils.isEmpty(str) && str.toLowerCase().contains(str3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3}, this, f51217a, false, 51742, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, this, f51217a, false, 51743, new Class[]{String.class, String.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str5, str6, str7, str8}, this, f51217a, false, 51743, new Class[]{String.class, String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
            return false;
        } else {
            if (str2.contains(str3)) {
                return true;
            }
            if (!str6.contains(str8)) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            for (char a2 : str3.toCharArray()) {
                if (com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(a2)) {
                    if (i > i2 && !str5.contains(str7.substring(i2, i))) {
                        return false;
                    }
                    i++;
                    i2 = i;
                } else if (i != str3.length() - 1) {
                    i++;
                } else if (!str5.contains(str7.substring(i2, i + 1))) {
                    return false;
                }
            }
            return true;
        }
    }

    private e() {
        if (PatchProxy.isSupport(new Object[0], this, f51217a, false, 51722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51217a, false, 51722, new Class[0], Void.TYPE);
            return;
        }
        this.f51219b = new LruCache<>(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        this.f51220c = new HashSet();
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f51217a, true, 51721, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f51217a, true, 51721, new Class[0], e.class);
        }
        if (f51218d == null) {
            synchronized (e.class) {
                if (f51218d == null) {
                    f51218d = new e();
                }
            }
        }
        return f51218d;
    }

    private void b(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, this, f51217a, false, 51734, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2}, this, f51217a, false, 51734, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        a(iMUser2, iMUser.isHasUnreadStory());
    }

    public final IMUser a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f51217a, false, 51726, new Class[]{String.class}, IMUser.class)) {
            return a(str2, false);
        }
        return (IMUser) PatchProxy.accessDispatch(new Object[]{str2}, this, f51217a, false, 51726, new Class[]{String.class}, IMUser.class);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51217a, false, 51731, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f51217a, false, 51731, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (((IMUser) this.f51219b.get(str)) != null) {
                this.f51219b.remove(str);
            }
            a.a().a(str);
        }
    }

    public static IMUser a(@NonNull IMContact iMContact) {
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{iMContact2}, null, f51217a, true, 51748, new Class[]{IMContact.class}, IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[]{iMContact2}, null, f51217a, true, 51748, new Class[]{IMContact.class}, IMUser.class);
        } else if (iMContact2 instanceof IMUser) {
            return (IMUser) iMContact2;
        } else {
            if (!(iMContact2 instanceof IMConversation)) {
                return null;
            }
            IMConversation iMConversation = (IMConversation) iMContact2;
            if (PatchProxy.isSupport(new Object[]{iMConversation}, null, f51217a, true, 51747, new Class[]{IMConversation.class}, IMUser.class)) {
                return (IMUser) PatchProxy.accessDispatch(new Object[]{iMConversation}, null, f51217a, true, 51747, new Class[]{IMConversation.class}, IMUser.class);
            } else if (iMConversation.getConversationType() != d.a.f20886a) {
                return null;
            } else {
                return a().b(String.valueOf(com.bytedance.im.core.d.e.a(iMConversation.getConversationId())));
            }
        }
    }

    static final /* synthetic */ Void a(i iVar) throws Exception {
        List<IMUser> list = (List) iVar.e();
        if (iVar.b() && list != null && list.size() > 0) {
            for (IMUser iMUser : list) {
                if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
                    c.a().d(new n(iMUser.getUid()));
                }
            }
        }
        return null;
    }

    public final IMUser b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f51217a, false, 51727, new Class[]{String.class}, IMUser.class)) {
            return a(str2, true);
        }
        return (IMUser) PatchProxy.accessDispatch(new Object[]{str2}, this, f51217a, false, 51727, new Class[]{String.class}, IMUser.class);
    }

    private void b(IMUser iMUser, boolean z) {
        final IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51217a, false, 51736, new Class[]{IMUser.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2, Byte.valueOf(z)}, this, f51217a, false, 51736, new Class[]{IMUser.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (iMUser.isHasUnreadStory() != z) {
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51227a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (PatchProxy.isSupport(new Object[0], this, f51227a, false, 51753, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f51227a, false, 51753, new Class[0], Void.class);
                    }
                    c.a().d(new n(iMUser2.getUid()));
                    return null;
                }
            }, i.f1052b);
        }
    }

    private void b(String str, String str2) {
        i iVar;
        final String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f51217a, false, 51723, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f51217a, false, 51723, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!this.f51220c.contains(str3) && !IMUser.isInvalidUser(str)) {
            this.f51220c.add(str3);
            AnonymousClass2 r0 = new g<UserStruct, Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51224a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f51224a, false, 51752, new Class[]{i.class}, Boolean.class)) {
                        return (Boolean) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51224a, false, 51752, new Class[]{i.class}, Boolean.class);
                    }
                    if (iVar.d()) {
                        if ((iVar.f() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) iVar.f()).getErrorCode() == 2065) {
                            a.a().a(str3);
                        }
                    } else if (iVar.b() && iVar.e() != null) {
                        User user = ((UserStruct) iVar.e()).getUser();
                        if (user != null && !TextUtils.isEmpty(user.getUid())) {
                            e.this.a(IMUser.fromUser(user));
                            return Boolean.TRUE;
                        }
                    }
                    return Boolean.FALSE;
                }
            };
            if (PatchProxy.isSupport(new Object[]{str3, str4, r0}, null, r.f52611a, true, 53451, new Class[]{String.class, String.class, g.class}, i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[]{str3, str4, r0}, null, r.f52611a, true, 53451, new Class[]{String.class, String.class, g.class}, i.class);
            } else {
                iVar = r.f52612b.fetchUser(str3, str4).a((g<TResult, TContinuationResult>) r0, (Executor) i.f1051a);
            }
            iVar.a((g<TResult, TContinuationResult>) new g<Boolean, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51221a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(i<Boolean> iVar) {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f51221a, false, 51751, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51221a, false, 51751, new Class[]{i.class}, Void.class);
                    }
                    e.this.f51220c.remove(str3);
                    if (iVar.b() && ((Boolean) iVar.e()).booleanValue()) {
                        c.a().d(new n(str3));
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }

    private void a(String str, IMUser iMUser) {
        String str2 = str;
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{str2, iMUser2}, this, f51217a, false, 51733, new Class[]{String.class, IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, iMUser2}, this, f51217a, false, 51733, new Class[]{String.class, IMUser.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || iMUser2 == null) {
        } else {
            this.f51219b.put(str2, iMUser2);
        }
    }

    public final IMUser a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51217a, false, 51728, new Class[]{String.class, Boolean.TYPE}, IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f51217a, false, 51728, new Class[]{String.class, Boolean.TYPE}, IMUser.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            IMUser iMUser = (IMUser) this.f51219b.get(str);
            if (iMUser == null) {
                iMUser = a.a().b(str);
                if (iMUser != null) {
                    a(str, iMUser);
                } else if (z) {
                    b(str, j.f51270d.b(str));
                }
            }
            return iMUser;
        }
    }
}
