package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.DatePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

@ReactModule(name = "DatePickerAndroid")
public class DatePickerDialogModule extends ReactContextBaseJavaModule {

    class DatePickerDialogListener implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {
        private final Promise mPromise;
        private boolean mPromiseResolved;

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mPromiseResolved && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }

        public DatePickerDialogListener(Promise promise) {
            this.mPromise = promise;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.mPromiseResolved && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dateSetAction");
                writableNativeMap.putInt("year", i);
                writableNativeMap.putInt("month", i2);
                writableNativeMap.putInt("day", i3);
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }
    }

    public String getName() {
        return "DatePickerAndroid";
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("date") && !readableMap.isNull("date")) {
            bundle.putLong("date", (long) readableMap.getDouble("date"));
        }
        if (readableMap.hasKey("minDate") && !readableMap.isNull("minDate")) {
            bundle.putLong("minDate", (long) readableMap.getDouble("minDate"));
        }
        if (readableMap.hasKey("maxDate") && !readableMap.isNull("maxDate")) {
            bundle.putLong("maxDate", (long) readableMap.getDouble("maxDate"));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @ReactMethod
    public void open(@Nullable ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else if (currentActivity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) supportFragmentManager.findFragmentByTag("DatePickerAndroid");
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            SupportDatePickerDialogFragment supportDatePickerDialogFragment = new SupportDatePickerDialogFragment();
            if (readableMap != null) {
                supportDatePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
            }
            DatePickerDialogListener datePickerDialogListener = new DatePickerDialogListener(promise);
            supportDatePickerDialogFragment.setOnDismissListener(datePickerDialogListener);
            supportDatePickerDialogFragment.setOnDateSetListener(datePickerDialogListener);
            supportDatePickerDialogFragment.show(supportFragmentManager, "DatePickerAndroid");
        } else {
            android.app.FragmentManager fragmentManager = currentActivity.getFragmentManager();
            android.app.DialogFragment dialogFragment2 = (android.app.DialogFragment) fragmentManager.findFragmentByTag("DatePickerAndroid");
            if (dialogFragment2 != null) {
                dialogFragment2.dismiss();
            }
            DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
            if (readableMap != null) {
                datePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
            }
            DatePickerDialogListener datePickerDialogListener2 = new DatePickerDialogListener(promise);
            datePickerDialogFragment.setOnDismissListener(datePickerDialogListener2);
            datePickerDialogFragment.setOnDateSetListener(datePickerDialogListener2);
            datePickerDialogFragment.show(fragmentManager, "DatePickerAndroid");
        }
    }
}
