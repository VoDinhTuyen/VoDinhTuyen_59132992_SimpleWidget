package vn.edu.ntu.dinhtuyen.vodinhtuyen_59132992_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, dateOfBirth, stKhac;
    RadioGroup rdgSex;
    CheckBox xemPhim, ngheNhac, cafe, oNha, nauAn;
    Button btnXN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews() {
        name = findViewById(R.id.name);
        dateOfBirth = findViewById(R.id.dateOfBirth);
        stKhac = findViewById(R.id.stKhac);
        rdgSex = findViewById(R.id.rdgSex);
        xemPhim = findViewById(R.id.xemPhim);
        ngheNhac = findViewById(R.id.ngheNhac);
        cafe = findViewById(R.id.cafe);
        oNha = findViewById(R.id.oNha);
        nauAn = findViewById(R.id.nauAn);
        btnXN = findViewById(R.id.btnXN);
    }

    private void addEvents() {
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        String mesage = name.getText()+"\n"+"Ngày sinh: "+dateOfBirth.getText()+"\n";
        switch (rdgSex.getCheckedRadioButtonId()) {
            case R.id.rdbNam:
                mesage = mesage + "Giới tính: Nam"+"\n"+"Sở thích: ";
                break;
            case R.id.rdbNu:
                mesage = mesage + "Giới tính: Nữ"+"\n"+"Sở thích: ";
                break;
        }
        if(xemPhim.isChecked()) {
            mesage = mesage + xemPhim.getText() + "; ";
        }
        if(ngheNhac.isChecked()) {
            mesage = mesage + ngheNhac.getText() + "; ";
        }
        if(cafe.isChecked()) {
            mesage = mesage + cafe.getText() + "; ";
        }
        if(oNha.isChecked()) {
            mesage = mesage + oNha.getText() + "; ";
        }
        if(nauAn.isChecked()) {
            mesage = mesage + nauAn.getText() + "; ";
        }
        mesage = mesage + stKhac.getText();
        Toast.makeText(getApplicationContext(), mesage, Toast.LENGTH_LONG).show();
    }
}
