package benignstar.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radio_tutle, radio_penguin, radio_whale;
    Button butOk;
    ImageView imgvPet;
    TextView textQuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox) findViewById(R.id.check_select);
        textQuest=(TextView) findViewById(R.id.msg_quest);
        rg=(RadioGroup) findViewById(R.id.rg);
        radio_penguin=(RadioButton)findViewById(R.id.radio_penguin);
        radio_tutle=(RadioButton)findViewById(R.id.radio_turtle);
        radio_whale=(RadioButton)findViewById(R.id.radio_whale);
        butOk=(Button)findViewById(R.id.but_ok);
        imgvPet=(ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else {
            textQuest.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }

}
