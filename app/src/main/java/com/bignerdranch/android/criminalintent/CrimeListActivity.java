package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by abhishek on 8/12/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment().newInstance(getIntent().getBooleanExtra(CrimeListFragment.SAVED_SUBTITLE_VISIBLE, false));
    }

    public static Intent newIntent(Context packageContext, boolean showSubtitle) {
        Intent intent = new Intent(packageContext, CrimeListActivity.class);
        intent.putExtra(CrimeListFragment.SAVED_SUBTITLE_VISIBLE, showSubtitle);
        return intent;
    }
}
