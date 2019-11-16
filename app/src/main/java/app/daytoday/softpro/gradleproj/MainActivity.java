package app.daytoday.softpro.gradleproj;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view)
    {
       switch (view.getId())
       {
           case R.id.successButton:
               Toasty.success(this,"Login Successfully",Toast.LENGTH_SHORT).show();
               break;
           case R.id.errorButton:
               Toasty.error(this,"Login Failed",Toast.LENGTH_SHORT).show();
               break;
           case R.id.infoButton:
               Toasty.info(this,"Information",Toast.LENGTH_SHORT).show();
               break;
           case R.id.warningButton:
               Toasty.warning(this,"Ooops",Toast.LENGTH_SHORT).show();
               break;
           case R.id.imageButton:
               Toasty.normal(this,"Project Complete",Toast.LENGTH_SHORT,ContextCompat.getDrawable(this,R.drawable.ic_cloud_upload)).show();
               break;
       }
    }
}
