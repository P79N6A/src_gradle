package com.ss.android.ugc.aweme.profile.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import java.util.List;
import org.json.JSONObject;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61359a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.i.a.a f61360b;

    /* renamed from: c  reason: collision with root package name */
    public DownloadInfo f61361c;

    /* renamed from: d  reason: collision with root package name */
    private b f61362d;

    public interface a {
        void a();
    }

    @SuppressLint({"CI_StaticFieldLeak"})
    class b extends AsyncTask<String, Void, DownloadInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61370a;

        private b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String[] r0 = (java.lang.String[]) r0
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f61370a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
                r7[r9] = r3
                java.lang.Class<com.ss.android.socialbase.downloader.model.DownloadInfo> r8 = com.ss.android.socialbase.downloader.model.DownloadInfo.class
                r5 = 0
                r6 = 70044(0x1119c, float:9.8153E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003b
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f61370a
                r13 = 0
                r14 = 70044(0x1119c, float:9.8153E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
                r15[r9] = r0
                java.lang.Class<com.ss.android.socialbase.downloader.model.DownloadInfo> r16 = com.ss.android.socialbase.downloader.model.DownloadInfo.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
                return r0
            L_0x003b:
                if (r0 == 0) goto L_0x0058
                int r1 = r0.length
                if (r1 <= 0) goto L_0x0049
                r1 = r0[r9]
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x0049
                goto L_0x0058
            L_0x0049:
                r0 = r0[r9]
                com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
                android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.getAppDownloadInfo(r2, r0)
                return r0
            L_0x0058:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.aa.b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final /* synthetic */ void onPostExecute(Object obj) {
            DownloadInfo downloadInfo = (DownloadInfo) obj;
            if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f61370a, false, 70045, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f61370a, false, 70045, new Class[]{DownloadInfo.class}, Void.TYPE);
                return;
            }
            super.onPostExecute(downloadInfo);
            if (!isCancelled()) {
                if (downloadInfo != null) {
                    try {
                        if (downloadInfo.getId() != 0 && !Downloader.getInstance(GlobalContext.getContext()).isDownloadSuccessAndFileNotExist(downloadInfo)) {
                            if (aa.this.f61361c == null || !(aa.this.f61361c.getStatus() == -4 || aa.this.f61361c.getStatus() == -1)) {
                                aa.this.f61361c = downloadInfo;
                            } else {
                                aa.this.f61361c = null;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                aa.this.f61361c = null;
            }
        }

        /* synthetic */ b(aa aaVar, byte b2) {
            this();
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61359a, false, 70041, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61359a, false, 70041, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!(this.f61362d == null || this.f61362d.getStatus() == AsyncTask.Status.FINISHED)) {
            this.f61362d.cancel(true);
        }
        this.f61362d = new b(this, (byte) 0);
        com.ss.android.downloadlib.c.a.a.a(this.f61362d, str);
    }

    private boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f61359a, false, 70039, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f61359a, false, 70039, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!(context2 instanceof Activity) || ((Activity) context2).isFinishing()) {
            return false;
        } else {
            return true;
        }
    }

    public final String a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61359a, false, 70037, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, this, f61359a, false, 70037, new Class[]{User.class}, String.class);
        }
        String str = "snssdk143://profile?uid=" + user.getUid();
        List<FollowerDetail> followerDetailList = user.getFollowerDetailList();
        if (followerDetailList != null) {
            for (FollowerDetail next : followerDetailList) {
                if (next.getPackageName().equals("com.ss.android.article.news")) {
                    return next.getOpenUrl();
                }
            }
        }
        return str;
    }

    private String a(Context context, FollowerDetail followerDetail) {
        if (PatchProxy.isSupport(new Object[]{context, followerDetail}, this, f61359a, false, 70038, new Class[]{Context.class, FollowerDetail.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, followerDetail}, this, f61359a, false, 70038, new Class[]{Context.class, FollowerDetail.class}, String.class);
        } else if (!ToolUtils.isInstalledApp(context, followerDetail.getPackageName())) {
            return context.getString(C0906R.string.b0z);
        } else {
            if (this.f61360b == null || this.f61360b.a("news_article")) {
                return context.getString(C0906R.string.b12);
            }
            return context.getString(C0906R.string.b14);
        }
    }

    private String b(Context context, FollowerDetail followerDetail) {
        if (PatchProxy.isSupport(new Object[]{context, followerDetail}, this, f61359a, false, 70040, new Class[]{Context.class, FollowerDetail.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, followerDetail}, this, f61359a, false, 70040, new Class[]{Context.class, FollowerDetail.class}, String.class);
        } else if (!ToolUtils.isInstalledApp(context, followerDetail.getPackageName())) {
            return context.getString(C0906R.string.bg3, new Object[]{followerDetail.getName()});
        } else if (this.f61360b == null || this.f61360b.a("news_article")) {
            return context.getString(C0906R.string.b13, new Object[]{followerDetail.getName()});
        } else {
            return context.getString(C0906R.string.ff, new Object[]{followerDetail.getName()});
        }
    }

    public final void a(Context context, FollowerDetail followerDetail, User user, a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, followerDetail, user, aVar}, this, f61359a, false, 70036, new Class[]{Context.class, FollowerDetail.class, User.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, followerDetail, user, aVar}, this, f61359a, false, 70036, new Class[]{Context.class, FollowerDetail.class, User.class, a.class}, Void.TYPE);
            return;
        }
        if (a(context) && followerDetail != null) {
            a(followerDetail.getDownloadUrl());
            if (this.f61360b == null) {
                this.f61360b = com.ss.android.i.a.b.a(context);
            }
            AlertDialog.Builder message = com.ss.android.a.a.a(context).setMessage((CharSequence) b(context, followerDetail));
            String a2 = a(context, followerDetail);
            final User user2 = user;
            final Context context2 = context;
            final FollowerDetail followerDetail2 = followerDetail;
            final a aVar2 = aVar;
            AnonymousClass2 r0 = new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61364a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    String str2;
                    String str3;
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61364a, false, 70043, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61364a, false, 70043, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    } else if (user2 != null) {
                        if (!ToolUtils.isInstalledApp(context2, followerDetail2.getPackageName()) || !aa.this.f61360b.a("news_article")) {
                            aa aaVar = aa.this;
                            Context context = context2;
                            FollowerDetail followerDetail = followerDetail2;
                            if (PatchProxy.isSupport(new Object[]{context, followerDetail}, aaVar, aa.f61359a, false, 70042, new Class[]{Context.class, FollowerDetail.class}, Void.TYPE)) {
                                Object[] objArr = {context, followerDetail};
                                aa aaVar2 = aaVar;
                                ChangeQuickRedirect changeQuickRedirect = aa.f61359a;
                                PatchProxy.accessDispatch(objArr, aaVar2, changeQuickRedirect, false, 70042, new Class[]{Context.class, FollowerDetail.class}, Void.TYPE);
                            } else if (aaVar.f61361c == null || (aaVar.f61361c.getStatus() != -3 && !Downloader.getInstance(context).canResume(aaVar.f61361c.getId()))) {
                                if (!TextUtils.isEmpty(followerDetail.getAppName())) {
                                    str = followerDetail.getAppName();
                                } else {
                                    str = followerDetail.getName();
                                }
                                j.a(true, false, (JSONObject) null, new AppTaskBuilder(context, followerDetail.getDownloadUrl()).name(str).showNotification(true).mimeType("application/vnd.android.package-archive"));
                            } else {
                                AppDownloader.getInstance().handleStatusClick(context, aaVar.f61361c.getId(), aaVar.f61361c.getStatus());
                            }
                        } else if (aVar2 != null) {
                            MobClick eventName = MobClick.obtain().setEventName("head_to_other_link");
                            if (user2.isMe()) {
                                str3 = "personal_homepage";
                            } else {
                                str3 = "others_homepage";
                            }
                            r.onEvent(eventName.setLabelName(str3).setValue(user2.getUid()).setJsonObject(c.a().a("link_type", followerDetail2.getAppName()).a("enter_from", "fans_power").b()));
                            aVar2.a();
                        } else {
                            MobClick eventName2 = MobClick.obtain().setEventName("head_to_other_link");
                            if (user2.isMe()) {
                                str2 = "personal_homepage";
                            } else {
                                str2 = "others_homepage";
                            }
                            r.onEvent(eventName2.setLabelName(str2).setValue(user2.getUid()).setJsonObject(c.a().a("link_type", followerDetail2.getAppName()).a("enter_from", "more_profile").b()));
                            if (TextUtils.equals(d.a().getCurUserId(), user2.getUid())) {
                                AwemeSSOPlatformUtils.a(context2, followerDetail2.getPackageName(), d.a().getCurUserId());
                                return;
                            }
                            Uri parse = Uri.parse(aa.this.a(user2));
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(parse);
                            context2.startActivity(intent);
                        }
                    }
                }
            };
            message.setPositiveButton((CharSequence) a2, (DialogInterface.OnClickListener) r0).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setCancelable(false).show();
        }
    }
}
