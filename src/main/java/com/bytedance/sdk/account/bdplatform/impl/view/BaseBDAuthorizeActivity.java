package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.account.b.a.a;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.b.d.d;
import com.bytedance.sdk.account.bdplatform.a.a;
import com.bytedance.sdk.account.bdplatform.a.b;
import com.bytedance.sdk.account.bdplatform.a.c;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class BaseBDAuthorizeActivity extends FragmentActivity implements a, a.c {
    protected b authorizePlatformDepend;
    protected a.b authorizePresenter;
    private c bdPlatformApi;
    private ImageView mApplyAuthAppIcon;
    private TextView mApplyAuthAppName;
    public RelativeLayout mAuthContent;
    private TextView mAuthDescTitle;
    protected com.bytedance.sdk.account.bdplatform.b.b mAuthInfoResponse;
    public LinearLayout mAuthScopeLayout;
    private View mBorder;
    private TextView mCancelTxt;
    public ScrollView mContentLayout;
    private TextView mGrantAuthTxt;
    protected c.a mLastRequest;
    private ImageView mLeftCube;
    public TextView mLoginBtn;
    private ImageView mRightCube;
    protected RelativeLayout mRootView;
    protected boolean mStatusDestroyed;
    private FrameLayout mTitleBarLayout;
    private TextView mUserName;
    private ImageView mUserPortrait;

    public abstract b createDepend();

    /* access modifiers changed from: protected */
    public int getLayout() {
        return C0906R.layout.ag;
    }

    public abstract Drawable getLoadingProgressBar();

    /* access modifiers changed from: protected */
    public abstract com.bytedance.sdk.account.bdplatform.b.c initPlatformConfiguration();

    public abstract void onCancel();

    public abstract void onLoginClick();

    public void onResume() {
        super.onResume();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mStatusDestroyed = true;
    }

    public void onBackPressed() {
        this.authorizePresenter.a();
        onCancel();
    }

    public boolean isDestroyed() {
        if (Build.VERSION.SDK_INT < 17) {
            return this.mStatusDestroyed;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.mStatusDestroyed;
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mTitleBarLayout = (FrameLayout) findViewById(C0906R.id.bad);
        this.mCancelTxt = (TextView) findViewById(C0906R.id.dms);
        this.mRootView = (RelativeLayout) findViewById(C0906R.id.b7z);
        this.mContentLayout = (ScrollView) findViewById(C0906R.id.b89);
        this.mAuthContent = (RelativeLayout) findViewById(C0906R.id.gl);
        this.mLeftCube = (ImageView) findViewById(C0906R.id.ash);
        this.mRightCube = (ImageView) findViewById(C0906R.id.asi);
        this.mApplyAuthAppIcon = (ImageView) findViewById(C0906R.id.aqf);
        this.mApplyAuthAppName = (TextView) findViewById(C0906R.id.dmp);
        this.mGrantAuthTxt = (TextView) findViewById(C0906R.id.dn5);
        this.mUserPortrait = (ImageView) findViewById(C0906R.id.dq9);
        this.mUserName = (TextView) findViewById(C0906R.id.dq2);
        this.mBorder = findViewById(C0906R.id.lx);
        this.mAuthDescTitle = (TextView) findViewById(C0906R.id.gm);
        this.mAuthScopeLayout = (LinearLayout) findViewById(C0906R.id.b7w);
        this.mLoginBtn = (TextView) findViewById(C0906R.id.og);
        final com.bytedance.sdk.account.bdplatform.b.c initPlatformConfiguration = initPlatformConfiguration();
        if (initPlatformConfiguration != null) {
            if (!TextUtils.isEmpty(initPlatformConfiguration.f22274a)) {
                this.mTitleBarLayout.setBackgroundColor(Color.parseColor(initPlatformConfiguration.f22274a));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.f22276c)) {
                this.mCancelTxt.setText(initPlatformConfiguration.f22276c);
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.f22277d)) {
                this.mCancelTxt.setTextColor(Color.parseColor(initPlatformConfiguration.f22277d));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.f22275b)) {
                this.mRootView.setBackgroundColor(Color.parseColor(initPlatformConfiguration.f22275b));
            }
            if (initPlatformConfiguration.f22278e) {
                this.mLeftCube.setVisibility(0);
                this.mRightCube.setVisibility(0);
                if (initPlatformConfiguration.f22279f != null) {
                    this.mLeftCube.setImageDrawable(initPlatformConfiguration.f22279f);
                }
                if (initPlatformConfiguration.g != null) {
                    this.mRightCube.setImageDrawable(initPlatformConfiguration.g);
                }
            } else {
                this.mLeftCube.setVisibility(8);
                this.mRightCube.setVisibility(8);
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.h)) {
                this.mApplyAuthAppIcon.setBackgroundColor(Color.parseColor(initPlatformConfiguration.h));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.j)) {
                this.mApplyAuthAppName.setTextColor(Color.parseColor(initPlatformConfiguration.j));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.l)) {
                this.mGrantAuthTxt.setTextColor(Color.parseColor(initPlatformConfiguration.l));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.m)) {
                this.mUserPortrait.setBackgroundColor(Color.parseColor(initPlatformConfiguration.m));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.o)) {
                this.mUserName.setTextColor(Color.parseColor(initPlatformConfiguration.o));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.p)) {
                this.mBorder.setBackgroundColor(Color.parseColor(initPlatformConfiguration.p));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.r)) {
                this.mAuthDescTitle.setTextColor(Color.parseColor(initPlatformConfiguration.r));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.q)) {
                this.mAuthDescTitle.setText(initPlatformConfiguration.q);
            }
            if (initPlatformConfiguration.s >= 0.0f) {
                if (initPlatformConfiguration.t >= 0) {
                    this.mAuthDescTitle.setTextSize(initPlatformConfiguration.t, initPlatformConfiguration.s);
                } else {
                    this.mAuthDescTitle.setTextSize(initPlatformConfiguration.s);
                }
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.A)) {
                this.mLoginBtn.setTextColor(Color.parseColor(initPlatformConfiguration.A));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.B)) {
                ((GradientDrawable) this.mLoginBtn.getBackground()).setColor(Color.parseColor(initPlatformConfiguration.B));
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.z)) {
                this.mLoginBtn.setText(initPlatformConfiguration.z);
            }
            if (this.mAuthInfoResponse != null) {
                this.mApplyAuthAppName.setText(this.mAuthInfoResponse.f22270a);
                if (this.mAuthInfoResponse.f22273d != null && this.mAuthInfoResponse.f22273d.length() > 0) {
                    HashMap hashMap = new HashMap(this.mAuthInfoResponse.f22273d.length());
                    Iterator<String> keys = this.mAuthInfoResponse.f22273d.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = this.mAuthInfoResponse.f22273d.optString(next);
                        if (!TextUtils.isEmpty(optString)) {
                            hashMap.put(next, optString);
                        }
                    }
                    int size = hashMap.size();
                    if (size == 0 || size == 1) {
                        this.mAuthDescTitle.setVisibility(8);
                    } else {
                        this.mAuthDescTitle.setVisibility(0);
                    }
                    if (hashMap.entrySet() != null && hashMap.entrySet().size() > 0) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            View inflate = LayoutInflater.from(this).inflate(C0906R.layout.gn, this.mAuthScopeLayout, false);
                            CheckBox checkBox = (CheckBox) inflate.findViewById(C0906R.id.se);
                            if (!TextUtils.isEmpty(initPlatformConfiguration.v)) {
                                checkBox.setTextColor(Color.parseColor(initPlatformConfiguration.v));
                            }
                            checkBox.setButtonDrawable(initStateListDrawable(initPlatformConfiguration));
                            if (size == 1) {
                                if (initPlatformConfiguration.s >= 0.0f) {
                                    if (initPlatformConfiguration.t >= 0) {
                                        checkBox.setTextSize(initPlatformConfiguration.t, initPlatformConfiguration.s);
                                    } else {
                                        checkBox.setTextSize(initPlatformConfiguration.s);
                                    }
                                }
                                checkBox.setText("该应用将" + ((String) entry.getValue()));
                            } else {
                                checkBox.setText((CharSequence) entry.getValue());
                            }
                            checkBox.setTag(entry.getKey());
                            int checkboxType = getCheckboxType((String) entry.getKey());
                            if (checkboxType == 2) {
                                checkBox.setEnabled(false);
                            } else if (checkboxType == 0) {
                                checkBox.setEnabled(true);
                                checkBox.setChecked(false);
                            } else if (checkboxType == 1) {
                                checkBox.setEnabled(true);
                                checkBox.setChecked(true);
                            }
                            this.mAuthScopeLayout.addView(inflate);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.k)) {
                this.mGrantAuthTxt.setText(initPlatformConfiguration.k);
            }
            if (!TextUtils.isEmpty(initPlatformConfiguration.n)) {
                this.mUserName.setText(initPlatformConfiguration.n);
            }
            this.mCancelTxt.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    BaseBDAuthorizeActivity.this.authorizePresenter.a();
                    BaseBDAuthorizeActivity.this.onCancel();
                }
            });
            this.mLoginBtn.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildCount(); i++) {
                        CheckBox checkBox = (CheckBox) BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildAt(i);
                        if (!checkBox.isEnabled() || checkBox.isChecked()) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append((String) checkBox.getTag());
                        }
                    }
                    BaseBDAuthorizeActivity.this.mLastRequest.f22263e = sb.toString();
                    BaseBDAuthorizeActivity.this.authorizePresenter.b(BaseBDAuthorizeActivity.this.mLastRequest);
                    BaseBDAuthorizeActivity.this.onLoginClick();
                }
            });
            this.mContentLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    int i;
                    if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                    }
                    if (!(BaseBDAuthorizeActivity.this.mAuthContent == null || BaseBDAuthorizeActivity.this.mRootView == null)) {
                        int measuredHeight = BaseBDAuthorizeActivity.this.mAuthContent.getMeasuredHeight();
                        int measuredHeight2 = BaseBDAuthorizeActivity.this.mRootView.getMeasuredHeight();
                        int a2 = (int) d.a(BaseBDAuthorizeActivity.this, 220.0f);
                        int i2 = 15;
                        if (initPlatformConfiguration.C > 0) {
                            i = initPlatformConfiguration.C;
                        } else {
                            i = 15;
                        }
                        if (initPlatformConfiguration.D > 0) {
                            i2 = initPlatformConfiguration.D;
                        }
                        int a3 = (int) d.a(BaseBDAuthorizeActivity.this, (float) i);
                        int a4 = (int) d.a(BaseBDAuthorizeActivity.this, (float) i2);
                        int a5 = (int) d.a(BaseBDAuthorizeActivity.this, 15.0f);
                        int a6 = (int) d.a(BaseBDAuthorizeActivity.this, (float) initPlatformConfiguration.E);
                        if (measuredHeight2 - measuredHeight <= a2) {
                            if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) BaseBDAuthorizeActivity.this.mLoginBtn.getLayoutParams();
                                marginLayoutParams.setMargins(a3, 0, a4, a5);
                                if (a6 > 0) {
                                    marginLayoutParams.height = a6;
                                }
                                BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(marginLayoutParams);
                            }
                            if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) BaseBDAuthorizeActivity.this.mContentLayout.getLayoutParams();
                                layoutParams.setMargins(0, 0, 0, (int) d.a(BaseBDAuthorizeActivity.this, 60.0f));
                                BaseBDAuthorizeActivity.this.mContentLayout.setLayoutParams(layoutParams);
                            }
                        } else if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) d.a(BaseBDAuthorizeActivity.this, 44.0f));
                            layoutParams2.addRule(3, C0906R.id.b89);
                            layoutParams2.setMargins(a3, (int) d.a(BaseBDAuthorizeActivity.this, 56.0f), a4, a5);
                            if (a6 > 0) {
                                layoutParams2.height = a6;
                            }
                            BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(layoutParams2);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("init view fail, configuration is null");
    }

    public void onResp(com.bytedance.sdk.account.b.c.b bVar) {
        finish();
    }

    public void onReq(com.bytedance.sdk.account.b.c.a aVar) {
        if (aVar instanceof c.a) {
            this.mLastRequest = (c.a) aVar;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    public void setAppIcon(Drawable drawable) {
        if (drawable != null && !isFinishing()) {
            this.mApplyAuthAppIcon.setImageDrawable(drawable);
        }
    }

    public void setUserAvatar(Drawable drawable) {
        if (drawable != null && !isFinishing()) {
            this.mUserPortrait.setImageDrawable(drawable);
        }
    }

    public void showView(com.bytedance.sdk.account.bdplatform.b.b bVar) {
        this.mAuthInfoResponse = bVar;
        try {
            setContentView(getLayout());
            init();
        } catch (Resources.NotFoundException unused) {
            finish();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a.f22318a = getLoadingProgressBar();
        this.bdPlatformApi = com.bytedance.sdk.account.bdplatform.impl.c.a(this);
        this.authorizePlatformDepend = createDepend();
        this.authorizePresenter = new com.bytedance.sdk.account.bdplatform.impl.a(this, this.authorizePlatformDepend, this);
        handleIntent(getIntent(), this);
        this.authorizePresenter.b();
    }

    public void onLoginResult(int i) {
        if (!isFinishing() && !isDestroyed()) {
            if (i != 0) {
                if (this.authorizePresenter != null) {
                    this.authorizePresenter.a();
                }
            } else if (!(this.authorizePresenter == null || this.mLastRequest == null)) {
                this.authorizePresenter.a(this.mLastRequest);
            }
        }
    }

    public void onUpdateLoginStatus(boolean z) {
        if (!isFinishing() && !isDestroyed()) {
            if (!z) {
                onNeedLogin();
            } else if (!(this.authorizePresenter == null || this.mLastRequest == null)) {
                this.authorizePresenter.a(this.mLastRequest);
            }
        }
    }

    private int getCheckboxType(String str) {
        if (!TextUtils.isEmpty(this.mLastRequest.f22264f)) {
            for (String str2 : this.mLastRequest.f22264f.split(",")) {
                if (str != null && str.equals(str2)) {
                    return 0;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mLastRequest.g)) {
            for (String str3 : this.mLastRequest.g.split(",")) {
                if (str != null && str.equals(str3)) {
                    return 1;
                }
            }
        }
        return 2;
    }

    private StateListDrawable initStateListDrawable(com.bytedance.sdk.account.bdplatform.b.c cVar) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        if (cVar.w != null) {
            drawable = cVar.w;
        } else {
            drawable = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837795);
        }
        stateListDrawable.addState(iArr, drawable);
        int[] iArr2 = {16842910, 16842912};
        if (cVar.x != null) {
            drawable2 = cVar.x;
        } else {
            drawable2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837793);
        }
        stateListDrawable.addState(iArr2, drawable2);
        int[] iArr3 = {16842910, -16842912};
        if (cVar.y != null) {
            drawable3 = cVar.y;
        } else {
            drawable3 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837794);
        }
        stateListDrawable.addState(iArr3, drawable3);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public boolean handleIntent(Intent intent, com.bytedance.sdk.account.b.a.a aVar) {
        return this.bdPlatformApi.a(intent, aVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                this.authorizePresenter.a(this.mLastRequest);
            } else if (i2 == 0) {
                this.authorizePresenter.a();
            }
        }
    }
}
