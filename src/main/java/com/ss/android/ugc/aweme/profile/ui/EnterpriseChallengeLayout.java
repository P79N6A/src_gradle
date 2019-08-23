package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class EnterpriseChallengeLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61827a;

    /* renamed from: b  reason: collision with root package name */
    View f61828b;

    /* renamed from: c  reason: collision with root package name */
    TextView f61829c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f61830d;

    /* renamed from: e  reason: collision with root package name */
    EnterpriseChallengeAdapter f61831e;

    /* renamed from: f  reason: collision with root package name */
    List<Challenge> f61832f;
    private User g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61827a, false, 68019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61827a, false, 68019, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f61832f)) {
            if (this.f61831e != null) {
                this.f61831e.a();
            }
            if (!(this.g == null || TextUtils.isEmpty(this.g.getUid()) || this.f61830d == null)) {
                RecyclerView.LayoutManager layoutManager = this.f61830d.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition < this.f61832f.size() && findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition < this.f61832f.size()) {
                        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                            Challenge challenge = this.f61832f.get(findFirstVisibleItemPosition);
                            if (challenge != null) {
                                a(challenge);
                                EnterpriseChallengeAdapter enterpriseChallengeAdapter = this.f61831e;
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(findFirstVisibleItemPosition)}, enterpriseChallengeAdapter, EnterpriseChallengeAdapter.f61806a, false, 68003, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    EnterpriseChallengeAdapter enterpriseChallengeAdapter2 = enterpriseChallengeAdapter;
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(findFirstVisibleItemPosition)}, enterpriseChallengeAdapter2, EnterpriseChallengeAdapter.f61806a, false, 68003, new Class[]{Integer.TYPE}, Void.TYPE);
                                } else {
                                    enterpriseChallengeAdapter.f61807b.put(Integer.valueOf(findFirstVisibleItemPosition), Boolean.TRUE);
                                }
                            }
                            findFirstVisibleItemPosition++;
                        }
                    }
                }
            }
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f61827a, false, 68020, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61827a, false, 68020, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g == null) {
            return false;
        } else {
            return TextUtils.equals(d.a().getCurUserId(), this.g.getUid());
        }
    }

    public EnterpriseChallengeLayout(Context context) {
        this(context, null);
    }

    public final void a(Challenge challenge) {
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2}, this, f61827a, false, 68021, new Class[]{Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge2}, this, f61827a, false, 68021, new Class[]{Challenge.class}, Void.TYPE);
            return;
        }
        a("challenge_show", "show_original_tag", challenge2);
    }

    private List<Challenge> a(User user) {
        List<Challenge> list;
        if (PatchProxy.isSupport(new Object[]{user}, this, f61827a, false, 68016, new Class[]{User.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{user}, this, f61827a, false, 68016, new Class[]{User.class}, List.class);
        } else if (user == null) {
            return null;
        } else {
            CommerceInfo commerceInfo = user.getCommerceInfo();
            if (commerceInfo == null) {
                return null;
            }
            try {
                try {
                    list = (List) new Gson().fromJson((JsonElement) commerceInfo.getChallengeList(), new TypeToken<List<Challenge>>() {
                    }.getType());
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                list = null;
                return list;
            }
            return list;
        }
    }

    private List<Challenge> b(User user) {
        List<Challenge> list;
        if (PatchProxy.isSupport(new Object[]{user}, this, f61827a, false, 68017, new Class[]{User.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{user}, this, f61827a, false, 68017, new Class[]{User.class}, List.class);
        } else if (user == null) {
            return null;
        } else {
            if (user.isStar()) {
                try {
                    try {
                        list = (List) new Gson().fromJson(user.getChallengeList(), new TypeToken<List<Challenge>>() {
                        }.getType());
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    list = null;
                    return list;
                }
                return list;
            }
            return null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f61827a, false, 68018, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f61827a, false, 68018, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public EnterpriseChallengeLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnterpriseChallengeLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61832f = new ArrayList();
        if (AbTestManager.a().bR() == 1) {
            LayoutInflater.from(context).inflate(C0906R.layout.tx, this);
        } else {
            LayoutInflater.from(context).inflate(C0906R.layout.tw, this);
        }
        setOrientation(1);
        this.f61828b = findViewById(C0906R.id.a5r);
        this.f61829c = (TextView) findViewById(C0906R.id.a_o);
        this.f61830d = (RecyclerView) findViewById(C0906R.id.a_n);
        this.f61830d.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
    }

    public final void a(Activity activity, User user, boolean z) {
        Activity activity2 = activity;
        final User user2 = user;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61827a, false, 68015, new Class[]{Activity.class, User.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, user2, Byte.valueOf(z)}, this, f61827a, false, 68015, new Class[]{Activity.class, User.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = user2;
        setVisibility(8);
        if (user2 != null) {
            List<Challenge> a2 = a(user2);
            List<Challenge> b2 = b(user2);
            if (!CollectionUtils.isEmpty(a2)) {
                setVisibility(0);
                this.f61829c.setText(C0906R.string.ab6);
                this.f61832f = a2;
                this.f61831e = new EnterpriseChallengeAdapter(activity, this.f61832f, new q() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61833a;

                    public final void a(@NonNull Context context, @NonNull Challenge challenge) {
                        Challenge challenge2 = challenge;
                        if (PatchProxy.isSupport(new Object[]{context, challenge2}, this, f61833a, false, 68024, new Class[]{Context.class, Challenge.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, challenge2}, this, f61833a, false, 68024, new Class[]{Context.class, Challenge.class}, Void.TYPE);
                            return;
                        }
                        EnterpriseChallengeLayout.this.a(challenge2);
                    }

                    public final void a(@NonNull Activity activity, @NonNull Challenge challenge) {
                        String str;
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{activity, challenge}, this, f61833a, false, 68026, new Class[]{Activity.class, Challenge.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity, challenge}, this, f61833a, false, 68026, new Class[]{Activity.class, Challenge.class}, Void.TYPE);
                            return;
                        }
                        h a2 = h.a();
                        j a3 = j.a("aweme://challenge/detail/" + challenge.getCid());
                        if (EnterpriseChallengeLayout.this.b()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        j a4 = a3.a("extra_challenge_from", str).a("extra_enterprise_challenge_uid", user2.getUid()).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                        if (r.b(challenge)) {
                            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str2 = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        a2.a(activity, a4.a("is_commerce", str2).a());
                    }

                    public final void b(@NonNull Context context, @NonNull Challenge challenge) {
                        Challenge challenge2 = challenge;
                        if (PatchProxy.isSupport(new Object[]{context, challenge2}, this, f61833a, false, 68025, new Class[]{Context.class, Challenge.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, challenge2}, this, f61833a, false, 68025, new Class[]{Context.class, Challenge.class}, Void.TYPE);
                            return;
                        }
                        EnterpriseChallengeLayout enterpriseChallengeLayout = EnterpriseChallengeLayout.this;
                        if (PatchProxy.isSupport(new Object[]{challenge2}, enterpriseChallengeLayout, EnterpriseChallengeLayout.f61827a, false, 68022, new Class[]{Challenge.class}, Void.TYPE)) {
                            Object[] objArr = {challenge2};
                            EnterpriseChallengeLayout enterpriseChallengeLayout2 = enterpriseChallengeLayout;
                            PatchProxy.accessDispatch(objArr, enterpriseChallengeLayout2, EnterpriseChallengeLayout.f61827a, false, 68022, new Class[]{Challenge.class}, Void.TYPE);
                            return;
                        }
                        enterpriseChallengeLayout.a("challenge_click", "click_original_tag", challenge2);
                    }
                });
                this.f61830d.setAdapter(this.f61831e);
            } else if (!CollectionUtils.isEmpty(b2)) {
                setVisibility(0);
                this.f61832f = b2;
                this.f61829c.setText(C0906R.string.byu);
                this.f61831e = new EnterpriseChallengeAdapter(activity, this.f61832f, new q() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61836a;

                    public final void a(@NonNull Context context, @NonNull Challenge challenge) {
                    }

                    public final void b(@NonNull Context context, @NonNull Challenge challenge) {
                    }

                    public final void a(@NonNull Activity activity, @NonNull Challenge challenge) {
                        String str;
                        String str2;
                        Activity activity2 = activity;
                        if (PatchProxy.isSupport(new Object[]{activity2, challenge}, this, f61836a, false, 68027, new Class[]{Activity.class, Challenge.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity2, challenge}, this, f61836a, false, 68027, new Class[]{Activity.class, Challenge.class}, Void.TYPE);
                            return;
                        }
                        h a2 = h.a();
                        j a3 = j.a("aweme://challenge/detail/" + challenge.getCid());
                        if (EnterpriseChallengeLayout.this.b()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        j a4 = a3.a("extra_challenge_from", str).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                        if (r.b(challenge)) {
                            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str2 = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        a2.a(activity2, a4.a("is_commerce", str2).a());
                    }
                });
                this.f61830d.setAdapter(this.f61831e);
            }
            if (getVisibility() == 0 && this.f61828b != null && z) {
                this.f61828b.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, Challenge challenge) {
        String str3;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str4, challenge}, this, f61827a, false, 68023, new Class[]{String.class, String.class, Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str4, challenge}, this, f61827a, false, 68023, new Class[]{String.class, String.class, Challenge.class}, Void.TYPE);
        } else if (challenge != null && this.g != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("author_id", this.g.getUid());
            hashMap.put("tag_id", challenge.getCid());
            com.ss.android.ugc.aweme.common.r.a(str2, (Map) hashMap);
            Context context = getContext();
            if (b()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            String str5 = str3;
            com.ss.android.ugc.aweme.common.r.a(context, str, str5, this.g.getUid(), challenge.getCid(), (JSONObject) null);
        }
    }
}
