package ca.yorku.eecs.mack.demoandroidgauri9;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

/**
 * /**
 * Demo_Android - with modifications by...
 *
 * Login ID - gauri9
 * Student ID - 212489126
 * Last name - Wahi
 * First name(s) - Gauri
 */

public class DemoAndroidgauri9Activity extends Activity implements OnClickListener
{
    private final static String MYDEBUG = "MYDEBUG"; // for Log.i messages

    private Button incrementButton, decrementButton, exitButton, resetButton;
    private TextView textview;
    private int clickCount;

    // called when the activity is first created
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initialize();
        Log.i(MYDEBUG, "Initialization done. Application running.");
    }

    private void initialize()
    {
        // get references to buttons and text view from the layout manager (rather than instantiate them)
        incrementButton = (Button)findViewById(R.id.incbutton);
        decrementButton = (Button)findViewById(R.id.decbutton);
        exitButton = (Button)findViewById(R.id.exitbutton);
        textview = (TextView)findViewById(R.id.textview);
        resetButton = (Button) findViewById(R.id.reset);

        // initialize the click count
        clickCount = 0;

        // some code is missing here
        /*I added a set onclick listener to the following buttons to allow the system to be aware of what to
        do when the buttons are being clicked on
         */
        incrementButton.setOnClickListener(this);
        decrementButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);




        // initialize the text field with the click count
        textview.setText(String.format(Locale.CANADA, "Count: %d", clickCount));
    }

    // this code executes when a button is clicked (i.e., tapped with user's finger)
    @Override
    public void onClick(View v)
    {
        if (v == incrementButton)
        {
            Log.i(MYDEBUG, "Increment button clicked!");
            ++clickCount;

        } else if (v == decrementButton)
        {
            Log.i(MYDEBUG, "Decrement button clicked!");
            --clickCount;

        } else if (v == exitButton)
        {
            Log.i(MYDEBUG, "Good bye!");
            this.finish();

        } else if (v == resetButton)
        {
            Log.i(MYDEBUG, "Reset button clicked!");
            clickCount = 0;
        }else
            Log.i(MYDEBUG, "Oops: Invalid Click Event!");

        // update click count
        textview.setText(String.format(Locale.CANADA, "Count: %d", clickCount));
    }
}