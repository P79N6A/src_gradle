package com.ss.android.ugc.aweme.ah;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.content.PermissionChecker;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ah.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.video.o;
import java.util.HashMap;
import java.util.Map;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33253a;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, String> f33254e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static HashMap<String, String> f33255f = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f33256b = "MainActivity";

    /* renamed from: c  reason: collision with root package name */
    String f33257c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f33258d = true;
    private int g = -1;
    private b h;

    /* renamed from: com.ss.android.ugc.aweme.ah.a$a  reason: collision with other inner class name */
    public static class C0419a {

        /* renamed from: a  reason: collision with root package name */
        public static String f33262a;

        /* renamed from: b  reason: collision with root package name */
        public static String f33263b;

        /* renamed from: c  reason: collision with root package name */
        public static String f33264c;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f33265a = false;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f33266b = false;

        /* renamed from: c  reason: collision with root package name */
        public static Aweme f33267c = null;

        /* renamed from: d  reason: collision with root package name */
        public static String f33268d = "detail";
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static String f33269a = null;

        /* renamed from: b  reason: collision with root package name */
        public static String f33270b = "HOME";

        /* renamed from: c  reason: collision with root package name */
        public static String f33271c = "";

        /* renamed from: d  reason: collision with root package name */
        public static String f33272d = "0";

        /* renamed from: e  reason: collision with root package name */
        public static String f33273e;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    static {
        f33254e.put("MainActivity", "");
        f33254e.put("I18nMainActivity", "");
        f33254e.put("DetailActivity", "");
        f33254e.put("IDetailActivity", "");
        f33254e.put("SearchResultActivity", "");
        f33254e.put("VideoRecordNewActivity", "video_shoot_page");
        f33254e.put("VideoPublishEditActivity", "video_edit_page");
        f33254e.put("VideoPublishActivity", "video_post_page");
        f33254e.put("OnlineMusicFragmentActivity", "song_category");
        f33254e.put("MusicDetailActivity", "single_song");
        f33254e.put("PoiDetailActivity", "poi_page");
        f33254e.put("ChallengeDetailActivity", "challenge");
        f33254e.put("LivePageActivity", "live_merge");
        f33254e.put("LivePlayActivity", "live");
        f33254e.put("RankingListActivity", "hot_search_page");
        f33254e.put("ChatRoomActivity", "chat");
        f33254e.put("VideoFollowFeedDetailActivity", "homepage_follow");
        f33255f.put("MainActivity", "");
        f33255f.put("I18nMainActivity", "");
        f33255f.put("DetailActivity", "");
        f33255f.put("IDetailActivity", "");
    }

    public final void onActivityPaused(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f33253a, false, 71001, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f33253a, false, 71001, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            this.f33258d = false;
            this.f33257c = activity.getClass().getSimpleName();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f33253a, false, 71000, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f33253a, false, 71000, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            this.f33256b = activity.getClass().getSimpleName();
            this.f33258d = true;
            if (!"MainActivity".equals(this.f33256b)) {
                b.f33265a = false;
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f33253a, false, 71002, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f33253a, false, 71002, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            String simpleName = activity.getClass().getSimpleName();
            if (!TextUtils.equals(simpleName, this.f33256b)) {
                this.f33257c = simpleName;
            }
        }
    }

    public a(final Context context) {
        b bVar;
        if (context != null) {
            this.g = PermissionChecker.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
            if (this.g == 0) {
                if (PatchProxy.isSupport(new Object[]{context}, null, b.f33274a, true, 71005, new Class[]{Context.class}, b.class)) {
                    bVar = (b) PatchProxy.accessDispatch(new Object[]{context}, null, b.f33274a, true, 71005, new Class[]{Context.class}, b.class);
                } else {
                    bVar = new b(context);
                }
                this.h = bVar;
                this.h.f33279f = new b.C0420b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33259a;

                    public final void a(String str) {
                        String str2;
                        String str3;
                        boolean z;
                        long j;
                        String str4 = str;
                        if (PatchProxy.isSupport(new Object[]{str4}, this, f33259a, false, 71004, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str4}, this, f33259a, false, 71004, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        if (a.f33254e.containsKey(a.this.f33256b) && a.this.f33258d) {
                            a aVar = a.this;
                            String str5 = a.this.f33256b;
                            if (PatchProxy.isSupport(new Object[]{str5}, aVar, a.f33253a, false, 70995, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str5}, aVar, a.f33253a, false, 70995, new Class[]{String.class}, Void.TYPE);
                            } else {
                                if (PatchProxy.isSupport(new Object[]{str5}, aVar, a.f33253a, false, 70997, new Class[]{String.class}, String.class)) {
                                    str2 = (String) PatchProxy.accessDispatch(new Object[]{str5}, aVar, a.f33253a, false, 70997, new Class[]{String.class}, String.class);
                                } else {
                                    str2 = "";
                                    if (str5.contains("MainActivity")) {
                                        if (TextUtils.equals("HOME", c.f33270b) || TextUtils.equals("feed", c.f33270b) || TextUtils.equals("feed", c.f33270b)) {
                                            str2 = (TextUtils.equals(c.f33271c, "toplist_homepage_fresh") || TextUtils.equals(c.f33271c, "homepage_fresh")) ? "homepage_fresh" : "homepage_hot";
                                        } else if (TextUtils.equals(c.f33270b, "DISCOVER")) {
                                            str2 = com.ss.android.ugc.aweme.i18n.c.a() ? "discovery" : "homepage_follow";
                                        } else if (TextUtils.equals(c.f33270b, "USER")) {
                                            str2 = "personal_homepage";
                                        } else if (TextUtils.equals(c.f33270b, "discover")) {
                                            str2 = "discovery";
                                        } else if (TextUtils.equals(c.f33270b, "profile")) {
                                            str2 = "others_homepage";
                                        }
                                    } else if ((!TextUtils.equals(str5, "DetailActivity") && !TextUtils.equals(str5, "IDetailActivity")) || TextUtils.isEmpty(aVar.f33257c)) {
                                        str2 = TextUtils.equals(str5, "SearchResultActivity") ? TextUtils.equals(c.f33269a, "search_result") ? "" : "general_search" : a.f33254e.get(str5);
                                    } else if (!aVar.f33257c.contains("MainActivity")) {
                                        str2 = TextUtils.equals(aVar.f33257c, "SearchResultActivity") ? TextUtils.equals(c.f33269a, "search_result") ? "search_result" : "general_search" : TextUtils.equals(str5, "MusicDetailActivity") ? TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, c.f33273e) ? "others_homepage" : a.f33254e.get(aVar.f33257c) : a.f33254e.containsKey(aVar.f33257c) ? a.f33254e.get(aVar.f33257c) : C0419a.f33264c;
                                    } else if (TextUtils.equals(c.f33270b, "profile") || TextUtils.equals(c.f33270b, "page_profile")) {
                                        str2 = "others_homepage";
                                    } else if (TextUtils.equals(c.f33270b, "DISCOVER")) {
                                        str2 = TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, c.f33273e) ? "others_homepage" : "discovery";
                                    } else if (TextUtils.equals(c.f33270b, "USER")) {
                                        str2 = "personal_homepage";
                                    } else if (TextUtils.equals(c.f33270b, "discover")) {
                                        str2 = "discovery";
                                    } else if (TextUtils.equals("HOME", c.f33270b) || TextUtils.equals("feed", c.f33270b) || TextUtils.equals("feed", c.f33270b)) {
                                        str2 = (TextUtils.equals(c.f33271c, "toplist_homepage_fresh") || TextUtils.equals(c.f33271c, "homepage_fresh")) ? "homepage_fresh" : "homepage_hot";
                                    }
                                }
                                if (PatchProxy.isSupport(new Object[]{str5}, aVar, a.f33253a, false, 70996, new Class[]{String.class}, String.class)) {
                                    str3 = (String) PatchProxy.accessDispatch(new Object[]{str5}, aVar, a.f33253a, false, 70996, new Class[]{String.class}, String.class);
                                } else if (TextUtils.equals(str5, "DetailActivity") || TextUtils.equals(str5, "IDetailActivity")) {
                                    str3 = "video_play";
                                } else {
                                    if (str5.contains("MainActivity")) {
                                        if (TextUtils.equals("HOME", c.f33270b) || TextUtils.equals("feed", c.f33270b) || TextUtils.equals(c.f33270b, "feed")) {
                                            if (TextUtils.equals(c.f33271c, "toplist_homepage_fresh") || TextUtils.equals(c.f33271c, "homepage_fresh")) {
                                                str3 = "display";
                                            } else {
                                                str3 = "video_play";
                                            }
                                        } else if (TextUtils.equals(c.f33270b, "DISCOVER")) {
                                            str3 = "video_play";
                                        }
                                    } else if (TextUtils.equals(str5, "SearchResultActivity")) {
                                        str3 = "video_play";
                                    } else if (TextUtils.equals(str5, "PoiDetailActivity")) {
                                        str3 = "video_play";
                                    }
                                    str3 = "display";
                                }
                                d a2 = d.a();
                                a2.a("page_type", str3);
                                a2.a("enter_from", str2);
                                if (PatchProxy.isSupport(new Object[]{str3}, aVar, a.f33253a, false, 70998, new Class[]{String.class}, Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str3}, aVar, a.f33253a, false, 70998, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    z = TextUtils.equals(str3, "video_play");
                                }
                                if (z) {
                                    a2.a("comment_unfold", c.f33272d);
                                }
                                if (TextUtils.equals(str5, "video_shoot_page")) {
                                    a2.a("sticker_loaded", PushConstants.PUSH_TYPE_NOTIFY);
                                }
                                if (!TextUtils.isEmpty(C0419a.f33262a) && !TextUtils.isEmpty(C0419a.f33263b)) {
                                    a2.a("group_id", C0419a.f33262a);
                                    a2.a("author_id", C0419a.f33263b);
                                    if (!o.v()) {
                                        j = o.b().c() / 1000;
                                    } else {
                                        j = com.ss.android.ugc.playerkit.videoview.a.a().d() / 1000;
                                    }
                                    a2.a("group_time", j);
                                }
                                r.a("screenshot", (Map) a2.f34114b);
                            }
                        }
                        if (a.f33255f.containsKey(a.this.f33256b)) {
                            if ("DetailActivity".equals(a.this.f33256b) || "IDetailActivity".equals(a.this.f33256b)) {
                                b.f33266b = true;
                            } else {
                                b.f33266b = false;
                            }
                            if (!"MainActivity".equals(a.this.f33256b) || b.f33265a) {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryStartShareScreenShotActivity(context, str4);
                            }
                        }
                    }
                };
                b bVar2 = this.h;
                if (PatchProxy.isSupport(new Object[0], bVar2, b.f33274a, false, 71006, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar2, b.f33274a, false, 71006, new Class[0], Void.TYPE);
                    return;
                }
                bVar2.f33277d.clear();
                bVar2.g = System.currentTimeMillis();
                bVar2.h = new b.a(MediaStore.Images.Media.INTERNAL_CONTENT_URI, bVar2.j);
                bVar2.i = new b.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, bVar2.j);
                bVar2.f33278e.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, false, bVar2.h);
                bVar2.f33278e.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, bVar2.i);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f33253a, false, 71003, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f33253a, false, 71003, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            String simpleName = activity.getClass().getSimpleName();
            if (!TextUtils.isEmpty(simpleName) && (TextUtils.equals(simpleName, "IDetailActivity") || TextUtils.equals(simpleName, "DetailActivity"))) {
                c.f33273e = null;
            }
            if (!TextUtils.isEmpty(simpleName) && simpleName.contains("MainActivity") && this.h != null) {
                b bVar = this.h;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f33274a, false, 71007, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, b.f33274a, false, 71007, new Class[0], Void.TYPE);
                } else {
                    if (bVar.h != null) {
                        try {
                            bVar.f33278e.getContentResolver().unregisterContentObserver(bVar.h);
                        } catch (Exception unused) {
                        }
                        bVar.h = null;
                    }
                    if (bVar.i != null) {
                        try {
                            bVar.f33278e.getContentResolver().unregisterContentObserver(bVar.i);
                        } catch (Exception unused2) {
                        }
                        bVar.i = null;
                    }
                    bVar.g = 0;
                    bVar.f33277d.clear();
                }
            }
            C0419a.f33262a = null;
            C0419a.f33263b = null;
            C0419a.f33264c = "";
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f33253a, false, 70999, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f33253a, false, 70999, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            String simpleName = activity.getClass().getSimpleName();
            c.f33272d = PushConstants.PUSH_TYPE_NOTIFY;
            if (simpleName.contains("MainActivity")) {
                c.f33270b = "HOME";
            } else if (TextUtils.equals(simpleName, "SearchResultActivity")) {
                c.f33269a = "general_search";
            } else if (TextUtils.equals(simpleName, "DetailActivity") || TextUtils.equals(simpleName, "IDetailActivity")) {
                c.f33273e = "feed";
            }
        }
    }
}
