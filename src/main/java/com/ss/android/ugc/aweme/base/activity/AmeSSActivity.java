package com.ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.ICustomToast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.framework.e.d;
import com.ss.android.ugc.aweme.utils.s;

public class AmeSSActivity extends AmeActivity implements ICustomToast {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int mActivityAnimType;
    private s mAudioManagerHelper;
    private int mCurTheme = -1;
    private d mCustomToast;
    private boolean mFocused = false;
    private boolean mHideCustomToastStatusBar;
    private SparseArray<a> mIOnActivityResultListenerSparseArray = new SparseArray<>();
    private boolean mIsFirstStart = true;
    private int mOriginTheme = -1;

    public interface a {
        void a(int i, int i2, Intent intent);
    }

    private boolean isBackgroundSwitch() {
        if (mStartNum == 0) {
            return true;
        }
        return false;
    }

    public void hideCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = true;
        if (this.mCustomToast != null) {
            this.mCustomToast.h = true;
        }
    }

    public void showCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = false;
        if (this.mCustomToast != null) {
            this.mCustomToast.h = false;
        }
    }

    public void dismissCustomToast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24096, new Class[0], Void.TYPE);
            return;
        }
        if (this.mCustomToast != null) {
            this.mCustomToast.d();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24089, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.mActivityAnimType != 0) {
            com.ss.android.sdk.a.b(this, this.mActivityAnimType);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24084, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.mCustomToast != null) {
            this.mCustomToast.a();
        }
        this.mIOnActivityResultListenerSparseArray.clear();
        this.mIOnActivityResultListenerSparseArray = null;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24085, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.mCustomToast != null) {
            this.mCustomToast.b();
        }
        if (com.ss.android.g.a.a()) {
            au.f46526a = getClass();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24087, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.mIsFirstStart = false;
    }

    public boolean checkIfCanShowToast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24095, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24095, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (this.mCustomToast == null) {
                this.mCustomToast = new d(this);
                this.mCustomToast.h = this.mHideCustomToastStatusBar;
            }
            return true;
        }
    }

    public Resources getResources() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24103, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24103, new Class[0], Resources.class);
        } else if (com.ss.android.ugc.aweme.base.e.d.a(this)) {
            return new com.ss.android.ugc.aweme.base.e.d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        } else {
            return super.getResources();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24086, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.mCustomToast != null) {
            this.mCustomToast.c();
        }
        s audioManagerHelper = getAudioManagerHelper(true);
        if (audioManagerHelper != null) {
            if (PatchProxy.isSupport(new Object[]{this}, audioManagerHelper, s.f75959a, false, 87990, new Class[]{Context.class}, Void.TYPE)) {
                s sVar = audioManagerHelper;
                PatchProxy.accessDispatch(new Object[]{this}, sVar, s.f75959a, false, 87990, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            try {
                if (audioManagerHelper.f75960b == null) {
                    audioManagerHelper.f75960b = (AudioManager) getApplicationContext().getSystemService("audio");
                }
                if (!(audioManagerHelper.f75960b == null || audioManagerHelper.f75961c == null)) {
                    audioManagerHelper.f75960b.requestAudioFocus(audioManagerHelper.f75961c, 3, 2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24088, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        s audioManagerHelper = getAudioManagerHelper(false);
        if (audioManagerHelper != null) {
            if (PatchProxy.isSupport(new Object[]{this}, audioManagerHelper, s.f75959a, false, 87991, new Class[]{Context.class}, Void.TYPE)) {
                Object[] objArr = {this};
                s sVar = audioManagerHelper;
                PatchProxy.accessDispatch(objArr, sVar, s.f75959a, false, 87991, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            try {
                if (audioManagerHelper.f75960b == null) {
                    audioManagerHelper.f75960b = (AudioManager) getApplicationContext().getSystemService("audio");
                }
                if (!(audioManagerHelper.f75960b == null || audioManagerHelper.f75961c == null)) {
                    audioManagerHelper.f75960b.abandonAudioFocus(audioManagerHelper.f75961c);
                }
                audioManagerHelper.f75960b = null;
            } catch (Exception unused) {
            }
        }
    }

    public void setOnActivityResultListener(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 24100, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 24100, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.mIOnActivityResultListenerSparseArray.append(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, aVar2);
    }

    public void setTheme(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24097, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24097, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    private s getAudioManagerHelper(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 24102, new Class[]{Boolean.TYPE}, s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 24102, new Class[]{Boolean.TYPE}, s.class);
        }
        if (this.mAudioManagerHelper == null) {
            this.mAudioManagerHelper = new s(this);
        }
        return this.mAudioManagerHelper;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 24083, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 24083, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        try {
            super.onCreate(bundle);
            this.mHideCustomToastStatusBar = false;
            if (this.mActivityAnimType != 0) {
                com.ss.android.sdk.a.a(this, this.mActivityAnimType);
            }
        } catch (Resources.NotFoundException unused) {
        }
        if (this.mIOnActivityResultListenerSparseArray == null) {
            this.mIOnActivityResultListenerSparseArray = new SparseArray<>();
        }
    }

    public void showImeOnce(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 24098, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 24098, new Class[]{View.class}, Void.TYPE);
        } else if (!this.mFocused) {
            final View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34491a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34491a, false, 24104, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f34491a, false, 24104, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f34495a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f34495a, false, 24105, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f34495a, false, 24105, new Class[0], Void.TYPE);
                            } else if (AmeSSActivity.this.isViewValid()) {
                                InputMethodManager inputMethodManager = (InputMethodManager) AmeSSActivity.this.getSystemService("input_method");
                                if (inputMethodManager != null) {
                                    inputMethodManager.showSoftInput(view, 1);
                                }
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34497a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34497a, false, 24106, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34497a, false, 24106, new Class[0], Void.TYPE);
                        return;
                    }
                    view.requestFocus();
                }
            });
            this.mFocused = true;
        }
    }

    public void showCustomToast(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 24090, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 24090, new Class[]{String.class}, Void.TYPE);
        } else if (checkIfCanShowToast()) {
            this.mCustomToast.a(str2);
        }
    }

    @Deprecated
    public void superOverridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void setOnActivityResultListener(int i, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, changeQuickRedirect, false, 24101, new Class[]{Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, changeQuickRedirect, false, 24101, new Class[]{Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        this.mIOnActivityResultListenerSparseArray.append(i, aVar2);
    }

    public void showCustomLongToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 24091, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 24091, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (checkIfCanShowToast()) {
            this.mCustomToast.a(i, str2);
        }
    }

    public void showCustomToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 24093, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 24093, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (checkIfCanShowToast()) {
            this.mCustomToast.b(i, str2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 24099, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 24099, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        a aVar = this.mIOnActivityResultListenerSparseArray.get(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        if (aVar != null) {
            aVar.a(i, i2, intent2);
        }
    }

    public void showCustomToast(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 24092, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 24092, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (checkIfCanShowToast()) {
            this.mCustomToast.a(str2, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 24094, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 24094, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (checkIfCanShowToast()) {
            this.mCustomToast.a(i, str2, i2, i3);
        }
    }
}
