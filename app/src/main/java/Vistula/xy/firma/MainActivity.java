package Vistula.xy.firma;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    EditText et_46481_name;
    EditText et_46481_surname;
    Spinner spinner_46481;
    TextView tv1_46481;
    TextView tv2_46481;
    EditText et_46481_ilosc;
    Button btn_46481_koszyk;
    Button btn_46481_kasa;
    TextView tv_46481_wynikString;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        et_46481_name = findViewById(R.id.et_46481_name);
        et_46481_surname = findViewById(R.id.et_46481_surname);
        tv_46481_wynikString = findViewById(R.id.tv_46481_wynikString);
        tv1_46481 = findViewById(R.id.tv1_46481);
        tv2_46481 = findViewById(R.id.tv2_46481);
        et_46481_ilosc = findViewById(R.id.et_46481_ilosc);
        btn_46481_koszyk = findViewById(R.id.btn_46481_koszyk);
        btn_46481_kasa = findViewById(R.id.btn_46481_kasa);

        Spinner spinner = findViewById(R.id.spinner_46481);
        spinner.setOnItemSelectedListener(this);

//        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("Monday", "10");
//        hashMap.put("Tuesday", "20");
//        hashMap.put("Wednesday", "30");
//
//        ArrayAdapter<HashMap<String, String>> arrayAdapter = new ArrayAdapter<HashMap<String, String>>(getApplicationContext(),android.R.layout.simple_spinner_item);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(arrayAdapter);






        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
//        arrayList.add("english");
//        arrayList.add("french");
//        arrayList.add("polish");
//        arrayList.add("japanese");
//        arrayList.add("russian");
//        arrayList.add("czech");
//        arrayList.add("romanian");

        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

//        String[] planetArray = getResources().getStringArray(R.array.planets);
//        String[] planetNumber = getResources().getStringArray(R.array.numberPlanets);
//
//        Map<String, String> map = new HashMap<>();
//
//        for (int i=0;i < planetArray.length; i++){
//            map.put(planetArray[i], planetNumber[i]);
//        }
//
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(this);

        btn_46481_koszyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String name = tv1_46481.getText().toString().trim();
                int name = Integer.parseInt(tv1_46481.getText().toString());
                int mnoznik = Integer.parseInt(et_46481_ilosc.getText().toString());

                int wynik = (name * mnoznik);


                tv_46481_wynikString.append(wynik + "\n");




            }
        });

        btn_46481_kasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_46481_name.getText().toString().isEmpty() || et_46481_surname.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,  "Prosze uzupelnij pola!!", Toast.LENGTH_SHORT).show();
                }else{
                    String name = et_46481_name.getText().toString().trim();
                    String surname = et_46481_surname.getText().toString().trim();

                    Intent intent = new Intent(MainActivity.this, Vistula.xy.firma.DrugieActivity_46481.class);
                    intent.putExtra("name", name);
                    intent.putExtra("surname", surname);
                    startActivity(intent);
                }

            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       String text = parent.getItemAtPosition(position).toString();
       tv1_46481.setText(text);
       // Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
