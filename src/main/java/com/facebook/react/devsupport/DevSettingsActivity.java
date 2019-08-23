package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.ss.android.ugc.aweme.C0906R;

public class DevSettingsActivity extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C0906R.string.r4));
        addPreferencesFromResource(C0906R.xml.f4438f);
    }
}
