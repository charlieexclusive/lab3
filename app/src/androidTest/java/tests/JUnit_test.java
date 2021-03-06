package tests;

import android.test.ActivityInstrumentationTestCase2;

import com.android.lab3.MainActivity;

/**
 * Created by CR7 on 4/18/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        assertEquals(mainActivity.sum("3","4"), -1.0);
        assertEquals(mainActivity.sum("1","78"), -77.0);
        assertEquals(mainActivity.sum("2","8"), -6.0);
    }
}
