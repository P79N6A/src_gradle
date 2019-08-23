package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import com.ss.android.ugc.aweme.feed.api.a;
import com.ss.android.ugc.aweme.lancet.h;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.j;
import io.fabric.sdk.android.services.b.l;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public class Crashlytics extends i<Void> implements j {
    public final Answers answers;
    public final Beta beta;
    public final CrashlyticsCore core;
    public final Collection<? extends i> kits;

    public static class Builder {
        private Answers answers;
        private Beta beta;
        private CrashlyticsCore core;
        private CrashlyticsCore.Builder coreBuilder;

        private synchronized CrashlyticsCore.Builder getCoreBuilder() {
            if (this.coreBuilder == null) {
                this.coreBuilder = new CrashlyticsCore.Builder();
            }
            return this.coreBuilder;
        }

        public Crashlytics build() {
            if (this.coreBuilder != null) {
                if (this.core == null) {
                    this.core = this.coreBuilder.build();
                } else {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
            }
            if (this.answers == null) {
                this.answers = new Answers();
            }
            if (this.beta == null) {
                this.beta = new Beta();
            }
            if (this.core == null) {
                this.core = new CrashlyticsCore();
            }
            return new Crashlytics(this.answers, this.beta, this.core);
        }

        @Deprecated
        public Builder delay(float f2) {
            getCoreBuilder().delay(f2);
            return this;
        }

        @Deprecated
        public Builder disabled(boolean z) {
            getCoreBuilder().disabled(z);
            return this;
        }

        @Deprecated
        public Builder listener(CrashlyticsListener crashlyticsListener) {
            getCoreBuilder().listener(crashlyticsListener);
            return this;
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            getCoreBuilder().pinningInfo(pinningInfoProvider);
            return this;
        }

        public Builder answers(Answers answers2) {
            if (answers2 == null) {
                throw new NullPointerException("Answers Kit must not be null.");
            } else if (this.answers == null) {
                this.answers = answers2;
                return this;
            } else {
                throw new IllegalStateException("Answers Kit already set.");
            }
        }

        public Builder beta(Beta beta2) {
            if (beta2 == null) {
                throw new NullPointerException("Beta Kit must not be null.");
            } else if (this.beta == null) {
                this.beta = beta2;
                return this;
            } else {
                throw new IllegalStateException("Beta Kit already set.");
            }
        }

        public Builder core(CrashlyticsCore crashlyticsCore) {
            if (crashlyticsCore == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.core == null) {
                this.core = crashlyticsCore;
                return this;
            } else {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            }
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @Insert
        @TargetClass
        static void com_ss_android_ugc_aweme_lancet_CrashlyticsLancet_logException(Throwable th) {
            if ((th instanceof h) || (th instanceof a)) {
                Crashlytics.logException$___twin___(th);
                return;
            }
            if (com.ss.android.g.a.a()) {
                Crashlytics.logException$___twin___(th);
            }
        }
    }

    public static void logException(Throwable th) {
        _lancet.com_ss_android_ugc_aweme_lancet_CrashlyticsLancet_logException(th);
    }

    @Deprecated
    public static void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
    }

    /* access modifiers changed from: protected */
    public Void doInBackground() {
        return null;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public String getVersion() {
        return "2.10.1.34";
    }

    @Deprecated
    public void setDebugMode(boolean z) {
    }

    public Collection<? extends i> getKits() {
        return this.kits;
    }

    public void crash() {
        this.core.crash();
    }

    @Deprecated
    public boolean getDebugMode() {
        return c.b();
    }

    private static void checkInitialized() {
        if (getInstance() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }

    public static Crashlytics getInstance() {
        return (Crashlytics) c.a(Crashlytics.class);
    }

    public static PinningInfoProvider getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    public Crashlytics() {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    private static boolean isCrashlyticsCollectionEnabled() {
        checkInitialized();
        return l.a(getInstance().context).a();
    }

    public boolean verifyPinning(URL url) {
        return this.core.verifyPinning(url);
    }

    public static void logException$___twin___(Throwable th) {
        checkInitialized();
        getInstance().core.logException(th);
    }

    public static void setUserEmail(String str) {
        checkInitialized();
        getInstance().core.setUserEmail(str);
    }

    public static void setUserIdentifier(String str) {
        checkInitialized();
        getInstance().core.setUserIdentifier(str);
    }

    public static void setUserName(String str) {
        checkInitialized();
        getInstance().core.setUserName(str);
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        this.core.setListener(crashlyticsListener);
    }

    public static void log(String str) {
        checkInitialized();
        getInstance().core.log(str);
    }

    private static void setCrashlyticsCollectionEnabled(boolean z) {
        checkInitialized();
        l a2 = l.a(getInstance().context);
        a2.f83181c = z;
        a2.f83180b = true;
        a2.f83179a.edit().putBoolean("firebase_crashlytics_collection_enabled", z).commit();
    }

    public static void setBool(String str, boolean z) {
        checkInitialized();
        getInstance().core.setBool(str, z);
    }

    public static void setDouble(String str, double d2) {
        checkInitialized();
        getInstance().core.setDouble(str, d2);
    }

    public static void setFloat(String str, float f2) {
        checkInitialized();
        getInstance().core.setFloat(str, f2);
    }

    public static void setInt(String str, int i) {
        checkInitialized();
        getInstance().core.setInt(str, i);
    }

    public static void setLong(String str, long j) {
        checkInitialized();
        getInstance().core.setLong(str, j);
    }

    public static void setString(String str, String str2) {
        checkInitialized();
        getInstance().core.setString(str, str2);
    }

    public static void log(int i, String str, String str2) {
        checkInitialized();
        getInstance().core.log(i, str, str2);
    }

    Crashlytics(Answers answers2, Beta beta2, CrashlyticsCore crashlyticsCore) {
        this.answers = answers2;
        this.beta = beta2;
        this.core = crashlyticsCore;
        this.kits = Collections.unmodifiableCollection(Arrays.asList(new i[]{answers2, beta2, crashlyticsCore}));
    }
}
