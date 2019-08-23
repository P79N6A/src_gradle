package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import io.fabric.sdk.android.services.e.c;
import io.fabric.sdk.android.services.e.d;

@SuppressLint({"CommitPrefEdits"})
public class PreferenceManager {
    private final CrashlyticsCore kit;
    private final c preferenceStore;

    /* access modifiers changed from: package-private */
    public boolean shouldAlwaysSendReports() {
        boolean z;
        if (!this.preferenceStore.a().contains("preferences_migration_complete")) {
            d dVar = new d(this.kit);
            if (this.preferenceStore.a().contains("always_send_reports_opt_in") || !dVar.a().contains("always_send_reports_opt_in")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.preferenceStore.a(this.preferenceStore.b().putBoolean("always_send_reports_opt_in", dVar.a().getBoolean("always_send_reports_opt_in", false)));
            }
            this.preferenceStore.a(this.preferenceStore.b().putBoolean("preferences_migration_complete", true));
        }
        return this.preferenceStore.a().getBoolean("always_send_reports_opt_in", false);
    }

    /* access modifiers changed from: package-private */
    public void setShouldAlwaysSendReports(boolean z) {
        this.preferenceStore.a(this.preferenceStore.b().putBoolean("always_send_reports_opt_in", z));
    }

    public PreferenceManager(c cVar, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = cVar;
        this.kit = crashlyticsCore;
    }

    public static PreferenceManager create(c cVar, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(cVar, crashlyticsCore);
    }
}
