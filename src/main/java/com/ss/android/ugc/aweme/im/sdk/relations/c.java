package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationModel;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.k;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends b<b> implements View.OnTouchListener {
    public static ChangeQuickRedirect i;

    /* renamed from: e  reason: collision with root package name */
    private AbsRelationListAdapter.a f52112e;

    /* renamed from: f  reason: collision with root package name */
    private String f52113f;
    protected IShareService.ShareStruct j;
    public BaseContent k;
    protected boolean l;
    protected EditText m;
    protected ImageView n;
    protected DmtStatusView o;
    protected AbsRelationListAdapter p;
    protected RecyclerView q;
    protected ImTextTitleBar r;
    protected TextWatcher s;
    protected View.OnClickListener t;
    public String u;
    public a<Boolean> v;
    View w;
    View x;

    public final void a(IShareService.ShareStruct shareStruct) {
        if (PatchProxy.isSupport(new Object[]{shareStruct}, this, i, false, 52722, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct}, this, i, false, 52722, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        this.j = shareStruct;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52724, new Class[0], Void.TYPE);
        } else {
            if (!(this.j == null || this.j.extraParams == null)) {
                this.u = this.j.extraParams.get("multi_share_msg");
                this.f52113f = this.j.extraParams.get("aid");
                this.j.extraParams.remove("multi_share_msg");
                this.j.extraParams.remove("aid");
            }
            if (this.f52113f == null) {
                this.f52113f = "";
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52749, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            if (this.j != null) {
                e();
            }
            if (this.j == null) {
                if (m.b()) {
                    this.r.setTitle((int) C0906R.string.axa);
                } else {
                    this.r.setTitle((int) C0906R.string.aqd);
                }
                this.r.getRightView().setVisibility(8);
                this.r.setLeftText((int) C0906R.string.apy);
                return;
            }
            this.r.setTitle((int) C0906R.string.axb);
            this.r.getRightView().setVisibility(0);
            j();
        }
    }

    public final void a(LinkedHashSet<IMContact> linkedHashSet) {
        if (PatchProxy.isSupport(new Object[]{linkedHashSet}, this, i, false, 52723, new Class[]{LinkedHashSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkedHashSet}, this, i, false, 52723, new Class[]{LinkedHashSet.class}, Void.TYPE);
            return;
        }
        if (linkedHashSet != null) {
            this.p.h = linkedHashSet;
            i();
            h();
            this.p.notifyDataSetChanged();
        }
    }

    public void a(List<IMContact> list, CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{list, charSequence}, this, i, false, 52729, new Class[]{List.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, charSequence}, this, i, false, 52729, new Class[]{List.class, CharSequence.class}, Void.TYPE);
            return;
        }
        this.l = true;
        this.p.a(list, charSequence);
        f();
    }

    public final boolean a(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, i, false, 52738, new Class[]{IMContact.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMContact}, this, i, false, 52738, new Class[]{IMContact.class}, Boolean.TYPE)).booleanValue();
        }
        IMUser a2 = e.a(iMContact);
        if (a2 == null) {
            return true;
        }
        if (PatchProxy.isSupport(new Object[]{a2}, this, i, false, 52739, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{a2}, this, i, false, 52739, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (a2 == null) {
            return false;
        } else {
            if (!TextUtils.equals(a2.getUid(), d.b()) && a2.getFollowStatus() != 2) {
                if (TextUtils.equals(this.j.itemType, "pic")) {
                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.avy);
                    return false;
                } else if (TextUtils.equals(this.j.itemType, "gif") && (this.j.awemeType == 501 || this.j.awemeType == 502)) {
                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.ar8);
                    return false;
                } else if (TextUtils.equals(this.j.itemType, "story_video")) {
                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.avz);
                    return false;
                }
            }
            return true;
        }
    }

    public final void a(final IMContact iMContact, final String str) {
        final BaseContent baseContent;
        if (PatchProxy.isSupport(new Object[]{iMContact, str}, this, i, false, 52740, new Class[]{IMContact.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact, str}, this, i, false, 52740, new Class[]{IMContact.class, String.class}, Void.TYPE);
            return;
        }
        if (this.k == null) {
            baseContent = com.ss.android.ugc.aweme.im.sdk.share.b.b(this.j);
        } else if (this.k instanceof TextContent) {
            baseContent = TextContent.obtain((TextContent) this.k);
        } else {
            baseContent = this.k;
        }
        String a2 = s.a().a(baseContent);
        if (!TextUtils.isEmpty(a2)) {
            s.a().a(a2, baseContent, new x() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52162a;

                public final void a() {
                }

                public final void a(double d2) {
                }

                public final void a(Throwable th) {
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f52162a, false, 52783, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f52162a, false, 52783, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    c.this.a(iMContact, str, baseContent);
                }

                public final void a(String str, UrlModel urlModel) {
                    if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f52162a, false, 52782, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f52162a, false, 52782, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                        return;
                    }
                    if (baseContent instanceof SharePoiContent) {
                        ((SharePoiContent) baseContent).setMapUrl(urlModel);
                    } else if (baseContent instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) baseContent).setUrl(urlModel);
                    } else if (baseContent instanceof StoryPictureContent) {
                        ((StoryPictureContent) baseContent).setUrl((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a) urlModel);
                    }
                    c.this.a(iMContact, str, baseContent);
                }
            });
        } else {
            a(iMContact, str, baseContent);
        }
    }

    public final void a(IMContact iMContact, String str, BaseContent baseContent) {
        IMContact iMContact2 = iMContact;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{iMContact2, str, baseContent2}, this, i, false, 52741, new Class[]{IMContact.class, String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact2, str, baseContent2}, this, i, false, 52741, new Class[]{IMContact.class, String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        z.a().a(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent2);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        ba.a().c(com.ss.android.ugc.aweme.im.sdk.d.d.a(iMContact), arrayList);
        a(iMContact2, false);
        d().finish();
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 52742, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 52742, new Class[]{String.class}, Void.TYPE);
            return;
        }
        final BaseContent b2 = this.k != null ? this.k : com.ss.android.ugc.aweme.im.sdk.share.b.b(this.j);
        if (b2 instanceof StoryPictureContent) {
            ((StoryPictureContent) b2).setMassMsg(1);
        } else if (b2 instanceof StoryVideoContent) {
            ((StoryVideoContent) b2).setMassMsg(1);
        }
        String a2 = s.a().a(b2);
        if (!TextUtils.isEmpty(a2)) {
            s.a().a(a2, b2, new x() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52123a;

                public final void a() {
                }

                public final void a(double d2) {
                }

                public final void a(Throwable th) {
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f52123a, false, 52785, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f52123a, false, 52785, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    c.this.a(str, b2);
                }

                public final void a(String str, UrlModel urlModel) {
                    if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f52123a, false, 52784, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f52123a, false, 52784, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                        return;
                    }
                    if (b2 instanceof SharePoiContent) {
                        ((SharePoiContent) b2).setMapUrl(urlModel);
                    } else if (b2 instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) b2).setUrl(urlModel);
                    } else if (b2 instanceof StoryPictureContent) {
                        ((StoryPictureContent) b2).setUrl((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a) urlModel);
                    }
                    c.this.a(str, b2);
                }
            });
        } else {
            a(str, b2);
        }
    }

    public final void a(String str, BaseContent baseContent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str, baseContent}, this, i, false, 52743, new Class[]{String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, baseContent}, this, i, false, 52743, new Class[]{String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        z.a().a(this.p.b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        IMContact[] a2 = this.p.a();
        ba.a().b(com.ss.android.ugc.aweme.im.sdk.d.d.a(a2), (List<BaseContent>) arrayList);
        IMContact iMContact = a2[0];
        if (a2.length > 1) {
            z = true;
        }
        a(iMContact, z);
        d().finish();
    }

    public final void a(IMUser iMUser) {
        String str;
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, i, false, 52745, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser}, this, i, false, 52745, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        z a2 = z.a();
        String uid = iMUser.getUid();
        if (this.l) {
            str = "search_result";
        } else {
            str = iMUser.getType() == 1 ? "recent" : "follow";
        }
        String obj = this.m.getText().toString();
        if (PatchProxy.isSupport(new Object[]{uid, str, obj}, a2, z.f52670a, false, 53555, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uid, str, obj}, a2, z.f52670a, false, 53555, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", str);
            jSONObject.put("search_keyword", obj);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("chat").setLabelName("message").setValue(uid).setJsonObject(jSONObject));
    }

    public final void a(IMContact[] iMContactArr) {
        if (PatchProxy.isSupport(new Object[]{iMContactArr}, this, i, false, 52758, new Class[]{IMContact[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContactArr}, this, i, false, 52758, new Class[]{IMContact[].class}, Void.TYPE);
            return;
        }
        if (m.b() && "aweme".equals(this.j.itemType)) {
            for (IMContact d2 : iMContactArr) {
                d(d2);
            }
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52733, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.notifyDataSetChanged();
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52753, new Class[0], Void.TYPE);
        } else if (this.p == null || !this.p.f52051f) {
            d().finish();
        } else {
            j();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52754, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.b.a(d(), (View) this.m);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52755, new Class[0], Void.TYPE);
            return;
        }
        this.n.performClick();
    }

    public void e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52727, new Class[0], Void.TYPE);
            return;
        }
        IImplService b2 = com.ss.android.ugc.aweme.im.sdk.d.a.b();
        if (this.j != null) {
            z = true;
        }
        this.p = b2.getRelationListAdapter(z);
        this.p.l = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52133a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f52133a, false, 52770, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52133a, false, 52770, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = (b) c.this.f22841d;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f52110b, false, 52694, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, b.f52110b, false, 52694, new Class[0], Void.TYPE);
                    return;
                }
                RelationModel relationModel = bVar.f52111c;
                if (PatchProxy.isSupport(new Object[0], relationModel, RelationModel.f52181a, false, 52915, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], relationModel, RelationModel.f52181a, false, 52915, new Class[0], Void.TYPE);
                    return;
                }
                relationModel.d();
            }
        };
        this.p.m = this.f52112e;
        this.p.f52049d = k.a(this.j);
        this.q.setAdapter(this.p);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52750, new Class[0], Void.TYPE);
            return;
        }
        this.r.getRightTexView().getPaint().setFakeBoldText(false);
        this.r.setLeftText((int) C0906R.string.pm);
        this.r.setRightText((int) C0906R.string.arj);
        this.r.setTitle((int) C0906R.string.ax_);
        this.r.setRightTextColor(d().getResources().getColor(C0906R.color.a21));
        this.r.getRightView().setEnabled(false);
        this.p.a(true);
        this.r.setOnTitlebarClickListener(new ImTextTitleBar.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52114a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f52114a, false, 52761, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52114a, false, 52761, new Class[0], Void.TYPE);
                    return;
                }
                c.this.j();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f52114a, false, 52762, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52114a, false, 52762, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.p.b() > 0) {
                    com.ss.android.ugc.aweme.im.sdk.share.b.a(c.this.c(), c.this.j, c.this.p.a(), c.this.u, new b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52116a;

                        public final void onShare(final String str) {
                            if (PatchProxy.isSupport(new Object[]{str}, this, f52116a, false, 52763, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f52116a, false, 52763, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            new com.ss.android.ugc.aweme.im.sdk.a.b(c.this.c(), new com.ss.android.ugc.aweme.im.sdk.a.c() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52118a;

                                public final void sendMsg() {
                                    if (PatchProxy.isSupport(new Object[0], this, f52118a, false, 52764, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f52118a, false, 52764, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    c.this.a(str);
                                    if (c.this.v != null) {
                                        c.this.v.run(Boolean.TRUE);
                                    }
                                }
                            }).sendMsg();
                            IMContact[] a2 = c.this.p.a();
                            c.a(c.this.j, c.this.k, a2.length);
                            c.this.a(a2);
                        }
                    }, new b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52121a;

                        public final void onShare(String str) {
                            if (PatchProxy.isSupport(new Object[]{str}, this, f52121a, false, 52765, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f52121a, false, 52765, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            if (c.this.v != null) {
                                c.this.v.run(Boolean.FALSE);
                            }
                        }
                    });
                }
            }
        });
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52752, new Class[0], Void.TYPE);
            return;
        }
        this.r.getRightTexView().getPaint().setFakeBoldText(false);
        this.r.setLeftText((int) C0906R.string.apy);
        this.r.setTitle((int) C0906R.string.axb);
        this.r.setRightText((int) C0906R.string.ax9);
        this.r.setRightTextColor(d().getResources().getColor(C0906R.color.a09));
        this.r.getRightView().setEnabled(true);
        this.p.a(false);
        this.r.setOnTitlebarClickListener(new ImTextTitleBar.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52127a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f52127a, false, 52766, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52127a, false, 52766, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.common.ui.b.a(c.this.d(), (View) c.this.m);
                c.this.d().finish();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f52127a, false, 52767, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52127a, false, 52767, new Class[0], Void.TYPE);
                    return;
                }
                z a2 = z.a();
                if (PatchProxy.isSupport(new Object[0], a2, z.f52670a, false, 53605, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, z.f52670a, false, 53605, new Class[0], Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "contact_list");
                    hashMap.put("enter_method", "click_multi_choose_button");
                    r.a("enter_multi_choose_contact", (Map) hashMap);
                }
                c.this.i();
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52726, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52734, new Class[0], Void.TYPE);
        } else if (this.t == null) {
            this.t = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52135a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f52135a, false, 52771, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f52135a, false, 52771, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (view.equals(c.this.n)) {
                        c.this.m.setText("");
                        c.this.m.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) GlobalContext.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(c.this.m.getWindowToken(), 0);
                        }
                    }
                }
            };
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52735, new Class[0], Void.TYPE);
        } else if (this.s == null) {
            this.s = new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52137a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f52137a, false, 52773, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f52137a, false, 52773, new Class[]{Editable.class}, Void.TYPE);
                        return;
                    }
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        b bVar = (b) c.this.f22841d;
                        if (PatchProxy.isSupport(new Object[]{obj}, bVar, b.f52110b, false, 52695, new Class[]{CharSequence.class}, Void.TYPE)) {
                            b bVar2 = bVar;
                            PatchProxy.accessDispatch(new Object[]{obj}, bVar2, b.f52110b, false, 52695, new Class[]{CharSequence.class}, Void.TYPE);
                        } else {
                            if (!TextUtils.isEmpty(obj)) {
                                bVar.f52111c.a((CharSequence) obj);
                            }
                        }
                    } else {
                        ((b) c.this.f22841d).update(((b) c.this.f22841d).f52111c, 0);
                    }
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52137a, false, 52772, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52137a, false, 52772, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (TextUtils.isEmpty(charSequence) || c.this.n.getVisibility() != 8) {
                        if (TextUtils.isEmpty(charSequence) && c.this.n.getVisibility() == 0) {
                            c.this.n.setVisibility(8);
                        }
                    } else {
                        c.this.n.setVisibility(0);
                    }
                }
            };
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52736, new Class[0], Void.TYPE);
        } else if (this.f52112e == null) {
            this.f52112e = new AbsRelationListAdapter.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52139a;

                public final void a(View view, int i) {
                    boolean z;
                    View view2 = view;
                    boolean z2 = false;
                    if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f52139a, false, 52774, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f52139a, false, 52774, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    final IMContact iMContact = (IMContact) view2.getTag(83886080);
                    final Integer num = (Integer) view2.getTag(50331648);
                    if (num != null && iMContact != null) {
                        if (num.intValue() != 50331648 && num.intValue() != 50331649) {
                            if (num.intValue() == 100663296) {
                                com.ss.android.ugc.aweme.im.sdk.d.d.b(c.this.c(), iMContact, new Function0<Unit>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f52156a;

                                    public final /* synthetic */ Object invoke() {
                                        if (PatchProxy.isSupport(new Object[0], this, f52156a, false, 52780, new Class[0], Unit.class)) {
                                            return (Unit) PatchProxy.accessDispatch(new Object[0], this, f52156a, false, 52780, new Class[0], Unit.class);
                                        }
                                        final IMUser a2 = e.a(iMContact);
                                        if (a2 != null) {
                                            bc.a(c.this.d(), a2, 4, (Runnable) new Runnable() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f52159a;

                                                public final void run() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f52159a, false, 52781, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f52159a, false, 52781, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    z.a().a(com.bytedance.im.core.d.e.a(Long.valueOf(a2.getUid()).longValue()), a2.getUid(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "click_contact_card", "contact_list");
                                                    ChatRoomActivity.a(c.this.f22839b, a2, 4);
                                                }
                                            });
                                        }
                                        return null;
                                    }
                                });
                            }
                        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNewStyle() && c.this.j == null) {
                            com.ss.android.ugc.aweme.im.sdk.d.d.a(c.this.c(), iMContact, (Function0<Unit>) new Function0<Unit>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52141a;

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Unit invoke() {
                                    if (PatchProxy.isSupport(new Object[0], this, f52141a, false, 52775, new Class[0], Unit.class)) {
                                        return (Unit) PatchProxy.accessDispatch(new Object[0], this, f52141a, false, 52775, new Class[0], Unit.class);
                                    }
                                    IMUser a2 = e.a(iMContact);
                                    if (a2 != null) {
                                        String uid = a2.getUid();
                                        j.f51270d.c(uid);
                                        ay.f52524b.a(uid);
                                        z.a().b(uid, "chat_list");
                                        if (num.intValue() == 50331649) {
                                            z.a().b(uid, "message", "click_contact_head");
                                        }
                                    }
                                    return null;
                                }
                            });
                        } else if (c.this.p.f52051f) {
                            int i2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52881d;
                            if (c.this.p.b() >= i2) {
                                AbsRelationListAdapter absRelationListAdapter = c.this.p;
                                if (PatchProxy.isSupport(new Object[]{iMContact}, absRelationListAdapter, AbsRelationListAdapter.f52046b, false, 52802, new Class[]{IMContact.class}, Boolean.TYPE)) {
                                    AbsRelationListAdapter absRelationListAdapter2 = absRelationListAdapter;
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{iMContact}, absRelationListAdapter2, AbsRelationListAdapter.f52046b, false, 52802, new Class[]{IMContact.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    z = absRelationListAdapter.h.contains(iMContact);
                                }
                                if (!z) {
                                    com.bytedance.ies.dmt.ui.d.a.c(c.this.c(), c.this.c().getString(C0906R.string.az7, new Object[]{Integer.valueOf(i2)}), 0, 2).a();
                                    return;
                                }
                            }
                            if (c.this.a(iMContact)) {
                                AbsRelationListAdapter absRelationListAdapter3 = c.this.p;
                                if (PatchProxy.isSupport(new Object[]{iMContact}, absRelationListAdapter3, AbsRelationListAdapter.f52046b, false, 52800, new Class[]{IMContact.class}, Boolean.TYPE)) {
                                    AbsRelationListAdapter absRelationListAdapter4 = absRelationListAdapter3;
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{iMContact}, absRelationListAdapter4, AbsRelationListAdapter.f52046b, false, 52800, new Class[]{IMContact.class}, Boolean.TYPE)).booleanValue();
                                } else if (absRelationListAdapter3.h.contains(iMContact)) {
                                    absRelationListAdapter3.h.remove(iMContact);
                                } else {
                                    absRelationListAdapter3.h.add(iMContact);
                                    z2 = true;
                                }
                                c.this.p.a(i);
                                if (z2) {
                                    c.this.b(iMContact);
                                }
                                c.this.h();
                            }
                        } else if (c.this.j == null) {
                            com.ss.android.ugc.aweme.im.sdk.d.d.b(c.this.c(), iMContact, new Function0<Unit>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52145a;

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Unit invoke() {
                                    if (PatchProxy.isSupport(new Object[0], this, f52145a, false, 52776, new Class[0], Unit.class)) {
                                        return (Unit) PatchProxy.accessDispatch(new Object[0], this, f52145a, false, 52776, new Class[0], Unit.class);
                                    }
                                    IMUser a2 = e.a(iMContact);
                                    if (a2 != null) {
                                        c.this.a(a2);
                                        String uid = a2.getUid();
                                        if (TextUtils.equals(uid, d.b())) {
                                            z.a().a("", "to_myself");
                                        } else {
                                            z.a().a(com.bytedance.im.core.d.e.a(Long.valueOf(uid).longValue()), uid, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "click_contact", "contact_list");
                                        }
                                        ChatRoomActivity.a(c.this.c(), a2, 4);
                                    }
                                    return null;
                                }
                            });
                        } else if (c.this.a(iMContact)) {
                            c.this.b(iMContact);
                            com.ss.android.ugc.aweme.im.sdk.share.b.a(c.this.c(), c.this.j, new IMContact[]{iMContact}, c.this.u, new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52148a;

                                public final void onShare(final String str) {
                                    if (PatchProxy.isSupport(new Object[]{str}, this, f52148a, false, 52777, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str}, this, f52148a, false, 52777, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    new com.ss.android.ugc.aweme.im.sdk.a.b(c.this.c(), new com.ss.android.ugc.aweme.im.sdk.a.c() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f52151a;

                                        public final void sendMsg() {
                                            if (PatchProxy.isSupport(new Object[0], this, f52151a, false, 52778, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f52151a, false, 52778, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            c.this.a(iMContact, str);
                                            if (c.this.v != null) {
                                                c.this.v.run(Boolean.TRUE);
                                            }
                                        }
                                    }).sendMsg();
                                    c.this.c(iMContact);
                                }
                            }, new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52154a;

                                public final void onShare(String str) {
                                    if (PatchProxy.isSupport(new Object[]{str}, this, f52154a, false, 52779, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str}, this, f52154a, false, 52779, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    if (c.this.v != null) {
                                        c.this.v.run(Boolean.FALSE);
                                    }
                                }
                            });
                        }
                    }
                }
            };
        }
        this.r.setOnTitlebarClickListener(new ImTextTitleBar.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52129a;

            public final void b() {
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f52129a, false, 52768, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52129a, false, 52768, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.common.ui.b.a(c.this.d(), (View) c.this.m);
                c.this.d().finish();
            }
        });
        this.n.setOnClickListener(this.t);
        this.m.addTextChangedListener(this.s);
        this.m.setOnKeyListener(new View.OnKeyListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52131a;

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f52131a, false, 52769, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f52131a, false, 52769, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 66) {
                    return false;
                } else {
                    com.ss.android.ugc.aweme.common.ui.b.a(c.this.d(), (View) c.this.m);
                    return true;
                }
            }
        });
        this.m.setOnTouchListener(this);
        e();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52737, new Class[0], Void.TYPE);
        } else if (this.p.b() > 0) {
            ImTextTitleBar imTextTitleBar = this.r;
            imTextTitleBar.setRightText(c().getString(C0906R.string.aqb) + "(" + this.p.b() + ")");
            this.r.getRightView().setEnabled(true);
            this.r.getRightTexView().getPaint().setFakeBoldText(true);
            this.r.setRightTextColor(d().getResources().getColor(C0906R.color.a1z));
        } else {
            this.r.setRightText((int) C0906R.string.aqb);
            this.r.getRightView().setEnabled(false);
            this.r.getRightTexView().getPaint().setFakeBoldText(false);
            this.r.setRightTextColor(d().getResources().getColor(C0906R.color.a21));
        }
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52730, new Class[0], Void.TYPE);
            return;
        }
        this.o.b();
        if (this.p.getItemCount() == 0) {
            if (this.l) {
                if (PatchProxy.isSupport(new Object[0], this, i, false, 52731, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, i, false, 52731, new Class[0], Void.TYPE);
                } else if (this.w == null) {
                    if (m.a()) {
                        MtEmptyView a2 = MtEmptyView.a(this.f22839b);
                        a2.setStatus(new c.a(this.f22839b).b((int) C0906R.string.ax4).c(C0906R.string.ax3).a(2130839718).f20493a);
                        this.w = a2;
                    } else {
                        DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f22839b);
                        dmtDefaultView.setStatus(new c.a(this.f22839b).b((int) C0906R.string.ax4).c(C0906R.string.ax3).a(2130840144).f20493a);
                        this.w = dmtDefaultView;
                    }
                }
                this.o.setBuilder(new DmtStatusView.a(d()).b(this.w));
            } else {
                if (PatchProxy.isSupport(new Object[0], this, i, false, 52732, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, i, false, 52732, new Class[0], Void.TYPE);
                } else if (this.x == null) {
                    if (m.a()) {
                        MtEmptyView a3 = MtEmptyView.a(this.f22839b);
                        a3.setStatus(new c.a(this.f22839b).b((int) C0906R.string.awo).c(C0906R.string.awn).a(2130839716).f20493a);
                        this.x = a3;
                    } else {
                        DmtDefaultView dmtDefaultView2 = new DmtDefaultView(this.f22839b);
                        dmtDefaultView2.setStatus(new c.a(this.f22839b).b((int) C0906R.string.awo).c(C0906R.string.awn).a(2130840145).f20493a);
                        this.x = dmtDefaultView2;
                    }
                }
                this.o.setBuilder(new DmtStatusView.a(d()).b(this.x));
            }
            this.o.e();
            this.o.setVisibility(0);
            return;
        }
        this.o.setVisibility(8);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 52725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 52725, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.r = (ImTextTitleBar) this.f22840c.findViewById(C0906R.id.d3m);
        this.o = (DmtStatusView) this.f22840c.findViewById(C0906R.id.cvd);
        this.m = (EditText) this.f22840c.findViewById(C0906R.id.cla);
        this.m.setTag("relation_search_tag");
        if (m.b()) {
            this.m.setHint(C0906R.string.am9);
        }
        this.n = (ImageView) this.f22840c.findViewById(C0906R.id.ns);
        this.q = (RecyclerView) this.f22840c.findViewById(C0906R.id.cc4);
        this.q.setLayoutManager(new LinearLayoutManager(c()));
        this.q.addOnScrollListener(new RelationView$1(this, this.f22839b));
    }

    public void a(List<IMContact> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, i, false, 52728, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, i, false, 52728, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.l = false;
        this.p.a(list);
        f();
    }

    private void d(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, i, false, 52759, new Class[]{IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact}, this, i, false, 52759, new Class[]{IMContact.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "chat");
        hashMap.put("group_id", this.f52113f);
        hashMap.put("author_id", this.j.authorId);
        hashMap.put("enter_from", this.j.enterFrom);
        if (iMContact instanceof IMUser) {
            hashMap.put("to_user_id", ((IMUser) iMContact).getUid());
        }
        r.a("share_video_success", (Map) hashMap);
    }

    public final void b(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, i, false, 52746, new Class[]{IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact}, this, i, false, 52746, new Class[]{IMContact.class}, Void.TYPE);
            return;
        }
        a(this.j, iMContact);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            a(com.bytedance.im.core.d.e.a(Long.valueOf(uid).longValue()), uid);
            return;
        }
        if (iMContact instanceof IMConversation) {
            a(((IMConversation) iMContact).getConversationId(), "");
        }
    }

    public final void c(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, i, false, 52757, new Class[]{IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact}, this, i, false, 52757, new Class[]{IMContact.class}, Void.TYPE);
            return;
        }
        if (m.b()) {
            if ("aweme".equals(this.j.itemType)) {
                d(iMContact);
            }
        }
    }

    public static void a(IShareService.ShareStruct shareStruct, IMContact iMContact) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2}, null, i, true, 52747, new Class[]{IShareService.ShareStruct.class, IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2}, null, i, true, 52747, new Class[]{IShareService.ShareStruct.class, IMContact.class}, Void.TYPE);
            return;
        }
        z.a().a(shareStruct2, iMContact2, false);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, i, false, 52756, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, i, false, 52756, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (view2.equals(this.m) && motionEvent.getAction() == 1) {
            if (this.k != null) {
                str = "forward";
            } else if (this.j != null) {
                str = "share";
            } else {
                str = "contact";
            }
            z a2 = z.a();
            if (PatchProxy.isSupport(new Object[]{str}, a2, z.f52670a, false, 53629, new Class[]{String.class}, Void.TYPE)) {
                z zVar = a2;
                PatchProxy.accessDispatch(new Object[]{str}, zVar, z.f52670a, false, 53629, new Class[]{String.class}, Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", str);
                r.a("search_contact", (Map) hashMap);
            }
        }
        return false;
    }

    private void a(IMContact iMContact, boolean z) {
        if (PatchProxy.isSupport(new Object[]{iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 52744, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact, Byte.valueOf(z)}, this, i, false, 52744, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.equals(this.j.itemType, "game")) {
            com.bytedance.ies.dmt.ui.d.a.a(c(), (int) C0906R.string.axi).a();
        } else {
            org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
            g gVar = new g(iMContact, z, this.j.itemType, this.j.enterFrom, this.f52113f);
            a2.d(gVar);
        }
    }

    private void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, i, false, 52748, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, i, false, 52748, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            String a2 = ad.a(this.k.generateShareStruct().itemType);
            if (!TextUtils.isEmpty(a2)) {
                z.a().a(a2, str, str2, this.k);
            }
        }
    }

    public c(Context context, View view, boolean z) {
        super(context, view);
        if (z) {
            this.r.setVisibility(8);
        }
    }

    public static void a(IShareService.ShareStruct shareStruct, BaseContent baseContent, int i2) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, baseContent, Integer.valueOf(i2)}, null, i, true, 52751, new Class[]{IShareService.ShareStruct.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, baseContent, Integer.valueOf(i2)}, null, i, true, 52751, new Class[]{IShareService.ShareStruct.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = ad.a(shareStruct2.itemType);
        if (!TextUtils.isEmpty(a2)) {
            if (baseContent == null) {
                str = "share";
            } else {
                str = "forward";
            }
            z.a().a(a2, i2, str);
        }
    }
}
