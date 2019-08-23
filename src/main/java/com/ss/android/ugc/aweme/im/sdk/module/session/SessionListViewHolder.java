package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.n;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.a;
import com.ss.android.ugc.aweme.im.sdk.story.d;
import com.ss.android.ugc.aweme.im.sdk.story.widget.StoryCircleView;
import com.ss.android.ugc.aweme.im.sdk.utils.ak;
import com.ss.android.ugc.aweme.im.sdk.utils.at;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView;
import com.ss.android.ugc.aweme.im.sdk.widget.SessionStatusImageView;
import com.ss.android.ugc.aweme.im.sdk.widget.i;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class SessionListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3385b;

    /* renamed from: a  reason: collision with root package name */
    private final AvatarImageView f3386a;

    /* renamed from: c  reason: collision with root package name */
    b f3387c;

    /* renamed from: d  reason: collision with root package name */
    public String f3388d;

    /* renamed from: e  reason: collision with root package name */
    private final StoryCircleView f3389e;

    /* renamed from: f  reason: collision with root package name */
    private final AnimationImageView f3390f;
    private final AppCompatTextView g;
    private final AppCompatTextView h;
    private final AppCompatTextView i;
    private final AppCompatTextView j;
    private final BadgeTextView k;
    private final SessionStatusImageView l;
    private final ImageView m;
    private final ImageView n;
    private final ImageView o;
    private final View p;
    private final i q = new i();

    @Subscribe
    public void onUserUpdate(n nVar) {
        a.C0604a aVar;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f3385b, false, 52458, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f3385b, false, 52458, new Class[]{n.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.f3388d, nVar2.f51302a)) {
            IMUser b2 = e.a().b(nVar2.f51302a);
            if (b2 != null) {
                UrlModel avatarThumb = b2.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    c.a((RemoteImageView) this.f3386a, 2130839027);
                } else {
                    c.b(this.f3386a, avatarThumb);
                }
                String str = (String) this.f3386a.getTag(C0906R.id.j);
                if (!TextUtils.isEmpty(str)) {
                    b(b2, str);
                    a(b2, str);
                }
                this.g.setText(b2.getDisplayName());
                i iVar = this.q;
                if (PatchProxy.isSupport(new Object[]{b2}, iVar, i.f52858a, false, 54146, new Class[]{IMUser.class}, Void.TYPE)) {
                    i iVar2 = iVar;
                    PatchProxy.accessDispatch(new Object[]{b2}, iVar2, i.f52858a, false, 54146, new Class[]{IMUser.class}, Void.TYPE);
                    return;
                }
                ImageView imageView = iVar.f52859b;
                if (PatchProxy.isSupport(new Object[]{imageView, b2}, null, i.f52858a, true, 54147, new Class[]{ImageView.class, IMUser.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageView, b2}, null, i.f52858a, true, 54147, new Class[]{ImageView.class, IMUser.class}, Void.TYPE);
                    return;
                }
                if (ax.b(b2)) {
                    aVar = a.C0604a.MUSICIAN;
                } else if (ax.c(b2)) {
                    aVar = a.C0604a.ENTERPRISE;
                } else if (ax.a(b2)) {
                    aVar = a.C0604a.OTHER;
                } else {
                    aVar = a.C0604a.NONE;
                }
                ax.a(imageView, aVar);
            }
        }
    }

    private void a(AvatarImageView avatarImageView, com.ss.android.ugc.aweme.im.service.session.a aVar) {
        AvatarImageView avatarImageView2 = avatarImageView;
        com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{avatarImageView2, aVar2}, this, f3385b, false, 52455, new Class[]{AvatarImageView.class, com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarImageView2, aVar2}, this, f3385b, false, 52455, new Class[]{AvatarImageView.class, com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
            return;
        }
        if (aVar2.i instanceof UrlModel) {
            c.b(avatarImageView2, (UrlModel) aVar2.i);
        } else if (aVar2.i instanceof com.ss.android.ugc.aweme.base.model.a) {
            c.a((RemoteImageView) avatarImageView2, (com.ss.android.ugc.aweme.base.model.a) aVar2.i);
        }
        if (!TextUtils.isEmpty(aVar2.j)) {
            com.ss.android.ugc.aweme.im.sdk.utils.a.a((View) this.f3386a, aVar2.j);
        }
    }

    private void b(IMUser iMUser, String str) {
        if (PatchProxy.isSupport(new Object[]{iMUser, str}, this, f3385b, false, 52453, new Class[]{IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser, str}, this, f3385b, false, 52453, new Class[]{IMUser.class, String.class}, Void.TYPE);
            return;
        }
        if (iMUser != null && TextUtils.isEmpty(iMUser.getSecUid())) {
            com.ss.android.ugc.aweme.im.sdk.d.i.a(str);
        }
    }

    private void a(IMUser iMUser, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iMUser, str2}, this, f3385b, false, 52452, new Class[]{IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser, str2}, this, f3385b, false, 52452, new Class[]{IMUser.class, String.class}, Void.TYPE);
            return;
        }
        if (!m.a()) {
            this.f3387c.a(IMUser.toUser(iMUser), false, str2);
            if (d.a(iMUser)) {
                d.a(iMUser.getUid());
            }
        }
    }

    public void a(com.ss.android.ugc.aweme.im.service.session.a aVar, int i2) {
        com.ss.android.ugc.aweme.im.sdk.module.session.a.a.a aVar2;
        boolean z;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        com.ss.android.ugc.aweme.im.service.session.a aVar3 = aVar;
        int i11 = i2;
        if (PatchProxy.isSupport(new Object[]{aVar3, Integer.valueOf(i2)}, this, f3385b, false, 52451, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3, Integer.valueOf(i2)}, this, f3385b, false, 52451, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar3}, this, f3385b, false, 52454, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, com.ss.android.ugc.aweme.im.sdk.module.session.a.a.a.class)) {
            aVar2 = (com.ss.android.ugc.aweme.im.sdk.module.session.a.a.a) PatchProxy.accessDispatch(new Object[]{aVar3}, this, f3385b, false, 52454, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, com.ss.android.ugc.aweme.im.sdk.module.session.a.a.a.class);
        } else {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.module.session.a.a.b(aVar3);
        }
        this.l.setImageDrawable(aVar2.d());
        i iVar = this.q;
        if (PatchProxy.isSupport(new Object[]{aVar3}, iVar, i.f52858a, false, 54145, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            i iVar2 = iVar;
            PatchProxy.accessDispatch(new Object[]{aVar3}, iVar2, i.f52858a, false, 54145, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
        } else {
            iVar.f52859b.setVisibility(8);
            if (aVar.P_() == 1) {
                if (!m.a()) {
                    iVar.f52859b.setVisibility(0);
                    iVar.f52859b.setImageResource(2130840090);
                }
            } else if (aVar3 instanceof a) {
                long a2 = com.bytedance.im.core.d.e.a(aVar.O_());
                if (a2 > 0) {
                    IMUser b2 = e.a().b(String.valueOf(a2));
                    if (ax.b(b2)) {
                        ((a) aVar3).f51887b = a.C0604a.MUSICIAN;
                    } else if (ax.c(b2)) {
                        ((a) aVar3).f51887b = a.C0604a.ENTERPRISE;
                    } else if (ax.a(b2)) {
                        ((a) aVar3).f51887b = a.C0604a.OTHER;
                    } else {
                        ((a) aVar3).f51887b = a.C0604a.NONE;
                    }
                    ax.a(iVar.f52859b, ((a) aVar3).f51887b);
                }
            }
        }
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        this.k.setBadgeCount(0);
        UrlModel urlModel = null;
        this.f3388d = null;
        if (!m.a()) {
            this.f3387c.a(null, false, aVar.O_());
        }
        ((GenericDraweeHierarchy) this.f3386a.getHierarchy()).setPlaceholderImage(2130839027);
        com.bytedance.im.core.d.b a3 = com.bytedance.im.core.d.d.a().a(aVar.O_());
        if (!aVar.h() || a3 == null || !a3.isMute()) {
            z = false;
        } else {
            z = true;
        }
        int b3 = aVar.b();
        if (b3 == 10) {
            a(this.f3386a, aVar3);
            int f2 = ((com.ss.android.ugc.aweme.im.sdk.module.session.a.e) aVar3).f();
            ImageView imageView = this.n;
            if (f2 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            if (!aVar3.s) {
                z.a().a("message_assistant", i11, f2, false);
                aVar3.s = true;
            }
        } else if (b3 == 14) {
            a(this.f3386a, aVar3);
            this.k.setBadgeCount(aVar3.m);
            if (!aVar3.s) {
                z.a().f("ad_order_assistant_message");
                aVar3.s = true;
            }
        } else if (b3 != 20) {
            switch (b3) {
                case 0:
                    long a4 = com.bytedance.im.core.d.e.a(aVar.O_());
                    IMUser b4 = e.a().b(String.valueOf(a4));
                    this.f3388d = String.valueOf(a4);
                    if (b4 != null) {
                        urlModel = b4.getAvatarThumb();
                        b(b4, aVar.O_());
                        a(b4, aVar.O_());
                        com.ss.android.ugc.aweme.im.sdk.utils.a.a((ImageView) this.f3386a, b4);
                    }
                    if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
                        c.a((RemoteImageView) this.f3386a, 2130839027);
                    } else {
                        c.b(this.f3386a, urlModel);
                    }
                    if (z) {
                        ImageView imageView2 = this.n;
                        if (aVar3.m > 0) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        imageView2.setVisibility(i5);
                        this.k.setVisibility(8);
                    } else {
                        this.n.setVisibility(8);
                        this.k.setBadgeCount(aVar3.m);
                    }
                    if (!aVar3.s) {
                        z.a().g(String.valueOf(a4), "message");
                        z.a().a("chat_notice_show", aVar3.m);
                        aVar3.s = true;
                        break;
                    }
                    break;
                case 1:
                    if (aVar3.i instanceof UrlModel) {
                        c.b(this.f3386a, (UrlModel) aVar3.i);
                    }
                    com.ss.android.ugc.aweme.im.sdk.utils.a.a((View) this.f3386a, aVar3.j);
                    this.k.setBadgeCount(aVar3.m);
                    break;
                case 2:
                    c.a((RemoteImageView) this.f3386a, 2130840506);
                    com.ss.android.ugc.aweme.im.sdk.utils.a.a((View) this.f3386a, GlobalContext.getContext().getString(C0906R.string.aop));
                    ImageView imageView3 = this.n;
                    if (aVar3.m > 0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    imageView3.setVisibility(i6);
                    break;
                case 3:
                    a(this.f3386a, aVar3);
                    ImageView imageView4 = this.n;
                    if (aVar3.m > 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    imageView4.setVisibility(i7);
                    if (!aVar3.s) {
                        z.a().a("douyin_assistant", i11, aVar3.m, false);
                        aVar3.s = true;
                        break;
                    }
                    break;
                case 4:
                    a(this.f3386a, aVar3);
                    this.k.setBadgeCount(aVar3.m);
                    if (!aVar3.s) {
                        z.a().a("official_info", i11, aVar3.m, true);
                        aVar3.s = true;
                        break;
                    }
                    break;
                case 5:
                    a(this.f3386a, aVar3);
                    this.k.setBadgeCount(aVar3.m);
                    if (!aVar3.s) {
                        z.a().f("shopping_assistant_message");
                        aVar3.s = true;
                        break;
                    }
                    break;
                case 6:
                    aVar.g();
                    a(this.f3386a, aVar3);
                    ImageView imageView5 = this.n;
                    if (aVar3.m > 0) {
                        i8 = 0;
                    } else {
                        i8 = 8;
                    }
                    imageView5.setVisibility(i8);
                    if (!aVar3.s && aVar3.m > 0) {
                        z a5 = z.a();
                        if (PatchProxy.isSupport(new Object[]{"message_show"}, a5, z.f52670a, false, 53606, new Class[]{String.class}, Void.TYPE)) {
                            z zVar = a5;
                            PatchProxy.accessDispatch(new Object[]{"message_show"}, zVar, z.f52670a, false, 53606, new Class[]{String.class}, Void.TYPE);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("message_type", "game_assistant");
                            r.a("message_show", (Map) hashMap);
                        }
                        aVar3.s = true;
                        break;
                    }
                default:
                    switch (b3) {
                        case 17:
                            com.ss.android.ugc.aweme.im.service.model.d iMSetting = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting();
                            if (!(iMSetting == null || iMSetting.f52882e == null)) {
                                FlipChatSettings flipChatSettings = iMSetting.f52882e;
                                try {
                                    if (!TextUtils.isEmpty(flipChatSettings.getMsgCellAvatarUrl())) {
                                        ((GenericDraweeHierarchy) this.f3386a.getHierarchy()).setPlaceholderImage(2130840115);
                                        List singletonList = Collections.singletonList(flipChatSettings.getMsgCellAvatarUrl());
                                        UrlModel urlModel2 = new UrlModel();
                                        urlModel2.setUrlList(singletonList);
                                        aVar3.i = urlModel2;
                                    }
                                    if (!TextUtils.isEmpty(flipChatSettings.getMsgCellName())) {
                                        aVar3.j = flipChatSettings.getMsgCellName();
                                    }
                                } catch (com.bytedance.ies.a unused) {
                                }
                            }
                            a(this.f3386a, aVar3);
                            com.ss.android.ugc.aweme.im.sdk.module.session.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.module.session.a.b) aVar3;
                            int i12 = bVar.f51902b;
                            int i13 = bVar.m;
                            this.k.setBadgeCount(i13);
                            ImageView imageView6 = this.n;
                            if (i13 != 0 || i12 <= 0) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            imageView6.setVisibility(i9);
                            if (!aVar3.s) {
                                z a6 = z.a();
                                if (PatchProxy.isSupport(new Object[0], a6, z.f52670a, false, 53586, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], a6, z.f52670a, false, 53586, new Class[0], Void.TYPE);
                                } else {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("action_type", "show");
                                    r.a("flipchat_message_entrance", (Map) hashMap2);
                                }
                                aVar3.s = true;
                                break;
                            }
                            break;
                        case 18:
                            a(this.f3386a, aVar3);
                            this.k.setBadgeCount(aVar3.m);
                            if (!aVar3.s) {
                                aVar3.s = true;
                                break;
                            }
                            break;
                        default:
                            a(this.f3386a, aVar3);
                            if (!m.a()) {
                                this.k.setBadgeCount(aVar3.m);
                                break;
                            } else {
                                ImageView imageView7 = this.n;
                                if (aVar3.m > 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 8;
                                }
                                imageView7.setVisibility(i10);
                                break;
                            }
                    }
            }
        } else {
            if (TextUtils.isEmpty((String) aVar3.i)) {
                c.a((RemoteImageView) this.f3386a, 2130840086);
            } else {
                c.a((RemoteImageView) this.f3386a, (String) aVar3.i);
            }
            if (z) {
                ImageView imageView8 = this.n;
                if (aVar3.m > 0) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView8.setVisibility(i4);
                this.k.setVisibility(8);
            } else {
                this.n.setVisibility(8);
                this.k.setBadgeCount(aVar3.m);
            }
            if (!aVar3.s) {
                aVar3.s = true;
            }
            if (a3 != null) {
                this.h.setText(GlobalContext.getContext().getResources().getString(C0906R.string.ast, new Object[]{Integer.valueOf(a3.getMemberCount())}));
                this.h.setVisibility(0);
            }
        }
        if (z) {
            this.o.setVisibility(0);
        } else {
            this.o.setVisibility(8);
        }
        String a7 = aVar2.a();
        AppCompatTextView appCompatTextView = this.g;
        if (TextUtils.isEmpty(a7)) {
            a7 = "";
        }
        appCompatTextView.setText(a7);
        if (TextUtils.isEmpty(aVar2.b()) || aVar2.b().length() <= 300) {
            str = aVar2.b();
            if (str == null) {
                str = "";
            }
        } else {
            str = aVar2.b().substring(0, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        }
        if (aVar.b() == 20) {
            this.i.setText(((com.ss.android.ugc.aweme.im.sdk.module.session.a.c) aVar3).e());
        } else {
            this.i.setText(str);
        }
        if (aVar3.t) {
            g.a((TextView) this.i);
        }
        if (a3 == null || a3.getLastMessage() == null) {
            this.j.setText(aVar2.c());
        } else {
            this.j.setText(at.a(GlobalContext.getContext(), a3.getLastMessage().getCreatedAt()));
        }
        if (aVar3.o > 0) {
            ak.a(this.p, 2130838016, C0906R.color.r9);
        } else {
            View view = this.p;
            if (PatchProxy.isSupport(new Object[]{view}, null, ak.f52479a, true, 53680, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, null, ak.f52479a, true, 53680, new Class[]{View.class}, Void.TYPE);
            } else {
                ak.a(view, 2130837839, C0906R.color.ph);
            }
        }
        this.itemView.setTag(C0906R.id.k, Integer.valueOf(BaseLoginOrRegisterActivity.o));
        this.itemView.setTag(C0906R.id.l, Integer.valueOf(i2));
        this.f3386a.setTag(C0906R.id.k, 102);
        this.f3386a.setTag(C0906R.id.l, Integer.valueOf(i2));
        this.f3386a.setTag(C0906R.id.i, this.f3387c);
        this.f3386a.setTag(C0906R.id.j, aVar.O_());
    }

    public SessionListViewHolder(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(view);
        view.setOnClickListener(onClickListener);
        view.setOnLongClickListener(onLongClickListener);
        this.f3386a = (AvatarImageView) view.findViewById(C0906R.id.i2);
        this.f3389e = (StoryCircleView) view.findViewById(C0906R.id.ie);
        this.f3390f = (AnimationImageView) view.findViewById(C0906R.id.i8);
        this.f3386a.setOnClickListener(onClickListener);
        this.g = (AppCompatTextView) view.findViewById(C0906R.id.dq2);
        this.h = (AppCompatTextView) view.findViewById(C0906R.id.als);
        this.i = (AppCompatTextView) view.findViewById(C0906R.id.b7d);
        this.j = (AppCompatTextView) view.findViewById(C0906R.id.b7e);
        this.k = (BadgeTextView) view.findViewById(C0906R.id.ccq);
        this.n = (ImageView) view.findViewById(C0906R.id.ccr);
        this.o = (ImageView) view.findViewById(C0906R.id.bp5);
        this.l = (SessionStatusImageView) view.findViewById(C0906R.id.b52);
        this.m = (ImageView) view.findViewById(C0906R.id.chc);
        this.q.f52859b = this.m;
        this.p = view.findViewById(C0906R.id.co6);
        if (PatchProxy.isSupport(new Object[0], this, f3385b, false, 52450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3385b, false, 52450, new Class[0], Void.TYPE);
            return;
        }
        h hVar = (h) ServiceManager.get().getService(h.class);
        if (hVar != null) {
            this.f3387c = hVar.a(this.f3386a, this.f3389e, this.f3390f);
            this.f3387c.a(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51883a;

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51883a, false, 52459, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51883a, false, 52459, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!TextUtils.isEmpty(SessionListViewHolder.this.f3388d)) {
                        IMUser b2 = e.a().b(SessionListViewHolder.this.f3388d);
                        if (!(b2 == null || z == b2.isHasUnreadStory())) {
                            b2.setHasUnreadStory(z);
                            e.a().a(b2, !z);
                        }
                    }
                }
            });
        }
    }
}
