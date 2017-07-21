package com.example.asuspc.bloodseekerv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {


    private Spinner mSpnMM;
    private Spinner mSpnDD;
    private Spinner mSpnYY;
    private Spinner mSpnBType;
    private EditText medtFname;
    private EditText medtLname;
    private EditText medtAge;
    private RadioButton mRbtnMale;
    private RadioButton mRbtnFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mSpnMM = (Spinner) findViewById(R.id.spnMM);
        mSpnDD = (Spinner) findViewById(R.id.spnDD);
        mSpnYY = (Spinner) findViewById(R.id.spnYY);
        mSpnBType = (Spinner) findViewById(R.id.spnBType);
        medtAge = (EditText) findViewById(R.id.edtTxtAge);
        medtFname = (EditText) findViewById(R.id.edtTxtFname);
        medtLname = (EditText) findViewById(R.id.edtTxtLname);


        String[] MM = new String[]{"MM","01", "02", "03", "04", "05", "06", "07", "08", "08", "09", "10", "11", "12"};
        ArrayAdapter<String> MMAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, MM);
        mSpnMM.setAdapter(MMAdapter);

        String[] DD = new String[]{"DD", "01", "02", "03", "04", "05", "06", "07", "08", "08", "09", "10", "11", "12","13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ArrayAdapter<String> DDAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, DD);
        mSpnDD.setAdapter(DDAdapter);
        String[] YY = new String[]{"YYYY","1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982","1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001"};
        ArrayAdapter<String> YYAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, YY);
        mSpnYY.setAdapter(YYAdapter);
    }
}
