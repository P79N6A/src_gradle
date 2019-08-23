package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.j;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.b.r;
import io.fabric.sdk.android.services.f.q;
import io.fabric.sdk.android.services.f.t;
import java.io.File;

public class Answers extends i<Boolean> {
    SessionAnalyticsManager analyticsManager;
    boolean firebaseEnabled;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String getVersion() {
        return "1.4.7.32";
    }

    public static Answers getInstance() {
        return (Answers) c.a(Answers.class);
    }

    /* access modifiers changed from: package-private */
    public String getOverridenSpiEndpoint() {
        return io.fabric.sdk.android.services.b.i.c(this.context, "com.crashlytics.ApiEndpoint");
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        if (!l.a(this.context).a()) {
            this.analyticsManager.disable();
            return Boolean.FALSE;
        }
        try {
            t b2 = q.a().b();
            if (b2 == null) {
                return Boolean.FALSE;
            }
            if (b2.f83356d.f83330d) {
                this.analyticsManager.setAnalyticsSettingsData(b2.f83357e, getOverridenSpiEndpoint());
                return Boolean.TRUE;
            }
            this.analyticsManager.disable();
            return Boolean.FALSE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @SuppressLint({"NewApi"})
    public boolean onPreExecute() {
        String str;
        long lastModified;
        try {
            Context context = this.context;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            if (packageInfo.versionName == null) {
                str = "0.0";
            } else {
                str = packageInfo.versionName;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            long j = lastModified;
            this.analyticsManager = SessionAnalyticsManager.build(this, context, this.idManager, num, str, j);
            this.analyticsManager.enable();
            this.firebaseEnabled = new r().a(context);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void logFirebaseModeEnabledWarning(String str) {
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" is not supported when using Crashlytics through Firebase.");
    }

    public void onException(j.a aVar) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onCrash(aVar.f83175a, aVar.f83176b);
        }
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(addToCartEvent);
            }
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(contentViewEvent);
            }
        }
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onCustom(customEvent);
            }
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(inviteEvent);
            }
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(levelEndEvent);
            }
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(levelStartEvent);
            }
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(loginEvent);
            }
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(purchaseEvent);
            }
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(ratingEvent);
            }
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(searchEvent);
            }
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(shareEvent);
            }
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(signUpEvent);
            }
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.onPredefined(startCheckoutEvent);
            }
        }
    }

    public void onException(j.b bVar) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onError(bVar.f83175a);
        }
    }
}
