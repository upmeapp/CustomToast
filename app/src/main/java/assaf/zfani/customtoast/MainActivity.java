package assaf.zfani.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //////////////////////////////////////////////////////////////////////////
        Toast myToast = new Toast(this);
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(getLayoutInflater().inflate(R.layout.layout_toast,null));
        myToast.show();
        /////////////////////////////////////////////////////////////////////////


    }
}
