package com.bytedance.android.livesdk.schema;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.chatroom.detail.i;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

@Keep
public class RoomActionHandler implements b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean canHandle(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, changeQuickRedirect, false, 13165, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, this, changeQuickRedirect, false, 13165, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a() && TextUtils.equals("live", uri.getHost())) {
            return true;
        } else {
            if (a.f() && TextUtils.equals("xigua_live", uri.getHost())) {
                return true;
            }
            if (a.d()) {
                if (TextUtils.equals("room", uri.getHost())) {
                    return true;
                }
                if (TextUtils.equals("live", uri.getHost())) {
                    return TextUtils.equals(uri.getPath(), "/detail");
                }
            }
            if (!TextUtils.equals("webcast_room", uri.getHost()) || (!TextUtils.equals("/", uri.getPath()) && !TextUtils.equals("", uri.getPath()))) {
                return false;
            }
            return true;
        }
    }

    public boolean handle(final Context context, Uri uri) {
        String str;
        String str2;
        Context context2 = context;
        final Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 13166, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 13166, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        String queryParameter = uri2.getQueryParameter("room_id");
        long j = 0;
        if (!TextUtils.isEmpty(queryParameter)) {
            long parseLong = Long.parseLong(queryParameter);
            if (parseLong > 0) {
                String str3 = "";
                if (a.f()) {
                    String queryParameter2 = uri2.getQueryParameter("cell_type");
                    str2 = uri2.getQueryParameter("enter_from") + "_WITHIN_" + uri2.getQueryParameter("category_name");
                    str3 = uri2.getQueryParameter("author_id");
                    str = queryParameter2;
                } else {
                    str2 = uri2.getQueryParameter("enter_from_merge");
                    str = uri2.getQueryParameter("enter_method");
                }
                String queryParameter3 = uri2.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    try {
                        j = Long.parseLong(queryParameter3);
                    } catch (NumberFormatException unused) {
                    }
                }
                b.a a2 = new b.a().a(parseLong);
                a2.t = str3;
                b.a g = a2.a(uri2.getQueryParameter("enter_live_source")).b(uri2.getQueryParameter("enter_from_v3")).i(str2).j(uri2.getQueryParameter("enter_method")).c(uri2.getQueryParameter("enter_from_module")).d(uri2.getQueryParameter("msg_type")).b(j).e(uri2.getQueryParameter("gift_id")).f(uri2.getQueryParameter("tip")).j(str).h(uri2.getQueryParameter("log_pb")).g(uri2.getQueryParameter("tip_i18n"));
                g.u = uri2.getQueryParameter("top_message_type");
                return handleEnterRoom(context, g.k(uri2.getQueryParameter("xt_back_room")));
            }
        } else {
            String queryParameter4 = uri2.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter4)) {
                long parseLong2 = Long.parseLong(queryParameter4);
                if (parseLong2 > 0) {
                    TTLiveSDKContext.getHostService().k().b(parseLong2).subscribe((SingleObserver<? super T>) new SingleObserver<User>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17158a;

                        public final void onError(Throwable th) {
                        }

                        public final void onSubscribe(Disposable disposable) {
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            User user = (User) obj;
                            if (PatchProxy.isSupport(new Object[]{user}, this, f17158a, false, 13176, new Class[]{User.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{user}, this, f17158a, false, 13176, new Class[]{User.class}, Void.TYPE);
                                return;
                            }
                            long liveRoomId = user.getLiveRoomId();
                            if (liveRoomId > 0) {
                                RoomActionHandler.this.handleEnterRoom(context, new b.a().a(liveRoomId).a(uri2.getQueryParameter("enter_live_source")).b(uri2.getQueryParameter("enter_from_v3")).j(uri2.getQueryParameter("enter_method")).i(uri2.getQueryParameter("enter_from_merge")).c(uri2.getQueryParameter("enter_from_module")).d(uri2.getQueryParameter("msg_type")).e(uri2.getQueryParameter("gift_id")).f(uri2.getQueryParameter("tip")).g(uri2.getQueryParameter("tip_i18n")));
                            }
                        }
                    });
                }
            }
        }
        return false;
    }

    public boolean handleEnterRoom(Context context, b.a aVar) {
        boolean z;
        boolean z2;
        final Context context2 = context;
        final b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, changeQuickRedirect, false, 13167, new Class[]{Context.class, b.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, changeQuickRedirect, false, 13167, new Class[]{Context.class, b.a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar2.f17168a <= 0) {
            return false;
        } else {
            Room a2 = TTLiveSDKContext.getLiveService().d().a();
            boolean f2 = a.f();
            if (aVar2.r < 0) {
                z = true;
            } else {
                z = false;
            }
            if (f2 && z) {
                new i(new b.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17162a;

                    public final void a(int i, String str) {
                    }

                    public final void a(@NonNull Room room) {
                        if (PatchProxy.isSupport(new Object[]{room}, this, f17162a, false, 13177, new Class[]{Room.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{room}, this, f17162a, false, 13177, new Class[]{Room.class}, Void.TYPE);
                            return;
                        }
                        if (room != null) {
                            aVar2.r = room.getOrientation();
                            RoomActionHandler.this.handleEnterRoom(context2, aVar2);
                        }
                    }
                }, aVar2.f17168a).a();
                return true;
            } else if (a2 == null) {
                Bundle bundle = new Bundle();
                bundle.putLong("live.intent.extra.ROOM_ID", aVar2.f17168a);
                bundle.putString("live.intent.extra.ENTER_LIVE_SOURCE", aVar2.f17169b);
                bundle.putString("live.intent.extra.REQUEST_ID", aVar2.n);
                bundle.putString("live.intent.extra.LOG_PB", aVar2.o);
                bundle.putLong("live.intent.extra.USER_FROM", aVar2.p);
                bundle.putInt("orientation", aVar2.r);
                bundle.putString("author_id", aVar2.t);
                if (aVar2.q == null) {
                    aVar2.q = new Bundle();
                }
                aVar2.q.putString("enter_from", aVar2.f17170c);
                aVar2.q.putString("enter_from_merge", aVar2.f17171d);
                aVar2.q.putString("enter_method", aVar2.f17173f);
                aVar2.q.putBoolean("live.intent.extra.OPEN_GIFT_PANEL", aVar2.k);
                aVar2.q.putBoolean("live.intent.extra.OPEN_PROP_PANEL", aVar2.l);
                aVar2.q.putString("top_message_type", aVar2.u);
                bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", aVar2.q);
                if (aVar2.m != null) {
                    aVar2.q.putAll(aVar2.m);
                }
                bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", aVar2.q);
                TTLiveSDKContext.getHostService().j().a(context2, aVar2.f17168a, bundle);
                return true;
            } else if (a2.getOwner() != null && a2.getOwner().getId() == TTLiveSDKContext.getHostService().k().b()) {
                new m.a(context2, 0).a(false).c((int) C0906R.string.dc1).b(0, (int) C0906R.string.dc3, f.f17182b).c();
                return true;
            } else if (a2.getId() == aVar2.f17168a) {
                Class d2 = TTLiveSDKContext.getHostService().c().d();
                if (d2 != null && !d2.isAssignableFrom(context.getClass())) {
                    ((Activity) context2).finish();
                }
                return true;
            } else if (2 == ((Integer) e.a().f9041c).intValue()) {
                new m.a(context2, 0).a(false).c((int) C0906R.string.dc4).b(0, (int) C0906R.string.dc3, g.f17184b).c();
                return true;
            } else if (!TextUtils.isEmpty(aVar2.i) || !TextUtils.isEmpty(aVar2.j)) {
                Spanned spanned = null;
                if (!TextUtils.isEmpty(aVar2.j)) {
                    try {
                        com.bytedance.android.livesdkapi.h.e eVar = (com.bytedance.android.livesdkapi.h.e) j.q().c().fromJson(aVar2.j, com.bytedance.android.livesdkapi.h.e.class);
                        if (eVar != null) {
                            String a3 = com.bytedance.android.livesdk.i18n.b.a().a(eVar.f18782a);
                            String str = eVar.f18783b;
                            if (TextUtils.isEmpty(a3)) {
                                a3 = str;
                            }
                            spanned = y.a(a3, eVar);
                        }
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.c("RoomSchemaHandler", e2.getMessage());
                    }
                }
                if (spanned == null || spanned == x.f10027b) {
                    spanned = new SpannableString(aVar2.i);
                }
                if (!TextUtils.isEmpty(spanned)) {
                    m.a b2 = new m.a(context2, 1).a(false).c((CharSequence) spanned);
                    if (a.k()) {
                        b2.b(2, (int) C0906R.string.dc5, (DialogInterface.OnClickListener) new h(this, a2, aVar2)).b(3, (int) C0906R.string.dc2, i.f17190b).c();
                    } else {
                        if (((Boolean) com.bytedance.android.livesdk.w.b.aK.a()).booleanValue()) {
                            b2.b(2, (int) C0906R.string.dc7, (DialogInterface.OnClickListener) new j(this, a2, aVar2)).b(3, (int) C0906R.string.dc6, (DialogInterface.OnClickListener) new k(this, a2, aVar2)).b(4, (int) C0906R.string.dc2, l.f17200b).c();
                        } else {
                            z2 = true;
                            jumpToOtherRoom(a2, aVar2.f17168a, aVar2.f17171d, aVar2.f17173f, aVar2.f17170c, aVar2.f17172e, aVar2.g, aVar2.h, aVar2.f17169b, aVar2.r, aVar2.s, aVar2.p, aVar2.u);
                            return z2;
                        }
                    }
                }
                z2 = true;
                return z2;
            } else {
                jumpToOtherRoom(a2, aVar2.f17168a, aVar2.f17171d, aVar2.f17173f, aVar2.f17170c, aVar2.f17172e, aVar2.g, aVar2.h, aVar2.f17169b, aVar2.r, aVar2.s, aVar2.p, aVar2.u);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleEnterRoom$2$RoomActionHandler(Room room, b.a aVar, DialogInterface dialogInterface, int i) {
        b.a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f17168a, aVar2.f17171d, aVar2.f17173f, aVar2.f17170c, aVar2.f17172e, aVar2.g, aVar2.h, aVar2.f17169b, aVar2.r, aVar2.s, aVar2.p, aVar2.u);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleEnterRoom$4$RoomActionHandler(Room room, b.a aVar, DialogInterface dialogInterface, int i) {
        b.a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f17168a, aVar2.f17171d, aVar2.f17173f, aVar2.f17170c, aVar2.f17172e, aVar2.g, aVar2.h, aVar2.f17169b, aVar2.r, aVar2.s, aVar2.p, aVar2.u);
        com.bytedance.android.livesdk.w.b.aK.a(Boolean.FALSE);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleEnterRoom$5$RoomActionHandler(Room room, b.a aVar, DialogInterface dialogInterface, int i) {
        b.a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f17168a, aVar2.f17171d, aVar2.f17173f, aVar2.f17170c, aVar2.f17172e, aVar2.g, aVar2.h, aVar2.f17169b, aVar2.r, aVar2.s, aVar2.p, aVar2.u);
        dialogInterface.dismiss();
    }

    private void jumpToOtherRoom(Room room, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, long j2, String str9) {
        long j3 = j;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{room, new Long(j3), str10, str11, str12, str13, str14, str15, str16, Integer.valueOf(i), str17, new Long(j4), str9}, this, changeQuickRedirect, false, 13168, new Class[]{Room.class, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room, new Long(j3), str10, str11, str12, str13, str14, str15, str16, Integer.valueOf(i), str17, new Long(j4), str9}, this, changeQuickRedirect, false, 13168, new Class[]{Room.class, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        l lVar = new l(j3);
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str12);
        bundle.putString("source", str13);
        bundle.putString("enter_from_merge", str10);
        bundle.putString("enter_method", str11);
        bundle.putLong("anchor_id", j4);
        bundle.putString("top_message_type", str9);
        bundle.putString("message_type", str14);
        bundle.putLong("live.intent.extra.FROM_ROOM_ID", room.getId());
        bundle.putInt("orientation", i);
        if (!StringUtils.isEmpty(str6)) {
            bundle.putString("gift_id", str15);
        }
        lVar.f10184c = bundle;
        lVar.f10183b = str16;
        if ("true".equals(str17)) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.m(lVar));
        } else {
            com.bytedance.android.livesdk.u.a.a().a((Object) lVar);
        }
    }
}
