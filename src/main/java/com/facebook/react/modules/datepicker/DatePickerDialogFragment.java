package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.Locale;
import javax.annotation.Nullable;

@SuppressLint({"ValidFragment"})
public class DatePickerDialogFragment extends DialogFragment {
    @Nullable
    private DatePickerDialog.OnDateSetListener mOnDateSetListener;
    @Nullable
    private DialogInterface.OnDismissListener mOnDismissListener;

    /* access modifiers changed from: package-private */
    public void setOnDateSetListener(@Nullable DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.mOnDateSetListener = onDateSetListener;
    }

    /* access modifiers changed from: package-private */
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return createDialog(getArguments(), getActivity(), this.mOnDateSetListener);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss(dialogInterface);
        }
    }

    static Dialog createDialog(Bundle bundle, Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener) {
        DismissableDatePickerDialog dismissableDatePickerDialog;
        Calendar instance = Calendar.getInstance();
        if (bundle != null && bundle.containsKey("date")) {
            instance.setTimeInMillis(bundle.getLong("date"));
        }
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        DatePickerMode datePickerMode = DatePickerMode.DEFAULT;
        if (!(bundle == null || bundle.getString("mode", null) == null)) {
            datePickerMode = DatePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        DatePickerMode datePickerMode2 = datePickerMode;
        if (Build.VERSION.SDK_INT >= 21) {
            switch (datePickerMode2) {
                case CALENDAR:
                    dismissableDatePickerDialog = new DismissableDatePickerDialog(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
                    break;
                case SPINNER:
                    dismissableDatePickerDialog = new DismissableDatePickerDialog(context, context.getResources().getIdentifier("SpinnerDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
                    break;
                case DEFAULT:
                    dismissableDatePickerDialog = new DismissableDatePickerDialog(context, onDateSetListener, i, i2, i3);
                    break;
                default:
                    dismissableDatePickerDialog = null;
                    break;
            }
        } else {
            DismissableDatePickerDialog dismissableDatePickerDialog2 = new DismissableDatePickerDialog(context, onDateSetListener, i, i2, i3);
            switch (datePickerMode2) {
                case CALENDAR:
                    dismissableDatePickerDialog2.getDatePicker().setCalendarViewShown(true);
                    dismissableDatePickerDialog2.getDatePicker().setSpinnersShown(false);
                    break;
                case SPINNER:
                    dismissableDatePickerDialog2.getDatePicker().setCalendarViewShown(false);
                    break;
            }
            dismissableDatePickerDialog = dismissableDatePickerDialog2;
        }
        DatePicker datePicker = dismissableDatePickerDialog.getDatePicker();
        if (bundle == null || !bundle.containsKey("minDate")) {
            datePicker.setMinDate(-2208988800001L);
        } else {
            instance.setTimeInMillis(bundle.getLong("minDate"));
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            datePicker.setMinDate(instance.getTimeInMillis());
        }
        if (bundle != null && bundle.containsKey("maxDate")) {
            instance.setTimeInMillis(bundle.getLong("maxDate"));
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            datePicker.setMaxDate(instance.getTimeInMillis());
        }
        return dismissableDatePickerDialog;
    }
}
