package com.example.kiidataretrieval.util;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.kiidataretrieval.R;

public class ViewUtil {

    /**
     * replace with next fragment
     * @param manager is fragment manager
     * @param next is fragment you want to replace with
     * @param addBackstack true : add current fragment to backstack
     */
    public static void toNextFragment(FragmentManager manager, Fragment next, boolean addBackstack) {
        if (manager == null) { return; }
        FragmentTransaction transaction = manager.beginTransaction();
        if (addBackstack) {
            transaction.addToBackStack("");
        }
        transaction.replace(R.id.main, next);
        transaction.commit();
    }
}
