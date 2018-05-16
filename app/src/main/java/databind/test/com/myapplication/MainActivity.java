package databind.test.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import databind.test.com.myapplication.view.MyGalleryView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView tv_process;
    private MyGalleryView gallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=(SeekBar)findViewById(R.id.seekBar);
        tv_process=(TextView)findViewById(R.id.tv_process);
        gallery=(MyGalleryView) findViewById(R.id.gallery);
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                gallery.setProcess(progress);
                tv_process.setText(progress+"");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}