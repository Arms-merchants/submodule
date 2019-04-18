package debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCUtil;
import com.example.base_a.TestShowActivity;


/**
 * Created by heyueyang on 2019/4/15
 */
public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, TestShowActivity.class);
        startActivity(intent);
        ATest.getTestName();
    }
}
