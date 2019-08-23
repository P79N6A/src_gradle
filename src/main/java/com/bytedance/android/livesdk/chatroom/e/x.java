package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.ColorRes;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.ui.ei;
import com.bytedance.android.livesdk.message.model.aa;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.message.model.ap;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.message.model.av;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.message.model.bb;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.message.model.bj;
import com.bytedance.android.livesdk.message.model.bo;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.message.model.f;
import com.bytedance.android.livesdk.message.model.j;
import com.bytedance.android.livesdk.message.model.p;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.message.model.v;
import com.bytedance.android.livesdk.message.model.y;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10026a;

    /* renamed from: b  reason: collision with root package name */
    public static final Spannable f10027b = new SpannableString("");

    /* renamed from: c  reason: collision with root package name */
    static final int f10028c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.x$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10029a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.f.a[] r0 = com.bytedance.android.livesdkapi.depend.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10029a = r0
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.CHAT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.GIFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.GIFT_GROUP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.DIGG     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.MEMBER     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.ROOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.SOCIAL     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.CONTROL     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.SCREEN     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.ROOM_RICH_CHAT_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.LUCKY_BOX     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.LOTTERY     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.COMMENT_IMAGE     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00ce }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.GOODS_ORDER     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00da }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.ASSET_MESSAGE     // Catch:{ NoSuchFieldError -> 0x00da }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                int[] r0 = f10029a     // Catch:{ NoSuchFieldError -> 0x00e6 }
                com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.e.x.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        int i;
        if (com.bytedance.android.live.uikit.a.a.d()) {
            i = 18;
        } else {
            i = 16;
        }
        f10028c = i;
    }

    public static int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f10026a, true, 5428, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ac.e().getResources().getColor(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f10026a, true, 5428, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public static b a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f10026a, true, 5420, new Class[]{c.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f10026a, true, 5420, new Class[]{c.class}, b.class);
        }
        switch (AnonymousClass1.f10029a[cVar.getMessageType().ordinal()]) {
            case 1:
                return new d((e) cVar2);
            case 2:
                return new l((ab) cVar2);
            case 3:
                return new l(y.a((y) cVar2));
            case 4:
                return new i((q) cVar2);
            case 5:
                return new k((aa) cVar2);
            case 6:
                return new h((p) cVar2);
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                return new p((as) cVar2);
            case 8:
                return new u((bb) cVar2);
            case 9:
                return new w((bj) cVar2);
            case 10:
                return new f((j) cVar2);
            case 11:
                return new v((bi) cVar2);
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return new t((ay) cVar2);
            case 13:
                if (com.bytedance.android.livesdk.a.f8887a.booleanValue() && (cVar2 instanceof av)) {
                    return new n((av) cVar2);
                }
                if (com.bytedance.android.livesdk.a.f8887a.booleanValue() && (cVar2 instanceof aq)) {
                    return new n(av.a((aq) cVar2));
                }
                if (cVar2 instanceof aq) {
                    return new o((aq) cVar2);
                }
                return null;
            case 14:
                return new m((ap) cVar2);
            case 15:
                return new e((f) cVar2);
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                return new j((v) cVar2);
            case 17:
                return new aa((bo) cVar2);
            case 18:
                return new c((com.bytedance.android.livesdk.message.model.a) cVar2);
            case 19:
                at atVar = (at) cVar2;
                if (atVar.f16497b != null) {
                    if ("buy_card".equals(atVar.f16497b.f16498a)) {
                        return new r(atVar);
                    }
                    if ("enter_by_card".equals(atVar.f16497b.f16498a)) {
                        return new s(atVar);
                    }
                }
                break;
        }
        return new g(cVar2);
    }

    public static Spannable a(Spannable spannable, Bitmap bitmap) {
        Spannable spannable2 = spannable;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{spannable2, bitmap2}, null, f10026a, true, 5426, new Class[]{Spannable.class, Bitmap.class}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{spannable2, bitmap2}, null, f10026a, true, 5426, new Class[]{Spannable.class, Bitmap.class}, Spannable.class);
        } else if (bitmap2 == null || spannable2 == null || spannable.length() == 0) {
            return spannable2;
        } else {
            Context e2 = ac.e();
            int dip2Px = (int) UIUtils.dip2Px(ac.e(), (float) f10028c);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(e2.getResources(), bitmap2);
            bitmapDrawable.setBounds(0, 0, dip2Px, dip2Px);
            spannable2.setSpan(new com.bytedance.android.livesdk.widget.c(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
            return spannable2;
        }
    }

    public static Spannable a(String str, @ColorRes int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f10026a, true, 5425, new Class[]{String.class, Integer.TYPE}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f10026a, true, 5425, new Class[]{String.class, Integer.TYPE}, Spannable.class);
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(a(i)), 0, spannableString.length(), 18);
        return spannableString;
    }

    public static Spannable b(User user, String str, String str2, @ColorRes int i, @ColorRes int i2, boolean z) {
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, null, f10026a, true, 5423, new Class[]{User.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Spannable.class)) {
            Object[] objArr = {user2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0};
            return (Spannable) PatchProxy.accessDispatch(objArr, null, f10026a, true, 5423, new Class[]{User.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Spannable.class);
        } else if (user2 == null || TextUtils.isEmpty(com.bytedance.android.livesdk.message.c.a(user)) || TextUtils.isEmpty(com.bytedance.android.livesdk.message.c.a(user)) || TextUtils.isEmpty(str2)) {
            return f10027b;
        } else {
            String a2 = com.bytedance.android.livesdk.message.c.a(user);
            ei eiVar = new ei(user2, a(i), false);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a(i2));
            SpannableString spannableString = new SpannableString(a2 + str3 + str4);
            spannableString.setSpan(eiVar, 0, a2.length() + 1, 33);
            spannableString.setSpan(foregroundColorSpan, a2.length() + 1, spannableString.length(), 18);
            return spannableString;
        }
    }

    public static Spannable a(User user, String str, String str2, @ColorRes int i, @ColorRes int i2, boolean z) {
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, null, f10026a, true, 5422, new Class[]{User.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Spannable.class)) {
            Object[] objArr = {user2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0};
            return (Spannable) PatchProxy.accessDispatch(objArr, null, f10026a, true, 5422, new Class[]{User.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Spannable.class);
        } else if (user2 == null || TextUtils.isEmpty(com.bytedance.android.livesdk.message.c.a(user)) || TextUtils.isEmpty(com.bytedance.android.livesdk.message.c.a(user)) || TextUtils.isEmpty(str2)) {
            return f10027b;
        } else {
            String a2 = com.bytedance.android.livesdk.message.c.a(user);
            ei eiVar = new ei(user2, a(i), false);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a(i2));
            SpannableString spannableString = new SpannableString(a2 + str3 + str4);
            spannableString.setSpan(eiVar, 0, a2.length(), 33);
            spannableString.setSpan(foregroundColorSpan, a2.length(), spannableString.length(), 18);
            return spannableString;
        }
    }
}
