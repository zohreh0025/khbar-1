package ir.akhbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class FragmentNavigation {

    public static void navigate(FragmentActivity activity, Fragment fragmentToShow, int counter) {
        Bundle bundle = new Bundle();
        bundle.putInt("Counter", counter + 1);

        fragmentToShow.setArguments(bundle);

        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragmentToShow)
                .addToBackStack(null)
                .commit();
    }

}
