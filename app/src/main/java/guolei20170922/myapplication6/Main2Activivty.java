package guolei20170922.myapplication6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lenovo on 2017/10/31.
 */
public class Main2Activivty extends AppCompatActivity{
    private MyDBHelper dbHelper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//123
        dbHelper=new MyDBHelper(this,"UserStore.db",null,1);
    }
}
