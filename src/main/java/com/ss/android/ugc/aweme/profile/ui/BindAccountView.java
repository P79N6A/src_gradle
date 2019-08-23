package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.AutoRTLTextView;
import java.util.Map;

public class BindAccountView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61750a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f61751b;

    /* renamed from: c  reason: collision with root package name */
    a f61752c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61753d;

    /* renamed from: e  reason: collision with root package name */
    private AutoRTLTextView f61754e;

    /* renamed from: f  reason: collision with root package name */
    private AutoRTLTextView f61755f;
    private AutoRTLTextView g;
    private boolean h;

    public interface a {
        void a();
    }

    public void setEventListener(a aVar) {
        this.f61752c = aVar;
    }

    public void setShowTouTiaoLink(boolean z) {
        this.f61753d = z;
    }

    public BindAccountView(Context context) {
        this(context, null);
    }

    private boolean b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61750a, false, 67900, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f61750a, false, 67900, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = AbTestManager.a().d();
        if (d2 == null || user == null || !d2.isShowToutiaoProfile || !user.getIsSyncToutiao()) {
            return false;
        }
        return true;
    }

    public void setIsMyProfile(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61750a, false, 67896, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61750a, false, 67896, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = !z;
        if ((!this.h && this.f61754e != null && this.f61754e.getVisibility() == 0) || TimeLockRuler.isTeenModeON()) {
            setVisibility(8);
        }
    }

    public final void a(User user) {
        String str;
        boolean z;
        String str2;
        if (PatchProxy.isSupport(new Object[]{user}, this, f61750a, false, 67898, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f61750a, false, 67898, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            if (TimeLockRuler.isTeenModeON()) {
                setVisibility(8);
            }
            if (ex.n(user)) {
                if (user.isMe()) {
                    r.onEvent(MobClick.obtain().setEventName("rocket_show").setLabelName("personal_homepage"));
                } else {
                    r.onEvent(MobClick.obtain().setEventName("rocket_show").setLabelName("others_homepage"));
                }
                this.g.setVisibility(0);
                this.f61754e.setVisibility(8);
                this.f61755f.setVisibility(8);
                this.f61751b.setVisibility(0);
                this.g.setText(C0906R.string.bs7);
                return;
            }
            this.g.setVisibility(8);
            if (user.isBindedWeibo()) {
                if (PatchProxy.isSupport(new Object[0], this, f61750a, false, 67899, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61750a, false, 67899, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (AbTestManager.a().ae() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f61755f.setVisibility(0);
                    this.f61751b.setVisibility(0);
                    if (!b(user)) {
                        this.f61754e.setVisibility(8);
                        this.f61755f.setText(C0906R.string.bs_);
                        return;
                    } else if (!this.h) {
                        setVisibility(8);
                        return;
                    } else {
                        if (!this.f61753d) {
                            d a2 = d.a();
                            if (user.isMe()) {
                                str2 = "personal_homepage";
                            } else {
                                str2 = "others_homepage";
                            }
                            r.a("show_link", (Map) a2.a("enter_from", str2).a("link_type", "news_article").a("author_id", user.getUid()).a("scene_id", 1007).f34114b);
                            this.f61753d = true;
                        }
                        this.f61754e.setVisibility(0);
                        this.f61755f.setText("");
                        this.f61754e.setText("");
                        return;
                    }
                }
            }
            if (!b(user)) {
                this.f61751b.setVisibility(8);
            } else if (!this.h) {
                setVisibility(8);
            } else {
                this.f61754e.setVisibility(0);
                if (!this.f61753d) {
                    d a3 = d.a();
                    if (user.isMe()) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    r.a("show_link", (Map) a3.a("enter_from", str).a("link_type", "news_article").a("author_id", user.getUid()).a("scene_id", 1007).f34114b);
                    this.f61753d = true;
                }
                this.f61755f.setVisibility(8);
                this.f61751b.setVisibility(0);
                this.f61754e.setText(C0906R.string.bsc);
            }
        }
    }

    public BindAccountView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindAccountView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, f61750a, false, 67897, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f61750a, false, 67897, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aqc, this, true);
        this.f61751b = (LinearLayout) inflate.findViewById(C0906R.id.bab);
        this.f61754e = (AutoRTLTextView) inflate.findViewById(C0906R.id.aqt);
        this.f61755f = (AutoRTLTextView) inflate.findViewById(C0906R.id.aqp);
        this.g = (AutoRTLTextView) inflate.findViewById(C0906R.id.aqo);
        this.f61751b.setOnTouchListener(new j(this));
    }
}
